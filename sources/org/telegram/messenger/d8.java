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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Serializable h;

    public /* synthetic */ d8(f8 f8Var, long j3, int i7, int i10, String str, int i11) {
        this.f = f8Var;
        this.c = j3;
        this.b = i7;
        this.d = i10;
        this.h = str;
        this.e = i11;
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
        long j3;
        SQLiteCursor queryFinalized;
        TLRPC.MessageReplies messageReplies;
        NativeByteBuffer byteBufferValue;
        int i7 = this.a;
        int i10 = this.e;
        Serializable serializable = this.h;
        int i11 = this.d;
        long j10 = this.c;
        int i12 = this.b;
        Object obj = this.f;
        switch (i7) {
            case 0:
                f8 f8Var = (f8) obj;
                String str = (String) serializable;
                ConcurrentHashMap concurrentHashMap = f8Var.f;
                boolean z9 = r2.a;
                a8.b("put file path id=" + j10 + " dc=" + i12 + " type=" + i11 + " path=" + str);
                f8Var.c();
                SQLiteDatabase sQLiteDatabase = f8Var.c;
                if (sQLiteDatabase == null) {
                    return;
                }
                try {
                    if (str != null) {
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("DELETE FROM paths WHERE path = ?");
                        try {
                            sQLitePreparedStatement.bindString(1, str);
                            sQLitePreparedStatement.step();
                            executeFast = f8Var.c.executeFast("REPLACE INTO paths VALUES(?, ?, ?, ?, ?)");
                        } catch (SQLiteException e10) {
                            e = e10;
                            sQLitePreparedStatement2 = null;
                            try {
                                a8.g(e, true);
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
                            executeFast.bindLong(1, j10);
                            executeFast.bindInteger(2, i12);
                            executeFast.bindInteger(3, i11);
                            executeFast.bindString(4, str);
                            executeFast.bindInteger(5, i10);
                            executeFast.step();
                            executeFast.dispose();
                            concurrentHashMap.put(j10 + "_" + i12 + "_" + i11, str);
                            sQLitePreparedStatement2 = executeFast;
                        } catch (SQLiteException e11) {
                            e = e11;
                            sQLitePreparedStatement2 = executeFast;
                            a8.g(e, true);
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
                        sQLiteDatabase.executeFast("DELETE FROM paths WHERE document_id = " + j10 + " AND dc_id = " + i12 + " AND type = " + i11).stepThis().dispose();
                        concurrentHashMap.put(j10 + "_" + i12 + "_" + i11, "~null~");
                        sQLitePreparedStatement = null;
                        sQLitePreparedStatement2 = null;
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    if (sQLitePreparedStatement2 == null) {
                        return;
                    }
                } catch (SQLiteException e12) {
                    e = e12;
                    sQLitePreparedStatement = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLitePreparedStatement = null;
                }
                sQLitePreparedStatement2.dispose();
                return;
            default:
                yr yrVar = (yr) obj;
                ArrayList<TLRPC.Peer> arrayList = (ArrayList) serializable;
                yrVar.getClass();
                try {
                    executeFast2 = yrVar.b.executeFast("UPDATE messages_v2 SET replies_data = ? WHERE mid = ? AND uid = ?");
                } catch (Exception e13) {
                    e = e13;
                    sQLitePreparedStatement3 = null;
                } catch (Throwable th6) {
                    th = th6;
                    sQLitePreparedStatement3 = null;
                }
                try {
                    SQLiteDatabase sQLiteDatabase2 = yrVar.b;
                    Locale locale = Locale.ENGLISH;
                    j3 = -j10;
                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT replies_data FROM messages_v2 WHERE mid = " + i12 + " AND uid = " + j3, new Object[0]);
                } catch (Exception e14) {
                    e = e14;
                    sQLitePreparedStatement3 = executeFast2;
                    sQLiteCursor = null;
                    try {
                        yrVar.o(e, true);
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
                        int i13 = messageReplies.replies + i11;
                        messageReplies.replies = i13;
                        if (i13 < 0) {
                            messageReplies.replies = 0;
                        }
                        if (arrayList != null) {
                            messageReplies.recent_repliers = arrayList;
                            messageReplies.flags |= 2;
                        }
                        if (i10 != 0) {
                            messageReplies.max_id = i10;
                        }
                        executeFast2.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageReplies.getObjectSize());
                        messageReplies.serializeToStream(nativeByteBuffer);
                        executeFast2.bindByteBuffer(1, nativeByteBuffer);
                        executeFast2.bindInteger(2, i12);
                        executeFast2.bindLong(3, j3);
                        executeFast2.step();
                        nativeByteBuffer.reuse();
                    }
                    executeFast2.dispose();
                    return;
                } catch (Exception e15) {
                    e = e15;
                    sQLiteCursor = queryFinalized;
                    sQLitePreparedStatement3 = executeFast2;
                    yrVar.o(e, true);
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

    public /* synthetic */ d8(yr yrVar, int i7, long j3, int i10, ArrayList arrayList, int i11) {
        this.f = yrVar;
        this.b = i7;
        this.c = j3;
        this.d = i10;
        this.h = arrayList;
        this.e = i11;
    }
}
