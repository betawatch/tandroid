package org.telegram.ui;

import android.app.Activity;
import android.graphics.RectF;
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
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.webrtc.EglRenderer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class bk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bk0(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0101, code lost:
    
        if (r3 == null) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0547 A[Catch: Exception -> 0x0437, TryCatch #7 {Exception -> 0x0437, blocks: (B:257:0x0426, B:259:0x042c, B:261:0x043a, B:263:0x0447, B:264:0x044a, B:266:0x0457, B:268:0x045f, B:270:0x0470, B:272:0x0476, B:274:0x047e, B:276:0x0486, B:325:0x0547, B:327:0x054c, B:328:0x054f, B:316:0x0532, B:319:0x0522, B:320:0x0538), top: B:256:0x0426 }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x054c A[Catch: Exception -> 0x0437, TryCatch #7 {Exception -> 0x0437, blocks: (B:257:0x0426, B:259:0x042c, B:261:0x043a, B:263:0x0447, B:264:0x044a, B:266:0x0457, B:268:0x045f, B:270:0x0470, B:272:0x0476, B:274:0x047e, B:276:0x0486, B:325:0x0547, B:327:0x054c, B:328:0x054f, B:316:0x0532, B:319:0x0522, B:320:0x0538), top: B:256:0x0426 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0111  */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c10;
        String G;
        int i10;
        ?? r62;
        BufferedInputStream bufferedInputStream;
        ZipOutputStream zipOutputStream;
        boolean z10;
        me1 me1Var;
        boolean z11;
        int i11;
        TLRPC.WallPaperSettings wallPaperSettings;
        boolean z12;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        TLRPC.Document document;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        SQLiteDatabase sQLiteDatabase;
        int i12 = 1;
        switch (this.a) {
            case 0:
                ll0.c0((ll0) this.c, this.b, (String) this.d);
                return;
            case 1:
                yk0 yk0Var = (yk0) this.c;
                boolean z13 = this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                ll0 ll0Var = yk0Var.e;
                if (z13) {
                    i10 = ((org.telegram.ui.ActionBar.k2) ll0Var).currentAccount;
                    org.telegram.messenger.d20.i(i10).u();
                    ll0Var.N0 = 0;
                    ll0Var.V1();
                    ViewGroup[] viewGroupArr = ll0Var.Z;
                    if (viewGroupArr == null || viewGroupArr[0].getVisibility() != 0) {
                        return;
                    }
                    ll0Var.Y[0].requestFocus();
                    org.telegram.messenger.i0.J3(ll0Var.Y[0]);
                    return;
                }
                ll0Var.Q1(true, false);
                if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                    ll0Var.D1(true);
                    return;
                }
                if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    ll0Var.P1(org.telegram.messenger.cd.L0(R.string.AppName, null), tL_error.text);
                    return;
                }
                int intValue = Utilities.z(tL_error.text).intValue();
                if (intValue < 60) {
                    c10 = 0;
                    G = org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]);
                } else {
                    c10 = 0;
                    G = org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0]);
                }
                String L0 = org.telegram.messenger.cd.L0(R.string.AppName, null);
                Object[] objArr = new Object[1];
                objArr[c10] = G;
                ll0Var.P1(L0, org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, objArr));
                return;
            case 2:
                lo0.Y((lo0) this.c, (TLObject) this.d, this.b);
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
                photoViewer.v3();
                return;
            case 4:
                PhotoViewer photoViewer2 = (PhotoViewer) this.c;
                String str = (String) this.d;
                boolean z15 = this.b;
                if (str.equals(photoViewer2.C4.Q)) {
                    photoViewer2.w4 = z15 ? 1 : 0;
                    photoViewer2.x4 = str;
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                boolean z16 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (!z16) {
                    RectF rectF = ProfileActivity.R6;
                } else if (profileActivity.L4 == -1) {
                    org.telegram.ui.Components.hg0 hg0Var = profileActivity.Z;
                    if (hg0Var != null) {
                        org.telegram.ui.Components.eg0 i13 = org.telegram.ui.Components.hg0.i(7, hg0Var.a);
                        if (i13 == null || !i13.s) {
                            r62 = 0;
                        } else {
                            r62 = 0;
                            i13.s = false;
                            hg0Var.invalidate();
                        }
                        if (zArr[r62]) {
                            org.telegram.ui.Components.hg0 hg0Var2 = profileActivity.Z;
                            hg0Var2.F = true;
                            hg0Var2.o(7, r62);
                            profileActivity.Z.o(9, true);
                            org.telegram.ui.Components.hg0 hg0Var3 = profileActivity.Z;
                            if (hg0Var3.F) {
                                hg0Var3.F = r62;
                                hg0Var3.d();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                profileActivity.I5();
                xx0 xx0Var = profileActivity.d;
                if (xx0Var != null) {
                    xx0Var.f();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.c;
                boolean z17 = this.b;
                Activity activity = (Activity) this.d;
                RectF rectF2 = ProfileActivity.R6;
                try {
                    File P0 = org.telegram.messenger.i0.P0();
                    if (P0 == null) {
                        org.telegram.messenger.i0.g3(new org.telegram.ui.ActionBar.n1(x1Var, 0));
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
                    File file3 = new File(org.telegram.messenger.w0.h(), "malformed_database/");
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
                                    if (!z17) {
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
                                            org.telegram.messenger.i0.g3(new w50(x1Var, zArr2, activity, file, 24));
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
                    org.telegram.messenger.i0.g3(new w50(x1Var, zArr2, activity, file, 24));
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            case 7:
                org.telegram.ui.Components.e30 e30Var = (org.telegram.ui.Components.e30) this.c;
                boolean z18 = this.b;
                org.telegram.ui.Components.gi0 gi0Var = (org.telegram.ui.Components.gi0) this.d;
                if (z18) {
                    org.telegram.messenger.vp.r1(e30Var.a).o0(true);
                    gi0Var.run();
                } else {
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T == null) {
                        return;
                    } else {
                        T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.p0(3)));
                    }
                }
                e30Var.dismiss();
                return;
            case 8:
                TwoStepVerificationActivity.b0((TwoStepVerificationActivity) this.c, this.b, (byte[]) this.d);
                return;
            case 9:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) this.c;
                m4.x0 x0Var = (m4.x0) this.d;
                boolean z19 = this.b;
                if (u0Var.b) {
                    return;
                }
                try {
                    if (x0Var.b == ((org.telegram.ui.Wallet.p0) x0Var.c).l()) {
                        w7.k6.b = u0Var;
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        int i16 = Build.VERSION.SDK_INT;
                        if (launchActivity != null && !launchActivity.isFinishing() && !launchActivity.isDestroyed() && !launchActivity.s().P()) {
                            u0Var.e = launchActivity;
                            try {
                                if (z19) {
                                    u0Var.a();
                                } else if (i16 >= 30) {
                                    u0Var.d();
                                } else {
                                    u0Var.b();
                                }
                            } catch (Exception e12) {
                                org.telegram.messenger.f8.g(e12, true);
                                u0Var.a();
                            }
                        }
                        u0Var.c("AUTH_UNAVAILABLE");
                    } else {
                        u0Var.c("STORAGE_CANCELED");
                    }
                    return;
                } catch (Exception e13) {
                    org.telegram.messenger.f8.g(e13, true);
                    u0Var.c("AUTH_UNAVAILABLE");
                    return;
                }
            case 10:
                aa0 aa0Var = (aa0) this.c;
                boolean z20 = this.b;
                org.telegram.ui.Wallet.g3 g3Var = (org.telegram.ui.Wallet.g3) this.d;
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (aa0Var.b) {
                    return;
                }
                if (T2 == null) {
                    aa0Var.a();
                    return;
                } else {
                    if (!z20) {
                        T2.presentFragment(g3Var);
                        return;
                    }
                    org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                    i2Var.a = true;
                    T2.showAsSheet(g3Var, i2Var);
                    return;
                }
            case 11:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z21 = this.b;
                ArrayList arrayList2 = wallpapersListActivity.X;
                HashMap hashMap = wallpapersListActivity.Y;
                int i17 = wallpapersListActivity.r;
                HashMap hashMap2 = wallpapersListActivity.d0;
                ArrayList arrayList3 = wallpapersListActivity.a0;
                if (tLObject instanceof TL_account.TL_wallPapers) {
                    TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
                    wallpapersListActivity.c0.clear();
                    hashMap2.clear();
                    int i18 = 2;
                    if (i17 != 1 && i17 != 2) {
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
                                if (i17 != i12 && ((!(z12 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i17 != i18 || z12) && (org.telegram.ui.ActionBar.t6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                                    arrayList3.add(wallPaper);
                                }
                            } else if (wallPaper.settings.background_color != 0 && (org.telegram.ui.ActionBar.t6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0)) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                                int i20 = wallPaperSettings4.second_background_color;
                                if (i20 == 0 || (i11 = wallPaperSettings4.third_background_color) == 0) {
                                    z11 = z21;
                                    me1Var = new me1(wallPaperSettings4.background_color, i20, null, wallPaperSettings4.rotation);
                                } else {
                                    me1Var = new me1(null, wallPaperSettings4.background_color, i20, i11, wallPaperSettings4.fourth_background_color);
                                    z11 = z21;
                                }
                                me1Var.a = wallPaper.slug;
                                me1Var.h = wallPaperSettings4.intensity / 100.0f;
                                me1Var.f = org.telegram.messenger.i0.s1(wallPaperSettings4.rotation, false);
                                me1Var.l = wallPaper;
                                arrayList3.add(me1Var);
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
                    wallpapersListActivity.E0();
                    wallpapersListActivity.getMessagesStorage().p1(1, tL_wallPapers.wallpapers);
                } else {
                    z10 = z21;
                }
                org.telegram.ui.ActionBar.x1 x1Var2 = wallpapersListActivity.L;
                if (x1Var2 != null) {
                    x1Var2.dismiss();
                    if (z10) {
                        return;
                    }
                    wallpapersListActivity.F.y0(0);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.web.j jVar = (org.telegram.ui.web.j) this.c;
                String str2 = (String) this.d;
                boolean z22 = this.b;
                org.telegram.ui.Components.ii iiVar = jVar.x;
                ArrayList arrayList4 = jVar.y;
                arrayList4.clear();
                org.telegram.ui.web.g1.a().getClass();
                ArrayList arrayList5 = new ArrayList();
                try {
                    JSONArray jSONArray = new JSONArray(str2).getJSONArray(1);
                    for (int i21 = 0; i21 < jSONArray.length(); i21++) {
                        arrayList5.add(jSONArray.getString(i21));
                    }
                } catch (Exception e14) {
                    org.telegram.messenger.f8.g(e14, false);
                    try {
                        JSONArray jSONArray2 = new JSONObject(str2).getJSONObject("gossip").getJSONArray("results");
                        for (int i22 = 0; i22 < jSONArray2.length(); i22++) {
                            arrayList5.add(jSONArray2.getJSONObject(i22).getString("key"));
                        }
                    } catch (Exception e15) {
                        org.telegram.messenger.f8.g(e15, false);
                        try {
                            JSONArray jSONArray3 = new JSONArray(str2);
                            for (int i23 = 0; i23 < jSONArray3.length(); i23++) {
                                String string = jSONArray3.getJSONObject(i23).getString("phrase");
                                if (!TextUtils.isEmpty(string)) {
                                    arrayList5.add(string);
                                }
                            }
                        } catch (Exception e16) {
                            org.telegram.messenger.f8.g(e16, false);
                        }
                    }
                }
                arrayList4.addAll(arrayList5);
                iiVar.f3.O(true);
                if (z22 != (!arrayList4.isEmpty())) {
                    iiVar.e3.h1(0, 0);
                    return;
                }
                return;
            case 13:
                ((EglRenderer) this.c).lambda$releaseEglSurface$5(this.b, (Runnable) this.d);
                return;
            case 14:
                ((org.telegram.messenger.j20) this.c).a(Boolean.valueOf(this.b), (String) this.d);
                return;
            case 15:
                ((ih.s) this.c).a(Boolean.valueOf(this.b), (String) this.d);
                return;
            case 16:
                ((org.telegram.ui.Components.q70) this.c).a(Boolean.valueOf(this.b), (String) this.d);
                return;
            case 17:
                org.telegram.messenger.hs hsVar = (org.telegram.messenger.hs) this.c;
                boolean z23 = this.b;
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) this.d;
                ArrayList arrayList6 = new ArrayList();
                try {
                    try {
                        sQLiteDatabase = hsVar.b;
                    } catch (Throwable th6) {
                        th = th6;
                        if (0 != 0) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e17) {
                    e = e17;
                    sQLiteCursor2 = null;
                } catch (Throwable th7) {
                    th = th7;
                    sQLiteCursor = null;
                    if (0 != 0) {
                    }
                    throw th;
                }
                if (sQLiteDatabase == null) {
                    return;
                }
                ArrayList arrayList7 = new ArrayList();
                StringBuilder sb2 = new StringBuilder("SELECT id, data, type FROM story_drafts WHERE type = ");
                sb2.append(z23 ? "2" : "0 OR type = 1");
                sb2.append(" ORDER BY date DESC");
                sQLiteCursor2 = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                while (sQLiteCursor2.next()) {
                    try {
                        long longValue = sQLiteCursor2.longValue(0);
                        NativeByteBuffer byteBufferValue = sQLiteCursor2.byteBufferValue(1);
                        if (byteBufferValue != null) {
                            try {
                                vh.r0 r0Var = new vh.r0(byteBufferValue);
                                r0Var.a = longValue;
                                arrayList6.add(r0Var);
                            } catch (Exception e18) {
                                org.telegram.messenger.f8.g(e18, true);
                                arrayList7.add(Long.valueOf(longValue));
                            }
                            byteBufferValue.reuse();
                        }
                    } catch (Exception e19) {
                        e = e19;
                        org.telegram.messenger.f8.g(e, true);
                        break;
                    }
                }
                sQLiteCursor2.dispose();
                if (arrayList7.size() > 0) {
                    for (int i24 = 0; i24 < arrayList7.size(); i24++) {
                        sQLiteDatabase.executeFast("DELETE FROM story_drafts WHERE id = " + arrayList7.get(i24)).stepThis().dispose();
                    }
                }
                sQLiteCursor2.dispose();
                org.telegram.messenger.i0.g3(new th.o0(29, q20Var, arrayList6));
                return;
            default:
                vh.j2 j2Var = (vh.j2) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                boolean z24 = this.b;
                ArrayList arrayList8 = j2Var.c;
                if (tLObject2 instanceof TLRPC.messages_BotResults) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                    j2Var.h = messages_botresults.next_offset;
                    if (z24) {
                        arrayList8.clear();
                    }
                    for (int i25 = 0; i25 < messages_botresults.results.size(); i25++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i25);
                        TLRPC.Document document2 = botInlineResult.document;
                        if (document2 != null) {
                            arrayList8.add(document2);
                        } else {
                            TLRPC.Photo photo = botInlineResult.photo;
                            if (photo != null) {
                                arrayList8.add(photo);
                            } else if (botInlineResult.content != null) {
                                arrayList8.add(botInlineResult);
                            }
                        }
                    }
                    j2Var.d = false;
                    j2Var.F(false);
                    j2Var.f();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ bk0(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }
}
