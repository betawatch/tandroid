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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class r3 {
    public static final int[] h = {k6.ra, k6.ob, k6.Ci, k6.Be, k6.Ce, k6.De, k6.Ee, k6.Fe};
    public boolean a;
    public boolean b;
    public ig.b c;
    public TLRPC.ChatTheme d;
    public String e;
    public final ArrayList f;
    public final int g;

    public r3(int i7) {
        this.f = new ArrayList();
        this.g = i7;
    }

    public static r3 a(int i7) {
        r3 r3Var = new r3(i7);
        r3Var.e = "❌";
        r3Var.c = ig.b.d("❌");
        r3Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        r3Var.b = true;
        q3 q3Var = new q3();
        q3Var.a = d(true);
        r3Var.f.add(q3Var);
        q3 q3Var2 = new q3();
        q3Var2.a = d(false);
        r3Var.f.add(q3Var2);
        return r3Var;
    }

    public static r3 b(int i7) {
        r3 r3Var = new r3(i7);
        r3Var.e = "🏠";
        r3Var.c = ig.b.d("🏠");
        r3Var.d = TLRPC.ChatTheme.ofEmoticon(r3Var.e);
        q3 q3Var = new q3();
        q3Var.a = k6.Q0("Blue");
        q3Var.e = 99;
        r3Var.f.add(q3Var);
        q3 q3Var2 = new q3();
        q3Var2.a = k6.Q0("Day");
        q3Var2.e = 9;
        r3Var.f.add(q3Var2);
        q3 q3Var3 = new q3();
        q3Var3.a = k6.Q0("Night");
        q3Var3.e = 0;
        r3Var.f.add(q3Var3);
        q3 q3Var4 = new q3();
        q3Var4.a = k6.Q0("Dark Blue");
        q3Var4.e = 0;
        r3Var.f.add(q3Var4);
        return r3Var;
    }

    public static r3 c(int i7, TLRPC.TL_theme tL_theme) {
        r3 r3Var = new r3(i7);
        String str = tL_theme.emoticon;
        r3Var.e = str;
        r3Var.c = new ig.b(str, null);
        r3Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i10 = 0; i10 < tL_theme.settings.size(); i10++) {
            q3 q3Var = new q3();
            q3Var.b = tL_theme;
            q3Var.d = i10;
            r3Var.f.add(q3Var);
        }
        return r3Var;
    }

    public static j6 d(boolean z9) {
        j6 D0 = z9 ? k6.J : k6.D0();
        if (z9 != D0.q()) {
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
            D0 = k6.Q0(z9 ? sharedPreferences.getString("lastDarkTheme", "Dark Blue") : sharedPreferences.getString("lastDayTheme", "Blue"));
            if (D0 == null) {
                D0 = k6.Q0(z9 ? "Dark Blue" : "Blue");
            }
        }
        return new j6(D0);
    }

    public static int f(SparseIntArray sparseIntArray, int i7) {
        if (sparseIntArray == null) {
            return k6.F0(i7);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i7);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        return k6.F0(i7);
    }

    public static void o(int i7, long j3, TLRPC.WallPaper wallPaper, c20 c20Var) {
        boolean z9 = wallPaper.pattern;
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(i7);
        p3 p3Var = new p3(c20Var, wallPaper, z9 ? 1 : 0, i7, j3);
        if (z9) {
            if (z9) {
                File i10 = org.telegram.messenger.t0.i();
                Locale locale = Locale.US;
                org.telegram.messenger.d4.s.c(new org.telegram.messenger.b4(18, new File(i10, rf.b.h(j3, "pattern_", ".pgm.gz")), p3Var));
                return;
            }
            return;
        }
        org.telegram.messenger.p1 p1Var = new org.telegram.messenger.p1(p3Var, 2);
        if (f10.c == 0) {
            p1Var.onComplete(null);
        } else {
            org.telegram.messenger.d4.s.c(new org.telegram.messenger.b4(25, f10.g(j3), p1Var));
        }
    }

    public static void q(j6 j6Var, int i7) {
        SparseArray sparseArray;
        h6 h6Var;
        if (j6Var == null) {
            return;
        }
        if (i7 < 0 || (sparseArray = j6Var.a0) == null || !((h6Var = (h6) sparseArray.get(i7)) == null || h6Var.z)) {
            if (j6Var.m().equals("Blue") && i7 == 99) {
                return;
            }
            if (j6Var.m().equals("Day") && i7 == 9) {
                return;
            }
            if (j6Var.m().equals("Night") && i7 == 0) {
                return;
            }
            if (j6Var.m().equals("Dark Blue") && i7 == 0) {
                return;
            }
            boolean q10 = j6Var.q();
            org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0).edit().putString(q10 ? "lastDarkCustomTheme" : "lastDayCustomTheme", j6Var.m()).putInt(q10 ? "lastDarkCustomThemeAccentId" : "lastDayCustomThemeAccentId", i7).apply();
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
        h6 h6Var;
        SparseIntArray T0;
        int indexOfKey;
        j6 j6Var;
        h6 h6Var2;
        ArrayList arrayList = this.f;
        SparseIntArray sparseIntArray = ((q3) arrayList.get(i10)).f;
        if (sparseIntArray != null) {
            return sparseIntArray;
        }
        j6 i11 = i(i10);
        if (i11 == null) {
            int i12 = ((q3) arrayList.get(i10)).d;
            ig.a aVar = (ig.a) arrayList.get(i10);
            TLRPC.TL_theme tL_theme = ((q3) arrayList.get(i10)).b;
            j6 Q0 = aVar != null ? k6.Q0(k6.r0(((q3) aVar).b(i12))) : k6.Q0("Blue");
            if (Q0 != null) {
                j6 j6Var2 = new j6(Q0);
                if (aVar != null) {
                    q3 q3Var = (q3) aVar;
                    h6Var2 = j6Var2.e(q3Var.a(), q3Var.b(i12), tL_theme, i7, true);
                } else {
                    h6Var2 = null;
                }
                if (h6Var2 != null) {
                    j6Var2.u(h6Var2.a);
                }
                h6Var = h6Var2;
                i11 = j6Var2;
            }
            h6Var = null;
        } else {
            SparseArray sparseArray = i11.a0;
            if (sparseArray != null) {
                h6Var = (h6) sparseArray.get(((q3) arrayList.get(i10)).e);
            }
            h6Var = null;
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
        ((q3) arrayList.get(i10)).g = strArr[0];
        if (h6Var != null) {
            SparseIntArray clone = T0.clone();
            h6Var.d(T0, clone);
            ig.b bVar = this.c;
            if (bVar != null && !TextUtils.isEmpty(bVar.b) && (j6Var = h6Var.b) != null && j6Var.b == null && !j6Var.q()) {
                h6.h(clone);
            }
            T0 = clone;
        }
        SparseIntArray sparseIntArray2 = k6.fm;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        ((q3) arrayList.get(i10)).f = sparseIntArray3;
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
        return ((q3) this.f.get(i7)).a();
    }

    public final j6 i(int i7) {
        return ((q3) this.f.get(i7)).a;
    }

    public final TLRPC.WallPaper j(int i7) {
        q3 q3Var = (q3) this.f.get(i7);
        TLRPC.ThemeSettings b10 = q3Var.b(q3Var.d);
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
                ((q3) arrayList.get(i10)).h = f(g10, k6.ra);
                ((q3) arrayList.get(i10)).i = f(g10, k6.ob);
                ((q3) arrayList.get(i10)).j = f(g10, k6.Ci);
                ((q3) arrayList.get(i10)).k = g10.get(k6.Be, 0);
                ((q3) arrayList.get(i10)).l = g10.get(k6.Ce, 0);
                ((q3) arrayList.get(i10)).m = g10.get(k6.De, 0);
                ((q3) arrayList.get(i10)).n = g10.get(k6.Ee, 0);
                ((q3) arrayList.get(i10)).o = g10.get(k6.Fe, 0);
                if (((q3) arrayList.get(i10)).a != null && ((q3) arrayList.get(i10)).a.m().equals("Blue")) {
                    if ((((q3) arrayList.get(i10)).e >= 0 ? ((q3) arrayList.get(i10)).e : ((q3) arrayList.get(i10)).a.Y) == 99) {
                        ((q3) arrayList.get(i10)).k = -2368069;
                        ((q3) arrayList.get(i10)).l = -9722489;
                        ((q3) arrayList.get(i10)).m = -2762611;
                        ((q3) arrayList.get(i10)).n = -7817084;
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

    public r3(int i7, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i7;
        this.a = false;
        String str = tL_theme.emoticon;
        this.e = str;
        this.c = new ig.b(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        q3 q3Var = new q3();
        q3Var.b = tL_theme;
        q3Var.d = 0;
        arrayList.add(q3Var);
        q3 q3Var2 = new q3();
        q3Var2.b = tL_theme;
        q3Var2.d = 1;
        arrayList.add(q3Var2);
    }

    public r3(int i7, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i7;
        this.a = false;
        this.e = tL_chatThemeUniqueGift.gift.slug;
        this.c = ig.b.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        q3 q3Var = new q3();
        q3Var.c = tL_chatThemeUniqueGift;
        q3Var.d = 0;
        arrayList.add(q3Var);
        q3 q3Var2 = new q3();
        q3Var2.c = tL_chatThemeUniqueGift;
        q3Var2.d = 1;
        arrayList.add(q3Var2);
    }
}
