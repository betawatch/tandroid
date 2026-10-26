package org.telegram.ui;

import android.app.Activity;
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
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BetaUpdate;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.webrtc.EglRenderer;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d80(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0526 A[Catch: Exception -> 0x0415, TryCatch #6 {Exception -> 0x0415, blocks: (B:223:0x0404, B:225:0x040a, B:227:0x0418, B:229:0x0425, B:230:0x0428, B:232:0x0435, B:234:0x043d, B:236:0x044e, B:238:0x0454, B:240:0x045c, B:242:0x0464, B:291:0x0526, B:293:0x052b, B:294:0x052e, B:282:0x0511, B:285:0x0501, B:286:0x0517), top: B:222:0x0404 }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x052b A[Catch: Exception -> 0x0415, TryCatch #6 {Exception -> 0x0415, blocks: (B:223:0x0404, B:225:0x040a, B:227:0x0418, B:229:0x0425, B:230:0x0428, B:232:0x0435, B:234:0x043d, B:236:0x044e, B:238:0x0454, B:240:0x045c, B:242:0x0464, B:291:0x0526, B:293:0x052b, B:294:0x052e, B:282:0x0511, B:285:0x0501, B:286:0x0517), top: B:222:0x0404 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c10;
        String formatPluralString;
        int i10;
        ?? r72;
        BufferedInputStream bufferedInputStream;
        ZipOutputStream zipOutputStream;
        boolean z10;
        boolean z11;
        int i11;
        TLRPC.WallPaperSettings wallPaperSettings;
        boolean z12;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        TLRPC.Document document;
        int i12;
        long cameraFlipElapsedMs;
        int i13 = 2;
        int i14 = 1;
        switch (this.a) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.c;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.d;
                boolean z13 = this.b;
                e2Var.dismiss();
                if (z13) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new c80(languageSelectActivity, 1), 10L);
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.d;
                boolean z14 = this.b;
                Pattern pattern = LaunchActivity.D1;
                launchActivity.v0(r2Var, z14, false);
                return;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) this.c;
                boolean z15 = this.b;
                BetaUpdate betaUpdate = (BetaUpdate) this.d;
                Pattern pattern2 = LaunchActivity.D1;
                BetaUpdate update = ApplicationLoader.applicationLoaderInstance.getUpdate();
                if (update == null || ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    return;
                }
                if (z15 || betaUpdate == null || update.higherThan(betaUpdate)) {
                    ApplicationLoader.applicationLoaderInstance.showCustomUpdateAppPopup(launchActivity2, update, launchActivity2.O);
                    return;
                }
                return;
            case 3:
                in0.Z((in0) this.c, this.b, (String) this.d);
                return;
            case 4:
                um0 um0Var = (um0) this.c;
                boolean z16 = this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                in0 in0Var = um0Var.e;
                if (z16) {
                    i10 = ((org.telegram.ui.ActionBar.r2) in0Var).currentAccount;
                    UserConfig.getInstance(i10).resetSavedPassword();
                    in0Var.N0 = 0;
                    in0Var.S1();
                    ViewGroup[] viewGroupArr = in0Var.Z;
                    if (viewGroupArr == null || viewGroupArr[0].getVisibility() != 0) {
                        return;
                    }
                    in0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(in0Var.Y[0]);
                    return;
                }
                in0Var.N1(true, false);
                if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                    in0Var.A1(true);
                    return;
                }
                if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    in0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                if (intValue < 60) {
                    c10 = 0;
                    formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                } else {
                    c10 = 0;
                    formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                }
                String string = LocaleController.getString(R.string.AppName);
                int i15 = R.string.FloodWaitTime;
                Object[] objArr = new Object[1];
                objArr[c10] = formatPluralString;
                in0Var.M1(string, LocaleController.formatString("FloodWaitTime", i15, objArr));
                return;
            case 5:
                rq0.V((rq0) this.c, (TLObject) this.d, this.b);
                return;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                boolean z17 = this.b;
                View view = (View) this.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!z17) {
                    photoViewer.getClass();
                    view.setVisibility(8);
                }
                photoViewer.u3();
                return;
            case 7:
                PhotoViewer photoViewer2 = (PhotoViewer) this.c;
                String str = (String) this.d;
                boolean z18 = this.b;
                if (str.equals(photoViewer2.C4.getImageKey())) {
                    photoViewer2.w4 = z18 ? 1 : 0;
                    photoViewer2.x4 = str;
                    return;
                }
                return;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                boolean z19 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (!z19) {
                    int i16 = ProfileActivity.R6;
                } else if (profileActivity.R4 == -1) {
                    org.telegram.ui.Components.bi0 bi0Var = profileActivity.Z;
                    if (bi0Var != null) {
                        org.telegram.ui.Components.yh0 j10 = org.telegram.ui.Components.bi0.j(7, bi0Var.a);
                        if (j10 == null || !j10.s) {
                            r72 = 0;
                        } else {
                            r72 = 0;
                            j10.s = false;
                            bi0Var.invalidate();
                        }
                        if (zArr[r72]) {
                            org.telegram.ui.Components.bi0 bi0Var2 = profileActivity.Z;
                            bi0Var2.I = true;
                            bi0Var2.o(7, r72);
                            profileActivity.Z.o(9, true);
                            org.telegram.ui.Components.bi0 bi0Var3 = profileActivity.Z;
                            if (bi0Var3.I) {
                                bi0Var3.I = r72;
                                bi0Var3.d();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                profileActivity.v5();
                j01 j01Var = profileActivity.d;
                if (j01Var != null) {
                    j01Var.l();
                    return;
                }
                return;
            case 9:
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.d;
                boolean z20 = this.b;
                Activity activity = (Activity) this.c;
                int i17 = ProfileActivity.R6;
                try {
                    File logsDir = AndroidUtilities.getLogsDir();
                    if (logsDir == null) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.r1(e2Var2, 0));
                        return;
                    }
                    File file = new File(logsDir, "logs.zip");
                    if (file.exists()) {
                        file.delete();
                    }
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : logsDir.listFiles()) {
                        arrayList.add(file2);
                    }
                    File file3 = new File(ApplicationLoader.getFilesDirFixed(), "malformed_database/");
                    if (file3.exists() && file3.isDirectory()) {
                        for (File file4 : file3.listFiles()) {
                            arrayList.add(file4);
                        }
                    }
                    boolean[] zArr2 = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                        int i18 = 65536;
                        try {
                            byte[] bArr = new byte[65536];
                            int i19 = 0;
                            while (i19 < arrayList.size()) {
                                File file5 = (File) arrayList.get(i19);
                                if (!file5.getName().contains("cache4")) {
                                    if (!z20) {
                                        if (file5.getName().contains("_mtproto")) {
                                        }
                                    }
                                    if (currentTimeMillis - file5.lastModified() > 86400000) {
                                        i19++;
                                        i18 = 65536;
                                    }
                                }
                                if (file5.exists() && !file5.isDirectory()) {
                                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file5), i18);
                                    try {
                                        zipOutputStream.putNextEntry(new ZipEntry(file5.getName()));
                                        while (true) {
                                            int read = bufferedInputStream2.read(bArr, 0, i18);
                                            if (read != -1) {
                                                zipOutputStream.write(bArr, 0, read);
                                                i18 = 65536;
                                            } else {
                                                bufferedInputStream2.close();
                                            }
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        bufferedInputStream = bufferedInputStream2;
                                        try {
                                            e.printStackTrace();
                                            if (bufferedInputStream != null) {
                                                bufferedInputStream.close();
                                            }
                                            if (zipOutputStream != null) {
                                                zipOutputStream.close();
                                            }
                                            AndroidUtilities.runOnUIThread(new ag0(e2Var2, zArr2, activity, file, 12));
                                            return;
                                        } catch (Throwable th2) {
                                            th = th2;
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
                                        bufferedInputStream = bufferedInputStream2;
                                        if (bufferedInputStream != null) {
                                        }
                                        if (zipOutputStream != null) {
                                        }
                                        throw th;
                                    }
                                }
                                i19++;
                                i18 = 65536;
                            }
                            zArr2[0] = true;
                        } catch (Exception e10) {
                            e = e10;
                            bufferedInputStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            bufferedInputStream = null;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        bufferedInputStream = null;
                        zipOutputStream = null;
                    } catch (Throwable th5) {
                        th = th5;
                        bufferedInputStream = null;
                        zipOutputStream = null;
                    }
                    zipOutputStream.close();
                    AndroidUtilities.runOnUIThread(new ag0(e2Var2, zArr2, activity, file, 12));
                    return;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    return;
                }
            case 10:
                m31.P((m31) this.c, this.b, (org.telegram.ui.Components.t90) this.d);
                return;
            case 11:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) this.c, this.b, (byte[]) this.d);
                return;
            case 12:
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) this.c;
                di.d1 d1Var = (di.d1) this.d;
                boolean z21 = this.b;
                if (v0Var.b) {
                    return;
                }
                try {
                    if (d1Var.b == ((org.telegram.ui.Wallet.p0) d1Var.c).l()) {
                        a8.af.b = v0Var;
                        LaunchActivity launchActivity3 = LaunchActivity.I1;
                        int i20 = Build.VERSION.SDK_INT;
                        if (launchActivity3 != null && !launchActivity3.isFinishing() && !launchActivity3.isDestroyed() && !launchActivity3.s().P()) {
                            v0Var.e = launchActivity3;
                            try {
                                if (z21) {
                                    v0Var.a();
                                } else if (i20 >= 30) {
                                    v0Var.d();
                                } else {
                                    v0Var.b();
                                }
                            } catch (Exception e13) {
                                FileLog.e(e13);
                                v0Var.a();
                            }
                        }
                        v0Var.c("AUTH_UNAVAILABLE");
                    } else {
                        v0Var.c("STORAGE_CANCELED");
                    }
                    return;
                } catch (Exception e14) {
                    FileLog.e(e14);
                    v0Var.c("AUTH_UNAVAILABLE");
                    return;
                }
            case 13:
                ag.b1 b1Var = (ag.b1) this.c;
                boolean z22 = this.b;
                org.telegram.ui.Wallet.q2 q2Var = (org.telegram.ui.Wallet.q2) this.d;
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (b1Var.b) {
                    return;
                }
                if (U == null) {
                    b1Var.b();
                    return;
                } else {
                    if (!z22) {
                        U.presentFragment(q2Var);
                        return;
                    }
                    org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
                    p2Var.a = true;
                    U.showAsSheet(q2Var, p2Var);
                    return;
                }
            case 14:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z23 = this.b;
                ArrayList arrayList2 = wallpapersListActivity.X;
                HashMap hashMap = wallpapersListActivity.Y;
                int i21 = wallpapersListActivity.r;
                HashMap hashMap2 = wallpapersListActivity.d0;
                ArrayList arrayList3 = wallpapersListActivity.a0;
                if (tLObject instanceof TL_account.TL_wallPapers) {
                    TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
                    wallpapersListActivity.c0.clear();
                    hashMap2.clear();
                    if (i21 != 1 && i21 != 2) {
                        arrayList3.clear();
                        hashMap.clear();
                        arrayList2.clear();
                        arrayList2.addAll(tL_wallPapers.wallpapers);
                        arrayList3.addAll(wallpapersListActivity.b0);
                    }
                    int size = tL_wallPapers.wallpapers.size();
                    int i22 = 0;
                    while (i22 < size) {
                        TLRPC.WallPaper wallPaper = tL_wallPapers.wallpapers.get(i22);
                        if ("fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                            z11 = z23;
                        } else if (!(wallPaper instanceof TLRPC.TL_wallPaper) || (wallPaper.document instanceof TLRPC.TL_documentEmpty)) {
                            z11 = z23;
                            if (wallPaper.settings.background_color != 0 && (org.telegram.ui.ActionBar.y6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0)) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                                int i23 = wallPaperSettings4.second_background_color;
                                bi1 bi1Var = (i23 == 0 || (i11 = wallPaperSettings4.third_background_color) == 0) ? new bi1(wallPaperSettings4.background_color, i23, null, wallPaperSettings4.rotation) : new bi1(null, wallPaperSettings4.background_color, i23, i11, wallPaperSettings4.fourth_background_color);
                                bi1Var.a = wallPaper.slug;
                                bi1Var.h = wallPaperSettings4.intensity / 100.0f;
                                bi1Var.f = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                                bi1Var.l = wallPaper;
                                arrayList3.add(bi1Var);
                                i22++;
                                z23 = z11;
                                i13 = 2;
                                i14 = 1;
                            }
                        } else {
                            hashMap.put(wallPaper.slug, wallPaper);
                            if (!wallPaper.pattern || (document = wallPaper.document) == null) {
                                z11 = z23;
                            } else {
                                z11 = z23;
                                if (!hashMap2.containsKey(Long.valueOf(document.id))) {
                                    wallpapersListActivity.c0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.id), wallPaper);
                                }
                            }
                            if (i21 != i14 && ((!(z12 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i21 != i13 || z12) && (org.telegram.ui.ActionBar.y6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                                arrayList3.add(wallPaper);
                            }
                        }
                        i22++;
                        z23 = z11;
                        i13 = 2;
                        i14 = 1;
                    }
                    z10 = z23;
                    wallpapersListActivity.B0();
                    wallpapersListActivity.getMessagesStorage().putWallpapers(tL_wallPapers.wallpapers, 1);
                } else {
                    z10 = z23;
                }
                org.telegram.ui.ActionBar.e2 e2Var3 = wallpapersListActivity.L;
                if (e2Var3 != null) {
                    e2Var3.dismiss();
                    if (z10) {
                        return;
                    }
                    wallpapersListActivity.F.y0(0);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.c;
                String str2 = (String) this.d;
                boolean z24 = this.b;
                org.telegram.ui.web.d dVar = lVar.w;
                ArrayList arrayList4 = lVar.x;
                arrayList4.clear();
                org.telegram.ui.web.n1.a().getClass();
                ArrayList arrayList5 = new ArrayList();
                try {
                    JSONArray jSONArray = new JSONArray(str2).getJSONArray(1);
                    for (int i24 = 0; i24 < jSONArray.length(); i24++) {
                        arrayList5.add(jSONArray.getString(i24));
                    }
                } catch (Exception e15) {
                    FileLog.e((Throwable) e15, false);
                    try {
                        JSONArray jSONArray2 = new JSONObject(str2).getJSONObject("gossip").getJSONArray("results");
                        for (int i25 = 0; i25 < jSONArray2.length(); i25++) {
                            arrayList5.add(jSONArray2.getJSONObject(i25).getString("key"));
                        }
                    } catch (Exception e16) {
                        FileLog.e((Throwable) e16, false);
                        try {
                            JSONArray jSONArray3 = new JSONArray(str2);
                            for (int i26 = 0; i26 < jSONArray3.length(); i26++) {
                                String string2 = jSONArray3.getJSONObject(i26).getString("phrase");
                                if (!TextUtils.isEmpty(string2)) {
                                    arrayList5.add(string2);
                                }
                            }
                        } catch (Exception e17) {
                            FileLog.e((Throwable) e17, false);
                        }
                    }
                }
                arrayList4.addAll(arrayList5);
                dVar.g3.O(true);
                if (z24 != (!arrayList4.isEmpty())) {
                    dVar.f3.h1(0, 0);
                    return;
                }
                return;
            case 16:
                ((EglRenderer) this.c).lambda$releaseEglSurface$5(this.b, (Runnable) this.d);
                return;
            case 17:
                vi.s sVar = (vi.s) this.c;
                boolean z25 = this.b;
                Runnable runnable = (Runnable) this.d;
                if (sVar.f) {
                    sVar.F = z25;
                    Size size2 = z25 ? sVar.c : sVar.b;
                    sVar.a = size2;
                    int i27 = z25 ? sVar.l : sVar.k;
                    sVar.j = i27;
                    sVar.m = z25 ? sVar.o : sVar.n;
                    vi.c0 c0Var = sVar.N;
                    if (c0Var != null) {
                        c0Var.c = size2;
                        c0Var.d = i27;
                        c0Var.q = vi.c0.j(size2, i27, false);
                        c0Var.r = vi.c0.j(size2, i27, true);
                        c0Var.A = false;
                        c0Var.z = 0L;
                    }
                    sVar.Q = -1L;
                    sVar.u0 = runnable;
                    sVar.i.b("GL dual input selected: input=" + (z25 ? 1 : 0));
                    return;
                }
                return;
            default:
                li.e3 e3Var = (li.e3) this.c;
                vi.h hVar = (vi.h) this.d;
                boolean z26 = this.b;
                vi.s0 s0Var = (vi.s0) e3Var.b;
                int i28 = s0Var.W;
                if (i28 == 7 || i28 == 8 || i28 == 9 || i28 == 10) {
                    return;
                }
                vi.l0 l0Var = hVar.a;
                vi.n0 n0Var = hVar.c;
                vi.m0 m0Var = hVar.b;
                s0Var.q = l0Var;
                s0Var.r = m0Var;
                s0Var.s = n0Var;
                s0Var.t = hVar.f;
                if (l0Var != vi.l0.a) {
                    if (hVar.g) {
                        i12 = 2;
                        s0Var.X = i12;
                        s0Var.n();
                        vi.n nVar = s0Var.m;
                        StringBuilder sb2 = new StringBuilder("camera configured: facing=");
                        sb2.append(l0Var);
                        sb2.append(", mode=");
                        sb2.append(m0Var);
                        sb2.append(", preview=");
                        sb2.append(hVar.d);
                        sb2.append(", recording=");
                        sb2.append(hVar.e);
                        sb2.append(", fps=");
                        sb2.append(n0Var.a);
                        sb2.append(", maxZoom=");
                        sb2.append(s0Var.t);
                        sb2.append(", flash=");
                        int i29 = s0Var.X;
                        sb2.append(i29 == 1 ? i29 != 2 ? i29 != 3 ? BuildConfig.BETA_URL : "SCREEN" : "TORCH" : "NONE");
                        sb2.append(", switch=");
                        sb2.append(z26);
                        nVar.b(sb2.toString());
                        if (z26) {
                        }
                        s0Var.w = false;
                        org.telegram.ui.Components.n60 n60Var = (org.telegram.ui.Components.n60) s0Var.d.b;
                        n60Var.o0 = true;
                        StringBuilder sb3 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                        sb3.append(l0Var);
                        sb3.append(", elapsedMs=");
                        cameraFlipElapsedMs = n60Var.getCameraFlipElapsedMs();
                        sb3.append(cameraFlipElapsedMs);
                        FileLog.d(sb3.toString());
                        org.telegram.ui.Components.n60.l(n60Var);
                        s0Var.o();
                        return;
                    }
                    i12 = 1;
                    s0Var.X = i12;
                    s0Var.n();
                    vi.n nVar2 = s0Var.m;
                    StringBuilder sb22 = new StringBuilder("camera configured: facing=");
                    sb22.append(l0Var);
                    sb22.append(", mode=");
                    sb22.append(m0Var);
                    sb22.append(", preview=");
                    sb22.append(hVar.d);
                    sb22.append(", recording=");
                    sb22.append(hVar.e);
                    sb22.append(", fps=");
                    sb22.append(n0Var.a);
                    sb22.append(", maxZoom=");
                    sb22.append(s0Var.t);
                    sb22.append(", flash=");
                    int i292 = s0Var.X;
                    sb22.append(i292 == 1 ? i292 != 2 ? i292 != 3 ? BuildConfig.BETA_URL : "SCREEN" : "TORCH" : "NONE");
                    sb22.append(", switch=");
                    sb22.append(z26);
                    nVar2.b(sb22.toString());
                    if (z26) {
                    }
                    s0Var.w = false;
                    org.telegram.ui.Components.n60 n60Var2 = (org.telegram.ui.Components.n60) s0Var.d.b;
                    n60Var2.o0 = true;
                    StringBuilder sb32 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                    sb32.append(l0Var);
                    sb32.append(", elapsedMs=");
                    cameraFlipElapsedMs = n60Var2.getCameraFlipElapsedMs();
                    sb32.append(cameraFlipElapsedMs);
                    FileLog.d(sb32.toString());
                    org.telegram.ui.Components.n60.l(n60Var2);
                    s0Var.o();
                    return;
                }
                if (s0Var.f != null) {
                    i12 = 3;
                    s0Var.X = i12;
                    s0Var.n();
                    vi.n nVar22 = s0Var.m;
                    StringBuilder sb222 = new StringBuilder("camera configured: facing=");
                    sb222.append(l0Var);
                    sb222.append(", mode=");
                    sb222.append(m0Var);
                    sb222.append(", preview=");
                    sb222.append(hVar.d);
                    sb222.append(", recording=");
                    sb222.append(hVar.e);
                    sb222.append(", fps=");
                    sb222.append(n0Var.a);
                    sb222.append(", maxZoom=");
                    sb222.append(s0Var.t);
                    sb222.append(", flash=");
                    int i2922 = s0Var.X;
                    sb222.append(i2922 == 1 ? i2922 != 2 ? i2922 != 3 ? BuildConfig.BETA_URL : "SCREEN" : "TORCH" : "NONE");
                    sb222.append(", switch=");
                    sb222.append(z26);
                    nVar22.b(sb222.toString());
                    if (!z26 || s0Var.w) {
                        s0Var.w = false;
                        org.telegram.ui.Components.n60 n60Var22 = (org.telegram.ui.Components.n60) s0Var.d.b;
                        n60Var22.o0 = true;
                        StringBuilder sb322 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                        sb322.append(l0Var);
                        sb322.append(", elapsedMs=");
                        cameraFlipElapsedMs = n60Var22.getCameraFlipElapsedMs();
                        sb322.append(cameraFlipElapsedMs);
                        FileLog.d(sb322.toString());
                        org.telegram.ui.Components.n60.l(n60Var22);
                        s0Var.o();
                        return;
                    }
                    return;
                }
                i12 = 1;
                s0Var.X = i12;
                s0Var.n();
                vi.n nVar222 = s0Var.m;
                StringBuilder sb2222 = new StringBuilder("camera configured: facing=");
                sb2222.append(l0Var);
                sb2222.append(", mode=");
                sb2222.append(m0Var);
                sb2222.append(", preview=");
                sb2222.append(hVar.d);
                sb2222.append(", recording=");
                sb2222.append(hVar.e);
                sb2222.append(", fps=");
                sb2222.append(n0Var.a);
                sb2222.append(", maxZoom=");
                sb2222.append(s0Var.t);
                sb2222.append(", flash=");
                int i29222 = s0Var.X;
                sb2222.append(i29222 == 1 ? i29222 != 2 ? i29222 != 3 ? BuildConfig.BETA_URL : "SCREEN" : "TORCH" : "NONE");
                sb2222.append(", switch=");
                sb2222.append(z26);
                nVar222.b(sb2222.toString());
                if (z26) {
                }
                s0Var.w = false;
                org.telegram.ui.Components.n60 n60Var222 = (org.telegram.ui.Components.n60) s0Var.d.b;
                n60Var222.o0 = true;
                StringBuilder sb3222 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                sb3222.append(l0Var);
                sb3222.append(", elapsedMs=");
                cameraFlipElapsedMs = n60Var222.getCameraFlipElapsedMs();
                sb3222.append(cameraFlipElapsedMs);
                FileLog.d(sb3222.toString());
                org.telegram.ui.Components.n60.l(n60Var222);
                s0Var.o();
                return;
        }
    }

    public /* synthetic */ d80(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }

    public /* synthetic */ d80(org.telegram.ui.ActionBar.e2 e2Var, boolean z10, Activity activity) {
        this.a = 9;
        this.d = e2Var;
        this.b = z10;
        this.c = activity;
    }
}
