package org.telegram.messenger;

import android.text.TextUtils;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class wm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wm(Object obj, Object obj2, long j10, Object obj3, int i10) {
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
        hs hsVar = (hs) this.b;
        long j10 = this.c;
        TLRPC.Poll poll = (TLRPC.Poll) this.d;
        TLRPC.PollResults pollResults = (TLRPC.PollResults) this.e;
        hsVar.getClass();
        SQLiteCursor sQLiteCursor6 = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase3 = hsVar.b;
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
                            hsVar.o(e, z10);
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
                    hsVar.b.beginTransaction();
                    SQLitePreparedStatement executeFast = hsVar.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                    SQLitePreparedStatement executeFast2 = hsVar.b.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
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
                                        sQLiteDatabase2 = hsVar.b;
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
                                        hsVar.o(e, z10);
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
                                        hsVar.o(e, z10);
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
                                    SQLiteDatabase sQLiteDatabase4 = hsVar.b;
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
                                            TLdeserialize.readAttachPath(byteBufferValue, hsVar.getUserConfig().n);
                                            byteBufferValue.reuse();
                                            TLRPC.MessageMedia messageMedia = TLdeserialize.media;
                                            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                                if (poll != null) {
                                                    tL_messageMediaPoll.poll = poll;
                                                }
                                                if (pollResults2 != null) {
                                                    jj.b6(tL_messageMediaPoll, pollResults2);
                                                }
                                                jj.q5(TLdeserialize);
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
                                    hsVar.o(e, z10);
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
                                SQLiteDatabase sQLiteDatabase5 = hsVar.b;
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
                    SQLitePreparedStatement executeFast3 = hsVar.b.executeFast("UPDATE media_v4 SET data = ? WHERE mid = ? AND uid = ?");
                    SQLitePreparedStatement executeFast4 = hsVar.b.executeFast("UPDATE media_topics SET data = ? WHERE mid = ? AND uid = ? AND topic_id = ?");
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
                                            sQLiteDatabase = hsVar.b;
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
                                            hsVar.o(e, z10);
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
                                        SQLiteDatabase sQLiteDatabase6 = hsVar.b;
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
                                                    TLdeserialize2.readAttachPath(byteBufferValue2, hsVar.getUserConfig().n);
                                                    byteBufferValue2.reuse();
                                                    TLRPC.MessageMedia messageMedia2 = TLdeserialize2.media;
                                                    if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2 = (TLRPC.TL_messageMediaPoll) messageMedia2;
                                                        if (poll != null) {
                                                            tL_messageMediaPoll2.poll = poll;
                                                        }
                                                        if (pollResults3 != null) {
                                                            jj.b6(tL_messageMediaPoll2, pollResults3);
                                                        }
                                                        jj.q5(TLdeserialize2);
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
                                                    hsVar.o(e, z10);
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
                    hsVar.b.commitTransaction();
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

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00df, code lost:
    
        if (r16 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e2, code lost:
    
        org.telegram.messenger.i0.g3(new org.telegram.messenger.ek(r3, r4, r5, r14, r7, r8, 6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ec, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d8, code lost:
    
        r16.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d6, code lost:
    
        if (r16 != null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        fw fwVar;
        ArrayList arrayList;
        long j10;
        SQLiteCursor queryFinalized;
        gw gwVar = (gw) this.b;
        hs hsVar = (hs) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        long j11 = this.c;
        SQLiteDatabase sQLiteDatabase = hsVar.b;
        ArrayList arrayList3 = new ArrayList();
        a0.h hVar = new a0.h();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long j12 = j11;
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        int i10 = 0;
        SQLiteCursor sQLiteCursor = null;
        while (i10 < arrayList2.size()) {
            try {
                try {
                    fwVar = (fw) arrayList2.get(i10);
                    arrayList = arrayList2;
                    j10 = j12;
                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT mid, data FROM messages_topics WHERE uid = ? AND topic_id = ? ORDER BY mid DESC LIMIT 1", Long.valueOf(j12), Long.valueOf(fwVar.a));
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                if (queryFinalized.next()) {
                    queryFinalized.intValue(0);
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(1);
                    sQLiteCursor = queryFinalized;
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                    hs.e(TLdeserialize, arrayList4, arrayList5, arrayList6);
                    hVar.k(TLdeserialize, fwVar.a);
                } else {
                    sQLiteCursor = queryFinalized;
                    arrayList3.add(Long.valueOf(fwVar.a));
                }
                sQLiteCursor.dispose();
                i10++;
                arrayList2 = arrayList;
                j12 = j10;
            } catch (Exception e7) {
                e = e7;
                sQLiteCursor = queryFinalized;
                f8.g(e, true);
            } catch (Throwable th3) {
                th = th3;
                sQLiteCursor = queryFinalized;
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                throw th;
            }
        }
        if (!arrayList4.isEmpty()) {
            hsVar.n0(arrayList4, arrayList7, false);
        }
        if (!arrayList5.isEmpty()) {
            hsVar.Q(TextUtils.join(",", arrayList5), arrayList8);
        }
        if (!arrayList6.isEmpty()) {
            hsVar.L(TextUtils.join(",", arrayList6), arrayList9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x02d1, code lost:
    
        if (r4 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0195, code lost:
    
        if (r16 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0198, code lost:
    
        org.telegram.messenger.i0.g3(new org.telegram.messenger.ek(r15, r2, r3, r5, r8, r20, 7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01aa, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x017f, code lost:
    
        r16.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017d, code lost:
    
        if (r16 != null) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b3  */
    /* JADX WARN: Type inference failed for: r4v14, types: [long] */
    /* JADX WARN: Type inference failed for: r4v20, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v26 */
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
        SQLiteCursor sQLiteCursor3;
        SQLiteCursor sQLiteCursor4;
        boolean z11;
        fw fwVar;
        long j10;
        SQLiteCursor queryFinalized;
        int i11 = this.a;
        Object obj = this.e;
        long j11 = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                vp vpVar = (vp) obj3;
                q20 q20Var = (q20) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj;
                if (q20Var == null) {
                    org.telegram.ui.Components.s4.f(vpVar.currentAccount, vpVar.L0(Long.valueOf(j11)), tL_messages_invitedUsers);
                    return;
                } else {
                    vpVar.getClass();
                    q20Var.a(tL_messages_invitedUsers);
                    return;
                }
            case 1:
                vp vpVar2 = (vp) obj3;
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) obj2;
                TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) obj;
                a0.h hVar = vpVar2.R;
                ConcurrentHashMap concurrentHashMap = vpVar2.P;
                ConcurrentHashMap concurrentHashMap2 = vpVar2.O;
                vpVar2.V3(tL_help_promoData.users, false);
                vpVar2.P3(tL_help_promoData.chats, false);
                vpVar2.V3(tL_messages_peerDialogs.users, false);
                vpVar2.P3(tL_messages_peerDialogs.chats, false);
                TLRPC.Dialog dialog = vpVar2.x2;
                if (dialog != null) {
                    long j12 = dialog.id;
                    if (j12 < 0) {
                        TLRPC.Chat L0 = vpVar2.L0(Long.valueOf(-j12));
                        if (w3.r0(L0) || L0.restricted) {
                            vpVar2.c4(vpVar2.x2);
                        }
                    } else {
                        vpVar2.c4(dialog);
                    }
                }
                TLRPC.Dialog dialog2 = tL_messages_peerDialogs.dialogs.get(0);
                vpVar2.x2 = dialog2;
                dialog2.id = j11;
                dialog2.folder_id = 0;
                if (o5.y(dialog2)) {
                    LongSparseIntArray longSparseIntArray = vpVar2.Y0;
                    TLRPC.Dialog dialog3 = vpVar2.x2;
                    longSparseIntArray.put(-dialog3.id, dialog3.pts);
                }
                Integer num = (Integer) concurrentHashMap2.get(Long.valueOf(vpVar2.x2.id));
                if (num == null) {
                    num = r6;
                }
                concurrentHashMap2.put(Long.valueOf(vpVar2.x2.id), Integer.valueOf(Math.max(num.intValue(), vpVar2.x2.read_inbox_max_id)));
                Integer num2 = (Integer) concurrentHashMap.get(Long.valueOf(vpVar2.x2.id));
                concurrentHashMap.put(Long.valueOf(vpVar2.x2.id), Integer.valueOf(Math.max((num2 != null ? num2 : 0).intValue(), vpVar2.x2.read_outbox_max_id)));
                vpVar2.Q.k(vpVar2.x2, j11);
                if (!tL_messages_peerDialogs.messages.isEmpty()) {
                    a0.h hVar2 = new a0.h();
                    a0.h hVar3 = new a0.h();
                    for (int i12 = 0; i12 < tL_messages_peerDialogs.users.size(); i12++) {
                        TLRPC.User user = tL_messages_peerDialogs.users.get(i12);
                        hVar2.k(user, user.id);
                    }
                    for (int i13 = 0; i13 < tL_messages_peerDialogs.chats.size(); i13++) {
                        TLRPC.Chat chat = tL_messages_peerDialogs.chats.get(i13);
                        hVar3.k(chat, chat.id);
                    }
                    jj jjVar = new jj(vpVar2.currentAccount, tL_messages_peerDialogs.messages.get(0), hVar2, hVar3, false, true);
                    ArrayList arrayList = (ArrayList) hVar.f(j11);
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    if (arrayList.size() > 0 && arrayList.get(0) != null && ((jj) arrayList.get(0)).z2() && ((jj) arrayList.get(0)).e1() != jjVar.e1()) {
                        arrayList.clear();
                    }
                    arrayList.add(jjVar);
                    hVar.k(arrayList, j11);
                    TLRPC.Dialog dialog4 = vpVar2.x2;
                    if (dialog4.last_message_date == 0) {
                        dialog4.last_message_date = jjVar.k.date;
                    }
                    vpVar2.t7.d(j11);
                }
                vpVar2.Q4(null);
                vpVar2.getNotificationCenter().k(3, Boolean.TRUE);
                return;
            case 2:
                l3 l3Var = (l3) obj3;
                jj jjVar2 = (jj) obj2;
                boolean g32 = jjVar2.g3();
                org.telegram.ui.un unVar = l3Var.a;
                th.r5.b(unVar.getCurrentAccount(), j11, jjVar2, (TL_stories.StoryItem) obj);
                ArrayList arrayList2 = new ArrayList();
                jjVar2.K1 = true;
                arrayList2.add(jjVar2);
                unVar.getMessagesStorage().a.c(new e4(15, l3Var, arrayList2));
                if (!g32 && jjVar2.g3() && jjVar2.D == 24) {
                    unVar.Nc(arrayList2, true);
                    return;
                } else {
                    unVar.Nc(arrayList2, false);
                    return;
                }
            case 3:
                l00.a((k00) obj2);
                ((ui) obj3).getNotificationCenter().k(55, Long.valueOf(j11), (ArrayList) obj, null);
                return;
            case 4:
                ((ui) obj3).getNotificationCenter().k(73, Long.valueOf(j11), (ArrayList) obj2, (ArrayList) obj);
                return;
            case 5:
                vp vpVar3 = (vp) obj3;
                TLObject tLObject = (TLObject) obj2;
                Runnable runnable = (Runnable) obj;
                if (tLObject != null) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    vpVar3.V3(groupcall.users, false);
                    vpVar3.P3(groupcall.chats, false);
                    u3 u3Var = new u3();
                    u3Var.u(vpVar3.getAccountInstance(), j11, groupcall);
                    vpVar3.m1.k(u3Var, groupcall.call.id);
                    vpVar3.n1.k(u3Var, j11);
                    vpVar3.getNotificationCenter().k(zs.w2, Long.valueOf(j11), Long.valueOf(groupcall.call.id), Boolean.FALSE);
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                vpVar3.t1.remove(Long.valueOf(j11));
                return;
            case 6:
                vp vpVar4 = (vp) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                vpVar4.a1.e(j11);
                if (arrayList3 != null) {
                    vpVar4.i5(0, -j11, arrayList3);
                    vpVar4.getNotificationCenter().k(3, new Object[0]);
                }
                vpVar4.getNotificationCenter().k(zs.t1, Long.valueOf(j11), Long.valueOf(tL_channels_channelParticipant.participant.inviter_id));
                return;
            case 7:
                vp vpVar5 = (vp) obj3;
                String str = (String) obj2;
                Runnable runnable2 = (Runnable) obj;
                TLRPC.Chat L02 = vpVar5.L0(Long.valueOf(j11));
                if (L02.usernames != null) {
                    for (int i14 = 0; i14 < L02.usernames.size(); i14++) {
                        TLRPC.TL_username tL_username = L02.usernames.get(i14);
                        if (tL_username != null && tL_username.editable) {
                            tL_username.username = str;
                            i10 = 1;
                            c10 = 0;
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(L02);
                            vpVar5.getMessagesStorage().m1(null, arrayList4, i10, i10);
                            zs notificationCenter = vpVar5.getNotificationCenter();
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
                    vpVar5.getMessagesStorage().m1(null, arrayList42, i10, i10);
                    zs notificationCenter2 = vpVar5.getNotificationCenter();
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
                vpVar5.getMessagesStorage().m1(null, arrayList422, i10, i10);
                zs notificationCenter22 = vpVar5.getNotificationCenter();
                Object[] objArr22 = new Object[i10];
                objArr22[c10] = Integer.valueOf(TLObject.FLAG_13);
                notificationCenter22.k(2, objArr22);
                runnable2.run();
                return;
            case 8:
                vp vpVar6 = (vp) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                SparseArray sparseArray = vpVar6.U;
                a0.h hVar4 = vpVar6.O1;
                ArrayList arrayList8 = (ArrayList) hVar4.f(j11);
                if (arrayList8 != null) {
                    arrayList8.removeAll(arrayList6);
                    if (arrayList8.isEmpty()) {
                        hVar4.l(j11);
                    }
                }
                ArrayList arrayList9 = (ArrayList) vpVar6.R.f(j11);
                if (arrayList9 != null) {
                    for (int i15 = 0; i15 < arrayList9.size(); i15++) {
                        jj jjVar3 = (jj) arrayList9.get(i15);
                        int i16 = 0;
                        while (true) {
                            if (i16 < arrayList7.size()) {
                                jj jjVar4 = (jj) arrayList7.get(i16);
                                if (jjVar3.f1() == jjVar4.f1()) {
                                    arrayList9.set(i15, jjVar4);
                                    if (jjVar4.k.peer_id.channel_id == 0) {
                                        jj jjVar5 = (jj) sparseArray.get(jjVar4.f1());
                                        sparseArray.remove(jjVar4.f1());
                                        if (jjVar5 != null) {
                                            sparseArray.put(jjVar5.f1(), jjVar5);
                                        }
                                    }
                                    vpVar6.getNotificationCenter().k(3, new Object[0]);
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                }
                vpVar6.getNotificationCenter().k(49, Long.valueOf(j11), arrayList7);
                return;
            case 9:
                ((hs) obj3).getMessagesController().L((TLRPC.TL_dialog) obj2, (TLRPC.InputPeer) obj, j11);
                return;
            case 10:
                hs hsVar = (hs) obj3;
                TLRPC.TL_messageReactions tL_messageReactions = (TLRPC.TL_messageReactions) obj2;
                TLRPC.TL_messageReactions tL_messageReactions2 = (TLRPC.TL_messageReactions) obj;
                a0.h hVar5 = new a0.h();
                a0.h hVar6 = new a0.h();
                if (tL_messageReactions.results != null && tL_messageReactions.reactions_as_tags) {
                    for (int i17 = 0; i17 < tL_messageReactions.results.size(); i17++) {
                        sg.o0 d = sg.o0.d(tL_messageReactions.results.get(i17).reaction);
                        hVar5.k(d, d.h);
                    }
                }
                if (tL_messageReactions2 != null && tL_messageReactions2.results != null && tL_messageReactions2.reactions_as_tags) {
                    for (int i18 = 0; i18 < tL_messageReactions2.results.size(); i18++) {
                        sg.o0 d10 = sg.o0.d(tL_messageReactions2.results.get(i18).reaction);
                        hVar6.k(d10, d10.h);
                    }
                }
                boolean z12 = false;
                for (int i19 = 0; i19 < hVar5.m(); i19++) {
                    long j13 = hVar5.j(i19);
                    sg.o0 o0Var = (sg.o0) hVar5.n(i19);
                    if (!hVar6.d(j13)) {
                        z12 = hsVar.getMessagesController().p5(j11, o0Var, false) || z12;
                    }
                }
                for (int i20 = 0; i20 < hVar6.m(); i20++) {
                    long j14 = hVar6.j(i20);
                    sg.o0 o0Var2 = (sg.o0) hVar6.n(i20);
                    if (!hVar5.d(j14)) {
                        z12 = hsVar.getMessagesController().p5(j11, o0Var2, true) || z12;
                    }
                }
                if (z12) {
                    if (j11 != 0) {
                        hsVar.getMessagesController().n5(0L);
                    }
                    hsVar.getMessagesController().n5(j11);
                    return;
                }
                return;
            case 11:
                hs hsVar2 = (hs) obj3;
                hsVar2.getFileLoader().g((ArrayList) obj2);
                hsVar2.getMessagesController().j3((ArrayList) obj, j11);
                return;
            case 12:
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                ((TLRPC.User[]) obj2)[0] = ((hs) obj3).j0(j11);
                return;
            case 13:
                SQLiteCursor sQLiteCursor5 = j11;
                hs hsVar3 = (hs) obj3;
                Boolean[] boolArr = (Boolean[]) obj2;
                CountDownLatch countDownLatch2 = (CountDownLatch) obj;
                hsVar3.getClass();
                try {
                    try {
                        sQLiteCursor = hsVar3.b.queryFinalized("SELECT date FROM dialogs WHERE did = " + ((long) sQLiteCursor5), new Object[0]);
                        try {
                            boolArr[0] = Boolean.valueOf(sQLiteCursor.next());
                            sQLiteCursor5 = sQLiteCursor;
                        } catch (Exception e) {
                            e = e;
                            hsVar3.o(e, true);
                            sQLiteCursor5 = sQLiteCursor;
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (sQLiteCursor5 != 0) {
                            sQLiteCursor5.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e7) {
                    e = e7;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor5 = 0;
                    if (sQLiteCursor5 != 0) {
                    }
                    throw th;
                }
                sQLiteCursor5.dispose();
                return;
            case 14:
                hs hsVar4 = (hs) obj3;
                Integer[] numArr = (Integer[]) obj2;
                CountDownLatch countDownLatch3 = (CountDownLatch) obj;
                hsVar4.getClass();
                try {
                    sQLiteCursor2 = hsVar4.b.queryFinalized("SELECT pts FROM dialogs WHERE did = " + (-j11), new Object[0]);
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
                            hsVar4.o(e, true);
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
                    hsVar4.o(e12, z10);
                    return;
                }
            case 15:
                CountDownLatch countDownLatch4 = (CountDownLatch) obj;
                ((TLRPC.Chat[]) obj2)[0] = ((hs) obj3).O(j11);
                return;
            case 16:
                hs hsVar5 = (hs) obj3;
                ArrayList arrayList10 = (ArrayList) obj2;
                CountDownLatch countDownLatch5 = (CountDownLatch) obj;
                hsVar5.getClass();
                try {
                    try {
                        ArrayList arrayList11 = new ArrayList();
                        ArrayList arrayList12 = new ArrayList();
                        hsVar5.V("" + j11, arrayList12, arrayList11);
                        if (!arrayList12.isEmpty() && !arrayList11.isEmpty()) {
                            ArrayList arrayList13 = new ArrayList();
                            hsVar5.n0(arrayList11, arrayList13, false);
                            if (!arrayList13.isEmpty()) {
                                arrayList10.add((TLObject) arrayList12.get(0));
                                arrayList10.add((TLObject) arrayList13.get(0));
                            }
                        }
                    } catch (Exception e13) {
                        hsVar5.o(e13, true);
                    }
                    return;
                } finally {
                    countDownLatch5.countDown();
                }
            case 17:
                a();
                return;
            case 18:
                b();
                return;
            default:
                gw gwVar = (gw) obj3;
                hs hsVar6 = (hs) obj2;
                ew ewVar = (ew) obj;
                SQLiteDatabase sQLiteDatabase = hsVar6.b;
                ArrayList arrayList14 = new ArrayList();
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                ArrayList arrayList17 = new ArrayList();
                ArrayList arrayList18 = new ArrayList();
                ArrayList arrayList19 = new ArrayList();
                ArrayList arrayList20 = new ArrayList();
                try {
                    int i21 = 0;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT did, date, last_mid, pinned, flags, folder_id, last_mid_group, count, unread_count, max_read_id, read_outbox FROM saved_dialogs WHERE forumChatId = ? ORDER BY pinned ASC, date DESC", 0);
                    sQLiteCursor4 = null;
                    while (queryFinalized2.next()) {
                        try {
                            fwVar = new fw();
                            j10 = j11;
                            fwVar.a = queryFinalized2.longValue(i21);
                            fwVar.j = queryFinalized2.intValue(1);
                            fwVar.c = queryFinalized2.intValue(2);
                            fwVar.k = queryFinalized2.intValue(3);
                            fwVar.i = (queryFinalized2.intValue(4) & 1) != 0;
                            fwVar.b = fwVar.k != 999;
                            fwVar.e = queryFinalized2.intValue(7);
                            fwVar.f = queryFinalized2.longValue(8);
                            fwVar.g = queryFinalized2.longValue(9);
                            fwVar.h = queryFinalized2.longValue(10);
                            long j15 = fwVar.a;
                            if (j15 < 0) {
                                arrayList16.add(Long.valueOf(-j15));
                            } else {
                                arrayList15.add(Long.valueOf(j15));
                            }
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT data FROM messages_topics WHERE uid = ? AND mid = ? AND topic_id = ?", Long.valueOf(j10), Integer.valueOf(fwVar.c), Long.valueOf(fwVar.a));
                        } catch (Exception e14) {
                            e = e14;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                        try {
                            if (queryFinalized.next()) {
                                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                                hs.e(TLdeserialize, arrayList15, arrayList16, arrayList17);
                                fwVar.d = new jj(gwVar.a, TLdeserialize, null, null, null, null, null, false, false, 0L, false, false, true, 0);
                            }
                            queryFinalized.dispose();
                            arrayList14.add(fwVar);
                            sQLiteCursor4 = queryFinalized;
                            j11 = j10;
                            i21 = 0;
                        } catch (Exception e15) {
                            e = e15;
                            sQLiteCursor4 = queryFinalized;
                            sQLiteCursor3 = queryFinalized2;
                            z11 = true;
                            try {
                                f8.g(e, z11);
                                if (sQLiteCursor3 != null) {
                                    sQLiteCursor3.dispose();
                                    break;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                if (sQLiteCursor3 != null) {
                                    sQLiteCursor3.dispose();
                                }
                                if (sQLiteCursor4 != null) {
                                    sQLiteCursor4.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            sQLiteCursor4 = queryFinalized;
                            sQLiteCursor3 = queryFinalized2;
                            if (sQLiteCursor3 != null) {
                            }
                            if (sQLiteCursor4 != null) {
                            }
                            throw th;
                        }
                    }
                    if (!arrayList15.isEmpty()) {
                        hsVar6.n0(arrayList15, arrayList18, false);
                    }
                    if (!arrayList16.isEmpty()) {
                        hsVar6.Q(TextUtils.join(",", arrayList16), arrayList19);
                    }
                    if (!arrayList17.isEmpty()) {
                        hsVar6.L(TextUtils.join(",", arrayList17), arrayList20);
                    }
                    queryFinalized2.dispose();
                    break;
                } catch (Exception e16) {
                    e = e16;
                    sQLiteCursor3 = null;
                    z11 = true;
                    sQLiteCursor4 = null;
                } catch (Throwable th9) {
                    th = th9;
                    sQLiteCursor3 = null;
                    sQLiteCursor4 = null;
                }
                break;
        }
    }

    public /* synthetic */ wm(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = j10;
    }

    public /* synthetic */ wm(f1 f1Var, long j10, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = f1Var;
        this.c = j10;
        this.d = obj;
        this.e = obj2;
    }
}
