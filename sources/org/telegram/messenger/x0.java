package org.telegram.messenger;

import android.app.NotificationManager;
import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.m71;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x0(int i7, Object obj, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00d9: MOVE (r5 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:218), block:B:68:0x00d9 */
    /* JADX WARN: Removed duplicated region for block: B:372:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:382:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010c  */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        long j3;
        int i10;
        int i11;
        File file;
        int[] iArr;
        ?? r12;
        File file2;
        long j10;
        long j11;
        File[] fileArr;
        m71 m71Var;
        m71 m71Var2;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        int i12 = 3;
        SQLiteCursor sQLiteCursor3 = null;
        int i13 = 1;
        switch (this.a) {
            case 0:
                int i14 = this.b;
                File file3 = (File) this.c;
                Set set = z0.a;
                long currentTimeMillis = System.currentTimeMillis();
                if (r2.a) {
                    a8.b("checkKeepMedia start task");
                }
                ArrayList arrayList = new ArrayList();
                int i15 = 0;
                boolean z9 = false;
                while (true) {
                    if (i15 < 4) {
                        if (p10.i(i15).p()) {
                            u2 u2Var = p10.i(i15).getMessagesController().r7;
                            arrayList.add(u2Var);
                            if (u2Var.e().size() > 0) {
                                z9 = true;
                            }
                        }
                        i15++;
                    } else {
                        int[] iArr2 = new int[4];
                        int i16 = 0;
                        boolean z10 = true;
                        long j12 = Long.MAX_VALUE;
                        for (int i17 = 4; i16 < i17; i17 = 4) {
                            int i18 = iz.q().getInt(jg.g.j(i16, "keep_media_type_"), u2.b(i16));
                            iArr2[i16] = i18;
                            if (i18 != 2) {
                                z10 = false;
                            }
                            long a10 = u2.a(i18);
                            if (a10 < j12) {
                                j12 = a10;
                            }
                            i16++;
                        }
                        if (z9) {
                            z10 = false;
                        }
                        SparseArray l10 = gc.D().l();
                        long j13 = 0;
                        int i19 = 0;
                        int i20 = 0;
                        while (i19 < l10.size()) {
                            if (z10 && (l10.keyAt(i19) == i13 || l10.keyAt(i19) == 3)) {
                                iArr = iArr2;
                                r12 = i13;
                            } else {
                                int i21 = l10.keyAt(i19) == 4 ? i13 : 0;
                                try {
                                    File[] listFiles = ((File) l10.valueAt(i19)).listFiles();
                                    ArrayList arrayList2 = new ArrayList();
                                    if (listFiles != null) {
                                        int i22 = 0;
                                        while (i22 < listFiles.length) {
                                            try {
                                                if (listFiles[i22].isDirectory() || set.contains(listFiles[i22].getAbsolutePath())) {
                                                    fileArr = listFiles;
                                                } else {
                                                    fileArr = listFiles;
                                                    arrayList2.add(new t2(fileArr[i22]));
                                                }
                                                i22++;
                                                listFiles = fileArr;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                iArr = iArr2;
                                                r12 = 1;
                                                a8.g(th, r12);
                                                i19++;
                                                i13 = r12;
                                                iArr2 = iArr;
                                            }
                                        }
                                    }
                                    for (int i23 = 0; i23 < arrayList.size(); i23++) {
                                        ((u2) arrayList.get(i23)).g(arrayList2);
                                    }
                                    int i24 = 0;
                                    while (i24 < arrayList2.size()) {
                                        t2 t2Var = (t2) arrayList2.get(i24);
                                        boolean z11 = t2Var.d;
                                        File file4 = t2Var.a;
                                        if (z11) {
                                            try {
                                                file2 = file4;
                                                j11 = i14 - u2.a(iArr2[3]);
                                                iArr = iArr2;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                iArr = iArr2;
                                                r12 = 1;
                                                a8.g(th, r12);
                                                i19++;
                                                i13 = r12;
                                                iArr2 = iArr;
                                            }
                                        } else {
                                            file2 = file4;
                                            int i25 = t2Var.b;
                                            iArr = iArr2;
                                            if (i25 != 2) {
                                                if (i25 >= 0) {
                                                    j10 = u2.a(i25);
                                                } else {
                                                    int i26 = t2Var.c;
                                                    if (i26 >= 0) {
                                                        j10 = u2.a(iArr[i26]);
                                                    } else if (i21 == 0) {
                                                        j10 = j12;
                                                    }
                                                }
                                                if (j10 != Long.MAX_VALUE) {
                                                    j11 = i14 - j10;
                                                }
                                            } else {
                                                continue;
                                            }
                                            i24++;
                                            iArr2 = iArr;
                                        }
                                        long lastUsageFileTime = Utilities.getLastUsageFileTime(file2.getAbsolutePath());
                                        if (lastUsageFileTime > 316000000 && lastUsageFileTime < j11) {
                                            try {
                                                if (!set.contains(file2.getPath())) {
                                                    try {
                                                        if (r2.a) {
                                                            i20++;
                                                            j13 += file2.length();
                                                        }
                                                        file2.delete();
                                                    } catch (Exception e10) {
                                                        a8.g(e10, true);
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                r12 = 1;
                                                a8.g(th, r12);
                                                i19++;
                                                i13 = r12;
                                                iArr2 = iArr;
                                            }
                                        }
                                        i24++;
                                        iArr2 = iArr;
                                    }
                                    iArr = iArr2;
                                    r12 = 1;
                                } catch (Throwable th5) {
                                    th = th5;
                                    iArr = iArr2;
                                }
                            }
                            i19++;
                            i13 = r12;
                            iArr2 = iArr;
                        }
                        int i27 = i13;
                        int i28 = iz.q().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID);
                        if (i28 != Integer.MAX_VALUE) {
                            long j14 = i28 == i27 ? 314572800L : i28 * 1048576000;
                            long j15 = 0;
                            for (int i29 = 0; i29 < l10.size(); i29++) {
                                j15 = Utilities.getDirSize(((File) l10.valueAt(i29)).getAbsolutePath(), 0, true) + j15;
                            }
                            if (j15 > j14) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i30 = 0; i30 < l10.size(); i30++) {
                                    z0.a((File) l10.valueAt(i30), arrayList3);
                                }
                                for (int i31 = 0; i31 < arrayList.size(); i31++) {
                                    ((u2) arrayList.get(i31)).g(arrayList3);
                                }
                                Collections.sort(arrayList3, new jg.x(12));
                                long j16 = 0;
                                int i32 = 0;
                                int i33 = 0;
                                int i34 = 0;
                                while (true) {
                                    if (i32 < arrayList3.size()) {
                                        if (((y0) arrayList3.get(i32)).b == 2) {
                                            i7 = i20;
                                        } else {
                                            i7 = i20;
                                            if (((y0) arrayList3.get(i32)).e <= 0) {
                                                i33++;
                                            } else {
                                                long length = ((y0) arrayList3.get(i32)).a.length();
                                                j15 -= length;
                                                i34++;
                                                j16 += length;
                                                try {
                                                    ((y0) arrayList3.get(i32)).a.delete();
                                                } catch (Exception unused) {
                                                }
                                                if (j15 < j14) {
                                                }
                                            }
                                        }
                                        i32++;
                                        i20 = i7;
                                    } else {
                                        i7 = i20;
                                    }
                                }
                                i10 = i34;
                                i11 = i33;
                                j3 = j16;
                                file = new File(file3, "acache");
                                if (file.exists()) {
                                    try {
                                        Utilities.clearDir(file.getAbsolutePath(), 0, i14 - 86400, false);
                                    } catch (Throwable th6) {
                                        a8.g(th6, true);
                                    }
                                }
                                qp.e1().edit().putInt("lastKeepMediaCheckTime", iz.H).apply();
                                if (r2.a) {
                                    return;
                                }
                                a8.b("checkKeepMedia task end time " + (System.currentTimeMillis() - currentTimeMillis) + " auto deleted info: files " + i7 + " size " + g0.i0(j13, false, false) + "   deleted by size limit info: files " + i10 + " size " + g0.i0(j3, false, false) + " unknownTimeFiles " + i11);
                                return;
                            }
                        }
                        i7 = i20;
                        j3 = 0;
                        i10 = 0;
                        i11 = 0;
                        file = new File(file3, "acache");
                        if (file.exists()) {
                        }
                        qp.e1().edit().putInt("lastKeepMediaCheckTime", iz.H).apply();
                        if (r2.a) {
                        }
                    }
                }
                break;
            case 1:
                ArrayList arrayList4 = (ArrayList) this.c;
                int i35 = this.b;
                for (int i36 = 0; i36 < arrayList4.size(); i36++) {
                    File file5 = (File) arrayList4.get(i36);
                    File file6 = new File(file5.getAbsolutePath() + ".enc");
                    if (file6.exists()) {
                        try {
                            if (!file6.delete()) {
                                file6.deleteOnExit();
                            }
                        } catch (Exception e11) {
                            a8.g(e11, true);
                        }
                        try {
                            File file7 = new File(t0.b.getCacheDir(), file5.getName() + ".enc.key");
                            if (!file7.delete()) {
                                file7.deleteOnExit();
                            }
                        } catch (Exception e12) {
                            a8.g(e12, true);
                        }
                    } else if (file5.exists()) {
                        try {
                            if (!file5.delete()) {
                                file5.deleteOnExit();
                            }
                        } catch (Exception e13) {
                            a8.g(e13, true);
                        }
                    }
                    try {
                        File file8 = new File(file5.getParentFile(), "q_" + file5.getName());
                        if (file8.exists() && !file8.delete()) {
                            file8.deleteOnExit();
                        }
                    } catch (Exception e14) {
                        a8.g(e14, true);
                    }
                }
                if (i35 == 2) {
                    gc.D().j();
                    return;
                }
                return;
            case 2:
                FilesMigrationService filesMigrationService = (FilesMigrationService) this.c;
                int i37 = this.b;
                boolean z12 = FilesMigrationService.c;
                ((NotificationManager) filesMigrationService.getSystemService("notification")).notify(qs.Y4, z8.a(filesMigrationService, dt.j0).setContentTitle(id.M0(2131748430, null)).setContentText(i37 + "/" + filesMigrationService.a).setSmallIcon(R.drawable.notification).setAutoCancel(false).setProgress(filesMigrationService.a, i37, false).build());
                return;
            case 3:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.c;
                int i38 = this.b;
                String[] strArr = MediaController.V1;
                try {
                    u1Var.o(i38);
                    return;
                } catch (Exception e15) {
                    a8.g(e15, true);
                    return;
                }
            case 4:
                ue ueVar = (ue) this.c;
                int i39 = this.b;
                MediaController mediaController = ueVar.a;
                if (i39 == 1) {
                    if (mediaController.I(mediaController.u0) && !mediaController.H()) {
                        mediaController.R(mediaController.u0, true);
                    } else if (mediaController.J()) {
                        mediaController.B0(2, 0, false, false);
                    }
                    org.telegram.ui.Components.wt wtVar = org.telegram.ui.Components.wt.O1;
                    if (wtVar != null && (m71Var2 = wtVar.j1) != null && m71Var2.x) {
                        m71Var2.a.g0();
                        m71Var2.n();
                        m71Var2.f0.d(true, true);
                    }
                    mediaController.W = true;
                    return;
                }
                if (i39 == 0) {
                    mediaController.W = false;
                    return;
                }
                if (i39 == 2) {
                    org.telegram.ui.Components.wt wtVar2 = org.telegram.ui.Components.wt.O1;
                    if (wtVar2 != null && (m71Var = wtVar2.j1) != null && m71Var.x) {
                        m71Var.a.g0();
                        m71Var.n();
                        m71Var.f0.d(true, true);
                    }
                    mediaController.W = true;
                    return;
                }
                return;
            case 5:
                int i40 = this.b;
                TLRPC.TL_help_appConfig tL_help_appConfig = (TLRPC.TL_help_appConfig) this.c;
                try {
                    SQLiteDatabase sQLiteDatabase = yr.a0(i40).b;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.executeFast("DELETE FROM app_config").stepThis().dispose();
                        if (tL_help_appConfig != null) {
                            SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("INSERT INTO app_config VALUES(?)");
                            executeFast.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_help_appConfig.getObjectSize());
                            tL_help_appConfig.serializeToStream(nativeByteBuffer);
                            executeFast.bindByteBuffer(1, nativeByteBuffer);
                            executeFast.step();
                            nativeByteBuffer.reuse();
                            executeFast.dispose();
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e16) {
                    a8.g(e16, true);
                    return;
                }
            case 6:
                int i41 = this.b;
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) this.c;
                try {
                    SQLiteDatabase sQLiteDatabase2 = yr.a0(i41).b;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.executeFast("DELETE FROM effects").stepThis().dispose();
                        if (messages_availableeffects != null) {
                            SQLitePreparedStatement executeFast2 = sQLiteDatabase2.executeFast("INSERT INTO effects VALUES(?)");
                            executeFast2.requery();
                            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(messages_availableeffects.getObjectSize());
                            messages_availableeffects.serializeToStream(nativeByteBuffer2);
                            executeFast2.bindByteBuffer(1, nativeByteBuffer2);
                            executeFast2.step();
                            nativeByteBuffer2.reuse();
                            executeFast2.dispose();
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e17) {
                    a8.g(e17, true);
                    return;
                }
            case 7:
                int i42 = this.b;
                v10 v10Var = (v10) this.c;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase3 = yr.a0(i42).b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteCursor = sQLiteDatabase3.queryFinalized("SELECT data FROM web_browser_settings", new Object[0]);
                            try {
                                TL_account.WebBrowserSettings webBrowserSettings = sQLiteCursor.next() ? (TL_account.WebBrowserSettings) sQLiteCursor.tlObjectValue(0, new ch(i12), true) : null;
                                if (webBrowserSettings instanceof TL_account.TL_webBrowserSettings) {
                                    TL_account.TL_webBrowserSettings tL_webBrowserSettings = (TL_account.TL_webBrowserSettings) webBrowserSettings;
                                    v10Var.a(Long.valueOf(tL_webBrowserSettings.hash), tL_webBrowserSettings);
                                } else {
                                    v10Var.a(0L, null);
                                }
                                sQLiteCursor3 = sQLiteCursor;
                            } catch (Exception e18) {
                                e = e18;
                                a8.g(e, true);
                                v10Var.a(0L, null);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        if (sQLiteCursor3 != null) {
                            sQLiteCursor3.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th7) {
                        th = th7;
                        sQLiteCursor3 = sQLiteCursor2;
                        if (sQLiteCursor3 != null) {
                            sQLiteCursor3.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e19) {
                    e = e19;
                    sQLiteCursor = null;
                } catch (Throwable th8) {
                    th = th8;
                    if (sQLiteCursor3 != null) {
                    }
                    throw th;
                }
            case 8:
                int i43 = this.b;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = (TL_account.TL_webBrowserSettings) this.c;
                try {
                    SQLiteDatabase sQLiteDatabase4 = yr.a0(i43).b;
                    if (sQLiteDatabase4 != null) {
                        sQLiteDatabase4.executeFast("DELETE FROM web_browser_settings").stepThis().dispose();
                        if (tL_webBrowserSettings2 != null) {
                            SQLitePreparedStatement executeFast3 = sQLiteDatabase4.executeFast("INSERT INTO web_browser_settings VALUES(?)");
                            executeFast3.requery();
                            executeFast3.bindTlObject(1, tL_webBrowserSettings2);
                            executeFast3.step();
                            executeFast3.dispose();
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e20) {
                    a8.g(e20, true);
                    return;
                }
            case 9:
                ((org.telegram.ui.dg) this.c).a(this.b);
                return;
            case 10:
                PushListenerController.lambda$sendRegistrationToServer$1((String) this.c, this.b);
                return;
            case 11:
                PushListenerController.lambda$processRemoteMessage$2(this.b, (TLRPC.TL_updates) this.c);
                return;
            case 12:
                int i44 = this.b;
                c cVar = (c) this.c;
                try {
                    if (i44 == 1) {
                        qs.e().k(qs.P4, 1, id.M0(2131743833, null));
                    } else if (i44 != 2) {
                        return;
                    } else {
                        qs.f(cVar.a).k(qs.i5, 6);
                    }
                    return;
                } catch (Exception e21) {
                    a8.g(e21, true);
                    return;
                }
            default:
                Utilities.u(this.b + 1, (c20[]) this.c);
                return;
        }
    }

    public /* synthetic */ x0(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
