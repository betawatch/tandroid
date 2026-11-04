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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class zl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zl(Object obj, Object obj2, long j10, Object obj3, int i3) {
        this.a = i3;
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
        int i3;
        boolean z11;
        int i10;
        int i11;
        SQLiteCursor queryFinalized;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteCursor sQLiteCursor;
        a0.h hVar;
        ArrayList arrayList;
        int i12;
        int i13;
        SQLiteCursor sQLiteCursor2;
        SQLiteDatabase sQLiteDatabase;
        StringBuilder sb2;
        SQLiteDatabase sQLiteDatabase2;
        int i14;
        SQLiteCursor sQLiteCursor3;
        StringBuilder sb3;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLitePreparedStatement sQLitePreparedStatement3;
        ?? r82;
        SQLiteCursor sQLiteCursor4;
        SQLiteCursor sQLiteCursor5;
        int i15;
        int i16;
        qr qrVar = (qr) this.b;
        long j10 = this.c;
        TLRPC.Poll poll = (TLRPC.Poll) this.d;
        TLRPC.PollResults pollResults = (TLRPC.PollResults) this.e;
        qrVar.getClass();
        SQLiteCursor sQLiteCursor6 = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase3 = qrVar.b;
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
                        } catch (Exception e10) {
                            e = e10;
                            sQLiteCursor6 = queryFinalized2;
                            z10 = true;
                            qrVar.o(e, z10);
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
                    qrVar.b.beginTransaction();
                    SQLitePreparedStatement executeFast = qrVar.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                    SQLitePreparedStatement executeFast2 = qrVar.b.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                    int m10 = hVar2.m();
                    int i17 = 0;
                    while (i17 < m10) {
                        TLRPC.PollResults pollResults2 = pollResults;
                        long j11 = hVar2.j(i17);
                        ArrayList arrayList3 = (ArrayList) hVar2.n(i17);
                        int size = arrayList3.size();
                        int i18 = 0;
                        while (i18 < size) {
                            Integer num = (Integer) arrayList3.get(i18);
                            SQLitePreparedStatement sQLitePreparedStatement4 = executeFast;
                            int i19 = size;
                            int i20 = 0;
                            boolean z12 = false;
                            while (i20 < 2) {
                                if (i20 == 1) {
                                    try {
                                        sQLiteDatabase2 = qrVar.b;
                                        Locale locale2 = Locale.US;
                                        i14 = i20;
                                        try {
                                            sb3 = new StringBuilder();
                                            sQLiteCursor3 = sQLiteCursor6;
                                        } catch (Exception e11) {
                                            e = e11;
                                            sQLiteCursor3 = sQLiteCursor6;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            sQLiteCursor3 = sQLiteCursor6;
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        z10 = true;
                                        qrVar.o(e, z10);
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
                                    } catch (Exception e13) {
                                        e = e13;
                                        sQLiteCursor6 = sQLiteCursor3;
                                        z10 = true;
                                        qrVar.o(e, z10);
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
                                    i14 = i20;
                                    sQLitePreparedStatement2 = executeFast2;
                                    SQLiteDatabase sQLiteDatabase4 = qrVar.b;
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
                                            i15 = m10;
                                            i16 = i17;
                                            TLdeserialize.readAttachPath(byteBufferValue, qrVar.getUserConfig().n);
                                            byteBufferValue.reuse();
                                            TLRPC.MessageMedia messageMedia = TLdeserialize.media;
                                            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                                if (poll != null) {
                                                    tL_messageMediaPoll.poll = poll;
                                                }
                                                if (pollResults2 != null) {
                                                    zi.e6(tL_messageMediaPoll, pollResults2);
                                                }
                                                zi.r5(TLdeserialize);
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
                                            i15 = m10;
                                            i16 = i17;
                                        }
                                        z12 = true;
                                    } else {
                                        sQLiteCursor5 = sQLiteCursor4;
                                        i15 = m10;
                                        i16 = i17;
                                    }
                                    sQLiteCursor5.dispose();
                                    i20 = i14 + 1;
                                    sQLiteCursor6 = sQLiteCursor5;
                                    executeFast2 = sQLitePreparedStatement2;
                                    m10 = i15;
                                    i17 = i16;
                                } catch (Exception e14) {
                                    e = e14;
                                    sQLiteCursor3 = sQLiteCursor4;
                                    sQLiteCursor6 = sQLiteCursor3;
                                    z10 = true;
                                    qrVar.o(e, z10);
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
                            int i21 = m10;
                            int i22 = i17;
                            if (!z12) {
                                SQLiteDatabase sQLiteDatabase5 = qrVar.b;
                                Locale locale4 = Locale.US;
                                sQLiteDatabase5.executeFast("DELETE FROM polls_v2 WHERE mid = " + num + " AND uid = " + j11).stepThis().dispose();
                            }
                            i18++;
                            executeFast = sQLitePreparedStatement4;
                            size = i19;
                            sQLiteCursor6 = sQLiteCursor7;
                            executeFast2 = sQLitePreparedStatement5;
                            m10 = i21;
                            i17 = i22;
                        }
                        i17++;
                        pollResults = pollResults2;
                    }
                    TLRPC.PollResults pollResults3 = pollResults;
                    SQLitePreparedStatement sQLitePreparedStatement6 = executeFast2;
                    executeFast.dispose();
                    sQLitePreparedStatement6.dispose();
                    SQLitePreparedStatement executeFast3 = qrVar.b.executeFast("UPDATE media_v4 SET data = ? WHERE mid = ? AND uid = ?");
                    SQLitePreparedStatement executeFast4 = qrVar.b.executeFast("UPDATE media_topics SET data = ? WHERE mid = ? AND uid = ? AND topic_id = ?");
                    int m11 = hVar2.m();
                    SQLiteCursor sQLiteCursor8 = sQLiteCursor6;
                    int i23 = 0;
                    while (i23 < m11) {
                        try {
                            long j12 = hVar2.j(i23);
                            ArrayList arrayList4 = (ArrayList) hVar2.n(i23);
                            int size2 = arrayList4.size();
                            int i24 = 0;
                            while (i24 < size2) {
                                Integer num2 = (Integer) arrayList4.get(i24);
                                SQLitePreparedStatement sQLitePreparedStatement7 = executeFast3;
                                SQLitePreparedStatement sQLitePreparedStatement8 = executeFast4;
                                int i25 = 0;
                                while (i25 < 1) {
                                    boolean z13 = i25 == 1;
                                    if (z13) {
                                        i3 = i25;
                                        try {
                                            sQLiteDatabase = qrVar.b;
                                            Locale locale5 = Locale.US;
                                            z11 = z13;
                                            sb2 = new StringBuilder();
                                            i10 = m11;
                                            sb2.append("SELECT data, topic_id FROM media_topics WHERE mid = ");
                                            sb2.append(num2);
                                            sb2.append(" AND uid = ");
                                            sb2.append(j12);
                                            sQLiteCursor2 = sQLiteCursor8;
                                        } catch (Exception e15) {
                                            e = e15;
                                            sQLiteCursor2 = sQLiteCursor8;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            sQLiteCursor2 = sQLiteCursor8;
                                        }
                                        try {
                                            queryFinalized = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                                            sQLitePreparedStatement = sQLitePreparedStatement8;
                                            i11 = 0;
                                        } catch (Exception e16) {
                                            e = e16;
                                            sQLiteCursor6 = sQLiteCursor2;
                                            z10 = true;
                                            qrVar.o(e, z10);
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
                                        i3 = i25;
                                        z11 = z13;
                                        i10 = m11;
                                        SQLiteDatabase sQLiteDatabase6 = qrVar.b;
                                        Locale locale6 = Locale.US;
                                        i11 = 0;
                                        queryFinalized = sQLiteDatabase6.queryFinalized("SELECT data FROM media_v4 WHERE mid = " + num2 + " AND uid = " + j12, new Object[0]);
                                        sQLitePreparedStatement = sQLitePreparedStatement7;
                                    }
                                    try {
                                        if (queryFinalized.next()) {
                                            NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(i11);
                                            sQLiteCursor = queryFinalized;
                                            long longValue2 = z11 ? queryFinalized.longValue(1) : 0L;
                                            if (byteBufferValue2 != null) {
                                                hVar = hVar2;
                                                arrayList = arrayList4;
                                                try {
                                                    TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                                    i12 = size2;
                                                    i13 = i24;
                                                    TLdeserialize2.readAttachPath(byteBufferValue2, qrVar.getUserConfig().n);
                                                    byteBufferValue2.reuse();
                                                    TLRPC.MessageMedia messageMedia2 = TLdeserialize2.media;
                                                    if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2 = (TLRPC.TL_messageMediaPoll) messageMedia2;
                                                        if (poll != null) {
                                                            tL_messageMediaPoll2.poll = poll;
                                                        }
                                                        if (pollResults3 != null) {
                                                            zi.e6(tL_messageMediaPoll2, pollResults3);
                                                        }
                                                        zi.r5(TLdeserialize2);
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
                                                        i25 = i3 + 1;
                                                        arrayList4 = arrayList;
                                                        m11 = i10;
                                                        hVar2 = hVar;
                                                        sQLiteCursor8 = sQLiteCursor;
                                                        size2 = i12;
                                                        i24 = i13;
                                                    }
                                                    sQLiteCursor.dispose();
                                                    i25 = i3 + 1;
                                                    arrayList4 = arrayList;
                                                    m11 = i10;
                                                    hVar2 = hVar;
                                                    sQLiteCursor8 = sQLiteCursor;
                                                    size2 = i12;
                                                    i24 = i13;
                                                } catch (Exception e17) {
                                                    e = e17;
                                                    sQLiteCursor6 = sQLiteCursor;
                                                    z10 = true;
                                                    qrVar.o(e, z10);
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
                                        i12 = size2;
                                        i13 = i24;
                                        sQLiteCursor.dispose();
                                        i25 = i3 + 1;
                                        arrayList4 = arrayList;
                                        m11 = i10;
                                        hVar2 = hVar;
                                        sQLiteCursor8 = sQLiteCursor;
                                        size2 = i12;
                                        i24 = i13;
                                    } catch (Exception e18) {
                                        e = e18;
                                        sQLiteCursor = queryFinalized;
                                    } catch (Throwable th10) {
                                        th = th10;
                                        sQLiteCursor = queryFinalized;
                                    }
                                }
                                i24++;
                                arrayList4 = arrayList4;
                                executeFast3 = sQLitePreparedStatement7;
                                executeFast4 = sQLitePreparedStatement8;
                                hVar2 = hVar2;
                            }
                            i23++;
                            hVar2 = hVar2;
                        } catch (Exception e19) {
                            e = e19;
                            sQLiteCursor6 = sQLiteCursor8;
                        } catch (Throwable th11) {
                            th = th11;
                            sQLiteCursor6 = sQLiteCursor8;
                        }
                    }
                    SQLitePreparedStatement sQLitePreparedStatement9 = executeFast4;
                    executeFast3.dispose();
                    sQLitePreparedStatement9.dispose();
                    qrVar.b.commitTransaction();
                    sQLiteCursor6 = sQLiteCursor8;
                }
                if (sQLiteCursor6 != null) {
                    sQLiteCursor6.dispose();
                }
            } catch (Exception e20) {
                e = e20;
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
        lv lvVar;
        boolean z10;
        SQLiteCursor sQLiteCursor3;
        mv mvVar;
        long j10;
        Long valueOf;
        Integer valueOf2;
        Long valueOf3;
        Object[] objArr;
        nv nvVar = (nv) this.b;
        qr qrVar = (qr) this.d;
        long j11 = this.c;
        lv lvVar2 = (lv) this.e;
        SQLiteDatabase sQLiteDatabase = qrVar.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        long j12 = j11;
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        try {
            int i3 = 0;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT did, date, last_mid, pinned, flags, folder_id, last_mid_group, count, unread_count, max_read_id, read_outbox FROM saved_dialogs WHERE forumChatId = ? ORDER BY pinned ASC, date DESC", 0);
            SQLiteCursor sQLiteCursor4 = null;
            while (queryFinalized.next()) {
                try {
                    try {
                        mvVar = new mv();
                        lvVar = lvVar2;
                        j10 = j12;
                        try {
                            mvVar.a = queryFinalized.longValue(i3);
                            mvVar.j = queryFinalized.intValue(1);
                            mvVar.c = queryFinalized.intValue(2);
                            mvVar.k = queryFinalized.intValue(3);
                            mvVar.i = (queryFinalized.intValue(4) & 1) != 0;
                            mvVar.b = mvVar.k != 999;
                            mvVar.e = queryFinalized.intValue(7);
                            mvVar.f = queryFinalized.longValue(8);
                            mvVar.g = queryFinalized.longValue(9);
                            mvVar.h = queryFinalized.longValue(10);
                            long j13 = mvVar.a;
                            if (j13 < 0) {
                                try {
                                    arrayList3.add(Long.valueOf(-j13));
                                } catch (Exception e10) {
                                    e = e10;
                                    sQLiteCursor2 = sQLiteCursor4;
                                    sQLiteCursor = queryFinalized;
                                    z10 = true;
                                    try {
                                        a8.g(e, z10);
                                        if (sQLiteCursor != null) {
                                        }
                                        if (sQLiteCursor2 != null) {
                                        }
                                        g0.h3(new pj(nvVar, arrayList5, arrayList6, arrayList7, arrayList, lvVar, 7));
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
                            valueOf2 = Integer.valueOf(mvVar.c);
                            valueOf3 = Long.valueOf(mvVar.a);
                            objArr = new Object[3];
                            sQLiteCursor3 = queryFinalized;
                        } catch (Exception e11) {
                            e = e11;
                            sQLiteCursor3 = queryFinalized;
                            sQLiteCursor2 = sQLiteCursor4;
                            sQLiteCursor = sQLiteCursor3;
                            z10 = true;
                            a8.g(e, z10);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                            g0.h3(new pj(nvVar, arrayList5, arrayList6, arrayList7, arrayList, lvVar, 7));
                        }
                    } catch (Exception e12) {
                        e = e12;
                        sQLiteCursor3 = queryFinalized;
                        lvVar = lvVar2;
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
                        qr.e(TLdeserialize, arrayList2, arrayList3, arrayList4);
                        mvVar.d = new zi(nvVar.a, TLdeserialize, null, null, null, null, null, false, false, 0L, false, false, true, 0);
                    }
                    sQLiteCursor4.dispose();
                    arrayList.add(mvVar);
                    lvVar2 = lvVar;
                    j12 = j10;
                    queryFinalized = sQLiteCursor3;
                    i3 = 0;
                } catch (Exception e13) {
                    e = e13;
                    sQLiteCursor2 = sQLiteCursor4;
                    sQLiteCursor = sQLiteCursor3;
                    z10 = true;
                    a8.g(e, z10);
                    if (sQLiteCursor != null) {
                    }
                    if (sQLiteCursor2 != null) {
                    }
                    g0.h3(new pj(nvVar, arrayList5, arrayList6, arrayList7, arrayList, lvVar, 7));
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
            lvVar = lvVar2;
            if (!arrayList2.isEmpty()) {
                qrVar.n0(arrayList2, arrayList5, false);
            }
            if (!arrayList3.isEmpty()) {
                qrVar.Q(TextUtils.join(",", arrayList3), arrayList6);
            }
            if (!arrayList4.isEmpty()) {
                qrVar.L(TextUtils.join(",", arrayList4), arrayList7);
            }
            sQLiteCursor3.dispose();
            if (sQLiteCursor4 != null) {
                sQLiteCursor4.dispose();
            }
        } catch (Exception e14) {
            e = e14;
            lvVar = lvVar2;
            z10 = true;
            sQLiteCursor = null;
            sQLiteCursor2 = null;
        } catch (Throwable th6) {
            th = th6;
            sQLiteCursor = null;
            sQLiteCursor2 = null;
        }
        g0.h3(new pj(nvVar, arrayList5, arrayList6, arrayList7, arrayList, lvVar, 7));
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x02dc, code lost:
    
        if (r6 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01aa, code lost:
    
        if (r17 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ad, code lost:
    
        org.telegram.messenger.g0.h3(new org.telegram.messenger.pj(r16, r15, r6, r9, r2, (java.lang.Object) r3, 6));
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
    /* JADX WARN: Type inference failed for: r0v26, types: [a0.h] */
    /* JADX WARN: Type inference failed for: r10v22, types: [org.telegram.ui.Components.ei] */
    /* JADX WARN: Type inference failed for: r11v1, types: [org.telegram.messenger.u10] */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r1v43, types: [a0.h] */
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
        int i3;
        char c2;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        boolean z10;
        mv mvVar;
        long j10;
        SQLiteCursor queryFinalized;
        SQLiteDatabase sQLiteDatabase;
        int i10 = this.a;
        long j11 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.b;
        int i11 = 0;
        switch (i10) {
            case 0:
                hp hpVar = (hp) obj3;
                ?? r11 = (u10) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj;
                if (r11 == null) {
                    org.telegram.ui.Components.t4.f(hpVar.currentAccount, hpVar.M0(Long.valueOf(j11)), tL_messages_invitedUsers);
                    return;
                } else {
                    hpVar.getClass();
                    r11.a(tL_messages_invitedUsers);
                    return;
                }
            case 1:
                hp hpVar2 = (hp) obj3;
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) obj2;
                TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) obj;
                ?? r02 = hpVar2.S;
                ConcurrentHashMap concurrentHashMap = hpVar2.Q;
                ConcurrentHashMap concurrentHashMap2 = hpVar2.P;
                hpVar2.Y3(tL_help_promoData.users, false);
                hpVar2.S3(tL_help_promoData.chats, false);
                hpVar2.Y3(tL_messages_peerDialogs.users, false);
                hpVar2.S3(tL_messages_peerDialogs.chats, false);
                TLRPC.Dialog dialog = hpVar2.y2;
                if (dialog != null) {
                    long j12 = dialog.id;
                    if (j12 < 0) {
                        TLRPC.Chat M0 = hpVar2.M0(Long.valueOf(-j12));
                        if (t3.r0(M0) || M0.restricted) {
                            hpVar2.f4(hpVar2.y2);
                        }
                    } else {
                        hpVar2.f4(dialog);
                    }
                }
                TLRPC.Dialog dialog2 = tL_messages_peerDialogs.dialogs.get(0);
                hpVar2.y2 = dialog2;
                dialog2.id = j11;
                dialog2.folder_id = 0;
                if (m5.y(dialog2)) {
                    LongSparseIntArray longSparseIntArray = hpVar2.Z0;
                    TLRPC.Dialog dialog3 = hpVar2.y2;
                    longSparseIntArray.put(-dialog3.id, dialog3.pts);
                }
                Integer num = (Integer) concurrentHashMap2.get(Long.valueOf(hpVar2.y2.id));
                if (num == null) {
                    num = r13;
                }
                concurrentHashMap2.put(Long.valueOf(hpVar2.y2.id), Integer.valueOf(Math.max(num.intValue(), hpVar2.y2.read_inbox_max_id)));
                Integer num2 = (Integer) concurrentHashMap.get(Long.valueOf(hpVar2.y2.id));
                concurrentHashMap.put(Long.valueOf(hpVar2.y2.id), Integer.valueOf(Math.max((num2 != null ? num2 : 0).intValue(), hpVar2.y2.read_outbox_max_id)));
                hpVar2.R.k(hpVar2.y2, j11);
                if (!tL_messages_peerDialogs.messages.isEmpty()) {
                    ?? hVar = new a0.h();
                    ?? hVar2 = new a0.h();
                    for (int i12 = 0; i12 < tL_messages_peerDialogs.users.size(); i12++) {
                        TLRPC.User user = tL_messages_peerDialogs.users.get(i12);
                        hVar.k(user, user.id);
                    }
                    for (int i13 = 0; i13 < tL_messages_peerDialogs.chats.size(); i13++) {
                        TLRPC.Chat chat = tL_messages_peerDialogs.chats.get(i13);
                        hVar2.k(chat, chat.id);
                    }
                    zi ziVar = new zi(hpVar2.currentAccount, tL_messages_peerDialogs.messages.get(0), (a0.h) hVar, (a0.h) hVar2, false, true);
                    ArrayList arrayList = (ArrayList) r02.f(j11);
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    if (arrayList.size() > 0 && arrayList.get(0) != null && ((zi) arrayList.get(0)).A2() && ((zi) arrayList.get(0)).e1() != ziVar.e1()) {
                        arrayList.clear();
                    }
                    arrayList.add(ziVar);
                    r02.k(arrayList, j11);
                    TLRPC.Dialog dialog4 = hpVar2.y2;
                    if (dialog4.last_message_date == 0) {
                        dialog4.last_message_date = ziVar.k.date;
                    }
                    hpVar2.s7.d(j11);
                }
                hpVar2.T4(null);
                hpVar2.getNotificationCenter().k(3, Boolean.TRUE);
                return;
            case 2:
                i3 i3Var = (i3) obj3;
                zi ziVar2 = (zi) obj2;
                boolean h32 = ziVar2.h3();
                org.telegram.ui.wm wmVar = i3Var.a;
                ei.m7.b(wmVar.getCurrentAccount(), j11, ziVar2, (TL_stories.StoryItem) obj);
                ArrayList arrayList2 = new ArrayList();
                ziVar2.K1 = true;
                arrayList2.add(ziVar2);
                wmVar.getMessagesStorage().a.c(new b4(17, i3Var, arrayList2));
                if (!h32 && ziVar2.h3() && ziVar2.D == 24) {
                    wmVar.Xc(arrayList2, true);
                    return;
                } else {
                    wmVar.Xc(arrayList2, false);
                    return;
                }
            case 3:
                sz.a((rz) obj2);
                ((li) obj3).getNotificationCenter().k(55, Long.valueOf(j11), (ArrayList) obj, null);
                return;
            case 4:
                hp hpVar3 = (hp) obj3;
                TLObject tLObject = (TLObject) obj2;
                Runnable runnable = (Runnable) obj;
                if (tLObject != null) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    hpVar3.Y3(groupcall.users, false);
                    hpVar3.S3(groupcall.chats, false);
                    r3 r3Var = new r3();
                    r3Var.u(hpVar3.getAccountInstance(), j11, groupcall);
                    hpVar3.n1.k(r3Var, groupcall.call.id);
                    hpVar3.o1.k(r3Var, j11);
                    hpVar3.getNotificationCenter().k(hs.w2, Long.valueOf(j11), Long.valueOf(groupcall.call.id), Boolean.FALSE);
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                hpVar3.u1.remove(Long.valueOf(j11));
                return;
            case 5:
                hp hpVar4 = (hp) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                hpVar4.b1.e(j11);
                if (arrayList3 != null) {
                    hpVar4.l5(0, -j11, arrayList3);
                    hpVar4.getNotificationCenter().k(3, new Object[0]);
                }
                hpVar4.getNotificationCenter().k(hs.t1, Long.valueOf(j11), Long.valueOf(tL_channels_channelParticipant.participant.inviter_id));
                return;
            case 6:
                hp hpVar5 = (hp) obj3;
                String str = (String) obj2;
                Runnable runnable2 = (Runnable) obj;
                TLRPC.Chat M02 = hpVar5.M0(Long.valueOf(j11));
                if (M02.usernames != null) {
                    for (int i14 = 0; i14 < M02.usernames.size(); i14++) {
                        TLRPC.TL_username tL_username = M02.usernames.get(i14);
                        if (tL_username != null && tL_username.editable) {
                            tL_username.username = str;
                            i3 = 1;
                            c2 = 0;
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(M02);
                            hpVar5.getMessagesStorage().m1(null, arrayList4, i3, i3);
                            hs notificationCenter = hpVar5.getNotificationCenter();
                            Object[] objArr = new Object[i3];
                            objArr[c2] = Integer.valueOf(TLObject.FLAG_13);
                            notificationCenter.k(2, objArr);
                            runnable2.run();
                            return;
                        }
                    }
                }
                ArrayList<TLRPC.TL_username> arrayList5 = M02.usernames;
                if (arrayList5 != null && arrayList5.size() < 1) {
                    M02.username = str;
                    i3 = 1;
                    c2 = 0;
                    ArrayList arrayList42 = new ArrayList();
                    arrayList42.add(M02);
                    hpVar5.getMessagesStorage().m1(null, arrayList42, i3, i3);
                    hs notificationCenter2 = hpVar5.getNotificationCenter();
                    Object[] objArr2 = new Object[i3];
                    objArr2[c2] = Integer.valueOf(TLObject.FLAG_13);
                    notificationCenter2.k(2, objArr2);
                    runnable2.run();
                    return;
                }
                if (M02.usernames == null) {
                    M02.usernames = new ArrayList<>();
                }
                TLRPC.TL_username tL_username2 = new TLRPC.TL_username();
                tL_username2.username = str;
                i3 = 1;
                tL_username2.active = true;
                tL_username2.editable = true;
                c2 = 0;
                M02.usernames.add(0, tL_username2);
                ArrayList arrayList422 = new ArrayList();
                arrayList422.add(M02);
                hpVar5.getMessagesStorage().m1(null, arrayList422, i3, i3);
                hs notificationCenter22 = hpVar5.getNotificationCenter();
                Object[] objArr22 = new Object[i3];
                objArr22[c2] = Integer.valueOf(TLObject.FLAG_13);
                notificationCenter22.k(2, objArr22);
                runnable2.run();
                return;
            case 7:
                hp hpVar6 = (hp) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                SparseArray sparseArray = hpVar6.V;
                a0.h hVar3 = hpVar6.P1;
                ArrayList arrayList8 = (ArrayList) hVar3.f(j11);
                if (arrayList8 != null) {
                    arrayList8.removeAll(arrayList6);
                    if (arrayList8.isEmpty()) {
                        hVar3.l(j11);
                    }
                }
                ArrayList arrayList9 = (ArrayList) hpVar6.S.f(j11);
                if (arrayList9 != null) {
                    for (int i15 = 0; i15 < arrayList9.size(); i15++) {
                        zi ziVar3 = (zi) arrayList9.get(i15);
                        int i16 = 0;
                        while (true) {
                            if (i16 < arrayList7.size()) {
                                zi ziVar4 = (zi) arrayList7.get(i16);
                                if (ziVar3.f1() == ziVar4.f1()) {
                                    arrayList9.set(i15, ziVar4);
                                    if (ziVar4.k.peer_id.channel_id == 0) {
                                        zi ziVar5 = (zi) sparseArray.get(ziVar4.f1());
                                        sparseArray.remove(ziVar4.f1());
                                        if (ziVar5 != null) {
                                            sparseArray.put(ziVar5.f1(), ziVar5);
                                        }
                                    }
                                    hpVar6.getNotificationCenter().k(3, new Object[0]);
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                }
                hpVar6.getNotificationCenter().k(49, Long.valueOf(j11), arrayList7);
                return;
            case 8:
                ((qr) obj3).getMessagesController().L((TLRPC.TL_dialog) obj2, (TLRPC.InputPeer) obj, j11);
                return;
            case 9:
                qr qrVar = (qr) obj3;
                TLRPC.TL_messageReactions tL_messageReactions = (TLRPC.TL_messageReactions) obj2;
                TLRPC.TL_messageReactions tL_messageReactions2 = (TLRPC.TL_messageReactions) obj;
                ?? hVar4 = new a0.h();
                ?? hVar5 = new a0.h();
                if (tL_messageReactions.results != null && tL_messageReactions.reactions_as_tags) {
                    for (int i17 = 0; i17 < tL_messageReactions.results.size(); i17++) {
                        dh.n0 d = dh.n0.d(tL_messageReactions.results.get(i17).reaction);
                        hVar4.k(d, d.h);
                    }
                }
                if (tL_messageReactions2 != null && tL_messageReactions2.results != null && tL_messageReactions2.reactions_as_tags) {
                    for (int i18 = 0; i18 < tL_messageReactions2.results.size(); i18++) {
                        dh.n0 d10 = dh.n0.d(tL_messageReactions2.results.get(i18).reaction);
                        hVar5.k(d10, d10.h);
                    }
                }
                boolean z11 = false;
                for (int i19 = 0; i19 < hVar4.m(); i19++) {
                    long j13 = hVar4.j(i19);
                    dh.n0 n0Var = (dh.n0) hVar4.n(i19);
                    if (!hVar5.d(j13)) {
                        z11 = qrVar.getMessagesController().s5(j11, n0Var, false) || z11;
                    }
                }
                for (int i20 = 0; i20 < hVar5.m(); i20++) {
                    long j14 = hVar5.j(i20);
                    dh.n0 n0Var2 = (dh.n0) hVar5.n(i20);
                    if (!hVar4.d(j14)) {
                        z11 = qrVar.getMessagesController().s5(j11, n0Var2, true) || z11;
                    }
                }
                if (z11) {
                    if (j11 != 0) {
                        qrVar.getMessagesController().q5(0L);
                    }
                    qrVar.getMessagesController().q5(j11);
                    return;
                }
                return;
            case 10:
                qr qrVar2 = (qr) obj3;
                qrVar2.getFileLoader().g((ArrayList) obj2);
                qrVar2.getMessagesController().l3((ArrayList) obj, j11);
                return;
            case 11:
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                ((TLRPC.User[]) obj2)[0] = ((qr) obj3).j0(j11);
                return;
            case 12:
                qr qrVar3 = (qr) obj3;
                Boolean[] boolArr = (Boolean[]) obj2;
                CountDownLatch countDownLatch2 = (CountDownLatch) obj;
                qrVar3.getClass();
                try {
                    sQLiteCursor = qrVar3.b.queryFinalized("SELECT date FROM dialogs WHERE did = " + j11, new Object[0]);
                    try {
                        try {
                            boolArr[0] = Boolean.valueOf(sQLiteCursor.next());
                        } catch (Exception e10) {
                            e = e10;
                            qrVar3.o(e, true);
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
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
            case 13:
                qr qrVar4 = (qr) obj3;
                Integer[] numArr = (Integer[]) obj2;
                CountDownLatch countDownLatch3 = (CountDownLatch) obj;
                qrVar4.getClass();
                try {
                    sQLiteCursor2 = qrVar4.b.queryFinalized("SELECT pts FROM dialogs WHERE did = " + (-j11), new Object[0]);
                    try {
                        try {
                            if (sQLiteCursor2.next()) {
                                numArr[0] = Integer.valueOf(sQLiteCursor2.intValue(0));
                            }
                            sQLiteCursor2.dispose();
                            z10 = true;
                        } catch (Exception e12) {
                            e = e12;
                            z10 = true;
                            qrVar4.o(e, true);
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
                } catch (Exception e13) {
                    e = e13;
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
                } catch (Exception e14) {
                    qrVar4.o(e14, z10);
                    return;
                }
            case 14:
                CountDownLatch countDownLatch4 = (CountDownLatch) obj;
                ((TLRPC.Chat[]) obj2)[0] = ((qr) obj3).O(j11);
                return;
            case 15:
                qr qrVar5 = (qr) obj3;
                ArrayList arrayList10 = (ArrayList) obj2;
                CountDownLatch countDownLatch5 = (CountDownLatch) obj;
                qrVar5.getClass();
                try {
                    try {
                        ArrayList arrayList11 = new ArrayList();
                        ArrayList arrayList12 = new ArrayList();
                        qrVar5.V("" + j11, arrayList12, arrayList11);
                        if (!arrayList12.isEmpty() && !arrayList11.isEmpty()) {
                            ArrayList arrayList13 = new ArrayList();
                            qrVar5.n0(arrayList11, arrayList13, false);
                            if (!arrayList13.isEmpty()) {
                                arrayList10.add((TLObject) arrayList12.get(0));
                                arrayList10.add((TLObject) arrayList13.get(0));
                            }
                        }
                    } finally {
                        countDownLatch5.countDown();
                    }
                } catch (Exception e15) {
                    qrVar5.o(e15, true);
                }
                return;
            case 16:
                a();
                return;
            case 17:
                nv nvVar = (nv) obj3;
                qr qrVar6 = (qr) obj2;
                ArrayList arrayList14 = (ArrayList) obj;
                SQLiteDatabase sQLiteDatabase2 = qrVar6.b;
                ArrayList arrayList15 = new ArrayList();
                ?? hVar6 = new a0.h();
                ArrayList arrayList16 = new ArrayList();
                ArrayList arrayList17 = new ArrayList();
                ArrayList arrayList18 = new ArrayList();
                ArrayList arrayList19 = new ArrayList();
                ArrayList arrayList20 = new ArrayList();
                ?? r18 = 1;
                ArrayList arrayList21 = new ArrayList();
                int i21 = 0;
                SQLiteCursor sQLiteCursor3 = null;
                while (i11 < arrayList14.size()) {
                    try {
                        try {
                            mvVar = (mv) arrayList14.get(i11);
                            Long valueOf = Long.valueOf(j11);
                            j10 = j11;
                            Long valueOf2 = Long.valueOf(mvVar.a);
                            Object[] objArr3 = new Object[2];
                            objArr3[i21] = valueOf;
                            objArr3[r18] = valueOf2;
                            queryFinalized = sQLiteDatabase2.queryFinalized("SELECT mid, data FROM messages_topics WHERE uid = ? AND topic_id = ? ORDER BY mid DESC LIMIT 1", objArr3);
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Exception e16) {
                        e = e16;
                    }
                    try {
                        if (queryFinalized.next()) {
                            queryFinalized.intValue(i21);
                            boolean z12 = r18;
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(z12 ? 1 : 0);
                            sQLiteDatabase = sQLiteDatabase2;
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z12), z12);
                            qr.e(TLdeserialize, arrayList16, arrayList17, arrayList18);
                            hVar6.k(TLdeserialize, mvVar.a);
                        } else {
                            sQLiteDatabase = sQLiteDatabase2;
                            arrayList15.add(Long.valueOf(mvVar.a));
                        }
                        queryFinalized.dispose();
                        i11++;
                        sQLiteCursor3 = queryFinalized;
                        sQLiteDatabase2 = sQLiteDatabase;
                        j11 = j10;
                        r18 = 1;
                        i21 = 0;
                    } catch (Exception e17) {
                        e = e17;
                        sQLiteCursor3 = queryFinalized;
                        a8.g(e, true);
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
                    qrVar6.n0(arrayList16, arrayList19, false);
                }
                if (!arrayList17.isEmpty()) {
                    qrVar6.Q(TextUtils.join(",", arrayList17), arrayList20);
                }
                if (!arrayList18.isEmpty()) {
                    qrVar6.L(TextUtils.join(",", arrayList18), arrayList21);
                    break;
                }
                break;
            case 18:
                b();
                return;
            default:
                c00 c00Var = (c00) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                ?? r10 = (org.telegram.ui.Components.ei) obj;
                c00Var.getClass();
                ArrayList arrayList22 = new ArrayList();
                if (tLObject2 instanceof TLRPC.TL_messages_forumTopics) {
                    TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject2;
                    a0.h hVar7 = new a0.h();
                    for (int i22 = 0; i22 < tL_messages_forumTopics.messages.size(); i22++) {
                        hVar7.k(tL_messages_forumTopics.messages.get(i22), tL_messages_forumTopics.messages.get(i22).id);
                    }
                    c00Var.getMessagesController().Y3(tL_messages_forumTopics.users, false);
                    c00Var.getMessagesController().S3(tL_messages_forumTopics.chats, false);
                    ArrayList<TLRPC.TL_forumTopic> arrayList23 = tL_messages_forumTopics.topics;
                    long j15 = this.c;
                    c00Var.u(j15, arrayList23, hVar7, false, 2, -1);
                    c00Var.getMessagesStorage().C1(c00Var.getConnectionsManager().getCurrentTime(), -j15, (List) c00Var.a.f(j15), true);
                    c00Var.getMessagesStorage().j1(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
                    ArrayList<TLRPC.TL_forumTopic> arrayList24 = tL_messages_forumTopics.topics;
                    int size = arrayList24.size();
                    while (i11 < size) {
                        TLRPC.TL_forumTopic tL_forumTopic = arrayList24.get(i11);
                        i11++;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        TLRPC.TL_forumTopic f10 = c00Var.f(j15, tL_forumTopic2.id);
                        if (f10 != null) {
                            tL_forumTopic2 = f10;
                        }
                        arrayList22.add(tL_forumTopic2);
                    }
                }
                r10.a(arrayList22);
                return;
        }
    }

    public /* synthetic */ zl(Object obj, Object obj2, Object obj3, long j10, int i3) {
        this.a = i3;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = j10;
    }

    public /* synthetic */ zl(c1 c1Var, long j10, Object obj, Object obj2, int i3) {
        this.a = i3;
        this.b = c1Var;
        this.c = j10;
        this.d = obj;
        this.e = obj2;
    }
}
