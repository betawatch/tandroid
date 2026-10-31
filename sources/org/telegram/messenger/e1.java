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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e1(int i10, int i11, long j10, ArrayList arrayList, hs hsVar) {
        this.a = 4;
        this.b = hsVar;
        this.d = j10;
        this.f = arrayList;
        this.c = i10;
        this.e = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x023d, code lost:
    
        if (r8 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x014c, code lost:
    
        r8.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x014a, code lost:
    
        if (r5 == 16) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e2 A[Catch: all -> 0x0130, Exception -> 0x0136, TryCatch #15 {Exception -> 0x0136, all -> 0x0130, blocks: (B:150:0x0116, B:152:0x0127, B:153:0x013f, B:76:0x015d, B:89:0x01b7, B:90:0x01bb, B:92:0x01bf, B:93:0x01c8, B:95:0x01cc, B:96:0x01d4, B:98:0x01d8, B:99:0x01de, B:101:0x01e2, B:102:0x01e6, B:104:0x01ea, B:105:0x01ee, B:156:0x013c), top: B:149:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ea A[Catch: all -> 0x0130, Exception -> 0x0136, TryCatch #15 {Exception -> 0x0136, all -> 0x0130, blocks: (B:150:0x0116, B:152:0x0127, B:153:0x013f, B:76:0x015d, B:89:0x01b7, B:90:0x01bb, B:92:0x01bf, B:93:0x01c8, B:95:0x01cc, B:96:0x01d4, B:98:0x01d8, B:99:0x01de, B:101:0x01e2, B:102:0x01e6, B:104:0x01ea, B:105:0x01ee, B:156:0x013c), top: B:149:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b7 A[Catch: all -> 0x0130, Exception -> 0x0136, TRY_ENTER, TryCatch #15 {Exception -> 0x0136, all -> 0x0130, blocks: (B:150:0x0116, B:152:0x0127, B:153:0x013f, B:76:0x015d, B:89:0x01b7, B:90:0x01bb, B:92:0x01bf, B:93:0x01c8, B:95:0x01cc, B:96:0x01d4, B:98:0x01d8, B:99:0x01de, B:101:0x01e2, B:102:0x01e6, B:104:0x01ea, B:105:0x01ee, B:156:0x013c), top: B:149:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bf A[Catch: all -> 0x0130, Exception -> 0x0136, TryCatch #15 {Exception -> 0x0136, all -> 0x0130, blocks: (B:150:0x0116, B:152:0x0127, B:153:0x013f, B:76:0x015d, B:89:0x01b7, B:90:0x01bb, B:92:0x01bf, B:93:0x01c8, B:95:0x01cc, B:96:0x01d4, B:98:0x01d8, B:99:0x01de, B:101:0x01e2, B:102:0x01e6, B:104:0x01ea, B:105:0x01ee, B:156:0x013c), top: B:149:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01cc A[Catch: all -> 0x0130, Exception -> 0x0136, TryCatch #15 {Exception -> 0x0136, all -> 0x0130, blocks: (B:150:0x0116, B:152:0x0127, B:153:0x013f, B:76:0x015d, B:89:0x01b7, B:90:0x01bb, B:92:0x01bf, B:93:0x01c8, B:95:0x01cc, B:96:0x01d4, B:98:0x01d8, B:99:0x01de, B:101:0x01e2, B:102:0x01e6, B:104:0x01ea, B:105:0x01ee, B:156:0x013c), top: B:149:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d8 A[Catch: all -> 0x0130, Exception -> 0x0136, TryCatch #15 {Exception -> 0x0136, all -> 0x0130, blocks: (B:150:0x0116, B:152:0x0127, B:153:0x013f, B:76:0x015d, B:89:0x01b7, B:90:0x01bb, B:92:0x01bf, B:93:0x01c8, B:95:0x01cc, B:96:0x01d4, B:98:0x01d8, B:99:0x01de, B:101:0x01e2, B:102:0x01e6, B:104:0x01ea, B:105:0x01ee, B:156:0x013c), top: B:149:0x0116 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement executeFast;
        SQLiteCursor sQLiteCursor;
        int i10;
        TLRPC.TL_forumTopic tL_forumTopic;
        int i11;
        SQLitePreparedStatement executeFast2;
        SQLiteCursor sQLiteCursor2;
        int i12;
        int i13 = this.a;
        long j10 = this.d;
        int i14 = this.e;
        int i15 = this.c;
        Object obj = this.f;
        Object obj2 = this.b;
        switch (i13) {
            case 0:
                int i16 = AutoMessageHeardReceiver.a;
                vp.r1(((c) obj2).a).U3((TLRPC.User) obj, true, false);
                vp r12 = vp.r1(i15);
                long j11 = this.d;
                int i17 = this.e;
                r12.h3(j11, i17, i17, 0, false, 0L, 0, true, 0);
                vp.r1(i15).q3(j11, 0L);
                return;
            case 1:
                int i18 = AutoMessageHeardReceiver.a;
                vp.r1(((c) obj2).a).N3((TLRPC.Chat) obj, true);
                vp r13 = vp.r1(i15);
                long j12 = this.d;
                int i19 = this.e;
                r13.h3(j12, i19, i19, 0, false, 0L, 0, true, 0);
                vp.r1(i15).q3(j12, 0L);
                return;
            case 2:
                ui uiVar = (ui) obj2;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    if (arrayList == null) {
                        SQLitePreparedStatement executeFast3 = uiVar.getMessagesStorage().b.executeFast("UPDATE stickers_v2 SET date = ?");
                        executeFast3.requery();
                        executeFast3.bindLong(1, i14);
                        executeFast3.step();
                        executeFast3.dispose();
                        return;
                    }
                    SQLitePreparedStatement executeFast4 = uiVar.getMessagesStorage().b.executeFast("REPLACE INTO stickers_v2 VALUES(?, ?, ?, ?)");
                    executeFast4.requery();
                    int i20 = 4;
                    for (int i21 = 0; i21 < arrayList.size(); i21++) {
                        i20 += ((TLRPC.TL_messages_stickerSet) arrayList.get(i21)).getObjectSize();
                    }
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i20);
                    nativeByteBuffer.writeInt32(arrayList.size());
                    for (int i22 = 0; i22 < arrayList.size(); i22++) {
                        ((TLRPC.TL_messages_stickerSet) arrayList.get(i22)).serializeToStream(nativeByteBuffer);
                    }
                    executeFast4.bindInteger(1, i15 + 1);
                    executeFast4.bindByteBuffer(2, nativeByteBuffer);
                    executeFast4.bindInteger(3, i14);
                    executeFast4.bindLong(4, j10);
                    executeFast4.step();
                    nativeByteBuffer.reuse();
                    executeFast4.dispose();
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 3:
                hs hsVar = (hs) obj2;
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj;
                int i23 = this.c;
                int i24 = i23 & 16;
                long j13 = this.d;
                if (i24 != 0) {
                    try {
                        executeFast = hsVar.b.executeFast("UPDATE topics SET total_messages_count = ? WHERE did = ? AND topic_id = ?");
                        try {
                            executeFast.requery();
                            executeFast.bindInteger(1, tL_forumTopic2.totalMessagesCount);
                            executeFast.bindLong(2, j13);
                            executeFast.bindLong(3, hsVar.u0(4, j13) ? o5.o(tL_forumTopic2.from_id) : tL_forumTopic2.id);
                            executeFast.step();
                            executeFast.dispose();
                            break;
                        } catch (Exception e7) {
                            e = e7;
                            sQLitePreparedStatement = executeFast;
                            sQLiteCursor = null;
                            try {
                                hsVar.o(e, true);
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                hsVar.b.commitTransaction();
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                hsVar.b.commitTransaction();
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
                            hsVar.b.commitTransaction();
                            throw th;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        sQLitePreparedStatement = null;
                        sQLiteCursor = null;
                        hsVar.o(e, true);
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor != null) {
                        }
                        hsVar.b.commitTransaction();
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        sQLitePreparedStatement = null;
                        sQLiteCursor = null;
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor != null) {
                        }
                        hsVar.b.commitTransaction();
                        throw th;
                    }
                } else {
                    executeFast = null;
                }
                SQLiteDatabase sQLiteDatabase = hsVar.b;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, edit_date FROM topics WHERE did = " + j13 + " AND topic_id = " + tL_forumTopic2.id, new Object[0]);
                try {
                    if (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        i10 = queryFinalized.intValue(1);
                        if (byteBufferValue != null) {
                            tL_forumTopic = TLRPC.TL_forumTopic.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                            byteBufferValue.reuse();
                            queryFinalized.dispose();
                            if (tL_forumTopic != null && (i10 == 0 || i10 <= i14)) {
                                if ((i23 & 1) != 0) {
                                    tL_forumTopic.title = tL_forumTopic2.title;
                                }
                                if ((i23 & 2) != 0) {
                                    tL_forumTopic.icon_emoji_id = tL_forumTopic2.icon_emoji_id;
                                    tL_forumTopic.flags |= 1;
                                }
                                if ((i23 & 4) != 0) {
                                    tL_forumTopic.pinned = tL_forumTopic2.pinned;
                                    tL_forumTopic.pinnedOrder = tL_forumTopic2.pinnedOrder;
                                }
                                i11 = !tL_forumTopic.pinned ? tL_forumTopic.pinnedOrder + 1 : 0;
                                if ((i23 & 8) != 0) {
                                    tL_forumTopic.closed = tL_forumTopic2.closed;
                                }
                                if ((i23 & 32) != 0) {
                                    tL_forumTopic.hidden = tL_forumTopic2.hidden;
                                }
                                executeFast2 = hsVar.b.executeFast("UPDATE topics SET data = ?, pinned = ?, hidden = ?, edit_date = ? WHERE did = ? AND topic_id = ?");
                                try {
                                    hsVar.b.beginTransaction();
                                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tL_forumTopic.getObjectSize());
                                    tL_forumTopic.serializeToStream(nativeByteBuffer2);
                                    executeFast2.bindByteBuffer(1, nativeByteBuffer2);
                                    executeFast2.bindInteger(2, i11);
                                    executeFast2.bindInteger(3, tL_forumTopic.hidden ? 1 : 0);
                                    executeFast2.bindInteger(4, i14);
                                    executeFast2.bindLong(5, j13);
                                    executeFast2.bindLong(6, tL_forumTopic.id);
                                    executeFast2.step();
                                    nativeByteBuffer2.reuse();
                                    i0.g3(new rk(hsVar, j13, tL_forumTopic2, i23, 6));
                                    executeFast = executeFast2;
                                    break;
                                } catch (Exception e11) {
                                    e = e11;
                                    sQLitePreparedStatement = executeFast2;
                                    sQLiteCursor = null;
                                    hsVar.o(e, true);
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    hsVar.b.commitTransaction();
                                    return;
                                } catch (Throwable th5) {
                                    th = th5;
                                    sQLitePreparedStatement = executeFast2;
                                    sQLiteCursor = null;
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    hsVar.b.commitTransaction();
                                    throw th;
                                }
                            }
                        }
                    } else {
                        i10 = 0;
                    }
                    tL_forumTopic = null;
                    queryFinalized.dispose();
                    if (tL_forumTopic != null) {
                        if ((i23 & 1) != 0) {
                        }
                        if ((i23 & 2) != 0) {
                        }
                        if ((i23 & 4) != 0) {
                        }
                        if (!tL_forumTopic.pinned) {
                        }
                        if ((i23 & 8) != 0) {
                        }
                        if ((i23 & 32) != 0) {
                        }
                        executeFast2 = hsVar.b.executeFast("UPDATE topics SET data = ?, pinned = ?, hidden = ?, edit_date = ? WHERE did = ? AND topic_id = ?");
                        hsVar.b.beginTransaction();
                        NativeByteBuffer nativeByteBuffer22 = new NativeByteBuffer(tL_forumTopic.getObjectSize());
                        tL_forumTopic.serializeToStream(nativeByteBuffer22);
                        executeFast2.bindByteBuffer(1, nativeByteBuffer22);
                        executeFast2.bindInteger(2, i11);
                        executeFast2.bindInteger(3, tL_forumTopic.hidden ? 1 : 0);
                        executeFast2.bindInteger(4, i14);
                        executeFast2.bindLong(5, j13);
                        executeFast2.bindLong(6, tL_forumTopic.id);
                        executeFast2.step();
                        nativeByteBuffer22.reuse();
                        i0.g3(new rk(hsVar, j13, tL_forumTopic2, i23, 6));
                        executeFast = executeFast2;
                    }
                } catch (Exception e12) {
                    e = e12;
                    sQLitePreparedStatement = executeFast;
                    sQLiteCursor = queryFinalized;
                    hsVar.o(e, true);
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLiteCursor != null) {
                    }
                    hsVar.b.commitTransaction();
                    return;
                } catch (Throwable th6) {
                    th = th6;
                    sQLitePreparedStatement = executeFast;
                    sQLiteCursor = queryFinalized;
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLiteCursor != null) {
                    }
                    hsVar.b.commitTransaction();
                    throw th;
                }
                break;
            default:
                hs hsVar2 = (hs) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                if (j10 != 0) {
                    hsVar2.T0(i14, j10, arrayList2);
                    return;
                }
                try {
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    SQLiteDatabase sQLiteDatabase2 = hsVar2.b;
                    Locale locale2 = Locale.US;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT uid, mid, ttl FROM messages_v2 WHERE mid IN (" + TextUtils.join(",", arrayList2) + ") AND is_channel = 0", new Object[0]);
                    while (queryFinalized2.next()) {
                        try {
                            long longValue = queryFinalized2.longValue(0);
                            int intValue = queryFinalized2.intValue(1);
                            int intValue2 = queryFinalized2.intValue(2);
                            if (intValue2 > 0 && intValue2 != Integer.MAX_VALUE && i15 != 0 && (i12 = intValue2 + i15) >= i14) {
                                SparseArray sparseArray = (SparseArray) hVar2.f(longValue);
                                if (sparseArray == null) {
                                    sparseArray = new SparseArray();
                                    hVar2.k(sparseArray, longValue);
                                }
                                ArrayList arrayList3 = (ArrayList) sparseArray.get(i12);
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                    sparseArray.put(i12, arrayList3);
                                }
                                arrayList3.add(Integer.valueOf(intValue));
                            }
                            ArrayList arrayList4 = (ArrayList) hVar.f(longValue);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                hVar.k(arrayList4, longValue);
                            }
                            arrayList4.add(Integer.valueOf(intValue));
                        } catch (Exception e13) {
                            e = e13;
                            sQLiteCursor2 = queryFinalized2;
                            try {
                                hsVar2.o(e, true);
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
                        hsVar2.T0(i14, hVar.j(i25), (ArrayList) hVar.n(i25));
                    }
                    int m11 = hVar2.m();
                    for (int i26 = 0; i26 < m11; i26++) {
                        hsVar2.B(hVar2.j(i26), (SparseArray) hVar2.n(i26));
                    }
                    return;
                } catch (Exception e14) {
                    e = e14;
                    sQLiteCursor2 = null;
                } catch (Throwable th9) {
                    th = th9;
                    sQLiteCursor2 = null;
                }
                break;
        }
    }

    public /* synthetic */ e1(c cVar, TLObject tLObject, int i10, long j10, int i11, int i12) {
        this.a = i12;
        this.b = cVar;
        this.f = tLObject;
        this.c = i10;
        this.d = j10;
        this.e = i11;
    }

    public /* synthetic */ e1(ui uiVar, ArrayList arrayList, int i10, int i11, long j10) {
        this.a = 2;
        this.b = uiVar;
        this.f = arrayList;
        this.c = i10;
        this.e = i11;
        this.d = j10;
    }

    public /* synthetic */ e1(hs hsVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11) {
        this.a = 3;
        this.b = hsVar;
        this.c = i10;
        this.f = tL_forumTopic;
        this.d = j10;
        this.e = i11;
    }
}
