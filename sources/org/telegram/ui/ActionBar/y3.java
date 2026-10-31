package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.b8;
import org.telegram.messenger.f8;
import org.telegram.messenger.hc;
import org.telegram.messenger.ic;
import org.telegram.messenger.q20;
import org.telegram.messenger.ui;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y3 {
    public static final int[] h = {t6.ra, t6.ob, t6.Ci, t6.Be, t6.Ce, t6.De, t6.Ee, t6.Fe};
    public boolean a;
    public boolean b;
    public yf.b c;
    public TLRPC.ChatTheme d;
    public String e;
    public final ArrayList f;
    public final int g;

    public y3(int i10) {
        this.f = new ArrayList();
        this.g = i10;
    }

    public static y3 a(int i10) {
        y3 y3Var = new y3(i10);
        y3Var.e = "❌";
        y3Var.c = yf.b.d("❌");
        y3Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        y3Var.b = true;
        x3 x3Var = new x3();
        x3Var.a = d(true);
        y3Var.f.add(x3Var);
        x3 x3Var2 = new x3();
        x3Var2.a = d(false);
        y3Var.f.add(x3Var2);
        return y3Var;
    }

    public static y3 b(int i10) {
        y3 y3Var = new y3(i10);
        y3Var.e = "🏠";
        y3Var.c = yf.b.d("🏠");
        y3Var.d = TLRPC.ChatTheme.ofEmoticon(y3Var.e);
        x3 x3Var = new x3();
        x3Var.a = t6.Q0("Blue");
        x3Var.e = 99;
        y3Var.f.add(x3Var);
        x3 x3Var2 = new x3();
        x3Var2.a = t6.Q0("Day");
        x3Var2.e = 9;
        y3Var.f.add(x3Var2);
        x3 x3Var3 = new x3();
        x3Var3.a = t6.Q0("Night");
        x3Var3.e = 0;
        y3Var.f.add(x3Var3);
        x3 x3Var4 = new x3();
        x3Var4.a = t6.Q0("Dark Blue");
        x3Var4.e = 0;
        y3Var.f.add(x3Var4);
        return y3Var;
    }

    public static y3 c(int i10, TLRPC.TL_theme tL_theme) {
        y3 y3Var = new y3(i10);
        String str = tL_theme.emoticon;
        y3Var.e = str;
        y3Var.c = new yf.b(str, null);
        y3Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i11 = 0; i11 < tL_theme.settings.size(); i11++) {
            x3 x3Var = new x3();
            x3Var.b = tL_theme;
            x3Var.d = i11;
            y3Var.f.add(x3Var);
        }
        return y3Var;
    }

    public static s6 d(boolean z10) {
        s6 D0 = z10 ? t6.J : t6.D0();
        if (z10 != D0.q()) {
            SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("themeconfig", 0);
            D0 = t6.Q0(z10 ? sharedPreferences.getString("lastDarkTheme", "Dark Blue") : sharedPreferences.getString("lastDayTheme", "Blue"));
            if (D0 == null) {
                D0 = t6.Q0(z10 ? "Dark Blue" : "Blue");
            }
        }
        return new s6(D0);
    }

    public static int f(SparseIntArray sparseIntArray, int i10) {
        if (sparseIntArray == null) {
            return t6.F0(i10);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i10);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
        return t6.F0(i10);
    }

    public static void o(int i10, long j10, TLRPC.WallPaper wallPaper, q20 q20Var) {
        boolean z10 = wallPaper.pattern;
        org.telegram.messenger.g4 f7 = org.telegram.messenger.g4.f(i10);
        v3 v3Var = new v3(q20Var, wallPaper, z10 ? 1 : 0, i10, j10);
        if (z10) {
            if (z10) {
                File i11 = org.telegram.messenger.w0.i();
                Locale locale = Locale.US;
                org.telegram.messenger.g4.s.c(new org.telegram.messenger.e4(16, new File(i11, org.telegram.ui.Cells.f1.n(j10, "pattern_", ".pgm.gz")), v3Var));
                return;
            }
            return;
        }
        org.telegram.messenger.s1 s1Var = new org.telegram.messenger.s1(v3Var, 2);
        if (f7.c == 0) {
            s1Var.onComplete(null);
        } else {
            org.telegram.messenger.g4.s.c(new org.telegram.messenger.e4(23, f7.g(j10), s1Var));
        }
    }

    public static void q(s6 s6Var, int i10) {
        SparseArray sparseArray;
        r6 r6Var;
        if (s6Var == null) {
            return;
        }
        if (i10 < 0 || (sparseArray = s6Var.a0) == null || !((r6Var = (r6) sparseArray.get(i10)) == null || r6Var.z)) {
            if (s6Var.m().equals("Blue") && i10 == 99) {
                return;
            }
            if (s6Var.m().equals("Day") && i10 == 9) {
                return;
            }
            if (s6Var.m().equals("Night") && i10 == 0) {
                return;
            }
            if (s6Var.m().equals("Dark Blue") && i10 == 0) {
                return;
            }
            boolean q6 = s6Var.q();
            org.telegram.messenger.w0.b.getSharedPreferences("themeconfig", 0).edit().putString(q6 ? "lastDarkCustomTheme" : "lastDayCustomTheme", s6Var.m()).putInt(q6 ? "lastDarkCustomThemeAccentId" : "lastDayCustomThemeAccentId", i10).apply();
        }
    }

    public final TLRPC.Document e() {
        TLRPC.ChatTheme chatTheme = this.d;
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return sf.d.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return ui.b0(this.g).T(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray g(int i10, int i11) {
        r6 r6Var;
        SparseIntArray T0;
        int indexOfKey;
        s6 s6Var;
        r6 r6Var2;
        ArrayList arrayList = this.f;
        SparseIntArray sparseIntArray = ((x3) arrayList.get(i11)).f;
        if (sparseIntArray != null) {
            return sparseIntArray;
        }
        s6 i12 = i(i11);
        if (i12 == null) {
            int i13 = ((x3) arrayList.get(i11)).d;
            yf.a aVar = (yf.a) arrayList.get(i11);
            TLRPC.TL_theme tL_theme = ((x3) arrayList.get(i11)).b;
            s6 Q0 = aVar != null ? t6.Q0(t6.r0(((x3) aVar).b(i13))) : t6.Q0("Blue");
            if (Q0 != null) {
                s6 s6Var2 = new s6(Q0);
                if (aVar != null) {
                    x3 x3Var = (x3) aVar;
                    r6Var2 = s6Var2.e(x3Var.a(), x3Var.b(i13), tL_theme, i10, true);
                } else {
                    r6Var2 = null;
                }
                if (r6Var2 != null) {
                    s6Var2.u(r6Var2.a);
                }
                r6Var = r6Var2;
                i12 = s6Var2;
            }
            r6Var = null;
        } else {
            SparseArray sparseArray = i12.a0;
            if (sparseArray != null) {
                r6Var = (r6) sparseArray.get(((x3) arrayList.get(i11)).e);
            }
            r6Var = null;
        }
        if (i12 == null) {
            return sparseIntArray;
        }
        String[] strArr = new String[1];
        if (i12.b != null) {
            T0 = t6.T0(new File(i12.b), null, strArr);
        } else {
            String str = i12.d;
            T0 = str != null ? t6.T0(null, str, strArr) : new SparseIntArray();
        }
        int i14 = 0;
        ((x3) arrayList.get(i11)).g = strArr[0];
        if (r6Var != null) {
            SparseIntArray clone = T0.clone();
            r6Var.d(T0, clone);
            yf.b bVar = this.c;
            if (bVar != null && !TextUtils.isEmpty(bVar.b) && (s6Var = r6Var.b) != null && s6Var.b == null && !s6Var.q()) {
                r6.h(clone);
            }
            T0 = clone;
        }
        SparseIntArray sparseIntArray2 = t6.fm;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        ((x3) arrayList.get(i11)).f = sparseIntArray3;
        while (true) {
            try {
                int[] iArr = h;
                if (i14 >= iArr.length) {
                    return sparseIntArray3;
                }
                int i15 = iArr[i14];
                int indexOfKey2 = T0.indexOfKey(i15);
                if (indexOfKey2 >= 0) {
                    sparseIntArray3.put(i15, T0.valueAt(indexOfKey2));
                } else {
                    int i16 = sparseIntArray2.get(i15, -1);
                    if (i16 >= 0 && (indexOfKey = T0.indexOfKey(i16)) >= 0) {
                        sparseIntArray3.put(i15, T0.valueAt(indexOfKey));
                    }
                }
                i14++;
            } catch (Exception e) {
                f8.g(e, true);
                return sparseIntArray3;
            }
        }
    }

    public final long h(int i10) {
        return ((x3) this.f.get(i10)).a();
    }

    public final s6 i(int i10) {
        return ((x3) this.f.get(i10)).a;
    }

    public final TLRPC.WallPaper j(int i10) {
        x3 x3Var = (x3) this.f.get(i10);
        TLRPC.ThemeSettings b10 = x3Var.b(x3Var.d);
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

    public final void m(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i11 >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i11) != null) {
                SparseIntArray g10 = g(i10, i11);
                ((x3) arrayList.get(i11)).h = f(g10, t6.ra);
                ((x3) arrayList.get(i11)).i = f(g10, t6.ob);
                ((x3) arrayList.get(i11)).j = f(g10, t6.Ci);
                ((x3) arrayList.get(i11)).k = g10.get(t6.Be, 0);
                ((x3) arrayList.get(i11)).l = g10.get(t6.Ce, 0);
                ((x3) arrayList.get(i11)).m = g10.get(t6.De, 0);
                ((x3) arrayList.get(i11)).n = g10.get(t6.Ee, 0);
                ((x3) arrayList.get(i11)).o = g10.get(t6.Fe, 0);
                if (((x3) arrayList.get(i11)).a != null && ((x3) arrayList.get(i11)).a.m().equals("Blue")) {
                    if ((((x3) arrayList.get(i11)).e >= 0 ? ((x3) arrayList.get(i11)).e : ((x3) arrayList.get(i11)).a.Y) == 99) {
                        ((x3) arrayList.get(i11)).k = -2368069;
                        ((x3) arrayList.get(i11)).l = -9722489;
                        ((x3) arrayList.get(i11)).m = -2762611;
                        ((x3) arrayList.get(i11)).n = -7817084;
                    }
                }
            }
            i11++;
        }
    }

    public final void n(int i10, ResultCallback resultCallback) {
        TLRPC.WallPaper j10 = j(i10);
        if (j10 == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
            }
        } else {
            long h10 = h(i10);
            o(this.g, j10.id, j10, new u3(resultCallback, h10, 0));
        }
    }

    public final void p(int i10, ResultCallback resultCallback) {
        TLRPC.WallPaper j10 = j(i10);
        if (j10 != null) {
            long h10 = h(i10);
            if (h10 != 0) {
                Bitmap bitmap = (Bitmap) org.telegram.messenger.g4.f(this.g).a.get(Long.valueOf(h10));
                File file = new File(org.telegram.messenger.w0.h(), org.telegram.ui.Cells.f1.n(h10, "wallpaper_thumb_", ".png"));
                if (bitmap == null && file.exists() && file.length() > 0) {
                    try {
                        bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                }
                if (bitmap != null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(h10), bitmap));
                        return;
                    }
                    return;
                }
                TLRPC.Document document = j10.document;
                if (document == null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(h10), null));
                        return;
                    }
                    return;
                } else {
                    ic c10 = ic.c(b8.w(document.thumbs, zs.W1, false, null, false), j10.document);
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    imageReceiver.z1 = false;
                    imageReceiver.q0(c10, "120_140", null, null, null, 1);
                    imageReceiver.g1 = new org.telegram.messenger.voip.d0(resultCallback, h10, file, 1);
                    hc.D().M(imageReceiver, null);
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

    public y3(int i10, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i10;
        this.a = false;
        String str = tL_theme.emoticon;
        this.e = str;
        this.c = new yf.b(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        x3 x3Var = new x3();
        x3Var.b = tL_theme;
        x3Var.d = 0;
        arrayList.add(x3Var);
        x3 x3Var2 = new x3();
        x3Var2.b = tL_theme;
        x3Var2.d = 1;
        arrayList.add(x3Var2);
    }

    public y3(int i10, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i10;
        this.a = false;
        this.e = tL_chatThemeUniqueGift.gift.slug;
        this.c = yf.b.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        x3 x3Var = new x3();
        x3Var.c = tL_chatThemeUniqueGift;
        x3Var.d = 0;
        arrayList.add(x3Var);
        x3 x3Var2 = new x3();
        x3Var2.c = tL_chatThemeUniqueGift;
        x3Var2.d = 1;
        arrayList.add(x3Var2);
    }
}
