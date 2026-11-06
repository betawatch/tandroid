package org.telegram.messenger;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class rc {
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

    public static void a(c20 c20Var) {
        if (n == null) {
            n = new HashSet();
        }
        n.add(c20Var);
    }

    public static int b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m && (l == 0 || elapsedRealtime - l > 60000)) {
            m = true;
            l = elapsedRealtime;
            Utilities.e.c(new ai.m0(28));
        }
        return k;
    }

    public static int c() {
        if (!j) {
            g();
        }
        return g;
    }

    public static int d(boolean z9) {
        if (!j) {
            g();
        }
        if (!z9) {
            if (g > 0) {
                int b10 = b();
                int i7 = g;
                if (i7 >= 100 || (b10 >= 0 && b10 <= i7)) {
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

    public static boolean e(int i7) {
        if (i7 == 64 && g0.Q1()) {
            return true;
        }
        int d2 = d(false);
        if ((i7 & 16388) > 0) {
            i7 = (i7 & (-16389)) | (p10.o() ? 4 : TLObject.FLAG_14);
        }
        if ((i7 & 8200) > 0) {
            i7 = (i7 & (-8201)) | (p10.o() ? 8 : TLObject.FLAG_13);
        }
        if ((i7 & 4112) > 0) {
            i7 = (i7 & (-4113)) | (p10.o() ? 16 : TLObject.FLAG_12);
        }
        return (i7 & d2) > 0;
    }

    public static boolean f() {
        d(false);
        return h;
    }

    public static void g() {
        int i7 = c;
        int i10 = f;
        if (iz.o() == 0) {
            i7 = a;
            i10 = d;
        } else if (iz.o() == 1) {
            i7 = b;
            i10 = e;
        }
        SharedPreferences e12 = qp.e1();
        if (!e12.contains("lite_mode6")) {
            if (e12.contains("lite_mode5")) {
                i7 = e12.getInt("lite_mode5", i7) & (-262145);
                e12.edit().putInt("lite_mode6", i7).apply();
            } else if (e12.contains("lite_mode4")) {
                i7 = e12.getInt("lite_mode4", i7);
                e12.edit().putInt("lite_mode5", i7).apply();
            } else if (e12.contains("lite_mode3")) {
                i7 = e12.getInt("lite_mode3", i7) | 131072;
                e12.edit().putInt("lite_mode5", i7).apply();
            } else if (e12.contains("lite_mode2")) {
                i7 = e12.getInt("lite_mode2", i7) | 65536;
                e12.edit().putInt("lite_mode3", i7).apply();
            } else if (e12.contains("lite_mode")) {
                i7 = e12.getInt("lite_mode", i7);
                if (i7 == 4095) {
                    i7 = c;
                }
            } else {
                if (e12.contains("light_mode")) {
                    i7 = (e12.getInt("light_mode", iz.o() == 0 ? 1 : 0) & 1) > 0 ? a : c;
                }
                if (e12.contains("loopStickers")) {
                    i7 = e12.getBoolean("loopStickers", true) ? i7 | 2 : i7 & (-3);
                }
                if (e12.contains("autoplay_video")) {
                    i7 = (e12.getBoolean("autoplay_video", true) || e12.getBoolean("autoplay_video_liteforce", false)) ? i7 | 1024 : i7 & (-1025);
                }
                if (e12.contains("autoplay_gif")) {
                    i7 = e12.getBoolean("autoplay_gif", true) ? i7 | 2048 : i7 & (-2049);
                }
                if (e12.contains("chatBlur")) {
                    i7 = e12.getBoolean("chatBlur", true) ? i7 | 256 : i7 & (-257);
                }
            }
        }
        int i11 = i;
        int i12 = e12.getInt("lite_mode6", i7);
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
        int b10 = c8.j9.b(Math.round((intExtra * 100.0f) / intExtra2), 0, 100);
        l = SystemClock.elapsedRealtime();
        if (k == b10) {
            return;
        }
        k = b10;
        g0.h3(new ai.m0(27));
    }

    public static void i(int i7, int i10) {
        int i11 = (~i7) & i10;
        if ((i11 & 28700) > 0) {
            org.telegram.ui.Components.i5.t();
        }
        int i12 = i11 & 32;
        if (i12 > 0) {
            int[] iArr = rz.u;
            rz.A = e(32);
        }
        if (i12 > 0) {
            org.telegram.ui.ActionBar.k6.u1(true);
        }
        if (c8.zc.a(i11, 256) || c8.zc.a(i11, 262144)) {
            oi.q.f();
        }
    }

    public static void j(boolean z9) {
        if (z9) {
            i(d(true), 0);
        } else {
            i(0, d(true));
        }
        if (n != null) {
            g0.h3(new d9(2, z9));
        }
    }

    public static void k() {
        qp.e1().edit().putInt("lite_mode6", i).putInt("lite_mode_battery_level", g).apply();
    }

    public static void l(TLRPC.TL_jsonObject tL_jsonObject) {
        for (int i7 = 0; i7 < tL_jsonObject.value.size(); i7++) {
            TLRPC.TL_jsonObjectValue tL_jsonObjectValue = tL_jsonObject.value.get(i7);
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
