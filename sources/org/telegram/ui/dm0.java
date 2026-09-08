package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.webrtc.EglRenderer;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class dm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dm0(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0344 A[Catch: Exception -> 0x0238, TryCatch #6 {Exception -> 0x0238, blocks: (B:135:0x0227, B:137:0x022d, B:139:0x023b, B:141:0x0248, B:142:0x024b, B:144:0x0258, B:146:0x0260, B:148:0x0271, B:150:0x0277, B:152:0x027f, B:154:0x0287, B:203:0x0344, B:205:0x0349, B:206:0x034c, B:193:0x0332, B:196:0x0322, B:197:0x0338), top: B:134:0x0227 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0349 A[Catch: Exception -> 0x0238, TryCatch #6 {Exception -> 0x0238, blocks: (B:135:0x0227, B:137:0x022d, B:139:0x023b, B:141:0x0248, B:142:0x024b, B:144:0x0258, B:146:0x0260, B:148:0x0271, B:150:0x0277, B:152:0x027f, B:154:0x0287, B:203:0x0344, B:205:0x0349, B:206:0x034c, B:193:0x0332, B:196:0x0322, B:197:0x0338), top: B:134:0x0227 }] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c10;
        String formatPluralString;
        int i10;
        ?? r52;
        BufferedInputStream bufferedInputStream;
        ZipOutputStream zipOutputStream;
        int i11;
        int i12;
        TLRPC.WallPaperSettings wallPaperSettings;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        TLRPC.Document document;
        int i13 = this.a;
        int i14 = 1;
        Object obj = this.d;
        boolean z11 = this.b;
        Object obj2 = this.c;
        switch (i13) {
            case 0:
                pn0.Y((pn0) obj2, z11, (String) obj);
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                pn0 pn0Var = ((bn0) obj2).e;
                if (z11) {
                    i10 = ((org.telegram.ui.ActionBar.n2) pn0Var).currentAccount;
                    UserConfig.getInstance(i10).resetSavedPassword();
                    pn0Var.N0 = 0;
                    pn0Var.R1();
                    ViewGroup[] viewGroupArr = pn0Var.Z;
                    if (viewGroupArr == null || viewGroupArr[0].getVisibility() != 0) {
                        return;
                    }
                    pn0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(pn0Var.Y[0]);
                    return;
                }
                pn0Var.N1(true, false);
                if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                    pn0Var.A1(true);
                    return;
                }
                if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    pn0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
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
                pn0Var.M1(string, LocaleController.formatString("FloodWaitTime", i15, objArr));
                return;
            case 2:
                br0.U((br0) obj2, (TLObject) obj, z11);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                View view = (View) obj;
                Drawable[] drawableArr = PhotoViewer.T8;
                if (!z11) {
                    photoViewer.getClass();
                    view.setVisibility(8);
                }
                photoViewer.s3();
                return;
            case 4:
                PhotoViewer photoViewer2 = (PhotoViewer) obj2;
                String str = (String) obj;
                if (str.equals(photoViewer2.C4.getImageKey())) {
                    photoViewer2.w4 = z11 ? 1 : 0;
                    photoViewer2.x4 = str;
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!z11 || profileActivity.L4 != -1) {
                    profileActivity.j5();
                    a11 a11Var = profileActivity.d;
                    if (a11Var != null) {
                        a11Var.l();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.dh0 dh0Var = profileActivity.a0;
                if (dh0Var != null) {
                    org.telegram.ui.Components.ah0 j3 = org.telegram.ui.Components.dh0.j(7, dh0Var.a);
                    if (j3 == null || !j3.s) {
                        r52 = 0;
                    } else {
                        r52 = 0;
                        j3.s = false;
                        dh0Var.invalidate();
                    }
                    if (zArr[r52]) {
                        org.telegram.ui.Components.dh0 dh0Var2 = profileActivity.a0;
                        dh0Var2.I = true;
                        dh0Var2.o(7, r52);
                        profileActivity.a0.o(9, true);
                        org.telegram.ui.Components.dh0 dh0Var3 = profileActivity.a0;
                        if (dh0Var3.I) {
                            dh0Var3.I = r52;
                            dh0Var3.d();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                Activity activity = (Activity) obj;
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
                        int i16 = 65536;
                        try {
                            byte[] bArr = new byte[65536];
                            int i17 = 0;
                            while (i17 < arrayList.size()) {
                                File file5 = (File) arrayList.get(i17);
                                if (!file5.getName().contains("cache4")) {
                                    if (!z11) {
                                        if (file5.getName().contains("_mtproto")) {
                                        }
                                    }
                                    if (currentTimeMillis - file5.lastModified() > 86400000) {
                                        i17++;
                                        i16 = 65536;
                                    }
                                }
                                if (file5.exists() && !file5.isDirectory()) {
                                    bufferedInputStream = new BufferedInputStream(new FileInputStream(file5), i16);
                                    try {
                                        try {
                                            zipOutputStream.putNextEntry(new ZipEntry(file5.getName()));
                                            while (true) {
                                                int read = bufferedInputStream.read(bArr, 0, i16);
                                                if (read != -1) {
                                                    zipOutputStream.write(bArr, 0, read);
                                                    i16 = 65536;
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
                                            AndroidUtilities.runOnUIThread(new es0((Dialog) b2Var, zArr2, (Object) activity, (Serializable) file, 5));
                                            return;
                                        }
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
                                }
                                i17++;
                                i16 = 65536;
                            }
                            zArr2[0] = true;
                        } catch (Exception e10) {
                            e = e10;
                            bufferedInputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedInputStream = null;
                            if (bufferedInputStream != null) {
                            }
                            if (zipOutputStream != null) {
                            }
                            throw th;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        bufferedInputStream = null;
                        zipOutputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedInputStream = null;
                        zipOutputStream = null;
                    }
                    zipOutputStream.close();
                    AndroidUtilities.runOnUIThread(new es0((Dialog) b2Var, zArr2, (Object) activity, (Serializable) file, 5));
                    return;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    return;
                }
            case 7:
                u41.P((u41) obj2, z11, (org.telegram.ui.Components.jn0) obj);
                return;
            case 8:
                TwoStepVerificationActivity.X((TwoStepVerificationActivity) obj2, z11, (byte[]) obj);
                return;
            case 9:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList2 = wallpapersListActivity.b0;
                HashMap hashMap = wallpapersListActivity.c0;
                int i18 = wallpapersListActivity.v;
                HashMap hashMap2 = wallpapersListActivity.h0;
                ArrayList arrayList3 = wallpapersListActivity.e0;
                if (tLObject instanceof TL_account.TL_wallPapers) {
                    TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
                    wallpapersListActivity.g0.clear();
                    hashMap2.clear();
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
                            i11 = i19;
                        } else if (!(wallPaper instanceof TLRPC.TL_wallPaper) || (wallPaper.document instanceof TLRPC.TL_documentEmpty)) {
                            i11 = i19;
                            if (wallPaper.settings.background_color != 0 && (org.telegram.ui.ActionBar.j6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0)) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                                int i20 = wallPaperSettings4.second_background_color;
                                gj1 gj1Var = (i20 == 0 || (i12 = wallPaperSettings4.third_background_color) == 0) ? new gj1(wallPaperSettings4.background_color, i20, null, wallPaperSettings4.rotation) : new gj1(null, wallPaperSettings4.background_color, i20, i12, wallPaperSettings4.fourth_background_color);
                                gj1Var.a = wallPaper.slug;
                                gj1Var.h = wallPaperSettings4.intensity / 100.0f;
                                gj1Var.f = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                                gj1Var.l = wallPaper;
                                arrayList3.add(gj1Var);
                            }
                        } else {
                            hashMap.put(wallPaper.slug, wallPaper);
                            if (!wallPaper.pattern || (document = wallPaper.document) == null) {
                                i11 = i19;
                            } else {
                                i11 = i19;
                                if (!hashMap2.containsKey(Long.valueOf(document.id))) {
                                    wallpapersListActivity.g0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.id), wallPaper);
                                }
                            }
                            if (i18 != i14 && ((!(z10 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i18 != 2 || z10) && (org.telegram.ui.ActionBar.j6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                                arrayList3.add(wallPaper);
                            }
                        }
                        i19 = i11 + 1;
                        i14 = 1;
                    }
                    wallpapersListActivity.A0();
                    wallpapersListActivity.getMessagesStorage().putWallpapers(tL_wallPapers.wallpapers, 1);
                }
                org.telegram.ui.ActionBar.b2 b2Var2 = wallpapersListActivity.P;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    if (z11) {
                        return;
                    }
                    wallpapersListActivity.H.x0(0);
                    return;
                }
                return;
            case 10:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) obj2;
                String str2 = (String) obj;
                org.telegram.ui.web.d dVar = lVar.w;
                ArrayList arrayList4 = lVar.x;
                arrayList4.clear();
                org.telegram.ui.web.p1.a().getClass();
                ArrayList arrayList5 = new ArrayList();
                try {
                    JSONArray jSONArray = new JSONArray(str2).getJSONArray(1);
                    for (int i21 = 0; i21 < jSONArray.length(); i21++) {
                        arrayList5.add(jSONArray.getString(i21));
                    }
                } catch (Exception e13) {
                    FileLog.e((Throwable) e13, false);
                    try {
                        JSONArray jSONArray2 = new JSONObject(str2).getJSONObject("gossip").getJSONArray("results");
                        for (int i22 = 0; i22 < jSONArray2.length(); i22++) {
                            arrayList5.add(jSONArray2.getJSONObject(i22).getString("key"));
                        }
                    } catch (Exception e14) {
                        FileLog.e((Throwable) e14, false);
                        try {
                            JSONArray jSONArray3 = new JSONArray(str2);
                            for (int i23 = 0; i23 < jSONArray3.length(); i23++) {
                                String string2 = jSONArray3.getJSONObject(i23).getString("phrase");
                                if (!TextUtils.isEmpty(string2)) {
                                    arrayList5.add(string2);
                                }
                            }
                        } catch (Exception e15) {
                            FileLog.e((Throwable) e15, false);
                        }
                    }
                }
                arrayList4.addAll(arrayList5);
                dVar.Y2.N(true);
                if (z11 != (!arrayList4.isEmpty())) {
                    dVar.X2.h1(0, 0);
                    return;
                }
                return;
            case 11:
                ((EglRenderer) obj2).lambda$releaseEglSurface$5(z11, (Runnable) obj);
                return;
            case 12:
                ((Utilities.Callback2) obj2).run(Boolean.valueOf(z11), (String) obj);
                return;
            case 13:
                ((org.telegram.ui.Components.d80) obj2).run(Boolean.valueOf(z11), (String) obj);
                return;
            default:
                ((bi.f0) obj2).run(Boolean.valueOf(z11), (String) obj);
                return;
        }
    }

    public /* synthetic */ dm0(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }
}
