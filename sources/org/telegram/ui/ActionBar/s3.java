package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import fi.f8;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class s3 {
    public static final int[] h = {m6.ra, m6.ob, m6.Ci, m6.Be, m6.Ce, m6.De, m6.Ee, m6.Fe};
    public boolean a;
    public boolean b;
    public ig.b c;
    public TLRPC.ChatTheme d;
    public String e;
    public final ArrayList f;
    public final int g;

    public s3(int i7) {
        this.f = new ArrayList();
        this.g = i7;
    }

    public static s3 a(int i7) {
        s3 s3Var = new s3(i7);
        s3Var.e = "❌";
        s3Var.c = ig.b.d("❌");
        s3Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        s3Var.b = true;
        r3 r3Var = new r3();
        r3Var.a = d(true);
        s3Var.f.add(r3Var);
        r3 r3Var2 = new r3();
        r3Var2.a = d(false);
        s3Var.f.add(r3Var2);
        return s3Var;
    }

    public static s3 b(int i7) {
        s3 s3Var = new s3(i7);
        s3Var.e = "🏠";
        s3Var.c = ig.b.d("🏠");
        s3Var.d = TLRPC.ChatTheme.ofEmoticon(s3Var.e);
        r3 r3Var = new r3();
        r3Var.a = m6.Q0("Blue");
        r3Var.e = 99;
        s3Var.f.add(r3Var);
        r3 r3Var2 = new r3();
        r3Var2.a = m6.Q0("Day");
        r3Var2.e = 9;
        s3Var.f.add(r3Var2);
        r3 r3Var3 = new r3();
        r3Var3.a = m6.Q0("Night");
        r3Var3.e = 0;
        s3Var.f.add(r3Var3);
        r3 r3Var4 = new r3();
        r3Var4.a = m6.Q0("Dark Blue");
        r3Var4.e = 0;
        s3Var.f.add(r3Var4);
        return s3Var;
    }

    public static s3 c(int i7, TLRPC.TL_theme tL_theme) {
        s3 s3Var = new s3(i7);
        String str = tL_theme.emoticon;
        s3Var.e = str;
        s3Var.c = new ig.b(str, null);
        s3Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i10 = 0; i10 < tL_theme.settings.size(); i10++) {
            r3 r3Var = new r3();
            r3Var.b = tL_theme;
            r3Var.d = i10;
            s3Var.f.add(r3Var);
        }
        return s3Var;
    }

    public static l6 d(boolean z9) {
        l6 D0 = z9 ? m6.J : m6.D0();
        if (z9 != D0.q()) {
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
            D0 = m6.Q0(z9 ? sharedPreferences.getString("lastDarkTheme", "Dark Blue") : sharedPreferences.getString("lastDayTheme", "Blue"));
            if (D0 == null) {
                D0 = m6.Q0(z9 ? "Dark Blue" : "Blue");
            }
        }
        return new l6(D0);
    }

    public static int f(SparseIntArray sparseIntArray, int i7) {
        if (sparseIntArray == null) {
            return m6.F0(i7);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i7);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        return m6.F0(i7);
    }

    public static void o(int i7, long j3, TLRPC.WallPaper wallPaper, c20 c20Var) {
        boolean z9 = wallPaper.pattern;
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(i7);
        q3 q3Var = new q3(c20Var, wallPaper, z9 ? 1 : 0, i7, j3);
        if (z9) {
            if (z9) {
                File i10 = org.telegram.messenger.t0.i();
                Locale locale = Locale.US;
                org.telegram.messenger.d4.s.c(new org.telegram.messenger.b4(18, new File(i10, rf.b.h(j3, "pattern_", ".pgm.gz")), q3Var));
                return;
            }
            return;
        }
        org.telegram.messenger.j1 j1Var = new org.telegram.messenger.j1(q3Var, 2);
        if (f10.c == 0) {
            j1Var.onComplete(null);
        } else {
            org.telegram.messenger.d4.s.c(new org.telegram.messenger.b4(25, f10.g(j3), j1Var));
        }
    }

    public static void q(l6 l6Var, int i7) {
        SparseArray sparseArray;
        j6 j6Var;
        if (l6Var == null) {
            return;
        }
        if (i7 < 0 || (sparseArray = l6Var.a0) == null || !((j6Var = (j6) sparseArray.get(i7)) == null || j6Var.z)) {
            if (l6Var.m().equals("Blue") && i7 == 99) {
                return;
            }
            if (l6Var.m().equals("Day") && i7 == 9) {
                return;
            }
            if (l6Var.m().equals("Night") && i7 == 0) {
                return;
            }
            if (l6Var.m().equals("Dark Blue") && i7 == 0) {
                return;
            }
            boolean q10 = l6Var.q();
            org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0).edit().putString(q10 ? "lastDarkCustomTheme" : "lastDayCustomTheme", l6Var.m()).putInt(q10 ? "lastDarkCustomThemeAccentId" : "lastDayCustomThemeAccentId", i7).apply();
        }
    }

    public final TLRPC.Document e() {
        TLRPC.ChatTheme chatTheme = this.d;
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return cg.d.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return ui.b0(this.g).T(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray g(int i7, int i10) {
        j6 j6Var;
        SparseIntArray T0;
        int indexOfKey;
        l6 l6Var;
        j6 j6Var2;
        ArrayList arrayList = this.f;
        SparseIntArray sparseIntArray = ((r3) arrayList.get(i10)).f;
        if (sparseIntArray != null) {
            return sparseIntArray;
        }
        l6 i11 = i(i10);
        if (i11 == null) {
            int i12 = ((r3) arrayList.get(i10)).d;
            ig.a aVar = (ig.a) arrayList.get(i10);
            TLRPC.TL_theme tL_theme = ((r3) arrayList.get(i10)).b;
            l6 Q0 = aVar != null ? m6.Q0(m6.r0(((r3) aVar).b(i12))) : m6.Q0("Blue");
            if (Q0 != null) {
                l6 l6Var2 = new l6(Q0);
                if (aVar != null) {
                    r3 r3Var = (r3) aVar;
                    j6Var2 = l6Var2.e(r3Var.a(), r3Var.b(i12), tL_theme, i7, true);
                } else {
                    j6Var2 = null;
                }
                if (j6Var2 != null) {
                    l6Var2.u(j6Var2.a);
                }
                j6Var = j6Var2;
                i11 = l6Var2;
            }
            j6Var = null;
        } else {
            SparseArray sparseArray = i11.a0;
            if (sparseArray != null) {
                j6Var = (j6) sparseArray.get(((r3) arrayList.get(i10)).e);
            }
            j6Var = null;
        }
        if (i11 == null) {
            return sparseIntArray;
        }
        String[] strArr = new String[1];
        if (i11.b != null) {
            T0 = m6.T0(new File(i11.b), null, strArr);
        } else {
            String str = i11.d;
            T0 = str != null ? m6.T0(null, str, strArr) : new SparseIntArray();
        }
        int i13 = 0;
        ((r3) arrayList.get(i10)).g = strArr[0];
        if (j6Var != null) {
            SparseIntArray clone = T0.clone();
            j6Var.d(T0, clone);
            ig.b bVar = this.c;
            if (bVar != null && !TextUtils.isEmpty(bVar.b) && (l6Var = j6Var.b) != null && l6Var.b == null && !l6Var.q()) {
                j6.h(clone);
            }
            T0 = clone;
        }
        SparseIntArray sparseIntArray2 = m6.fm;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        ((r3) arrayList.get(i10)).f = sparseIntArray3;
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
        return ((r3) this.f.get(i7)).a();
    }

    public final l6 i(int i7) {
        return ((r3) this.f.get(i7)).a;
    }

    public final TLRPC.WallPaper j(int i7) {
        r3 r3Var = (r3) this.f.get(i7);
        TLRPC.ThemeSettings b10 = r3Var.b(r3Var.d);
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
                ((r3) arrayList.get(i10)).h = f(g10, m6.ra);
                ((r3) arrayList.get(i10)).i = f(g10, m6.ob);
                ((r3) arrayList.get(i10)).j = f(g10, m6.Ci);
                ((r3) arrayList.get(i10)).k = g10.get(m6.Be, 0);
                ((r3) arrayList.get(i10)).l = g10.get(m6.Ce, 0);
                ((r3) arrayList.get(i10)).m = g10.get(m6.De, 0);
                ((r3) arrayList.get(i10)).n = g10.get(m6.Ee, 0);
                ((r3) arrayList.get(i10)).o = g10.get(m6.Fe, 0);
                if (((r3) arrayList.get(i10)).a != null && ((r3) arrayList.get(i10)).a.m().equals("Blue")) {
                    if ((((r3) arrayList.get(i10)).e >= 0 ? ((r3) arrayList.get(i10)).e : ((r3) arrayList.get(i10)).a.Y) == 99) {
                        ((r3) arrayList.get(i10)).k = -2368069;
                        ((r3) arrayList.get(i10)).l = -9722489;
                        ((r3) arrayList.get(i10)).m = -2762611;
                        ((r3) arrayList.get(i10)).n = -7817084;
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
            o(this.g, j3.id, j3, new f8(resultCallback, h7, 1));
        }
    }

    public final void p(int i7, ResultCallback resultCallback) {
        TLRPC.WallPaper j3 = j(i7);
        if (j3 != null) {
            long h7 = h(i7);
            if (h7 != 0) {
                Bitmap bitmap = (Bitmap) org.telegram.messenger.d4.f(this.g).a.get(Long.valueOf(h7));
                File file = new File(org.telegram.messenger.t0.h(), rf.b.h(h7, "wallpaper_thumb_", ".png"));
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
                    hc c10 = hc.c(w7.w(document.thumbs, qs.W1, false, null, false), j3.document);
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    imageReceiver.z1 = false;
                    imageReceiver.q0(c10, "120_140", null, null, null, 1);
                    imageReceiver.g1 = new bi.i(resultCallback, h7, file, 4);
                    gc.D().M(imageReceiver, null);
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

    public s3(int i7, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i7;
        this.a = false;
        String str = tL_theme.emoticon;
        this.e = str;
        this.c = new ig.b(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        r3 r3Var = new r3();
        r3Var.b = tL_theme;
        r3Var.d = 0;
        arrayList.add(r3Var);
        r3 r3Var2 = new r3();
        r3Var2.b = tL_theme;
        r3Var2.d = 1;
        arrayList.add(r3Var2);
    }

    public s3(int i7, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i7;
        this.a = false;
        this.e = tL_chatThemeUniqueGift.gift.slug;
        this.c = ig.b.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        r3 r3Var = new r3();
        r3Var.c = tL_chatThemeUniqueGift;
        r3Var.d = 0;
        arrayList.add(r3Var);
        r3 r3Var2 = new r3();
        r3Var2.c = tL_chatThemeUniqueGift;
        r3Var2.d = 1;
        arrayList.add(r3Var2);
    }
}
