package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import ci.p9;
import ci.q9;
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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class b4 {
    public static final int[] h = {h6.ra, h6.Aa, h6.Oh, h6.Nd, h6.Od, h6.Pd, h6.Qd, h6.Rd};
    public boolean a;
    public boolean b;
    public fg.b c;
    public TLRPC.ChatTheme d;
    public String e;
    public final ArrayList f;
    public final int g;

    public b4(int i10) {
        this.f = new ArrayList();
        this.g = i10;
    }

    public static b4 a(int i10) {
        b4 b4Var = new b4(i10);
        b4Var.e = "❌";
        b4Var.c = fg.b.d("❌");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        b4Var.b = true;
        a4 a4Var = new a4();
        a4Var.a = e(true);
        b4Var.f.add(a4Var);
        a4 a4Var2 = new a4();
        a4Var2.a = e(false);
        b4Var.f.add(a4Var2);
        return b4Var;
    }

    public static b4 c(int i10) {
        b4 b4Var = new b4(i10);
        b4Var.e = "🏠";
        b4Var.c = fg.b.d("🏠");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.e);
        a4 a4Var = new a4();
        a4Var.a = h6.N0("Blue");
        a4Var.e = 99;
        b4Var.f.add(a4Var);
        a4 a4Var2 = new a4();
        a4Var2.a = h6.N0("Day");
        a4Var2.e = 9;
        b4Var.f.add(a4Var2);
        a4 a4Var3 = new a4();
        a4Var3.a = h6.N0("Night");
        a4Var3.e = 0;
        b4Var.f.add(a4Var3);
        a4 a4Var4 = new a4();
        a4Var4.a = h6.N0("Dark Blue");
        a4Var4.e = 0;
        b4Var.f.add(a4Var4);
        return b4Var;
    }

    public static b4 d(int i10, TLRPC.TL_theme tL_theme) {
        b4 b4Var = new b4(i10);
        String str = tL_theme.emoticon;
        b4Var.e = str;
        b4Var.c = new fg.b(str, null);
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i11 = 0; i11 < tL_theme.settings.size(); i11++) {
            a4 a4Var = new a4();
            a4Var.b = tL_theme;
            a4Var.d = i11;
            b4Var.f.add(a4Var);
        }
        return b4Var;
    }

    public static g6 e(boolean z10) {
        g6 A0 = z10 ? h6.J : h6.A0();
        if (z10 != A0.q()) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
            A0 = h6.N0(z10 ? sharedPreferences.getString("lastDarkTheme", "Dark Blue") : sharedPreferences.getString("lastDayTheme", "Blue"));
            if (A0 == null) {
                A0 = h6.N0(z10 ? "Dark Blue" : "Blue");
            }
        }
        return new g6(A0);
    }

    public static int g(SparseIntArray sparseIntArray, int i10) {
        if (sparseIntArray == null) {
            return h6.C0(i10);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i10);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return h6.C0(i10);
    }

    public static void q(g6 g6Var, int i10) {
        SparseArray sparseArray;
        f6 f6Var;
        if (g6Var == null) {
            return;
        }
        if (i10 < 0 || (sparseArray = g6Var.a0) == null || !((f6Var = (f6) sparseArray.get(i10)) == null || f6Var.z)) {
            if (g6Var.m().equals("Blue") && i10 == 99) {
                return;
            }
            if (g6Var.m().equals("Day") && i10 == 9) {
                return;
            }
            if (g6Var.m().equals("Night") && i10 == 0) {
                return;
            }
            if (g6Var.m().equals("Dark Blue") && i10 == 0) {
                return;
            }
            boolean q6 = g6Var.q();
            ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().putString(q6 ? "lastDarkCustomTheme" : "lastDayCustomTheme", g6Var.m()).putInt(q6 ? "lastDarkCustomThemeAccentId" : "lastDayCustomThemeAccentId", i10).apply();
        }
    }

    public final SparseIntArray b(int i10, int i11) {
        f6 f6Var;
        SparseIntArray Q0;
        int indexOfKey;
        g6 g6Var;
        g6 j3 = j(i11);
        ArrayList arrayList = this.f;
        if (j3 == null) {
            int i12 = ((a4) arrayList.get(i11)).d;
            a4 a4Var = (a4) ((fg.a) arrayList.get(i11));
            TLRPC.ThemeSettings b10 = a4Var.b(i12);
            TLRPC.TL_theme tL_theme = ((a4) arrayList.get(i11)).b;
            g6 g6Var2 = new g6(h6.N0(h6.q0(b10)));
            f6Var = g6Var2.e(a4Var.a(), b10, tL_theme, i10, true);
            g6Var2.u(f6Var.a);
            j3 = g6Var2;
        } else {
            SparseArray sparseArray = j3.a0;
            f6Var = sparseArray != null ? (f6) sparseArray.get(((a4) arrayList.get(i11)).e) : null;
        }
        String[] strArr = new String[1];
        if (j3.b != null) {
            Q0 = h6.Q0(new File(j3.b), null, strArr);
        } else {
            String str = j3.d;
            Q0 = str != null ? h6.Q0(null, str, strArr) : new SparseIntArray();
        }
        a4 a4Var2 = (a4) arrayList.get(i11);
        a4Var2.g = strArr[0];
        if (f6Var != null) {
            SparseIntArray clone = Q0.clone();
            f6Var.c(Q0, clone);
            fg.b bVar = this.c;
            if (bVar != null && !TextUtils.isEmpty(bVar.b) && (g6Var = f6Var.b) != null && g6Var.b == null && !g6Var.q()) {
                f6.g(clone);
            }
            Q0 = clone;
        }
        SparseIntArray sparseIntArray = h6.ol;
        for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
            int keyAt = sparseIntArray.keyAt(i13);
            int valueAt = sparseIntArray.valueAt(i13);
            if (Q0.indexOfKey(keyAt) < 0 && (indexOfKey = Q0.indexOfKey(valueAt)) >= 0) {
                Q0.put(keyAt, Q0.valueAt(indexOfKey));
            }
        }
        int[] iArr = h6.nl;
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
        f6 f6Var;
        SparseIntArray Q0;
        int indexOfKey;
        g6 g6Var;
        f6 f6Var2;
        ArrayList arrayList = this.f;
        SparseIntArray sparseIntArray = ((a4) arrayList.get(i11)).f;
        if (sparseIntArray != null) {
            return sparseIntArray;
        }
        g6 j3 = j(i11);
        if (j3 == null) {
            int i12 = ((a4) arrayList.get(i11)).d;
            fg.a aVar = (fg.a) arrayList.get(i11);
            TLRPC.TL_theme tL_theme = ((a4) arrayList.get(i11)).b;
            g6 N0 = aVar != null ? h6.N0(h6.q0(((a4) aVar).b(i12))) : h6.N0("Blue");
            if (N0 != null) {
                g6 g6Var2 = new g6(N0);
                if (aVar != null) {
                    a4 a4Var = (a4) aVar;
                    f6Var2 = g6Var2.e(a4Var.a(), a4Var.b(i12), tL_theme, i10, true);
                } else {
                    f6Var2 = null;
                }
                if (f6Var2 != null) {
                    g6Var2.u(f6Var2.a);
                }
                f6Var = f6Var2;
                j3 = g6Var2;
            }
            f6Var = null;
        } else {
            SparseArray sparseArray = j3.a0;
            if (sparseArray != null) {
                f6Var = (f6) sparseArray.get(((a4) arrayList.get(i11)).e);
            }
            f6Var = null;
        }
        if (j3 == null) {
            return sparseIntArray;
        }
        String[] strArr = new String[1];
        if (j3.b != null) {
            Q0 = h6.Q0(new File(j3.b), null, strArr);
        } else {
            String str = j3.d;
            Q0 = str != null ? h6.Q0(null, str, strArr) : new SparseIntArray();
        }
        int i13 = 0;
        ((a4) arrayList.get(i11)).g = strArr[0];
        if (f6Var != null) {
            SparseIntArray clone = Q0.clone();
            f6Var.c(Q0, clone);
            fg.b bVar = this.c;
            if (bVar != null && !TextUtils.isEmpty(bVar.b) && (g6Var = f6Var.b) != null && g6Var.b == null && !g6Var.q()) {
                f6.g(clone);
            }
            Q0 = clone;
        }
        SparseIntArray sparseIntArray2 = h6.ol;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        ((a4) arrayList.get(i11)).f = sparseIntArray3;
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
        return ((a4) this.f.get(i10)).a();
    }

    public final g6 j(int i10) {
        return ((a4) this.f.get(i10)).a;
    }

    public final TLRPC.WallPaper k(int i10) {
        a4 a4Var = (a4) this.f.get(i10);
        TLRPC.ThemeSettings b10 = a4Var.b(a4Var.d);
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
                ((a4) arrayList.get(i11)).h = g(h10, h6.ra);
                ((a4) arrayList.get(i11)).i = g(h10, h6.Aa);
                ((a4) arrayList.get(i11)).j = g(h10, h6.Oh);
                ((a4) arrayList.get(i11)).k = h10.get(h6.Nd, 0);
                ((a4) arrayList.get(i11)).l = h10.get(h6.Od, 0);
                ((a4) arrayList.get(i11)).m = h10.get(h6.Pd, 0);
                ((a4) arrayList.get(i11)).n = h10.get(h6.Qd, 0);
                ((a4) arrayList.get(i11)).o = h10.get(h6.Rd, 0);
                if (((a4) arrayList.get(i11)).a != null && ((a4) arrayList.get(i11)).a.m().equals("Blue")) {
                    if ((((a4) arrayList.get(i11)).e >= 0 ? ((a4) arrayList.get(i11)).e : ((a4) arrayList.get(i11)).a.Y) == 99) {
                        ((a4) arrayList.get(i11)).k = -2368069;
                        ((a4) arrayList.get(i11)).l = -9722489;
                        ((a4) arrayList.get(i11)).m = -2762611;
                        ((a4) arrayList.get(i11)).n = -7817084;
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
        p9 p9Var = new p9(resultCallback, i11, 1);
        boolean z10 = k10.pattern;
        int i12 = this.g;
        ChatThemeController.getInstance(i12).loadWallpaperBitmap(j3, z10 ? 1 : 0, new z3(p9Var, k10, z10 ? 1 : 0, i12, j3));
    }

    public final void p(int i10, ResultCallback resultCallback) {
        TLRPC.WallPaper k10 = k(i10);
        if (k10 != null) {
            long i11 = i(i10);
            if (i11 != 0) {
                Bitmap wallpaperThumbBitmap = ChatThemeController.getInstance(this.g).getWallpaperThumbBitmap(i11);
                File file = new File(ApplicationLoader.getFilesDirFixed(), org.telegram.ui.Cells.c1.j(i11, "wallpaper_thumb_", ".png"));
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
                    imageReceiver.setDelegate(new q9(resultCallback, i11, file, 2));
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

    public b4(int i10, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i10;
        this.a = false;
        String str = tL_theme.emoticon;
        this.e = str;
        this.c = new fg.b(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        a4 a4Var = new a4();
        a4Var.b = tL_theme;
        a4Var.d = 0;
        arrayList.add(a4Var);
        a4 a4Var2 = new a4();
        a4Var2.b = tL_theme;
        a4Var2.d = 1;
        arrayList.add(a4Var2);
    }

    public b4(int i10, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i10;
        this.a = false;
        this.e = tL_chatThemeUniqueGift.gift.slug;
        this.c = fg.b.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        a4 a4Var = new a4();
        a4Var.c = tL_chatThemeUniqueGift;
        a4Var.d = 0;
        arrayList.add(a4Var);
        a4 a4Var2 = new a4();
        a4Var2.c = tL_chatThemeUniqueGift;
        a4Var2.d = 1;
        arrayList.add(a4Var2);
    }
}
