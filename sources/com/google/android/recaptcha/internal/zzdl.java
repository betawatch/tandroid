package com.google.android.recaptcha.internal;

import android.content.Context;
import g7.e8;
import g7.f8;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import xc.a;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzdl {
    public zzdl(Context context) {
    }

    public static final byte[] zza(File file) {
        i.e(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i9 = (int) length;
            byte[] bArr = new byte[i9];
            int i10 = i9;
            int i11 = 0;
            while (i10 > 0) {
                int read = fileInputStream.read(bArr, i11, i10);
                if (read < 0) {
                    break;
                }
                i10 -= read;
                i11 += read;
            }
            if (i10 > 0) {
                bArr = Arrays.copyOf(bArr, i11);
                i.d(bArr, "copyOf(...)");
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    a aVar = new a(8193);
                    aVar.write(read2);
                    e8.a(fileInputStream, aVar);
                    int size = aVar.size() + i9;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] a2 = aVar.a();
                    bArr = Arrays.copyOf(bArr, size);
                    i.d(bArr, "copyOf(...)");
                    System.arraycopy(a2, 0, bArr, i9, aVar.size());
                }
            }
            fileInputStream.close();
            return bArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                f8.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final void zzb(File file, byte[] array) {
        if (file.exists() && !file.delete()) {
            throw new IOException("Unable to delete existing encrypted file");
        }
        i.e(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            fileOutputStream.close();
        } finally {
        }
    }
}
