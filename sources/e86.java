// default package

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class e86 {
    public static int a = 198684;
    public static int b = 204383;
    public static int c = 262143;
    public static int d = 10;
    public static int e = 10;
    public static int f = 10;
    public static int g = 0;
    public static boolean h = false;
    public static int i = 0;
    public static boolean j = false;
    public static volatile int k = -1;
    public static volatile long l;
    public static volatile boolean m;
    public static HashSet n;

    public static void a(qac qacVar) {
        HashSet hashSet = n;
        if (hashSet == null) {
            hashSet = new HashSet();
            n = hashSet;
        }
        hashSet.add(qacVar);
    }

    public static int b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m && (l == 0 || elapsedRealtime - l > 60000)) {
            m = true;
            l = elapsedRealtime;
            Utilities.e.c(new bn3((byte) 21));
        }
        return k;
    }

    public static int c() {
        if (!j) {
            g();
        }
        return g;
    }

    public static int d(boolean z) {
        if (!j) {
            g();
        }
        if (!z) {
            if (g > 0) {
                int b2 = b();
                int i2 = g;
                if (i2 >= 100 || (b2 >= 0 && b2 <= i2)) {
                    if (!h) {
                        h = true;
                        j(true);
                    }
                    return 0;
                }
            }
            if (h) {
                h = false;
                j(false);
            }
        }
        return i;
    }

    public static boolean e(int i2) {
        if (i2 == 64 && gm.O1()) {
            return true;
        }
        int d2 = d(false);
        if ((i2 & 16388) > 0) {
            i2 = (i2 & (-16389)) | (z8c.n() ? 4 : TLObject.FLAG_14);
        }
        if ((i2 & 8200) > 0) {
            i2 = (i2 & (-8201)) | (z8c.n() ? 8 : TLObject.FLAG_13);
        }
        if ((i2 & 4112) > 0) {
            i2 = (i2 & (-4113)) | (z8c.n() ? 16 : TLObject.FLAG_12);
        }
        return (d2 & i2) > 0;
    }

    public static boolean f() {
        d(false);
        return h;
    }

    public static void g() {
        int i2 = c;
        int i3 = f;
        if (gda.o() == 0) {
            i2 = a;
            i3 = d;
        } else if (gda.o() == 1) {
            i2 = b;
            i3 = e;
        }
        SharedPreferences d1 = oc7.d1();
        if (!d1.contains("lite_mode6")) {
            if (d1.contains("lite_mode5")) {
                i2 = d1.getInt("lite_mode5", i2) & (-262145);
                d1.edit().putInt("lite_mode6", i2).apply();
            } else if (d1.contains("lite_mode4")) {
                i2 = d1.getInt("lite_mode4", i2);
                d1.edit().putInt("lite_mode5", i2).apply();
            } else if (d1.contains("lite_mode3")) {
                i2 = d1.getInt("lite_mode3", i2) | 131072;
                d1.edit().putInt("lite_mode5", i2).apply();
            } else if (d1.contains("lite_mode2")) {
                i2 = d1.getInt("lite_mode2", i2) | 65536;
                d1.edit().putInt("lite_mode3", i2).apply();
            } else if (d1.contains("lite_mode")) {
                i2 = d1.getInt("lite_mode", i2);
                if (i2 == 4095) {
                    i2 = c;
                }
            } else {
                if (d1.contains("light_mode")) {
                    i2 = (d1.getInt("light_mode", gda.o() == 0 ? 1 : 0) & 1) > 0 ? a : c;
                }
                if (d1.contains("loopStickers")) {
                    i2 = d1.getBoolean("loopStickers", true) ? i2 | 2 : i2 & (-3);
                }
                if (d1.contains("autoplay_video")) {
                    i2 = (d1.getBoolean("autoplay_video", true) || d1.getBoolean("autoplay_video_liteforce", false)) ? i2 | 1024 : i2 & (-1025);
                }
                if (d1.contains("autoplay_gif")) {
                    i2 = d1.getBoolean("autoplay_gif", true) ? i2 | 2048 : i2 & (-2049);
                }
                if (d1.contains("chatBlur")) {
                    i2 = d1.getBoolean("chatBlur", true) ? i2 | 256 : i2 & (-257);
                }
            }
        }
        int i4 = i;
        int i5 = d1.getInt("lite_mode6", i2);
        i = i5;
        if (j) {
            i(i4, i5);
        }
        g = d1.getInt("lite_mode_battery_level", i3);
        j = true;
    }

    public static void h(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra < 0 || intExtra2 <= 0) {
                return;
            }
            int b2 = pqe.b(Math.round((intExtra * 100.0f) / intExtra2), 0, 100);
            l = SystemClock.elapsedRealtime();
            if (k != b2) {
                k = b2;
                gm.c3(new bn3((byte) 22));
            }
        }
    }

    public static void i(int i2, int i3) {
        int i4 = (~i2) & i3;
        if ((i4 & 28700) > 0) {
            vm.t();
        }
        if ((i4 & 32) > 0) {
            int[] iArr = meb.u;
            meb.A = e(32);
            cmb.s1(true);
        }
        if (iqd.a(i4, 256) || iqd.a(i4, 262144)) {
            sy4.f();
        }
    }

    public static void j(boolean z) {
        if (z) {
            i(d(true), 0);
        } else {
            i(0, d(true));
        }
        if (n != null) {
            gm.c3(new zh4((byte) 2, z));
        }
    }

    public static void k() {
        oc7.d1().edit().putInt("lite_mode6", i).putInt("lite_mode_battery_level", g).apply();
    }
}
