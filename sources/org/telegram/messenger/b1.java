package org.telegram.messenger;

import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b1(int i7, int i10, long j3, ArrayList arrayList, yr yrVar) {
        this.a = 4;
        this.b = yrVar;
        this.d = j3;
        this.f = arrayList;
        this.c = i7;
        this.e = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0243, code lost:
    
        if (r8 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x014c, code lost:
    
        r8.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x014a, code lost:
    
        if (r5 == 16) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01de A[Catch: all -> 0x0130, Exception -> 0x0136, TryCatch #15 {Exception -> 0x0136, all -> 0x0130, blocks: (B:152:0x0116, B:154:0x0127, B:155:0x013f, B:76:0x015d, B:89:0x01b7, B:90:0x01bb, B:92:0x01bf, B:94:0x01cc, B:95:0x01ce, B:97:0x01d2, B:98:0x01da, B:100:0x01de, B:101:0x01e4, B:103:0x01e8, B:104:0x01ec, B:106:0x01f0, B:107:0x01f4, B:158:0x013c), top: B:151:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e8 A[Catch: all -> 0x0130, Exception -> 0x0136, TryCatch #15 {Exception -> 0x0136, all -> 0x0130, blocks: (B:152:0x0116, B:154:0x0127, B:155:0x013f, B:76:0x015d, B:89:0x01b7, B:90:0x01bb, B:92:0x01bf, B:94:0x01cc, B:95:0x01ce, B:97:0x01d2, B:98:0x01da, B:100:0x01de, B:101:0x01e4, B:103:0x01e8, B:104:0x01ec, B:106:0x01f0, B:107:0x01f4, B:158:0x013c), top: B:151:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f0 A[Catch: all -> 0x0130, Exception -> 0x0136, TryCatch #15 {Exception -> 0x0136, all -> 0x0130, blocks: (B:152:0x0116, B:154:0x0127, B:155:0x013f, B:76:0x015d, B:89:0x01b7, B:90:0x01bb, B:92:0x01bf, B:94:0x01cc, B:95:0x01ce, B:97:0x01d2, B:98:0x01da, B:100:0x01de, B:101:0x01e4, B:103:0x01e8, B:104:0x01ec, B:106:0x01f0, B:107:0x01f4, B:158:0x013c), top: B:151:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b7 A[Catch: all -> 0x0130, Exception -> 0x0136, TRY_ENTER, TryCatch #15 {Exception -> 0x0136, all -> 0x0130, blocks: (B:152:0x0116, B:154:0x0127, B:155:0x013f, B:76:0x015d, B:89:0x01b7, B:90:0x01bb, B:92:0x01bf, B:94:0x01cc, B:95:0x01ce, B:97:0x01d2, B:98:0x01da, B:100:0x01de, B:101:0x01e4, B:103:0x01e8, B:104:0x01ec, B:106:0x01f0, B:107:0x01f4, B:158:0x013c), top: B:151:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bf A[Catch: all -> 0x0130, Exception -> 0x0136, TryCatch #15 {Exception -> 0x0136, all -> 0x0130, blocks: (B:152:0x0116, B:154:0x0127, B:155:0x013f, B:76:0x015d, B:89:0x01b7, B:90:0x01bb, B:92:0x01bf, B:94:0x01cc, B:95:0x01ce, B:97:0x01d2, B:98:0x01da, B:100:0x01de, B:101:0x01e4, B:103:0x01e8, B:104:0x01ec, B:106:0x01f0, B:107:0x01f4, B:158:0x013c), top: B:151:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d2 A[Catch: all -> 0x0130, Exception -> 0x0136, TryCatch #15 {Exception -> 0x0136, all -> 0x0130, blocks: (B:152:0x0116, B:154:0x0127, B:155:0x013f, B:76:0x015d, B:89:0x01b7, B:90:0x01bb, B:92:0x01bf, B:94:0x01cc, B:95:0x01ce, B:97:0x01d2, B:98:0x01da, B:100:0x01de, B:101:0x01e4, B:103:0x01e8, B:104:0x01ec, B:106:0x01f0, B:107:0x01f4, B:158:0x013c), top: B:151:0x0116 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement executeFast;
        SQLiteCursor sQLiteCursor;
        int i7;
        TLRPC.TL_forumTopic tL_forumTopic;
        int i10;
        SQLitePreparedStatement executeFast2;
        SQLiteCursor sQLiteCursor2;
        int i11;
        int i12 = this.a;
        long j3 = this.d;
        int i13 = this.e;
        int i14 = this.c;
        Object obj = this.f;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                int i15 = AutoMessageHeardReceiver.a;
                qp.s1(((c) obj2).a).X3((TLRPC.User) obj, true, false);
                qp s12 = qp.s1(i14);
                long j10 = this.d;
                int i16 = this.e;
                s12.j3(j10, i16, i16, 0, false, 0L, 0, true, 0);
                qp.s1(i14).t3(j10, 0L);
                return;
            case 1:
                int i17 = AutoMessageHeardReceiver.a;
                qp.s1(((c) obj2).a).Q3((TLRPC.Chat) obj, true);
                qp s13 = qp.s1(i14);
                long j11 = this.d;
                int i18 = this.e;
                s13.j3(j11, i18, i18, 0, false, 0L, 0, true, 0);
                qp.s1(i14).t3(j11, 0L);
                return;
            case 2:
                ui uiVar = (ui) obj2;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    if (arrayList == null) {
                        SQLitePreparedStatement executeFast3 = uiVar.getMessagesStorage().b.executeFast("UPDATE stickers_v2 SET date = ?");
                        executeFast3.requery();
                        executeFast3.bindLong(1, i13);
                        executeFast3.step();
                        executeFast3.dispose();
                        return;
                    }
                    SQLitePreparedStatement executeFast4 = uiVar.getMessagesStorage().b.executeFast("REPLACE INTO stickers_v2 VALUES(?, ?, ?, ?)");
                    executeFast4.requery();
                    int i19 = 4;
                    for (int i20 = 0; i20 < arrayList.size(); i20++) {
                        i19 += ((TLRPC.TL_messages_stickerSet) arrayList.get(i20)).getObjectSize();
                    }
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i19);
                    nativeByteBuffer.writeInt32(arrayList.size());
                    for (int i21 = 0; i21 < arrayList.size(); i21++) {
                        ((TLRPC.TL_messages_stickerSet) arrayList.get(i21)).serializeToStream(nativeByteBuffer);
                    }
                    executeFast4.bindInteger(1, i14 + 1);
                    executeFast4.bindByteBuffer(2, nativeByteBuffer);
                    executeFast4.bindInteger(3, i13);
                    executeFast4.bindLong(4, j3);
                    executeFast4.step();
                    nativeByteBuffer.reuse();
                    executeFast4.dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 3:
                yr yrVar = (yr) obj2;
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj;
                int i22 = this.c;
                int i23 = i22 & 16;
                long j12 = this.d;
                if (i23 != 0) {
                    try {
                        executeFast = yrVar.b.executeFast("UPDATE topics SET total_messages_count = ? WHERE did = ? AND topic_id = ?");
                        try {
                            executeFast.requery();
                            executeFast.bindInteger(1, tL_forumTopic2.totalMessagesCount);
                            executeFast.bindLong(2, j12);
                            executeFast.bindLong(3, yrVar.u0(4, j12) ? m5.o(tL_forumTopic2.from_id) : tL_forumTopic2.id);
                            executeFast.step();
                            executeFast.dispose();
                            break;
                        } catch (Exception e11) {
                            e = e11;
                            sQLitePreparedStatement = executeFast;
                            sQLiteCursor = null;
                            try {
                                yrVar.o(e, true);
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                yrVar.b.commitTransaction();
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                yrVar.b.commitTransaction();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            sQLitePreparedStatement = executeFast;
                            sQLiteCursor = null;
                            if (sQLitePreparedStatement != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                            yrVar.b.commitTransaction();
                            throw th;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        sQLitePreparedStatement = null;
                        sQLiteCursor = null;
                        yrVar.o(e, true);
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor != null) {
                        }
                        yrVar.b.commitTransaction();
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        sQLitePreparedStatement = null;
                        sQLiteCursor = null;
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor != null) {
                        }
                        yrVar.b.commitTransaction();
                        throw th;
                    }
                } else {
                    executeFast = null;
                }
                SQLiteDatabase sQLiteDatabase = yrVar.b;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, edit_date FROM topics WHERE did = " + j12 + " AND topic_id = " + tL_forumTopic2.id, new Object[0]);
                try {
                    if (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        i7 = queryFinalized.intValue(1);
                        if (byteBufferValue != null) {
                            tL_forumTopic = TLRPC.TL_forumTopic.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                            byteBufferValue.reuse();
                            queryFinalized.dispose();
                            if (tL_forumTopic != null && (i7 == 0 || i7 <= i13)) {
                                if ((i22 & 1) != 0) {
                                    tL_forumTopic.title = tL_forumTopic2.title;
                                }
                                if ((i22 & 2) != 0) {
                                    tL_forumTopic.icon_emoji_id = tL_forumTopic2.icon_emoji_id;
                                    tL_forumTopic.flags |= 1;
                                    int i24 = tL_forumTopic2.icon_color;
                                    if (i24 != 0) {
                                        tL_forumTopic.icon_color = i24;
                                    }
                                }
                                if ((i22 & 4) != 0) {
                                    tL_forumTopic.pinned = tL_forumTopic2.pinned;
                                    tL_forumTopic.pinnedOrder = tL_forumTopic2.pinnedOrder;
                                }
                                i10 = !tL_forumTopic.pinned ? tL_forumTopic.pinnedOrder + 1 : 0;
                                if ((i22 & 8) != 0) {
                                    tL_forumTopic.closed = tL_forumTopic2.closed;
                                }
                                if ((i22 & 32) != 0) {
                                    tL_forumTopic.hidden = tL_forumTopic2.hidden;
                                }
                                executeFast2 = yrVar.b.executeFast("UPDATE topics SET data = ?, pinned = ?, hidden = ?, edit_date = ? WHERE did = ? AND topic_id = ?");
                                try {
                                    yrVar.b.beginTransaction();
                                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tL_forumTopic.getObjectSize());
                                    tL_forumTopic.serializeToStream(nativeByteBuffer2);
                                    executeFast2.bindByteBuffer(1, nativeByteBuffer2);
                                    executeFast2.bindInteger(2, i10);
                                    executeFast2.bindInteger(3, tL_forumTopic.hidden ? 1 : 0);
                                    executeFast2.bindInteger(4, i13);
                                    executeFast2.bindLong(5, j12);
                                    executeFast2.bindLong(6, tL_forumTopic.id);
                                    executeFast2.step();
                                    nativeByteBuffer2.reuse();
                                    g0.h3(new hk(yrVar, j12, tL_forumTopic2, i22, 5));
                                    executeFast = executeFast2;
                                    break;
                                } catch (Exception e13) {
                                    e = e13;
                                    sQLitePreparedStatement = executeFast2;
                                    sQLiteCursor = null;
                                    yrVar.o(e, true);
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    yrVar.b.commitTransaction();
                                    return;
                                } catch (Throwable th5) {
                                    th = th5;
                                    sQLitePreparedStatement = executeFast2;
                                    sQLiteCursor = null;
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    yrVar.b.commitTransaction();
                                    throw th;
                                }
                            }
                        }
                    } else {
                        i7 = 0;
                    }
                    tL_forumTopic = null;
                    queryFinalized.dispose();
                    if (tL_forumTopic != null) {
                        if ((i22 & 1) != 0) {
                        }
                        if ((i22 & 2) != 0) {
                        }
                        if ((i22 & 4) != 0) {
                        }
                        if (!tL_forumTopic.pinned) {
                        }
                        if ((i22 & 8) != 0) {
                        }
                        if ((i22 & 32) != 0) {
                        }
                        executeFast2 = yrVar.b.executeFast("UPDATE topics SET data = ?, pinned = ?, hidden = ?, edit_date = ? WHERE did = ? AND topic_id = ?");
                        yrVar.b.beginTransaction();
                        NativeByteBuffer nativeByteBuffer22 = new NativeByteBuffer(tL_forumTopic.getObjectSize());
                        tL_forumTopic.serializeToStream(nativeByteBuffer22);
                        executeFast2.bindByteBuffer(1, nativeByteBuffer22);
                        executeFast2.bindInteger(2, i10);
                        executeFast2.bindInteger(3, tL_forumTopic.hidden ? 1 : 0);
                        executeFast2.bindInteger(4, i13);
                        executeFast2.bindLong(5, j12);
                        executeFast2.bindLong(6, tL_forumTopic.id);
                        executeFast2.step();
                        nativeByteBuffer22.reuse();
                        g0.h3(new hk(yrVar, j12, tL_forumTopic2, i22, 5));
                        executeFast = executeFast2;
                    }
                } catch (Exception e14) {
                    e = e14;
                    sQLitePreparedStatement = executeFast;
                    sQLiteCursor = queryFinalized;
                    yrVar.o(e, true);
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLiteCursor != null) {
                    }
                    yrVar.b.commitTransaction();
                    return;
                } catch (Throwable th6) {
                    th = th6;
                    sQLitePreparedStatement = executeFast;
                    sQLiteCursor = queryFinalized;
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLiteCursor != null) {
                    }
                    yrVar.b.commitTransaction();
                    throw th;
                }
                break;
            default:
                yr yrVar2 = (yr) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                if (j3 != 0) {
                    yrVar2.T0(i13, j3, arrayList2);
                    return;
                }
                try {
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    SQLiteDatabase sQLiteDatabase2 = yrVar2.b;
                    Locale locale2 = Locale.US;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT uid, mid, ttl FROM messages_v2 WHERE mid IN (" + TextUtils.join(",", arrayList2) + ") AND is_channel = 0", new Object[0]);
                    while (queryFinalized2.next()) {
                        try {
                            long longValue = queryFinalized2.longValue(0);
                            int intValue = queryFinalized2.intValue(1);
                            int intValue2 = queryFinalized2.intValue(2);
                            if (intValue2 > 0 && intValue2 != Integer.MAX_VALUE && i14 != 0 && (i11 = intValue2 + i14) >= i13) {
                                SparseArray sparseArray = (SparseArray) hVar2.f(longValue);
                                if (sparseArray == null) {
                                    sparseArray = new SparseArray();
                                    hVar2.k(sparseArray, longValue);
                                }
                                ArrayList arrayList3 = (ArrayList) sparseArray.get(i11);
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                    sparseArray.put(i11, arrayList3);
                                }
                                arrayList3.add(Integer.valueOf(intValue));
                            }
                            ArrayList arrayList4 = (ArrayList) hVar.f(longValue);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                hVar.k(arrayList4, longValue);
                            }
                            arrayList4.add(Integer.valueOf(intValue));
                        } catch (Exception e15) {
                            e = e15;
                            sQLiteCursor2 = queryFinalized2;
                            try {
                                yrVar2.o(e, true);
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th7) {
                                th = th7;
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            sQLiteCursor2 = queryFinalized2;
                            if (sQLiteCursor2 != null) {
                            }
                            throw th;
                        }
                    }
                    queryFinalized2.dispose();
                    int m10 = hVar.m();
                    for (int i25 = 0; i25 < m10; i25++) {
                        yrVar2.T0(i13, hVar.j(i25), (ArrayList) hVar.n(i25));
                    }
                    int m11 = hVar2.m();
                    for (int i26 = 0; i26 < m11; i26++) {
                        yrVar2.B(hVar2.j(i26), (SparseArray) hVar2.n(i26));
                    }
                    return;
                } catch (Exception e16) {
                    e = e16;
                    sQLiteCursor2 = null;
                } catch (Throwable th9) {
                    th = th9;
                    sQLiteCursor2 = null;
                }
                break;
        }
    }

    public /* synthetic */ b1(c cVar, TLObject tLObject, int i7, long j3, int i10, int i11) {
        this.a = i11;
        this.b = cVar;
        this.f = tLObject;
        this.c = i7;
        this.d = j3;
        this.e = i10;
    }

    public /* synthetic */ b1(ui uiVar, ArrayList arrayList, int i7, int i10, long j3) {
        this.a = 2;
        this.b = uiVar;
        this.f = arrayList;
        this.c = i7;
        this.e = i10;
        this.d = j3;
    }

    public /* synthetic */ b1(yr yrVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i10) {
        this.a = 3;
        this.b = yrVar;
        this.c = i7;
        this.f = tL_forumTopic;
        this.d = j3;
        this.e = i10;
    }
}
