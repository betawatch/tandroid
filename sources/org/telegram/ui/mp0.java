package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.webrtc.EglRenderer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mp0(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c4, code lost:
    
        if (r4 == null) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04f1 A[Catch: Exception -> 0x03e0, TryCatch #5 {Exception -> 0x03e0, blocks: (B:231:0x03cf, B:233:0x03d5, B:235:0x03e3, B:237:0x03f0, B:238:0x03f3, B:240:0x0400, B:242:0x0408, B:244:0x0419, B:246:0x041f, B:248:0x0427, B:250:0x042f, B:299:0x04f1, B:301:0x04f6, B:302:0x04f9, B:290:0x04dd, B:293:0x04cd, B:294:0x04e3), top: B:230:0x03cf }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04f6 A[Catch: Exception -> 0x03e0, TryCatch #5 {Exception -> 0x03e0, blocks: (B:231:0x03cf, B:233:0x03d5, B:235:0x03e3, B:237:0x03f0, B:238:0x03f3, B:240:0x0400, B:242:0x0408, B:244:0x0419, B:246:0x041f, B:248:0x0427, B:250:0x042f, B:299:0x04f1, B:301:0x04f6, B:302:0x04f9, B:290:0x04dd, B:293:0x04cd, B:294:0x04e3), top: B:230:0x03cf }] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ?? r42;
        BufferedInputStream bufferedInputStream;
        ZipOutputStream zipOutputStream;
        zh1 zh1Var;
        HashMap hashMap;
        int i10;
        TLRPC.WallPaperSettings wallPaperSettings;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        TLRPC.Document document;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        int i11 = this.a;
        int i12 = 1;
        boolean z11 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i11) {
            case 0:
                zp0.U((zp0) obj2, (TLObject) obj, z11);
                return;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                View view = (View) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                if (!z11) {
                    photoViewer.getClass();
                    view.setVisibility(8);
                }
                photoViewer.s3();
                return;
            case 2:
                PhotoViewer photoViewer2 = (PhotoViewer) obj2;
                String str = (String) obj;
                if (str.equals(photoViewer2.y4.getImageKey())) {
                    photoViewer2.s4 = z11 ? 1 : 0;
                    photoViewer2.t4 = str;
                    return;
                }
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!z11 || profileActivity.H4 != -1) {
                    profileActivity.j5();
                    vz0 vz0Var = profileActivity.d;
                    if (vz0Var != null) {
                        vz0Var.l();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.zg0 zg0Var = profileActivity.W;
                if (zg0Var != null) {
                    org.telegram.ui.Components.wg0 j10 = org.telegram.ui.Components.zg0.j(7, zg0Var.a);
                    if (j10 == null || !j10.s) {
                        r42 = 0;
                    } else {
                        r42 = 0;
                        j10.s = false;
                        zg0Var.invalidate();
                    }
                    if (zArr[r42]) {
                        org.telegram.ui.Components.zg0 zg0Var2 = profileActivity.W;
                        zg0Var2.E = true;
                        zg0Var2.o(7, r42);
                        profileActivity.W.o(9, true);
                        org.telegram.ui.Components.zg0 zg0Var3 = profileActivity.W;
                        if (zg0Var3.E) {
                            zg0Var3.E = r42;
                            zg0Var3.d();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                Activity activity = (Activity) obj;
                try {
                    File logsDir = AndroidUtilities.getLogsDir();
                    if (logsDir == null) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.r1(c2Var, 0));
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
                        int i13 = 65536;
                        try {
                            byte[] bArr = new byte[65536];
                            int i14 = 0;
                            while (i14 < arrayList.size()) {
                                File file5 = (File) arrayList.get(i14);
                                if (!file5.getName().contains("cache4")) {
                                    if (!z11) {
                                        if (file5.getName().contains("_mtproto")) {
                                        }
                                    }
                                    if (currentTimeMillis - file5.lastModified() > 86400000) {
                                        i14++;
                                        i13 = 65536;
                                    }
                                }
                                if (file5.exists() && !file5.isDirectory()) {
                                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file5), i13);
                                    try {
                                        zipOutputStream.putNextEntry(new ZipEntry(file5.getName()));
                                        while (true) {
                                            int read = bufferedInputStream2.read(bArr, 0, i13);
                                            if (read != -1) {
                                                zipOutputStream.write(bArr, 0, read);
                                                i13 = 65536;
                                            } else {
                                                bufferedInputStream2.close();
                                            }
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        bufferedInputStream = bufferedInputStream2;
                                        try {
                                            e.printStackTrace();
                                            if (bufferedInputStream != null) {
                                                bufferedInputStream.close();
                                            }
                                            if (zipOutputStream != null) {
                                                zipOutputStream.close();
                                            }
                                            AndroidUtilities.runOnUIThread(new n20(c2Var, zArr2, activity, file, 28));
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
                                i14++;
                                i13 = 65536;
                            }
                            zArr2[0] = true;
                        } catch (Exception e11) {
                            e = e11;
                            bufferedInputStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            bufferedInputStream = null;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        bufferedInputStream = null;
                        zipOutputStream = null;
                    } catch (Throwable th5) {
                        th = th5;
                        bufferedInputStream = null;
                        zipOutputStream = null;
                    }
                    zipOutputStream.close();
                    AndroidUtilities.runOnUIThread(new n20(c2Var, zArr2, activity, file, 28));
                    return;
                } catch (Exception e13) {
                    e13.printStackTrace();
                    return;
                }
            case 5:
                o31.P((o31) obj2, z11, (org.telegram.ui.Components.ii0) obj);
                return;
            case 6:
                TwoStepVerificationActivity.X((TwoStepVerificationActivity) obj2, z11, (byte[]) obj);
                return;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList2 = wallpapersListActivity.X;
                HashMap hashMap2 = wallpapersListActivity.Y;
                int i15 = wallpapersListActivity.v;
                HashMap hashMap3 = wallpapersListActivity.d0;
                ArrayList arrayList3 = wallpapersListActivity.a0;
                if (tLObject instanceof TL_account.TL_wallPapers) {
                    TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
                    wallpapersListActivity.c0.clear();
                    hashMap3.clear();
                    if (i15 != 1 && i15 != 2) {
                        arrayList3.clear();
                        hashMap2.clear();
                        arrayList2.clear();
                        arrayList2.addAll(tL_wallPapers.wallpapers);
                        arrayList3.addAll(wallpapersListActivity.b0);
                    }
                    int size = tL_wallPapers.wallpapers.size();
                    int i16 = 0;
                    while (i16 < size) {
                        TLRPC.WallPaper wallPaper = tL_wallPapers.wallpapers.get(i16);
                        if (!"fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                            if ((wallPaper instanceof TLRPC.TL_wallPaper) && !(wallPaper.document instanceof TLRPC.TL_documentEmpty)) {
                                hashMap2.put(wallPaper.slug, wallPaper);
                                if (wallPaper.pattern && (document = wallPaper.document) != null && !hashMap3.containsKey(Long.valueOf(document.id))) {
                                    wallpapersListActivity.c0.add(wallPaper);
                                    hashMap3.put(Long.valueOf(wallPaper.document.id), wallPaper);
                                }
                                if (i15 != i12 && ((!(z10 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i15 != 2 || z10) && (org.telegram.ui.ActionBar.g6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                                    arrayList3.add(wallPaper);
                                }
                            } else if (wallPaper.settings.background_color != 0 && (org.telegram.ui.ActionBar.g6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0)) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                                int i17 = wallPaperSettings4.second_background_color;
                                if (i17 == 0 || (i10 = wallPaperSettings4.third_background_color) == 0) {
                                    hashMap = hashMap2;
                                    zh1Var = new zh1(wallPaperSettings4.background_color, i17, null, wallPaperSettings4.rotation);
                                } else {
                                    zh1Var = new zh1(null, wallPaperSettings4.background_color, i17, i10, wallPaperSettings4.fourth_background_color);
                                    hashMap = hashMap2;
                                }
                                zh1Var.a = wallPaper.slug;
                                zh1Var.h = wallPaperSettings4.intensity / 100.0f;
                                zh1Var.f = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                                zh1Var.l = wallPaper;
                                arrayList3.add(zh1Var);
                                i16++;
                                hashMap2 = hashMap;
                                i12 = 1;
                            }
                        }
                        hashMap = hashMap2;
                        i16++;
                        hashMap2 = hashMap;
                        i12 = 1;
                    }
                    wallpapersListActivity.A0();
                    wallpapersListActivity.getMessagesStorage().putWallpapers(tL_wallPapers.wallpapers, 1);
                }
                org.telegram.ui.ActionBar.c2 c2Var2 = wallpapersListActivity.L;
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                    if (z11) {
                        return;
                    }
                    wallpapersListActivity.D.x0(0);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) obj2;
                String str2 = (String) obj;
                org.telegram.ui.web.d dVar = lVar.w;
                ArrayList arrayList4 = lVar.x;
                arrayList4.clear();
                org.telegram.ui.web.k1.a().getClass();
                ArrayList arrayList5 = new ArrayList();
                try {
                    JSONArray jSONArray = new JSONArray(str2).getJSONArray(1);
                    for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                        arrayList5.add(jSONArray.getString(i18));
                    }
                } catch (Exception e14) {
                    FileLog.e((Throwable) e14, false);
                    try {
                        JSONArray jSONArray2 = new JSONObject(str2).getJSONObject("gossip").getJSONArray("results");
                        for (int i19 = 0; i19 < jSONArray2.length(); i19++) {
                            arrayList5.add(jSONArray2.getJSONObject(i19).getString("key"));
                        }
                    } catch (Exception e15) {
                        FileLog.e((Throwable) e15, false);
                        try {
                            JSONArray jSONArray3 = new JSONArray(str2);
                            for (int i20 = 0; i20 < jSONArray3.length(); i20++) {
                                String string = jSONArray3.getJSONObject(i20).getString("phrase");
                                if (!TextUtils.isEmpty(string)) {
                                    arrayList5.add(string);
                                }
                            }
                        } catch (Exception e16) {
                            FileLog.e((Throwable) e16, false);
                        }
                    }
                }
                arrayList4.addAll(arrayList5);
                dVar.U2.N(true);
                if (z11 != (!arrayList4.isEmpty())) {
                    dVar.T2.h1(0, 0);
                    return;
                }
                return;
            case 9:
                ((EglRenderer) obj2).lambda$releaseEglSurface$5(z11, (Runnable) obj);
                return;
            case 10:
                sf.u uVar = (sf.u) obj2;
                MessagesStorage messagesStorage = (MessagesStorage) obj;
                ArrayList arrayList6 = new ArrayList();
                ArrayList<TLRPC.User> arrayList7 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList8 = new ArrayList<>();
                try {
                    try {
                        sQLiteCursor2 = messagesStorage.getDatabase().queryFinalized("SELECT data FROM business_links ORDER BY order_value ASC", new Object[0]);
                        while (sQLiteCursor2.next()) {
                            try {
                                NativeByteBuffer byteBufferValue = sQLiteCursor2.byteBufferValue(0);
                                arrayList6.add(TL_account.TL_businessChatLink.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                            } catch (Exception e17) {
                                e = e17;
                                FileLog.e(e);
                                break;
                            }
                        }
                        sQLiteCursor2.dispose();
                        ArrayList<Long> arrayList9 = new ArrayList<>();
                        ArrayList arrayList10 = new ArrayList();
                        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList6.get(i21);
                            if (!tL_businessChatLink.entities.isEmpty()) {
                                for (int i22 = 0; i22 < tL_businessChatLink.entities.size(); i22++) {
                                    TLRPC.MessageEntity messageEntity = tL_businessChatLink.entities.get(i22);
                                    if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                                        arrayList9.add(Long.valueOf(((TLRPC.TL_messageEntityMentionName) messageEntity).user_id));
                                    } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                        arrayList9.add(Long.valueOf(((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id));
                                    }
                                }
                            }
                        }
                        if (!arrayList9.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList9, arrayList7);
                        }
                        if (!arrayList10.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList10), arrayList8);
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        if (0 != 0) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e18) {
                    e = e18;
                    sQLiteCursor2 = null;
                } catch (Throwable th7) {
                    th = th7;
                    sQLiteCursor = null;
                    if (0 != 0) {
                    }
                    throw th;
                }
                sQLiteCursor2.dispose();
                AndroidUtilities.runOnUIThread(new eg.j(uVar, arrayList6, arrayList7, arrayList8, this.b, 22));
                return;
            case 11:
                ((sh.a) obj2).P((Utilities.Callback) obj, z11, false);
                return;
            case 12:
                ((Utilities.Callback2) obj2).run((Bitmap) obj, Boolean.valueOf(z11));
                return;
            case 13:
                th.p3 p3Var = (th.p3) obj2;
                th.g5 g5Var = (th.g5) obj;
                boolean z12 = !z11;
                th.i5 i5Var = g5Var.v;
                Iterator it = g5Var.D.iterator();
                while (it.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
                    th.j5 m10 = i5Var.m(pagetablecell);
                    if (m10 == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(th.x5.h(pagetablecell));
                        boolean z13 = spannableStringBuilder.length() > 0 && (th.v5.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) != 0;
                        th.x5.l(pagetablecell, z12);
                        if (!z11 && spannableStringBuilder.length() > 0) {
                            th.v5.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        } else if (z11 && z13) {
                            th.v5.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                        }
                        th.x5.d(pagetablecell, spannableStringBuilder);
                    } else if (m10.b != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10.a.getText());
                        boolean z14 = spannableStringBuilder2.length() > 0 && (th.v5.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) != 0;
                        th.x5.l(m10.b, z12);
                        if (z11) {
                            if (z14) {
                                th.v5.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                            }
                        } else if (spannableStringBuilder2.length() > 0) {
                            th.v5.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                        }
                        th.x5.d(m10.b, spannableStringBuilder2);
                        m10.b(m10.b);
                    }
                }
                i5Var.invalidate();
                th.w2 w2Var = g5Var.A;
                if (w2Var != null && g5Var.a != null) {
                    w2Var.a();
                }
                p3Var.M2();
                return;
            default:
                th.o3 o3Var = (th.o3) obj;
                o3Var.f.o3(true);
                th.b4.k((org.telegram.ui.ActionBar.o2) obj2, z11, new th.y3(o3Var, 2));
                return;
        }
    }

    public /* synthetic */ mp0(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }
}
