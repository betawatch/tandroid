package bi;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.gz;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.sp;
import org.telegram.messenger.sy;
import org.telegram.messenger.ui;
import org.telegram.messenger.yr;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ia implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ia(Object obj, int i7, long j3, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = i7;
        this.b = j3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00f0 A[Catch: all -> 0x009b, Exception -> 0x0123, TRY_LEAVE, TryCatch #16 {all -> 0x009b, blocks: (B:6:0x0066, B:10:0x006f, B:15:0x0078, B:18:0x007d, B:20:0x0083, B:24:0x008c, B:29:0x0159, B:30:0x015c, B:80:0x026e, B:82:0x0274, B:83:0x027d, B:86:0x029c, B:88:0x02a2, B:96:0x02cf, B:108:0x00b0, B:114:0x00ea, B:116:0x00f0, B:119:0x00fe, B:122:0x0111, B:139:0x00c9), top: B:5:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017e A[Catch: all -> 0x020e, Exception -> 0x0212, TRY_LEAVE, TryCatch #10 {Exception -> 0x0212, blocks: (B:32:0x015f, B:33:0x0178, B:35:0x017e, B:41:0x01c1, B:79:0x0215, B:85:0x0282, B:98:0x02d2), top: B:31:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0274 A[Catch: all -> 0x009b, Exception -> 0x0279, TryCatch #13 {Exception -> 0x0279, blocks: (B:29:0x0159, B:30:0x015c, B:80:0x026e, B:82:0x0274, B:83:0x027d, B:86:0x029c, B:88:0x02a2, B:96:0x02cf), top: B:28:0x0159 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0282 A[Catch: all -> 0x020e, Exception -> 0x0212, TRY_ENTER, TRY_LEAVE, TryCatch #10 {Exception -> 0x0212, blocks: (B:32:0x015f, B:33:0x0178, B:35:0x017e, B:41:0x01c1, B:79:0x0215, B:85:0x0282, B:98:0x02d2), top: B:31:0x015f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        qp qpVar;
        SQLiteCursor sQLiteCursor;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        ArrayList arrayList;
        boolean z9;
        ArrayList arrayList2;
        String str;
        a0.h hVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean z10;
        boolean z11;
        int i7;
        int intValue;
        int i10;
        int i11;
        char c10;
        NativeByteBuffer byteBufferValue;
        int intValue2;
        qp qpVar2 = (qp) this.d;
        long j3 = this.b;
        int i12 = this.c;
        yr messagesStorage = qpVar2.getMessagesStorage();
        messagesStorage.getClass();
        String str2 = " AND mid <= ";
        try {
            try {
                ArrayList arrayList5 = new ArrayList();
                a0.h hVar2 = new a0.h();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = arrayList5;
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                long e10 = messagesStorage.getUserConfig().e();
                SQLiteDatabase sQLiteDatabase = messagesStorage.b;
                Locale locale = Locale.US;
                int i13 = 1;
                long j10 = -j3;
                SQLiteCursor sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT uid, data, read_state, out, mention FROM messages_v2 WHERE uid = " + j10 + " AND mid <= " + i12, new Object[0]);
                while (true) {
                    arrayList2 = arrayList7;
                    try {
                        try {
                            if (!sQLiteCursor2.next()) {
                                break;
                            }
                            str = str2;
                            try {
                                long longValue = sQLiteCursor2.longValue(0);
                                try {
                                    if (longValue != e10) {
                                        char c11 = 2;
                                        try {
                                            intValue2 = sQLiteCursor2.intValue(2);
                                        } catch (Exception e11) {
                                            e = e11;
                                        }
                                        try {
                                            if (sQLiteCursor2.intValue(3) == 0) {
                                                Integer[] numArr = (Integer[]) hVar2.f(longValue);
                                                if (numArr == null) {
                                                    try {
                                                        Integer[] numArr2 = new Integer[2];
                                                        numArr2[0] = 0;
                                                        numArr2[i13] = 0;
                                                        hVar2.k(numArr2, longValue);
                                                        numArr = numArr2;
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        hVar = hVar2;
                                                        arrayList3 = arrayList9;
                                                        z10 = i13;
                                                        arrayList4 = arrayList2;
                                                        qpVar = qpVar2;
                                                        try {
                                                            messagesStorage.o(e, z10);
                                                            z11 = z10;
                                                            sQLiteCursor2.dispose();
                                                            messagesStorage.D(arrayList3, z11);
                                                            org.telegram.messenger.g0.h3(new sp(messagesStorage, arrayList8, 9));
                                                            messagesStorage.getFileLoader().getClass();
                                                            org.telegram.messenger.w7.p(0, arrayList6);
                                                            while (i7 < hVar.m()) {
                                                            }
                                                            SQLiteDatabase sQLiteDatabase2 = messagesStorage.b;
                                                            Locale locale2 = Locale.US;
                                                            sQLiteDatabase2.executeFast("UPDATE chat_settings_v2 SET pinned = 0 WHERE uid = " + j3 + " AND pinned <= " + i12).stepThis().dispose();
                                                            SQLiteDatabase sQLiteDatabase3 = messagesStorage.b;
                                                            StringBuilder sb2 = new StringBuilder();
                                                            sb2.append("DELETE FROM chat_pinned_v2 WHERE uid = ");
                                                            sb2.append(j3);
                                                            String str3 = str;
                                                            sb2.append(str3);
                                                            sb2.append(i12);
                                                            sQLiteDatabase3.executeFast(sb2.toString()).stepThis().dispose();
                                                            SQLiteCursor queryFinalized = messagesStorage.b.queryFinalized("SELECT changes()", new Object[0]);
                                                            if (!queryFinalized.next()) {
                                                            }
                                                            queryFinalized.dispose();
                                                            if (intValue > 0) {
                                                            }
                                                            messagesStorage.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j10 + str3 + i12).stepThis().dispose();
                                                            messagesStorage.b.executeFast("DELETE FROM widget_state WHERE uid = " + j10 + str3 + i12).stepThis().dispose();
                                                            messagesStorage.b.executeFast("DELETE FROM widget_heights WHERE uid = " + j10 + str3 + i12).stepThis().dispose();
                                                            messagesStorage.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j10 + str3 + i12).stepThis().dispose();
                                                            messagesStorage.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j10 + str3 + i12).stepThis().dispose();
                                                            SQLiteDatabase sQLiteDatabase4 = messagesStorage.b;
                                                            StringBuilder sb3 = new StringBuilder();
                                                            sb3.append("UPDATE media_counts_v2 SET old = 1 WHERE uid = ");
                                                            sb3.append(j10);
                                                            sQLiteDatabase4.executeFast(sb3.toString()).stepThis().dispose();
                                                            messagesStorage.b.executeFast("UPDATE media_counts_topics SET old = 1 WHERE uid = " + j10).stepThis().dispose();
                                                            messagesStorage.l2(arrayList4);
                                                            arrayList = arrayList4;
                                                        } catch (Exception e13) {
                                                            e = e13;
                                                            sQLitePreparedStatement = null;
                                                            z9 = true;
                                                            try {
                                                                messagesStorage.o(e, z9);
                                                                if (sQLiteCursor2 != null) {
                                                                }
                                                                if (sQLitePreparedStatement != null) {
                                                                }
                                                                arrayList = null;
                                                                qpVar.getMessagesStorage().R1(j3, -j3, new ArrayList(), arrayList);
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                sQLitePreparedStatement2 = sQLitePreparedStatement;
                                                                sQLiteCursor = sQLiteCursor2;
                                                                if (sQLiteCursor != null) {
                                                                    sQLiteCursor.dispose();
                                                                }
                                                                if (sQLitePreparedStatement2 != null) {
                                                                    sQLitePreparedStatement2.dispose();
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        qpVar.getMessagesStorage().R1(j3, -j3, new ArrayList(), arrayList);
                                                    }
                                                }
                                                if (intValue2 < 2) {
                                                    numArr[i13] = Integer.valueOf(numArr[i13].intValue() + 1);
                                                }
                                                c10 = 2;
                                                if (intValue2 == 0 || intValue2 == 2) {
                                                    numArr[0] = Integer.valueOf(numArr[0].intValue() + 1);
                                                }
                                                byteBufferValue = sQLiteCursor2.byteBufferValue(i13);
                                                if (byteBufferValue == null) {
                                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                    ArrayList arrayList10 = arrayList6;
                                                    try {
                                                        TLdeserialize.readAttachPath(byteBufferValue, messagesStorage.getUserConfig().n);
                                                        byteBufferValue.reuse();
                                                        arrayList6 = arrayList10;
                                                        arrayList4 = arrayList2;
                                                        hVar = hVar2;
                                                        arrayList3 = arrayList9;
                                                        qpVar = qpVar2;
                                                    } catch (Exception e14) {
                                                        e = e14;
                                                        arrayList6 = arrayList10;
                                                        arrayList4 = arrayList2;
                                                        hVar = hVar2;
                                                        arrayList3 = arrayList9;
                                                        qpVar = qpVar2;
                                                        z10 = 1;
                                                        messagesStorage.o(e, z10);
                                                        z11 = z10;
                                                        sQLiteCursor2.dispose();
                                                        messagesStorage.D(arrayList3, z11);
                                                        org.telegram.messenger.g0.h3(new sp(messagesStorage, arrayList8, 9));
                                                        messagesStorage.getFileLoader().getClass();
                                                        org.telegram.messenger.w7.p(0, arrayList6);
                                                        while (i7 < hVar.m()) {
                                                        }
                                                        SQLiteDatabase sQLiteDatabase22 = messagesStorage.b;
                                                        Locale locale22 = Locale.US;
                                                        sQLiteDatabase22.executeFast("UPDATE chat_settings_v2 SET pinned = 0 WHERE uid = " + j3 + " AND pinned <= " + i12).stepThis().dispose();
                                                        SQLiteDatabase sQLiteDatabase32 = messagesStorage.b;
                                                        StringBuilder sb22 = new StringBuilder();
                                                        sb22.append("DELETE FROM chat_pinned_v2 WHERE uid = ");
                                                        sb22.append(j3);
                                                        String str32 = str;
                                                        sb22.append(str32);
                                                        sb22.append(i12);
                                                        sQLiteDatabase32.executeFast(sb22.toString()).stepThis().dispose();
                                                        SQLiteCursor queryFinalized2 = messagesStorage.b.queryFinalized("SELECT changes()", new Object[0]);
                                                        if (!queryFinalized2.next()) {
                                                        }
                                                        queryFinalized2.dispose();
                                                        if (intValue > 0) {
                                                        }
                                                        messagesStorage.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j10 + str32 + i12).stepThis().dispose();
                                                        messagesStorage.b.executeFast("DELETE FROM widget_state WHERE uid = " + j10 + str32 + i12).stepThis().dispose();
                                                        messagesStorage.b.executeFast("DELETE FROM widget_heights WHERE uid = " + j10 + str32 + i12).stepThis().dispose();
                                                        messagesStorage.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j10 + str32 + i12).stepThis().dispose();
                                                        messagesStorage.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j10 + str32 + i12).stepThis().dispose();
                                                        SQLiteDatabase sQLiteDatabase42 = messagesStorage.b;
                                                        StringBuilder sb32 = new StringBuilder();
                                                        sb32.append("UPDATE media_counts_v2 SET old = 1 WHERE uid = ");
                                                        sb32.append(j10);
                                                        sQLiteDatabase42.executeFast(sb32.toString()).stepThis().dispose();
                                                        messagesStorage.b.executeFast("UPDATE media_counts_topics SET old = 1 WHERE uid = " + j10).stepThis().dispose();
                                                        messagesStorage.l2(arrayList4);
                                                        arrayList = arrayList4;
                                                        qpVar.getMessagesStorage().R1(j3, -j3, new ArrayList(), arrayList);
                                                    }
                                                    try {
                                                        messagesStorage.b(TLdeserialize, arrayList6, arrayList3, arrayList8, false);
                                                    } catch (Exception e15) {
                                                        e = e15;
                                                        z10 = 1;
                                                        messagesStorage.o(e, z10);
                                                        z11 = z10;
                                                        sQLiteCursor2.dispose();
                                                        messagesStorage.D(arrayList3, z11);
                                                        org.telegram.messenger.g0.h3(new sp(messagesStorage, arrayList8, 9));
                                                        messagesStorage.getFileLoader().getClass();
                                                        org.telegram.messenger.w7.p(0, arrayList6);
                                                        while (i7 < hVar.m()) {
                                                        }
                                                        SQLiteDatabase sQLiteDatabase222 = messagesStorage.b;
                                                        Locale locale222 = Locale.US;
                                                        sQLiteDatabase222.executeFast("UPDATE chat_settings_v2 SET pinned = 0 WHERE uid = " + j3 + " AND pinned <= " + i12).stepThis().dispose();
                                                        SQLiteDatabase sQLiteDatabase322 = messagesStorage.b;
                                                        StringBuilder sb222 = new StringBuilder();
                                                        sb222.append("DELETE FROM chat_pinned_v2 WHERE uid = ");
                                                        sb222.append(j3);
                                                        String str322 = str;
                                                        sb222.append(str322);
                                                        sb222.append(i12);
                                                        sQLiteDatabase322.executeFast(sb222.toString()).stepThis().dispose();
                                                        SQLiteCursor queryFinalized22 = messagesStorage.b.queryFinalized("SELECT changes()", new Object[0]);
                                                        if (!queryFinalized22.next()) {
                                                        }
                                                        queryFinalized22.dispose();
                                                        if (intValue > 0) {
                                                        }
                                                        messagesStorage.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j10 + str322 + i12).stepThis().dispose();
                                                        messagesStorage.b.executeFast("DELETE FROM widget_state WHERE uid = " + j10 + str322 + i12).stepThis().dispose();
                                                        messagesStorage.b.executeFast("DELETE FROM widget_heights WHERE uid = " + j10 + str322 + i12).stepThis().dispose();
                                                        messagesStorage.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j10 + str322 + i12).stepThis().dispose();
                                                        messagesStorage.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j10 + str322 + i12).stepThis().dispose();
                                                        SQLiteDatabase sQLiteDatabase422 = messagesStorage.b;
                                                        StringBuilder sb322 = new StringBuilder();
                                                        sb322.append("UPDATE media_counts_v2 SET old = 1 WHERE uid = ");
                                                        sb322.append(j10);
                                                        sQLiteDatabase422.executeFast(sb322.toString()).stepThis().dispose();
                                                        messagesStorage.b.executeFast("UPDATE media_counts_topics SET old = 1 WHERE uid = " + j10).stepThis().dispose();
                                                        messagesStorage.l2(arrayList4);
                                                        arrayList = arrayList4;
                                                        qpVar.getMessagesStorage().R1(j3, -j3, new ArrayList(), arrayList);
                                                    }
                                                } else {
                                                    hVar = hVar2;
                                                    arrayList3 = arrayList9;
                                                    arrayList4 = arrayList2;
                                                    qpVar = qpVar2;
                                                }
                                                arrayList7 = arrayList4;
                                                qpVar2 = qpVar;
                                                i13 = 1;
                                                arrayList9 = arrayList3;
                                                hVar2 = hVar;
                                                str2 = str;
                                            }
                                        } catch (Exception e16) {
                                            e = e16;
                                            c11 = 2;
                                            hVar = hVar2;
                                            arrayList3 = arrayList9;
                                            arrayList4 = arrayList2;
                                            qpVar = qpVar2;
                                            z10 = i13;
                                            messagesStorage.o(e, z10);
                                            z11 = z10;
                                            sQLiteCursor2.dispose();
                                            messagesStorage.D(arrayList3, z11);
                                            org.telegram.messenger.g0.h3(new sp(messagesStorage, arrayList8, 9));
                                            messagesStorage.getFileLoader().getClass();
                                            org.telegram.messenger.w7.p(0, arrayList6);
                                            while (i7 < hVar.m()) {
                                            }
                                            SQLiteDatabase sQLiteDatabase2222 = messagesStorage.b;
                                            Locale locale2222 = Locale.US;
                                            sQLiteDatabase2222.executeFast("UPDATE chat_settings_v2 SET pinned = 0 WHERE uid = " + j3 + " AND pinned <= " + i12).stepThis().dispose();
                                            SQLiteDatabase sQLiteDatabase3222 = messagesStorage.b;
                                            StringBuilder sb2222 = new StringBuilder();
                                            sb2222.append("DELETE FROM chat_pinned_v2 WHERE uid = ");
                                            sb2222.append(j3);
                                            String str3222 = str;
                                            sb2222.append(str3222);
                                            sb2222.append(i12);
                                            sQLiteDatabase3222.executeFast(sb2222.toString()).stepThis().dispose();
                                            SQLiteCursor queryFinalized222 = messagesStorage.b.queryFinalized("SELECT changes()", new Object[0]);
                                            if (!queryFinalized222.next()) {
                                            }
                                            queryFinalized222.dispose();
                                            if (intValue > 0) {
                                            }
                                            messagesStorage.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j10 + str3222 + i12).stepThis().dispose();
                                            messagesStorage.b.executeFast("DELETE FROM widget_state WHERE uid = " + j10 + str3222 + i12).stepThis().dispose();
                                            messagesStorage.b.executeFast("DELETE FROM widget_heights WHERE uid = " + j10 + str3222 + i12).stepThis().dispose();
                                            messagesStorage.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j10 + str3222 + i12).stepThis().dispose();
                                            messagesStorage.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j10 + str3222 + i12).stepThis().dispose();
                                            SQLiteDatabase sQLiteDatabase4222 = messagesStorage.b;
                                            StringBuilder sb3222 = new StringBuilder();
                                            sb3222.append("UPDATE media_counts_v2 SET old = 1 WHERE uid = ");
                                            sb3222.append(j10);
                                            sQLiteDatabase4222.executeFast(sb3222.toString()).stepThis().dispose();
                                            messagesStorage.b.executeFast("UPDATE media_counts_topics SET old = 1 WHERE uid = " + j10).stepThis().dispose();
                                            messagesStorage.l2(arrayList4);
                                            arrayList = arrayList4;
                                            qpVar.getMessagesStorage().R1(j3, -j3, new ArrayList(), arrayList);
                                        }
                                    }
                                    byteBufferValue = sQLiteCursor2.byteBufferValue(i13);
                                    if (byteBufferValue == null) {
                                    }
                                    arrayList7 = arrayList4;
                                    qpVar2 = qpVar;
                                    i13 = 1;
                                    arrayList9 = arrayList3;
                                    hVar2 = hVar;
                                    str2 = str;
                                } catch (Exception e17) {
                                    e = e17;
                                    hVar = hVar2;
                                    arrayList3 = arrayList9;
                                    arrayList4 = arrayList2;
                                    qpVar = qpVar2;
                                }
                                c10 = 2;
                            } catch (Exception e18) {
                                e = e18;
                                hVar = hVar2;
                                arrayList3 = arrayList9;
                                arrayList4 = arrayList2;
                                qpVar = qpVar2;
                                z10 = 1;
                                messagesStorage.o(e, z10);
                                z11 = z10;
                                sQLiteCursor2.dispose();
                                messagesStorage.D(arrayList3, z11);
                                org.telegram.messenger.g0.h3(new sp(messagesStorage, arrayList8, 9));
                                messagesStorage.getFileLoader().getClass();
                                org.telegram.messenger.w7.p(0, arrayList6);
                                while (i7 < hVar.m()) {
                                }
                                SQLiteDatabase sQLiteDatabase22222 = messagesStorage.b;
                                Locale locale22222 = Locale.US;
                                sQLiteDatabase22222.executeFast("UPDATE chat_settings_v2 SET pinned = 0 WHERE uid = " + j3 + " AND pinned <= " + i12).stepThis().dispose();
                                SQLiteDatabase sQLiteDatabase32222 = messagesStorage.b;
                                StringBuilder sb22222 = new StringBuilder();
                                sb22222.append("DELETE FROM chat_pinned_v2 WHERE uid = ");
                                sb22222.append(j3);
                                String str32222 = str;
                                sb22222.append(str32222);
                                sb22222.append(i12);
                                sQLiteDatabase32222.executeFast(sb22222.toString()).stepThis().dispose();
                                SQLiteCursor queryFinalized2222 = messagesStorage.b.queryFinalized("SELECT changes()", new Object[0]);
                                if (!queryFinalized2222.next()) {
                                }
                                queryFinalized2222.dispose();
                                if (intValue > 0) {
                                }
                                messagesStorage.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j10 + str32222 + i12).stepThis().dispose();
                                messagesStorage.b.executeFast("DELETE FROM widget_state WHERE uid = " + j10 + str32222 + i12).stepThis().dispose();
                                messagesStorage.b.executeFast("DELETE FROM widget_heights WHERE uid = " + j10 + str32222 + i12).stepThis().dispose();
                                messagesStorage.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j10 + str32222 + i12).stepThis().dispose();
                                messagesStorage.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j10 + str32222 + i12).stepThis().dispose();
                                SQLiteDatabase sQLiteDatabase42222 = messagesStorage.b;
                                StringBuilder sb32222 = new StringBuilder();
                                sb32222.append("UPDATE media_counts_v2 SET old = 1 WHERE uid = ");
                                sb32222.append(j10);
                                sQLiteDatabase42222.executeFast(sb32222.toString()).stepThis().dispose();
                                messagesStorage.b.executeFast("UPDATE media_counts_topics SET old = 1 WHERE uid = " + j10).stepThis().dispose();
                                messagesStorage.l2(arrayList4);
                                arrayList = arrayList4;
                                qpVar.getMessagesStorage().R1(j3, -j3, new ArrayList(), arrayList);
                            }
                        } catch (Exception e19) {
                            e = e19;
                            str = str2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        sQLiteCursor = sQLiteCursor2;
                        sQLitePreparedStatement2 = null;
                        if (sQLiteCursor != null) {
                        }
                        if (sQLitePreparedStatement2 != null) {
                        }
                        throw th;
                    }
                }
                str = str2;
                arrayList4 = arrayList2;
                hVar = hVar2;
                arrayList3 = arrayList9;
                qpVar = qpVar2;
                z11 = true;
                sQLiteCursor2.dispose();
                try {
                    messagesStorage.D(arrayList3, z11);
                    org.telegram.messenger.g0.h3(new sp(messagesStorage, arrayList8, 9));
                    messagesStorage.getFileLoader().getClass();
                    org.telegram.messenger.w7.p(0, arrayList6);
                    for (i7 = 0; i7 < hVar.m(); i7++) {
                        long j11 = hVar.j(i7);
                        Integer[] numArr3 = (Integer[]) hVar.n(i7);
                        SQLiteCursor queryFinalized3 = messagesStorage.b.queryFinalized("SELECT unread_count, unread_count_i FROM dialogs WHERE did = " + j11, new Object[0]);
                        try {
                            if (queryFinalized3.next()) {
                                i10 = queryFinalized3.intValue(0);
                                i11 = queryFinalized3.intValue(1);
                            } else {
                                i10 = 0;
                                i11 = 0;
                            }
                            queryFinalized3.dispose();
                            arrayList4.add(Long.valueOf(j11));
                            sQLitePreparedStatement = messagesStorage.b.executeFast("UPDATE dialogs SET unread_count = ?, unread_count_i = ? WHERE did = ?");
                            try {
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindInteger(1, Math.max(0, i10 - numArr3[0].intValue()));
                                sQLitePreparedStatement.bindInteger(2, Math.max(0, i11 - numArr3[1].intValue()));
                                sQLitePreparedStatement.bindLong(3, j11);
                                sQLitePreparedStatement.step();
                                sQLitePreparedStatement.dispose();
                            } catch (Exception e20) {
                                e = e20;
                                z9 = true;
                                sQLiteCursor2 = null;
                                messagesStorage.o(e, z9);
                                if (sQLiteCursor2 != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                arrayList = null;
                                qpVar.getMessagesStorage().R1(j3, -j3, new ArrayList(), arrayList);
                            } catch (Throwable th4) {
                                th = th4;
                                sQLitePreparedStatement2 = sQLitePreparedStatement;
                                sQLiteCursor = null;
                                if (sQLiteCursor != null) {
                                }
                                if (sQLitePreparedStatement2 != null) {
                                }
                                throw th;
                            }
                        } catch (Exception e21) {
                            e = e21;
                            sQLiteCursor2 = queryFinalized3;
                            sQLitePreparedStatement = null;
                            z9 = true;
                            messagesStorage.o(e, z9);
                            if (sQLiteCursor2 != null) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            arrayList = null;
                            qpVar.getMessagesStorage().R1(j3, -j3, new ArrayList(), arrayList);
                        } catch (Throwable th5) {
                            th = th5;
                            sQLiteCursor = queryFinalized3;
                            sQLitePreparedStatement2 = null;
                            if (sQLiteCursor != null) {
                            }
                            if (sQLitePreparedStatement2 != null) {
                            }
                            throw th;
                        }
                    }
                    SQLiteDatabase sQLiteDatabase222222 = messagesStorage.b;
                    Locale locale222222 = Locale.US;
                    sQLiteDatabase222222.executeFast("UPDATE chat_settings_v2 SET pinned = 0 WHERE uid = " + j3 + " AND pinned <= " + i12).stepThis().dispose();
                    SQLiteDatabase sQLiteDatabase322222 = messagesStorage.b;
                    StringBuilder sb222222 = new StringBuilder();
                    sb222222.append("DELETE FROM chat_pinned_v2 WHERE uid = ");
                    sb222222.append(j3);
                    String str322222 = str;
                    sb222222.append(str322222);
                    sb222222.append(i12);
                    sQLiteDatabase322222.executeFast(sb222222.toString()).stepThis().dispose();
                    SQLiteCursor queryFinalized22222 = messagesStorage.b.queryFinalized("SELECT changes()", new Object[0]);
                    intValue = !queryFinalized22222.next() ? queryFinalized22222.intValue(0) : 0;
                    queryFinalized22222.dispose();
                    if (intValue > 0) {
                        sQLiteCursor2 = messagesStorage.b.queryFinalized("SELECT count FROM chat_pinned_count WHERE uid = " + j10, new Object[0]);
                        if (sQLiteCursor2.next()) {
                            int intValue3 = sQLiteCursor2.intValue(0);
                            SQLitePreparedStatement executeFast = messagesStorage.b.executeFast("UPDATE chat_pinned_count SET count = ? WHERE uid = ?");
                            try {
                                executeFast.requery();
                                executeFast.bindInteger(1, Math.max(0, intValue3 - intValue));
                                executeFast.bindLong(2, j10);
                                executeFast.step();
                                executeFast.dispose();
                            } catch (Exception e22) {
                                e = e22;
                                sQLitePreparedStatement = executeFast;
                                z9 = true;
                                messagesStorage.o(e, z9);
                                if (sQLiteCursor2 != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                arrayList = null;
                                qpVar.getMessagesStorage().R1(j3, -j3, new ArrayList(), arrayList);
                            } catch (Throwable th6) {
                                th = th6;
                                sQLitePreparedStatement2 = executeFast;
                                sQLiteCursor = sQLiteCursor2;
                                if (sQLiteCursor != null) {
                                }
                                if (sQLitePreparedStatement2 != null) {
                                }
                                throw th;
                            }
                        }
                        sQLiteCursor2.dispose();
                    }
                    messagesStorage.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j10 + str322222 + i12).stepThis().dispose();
                    messagesStorage.b.executeFast("DELETE FROM widget_state WHERE uid = " + j10 + str322222 + i12).stepThis().dispose();
                    messagesStorage.b.executeFast("DELETE FROM widget_heights WHERE uid = " + j10 + str322222 + i12).stepThis().dispose();
                    messagesStorage.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j10 + str322222 + i12).stepThis().dispose();
                    messagesStorage.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j10 + str322222 + i12).stepThis().dispose();
                    SQLiteDatabase sQLiteDatabase422222 = messagesStorage.b;
                    StringBuilder sb322222 = new StringBuilder();
                    sb322222.append("UPDATE media_counts_v2 SET old = 1 WHERE uid = ");
                    sb322222.append(j10);
                    sQLiteDatabase422222.executeFast(sb322222.toString()).stepThis().dispose();
                    messagesStorage.b.executeFast("UPDATE media_counts_topics SET old = 1 WHERE uid = " + j10).stepThis().dispose();
                    messagesStorage.l2(arrayList4);
                    arrayList = arrayList4;
                } catch (Exception e23) {
                    e = e23;
                    sQLitePreparedStatement = null;
                    z9 = true;
                    sQLiteCursor2 = null;
                    messagesStorage.o(e, z9);
                    if (sQLiteCursor2 != null) {
                        sQLiteCursor2.dispose();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    arrayList = null;
                    qpVar.getMessagesStorage().R1(j3, -j3, new ArrayList(), arrayList);
                }
            } catch (Throwable th7) {
                th = th7;
                sQLiteCursor = null;
            }
        } catch (Exception e24) {
            e = e24;
            qpVar = qpVar2;
        }
        qpVar.getMessagesStorage().R1(j3, -j3, new ArrayList(), arrayList);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.b;
        int i10 = this.c;
        Object obj = this.d;
        switch (i7) {
            case 0:
                Long l10 = (Long) obj;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    an ra2 = an.ra(l10.longValue());
                    T.presentFragment(ra2);
                    TLRPC.Chat M0 = qp.s1(i10).M0(Long.valueOf(-l10.longValue()));
                    if (M0 != null) {
                        org.telegram.messenger.g0.i3(new ja(ra2, this.b, M0, 0), 250L);
                        break;
                    }
                }
                break;
            case 1:
                di.y6 y6Var = (di.y6) obj;
                int max = Math.max(y6Var.f.get(j3, 0), i10);
                y6Var.f.put(j3, max);
                y6Var.k.i(max, j3);
                TL_stories.PeerStories y10 = y6Var.y(j3);
                if (y10 != null && i10 > y10.max_read_id) {
                    y10.max_read_id = i10;
                    Collections.sort(y6Var.g, y6Var.J);
                    qs.f(y6Var.a).k(qs.v5, new Object[0]);
                    break;
                }
                break;
            case 2:
                try {
                    SQLitePreparedStatement executeFast = ((org.telegram.messenger.sd) obj).getMessagesStorage().b.executeFast("UPDATE sharing_locations SET proximity = ? WHERE uid = ?");
                    executeFast.requery();
                    executeFast.bindInteger(1, i10);
                    executeFast.bindLong(2, j3);
                    executeFast.step();
                    executeFast.dispose();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                MediaController mediaController = (MediaController) obj;
                String[] strArr = MediaController.V1;
                ui.b0(i10).B1(this.b, mediaController.n1, null);
                mediaController.L1 = null;
                break;
            case 4:
                try {
                    SQLiteDatabase sQLiteDatabase = ((ui) obj).getMessagesStorage().b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM chat_hints WHERE did = " + j3 + " AND type = " + i10).stepThis().dispose();
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 5:
                a();
                break;
            case 6:
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj;
                gz C = gz.C(cVar.a);
                ArrayList arrayList = (ArrayList) C.a.get("group_" + j3);
                if (arrayList != null && !arrayList.isEmpty()) {
                    sy syVar = (sy) arrayList.get(0);
                    ij ijVar = (ij) jg.g.i(1, syVar.x);
                    syVar.G = ijVar.f1();
                    ijVar.k.params.put("final", "1");
                    TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                    tL_messages_messages.messages.add(ijVar.k);
                    if (!syVar.I && !syVar.J) {
                        yr.a0(cVar.a).h1(-2, 0, i10 != 0 ? 1 : 0, syVar.a, 0L, tL_messages_messages, false);
                    }
                    C.t0(syVar, true);
                    break;
                }
                break;
            case 7:
                m4.d0 d0Var = ((org.telegram.ui.Cells.q1) obj).Wb;
                if (d0Var != null) {
                    if (i10 > 0) {
                        i10 = ((SparseIntArray) d0Var.b).get(i10, 0);
                    }
                    if (i10 != 0) {
                        ((g6.d0) d0Var.a).a0(this.b, 0L, i10);
                        break;
                    }
                }
                break;
            default:
                xs0.e((xs0) obj, j3, i10);
                break;
        }
    }

    public /* synthetic */ ia(Object obj, long j3, int i7, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j3;
        this.c = i7;
    }
}
