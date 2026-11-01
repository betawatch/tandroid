package org.telegram.messenger;

import android.text.TextUtils;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class xm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xm(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = j10;
        this.e = obj3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(6:8|9|(1:11)|12|(2:14|15)(1:17)|16)|5|6) */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03b2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03b3, code lost:
    
        r8 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03c1  */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        int i12;
        SQLiteCursor queryFinalized;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteCursor sQLiteCursor;
        a0.h hVar;
        ArrayList arrayList;
        int i13;
        int i14;
        SQLiteCursor sQLiteCursor2;
        SQLiteDatabase sQLiteDatabase;
        StringBuilder sb2;
        SQLiteDatabase sQLiteDatabase2;
        int i15;
        SQLiteCursor sQLiteCursor3;
        StringBuilder sb3;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLitePreparedStatement sQLitePreparedStatement3;
        ?? r82;
        SQLiteCursor sQLiteCursor4;
        SQLiteCursor sQLiteCursor5;
        int i16;
        int i17;
        is isVar = (is) this.b;
        long j10 = this.c;
        TLRPC.Poll poll = (TLRPC.Poll) this.d;
        TLRPC.PollResults pollResults = (TLRPC.PollResults) this.e;
        isVar.getClass();
        SQLiteCursor sQLiteCursor6 = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase3 = isVar.b;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT uid, mid FROM polls_v2 WHERE id = " + j10, new Object[0]);
                a0.h hVar2 = null;
                while (queryFinalized2.next()) {
                    try {
                        try {
                            long longValue = queryFinalized2.longValue(0);
                            if (hVar2 == null) {
                                hVar2 = new a0.h();
                            }
                            ArrayList arrayList2 = (ArrayList) hVar2.f(longValue);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                hVar2.k(arrayList2, longValue);
                            }
                            arrayList2.add(Integer.valueOf(queryFinalized2.intValue(1)));
                        } catch (Exception e) {
                            e = e;
                            sQLiteCursor6 = queryFinalized2;
                            z10 = true;
                            isVar.o(e, z10);
                            if (sQLiteCursor6 == null) {
                                sQLiteCursor6.dispose();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor6 = queryFinalized2;
                    }
                }
                queryFinalized2.dispose();
                if (hVar2 != null) {
                    isVar.b.beginTransaction();
                    SQLitePreparedStatement executeFast = isVar.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                    SQLitePreparedStatement executeFast2 = isVar.b.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                    int m10 = hVar2.m();
                    int i18 = 0;
                    while (i18 < m10) {
                        TLRPC.PollResults pollResults2 = pollResults;
                        long j11 = hVar2.j(i18);
                        ArrayList arrayList3 = (ArrayList) hVar2.n(i18);
                        int size = arrayList3.size();
                        int i19 = 0;
                        while (i19 < size) {
                            Integer num = (Integer) arrayList3.get(i19);
                            SQLitePreparedStatement sQLitePreparedStatement4 = executeFast;
                            int i20 = size;
                            int i21 = 0;
                            boolean z12 = false;
                            while (i21 < 2) {
                                if (i21 == 1) {
                                    try {
                                        sQLiteDatabase2 = isVar.b;
                                        Locale locale2 = Locale.US;
                                        i15 = i21;
                                        try {
                                            sb3 = new StringBuilder();
                                            sQLiteCursor3 = sQLiteCursor6;
                                        } catch (Exception e7) {
                                            e = e7;
                                            sQLiteCursor3 = sQLiteCursor6;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            sQLiteCursor3 = sQLiteCursor6;
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        z10 = true;
                                        isVar.o(e, z10);
                                        if (sQLiteCursor6 == null) {
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        if (sQLiteCursor6 != null) {
                                        }
                                        throw th;
                                    }
                                    try {
                                        sb3.append("SELECT data FROM messages_topics WHERE mid = ");
                                        sb3.append(num);
                                        sb3.append(" AND uid = ");
                                        sb3.append(j11);
                                        sQLitePreparedStatement2 = executeFast2;
                                        SQLiteCursor queryFinalized3 = sQLiteDatabase2.queryFinalized(sb3.toString(), new Object[0]);
                                        sQLitePreparedStatement3 = sQLitePreparedStatement2;
                                        r82 = 0;
                                        sQLiteCursor4 = queryFinalized3;
                                    } catch (Exception e11) {
                                        e = e11;
                                        sQLiteCursor6 = sQLiteCursor3;
                                        z10 = true;
                                        isVar.o(e, z10);
                                        if (sQLiteCursor6 == null) {
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        sQLiteCursor6 = sQLiteCursor3;
                                        if (sQLiteCursor6 != null) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    i15 = i21;
                                    sQLitePreparedStatement2 = executeFast2;
                                    SQLiteDatabase sQLiteDatabase4 = isVar.b;
                                    Locale locale3 = Locale.US;
                                    r82 = 0;
                                    sQLitePreparedStatement3 = sQLitePreparedStatement4;
                                    sQLiteCursor4 = sQLiteDatabase4.queryFinalized("SELECT data FROM messages_v2 WHERE mid = " + num + " AND uid = " + j11, new Object[0]);
                                }
                                try {
                                    if (sQLiteCursor4.next()) {
                                        NativeByteBuffer byteBufferValue = sQLiteCursor4.byteBufferValue(r82);
                                        if (byteBufferValue != 0) {
                                            sQLiteCursor5 = sQLiteCursor4;
                                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r82), r82);
                                            i16 = m10;
                                            i17 = i18;
                                            TLdeserialize.readAttachPath(byteBufferValue, isVar.getUserConfig().n);
                                            byteBufferValue.reuse();
                                            TLRPC.MessageMedia messageMedia = TLdeserialize.media;
                                            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                                if (poll != null) {
                                                    tL_messageMediaPoll.poll = poll;
                                                }
                                                if (pollResults2 != null) {
                                                    kj.b6(tL_messageMediaPoll, pollResults2);
                                                }
                                                kj.q5(TLdeserialize);
                                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                                                TLdeserialize.serializeToStream(nativeByteBuffer);
                                                sQLitePreparedStatement3.requery();
                                                sQLitePreparedStatement3.bindByteBuffer(1, nativeByteBuffer);
                                                sQLitePreparedStatement3.bindInteger(2, num.intValue());
                                                sQLitePreparedStatement3.bindLong(3, j11);
                                                sQLitePreparedStatement3.step();
                                                nativeByteBuffer.reuse();
                                            }
                                        } else {
                                            sQLiteCursor5 = sQLiteCursor4;
                                            i16 = m10;
                                            i17 = i18;
                                        }
                                        z12 = true;
                                    } else {
                                        sQLiteCursor5 = sQLiteCursor4;
                                        i16 = m10;
                                        i17 = i18;
                                    }
                                    sQLiteCursor5.dispose();
                                    i21 = i15 + 1;
                                    sQLiteCursor6 = sQLiteCursor5;
                                    executeFast2 = sQLitePreparedStatement2;
                                    m10 = i16;
                                    i18 = i17;
                                } catch (Exception e12) {
                                    e = e12;
                                    sQLiteCursor3 = sQLiteCursor4;
                                    sQLiteCursor6 = sQLiteCursor3;
                                    z10 = true;
                                    isVar.o(e, z10);
                                    if (sQLiteCursor6 == null) {
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    sQLiteCursor3 = sQLiteCursor4;
                                    sQLiteCursor6 = sQLiteCursor3;
                                    if (sQLiteCursor6 != null) {
                                    }
                                    throw th;
                                }
                            }
                            SQLiteCursor sQLiteCursor7 = sQLiteCursor6;
                            SQLitePreparedStatement sQLitePreparedStatement5 = executeFast2;
                            int i22 = m10;
                            int i23 = i18;
                            if (!z12) {
                                SQLiteDatabase sQLiteDatabase5 = isVar.b;
                                Locale locale4 = Locale.US;
                                sQLiteDatabase5.executeFast("DELETE FROM polls_v2 WHERE mid = " + num + " AND uid = " + j11).stepThis().dispose();
                            }
                            i19++;
                            executeFast = sQLitePreparedStatement4;
                            size = i20;
                            sQLiteCursor6 = sQLiteCursor7;
                            executeFast2 = sQLitePreparedStatement5;
                            m10 = i22;
                            i18 = i23;
                        }
                        i18++;
                        pollResults = pollResults2;
                    }
                    TLRPC.PollResults pollResults3 = pollResults;
                    SQLitePreparedStatement sQLitePreparedStatement6 = executeFast2;
                    executeFast.dispose();
                    sQLitePreparedStatement6.dispose();
                    SQLitePreparedStatement executeFast3 = isVar.b.executeFast("UPDATE media_v4 SET data = ? WHERE mid = ? AND uid = ?");
                    SQLitePreparedStatement executeFast4 = isVar.b.executeFast("UPDATE media_topics SET data = ? WHERE mid = ? AND uid = ? AND topic_id = ?");
                    int m11 = hVar2.m();
                    SQLiteCursor sQLiteCursor8 = sQLiteCursor6;
                    int i24 = 0;
                    while (i24 < m11) {
                        try {
                            long j12 = hVar2.j(i24);
                            ArrayList arrayList4 = (ArrayList) hVar2.n(i24);
                            int size2 = arrayList4.size();
                            int i25 = 0;
                            while (i25 < size2) {
                                Integer num2 = (Integer) arrayList4.get(i25);
                                SQLitePreparedStatement sQLitePreparedStatement7 = executeFast3;
                                SQLitePreparedStatement sQLitePreparedStatement8 = executeFast4;
                                int i26 = 0;
                                while (i26 < 1) {
                                    boolean z13 = i26 == 1;
                                    if (z13) {
                                        i10 = i26;
                                        try {
                                            sQLiteDatabase = isVar.b;
                                            Locale locale5 = Locale.US;
                                            z11 = z13;
                                            sb2 = new StringBuilder();
                                            i11 = m11;
                                            sb2.append("SELECT data, topic_id FROM media_topics WHERE mid = ");
                                            sb2.append(num2);
                                            sb2.append(" AND uid = ");
                                            sb2.append(j12);
                                            sQLiteCursor2 = sQLiteCursor8;
                                        } catch (Exception e13) {
                                            e = e13;
                                            sQLiteCursor2 = sQLiteCursor8;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            sQLiteCursor2 = sQLiteCursor8;
                                        }
                                        try {
                                            queryFinalized = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                                            sQLitePreparedStatement = sQLitePreparedStatement8;
                                            i12 = 0;
                                        } catch (Exception e14) {
                                            e = e14;
                                            sQLiteCursor6 = sQLiteCursor2;
                                            z10 = true;
                                            isVar.o(e, z10);
                                            if (sQLiteCursor6 == null) {
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            sQLiteCursor6 = sQLiteCursor2;
                                            if (sQLiteCursor6 != null) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        i10 = i26;
                                        z11 = z13;
                                        i11 = m11;
                                        SQLiteDatabase sQLiteDatabase6 = isVar.b;
                                        Locale locale6 = Locale.US;
                                        i12 = 0;
                                        queryFinalized = sQLiteDatabase6.queryFinalized("SELECT data FROM media_v4 WHERE mid = " + num2 + " AND uid = " + j12, new Object[0]);
                                        sQLitePreparedStatement = sQLitePreparedStatement7;
                                    }
                                    try {
                                        if (queryFinalized.next()) {
                                            NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(i12);
                                            sQLiteCursor = queryFinalized;
                                            long longValue2 = z11 ? queryFinalized.longValue(1) : 0L;
                                            if (byteBufferValue2 != null) {
                                                hVar = hVar2;
                                                arrayList = arrayList4;
                                                try {
                                                    TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                                    i13 = size2;
                                                    i14 = i25;
                                                    TLdeserialize2.readAttachPath(byteBufferValue2, isVar.getUserConfig().n);
                                                    byteBufferValue2.reuse();
                                                    TLRPC.MessageMedia messageMedia2 = TLdeserialize2.media;
                                                    if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2 = (TLRPC.TL_messageMediaPoll) messageMedia2;
                                                        if (poll != null) {
                                                            tL_messageMediaPoll2.poll = poll;
                                                        }
                                                        if (pollResults3 != null) {
                                                            kj.b6(tL_messageMediaPoll2, pollResults3);
                                                        }
                                                        kj.q5(TLdeserialize2);
                                                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(TLdeserialize2.getObjectSize());
                                                        TLdeserialize2.serializeToStream(nativeByteBuffer2);
                                                        sQLitePreparedStatement.requery();
                                                        sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer2);
                                                        sQLitePreparedStatement.bindInteger(2, num2.intValue());
                                                        sQLitePreparedStatement.bindLong(3, j12);
                                                        if (z11) {
                                                            sQLitePreparedStatement.bindLong(4, longValue2);
                                                        }
                                                        sQLitePreparedStatement.step();
                                                        nativeByteBuffer2.reuse();
                                                        sQLiteCursor.dispose();
                                                        i26 = i10 + 1;
                                                        arrayList4 = arrayList;
                                                        m11 = i11;
                                                        hVar2 = hVar;
                                                        sQLiteCursor8 = sQLiteCursor;
                                                        size2 = i13;
                                                        i25 = i14;
                                                    }
                                                    sQLiteCursor.dispose();
                                                    i26 = i10 + 1;
                                                    arrayList4 = arrayList;
                                                    m11 = i11;
                                                    hVar2 = hVar;
                                                    sQLiteCursor8 = sQLiteCursor;
                                                    size2 = i13;
                                                    i25 = i14;
                                                } catch (Exception e15) {
                                                    e = e15;
                                                    sQLiteCursor6 = sQLiteCursor;
                                                    z10 = true;
                                                    isVar.o(e, z10);
                                                    if (sQLiteCursor6 == null) {
                                                    }
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    sQLiteCursor6 = sQLiteCursor;
                                                    if (sQLiteCursor6 != null) {
                                                        sQLiteCursor6.dispose();
                                                    }
                                                    throw th;
                                                }
                                            }
                                        } else {
                                            sQLiteCursor = queryFinalized;
                                        }
                                        hVar = hVar2;
                                        arrayList = arrayList4;
                                        i13 = size2;
                                        i14 = i25;
                                        sQLiteCursor.dispose();
                                        i26 = i10 + 1;
                                        arrayList4 = arrayList;
                                        m11 = i11;
                                        hVar2 = hVar;
                                        sQLiteCursor8 = sQLiteCursor;
                                        size2 = i13;
                                        i25 = i14;
                                    } catch (Exception e16) {
                                        e = e16;
                                        sQLiteCursor = queryFinalized;
                                    } catch (Throwable th10) {
                                        th = th10;
                                        sQLiteCursor = queryFinalized;
                                    }
                                }
                                i25++;
                                arrayList4 = arrayList4;
                                executeFast3 = sQLitePreparedStatement7;
                                executeFast4 = sQLitePreparedStatement8;
                                hVar2 = hVar2;
                            }
                            i24++;
                            hVar2 = hVar2;
                        } catch (Exception e17) {
                            e = e17;
                            sQLiteCursor6 = sQLiteCursor8;
                        } catch (Throwable th11) {
                            th = th11;
                            sQLiteCursor6 = sQLiteCursor8;
                        }
                    }
                    SQLitePreparedStatement sQLitePreparedStatement9 = executeFast4;
                    executeFast3.dispose();
                    sQLitePreparedStatement9.dispose();
                    isVar.b.commitTransaction();
                    sQLiteCursor6 = sQLiteCursor8;
                }
                if (sQLiteCursor6 != null) {
                    sQLiteCursor6.dispose();
                }
            } catch (Exception e18) {
                e = e18;
            }
        } catch (Throwable th12) {
            th = th12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        fw fwVar;
        boolean z10;
        SQLiteCursor sQLiteCursor3;
        gw gwVar;
        long j10;
        Long valueOf;
        Integer valueOf2;
        Long valueOf3;
        Object[] objArr;
        hw hwVar = (hw) this.b;
        is isVar = (is) this.d;
        long j11 = this.c;
        fw fwVar2 = (fw) this.e;
        SQLiteDatabase sQLiteDatabase = isVar.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        long j12 = j11;
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        try {
            int i10 = 0;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT did, date, last_mid, pinned, flags, folder_id, last_mid_group, count, unread_count, max_read_id, read_outbox FROM saved_dialogs WHERE forumChatId = ? ORDER BY pinned ASC, date DESC", 0);
            SQLiteCursor sQLiteCursor4 = null;
            while (queryFinalized.next()) {
                try {
                    try {
                        gwVar = new gw();
                        fwVar = fwVar2;
                        j10 = j12;
                        try {
                            gwVar.a = queryFinalized.longValue(i10);
                            gwVar.j = queryFinalized.intValue(1);
                            gwVar.c = queryFinalized.intValue(2);
                            gwVar.k = queryFinalized.intValue(3);
                            gwVar.i = (queryFinalized.intValue(4) & 1) != 0;
                            gwVar.b = gwVar.k != 999;
                            gwVar.e = queryFinalized.intValue(7);
                            gwVar.f = queryFinalized.longValue(8);
                            gwVar.g = queryFinalized.longValue(9);
                            gwVar.h = queryFinalized.longValue(10);
                            long j13 = gwVar.a;
                            if (j13 < 0) {
                                try {
                                    arrayList3.add(Long.valueOf(-j13));
                                } catch (Exception e) {
                                    e = e;
                                    sQLiteCursor2 = sQLiteCursor4;
                                    sQLiteCursor = queryFinalized;
                                    z10 = true;
                                    try {
                                        f8.g(e, z10);
                                        if (sQLiteCursor != null) {
                                        }
                                        if (sQLiteCursor2 != null) {
                                        }
                                        i0.g3(new fk(hwVar, arrayList5, arrayList6, arrayList7, arrayList, fwVar, 7));
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        if (sQLiteCursor2 != null) {
                                            sQLiteCursor2.dispose();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    sQLiteCursor2 = sQLiteCursor4;
                                    sQLiteCursor = queryFinalized;
                                    if (sQLiteCursor != null) {
                                    }
                                    if (sQLiteCursor2 != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                arrayList2.add(Long.valueOf(j13));
                            }
                            valueOf = Long.valueOf(j10);
                            valueOf2 = Integer.valueOf(gwVar.c);
                            valueOf3 = Long.valueOf(gwVar.a);
                            objArr = new Object[3];
                            sQLiteCursor3 = queryFinalized;
                        } catch (Exception e7) {
                            e = e7;
                            sQLiteCursor3 = queryFinalized;
                            sQLiteCursor2 = sQLiteCursor4;
                            sQLiteCursor = sQLiteCursor3;
                            z10 = true;
                            f8.g(e, z10);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                            i0.g3(new fk(hwVar, arrayList5, arrayList6, arrayList7, arrayList, fwVar, 7));
                        }
                    } catch (Exception e10) {
                        e = e10;
                        sQLiteCursor3 = queryFinalized;
                        fwVar = fwVar2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor3 = queryFinalized;
                }
                try {
                    objArr[0] = valueOf;
                    objArr[1] = valueOf2;
                    objArr[2] = valueOf3;
                    sQLiteCursor4 = sQLiteDatabase.queryFinalized("SELECT data FROM messages_topics WHERE uid = ? AND mid = ? AND topic_id = ?", objArr);
                    if (sQLiteCursor4.next()) {
                        NativeByteBuffer byteBufferValue = sQLiteCursor4.byteBufferValue(0);
                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                        is.e(TLdeserialize, arrayList2, arrayList3, arrayList4);
                        gwVar.d = new kj(hwVar.a, TLdeserialize, null, null, null, null, null, false, false, 0L, false, false, true, 0);
                    }
                    sQLiteCursor4.dispose();
                    arrayList.add(gwVar);
                    fwVar2 = fwVar;
                    j12 = j10;
                    queryFinalized = sQLiteCursor3;
                    i10 = 0;
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor2 = sQLiteCursor4;
                    sQLiteCursor = sQLiteCursor3;
                    z10 = true;
                    f8.g(e, z10);
                    if (sQLiteCursor != null) {
                    }
                    if (sQLiteCursor2 != null) {
                    }
                    i0.g3(new fk(hwVar, arrayList5, arrayList6, arrayList7, arrayList, fwVar, 7));
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor2 = sQLiteCursor4;
                    sQLiteCursor = sQLiteCursor3;
                    if (sQLiteCursor != null) {
                    }
                    if (sQLiteCursor2 != null) {
                    }
                    throw th;
                }
            }
            sQLiteCursor3 = queryFinalized;
            fwVar = fwVar2;
            if (!arrayList2.isEmpty()) {
                isVar.n0(arrayList2, arrayList5, false);
            }
            if (!arrayList3.isEmpty()) {
                isVar.Q(TextUtils.join(",", arrayList3), arrayList6);
            }
            if (!arrayList4.isEmpty()) {
                isVar.L(TextUtils.join(",", arrayList4), arrayList7);
            }
            sQLiteCursor3.dispose();
            if (sQLiteCursor4 != null) {
                sQLiteCursor4.dispose();
            }
        } catch (Exception e12) {
            e = e12;
            fwVar = fwVar2;
            z10 = true;
            sQLiteCursor = null;
            sQLiteCursor2 = null;
        } catch (Throwable th6) {
            th = th6;
            sQLiteCursor = null;
            sQLiteCursor2 = null;
        }
        i0.g3(new fk(hwVar, arrayList5, arrayList6, arrayList7, arrayList, fwVar, 7));
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x02dc, code lost:
    
        if (r5 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01aa, code lost:
    
        if (r17 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ad, code lost:
    
        org.telegram.messenger.i0.g3(new org.telegram.messenger.fk(r16, r15, r5, r9, r2, (java.lang.Object) r3, 6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01bf, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a1, code lost:
    
        r17.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019f, code lost:
    
        if (r17 != null) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e5  */
    /* JADX WARN: Type inference failed for: r0v2, types: [a0.h] */
    /* JADX WARN: Type inference failed for: r0v27, types: [a0.h] */
    /* JADX WARN: Type inference failed for: r10v23, types: [org.telegram.ui.Components.vg] */
    /* JADX WARN: Type inference failed for: r11v1, types: [org.telegram.messenger.r20] */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r1v45, types: [a0.h] */
    /* JADX WARN: Type inference failed for: r1v8, types: [a0.h] */
    /* JADX WARN: Type inference failed for: r2v25, types: [a0.h] */
    /* JADX WARN: Type inference failed for: r3v31, types: [a0.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v30 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        char c10;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        boolean z10;
        gw gwVar;
        long j10;
        SQLiteCursor queryFinalized;
        SQLiteDatabase sQLiteDatabase;
        int i11 = this.a;
        long j11 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.b;
        int i12 = 0;
        switch (i11) {
            case 0:
                wp wpVar = (wp) obj3;
                ?? r11 = (r20) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj;
                if (r11 == null) {
                    org.telegram.ui.Components.s4.f(wpVar.currentAccount, wpVar.L0(Long.valueOf(j11)), tL_messages_invitedUsers);
                    return;
                } else {
                    wpVar.getClass();
                    r11.a(tL_messages_invitedUsers);
                    return;
                }
            case 1:
                wp wpVar2 = (wp) obj3;
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) obj2;
                TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) obj;
                ?? r02 = wpVar2.R;
                ConcurrentHashMap concurrentHashMap = wpVar2.P;
                ConcurrentHashMap concurrentHashMap2 = wpVar2.O;
                wpVar2.V3(tL_help_promoData.users, false);
                wpVar2.P3(tL_help_promoData.chats, false);
                wpVar2.V3(tL_messages_peerDialogs.users, false);
                wpVar2.P3(tL_messages_peerDialogs.chats, false);
                TLRPC.Dialog dialog = wpVar2.x2;
                if (dialog != null) {
                    long j12 = dialog.id;
                    if (j12 < 0) {
                        TLRPC.Chat L0 = wpVar2.L0(Long.valueOf(-j12));
                        if (w3.r0(L0) || L0.restricted) {
                            wpVar2.c4(wpVar2.x2);
                        }
                    } else {
                        wpVar2.c4(dialog);
                    }
                }
                TLRPC.Dialog dialog2 = tL_messages_peerDialogs.dialogs.get(0);
                wpVar2.x2 = dialog2;
                dialog2.id = j11;
                dialog2.folder_id = 0;
                if (o5.y(dialog2)) {
                    LongSparseIntArray longSparseIntArray = wpVar2.Y0;
                    TLRPC.Dialog dialog3 = wpVar2.x2;
                    longSparseIntArray.put(-dialog3.id, dialog3.pts);
                }
                Integer num = (Integer) concurrentHashMap2.get(Long.valueOf(wpVar2.x2.id));
                if (num == null) {
                    num = r13;
                }
                concurrentHashMap2.put(Long.valueOf(wpVar2.x2.id), Integer.valueOf(Math.max(num.intValue(), wpVar2.x2.read_inbox_max_id)));
                Integer num2 = (Integer) concurrentHashMap.get(Long.valueOf(wpVar2.x2.id));
                concurrentHashMap.put(Long.valueOf(wpVar2.x2.id), Integer.valueOf(Math.max((num2 != null ? num2 : 0).intValue(), wpVar2.x2.read_outbox_max_id)));
                wpVar2.Q.k(wpVar2.x2, j11);
                if (!tL_messages_peerDialogs.messages.isEmpty()) {
                    ?? hVar = new a0.h();
                    ?? hVar2 = new a0.h();
                    for (int i13 = 0; i13 < tL_messages_peerDialogs.users.size(); i13++) {
                        TLRPC.User user = tL_messages_peerDialogs.users.get(i13);
                        hVar.k(user, user.id);
                    }
                    for (int i14 = 0; i14 < tL_messages_peerDialogs.chats.size(); i14++) {
                        TLRPC.Chat chat = tL_messages_peerDialogs.chats.get(i14);
                        hVar2.k(chat, chat.id);
                    }
                    kj kjVar = new kj(wpVar2.currentAccount, tL_messages_peerDialogs.messages.get(0), (a0.h) hVar, (a0.h) hVar2, false, true);
                    ArrayList arrayList = (ArrayList) r02.f(j11);
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    if (arrayList.size() > 0 && arrayList.get(0) != null && ((kj) arrayList.get(0)).z2() && ((kj) arrayList.get(0)).e1() != kjVar.e1()) {
                        arrayList.clear();
                    }
                    arrayList.add(kjVar);
                    r02.k(arrayList, j11);
                    TLRPC.Dialog dialog4 = wpVar2.x2;
                    if (dialog4.last_message_date == 0) {
                        dialog4.last_message_date = kjVar.k.date;
                    }
                    wpVar2.t7.d(j11);
                }
                wpVar2.Q4(null);
                wpVar2.getNotificationCenter().k(3, Boolean.TRUE);
                return;
            case 2:
                l3 l3Var = (l3) obj3;
                kj kjVar2 = (kj) obj2;
                boolean g32 = kjVar2.g3();
                org.telegram.ui.un unVar = l3Var.a;
                th.r5.b(unVar.getCurrentAccount(), j11, kjVar2, (TL_stories.StoryItem) obj);
                ArrayList arrayList2 = new ArrayList();
                kjVar2.K1 = true;
                arrayList2.add(kjVar2);
                unVar.getMessagesStorage().a.c(new e4(15, l3Var, arrayList2));
                if (!g32 && kjVar2.g3() && kjVar2.D == 24) {
                    unVar.Sc(arrayList2, true);
                    return;
                } else {
                    unVar.Sc(arrayList2, false);
                    return;
                }
            case 3:
                m00.a((l00) obj2);
                ((vi) obj3).getNotificationCenter().k(55, Long.valueOf(j11), (ArrayList) obj, null);
                return;
            case 4:
                ((vi) obj3).getNotificationCenter().k(73, Long.valueOf(j11), (ArrayList) obj2, (ArrayList) obj);
                return;
            case 5:
                wp wpVar3 = (wp) obj3;
                TLObject tLObject = (TLObject) obj2;
                Runnable runnable = (Runnable) obj;
                if (tLObject != null) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    wpVar3.V3(groupcall.users, false);
                    wpVar3.P3(groupcall.chats, false);
                    u3 u3Var = new u3();
                    u3Var.u(wpVar3.getAccountInstance(), j11, groupcall);
                    wpVar3.m1.k(u3Var, groupcall.call.id);
                    wpVar3.n1.k(u3Var, j11);
                    wpVar3.getNotificationCenter().k(at.w2, Long.valueOf(j11), Long.valueOf(groupcall.call.id), Boolean.FALSE);
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                wpVar3.t1.remove(Long.valueOf(j11));
                return;
            case 6:
                wp wpVar4 = (wp) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                wpVar4.a1.e(j11);
                if (arrayList3 != null) {
                    wpVar4.i5(0, -j11, arrayList3);
                    wpVar4.getNotificationCenter().k(3, new Object[0]);
                }
                wpVar4.getNotificationCenter().k(at.t1, Long.valueOf(j11), Long.valueOf(tL_channels_channelParticipant.participant.inviter_id));
                return;
            case 7:
                wp wpVar5 = (wp) obj3;
                String str = (String) obj2;
                Runnable runnable2 = (Runnable) obj;
                TLRPC.Chat L02 = wpVar5.L0(Long.valueOf(j11));
                if (L02.usernames != null) {
                    for (int i15 = 0; i15 < L02.usernames.size(); i15++) {
                        TLRPC.TL_username tL_username = L02.usernames.get(i15);
                        if (tL_username != null && tL_username.editable) {
                            tL_username.username = str;
                            i10 = 1;
                            c10 = 0;
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(L02);
                            wpVar5.getMessagesStorage().m1(null, arrayList4, i10, i10);
                            at notificationCenter = wpVar5.getNotificationCenter();
                            Object[] objArr = new Object[i10];
                            objArr[c10] = Integer.valueOf(TLObject.FLAG_13);
                            notificationCenter.k(2, objArr);
                            runnable2.run();
                            return;
                        }
                    }
                }
                ArrayList<TLRPC.TL_username> arrayList5 = L02.usernames;
                if (arrayList5 != null && arrayList5.size() < 1) {
                    L02.username = str;
                    i10 = 1;
                    c10 = 0;
                    ArrayList arrayList42 = new ArrayList();
                    arrayList42.add(L02);
                    wpVar5.getMessagesStorage().m1(null, arrayList42, i10, i10);
                    at notificationCenter2 = wpVar5.getNotificationCenter();
                    Object[] objArr2 = new Object[i10];
                    objArr2[c10] = Integer.valueOf(TLObject.FLAG_13);
                    notificationCenter2.k(2, objArr2);
                    runnable2.run();
                    return;
                }
                if (L02.usernames == null) {
                    L02.usernames = new ArrayList<>();
                }
                TLRPC.TL_username tL_username2 = new TLRPC.TL_username();
                tL_username2.username = str;
                i10 = 1;
                tL_username2.active = true;
                tL_username2.editable = true;
                c10 = 0;
                L02.usernames.add(0, tL_username2);
                ArrayList arrayList422 = new ArrayList();
                arrayList422.add(L02);
                wpVar5.getMessagesStorage().m1(null, arrayList422, i10, i10);
                at notificationCenter22 = wpVar5.getNotificationCenter();
                Object[] objArr22 = new Object[i10];
                objArr22[c10] = Integer.valueOf(TLObject.FLAG_13);
                notificationCenter22.k(2, objArr22);
                runnable2.run();
                return;
            case 8:
                wp wpVar6 = (wp) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                SparseArray sparseArray = wpVar6.U;
                a0.h hVar3 = wpVar6.O1;
                ArrayList arrayList8 = (ArrayList) hVar3.f(j11);
                if (arrayList8 != null) {
                    arrayList8.removeAll(arrayList6);
                    if (arrayList8.isEmpty()) {
                        hVar3.l(j11);
                    }
                }
                ArrayList arrayList9 = (ArrayList) wpVar6.R.f(j11);
                if (arrayList9 != null) {
                    for (int i16 = 0; i16 < arrayList9.size(); i16++) {
                        kj kjVar3 = (kj) arrayList9.get(i16);
                        int i17 = 0;
                        while (true) {
                            if (i17 < arrayList7.size()) {
                                kj kjVar4 = (kj) arrayList7.get(i17);
                                if (kjVar3.f1() == kjVar4.f1()) {
                                    arrayList9.set(i16, kjVar4);
                                    if (kjVar4.k.peer_id.channel_id == 0) {
                                        kj kjVar5 = (kj) sparseArray.get(kjVar4.f1());
                                        sparseArray.remove(kjVar4.f1());
                                        if (kjVar5 != null) {
                                            sparseArray.put(kjVar5.f1(), kjVar5);
                                        }
                                    }
                                    wpVar6.getNotificationCenter().k(3, new Object[0]);
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                }
                wpVar6.getNotificationCenter().k(49, Long.valueOf(j11), arrayList7);
                return;
            case 9:
                ((is) obj3).getMessagesController().L((TLRPC.TL_dialog) obj2, (TLRPC.InputPeer) obj, j11);
                return;
            case 10:
                is isVar = (is) obj3;
                TLRPC.TL_messageReactions tL_messageReactions = (TLRPC.TL_messageReactions) obj2;
                TLRPC.TL_messageReactions tL_messageReactions2 = (TLRPC.TL_messageReactions) obj;
                ?? hVar4 = new a0.h();
                ?? hVar5 = new a0.h();
                if (tL_messageReactions.results != null && tL_messageReactions.reactions_as_tags) {
                    for (int i18 = 0; i18 < tL_messageReactions.results.size(); i18++) {
                        sg.o0 d = sg.o0.d(tL_messageReactions.results.get(i18).reaction);
                        hVar4.k(d, d.h);
                    }
                }
                if (tL_messageReactions2 != null && tL_messageReactions2.results != null && tL_messageReactions2.reactions_as_tags) {
                    for (int i19 = 0; i19 < tL_messageReactions2.results.size(); i19++) {
                        sg.o0 d10 = sg.o0.d(tL_messageReactions2.results.get(i19).reaction);
                        hVar5.k(d10, d10.h);
                    }
                }
                boolean z11 = false;
                for (int i20 = 0; i20 < hVar4.m(); i20++) {
                    long j13 = hVar4.j(i20);
                    sg.o0 o0Var = (sg.o0) hVar4.n(i20);
                    if (!hVar5.d(j13)) {
                        z11 = isVar.getMessagesController().p5(j11, o0Var, false) || z11;
                    }
                }
                for (int i21 = 0; i21 < hVar5.m(); i21++) {
                    long j14 = hVar5.j(i21);
                    sg.o0 o0Var2 = (sg.o0) hVar5.n(i21);
                    if (!hVar4.d(j14)) {
                        z11 = isVar.getMessagesController().p5(j11, o0Var2, true) || z11;
                    }
                }
                if (z11) {
                    if (j11 != 0) {
                        isVar.getMessagesController().n5(0L);
                    }
                    isVar.getMessagesController().n5(j11);
                    return;
                }
                return;
            case 11:
                is isVar2 = (is) obj3;
                isVar2.getFileLoader().g((ArrayList) obj2);
                isVar2.getMessagesController().j3((ArrayList) obj, j11);
                return;
            case 12:
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                ((TLRPC.User[]) obj2)[0] = ((is) obj3).j0(j11);
                return;
            case 13:
                is isVar3 = (is) obj3;
                Boolean[] boolArr = (Boolean[]) obj2;
                CountDownLatch countDownLatch2 = (CountDownLatch) obj;
                isVar3.getClass();
                try {
                    sQLiteCursor = isVar3.b.queryFinalized("SELECT date FROM dialogs WHERE did = " + j11, new Object[0]);
                    try {
                        try {
                            boolArr[0] = Boolean.valueOf(sQLiteCursor.next());
                        } catch (Exception e) {
                            e = e;
                            isVar3.o(e, true);
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e7) {
                    e = e7;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
                sQLiteCursor.dispose();
                return;
            case 14:
                is isVar4 = (is) obj3;
                Integer[] numArr = (Integer[]) obj2;
                CountDownLatch countDownLatch3 = (CountDownLatch) obj;
                isVar4.getClass();
                try {
                    sQLiteCursor2 = isVar4.b.queryFinalized("SELECT pts FROM dialogs WHERE did = " + (-j11), new Object[0]);
                    try {
                        try {
                            if (sQLiteCursor2.next()) {
                                numArr[0] = Integer.valueOf(sQLiteCursor2.intValue(0));
                            }
                            sQLiteCursor2.dispose();
                            z10 = true;
                        } catch (Exception e10) {
                            e = e10;
                            z10 = true;
                            isVar4.o(e, true);
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                            return;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor2 = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor2 = null;
                    if (sQLiteCursor2 != null) {
                    }
                    throw th;
                }
                try {
                    return;
                } catch (Exception e12) {
                    isVar4.o(e12, z10);
                    return;
                }
            case 15:
                CountDownLatch countDownLatch4 = (CountDownLatch) obj;
                ((TLRPC.Chat[]) obj2)[0] = ((is) obj3).O(j11);
                return;
            case 16:
                is isVar5 = (is) obj3;
                ArrayList arrayList10 = (ArrayList) obj2;
                CountDownLatch countDownLatch5 = (CountDownLatch) obj;
                isVar5.getClass();
                try {
                    try {
                        ArrayList arrayList11 = new ArrayList();
                        ArrayList arrayList12 = new ArrayList();
                        isVar5.V("" + j11, arrayList12, arrayList11);
                        if (!arrayList12.isEmpty() && !arrayList11.isEmpty()) {
                            ArrayList arrayList13 = new ArrayList();
                            isVar5.n0(arrayList11, arrayList13, false);
                            if (!arrayList13.isEmpty()) {
                                arrayList10.add((TLObject) arrayList12.get(0));
                                arrayList10.add((TLObject) arrayList13.get(0));
                            }
                        }
                    } finally {
                        countDownLatch5.countDown();
                    }
                } catch (Exception e13) {
                    isVar5.o(e13, true);
                }
                return;
            case 17:
                a();
                return;
            case 18:
                hw hwVar = (hw) obj3;
                is isVar6 = (is) obj2;
                ArrayList arrayList14 = (ArrayList) obj;
                SQLiteDatabase sQLiteDatabase2 = isVar6.b;
                ArrayList arrayList15 = new ArrayList();
                ?? hVar6 = new a0.h();
                ArrayList arrayList16 = new ArrayList();
                ArrayList arrayList17 = new ArrayList();
                ArrayList arrayList18 = new ArrayList();
                ArrayList arrayList19 = new ArrayList();
                ArrayList arrayList20 = new ArrayList();
                ?? r18 = 1;
                ArrayList arrayList21 = new ArrayList();
                int i22 = 0;
                SQLiteCursor sQLiteCursor3 = null;
                while (i12 < arrayList14.size()) {
                    try {
                        try {
                            gwVar = (gw) arrayList14.get(i12);
                            Long valueOf = Long.valueOf(j11);
                            j10 = j11;
                            Long valueOf2 = Long.valueOf(gwVar.a);
                            Object[] objArr3 = new Object[2];
                            objArr3[i22] = valueOf;
                            objArr3[r18] = valueOf2;
                            queryFinalized = sQLiteDatabase2.queryFinalized("SELECT mid, data FROM messages_topics WHERE uid = ? AND topic_id = ? ORDER BY mid DESC LIMIT 1", objArr3);
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Exception e14) {
                        e = e14;
                    }
                    try {
                        if (queryFinalized.next()) {
                            queryFinalized.intValue(i22);
                            boolean z12 = r18;
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(z12 ? 1 : 0);
                            sQLiteDatabase = sQLiteDatabase2;
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z12), z12);
                            is.e(TLdeserialize, arrayList16, arrayList17, arrayList18);
                            hVar6.k(TLdeserialize, gwVar.a);
                        } else {
                            sQLiteDatabase = sQLiteDatabase2;
                            arrayList15.add(Long.valueOf(gwVar.a));
                        }
                        queryFinalized.dispose();
                        i12++;
                        sQLiteCursor3 = queryFinalized;
                        sQLiteDatabase2 = sQLiteDatabase;
                        j11 = j10;
                        r18 = 1;
                        i22 = 0;
                    } catch (Exception e15) {
                        e = e15;
                        sQLiteCursor3 = queryFinalized;
                        f8.g(e, true);
                        break;
                    } catch (Throwable th7) {
                        th = th7;
                        sQLiteCursor3 = queryFinalized;
                        if (sQLiteCursor3 != null) {
                            sQLiteCursor3.dispose();
                        }
                        throw th;
                    }
                }
                if (!arrayList16.isEmpty()) {
                    isVar6.n0(arrayList16, arrayList19, false);
                }
                if (!arrayList17.isEmpty()) {
                    isVar6.Q(TextUtils.join(",", arrayList17), arrayList20);
                }
                if (!arrayList18.isEmpty()) {
                    isVar6.L(TextUtils.join(",", arrayList18), arrayList21);
                    break;
                }
                break;
            case 19:
                b();
                return;
            default:
                y00 y00Var = (y00) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                ?? r10 = (org.telegram.ui.Components.vg) obj;
                y00Var.getClass();
                ArrayList arrayList22 = new ArrayList();
                if (tLObject2 instanceof TLRPC.TL_messages_forumTopics) {
                    TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject2;
                    a0.h hVar7 = new a0.h();
                    for (int i23 = 0; i23 < tL_messages_forumTopics.messages.size(); i23++) {
                        hVar7.k(tL_messages_forumTopics.messages.get(i23), tL_messages_forumTopics.messages.get(i23).id);
                    }
                    y00Var.getMessagesController().V3(tL_messages_forumTopics.users, false);
                    y00Var.getMessagesController().P3(tL_messages_forumTopics.chats, false);
                    ArrayList<TLRPC.TL_forumTopic> arrayList23 = tL_messages_forumTopics.topics;
                    long j15 = this.c;
                    y00Var.u(j15, arrayList23, hVar7, false, 2, -1);
                    y00Var.getMessagesStorage().C1(y00Var.getConnectionsManager().getCurrentTime(), -j15, (List) y00Var.a.f(j15), true);
                    y00Var.getMessagesStorage().j1(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
                    ArrayList<TLRPC.TL_forumTopic> arrayList24 = tL_messages_forumTopics.topics;
                    int size = arrayList24.size();
                    while (i12 < size) {
                        TLRPC.TL_forumTopic tL_forumTopic = arrayList24.get(i12);
                        i12++;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        TLRPC.TL_forumTopic f7 = y00Var.f(j15, tL_forumTopic2.id);
                        if (f7 != null) {
                            tL_forumTopic2 = f7;
                        }
                        arrayList22.add(tL_forumTopic2);
                    }
                }
                r10.a(arrayList22);
                return;
        }
    }

    public /* synthetic */ xm(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = j10;
    }

    public /* synthetic */ xm(f1 f1Var, long j10, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = f1Var;
        this.c = j10;
        this.d = obj;
        this.e = obj2;
    }
}
