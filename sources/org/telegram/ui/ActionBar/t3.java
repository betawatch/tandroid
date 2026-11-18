package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import hi.d8;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.ec;
import org.telegram.messenger.fc;
import org.telegram.messenger.ks;
import org.telegram.messenger.ri;
import org.telegram.messenger.w7;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class t3 {
    public static final int[] h = {n6.ra, n6.rb, n6.Fi, n6.Ee, n6.Fe, n6.Ge, n6.He, n6.Ie};
    public boolean a;
    public boolean b;
    public ig.b c;
    public TLRPC.ChatTheme d;
    public String e;
    public final ArrayList f;
    public final int g;

    public t3(int i7) {
        this.f = new ArrayList();
        this.g = i7;
    }

    public static t3 a(int i7) {
        t3 t3Var = new t3(i7);
        t3Var.e = "❌";
        t3Var.c = ig.b.d("❌");
        t3Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        t3Var.b = true;
        s3 s3Var = new s3();
        s3Var.a = d(true);
        t3Var.f.add(s3Var);
        s3 s3Var2 = new s3();
        s3Var2.a = d(false);
        t3Var.f.add(s3Var2);
        return t3Var;
    }

    public static t3 b(int i7) {
        t3 t3Var = new t3(i7);
        t3Var.e = "🏠";
        t3Var.c = ig.b.d("🏠");
        t3Var.d = TLRPC.ChatTheme.ofEmoticon(t3Var.e);
        s3 s3Var = new s3();
        s3Var.a = n6.Q0("Blue");
        s3Var.e = 99;
        t3Var.f.add(s3Var);
        s3 s3Var2 = new s3();
        s3Var2.a = n6.Q0("Day");
        s3Var2.e = 9;
        t3Var.f.add(s3Var2);
        s3 s3Var3 = new s3();
        s3Var3.a = n6.Q0("Night");
        s3Var3.e = 0;
        t3Var.f.add(s3Var3);
        s3 s3Var4 = new s3();
        s3Var4.a = n6.Q0("Dark Blue");
        s3Var4.e = 0;
        t3Var.f.add(s3Var4);
        return t3Var;
    }

    public static t3 c(int i7, TLRPC.TL_theme tL_theme) {
        t3 t3Var = new t3(i7);
        String str = tL_theme.emoticon;
        t3Var.e = str;
        t3Var.c = new ig.b(str, null);
        t3Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i10 = 0; i10 < tL_theme.settings.size(); i10++) {
            s3 s3Var = new s3();
            s3Var.b = tL_theme;
            s3Var.d = i10;
            t3Var.f.add(s3Var);
        }
        return t3Var;
    }

    public static m6 d(boolean z10) {
        m6 D0 = z10 ? n6.J : n6.D0();
        if (z10 != D0.q()) {
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
            D0 = n6.Q0(z10 ? sharedPreferences.getString("lastDarkTheme", "Dark Blue") : sharedPreferences.getString("lastDayTheme", "Blue"));
            if (D0 == null) {
                D0 = n6.Q0(z10 ? "Dark Blue" : "Blue");
            }
        }
        return new m6(D0);
    }

    public static int f(SparseIntArray sparseIntArray, int i7) {
        if (sparseIntArray == null) {
            return n6.F0(i7);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i7);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        return n6.F0(i7);
    }

    public static void o(int i7, long j3, TLRPC.WallPaper wallPaper, x10 x10Var) {
        boolean z10 = wallPaper.pattern;
        org.telegram.messenger.f4 f10 = org.telegram.messenger.f4.f(i7);
        r3 r3Var = new r3(x10Var, wallPaper, z10 ? 1 : 0, i7, j3);
        if (z10) {
            if (z10) {
                File i10 = org.telegram.messenger.t0.i();
                Locale locale = Locale.US;
                org.telegram.messenger.f4.s.c(new org.telegram.messenger.w3(18, new File(i10, p5.c.j(j3, "pattern_", ".pgm.gz")), r3Var));
                return;
            }
            return;
        }
        org.telegram.messenger.j1 j1Var = new org.telegram.messenger.j1(r3Var, 2);
        if (f10.c == 0) {
            j1Var.onComplete(null);
        } else {
            org.telegram.messenger.f4.s.c(new org.telegram.messenger.w3(25, f10.g(j3), j1Var));
        }
    }

    public static void q(m6 m6Var, int i7) {
        SparseArray sparseArray;
        k6 k6Var;
        if (m6Var == null) {
            return;
        }
        if (i7 < 0 || (sparseArray = m6Var.b0) == null || !((k6Var = (k6) sparseArray.get(i7)) == null || k6Var.z)) {
            if (m6Var.m().equals("Blue") && i7 == 99) {
                return;
            }
            if (m6Var.m().equals("Day") && i7 == 9) {
                return;
            }
            if (m6Var.m().equals("Night") && i7 == 0) {
                return;
            }
            if (m6Var.m().equals("Dark Blue") && i7 == 0) {
                return;
            }
            boolean q10 = m6Var.q();
            org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0).edit().putString(q10 ? "lastDarkCustomTheme" : "lastDayCustomTheme", m6Var.m()).putInt(q10 ? "lastDarkCustomThemeAccentId" : "lastDayCustomThemeAccentId", i7).apply();
        }
    }

    public final TLRPC.Document e() {
        TLRPC.ChatTheme chatTheme = this.d;
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return cg.d.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return ri.d0(this.g).V(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray g(int i7, int i10) {
        k6 k6Var;
        SparseIntArray T0;
        int indexOfKey;
        m6 m6Var;
        k6 k6Var2;
        ArrayList arrayList = this.f;
        SparseIntArray sparseIntArray = ((s3) arrayList.get(i10)).f;
        if (sparseIntArray != null) {
            return sparseIntArray;
        }
        m6 i11 = i(i10);
        if (i11 == null) {
            int i12 = ((s3) arrayList.get(i10)).d;
            ig.a aVar = (ig.a) arrayList.get(i10);
            TLRPC.TL_theme tL_theme = ((s3) arrayList.get(i10)).b;
            m6 Q0 = aVar != null ? n6.Q0(n6.r0(((s3) aVar).b(i12))) : n6.Q0("Blue");
            if (Q0 != null) {
                m6 m6Var2 = new m6(Q0);
                if (aVar != null) {
                    s3 s3Var = (s3) aVar;
                    k6Var2 = m6Var2.e(s3Var.a(), s3Var.b(i12), tL_theme, i7, true);
                } else {
                    k6Var2 = null;
                }
                if (k6Var2 != null) {
                    m6Var2.u(k6Var2.a);
                }
                k6Var = k6Var2;
                i11 = m6Var2;
            }
            k6Var = null;
        } else {
            SparseArray sparseArray = i11.b0;
            if (sparseArray != null) {
                k6Var = (k6) sparseArray.get(((s3) arrayList.get(i10)).e);
            }
            k6Var = null;
        }
        if (i11 == null) {
            return sparseIntArray;
        }
        String[] strArr = new String[1];
        if (i11.b != null) {
            T0 = n6.T0(new File(i11.b), null, strArr);
        } else {
            String str = i11.d;
            T0 = str != null ? n6.T0(null, str, strArr) : new SparseIntArray();
        }
        int i13 = 0;
        ((s3) arrayList.get(i10)).g = strArr[0];
        if (k6Var != null) {
            SparseIntArray clone = T0.clone();
            k6Var.d(T0, clone);
            ig.b bVar = this.c;
            if (bVar != null && !TextUtils.isEmpty(bVar.b) && (m6Var = k6Var.b) != null && m6Var.b == null && !m6Var.q()) {
                k6.h(clone);
            }
            T0 = clone;
        }
        SparseIntArray sparseIntArray2 = n6.im;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        ((s3) arrayList.get(i10)).f = sparseIntArray3;
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

    public final long h(int i7) {
        return ((s3) this.f.get(i7)).a();
    }

    public final m6 i(int i7) {
        return ((s3) this.f.get(i7)).a;
    }

    public final TLRPC.WallPaper j(int i7) {
        s3 s3Var = (s3) this.f.get(i7);
        TLRPC.ThemeSettings b10 = s3Var.b(s3Var.d);
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

    public final void m(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i10) != null) {
                SparseIntArray g10 = g(i7, i10);
                ((s3) arrayList.get(i10)).h = f(g10, n6.ra);
                ((s3) arrayList.get(i10)).i = f(g10, n6.rb);
                ((s3) arrayList.get(i10)).j = f(g10, n6.Fi);
                ((s3) arrayList.get(i10)).k = g10.get(n6.Ee, 0);
                ((s3) arrayList.get(i10)).l = g10.get(n6.Fe, 0);
                ((s3) arrayList.get(i10)).m = g10.get(n6.Ge, 0);
                ((s3) arrayList.get(i10)).n = g10.get(n6.He, 0);
                ((s3) arrayList.get(i10)).o = g10.get(n6.Ie, 0);
                if (((s3) arrayList.get(i10)).a != null && ((s3) arrayList.get(i10)).a.m().equals("Blue")) {
                    if ((((s3) arrayList.get(i10)).e >= 0 ? ((s3) arrayList.get(i10)).e : ((s3) arrayList.get(i10)).a.Z) == 99) {
                        ((s3) arrayList.get(i10)).k = -2368069;
                        ((s3) arrayList.get(i10)).l = -9722489;
                        ((s3) arrayList.get(i10)).m = -2762611;
                        ((s3) arrayList.get(i10)).n = -7817084;
                    }
                }
            }
            i10++;
        }
    }

    public final void n(int i7, ResultCallback resultCallback) {
        TLRPC.WallPaper j3 = j(i7);
        if (j3 == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
            }
        } else {
            long h7 = h(i7);
            o(this.g, j3.id, j3, new d8(resultCallback, h7, 2));
        }
    }

    public final void p(int i7, ResultCallback resultCallback) {
        TLRPC.WallPaper j3 = j(i7);
        if (j3 != null) {
            long h7 = h(i7);
            if (h7 != 0) {
                Bitmap bitmap = (Bitmap) org.telegram.messenger.f4.f(this.g).a.get(Long.valueOf(h7));
                File file = new File(org.telegram.messenger.t0.h(), p5.c.j(h7, "wallpaper_thumb_", ".png"));
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
                TLRPC.Document document = j3.document;
                if (document == null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(h7), null));
                        return;
                    }
                    return;
                } else {
                    fc c10 = fc.c(w7.w(document.thumbs, ks.W1, false, null, false), j3.document);
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    imageReceiver.A1 = false;
                    imageReceiver.q0(c10, "120_140", null, null, null, 1);
                    imageReceiver.h1 = new di.h(resultCallback, h7, file, 5);
                    ec.D().M(imageReceiver, null);
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

    public t3(int i7, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i7;
        this.a = false;
        String str = tL_theme.emoticon;
        this.e = str;
        this.c = new ig.b(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        s3 s3Var = new s3();
        s3Var.b = tL_theme;
        s3Var.d = 0;
        arrayList.add(s3Var);
        s3 s3Var2 = new s3();
        s3Var2.b = tL_theme;
        s3Var2.d = 1;
        arrayList.add(s3Var2);
    }

    public t3(int i7, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i7;
        this.a = false;
        this.e = tL_chatThemeUniqueGift.gift.slug;
        this.c = ig.b.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        s3 s3Var = new s3();
        s3Var.c = tL_chatThemeUniqueGift;
        s3Var.d = 0;
        arrayList.add(s3Var);
        s3 s3Var2 = new s3();
        s3Var2.c = tL_chatThemeUniqueGift;
        s3Var2.d = 1;
        arrayList.add(s3Var2);
    }
}
