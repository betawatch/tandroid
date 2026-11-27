package com.google.android.recaptcha.internal;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zzdl {
    public zzdl(Context context) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final byte[] zza(File file) {
        file.getClass();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArr = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (true) {
                if (i2 > 0) {
                    int read = fileInputStream.read(bArr, i3, i2);
                    if (read < 0) {
                        bArr = Arrays.copyOf(bArr, i3);
                        break;
                    }
                    i2 -= read;
                    i3 += read;
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        o74 o74Var = new o74(8193);
                        o74Var.write(read2);
                        sud.a(fileInputStream, o74Var);
                        int size = o74Var.size() + i;
                        if (size < 0) {
                            throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                        }
                        byte[] a = o74Var.a();
                        bArr = Arrays.copyOf(bArr, size);
                        System.arraycopy(a, 0, bArr, i, o74Var.size());
                    }
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                uvd.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final void zzb(File file, byte[] bArr) {
        if (file.exists() && !file.delete()) {
            su3.e("Unable to delete existing encrypted file");
            return;
        }
        bArr.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } finally {
        }
    }
}
