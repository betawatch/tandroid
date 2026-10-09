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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ha0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ha0(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0413 A[Catch: Exception -> 0x0304, TryCatch #10 {Exception -> 0x0304, blocks: (B:173:0x02f3, B:175:0x02f9, B:177:0x0307, B:179:0x0314, B:180:0x0317, B:182:0x0324, B:184:0x032c, B:186:0x033d, B:188:0x0343, B:190:0x034b, B:192:0x0353, B:241:0x0413, B:243:0x0418, B:244:0x041b, B:232:0x0400, B:235:0x03f0, B:236:0x0406), top: B:172:0x02f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0418 A[Catch: Exception -> 0x0304, TryCatch #10 {Exception -> 0x0304, blocks: (B:173:0x02f3, B:175:0x02f9, B:177:0x0307, B:179:0x0314, B:180:0x0317, B:182:0x0324, B:184:0x032c, B:186:0x033d, B:188:0x0343, B:190:0x034b, B:192:0x0353, B:241:0x0413, B:243:0x0418, B:244:0x041b, B:232:0x0400, B:235:0x03f0, B:236:0x0406), top: B:172:0x02f3 }] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x02b0 -> B:134:0x02c9). Please report as a decompilation issue!!! */
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
        boolean z10;
        ij1 ij1Var;
        boolean z11;
        int i11;
        TLRPC.WallPaperSettings wallPaperSettings;
        boolean z12;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        TLRPC.Document document;
        int i12 = 1;
        switch (this.a) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                boolean z13 = this.b;
                BetaUpdate betaUpdate = (BetaUpdate) this.d;
                Pattern pattern = LaunchActivity.B1;
                BetaUpdate update = ApplicationLoader.applicationLoaderInstance.getUpdate();
                if (update == null || ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    return;
                }
                if (z13 || betaUpdate == null || update.higherThan(betaUpdate)) {
                    ApplicationLoader.applicationLoaderInstance.showCustomUpdateAppPopup(launchActivity, update, launchActivity.O);
                    return;
                }
                return;
            case 1:
                nn0.Y((nn0) this.c, this.b, (String) this.d);
                return;
            case 2:
                zm0 zm0Var = (zm0) this.c;
                boolean z14 = this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                nn0 nn0Var = zm0Var.e;
                if (z14) {
                    i10 = ((org.telegram.ui.ActionBar.n2) nn0Var).currentAccount;
                    UserConfig.getInstance(i10).resetSavedPassword();
                    nn0Var.N0 = 0;
                    nn0Var.Q1();
                    ViewGroup[] viewGroupArr = nn0Var.Z;
                    if (viewGroupArr == null || viewGroupArr[0].getVisibility() != 0) {
                        return;
                    }
                    nn0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(nn0Var.Y[0]);
                    return;
                }
                nn0Var.M1(true, false);
                if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                    nn0Var.z1(true);
                    return;
                }
                if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    nn0Var.L1(LocaleController.getString(R.string.AppName), tL_error.text);
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
                int i13 = R.string.FloodWaitTime;
                Object[] objArr = new Object[1];
                objArr[c10] = formatPluralString;
                nn0Var.L1(string, LocaleController.formatString("FloodWaitTime", i13, objArr));
                return;
            case 3:
                br0.U((br0) this.c, (TLObject) this.d, this.b);
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                boolean z15 = this.b;
                View view = (View) this.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!z15) {
                    photoViewer.getClass();
                    view.setVisibility(8);
                }
                photoViewer.s3();
                return;
            case 5:
                PhotoViewer photoViewer2 = (PhotoViewer) this.c;
                String str = (String) this.d;
                boolean z16 = this.b;
                if (str.equals(photoViewer2.C4.getImageKey())) {
                    photoViewer2.w4 = z16 ? 1 : 0;
                    photoViewer2.x4 = str;
                    return;
                }
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                boolean z17 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (!z17 || profileActivity.L4 != -1) {
                    profileActivity.j5();
                    y01 y01Var = profileActivity.d;
                    if (y01Var != null) {
                        y01Var.l();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.ii0 ii0Var = profileActivity.a0;
                if (ii0Var != null) {
                    org.telegram.ui.Components.fi0 j3 = org.telegram.ui.Components.ii0.j(7, ii0Var.a);
                    if (j3 == null || !j3.s) {
                        r62 = 0;
                    } else {
                        r62 = 0;
                        j3.s = false;
                        ii0Var.invalidate();
                    }
                    if (zArr[r62]) {
                        org.telegram.ui.Components.ii0 ii0Var2 = profileActivity.a0;
                        ii0Var2.I = true;
                        ii0Var2.o(7, r62);
                        profileActivity.a0.o(9, true);
                        org.telegram.ui.Components.ii0 ii0Var3 = profileActivity.a0;
                        if (ii0Var3.I) {
                            ii0Var3.I = r62;
                            ii0Var3.d();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.c;
                boolean z18 = this.b;
                Activity activity = (Activity) this.d;
                try {
                    File logsDir = AndroidUtilities.getLogsDir();
                    if (logsDir == null) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q1(b2Var, 0));
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
                        int i14 = 65536;
                        try {
                            byte[] bArr = new byte[65536];
                            int i15 = 0;
                            while (i15 < arrayList.size()) {
                                File file5 = (File) arrayList.get(i15);
                                if (!file5.getName().contains("cache4")) {
                                    if (!z18) {
                                        if (file5.getName().contains("_mtproto")) {
                                        }
                                    }
                                    if (currentTimeMillis - file5.lastModified() > 86400000) {
                                        i15++;
                                        i14 = 65536;
                                    }
                                }
                                if (file5.exists() && !file5.isDirectory()) {
                                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file5), i14);
                                    try {
                                        zipOutputStream.putNextEntry(new ZipEntry(file5.getName()));
                                        while (true) {
                                            int read = bufferedInputStream2.read(bArr, 0, i14);
                                            if (read != -1) {
                                                zipOutputStream.write(bArr, 0, read);
                                                i14 = 65536;
                                            } else {
                                                bufferedInputStream2.close();
                                            }
                                        }
                                    } catch (Exception e7) {
                                        e = e7;
                                        bufferedInputStream = bufferedInputStream2;
                                        try {
                                            e.printStackTrace();
                                            if (bufferedInputStream != null) {
                                                bufferedInputStream.close();
                                            }
                                            if (zipOutputStream != null) {
                                                zipOutputStream.close();
                                            }
                                            AndroidUtilities.runOnUIThread(new rr0(b2Var, zArr2, activity, file, 6));
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
                                i15++;
                                i14 = 65536;
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
                    AndroidUtilities.runOnUIThread(new rr0(b2Var, zArr2, activity, file, 6));
                    return;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    return;
                }
            case 8:
                u41.Q((u41) this.c, this.b, (org.telegram.ui.Components.ci0) this.d);
                return;
            case 9:
                TwoStepVerificationActivity.X((TwoStepVerificationActivity) this.c, this.b, (byte[]) this.d);
                return;
            case 10:
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) this.c;
                ai.z1 z1Var = (ai.z1) this.d;
                boolean z19 = this.b;
                if (v0Var.b) {
                    return;
                }
                try {
                    if (z1Var.b == ((org.telegram.ui.Wallet.p0) z1Var.c).l()) {
                        w7.f6.b = v0Var;
                        LaunchActivity launchActivity2 = LaunchActivity.G1;
                        int i16 = Build.VERSION.SDK_INT;
                        if (launchActivity2 != null && !launchActivity2.isFinishing() && !launchActivity2.isDestroyed() && !launchActivity2.s().P()) {
                            v0Var.e = launchActivity2;
                            try {
                                if (z19) {
                                    v0Var.a();
                                } else if (i16 >= 30) {
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
            case 11:
                ib0 ib0Var = (ib0) this.c;
                boolean z20 = this.b;
                org.telegram.ui.Wallet.p2 p2Var = (org.telegram.ui.Wallet.p2) this.d;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (ib0Var.b) {
                    return;
                }
                if (U == null) {
                    ib0Var.b();
                    return;
                } else {
                    if (!z20) {
                        U.presentFragment(p2Var);
                        return;
                    }
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.a = true;
                    U.showAsSheet(p2Var, l2Var);
                    return;
                }
            case 12:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z21 = this.b;
                ArrayList arrayList2 = wallpapersListActivity.b0;
                HashMap hashMap = wallpapersListActivity.c0;
                int i17 = wallpapersListActivity.v;
                HashMap hashMap2 = wallpapersListActivity.h0;
                ArrayList arrayList3 = wallpapersListActivity.e0;
                if (tLObject instanceof TL_account.TL_wallPapers) {
                    TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
                    wallpapersListActivity.g0.clear();
                    hashMap2.clear();
                    int i18 = 2;
                    if (i17 != 1 && i17 != 2) {
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
                        if (!"fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                            if ((wallPaper instanceof TLRPC.TL_wallPaper) && !(wallPaper.document instanceof TLRPC.TL_documentEmpty)) {
                                hashMap.put(wallPaper.slug, wallPaper);
                                if (wallPaper.pattern && (document = wallPaper.document) != null && !hashMap2.containsKey(Long.valueOf(document.id))) {
                                    wallpapersListActivity.g0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.id), wallPaper);
                                }
                                if (i17 != i12 && ((!(z12 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i17 != i18 || z12) && (org.telegram.ui.ActionBar.i6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                                    arrayList3.add(wallPaper);
                                }
                            } else if (wallPaper.settings.background_color != 0 && (org.telegram.ui.ActionBar.i6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0)) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                                int i20 = wallPaperSettings4.second_background_color;
                                if (i20 == 0 || (i11 = wallPaperSettings4.third_background_color) == 0) {
                                    z11 = z21;
                                    ij1Var = new ij1(wallPaperSettings4.background_color, i20, null, wallPaperSettings4.rotation);
                                } else {
                                    ij1Var = new ij1(null, wallPaperSettings4.background_color, i20, i11, wallPaperSettings4.fourth_background_color);
                                    z11 = z21;
                                }
                                ij1Var.a = wallPaper.slug;
                                ij1Var.h = wallPaperSettings4.intensity / 100.0f;
                                ij1Var.f = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                                ij1Var.l = wallPaper;
                                arrayList3.add(ij1Var);
                                i19++;
                                z21 = z11;
                                i12 = 1;
                                i18 = 2;
                            }
                        }
                        z11 = z21;
                        i19++;
                        z21 = z11;
                        i12 = 1;
                        i18 = 2;
                    }
                    z10 = z21;
                    wallpapersListActivity.A0();
                    wallpapersListActivity.getMessagesStorage().putWallpapers(tL_wallPapers.wallpapers, 1);
                } else {
                    z10 = z21;
                }
                org.telegram.ui.ActionBar.b2 b2Var2 = wallpapersListActivity.P;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    if (z10) {
                        return;
                    }
                    wallpapersListActivity.H.x0(0);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.c;
                String str2 = (String) this.d;
                boolean z22 = this.b;
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
                } catch (Exception e15) {
                    FileLog.e((Throwable) e15, false);
                    try {
                        JSONArray jSONArray2 = new JSONObject(str2).getJSONObject("gossip").getJSONArray("results");
                        for (int i22 = 0; i22 < jSONArray2.length(); i22++) {
                            arrayList5.add(jSONArray2.getJSONObject(i22).getString("key"));
                        }
                    } catch (Exception e16) {
                        FileLog.e((Throwable) e16, false);
                        try {
                            JSONArray jSONArray3 = new JSONArray(str2);
                            for (int i23 = 0; i23 < jSONArray3.length(); i23++) {
                                String string2 = jSONArray3.getJSONObject(i23).getString("phrase");
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
                cVar.W2.N(true);
                if (z22 != (!arrayList4.isEmpty())) {
                    cVar.V2.h1(0, 0);
                    return;
                }
                return;
            case 14:
                ((EglRenderer) this.c).lambda$releaseEglSurface$5(this.b, (Runnable) this.d);
                return;
            case 15:
                ((Utilities.Callback2) this.c).run(Boolean.valueOf(this.b), (String) this.d);
                return;
            case 16:
                ((org.telegram.ui.Components.f90) this.c).run(Boolean.valueOf(this.b), (String) this.d);
                return;
            default:
                ((qh.r) this.c).run(Boolean.valueOf(this.b), (String) this.d);
                return;
        }
    }

    public /* synthetic */ ha0(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }
}
