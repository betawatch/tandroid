package org.telegram.messenger;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class lc {
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

    public static void a(u10 u10Var) {
        if (n == null) {
            n = new HashSet();
        }
        n.add(u10Var);
    }

    public static int b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m && (l == 0 || elapsedRealtime - l > 60000)) {
            m = true;
            l = elapsedRealtime;
            Utilities.e.c(new hc(2));
        }
        return k;
    }

    public static int c() {
        if (!j) {
            g();
        }
        return g;
    }

    public static int d(boolean z10) {
        if (!j) {
            g();
        }
        if (!z10) {
            if (g > 0) {
                int b10 = b();
                int i3 = g;
                if (i3 >= 100 || (b10 >= 0 && b10 <= i3)) {
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

    public static boolean e(int i3) {
        if (i3 == 64 && g0.Q1()) {
            return true;
        }
        int d10 = d(false);
        if ((i3 & 16388) > 0) {
            i3 = (i3 & (-16389)) | (h10.o() ? 4 : TLObject.FLAG_14);
        }
        if ((i3 & 8200) > 0) {
            i3 = (i3 & (-8201)) | (h10.o() ? 8 : TLObject.FLAG_13);
        }
        if ((i3 & 4112) > 0) {
            i3 = (i3 & (-4113)) | (h10.o() ? 16 : TLObject.FLAG_12);
        }
        return (i3 & d10) > 0;
    }

    public static boolean f() {
        d(false);
        return h;
    }

    public static void g() {
        int i3 = c;
        int i10 = f;
        if (az.o() == 0) {
            i3 = a;
            i10 = d;
        } else if (az.o() == 1) {
            i3 = b;
            i10 = e;
        }
        SharedPreferences e12 = hp.e1();
        if (!e12.contains("lite_mode6")) {
            if (e12.contains("lite_mode5")) {
                i3 = e12.getInt("lite_mode5", i3) & (-262145);
                e12.edit().putInt("lite_mode6", i3).apply();
            } else if (e12.contains("lite_mode4")) {
                i3 = e12.getInt("lite_mode4", i3);
                e12.edit().putInt("lite_mode5", i3).apply();
            } else if (e12.contains("lite_mode3")) {
                i3 = e12.getInt("lite_mode3", i3) | 131072;
                e12.edit().putInt("lite_mode5", i3).apply();
            } else if (e12.contains("lite_mode2")) {
                i3 = e12.getInt("lite_mode2", i3) | 65536;
                e12.edit().putInt("lite_mode3", i3).apply();
            } else if (e12.contains("lite_mode")) {
                i3 = e12.getInt("lite_mode", i3);
                if (i3 == 4095) {
                    i3 = c;
                }
            } else {
                if (e12.contains("light_mode")) {
                    i3 = (e12.getInt("light_mode", az.o() == 0 ? 1 : 0) & 1) > 0 ? a : c;
                }
                if (e12.contains("loopStickers")) {
                    i3 = e12.getBoolean("loopStickers", true) ? i3 | 2 : i3 & (-3);
                }
                if (e12.contains("autoplay_video")) {
                    i3 = (e12.getBoolean("autoplay_video", true) || e12.getBoolean("autoplay_video_liteforce", false)) ? i3 | 1024 : i3 & (-1025);
                }
                if (e12.contains("autoplay_gif")) {
                    i3 = e12.getBoolean("autoplay_gif", true) ? i3 | 2048 : i3 & (-2049);
                }
                if (e12.contains("chatBlur")) {
                    i3 = e12.getBoolean("chatBlur", true) ? i3 | 256 : i3 & (-257);
                }
            }
        }
        int i11 = i;
        int i12 = e12.getInt("lite_mode6", i3);
        i = i12;
        if (j) {
            i(i11, i12);
        }
        g = e12.getInt("lite_mode_battery_level", i10);
        j = true;
    }

    public static void h(Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra < 0 || intExtra2 <= 0) {
            return;
        }
        int b10 = b8.be.b(Math.round((intExtra * 100.0f) / intExtra2), 0, 100);
        l = SystemClock.elapsedRealtime();
        if (k == b10) {
            return;
        }
        k = b10;
        g0.h3(new hc(1));
    }

    public static void i(int i3, int i10) {
        int i11 = (~i3) & i10;
        if ((i11 & 28700) > 0) {
            org.telegram.ui.Components.g5.t();
        }
        int i12 = i11 & 32;
        if (i12 > 0) {
            int[] iArr = jz.u;
            jz.A = e(32);
        }
        if (i12 > 0) {
            org.telegram.ui.ActionBar.k6.u1(true);
        }
        if (x7.u.a(i11, 256) || x7.u.a(i11, 262144)) {
            pi.q.f();
        }
    }

    public static void j(boolean z10) {
        if (z10) {
            i(d(true), 0);
        } else {
            i(0, d(true));
        }
        if (n != null) {
            g0.h3(new c9(2, z10));
        }
    }

    public static void k() {
        hp.e1().edit().putInt("lite_mode6", i).putInt("lite_mode_battery_level", g).apply();
    }

    public static void l(TLRPC.TL_jsonObject tL_jsonObject) {
        for (int i3 = 0; i3 < tL_jsonObject.value.size(); i3++) {
            TLRPC.TL_jsonObjectValue tL_jsonObjectValue = tL_jsonObject.value.get(i3);
            if ("settings_mask".equals(tL_jsonObjectValue.key)) {
                TLRPC.JSONValue jSONValue = tL_jsonObjectValue.value;
                if (jSONValue instanceof TLRPC.TL_jsonArray) {
                    ArrayList<TLRPC.JSONValue> arrayList = ((TLRPC.TL_jsonArray) jSONValue).value;
                    try {
                        a = (int) ((TLRPC.TL_jsonNumber) arrayList.get(0)).value;
                        b = (int) ((TLRPC.TL_jsonNumber) arrayList.get(1)).value;
                        c = (int) ((TLRPC.TL_jsonNumber) arrayList.get(2)).value;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
            }
            if ("battery_low".equals(tL_jsonObjectValue.key)) {
                TLRPC.JSONValue jSONValue2 = tL_jsonObjectValue.value;
                if (jSONValue2 instanceof TLRPC.TL_jsonArray) {
                    ArrayList<TLRPC.JSONValue> arrayList2 = ((TLRPC.TL_jsonArray) jSONValue2).value;
                    try {
                        d = (int) ((TLRPC.TL_jsonNumber) arrayList2.get(0)).value;
                        e = (int) ((TLRPC.TL_jsonNumber) arrayList2.get(1)).value;
                        f = (int) ((TLRPC.TL_jsonNumber) arrayList2.get(2)).value;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                }
            }
        }
        g();
    }
}
