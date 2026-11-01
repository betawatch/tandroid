package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class iq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ is b;
    public final /* synthetic */ a0.h c;

    public /* synthetic */ iq(is isVar, a0.h hVar, int i10) {
        this.a = i10;
        this.b = isVar;
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
        gw gwVar;
        int i10 = this.a;
        a0.h hVar = this.c;
        is isVar = this.b;
        int i11 = 0;
        switch (i10) {
            case 0:
                int i12 = 1;
                try {
                    ArrayList arrayList2 = new ArrayList();
                    int m10 = hVar.m();
                    int i13 = 0;
                    while (i13 < m10) {
                        SQLiteCursor queryFinalized = isVar.b.queryFinalized("SELECT mid, uid FROM webpage_pending_v2 WHERE id = " + hVar.j(i13), new Object[0]);
                        try {
                            a0.h hVar2 = new a0.h();
                            while (queryFinalized.next()) {
                                long longValue = queryFinalized.longValue(i12);
                                ArrayList arrayList3 = (ArrayList) hVar2.f(longValue);
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                    hVar2.k(arrayList3, longValue);
                                }
                                arrayList3.add(Integer.valueOf(queryFinalized.intValue(0)));
                                i12 = 1;
                            }
                            queryFinalized.dispose();
                            if (!hVar2.i()) {
                                int m11 = hVar2.m();
                                for (int i14 = 0; i14 < m11; i14++) {
                                    long j10 = hVar2.j(i14);
                                    ArrayList arrayList4 = (ArrayList) hVar2.n(i14);
                                    SQLiteDatabase sQLiteDatabase3 = isVar.b;
                                    Locale locale = Locale.US;
                                    SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT mid, data FROM messages_v2 WHERE mid IN (" + TextUtils.join(",", arrayList4) + ") AND uid = " + j10, new Object[0]);
                                    while (queryFinalized2.next()) {
                                        try {
                                            int intValue = queryFinalized2.intValue(0);
                                            NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(1);
                                            if (byteBufferValue != null) {
                                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                TLdeserialize.readAttachPath(byteBufferValue, isVar.getUserConfig().n);
                                                byteBufferValue.reuse();
                                                TLRPC.MessageMedia messageMedia = TLdeserialize.media;
                                                if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                                                    TLdeserialize.id = intValue;
                                                    messageMedia.webpage = (TLRPC.WebPage) hVar.n(i13);
                                                    arrayList2.add(TLdeserialize);
                                                }
                                            }
                                        } catch (Exception e) {
                                            e = e;
                                            sQLiteCursor = queryFinalized2;
                                            sQLitePreparedStatement = null;
                                            z10 = true;
                                            sQLitePreparedStatement2 = null;
                                            try {
                                                isVar.o(e, z10);
                                                if (sQLiteCursor != null) {
                                                    sQLiteCursor.dispose();
                                                }
                                                if (sQLitePreparedStatement2 != null) {
                                                    sQLitePreparedStatement2.dispose();
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                    sQLitePreparedStatement.dispose();
                                                }
                                                sQLiteDatabase2 = isVar.b;
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
                                                sQLiteDatabase = isVar.b;
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
                                            sQLiteDatabase = isVar.b;
                                            if (sQLiteDatabase != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    queryFinalized2.dispose();
                                }
                            }
                            i13++;
                            i12 = 1;
                        } catch (Exception e7) {
                            e = e7;
                            sQLiteCursor = queryFinalized;
                        } catch (Throwable th4) {
                            th = th4;
                            sQLiteCursor = queryFinalized;
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        sQLiteDatabase2 = isVar.b;
                        if (sQLiteDatabase2 == null) {
                            return;
                        }
                    } else {
                        isVar.b.beginTransaction();
                        SQLitePreparedStatement executeFast = isVar.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                        try {
                            SQLitePreparedStatement executeFast2 = isVar.b.executeFast("UPDATE media_v4 SET data = ? WHERE mid = ? AND uid = ?");
                            while (i11 < arrayList2.size()) {
                                try {
                                    TLRPC.Message message = (TLRPC.Message) arrayList2.get(i11);
                                    kj.q5(message);
                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                                    message.serializeToStream(nativeByteBuffer);
                                    executeFast.requery();
                                    executeFast.bindByteBuffer(1, nativeByteBuffer);
                                    executeFast.bindInteger(2, message.id);
                                    executeFast.bindLong(3, kj.B0(message));
                                    executeFast.step();
                                    executeFast2.requery();
                                    executeFast2.bindByteBuffer(1, nativeByteBuffer);
                                    executeFast2.bindInteger(2, message.id);
                                    executeFast2.bindLong(3, kj.B0(message));
                                    executeFast2.step();
                                    nativeByteBuffer.reuse();
                                    i11++;
                                } catch (Exception e10) {
                                    e = e10;
                                    sQLitePreparedStatement2 = executeFast;
                                    sQLitePreparedStatement = executeFast2;
                                    sQLiteCursor = null;
                                    z10 = true;
                                    isVar.o(e, z10);
                                    if (sQLiteCursor != null) {
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    sQLiteDatabase2 = isVar.b;
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
                                    sQLiteDatabase = isVar.b;
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            }
                            executeFast.dispose();
                            try {
                                executeFast2.dispose();
                                isVar.b.commitTransaction();
                                i0.g3(new yp(isVar, arrayList2, 11));
                                sQLiteDatabase2 = isVar.b;
                                if (sQLiteDatabase2 == null) {
                                    return;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                sQLitePreparedStatement = executeFast2;
                                sQLiteCursor = null;
                                z10 = true;
                                sQLitePreparedStatement2 = null;
                                isVar.o(e, z10);
                                if (sQLiteCursor != null) {
                                }
                                if (sQLitePreparedStatement2 != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                sQLiteDatabase2 = isVar.b;
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
                                sQLiteDatabase = isVar.b;
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            sQLitePreparedStatement2 = executeFast;
                            sQLitePreparedStatement = null;
                        } catch (Throwable th7) {
                            th = th7;
                            sQLitePreparedStatement2 = executeFast;
                            sQLitePreparedStatement = null;
                        }
                    }
                } catch (Exception e13) {
                    e = e13;
                    sQLitePreparedStatement = null;
                } catch (Throwable th8) {
                    th = th8;
                    sQLitePreparedStatement = null;
                }
                sQLiteDatabase2.commitTransaction();
                return;
            case 1:
                int m12 = hVar.m();
                for (int i15 = 0; i15 < m12; i15++) {
                    isVar.getNotificationCenter().k(49, Long.valueOf(hVar.j(i15)), hVar.n(i15));
                }
                return;
            case 2:
                vi mediaDataController = isVar.getMediaDataController();
                mediaDataController.q1.b();
                if (hVar != null) {
                    int m13 = hVar.m();
                    while (i11 < m13) {
                        long j11 = hVar.j(i11);
                        Integer num = (Integer) hVar.n(i11);
                        num.intValue();
                        mediaDataController.q1.k(num, j11);
                        i11++;
                    }
                    return;
                }
                return;
            default:
                hw F1 = isVar.getMessagesController().F1();
                ArrayList arrayList5 = F1.j;
                ArrayList arrayList6 = new ArrayList();
                boolean z12 = false;
                for (int i16 = 0; i16 < hVar.m(); i16++) {
                    long j12 = hVar.j(i16);
                    ArrayList arrayList7 = (ArrayList) hVar.n(i16);
                    int i17 = 0;
                    for (int i18 = 0; i18 < arrayList7.size(); i18++) {
                        i17 = Math.max(i17, ((Integer) arrayList7.get(i18)).intValue());
                    }
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList5.size()) {
                            arrayList = arrayList7;
                            z11 = true;
                            if (((gw) arrayList5.get(i19)).a == j12) {
                                gwVar = (gw) arrayList5.get(i19);
                            } else {
                                i19++;
                                arrayList7 = arrayList;
                            }
                        } else {
                            arrayList = arrayList7;
                            z11 = true;
                            gwVar = null;
                        }
                    }
                    if (gwVar != null) {
                        if (gwVar.i) {
                            int max = Math.max(0, gwVar.e - arrayList.size());
                            int i20 = gwVar.e;
                            if (max != i20) {
                                gwVar.e = Math.max(0, i20 - arrayList.size());
                                z12 = z11;
                            }
                        }
                        if (gwVar.i && gwVar.e <= 0) {
                            F1.j(gwVar.a);
                        } else if (gwVar.c <= i17) {
                            arrayList6.add(gwVar);
                        }
                        z12 = z11;
                    }
                }
                if (z12) {
                    if (arrayList6.isEmpty()) {
                        F1.l();
                        return;
                    }
                    int i21 = F1.a;
                    long e14 = e20.i(i21).e();
                    is a02 = is.a0(i21);
                    a02.a.c(new xm(F1, a02, arrayList6, e14, 18));
                    return;
                }
                return;
        }
    }
}
