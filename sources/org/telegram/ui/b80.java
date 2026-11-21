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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b80(Object obj, Object obj2, boolean z10, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = z10;
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
        rc1 rc1Var;
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
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d;
                boolean z13 = this.c;
                String str2 = LaunchActivity.C1;
                launchActivity.u0(g2Var, z13, false);
                return;
            case 1:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                boolean z14 = this.c;
                org.telegram.messenger.d1 d1Var = (org.telegram.messenger.d1) this.d;
                String str3 = LaunchActivity.C1;
                org.telegram.messenger.d1 d1Var2 = (!((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q() || (str = (e10 = org.telegram.messenger.h1.e()).a) == null || (i7 = e10.b) == 0) ? null : new org.telegram.messenger.d1(str, i7, e10.c);
                if (d1Var2 != null) {
                    if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q() ? false : org.telegram.messenger.h1.e().j) {
                        return;
                    }
                    if (z14 || d1Var == null || (org.telegram.messenger.bz.U(d1Var2.b, d1Var.b) && d1Var2.a > d1Var.a)) {
                        ((ApplicationLoaderImpl) org.telegram.messenger.t0.a).getClass();
                        try {
                            new org.telegram.ui.Components.n51(launchActivity2, d1Var2).show();
                            return;
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                hk0.d0((hk0) this.b, this.c, (String) this.d);
                return;
            case 3:
                vj0 vj0Var = (vj0) this.b;
                boolean z15 = this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                hk0 hk0Var = vj0Var.e;
                if (z15) {
                    i10 = ((org.telegram.ui.ActionBar.g2) hk0Var).currentAccount;
                    org.telegram.messenger.j10.i(i10).u();
                    hk0Var.O0 = 0;
                    hk0Var.W1();
                    ViewGroup[] viewGroupArr = hk0Var.a0;
                    if (viewGroupArr == null || viewGroupArr[0].getVisibility() != 0) {
                        return;
                    }
                    hk0Var.Z[0].requestFocus();
                    org.telegram.messenger.g0.I3(hk0Var.Z[0]);
                    return;
                }
                hk0Var.R1(true, false);
                if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                    hk0Var.E1(true);
                    return;
                }
                if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    hk0Var.Q1(org.telegram.messenger.gd.N0(R.string.AppName, null), tL_error.text);
                    return;
                }
                int intValue = Utilities.z(tL_error.text).intValue();
                if (intValue < 60) {
                    c10 = 0;
                    G = org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]);
                } else {
                    c10 = 0;
                    G = org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0]);
                }
                String N0 = org.telegram.messenger.gd.N0(R.string.AppName, null);
                Object[] objArr = new Object[1];
                objArr[c10] = G;
                hk0Var.Q1(N0, org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750669, objArr));
                return;
            case 4:
                cn0.Z((cn0) this.b, (TLObject) this.d, this.c);
                return;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                boolean z16 = this.c;
                View view = (View) this.d;
                Drawable[] drawableArr = PhotoViewer.Z8;
                if (!z16) {
                    photoViewer.getClass();
                    view.setVisibility(8);
                }
                photoViewer.q3();
                return;
            case 6:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                String str4 = (String) this.d;
                boolean z17 = this.c;
                if (str4.equals(photoViewer2.C4.R)) {
                    photoViewer2.w4 = z17 ? 1 : 0;
                    photoViewer2.x4 = str4;
                    return;
                }
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                boolean z18 = this.c;
                boolean[] zArr = (boolean[]) this.d;
                if (!z18) {
                    RectF rectF = ProfileActivity.Z6;
                } else if (profileActivity.P4 == -1) {
                    org.telegram.ui.Components.tf0 tf0Var = profileActivity.a0;
                    if (tf0Var != null) {
                        org.telegram.ui.Components.qf0 i14 = org.telegram.ui.Components.tf0.i(7, tf0Var.a);
                        if (i14 == null || !i14.s) {
                            r72 = 0;
                        } else {
                            r72 = 0;
                            i14.s = false;
                            tf0Var.invalidate();
                        }
                        if (zArr[r72]) {
                            org.telegram.ui.Components.tf0 tf0Var2 = profileActivity.a0;
                            tf0Var2.G = true;
                            tf0Var2.o(7, r72);
                            profileActivity.a0.o(9, true);
                            org.telegram.ui.Components.tf0 tf0Var3 = profileActivity.a0;
                            if (tf0Var3.G) {
                                tf0Var3.G = r72;
                                tf0Var3.d();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                profileActivity.N5();
                lw0 lw0Var = profileActivity.d;
                if (lw0Var != null) {
                    lw0Var.f();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.b;
                boolean z19 = this.c;
                Activity activity = (Activity) this.d;
                RectF rectF2 = ProfileActivity.Z6;
                try {
                    File P0 = org.telegram.messenger.g0.P0();
                    if (P0 == null) {
                        org.telegram.messenger.g0.g3(new di.u3(t1Var, 2));
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
                                            org.telegram.messenger.g0.g3(new kg0(t1Var, zArr2, activity, file, 11));
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
                            org.telegram.messenger.g0.g3(new kg0(t1Var, zArr2, activity, file, 11));
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
                    org.telegram.messenger.g0.g3(new kg0(t1Var, zArr2, activity, file, 11));
                    return;
                } catch (Exception e15) {
                    e15.printStackTrace();
                    return;
                }
            case 9:
                org.telegram.ui.Components.a30 a30Var = (org.telegram.ui.Components.a30) this.b;
                boolean z20 = this.c;
                org.telegram.ui.Components.fm0 fm0Var = (org.telegram.ui.Components.fm0) this.d;
                if (z20) {
                    org.telegram.messenger.mp.u1(a30Var.a).p0(true);
                    fm0Var.run();
                } else {
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T == null) {
                        return;
                    } else {
                        T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(3)));
                    }
                }
                a30Var.dismiss();
                return;
            case 10:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) this.b, this.c, (byte[]) this.d);
                return;
            case 11:
                org.telegram.ui.Wallet.e1 e1Var = (org.telegram.ui.Wallet.e1) this.b;
                ai.d0 d0Var = (ai.d0) this.d;
                boolean z21 = this.c;
                if (e1Var.b) {
                    return;
                }
                try {
                    if (d0Var.b == ((org.telegram.ui.Wallet.z0) d0Var.c).l()) {
                        c8.za.b = e1Var;
                        LaunchActivity launchActivity3 = LaunchActivity.H1;
                        int i17 = Build.VERSION.SDK_INT;
                        if (launchActivity3 != null && !launchActivity3.isFinishing() && !launchActivity3.isDestroyed() && !launchActivity3.s().P()) {
                            e1Var.e = launchActivity3;
                            try {
                                if (z21) {
                                    e1Var.a();
                                } else if (i17 >= 30) {
                                    e1Var.d();
                                } else {
                                    e1Var.b();
                                }
                            } catch (Exception e16) {
                                org.telegram.messenger.a8.g(e16, true);
                                e1Var.a();
                            }
                        }
                        e1Var.c("AUTH_UNAVAILABLE");
                    } else {
                        e1Var.c("STORAGE_CANCELED");
                    }
                    return;
                } catch (Exception e17) {
                    org.telegram.messenger.a8.g(e17, true);
                    e1Var.c("AUTH_UNAVAILABLE");
                    return;
                }
            case 12:
                m.b3 b3Var = (m.b3) this.b;
                boolean z22 = this.c;
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) this.d;
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if (b3Var.a) {
                    return;
                }
                if (T2 == null) {
                    b3Var.b();
                    return;
                } else {
                    if (!z22) {
                        T2.presentFragment(m3Var);
                        return;
                    }
                    org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                    e2Var.a = true;
                    T2.showAsSheet(m3Var, e2Var);
                    return;
                }
            case 13:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                TLObject tLObject = (TLObject) this.d;
                boolean z23 = this.c;
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
                                if (i18 != i13 && ((!(z12 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i18 != 2 || z12) && (org.telegram.ui.ActionBar.m6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                                    arrayList3.add(wallPaper);
                                }
                            } else if (wallPaper.settings.background_color != 0 && (org.telegram.ui.ActionBar.m6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0)) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                                int i20 = wallPaperSettings4.second_background_color;
                                if (i20 == 0 || (i11 = wallPaperSettings4.third_background_color) == 0) {
                                    z11 = z23;
                                    rc1Var = new rc1(wallPaperSettings4.background_color, i20, wallPaperSettings4.rotation, null);
                                } else {
                                    rc1Var = new rc1(null, wallPaperSettings4.background_color, i20, i11, wallPaperSettings4.fourth_background_color);
                                    z11 = z23;
                                }
                                rc1Var.a = wallPaper.slug;
                                rc1Var.h = wallPaperSettings4.intensity / 100.0f;
                                rc1Var.f = org.telegram.messenger.g0.s1(wallPaperSettings4.rotation, false);
                                rc1Var.l = wallPaper;
                                arrayList3.add(rc1Var);
                                i19++;
                                z23 = z11;
                                i13 = 1;
                            }
                        }
                        z11 = z23;
                        i19++;
                        z23 = z11;
                        i13 = 1;
                    }
                    z10 = z23;
                    wallpapersListActivity.F0();
                    wallpapersListActivity.getMessagesStorage().p1(1, tL_wallPapers.wallpapers);
                } else {
                    z10 = z23;
                }
                org.telegram.ui.ActionBar.t1 t1Var2 = wallpapersListActivity.M;
                if (t1Var2 != null) {
                    t1Var2.dismiss();
                    if (z10) {
                        return;
                    }
                    wallpapersListActivity.G.y0(0);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.b;
                String str5 = (String) this.d;
                boolean z24 = this.c;
                bi.g6 g6Var = kVar.x;
                ArrayList arrayList4 = kVar.y;
                arrayList4.clear();
                org.telegram.ui.web.e1.a().getClass();
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
                g6Var.g3.O(true);
                if (z24 != (!arrayList4.isEmpty())) {
                    g6Var.f3.h1(0, 0);
                    return;
                }
                return;
            case 15:
                ((EglRenderer) this.b).lambda$releaseEglSurface$5(this.c, (Runnable) this.d);
                return;
            case 16:
                zi.t tVar = (zi.t) this.b;
                boolean z25 = this.c;
                Runnable runnable = (Runnable) this.d;
                if (tVar.f) {
                    tVar.F = z25;
                    Size size2 = z25 ? tVar.c : tVar.b;
                    tVar.a = size2;
                    int i24 = z25 ? tVar.l : tVar.k;
                    tVar.j = i24;
                    tVar.m = z25 ? tVar.o : tVar.n;
                    zi.d0 d0Var2 = tVar.N;
                    if (d0Var2 != null) {
                        d0Var2.c = size2;
                        d0Var2.d = i24;
                        d0Var2.v();
                        d0Var2.B = false;
                        d0Var2.A = 0L;
                    }
                    tVar.Q = -1L;
                    tVar.v0 = runnable;
                    tVar.i.b("GL dual input selected: input=" + (z25 ? 1 : 0));
                    return;
                }
                return;
            default:
                zi.k0 k0Var = (zi.k0) this.b;
                zi.h hVar = (zi.h) this.d;
                boolean z26 = this.c;
                zi.u0 u0Var = (zi.u0) k0Var.a;
                int i25 = u0Var.a0;
                if (i25 == 7 || i25 == 8 || i25 == 9 || i25 == 10) {
                    return;
                }
                zi.n0 n0Var = hVar.a;
                zi.p0 p0Var = hVar.c;
                zi.o0 o0Var = hVar.b;
                u0Var.s = n0Var;
                u0Var.t = o0Var;
                u0Var.u = p0Var;
                u0Var.v = hVar.e;
                if (n0Var != zi.n0.a) {
                    if (hVar.f) {
                        i12 = 2;
                        u0Var.b0 = i12;
                        u0Var.n();
                        zi.o oVar = u0Var.m;
                        StringBuilder sb2 = new StringBuilder("camera configured: facing=");
                        sb2.append(n0Var);
                        sb2.append(", mode=");
                        sb2.append(o0Var);
                        sb2.append(", recording=");
                        sb2.append(hVar.d);
                        sb2.append(", fps=");
                        sb2.append(p0Var.a);
                        sb2.append(", maxZoom=");
                        sb2.append(u0Var.v);
                        sb2.append(", flash=");
                        int i26 = u0Var.b0;
                        sb2.append(i26 == 1 ? i26 != 2 ? i26 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                        sb2.append(", switch=");
                        sb2.append(z26);
                        oVar.b(sb2.toString());
                        if (z26) {
                        }
                        u0Var.y = false;
                        org.telegram.ui.Components.b50 b50Var = (org.telegram.ui.Components.b50) u0Var.d.b;
                        b50Var.q0 = true;
                        StringBuilder sb3 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                        sb3.append(n0Var);
                        sb3.append(", elapsedMs=");
                        cameraFlipElapsedMs = b50Var.getCameraFlipElapsedMs();
                        sb3.append(cameraFlipElapsedMs);
                        org.telegram.messenger.a8.b(sb3.toString());
                        org.telegram.ui.Components.b50.n(b50Var);
                        u0Var.o();
                        return;
                    }
                    i12 = 1;
                    u0Var.b0 = i12;
                    u0Var.n();
                    zi.o oVar2 = u0Var.m;
                    StringBuilder sb22 = new StringBuilder("camera configured: facing=");
                    sb22.append(n0Var);
                    sb22.append(", mode=");
                    sb22.append(o0Var);
                    sb22.append(", recording=");
                    sb22.append(hVar.d);
                    sb22.append(", fps=");
                    sb22.append(p0Var.a);
                    sb22.append(", maxZoom=");
                    sb22.append(u0Var.v);
                    sb22.append(", flash=");
                    int i262 = u0Var.b0;
                    sb22.append(i262 == 1 ? i262 != 2 ? i262 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                    sb22.append(", switch=");
                    sb22.append(z26);
                    oVar2.b(sb22.toString());
                    if (z26) {
                    }
                    u0Var.y = false;
                    org.telegram.ui.Components.b50 b50Var2 = (org.telegram.ui.Components.b50) u0Var.d.b;
                    b50Var2.q0 = true;
                    StringBuilder sb32 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                    sb32.append(n0Var);
                    sb32.append(", elapsedMs=");
                    cameraFlipElapsedMs = b50Var2.getCameraFlipElapsedMs();
                    sb32.append(cameraFlipElapsedMs);
                    org.telegram.messenger.a8.b(sb32.toString());
                    org.telegram.ui.Components.b50.n(b50Var2);
                    u0Var.o();
                    return;
                }
                if (u0Var.f != null) {
                    i12 = 3;
                    u0Var.b0 = i12;
                    u0Var.n();
                    zi.o oVar22 = u0Var.m;
                    StringBuilder sb222 = new StringBuilder("camera configured: facing=");
                    sb222.append(n0Var);
                    sb222.append(", mode=");
                    sb222.append(o0Var);
                    sb222.append(", recording=");
                    sb222.append(hVar.d);
                    sb222.append(", fps=");
                    sb222.append(p0Var.a);
                    sb222.append(", maxZoom=");
                    sb222.append(u0Var.v);
                    sb222.append(", flash=");
                    int i2622 = u0Var.b0;
                    sb222.append(i2622 == 1 ? i2622 != 2 ? i2622 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                    sb222.append(", switch=");
                    sb222.append(z26);
                    oVar22.b(sb222.toString());
                    if (!z26 || u0Var.y) {
                        u0Var.y = false;
                        org.telegram.ui.Components.b50 b50Var22 = (org.telegram.ui.Components.b50) u0Var.d.b;
                        b50Var22.q0 = true;
                        StringBuilder sb322 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                        sb322.append(n0Var);
                        sb322.append(", elapsedMs=");
                        cameraFlipElapsedMs = b50Var22.getCameraFlipElapsedMs();
                        sb322.append(cameraFlipElapsedMs);
                        org.telegram.messenger.a8.b(sb322.toString());
                        org.telegram.ui.Components.b50.n(b50Var22);
                        u0Var.o();
                        return;
                    }
                    return;
                }
                i12 = 1;
                u0Var.b0 = i12;
                u0Var.n();
                zi.o oVar222 = u0Var.m;
                StringBuilder sb2222 = new StringBuilder("camera configured: facing=");
                sb2222.append(n0Var);
                sb2222.append(", mode=");
                sb2222.append(o0Var);
                sb2222.append(", recording=");
                sb2222.append(hVar.d);
                sb2222.append(", fps=");
                sb2222.append(p0Var.a);
                sb2222.append(", maxZoom=");
                sb2222.append(u0Var.v);
                sb2222.append(", flash=");
                int i26222 = u0Var.b0;
                sb2222.append(i26222 == 1 ? i26222 != 2 ? i26222 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                sb2222.append(", switch=");
                sb2222.append(z26);
                oVar222.b(sb2222.toString());
                if (z26) {
                }
                u0Var.y = false;
                org.telegram.ui.Components.b50 b50Var222 = (org.telegram.ui.Components.b50) u0Var.d.b;
                b50Var222.q0 = true;
                StringBuilder sb3222 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                sb3222.append(n0Var);
                sb3222.append(", elapsedMs=");
                cameraFlipElapsedMs = b50Var222.getCameraFlipElapsedMs();
                sb3222.append(cameraFlipElapsedMs);
                org.telegram.messenger.a8.b(sb3222.toString());
                org.telegram.ui.Components.b50.n(b50Var222);
                u0Var.o();
                return;
        }
    }

    public /* synthetic */ b80(Object obj, boolean z10, Object obj2, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = z10;
        this.d = obj2;
    }
}
