package ki;

import android.content.SharedPreferences;
import java.lang.reflect.Array;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public abstract class t0 {
    public static final String[] a = {"round_video_switch_back_to_front_ms", "round_video_switch_front_to_back_ms"};
    public static final int[][] b = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 8);
    public static final int[] c = new int[2];
    public static final int[] d = new int[2];
    public static boolean e;

    public static int a(int i10) {
        int i11 = c[i10];
        if (i11 == 0) {
            return i10 == 0 ? 680 : 630;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += b[i10][i13];
        }
        return Math.round(i12 / i11);
    }

    public static void b() {
        int[] iArr = c;
        if (e) {
            return;
        }
        e = true;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
        int i10 = 0;
        while (true) {
            String[] strArr = a;
            if (i10 >= 2) {
                return;
            }
            String string = sharedPreferences.getString(strArr[i10], null);
            if (string != null && !string.isEmpty()) {
                String[] split = string.split(",");
                for (int max = Math.max(0, split.length - 8); max < split.length; max++) {
                    try {
                        int max2 = Math.max(200, Math.min(2000, Integer.parseInt(split[max])));
                        int[] iArr2 = b[i10];
                        int i11 = iArr[i10];
                        iArr[i10] = i11 + 1;
                        iArr2[i11] = max2;
                    } catch (NumberFormatException unused) {
                    }
                }
                d[i10] = iArr[i10] % 8;
            }
            i10++;
        }
    }

    public static void c(int i10) {
        int i11 = c[i10];
        int i12 = i11 == 8 ? d[i10] : 0;
        StringBuilder sb2 = new StringBuilder(i11 * 5);
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 > 0) {
                sb2.append(',');
            }
            sb2.append(b[i10][(i12 + i13) % 8]);
        }
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putString(a[i10], sb2.toString()).apply();
    }

    public static synchronized int d(l0 l0Var, l0 l0Var2, int i10) {
        int a2;
        synchronized (t0.class) {
            try {
                b();
                if (l0Var == l0Var2) {
                    throw new IllegalArgumentException("Camera switch direction must change");
                }
                int i11 = l0Var == l0.b ? 0 : 1;
                int max = Math.max(200, Math.min(2000, i10));
                int[] iArr = b[i11];
                int[] iArr2 = d;
                iArr[iArr2[i11]] = max;
                iArr2[i11] = (iArr2[i11] + 1) % 8;
                int[] iArr3 = c;
                int i12 = iArr3[i11];
                if (i12 < 8) {
                    iArr3[i11] = i12 + 1;
                }
                c(i11);
                a2 = a(i11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a2;
    }
}
