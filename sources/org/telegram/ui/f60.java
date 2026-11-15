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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class f60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f60(Object obj, Object obj2, boolean z10, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0521 A[Catch: Exception -> 0x0424, TRY_ENTER, TryCatch #13 {Exception -> 0x0424, blocks: (B:230:0x0413, B:232:0x0419, B:234:0x0427, B:236:0x0434, B:237:0x0437, B:239:0x0444, B:241:0x044c, B:243:0x045d, B:245:0x0463, B:247:0x046b, B:249:0x0473, B:299:0x0538, B:301:0x053d, B:302:0x0540, B:289:0x0521, B:292:0x0511, B:293:0x0527), top: B:229:0x0413 }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0538 A[Catch: Exception -> 0x0424, TryCatch #13 {Exception -> 0x0424, blocks: (B:230:0x0413, B:232:0x0419, B:234:0x0427, B:236:0x0434, B:237:0x0437, B:239:0x0444, B:241:0x044c, B:243:0x045d, B:245:0x0463, B:247:0x046b, B:249:0x0473, B:299:0x0538, B:301:0x053d, B:302:0x0540, B:289:0x0521, B:292:0x0511, B:293:0x0527), top: B:229:0x0413 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x053d A[Catch: Exception -> 0x0424, TryCatch #13 {Exception -> 0x0424, blocks: (B:230:0x0413, B:232:0x0419, B:234:0x0427, B:236:0x0434, B:237:0x0437, B:239:0x0444, B:241:0x044c, B:243:0x045d, B:245:0x0463, B:247:0x046b, B:249:0x0473, B:299:0x0538, B:301:0x053d, B:302:0x0540, B:289:0x0521, B:292:0x0511, B:293:0x0527), top: B:229:0x0413 }] */
    /* JADX WARN: Type inference failed for: r7v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:187:0x03a9 -> B:177:0x03c4). Please report as a decompilation issue!!! */
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
        boolean z10;
        oc1 oc1Var;
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
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                boolean z13 = this.b;
                t1Var.dismiss();
                if (z13) {
                    return;
                }
                org.telegram.messenger.g0.i3(new e60(languageSelectActivity, 1), 10L);
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.d;
                boolean z14 = this.b;
                String str2 = LaunchActivity.C1;
                launchActivity.u0(e2Var, z14, false);
                return;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) this.c;
                boolean z15 = this.b;
                org.telegram.messenger.d1 d1Var = (org.telegram.messenger.d1) this.d;
                String str3 = LaunchActivity.C1;
                org.telegram.messenger.d1 d1Var2 = (!((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q() || (str = (e10 = org.telegram.messenger.h1.e()).a) == null || (i7 = e10.b) == 0) ? null : new org.telegram.messenger.d1(str, i7, e10.c);
                if (d1Var2 != null) {
                    if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q() ? false : org.telegram.messenger.h1.e().j) {
                        return;
                    }
                    if (z15 || d1Var == null || (org.telegram.messenger.gz.U(d1Var2.b, d1Var.b) && d1Var2.a > d1Var.a)) {
                        ((ApplicationLoaderImpl) org.telegram.messenger.t0.a).getClass();
                        try {
                            new org.telegram.ui.Components.a51(launchActivity2, d1Var2).show();
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
                ek0.d0((ek0) this.c, this.b, (String) this.d);
                return;
            case 4:
                sj0 sj0Var = (sj0) this.c;
                boolean z16 = this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                ek0 ek0Var = sj0Var.e;
                if (z16) {
                    i10 = ((org.telegram.ui.ActionBar.e2) ek0Var).currentAccount;
                    org.telegram.messenger.m10.i(i10).u();
                    ek0Var.O0 = 0;
                    ek0Var.W1();
                    ViewGroup[] viewGroupArr = ek0Var.a0;
                    if (viewGroupArr == null || viewGroupArr[0].getVisibility() != 0) {
                        return;
                    }
                    ek0Var.Z[0].requestFocus();
                    org.telegram.messenger.g0.J3(ek0Var.Z[0]);
                    return;
                }
                ek0Var.R1(true, false);
                if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                    ek0Var.E1(true);
                    return;
                }
                if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    ek0Var.Q1(org.telegram.messenger.hd.M0(R.string.AppName, null), tL_error.text);
                    return;
                }
                int intValue = Utilities.z(tL_error.text).intValue();
                if (intValue < 60) {
                    c10 = 0;
                    G = org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]);
                } else {
                    c10 = 0;
                    G = org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
                }
                String M0 = org.telegram.messenger.hd.M0(R.string.AppName, null);
                Object[] objArr = new Object[1];
                objArr[c10] = G;
                ek0Var.Q1(M0, org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750686, objArr));
                return;
            case 5:
                zm0.Z((zm0) this.c, (TLObject) this.d, this.b);
                return;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                boolean z17 = this.b;
                View view = (View) this.d;
                Drawable[] drawableArr = PhotoViewer.Z8;
                if (!z17) {
                    photoViewer.getClass();
                    view.setVisibility(8);
                }
                photoViewer.q3();
                return;
            case 7:
                PhotoViewer photoViewer2 = (PhotoViewer) this.c;
                String str4 = (String) this.d;
                boolean z18 = this.b;
                if (str4.equals(photoViewer2.C4.R)) {
                    photoViewer2.w4 = z18 ? 1 : 0;
                    photoViewer2.x4 = str4;
                    return;
                }
                return;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                boolean z19 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (!z19) {
                    RectF rectF = ProfileActivity.X6;
                } else if (profileActivity.N4 == -1) {
                    org.telegram.ui.Components.hf0 hf0Var = profileActivity.a0;
                    if (hf0Var != null) {
                        org.telegram.ui.Components.ef0 i14 = org.telegram.ui.Components.hf0.i(7, hf0Var.a);
                        if (i14 == null || !i14.s) {
                            r72 = 0;
                        } else {
                            r72 = 0;
                            i14.s = false;
                            hf0Var.invalidate();
                        }
                        if (zArr[r72]) {
                            org.telegram.ui.Components.hf0 hf0Var2 = profileActivity.a0;
                            hf0Var2.G = true;
                            hf0Var2.o(7, r72);
                            profileActivity.a0.o(9, true);
                            org.telegram.ui.Components.hf0 hf0Var3 = profileActivity.a0;
                            if (hf0Var3.G) {
                                hf0Var3.G = r72;
                                hf0Var3.d();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                profileActivity.M5();
                iw0 iw0Var = profileActivity.d;
                if (iw0Var != null) {
                    iw0Var.f();
                    return;
                }
                return;
            case 9:
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.d;
                boolean z20 = this.b;
                Activity activity = (Activity) this.c;
                RectF rectF2 = ProfileActivity.X6;
                try {
                    File P0 = org.telegram.messenger.g0.P0();
                    if (P0 == null) {
                        org.telegram.messenger.g0.h3(new di.s3(t1Var2, 2));
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
                                                bufferedInputStream2.close();
                                            }
                                            if (zipOutputStream != null) {
                                                zipOutputStream.close();
                                            }
                                            org.telegram.messenger.g0.h3(new ok0(t1Var2, zArr2, activity, file, 8));
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
                            org.telegram.messenger.g0.h3(new ok0(t1Var2, zArr2, activity, file, 8));
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
                    org.telegram.messenger.g0.h3(new ok0(t1Var2, zArr2, activity, file, 8));
                    return;
                } catch (Exception e15) {
                    e15.printStackTrace();
                    return;
                }
            case 10:
                org.telegram.ui.Components.p20 p20Var = (org.telegram.ui.Components.p20) this.c;
                boolean z21 = this.b;
                org.telegram.ui.Components.hh0 hh0Var = (org.telegram.ui.Components.hh0) this.d;
                if (z21) {
                    org.telegram.messenger.np.s1(p20Var.a).o0(true);
                    hh0Var.run();
                } else {
                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                    if (T == null) {
                        return;
                    } else {
                        T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(3)));
                    }
                }
                p20Var.dismiss();
                return;
            case 11:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) this.c, this.b, (byte[]) this.d);
                return;
            case 12:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) this.c;
                ai.d0 d0Var = (ai.d0) this.d;
                boolean z22 = this.b;
                if (u0Var.b) {
                    return;
                }
                try {
                    if (d0Var.b == ((org.telegram.ui.Wallet.p0) d0Var.c).l()) {
                        c8.xa.b = u0Var;
                        LaunchActivity launchActivity3 = LaunchActivity.H1;
                        int i17 = Build.VERSION.SDK_INT;
                        if (launchActivity3 != null && !launchActivity3.isFinishing() && !launchActivity3.isDestroyed() && !launchActivity3.s().P()) {
                            u0Var.e = launchActivity3;
                            try {
                                if (z22) {
                                    u0Var.a();
                                } else if (i17 >= 30) {
                                    u0Var.d();
                                } else {
                                    u0Var.b();
                                }
                            } catch (Exception e16) {
                                org.telegram.messenger.a8.g(e16, true);
                                u0Var.a();
                            }
                        }
                        u0Var.c("AUTH_UNAVAILABLE");
                    } else {
                        u0Var.c("STORAGE_CANCELED");
                    }
                    return;
                } catch (Exception e17) {
                    org.telegram.messenger.a8.g(e17, true);
                    u0Var.c("AUTH_UNAVAILABLE");
                    return;
                }
            case 13:
                bg.u0 u0Var2 = (bg.u0) this.c;
                boolean z23 = this.b;
                org.telegram.ui.Wallet.e3 e3Var = (org.telegram.ui.Wallet.e3) this.d;
                org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                if (u0Var2.b) {
                    return;
                }
                if (T2 == null) {
                    u0Var2.a();
                    return;
                } else {
                    if (!z23) {
                        T2.presentFragment(e3Var);
                        return;
                    }
                    org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2();
                    c2Var.a = true;
                    T2.showAsSheet(e3Var, c2Var);
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
                                if (i18 != i13 && ((!(z12 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i18 != 2 || z12) && (org.telegram.ui.ActionBar.j6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                                    arrayList3.add(wallPaper);
                                }
                            } else if (wallPaper.settings.background_color != 0 && (org.telegram.ui.ActionBar.j6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0)) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                                int i20 = wallPaperSettings4.second_background_color;
                                if (i20 == 0 || (i11 = wallPaperSettings4.third_background_color) == 0) {
                                    z11 = z24;
                                    oc1Var = new oc1(wallPaperSettings4.background_color, i20, wallPaperSettings4.rotation, null);
                                } else {
                                    oc1Var = new oc1(null, wallPaperSettings4.background_color, i20, i11, wallPaperSettings4.fourth_background_color);
                                    z11 = z24;
                                }
                                oc1Var.a = wallPaper.slug;
                                oc1Var.h = wallPaperSettings4.intensity / 100.0f;
                                oc1Var.f = org.telegram.messenger.g0.s1(wallPaperSettings4.rotation, false);
                                oc1Var.l = wallPaper;
                                arrayList3.add(oc1Var);
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
                org.telegram.ui.ActionBar.t1 t1Var3 = wallpapersListActivity.M;
                if (t1Var3 != null) {
                    t1Var3.dismiss();
                    if (z10) {
                        return;
                    }
                    wallpapersListActivity.G.y0(0);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.c;
                String str5 = (String) this.d;
                boolean z25 = this.b;
                bi.v3 v3Var = kVar.x;
                ArrayList arrayList4 = kVar.y;
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
                v3Var.g3.O(true);
                if (z25 != (!arrayList4.isEmpty())) {
                    v3Var.f3.h1(0, 0);
                    return;
                }
                return;
            case 16:
                ((EglRenderer) this.c).lambda$releaseEglSurface$5(this.b, (Runnable) this.d);
                return;
            case 17:
                zi.u uVar = (zi.u) this.c;
                boolean z26 = this.b;
                Runnable runnable = (Runnable) this.d;
                if (uVar.f) {
                    uVar.F = z26;
                    Size size2 = z26 ? uVar.c : uVar.b;
                    uVar.a = size2;
                    int i24 = z26 ? uVar.l : uVar.k;
                    uVar.j = i24;
                    uVar.m = z26 ? uVar.o : uVar.n;
                    zi.e0 e0Var = uVar.N;
                    if (e0Var != null) {
                        e0Var.c = size2;
                        e0Var.d = i24;
                        e0Var.v();
                        e0Var.B = false;
                        e0Var.A = 0L;
                    }
                    uVar.Q = -1L;
                    uVar.v0 = runnable;
                    uVar.i.b("GL dual input selected: input=" + (z26 ? 1 : 0));
                    return;
                }
                return;
            default:
                u7.i iVar = (u7.i) this.c;
                zi.i iVar2 = (zi.i) this.d;
                boolean z27 = this.b;
                zi.v0 v0Var = (zi.v0) iVar.a;
                int i25 = v0Var.a0;
                if (i25 == 7 || i25 == 8 || i25 == 9 || i25 == 10) {
                    return;
                }
                zi.n0 n0Var = iVar2.a;
                zi.q0 q0Var = iVar2.c;
                zi.o0 o0Var = iVar2.b;
                v0Var.s = n0Var;
                v0Var.t = o0Var;
                v0Var.u = q0Var;
                v0Var.v = iVar2.e;
                if (n0Var != zi.n0.a) {
                    if (iVar2.f) {
                        i12 = 2;
                        v0Var.b0 = i12;
                        v0Var.n();
                        zi.p pVar = v0Var.m;
                        StringBuilder sb2 = new StringBuilder("camera configured: facing=");
                        sb2.append(n0Var);
                        sb2.append(", mode=");
                        sb2.append(o0Var);
                        sb2.append(", recording=");
                        sb2.append(iVar2.d);
                        sb2.append(", fps=");
                        sb2.append(q0Var.a);
                        sb2.append(", maxZoom=");
                        sb2.append(v0Var.v);
                        sb2.append(", flash=");
                        int i26 = v0Var.b0;
                        sb2.append(i26 == 1 ? i26 != 2 ? i26 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                        sb2.append(", switch=");
                        sb2.append(z27);
                        pVar.b(sb2.toString());
                        if (z27) {
                        }
                        v0Var.y = false;
                        org.telegram.ui.Components.q40 q40Var = (org.telegram.ui.Components.q40) v0Var.d.b;
                        q40Var.q0 = true;
                        StringBuilder sb3 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                        sb3.append(n0Var);
                        sb3.append(", elapsedMs=");
                        cameraFlipElapsedMs = q40Var.getCameraFlipElapsedMs();
                        sb3.append(cameraFlipElapsedMs);
                        org.telegram.messenger.a8.b(sb3.toString());
                        org.telegram.ui.Components.q40.n(q40Var);
                        v0Var.o();
                        return;
                    }
                    i12 = 1;
                    v0Var.b0 = i12;
                    v0Var.n();
                    zi.p pVar2 = v0Var.m;
                    StringBuilder sb22 = new StringBuilder("camera configured: facing=");
                    sb22.append(n0Var);
                    sb22.append(", mode=");
                    sb22.append(o0Var);
                    sb22.append(", recording=");
                    sb22.append(iVar2.d);
                    sb22.append(", fps=");
                    sb22.append(q0Var.a);
                    sb22.append(", maxZoom=");
                    sb22.append(v0Var.v);
                    sb22.append(", flash=");
                    int i262 = v0Var.b0;
                    sb22.append(i262 == 1 ? i262 != 2 ? i262 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                    sb22.append(", switch=");
                    sb22.append(z27);
                    pVar2.b(sb22.toString());
                    if (z27) {
                    }
                    v0Var.y = false;
                    org.telegram.ui.Components.q40 q40Var2 = (org.telegram.ui.Components.q40) v0Var.d.b;
                    q40Var2.q0 = true;
                    StringBuilder sb32 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                    sb32.append(n0Var);
                    sb32.append(", elapsedMs=");
                    cameraFlipElapsedMs = q40Var2.getCameraFlipElapsedMs();
                    sb32.append(cameraFlipElapsedMs);
                    org.telegram.messenger.a8.b(sb32.toString());
                    org.telegram.ui.Components.q40.n(q40Var2);
                    v0Var.o();
                    return;
                }
                if (v0Var.f != null) {
                    i12 = 3;
                    v0Var.b0 = i12;
                    v0Var.n();
                    zi.p pVar22 = v0Var.m;
                    StringBuilder sb222 = new StringBuilder("camera configured: facing=");
                    sb222.append(n0Var);
                    sb222.append(", mode=");
                    sb222.append(o0Var);
                    sb222.append(", recording=");
                    sb222.append(iVar2.d);
                    sb222.append(", fps=");
                    sb222.append(q0Var.a);
                    sb222.append(", maxZoom=");
                    sb222.append(v0Var.v);
                    sb222.append(", flash=");
                    int i2622 = v0Var.b0;
                    sb222.append(i2622 == 1 ? i2622 != 2 ? i2622 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                    sb222.append(", switch=");
                    sb222.append(z27);
                    pVar22.b(sb222.toString());
                    if (!z27 || v0Var.y) {
                        v0Var.y = false;
                        org.telegram.ui.Components.q40 q40Var22 = (org.telegram.ui.Components.q40) v0Var.d.b;
                        q40Var22.q0 = true;
                        StringBuilder sb322 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                        sb322.append(n0Var);
                        sb322.append(", elapsedMs=");
                        cameraFlipElapsedMs = q40Var22.getCameraFlipElapsedMs();
                        sb322.append(cameraFlipElapsedMs);
                        org.telegram.messenger.a8.b(sb322.toString());
                        org.telegram.ui.Components.q40.n(q40Var22);
                        v0Var.o();
                        return;
                    }
                    return;
                }
                i12 = 1;
                v0Var.b0 = i12;
                v0Var.n();
                zi.p pVar222 = v0Var.m;
                StringBuilder sb2222 = new StringBuilder("camera configured: facing=");
                sb2222.append(n0Var);
                sb2222.append(", mode=");
                sb2222.append(o0Var);
                sb2222.append(", recording=");
                sb2222.append(iVar2.d);
                sb2222.append(", fps=");
                sb2222.append(q0Var.a);
                sb2222.append(", maxZoom=");
                sb2222.append(v0Var.v);
                sb2222.append(", flash=");
                int i26222 = v0Var.b0;
                sb2222.append(i26222 == 1 ? i26222 != 2 ? i26222 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                sb2222.append(", switch=");
                sb2222.append(z27);
                pVar222.b(sb2222.toString());
                if (z27) {
                }
                v0Var.y = false;
                org.telegram.ui.Components.q40 q40Var222 = (org.telegram.ui.Components.q40) v0Var.d.b;
                q40Var222.q0 = true;
                StringBuilder sb3222 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                sb3222.append(n0Var);
                sb3222.append(", elapsedMs=");
                cameraFlipElapsedMs = q40Var222.getCameraFlipElapsedMs();
                sb3222.append(cameraFlipElapsedMs);
                org.telegram.messenger.a8.b(sb3222.toString());
                org.telegram.ui.Components.q40.n(q40Var222);
                v0Var.o();
                return;
        }
    }

    public /* synthetic */ f60(Object obj, boolean z10, Object obj2, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }

    public /* synthetic */ f60(org.telegram.ui.ActionBar.t1 t1Var, boolean z10, Activity activity) {
        this.a = 9;
        this.d = t1Var;
        this.b = z10;
        this.c = activity;
    }
}
