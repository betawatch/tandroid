package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import org.telegram.messenger.LiteMode;

/* loaded from: classes3.dex */
abstract class NativeSessionFileGzipper {
    private static void gzipInputStream(InputStream inputStream, File file) {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        gZIPOutputStream2.finish();
                        CommonUtils.closeQuietly(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    CommonUtils.closeQuietly(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    static void processNativeSessions(File file, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NativeSessionFile nativeSessionFile = (NativeSessionFile) it.next();
            InputStream inputStream = null;
            try {
                inputStream = nativeSessionFile.getStream();
                if (inputStream != null) {
                    gzipInputStream(inputStream, new File(file, nativeSessionFile.getReportsEndpointFilename()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                CommonUtils.closeQuietly(null);
                throw th;
            }
            CommonUtils.closeQuietly(inputStream);
        }
    }
}
