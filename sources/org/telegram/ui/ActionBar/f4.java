package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import bi.ab;
import bi.bb;
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
import org.telegram.ui.Cells.r6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class f4 {
    public static final int[] h = {j6.ra, j6.Aa, j6.Oh, j6.Nd, j6.Od, j6.Pd, j6.Qd, j6.Rd};
    public boolean a;
    public boolean b;
    public eg.b c;
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
        f4Var.c = eg.b.d("❌");
        f4Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        f4Var.b = true;
        e4 e4Var = new e4();
        e4Var.a = e(true);
        f4Var.f.add(e4Var);
        e4 e4Var2 = new e4();
        e4Var2.a = e(false);
        f4Var.f.add(e4Var2);
        return f4Var;
    }

    public static f4 c(int i10) {
        f4 f4Var = new f4(i10);
        f4Var.e = "🏠";
        f4Var.c = eg.b.d("🏠");
        f4Var.d = TLRPC.ChatTheme.ofEmoticon(f4Var.e);
        e4 e4Var = new e4();
        e4Var.a = j6.N0("Blue");
        e4Var.e = 99;
        f4Var.f.add(e4Var);
        e4 e4Var2 = new e4();
        e4Var2.a = j6.N0("Day");
        e4Var2.e = 9;
        f4Var.f.add(e4Var2);
        e4 e4Var3 = new e4();
        e4Var3.a = j6.N0("Night");
        e4Var3.e = 0;
        f4Var.f.add(e4Var3);
        e4 e4Var4 = new e4();
        e4Var4.a = j6.N0("Dark Blue");
        e4Var4.e = 0;
        f4Var.f.add(e4Var4);
        return f4Var;
    }

    public static f4 d(int i10, TLRPC.TL_theme tL_theme) {
        f4 f4Var = new f4(i10);
        String str = tL_theme.emoticon;
        f4Var.e = str;
        f4Var.c = new eg.b(str, null);
        f4Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i11 = 0; i11 < tL_theme.settings.size(); i11++) {
            e4 e4Var = new e4();
            e4Var.b = tL_theme;
            e4Var.d = i11;
            f4Var.f.add(e4Var);
        }
        return f4Var;
    }

    public static i6 e(boolean z10) {
        i6 A0 = z10 ? j6.J : j6.A0();
        if (z10 != A0.q()) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
            A0 = j6.N0(z10 ? sharedPreferences.getString("lastDarkTheme", "Dark Blue") : sharedPreferences.getString("lastDayTheme", "Blue"));
            if (A0 == null) {
                A0 = j6.N0(z10 ? "Dark Blue" : "Blue");
            }
        }
        return new i6(A0);
    }

    public static int g(SparseIntArray sparseIntArray, int i10) {
        if (sparseIntArray == null) {
            return j6.C0(i10);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i10);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return j6.C0(i10);
    }

    public static void q(i6 i6Var, int i10) {
        SparseArray sparseArray;
        h6 h6Var;
        if (i6Var == null) {
            return;
        }
        if (i10 < 0 || (sparseArray = i6Var.a0) == null || !((h6Var = (h6) sparseArray.get(i10)) == null || h6Var.z)) {
            if (i6Var.m().equals("Blue") && i10 == 99) {
                return;
            }
            if (i6Var.m().equals("Day") && i10 == 9) {
                return;
            }
            if (i6Var.m().equals("Night") && i10 == 0) {
                return;
            }
            if (i6Var.m().equals("Dark Blue") && i10 == 0) {
                return;
            }
            boolean q6 = i6Var.q();
            ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().putString(q6 ? "lastDarkCustomTheme" : "lastDayCustomTheme", i6Var.m()).putInt(q6 ? "lastDarkCustomThemeAccentId" : "lastDayCustomThemeAccentId", i10).apply();
        }
    }

    public final SparseIntArray b(int i10, int i11) {
        h6 h6Var;
        SparseIntArray Q0;
        int indexOfKey;
        i6 i6Var;
        i6 j3 = j(i11);
        ArrayList arrayList = this.f;
        if (j3 == null) {
            int i12 = ((e4) arrayList.get(i11)).d;
            e4 e4Var = (e4) ((eg.a) arrayList.get(i11));
            TLRPC.ThemeSettings b10 = e4Var.b(i12);
            TLRPC.TL_theme tL_theme = ((e4) arrayList.get(i11)).b;
            i6 i6Var2 = new i6(j6.N0(j6.q0(b10)));
            h6Var = i6Var2.e(e4Var.a(), b10, tL_theme, i10, true);
            i6Var2.u(h6Var.a);
            j3 = i6Var2;
        } else {
            SparseArray sparseArray = j3.a0;
            h6Var = sparseArray != null ? (h6) sparseArray.get(((e4) arrayList.get(i11)).e) : null;
        }
        String[] strArr = new String[1];
        if (j3.b != null) {
            Q0 = j6.Q0(new File(j3.b), null, strArr);
        } else {
            String str = j3.d;
            Q0 = str != null ? j6.Q0(null, str, strArr) : new SparseIntArray();
        }
        e4 e4Var2 = (e4) arrayList.get(i11);
        e4Var2.g = strArr[0];
        if (h6Var != null) {
            SparseIntArray clone = Q0.clone();
            h6Var.c(Q0, clone);
            eg.b bVar = this.c;
            if (bVar != null && !TextUtils.isEmpty(bVar.b) && (i6Var = h6Var.b) != null && i6Var.b == null && !i6Var.q()) {
                h6.g(clone);
            }
            Q0 = clone;
        }
        SparseIntArray sparseIntArray = j6.ol;
        for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
            int keyAt = sparseIntArray.keyAt(i13);
            int valueAt = sparseIntArray.valueAt(i13);
            if (Q0.indexOfKey(keyAt) < 0 && (indexOfKey = Q0.indexOfKey(valueAt)) >= 0) {
                Q0.put(keyAt, Q0.valueAt(indexOfKey));
            }
        }
        int[] iArr = j6.nl;
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
            return yf.d.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return MediaDataController.getInstance(this.g).getEmojiAnimatedSticker(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray h(int i10, int i11) {
        h6 h6Var;
        SparseIntArray Q0;
        int indexOfKey;
        i6 i6Var;
        h6 h6Var2;
        ArrayList arrayList = this.f;
        SparseIntArray sparseIntArray = ((e4) arrayList.get(i11)).f;
        if (sparseIntArray != null) {
            return sparseIntArray;
        }
        i6 j3 = j(i11);
        if (j3 == null) {
            int i12 = ((e4) arrayList.get(i11)).d;
            eg.a aVar = (eg.a) arrayList.get(i11);
            TLRPC.TL_theme tL_theme = ((e4) arrayList.get(i11)).b;
            i6 N0 = aVar != null ? j6.N0(j6.q0(((e4) aVar).b(i12))) : j6.N0("Blue");
            if (N0 != null) {
                i6 i6Var2 = new i6(N0);
                if (aVar != null) {
                    e4 e4Var = (e4) aVar;
                    h6Var2 = i6Var2.e(e4Var.a(), e4Var.b(i12), tL_theme, i10, true);
                } else {
                    h6Var2 = null;
                }
                if (h6Var2 != null) {
                    i6Var2.u(h6Var2.a);
                }
                h6Var = h6Var2;
                j3 = i6Var2;
            }
            h6Var = null;
        } else {
            SparseArray sparseArray = j3.a0;
            if (sparseArray != null) {
                h6Var = (h6) sparseArray.get(((e4) arrayList.get(i11)).e);
            }
            h6Var = null;
        }
        if (j3 == null) {
            return sparseIntArray;
        }
        String[] strArr = new String[1];
        if (j3.b != null) {
            Q0 = j6.Q0(new File(j3.b), null, strArr);
        } else {
            String str = j3.d;
            Q0 = str != null ? j6.Q0(null, str, strArr) : new SparseIntArray();
        }
        int i13 = 0;
        ((e4) arrayList.get(i11)).g = strArr[0];
        if (h6Var != null) {
            SparseIntArray clone = Q0.clone();
            h6Var.c(Q0, clone);
            eg.b bVar = this.c;
            if (bVar != null && !TextUtils.isEmpty(bVar.b) && (i6Var = h6Var.b) != null && i6Var.b == null && !i6Var.q()) {
                h6.g(clone);
            }
            Q0 = clone;
        }
        SparseIntArray sparseIntArray2 = j6.ol;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        ((e4) arrayList.get(i11)).f = sparseIntArray3;
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
        return ((e4) this.f.get(i10)).a();
    }

    public final i6 j(int i10) {
        return ((e4) this.f.get(i10)).a;
    }

    public final TLRPC.WallPaper k(int i10) {
        e4 e4Var = (e4) this.f.get(i10);
        TLRPC.ThemeSettings b10 = e4Var.b(e4Var.d);
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
                ((e4) arrayList.get(i11)).h = g(h10, j6.ra);
                ((e4) arrayList.get(i11)).i = g(h10, j6.Aa);
                ((e4) arrayList.get(i11)).j = g(h10, j6.Oh);
                ((e4) arrayList.get(i11)).k = h10.get(j6.Nd, 0);
                ((e4) arrayList.get(i11)).l = h10.get(j6.Od, 0);
                ((e4) arrayList.get(i11)).m = h10.get(j6.Pd, 0);
                ((e4) arrayList.get(i11)).n = h10.get(j6.Qd, 0);
                ((e4) arrayList.get(i11)).o = h10.get(j6.Rd, 0);
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
        ab abVar = new ab(resultCallback, i11, 1);
        boolean z10 = k10.pattern;
        int i12 = this.g;
        ChatThemeController.getInstance(i12).loadWallpaperBitmap(j3, z10 ? 1 : 0, new d4(abVar, k10, z10 ? 1 : 0, i12, j3));
    }

    public final void p(int i10, ResultCallback resultCallback) {
        TLRPC.WallPaper k10 = k(i10);
        if (k10 != null) {
            long i11 = i(i10);
            if (i11 != 0) {
                Bitmap wallpaperThumbBitmap = ChatThemeController.getInstance(this.g).getWallpaperThumbBitmap(i11);
                File file = new File(ApplicationLoader.getFilesDirFixed(), r6.h(i11, "wallpaper_thumb_", ".png"));
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
                    imageReceiver.setDelegate(new bb(resultCallback, i11, file, 2));
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
        this.c = new eg.b(str, null);
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
        this.c = eg.b.c(tL_chatThemeUniqueGift);
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
