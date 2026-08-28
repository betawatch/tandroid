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
import kh.e9;
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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b4 {
    public static final int[] h = {f6.ra, f6.Aa, f6.Oh, f6.Nd, f6.Od, f6.Pd, f6.Qd, f6.Rd};
    public boolean a;
    public boolean b;
    public nf.b c;
    public TLRPC.ChatTheme d;
    public String e;
    public final ArrayList f;
    public final int g;

    public b4(int i9) {
        this.f = new ArrayList();
        this.g = i9;
    }

    public static b4 a(int i9) {
        b4 b4Var = new b4(i9);
        b4Var.e = "❌";
        b4Var.c = nf.b.d("❌");
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

    public static b4 c(int i9) {
        b4 b4Var = new b4(i9);
        b4Var.e = "🏠";
        b4Var.c = nf.b.d("🏠");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.e);
        a4 a4Var = new a4();
        a4Var.a = f6.N0("Blue");
        a4Var.e = 99;
        b4Var.f.add(a4Var);
        a4 a4Var2 = new a4();
        a4Var2.a = f6.N0("Day");
        a4Var2.e = 9;
        b4Var.f.add(a4Var2);
        a4 a4Var3 = new a4();
        a4Var3.a = f6.N0("Night");
        a4Var3.e = 0;
        b4Var.f.add(a4Var3);
        a4 a4Var4 = new a4();
        a4Var4.a = f6.N0("Dark Blue");
        a4Var4.e = 0;
        b4Var.f.add(a4Var4);
        return b4Var;
    }

    public static b4 d(int i9, TLRPC.TL_theme tL_theme) {
        b4 b4Var = new b4(i9);
        String str = tL_theme.emoticon;
        b4Var.e = str;
        b4Var.c = new nf.b(str, null);
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i10 = 0; i10 < tL_theme.settings.size(); i10++) {
            a4 a4Var = new a4();
            a4Var.b = tL_theme;
            a4Var.d = i10;
            b4Var.f.add(a4Var);
        }
        return b4Var;
    }

    public static e6 e(boolean z10) {
        e6 A0 = z10 ? f6.J : f6.A0();
        if (z10 != A0.q()) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
            A0 = f6.N0(z10 ? sharedPreferences.getString("lastDarkTheme", "Dark Blue") : sharedPreferences.getString("lastDayTheme", "Blue"));
            if (A0 == null) {
                A0 = f6.N0(z10 ? "Dark Blue" : "Blue");
            }
        }
        return new e6(A0);
    }

    public static int g(SparseIntArray sparseIntArray, int i9) {
        if (sparseIntArray == null) {
            return f6.C0(i9);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i9);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        return f6.C0(i9);
    }

    public static void q(e6 e6Var, int i9) {
        SparseArray sparseArray;
        d6 d6Var;
        if (e6Var == null) {
            return;
        }
        if (i9 < 0 || (sparseArray = e6Var.W) == null || !((d6Var = (d6) sparseArray.get(i9)) == null || d6Var.z)) {
            if (e6Var.m().equals("Blue") && i9 == 99) {
                return;
            }
            if (e6Var.m().equals("Day") && i9 == 9) {
                return;
            }
            if (e6Var.m().equals("Night") && i9 == 0) {
                return;
            }
            if (e6Var.m().equals("Dark Blue") && i9 == 0) {
                return;
            }
            boolean q10 = e6Var.q();
            ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().putString(q10 ? "lastDarkCustomTheme" : "lastDayCustomTheme", e6Var.m()).putInt(q10 ? "lastDarkCustomThemeAccentId" : "lastDayCustomThemeAccentId", i9).apply();
        }
    }

    public final SparseIntArray b(int i9, int i10) {
        d6 d6Var;
        SparseIntArray Q0;
        int indexOfKey;
        e6 e6Var;
        e6 j10 = j(i10);
        ArrayList arrayList = this.f;
        if (j10 == null) {
            int i11 = ((a4) arrayList.get(i10)).d;
            a4 a4Var = (a4) ((nf.a) arrayList.get(i10));
            TLRPC.ThemeSettings b10 = a4Var.b(i11);
            TLRPC.TL_theme tL_theme = ((a4) arrayList.get(i10)).b;
            e6 e6Var2 = new e6(f6.N0(f6.q0(b10)));
            d6Var = e6Var2.e(a4Var.a(), b10, tL_theme, i9, true);
            e6Var2.u(d6Var.a);
            j10 = e6Var2;
        } else {
            SparseArray sparseArray = j10.W;
            d6Var = sparseArray != null ? (d6) sparseArray.get(((a4) arrayList.get(i10)).e) : null;
        }
        String[] strArr = new String[1];
        if (j10.b != null) {
            Q0 = f6.Q0(new File(j10.b), null, strArr);
        } else {
            String str = j10.d;
            Q0 = str != null ? f6.Q0(null, str, strArr) : new SparseIntArray();
        }
        a4 a4Var2 = (a4) arrayList.get(i10);
        a4Var2.g = strArr[0];
        if (d6Var != null) {
            SparseIntArray clone = Q0.clone();
            d6Var.c(Q0, clone);
            nf.b bVar = this.c;
            if (bVar != null && !TextUtils.isEmpty(bVar.b) && (e6Var = d6Var.b) != null && e6Var.b == null && !e6Var.q()) {
                d6.g(clone);
            }
            Q0 = clone;
        }
        SparseIntArray sparseIntArray = f6.ol;
        for (int i12 = 0; i12 < sparseIntArray.size(); i12++) {
            int keyAt = sparseIntArray.keyAt(i12);
            int valueAt = sparseIntArray.valueAt(i12);
            if (Q0.indexOfKey(keyAt) < 0 && (indexOfKey = Q0.indexOfKey(valueAt)) >= 0) {
                Q0.put(keyAt, Q0.valueAt(indexOfKey));
            }
        }
        int[] iArr = f6.nl;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            if (Q0.indexOfKey(i13) < 0) {
                Q0.put(i13, iArr[i13]);
            }
        }
        return Q0;
    }

    public final TLRPC.Document f() {
        TLRPC.ChatTheme chatTheme = this.d;
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return gf.d.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return MediaDataController.getInstance(this.g).getEmojiAnimatedSticker(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray h(int i9, int i10) {
        d6 d6Var;
        SparseIntArray Q0;
        int indexOfKey;
        e6 e6Var;
        d6 d6Var2;
        ArrayList arrayList = this.f;
        SparseIntArray sparseIntArray = ((a4) arrayList.get(i10)).f;
        if (sparseIntArray != null) {
            return sparseIntArray;
        }
        e6 j10 = j(i10);
        if (j10 == null) {
            int i11 = ((a4) arrayList.get(i10)).d;
            nf.a aVar = (nf.a) arrayList.get(i10);
            TLRPC.TL_theme tL_theme = ((a4) arrayList.get(i10)).b;
            e6 N0 = aVar != null ? f6.N0(f6.q0(((a4) aVar).b(i11))) : f6.N0("Blue");
            if (N0 != null) {
                e6 e6Var2 = new e6(N0);
                if (aVar != null) {
                    a4 a4Var = (a4) aVar;
                    d6Var2 = e6Var2.e(a4Var.a(), a4Var.b(i11), tL_theme, i9, true);
                } else {
                    d6Var2 = null;
                }
                if (d6Var2 != null) {
                    e6Var2.u(d6Var2.a);
                }
                d6Var = d6Var2;
                j10 = e6Var2;
            }
            d6Var = null;
        } else {
            SparseArray sparseArray = j10.W;
            if (sparseArray != null) {
                d6Var = (d6) sparseArray.get(((a4) arrayList.get(i10)).e);
            }
            d6Var = null;
        }
        if (j10 == null) {
            return sparseIntArray;
        }
        String[] strArr = new String[1];
        if (j10.b != null) {
            Q0 = f6.Q0(new File(j10.b), null, strArr);
        } else {
            String str = j10.d;
            Q0 = str != null ? f6.Q0(null, str, strArr) : new SparseIntArray();
        }
        int i12 = 0;
        ((a4) arrayList.get(i10)).g = strArr[0];
        if (d6Var != null) {
            SparseIntArray clone = Q0.clone();
            d6Var.c(Q0, clone);
            nf.b bVar = this.c;
            if (bVar != null && !TextUtils.isEmpty(bVar.b) && (e6Var = d6Var.b) != null && e6Var.b == null && !e6Var.q()) {
                d6.g(clone);
            }
            Q0 = clone;
        }
        SparseIntArray sparseIntArray2 = f6.ol;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        ((a4) arrayList.get(i10)).f = sparseIntArray3;
        while (true) {
            try {
                int[] iArr = h;
                if (i12 >= iArr.length) {
                    return sparseIntArray3;
                }
                int i13 = iArr[i12];
                int indexOfKey2 = Q0.indexOfKey(i13);
                if (indexOfKey2 >= 0) {
                    sparseIntArray3.put(i13, Q0.valueAt(indexOfKey2));
                } else {
                    int i14 = sparseIntArray2.get(i13, -1);
                    if (i14 >= 0 && (indexOfKey = Q0.indexOfKey(i14)) >= 0) {
                        sparseIntArray3.put(i13, Q0.valueAt(indexOfKey));
                    }
                }
                i12++;
            } catch (Exception e10) {
                FileLog.e(e10);
                return sparseIntArray3;
            }
        }
    }

    public final long i(int i9) {
        return ((a4) this.f.get(i9)).a();
    }

    public final e6 j(int i9) {
        return ((a4) this.f.get(i9)).a;
    }

    public final TLRPC.WallPaper k(int i9) {
        a4 a4Var = (a4) this.f.get(i9);
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

    public final void n(int i9) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i10) != null) {
                SparseIntArray h10 = h(i9, i10);
                ((a4) arrayList.get(i10)).h = g(h10, f6.ra);
                ((a4) arrayList.get(i10)).i = g(h10, f6.Aa);
                ((a4) arrayList.get(i10)).j = g(h10, f6.Oh);
                ((a4) arrayList.get(i10)).k = h10.get(f6.Nd, 0);
                ((a4) arrayList.get(i10)).l = h10.get(f6.Od, 0);
                ((a4) arrayList.get(i10)).m = h10.get(f6.Pd, 0);
                ((a4) arrayList.get(i10)).n = h10.get(f6.Qd, 0);
                ((a4) arrayList.get(i10)).o = h10.get(f6.Rd, 0);
                if (((a4) arrayList.get(i10)).a != null && ((a4) arrayList.get(i10)).a.m().equals("Blue")) {
                    if ((((a4) arrayList.get(i10)).e >= 0 ? ((a4) arrayList.get(i10)).e : ((a4) arrayList.get(i10)).a.U) == 99) {
                        ((a4) arrayList.get(i10)).k = -2368069;
                        ((a4) arrayList.get(i10)).l = -9722489;
                        ((a4) arrayList.get(i10)).m = -2762611;
                        ((a4) arrayList.get(i10)).n = -7817084;
                    }
                }
            }
            i10++;
        }
    }

    public final void o(int i9, ResultCallback resultCallback) {
        TLRPC.WallPaper k10 = k(i9);
        if (k10 == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
                return;
            }
            return;
        }
        long i10 = i(i9);
        long j10 = k10.id;
        e9 e9Var = new e9(resultCallback, i10, 1);
        boolean z10 = k10.pattern;
        int i11 = this.g;
        ChatThemeController.getInstance(i11).loadWallpaperBitmap(j10, z10 ? 1 : 0, new z3(e9Var, k10, z10 ? 1 : 0, i11, j10));
    }

    public final void p(int i9, ResultCallback resultCallback) {
        TLRPC.WallPaper k10 = k(i9);
        if (k10 != null) {
            long i10 = i(i9);
            if (i10 != 0) {
                Bitmap wallpaperThumbBitmap = ChatThemeController.getInstance(this.g).getWallpaperThumbBitmap(i10);
                File file = new File(ApplicationLoader.getFilesDirFixed(), aa.d.n(i10, "wallpaper_thumb_", ".png"));
                if (wallpaperThumbBitmap == null && file.exists() && file.length() > 0) {
                    try {
                        wallpaperThumbBitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (wallpaperThumbBitmap != null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(i10), wallpaperThumbBitmap));
                        return;
                    }
                    return;
                }
                TLRPC.Document document = k10.document;
                if (document == null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(i10), null));
                        return;
                    }
                    return;
                } else {
                    ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 140), k10.document);
                    ImageReceiver imageReceiver = new ImageReceiver();
                    imageReceiver.setAllowLoadingOnAttachedOnly(false);
                    imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                    imageReceiver.setDelegate(new b9.a(resultCallback, i10, file, 6));
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

    public b4(int i9, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i9;
        this.a = false;
        String str = tL_theme.emoticon;
        this.e = str;
        this.c = new nf.b(str, null);
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

    public b4(int i9, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i9;
        this.a = false;
        this.e = tL_chatThemeUniqueGift.gift.slug;
        this.c = nf.b.c(tL_chatThemeUniqueGift);
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
