package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class sp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr b;
    public final /* synthetic */ a0.h c;

    public /* synthetic */ sp(qr qrVar, a0.h hVar, int i3) {
        this.a = i3;
        this.b = qrVar;
        this.c = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0306  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteCursor sQLiteCursor;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        mv mvVar;
        int i3 = this.a;
        a0.h hVar = this.c;
        qr qrVar = this.b;
        int i10 = 0;
        switch (i3) {
            case 0:
                int i11 = 1;
                try {
                    ArrayList arrayList2 = new ArrayList();
                    int m10 = hVar.m();
                    int i12 = 0;
                    while (i12 < m10) {
                        SQLiteCursor queryFinalized = qrVar.b.queryFinalized("SELECT mid, uid FROM webpage_pending_v2 WHERE id = " + hVar.j(i12), new Object[0]);
                        try {
                            a0.h hVar2 = new a0.h();
                            while (queryFinalized.next()) {
                                long longValue = queryFinalized.longValue(i11);
                                ArrayList arrayList3 = (ArrayList) hVar2.f(longValue);
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                    hVar2.k(arrayList3, longValue);
                                }
                                arrayList3.add(Integer.valueOf(queryFinalized.intValue(0)));
                                i11 = 1;
                            }
                            queryFinalized.dispose();
                            if (!hVar2.i()) {
                                int m11 = hVar2.m();
                                for (int i13 = 0; i13 < m11; i13++) {
                                    long j10 = hVar2.j(i13);
                                    ArrayList arrayList4 = (ArrayList) hVar2.n(i13);
                                    SQLiteDatabase sQLiteDatabase3 = qrVar.b;
                                    Locale locale = Locale.US;
                                    SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT mid, data FROM messages_v2 WHERE mid IN (" + TextUtils.join(",", arrayList4) + ") AND uid = " + j10, new Object[0]);
                                    while (queryFinalized2.next()) {
                                        try {
                                            int intValue = queryFinalized2.intValue(0);
                                            NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(1);
                                            if (byteBufferValue != null) {
                                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                TLdeserialize.readAttachPath(byteBufferValue, qrVar.getUserConfig().n);
                                                byteBufferValue.reuse();
                                                TLRPC.MessageMedia messageMedia = TLdeserialize.media;
                                                if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                                                    TLdeserialize.id = intValue;
                                                    messageMedia.webpage = (TLRPC.WebPage) hVar.n(i12);
                                                    arrayList2.add(TLdeserialize);
                                                }
                                            }
                                        } catch (Exception e10) {
                                            e = e10;
                                            sQLiteCursor = queryFinalized2;
                                            sQLitePreparedStatement = null;
                                            z10 = true;
                                            sQLitePreparedStatement2 = null;
                                            try {
                                                qrVar.o(e, z10);
                                                if (sQLiteCursor != null) {
                                                    sQLiteCursor.dispose();
                                                }
                                                if (sQLitePreparedStatement2 != null) {
                                                    sQLitePreparedStatement2.dispose();
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                    sQLitePreparedStatement.dispose();
                                                }
                                                sQLiteDatabase2 = qrVar.b;
                                                if (sQLiteDatabase2 == null) {
                                                    return;
                                                }
                                                sQLiteDatabase2.commitTransaction();
                                                return;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                if (sQLiteCursor != null) {
                                                    sQLiteCursor.dispose();
                                                }
                                                if (sQLitePreparedStatement2 != null) {
                                                    sQLitePreparedStatement2.dispose();
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                    sQLitePreparedStatement.dispose();
                                                }
                                                sQLiteDatabase = qrVar.b;
                                                if (sQLiteDatabase != null) {
                                                    sQLiteDatabase.commitTransaction();
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            sQLiteCursor = queryFinalized2;
                                            sQLitePreparedStatement = null;
                                            sQLitePreparedStatement2 = null;
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement2 != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            sQLiteDatabase = qrVar.b;
                                            if (sQLiteDatabase != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    queryFinalized2.dispose();
                                }
                            }
                            i12++;
                            i11 = 1;
                        } catch (Exception e11) {
                            e = e11;
                            sQLiteCursor = queryFinalized;
                        } catch (Throwable th4) {
                            th = th4;
                            sQLiteCursor = queryFinalized;
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        sQLiteDatabase2 = qrVar.b;
                        if (sQLiteDatabase2 == null) {
                            return;
                        }
                    } else {
                        qrVar.b.beginTransaction();
                        SQLitePreparedStatement executeFast = qrVar.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                        try {
                            SQLitePreparedStatement executeFast2 = qrVar.b.executeFast("UPDATE media_v4 SET data = ? WHERE mid = ? AND uid = ?");
                            while (i10 < arrayList2.size()) {
                                try {
                                    TLRPC.Message message = (TLRPC.Message) arrayList2.get(i10);
                                    zi.r5(message);
                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                                    message.serializeToStream(nativeByteBuffer);
                                    executeFast.requery();
                                    executeFast.bindByteBuffer(1, nativeByteBuffer);
                                    executeFast.bindInteger(2, message.id);
                                    executeFast.bindLong(3, zi.B0(message));
                                    executeFast.step();
                                    executeFast2.requery();
                                    executeFast2.bindByteBuffer(1, nativeByteBuffer);
                                    executeFast2.bindInteger(2, message.id);
                                    executeFast2.bindLong(3, zi.B0(message));
                                    executeFast2.step();
                                    nativeByteBuffer.reuse();
                                    i10++;
                                } catch (Exception e12) {
                                    e = e12;
                                    sQLitePreparedStatement2 = executeFast;
                                    sQLitePreparedStatement = executeFast2;
                                    sQLiteCursor = null;
                                    z10 = true;
                                    qrVar.o(e, z10);
                                    if (sQLiteCursor != null) {
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    sQLiteDatabase2 = qrVar.b;
                                    if (sQLiteDatabase2 == null) {
                                    }
                                    sQLiteDatabase2.commitTransaction();
                                    return;
                                } catch (Throwable th5) {
                                    th = th5;
                                    sQLitePreparedStatement2 = executeFast;
                                    sQLitePreparedStatement = executeFast2;
                                    sQLiteCursor = null;
                                    if (sQLiteCursor != null) {
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    sQLiteDatabase = qrVar.b;
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            }
                            executeFast.dispose();
                            try {
                                executeFast2.dispose();
                                qrVar.b.commitTransaction();
                                g0.h3(new jp(qrVar, arrayList2, 11));
                                sQLiteDatabase2 = qrVar.b;
                                if (sQLiteDatabase2 == null) {
                                    return;
                                }
                            } catch (Exception e13) {
                                e = e13;
                                sQLitePreparedStatement = executeFast2;
                                sQLiteCursor = null;
                                z10 = true;
                                sQLitePreparedStatement2 = null;
                                qrVar.o(e, z10);
                                if (sQLiteCursor != null) {
                                }
                                if (sQLitePreparedStatement2 != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                sQLiteDatabase2 = qrVar.b;
                                if (sQLiteDatabase2 == null) {
                                }
                                sQLiteDatabase2.commitTransaction();
                                return;
                            } catch (Throwable th6) {
                                th = th6;
                                sQLitePreparedStatement = executeFast2;
                                sQLiteCursor = null;
                                sQLitePreparedStatement2 = null;
                                if (sQLiteCursor != null) {
                                }
                                if (sQLitePreparedStatement2 != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                sQLiteDatabase = qrVar.b;
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            sQLitePreparedStatement2 = executeFast;
                            sQLitePreparedStatement = null;
                        } catch (Throwable th7) {
                            th = th7;
                            sQLitePreparedStatement2 = executeFast;
                            sQLitePreparedStatement = null;
                        }
                    }
                } catch (Exception e15) {
                    e = e15;
                    sQLitePreparedStatement = null;
                } catch (Throwable th8) {
                    th = th8;
                    sQLitePreparedStatement = null;
                }
                sQLiteDatabase2.commitTransaction();
                return;
            case 1:
                int m12 = hVar.m();
                for (int i14 = 0; i14 < m12; i14++) {
                    qrVar.getNotificationCenter().k(49, Long.valueOf(hVar.j(i14)), hVar.n(i14));
                }
                return;
            case 2:
                li mediaDataController = qrVar.getMediaDataController();
                mediaDataController.r1.b();
                if (hVar != null) {
                    int m13 = hVar.m();
                    while (i10 < m13) {
                        long j11 = hVar.j(i10);
                        Integer num = (Integer) hVar.n(i10);
                        num.intValue();
                        mediaDataController.r1.k(num, j11);
                        i10++;
                    }
                    return;
                }
                return;
            default:
                nv G1 = qrVar.getMessagesController().G1();
                ArrayList arrayList5 = G1.j;
                ArrayList arrayList6 = new ArrayList();
                boolean z12 = false;
                for (int i15 = 0; i15 < hVar.m(); i15++) {
                    long j12 = hVar.j(i15);
                    ArrayList arrayList7 = (ArrayList) hVar.n(i15);
                    int i16 = 0;
                    for (int i17 = 0; i17 < arrayList7.size(); i17++) {
                        i16 = Math.max(i16, ((Integer) arrayList7.get(i17)).intValue());
                    }
                    int i18 = 0;
                    while (true) {
                        if (i18 < arrayList5.size()) {
                            arrayList = arrayList7;
                            z11 = true;
                            if (((mv) arrayList5.get(i18)).a == j12) {
                                mvVar = (mv) arrayList5.get(i18);
                            } else {
                                i18++;
                                arrayList7 = arrayList;
                            }
                        } else {
                            arrayList = arrayList7;
                            z11 = true;
                            mvVar = null;
                        }
                    }
                    if (mvVar != null) {
                        if (mvVar.i) {
                            int max = Math.max(0, mvVar.e - arrayList.size());
                            int i19 = mvVar.e;
                            if (max != i19) {
                                mvVar.e = Math.max(0, i19 - arrayList.size());
                                z12 = z11;
                            }
                        }
                        if (mvVar.i && mvVar.e <= 0) {
                            G1.j(mvVar.a);
                        } else if (mvVar.c <= i16) {
                            arrayList6.add(mvVar);
                        }
                        z12 = z11;
                    }
                }
                if (z12) {
                    if (arrayList6.isEmpty()) {
                        G1.l();
                        return;
                    }
                    int i20 = G1.a;
                    long e16 = h10.i(i20).e();
                    qr a02 = qr.a0(i20);
                    a02.a.c(new zl(G1, a02, arrayList6, e16, 17));
                    return;
                }
                return;
        }
    }
}
