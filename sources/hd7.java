// default package

import android.app.ActivityManager;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class hd7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kf7 b;

    public /* synthetic */ hd7(kf7 kf7Var, byte b) {
        this.a = b;
        this.b = kf7Var;
    }

    private final void a() {
        kf7 kf7Var;
        int i = 0;
        while (true) {
            kf7Var = this.b;
            if (i >= 2) {
                break;
            }
            kf7Var.getUserConfig().w(i, 0, 0, 0L, 0L, 0L, 0L);
            kf7Var.getUserConfig().y(i, 0);
            i++;
        }
        yac userConfig = kf7Var.getUserConfig();
        userConfig.j().edit().remove("filtersLoaded").apply();
        userConfig.Q = false;
        yac userConfig2 = kf7Var.getUserConfig();
        SharedPreferences.Editor edit = userConfig2.j().edit();
        for (String str : userConfig2.j().getAll().keySet()) {
            if (str.startsWith("2pinnedDialogsLoaded")) {
                edit.remove(str);
            }
        }
        edit.apply();
        kf7Var.getNotificationCenter().k(jn7.O4, new Object[0]);
        kf7Var.getMediaDataController().G0(false, true, null);
        kf7Var.getNotificationCenter().k(jn7.w5, new Object[0]);
        kf7Var.getMessagesController().O1().p();
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x029d, code lost:
    
        if (r4 != null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0341, code lost:
    
        if (r5 != null) goto L208;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:0x026f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.concurrent.atomic.AtomicBoolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.util.concurrent.atomic.AtomicBoolean] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.util.concurrent.atomic.AtomicBoolean] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        SQLiteDatabase sQLiteDatabase;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        int i;
        boolean z;
        boolean z2;
        ?? r12;
        SQLitePreparedStatement sQLitePreparedStatement3;
        SQLitePreparedStatement sQLitePreparedStatement4;
        SQLitePreparedStatement sQLitePreparedStatement5;
        String str;
        kf7 kf7Var = this.b;
        kf7Var.X = null;
        if (kf7Var.b == null || kf7Var.c == null || kf7Var.Z || !kf7Var.getMessagesController().o3) {
            return;
        }
        ?? r3 = 0;
        int i2 = 0;
        while (true) {
            String[][] strArr = kf7.s0;
            if (i2 >= 4) {
                return;
            }
            String str2 = strArr[i2][r3];
            try {
                if (kf7Var.q0(str2)) {
                    kf7Var.U0(str2);
                    i = i2;
                } else {
                    if (kf7Var.a0) {
                        return;
                    }
                    if (kf7Var.Y >= 20) {
                        StringBuilder p = ik8.p("deferred index ", str2, " given up for this launch after ");
                        p.append(kf7Var.Y);
                        p.append(" attempts");
                        cc4.b(p.toString());
                        return;
                    }
                    if (!kf7Var.j()) {
                        kf7Var.F1(60000L);
                        return;
                    }
                    if (kf7Var.c != null && kf7Var.c0 < 3 && (kf7Var.b0 == 0 || SystemClock.elapsedRealtime() - kf7Var.b0 >= 60000)) {
                        long length = kf7Var.c.length();
                        try {
                            ActivityManager activityManager = (ActivityManager) a.b.getSystemService("activity");
                            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                            activityManager.getMemoryInfo(memoryInfo);
                            if (length >= 67108864 && length <= memoryInfo.availMem / 2 && kf7.t0.compareAndSet(r3, true)) {
                                kf7Var.a0 = true;
                                kf7Var.c0++;
                                Thread thread = new Thread(new cq6((Object) kf7Var, (Object) kf7Var.c, length, (byte) 14), "deferredIndexPrewarm_" + kf7Var.currentAccount);
                                thread.setPriority(1);
                                thread.start();
                                return;
                            }
                        } catch (Throwable th) {
                            cc4.g(th, true);
                        }
                    }
                    if (!kf7.t0.compareAndSet(r3, true)) {
                        kf7Var.F1(20000L);
                        return;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    StringBuilder p2 = ik8.p("deferred index ", str2, " build started, db size ");
                    p2.append(kf7Var.c.length());
                    p2.append(", attempts before = ");
                    c00.q(kf7Var.Y, p2);
                    try {
                        sQLiteDatabase = new SQLiteDatabase(kf7Var.c.getPath());
                        try {
                            sQLiteDatabase.interrupt();
                            int tryTransactionState = kf7Var.b.tryTransactionState();
                            kf7Var.b.setInterruptOnBusy(sQLiteDatabase);
                            if (tryTransactionState != 0) {
                                throw new SQLiteException("interrupted: the app's connection is in a transaction (" + tryTransactionState + ")");
                            }
                            try {
                                sQLiteDatabase.executeFast("PRAGMA busy_timeout = 2000").stepThis().dispose();
                                synchronized (kf7Var.V) {
                                    try {
                                        kf7Var.W = sQLiteDatabase;
                                    } finally {
                                    }
                                }
                                Thread thread2 = new Thread(new t87(kf7Var, sQLiteDatabase, (byte) 14), "deferredIndexWatchdog_" + kf7Var.currentAccount);
                                try {
                                    thread2.setPriority(5);
                                    thread2.start();
                                    int i3 = r3;
                                    while (true) {
                                        String[] strArr2 = kf7.s0[i2];
                                        if (i3 <= strArr2.length) {
                                            if (i3 == 0) {
                                                str = "BEGIN IMMEDIATE";
                                            } else if (i3 < strArr2.length) {
                                                str = strArr2[i3];
                                            } else {
                                                if (kf7Var.b.tryTransactionState() != 0) {
                                                    throw new SQLiteException("interrupted: the app's connection started a transaction");
                                                }
                                                str = "COMMIT";
                                            }
                                            sQLitePreparedStatement2 = sQLiteDatabase.executeFast(str);
                                            try {
                                                int step = sQLitePreparedStatement2.step();
                                                sQLitePreparedStatement2.dispose();
                                                if (step < 0) {
                                                    throw new SQLiteException("database is locked");
                                                }
                                                i3++;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                try {
                                                    String message = th.getMessage();
                                                    if (message == null) {
                                                    }
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append("deferred index ");
                                                    sb.append(str2);
                                                    sb.append(" not built after ");
                                                    i = i2;
                                                    sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                                                    sb.append("ms: ");
                                                    sb.append(message);
                                                    cc4.b(sb.toString());
                                                    synchronized (kf7Var.V) {
                                                    }
                                                } catch (Throwable th3) {
                                                    synchronized (kf7Var.V) {
                                                        kf7Var.W = null;
                                                        if (r12 != 0) {
                                                            r12.interrupt();
                                                        }
                                                        if (sQLitePreparedStatement2 != null) {
                                                            sQLitePreparedStatement2.dispose();
                                                        }
                                                        if (sQLiteDatabase != null) {
                                                            for (int i4 = 0; i4 < 20; i4++) {
                                                                try {
                                                                    sQLitePreparedStatement3 = sQLiteDatabase.executeFast("ROLLBACK");
                                                                    try {
                                                                        sQLitePreparedStatement3.step();
                                                                    } catch (Throwable th4) {
                                                                        th = th4;
                                                                        try {
                                                                            String message2 = th.getMessage();
                                                                            if (message2 == null || !message2.contains("no transaction")) {
                                                                                if (sQLitePreparedStatement3 != null) {
                                                                                    sQLitePreparedStatement3.dispose();
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            if (sQLitePreparedStatement3 != null) {
                                                                                sQLitePreparedStatement3.dispose();
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    sQLitePreparedStatement3 = null;
                                                                }
                                                                sQLitePreparedStatement3.dispose();
                                                                break;
                                                            }
                                                        }
                                                        try {
                                                            kf7Var.b.setInterruptOnBusy(null);
                                                        } catch (Throwable unused) {
                                                        }
                                                        if (sQLiteDatabase != null) {
                                                            sQLiteDatabase.close();
                                                        }
                                                        kf7.t0.set(false);
                                                        throw th3;
                                                    }
                                                }
                                            }
                                        } else {
                                            z2 = kf7Var.q0(str2);
                                            synchronized (kf7Var.V) {
                                                kf7Var.W = null;
                                            }
                                            thread2.interrupt();
                                            if (!z2) {
                                                for (int i5 = r3; i5 < 20; i5++) {
                                                    try {
                                                        sQLitePreparedStatement5 = sQLiteDatabase.executeFast("ROLLBACK");
                                                        try {
                                                            sQLitePreparedStatement5.step();
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            try {
                                                                String message3 = th.getMessage();
                                                                if (message3 == null || !message3.contains("no transaction")) {
                                                                    if (sQLitePreparedStatement5 != null) {
                                                                        sQLitePreparedStatement5.dispose();
                                                                    }
                                                                }
                                                            } finally {
                                                                if (sQLitePreparedStatement5 != null) {
                                                                    sQLitePreparedStatement5.dispose();
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                        sQLitePreparedStatement5 = null;
                                                    }
                                                    break;
                                                }
                                            }
                                            try {
                                                kf7Var.b.setInterruptOnBusy(null);
                                            } catch (Throwable unused2) {
                                            }
                                            sQLiteDatabase.close();
                                            kf7.t0.set(r3);
                                            z = r3;
                                            i = i2;
                                        }
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    sQLitePreparedStatement2 = null;
                                    r12 = thread2;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                sQLitePreparedStatement = null;
                                sQLitePreparedStatement2 = sQLitePreparedStatement;
                                r12 = sQLitePreparedStatement;
                                String message4 = th.getMessage();
                                z = (message4 == null && message4.contains("interrupt")) ? true : r3;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("deferred index ");
                                sb2.append(str2);
                                sb2.append(" not built after ");
                                i = i2;
                                sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                                sb2.append("ms: ");
                                sb2.append(message4);
                                cc4.b(sb2.toString());
                                synchronized (kf7Var.V) {
                                    kf7Var.W = null;
                                }
                                if (r12 != 0) {
                                    r12.interrupt();
                                }
                                if (sQLitePreparedStatement2 != null) {
                                    sQLitePreparedStatement2.dispose();
                                }
                                if (sQLiteDatabase != null) {
                                    for (int i6 = 0; i6 < 20; i6++) {
                                        try {
                                            sQLitePreparedStatement4 = sQLiteDatabase.executeFast("ROLLBACK");
                                            try {
                                                sQLitePreparedStatement4.step();
                                            } catch (Throwable th10) {
                                                th = th10;
                                                try {
                                                    String message5 = th.getMessage();
                                                    if (message5 == null || !message5.contains("no transaction")) {
                                                        if (sQLitePreparedStatement4 != null) {
                                                            sQLitePreparedStatement4.dispose();
                                                        }
                                                    }
                                                } finally {
                                                    if (sQLitePreparedStatement4 != null) {
                                                        sQLitePreparedStatement4.dispose();
                                                    }
                                                }
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            sQLitePreparedStatement4 = null;
                                        }
                                        sQLitePreparedStatement4.dispose();
                                        break;
                                    }
                                }
                                try {
                                    kf7Var.b.setInterruptOnBusy(null);
                                } catch (Throwable unused3) {
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                kf7.t0.set(false);
                                z2 = false;
                                if (!z2) {
                                    if (kf7Var.Z) {
                                        return;
                                    }
                                    int i7 = kf7Var.Y + (z ? 1 : 5);
                                    kf7Var.Y = i7;
                                    kf7Var.F1(Math.min(600000L, i7 * 30000));
                                    return;
                                }
                                StringBuilder p3 = ik8.p("deferred index ", str2, " built in ");
                                p3.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                                p3.append("ms, attempts before = ");
                                p3.append(kf7Var.Y);
                                cc4.b(p3.toString());
                                kf7Var.U0(str2);
                                i2 = i + 1;
                                r3 = 0;
                            }
                        } catch (Throwable th12) {
                            kf7Var.Z = true;
                            throw th12;
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        sQLiteDatabase = null;
                        sQLitePreparedStatement = null;
                    }
                }
                i2 = i + 1;
                r3 = 0;
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
    }

    private final void c() {
        kf7 kf7Var = this.b;
        try {
            kf7Var.b.executeFast("DELETE FROM story_pushes").stepThis().dispose();
        } catch (Exception e) {
            kf7Var.p(e, true);
        }
    }

    private final void d() {
        kf7 kf7Var = this.b;
        try {
            kf7Var.b.executeFast("DELETE FROM unread_push_messages WHERE is_reaction = 2").stepThis().dispose();
        } catch (Exception e) {
            kf7Var.p(e, true);
        }
    }

    private final void e() {
        kf7 kf7Var = this.b;
        kf7Var.q(true);
        kf7Var.t();
        kf7Var.W0(1);
        hl.c3(new hd7(kf7Var, (byte) 22));
    }

    private final void f() {
        Throwable th;
        SQLiteCursor queryFinalized;
        kf7 kf7Var = this.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 1;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                queryFinalized = kf7Var.b.queryFinalized("SELECT * FROM contacts WHERE 1", new Object[0]);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ArrayList arrayList3 = new ArrayList();
            while (queryFinalized.next()) {
                long intValue = queryFinalized.intValue(0);
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = intValue;
                tL_contact.mutual = queryFinalized.intValue(1) == 1;
                arrayList.add(tL_contact);
                arrayList3.add(Long.valueOf(tL_contact.user_id));
            }
            queryFinalized.dispose();
            if (!arrayList3.isEmpty()) {
                kf7Var.m0(arrayList3, arrayList2, false);
            }
        } catch (Exception e2) {
            e = e2;
            sQLiteCursor = queryFinalized;
            arrayList.clear();
            arrayList2.clear();
            kf7Var.p(e, true);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            lv2 contactsController = kf7Var.getContactsController();
            contactsController.getClass();
            hl.c3(new av2(contactsController, arrayList2, i, arrayList, (byte) 0));
        } catch (Throwable th3) {
            th = th3;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor == null) {
                throw th;
            }
            sQLiteCursor.dispose();
            throw th;
        }
        lv2 contactsController2 = kf7Var.getContactsController();
        contactsController2.getClass();
        hl.c3(new av2(contactsController2, arrayList2, i, arrayList, (byte) 0));
    }

    private final void g() {
        kf7 kf7Var = this.b;
        ArrayList arrayList = kf7Var.getMessagesController().G0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ac7) arrayList.get(i)).d = ((ac7) arrayList.get(i)).e;
        }
        kf7Var.L = kf7Var.N;
        kf7Var.M = kf7Var.O;
        jn7 notificationCenter = kf7Var.getNotificationCenter();
        int i2 = uc7.s5;
        notificationCenter.k(2, 256);
    }

    private final void h() {
        kf7 kf7Var = this.b;
        if (kf7Var.X != null || kf7Var.a0) {
            return;
        }
        kf7Var.Y = 0;
        kf7Var.F1(15000L);
    }

    private final void i() {
        kf7 kf7Var = this.b;
        kf7Var.getNotificationCenter().k(jn7.w5, new Object[0]);
        kf7Var.getNotificationCenter().k(jn7.O4, new Object[0]);
        kf7Var.getMessagesController().F1().a();
    }

    private final void j() {
        kf7 kf7Var = this.b;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = kf7Var.b.queryFinalized("SELECT data FROM wallpapers2 WHERE 1 ORDER BY num ASC", new Object[0]);
                ArrayList arrayList = new ArrayList();
                while (sQLiteCursor.next()) {
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        TLRPC.WallPaper TLdeserialize = TLRPC.WallPaper.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        if (TLdeserialize != null) {
                            arrayList.add(TLdeserialize);
                        }
                    }
                }
                hl.c3(new se(arrayList, (byte) 7));
                sQLiteCursor.dispose();
            } catch (Exception e) {
                kf7Var.p(e, true);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    private final void k() {
        this.b.C0();
    }

    private final void l() {
        this.b.getNotificationCenter().k(jn7.w5, new Object[0]);
    }

    private final void m() {
        kf7 kf7Var = this.b;
        ArrayList arrayList = kf7Var.getMessagesController().G0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ac7) arrayList.get(i)).d = ((ac7) arrayList.get(i)).e;
        }
        kf7Var.L = kf7Var.N;
        kf7Var.M = kf7Var.O;
        jn7 notificationCenter = kf7Var.getNotificationCenter();
        int i2 = uc7.s5;
        notificationCenter.k(2, 256);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ec  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v44 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteCursor sQLiteCursor;
        boolean z;
        int i = 3;
        ?? r5 = 0;
        int i2 = 1;
        switch (this.a) {
            case 0:
                b();
                return;
            case 1:
                kf7 kf7Var = this.b;
                if (kf7Var.R) {
                    return;
                }
                kf7Var.R = true;
                jn7.f(kf7Var.currentAccount).k(jn7.V4, Boolean.TRUE);
                hl.d3(new hd7(kf7Var, (byte) 3), 15000L);
                return;
            case 2:
                kf7 kf7Var2 = this.b;
                try {
                    zh6 zh6Var = new zh6();
                    Map<String, ?> all = uc7.s1(kf7Var2.currentAccount).X3.getAll();
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        String key = entry.getKey();
                        if (key.startsWith("notify2_")) {
                            Integer num = (Integer) entry.getValue();
                            if (num.intValue() == 2 || num.intValue() == 3) {
                                String replace = key.replace("notify2_", "");
                                long j = 1;
                                if (num.intValue() != 2) {
                                    if (((Integer) all.get("notifyuntil_" + replace)) != null) {
                                        j = 1 | (r0.intValue() << 32);
                                    }
                                }
                                try {
                                    zh6Var.k(Long.parseLong(replace), Long.valueOf(j));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                    try {
                        kf7Var2.b.beginTransaction();
                        SQLitePreparedStatement executeFast = kf7Var2.b.executeFast("REPLACE INTO dialog_settings VALUES(?, ?)");
                        for (int i3 = 0; i3 < zh6Var.m(); i3++) {
                            executeFast.requery();
                            executeFast.bindLong(1, zh6Var.j(i3));
                            executeFast.bindLong(2, ((Long) zh6Var.n(i3)).longValue());
                            executeFast.step();
                        }
                        executeFast.dispose();
                        kf7Var2.b.commitTransaction();
                        return;
                    } catch (Exception e2) {
                        kf7Var2.p(e2, true);
                        return;
                    }
                } catch (Throwable th) {
                    kf7Var2.p(th, true);
                    return;
                }
            case 3:
                kf7 kf7Var3 = this.b;
                kf7Var3.R = false;
                jn7.f(kf7Var3.currentAccount).k(jn7.V4, Boolean.FALSE);
                return;
            case 4:
                kf7 kf7Var4 = this.b;
                try {
                    kf7Var4.b.executeFast("DELETE FROM widget_heights").stepThis().dispose();
                } catch (Exception e3) {
                    kf7Var4.p(e3, true);
                }
                int i4 = kf7Var4.currentAccount;
                ConcurrentHashMap concurrentHashMap = k0d.a;
                hl.c3(new gw0(i4, (byte) 18));
                return;
            case 5:
                kf7 kf7Var5 = this.b;
                if (kf7Var5.R) {
                    kf7Var5.R = false;
                    jn7.f(kf7Var5.currentAccount).k(jn7.V4, Boolean.FALSE);
                    return;
                }
                return;
            case 6:
                jn7.f(this.b.currentAccount).k(jn7.d5, new Object[0]);
                return;
            case 7:
                kf7 kf7Var6 = this.b;
                kf7Var6.R = true;
                jn7.f(kf7Var6.currentAccount).k(jn7.V4, Boolean.TRUE);
                return;
            case 8:
                kf7 kf7Var7 = this.b;
                kf7Var7.R = false;
                jn7.f(kf7Var7.currentAccount).k(jn7.V4, Boolean.FALSE);
                return;
            case 9:
                try {
                    this.b.b.executeFast("DELETE FROM fact_checks WHERE expires > " + System.currentTimeMillis()).stepThis().dispose();
                    return;
                } catch (Exception e4) {
                    cc4.g(e4, true);
                    return;
                }
            case 10:
                kf7 kf7Var8 = this.b;
                ArrayList arrayList = kf7Var8.getMessagesController().G0;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((ac7) arrayList.get(i5)).d = ((ac7) arrayList.get(i5)).e;
                }
                kf7Var8.L = kf7Var8.N;
                kf7Var8.M = kf7Var8.O;
                return;
            case 11:
                a();
                return;
            case 12:
                this.b.u1(true);
                return;
            case 13:
                kf7 kf7Var9 = this.b;
                try {
                    kf7Var9.b.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e5) {
                    kf7Var9.p(e5, true);
                    return;
                }
            case 14:
                this.b.getNotificationCenter().k(jn7.F1, new Object[0]);
                return;
            case 15:
                c();
                return;
            case 16:
                d();
                return;
            case 17:
                e();
                return;
            case 18:
                f();
                return;
            case 19:
                g();
                return;
            case 20:
                h();
                return;
            case 21:
                this.b.z0();
                return;
            case 22:
                i();
                return;
            case 23:
                this.b.getMessagesController().F1().a();
                return;
            case 24:
                this.b.D0();
                return;
            case 25:
                k();
                return;
            case 26:
                l();
                return;
            case 27:
                j();
                return;
            case 28:
                m();
                return;
            default:
                kf7 kf7Var10 = this.b;
                try {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    SparseArray sparseArray = new SparseArray();
                    arrayList2.add(Long.valueOf(kf7Var10.getUserConfig().e()));
                    SQLiteCursor queryFinalized = kf7Var10.b.queryFinalized("SELECT id, ord, unread_count, flags, title, color, entities, noanimate FROM dialog_filter WHERE 1", new Object[0]);
                    boolean z2 = false;
                    int i6 = 0;
                    while (queryFinalized.next()) {
                        try {
                            try {
                                ac7 ac7Var = new ac7();
                                ac7Var.a = queryFinalized.intValue(r5);
                                ac7Var.f = queryFinalized.intValue(i2);
                                ac7Var.d = -1;
                                ac7Var.e = -1;
                                ac7Var.g = queryFinalized.intValue(i);
                                ac7Var.b = queryFinalized.stringValue(4);
                                ac7Var.m = queryFinalized.intValue(5);
                                ac7Var.c = new ArrayList();
                                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(6);
                                if (byteBufferValue != null) {
                                    try {
                                        ac7Var.c = Vector.deserialize(byteBufferValue, new hz6((byte) 13), (boolean) r5);
                                        byteBufferValue.reuse();
                                    } catch (Exception e6) {
                                        e = e6;
                                        z = i2;
                                        sQLiteCursor = queryFinalized;
                                        sQLitePreparedStatement = null;
                                        try {
                                            kf7Var10.p(e, z);
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            if (sQLitePreparedStatement != null) {
                                                sQLitePreparedStatement.dispose();
                                            }
                                            throw th;
                                        }
                                    }
                                }
                                ac7Var.n = queryFinalized.intValue(7) == i2 ? i2 : r5;
                                kf7Var10.I.add(ac7Var);
                                kf7Var10.J.put(ac7Var.a, ac7Var);
                                sparseArray.put(ac7Var.a, ac7Var);
                                if (ac7Var.e < 0) {
                                    i6 = i2;
                                }
                                int i7 = r5;
                                int i8 = r5;
                                while (i7 < 2) {
                                    SQLiteDatabase sQLiteDatabase = kf7Var10.b;
                                    SQLiteCursor queryFinalized2 = i7 == 0 ? sQLiteDatabase.queryFinalized("SELECT peer, pin FROM dialog_filter_pin_v2 WHERE id = " + ac7Var.a, new Object[i8]) : sQLiteDatabase.queryFinalized("SELECT peer FROM dialog_filter_ep WHERE id = " + ac7Var.a, new Object[i8]);
                                    while (queryFinalized2.next()) {
                                        ArrayList arrayList6 = arrayList3;
                                        long longValue = queryFinalized2.longValue(i8);
                                        if (i7 == 0) {
                                            if (!wf3.B(longValue)) {
                                                ac7Var.h.add(Long.valueOf(longValue));
                                            }
                                            int intValue = queryFinalized2.intValue(1);
                                            if (intValue != Integer.MIN_VALUE) {
                                                ac7Var.j.put(longValue, intValue);
                                                if (!arrayList5.contains(Long.valueOf(longValue))) {
                                                    arrayList5.add(Long.valueOf(longValue));
                                                }
                                            }
                                        } else if (!wf3.B(longValue)) {
                                            ac7Var.i.add(Long.valueOf(longValue));
                                        }
                                        if (wf3.y(longValue)) {
                                            long j2 = -longValue;
                                            if (!arrayList6.contains(Long.valueOf(j2))) {
                                                arrayList6.add(Long.valueOf(j2));
                                            }
                                        } else if (!wf3.D(longValue)) {
                                            int i9 = (int) (longValue & 4294967295L);
                                            if (!arrayList4.contains(Integer.valueOf(i9))) {
                                                arrayList4.add(Integer.valueOf(i9));
                                            }
                                        } else if (!arrayList2.contains(Long.valueOf(longValue))) {
                                            arrayList2.add(Long.valueOf(longValue));
                                        }
                                        arrayList3 = arrayList6;
                                        i8 = 0;
                                    }
                                    queryFinalized2.dispose();
                                    i7++;
                                    arrayList3 = arrayList3;
                                    i8 = 0;
                                }
                                ArrayList arrayList7 = arrayList3;
                                if (ac7Var.a == 0) {
                                    z2 = true;
                                }
                                arrayList3 = arrayList7;
                                i = 3;
                                r5 = 0;
                                i2 = 1;
                            } catch (Exception e7) {
                                e = e7;
                                sQLiteCursor = queryFinalized;
                                sQLitePreparedStatement = null;
                                z = 1;
                                kf7Var10.p(e, z);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteCursor = queryFinalized;
                            sQLitePreparedStatement = null;
                            if (sQLiteCursor != null) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            throw th;
                        }
                    }
                    ArrayList arrayList8 = arrayList3;
                    queryFinalized.dispose();
                    if (!z2) {
                        ac7 ac7Var2 = new ac7();
                        ac7Var2.a = 0;
                        ac7Var2.f = 0;
                        ac7Var2.m = -1;
                        ac7Var2.b = "ALL_CHATS";
                        int i10 = 0;
                        while (true) {
                            int size2 = kf7Var10.I.size();
                            ArrayList arrayList9 = kf7Var10.I;
                            if (i10 < size2) {
                                ((ac7) arrayList9.get(i10)).f++;
                                i10++;
                            } else {
                                arrayList9.add(ac7Var2);
                                kf7Var10.J.put(ac7Var2.a, ac7Var2);
                                sparseArray.put(ac7Var2.a, ac7Var2);
                                sQLitePreparedStatement = kf7Var10.b.executeFast("REPLACE INTO dialog_filter VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
                                try {
                                    sQLitePreparedStatement.bindInteger(1, ac7Var2.a);
                                    sQLitePreparedStatement.bindInteger(2, ac7Var2.f);
                                    sQLitePreparedStatement.bindInteger(3, ac7Var2.d);
                                    sQLitePreparedStatement.bindInteger(4, ac7Var2.g);
                                    sQLitePreparedStatement.bindString(5, ac7Var2.b);
                                    sQLitePreparedStatement.bindInteger(6, ac7Var2.m);
                                    Vector vector = new Vector(new hz6((byte) 13));
                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(vector.getObjectSize());
                                    vector.serializeToStream(nativeByteBuffer);
                                    sQLitePreparedStatement.bindByteBuffer(7, nativeByteBuffer);
                                    sQLitePreparedStatement.bindInteger(8, ac7Var2.n ? 1 : 0);
                                    sQLitePreparedStatement.stepThis().dispose();
                                    nativeByteBuffer.reuse();
                                } catch (Exception e8) {
                                    e = e8;
                                    sQLiteCursor = null;
                                    z = 1;
                                    kf7Var10.p(e, z);
                                    if (sQLiteCursor != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    sQLiteCursor = null;
                                    if (sQLiteCursor != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    throw th;
                                }
                            }
                        }
                    }
                    Collections.sort(kf7Var10.I, new vk6((byte) 24));
                    if (i6 != 0) {
                        kf7Var10.i(true);
                    }
                    TLRPC.TL_messages_dialogs H0 = !arrayList5.isEmpty() ? kf7Var10.H0(arrayList2, arrayList8, arrayList4, TextUtils.join(",", arrayList5)) : new TLRPC.TL_messages_dialogs();
                    ArrayList arrayList10 = new ArrayList();
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    if (!arrayList4.isEmpty()) {
                        kf7Var10.V(TextUtils.join(",", arrayList4), arrayList12, arrayList2);
                    }
                    if (!arrayList2.isEmpty()) {
                        kf7Var10.m0(arrayList2, arrayList10, false);
                    }
                    if (!arrayList8.isEmpty()) {
                        kf7Var10.R(TextUtils.join(",", arrayList8), arrayList11);
                    }
                    uc7 messagesController = kf7Var10.getMessagesController();
                    ArrayList arrayList13 = new ArrayList(kf7Var10.I);
                    messagesController.getClass();
                    Utilities.d.c(new oa7(messagesController, H0, arrayList12, null, 0, arrayList13, arrayList10, arrayList11, null));
                    return;
                } catch (Exception e9) {
                    e = e9;
                    sQLitePreparedStatement = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLitePreparedStatement = null;
                }
        }
    }
}
