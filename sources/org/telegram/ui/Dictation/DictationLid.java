package org.telegram.ui.Dictation;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class DictationLid {
    public static volatile long c;
    public static volatile String[] d;
    public static boolean e;
    public static volatile boolean f;
    public static volatile boolean g;
    public static volatile boolean h;
    public static final ExecutorService a = Executors.newSingleThreadExecutor(new x20(2));
    public static final ExecutorService b = Executors.newSingleThreadExecutor();
    public static final Object i = new Object();
    public static final int[] j = {1000, 2000, 5000, 10000, 20000};

    public static void a(Context context) {
        Context applicationContext = context.getApplicationContext();
        File file = new File(applicationContext.getFilesDir(), "tinylid.bin");
        byte b2 = 0;
        byte b3 = 1;
        boolean z = System.currentTimeMillis() - na7.c1().getLong("tinylid_checked", 0L) > 3600000;
        if (file.exists() && !e) {
            File file2 = new File(applicationContext.getApplicationContext().getFilesDir(), "tinylid.bin");
            if (file2.exists()) {
                e = true;
                g = true;
                a.execute(new rm3(file2, b3));
            }
        }
        if (file.exists() || zm3.b()) {
            boolean i2 = zm3.i(zm3.f(zm3.a(), "tinylid"), file);
            if (!file.exists() || z || i2) {
                boolean z2 = i2 && a.r();
                if (f) {
                    return;
                }
                f = true;
                h = z2;
                File file3 = new File(applicationContext.getFilesDir(), "tinylid.bin");
                if (!file3.exists()) {
                    TLRPC.TL_transcriptionModel f2 = zm3.f(zm3.a(), "tinylid");
                    DictationAsr.h.putIfAbsent("tinylid.bin", new long[]{0, Math.max(f2 != null ? f2.document.size : 0L, 4400000L)});
                    DictationAsr.n();
                }
                b.execute(new rm3(file3, b2));
            }
        }
    }

    public static /* synthetic */ void b() {
        long j2 = c;
        c = 0L;
        if (j2 != 0) {
            nativeFree(j2);
        }
    }

    public static /* synthetic */ void c(int i2, um3 um3Var, String str, byte[] bArr) {
        long j2 = c;
        if (j2 == 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        byte[] j3 = j(bArr);
        int length = j3.length / 32;
        if (length < i2) {
            gl.c3(new sm3((Object) um3Var, length, (byte) 1));
            return;
        }
        float[] fArr = new float[d.length];
        boolean nativePredict = nativePredict(j2, j3, 0, j3.length, false, fArr);
        if (nativePredict && str != null && !str.isEmpty()) {
            nativeRestrict(j2, fArr, str);
        }
        gl.c3(new tm3(um3Var, nativePredict, fArr, SystemClock.elapsedRealtime() - elapsedRealtime, length));
    }

    public static /* synthetic */ float[] d(byte[] bArr, int[] iArr) {
        byte[] j2 = j(bArr);
        iArr[0] = j2.length / 32;
        long j3 = c;
        if (iArr[0] < 500 || j3 == 0) {
            return null;
        }
        float[] fArr = new float[d.length];
        if (nativePredict(j3, j2, 0, j2.length, false, fArr)) {
            return fArr;
        }
        return null;
    }

    public static void e(File file) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                int length = (int) file.length();
                byte[] bArr = new byte[length];
                int i2 = 0;
                while (i2 < length) {
                    int read = fileInputStream.read(bArr, i2, length - i2);
                    if (read <= 0) {
                        break;
                    } else {
                        i2 += read;
                    }
                }
                long nativeLoad = nativeLoad(bArr);
                if (nativeLoad == 0) {
                    Log.e("Dictation", "tinylid: model rejected (" + file.length() + " bytes)");
                } else {
                    long j2 = c;
                    d = nativeLanguages(nativeLoad);
                    c = nativeLoad;
                    if (j2 != 0) {
                        nativeFree(j2);
                    }
                    Log.d("Dictation", "tinylid: loaded " + d.length + " classes in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
                }
                fileInputStream.close();
            } finally {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static void f() {
        Object obj = i;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public static float g(int i2) {
        if (i2 < 1000) {
            return 2.0f;
        }
        if (i2 < 2000) {
            return 0.85f;
        }
        if (i2 < 5000) {
            return 0.75f;
        }
        return i2 < 10000 ? 0.6f : 0.5f;
    }

    public static void h(int i2, um3 um3Var, String str, byte[] bArr) {
        if (c == 0) {
            return;
        }
        a.execute(new tn6((Object) bArr, i2, (Object) um3Var, (Object) str, (byte) 22));
    }

    public static void i(String str) {
        if (str == null || str.equals(na7.c1().getString("tinylid_lang", null))) {
            return;
        }
        na7.c1().edit().putString("tinylid_lang", str).apply();
    }

    public static byte[] j(byte[] bArr) {
        int i2;
        int length = bArr.length / 960;
        if (length == 0) {
            return new byte[0];
        }
        float[] fArr = new float[length];
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 * 960;
            double d2 = 0.0d;
            while (true) {
                i2 = i3 + 1;
                if (i4 < i2 * 960) {
                    float f2 = ((short) ((bArr[i4] & 255) | (bArr[i4 + 1] << 8))) / 32768.0f;
                    d2 += f2 * f2;
                    i4 += 2;
                }
            }
            fArr[i3] = (float) (Math.log10((d2 / 480.0d) + 1.0E-12d) * 10.0d);
            i3 = i2;
        }
        float[] fArr2 = (float[]) fArr.clone();
        Arrays.sort(fArr2);
        float max = Math.max(fArr2[(int) (length * 0.1f)] + 12.0f, -55.0f);
        boolean[] zArr = new boolean[length];
        for (int i5 = 0; i5 < length; i5++) {
            if (fArr[i5] > max) {
                for (int max2 = Math.max(0, i5 - 7); max2 <= Math.min(length - 1, i5 + 7); max2++) {
                    zArr[max2] = true;
                }
            }
        }
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            if (zArr[i7]) {
                i6++;
            }
        }
        byte[] bArr2 = new byte[i6 * 960];
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            if (zArr[i9]) {
                System.arraycopy(bArr, i9 * 960, bArr2, i8, 960);
                i8 += 960;
            }
        }
        return bArr2;
    }

    public static vm3 k(float f2, float[] fArr) {
        String[] strArr = d;
        if (fArr == null || strArr == null || strArr.length != fArr.length) {
            return null;
        }
        boolean z = false;
        int i2 = 0;
        for (int i3 = 1; i3 < fArr.length; i3++) {
            if (fArr[i3] > fArr[i2]) {
                i2 = i3;
            }
        }
        String str = strArr[i2];
        boolean z2 = ("other".equals(str) || "nospeech".equals(str)) ? false : true;
        float f3 = fArr[i2];
        if (z2 && f3 >= f2) {
            z = true;
        }
        return new vm3(str, f3, z);
    }

    private static native void nativeFree(long j2);

    private static native String[] nativeLanguages(long j2);

    private static native long nativeLoad(byte[] bArr);

    private static native boolean nativePredict(long j2, byte[] bArr, int i2, int i3, boolean z, float[] fArr);

    private static native boolean nativeRestrict(long j2, float[] fArr, String str);
}
