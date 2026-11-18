package com.google.android.recaptcha.internal;

import android.content.Context;
import c8.qb;
import c8.rb;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import pd.a;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
            int i7 = (int) length;
            byte[] bArr = new byte[i7];
            int i10 = i7;
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
                j.d(bArr, "copyOf(...)");
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    a aVar = new a(8193);
                    aVar.write(read2);
                    qb.a(fileInputStream, aVar);
                    int size = aVar.size() + i7;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] a10 = aVar.a();
                    bArr = Arrays.copyOf(bArr, size);
                    j.d(bArr, "copyOf(...)");
                    System.arraycopy(a10, 0, bArr, i7, aVar.size());
                }
            }
            fileInputStream.close();
            return bArr;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                rb.a(fileInputStream, th2);
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
