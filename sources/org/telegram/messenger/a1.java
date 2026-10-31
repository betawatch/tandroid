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
import org.telegram.ui.Components.m81;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a1(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00da: MOVE (r4 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:219), block:B:68:0x00da */
    /* JADX WARN: Removed duplicated region for block: B:360:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:370:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j10;
        int i10;
        int i11;
        File file;
        int i12;
        long j11;
        long j12;
        m81 m81Var;
        m81 m81Var2;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        long j13 = 0;
        SQLiteCursor sQLiteCursor3 = null;
        int i13 = 1;
        switch (this.a) {
            case 0:
                int i14 = this.b;
                File file2 = (File) this.c;
                Set set = c1.a;
                long currentTimeMillis = System.currentTimeMillis();
                if (v2.a) {
                    f8.b("checkKeepMedia start task");
                }
                ArrayList arrayList = new ArrayList();
                int i15 = 0;
                boolean z10 = false;
                while (true) {
                    int i16 = 4;
                    if (i15 < 4) {
                        if (d20.i(i15).p()) {
                            y2 y2Var = d20.i(i15).getMessagesController().s7;
                            arrayList.add(y2Var);
                            if (y2Var.e().size() > 0) {
                                z10 = true;
                            }
                        }
                        i15++;
                    } else {
                        int[] iArr = new int[4];
                        int i17 = 0;
                        boolean z11 = true;
                        long j14 = Long.MAX_VALUE;
                        while (i17 < 4) {
                            long j15 = j13;
                            int i18 = tz.q().getInt(i0.a.i(i17, "keep_media_type_"), y2.b(i17));
                            iArr[i17] = i18;
                            if (i18 != 2) {
                                z11 = false;
                            }
                            long a2 = y2.a(i18);
                            if (a2 < j14) {
                                j14 = a2;
                            }
                            i17++;
                            j13 = j15;
                        }
                        long j16 = j13;
                        if (z10) {
                            z11 = false;
                        }
                        SparseArray l4 = hc.D().l();
                        long j17 = j16;
                        int i19 = 0;
                        int i20 = 0;
                        while (i19 < l4.size()) {
                            if (z11 && (l4.keyAt(i19) == i13 || l4.keyAt(i19) == 3)) {
                                i12 = i13;
                            } else {
                                int i21 = l4.keyAt(i19) == i16 ? i13 : 0;
                                try {
                                    File[] listFiles = ((File) l4.valueAt(i19)).listFiles();
                                    ArrayList arrayList2 = new ArrayList();
                                    if (listFiles != null) {
                                        for (int i22 = 0; i22 < listFiles.length; i22++) {
                                            if (!listFiles[i22].isDirectory() && !set.contains(listFiles[i22].getAbsolutePath())) {
                                                arrayList2.add(new x2(listFiles[i22]));
                                            }
                                        }
                                    }
                                    for (int i23 = 0; i23 < arrayList.size(); i23++) {
                                        ((y2) arrayList.get(i23)).g(arrayList2);
                                    }
                                    for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                                        x2 x2Var = (x2) arrayList2.get(i24);
                                        boolean z12 = x2Var.d;
                                        File file3 = x2Var.a;
                                        if (z12) {
                                            j12 = y2.a(iArr[3]);
                                        } else {
                                            int i25 = x2Var.b;
                                            if (i25 != 2) {
                                                if (i25 >= 0) {
                                                    j11 = y2.a(i25);
                                                } else {
                                                    int i26 = x2Var.c;
                                                    if (i26 >= 0) {
                                                        j11 = y2.a(iArr[i26]);
                                                    } else if (i21 == 0) {
                                                        j11 = j14;
                                                    }
                                                }
                                                if (j11 != Long.MAX_VALUE) {
                                                    j12 = j11;
                                                }
                                            }
                                        }
                                        long j18 = i14 - j12;
                                        long lastUsageFileTime = Utilities.getLastUsageFileTime(file3.getAbsolutePath());
                                        if (lastUsageFileTime > 316000000 && lastUsageFileTime < j18 && !set.contains(file3.getPath())) {
                                            try {
                                                if (v2.a) {
                                                    i20++;
                                                    j17 += file3.length();
                                                }
                                                file3.delete();
                                            } catch (Exception e) {
                                                f8.g(e, true);
                                            }
                                        }
                                    }
                                    i12 = 1;
                                } catch (Throwable th2) {
                                    i12 = 1;
                                    f8.g(th2, true);
                                }
                            }
                            i19++;
                            i13 = i12;
                            i16 = 4;
                        }
                        int i27 = i13;
                        int i28 = tz.q().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID);
                        if (i28 != Integer.MAX_VALUE) {
                            long j19 = i28 == i27 ? 314572800L : i28 * 1048576000;
                            long j20 = j16;
                            for (int i29 = 0; i29 < l4.size(); i29++) {
                                j20 += Utilities.getDirSize(((File) l4.valueAt(i29)).getAbsolutePath(), 0, true);
                            }
                            if (j20 > j19) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i30 = 0; i30 < l4.size(); i30++) {
                                    c1.a((File) l4.valueAt(i30), arrayList3);
                                }
                                for (int i31 = 0; i31 < arrayList.size(); i31++) {
                                    ((y2) arrayList.get(i31)).g(arrayList3);
                                }
                                Collections.sort(arrayList3, new a4.d(14));
                                long j21 = j16;
                                int i32 = 0;
                                int i33 = 0;
                                for (int i34 = 0; i34 < arrayList3.size(); i34++) {
                                    if (((b1) arrayList3.get(i34)).b != 2) {
                                        long j22 = j20;
                                        if (((b1) arrayList3.get(i34)).e <= j16) {
                                            i32++;
                                        } else {
                                            long length = ((b1) arrayList3.get(i34)).a.length();
                                            j22 -= length;
                                            i33++;
                                            j21 += length;
                                            try {
                                                ((b1) arrayList3.get(i34)).a.delete();
                                            } catch (Exception unused) {
                                            }
                                            if (j22 < j19) {
                                                i10 = i33;
                                                j10 = j21;
                                                i11 = i32;
                                                file = new File(file2, "acache");
                                                if (file.exists()) {
                                                    try {
                                                        Utilities.clearDir(file.getAbsolutePath(), 0, i14 - 86400, false);
                                                    } catch (Throwable th3) {
                                                        f8.g(th3, true);
                                                    }
                                                }
                                                vp.d1().edit().putInt("lastKeepMediaCheckTime", tz.H).apply();
                                                if (v2.a) {
                                                    f8.b("checkKeepMedia task end time " + (System.currentTimeMillis() - currentTimeMillis) + " auto deleted info: files " + i20 + " size " + i0.i0(j17, false, false) + "   deleted by size limit info: files " + i10 + " size " + i0.i0(j10, false, false) + " unknownTimeFiles " + i11);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        j20 = j22;
                                    }
                                }
                                i10 = i33;
                                j10 = j21;
                                i11 = i32;
                                file = new File(file2, "acache");
                                if (file.exists()) {
                                }
                                vp.d1().edit().putInt("lastKeepMediaCheckTime", tz.H).apply();
                                if (v2.a) {
                                }
                            }
                        }
                        j10 = j16;
                        i10 = 0;
                        i11 = 0;
                        file = new File(file2, "acache");
                        if (file.exists()) {
                        }
                        vp.d1().edit().putInt("lastKeepMediaCheckTime", tz.H).apply();
                        if (v2.a) {
                        }
                    }
                }
                break;
            case 1:
                ArrayList arrayList4 = (ArrayList) this.c;
                int i35 = this.b;
                for (int i36 = 0; i36 < arrayList4.size(); i36++) {
                    File file4 = (File) arrayList4.get(i36);
                    File file5 = new File(file4.getAbsolutePath() + ".enc");
                    if (file5.exists()) {
                        try {
                            if (!file5.delete()) {
                                file5.deleteOnExit();
                            }
                        } catch (Exception e7) {
                            f8.g(e7, true);
                        }
                        try {
                            File file6 = new File(w0.b.getCacheDir(), file4.getName() + ".enc.key");
                            if (!file6.delete()) {
                                file6.deleteOnExit();
                            }
                        } catch (Exception e10) {
                            f8.g(e10, true);
                        }
                    } else if (file4.exists()) {
                        try {
                            if (!file4.delete()) {
                                file4.deleteOnExit();
                            }
                        } catch (Exception e11) {
                            f8.g(e11, true);
                        }
                    }
                    try {
                        File file7 = new File(file4.getParentFile(), "q_" + file4.getName());
                        if (file7.exists() && !file7.delete()) {
                            file7.deleteOnExit();
                        }
                    } catch (Exception e12) {
                        f8.g(e12, true);
                    }
                }
                if (i35 == 2) {
                    hc.D().j();
                    return;
                }
                return;
            case 2:
                FilesMigrationService filesMigrationService = (FilesMigrationService) this.c;
                int i37 = this.b;
                boolean z13 = FilesMigrationService.c;
                ((NotificationManager) filesMigrationService.getSystemService("notification")).notify(zs.Y4, c9.b.a(filesMigrationService, ot.j0).setContentTitle(cd.L0(2131748445, null)).setContentText(i37 + "/" + filesMigrationService.a).setSmallIcon(R.drawable.notification).setAutoCancel(false).setProgress(filesMigrationService.a, i37, false).build());
                return;
            case 3:
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.c;
                int i38 = this.b;
                String[] strArr = MediaController.U1;
                try {
                    x1Var.o(i38);
                    return;
                } catch (Exception e13) {
                    f8.g(e13, true);
                    return;
                }
            case 4:
                te teVar = (te) this.c;
                int i39 = this.b;
                MediaController mediaController = teVar.a;
                if (i39 == 1) {
                    if (mediaController.I(mediaController.u0) && !mediaController.H()) {
                        mediaController.R(mediaController.u0, true);
                    } else if (mediaController.J()) {
                        mediaController.B0(2, 0, false, false);
                    }
                    org.telegram.ui.Components.hu huVar = org.telegram.ui.Components.hu.J1;
                    if (huVar != null && (m81Var2 = huVar.j1) != null && m81Var2.x) {
                        m81Var2.a.g0();
                        m81Var2.n();
                        m81Var2.f0.d(true, true);
                    }
                    mediaController.W = true;
                    return;
                }
                if (i39 == 0) {
                    mediaController.W = false;
                    return;
                }
                if (i39 == 2) {
                    org.telegram.ui.Components.hu huVar2 = org.telegram.ui.Components.hu.J1;
                    if (huVar2 != null && (m81Var = huVar2.j1) != null && m81Var.x) {
                        m81Var.a.g0();
                        m81Var.n();
                        m81Var.f0.d(true, true);
                    }
                    mediaController.W = true;
                    return;
                }
                return;
            case 5:
                int i40 = this.b;
                TLRPC.TL_help_appConfig tL_help_appConfig = (TLRPC.TL_help_appConfig) this.c;
                try {
                    SQLiteDatabase sQLiteDatabase = hs.a0(i40).b;
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
                } catch (Exception e14) {
                    f8.g(e14, true);
                    return;
                }
            case 6:
                int i41 = this.b;
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) this.c;
                try {
                    SQLiteDatabase sQLiteDatabase2 = hs.a0(i41).b;
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
                } catch (Exception e15) {
                    f8.g(e15, true);
                    return;
                }
            case 7:
                int i42 = this.b;
                j20 j20Var = (j20) this.c;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase3 = hs.a0(i42).b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteCursor = sQLiteDatabase3.queryFinalized("SELECT data FROM web_browser_settings", new Object[0]);
                            try {
                                TL_account.WebBrowserSettings webBrowserSettings = sQLiteCursor.next() ? (TL_account.WebBrowserSettings) sQLiteCursor.tlObjectValue(0, new e9(17), true) : null;
                                if (webBrowserSettings instanceof TL_account.TL_webBrowserSettings) {
                                    TL_account.TL_webBrowserSettings tL_webBrowserSettings = (TL_account.TL_webBrowserSettings) webBrowserSettings;
                                    j20Var.a(Long.valueOf(tL_webBrowserSettings.hash), tL_webBrowserSettings);
                                } else {
                                    j20Var.a(0L, null);
                                }
                                sQLiteCursor3 = sQLiteCursor;
                            } catch (Exception e16) {
                                e = e16;
                                f8.g(e, true);
                                j20Var.a(0L, null);
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
                    } catch (Throwable th4) {
                        th = th4;
                        sQLiteCursor3 = sQLiteCursor2;
                        if (sQLiteCursor3 != null) {
                            sQLiteCursor3.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e17) {
                    e = e17;
                    sQLiteCursor = null;
                } catch (Throwable th5) {
                    th = th5;
                    if (sQLiteCursor3 != null) {
                    }
                    throw th;
                }
            case 8:
                int i43 = this.b;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = (TL_account.TL_webBrowserSettings) this.c;
                try {
                    SQLiteDatabase sQLiteDatabase4 = hs.a0(i43).b;
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
                } catch (Exception e18) {
                    f8.g(e18, true);
                    return;
                }
            case 9:
                ((org.telegram.ui.sg) this.c).a(this.b);
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
                        zs.e().k(zs.P4, 1, cd.L0(2131743858, null));
                    } else if (i44 != 2) {
                        return;
                    } else {
                        zs.f(cVar.a).k(zs.i5, 6);
                    }
                    return;
                } catch (Exception e19) {
                    f8.g(e19, true);
                    return;
                }
            default:
                Utilities.u(this.b + 1, (q20[]) this.c);
                return;
        }
    }

    public /* synthetic */ a1(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
