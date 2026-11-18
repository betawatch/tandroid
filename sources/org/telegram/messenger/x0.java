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
import org.telegram.ui.Components.w71;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00e8: MOVE (r4 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:233), block:B:70:0x00e8 */
    /* JADX WARN: Removed duplicated region for block: B:362:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:372:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j3;
        int i7;
        int i10;
        File file;
        int i11;
        long j10;
        long j11;
        w71 w71Var;
        w71 w71Var2;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        long j12 = 0;
        SQLiteCursor sQLiteCursor3 = null;
        int i12 = 1;
        switch (this.a) {
            case 0:
                int i13 = this.b;
                File file2 = (File) this.c;
                Set set = z0.a;
                long currentTimeMillis = System.currentTimeMillis();
                if (s2.a) {
                    a8.b("checkKeepMedia start task");
                }
                ArrayList arrayList = new ArrayList();
                int i14 = 0;
                boolean z10 = false;
                while (true) {
                    int i15 = 4;
                    if (i14 < 4) {
                        if (j10.i(i14).p()) {
                            v2 v2Var = j10.i(i14).getMessagesController().u7;
                            arrayList.add(v2Var);
                            if (v2Var.e().size() > 0) {
                                z10 = true;
                            }
                        }
                        i14++;
                    } else {
                        int[] iArr = new int[4];
                        int i16 = 0;
                        boolean z11 = true;
                        long j13 = Long.MAX_VALUE;
                        while (i16 < 4) {
                            long j14 = j12;
                            int i17 = bz.q().getInt(i5.c.i(i16, "keep_media_type_"), v2.b(i16));
                            iArr[i16] = i17;
                            if (i17 != 2) {
                                z11 = false;
                            }
                            long a10 = v2.a(i17);
                            if (a10 < j13) {
                                j13 = a10;
                            }
                            i16++;
                            j12 = j14;
                        }
                        long j15 = j12;
                        if (z10) {
                            z11 = false;
                        }
                        SparseArray l10 = ec.D().l();
                        long j16 = j15;
                        int i18 = 0;
                        int i19 = 0;
                        while (i18 < l10.size()) {
                            if (z11 && (l10.keyAt(i18) == i12 || l10.keyAt(i18) == 3)) {
                                i11 = i12;
                            } else {
                                int i20 = l10.keyAt(i18) == i15 ? i12 : 0;
                                try {
                                    File[] listFiles = ((File) l10.valueAt(i18)).listFiles();
                                    ArrayList arrayList2 = new ArrayList();
                                    if (listFiles != null) {
                                        for (int i21 = 0; i21 < listFiles.length; i21++) {
                                            if (!listFiles[i21].isDirectory() && !set.contains(listFiles[i21].getAbsolutePath())) {
                                                arrayList2.add(new u2(listFiles[i21]));
                                            }
                                        }
                                    }
                                    for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                        ((v2) arrayList.get(i22)).g(arrayList2);
                                    }
                                    for (int i23 = 0; i23 < arrayList2.size(); i23++) {
                                        u2 u2Var = (u2) arrayList2.get(i23);
                                        boolean z12 = u2Var.d;
                                        File file3 = u2Var.a;
                                        if (z12) {
                                            j11 = v2.a(iArr[3]);
                                        } else {
                                            int i24 = u2Var.b;
                                            if (i24 != 2) {
                                                if (i24 >= 0) {
                                                    j10 = v2.a(i24);
                                                } else {
                                                    int i25 = u2Var.c;
                                                    if (i25 >= 0) {
                                                        j10 = v2.a(iArr[i25]);
                                                    } else if (i20 == 0) {
                                                        j10 = j13;
                                                    }
                                                }
                                                if (j10 != Long.MAX_VALUE) {
                                                    j11 = j10;
                                                }
                                            }
                                        }
                                        long j17 = i13 - j11;
                                        long lastUsageFileTime = Utilities.getLastUsageFileTime(file3.getAbsolutePath());
                                        if (lastUsageFileTime > 316000000 && lastUsageFileTime < j17 && !set.contains(file3.getPath())) {
                                            try {
                                                if (s2.a) {
                                                    i19++;
                                                    j16 += file3.length();
                                                }
                                                file3.delete();
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
                            i18++;
                            i12 = i11;
                            i15 = 4;
                        }
                        int i26 = i12;
                        int i27 = bz.q().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID);
                        if (i27 != Integer.MAX_VALUE) {
                            long j18 = i27 == i26 ? 314572800L : i27 * 1048576000;
                            long j19 = j15;
                            for (int i28 = 0; i28 < l10.size(); i28++) {
                                j19 += Utilities.getDirSize(((File) l10.valueAt(i28)).getAbsolutePath(), 0, true);
                            }
                            if (j19 > j18) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i29 = 0; i29 < l10.size(); i29++) {
                                    z0.a((File) l10.valueAt(i29), arrayList3);
                                }
                                for (int i30 = 0; i30 < arrayList.size(); i30++) {
                                    ((v2) arrayList.get(i30)).g(arrayList3);
                                }
                                Collections.sort(arrayList3, new jg.w(11));
                                long j20 = j15;
                                int i31 = 0;
                                int i32 = 0;
                                for (int i33 = 0; i33 < arrayList3.size(); i33++) {
                                    if (((y0) arrayList3.get(i33)).b != 2) {
                                        long j21 = j19;
                                        if (((y0) arrayList3.get(i33)).e <= j15) {
                                            i31++;
                                        } else {
                                            long length = ((y0) arrayList3.get(i33)).a.length();
                                            j21 -= length;
                                            i32++;
                                            j20 += length;
                                            try {
                                                ((y0) arrayList3.get(i33)).a.delete();
                                            } catch (Exception unused) {
                                            }
                                            if (j21 < j18) {
                                                i7 = i32;
                                                j3 = j20;
                                                i10 = i31;
                                                file = new File(file2, "acache");
                                                if (file.exists()) {
                                                    try {
                                                        Utilities.clearDir(file.getAbsolutePath(), 0, i13 - 86400, false);
                                                    } catch (Throwable th3) {
                                                        a8.g(th3, true);
                                                    }
                                                }
                                                mp.g1().edit().putInt("lastKeepMediaCheckTime", bz.H).apply();
                                                if (s2.a) {
                                                    a8.b("checkKeepMedia task end time " + (System.currentTimeMillis() - currentTimeMillis) + " auto deleted info: files " + i19 + " size " + g0.i0(j16, false, false) + "   deleted by size limit info: files " + i7 + " size " + g0.i0(j3, false, false) + " unknownTimeFiles " + i10);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        j19 = j21;
                                    }
                                }
                                i7 = i32;
                                j3 = j20;
                                i10 = i31;
                                file = new File(file2, "acache");
                                if (file.exists()) {
                                }
                                mp.g1().edit().putInt("lastKeepMediaCheckTime", bz.H).apply();
                                if (s2.a) {
                                }
                            }
                        }
                        j3 = j15;
                        i7 = 0;
                        i10 = 0;
                        file = new File(file2, "acache");
                        if (file.exists()) {
                        }
                        mp.g1().edit().putInt("lastKeepMediaCheckTime", bz.H).apply();
                        if (s2.a) {
                        }
                    }
                }
                break;
            case 1:
                ArrayList arrayList4 = (ArrayList) this.c;
                int i34 = this.b;
                for (int i35 = 0; i35 < arrayList4.size(); i35++) {
                    File file4 = (File) arrayList4.get(i35);
                    File file5 = new File(file4.getAbsolutePath() + ".enc");
                    if (file5.exists()) {
                        try {
                            if (!file5.delete()) {
                                file5.deleteOnExit();
                            }
                        } catch (Exception e11) {
                            a8.g(e11, true);
                        }
                        try {
                            File file6 = new File(t0.b.getCacheDir(), file4.getName() + ".enc.key");
                            if (!file6.delete()) {
                                file6.deleteOnExit();
                            }
                        } catch (Exception e12) {
                            a8.g(e12, true);
                        }
                    } else if (file4.exists()) {
                        try {
                            if (!file4.delete()) {
                                file4.deleteOnExit();
                            }
                        } catch (Exception e13) {
                            a8.g(e13, true);
                        }
                    }
                    try {
                        File file7 = new File(file4.getParentFile(), "q_" + file4.getName());
                        if (file7.exists() && !file7.delete()) {
                            file7.deleteOnExit();
                        }
                    } catch (Exception e14) {
                        a8.g(e14, true);
                    }
                }
                if (i34 == 2) {
                    ec.D().j();
                    return;
                }
                return;
            case 2:
                FilesMigrationService filesMigrationService = (FilesMigrationService) this.c;
                int i36 = this.b;
                boolean z13 = FilesMigrationService.c;
                ((NotificationManager) filesMigrationService.getSystemService("notification")).notify(ks.Y4, f9.b.a(filesMigrationService, xs.k0).setContentTitle(gd.M0(2131748238, null)).setContentText(i36 + "/" + filesMigrationService.a).setSmallIcon(R.drawable.notification).setAutoCancel(false).setProgress(filesMigrationService.a, i36, false).build());
                return;
            case 3:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.c;
                int i37 = this.b;
                String[] strArr = MediaController.W1;
                try {
                    u1Var.o(i37);
                    return;
                } catch (Exception e15) {
                    a8.g(e15, true);
                    return;
                }
            case 4:
                se seVar = (se) this.c;
                int i38 = this.b;
                MediaController mediaController = seVar.a;
                if (i38 == 1) {
                    if (mediaController.I(mediaController.v0) && !mediaController.H()) {
                        mediaController.R(mediaController.v0, true);
                    } else if (mediaController.J()) {
                        mediaController.B0(2, 0, false, false);
                    }
                    org.telegram.ui.Components.gu guVar = org.telegram.ui.Components.gu.S1;
                    if (guVar != null && (w71Var2 = guVar.n1) != null && w71Var2.x) {
                        w71Var2.a.g0();
                        w71Var2.n();
                        w71Var2.g0.d(true, true);
                    }
                    mediaController.X = true;
                    return;
                }
                if (i38 == 0) {
                    mediaController.X = false;
                    return;
                }
                if (i38 == 2) {
                    org.telegram.ui.Components.gu guVar2 = org.telegram.ui.Components.gu.S1;
                    if (guVar2 != null && (w71Var = guVar2.n1) != null && w71Var.x) {
                        w71Var.a.g0();
                        w71Var.n();
                        w71Var.g0.d(true, true);
                    }
                    mediaController.X = true;
                    return;
                }
                return;
            case 5:
                int i39 = this.b;
                TLRPC.TL_help_appConfig tL_help_appConfig = (TLRPC.TL_help_appConfig) this.c;
                try {
                    SQLiteDatabase sQLiteDatabase = tr.a0(i39).b;
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
                    SQLiteDatabase sQLiteDatabase2 = tr.a0(i40).b;
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
                q10 q10Var = (q10) this.c;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase3 = tr.a0(i41).b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteCursor = sQLiteDatabase3.queryFinalized("SELECT data FROM web_browser_settings", new Object[0]);
                            try {
                                TL_account.WebBrowserSettings webBrowserSettings = sQLiteCursor.next() ? (TL_account.WebBrowserSettings) sQLiteCursor.tlObjectValue(0, new ed(8), true) : null;
                                if (webBrowserSettings instanceof TL_account.TL_webBrowserSettings) {
                                    TL_account.TL_webBrowserSettings tL_webBrowserSettings = (TL_account.TL_webBrowserSettings) webBrowserSettings;
                                    q10Var.a(Long.valueOf(tL_webBrowserSettings.hash), tL_webBrowserSettings);
                                } else {
                                    q10Var.a(0L, null);
                                }
                                sQLiteCursor3 = sQLiteCursor;
                            } catch (Exception e18) {
                                e = e18;
                                a8.g(e, true);
                                q10Var.a(0L, null);
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
                    SQLiteDatabase sQLiteDatabase4 = tr.a0(i42).b;
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
                ((ai.u2) this.c).a(Integer.valueOf(this.b));
                return;
            case 10:
                ((org.telegram.ui.cg) this.c).a(this.b);
                return;
            case 11:
                PushListenerController.lambda$sendRegistrationToServer$1((String) this.c, this.b);
                return;
            case 12:
                PushListenerController.lambda$processRemoteMessage$2(this.b, (TLRPC.TL_updates) this.c);
                return;
            case 13:
                int i43 = this.b;
                c cVar = (c) this.c;
                try {
                    if (i43 == 1) {
                        ks.e().k(ks.S4, 1, gd.M0(2131743596, null));
                    } else if (i43 != 2) {
                        return;
                    } else {
                        ks.f(cVar.a).k(ks.l5, 6);
                    }
                    return;
                } catch (Exception e21) {
                    a8.g(e21, true);
                    return;
                }
            default:
                Utilities.u(this.b + 1, (x10[]) this.c);
                return;
        }
    }

    public /* synthetic */ x0(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
