package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class i8 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Serializable h;

    public /* synthetic */ i8(k8 k8Var, long j10, int i10, int i11, String str, int i12) {
        this.f = k8Var;
        this.c = j10;
        this.b = i10;
        this.d = i11;
        this.h = str;
        this.e = i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01dc  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLitePreparedStatement executeFast;
        SQLitePreparedStatement sQLitePreparedStatement3;
        SQLiteCursor sQLiteCursor;
        SQLitePreparedStatement executeFast2;
        long j10;
        SQLiteCursor queryFinalized;
        TLRPC.MessageReplies messageReplies;
        NativeByteBuffer byteBufferValue;
        int i10 = this.a;
        int i11 = this.e;
        Serializable serializable = this.h;
        int i12 = this.d;
        long j11 = this.c;
        int i13 = this.b;
        Object obj = this.f;
        switch (i10) {
            case 0:
                k8 k8Var = (k8) obj;
                String str = (String) serializable;
                ConcurrentHashMap concurrentHashMap = k8Var.f;
                boolean z10 = v2.a;
                f8.b("put file path id=" + j11 + " dc=" + i13 + " type=" + i12 + " path=" + str);
                k8Var.c();
                SQLiteDatabase sQLiteDatabase = k8Var.c;
                if (sQLiteDatabase == null) {
                    return;
                }
                try {
                    if (str != null) {
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("DELETE FROM paths WHERE path = ?");
                        try {
                            sQLitePreparedStatement.bindString(1, str);
                            sQLitePreparedStatement.step();
                            executeFast = k8Var.c.executeFast("REPLACE INTO paths VALUES(?, ?, ?, ?, ?)");
                        } catch (SQLiteException e) {
                            e = e;
                            sQLitePreparedStatement2 = null;
                            try {
                                f8.g(e, true);
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                if (sQLitePreparedStatement2 == null) {
                                    return;
                                }
                                sQLitePreparedStatement2.dispose();
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                if (sQLitePreparedStatement2 != null) {
                                    sQLitePreparedStatement2.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            sQLitePreparedStatement2 = null;
                            if (sQLitePreparedStatement != null) {
                            }
                            if (sQLitePreparedStatement2 != null) {
                            }
                            throw th;
                        }
                        try {
                            executeFast.requery();
                            executeFast.bindLong(1, j11);
                            executeFast.bindInteger(2, i13);
                            executeFast.bindInteger(3, i12);
                            executeFast.bindString(4, str);
                            executeFast.bindInteger(5, i11);
                            executeFast.step();
                            executeFast.dispose();
                            concurrentHashMap.put(j11 + "_" + i13 + "_" + i12, str);
                            sQLitePreparedStatement2 = executeFast;
                        } catch (SQLiteException e7) {
                            e = e7;
                            sQLitePreparedStatement2 = executeFast;
                            f8.g(e, true);
                            if (sQLitePreparedStatement != null) {
                            }
                            if (sQLitePreparedStatement2 == null) {
                            }
                            sQLitePreparedStatement2.dispose();
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            sQLitePreparedStatement2 = executeFast;
                            if (sQLitePreparedStatement != null) {
                            }
                            if (sQLitePreparedStatement2 != null) {
                            }
                            throw th;
                        }
                    } else {
                        sQLiteDatabase.executeFast("DELETE FROM paths WHERE document_id = " + j11 + " AND dc_id = " + i13 + " AND type = " + i12).stepThis().dispose();
                        concurrentHashMap.put(j11 + "_" + i13 + "_" + i12, "~null~");
                        sQLitePreparedStatement = null;
                        sQLitePreparedStatement2 = null;
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    if (sQLitePreparedStatement2 == null) {
                        return;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    sQLitePreparedStatement = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLitePreparedStatement = null;
                }
                sQLitePreparedStatement2.dispose();
                return;
            default:
                hs hsVar = (hs) obj;
                ArrayList<TLRPC.Peer> arrayList = (ArrayList) serializable;
                hsVar.getClass();
                try {
                    executeFast2 = hsVar.b.executeFast("UPDATE messages_v2 SET replies_data = ? WHERE mid = ? AND uid = ?");
                } catch (Exception e11) {
                    e = e11;
                    sQLitePreparedStatement3 = null;
                } catch (Throwable th6) {
                    th = th6;
                    sQLitePreparedStatement3 = null;
                }
                try {
                    SQLiteDatabase sQLiteDatabase2 = hsVar.b;
                    Locale locale = Locale.ENGLISH;
                    j10 = -j11;
                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT replies_data FROM messages_v2 WHERE mid = " + i13 + " AND uid = " + j10, new Object[0]);
                } catch (Exception e12) {
                    e = e12;
                    sQLitePreparedStatement3 = executeFast2;
                    sQLiteCursor = null;
                    try {
                        hsVar.o(e, true);
                        if (sQLitePreparedStatement3 != null) {
                            sQLitePreparedStatement3.dispose();
                        }
                        if (sQLiteCursor == null) {
                            sQLiteCursor.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th7) {
                        th = th7;
                        if (sQLitePreparedStatement3 != null) {
                            sQLitePreparedStatement3.dispose();
                        }
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    sQLitePreparedStatement3 = executeFast2;
                    sQLiteCursor = null;
                    if (sQLitePreparedStatement3 != null) {
                    }
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
                try {
                    if (!queryFinalized.next() || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                        messageReplies = null;
                    } else {
                        messageReplies = TLRPC.MessageReplies.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                    }
                    queryFinalized.dispose();
                    if (messageReplies != null) {
                        int i14 = messageReplies.replies + i12;
                        messageReplies.replies = i14;
                        if (i14 < 0) {
                            messageReplies.replies = 0;
                        }
                        if (arrayList != null) {
                            messageReplies.recent_repliers = arrayList;
                            messageReplies.flags |= 2;
                        }
                        if (i11 != 0) {
                            messageReplies.max_id = i11;
                        }
                        executeFast2.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageReplies.getObjectSize());
                        messageReplies.serializeToStream(nativeByteBuffer);
                        executeFast2.bindByteBuffer(1, nativeByteBuffer);
                        executeFast2.bindInteger(2, i13);
                        executeFast2.bindLong(3, j10);
                        executeFast2.step();
                        nativeByteBuffer.reuse();
                    }
                    executeFast2.dispose();
                    return;
                } catch (Exception e13) {
                    e = e13;
                    sQLiteCursor = queryFinalized;
                    sQLitePreparedStatement3 = executeFast2;
                    hsVar.o(e, true);
                    if (sQLitePreparedStatement3 != null) {
                    }
                    if (sQLiteCursor == null) {
                    }
                } catch (Throwable th9) {
                    th = th9;
                    sQLiteCursor = queryFinalized;
                    sQLitePreparedStatement3 = executeFast2;
                    if (sQLitePreparedStatement3 != null) {
                    }
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
                break;
        }
    }

    public /* synthetic */ i8(hs hsVar, int i10, long j10, int i11, ArrayList arrayList, int i12) {
        this.f = hsVar;
        this.b = i10;
        this.c = j10;
        this.d = i11;
        this.h = arrayList;
        this.e = i12;
    }
}
