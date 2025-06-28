package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
class FileBackedNativeSessionFile implements NativeSessionFile {
    private final String dataTransportFilename;
    private final File file;
    private final String reportsEndpointFilename;

    FileBackedNativeSessionFile(String str, String str2, File file) {
        this.dataTransportFilename = str;
        this.reportsEndpointFilename = str2;
        this.file = file;
    }

    private byte[] asGzippedBytes() {
        byte[] bArr = new byte[8192];
        try {
            InputStream stream = getStream();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (stream == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (stream != null) {
                            stream.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int read = stream.read(bArr);
                            if (read <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                stream.close();
                                return byteArray;
                            }
                            gZIPOutputStream.write(bArr, 0, read);
                        } finally {
                        }
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public CrashlyticsReport.FilesPayload.File asFilePayload() {
        byte[] asGzippedBytes = asGzippedBytes();
        if (asGzippedBytes != null) {
            return CrashlyticsReport.FilesPayload.File.builder().setContents(asGzippedBytes).setFilename(this.dataTransportFilename).build();
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public String getReportsEndpointFilename() {
        return this.reportsEndpointFilename;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public InputStream getStream() {
        if (this.file.exists() && this.file.isFile()) {
            try {
                return new FileInputStream(this.file);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
