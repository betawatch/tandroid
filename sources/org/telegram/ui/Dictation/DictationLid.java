package org.telegram.ui.Dictation;

import ai.a1;
import ai.c1;
import ai.e1;
import ai.f1;
import ai.l1;
import ai.x0;
import ai.y0;
import ai.z0;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.messenger.g0;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class DictationLid {
    public static volatile long c;
    public static volatile String[] d;
    public static boolean e;
    public static volatile boolean f;
    public static volatile boolean g;
    public static final ExecutorService a = Executors.newSingleThreadExecutor(new a1(0));
    public static final ExecutorService b = Executors.newSingleThreadExecutor();
    public static final Object h = new Object();
    public static final String[][] i = {new String[]{"ru", "uk", "be", "pl", "cs", "sk", "bg", "sr", "hr", "bs", "sl", "mk"}, new String[]{"sv", "no", "nb", "nn", "da"}, new String[]{"es", "pt", "ca", "gl", "it"}, new String[]{"nl", "de", "af"}, new String[]{"ms", "id"}, new String[]{"hi", "ur"}};
    public static final int[] j = {1000, 2000, 5000, 10000, 20000};

    public static /* synthetic */ float[] a(byte[] bArr, int[] iArr) {
        byte[] m10 = m(bArr);
        iArr[0] = m10.length / 32;
        long j3 = c;
        if (iArr[0] < 500 || j3 == 0) {
            return null;
        }
        float[] fArr = new float[d.length];
        if (nativePredict(j3, m10, 0, m10.length, false, fArr)) {
            return fArr;
        }
        return null;
    }

    public static /* synthetic */ void b() {
        long j3 = c;
        c = 0L;
        if (j3 != 0) {
            nativeFree(j3);
        }
    }

    public static /* synthetic */ void c(byte[] bArr, int i7, e1 e1Var) {
        long j3 = c;
        if (j3 == 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        byte[] m10 = m(bArr);
        int length = m10.length / 32;
        if (length < i7) {
            g0.g3(new y0(e1Var, length, 0));
        } else {
            float[] fArr = new float[d.length];
            g0.g3(new z0(e1Var, nativePredict(j3, m10, 0, m10.length, false, fArr), fArr, SystemClock.elapsedRealtime() - elapsedRealtime, length));
        }
    }

    public static void d(Context context) {
        Context applicationContext = context.getApplicationContext();
        File file = new File(applicationContext.getFilesDir(), "tinylid.bin");
        int i7 = 0;
        boolean z10 = System.currentTimeMillis() - mp.g1().getLong("tinylid_checked", 0L) > 86400000;
        if (file.exists()) {
            k(applicationContext);
        }
        if (file.exists() || l1.b()) {
            if ((!file.exists() || z10) && !f) {
                f = true;
                File file2 = new File(applicationContext.getFilesDir(), "tinylid.bin");
                if (!file2.exists()) {
                    TLRPC.TL_transcriptionModel f10 = l1.f(l1.a(), "tinylid");
                    DictationAsr.h.putIfAbsent("tinylid.bin", new long[]{0, Math.max(f10 != null ? f10.document.size : 0L, 4400000L)});
                    DictationAsr.p();
                }
                b.execute(new x0(file2, i7));
            }
        }
    }

    public static boolean e(ArrayList arrayList) {
        if (arrayList != null) {
            for (String[] strArr : i) {
                int size = arrayList.size();
                int i7 = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    String language = Locale.forLanguageTag((String) obj).getLanguage();
                    int length = strArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            break;
                        }
                        if (strArr[i11].equals(language)) {
                            i7++;
                            break;
                        }
                        i11++;
                    }
                }
                if (i7 >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f() {
        return c != 0;
    }

    public static void g(File file) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                int length = (int) file.length();
                byte[] bArr = new byte[length];
                int i7 = 0;
                while (i7 < length) {
                    int read = fileInputStream.read(bArr, i7, length - i7);
                    if (read <= 0) {
                        break;
                    } else {
                        i7 += read;
                    }
                }
                long nativeLoad = nativeLoad(bArr);
                if (nativeLoad == 0) {
                    Log.e("Dictation", "tinylid: model rejected (" + file.length() + " bytes)");
                } else {
                    long j3 = c;
                    d = nativeLanguages(nativeLoad);
                    c = nativeLoad;
                    if (j3 != 0) {
                        nativeFree(j3);
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

    public static void h() {
        Object obj = h;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public static float i(int i7) {
        if (i7 < 1000) {
            return 2.0f;
        }
        if (i7 < 2000) {
            return 0.85f;
        }
        if (i7 < 5000) {
            return 0.75f;
        }
        return i7 < 10000 ? 0.6f : 0.5f;
    }

    public static void j(byte[] bArr, int i7, e1 e1Var) {
        if (c == 0) {
            return;
        }
        a.execute(new c1(bArr, i7, e1Var, 0));
    }

    public static void k(Context context) {
        if (e) {
            return;
        }
        File file = new File(context.getApplicationContext().getFilesDir(), "tinylid.bin");
        if (file.exists()) {
            e = true;
            g = true;
            a.execute(new x0(file, 1));
        }
    }

    public static void l(String str) {
        if (str == null || str.equals(mp.g1().getString("tinylid_lang", null))) {
            return;
        }
        mp.g1().edit().putString("tinylid_lang", str).apply();
    }

    public static byte[] m(byte[] bArr) {
        int i7;
        int length = bArr.length / 960;
        if (length == 0) {
            return new byte[0];
        }
        float[] fArr = new float[length];
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 * 960;
            double d2 = 0.0d;
            while (true) {
                i7 = i10 + 1;
                if (i11 < i7 * 960) {
                    float f10 = ((short) ((bArr[i11] & 255) | (bArr[i11 + 1] << 8))) / 32768.0f;
                    d2 += f10 * f10;
                    i11 += 2;
                }
            }
            fArr[i10] = (float) (Math.log10((d2 / 480.0d) + 1.0E-12d) * 10.0d);
            i10 = i7;
        }
        float[] fArr2 = (float[]) fArr.clone();
        Arrays.sort(fArr2);
        float max = Math.max(fArr2[(int) (length * 0.1f)] + 12.0f, -55.0f);
        int round = Math.round(6.666667f);
        boolean[] zArr = new boolean[length];
        for (int i12 = 0; i12 < length; i12++) {
            if (fArr[i12] > max) {
                for (int max2 = Math.max(0, i12 - round); max2 <= Math.min(length - 1, i12 + round); max2++) {
                    zArr[max2] = true;
                }
            }
        }
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            if (zArr[i14]) {
                i13++;
            }
        }
        byte[] bArr2 = new byte[i13 * 960];
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            if (zArr[i16]) {
                System.arraycopy(bArr, i16 * 960, bArr2, i15, 960);
                i15 += 960;
            }
        }
        return bArr2;
    }

    public static f1 n(float f10, float[] fArr) {
        String[] strArr = d;
        if (fArr == null || strArr == null || strArr.length != fArr.length) {
            return null;
        }
        boolean z10 = false;
        int i7 = 0;
        for (int i10 = 1; i10 < fArr.length; i10++) {
            if (fArr[i10] > fArr[i7]) {
                i7 = i10;
            }
        }
        String str = strArr[i7];
        boolean z11 = ("other".equals(str) || "nospeech".equals(str)) ? false : true;
        float f11 = fArr[i7];
        if (z11 && f11 >= f10) {
            z10 = true;
        }
        return new f1(str, f11, z10);
    }

    private static native void nativeFree(long j3);

    private static native String[] nativeLanguages(long j3);

    private static native long nativeLoad(byte[] bArr);

    private static native boolean nativePredict(long j3, byte[] bArr, int i7, int i10, boolean z10, float[] fArr);
}
