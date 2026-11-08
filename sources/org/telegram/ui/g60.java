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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g60(Object obj, Object obj2, boolean z9, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = z9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x052b A[Catch: Exception -> 0x042e, TRY_ENTER, TryCatch #0 {Exception -> 0x042e, blocks: (B:230:0x041d, B:232:0x0423, B:234:0x0431, B:236:0x043e, B:237:0x0441, B:239:0x044e, B:241:0x0456, B:243:0x0467, B:245:0x046d, B:247:0x0475, B:249:0x047d, B:299:0x0541, B:301:0x0546, B:302:0x0549, B:289:0x052b, B:292:0x051b, B:293:0x0531), top: B:229:0x041d }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0541 A[Catch: Exception -> 0x042e, TryCatch #0 {Exception -> 0x042e, blocks: (B:230:0x041d, B:232:0x0423, B:234:0x0431, B:236:0x043e, B:237:0x0441, B:239:0x044e, B:241:0x0456, B:243:0x0467, B:245:0x046d, B:247:0x0475, B:249:0x047d, B:299:0x0541, B:301:0x0546, B:302:0x0549, B:289:0x052b, B:292:0x051b, B:293:0x0531), top: B:229:0x041d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0546 A[Catch: Exception -> 0x042e, TryCatch #0 {Exception -> 0x042e, blocks: (B:230:0x041d, B:232:0x0423, B:234:0x0431, B:236:0x043e, B:237:0x0441, B:239:0x044e, B:241:0x0456, B:243:0x0467, B:245:0x046d, B:247:0x0475, B:249:0x047d, B:299:0x0541, B:301:0x0546, B:302:0x0549, B:289:0x052b, B:292:0x051b, B:293:0x0531), top: B:229:0x041d }] */
    /* JADX WARN: Type inference failed for: r7v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:187:0x03b3 -> B:177:0x03ce). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.messenger.h1 e10;
        String str;
        int i7;
        char c10;
        String G;
        int i10;
        ?? r72;
        BufferedInputStream bufferedInputStream;
        ZipOutputStream zipOutputStream;
        BufferedInputStream bufferedInputStream2;
        boolean z9;
        pc1 pc1Var;
        boolean z10;
        int i11;
        TLRPC.WallPaperSettings wallPaperSettings;
        boolean z11;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        TLRPC.Document document;
        int i12;
        long cameraFlipElapsedMs;
        int i13 = 1;
        switch (this.a) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.c;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.d;
                boolean z12 = this.b;
                u1Var.dismiss();
                if (z12) {
                    return;
                }
                org.telegram.messenger.g0.i3(new f60(languageSelectActivity, 1), 10L);
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.d;
                boolean z13 = this.b;
                String str2 = LaunchActivity.B1;
                launchActivity.u0(f2Var, z13, false);
                return;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) this.c;
                boolean z14 = this.b;
                org.telegram.messenger.d1 d1Var = (org.telegram.messenger.d1) this.d;
                String str3 = LaunchActivity.B1;
                org.telegram.messenger.d1 d1Var2 = (!((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q() || (str = (e10 = org.telegram.messenger.h1.e()).a) == null || (i7 = e10.b) == 0) ? null : new org.telegram.messenger.d1(str, i7, e10.c);
                if (d1Var2 != null) {
                    if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q() ? false : org.telegram.messenger.h1.e().j) {
                        return;
                    }
                    if (z14 || d1Var == null || (org.telegram.messenger.iz.U(d1Var2.b, d1Var.b) && d1Var2.a > d1Var.a)) {
                        ((ApplicationLoaderImpl) org.telegram.messenger.t0.a).getClass();
                        try {
                            new org.telegram.ui.Components.x41(launchActivity2, d1Var2).show();
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
                bk0.d0((bk0) this.c, this.b, (String) this.d);
                return;
            case 4:
                pj0 pj0Var = (pj0) this.c;
                boolean z15 = this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                bk0 bk0Var = pj0Var.e;
                if (z15) {
                    i10 = ((org.telegram.ui.ActionBar.f2) bk0Var).currentAccount;
                    org.telegram.messenger.p10.i(i10).u();
                    bk0Var.N0 = 0;
                    bk0Var.W1();
                    ViewGroup[] viewGroupArr = bk0Var.Z;
                    if (viewGroupArr == null || viewGroupArr[0].getVisibility() != 0) {
                        return;
                    }
                    bk0Var.Y[0].requestFocus();
                    org.telegram.messenger.g0.K3(bk0Var.Y[0]);
                    return;
                }
                bk0Var.R1(true, false);
                if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                    bk0Var.E1(true);
                    return;
                }
                if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    bk0Var.Q1(org.telegram.messenger.id.M0(R.string.AppName, null), tL_error.text);
                    return;
                }
                int intValue = Utilities.z(tL_error.text).intValue();
                if (intValue < 60) {
                    c10 = 0;
                    G = org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]);
                } else {
                    c10 = 0;
                    G = org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0]);
                }
                String M0 = org.telegram.messenger.id.M0(R.string.AppName, null);
                Object[] objArr = new Object[1];
                objArr[c10] = G;
                bk0Var.Q1(M0, org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750687, objArr));
                return;
            case 5:
                xm0.Z((xm0) this.c, (TLObject) this.d, this.b);
                return;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                boolean z16 = this.b;
                View view = (View) this.d;
                Drawable[] drawableArr = PhotoViewer.Y8;
                if (!z16) {
                    photoViewer.getClass();
                    view.setVisibility(8);
                }
                photoViewer.p3();
                return;
            case 7:
                PhotoViewer photoViewer2 = (PhotoViewer) this.c;
                String str4 = (String) this.d;
                boolean z17 = this.b;
                if (str4.equals(photoViewer2.B4.Q)) {
                    photoViewer2.v4 = z17 ? 1 : 0;
                    photoViewer2.w4 = str4;
                    return;
                }
                return;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                boolean z18 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (!z18) {
                    RectF rectF = ProfileActivity.S6;
                } else if (profileActivity.L4 == -1) {
                    org.telegram.ui.Components.ef0 ef0Var = profileActivity.Z;
                    if (ef0Var != null) {
                        org.telegram.ui.Components.bf0 i14 = org.telegram.ui.Components.ef0.i(7, ef0Var.a);
                        if (i14 == null || !i14.s) {
                            r72 = 0;
                        } else {
                            r72 = 0;
                            i14.s = false;
                            ef0Var.invalidate();
                        }
                        if (zArr[r72]) {
                            org.telegram.ui.Components.ef0 ef0Var2 = profileActivity.Z;
                            ef0Var2.F = true;
                            ef0Var2.o(7, r72);
                            profileActivity.Z.o(9, true);
                            org.telegram.ui.Components.ef0 ef0Var3 = profileActivity.Z;
                            if (ef0Var3.F) {
                                ef0Var3.F = r72;
                                ef0Var3.d();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                profileActivity.J5();
                jw0 jw0Var = profileActivity.d;
                if (jw0Var != null) {
                    jw0Var.f();
                    return;
                }
                return;
            case 9:
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) this.d;
                boolean z19 = this.b;
                Activity activity = (Activity) this.c;
                RectF rectF2 = ProfileActivity.S6;
                try {
                    File P0 = org.telegram.messenger.g0.P0();
                    if (P0 == null) {
                        org.telegram.messenger.g0.h3(new bi.r4(u1Var2, 2));
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
                                    if (!z19) {
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
                                                bufferedInputStream2.close();
                                            }
                                            if (zipOutputStream != null) {
                                                zipOutputStream.close();
                                            }
                                            org.telegram.messenger.g0.h3(new jo0(u1Var2, zArr2, activity, file, 4));
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
                            }
                            if (zipOutputStream != null) {
                            }
                            org.telegram.messenger.g0.h3(new jo0(u1Var2, zArr2, activity, file, 4));
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
                    org.telegram.messenger.g0.h3(new jo0(u1Var2, zArr2, activity, file, 4));
                    return;
                } catch (Exception e15) {
                    e15.printStackTrace();
                    return;
                }
            case 10:
                org.telegram.ui.Components.m20 m20Var = (org.telegram.ui.Components.m20) this.c;
                boolean z20 = this.b;
                org.telegram.ui.Components.v80 v80Var = (org.telegram.ui.Components.v80) this.d;
                if (z20) {
                    org.telegram.messenger.qp.s1(m20Var.a).o0(true);
                    v80Var.run();
                } else {
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T == null) {
                        return;
                    } else {
                        T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(3)));
                    }
                }
                m20Var.dismiss();
                return;
            case 11:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) this.c, this.b, (byte[]) this.d);
                return;
            case 12:
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) this.c;
                di.c1 c1Var = (di.c1) this.d;
                boolean z21 = this.b;
                if (v0Var.b) {
                    return;
                }
                try {
                    if (c1Var.b == ((org.telegram.ui.Wallet.q0) c1Var.c).l()) {
                        c8.va.b = v0Var;
                        LaunchActivity launchActivity3 = LaunchActivity.G1;
                        int i17 = Build.VERSION.SDK_INT;
                        if (launchActivity3 != null && !launchActivity3.isFinishing() && !launchActivity3.isDestroyed() && !launchActivity3.s().P()) {
                            v0Var.e = launchActivity3;
                            try {
                                if (z21) {
                                    v0Var.a();
                                } else if (i17 >= 30) {
                                    v0Var.d();
                                } else {
                                    v0Var.b();
                                }
                            } catch (Exception e16) {
                                org.telegram.messenger.a8.g(e16, true);
                                v0Var.a();
                            }
                        }
                        v0Var.c("AUTH_UNAVAILABLE");
                    } else {
                        v0Var.c("STORAGE_CANCELED");
                    }
                    return;
                } catch (Exception e17) {
                    org.telegram.messenger.a8.g(e17, true);
                    v0Var.c("AUTH_UNAVAILABLE");
                    return;
                }
            case 13:
                bg.v0 v0Var2 = (bg.v0) this.c;
                boolean z22 = this.b;
                org.telegram.ui.Wallet.g3 g3Var = (org.telegram.ui.Wallet.g3) this.d;
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (v0Var2.b) {
                    return;
                }
                if (T2 == null) {
                    v0Var2.a();
                    return;
                } else {
                    if (!z22) {
                        T2.presentFragment(g3Var);
                        return;
                    }
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                    d2Var.a = true;
                    T2.showAsSheet(g3Var, d2Var);
                    return;
                }
            case 14:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z23 = this.b;
                ArrayList arrayList2 = wallpapersListActivity.X;
                HashMap hashMap = wallpapersListActivity.Y;
                int i18 = wallpapersListActivity.r;
                HashMap hashMap2 = wallpapersListActivity.d0;
                ArrayList arrayList3 = wallpapersListActivity.a0;
                if (tLObject instanceof TL_account.TL_wallPapers) {
                    TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
                    wallpapersListActivity.c0.clear();
                    hashMap2.clear();
                    if (i18 != 1 && i18 != 2) {
                        arrayList3.clear();
                        hashMap.clear();
                        arrayList2.clear();
                        arrayList2.addAll(tL_wallPapers.wallpapers);
                        arrayList3.addAll(wallpapersListActivity.b0);
                    }
                    int size = tL_wallPapers.wallpapers.size();
                    int i19 = 0;
                    while (i19 < size) {
                        TLRPC.WallPaper wallPaper = tL_wallPapers.wallpapers.get(i19);
                        if (!"fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                            if ((wallPaper instanceof TLRPC.TL_wallPaper) && !(wallPaper.document instanceof TLRPC.TL_documentEmpty)) {
                                hashMap.put(wallPaper.slug, wallPaper);
                                if (wallPaper.pattern && (document = wallPaper.document) != null && !hashMap2.containsKey(Long.valueOf(document.id))) {
                                    wallpapersListActivity.c0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.id), wallPaper);
                                }
                                if (i18 != i13 && ((!(z11 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i18 != 2 || z11) && (org.telegram.ui.ActionBar.k6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                                    arrayList3.add(wallPaper);
                                }
                            } else if (wallPaper.settings.background_color != 0 && (org.telegram.ui.ActionBar.k6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0)) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                                int i20 = wallPaperSettings4.second_background_color;
                                if (i20 == 0 || (i11 = wallPaperSettings4.third_background_color) == 0) {
                                    z10 = z23;
                                    pc1Var = new pc1(wallPaperSettings4.background_color, i20, wallPaperSettings4.rotation, null);
                                } else {
                                    pc1Var = new pc1(null, wallPaperSettings4.background_color, i20, i11, wallPaperSettings4.fourth_background_color);
                                    z10 = z23;
                                }
                                pc1Var.a = wallPaper.slug;
                                pc1Var.h = wallPaperSettings4.intensity / 100.0f;
                                pc1Var.f = org.telegram.messenger.g0.s1(wallPaperSettings4.rotation, false);
                                pc1Var.l = wallPaper;
                                arrayList3.add(pc1Var);
                                i19++;
                                z23 = z10;
                                i13 = 1;
                            }
                        }
                        z10 = z23;
                        i19++;
                        z23 = z10;
                        i13 = 1;
                    }
                    z9 = z23;
                    wallpapersListActivity.F0();
                    wallpapersListActivity.getMessagesStorage().p1(1, tL_wallPapers.wallpapers);
                } else {
                    z9 = z23;
                }
                org.telegram.ui.ActionBar.u1 u1Var3 = wallpapersListActivity.L;
                if (u1Var3 != null) {
                    u1Var3.dismiss();
                    if (z9) {
                        return;
                    }
                    wallpapersListActivity.F.y0(0);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.web.j jVar = (org.telegram.ui.web.j) this.c;
                String str5 = (String) this.d;
                boolean z24 = this.b;
                fi.w3 w3Var = jVar.x;
                ArrayList arrayList4 = jVar.y;
                arrayList4.clear();
                org.telegram.ui.web.f1.a().getClass();
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
                w3Var.f3.O(true);
                if (z24 != (!arrayList4.isEmpty())) {
                    w3Var.e3.h1(0, 0);
                    return;
                }
                return;
            case 16:
                ((EglRenderer) this.c).lambda$releaseEglSurface$5(this.b, (Runnable) this.d);
                return;
            case 17:
                wi.t tVar = (wi.t) this.c;
                boolean z25 = this.b;
                Runnable runnable = (Runnable) this.d;
                if (tVar.f) {
                    tVar.F = z25;
                    Size size2 = z25 ? tVar.c : tVar.b;
                    tVar.a = size2;
                    int i24 = z25 ? tVar.l : tVar.k;
                    tVar.j = i24;
                    tVar.m = z25 ? tVar.o : tVar.n;
                    wi.d0 d0Var = tVar.N;
                    if (d0Var != null) {
                        d0Var.c = size2;
                        d0Var.d = i24;
                        d0Var.v();
                        d0Var.B = false;
                        d0Var.A = 0L;
                    }
                    tVar.Q = -1L;
                    tVar.v0 = runnable;
                    tVar.i.b("GL dual input selected: input=" + (z25 ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.rt rtVar = (org.telegram.ui.Components.rt) this.c;
                wi.h hVar = (wi.h) this.d;
                boolean z26 = this.b;
                wi.t0 t0Var = (wi.t0) rtVar.b;
                int i25 = t0Var.a0;
                if (i25 == 7 || i25 == 8 || i25 == 9 || i25 == 10) {
                    return;
                }
                wi.m0 m0Var = hVar.a;
                wi.o0 o0Var = hVar.c;
                wi.n0 n0Var = hVar.b;
                t0Var.s = m0Var;
                t0Var.t = n0Var;
                t0Var.u = o0Var;
                t0Var.v = hVar.f;
                if (m0Var != wi.m0.a) {
                    if (hVar.g) {
                        i12 = 2;
                        t0Var.b0 = i12;
                        t0Var.n();
                        wi.o oVar = t0Var.m;
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
                        sb2.append(t0Var.v);
                        sb2.append(", flash=");
                        int i26 = t0Var.b0;
                        sb2.append(i26 == 1 ? i26 != 2 ? i26 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                        sb2.append(", switch=");
                        sb2.append(z26);
                        oVar.b(sb2.toString());
                        if (z26) {
                        }
                        t0Var.y = false;
                        org.telegram.ui.Components.n40 n40Var = (org.telegram.ui.Components.n40) t0Var.d.b;
                        n40Var.p0 = true;
                        StringBuilder sb3 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                        sb3.append(m0Var);
                        sb3.append(", elapsedMs=");
                        cameraFlipElapsedMs = n40Var.getCameraFlipElapsedMs();
                        sb3.append(cameraFlipElapsedMs);
                        org.telegram.messenger.a8.b(sb3.toString());
                        org.telegram.ui.Components.n40.n(n40Var);
                        t0Var.o();
                        return;
                    }
                    i12 = 1;
                    t0Var.b0 = i12;
                    t0Var.n();
                    wi.o oVar2 = t0Var.m;
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
                    sb22.append(t0Var.v);
                    sb22.append(", flash=");
                    int i262 = t0Var.b0;
                    sb22.append(i262 == 1 ? i262 != 2 ? i262 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                    sb22.append(", switch=");
                    sb22.append(z26);
                    oVar2.b(sb22.toString());
                    if (z26) {
                    }
                    t0Var.y = false;
                    org.telegram.ui.Components.n40 n40Var2 = (org.telegram.ui.Components.n40) t0Var.d.b;
                    n40Var2.p0 = true;
                    StringBuilder sb32 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                    sb32.append(m0Var);
                    sb32.append(", elapsedMs=");
                    cameraFlipElapsedMs = n40Var2.getCameraFlipElapsedMs();
                    sb32.append(cameraFlipElapsedMs);
                    org.telegram.messenger.a8.b(sb32.toString());
                    org.telegram.ui.Components.n40.n(n40Var2);
                    t0Var.o();
                    return;
                }
                if (t0Var.f != null) {
                    i12 = 3;
                    t0Var.b0 = i12;
                    t0Var.n();
                    wi.o oVar22 = t0Var.m;
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
                    sb222.append(t0Var.v);
                    sb222.append(", flash=");
                    int i2622 = t0Var.b0;
                    sb222.append(i2622 == 1 ? i2622 != 2 ? i2622 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                    sb222.append(", switch=");
                    sb222.append(z26);
                    oVar22.b(sb222.toString());
                    if (!z26 || t0Var.y) {
                        t0Var.y = false;
                        org.telegram.ui.Components.n40 n40Var22 = (org.telegram.ui.Components.n40) t0Var.d.b;
                        n40Var22.p0 = true;
                        StringBuilder sb322 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                        sb322.append(m0Var);
                        sb322.append(", elapsedMs=");
                        cameraFlipElapsedMs = n40Var22.getCameraFlipElapsedMs();
                        sb322.append(cameraFlipElapsedMs);
                        org.telegram.messenger.a8.b(sb322.toString());
                        org.telegram.ui.Components.n40.n(n40Var22);
                        t0Var.o();
                        return;
                    }
                    return;
                }
                i12 = 1;
                t0Var.b0 = i12;
                t0Var.n();
                wi.o oVar222 = t0Var.m;
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
                sb2222.append(t0Var.v);
                sb2222.append(", flash=");
                int i26222 = t0Var.b0;
                sb2222.append(i26222 == 1 ? i26222 != 2 ? i26222 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                sb2222.append(", switch=");
                sb2222.append(z26);
                oVar222.b(sb2222.toString());
                if (z26) {
                }
                t0Var.y = false;
                org.telegram.ui.Components.n40 n40Var222 = (org.telegram.ui.Components.n40) t0Var.d.b;
                n40Var222.p0 = true;
                StringBuilder sb3222 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                sb3222.append(m0Var);
                sb3222.append(", elapsedMs=");
                cameraFlipElapsedMs = n40Var222.getCameraFlipElapsedMs();
                sb3222.append(cameraFlipElapsedMs);
                org.telegram.messenger.a8.b(sb3222.toString());
                org.telegram.ui.Components.n40.n(n40Var222);
                t0Var.o();
                return;
        }
    }

    public /* synthetic */ g60(Object obj, boolean z9, Object obj2, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = z9;
        this.d = obj2;
    }

    public /* synthetic */ g60(org.telegram.ui.ActionBar.u1 u1Var, boolean z9, Activity activity) {
        this.a = 9;
        this.d = u1Var;
        this.b = z9;
        this.c = activity;
    }
}
