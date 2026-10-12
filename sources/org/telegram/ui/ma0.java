package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.webrtc.EglRenderer;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ma0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ma0(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:251:0x040f A[Catch: Exception -> 0x0302, TryCatch #9 {Exception -> 0x0302, blocks: (B:183:0x02f1, B:185:0x02f7, B:187:0x0305, B:189:0x0312, B:190:0x0315, B:192:0x0322, B:194:0x032a, B:196:0x033b, B:198:0x0341, B:200:0x0349, B:202:0x0351, B:251:0x040f, B:253:0x0414, B:254:0x0417, B:241:0x03fc, B:244:0x03ec, B:245:0x0402), top: B:182:0x02f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0414 A[Catch: Exception -> 0x0302, TryCatch #9 {Exception -> 0x0302, blocks: (B:183:0x02f1, B:185:0x02f7, B:187:0x0305, B:189:0x0312, B:190:0x0315, B:192:0x0322, B:194:0x032a, B:196:0x033b, B:198:0x0341, B:200:0x0349, B:202:0x0351, B:251:0x040f, B:253:0x0414, B:254:0x0417, B:241:0x03fc, B:244:0x03ec, B:245:0x0402), top: B:182:0x02f1 }] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x02af -> B:136:0x02c8). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c10;
        String formatPluralString;
        int i10;
        ?? r62;
        BufferedInputStream bufferedInputStream;
        ZipOutputStream zipOutputStream;
        int i11;
        int i12;
        int i13;
        TLRPC.WallPaperSettings wallPaperSettings;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        TLRPC.Document document;
        int i14 = 1;
        switch (this.a) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.d;
                boolean z11 = this.c;
                Pattern pattern = LaunchActivity.B1;
                launchActivity.q0(m2Var, z11, false);
                return;
            case 1:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                boolean z12 = this.c;
                BetaUpdate betaUpdate = (BetaUpdate) this.d;
                Pattern pattern2 = LaunchActivity.B1;
                BetaUpdate update = ApplicationLoader.applicationLoaderInstance.getUpdate();
                if (update == null || ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    return;
                }
                if (z12 || betaUpdate == null || update.higherThan(betaUpdate)) {
                    ApplicationLoader.applicationLoaderInstance.showCustomUpdateAppPopup(launchActivity2, update, launchActivity2.O);
                    return;
                }
                return;
            case 2:
                un0.Y((un0) this.b, this.c, (String) this.d);
                return;
            case 3:
                fn0 fn0Var = (fn0) this.b;
                boolean z13 = this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                un0 un0Var = fn0Var.e;
                if (z13) {
                    i10 = ((org.telegram.ui.ActionBar.m2) un0Var).currentAccount;
                    UserConfig.getInstance(i10).resetSavedPassword();
                    un0Var.N0 = 0;
                    un0Var.Q1();
                    ViewGroup[] viewGroupArr = un0Var.Z;
                    if (viewGroupArr == null || viewGroupArr[0].getVisibility() != 0) {
                        return;
                    }
                    un0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(un0Var.Y[0]);
                    return;
                }
                un0Var.M1(true, false);
                if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                    un0Var.z1(true);
                    return;
                }
                if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    un0Var.L1(LocaleController.getString(R.string.AppName), tL_error.text);
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
                un0Var.L1(string, LocaleController.formatString("FloodWaitTime", i15, objArr));
                return;
            case 4:
                hr0.U((hr0) this.b, (TLObject) this.d, this.c);
                return;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                boolean z14 = this.c;
                View view = (View) this.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!z14) {
                    photoViewer.getClass();
                    view.setVisibility(8);
                }
                photoViewer.s3();
                return;
            case 6:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                String str = (String) this.d;
                boolean z15 = this.c;
                if (str.equals(photoViewer2.C4.getImageKey())) {
                    photoViewer2.w4 = z15 ? 1 : 0;
                    photoViewer2.x4 = str;
                    return;
                }
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                boolean z16 = this.c;
                boolean[] zArr = (boolean[]) this.d;
                if (!z16 || profileActivity.L4 != -1) {
                    profileActivity.j5();
                    f11 f11Var = profileActivity.d;
                    if (f11Var != null) {
                        f11Var.l();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.ei0 ei0Var = profileActivity.a0;
                if (ei0Var != null) {
                    org.telegram.ui.Components.bi0 j10 = org.telegram.ui.Components.ei0.j(7, ei0Var.a);
                    if (j10 == null || !j10.s) {
                        r62 = 0;
                    } else {
                        r62 = 0;
                        j10.s = false;
                        ei0Var.invalidate();
                    }
                    if (zArr[r62]) {
                        org.telegram.ui.Components.ei0 ei0Var2 = profileActivity.a0;
                        ei0Var2.I = true;
                        ei0Var2.o(7, r62);
                        profileActivity.a0.o(9, true);
                        org.telegram.ui.Components.ei0 ei0Var3 = profileActivity.a0;
                        if (ei0Var3.I) {
                            ei0Var3.I = r62;
                            ei0Var3.d();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.b;
                boolean z17 = this.c;
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
                        i11 = 65536;
                    } catch (Exception e) {
                        e = e;
                        bufferedInputStream = null;
                        zipOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream = null;
                        zipOutputStream = null;
                    }
                    try {
                        byte[] bArr = new byte[65536];
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            File file5 = (File) arrayList.get(i16);
                            if (!file5.getName().contains("cache4")) {
                                if (!z17) {
                                    if (file5.getName().contains("_mtproto")) {
                                    }
                                }
                                if (currentTimeMillis - file5.lastModified() > 86400000) {
                                    i16++;
                                    i11 = 65536;
                                }
                            }
                            if (file5.exists() && !file5.isDirectory()) {
                                bufferedInputStream = new BufferedInputStream(new FileInputStream(file5), i11);
                                try {
                                    try {
                                        zipOutputStream.putNextEntry(new ZipEntry(file5.getName()));
                                        while (true) {
                                            int read = bufferedInputStream.read(bArr, 0, i11);
                                            if (read != -1) {
                                                zipOutputStream.write(bArr, 0, read);
                                                i11 = 65536;
                                            } else {
                                                bufferedInputStream.close();
                                            }
                                        }
                                    } catch (Exception e7) {
                                        e = e7;
                                        e.printStackTrace();
                                        if (bufferedInputStream != null) {
                                            bufferedInputStream.close();
                                        }
                                        if (zipOutputStream != null) {
                                            zipOutputStream.close();
                                        }
                                        AndroidUtilities.runOnUIThread(new ss0(a2Var, zArr2, activity, file, 4));
                                        return;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (bufferedInputStream != null) {
                                        bufferedInputStream.close();
                                    }
                                    if (zipOutputStream != null) {
                                        zipOutputStream.close();
                                    }
                                    throw th;
                                }
                            }
                            i16++;
                            i11 = 65536;
                        }
                        zArr2[0] = true;
                    } catch (Exception e10) {
                        e = e10;
                        bufferedInputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedInputStream = null;
                        if (bufferedInputStream != null) {
                        }
                        if (zipOutputStream != null) {
                        }
                        throw th;
                    }
                    zipOutputStream.close();
                    AndroidUtilities.runOnUIThread(new ss0(a2Var, zArr2, activity, file, 4));
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            case 9:
                b51.Q((b51) this.b, this.c, (org.telegram.ui.Components.f60) this.d);
                return;
            case 10:
                TwoStepVerificationActivity.X((TwoStepVerificationActivity) this.b, this.c, (byte[]) this.d);
                return;
            case 11:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) this.b;
                bi.p1 p1Var = (bi.p1) this.d;
                boolean z18 = this.c;
                if (u0Var.b) {
                    return;
                }
                try {
                    if (p1Var.b == ((org.telegram.ui.Wallet.o0) p1Var.c).l()) {
                        w7.i6.b = u0Var;
                        LaunchActivity launchActivity3 = LaunchActivity.G1;
                        int i17 = Build.VERSION.SDK_INT;
                        if (launchActivity3 != null && !launchActivity3.isFinishing() && !launchActivity3.isDestroyed() && !launchActivity3.s().P()) {
                            u0Var.e = launchActivity3;
                            try {
                                if (z18) {
                                    u0Var.a();
                                } else if (i17 >= 30) {
                                    u0Var.d();
                                } else {
                                    u0Var.b();
                                }
                            } catch (Exception e12) {
                                FileLog.e(e12);
                                u0Var.a();
                            }
                        }
                        u0Var.c("AUTH_UNAVAILABLE");
                    } else {
                        u0Var.c("STORAGE_CANCELED");
                    }
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    u0Var.c("AUTH_UNAVAILABLE");
                    return;
                }
            case 12:
                nb0 nb0Var = (nb0) this.b;
                boolean z19 = this.c;
                org.telegram.ui.Wallet.p2 p2Var = (org.telegram.ui.Wallet.p2) this.d;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (nb0Var.b) {
                    return;
                }
                if (U == null) {
                    nb0Var.b();
                    return;
                } else {
                    if (!z19) {
                        U.presentFragment(p2Var);
                        return;
                    }
                    org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
                    k2Var.a = true;
                    U.showAsSheet(p2Var, k2Var);
                    return;
                }
            case 13:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                TLObject tLObject = (TLObject) this.d;
                boolean z20 = this.c;
                ArrayList arrayList2 = wallpapersListActivity.b0;
                HashMap hashMap = wallpapersListActivity.c0;
                int i18 = wallpapersListActivity.v;
                HashMap hashMap2 = wallpapersListActivity.h0;
                ArrayList arrayList3 = wallpapersListActivity.e0;
                if (tLObject instanceof TL_account.TL_wallPapers) {
                    TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
                    wallpapersListActivity.g0.clear();
                    hashMap2.clear();
                    char c11 = 2;
                    if (i18 != 1 && i18 != 2) {
                        arrayList3.clear();
                        hashMap.clear();
                        arrayList2.clear();
                        arrayList2.addAll(tL_wallPapers.wallpapers);
                        arrayList3.addAll(wallpapersListActivity.f0);
                    }
                    int size = tL_wallPapers.wallpapers.size();
                    int i19 = 0;
                    while (i19 < size) {
                        TLRPC.WallPaper wallPaper = tL_wallPapers.wallpapers.get(i19);
                        if ("fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                            i12 = i19;
                        } else if (!(wallPaper instanceof TLRPC.TL_wallPaper) || (wallPaper.document instanceof TLRPC.TL_documentEmpty)) {
                            i12 = i19;
                            if (wallPaper.settings.background_color != 0 && (org.telegram.ui.ActionBar.g6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0)) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                                int i20 = wallPaperSettings4.second_background_color;
                                pj1 pj1Var = (i20 == 0 || (i13 = wallPaperSettings4.third_background_color) == 0) ? new pj1(wallPaperSettings4.background_color, i20, null, wallPaperSettings4.rotation) : new pj1(null, wallPaperSettings4.background_color, i20, i13, wallPaperSettings4.fourth_background_color);
                                pj1Var.a = wallPaper.slug;
                                pj1Var.h = wallPaperSettings4.intensity / 100.0f;
                                pj1Var.f = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                                pj1Var.l = wallPaper;
                                arrayList3.add(pj1Var);
                            }
                        } else {
                            hashMap.put(wallPaper.slug, wallPaper);
                            if (!wallPaper.pattern || (document = wallPaper.document) == null) {
                                i12 = i19;
                            } else {
                                i12 = i19;
                                if (!hashMap2.containsKey(Long.valueOf(document.id))) {
                                    wallpapersListActivity.g0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.id), wallPaper);
                                }
                            }
                            if (i18 != i14 && ((!(z10 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i18 != 2 || z10) && (org.telegram.ui.ActionBar.g6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                                arrayList3.add(wallPaper);
                            }
                        }
                        i19 = i12 + 1;
                        i14 = 1;
                        c11 = 2;
                    }
                    wallpapersListActivity.A0();
                    wallpapersListActivity.getMessagesStorage().putWallpapers(tL_wallPapers.wallpapers, 1);
                }
                org.telegram.ui.ActionBar.a2 a2Var2 = wallpapersListActivity.P;
                if (a2Var2 != null) {
                    a2Var2.dismiss();
                    if (z20) {
                        return;
                    }
                    wallpapersListActivity.H.x0(0);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.b;
                String str2 = (String) this.d;
                boolean z21 = this.c;
                org.telegram.ui.web.c cVar = kVar.w;
                ArrayList arrayList4 = kVar.x;
                arrayList4.clear();
                org.telegram.ui.web.n1.a().getClass();
                ArrayList arrayList5 = new ArrayList();
                try {
                    JSONArray jSONArray = new JSONArray(str2).getJSONArray(1);
                    for (int i21 = 0; i21 < jSONArray.length(); i21++) {
                        arrayList5.add(jSONArray.getString(i21));
                    }
                } catch (Exception e14) {
                    FileLog.e((Throwable) e14, false);
                    try {
                        JSONArray jSONArray2 = new JSONObject(str2).getJSONObject("gossip").getJSONArray("results");
                        for (int i22 = 0; i22 < jSONArray2.length(); i22++) {
                            arrayList5.add(jSONArray2.getJSONObject(i22).getString("key"));
                        }
                    } catch (Exception e15) {
                        FileLog.e((Throwable) e15, false);
                        try {
                            JSONArray jSONArray3 = new JSONArray(str2);
                            for (int i23 = 0; i23 < jSONArray3.length(); i23++) {
                                String string2 = jSONArray3.getJSONObject(i23).getString("phrase");
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
            case 15:
                ((EglRenderer) this.b).lambda$releaseEglSurface$5(this.c, (Runnable) this.d);
                return;
            case 16:
                ((Utilities.Callback2) this.b).run(Boolean.valueOf(this.c), (String) this.d);
                return;
            case 17:
                ((org.telegram.ui.Components.d90) this.b).run(Boolean.valueOf(this.c), (String) this.d);
                return;
            default:
                ((rh.s) this.b).run(Boolean.valueOf(this.c), (String) this.d);
                return;
        }
    }

    public /* synthetic */ ma0(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = z10;
        this.d = obj2;
    }
}
