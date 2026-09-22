package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import ci.s9;
import ci.t9;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class d4 {
    public static final int[] h = {i6.ra, i6.Aa, i6.Oh, i6.Nd, i6.Od, i6.Pd, i6.Qd, i6.Rd};
    public boolean a;
    public boolean b;
    public fg.b c;
    public TLRPC.ChatTheme d;
    public String e;
    public final ArrayList f;
    public final int g;

    public d4(int i10) {
        this.f = new ArrayList();
        this.g = i10;
    }

    public static d4 a(int i10) {
        d4 d4Var = new d4(i10);
        d4Var.e = "❌";
        d4Var.c = fg.b.d("❌");
        d4Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        d4Var.b = true;
        c4 c4Var = new c4();
        c4Var.a = e(true);
        d4Var.f.add(c4Var);
        c4 c4Var2 = new c4();
        c4Var2.a = e(false);
        d4Var.f.add(c4Var2);
        return d4Var;
    }

    public static d4 c(int i10) {
        d4 d4Var = new d4(i10);
        d4Var.e = "🏠";
        d4Var.c = fg.b.d("🏠");
        d4Var.d = TLRPC.ChatTheme.ofEmoticon(d4Var.e);
        c4 c4Var = new c4();
        c4Var.a = i6.N0("Blue");
        c4Var.e = 99;
        d4Var.f.add(c4Var);
        c4 c4Var2 = new c4();
        c4Var2.a = i6.N0("Day");
        c4Var2.e = 9;
        d4Var.f.add(c4Var2);
        c4 c4Var3 = new c4();
        c4Var3.a = i6.N0("Night");
        c4Var3.e = 0;
        d4Var.f.add(c4Var3);
        c4 c4Var4 = new c4();
        c4Var4.a = i6.N0("Dark Blue");
        c4Var4.e = 0;
        d4Var.f.add(c4Var4);
        return d4Var;
    }

    public static d4 d(int i10, TLRPC.TL_theme tL_theme) {
        d4 d4Var = new d4(i10);
        String str = tL_theme.emoticon;
        d4Var.e = str;
        d4Var.c = new fg.b(str, null);
        d4Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i11 = 0; i11 < tL_theme.settings.size(); i11++) {
            c4 c4Var = new c4();
            c4Var.b = tL_theme;
            c4Var.d = i11;
            d4Var.f.add(c4Var);
        }
        return d4Var;
    }

    public static h6 e(boolean z10) {
        h6 A0 = z10 ? i6.J : i6.A0();
        if (z10 != A0.q()) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
            A0 = i6.N0(z10 ? sharedPreferences.getString("lastDarkTheme", "Dark Blue") : sharedPreferences.getString("lastDayTheme", "Blue"));
            if (A0 == null) {
                A0 = i6.N0(z10 ? "Dark Blue" : "Blue");
            }
        }
        return new h6(A0);
    }

    public static int g(SparseIntArray sparseIntArray, int i10) {
        if (sparseIntArray == null) {
            return i6.C0(i10);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i10);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return i6.C0(i10);
    }

    public static void q(h6 h6Var, int i10) {
        SparseArray sparseArray;
        g6 g6Var;
        if (h6Var == null) {
            return;
        }
        if (i10 < 0 || (sparseArray = h6Var.a0) == null || !((g6Var = (g6) sparseArray.get(i10)) == null || g6Var.z)) {
            if (h6Var.m().equals("Blue") && i10 == 99) {
                return;
            }
            if (h6Var.m().equals("Day") && i10 == 9) {
                return;
            }
            if (h6Var.m().equals("Night") && i10 == 0) {
                return;
            }
            if (h6Var.m().equals("Dark Blue") && i10 == 0) {
                return;
            }
            boolean q6 = h6Var.q();
            ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().putString(q6 ? "lastDarkCustomTheme" : "lastDayCustomTheme", h6Var.m()).putInt(q6 ? "lastDarkCustomThemeAccentId" : "lastDayCustomThemeAccentId", i10).apply();
        }
    }

    public final SparseIntArray b(int i10, int i11) {
        g6 g6Var;
        SparseIntArray Q0;
        int indexOfKey;
        h6 h6Var;
        h6 j3 = j(i11);
        ArrayList arrayList = this.f;
        if (j3 == null) {
            int i12 = ((c4) arrayList.get(i11)).d;
            c4 c4Var = (c4) ((fg.a) arrayList.get(i11));
            TLRPC.ThemeSettings b10 = c4Var.b(i12);
            TLRPC.TL_theme tL_theme = ((c4) arrayList.get(i11)).b;
            h6 h6Var2 = new h6(i6.N0(i6.q0(b10)));
            g6Var = h6Var2.e(c4Var.a(), b10, tL_theme, i10, true);
            h6Var2.u(g6Var.a);
            j3 = h6Var2;
        } else {
            SparseArray sparseArray = j3.a0;
            g6Var = sparseArray != null ? (g6) sparseArray.get(((c4) arrayList.get(i11)).e) : null;
        }
        String[] strArr = new String[1];
        if (j3.b != null) {
            Q0 = i6.Q0(new File(j3.b), null, strArr);
        } else {
            String str = j3.d;
            Q0 = str != null ? i6.Q0(null, str, strArr) : new SparseIntArray();
        }
        c4 c4Var2 = (c4) arrayList.get(i11);
        c4Var2.g = strArr[0];
        if (g6Var != null) {
            SparseIntArray clone = Q0.clone();
            g6Var.c(Q0, clone);
            fg.b bVar = this.c;
            if (bVar != null && !TextUtils.isEmpty(bVar.b) && (h6Var = g6Var.b) != null && h6Var.b == null && !h6Var.q()) {
                g6.g(clone);
            }
            Q0 = clone;
        }
        SparseIntArray sparseIntArray = i6.ol;
        for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
            int keyAt = sparseIntArray.keyAt(i13);
            int valueAt = sparseIntArray.valueAt(i13);
            if (Q0.indexOfKey(keyAt) < 0 && (indexOfKey = Q0.indexOfKey(valueAt)) >= 0) {
                Q0.put(keyAt, Q0.valueAt(indexOfKey));
            }
        }
        int[] iArr = i6.nl;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            if (Q0.indexOfKey(i14) < 0) {
                Q0.put(i14, iArr[i14]);
            }
        }
        return Q0;
    }

    public final TLRPC.Document f() {
        TLRPC.ChatTheme chatTheme = this.d;
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return zf.d.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return MediaDataController.getInstance(this.g).getEmojiAnimatedSticker(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray h(int i10, int i11) {
        g6 g6Var;
        SparseIntArray Q0;
        int indexOfKey;
        h6 h6Var;
        g6 g6Var2;
        ArrayList arrayList = this.f;
        SparseIntArray sparseIntArray = ((c4) arrayList.get(i11)).f;
        if (sparseIntArray != null) {
            return sparseIntArray;
        }
        h6 j3 = j(i11);
        if (j3 == null) {
            int i12 = ((c4) arrayList.get(i11)).d;
            fg.a aVar = (fg.a) arrayList.get(i11);
            TLRPC.TL_theme tL_theme = ((c4) arrayList.get(i11)).b;
            h6 N0 = aVar != null ? i6.N0(i6.q0(((c4) aVar).b(i12))) : i6.N0("Blue");
            if (N0 != null) {
                h6 h6Var2 = new h6(N0);
                if (aVar != null) {
                    c4 c4Var = (c4) aVar;
                    g6Var2 = h6Var2.e(c4Var.a(), c4Var.b(i12), tL_theme, i10, true);
                } else {
                    g6Var2 = null;
                }
                if (g6Var2 != null) {
                    h6Var2.u(g6Var2.a);
                }
                g6Var = g6Var2;
                j3 = h6Var2;
            }
            g6Var = null;
        } else {
            SparseArray sparseArray = j3.a0;
            if (sparseArray != null) {
                g6Var = (g6) sparseArray.get(((c4) arrayList.get(i11)).e);
            }
            g6Var = null;
        }
        if (j3 == null) {
            return sparseIntArray;
        }
        String[] strArr = new String[1];
        if (j3.b != null) {
            Q0 = i6.Q0(new File(j3.b), null, strArr);
        } else {
            String str = j3.d;
            Q0 = str != null ? i6.Q0(null, str, strArr) : new SparseIntArray();
        }
        int i13 = 0;
        ((c4) arrayList.get(i11)).g = strArr[0];
        if (g6Var != null) {
            SparseIntArray clone = Q0.clone();
            g6Var.c(Q0, clone);
            fg.b bVar = this.c;
            if (bVar != null && !TextUtils.isEmpty(bVar.b) && (h6Var = g6Var.b) != null && h6Var.b == null && !h6Var.q()) {
                g6.g(clone);
            }
            Q0 = clone;
        }
        SparseIntArray sparseIntArray2 = i6.ol;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        ((c4) arrayList.get(i11)).f = sparseIntArray3;
        while (true) {
            try {
                int[] iArr = h;
                if (i13 >= iArr.length) {
                    return sparseIntArray3;
                }
                int i14 = iArr[i13];
                int indexOfKey2 = Q0.indexOfKey(i14);
                if (indexOfKey2 >= 0) {
                    sparseIntArray3.put(i14, Q0.valueAt(indexOfKey2));
                } else {
                    int i15 = sparseIntArray2.get(i14, -1);
                    if (i15 >= 0 && (indexOfKey = Q0.indexOfKey(i15)) >= 0) {
                        sparseIntArray3.put(i14, Q0.valueAt(indexOfKey));
                    }
                }
                i13++;
            } catch (Exception e) {
                FileLog.e(e);
                return sparseIntArray3;
            }
        }
    }

    public final long i(int i10) {
        return ((c4) this.f.get(i10)).a();
    }

    public final h6 j(int i10) {
        return ((c4) this.f.get(i10)).a;
    }

    public final TLRPC.WallPaper k(int i10) {
        c4 c4Var = (c4) this.f.get(i10);
        TLRPC.ThemeSettings b10 = c4Var.b(c4Var.d);
        if (b10 != null) {
            return b10.wallpaper;
        }
        return null;
    }

    public final void l() {
        h(0, 0);
        h(0, 1);
    }

    public final boolean m() {
        return this.a || this.b;
    }

    public final void n(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i11 >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i11) != null) {
                SparseIntArray h10 = h(i10, i11);
                ((c4) arrayList.get(i11)).h = g(h10, i6.ra);
                ((c4) arrayList.get(i11)).i = g(h10, i6.Aa);
                ((c4) arrayList.get(i11)).j = g(h10, i6.Oh);
                ((c4) arrayList.get(i11)).k = h10.get(i6.Nd, 0);
                ((c4) arrayList.get(i11)).l = h10.get(i6.Od, 0);
                ((c4) arrayList.get(i11)).m = h10.get(i6.Pd, 0);
                ((c4) arrayList.get(i11)).n = h10.get(i6.Qd, 0);
                ((c4) arrayList.get(i11)).o = h10.get(i6.Rd, 0);
                if (((c4) arrayList.get(i11)).a != null && ((c4) arrayList.get(i11)).a.m().equals("Blue")) {
                    if ((((c4) arrayList.get(i11)).e >= 0 ? ((c4) arrayList.get(i11)).e : ((c4) arrayList.get(i11)).a.Y) == 99) {
                        ((c4) arrayList.get(i11)).k = -2368069;
                        ((c4) arrayList.get(i11)).l = -9722489;
                        ((c4) arrayList.get(i11)).m = -2762611;
                        ((c4) arrayList.get(i11)).n = -7817084;
                    }
                }
            }
            i11++;
        }
    }

    public final void o(int i10, ResultCallback resultCallback) {
        TLRPC.WallPaper k10 = k(i10);
        if (k10 == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
                return;
            }
            return;
        }
        long i11 = i(i10);
        long j3 = k10.id;
        s9 s9Var = new s9(resultCallback, i11, 1);
        boolean z10 = k10.pattern;
        int i12 = this.g;
        ChatThemeController.getInstance(i12).loadWallpaperBitmap(j3, z10 ? 1 : 0, new b4(s9Var, k10, z10 ? 1 : 0, i12, j3));
    }

    public final void p(int i10, ResultCallback resultCallback) {
        TLRPC.WallPaper k10 = k(i10);
        if (k10 != null) {
            long i11 = i(i10);
            if (i11 != 0) {
                Bitmap wallpaperThumbBitmap = ChatThemeController.getInstance(this.g).getWallpaperThumbBitmap(i11);
                File file = new File(ApplicationLoader.getFilesDirFixed(), org.telegram.ui.Cells.q3.h(i11, "wallpaper_thumb_", ".png"));
                if (wallpaperThumbBitmap == null && file.exists() && file.length() > 0) {
                    try {
                        wallpaperThumbBitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (wallpaperThumbBitmap != null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(i11), wallpaperThumbBitmap));
                        return;
                    }
                    return;
                }
                TLRPC.Document document = k10.document;
                if (document == null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(i11), null));
                        return;
                    }
                    return;
                } else {
                    ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 140), k10.document);
                    ImageReceiver imageReceiver = new ImageReceiver();
                    imageReceiver.setAllowLoadingOnAttachedOnly(false);
                    imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                    imageReceiver.setDelegate(new t9(resultCallback, i11, file, 2));
                    ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
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

    public d4(int i10, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i10;
        this.a = false;
        String str = tL_theme.emoticon;
        this.e = str;
        this.c = new fg.b(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        c4 c4Var = new c4();
        c4Var.b = tL_theme;
        c4Var.d = 0;
        arrayList.add(c4Var);
        c4 c4Var2 = new c4();
        c4Var2.b = tL_theme;
        c4Var2.d = 1;
        arrayList.add(c4Var2);
    }

    public d4(int i10, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i10;
        this.a = false;
        this.e = tL_chatThemeUniqueGift.gift.slug;
        this.c = fg.b.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        c4 c4Var = new c4();
        c4Var.c = tL_chatThemeUniqueGift;
        c4Var.d = 0;
        arrayList.add(c4Var);
        c4 c4Var2 = new c4();
        c4Var2.c = tL_chatThemeUniqueGift;
        c4Var2.d = 1;
        arrayList.add(c4Var2);
    }
}
