package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import fi.y8;
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
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class h4 {
    public static final int[] h = {y6.ra, y6.Aa, y6.Oh, y6.Nd, y6.Od, y6.Pd, y6.Qd, y6.Rd};
    public boolean a;
    public boolean b;
    public hg.b c;
    public TLRPC.ChatTheme d;
    public String e;
    public final ArrayList f;
    public final int g;

    public h4(int i10) {
        this.f = new ArrayList();
        this.g = i10;
    }

    public static h4 a(int i10) {
        h4 h4Var = new h4(i10);
        h4Var.e = "❌";
        h4Var.c = hg.b.d("❌");
        h4Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        h4Var.b = true;
        g4 g4Var = new g4();
        g4Var.a = d(true);
        h4Var.f.add(g4Var);
        g4 g4Var2 = new g4();
        g4Var2.a = d(false);
        h4Var.f.add(g4Var2);
        return h4Var;
    }

    public static h4 b(int i10) {
        h4 h4Var = new h4(i10);
        h4Var.e = "🏠";
        h4Var.c = hg.b.d("🏠");
        h4Var.d = TLRPC.ChatTheme.ofEmoticon(h4Var.e);
        g4 g4Var = new g4();
        g4Var.a = y6.P0("Blue");
        g4Var.e = 99;
        h4Var.f.add(g4Var);
        g4 g4Var2 = new g4();
        g4Var2.a = y6.P0("Day");
        g4Var2.e = 9;
        h4Var.f.add(g4Var2);
        g4 g4Var3 = new g4();
        g4Var3.a = y6.P0("Night");
        g4Var3.e = 0;
        h4Var.f.add(g4Var3);
        g4 g4Var4 = new g4();
        g4Var4.a = y6.P0("Dark Blue");
        g4Var4.e = 0;
        h4Var.f.add(g4Var4);
        return h4Var;
    }

    public static h4 c(int i10, TLRPC.TL_theme tL_theme) {
        h4 h4Var = new h4(i10);
        String str = tL_theme.emoticon;
        h4Var.e = str;
        h4Var.c = new hg.b(str, null);
        h4Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i11 = 0; i11 < tL_theme.settings.size(); i11++) {
            g4 g4Var = new g4();
            g4Var.b = tL_theme;
            g4Var.d = i11;
            h4Var.f.add(g4Var);
        }
        return h4Var;
    }

    public static x6 d(boolean z10) {
        x6 C0 = z10 ? y6.J : y6.C0();
        if (z10 != C0.q()) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
            C0 = y6.P0(z10 ? sharedPreferences.getString("lastDarkTheme", "Dark Blue") : sharedPreferences.getString("lastDayTheme", "Blue"));
            if (C0 == null) {
                C0 = y6.P0(z10 ? "Dark Blue" : "Blue");
            }
        }
        return new x6(C0);
    }

    public static int f(SparseIntArray sparseIntArray, int i10) {
        if (sparseIntArray == null) {
            return y6.E0(i10);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i10);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return y6.E0(i10);
    }

    public static void p(x6 x6Var, int i10) {
        SparseArray sparseArray;
        w6 w6Var;
        if (x6Var == null) {
            return;
        }
        if (i10 < 0 || (sparseArray = x6Var.a0) == null || !((w6Var = (w6) sparseArray.get(i10)) == null || w6Var.z)) {
            if (x6Var.m().equals("Blue") && i10 == 99) {
                return;
            }
            if (x6Var.m().equals("Day") && i10 == 9) {
                return;
            }
            if (x6Var.m().equals("Night") && i10 == 0) {
                return;
            }
            if (x6Var.m().equals("Dark Blue") && i10 == 0) {
                return;
            }
            boolean q5 = x6Var.q();
            ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().putString(q5 ? "lastDarkCustomTheme" : "lastDayCustomTheme", x6Var.m()).putInt(q5 ? "lastDarkCustomThemeAccentId" : "lastDayCustomThemeAccentId", i10).apply();
        }
    }

    public final TLRPC.Document e() {
        TLRPC.ChatTheme chatTheme = this.d;
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return bg.d.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return MediaDataController.getInstance(this.g).getEmojiAnimatedSticker(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray g(int i10, int i11) {
        w6 w6Var;
        SparseIntArray S0;
        int indexOfKey;
        x6 x6Var;
        w6 w6Var2;
        ArrayList arrayList = this.f;
        SparseIntArray sparseIntArray = ((g4) arrayList.get(i11)).f;
        if (sparseIntArray != null) {
            return sparseIntArray;
        }
        x6 i12 = i(i11);
        if (i12 == null) {
            int i13 = ((g4) arrayList.get(i11)).d;
            hg.a aVar = (hg.a) arrayList.get(i11);
            TLRPC.TL_theme tL_theme = ((g4) arrayList.get(i11)).b;
            x6 P0 = aVar != null ? y6.P0(y6.r0(((g4) aVar).b(i13))) : y6.P0("Blue");
            if (P0 != null) {
                x6 x6Var2 = new x6(P0);
                if (aVar != null) {
                    g4 g4Var = (g4) aVar;
                    w6Var2 = x6Var2.e(g4Var.a(), g4Var.b(i13), tL_theme, i10, true);
                } else {
                    w6Var2 = null;
                }
                if (w6Var2 != null) {
                    x6Var2.u(w6Var2.a);
                }
                w6Var = w6Var2;
                i12 = x6Var2;
            }
            w6Var = null;
        } else {
            SparseArray sparseArray = i12.a0;
            if (sparseArray != null) {
                w6Var = (w6) sparseArray.get(((g4) arrayList.get(i11)).e);
            }
            w6Var = null;
        }
        if (i12 == null) {
            return sparseIntArray;
        }
        String[] strArr = new String[1];
        if (i12.b != null) {
            S0 = y6.S0(new File(i12.b), null, strArr);
        } else {
            String str = i12.d;
            S0 = str != null ? y6.S0(null, str, strArr) : new SparseIntArray();
        }
        int i14 = 0;
        ((g4) arrayList.get(i11)).g = strArr[0];
        if (w6Var != null) {
            SparseIntArray clone = S0.clone();
            w6Var.c(S0, clone);
            hg.b bVar = this.c;
            if (bVar != null && !TextUtils.isEmpty(bVar.b) && (x6Var = w6Var.b) != null && x6Var.b == null && !x6Var.q()) {
                w6.g(clone);
            }
            S0 = clone;
        }
        SparseIntArray sparseIntArray2 = y6.rl;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        ((g4) arrayList.get(i11)).f = sparseIntArray3;
        while (true) {
            try {
                int[] iArr = h;
                if (i14 >= iArr.length) {
                    return sparseIntArray3;
                }
                int i15 = iArr[i14];
                int indexOfKey2 = S0.indexOfKey(i15);
                if (indexOfKey2 >= 0) {
                    sparseIntArray3.put(i15, S0.valueAt(indexOfKey2));
                } else {
                    int i16 = sparseIntArray2.get(i15, -1);
                    if (i16 >= 0 && (indexOfKey = S0.indexOfKey(i16)) >= 0) {
                        sparseIntArray3.put(i15, S0.valueAt(indexOfKey));
                    }
                }
                i14++;
            } catch (Exception e) {
                FileLog.e(e);
                return sparseIntArray3;
            }
        }
    }

    public final long h(int i10) {
        return ((g4) this.f.get(i10)).a();
    }

    public final x6 i(int i10) {
        return ((g4) this.f.get(i10)).a;
    }

    public final TLRPC.WallPaper j(int i10) {
        g4 g4Var = (g4) this.f.get(i10);
        TLRPC.ThemeSettings b10 = g4Var.b(g4Var.d);
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
                SparseIntArray g7 = g(i10, i11);
                ((g4) arrayList.get(i11)).h = f(g7, y6.ra);
                ((g4) arrayList.get(i11)).i = f(g7, y6.Aa);
                ((g4) arrayList.get(i11)).j = f(g7, y6.Oh);
                ((g4) arrayList.get(i11)).k = g7.get(y6.Nd, 0);
                ((g4) arrayList.get(i11)).l = g7.get(y6.Od, 0);
                ((g4) arrayList.get(i11)).m = g7.get(y6.Pd, 0);
                ((g4) arrayList.get(i11)).n = g7.get(y6.Qd, 0);
                ((g4) arrayList.get(i11)).o = g7.get(y6.Rd, 0);
                if (((g4) arrayList.get(i11)).a != null && ((g4) arrayList.get(i11)).a.m().equals("Blue")) {
                    if ((((g4) arrayList.get(i11)).e >= 0 ? ((g4) arrayList.get(i11)).e : ((g4) arrayList.get(i11)).a.Y) == 99) {
                        ((g4) arrayList.get(i11)).k = -2368069;
                        ((g4) arrayList.get(i11)).l = -9722489;
                        ((g4) arrayList.get(i11)).m = -2762611;
                        ((g4) arrayList.get(i11)).n = -7817084;
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
                return;
            }
            return;
        }
        long h10 = h(i10);
        long j11 = j10.id;
        y8 y8Var = new y8(resultCallback, h10, 1);
        boolean z10 = j10.pattern;
        int i11 = this.g;
        ChatThemeController.getInstance(i11).loadWallpaperBitmap(j11, z10 ? 1 : 0, new f4(y8Var, j10, z10 ? 1 : 0, i11, j11));
    }

    public final void o(int i10, ResultCallback resultCallback) {
        TLRPC.WallPaper j10 = j(i10);
        if (j10 != null) {
            long h10 = h(i10);
            if (h10 != 0) {
                Bitmap wallpaperThumbBitmap = ChatThemeController.getInstance(this.g).getWallpaperThumbBitmap(h10);
                File file = new File(ApplicationLoader.getFilesDirFixed(), b10.i(h10, "wallpaper_thumb_", ".png"));
                if (wallpaperThumbBitmap == null && file.exists() && file.length() > 0) {
                    try {
                        wallpaperThumbBitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (wallpaperThumbBitmap != null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(h10), wallpaperThumbBitmap));
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
                    ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 140), j10.document);
                    ImageReceiver imageReceiver = new ImageReceiver();
                    imageReceiver.setAllowLoadingOnAttachedOnly(false);
                    imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                    imageReceiver.setDelegate(new bi.i(resultCallback, h10, file, 4));
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

    public h4(int i10, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i10;
        this.a = false;
        String str = tL_theme.emoticon;
        this.e = str;
        this.c = new hg.b(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        g4 g4Var = new g4();
        g4Var.b = tL_theme;
        g4Var.d = 0;
        arrayList.add(g4Var);
        g4 g4Var2 = new g4();
        g4Var2.b = tL_theme;
        g4Var2.d = 1;
        arrayList.add(g4Var2);
    }

    public h4(int i10, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i10;
        this.a = false;
        this.e = tL_chatThemeUniqueGift.gift.slug;
        this.c = hg.b.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        g4 g4Var = new g4();
        g4Var.c = tL_chatThemeUniqueGift;
        g4Var.d = 0;
        arrayList.add(g4Var);
        g4 g4Var2 = new g4();
        g4Var2.c = tL_chatThemeUniqueGift;
        g4Var2.d = 1;
        arrayList.add(g4Var2);
    }
}
