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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class zq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ zq(int i7, long j3, long j10, yr yrVar) {
        this.a = 2;
        this.b = yrVar;
        this.d = j3;
        this.c = i7;
        this.e = j10;
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
        boolean z9;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        long j3;
        SQLiteCursor sQLiteCursor2;
        SQLitePreparedStatement executeFast;
        boolean z10;
        boolean z11;
        yr yrVar = this.b;
        yrVar.getClass();
        try {
            try {
                SparseArray sparseArray = new SparseArray();
                int i7 = 0;
                int i10 = 0;
                while (true) {
                    j3 = this.d;
                    if (i10 >= 2) {
                        break;
                    }
                    int i11 = this.c;
                    if (i11 != 0) {
                        if (i10 == 0) {
                            sQLiteCursor2 = yrVar.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j3 + " AND mid = " + i11, new Object[i7]);
                        } else {
                            sQLiteCursor2 = yrVar.b.queryFinalized("SELECT data FROM messages_topics WHERE uid = " + j3 + " AND mid = " + i11, new Object[i7]);
                        }
                    } else if (i10 == 0) {
                        sQLiteCursor2 = yrVar.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j3 + " ORDER BY mid DESC LIMIT 500", new Object[i7]);
                    } else {
                        sQLiteCursor2 = yrVar.b.queryFinalized("SELECT data FROM messages_topics WHERE uid = " + j3 + " ORDER BY mid DESC LIMIT 500", new Object[i7]);
                    }
                    try {
                        try {
                            ArrayList arrayList = new ArrayList();
                            ?? r02 = i7;
                            while (sQLiteCursor2.next()) {
                                try {
                                    NativeByteBuffer byteBufferValue = sQLiteCursor2.byteBufferValue(r02);
                                    if (byteBufferValue != 0) {
                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r02), r02);
                                        if (TLdeserialize != null) {
                                            TLdeserialize.readAttachPath(byteBufferValue, yrVar.getUserConfig().n);
                                            TLRPC.TL_messageReactions tL_messageReactions = TLdeserialize.reactions;
                                            if (tL_messageReactions == null || tL_messageReactions.recent_reactions == null) {
                                                z11 = false;
                                            } else {
                                                boolean z12 = r02;
                                                z11 = z12;
                                                int i12 = z12;
                                                while (i12 < TLdeserialize.reactions.recent_reactions.size()) {
                                                    TLRPC.MessagePeerReaction messagePeerReaction = TLdeserialize.reactions.recent_reactions.get(i12);
                                                    boolean z13 = true;
                                                    if (ij.C1(messagePeerReaction.peer_id) == this.e) {
                                                        try {
                                                            TLdeserialize.reactions.recent_reactions.remove(i12);
                                                            i12--;
                                                            if (TLdeserialize.reactions.results != null) {
                                                                int i13 = 0;
                                                                while (i13 < TLdeserialize.reactions.results.size()) {
                                                                    TLRPC.ReactionCount reactionCount = TLdeserialize.reactions.results.get(i13);
                                                                    z10 = z13;
                                                                    try {
                                                                        if (ch.q0.d(messagePeerReaction.reaction, reactionCount.reaction)) {
                                                                            int i14 = reactionCount.count - 1;
                                                                            reactionCount.count = i14;
                                                                            if (i14 <= 0) {
                                                                                TLdeserialize.reactions.results.remove(i13);
                                                                                i13--;
                                                                            }
                                                                        }
                                                                        i13++;
                                                                        z13 = z10;
                                                                    } catch (Exception e10) {
                                                                        e = e10;
                                                                        sQLiteCursor = sQLiteCursor2;
                                                                        z9 = z10;
                                                                        sQLitePreparedStatement = null;
                                                                        try {
                                                                            yrVar.o(e, z9);
                                                                            sQLiteDatabase2 = yrVar.b;
                                                                            if (sQLiteDatabase2 != null) {
                                                                            }
                                                                            if (sQLiteCursor != null) {
                                                                            }
                                                                            if (sQLitePreparedStatement != null) {
                                                                            }
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            sQLiteDatabase = yrVar.b;
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
                                                            z11 = z13;
                                                        } catch (Exception e11) {
                                                            e = e11;
                                                            z10 = true;
                                                        }
                                                    }
                                                    i12++;
                                                }
                                            }
                                            if (z11) {
                                                arrayList.add(TLdeserialize);
                                                sparseArray.put(TLdeserialize.id, TLdeserialize.reactions);
                                            }
                                        }
                                        byteBufferValue.reuse();
                                    }
                                    r02 = 0;
                                } catch (Exception e12) {
                                    e = e12;
                                    z10 = true;
                                }
                            }
                            boolean z14 = true;
                            sQLiteCursor2.dispose();
                            if (!arrayList.isEmpty()) {
                                yrVar.b.beginTransaction();
                                int size = arrayList.size();
                                int i15 = 0;
                                while (i15 < size) {
                                    Object obj = arrayList.get(i15);
                                    i15++;
                                    TLRPC.Message message = (TLRPC.Message) obj;
                                    if (i10 == 0) {
                                        try {
                                            executeFast = yrVar.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                                        } catch (Exception e13) {
                                            e = e13;
                                            z9 = z14;
                                            sQLiteCursor = null;
                                            sQLitePreparedStatement = null;
                                            yrVar.o(e, z9);
                                            sQLiteDatabase2 = yrVar.b;
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
                                        executeFast = yrVar.b.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                                    }
                                    SQLitePreparedStatement sQLitePreparedStatement2 = executeFast;
                                    try {
                                        ij.r5(message);
                                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                                        message.serializeToStream(nativeByteBuffer);
                                        sQLitePreparedStatement2.requery();
                                        sQLitePreparedStatement2.bindByteBuffer(z14 ? 1 : 0, nativeByteBuffer);
                                        sQLitePreparedStatement2.bindInteger(2, message.id);
                                        sQLitePreparedStatement2.bindLong(3, j3);
                                        sQLitePreparedStatement2.step();
                                        nativeByteBuffer.reuse();
                                        sQLitePreparedStatement2.dispose();
                                        z14 = true;
                                    } catch (Exception e14) {
                                        e = e14;
                                        sQLitePreparedStatement = sQLitePreparedStatement2;
                                        z9 = true;
                                        sQLiteCursor = null;
                                        yrVar.o(e, z9);
                                        sQLiteDatabase2 = yrVar.b;
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
                                        sQLiteDatabase = yrVar.b;
                                        if (sQLiteDatabase != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        throw th;
                                    }
                                }
                                yrVar.b.commitTransaction();
                            }
                            i10++;
                            i7 = 0;
                        } catch (Exception e15) {
                            e = e15;
                            sQLiteCursor = sQLiteCursor2;
                            z9 = true;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        sQLiteCursor = sQLiteCursor2;
                        sQLitePreparedStatement = null;
                        sQLiteDatabase = yrVar.b;
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
                g0.h3(new a4(yrVar, sparseArray, j3, 27));
                SQLiteDatabase sQLiteDatabase3 = yrVar.b;
                if (sQLiteDatabase3 != null) {
                    sQLiteDatabase3.commitTransaction();
                }
            } catch (Exception e16) {
                e = e16;
                z9 = true;
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
        boolean z9;
        LongSparseIntArray longSparseIntArray2;
        int max;
        switch (this.a) {
            case 0:
                yr yrVar = this.b;
                int i7 = this.c;
                long j3 = this.d;
                long j10 = this.e;
                try {
                    SQLiteDatabase sQLiteDatabase = yrVar.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE messages_v2 SET read_state = read_state | 2 WHERE mid = " + i7 + " AND uid = " + j3).stepThis().dispose();
                    SQLiteDatabase sQLiteDatabase2 = yrVar.b;
                    StringBuilder sb2 = new StringBuilder("SELECT unread_count_i FROM dialogs WHERE did = ");
                    sb2.append(j10);
                    ?? queryFinalized = sQLiteDatabase2.queryFinalized(sb2.toString(), new Object[0]);
                    try {
                        try {
                            if (queryFinalized.next()) {
                                try {
                                    max = Math.max(0, queryFinalized.intValue(0) - 1);
                                } catch (Exception e10) {
                                    e = e10;
                                    r15 = queryFinalized;
                                    z9 = true;
                                    try {
                                        yrVar.o(e, z9);
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
                            yrVar.b.executeFast("UPDATE dialogs SET unread_count_i = " + max + " WHERE did = " + j10).stepThis().dispose();
                            LongSparseIntArray longSparseIntArray3 = new LongSparseIntArray(1);
                            longSparseIntArray3.put(j10, max);
                            if (max == 0) {
                                longSparseIntArray = null;
                                try {
                                    yrVar.W1(null, longSparseIntArray3, true);
                                } catch (Exception e11) {
                                    e = e11;
                                    longSparseIntArray2 = longSparseIntArray;
                                    z9 = true;
                                    r15 = longSparseIntArray2;
                                    yrVar.o(e, z9);
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
                            yrVar.getMessagesController().H3(longSparseIntArray, longSparseIntArray3);
                            yrVar.b.executeFast("UPDATE messages_topics SET read_state = read_state | 2 WHERE mid = " + i7 + " AND uid = " + j3).stepThis().dispose();
                            SQLiteCursor queryFinalized2 = yrVar.b.queryFinalized("SELECT data FROM messages_topics WHERE mid = " + i7 + " AND uid = " + j3, new Object[0]);
                            long j11 = 0;
                            while (queryFinalized2.next()) {
                                NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(0);
                                if (byteBufferValue != null) {
                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    byteBufferValue.reuse();
                                    j11 = ij.a2(yrVar.currentAccount, TLdeserialize, yrVar.Z(j3));
                                }
                            }
                            queryFinalized2.dispose();
                            if (j11 != 0) {
                                SQLiteDatabase sQLiteDatabase3 = yrVar.b;
                                Locale locale2 = Locale.US;
                                queryFinalized = sQLiteDatabase3.queryFinalized("SELECT unread_mentions FROM topics WHERE did = " + j10 + " AND topic_id = " + j11, new Object[0]);
                                int max2 = queryFinalized.next() ? Math.max(0, queryFinalized.intValue(0) - 1) : 0;
                                queryFinalized.dispose();
                                yrVar.b.executeFast("UPDATE topics SET unread_mentions = " + max2 + " WHERE did = " + j3 + " AND topic_id = " + j11).stepThis().dispose();
                                k00 k00Var = yrVar.getMessagesController().q7;
                                k00Var.getClass();
                                g0.h3(new lb(k00Var, j3, j11, max2, 2));
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
                        z9 = true;
                        r15 = longSparseIntArray2;
                        yrVar.o(e, z9);
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
                long j12 = this.d;
                long j13 = this.e;
                yr yrVar2 = this.b;
                yrVar2.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = yrVar2.b.executeFast("UPDATE messages_topics SET topic_id = ? WHERE uid = ? AND mid = ?");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindLong(1, i10);
                        sQLitePreparedStatement.bindLong(2, j12);
                        sQLitePreparedStatement.bindLong(3, j13);
                        sQLitePreparedStatement.step();
                        sQLitePreparedStatement.dispose();
                    } catch (Throwable th6) {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th6;
                    }
                } catch (Exception e14) {
                    yrVar2.o(e14, true);
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
                long j14 = this.d;
                yr yrVar3 = this.b;
                long j15 = this.e;
                int i11 = this.c;
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        if (j14 != 0) {
                            SQLiteDatabase sQLiteDatabase4 = yrVar3.b;
                            Locale locale3 = Locale.US;
                            sQLiteDatabase4.executeFast("UPDATE topics SET unread_mentions = " + i11 + " WHERE did = " + j15 + " AND topic_id = " + j14).stepThis().dispose();
                            i00 i00Var = new i00();
                            i00Var.b = j15;
                            i00Var.c = j14;
                            i00Var.j = true;
                            i00Var.d = i11;
                            i00Var.e = -1;
                            k00 k00Var2 = yrVar3.getMessagesController().q7;
                            List singletonList = Collections.singletonList(i00Var);
                            k00Var2.getClass();
                            g0.h3(new b4(13, k00Var2, singletonList));
                            return;
                        }
                        SQLiteCursor queryFinalized3 = yrVar3.b.queryFinalized("SELECT unread_count_i FROM dialogs WHERE did = " + j15, new Object[0]);
                        try {
                            int intValue = queryFinalized3.next() ? queryFinalized3.intValue(0) : 0;
                            queryFinalized3.dispose();
                            if (intValue == 0 && i11 == 0) {
                                return;
                            }
                            if (i11 == 0) {
                                SQLiteDatabase sQLiteDatabase5 = yrVar3.b;
                                Locale locale4 = Locale.US;
                                sQLiteDatabase5.executeFast("UPDATE messages_v2 SET read_state = read_state | 2 WHERE uid = " + j15 + " AND mention = 1 AND read_state IN(0, 1)").stepThis().dispose();
                            }
                            SQLiteDatabase sQLiteDatabase6 = yrVar3.b;
                            Locale locale5 = Locale.US;
                            sQLiteDatabase6.executeFast("UPDATE dialogs SET unread_count_i = " + i11 + " WHERE did = " + j15).stepThis().dispose();
                            LongSparseIntArray longSparseIntArray4 = new LongSparseIntArray(1);
                            longSparseIntArray4.put(j15, i11);
                            yrVar3.getMessagesController().H3(null, longSparseIntArray4);
                            if (i11 == 0) {
                                yrVar3.W1(null, longSparseIntArray4, true);
                                return;
                            }
                            return;
                        } catch (Exception e15) {
                            e = e15;
                            sQLiteCursor = queryFinalized3;
                            yrVar3.o(e, true);
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

    public /* synthetic */ zq(yr yrVar, int i7, long j3, long j10, int i10) {
        this.a = i10;
        this.b = yrVar;
        this.c = i7;
        this.d = j3;
        this.e = j10;
    }

    public /* synthetic */ zq(yr yrVar, long j3, long j10, int i7, int i10) {
        this.a = i10;
        this.b = yrVar;
        this.d = j3;
        this.e = j10;
        this.c = i7;
    }
}
