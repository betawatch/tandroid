package com.google.android.recaptcha.internal;

import android.content.Context;
import bd.a;
import j7.e0;
import j7.f0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class zzdl {
    public zzdl(Context context) {
    }

    public static final byte[] zza(File file) {
        j.e(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i10 = (int) length;
            byte[] bArr = new byte[i10];
            int i11 = i10;
            int i12 = 0;
            while (i11 > 0) {
                int read = fileInputStream.read(bArr, i12, i11);
                if (read < 0) {
                    break;
                }
                i11 -= read;
                i12 += read;
            }
            if (i11 > 0) {
                bArr = Arrays.copyOf(bArr, i12);
                j.d(bArr, "copyOf(...)");
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    a aVar = new a(8193);
                    aVar.write(read2);
                    e0.a(fileInputStream, aVar);
                    int size = aVar.size() + i10;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] a2 = aVar.a();
                    bArr = Arrays.copyOf(bArr, size);
                    j.d(bArr, "copyOf(...)");
                    System.arraycopy(a2, 0, bArr, i10, aVar.size());
                }
            }
            fileInputStream.close();
            return bArr;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                f0.a(fileInputStream, th2);
                throw th3;
            }
        }
    }

    public static final void zzb(File file, byte[] array) {
        if (file.exists() && !file.delete()) {
            throw new IOException("Unable to delete existing encrypted file");
        }
        j.e(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            fileOutputStream.close();
        } finally {
        }
    }
}
