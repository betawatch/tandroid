package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import gi.e8;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.ac;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.u10;
import org.telegram.messenger.w7;
import org.telegram.messenger.zb;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p3 {
    public static final int[] h = {k6.ra, k6.ob, k6.Ci, k6.Be, k6.Ce, k6.De, k6.Ee, k6.Fe};
    public boolean a;
    public boolean b;
    public jg.b c;
    public TLRPC.ChatTheme d;
    public String e;
    public final ArrayList f;
    public final int g;

    public p3(int i3) {
        this.f = new ArrayList();
        this.g = i3;
    }

    public static p3 a(int i3) {
        p3 p3Var = new p3(i3);
        p3Var.e = "❌";
        p3Var.c = jg.b.d("❌");
        p3Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        p3Var.b = true;
        o3 o3Var = new o3();
        o3Var.a = d(true);
        p3Var.f.add(o3Var);
        o3 o3Var2 = new o3();
        o3Var2.a = d(false);
        p3Var.f.add(o3Var2);
        return p3Var;
    }

    public static p3 b(int i3) {
        p3 p3Var = new p3(i3);
        p3Var.e = "🏠";
        p3Var.c = jg.b.d("🏠");
        p3Var.d = TLRPC.ChatTheme.ofEmoticon(p3Var.e);
        o3 o3Var = new o3();
        o3Var.a = k6.Q0("Blue");
        o3Var.e = 99;
        p3Var.f.add(o3Var);
        o3 o3Var2 = new o3();
        o3Var2.a = k6.Q0("Day");
        o3Var2.e = 9;
        p3Var.f.add(o3Var2);
        o3 o3Var3 = new o3();
        o3Var3.a = k6.Q0("Night");
        o3Var3.e = 0;
        p3Var.f.add(o3Var3);
        o3 o3Var4 = new o3();
        o3Var4.a = k6.Q0("Dark Blue");
        o3Var4.e = 0;
        p3Var.f.add(o3Var4);
        return p3Var;
    }

    public static p3 c(int i3, TLRPC.TL_theme tL_theme) {
        p3 p3Var = new p3(i3);
        String str = tL_theme.emoticon;
        p3Var.e = str;
        p3Var.c = new jg.b(str, null);
        p3Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i10 = 0; i10 < tL_theme.settings.size(); i10++) {
            o3 o3Var = new o3();
            o3Var.b = tL_theme;
            o3Var.d = i10;
            p3Var.f.add(o3Var);
        }
        return p3Var;
    }

    public static j6 d(boolean z10) {
        j6 D0 = z10 ? k6.J : k6.D0();
        if (z10 != D0.q()) {
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
            D0 = k6.Q0(z10 ? sharedPreferences.getString("lastDarkTheme", "Dark Blue") : sharedPreferences.getString("lastDayTheme", "Blue"));
            if (D0 == null) {
                D0 = k6.Q0(z10 ? "Dark Blue" : "Blue");
            }
        }
        return new j6(D0);
    }

    public static int f(SparseIntArray sparseIntArray, int i3) {
        if (sparseIntArray == null) {
            return k6.F0(i3);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i3);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        return k6.F0(i3);
    }

    public static void o(int i3, long j10, TLRPC.WallPaper wallPaper, u10 u10Var) {
        boolean z10 = wallPaper.pattern;
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(i3);
        n3 n3Var = new n3(u10Var, wallPaper, z10 ? 1 : 0, i3, j10);
        if (z10) {
            if (z10) {
                File i10 = org.telegram.messenger.t0.i();
                Locale locale = Locale.US;
                org.telegram.messenger.d4.s.c(new org.telegram.messenger.b4(18, new File(i10, t4.c.e(j10, "pattern_", ".pgm.gz")), n3Var));
                return;
            }
            return;
        }
        org.telegram.messenger.p1 p1Var = new org.telegram.messenger.p1(n3Var, 2);
        if (f10.c == 0) {
            p1Var.onComplete(null);
        } else {
            org.telegram.messenger.d4.s.c(new org.telegram.messenger.b4(25, f10.g(j10), p1Var));
        }
    }

    public static void q(j6 j6Var, int i3) {
        SparseArray sparseArray;
        g6 g6Var;
        if (j6Var == null) {
            return;
        }
        if (i3 < 0 || (sparseArray = j6Var.b0) == null || !((g6Var = (g6) sparseArray.get(i3)) == null || g6Var.z)) {
            if (j6Var.m().equals("Blue") && i3 == 99) {
                return;
            }
            if (j6Var.m().equals("Day") && i3 == 9) {
                return;
            }
            if (j6Var.m().equals("Night") && i3 == 0) {
                return;
            }
            if (j6Var.m().equals("Dark Blue") && i3 == 0) {
                return;
            }
            boolean q10 = j6Var.q();
            org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0).edit().putString(q10 ? "lastDarkCustomTheme" : "lastDayCustomTheme", j6Var.m()).putInt(q10 ? "lastDarkCustomThemeAccentId" : "lastDayCustomThemeAccentId", i3).apply();
        }
    }

    public final TLRPC.Document e() {
        TLRPC.ChatTheme chatTheme = this.d;
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return dg.d.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return li.b0(this.g).T(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray g(int i3, int i10) {
        g6 g6Var;
        SparseIntArray T0;
        int indexOfKey;
        j6 j6Var;
        g6 g6Var2;
        ArrayList arrayList = this.f;
        SparseIntArray sparseIntArray = ((o3) arrayList.get(i10)).f;
        if (sparseIntArray != null) {
            return sparseIntArray;
        }
        j6 i11 = i(i10);
        if (i11 == null) {
            int i12 = ((o3) arrayList.get(i10)).d;
            jg.a aVar = (jg.a) arrayList.get(i10);
            TLRPC.TL_theme tL_theme = ((o3) arrayList.get(i10)).b;
            j6 Q0 = aVar != null ? k6.Q0(k6.r0(((o3) aVar).b(i12))) : k6.Q0("Blue");
            if (Q0 != null) {
                j6 j6Var2 = new j6(Q0);
                if (aVar != null) {
                    o3 o3Var = (o3) aVar;
                    g6Var2 = j6Var2.e(o3Var.a(), o3Var.b(i12), tL_theme, i3, true);
                } else {
                    g6Var2 = null;
                }
                if (g6Var2 != null) {
                    j6Var2.u(g6Var2.a);
                }
                g6Var = g6Var2;
                i11 = j6Var2;
            }
            g6Var = null;
        } else {
            SparseArray sparseArray = i11.b0;
            if (sparseArray != null) {
                g6Var = (g6) sparseArray.get(((o3) arrayList.get(i10)).e);
            }
            g6Var = null;
        }
        if (i11 == null) {
            return sparseIntArray;
        }
        String[] strArr = new String[1];
        if (i11.b != null) {
            T0 = k6.T0(new File(i11.b), null, strArr);
        } else {
            String str = i11.d;
            T0 = str != null ? k6.T0(null, str, strArr) : new SparseIntArray();
        }
        int i13 = 0;
        ((o3) arrayList.get(i10)).g = strArr[0];
        if (g6Var != null) {
            SparseIntArray clone = T0.clone();
            g6Var.d(T0, clone);
            jg.b bVar = this.c;
            if (bVar != null && !TextUtils.isEmpty(bVar.b) && (j6Var = g6Var.b) != null && j6Var.b == null && !j6Var.q()) {
                g6.h(clone);
            }
            T0 = clone;
        }
        SparseIntArray sparseIntArray2 = k6.fm;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        ((o3) arrayList.get(i10)).f = sparseIntArray3;
        while (true) {
            try {
                int[] iArr = h;
                if (i13 >= iArr.length) {
                    return sparseIntArray3;
                }
                int i14 = iArr[i13];
                int indexOfKey2 = T0.indexOfKey(i14);
                if (indexOfKey2 >= 0) {
                    sparseIntArray3.put(i14, T0.valueAt(indexOfKey2));
                } else {
                    int i15 = sparseIntArray2.get(i14, -1);
                    if (i15 >= 0 && (indexOfKey = T0.indexOfKey(i15)) >= 0) {
                        sparseIntArray3.put(i14, T0.valueAt(indexOfKey));
                    }
                }
                i13++;
            } catch (Exception e10) {
                a8.g(e10, true);
                return sparseIntArray3;
            }
        }
    }

    public final long h(int i3) {
        return ((o3) this.f.get(i3)).a();
    }

    public final j6 i(int i3) {
        return ((o3) this.f.get(i3)).a;
    }

    public final TLRPC.WallPaper j(int i3) {
        o3 o3Var = (o3) this.f.get(i3);
        TLRPC.ThemeSettings b10 = o3Var.b(o3Var.d);
        if (b10 != null) {
            return b10.wallpaper;
        }
        return null;
    }

    public final void k() {
        g(0, 0);
        g(0, 1);
    }

    public final boolean l() {
        return this.a || this.b;
    }

    public final void m(int i3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i10) != null) {
                SparseIntArray g7 = g(i3, i10);
                ((o3) arrayList.get(i10)).h = f(g7, k6.ra);
                ((o3) arrayList.get(i10)).i = f(g7, k6.ob);
                ((o3) arrayList.get(i10)).j = f(g7, k6.Ci);
                ((o3) arrayList.get(i10)).k = g7.get(k6.Be, 0);
                ((o3) arrayList.get(i10)).l = g7.get(k6.Ce, 0);
                ((o3) arrayList.get(i10)).m = g7.get(k6.De, 0);
                ((o3) arrayList.get(i10)).n = g7.get(k6.Ee, 0);
                ((o3) arrayList.get(i10)).o = g7.get(k6.Fe, 0);
                if (((o3) arrayList.get(i10)).a != null && ((o3) arrayList.get(i10)).a.m().equals("Blue")) {
                    if ((((o3) arrayList.get(i10)).e >= 0 ? ((o3) arrayList.get(i10)).e : ((o3) arrayList.get(i10)).a.Z) == 99) {
                        ((o3) arrayList.get(i10)).k = -2368069;
                        ((o3) arrayList.get(i10)).l = -9722489;
                        ((o3) arrayList.get(i10)).m = -2762611;
                        ((o3) arrayList.get(i10)).n = -7817084;
                    }
                }
            }
            i10++;
        }
    }

    public final void n(int i3, ResultCallback resultCallback) {
        TLRPC.WallPaper j10 = j(i3);
        if (j10 == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
            }
        } else {
            long h7 = h(i3);
            o(this.g, j10.id, j10, new e8(resultCallback, h7, 1));
        }
    }

    public final void p(int i3, ResultCallback resultCallback) {
        TLRPC.WallPaper j10 = j(i3);
        if (j10 != null) {
            long h7 = h(i3);
            if (h7 != 0) {
                Bitmap bitmap = (Bitmap) org.telegram.messenger.d4.f(this.g).a.get(Long.valueOf(h7));
                File file = new File(org.telegram.messenger.t0.h(), t4.c.e(h7, "wallpaper_thumb_", ".png"));
                if (bitmap == null && file.exists() && file.length() > 0) {
                    try {
                        bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
                if (bitmap != null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(h7), bitmap));
                        return;
                    }
                    return;
                }
                TLRPC.Document document = j10.document;
                if (document == null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(h7), null));
                        return;
                    }
                    return;
                } else {
                    ac c2 = ac.c(w7.w(document.thumbs, hs.W1, false, null, false), j10.document);
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    imageReceiver.A1 = false;
                    imageReceiver.q0(c2, "120_140", null, null, null, 1);
                    imageReceiver.h1 = new ci.i(resultCallback, h7, file, 4);
                    zb.D().M(imageReceiver, null);
                    return;
                }
            }
            if (resultCallback != null) {
                resultCallback.onComplete(null);
            }
        } else if (resultCallback != null) {
            resultCallback.onComplete(null);
        }
    }

    public p3(int i3, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i3;
        this.a = false;
        String str = tL_theme.emoticon;
        this.e = str;
        this.c = new jg.b(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        o3 o3Var = new o3();
        o3Var.b = tL_theme;
        o3Var.d = 0;
        arrayList.add(o3Var);
        o3 o3Var2 = new o3();
        o3Var2.b = tL_theme;
        o3Var2.d = 1;
        arrayList.add(o3Var2);
    }

    public p3(int i3, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i3;
        this.a = false;
        this.e = tL_chatThemeUniqueGift.gift.slug;
        this.c = jg.b.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        o3 o3Var = new o3();
        o3Var.c = tL_chatThemeUniqueGift;
        o3Var.d = 0;
        arrayList.add(o3Var);
        o3 o3Var2 = new o3();
        o3Var2.c = tL_chatThemeUniqueGift;
        o3Var2.d = 1;
        arrayList.add(o3Var2);
    }
}
