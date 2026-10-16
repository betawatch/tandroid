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
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gm0(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0559 A[Catch: Exception -> 0x0449, TryCatch #1 {Exception -> 0x0449, blocks: (B:229:0x0438, B:231:0x043e, B:233:0x044c, B:235:0x0459, B:236:0x045c, B:238:0x0469, B:240:0x0471, B:242:0x0482, B:244:0x0488, B:246:0x0490, B:248:0x0498, B:297:0x0559, B:299:0x055e, B:300:0x0561, B:288:0x0545, B:291:0x0535, B:292:0x054b), top: B:228:0x0438 }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x055e A[Catch: Exception -> 0x0449, TryCatch #1 {Exception -> 0x0449, blocks: (B:229:0x0438, B:231:0x043e, B:233:0x044c, B:235:0x0459, B:236:0x045c, B:238:0x0469, B:240:0x0471, B:242:0x0482, B:244:0x0488, B:246:0x0490, B:248:0x0498, B:297:0x0559, B:299:0x055e, B:300:0x0561, B:288:0x0545, B:291:0x0535, B:292:0x054b), top: B:228:0x0438 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:194:0x03f5 -> B:184:0x040e). Please report as a decompilation issue!!! */
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
                sn0.Y((sn0) this.c, this.b, (String) this.d);
                return;
            case 1:
                en0 en0Var = (en0) this.c;
                boolean z13 = this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                sn0 sn0Var = en0Var.e;
                if (z13) {
                    i10 = ((org.telegram.ui.ActionBar.m2) sn0Var).currentAccount;
                    UserConfig.getInstance(i10).resetSavedPassword();
                    sn0Var.N0 = 0;
                    sn0Var.Q1();
                    ViewGroup[] viewGroupArr = sn0Var.Z;
                    if (viewGroupArr == null || viewGroupArr[0].getVisibility() != 0) {
                        return;
                    }
                    sn0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(sn0Var.Y[0]);
                    return;
                }
                sn0Var.M1(true, false);
                if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                    sn0Var.z1(true);
                    return;
                }
                if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    sn0Var.L1(LocaleController.getString(R.string.AppName), tL_error.text);
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
                sn0Var.L1(string, LocaleController.formatString("FloodWaitTime", i15, objArr));
                return;
            case 2:
                fr0.U((fr0) this.c, (TLObject) this.d, this.b);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                boolean z14 = this.b;
                View view = (View) this.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!z14) {
                    photoViewer.getClass();
                    view.setVisibility(8);
                }
                photoViewer.s3();
                return;
            case 4:
                PhotoViewer photoViewer2 = (PhotoViewer) this.c;
                String str = (String) this.d;
                boolean z15 = this.b;
                if (str.equals(photoViewer2.C4.getImageKey())) {
                    photoViewer2.w4 = z15 ? 1 : 0;
                    photoViewer2.x4 = str;
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                boolean z16 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (!z16 || profileActivity.L4 != -1) {
                    profileActivity.j5();
                    e11 e11Var = profileActivity.d;
                    if (e11Var != null) {
                        e11Var.l();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.ei0 ei0Var = profileActivity.a0;
                if (ei0Var != null) {
                    org.telegram.ui.Components.bi0 j10 = org.telegram.ui.Components.ei0.j(7, ei0Var.a);
                    if (j10 == null || !j10.s) {
                        r72 = 0;
                    } else {
                        r72 = 0;
                        j10.s = false;
                        ei0Var.invalidate();
                    }
                    if (zArr[r72]) {
                        org.telegram.ui.Components.ei0 ei0Var2 = profileActivity.a0;
                        ei0Var2.I = true;
                        ei0Var2.o(7, r72);
                        profileActivity.a0.o(9, true);
                        org.telegram.ui.Components.ei0 ei0Var3 = profileActivity.a0;
                        if (ei0Var3.I) {
                            ei0Var3.I = r72;
                            ei0Var3.d();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.c;
                boolean z17 = this.b;
                Activity activity = (Activity) this.d;
                try {
                    File logsDir = AndroidUtilities.getLogsDir();
                    if (logsDir == null) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p1(a2Var, 0));
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
                        int i16 = 65536;
                        try {
                            byte[] bArr = new byte[65536];
                            int i17 = 0;
                            while (i17 < arrayList.size()) {
                                File file5 = (File) arrayList.get(i17);
                                if (!file5.getName().contains("cache4")) {
                                    if (!z17) {
                                        if (file5.getName().contains("_mtproto")) {
                                        }
                                    }
                                    if (currentTimeMillis - file5.lastModified() > 86400000) {
                                        i17++;
                                        i16 = 65536;
                                    }
                                }
                                if (file5.exists() && !file5.isDirectory()) {
                                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file5), i16);
                                    try {
                                        zipOutputStream.putNextEntry(new ZipEntry(file5.getName()));
                                        while (true) {
                                            int read = bufferedInputStream2.read(bArr, 0, i16);
                                            if (read != -1) {
                                                zipOutputStream.write(bArr, 0, read);
                                                i16 = 65536;
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
                                            AndroidUtilities.runOnUIThread(new yw0(a2Var, zArr2, activity, file, 3));
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
                                i17++;
                                i16 = 65536;
                            }
                            zArr2[0] = true;
                        } catch (Exception e7) {
                            e = e7;
                            bufferedInputStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            bufferedInputStream = null;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        bufferedInputStream = null;
                        zipOutputStream = null;
                    } catch (Throwable th5) {
                        th = th5;
                        bufferedInputStream = null;
                        zipOutputStream = null;
                    }
                    zipOutputStream.close();
                    AndroidUtilities.runOnUIThread(new yw0(a2Var, zArr2, activity, file, 3));
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            case 7:
                b51.Q((b51) this.c, this.b, (org.telegram.ui.Components.g90) this.d);
                return;
            case 8:
                TwoStepVerificationActivity.X((TwoStepVerificationActivity) this.c, this.b, (byte[]) this.d);
                return;
            case 9:
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) this.c;
                bi.p1 p1Var = (bi.p1) this.d;
                boolean z18 = this.b;
                if (v0Var.b) {
                    return;
                }
                try {
                    if (p1Var.b == ((org.telegram.ui.Wallet.p0) p1Var.c).l()) {
                        w7.h6.b = v0Var;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        int i18 = Build.VERSION.SDK_INT;
                        if (launchActivity != null && !launchActivity.isFinishing() && !launchActivity.isDestroyed() && !launchActivity.s().P()) {
                            v0Var.e = launchActivity;
                            try {
                                if (z18) {
                                    v0Var.a();
                                } else if (i18 >= 30) {
                                    v0Var.d();
                                } else {
                                    v0Var.b();
                                }
                            } catch (Exception e12) {
                                FileLog.e(e12);
                                v0Var.a();
                            }
                        }
                        v0Var.c("AUTH_UNAVAILABLE");
                    } else {
                        v0Var.c("STORAGE_CANCELED");
                    }
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    v0Var.c("AUTH_UNAVAILABLE");
                    return;
                }
            case 10:
                mb0 mb0Var = (mb0) this.c;
                boolean z19 = this.b;
                org.telegram.ui.Wallet.q2 q2Var = (org.telegram.ui.Wallet.q2) this.d;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (mb0Var.b) {
                    return;
                }
                if (U == null) {
                    mb0Var.b();
                    return;
                } else {
                    if (!z19) {
                        U.presentFragment(q2Var);
                        return;
                    }
                    org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
                    k2Var.a = true;
                    U.showAsSheet(q2Var, k2Var);
                    return;
                }
            case 11:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z20 = this.b;
                ArrayList arrayList2 = wallpapersListActivity.b0;
                HashMap hashMap = wallpapersListActivity.c0;
                int i19 = wallpapersListActivity.v;
                HashMap hashMap2 = wallpapersListActivity.h0;
                ArrayList arrayList3 = wallpapersListActivity.e0;
                if (tLObject instanceof TL_account.TL_wallPapers) {
                    TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
                    wallpapersListActivity.g0.clear();
                    hashMap2.clear();
                    if (i19 != 1 && i19 != 2) {
                        arrayList3.clear();
                        hashMap.clear();
                        arrayList2.clear();
                        arrayList2.addAll(tL_wallPapers.wallpapers);
                        arrayList3.addAll(wallpapersListActivity.f0);
                    }
                    int size = tL_wallPapers.wallpapers.size();
                    int i20 = 0;
                    while (i20 < size) {
                        TLRPC.WallPaper wallPaper = tL_wallPapers.wallpapers.get(i20);
                        if ("fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                            z11 = z20;
                        } else if (!(wallPaper instanceof TLRPC.TL_wallPaper) || (wallPaper.document instanceof TLRPC.TL_documentEmpty)) {
                            z11 = z20;
                            if (wallPaper.settings.background_color != 0 && (org.telegram.ui.ActionBar.g6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0)) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                                int i21 = wallPaperSettings4.second_background_color;
                                oj1 oj1Var = (i21 == 0 || (i11 = wallPaperSettings4.third_background_color) == 0) ? new oj1(wallPaperSettings4.background_color, i21, null, wallPaperSettings4.rotation) : new oj1(null, wallPaperSettings4.background_color, i21, i11, wallPaperSettings4.fourth_background_color);
                                oj1Var.a = wallPaper.slug;
                                oj1Var.h = wallPaperSettings4.intensity / 100.0f;
                                oj1Var.f = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                                oj1Var.l = wallPaper;
                                arrayList3.add(oj1Var);
                                i20++;
                                z20 = z11;
                                i13 = 2;
                                i14 = 1;
                            }
                        } else {
                            hashMap.put(wallPaper.slug, wallPaper);
                            if (!wallPaper.pattern || (document = wallPaper.document) == null) {
                                z11 = z20;
                            } else {
                                z11 = z20;
                                if (!hashMap2.containsKey(Long.valueOf(document.id))) {
                                    wallpapersListActivity.g0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.id), wallPaper);
                                }
                            }
                            if (i19 != i14 && ((!(z12 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i19 != i13 || z12) && (org.telegram.ui.ActionBar.g6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                                arrayList3.add(wallPaper);
                            }
                        }
                        i20++;
                        z20 = z11;
                        i13 = 2;
                        i14 = 1;
                    }
                    z10 = z20;
                    wallpapersListActivity.A0();
                    wallpapersListActivity.getMessagesStorage().putWallpapers(tL_wallPapers.wallpapers, 1);
                } else {
                    z10 = z20;
                }
                org.telegram.ui.ActionBar.a2 a2Var2 = wallpapersListActivity.P;
                if (a2Var2 != null) {
                    a2Var2.dismiss();
                    if (z10) {
                        return;
                    }
                    wallpapersListActivity.H.x0(0);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.c;
                String str2 = (String) this.d;
                boolean z21 = this.b;
                org.telegram.ui.web.c cVar = kVar.w;
                ArrayList arrayList4 = kVar.x;
                arrayList4.clear();
                org.telegram.ui.web.o1.a().getClass();
                ArrayList arrayList5 = new ArrayList();
                try {
                    JSONArray jSONArray = new JSONArray(str2).getJSONArray(1);
                    for (int i22 = 0; i22 < jSONArray.length(); i22++) {
                        arrayList5.add(jSONArray.getString(i22));
                    }
                } catch (Exception e14) {
                    FileLog.e((Throwable) e14, false);
                    try {
                        JSONArray jSONArray2 = new JSONObject(str2).getJSONObject("gossip").getJSONArray("results");
                        for (int i23 = 0; i23 < jSONArray2.length(); i23++) {
                            arrayList5.add(jSONArray2.getJSONObject(i23).getString("key"));
                        }
                    } catch (Exception e15) {
                        FileLog.e((Throwable) e15, false);
                        try {
                            JSONArray jSONArray3 = new JSONArray(str2);
                            for (int i24 = 0; i24 < jSONArray3.length(); i24++) {
                                String string2 = jSONArray3.getJSONObject(i24).getString("phrase");
                                if (!TextUtils.isEmpty(string2)) {
                                    arrayList5.add(string2);
                                }
                            }
                        } catch (Exception e16) {
                            FileLog.e((Throwable) e16, false);
                        }
                    }
                }
                arrayList4.addAll(arrayList5);
                cVar.W2.N(true);
                if (z21 != (!arrayList4.isEmpty())) {
                    cVar.V2.h1(0, 0);
                    return;
                }
                return;
            case 13:
                ((EglRenderer) this.c).lambda$releaseEglSurface$5(this.b, (Runnable) this.d);
                return;
            case 14:
                ri.s sVar = (ri.s) this.c;
                boolean z22 = this.b;
                Runnable runnable = (Runnable) this.d;
                if (sVar.f) {
                    sVar.F = z22;
                    Size size2 = z22 ? sVar.c : sVar.b;
                    sVar.a = size2;
                    int i25 = z22 ? sVar.l : sVar.k;
                    sVar.j = i25;
                    sVar.m = z22 ? sVar.o : sVar.n;
                    ri.b0 b0Var = sVar.N;
                    if (b0Var != null) {
                        b0Var.c = size2;
                        b0Var.d = i25;
                        b0Var.q = ri.b0.j(size2, i25, false);
                        b0Var.r = ri.b0.j(size2, i25, true);
                        b0Var.A = false;
                        b0Var.z = 0L;
                    }
                    sVar.Q = -1L;
                    sVar.u0 = runnable;
                    sVar.i.b("GL dual input selected: input=" + (z22 ? 1 : 0));
                    return;
                }
                return;
            case 15:
                m.h hVar = (m.h) this.c;
                ri.h hVar2 = (ri.h) this.d;
                boolean z23 = this.b;
                ri.r0 r0Var = (ri.r0) hVar.b;
                int i26 = r0Var.W;
                if (i26 == 7 || i26 == 8 || i26 == 9 || i26 == 10) {
                    return;
                }
                ri.k0 k0Var = hVar2.a;
                ri.m0 m0Var = hVar2.c;
                ri.l0 l0Var = hVar2.b;
                r0Var.q = k0Var;
                r0Var.r = l0Var;
                r0Var.s = m0Var;
                r0Var.t = hVar2.f;
                if (k0Var != ri.k0.a) {
                    if (hVar2.g) {
                        i12 = 2;
                        r0Var.X = i12;
                        r0Var.n();
                        ri.n nVar = r0Var.m;
                        StringBuilder sb2 = new StringBuilder("camera configured: facing=");
                        sb2.append(k0Var);
                        sb2.append(", mode=");
                        sb2.append(l0Var);
                        sb2.append(", preview=");
                        sb2.append(hVar2.d);
                        sb2.append(", recording=");
                        sb2.append(hVar2.e);
                        sb2.append(", fps=");
                        sb2.append(m0Var.a);
                        sb2.append(", maxZoom=");
                        sb2.append(r0Var.t);
                        sb2.append(", flash=");
                        int i27 = r0Var.X;
                        sb2.append(i27 == 1 ? i27 != 2 ? i27 != 3 ? BuildConfig.BETA_URL : "SCREEN" : "TORCH" : "NONE");
                        sb2.append(", switch=");
                        sb2.append(z23);
                        nVar.b(sb2.toString());
                        if (z23) {
                        }
                        r0Var.w = false;
                        org.telegram.ui.Components.o60 o60Var = (org.telegram.ui.Components.o60) r0Var.d.b;
                        o60Var.o0 = true;
                        StringBuilder sb3 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                        sb3.append(k0Var);
                        sb3.append(", elapsedMs=");
                        cameraFlipElapsedMs = o60Var.getCameraFlipElapsedMs();
                        sb3.append(cameraFlipElapsedMs);
                        FileLog.d(sb3.toString());
                        org.telegram.ui.Components.o60.l(o60Var);
                        r0Var.o();
                        return;
                    }
                    i12 = 1;
                    r0Var.X = i12;
                    r0Var.n();
                    ri.n nVar2 = r0Var.m;
                    StringBuilder sb22 = new StringBuilder("camera configured: facing=");
                    sb22.append(k0Var);
                    sb22.append(", mode=");
                    sb22.append(l0Var);
                    sb22.append(", preview=");
                    sb22.append(hVar2.d);
                    sb22.append(", recording=");
                    sb22.append(hVar2.e);
                    sb22.append(", fps=");
                    sb22.append(m0Var.a);
                    sb22.append(", maxZoom=");
                    sb22.append(r0Var.t);
                    sb22.append(", flash=");
                    int i272 = r0Var.X;
                    sb22.append(i272 == 1 ? i272 != 2 ? i272 != 3 ? BuildConfig.BETA_URL : "SCREEN" : "TORCH" : "NONE");
                    sb22.append(", switch=");
                    sb22.append(z23);
                    nVar2.b(sb22.toString());
                    if (z23) {
                    }
                    r0Var.w = false;
                    org.telegram.ui.Components.o60 o60Var2 = (org.telegram.ui.Components.o60) r0Var.d.b;
                    o60Var2.o0 = true;
                    StringBuilder sb32 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                    sb32.append(k0Var);
                    sb32.append(", elapsedMs=");
                    cameraFlipElapsedMs = o60Var2.getCameraFlipElapsedMs();
                    sb32.append(cameraFlipElapsedMs);
                    FileLog.d(sb32.toString());
                    org.telegram.ui.Components.o60.l(o60Var2);
                    r0Var.o();
                    return;
                }
                if (r0Var.f != null) {
                    i12 = 3;
                    r0Var.X = i12;
                    r0Var.n();
                    ri.n nVar22 = r0Var.m;
                    StringBuilder sb222 = new StringBuilder("camera configured: facing=");
                    sb222.append(k0Var);
                    sb222.append(", mode=");
                    sb222.append(l0Var);
                    sb222.append(", preview=");
                    sb222.append(hVar2.d);
                    sb222.append(", recording=");
                    sb222.append(hVar2.e);
                    sb222.append(", fps=");
                    sb222.append(m0Var.a);
                    sb222.append(", maxZoom=");
                    sb222.append(r0Var.t);
                    sb222.append(", flash=");
                    int i2722 = r0Var.X;
                    sb222.append(i2722 == 1 ? i2722 != 2 ? i2722 != 3 ? BuildConfig.BETA_URL : "SCREEN" : "TORCH" : "NONE");
                    sb222.append(", switch=");
                    sb222.append(z23);
                    nVar22.b(sb222.toString());
                    if (!z23 || r0Var.w) {
                        r0Var.w = false;
                        org.telegram.ui.Components.o60 o60Var22 = (org.telegram.ui.Components.o60) r0Var.d.b;
                        o60Var22.o0 = true;
                        StringBuilder sb322 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                        sb322.append(k0Var);
                        sb322.append(", elapsedMs=");
                        cameraFlipElapsedMs = o60Var22.getCameraFlipElapsedMs();
                        sb322.append(cameraFlipElapsedMs);
                        FileLog.d(sb322.toString());
                        org.telegram.ui.Components.o60.l(o60Var22);
                        r0Var.o();
                        return;
                    }
                    return;
                }
                i12 = 1;
                r0Var.X = i12;
                r0Var.n();
                ri.n nVar222 = r0Var.m;
                StringBuilder sb2222 = new StringBuilder("camera configured: facing=");
                sb2222.append(k0Var);
                sb2222.append(", mode=");
                sb2222.append(l0Var);
                sb2222.append(", preview=");
                sb2222.append(hVar2.d);
                sb2222.append(", recording=");
                sb2222.append(hVar2.e);
                sb2222.append(", fps=");
                sb2222.append(m0Var.a);
                sb2222.append(", maxZoom=");
                sb2222.append(r0Var.t);
                sb2222.append(", flash=");
                int i27222 = r0Var.X;
                sb2222.append(i27222 == 1 ? i27222 != 2 ? i27222 != 3 ? BuildConfig.BETA_URL : "SCREEN" : "TORCH" : "NONE");
                sb2222.append(", switch=");
                sb2222.append(z23);
                nVar222.b(sb2222.toString());
                if (z23) {
                }
                r0Var.w = false;
                org.telegram.ui.Components.o60 o60Var222 = (org.telegram.ui.Components.o60) r0Var.d.b;
                o60Var222.o0 = true;
                StringBuilder sb3222 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                sb3222.append(k0Var);
                sb3222.append(", elapsedMs=");
                cameraFlipElapsedMs = o60Var222.getCameraFlipElapsedMs();
                sb3222.append(cameraFlipElapsedMs);
                FileLog.d(sb3222.toString());
                org.telegram.ui.Components.o60.l(o60Var222);
                r0Var.o();
                return;
            case 16:
                ((Utilities.Callback2) this.c).run(Boolean.valueOf(this.b), (String) this.d);
                return;
            case 17:
                ((org.telegram.ui.Components.c90) this.c).run(Boolean.valueOf(this.b), (String) this.d);
                return;
            default:
                ((rh.r) this.c).run(Boolean.valueOf(this.b), (String) this.d);
                return;
        }
    }

    public /* synthetic */ gm0(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }
}
