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
import nh.q8;
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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b4 {
    public static final int[] h = {g6.ra, g6.Aa, g6.Oh, g6.Nd, g6.Od, g6.Pd, g6.Qd, g6.Rd};
    public boolean a;
    public boolean b;
    public qf.b c;
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
        b4Var.c = qf.b.d("❌");
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
        b4Var.c = qf.b.d("🏠");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.e);
        a4 a4Var = new a4();
        a4Var.a = g6.N0("Blue");
        a4Var.e = 99;
        b4Var.f.add(a4Var);
        a4 a4Var2 = new a4();
        a4Var2.a = g6.N0("Day");
        a4Var2.e = 9;
        b4Var.f.add(a4Var2);
        a4 a4Var3 = new a4();
        a4Var3.a = g6.N0("Night");
        a4Var3.e = 0;
        b4Var.f.add(a4Var3);
        a4 a4Var4 = new a4();
        a4Var4.a = g6.N0("Dark Blue");
        a4Var4.e = 0;
        b4Var.f.add(a4Var4);
        return b4Var;
    }

    public static b4 d(int i10, TLRPC.TL_theme tL_theme) {
        b4 b4Var = new b4(i10);
        String str = tL_theme.emoticon;
        b4Var.e = str;
        b4Var.c = new qf.b(str, null);
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i11 = 0; i11 < tL_theme.settings.size(); i11++) {
            a4 a4Var = new a4();
            a4Var.b = tL_theme;
            a4Var.d = i11;
            b4Var.f.add(a4Var);
        }
        return b4Var;
    }

    public static f6 e(boolean z10) {
        f6 A0 = z10 ? g6.J : g6.A0();
        if (z10 != A0.q()) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
            A0 = g6.N0(z10 ? sharedPreferences.getString("lastDarkTheme", "Dark Blue") : sharedPreferences.getString("lastDayTheme", "Blue"));
            if (A0 == null) {
                A0 = g6.N0(z10 ? "Dark Blue" : "Blue");
            }
        }
        return new f6(A0);
    }

    public static int g(SparseIntArray sparseIntArray, int i10) {
        if (sparseIntArray == null) {
            return g6.C0(i10);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i10);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        return g6.C0(i10);
    }

    public static void q(f6 f6Var, int i10) {
        SparseArray sparseArray;
        e6 e6Var;
        if (f6Var == null) {
            return;
        }
        if (i10 < 0 || (sparseArray = f6Var.W) == null || !((e6Var = (e6) sparseArray.get(i10)) == null || e6Var.z)) {
            if (f6Var.m().equals("Blue") && i10 == 99) {
                return;
            }
            if (f6Var.m().equals("Day") && i10 == 9) {
                return;
            }
            if (f6Var.m().equals("Night") && i10 == 0) {
                return;
            }
            if (f6Var.m().equals("Dark Blue") && i10 == 0) {
                return;
            }
            boolean q6 = f6Var.q();
            ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().putString(q6 ? "lastDarkCustomTheme" : "lastDayCustomTheme", f6Var.m()).putInt(q6 ? "lastDarkCustomThemeAccentId" : "lastDayCustomThemeAccentId", i10).apply();
        }
    }

    public final SparseIntArray b(int i10, int i11) {
        e6 e6Var;
        SparseIntArray Q0;
        int indexOfKey;
        f6 f6Var;
        f6 j10 = j(i11);
        ArrayList arrayList = this.f;
        if (j10 == null) {
            int i12 = ((a4) arrayList.get(i11)).d;
            a4 a4Var = (a4) ((qf.a) arrayList.get(i11));
            TLRPC.ThemeSettings b10 = a4Var.b(i12);
            TLRPC.TL_theme tL_theme = ((a4) arrayList.get(i11)).b;
            f6 f6Var2 = new f6(g6.N0(g6.q0(b10)));
            e6Var = f6Var2.e(a4Var.a(), b10, tL_theme, i10, true);
            f6Var2.u(e6Var.a);
            j10 = f6Var2;
        } else {
            SparseArray sparseArray = j10.W;
            e6Var = sparseArray != null ? (e6) sparseArray.get(((a4) arrayList.get(i11)).e) : null;
        }
        String[] strArr = new String[1];
        if (j10.b != null) {
            Q0 = g6.Q0(new File(j10.b), null, strArr);
        } else {
            String str = j10.d;
            Q0 = str != null ? g6.Q0(null, str, strArr) : new SparseIntArray();
        }
        a4 a4Var2 = (a4) arrayList.get(i11);
        a4Var2.g = strArr[0];
        if (e6Var != null) {
            SparseIntArray clone = Q0.clone();
            e6Var.c(Q0, clone);
            qf.b bVar = this.c;
            if (bVar != null && !TextUtils.isEmpty(bVar.b) && (f6Var = e6Var.b) != null && f6Var.b == null && !f6Var.q()) {
                e6.g(clone);
            }
            Q0 = clone;
        }
        SparseIntArray sparseIntArray = g6.ol;
        for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
            int keyAt = sparseIntArray.keyAt(i13);
            int valueAt = sparseIntArray.valueAt(i13);
            if (Q0.indexOfKey(keyAt) < 0 && (indexOfKey = Q0.indexOfKey(valueAt)) >= 0) {
                Q0.put(keyAt, Q0.valueAt(indexOfKey));
            }
        }
        int[] iArr = g6.nl;
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
            return kf.d.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return MediaDataController.getInstance(this.g).getEmojiAnimatedSticker(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray h(int i10, int i11) {
        e6 e6Var;
        SparseIntArray Q0;
        int indexOfKey;
        f6 f6Var;
        e6 e6Var2;
        ArrayList arrayList = this.f;
        SparseIntArray sparseIntArray = ((a4) arrayList.get(i11)).f;
        if (sparseIntArray != null) {
            return sparseIntArray;
        }
        f6 j10 = j(i11);
        if (j10 == null) {
            int i12 = ((a4) arrayList.get(i11)).d;
            qf.a aVar = (qf.a) arrayList.get(i11);
            TLRPC.TL_theme tL_theme = ((a4) arrayList.get(i11)).b;
            f6 N0 = aVar != null ? g6.N0(g6.q0(((a4) aVar).b(i12))) : g6.N0("Blue");
            if (N0 != null) {
                f6 f6Var2 = new f6(N0);
                if (aVar != null) {
                    a4 a4Var = (a4) aVar;
                    e6Var2 = f6Var2.e(a4Var.a(), a4Var.b(i12), tL_theme, i10, true);
                } else {
                    e6Var2 = null;
                }
                if (e6Var2 != null) {
                    f6Var2.u(e6Var2.a);
                }
                e6Var = e6Var2;
                j10 = f6Var2;
            }
            e6Var = null;
        } else {
            SparseArray sparseArray = j10.W;
            if (sparseArray != null) {
                e6Var = (e6) sparseArray.get(((a4) arrayList.get(i11)).e);
            }
            e6Var = null;
        }
        if (j10 == null) {
            return sparseIntArray;
        }
        String[] strArr = new String[1];
        if (j10.b != null) {
            Q0 = g6.Q0(new File(j10.b), null, strArr);
        } else {
            String str = j10.d;
            Q0 = str != null ? g6.Q0(null, str, strArr) : new SparseIntArray();
        }
        int i13 = 0;
        ((a4) arrayList.get(i11)).g = strArr[0];
        if (e6Var != null) {
            SparseIntArray clone = Q0.clone();
            e6Var.c(Q0, clone);
            qf.b bVar = this.c;
            if (bVar != null && !TextUtils.isEmpty(bVar.b) && (f6Var = e6Var.b) != null && f6Var.b == null && !f6Var.q()) {
                e6.g(clone);
            }
            Q0 = clone;
        }
        SparseIntArray sparseIntArray2 = g6.ol;
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
            } catch (Exception e10) {
                FileLog.e(e10);
                return sparseIntArray3;
            }
        }
    }

    public final long i(int i10) {
        return ((a4) this.f.get(i10)).a();
    }

    public final f6 j(int i10) {
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
                ((a4) arrayList.get(i11)).h = g(h10, g6.ra);
                ((a4) arrayList.get(i11)).i = g(h10, g6.Aa);
                ((a4) arrayList.get(i11)).j = g(h10, g6.Oh);
                ((a4) arrayList.get(i11)).k = h10.get(g6.Nd, 0);
                ((a4) arrayList.get(i11)).l = h10.get(g6.Od, 0);
                ((a4) arrayList.get(i11)).m = h10.get(g6.Pd, 0);
                ((a4) arrayList.get(i11)).n = h10.get(g6.Qd, 0);
                ((a4) arrayList.get(i11)).o = h10.get(g6.Rd, 0);
                if (((a4) arrayList.get(i11)).a != null && ((a4) arrayList.get(i11)).a.m().equals("Blue")) {
                    if ((((a4) arrayList.get(i11)).e >= 0 ? ((a4) arrayList.get(i11)).e : ((a4) arrayList.get(i11)).a.U) == 99) {
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
        TLRPC.WallPaper k9 = k(i10);
        if (k9 == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
                return;
            }
            return;
        }
        long i11 = i(i10);
        long j10 = k9.id;
        q8 q8Var = new q8(resultCallback, i11, 1);
        boolean z10 = k9.pattern;
        int i12 = this.g;
        ChatThemeController.getInstance(i12).loadWallpaperBitmap(j10, z10 ? 1 : 0, new z3(q8Var, k9, z10 ? 1 : 0, i12, j10));
    }

    public final void p(int i10, ResultCallback resultCallback) {
        TLRPC.WallPaper k9 = k(i10);
        if (k9 != null) {
            long i11 = i(i10);
            if (i11 != 0) {
                Bitmap wallpaperThumbBitmap = ChatThemeController.getInstance(this.g).getWallpaperThumbBitmap(i11);
                File file = new File(ApplicationLoader.getFilesDirFixed(), com.google.android.recaptcha.internal.a.l(i11, "wallpaper_thumb_", ".png"));
                if (wallpaperThumbBitmap == null && file.exists() && file.length() > 0) {
                    try {
                        wallpaperThumbBitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (wallpaperThumbBitmap != null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(i11), wallpaperThumbBitmap));
                        return;
                    }
                    return;
                }
                TLRPC.Document document = k9.document;
                if (document == null) {
                    if (resultCallback != null) {
                        resultCallback.onComplete(new Pair(Long.valueOf(i11), null));
                        return;
                    }
                    return;
                } else {
                    ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 140), k9.document);
                    ImageReceiver imageReceiver = new ImageReceiver();
                    imageReceiver.setAllowLoadingOnAttachedOnly(false);
                    imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                    imageReceiver.setDelegate(new d9.a(resultCallback, i11, file, 6));
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
        this.c = new qf.b(str, null);
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
        this.c = qf.b.c(tL_chatThemeUniqueGift);
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
