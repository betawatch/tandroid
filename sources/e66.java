// default package

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class e66 {
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

    public static void a(p8c p8cVar) {
        HashSet hashSet = n;
        if (hashSet == null) {
            hashSet = new HashSet();
            n = hashSet;
        }
        hashSet.add(p8cVar);
    }

    public static int b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m && (l == 0 || elapsedRealtime - l > 60000)) {
            m = true;
            l = elapsedRealtime;
            Utilities.e.c(new ql3((byte) 21));
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
        if (i2 == 64 && gl.O1()) {
            return true;
        }
        int d2 = d(false);
        if ((i2 & 16388) > 0) {
            i2 = (i2 & (-16389)) | (y6c.n() ? 4 : TLObject.FLAG_14);
        }
        if ((i2 & 8200) > 0) {
            i2 = (i2 & (-8201)) | (y6c.n() ? 8 : TLObject.FLAG_13);
        }
        if ((i2 & 4112) > 0) {
            i2 = (i2 & (-4113)) | (y6c.n() ? 16 : TLObject.FLAG_12);
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
        if (gba.o() == 0) {
            i2 = a;
            i3 = d;
        } else if (gba.o() == 1) {
            i2 = b;
            i3 = e;
        }
        SharedPreferences c1 = na7.c1();
        if (!c1.contains("lite_mode6")) {
            if (c1.contains("lite_mode5")) {
                i2 = c1.getInt("lite_mode5", i2) & (-262145);
                c1.edit().putInt("lite_mode6", i2).apply();
            } else if (c1.contains("lite_mode4")) {
                i2 = c1.getInt("lite_mode4", i2);
                c1.edit().putInt("lite_mode5", i2).apply();
            } else if (c1.contains("lite_mode3")) {
                i2 = c1.getInt("lite_mode3", i2) | 131072;
                c1.edit().putInt("lite_mode5", i2).apply();
            } else if (c1.contains("lite_mode2")) {
                i2 = c1.getInt("lite_mode2", i2) | 65536;
                c1.edit().putInt("lite_mode3", i2).apply();
            } else if (c1.contains("lite_mode")) {
                i2 = c1.getInt("lite_mode", i2);
                if (i2 == 4095) {
                    i2 = c;
                }
            } else {
                if (c1.contains("light_mode")) {
                    i2 = (c1.getInt("light_mode", gba.o() == 0 ? 1 : 0) & 1) > 0 ? a : c;
                }
                if (c1.contains("loopStickers")) {
                    i2 = c1.getBoolean("loopStickers", true) ? i2 | 2 : i2 & (-3);
                }
                if (c1.contains("autoplay_video")) {
                    i2 = (c1.getBoolean("autoplay_video", true) || c1.getBoolean("autoplay_video_liteforce", false)) ? i2 | 1024 : i2 & (-1025);
                }
                if (c1.contains("autoplay_gif")) {
                    i2 = c1.getBoolean("autoplay_gif", true) ? i2 | 2048 : i2 & (-2049);
                }
                if (c1.contains("chatBlur")) {
                    i2 = c1.getBoolean("chatBlur", true) ? i2 | 256 : i2 & (-257);
                }
            }
        }
        int i4 = i;
        int i5 = c1.getInt("lite_mode6", i2);
        i = i5;
        if (j) {
            i(i4, i5);
        }
        g = c1.getInt("lite_mode_battery_level", i3);
        j = true;
    }

    public static void h(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra < 0 || intExtra2 <= 0) {
                return;
            }
            int b2 = moe.b(Math.round((intExtra * 100.0f) / intExtra2), 0, 100);
            l = SystemClock.elapsedRealtime();
            if (k != b2) {
                k = b2;
                gl.d3(new ql3((byte) 22));
            }
        }
    }

    public static void i(int i2, int i3) {
        int i4 = (~i2) & i3;
        if ((i4 & 28700) > 0) {
            vl.t();
        }
        if ((i4 & 32) > 0) {
            int[] iArr = kcb.u;
            kcb.A = e(32);
            bkb.s1(true);
        }
        if (fod.a(i4, 256) || fod.a(i4, 262144)) {
            qw4.f();
        }
    }

    public static void j(boolean z) {
        if (z) {
            i(d(true), 0);
        } else {
            i(0, d(true));
        }
        if (n != null) {
            gl.d3(new yf4((byte) 2, z));
        }
    }

    public static void k() {
        na7.c1().edit().putInt("lite_mode6", i).putInt("lite_mode_battery_level", g).apply();
    }
}
