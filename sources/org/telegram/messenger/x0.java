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
import org.telegram.ui.Components.d71;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x0(int i3, Object obj, int i10) {
        this.a = i10;
        this.b = i3;
        this.c = obj;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00d8: MOVE (r4 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:217), block:B:68:0x00d8 */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:371:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        File file;
        long j10;
        int i3;
        int i10;
        File file2;
        int i11;
        long j11;
        long j12;
        d71 d71Var;
        d71 d71Var2;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        long j13 = 0;
        SQLiteCursor sQLiteCursor3 = null;
        int i12 = 0;
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
                boolean z10 = false;
                while (true) {
                    int i16 = 4;
                    if (i15 < 4) {
                        if (h10.i(i15).p()) {
                            u2 u2Var = h10.i(i15).getMessagesController().r7;
                            arrayList.add(u2Var);
                            if (u2Var.e().size() > 0) {
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
                            int i18 = az.q().getInt(k2.p1.i(i17, "keep_media_type_"), u2.b(i17));
                            iArr[i17] = i18;
                            if (i18 != 2) {
                                z11 = false;
                            }
                            long a10 = u2.a(i18);
                            if (a10 < j14) {
                                j14 = a10;
                            }
                            i17++;
                            j13 = j15;
                        }
                        long j16 = j13;
                        if (z10) {
                            z11 = false;
                        }
                        SparseArray l10 = zb.D().l();
                        long j17 = j16;
                        int i19 = 0;
                        int i20 = 0;
                        while (i19 < l10.size()) {
                            if (z11 && (l10.keyAt(i19) == i13 || l10.keyAt(i19) == 3)) {
                                i11 = i13;
                            } else {
                                int i21 = l10.keyAt(i19) == i16 ? i13 : 0;
                                try {
                                    File[] listFiles = ((File) l10.valueAt(i19)).listFiles();
                                    ArrayList arrayList2 = new ArrayList();
                                    if (listFiles != null) {
                                        for (int i22 = 0; i22 < listFiles.length; i22++) {
                                            if (!listFiles[i22].isDirectory() && !set.contains(listFiles[i22].getAbsolutePath())) {
                                                arrayList2.add(new t2(listFiles[i22]));
                                            }
                                        }
                                    }
                                    for (int i23 = 0; i23 < arrayList.size(); i23++) {
                                        ((u2) arrayList.get(i23)).g(arrayList2);
                                    }
                                    for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                                        t2 t2Var = (t2) arrayList2.get(i24);
                                        boolean z12 = t2Var.d;
                                        File file4 = t2Var.a;
                                        if (z12) {
                                            j12 = u2.a(iArr[3]);
                                        } else {
                                            int i25 = t2Var.b;
                                            if (i25 != 2) {
                                                if (i25 >= 0) {
                                                    j11 = u2.a(i25);
                                                } else {
                                                    int i26 = t2Var.c;
                                                    if (i26 >= 0) {
                                                        j11 = u2.a(iArr[i26]);
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
                                        long lastUsageFileTime = Utilities.getLastUsageFileTime(file4.getAbsolutePath());
                                        if (lastUsageFileTime > 316000000 && lastUsageFileTime < j18 && !set.contains(file4.getPath())) {
                                            try {
                                                if (r2.a) {
                                                    i20++;
                                                    j17 += file4.length();
                                                }
                                                file4.delete();
                                            } catch (Exception e10) {
                                                a8.g(e10, true);
                                            }
                                        }
                                    }
                                    i11 = 1;
                                } catch (Throwable th2) {
                                    i11 = 1;
                                    a8.g(th2, true);
                                }
                            }
                            i19++;
                            i13 = i11;
                            i16 = 4;
                        }
                        int i27 = i13;
                        int i28 = az.q().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID);
                        if (i28 != Integer.MAX_VALUE) {
                            long j19 = i28 == i27 ? 314572800L : i28 * 1048576000;
                            long j20 = j16;
                            for (int i29 = 0; i29 < l10.size(); i29++) {
                                j20 += Utilities.getDirSize(((File) l10.valueAt(i29)).getAbsolutePath(), 0, true);
                            }
                            if (j20 > j19) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i30 = 0; i30 < l10.size(); i30++) {
                                    z0.a((File) l10.valueAt(i30), arrayList3);
                                }
                                for (int i31 = 0; i31 < arrayList.size(); i31++) {
                                    ((u2) arrayList.get(i31)).g(arrayList3);
                                }
                                int i32 = 2;
                                Collections.sort(arrayList3, new o0.a(i32));
                                long j21 = j16;
                                int i33 = 0;
                                int i34 = 0;
                                i10 = 0;
                                while (true) {
                                    if (i33 < arrayList3.size()) {
                                        if (((y0) arrayList3.get(i33)).b == i32) {
                                            file = file3;
                                        } else {
                                            file = file3;
                                            if (((y0) arrayList3.get(i33)).e <= j16) {
                                                i34++;
                                            } else {
                                                long length = ((y0) arrayList3.get(i33)).a.length();
                                                j20 -= length;
                                                i10++;
                                                j21 += length;
                                                try {
                                                    ((y0) arrayList3.get(i33)).a.delete();
                                                } catch (Exception unused) {
                                                }
                                                if (j20 < j19) {
                                                }
                                            }
                                        }
                                        i33++;
                                        file3 = file;
                                        i32 = 2;
                                    } else {
                                        file = file3;
                                    }
                                }
                                i3 = i34;
                                j10 = j21;
                                file2 = new File(file, "acache");
                                if (file2.exists()) {
                                    try {
                                        Utilities.clearDir(file2.getAbsolutePath(), 0, i14 - 86400, false);
                                    } catch (Throwable th3) {
                                        a8.g(th3, true);
                                    }
                                }
                                hp.e1().edit().putInt("lastKeepMediaCheckTime", az.H).apply();
                                if (r2.a) {
                                    return;
                                }
                                a8.b("checkKeepMedia task end time " + (System.currentTimeMillis() - currentTimeMillis) + " auto deleted info: files " + i20 + " size " + g0.i0(j17, false, false) + "   deleted by size limit info: files " + i10 + " size " + g0.i0(j10, false, false) + " unknownTimeFiles " + i3);
                                return;
                            }
                        }
                        file = file3;
                        j10 = j16;
                        i3 = 0;
                        i10 = 0;
                        file2 = new File(file, "acache");
                        if (file2.exists()) {
                        }
                        hp.e1().edit().putInt("lastKeepMediaCheckTime", az.H).apply();
                        if (r2.a) {
                        }
                    }
                }
                break;
            case 1:
                ArrayList arrayList4 = (ArrayList) this.c;
                int i35 = this.b;
                while (i12 < arrayList4.size()) {
                    File file5 = (File) arrayList4.get(i12);
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
                    i12++;
                }
                if (i35 == 2) {
                    zb.D().j();
                    return;
                }
                return;
            case 2:
                FilesMigrationService filesMigrationService = (FilesMigrationService) this.c;
                int i36 = this.b;
                boolean z13 = FilesMigrationService.c;
                ((NotificationManager) filesMigrationService.getSystemService("notification")).notify(hs.Y4, e9.b.a(filesMigrationService, us.k0).setContentTitle(bd.M0(2131748438, null)).setContentText(i36 + "/" + filesMigrationService.a).setSmallIcon(R.drawable.notification).setAutoCancel(false).setProgress(filesMigrationService.a, i36, false).build());
                return;
            case 3:
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.c;
                int i37 = this.b;
                String[] strArr = MediaController.W1;
                try {
                    s1Var.o(i37);
                    return;
                } catch (Exception e15) {
                    a8.g(e15, true);
                    return;
                }
            case 4:
                ne neVar = (ne) this.c;
                int i38 = this.b;
                MediaController mediaController = neVar.a;
                if (i38 == 1) {
                    if (mediaController.I(mediaController.v0) && !mediaController.H()) {
                        mediaController.R(mediaController.v0, true);
                    } else if (mediaController.J()) {
                        mediaController.B0(2, 0, false, false);
                    }
                    org.telegram.ui.Components.ut utVar = org.telegram.ui.Components.ut.K1;
                    if (utVar != null && (d71Var2 = utVar.k1) != null && d71Var2.x) {
                        d71Var2.a.g0();
                        d71Var2.n();
                        d71Var2.g0.d(true, true);
                    }
                    mediaController.X = true;
                    return;
                }
                if (i38 == 0) {
                    mediaController.X = false;
                    return;
                }
                if (i38 == 2) {
                    org.telegram.ui.Components.ut utVar2 = org.telegram.ui.Components.ut.K1;
                    if (utVar2 != null && (d71Var = utVar2.k1) != null && d71Var.x) {
                        d71Var.a.g0();
                        d71Var.n();
                        d71Var.g0.d(true, true);
                    }
                    mediaController.X = true;
                    return;
                }
                return;
            case 5:
                int i39 = this.b;
                TLRPC.TL_help_appConfig tL_help_appConfig = (TLRPC.TL_help_appConfig) this.c;
                try {
                    SQLiteDatabase sQLiteDatabase = qr.a0(i39).b;
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
                int i40 = this.b;
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) this.c;
                try {
                    SQLiteDatabase sQLiteDatabase2 = qr.a0(i40).b;
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
                int i41 = this.b;
                n10 n10Var = (n10) this.c;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase3 = qr.a0(i41).b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteCursor = sQLiteDatabase3.queryFinalized("SELECT data FROM web_browser_settings", new Object[0]);
                            try {
                                TL_account.WebBrowserSettings webBrowserSettings = sQLiteCursor.next() ? (TL_account.WebBrowserSettings) sQLiteCursor.tlObjectValue(0, new go(i12), true) : null;
                                if (webBrowserSettings instanceof TL_account.TL_webBrowserSettings) {
                                    TL_account.TL_webBrowserSettings tL_webBrowserSettings = (TL_account.TL_webBrowserSettings) webBrowserSettings;
                                    n10Var.a(Long.valueOf(tL_webBrowserSettings.hash), tL_webBrowserSettings);
                                } else {
                                    n10Var.a(0L, null);
                                }
                                sQLiteCursor3 = sQLiteCursor;
                            } catch (Exception e18) {
                                e = e18;
                                a8.g(e, true);
                                n10Var.a(0L, null);
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
                } catch (Exception e19) {
                    e = e19;
                    sQLiteCursor = null;
                } catch (Throwable th5) {
                    th = th5;
                    if (sQLiteCursor3 != null) {
                    }
                    throw th;
                }
            case 8:
                int i42 = this.b;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = (TL_account.TL_webBrowserSettings) this.c;
                try {
                    SQLiteDatabase sQLiteDatabase4 = qr.a0(i42).b;
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
                ((org.telegram.ui.bg) this.c).a(this.b);
                return;
            case 10:
                PushListenerController.lambda$sendRegistrationToServer$1((String) this.c, this.b);
                return;
            case 11:
                PushListenerController.lambda$processRemoteMessage$2(this.b, (TLRPC.TL_updates) this.c);
                return;
            case 12:
                int i43 = this.b;
                c cVar = (c) this.c;
                try {
                    if (i43 == 1) {
                        hs.e().k(hs.P4, 1, bd.M0(2131743843, null));
                    } else if (i43 != 2) {
                        return;
                    } else {
                        hs.f(cVar.a).k(hs.i5, 6);
                    }
                    return;
                } catch (Exception e21) {
                    a8.g(e21, true);
                    return;
                }
            default:
                Utilities.u(this.b + 1, (u10[]) this.c);
                return;
        }
    }

    public /* synthetic */ x0(Object obj, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
    }
}
