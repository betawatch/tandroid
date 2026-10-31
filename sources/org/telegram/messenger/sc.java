package org.telegram.messenger;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class sc {
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

    public static void a(q20 q20Var) {
        if (n == null) {
            n = new HashSet();
        }
        n.add(q20Var);
    }

    public static int b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m && (l == 0 || elapsedRealtime - l > 60000)) {
            m = true;
            l = elapsedRealtime;
            Utilities.e.c(new ag.f3(19));
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
                int i10 = g;
                if (i10 >= 100 || (b10 >= 0 && b10 <= i10)) {
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

    public static boolean e(int i10) {
        if (i10 == 64 && i0.Q1()) {
            return true;
        }
        int d10 = d(false);
        if ((i10 & 16388) > 0) {
            i10 = (i10 & (-16389)) | (d20.o() ? 4 : TLObject.FLAG_14);
        }
        if ((i10 & 8200) > 0) {
            i10 = (i10 & (-8201)) | (d20.o() ? 8 : TLObject.FLAG_13);
        }
        if ((i10 & 4112) > 0) {
            i10 = (i10 & (-4113)) | (d20.o() ? 16 : TLObject.FLAG_12);
        }
        return (i10 & d10) > 0;
    }

    public static boolean f() {
        d(false);
        return h;
    }

    public static void g() {
        int i10 = c;
        int i11 = f;
        if (tz.o() == 0) {
            i10 = a;
            i11 = d;
        } else if (tz.o() == 1) {
            i10 = b;
            i11 = e;
        }
        SharedPreferences d12 = vp.d1();
        if (!d12.contains("lite_mode6")) {
            if (d12.contains("lite_mode5")) {
                i10 = d12.getInt("lite_mode5", i10) & (-262145);
                d12.edit().putInt("lite_mode6", i10).apply();
            } else if (d12.contains("lite_mode4")) {
                i10 = d12.getInt("lite_mode4", i10);
                d12.edit().putInt("lite_mode5", i10).apply();
            } else if (d12.contains("lite_mode3")) {
                i10 = d12.getInt("lite_mode3", i10) | 131072;
                d12.edit().putInt("lite_mode5", i10).apply();
            } else if (d12.contains("lite_mode2")) {
                i10 = d12.getInt("lite_mode2", i10) | 65536;
                d12.edit().putInt("lite_mode3", i10).apply();
            } else if (d12.contains("lite_mode")) {
                i10 = d12.getInt("lite_mode", i10);
                if (i10 == 4095) {
                    i10 = c;
                }
            } else {
                if (d12.contains("light_mode")) {
                    i10 = (d12.getInt("light_mode", tz.o() == 0 ? 1 : 0) & 1) > 0 ? a : c;
                }
                if (d12.contains("loopStickers")) {
                    i10 = d12.getBoolean("loopStickers", true) ? i10 | 2 : i10 & (-3);
                }
                if (d12.contains("autoplay_video")) {
                    i10 = (d12.getBoolean("autoplay_video", true) || d12.getBoolean("autoplay_video_liteforce", false)) ? i10 | 1024 : i10 & (-1025);
                }
                if (d12.contains("autoplay_gif")) {
                    i10 = d12.getBoolean("autoplay_gif", true) ? i10 | 2048 : i10 & (-2049);
                }
                if (d12.contains("chatBlur")) {
                    i10 = d12.getBoolean("chatBlur", true) ? i10 | 256 : i10 & (-257);
                }
            }
        }
        int i12 = i;
        int i13 = d12.getInt("lite_mode6", i10);
        i = i13;
        if (j) {
            i(i12, i13);
        }
        g = d12.getInt("lite_mode_battery_level", i11);
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
        int b10 = w7.u.b(Math.round((intExtra * 100.0f) / intExtra2), 0, 100);
        l = SystemClock.elapsedRealtime();
        if (k == b10) {
            return;
        }
        k = b10;
        i0.g3(new ag.f3(18));
    }

    public static void i(int i10, int i11) {
        int i12 = (~i10) & i11;
        if ((i12 & 28700) > 0) {
            org.telegram.ui.Components.f5.t();
        }
        int i13 = i12 & 32;
        if (i13 > 0) {
            int[] iArr = c00.u;
            c00.A = e(32);
        }
        if (i13 > 0) {
            org.telegram.ui.ActionBar.t6.u1(true);
        }
        if (v7.u7.a(i12, 256) || v7.u7.a(i12, 262144)) {
            ei.r.f();
        }
    }

    public static void j(boolean z10) {
        if (z10) {
            i(d(true), 0);
        } else {
            i(0, d(true));
        }
        if (n != null) {
            i0.g3(new i9(2, z10));
        }
    }

    public static void k() {
        vp.d1().edit().putInt("lite_mode6", i).putInt("lite_mode_battery_level", g).apply();
    }

    public static void l(TLRPC.TL_jsonObject tL_jsonObject) {
        for (int i10 = 0; i10 < tL_jsonObject.value.size(); i10++) {
            TLRPC.TL_jsonObjectValue tL_jsonObjectValue = tL_jsonObject.value.get(i10);
            if ("settings_mask".equals(tL_jsonObjectValue.key)) {
                TLRPC.JSONValue jSONValue = tL_jsonObjectValue.value;
                if (jSONValue instanceof TLRPC.TL_jsonArray) {
                    ArrayList<TLRPC.JSONValue> arrayList = ((TLRPC.TL_jsonArray) jSONValue).value;
                    try {
                        a = (int) ((TLRPC.TL_jsonNumber) arrayList.get(0)).value;
                        b = (int) ((TLRPC.TL_jsonNumber) arrayList.get(1)).value;
                        c = (int) ((TLRPC.TL_jsonNumber) arrayList.get(2)).value;
                    } catch (Exception e7) {
                        f8.g(e7, true);
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
                    } catch (Exception e10) {
                        f8.g(e10, true);
                    }
                }
            }
        }
        g();
    }
}
