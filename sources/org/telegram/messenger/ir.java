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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ir implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ ir(int i10, long j10, long j11, hs hsVar) {
        this.a = 2;
        this.b = hsVar;
        this.d = j10;
        this.c = i10;
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
        hs hsVar = this.b;
        hsVar.getClass();
        try {
            try {
                SparseArray sparseArray = new SparseArray();
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    j10 = this.d;
                    if (i11 >= 2) {
                        break;
                    }
                    int i12 = this.c;
                    if (i12 != 0) {
                        if (i11 == 0) {
                            sQLiteCursor2 = hsVar.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j10 + " AND mid = " + i12, new Object[i10]);
                        } else {
                            sQLiteCursor2 = hsVar.b.queryFinalized("SELECT data FROM messages_topics WHERE uid = " + j10 + " AND mid = " + i12, new Object[i10]);
                        }
                    } else if (i11 == 0) {
                        sQLiteCursor2 = hsVar.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j10 + " ORDER BY mid DESC LIMIT 500", new Object[i10]);
                    } else {
                        sQLiteCursor2 = hsVar.b.queryFinalized("SELECT data FROM messages_topics WHERE uid = " + j10 + " ORDER BY mid DESC LIMIT 500", new Object[i10]);
                    }
                    try {
                        try {
                            ArrayList arrayList = new ArrayList();
                            ?? r02 = i10;
                            while (sQLiteCursor2.next()) {
                                try {
                                    NativeByteBuffer byteBufferValue = sQLiteCursor2.byteBufferValue(r02);
                                    if (byteBufferValue != 0) {
                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r02), r02);
                                        if (TLdeserialize != null) {
                                            TLdeserialize.readAttachPath(byteBufferValue, hsVar.getUserConfig().n);
                                            TLRPC.TL_messageReactions tL_messageReactions = TLdeserialize.reactions;
                                            if (tL_messageReactions == null || tL_messageReactions.recent_reactions == null) {
                                                z12 = false;
                                            } else {
                                                boolean z13 = r02;
                                                z12 = z13;
                                                int i13 = z13;
                                                while (i13 < TLdeserialize.reactions.recent_reactions.size()) {
                                                    TLRPC.MessagePeerReaction messagePeerReaction = TLdeserialize.reactions.recent_reactions.get(i13);
                                                    boolean z14 = true;
                                                    if (jj.C1(messagePeerReaction.peer_id) == this.e) {
                                                        try {
                                                            TLdeserialize.reactions.recent_reactions.remove(i13);
                                                            i13--;
                                                            if (TLdeserialize.reactions.results != null) {
                                                                int i14 = 0;
                                                                while (i14 < TLdeserialize.reactions.results.size()) {
                                                                    TLRPC.ReactionCount reactionCount = TLdeserialize.reactions.results.get(i14);
                                                                    z11 = z14;
                                                                    try {
                                                                        if (sg.q0.c(messagePeerReaction.reaction, reactionCount.reaction)) {
                                                                            int i15 = reactionCount.count - 1;
                                                                            reactionCount.count = i15;
                                                                            if (i15 <= 0) {
                                                                                TLdeserialize.reactions.results.remove(i14);
                                                                                i14--;
                                                                            }
                                                                        }
                                                                        i14++;
                                                                        z14 = z11;
                                                                    } catch (Exception e) {
                                                                        e = e;
                                                                        sQLiteCursor = sQLiteCursor2;
                                                                        z10 = z11;
                                                                        sQLitePreparedStatement = null;
                                                                        try {
                                                                            hsVar.o(e, z10);
                                                                            sQLiteDatabase2 = hsVar.b;
                                                                            if (sQLiteDatabase2 != null) {
                                                                            }
                                                                            if (sQLiteCursor != null) {
                                                                            }
                                                                            if (sQLitePreparedStatement != null) {
                                                                            }
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            sQLiteDatabase = hsVar.b;
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
                                                        } catch (Exception e7) {
                                                            e = e7;
                                                            z11 = true;
                                                        }
                                                    }
                                                    i13++;
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
                                } catch (Exception e10) {
                                    e = e10;
                                    z11 = true;
                                }
                            }
                            boolean z15 = true;
                            sQLiteCursor2.dispose();
                            if (!arrayList.isEmpty()) {
                                hsVar.b.beginTransaction();
                                int size = arrayList.size();
                                int i16 = 0;
                                while (i16 < size) {
                                    Object obj = arrayList.get(i16);
                                    i16++;
                                    TLRPC.Message message = (TLRPC.Message) obj;
                                    if (i11 == 0) {
                                        try {
                                            executeFast = hsVar.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                                        } catch (Exception e11) {
                                            e = e11;
                                            z10 = z15;
                                            sQLiteCursor = null;
                                            sQLitePreparedStatement = null;
                                            hsVar.o(e, z10);
                                            sQLiteDatabase2 = hsVar.b;
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
                                        executeFast = hsVar.b.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                                    }
                                    SQLitePreparedStatement sQLitePreparedStatement2 = executeFast;
                                    try {
                                        jj.q5(message);
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
                                    } catch (Exception e12) {
                                        e = e12;
                                        sQLitePreparedStatement = sQLitePreparedStatement2;
                                        z10 = true;
                                        sQLiteCursor = null;
                                        hsVar.o(e, z10);
                                        sQLiteDatabase2 = hsVar.b;
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
                                        sQLiteDatabase = hsVar.b;
                                        if (sQLiteDatabase != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        throw th;
                                    }
                                }
                                hsVar.b.commitTransaction();
                            }
                            i11++;
                            i10 = 0;
                        } catch (Exception e13) {
                            e = e13;
                            sQLiteCursor = sQLiteCursor2;
                            z10 = true;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        sQLiteCursor = sQLiteCursor2;
                        sQLitePreparedStatement = null;
                        sQLiteDatabase = hsVar.b;
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
                i0.g3(new d4(hsVar, sparseArray, j10, 27));
                SQLiteDatabase sQLiteDatabase3 = hsVar.b;
                if (sQLiteDatabase3 != null) {
                    sQLiteDatabase3.commitTransaction();
                }
            } catch (Exception e14) {
                e = e14;
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
                hs hsVar = this.b;
                int i10 = this.c;
                long j10 = this.d;
                long j11 = this.e;
                try {
                    SQLiteDatabase sQLiteDatabase = hsVar.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE messages_v2 SET read_state = read_state | 2 WHERE mid = " + i10 + " AND uid = " + j10).stepThis().dispose();
                    SQLiteDatabase sQLiteDatabase2 = hsVar.b;
                    StringBuilder sb2 = new StringBuilder("SELECT unread_count_i FROM dialogs WHERE did = ");
                    sb2.append(j11);
                    ?? queryFinalized = sQLiteDatabase2.queryFinalized(sb2.toString(), new Object[0]);
                    try {
                        try {
                            if (queryFinalized.next()) {
                                try {
                                    max = Math.max(0, queryFinalized.intValue(0) - 1);
                                } catch (Exception e) {
                                    e = e;
                                    r15 = queryFinalized;
                                    z10 = true;
                                    try {
                                        hsVar.o(e, z10);
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
                            hsVar.b.executeFast("UPDATE dialogs SET unread_count_i = " + max + " WHERE did = " + j11).stepThis().dispose();
                            LongSparseIntArray longSparseIntArray3 = new LongSparseIntArray(1);
                            longSparseIntArray3.put(j11, max);
                            if (max == 0) {
                                longSparseIntArray = null;
                                try {
                                    hsVar.W1(null, longSparseIntArray3, true);
                                } catch (Exception e7) {
                                    e = e7;
                                    longSparseIntArray2 = longSparseIntArray;
                                    z10 = true;
                                    r15 = longSparseIntArray2;
                                    hsVar.o(e, z10);
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
                            hsVar.getMessagesController().E3(longSparseIntArray, longSparseIntArray3);
                            hsVar.b.executeFast("UPDATE messages_topics SET read_state = read_state | 2 WHERE mid = " + i10 + " AND uid = " + j10).stepThis().dispose();
                            SQLiteCursor queryFinalized2 = hsVar.b.queryFinalized("SELECT data FROM messages_topics WHERE mid = " + i10 + " AND uid = " + j10, new Object[0]);
                            long j12 = 0;
                            while (queryFinalized2.next()) {
                                NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(0);
                                if (byteBufferValue != null) {
                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    byteBufferValue.reuse();
                                    j12 = jj.a2(hsVar.currentAccount, TLdeserialize, hsVar.Z(j10));
                                }
                            }
                            queryFinalized2.dispose();
                            if (j12 != 0) {
                                SQLiteDatabase sQLiteDatabase3 = hsVar.b;
                                Locale locale2 = Locale.US;
                                queryFinalized = sQLiteDatabase3.queryFinalized("SELECT unread_mentions FROM topics WHERE did = " + j11 + " AND topic_id = " + j12, new Object[0]);
                                int max2 = queryFinalized.next() ? Math.max(0, queryFinalized.intValue(0) - 1) : 0;
                                queryFinalized.dispose();
                                hsVar.b.executeFast("UPDATE topics SET unread_mentions = " + max2 + " WHERE did = " + j10 + " AND topic_id = " + j12).stepThis().dispose();
                                x00 x00Var = hsVar.getMessagesController().r7;
                                x00Var.getClass();
                                i0.g3(new lb(x00Var, j10, j12, max2, 2));
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
                    } catch (Exception e10) {
                        e = e10;
                        longSparseIntArray2 = queryFinalized;
                        z10 = true;
                        r15 = longSparseIntArray2;
                        hsVar.o(e, z10);
                        if (r15 != 0) {
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    longSparseIntArray = null;
                } catch (Throwable th5) {
                    th = th5;
                    longSparseIntArray = null;
                }
            case 1:
                a();
                return;
            case 2:
                this.b.getMessagesController().I0(this.d, this.c, this.e, null);
                return;
            case 3:
                this.b.getMessagesController().p0(this.d, this.c, this.e);
                return;
            case 4:
                int i11 = this.c;
                long j13 = this.d;
                long j14 = this.e;
                hs hsVar2 = this.b;
                hsVar2.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = hsVar2.b.executeFast("UPDATE messages_topics SET topic_id = ? WHERE uid = ? AND mid = ?");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindLong(1, i11);
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
                } catch (Exception e12) {
                    hsVar2.o(e12, true);
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
                hs hsVar3 = this.b;
                long j16 = this.e;
                int i12 = this.c;
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        if (j15 != 0) {
                            SQLiteDatabase sQLiteDatabase4 = hsVar3.b;
                            Locale locale3 = Locale.US;
                            sQLiteDatabase4.executeFast("UPDATE topics SET unread_mentions = " + i12 + " WHERE did = " + j16 + " AND topic_id = " + j15).stepThis().dispose();
                            v00 v00Var = new v00();
                            v00Var.b = j16;
                            v00Var.c = j15;
                            v00Var.j = true;
                            v00Var.d = i12;
                            v00Var.e = -1;
                            x00 x00Var2 = hsVar3.getMessagesController().r7;
                            List singletonList = Collections.singletonList(v00Var);
                            x00Var2.getClass();
                            i0.g3(new e4(11, x00Var2, singletonList));
                            return;
                        }
                        SQLiteCursor queryFinalized3 = hsVar3.b.queryFinalized("SELECT unread_count_i FROM dialogs WHERE did = " + j16, new Object[0]);
                        try {
                            int intValue = queryFinalized3.next() ? queryFinalized3.intValue(0) : 0;
                            queryFinalized3.dispose();
                            if (intValue == 0 && i12 == 0) {
                                return;
                            }
                            if (i12 == 0) {
                                SQLiteDatabase sQLiteDatabase5 = hsVar3.b;
                                Locale locale4 = Locale.US;
                                sQLiteDatabase5.executeFast("UPDATE messages_v2 SET read_state = read_state | 2 WHERE uid = " + j16 + " AND mention = 1 AND read_state IN(0, 1)").stepThis().dispose();
                            }
                            SQLiteDatabase sQLiteDatabase6 = hsVar3.b;
                            Locale locale5 = Locale.US;
                            sQLiteDatabase6.executeFast("UPDATE dialogs SET unread_count_i = " + i12 + " WHERE did = " + j16).stepThis().dispose();
                            LongSparseIntArray longSparseIntArray4 = new LongSparseIntArray(1);
                            longSparseIntArray4.put(j16, i12);
                            hsVar3.getMessagesController().E3(null, longSparseIntArray4);
                            if (i12 == 0) {
                                hsVar3.W1(null, longSparseIntArray4, true);
                                return;
                            }
                            return;
                        } catch (Exception e13) {
                            e = e13;
                            sQLiteCursor = queryFinalized3;
                            hsVar3.o(e, true);
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
                    } catch (Exception e14) {
                        e = e14;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
        }
    }

    public /* synthetic */ ir(hs hsVar, int i10, long j10, long j11, int i11) {
        this.a = i11;
        this.b = hsVar;
        this.c = i10;
        this.d = j10;
        this.e = j11;
    }

    public /* synthetic */ ir(hs hsVar, long j10, long j11, int i10, int i11) {
        this.a = i11;
        this.b = hsVar;
        this.d = j10;
        this.e = j11;
        this.c = i10;
    }
}
