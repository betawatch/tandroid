package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class qq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ qq(int i3, long j10, long j11, qr qrVar) {
        this.a = 2;
        this.b = qrVar;
        this.d = j10;
        this.c = i3;
        this.e = j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022a  */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        SQLiteCursor sQLiteCursor;
        boolean z10;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        long j10;
        SQLiteCursor sQLiteCursor2;
        SQLitePreparedStatement executeFast;
        boolean z11;
        boolean z12;
        qr qrVar = this.b;
        qrVar.getClass();
        try {
            try {
                SparseArray sparseArray = new SparseArray();
                int i3 = 0;
                int i10 = 0;
                while (true) {
                    j10 = this.d;
                    if (i10 >= 2) {
                        break;
                    }
                    int i11 = this.c;
                    if (i11 != 0) {
                        if (i10 == 0) {
                            sQLiteCursor2 = qrVar.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j10 + " AND mid = " + i11, new Object[i3]);
                        } else {
                            sQLiteCursor2 = qrVar.b.queryFinalized("SELECT data FROM messages_topics WHERE uid = " + j10 + " AND mid = " + i11, new Object[i3]);
                        }
                    } else if (i10 == 0) {
                        sQLiteCursor2 = qrVar.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j10 + " ORDER BY mid DESC LIMIT 500", new Object[i3]);
                    } else {
                        sQLiteCursor2 = qrVar.b.queryFinalized("SELECT data FROM messages_topics WHERE uid = " + j10 + " ORDER BY mid DESC LIMIT 500", new Object[i3]);
                    }
                    try {
                        try {
                            ArrayList arrayList = new ArrayList();
                            ?? r02 = i3;
                            while (sQLiteCursor2.next()) {
                                try {
                                    NativeByteBuffer byteBufferValue = sQLiteCursor2.byteBufferValue(r02);
                                    if (byteBufferValue != 0) {
                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r02), r02);
                                        if (TLdeserialize != null) {
                                            TLdeserialize.readAttachPath(byteBufferValue, qrVar.getUserConfig().n);
                                            TLRPC.TL_messageReactions tL_messageReactions = TLdeserialize.reactions;
                                            if (tL_messageReactions == null || tL_messageReactions.recent_reactions == null) {
                                                z12 = false;
                                            } else {
                                                boolean z13 = r02;
                                                z12 = z13;
                                                int i12 = z13;
                                                while (i12 < TLdeserialize.reactions.recent_reactions.size()) {
                                                    TLRPC.MessagePeerReaction messagePeerReaction = TLdeserialize.reactions.recent_reactions.get(i12);
                                                    boolean z14 = true;
                                                    if (zi.C1(messagePeerReaction.peer_id) == this.e) {
                                                        try {
                                                            TLdeserialize.reactions.recent_reactions.remove(i12);
                                                            i12--;
                                                            if (TLdeserialize.reactions.results != null) {
                                                                int i13 = 0;
                                                                while (i13 < TLdeserialize.reactions.results.size()) {
                                                                    TLRPC.ReactionCount reactionCount = TLdeserialize.reactions.results.get(i13);
                                                                    z11 = z14;
                                                                    try {
                                                                        if (dh.p0.d(messagePeerReaction.reaction, reactionCount.reaction)) {
                                                                            int i14 = reactionCount.count - 1;
                                                                            reactionCount.count = i14;
                                                                            if (i14 <= 0) {
                                                                                TLdeserialize.reactions.results.remove(i13);
                                                                                i13--;
                                                                            }
                                                                        }
                                                                        i13++;
                                                                        z14 = z11;
                                                                    } catch (Exception e10) {
                                                                        e = e10;
                                                                        sQLiteCursor = sQLiteCursor2;
                                                                        z10 = z11;
                                                                        sQLitePreparedStatement = null;
                                                                        try {
                                                                            qrVar.o(e, z10);
                                                                            sQLiteDatabase2 = qrVar.b;
                                                                            if (sQLiteDatabase2 != null) {
                                                                            }
                                                                            if (sQLiteCursor != null) {
                                                                            }
                                                                            if (sQLitePreparedStatement != null) {
                                                                            }
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            sQLiteDatabase = qrVar.b;
                                                                            if (sQLiteDatabase != null) {
                                                                            }
                                                                            if (sQLiteCursor != null) {
                                                                            }
                                                                            if (sQLitePreparedStatement != null) {
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            z12 = z14;
                                                        } catch (Exception e11) {
                                                            e = e11;
                                                            z11 = true;
                                                        }
                                                    }
                                                    i12++;
                                                }
                                            }
                                            if (z12) {
                                                arrayList.add(TLdeserialize);
                                                sparseArray.put(TLdeserialize.id, TLdeserialize.reactions);
                                            }
                                        }
                                        byteBufferValue.reuse();
                                    }
                                    r02 = 0;
                                } catch (Exception e12) {
                                    e = e12;
                                    z11 = true;
                                }
                            }
                            boolean z15 = true;
                            sQLiteCursor2.dispose();
                            if (!arrayList.isEmpty()) {
                                qrVar.b.beginTransaction();
                                int size = arrayList.size();
                                int i15 = 0;
                                while (i15 < size) {
                                    Object obj = arrayList.get(i15);
                                    i15++;
                                    TLRPC.Message message = (TLRPC.Message) obj;
                                    if (i10 == 0) {
                                        try {
                                            executeFast = qrVar.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                                        } catch (Exception e13) {
                                            e = e13;
                                            z10 = z15;
                                            sQLiteCursor = null;
                                            sQLitePreparedStatement = null;
                                            qrVar.o(e, z10);
                                            sQLiteDatabase2 = qrVar.b;
                                            if (sQLiteDatabase2 != null) {
                                                sQLiteDatabase2.commitTransaction();
                                            }
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            if (sQLitePreparedStatement != null) {
                                                sQLitePreparedStatement.dispose();
                                                return;
                                            }
                                            return;
                                        }
                                    } else {
                                        executeFast = qrVar.b.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                                    }
                                    SQLitePreparedStatement sQLitePreparedStatement2 = executeFast;
                                    try {
                                        zi.r5(message);
                                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                                        message.serializeToStream(nativeByteBuffer);
                                        sQLitePreparedStatement2.requery();
                                        sQLitePreparedStatement2.bindByteBuffer(z15 ? 1 : 0, nativeByteBuffer);
                                        sQLitePreparedStatement2.bindInteger(2, message.id);
                                        sQLitePreparedStatement2.bindLong(3, j10);
                                        sQLitePreparedStatement2.step();
                                        nativeByteBuffer.reuse();
                                        sQLitePreparedStatement2.dispose();
                                        z15 = true;
                                    } catch (Exception e14) {
                                        e = e14;
                                        sQLitePreparedStatement = sQLitePreparedStatement2;
                                        z10 = true;
                                        sQLiteCursor = null;
                                        qrVar.o(e, z10);
                                        sQLiteDatabase2 = qrVar.b;
                                        if (sQLiteDatabase2 != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        if (sQLitePreparedStatement != null) {
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        sQLitePreparedStatement = sQLitePreparedStatement2;
                                        sQLiteCursor = null;
                                        sQLiteDatabase = qrVar.b;
                                        if (sQLiteDatabase != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        throw th;
                                    }
                                }
                                qrVar.b.commitTransaction();
                            }
                            i10++;
                            i3 = 0;
                        } catch (Exception e15) {
                            e = e15;
                            sQLiteCursor = sQLiteCursor2;
                            z10 = true;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        sQLiteCursor = sQLiteCursor2;
                        sQLitePreparedStatement = null;
                        sQLiteDatabase = qrVar.b;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                }
                g0.h3(new a4(qrVar, sparseArray, j10, 27));
                SQLiteDatabase sQLiteDatabase3 = qrVar.b;
                if (sQLiteDatabase3 != null) {
                    sQLiteDatabase3.commitTransaction();
                }
            } catch (Exception e16) {
                e = e16;
                z10 = true;
            }
        } catch (Throwable th5) {
            th = th5;
            sQLiteCursor = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0339  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v2, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v21, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r1v6, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        LongSparseIntArray longSparseIntArray;
        ?? r15;
        boolean z10;
        LongSparseIntArray longSparseIntArray2;
        int max;
        switch (this.a) {
            case 0:
                qr qrVar = this.b;
                int i3 = this.c;
                long j10 = this.d;
                long j11 = this.e;
                try {
                    SQLiteDatabase sQLiteDatabase = qrVar.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE messages_v2 SET read_state = read_state | 2 WHERE mid = " + i3 + " AND uid = " + j10).stepThis().dispose();
                    SQLiteDatabase sQLiteDatabase2 = qrVar.b;
                    StringBuilder sb2 = new StringBuilder("SELECT unread_count_i FROM dialogs WHERE did = ");
                    sb2.append(j11);
                    ?? queryFinalized = sQLiteDatabase2.queryFinalized(sb2.toString(), new Object[0]);
                    try {
                        try {
                            if (queryFinalized.next()) {
                                try {
                                    max = Math.max(0, queryFinalized.intValue(0) - 1);
                                } catch (Exception e10) {
                                    e = e10;
                                    r15 = queryFinalized;
                                    z10 = true;
                                    try {
                                        qrVar.o(e, z10);
                                        if (r15 != 0) {
                                            r15.dispose();
                                            return;
                                        }
                                        return;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (r15 != 0) {
                                            r15.dispose();
                                        }
                                        throw th;
                                    }
                                }
                            } else {
                                max = 0;
                            }
                            queryFinalized.dispose();
                            qrVar.b.executeFast("UPDATE dialogs SET unread_count_i = " + max + " WHERE did = " + j11).stepThis().dispose();
                            LongSparseIntArray longSparseIntArray3 = new LongSparseIntArray(1);
                            longSparseIntArray3.put(j11, max);
                            if (max == 0) {
                                longSparseIntArray = null;
                                try {
                                    qrVar.W1(null, longSparseIntArray3, true);
                                } catch (Exception e11) {
                                    e = e11;
                                    longSparseIntArray2 = longSparseIntArray;
                                    z10 = true;
                                    r15 = longSparseIntArray2;
                                    qrVar.o(e, z10);
                                    if (r15 != 0) {
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    r15 = longSparseIntArray;
                                    if (r15 != 0) {
                                    }
                                    throw th;
                                }
                            } else {
                                longSparseIntArray = null;
                            }
                            qrVar.getMessagesController().H3(longSparseIntArray, longSparseIntArray3);
                            qrVar.b.executeFast("UPDATE messages_topics SET read_state = read_state | 2 WHERE mid = " + i3 + " AND uid = " + j10).stepThis().dispose();
                            SQLiteCursor queryFinalized2 = qrVar.b.queryFinalized("SELECT data FROM messages_topics WHERE mid = " + i3 + " AND uid = " + j10, new Object[0]);
                            long j12 = 0;
                            while (queryFinalized2.next()) {
                                NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(0);
                                if (byteBufferValue != null) {
                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    byteBufferValue.reuse();
                                    j12 = zi.a2(qrVar.currentAccount, TLdeserialize, qrVar.Z(j10));
                                }
                            }
                            queryFinalized2.dispose();
                            if (j12 != 0) {
                                SQLiteDatabase sQLiteDatabase3 = qrVar.b;
                                Locale locale2 = Locale.US;
                                queryFinalized = sQLiteDatabase3.queryFinalized("SELECT unread_mentions FROM topics WHERE did = " + j11 + " AND topic_id = " + j12, new Object[0]);
                                int max2 = queryFinalized.next() ? Math.max(0, queryFinalized.intValue(0) - 1) : 0;
                                queryFinalized.dispose();
                                qrVar.b.executeFast("UPDATE topics SET unread_mentions = " + max2 + " WHERE did = " + j10 + " AND topic_id = " + j12).stepThis().dispose();
                                c00 c00Var = qrVar.getMessagesController().q7;
                                c00Var.getClass();
                                g0.h3(new eb(c00Var, j10, j12, max2, 2));
                                return;
                            }
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            r15 = queryFinalized;
                            if (r15 != 0) {
                            }
                            throw th;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        longSparseIntArray2 = queryFinalized;
                        z10 = true;
                        r15 = longSparseIntArray2;
                        qrVar.o(e, z10);
                        if (r15 != 0) {
                        }
                    }
                } catch (Exception e13) {
                    e = e13;
                    longSparseIntArray = null;
                } catch (Throwable th5) {
                    th = th5;
                    longSparseIntArray = null;
                }
            case 1:
                a();
                return;
            case 2:
                this.b.getMessagesController().J0(this.d, this.c, this.e, null);
                return;
            case 3:
                this.b.getMessagesController().p0(this.d, this.c, this.e);
                return;
            case 4:
                int i10 = this.c;
                long j13 = this.d;
                long j14 = this.e;
                qr qrVar2 = this.b;
                qrVar2.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = qrVar2.b.executeFast("UPDATE messages_topics SET topic_id = ? WHERE uid = ? AND mid = ?");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindLong(1, i10);
                        sQLitePreparedStatement.bindLong(2, j13);
                        sQLitePreparedStatement.bindLong(3, j14);
                        sQLitePreparedStatement.step();
                        sQLitePreparedStatement.dispose();
                    } catch (Throwable th6) {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th6;
                    }
                } catch (Exception e14) {
                    qrVar2.o(e14, true);
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                }
                return;
            case 5:
                this.b.O0("poll_votes_mentions", "poll_votes_mentions_topics", this.d, this.e, this.c, false);
                return;
            case 6:
                this.b.O0("reaction_mentions", "reaction_mentions_topics", this.d, this.e, this.c, true);
                return;
            default:
                long j15 = this.d;
                qr qrVar3 = this.b;
                long j16 = this.e;
                int i11 = this.c;
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        if (j15 != 0) {
                            SQLiteDatabase sQLiteDatabase4 = qrVar3.b;
                            Locale locale3 = Locale.US;
                            sQLiteDatabase4.executeFast("UPDATE topics SET unread_mentions = " + i11 + " WHERE did = " + j16 + " AND topic_id = " + j15).stepThis().dispose();
                            a00 a00Var = new a00();
                            a00Var.b = j16;
                            a00Var.c = j15;
                            a00Var.j = true;
                            a00Var.d = i11;
                            a00Var.e = -1;
                            c00 c00Var2 = qrVar3.getMessagesController().q7;
                            List singletonList = Collections.singletonList(a00Var);
                            c00Var2.getClass();
                            g0.h3(new b4(13, c00Var2, singletonList));
                            return;
                        }
                        SQLiteCursor queryFinalized3 = qrVar3.b.queryFinalized("SELECT unread_count_i FROM dialogs WHERE did = " + j16, new Object[0]);
                        try {
                            int intValue = queryFinalized3.next() ? queryFinalized3.intValue(0) : 0;
                            queryFinalized3.dispose();
                            if (intValue == 0 && i11 == 0) {
                                return;
                            }
                            if (i11 == 0) {
                                SQLiteDatabase sQLiteDatabase5 = qrVar3.b;
                                Locale locale4 = Locale.US;
                                sQLiteDatabase5.executeFast("UPDATE messages_v2 SET read_state = read_state | 2 WHERE uid = " + j16 + " AND mention = 1 AND read_state IN(0, 1)").stepThis().dispose();
                            }
                            SQLiteDatabase sQLiteDatabase6 = qrVar3.b;
                            Locale locale5 = Locale.US;
                            sQLiteDatabase6.executeFast("UPDATE dialogs SET unread_count_i = " + i11 + " WHERE did = " + j16).stepThis().dispose();
                            LongSparseIntArray longSparseIntArray4 = new LongSparseIntArray(1);
                            longSparseIntArray4.put(j16, i11);
                            qrVar3.getMessagesController().H3(null, longSparseIntArray4);
                            if (i11 == 0) {
                                qrVar3.W1(null, longSparseIntArray4, true);
                                return;
                            }
                            return;
                        } catch (Exception e15) {
                            e = e15;
                            sQLiteCursor = queryFinalized3;
                            qrVar3.o(e, true);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th7) {
                            th = th7;
                            sQLiteCursor = queryFinalized3;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    } catch (Exception e16) {
                        e = e16;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
        }
    }

    public /* synthetic */ qq(qr qrVar, int i3, long j10, long j11, int i10) {
        this.a = i10;
        this.b = qrVar;
        this.c = i3;
        this.d = j10;
        this.e = j11;
    }

    public /* synthetic */ qq(qr qrVar, long j10, long j11, int i3, int i10) {
        this.a = i10;
        this.b = qrVar;
        this.d = j10;
        this.e = j11;
        this.c = i3;
    }
}
