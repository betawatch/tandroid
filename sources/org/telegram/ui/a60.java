package org.telegram.ui;

import android.app.Activity;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.webrtc.EglRenderer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a60(Object obj, Object obj2, boolean z10, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0534 A[Catch: Exception -> 0x0437, TRY_ENTER, TryCatch #6 {Exception -> 0x0437, blocks: (B:230:0x0426, B:232:0x042c, B:234:0x043a, B:236:0x0447, B:237:0x044a, B:239:0x0457, B:241:0x045f, B:243:0x0470, B:245:0x0476, B:247:0x047e, B:249:0x0486, B:299:0x054b, B:301:0x0550, B:302:0x0553, B:289:0x0534, B:292:0x0524, B:293:0x053a), top: B:229:0x0426 }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x054b A[Catch: Exception -> 0x0437, TryCatch #6 {Exception -> 0x0437, blocks: (B:230:0x0426, B:232:0x042c, B:234:0x043a, B:236:0x0447, B:237:0x044a, B:239:0x0457, B:241:0x045f, B:243:0x0470, B:245:0x0476, B:247:0x047e, B:249:0x0486, B:299:0x054b, B:301:0x0550, B:302:0x0553, B:289:0x0534, B:292:0x0524, B:293:0x053a), top: B:229:0x0426 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0550 A[Catch: Exception -> 0x0437, TryCatch #6 {Exception -> 0x0437, blocks: (B:230:0x0426, B:232:0x042c, B:234:0x043a, B:236:0x0447, B:237:0x044a, B:239:0x0457, B:241:0x045f, B:243:0x0470, B:245:0x0476, B:247:0x047e, B:249:0x0486, B:299:0x054b, B:301:0x0550, B:302:0x0553, B:289:0x0534, B:292:0x0524, B:293:0x053a), top: B:229:0x0426 }] */
    /* JADX WARN: Type inference failed for: r7v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.messenger.h1 e10;
        String str;
        int i3;
        char c2;
        String G;
        int i10;
        ?? r72;
        BufferedInputStream bufferedInputStream;
        ZipOutputStream zipOutputStream;
        BufferedInputStream bufferedInputStream2;
        boolean z10;
        kc1 kc1Var;
        boolean z11;
        int i11;
        TLRPC.WallPaperSettings wallPaperSettings;
        boolean z12;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        TLRPC.Document document;
        int i12;
        long cameraFlipElapsedMs;
        int i13 = 1;
        switch (this.a) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.c;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.d;
                boolean z13 = this.b;
                s1Var.dismiss();
                if (z13) {
                    return;
                }
                org.telegram.messenger.g0.i3(new z50(languageSelectActivity, 1), 10L);
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.d;
                boolean z14 = this.b;
                String str2 = LaunchActivity.E1;
                launchActivity.u0(d2Var, z14, false);
                return;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) this.c;
                boolean z15 = this.b;
                org.telegram.messenger.d1 d1Var = (org.telegram.messenger.d1) this.d;
                String str3 = LaunchActivity.E1;
                org.telegram.messenger.d1 d1Var2 = (!((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q() || (str = (e10 = org.telegram.messenger.h1.e()).a) == null || (i3 = e10.b) == 0) ? null : new org.telegram.messenger.d1(str, i3, e10.c);
                if (d1Var2 != null) {
                    if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q() ? false : org.telegram.messenger.h1.e().j) {
                        return;
                    }
                    if (z15 || d1Var == null || (org.telegram.messenger.az.U(d1Var2.a, d1Var.a) && d1Var2.c > d1Var.c)) {
                        ((ApplicationLoaderImpl) org.telegram.messenger.t0.a).getClass();
                        try {
                            new org.telegram.ui.Components.r41(launchActivity2, d1Var2).show();
                            return;
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3:
                yj0.d0((yj0) this.c, this.b, (String) this.d);
                return;
            case 4:
                mj0 mj0Var = (mj0) this.c;
                boolean z16 = this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                yj0 yj0Var = mj0Var.e;
                if (z16) {
                    i10 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
                    org.telegram.messenger.h10.i(i10).u();
                    yj0Var.O0 = 0;
                    yj0Var.W1();
                    ViewGroup[] viewGroupArr = yj0Var.a0;
                    if (viewGroupArr == null || viewGroupArr[0].getVisibility() != 0) {
                        return;
                    }
                    yj0Var.Z[0].requestFocus();
                    org.telegram.messenger.g0.K3(yj0Var.Z[0]);
                    return;
                }
                yj0Var.R1(true, false);
                if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                    yj0Var.E1(true);
                    return;
                }
                if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    yj0Var.Q1(org.telegram.messenger.bd.M0(R.string.AppName, null), tL_error.text);
                    return;
                }
                int intValue = Utilities.z(tL_error.text).intValue();
                if (intValue < 60) {
                    c2 = 0;
                    G = org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]);
                } else {
                    c2 = 0;
                    G = org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0]);
                }
                String M0 = org.telegram.messenger.bd.M0(R.string.AppName, null);
                Object[] objArr = new Object[1];
                objArr[c2] = G;
                yj0Var.Q1(M0, org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, objArr));
                return;
            case 5:
                sm0.Z((sm0) this.c, (TLObject) this.d, this.b);
                return;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                boolean z17 = this.b;
                View view = (View) this.d;
                Drawable[] drawableArr = PhotoViewer.V8;
                if (!z17) {
                    photoViewer.getClass();
                    view.setVisibility(8);
                }
                photoViewer.v3();
                return;
            case 7:
                PhotoViewer photoViewer2 = (PhotoViewer) this.c;
                String str4 = (String) this.d;
                boolean z18 = this.b;
                if (str4.equals(photoViewer2.D4.R)) {
                    photoViewer2.x4 = z18 ? 1 : 0;
                    photoViewer2.y4 = str4;
                    return;
                }
                return;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                boolean z19 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (!z19) {
                    RectF rectF = ProfileActivity.T6;
                } else if (profileActivity.M4 == -1) {
                    org.telegram.ui.Components.gf0 gf0Var = profileActivity.a0;
                    if (gf0Var != null) {
                        org.telegram.ui.Components.df0 i14 = org.telegram.ui.Components.gf0.i(7, gf0Var.a);
                        if (i14 == null || !i14.s) {
                            r72 = 0;
                        } else {
                            r72 = 0;
                            i14.s = false;
                            gf0Var.invalidate();
                        }
                        if (zArr[r72]) {
                            org.telegram.ui.Components.gf0 gf0Var2 = profileActivity.a0;
                            gf0Var2.G = true;
                            gf0Var2.o(7, r72);
                            profileActivity.a0.o(9, true);
                            org.telegram.ui.Components.gf0 gf0Var3 = profileActivity.a0;
                            if (gf0Var3.G) {
                                gf0Var3.G = r72;
                                gf0Var3.d();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                profileActivity.J5();
                bw0 bw0Var = profileActivity.d;
                if (bw0Var != null) {
                    bw0Var.f();
                    return;
                }
                return;
            case 9:
                org.telegram.ui.ActionBar.s1 s1Var2 = (org.telegram.ui.ActionBar.s1) this.d;
                boolean z20 = this.b;
                Activity activity = (Activity) this.c;
                RectF rectF2 = ProfileActivity.T6;
                try {
                    File P0 = org.telegram.messenger.g0.P0();
                    if (P0 == null) {
                        org.telegram.messenger.g0.h3(new ci.b4(s1Var2, 2));
                        return;
                    }
                    File file = new File(P0, "logs.zip");
                    if (file.exists()) {
                        file.delete();
                    }
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : P0.listFiles()) {
                        arrayList.add(file2);
                    }
                    File file3 = new File(org.telegram.messenger.t0.h(), "malformed_database/");
                    if (file3.exists() && file3.isDirectory()) {
                        for (File file4 : file3.listFiles()) {
                            arrayList.add(file4);
                        }
                    }
                    boolean[] zArr2 = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                        int i15 = 65536;
                        try {
                            byte[] bArr = new byte[65536];
                            int i16 = 0;
                            while (i16 < arrayList.size()) {
                                File file5 = (File) arrayList.get(i16);
                                if (!file5.getName().contains("cache4")) {
                                    if (!z20) {
                                        if (file5.getName().contains("_mtproto")) {
                                        }
                                    }
                                    if (currentTimeMillis - file5.lastModified() > 86400000) {
                                        i16++;
                                        i15 = 65536;
                                    }
                                }
                                if (file5.exists() && !file5.isDirectory()) {
                                    BufferedInputStream bufferedInputStream3 = new BufferedInputStream(new FileInputStream(file5), i15);
                                    try {
                                        zipOutputStream.putNextEntry(new ZipEntry(file5.getName()));
                                        while (true) {
                                            int read = bufferedInputStream3.read(bArr, 0, i15);
                                            if (read != -1) {
                                                zipOutputStream.write(bArr, 0, read);
                                                i15 = 65536;
                                            } else {
                                                bufferedInputStream3.close();
                                            }
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        bufferedInputStream2 = bufferedInputStream3;
                                        try {
                                            e.printStackTrace();
                                            if (bufferedInputStream2 != null) {
                                            }
                                            if (zipOutputStream != null) {
                                            }
                                            org.telegram.messenger.g0.h3(new ih0(s1Var2, zArr2, activity, file, 10));
                                            return;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            bufferedInputStream = bufferedInputStream2;
                                            if (bufferedInputStream != null) {
                                                bufferedInputStream.close();
                                            }
                                            if (zipOutputStream != null) {
                                                zipOutputStream.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        bufferedInputStream = bufferedInputStream3;
                                        if (bufferedInputStream != null) {
                                        }
                                        if (zipOutputStream != null) {
                                        }
                                        throw th;
                                    }
                                }
                                i16++;
                                i15 = 65536;
                            }
                            zArr2[0] = true;
                        } catch (Exception e13) {
                            e = e13;
                            bufferedInputStream2 = null;
                            e.printStackTrace();
                            if (bufferedInputStream2 != null) {
                                bufferedInputStream2.close();
                            }
                            if (zipOutputStream != null) {
                                zipOutputStream.close();
                            }
                            org.telegram.messenger.g0.h3(new ih0(s1Var2, zArr2, activity, file, 10));
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            bufferedInputStream = null;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        zipOutputStream = null;
                    } catch (Throwable th5) {
                        th = th5;
                        bufferedInputStream = null;
                        zipOutputStream = null;
                    }
                    zipOutputStream.close();
                    org.telegram.messenger.g0.h3(new ih0(s1Var2, zArr2, activity, file, 10));
                    return;
                } catch (Exception e15) {
                    e15.printStackTrace();
                    return;
                }
            case 10:
                org.telegram.ui.Components.i20 i20Var = (org.telegram.ui.Components.i20) this.c;
                boolean z21 = this.b;
                org.telegram.ui.Components.j50 j50Var = (org.telegram.ui.Components.j50) this.d;
                if (z21) {
                    org.telegram.messenger.hp.s1(i20Var.a).o0(true);
                    j50Var.run();
                } else {
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    if (T == null) {
                        return;
                    } else {
                        T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(3)));
                    }
                }
                i20Var.dismiss();
                return;
            case 11:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) this.c, this.b, (byte[]) this.d);
                return;
            case 12:
                org.telegram.ui.Wallet.t0 t0Var = (org.telegram.ui.Wallet.t0) this.c;
                ei.c1 c1Var = (ei.c1) this.d;
                boolean z22 = this.b;
                if (t0Var.b) {
                    return;
                }
                try {
                    if (c1Var.b == ((org.telegram.ui.Wallet.o0) c1Var.c).l()) {
                        b8.vf.b = t0Var;
                        LaunchActivity launchActivity3 = LaunchActivity.K1;
                        int i17 = Build.VERSION.SDK_INT;
                        if (launchActivity3 != null && !launchActivity3.isFinishing() && !launchActivity3.isDestroyed() && !launchActivity3.s().P()) {
                            t0Var.e = launchActivity3;
                            try {
                                if (z22) {
                                    t0Var.a();
                                } else if (i17 >= 30) {
                                    t0Var.d();
                                } else {
                                    t0Var.b();
                                }
                            } catch (Exception e16) {
                                org.telegram.messenger.a8.g(e16, true);
                                t0Var.a();
                            }
                        }
                        t0Var.c("AUTH_UNAVAILABLE");
                    } else {
                        t0Var.c("STORAGE_CANCELED");
                    }
                    return;
                } catch (Exception e17) {
                    org.telegram.messenger.a8.g(e17, true);
                    t0Var.c("AUTH_UNAVAILABLE");
                    return;
                }
            case 13:
                cg.u0 u0Var = (cg.u0) this.c;
                boolean z23 = this.b;
                org.telegram.ui.Wallet.f3 f3Var = (org.telegram.ui.Wallet.f3) this.d;
                org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                if (u0Var.b) {
                    return;
                }
                if (T2 == null) {
                    u0Var.a();
                    return;
                } else {
                    if (!z23) {
                        T2.presentFragment(f3Var);
                        return;
                    }
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
                    b2Var.a = true;
                    T2.showAsSheet(f3Var, b2Var);
                    return;
                }
            case 14:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z24 = this.b;
                ArrayList arrayList2 = wallpapersListActivity.Y;
                HashMap hashMap = wallpapersListActivity.Z;
                int i18 = wallpapersListActivity.r;
                HashMap hashMap2 = wallpapersListActivity.e0;
                ArrayList arrayList3 = wallpapersListActivity.b0;
                if (tLObject instanceof TL_account.TL_wallPapers) {
                    TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
                    wallpapersListActivity.d0.clear();
                    hashMap2.clear();
                    if (i18 != 1 && i18 != 2) {
                        arrayList3.clear();
                        hashMap.clear();
                        arrayList2.clear();
                        arrayList2.addAll(tL_wallPapers.wallpapers);
                        arrayList3.addAll(wallpapersListActivity.c0);
                    }
                    int size = tL_wallPapers.wallpapers.size();
                    int i19 = 0;
                    while (i19 < size) {
                        TLRPC.WallPaper wallPaper = tL_wallPapers.wallpapers.get(i19);
                        if (!"fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                            if ((wallPaper instanceof TLRPC.TL_wallPaper) && !(wallPaper.document instanceof TLRPC.TL_documentEmpty)) {
                                hashMap.put(wallPaper.slug, wallPaper);
                                if (wallPaper.pattern && (document = wallPaper.document) != null && !hashMap2.containsKey(Long.valueOf(document.id))) {
                                    wallpapersListActivity.d0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.id), wallPaper);
                                }
                                if (i18 != i13 && ((!(z12 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i18 != 2 || z12) && (org.telegram.ui.ActionBar.k6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                                    arrayList3.add(wallPaper);
                                }
                            } else if (wallPaper.settings.background_color != 0 && (org.telegram.ui.ActionBar.k6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0)) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                                int i20 = wallPaperSettings4.second_background_color;
                                if (i20 == 0 || (i11 = wallPaperSettings4.third_background_color) == 0) {
                                    z11 = z24;
                                    kc1Var = new kc1(wallPaperSettings4.background_color, i20, wallPaperSettings4.rotation, null);
                                } else {
                                    kc1Var = new kc1(null, wallPaperSettings4.background_color, i20, i11, wallPaperSettings4.fourth_background_color);
                                    z11 = z24;
                                }
                                kc1Var.a = wallPaper.slug;
                                kc1Var.h = wallPaperSettings4.intensity / 100.0f;
                                kc1Var.f = org.telegram.messenger.g0.s1(wallPaperSettings4.rotation, false);
                                kc1Var.l = wallPaper;
                                arrayList3.add(kc1Var);
                                i19++;
                                z24 = z11;
                                i13 = 1;
                            }
                        }
                        z11 = z24;
                        i19++;
                        z24 = z11;
                        i13 = 1;
                    }
                    z10 = z24;
                    wallpapersListActivity.F0();
                    wallpapersListActivity.getMessagesStorage().p1(1, tL_wallPapers.wallpapers);
                } else {
                    z10 = z24;
                }
                org.telegram.ui.ActionBar.s1 s1Var3 = wallpapersListActivity.M;
                if (s1Var3 != null) {
                    s1Var3.dismiss();
                    if (z10) {
                        return;
                    }
                    wallpapersListActivity.G.y0(0);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.c;
                String str5 = (String) this.d;
                boolean z25 = this.b;
                ai.h4 h4Var = lVar.x;
                ArrayList arrayList4 = lVar.y;
                arrayList4.clear();
                org.telegram.ui.web.d1.a().getClass();
                ArrayList arrayList5 = new ArrayList();
                try {
                    JSONArray jSONArray = new JSONArray(str5).getJSONArray(1);
                    for (int i21 = 0; i21 < jSONArray.length(); i21++) {
                        arrayList5.add(jSONArray.getString(i21));
                    }
                } catch (Exception e18) {
                    org.telegram.messenger.a8.g(e18, false);
                    try {
                        JSONArray jSONArray2 = new JSONObject(str5).getJSONObject("gossip").getJSONArray("results");
                        for (int i22 = 0; i22 < jSONArray2.length(); i22++) {
                            arrayList5.add(jSONArray2.getJSONObject(i22).getString("key"));
                        }
                    } catch (Exception e19) {
                        org.telegram.messenger.a8.g(e19, false);
                        try {
                            JSONArray jSONArray3 = new JSONArray(str5);
                            for (int i23 = 0; i23 < jSONArray3.length(); i23++) {
                                String string = jSONArray3.getJSONObject(i23).getString("phrase");
                                if (!TextUtils.isEmpty(string)) {
                                    arrayList5.add(string);
                                }
                            }
                        } catch (Exception e20) {
                            org.telegram.messenger.a8.g(e20, false);
                        }
                    }
                }
                arrayList4.addAll(arrayList5);
                h4Var.g3.O(true);
                if (z25 != (!arrayList4.isEmpty())) {
                    h4Var.f3.h1(0, 0);
                    return;
                }
                return;
            case 16:
                ((EglRenderer) this.c).lambda$releaseEglSurface$5(this.b, (Runnable) this.d);
                return;
            case 17:
                wi.s sVar = (wi.s) this.c;
                boolean z26 = this.b;
                Runnable runnable = (Runnable) this.d;
                if (sVar.f) {
                    sVar.F = z26;
                    Size size2 = z26 ? sVar.c : sVar.b;
                    sVar.a = size2;
                    int i24 = z26 ? sVar.l : sVar.k;
                    sVar.j = i24;
                    sVar.m = z26 ? sVar.o : sVar.n;
                    wi.c0 c0Var = sVar.N;
                    if (c0Var != null) {
                        c0Var.c = size2;
                        c0Var.d = i24;
                        c0Var.q = wi.c0.j(size2, i24, false);
                        c0Var.r = wi.c0.j(size2, i24, true);
                        c0Var.A = false;
                        c0Var.z = 0L;
                    }
                    sVar.Q = -1L;
                    sVar.u0 = runnable;
                    sVar.i.b("GL dual input selected: input=" + (z26 ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.nh nhVar = (org.telegram.ui.Components.nh) this.c;
                wi.h hVar = (wi.h) this.d;
                boolean z27 = this.b;
                wi.t0 t0Var2 = (wi.t0) nhVar.b;
                int i25 = t0Var2.Z;
                if (i25 == 7 || i25 == 8 || i25 == 9 || i25 == 10) {
                    return;
                }
                wi.m0 m0Var = hVar.a;
                wi.o0 o0Var = hVar.c;
                wi.n0 n0Var = hVar.b;
                t0Var2.s = m0Var;
                t0Var2.t = n0Var;
                t0Var2.u = o0Var;
                t0Var2.v = hVar.f;
                if (m0Var != wi.m0.a) {
                    if (hVar.g) {
                        i12 = 2;
                        t0Var2.a0 = i12;
                        t0Var2.n();
                        wi.n nVar = t0Var2.m;
                        StringBuilder sb2 = new StringBuilder("camera configured: facing=");
                        sb2.append(m0Var);
                        sb2.append(", mode=");
                        sb2.append(n0Var);
                        sb2.append(", preview=");
                        sb2.append(hVar.d);
                        sb2.append(", recording=");
                        sb2.append(hVar.e);
                        sb2.append(", fps=");
                        sb2.append(o0Var.a);
                        sb2.append(", maxZoom=");
                        sb2.append(t0Var2.v);
                        sb2.append(", flash=");
                        int i26 = t0Var2.a0;
                        sb2.append(i26 == 1 ? i26 != 2 ? i26 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                        sb2.append(", switch=");
                        sb2.append(z27);
                        nVar.b(sb2.toString());
                        if (z27) {
                        }
                        t0Var2.y = false;
                        org.telegram.ui.Components.j40 j40Var = (org.telegram.ui.Components.j40) t0Var2.d.a;
                        j40Var.p0 = true;
                        StringBuilder sb3 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                        sb3.append(m0Var);
                        sb3.append(", elapsedMs=");
                        cameraFlipElapsedMs = j40Var.getCameraFlipElapsedMs();
                        sb3.append(cameraFlipElapsedMs);
                        org.telegram.messenger.a8.b(sb3.toString());
                        org.telegram.ui.Components.j40.m(j40Var);
                        t0Var2.o();
                        return;
                    }
                    i12 = 1;
                    t0Var2.a0 = i12;
                    t0Var2.n();
                    wi.n nVar2 = t0Var2.m;
                    StringBuilder sb22 = new StringBuilder("camera configured: facing=");
                    sb22.append(m0Var);
                    sb22.append(", mode=");
                    sb22.append(n0Var);
                    sb22.append(", preview=");
                    sb22.append(hVar.d);
                    sb22.append(", recording=");
                    sb22.append(hVar.e);
                    sb22.append(", fps=");
                    sb22.append(o0Var.a);
                    sb22.append(", maxZoom=");
                    sb22.append(t0Var2.v);
                    sb22.append(", flash=");
                    int i262 = t0Var2.a0;
                    sb22.append(i262 == 1 ? i262 != 2 ? i262 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                    sb22.append(", switch=");
                    sb22.append(z27);
                    nVar2.b(sb22.toString());
                    if (z27) {
                    }
                    t0Var2.y = false;
                    org.telegram.ui.Components.j40 j40Var2 = (org.telegram.ui.Components.j40) t0Var2.d.a;
                    j40Var2.p0 = true;
                    StringBuilder sb32 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                    sb32.append(m0Var);
                    sb32.append(", elapsedMs=");
                    cameraFlipElapsedMs = j40Var2.getCameraFlipElapsedMs();
                    sb32.append(cameraFlipElapsedMs);
                    org.telegram.messenger.a8.b(sb32.toString());
                    org.telegram.ui.Components.j40.m(j40Var2);
                    t0Var2.o();
                    return;
                }
                if (t0Var2.f != null) {
                    i12 = 3;
                    t0Var2.a0 = i12;
                    t0Var2.n();
                    wi.n nVar22 = t0Var2.m;
                    StringBuilder sb222 = new StringBuilder("camera configured: facing=");
                    sb222.append(m0Var);
                    sb222.append(", mode=");
                    sb222.append(n0Var);
                    sb222.append(", preview=");
                    sb222.append(hVar.d);
                    sb222.append(", recording=");
                    sb222.append(hVar.e);
                    sb222.append(", fps=");
                    sb222.append(o0Var.a);
                    sb222.append(", maxZoom=");
                    sb222.append(t0Var2.v);
                    sb222.append(", flash=");
                    int i2622 = t0Var2.a0;
                    sb222.append(i2622 == 1 ? i2622 != 2 ? i2622 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                    sb222.append(", switch=");
                    sb222.append(z27);
                    nVar22.b(sb222.toString());
                    if (!z27 || t0Var2.y) {
                        t0Var2.y = false;
                        org.telegram.ui.Components.j40 j40Var22 = (org.telegram.ui.Components.j40) t0Var2.d.a;
                        j40Var22.p0 = true;
                        StringBuilder sb322 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                        sb322.append(m0Var);
                        sb322.append(", elapsedMs=");
                        cameraFlipElapsedMs = j40Var22.getCameraFlipElapsedMs();
                        sb322.append(cameraFlipElapsedMs);
                        org.telegram.messenger.a8.b(sb322.toString());
                        org.telegram.ui.Components.j40.m(j40Var22);
                        t0Var2.o();
                        return;
                    }
                    return;
                }
                i12 = 1;
                t0Var2.a0 = i12;
                t0Var2.n();
                wi.n nVar222 = t0Var2.m;
                StringBuilder sb2222 = new StringBuilder("camera configured: facing=");
                sb2222.append(m0Var);
                sb2222.append(", mode=");
                sb2222.append(n0Var);
                sb2222.append(", preview=");
                sb2222.append(hVar.d);
                sb2222.append(", recording=");
                sb2222.append(hVar.e);
                sb2222.append(", fps=");
                sb2222.append(o0Var.a);
                sb2222.append(", maxZoom=");
                sb2222.append(t0Var2.v);
                sb2222.append(", flash=");
                int i26222 = t0Var2.a0;
                sb2222.append(i26222 == 1 ? i26222 != 2 ? i26222 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                sb2222.append(", switch=");
                sb2222.append(z27);
                nVar222.b(sb2222.toString());
                if (z27) {
                }
                t0Var2.y = false;
                org.telegram.ui.Components.j40 j40Var222 = (org.telegram.ui.Components.j40) t0Var2.d.a;
                j40Var222.p0 = true;
                StringBuilder sb3222 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                sb3222.append(m0Var);
                sb3222.append(", elapsedMs=");
                cameraFlipElapsedMs = j40Var222.getCameraFlipElapsedMs();
                sb3222.append(cameraFlipElapsedMs);
                org.telegram.messenger.a8.b(sb3222.toString());
                org.telegram.ui.Components.j40.m(j40Var222);
                t0Var2.o();
                return;
        }
    }

    public /* synthetic */ a60(Object obj, boolean z10, Object obj2, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }

    public /* synthetic */ a60(org.telegram.ui.ActionBar.s1 s1Var, boolean z10, Activity activity) {
        this.a = 9;
        this.d = s1Var;
        this.b = z10;
        this.c = activity;
    }
}
