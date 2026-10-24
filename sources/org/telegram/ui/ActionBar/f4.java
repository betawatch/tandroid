package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import ei.c9;
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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class f4 {
    public static final int[] h = {k6.ra, k6.Aa, k6.Oh, k6.Nd, k6.Od, k6.Pd, k6.Qd, k6.Rd};
    public boolean a;
    public boolean b;
    public gg.b c;
    public TLRPC.ChatTheme d;
    public String e;
    public final ArrayList f;
    public final int g;

    public f4(int i10) {
        this.f = new ArrayList();
        this.g = i10;
    }

    public static f4 a(int i10) {
        f4 f4Var = new f4(i10);
        f4Var.e = "❌";
        f4Var.c = gg.b.d("❌");
        f4Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        f4Var.b = true;
        e4 e4Var = new e4();
        e4Var.a = d(true);
        f4Var.f.add(e4Var);
        e4 e4Var2 = new e4();
        e4Var2.a = d(false);
        f4Var.f.add(e4Var2);
        return f4Var;
    }

    public static f4 b(int i10) {
        f4 f4Var = new f4(i10);
        f4Var.e = "🏠";
        f4Var.c = gg.b.d("🏠");
        f4Var.d = TLRPC.ChatTheme.ofEmoticon(f4Var.e);
        e4 e4Var = new e4();
        e4Var.a = k6.P0("Blue");
        e4Var.e = 99;
        f4Var.f.add(e4Var);
        e4 e4Var2 = new e4();
        e4Var2.a = k6.P0("Day");
        e4Var2.e = 9;
        f4Var.f.add(e4Var2);
        e4 e4Var3 = new e4();
        e4Var3.a = k6.P0("Night");
        e4Var3.e = 0;
        f4Var.f.add(e4Var3);
        e4 e4Var4 = new e4();
        e4Var4.a = k6.P0("Dark Blue");
        e4Var4.e = 0;
        f4Var.f.add(e4Var4);
        return f4Var;
    }

    public static f4 c(int i10, TLRPC.TL_theme tL_theme) {
        f4 f4Var = new f4(i10);
        String str = tL_theme.emoticon;
        f4Var.e = str;
        f4Var.c = new gg.b(str, null);
        f4Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i11 = 0; i11 < tL_theme.settings.size(); i11++) {
            e4 e4Var = new e4();
            e4Var.b = tL_theme;
            e4Var.d = i11;
            f4Var.f.add(e4Var);
        }
        return f4Var;
    }

    public static j6 d(boolean z10) {
        j6 C0 = z10 ? k6.J : k6.C0();
        if (z10 != C0.q()) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
            C0 = k6.P0(z10 ? sharedPreferences.getString("lastDarkTheme", "Dark Blue") : sharedPreferences.getString("lastDayTheme", "Blue"));
            if (C0 == null) {
                C0 = k6.P0(z10 ? "Dark Blue" : "Blue");
            }
        }
        return new j6(C0);
    }

    public static int f(SparseIntArray sparseIntArray, int i10) {
        if (sparseIntArray == null) {
            return k6.E0(i10);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i10);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return k6.E0(i10);
    }

    public static void p(j6 j6Var, int i10) {
        SparseArray sparseArray;
        i6 i6Var;
        if (j6Var == null) {
            return;
        }
        if (i10 < 0 || (sparseArray = j6Var.a0) == null || !((i6Var = (i6) sparseArray.get(i10)) == null || i6Var.z)) {
            if (j6Var.m().equals("Blue") && i10 == 99) {
                return;
            }
            if (j6Var.m().equals("Day") && i10 == 9) {
                return;
            }
            if (j6Var.m().equals("Night") && i10 == 0) {
                return;
            }
            if (j6Var.m().equals("Dark Blue") && i10 == 0) {
                return;
            }
            boolean q6 = j6Var.q();
            ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().putString(q6 ? "lastDarkCustomTheme" : "lastDayCustomTheme", j6Var.m()).putInt(q6 ? "lastDarkCustomThemeAccentId" : "lastDayCustomThemeAccentId", i10).apply();
        }
    }

    public final TLRPC.Document e() {
        TLRPC.ChatTheme chatTheme = this.d;
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return ag.d.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return MediaDataController.getInstance(this.g).getEmojiAnimatedSticker(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray g(int i10, int i11) {
        i6 i6Var;
        SparseIntArray S0;
        int indexOfKey;
        j6 j6Var;
        i6 i6Var2;
        ArrayList arrayList = this.f;
        SparseIntArray sparseIntArray = ((e4) arrayList.get(i11)).f;
        if (sparseIntArray != null) {
            return sparseIntArray;
        }
        j6 i12 = i(i11);
        if (i12 == null) {
            int i13 = ((e4) arrayList.get(i11)).d;
            gg.a aVar = (gg.a) arrayList.get(i11);
            TLRPC.TL_theme tL_theme = ((e4) arrayList.get(i11)).b;
            j6 P0 = aVar != null ? k6.P0(k6.r0(((e4) aVar).b(i13))) : k6.P0("Blue");
            if (P0 != null) {
                j6 j6Var2 = new j6(P0);
                if (aVar != null) {
                    e4 e4Var = (e4) aVar;
                    i6Var2 = j6Var2.e(e4Var.a(), e4Var.b(i13), tL_theme, i10, true);
                } else {
                    i6Var2 = null;
                }
                if (i6Var2 != null) {
                    j6Var2.u(i6Var2.a);
                }
                i6Var = i6Var2;
                i12 = j6Var2;
            }
            i6Var = null;
        } else {
            SparseArray sparseArray = i12.a0;
            if (sparseArray != null) {
                i6Var = (i6) sparseArray.get(((e4) arrayList.get(i11)).e);
            }
            i6Var = null;
        }
        if (i12 == null) {
            return sparseIntArray;
        }
        String[] strArr = new String[1];
        if (i12.b != null) {
            S0 = k6.S0(new File(i12.b), null, strArr);
        } else {
            String str = i12.d;
            S0 = str != null ? k6.S0(null, str, strArr) : new SparseIntArray();
        }
        int i14 = 0;
        ((e4) arrayList.get(i11)).g = strArr[0];
        if (i6Var != null) {
            SparseIntArray clone = S0.clone();
            i6Var.c(S0, clone);
            gg.b bVar = this.c;
            if (bVar != null && !TextUtils.isEmpty(bVar.b) && (j6Var = i6Var.b) != null && j6Var.b == null && !j6Var.q()) {
                i6.g(clone);
            }
            S0 = clone;
        }
        SparseIntArray sparseIntArray2 = k6.rl;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        ((e4) arrayList.get(i11)).f = sparseIntArray3;
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
        return ((e4) this.f.get(i10)).a();
    }

    public final j6 i(int i10) {
        return ((e4) this.f.get(i10)).a;
    }

    public final TLRPC.WallPaper j(int i10) {
        e4 e4Var = (e4) this.f.get(i10);
        TLRPC.ThemeSettings b10 = e4Var.b(e4Var.d);
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
                ((e4) arrayList.get(i11)).h = f(g10, k6.ra);
                ((e4) arrayList.get(i11)).i = f(g10, k6.Aa);
                ((e4) arrayList.get(i11)).j = f(g10, k6.Oh);
                ((e4) arrayList.get(i11)).k = g10.get(k6.Nd, 0);
                ((e4) arrayList.get(i11)).l = g10.get(k6.Od, 0);
                ((e4) arrayList.get(i11)).m = g10.get(k6.Pd, 0);
                ((e4) arrayList.get(i11)).n = g10.get(k6.Qd, 0);
                ((e4) arrayList.get(i11)).o = g10.get(k6.Rd, 0);
                if (((e4) arrayList.get(i11)).a != null && ((e4) arrayList.get(i11)).a.m().equals("Blue")) {
                    if ((((e4) arrayList.get(i11)).e >= 0 ? ((e4) arrayList.get(i11)).e : ((e4) arrayList.get(i11)).a.Y) == 99) {
                        ((e4) arrayList.get(i11)).k = -2368069;
                        ((e4) arrayList.get(i11)).l = -9722489;
                        ((e4) arrayList.get(i11)).m = -2762611;
                        ((e4) arrayList.get(i11)).n = -7817084;
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
        c9 c9Var = new c9(resultCallback, h10, 1);
        boolean z10 = j10.pattern;
        int i11 = this.g;
        ChatThemeController.getInstance(i11).loadWallpaperBitmap(j11, z10 ? 1 : 0, new d4(c9Var, j10, z10 ? 1 : 0, i11, j11));
    }

    public final void o(int i10, ResultCallback resultCallback) {
        TLRPC.WallPaper j10 = j(i10);
        if (j10 != null) {
            long h10 = h(i10);
            if (h10 != 0) {
                Bitmap wallpaperThumbBitmap = ChatThemeController.getInstance(this.g).getWallpaperThumbBitmap(h10);
                File file = new File(ApplicationLoader.getFilesDirFixed(), org.telegram.ui.Cells.b1.k(h10, "wallpaper_thumb_", ".png"));
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
                    imageReceiver.setDelegate(new ai.f(resultCallback, h10, file, 4));
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

    public f4(int i10, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i10;
        this.a = false;
        String str = tL_theme.emoticon;
        this.e = str;
        this.c = new gg.b(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        e4 e4Var = new e4();
        e4Var.b = tL_theme;
        e4Var.d = 0;
        arrayList.add(e4Var);
        e4 e4Var2 = new e4();
        e4Var2.b = tL_theme;
        e4Var2.d = 1;
        arrayList.add(e4Var2);
    }

    public f4(int i10, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i10;
        this.a = false;
        this.e = tL_chatThemeUniqueGift.gift.slug;
        this.c = gg.b.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        e4 e4Var = new e4();
        e4Var.c = tL_chatThemeUniqueGift;
        e4Var.d = 0;
        arrayList.add(e4Var);
        e4 e4Var2 = new e4();
        e4Var2.c = tL_chatThemeUniqueGift;
        e4Var2.d = 1;
        arrayList.add(e4Var2);
    }
}
