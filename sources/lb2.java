// default package

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class lb2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lb2(Object obj, int i, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = j;
    }

    private final void a() {
        k5 k5Var = (k5) this.d;
        r7a B = r7a.B(k5Var.a);
        ArrayList arrayList = (ArrayList) B.a.get("group_" + this.c);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        d7a d7aVar = (d7a) arrayList.get(0);
        r47 r47Var = (r47) c00.g(1, d7aVar.x);
        d7aVar.G = r47Var.e1();
        r47Var.k.params.put("final", "1");
        TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
        tL_messages_messages.messages.add(r47Var.k);
        if (!d7aVar.I && !d7aVar.J) {
            jf7.Y(k5Var.a).e1(-2, 0, this.b != 0 ? 1 : 0, d7aVar.a, 0L, tL_messages_messages, false);
        }
        B.s0(d7aVar, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ba A[Catch: all -> 0x0404, Exception -> 0x0407, TryCatch #2 {all -> 0x0404, blocks: (B:37:0x00e9, B:39:0x00f4, B:43:0x00ff, B:46:0x011d, B:107:0x02b4, B:109:0x02ba, B:110:0x02c0, B:113:0x02df, B:115:0x02e5, B:120:0x030b, B:140:0x0130), top: B:36:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c5 A[Catch: Exception -> 0x040b, all -> 0x0417, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x040b, blocks: (B:67:0x01b1, B:68:0x01ca, B:70:0x01d0, B:75:0x0209, B:105:0x025d, B:112:0x02c5, B:122:0x030e), top: B:66:0x01b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0153 A[Catch: Exception -> 0x018e, all -> 0x01a1, TRY_LEAVE, TryCatch #0 {all -> 0x01a1, blocks: (B:28:0x00d6, B:32:0x00de, B:52:0x014d, B:54:0x0153), top: B:27:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d0 A[Catch: Exception -> 0x040b, all -> 0x0417, TRY_LEAVE, TryCatch #3 {Exception -> 0x040b, blocks: (B:67:0x01b1, B:68:0x01ca, B:70:0x01d0, B:75:0x0209, B:105:0x025d, B:112:0x02c5, B:122:0x030e), top: B:66:0x01b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0445  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        uc7 uc7Var;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteCursor sQLiteCursor2;
        boolean z;
        SQLitePreparedStatement sQLitePreparedStatement2;
        ArrayList arrayList;
        long j;
        SQLiteCursor sQLiteCursor3;
        ArrayList arrayList2;
        boolean z2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i;
        int intValue;
        int i2;
        int i3;
        boolean z3;
        int i4;
        NativeByteBuffer byteBufferValue;
        byte b = this.a;
        long j2 = this.c;
        int i5 = 0;
        int i6 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                lh2 lh2Var = ((wb2) obj).jc;
                if (lh2Var != null) {
                    if (i6 > 0) {
                        i6 = ((SparseIntArray) lh2Var.c).get(i6, 0);
                    }
                    if (i6 != 0) {
                        ((zm9) lh2Var.b).O0(this.c, 0L, i6);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                try {
                    SQLitePreparedStatement executeFast = ((id6) obj).getMessagesStorage().b.executeFast("UPDATE sharing_locations SET proximity = ? WHERE uid = ?");
                    executeFast.requery();
                    executeFast.bindInteger(1, i6);
                    executeFast.bindLong(2, j2);
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 2:
                MediaController mediaController = (MediaController) obj;
                String[] strArr = MediaController.W1;
                ls6.d0(i6).D1(this.c, mediaController.o1, null);
                mediaController.M1 = null;
                return;
            case 3:
                uc7 uc7Var2 = (uc7) obj;
                long j3 = this.c;
                jf7 messagesStorage = uc7Var2.getMessagesStorage();
                messagesStorage.getClass();
                try {
                    try {
                        ArrayList arrayList5 = new ArrayList();
                        zh6 zh6Var = new zh6();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        long e2 = messagesStorage.getUserConfig().e();
                        SQLiteDatabase sQLiteDatabase = messagesStorage.b;
                        Locale locale = Locale.US;
                        int i7 = 1;
                        j = -j3;
                        sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT uid, data, read_state, out, mention FROM messages_v2 WHERE uid = " + j + " AND mid <= " + i6, new Object[0]);
                        while (sQLiteCursor2.next()) {
                            try {
                                try {
                                    arrayList2 = arrayList5;
                                    try {
                                        long longValue = sQLiteCursor2.longValue(i5);
                                        try {
                                            if (longValue != e2) {
                                                i4 = i5;
                                                try {
                                                    try {
                                                        int intValue2 = sQLiteCursor2.intValue(2);
                                                        if (sQLiteCursor2.intValue(3) == 0) {
                                                            Integer[] numArr = (Integer[]) zh6Var.f(longValue);
                                                            if (numArr == null) {
                                                                uc7Var = uc7Var2;
                                                                try {
                                                                    numArr = new Integer[2];
                                                                    numArr[i4] = 0;
                                                                    numArr[i7] = 0;
                                                                    zh6Var.k(longValue, numArr);
                                                                } catch (Exception e3) {
                                                                    e = e3;
                                                                    sQLiteCursor3 = sQLiteCursor2;
                                                                    arrayList3 = arrayList8;
                                                                    arrayList4 = arrayList7;
                                                                    z3 = i7;
                                                                    try {
                                                                        messagesStorage.n(e, z3);
                                                                        z2 = z3;
                                                                        sQLiteCursor3.dispose();
                                                                        messagesStorage.C(arrayList3, z2);
                                                                        hl.c3(new q41(messagesStorage, arrayList4, (byte) 8));
                                                                        messagesStorage.getFileLoader().getClass();
                                                                        xb4.p(0, arrayList6);
                                                                        i = 0;
                                                                        while (i < zh6Var.m()) {
                                                                        }
                                                                        ArrayList arrayList9 = arrayList2;
                                                                        SQLiteDatabase sQLiteDatabase2 = messagesStorage.b;
                                                                        Locale locale2 = Locale.US;
                                                                        sQLiteDatabase2.executeFast("UPDATE chat_settings_v2 SET pinned = 0 WHERE uid = " + j3 + " AND pinned <= " + i6).stepThis().dispose();
                                                                        messagesStorage.b.executeFast("DELETE FROM chat_pinned_v2 WHERE uid = " + j3 + " AND mid <= " + i6).stepThis().dispose();
                                                                        sQLiteCursor2 = messagesStorage.b.queryFinalized("SELECT changes()", new Object[0]);
                                                                        if (!sQLiteCursor2.next()) {
                                                                        }
                                                                        sQLiteCursor2.dispose();
                                                                        if (intValue > 0) {
                                                                        }
                                                                        messagesStorage.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j + " AND mid <= " + i6).stepThis().dispose();
                                                                        messagesStorage.b.executeFast("DELETE FROM widget_state WHERE uid = " + j + " AND mid <= " + i6).stepThis().dispose();
                                                                        messagesStorage.b.executeFast("DELETE FROM widget_heights WHERE uid = " + j + " AND mid <= " + i6).stepThis().dispose();
                                                                        messagesStorage.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j + " AND mid <= " + i6).stepThis().dispose();
                                                                        messagesStorage.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j + " AND mid <= " + i6).stepThis().dispose();
                                                                        SQLiteDatabase sQLiteDatabase3 = messagesStorage.b;
                                                                        StringBuilder sb = new StringBuilder();
                                                                        sb.append("UPDATE media_counts_v2 SET old = 1 WHERE uid = ");
                                                                        sb.append(j);
                                                                        sQLiteDatabase3.executeFast(sb.toString()).stepThis().dispose();
                                                                        messagesStorage.b.executeFast("UPDATE media_counts_topics SET old = 1 WHERE uid = " + j).stepThis().dispose();
                                                                        messagesStorage.i2(arrayList9);
                                                                        arrayList = arrayList9;
                                                                    } catch (Exception e4) {
                                                                        e = e4;
                                                                        sQLiteCursor2 = sQLiteCursor3;
                                                                        z = true;
                                                                        sQLitePreparedStatement2 = null;
                                                                        messagesStorage.n(e, z);
                                                                        if (sQLiteCursor2 != null) {
                                                                        }
                                                                        if (sQLitePreparedStatement2 != null) {
                                                                        }
                                                                        arrayList = null;
                                                                        uc7Var.getMessagesStorage().O1(j3, -j3, new ArrayList(), arrayList);
                                                                        return;
                                                                    }
                                                                    uc7Var.getMessagesStorage().O1(j3, -j3, new ArrayList(), arrayList);
                                                                    return;
                                                                }
                                                            } else {
                                                                uc7Var = uc7Var2;
                                                            }
                                                            if (intValue2 < 2) {
                                                                numArr[i7] = Integer.valueOf(numArr[i7].intValue() + 1);
                                                            }
                                                            if (intValue2 == 0 || intValue2 == 2) {
                                                                numArr[i4] = Integer.valueOf(numArr[i4].intValue() + 1);
                                                            }
                                                            byteBufferValue = sQLiteCursor2.byteBufferValue(i7);
                                                            if (byteBufferValue == null) {
                                                                boolean z4 = i4;
                                                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z4), z4);
                                                                sQLiteCursor3 = sQLiteCursor2;
                                                                try {
                                                                    try {
                                                                        TLdeserialize.readAttachPath(byteBufferValue, messagesStorage.getUserConfig().n);
                                                                        byteBufferValue.reuse();
                                                                        messagesStorage.a(TLdeserialize, arrayList6, arrayList8, arrayList7, false);
                                                                    } catch (Exception e5) {
                                                                        e = e5;
                                                                        arrayList3 = arrayList8;
                                                                        arrayList4 = arrayList7;
                                                                        z3 = 1;
                                                                        messagesStorage.n(e, z3);
                                                                        z2 = z3;
                                                                        sQLiteCursor3.dispose();
                                                                        messagesStorage.C(arrayList3, z2);
                                                                        hl.c3(new q41(messagesStorage, arrayList4, (byte) 8));
                                                                        messagesStorage.getFileLoader().getClass();
                                                                        xb4.p(0, arrayList6);
                                                                        i = 0;
                                                                        while (i < zh6Var.m()) {
                                                                        }
                                                                        ArrayList arrayList92 = arrayList2;
                                                                        SQLiteDatabase sQLiteDatabase22 = messagesStorage.b;
                                                                        Locale locale22 = Locale.US;
                                                                        sQLiteDatabase22.executeFast("UPDATE chat_settings_v2 SET pinned = 0 WHERE uid = " + j3 + " AND pinned <= " + i6).stepThis().dispose();
                                                                        messagesStorage.b.executeFast("DELETE FROM chat_pinned_v2 WHERE uid = " + j3 + " AND mid <= " + i6).stepThis().dispose();
                                                                        sQLiteCursor2 = messagesStorage.b.queryFinalized("SELECT changes()", new Object[0]);
                                                                        if (!sQLiteCursor2.next()) {
                                                                        }
                                                                        sQLiteCursor2.dispose();
                                                                        if (intValue > 0) {
                                                                        }
                                                                        messagesStorage.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j + " AND mid <= " + i6).stepThis().dispose();
                                                                        messagesStorage.b.executeFast("DELETE FROM widget_state WHERE uid = " + j + " AND mid <= " + i6).stepThis().dispose();
                                                                        messagesStorage.b.executeFast("DELETE FROM widget_heights WHERE uid = " + j + " AND mid <= " + i6).stepThis().dispose();
                                                                        messagesStorage.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j + " AND mid <= " + i6).stepThis().dispose();
                                                                        messagesStorage.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j + " AND mid <= " + i6).stepThis().dispose();
                                                                        SQLiteDatabase sQLiteDatabase32 = messagesStorage.b;
                                                                        StringBuilder sb2 = new StringBuilder();
                                                                        sb2.append("UPDATE media_counts_v2 SET old = 1 WHERE uid = ");
                                                                        sb2.append(j);
                                                                        sQLiteDatabase32.executeFast(sb2.toString()).stepThis().dispose();
                                                                        messagesStorage.b.executeFast("UPDATE media_counts_topics SET old = 1 WHERE uid = " + j).stepThis().dispose();
                                                                        messagesStorage.i2(arrayList92);
                                                                        arrayList = arrayList92;
                                                                        uc7Var.getMessagesStorage().O1(j3, -j3, new ArrayList(), arrayList);
                                                                        return;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    sQLiteCursor = sQLiteCursor3;
                                                                    sQLitePreparedStatement = null;
                                                                    if (sQLiteCursor != null) {
                                                                    }
                                                                    if (sQLitePreparedStatement != null) {
                                                                    }
                                                                    throw th;
                                                                }
                                                            } else {
                                                                sQLiteCursor3 = sQLiteCursor2;
                                                            }
                                                            arrayList5 = arrayList2;
                                                            arrayList7 = arrayList7;
                                                            arrayList8 = arrayList8;
                                                            sQLiteCursor2 = sQLiteCursor3;
                                                            uc7Var2 = uc7Var;
                                                            i5 = 0;
                                                            i7 = 1;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        sQLiteCursor = sQLiteCursor2;
                                                        sQLitePreparedStatement = null;
                                                        if (sQLiteCursor != null) {
                                                        }
                                                        if (sQLitePreparedStatement != null) {
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Exception e6) {
                                                    e = e6;
                                                    uc7Var = uc7Var2;
                                                }
                                            } else {
                                                i4 = i5;
                                            }
                                            byteBufferValue = sQLiteCursor2.byteBufferValue(i7);
                                            if (byteBufferValue == null) {
                                            }
                                            arrayList5 = arrayList2;
                                            arrayList7 = arrayList7;
                                            arrayList8 = arrayList8;
                                            sQLiteCursor2 = sQLiteCursor3;
                                            uc7Var2 = uc7Var;
                                            i5 = 0;
                                            i7 = 1;
                                        } catch (Exception e7) {
                                            e = e7;
                                            sQLiteCursor3 = sQLiteCursor2;
                                        }
                                        uc7Var = uc7Var2;
                                    } catch (Exception e8) {
                                        e = e8;
                                        sQLiteCursor3 = sQLiteCursor2;
                                        uc7Var = uc7Var2;
                                        arrayList3 = arrayList8;
                                        arrayList4 = arrayList7;
                                        z3 = 1;
                                        messagesStorage.n(e, z3);
                                        z2 = z3;
                                        sQLiteCursor3.dispose();
                                        messagesStorage.C(arrayList3, z2);
                                        hl.c3(new q41(messagesStorage, arrayList4, (byte) 8));
                                        messagesStorage.getFileLoader().getClass();
                                        xb4.p(0, arrayList6);
                                        i = 0;
                                        while (i < zh6Var.m()) {
                                        }
                                        ArrayList arrayList922 = arrayList2;
                                        SQLiteDatabase sQLiteDatabase222 = messagesStorage.b;
                                        Locale locale222 = Locale.US;
                                        sQLiteDatabase222.executeFast("UPDATE chat_settings_v2 SET pinned = 0 WHERE uid = " + j3 + " AND pinned <= " + i6).stepThis().dispose();
                                        messagesStorage.b.executeFast("DELETE FROM chat_pinned_v2 WHERE uid = " + j3 + " AND mid <= " + i6).stepThis().dispose();
                                        sQLiteCursor2 = messagesStorage.b.queryFinalized("SELECT changes()", new Object[0]);
                                        if (!sQLiteCursor2.next()) {
                                        }
                                        sQLiteCursor2.dispose();
                                        if (intValue > 0) {
                                        }
                                        messagesStorage.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j + " AND mid <= " + i6).stepThis().dispose();
                                        messagesStorage.b.executeFast("DELETE FROM widget_state WHERE uid = " + j + " AND mid <= " + i6).stepThis().dispose();
                                        messagesStorage.b.executeFast("DELETE FROM widget_heights WHERE uid = " + j + " AND mid <= " + i6).stepThis().dispose();
                                        messagesStorage.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j + " AND mid <= " + i6).stepThis().dispose();
                                        messagesStorage.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j + " AND mid <= " + i6).stepThis().dispose();
                                        SQLiteDatabase sQLiteDatabase322 = messagesStorage.b;
                                        StringBuilder sb22 = new StringBuilder();
                                        sb22.append("UPDATE media_counts_v2 SET old = 1 WHERE uid = ");
                                        sb22.append(j);
                                        sQLiteDatabase322.executeFast(sb22.toString()).stepThis().dispose();
                                        messagesStorage.b.executeFast("UPDATE media_counts_topics SET old = 1 WHERE uid = " + j).stepThis().dispose();
                                        messagesStorage.i2(arrayList922);
                                        arrayList = arrayList922;
                                        uc7Var.getMessagesStorage().O1(j3, -j3, new ArrayList(), arrayList);
                                        return;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    sQLiteCursor3 = sQLiteCursor2;
                                    sQLiteCursor = sQLiteCursor3;
                                    sQLitePreparedStatement = null;
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Exception e9) {
                                e = e9;
                                sQLiteCursor3 = sQLiteCursor2;
                                arrayList2 = arrayList5;
                            }
                        }
                        sQLiteCursor3 = sQLiteCursor2;
                        arrayList2 = arrayList5;
                        uc7Var = uc7Var2;
                        arrayList3 = arrayList8;
                        arrayList4 = arrayList7;
                        z2 = true;
                        sQLiteCursor3.dispose();
                        try {
                            messagesStorage.C(arrayList3, z2);
                            hl.c3(new q41(messagesStorage, arrayList4, (byte) 8));
                            messagesStorage.getFileLoader().getClass();
                            xb4.p(0, arrayList6);
                            i = 0;
                            while (i < zh6Var.m()) {
                                long j4 = zh6Var.j(i);
                                Integer[] numArr2 = (Integer[]) zh6Var.n(i);
                                sQLiteCursor3 = messagesStorage.b.queryFinalized("SELECT unread_count, unread_count_i FROM dialogs WHERE did = " + j4, new Object[0]);
                                if (sQLiteCursor3.next()) {
                                    i2 = sQLiteCursor3.intValue(0);
                                    i3 = sQLiteCursor3.intValue(1);
                                } else {
                                    i2 = 0;
                                    i3 = 0;
                                }
                                sQLiteCursor3.dispose();
                                ArrayList arrayList10 = arrayList2;
                                arrayList10.add(Long.valueOf(j4));
                                int i8 = i;
                                sQLitePreparedStatement2 = messagesStorage.b.executeFast("UPDATE dialogs SET unread_count = ?, unread_count_i = ? WHERE did = ?");
                                try {
                                    sQLitePreparedStatement2.requery();
                                    sQLitePreparedStatement2.bindInteger(1, Math.max(0, i2 - numArr2[0].intValue()));
                                    sQLitePreparedStatement2.bindInteger(2, Math.max(0, i3 - numArr2[1].intValue()));
                                    sQLitePreparedStatement2.bindLong(3, j4);
                                    sQLitePreparedStatement2.step();
                                    sQLitePreparedStatement2.dispose();
                                    i = i8 + 1;
                                    arrayList2 = arrayList10;
                                } catch (Exception e10) {
                                    e = e10;
                                    sQLiteCursor2 = null;
                                    z = true;
                                    messagesStorage.n(e, z);
                                    if (sQLiteCursor2 != null) {
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                    }
                                    arrayList = null;
                                    uc7Var.getMessagesStorage().O1(j3, -j3, new ArrayList(), arrayList);
                                    return;
                                } catch (Throwable th4) {
                                    th = th4;
                                    sQLitePreparedStatement = sQLitePreparedStatement2;
                                    sQLiteCursor = null;
                                    if (sQLiteCursor != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    throw th;
                                }
                            }
                            ArrayList arrayList9222 = arrayList2;
                            SQLiteDatabase sQLiteDatabase2222 = messagesStorage.b;
                            Locale locale2222 = Locale.US;
                            sQLiteDatabase2222.executeFast("UPDATE chat_settings_v2 SET pinned = 0 WHERE uid = " + j3 + " AND pinned <= " + i6).stepThis().dispose();
                            messagesStorage.b.executeFast("DELETE FROM chat_pinned_v2 WHERE uid = " + j3 + " AND mid <= " + i6).stepThis().dispose();
                            sQLiteCursor2 = messagesStorage.b.queryFinalized("SELECT changes()", new Object[0]);
                        } catch (Exception e11) {
                            e = e11;
                            sQLiteCursor2 = null;
                            z = true;
                            sQLitePreparedStatement2 = null;
                            messagesStorage.n(e, z);
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                            if (sQLitePreparedStatement2 != null) {
                                sQLitePreparedStatement2.dispose();
                            }
                            arrayList = null;
                            uc7Var.getMessagesStorage().O1(j3, -j3, new ArrayList(), arrayList);
                            return;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        uc7Var = uc7Var2;
                    }
                    try {
                        intValue = !sQLiteCursor2.next() ? sQLiteCursor2.intValue(0) : 0;
                        sQLiteCursor2.dispose();
                        if (intValue > 0) {
                            sQLiteCursor2 = messagesStorage.b.queryFinalized("SELECT count FROM chat_pinned_count WHERE uid = " + j, new Object[0]);
                            if (sQLiteCursor2.next()) {
                                int intValue3 = sQLiteCursor2.intValue(0);
                                sQLitePreparedStatement2 = messagesStorage.b.executeFast("UPDATE chat_pinned_count SET count = ? WHERE uid = ?");
                                try {
                                    try {
                                        sQLitePreparedStatement2.requery();
                                        sQLitePreparedStatement2.bindInteger(1, Math.max(0, intValue3 - intValue));
                                        sQLitePreparedStatement2.bindLong(2, j);
                                        sQLitePreparedStatement2.step();
                                        sQLitePreparedStatement2.dispose();
                                    } catch (Exception e13) {
                                        e = e13;
                                        z = true;
                                        messagesStorage.n(e, z);
                                        if (sQLiteCursor2 != null) {
                                        }
                                        if (sQLitePreparedStatement2 != null) {
                                        }
                                        arrayList = null;
                                        uc7Var.getMessagesStorage().O1(j3, -j3, new ArrayList(), arrayList);
                                        return;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    sQLiteCursor = sQLiteCursor2;
                                    sQLitePreparedStatement = sQLitePreparedStatement2;
                                    if (sQLiteCursor != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    throw th;
                                }
                            }
                            sQLiteCursor2.dispose();
                        }
                        messagesStorage.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j + " AND mid <= " + i6).stepThis().dispose();
                        messagesStorage.b.executeFast("DELETE FROM widget_state WHERE uid = " + j + " AND mid <= " + i6).stepThis().dispose();
                        messagesStorage.b.executeFast("DELETE FROM widget_heights WHERE uid = " + j + " AND mid <= " + i6).stepThis().dispose();
                        messagesStorage.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j + " AND mid <= " + i6).stepThis().dispose();
                        messagesStorage.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j + " AND mid <= " + i6).stepThis().dispose();
                        SQLiteDatabase sQLiteDatabase3222 = messagesStorage.b;
                        StringBuilder sb222 = new StringBuilder();
                        sb222.append("UPDATE media_counts_v2 SET old = 1 WHERE uid = ");
                        sb222.append(j);
                        sQLiteDatabase3222.executeFast(sb222.toString()).stepThis().dispose();
                        messagesStorage.b.executeFast("UPDATE media_counts_topics SET old = 1 WHERE uid = " + j).stepThis().dispose();
                        messagesStorage.i2(arrayList9222);
                        arrayList = arrayList9222;
                    } catch (Exception e14) {
                        e = e14;
                        z = true;
                        sQLitePreparedStatement2 = null;
                        messagesStorage.n(e, z);
                        if (sQLiteCursor2 != null) {
                        }
                        if (sQLitePreparedStatement2 != null) {
                        }
                        arrayList = null;
                        uc7Var.getMessagesStorage().O1(j3, -j3, new ArrayList(), arrayList);
                        return;
                    }
                    uc7Var.getMessagesStorage().O1(j3, -j3, new ArrayList(), arrayList);
                    return;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor = null;
                }
                break;
            case 4:
                a();
                return;
            case 5:
                ((eja) obj).E0(i6, j2);
                return;
            case 6:
                Long l = (Long) obj;
                e S = LaunchActivity.S();
                if (S != null) {
                    zu1 ha = zu1.ha(l.longValue());
                    S.presentFragment(ha);
                    TLRPC.Chat M0 = uc7.s1(i6).M0(Long.valueOf(-l.longValue()));
                    if (M0 != null) {
                        hl.d3(new y06(ha, this.c, M0, (byte) 1), 250L);
                        return;
                    }
                    return;
                }
                return;
            default:
                c6b c6bVar = (c6b) obj;
                int max = Math.max(c6bVar.f.get(j2, 0), i6);
                c6bVar.f.put(j2, max);
                c6bVar.k.i(max, j2);
                TL_stories.PeerStories x = c6bVar.x(j2);
                if (x == null || i6 <= x.max_read_id) {
                    return;
                }
                x.max_read_id = i6;
                Collections.sort(c6bVar.g, c6bVar.J);
                jn7.f(c6bVar.a).k(jn7.y5, new Object[0]);
                return;
        }
    }

    public /* synthetic */ lb2(Object obj, long j, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.c = j;
        this.b = i;
    }
}
