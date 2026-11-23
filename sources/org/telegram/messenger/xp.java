package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class xp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur b;
    public final /* synthetic */ a0.h c;

    public /* synthetic */ xp(ur urVar, a0.h hVar, int i7) {
        this.a = i7;
        this.b = urVar;
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
        pv pvVar;
        int i7 = this.a;
        a0.h hVar = this.c;
        ur urVar = this.b;
        int i10 = 0;
        switch (i7) {
            case 0:
                int i11 = 1;
                try {
                    ArrayList arrayList2 = new ArrayList();
                    int m10 = hVar.m();
                    int i12 = 0;
                    while (i12 < m10) {
                        SQLiteCursor queryFinalized = urVar.b.queryFinalized("SELECT mid, uid FROM webpage_pending_v2 WHERE id = " + hVar.j(i12), new Object[0]);
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
                                    long j3 = hVar2.j(i13);
                                    ArrayList arrayList4 = (ArrayList) hVar2.n(i13);
                                    SQLiteDatabase sQLiteDatabase3 = urVar.b;
                                    Locale locale = Locale.US;
                                    SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT mid, data FROM messages_v2 WHERE mid IN (" + TextUtils.join(",", arrayList4) + ") AND uid = " + j3, new Object[0]);
                                    while (queryFinalized2.next()) {
                                        try {
                                            int intValue = queryFinalized2.intValue(0);
                                            NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(1);
                                            if (byteBufferValue != null) {
                                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                TLdeserialize.readAttachPath(byteBufferValue, urVar.getUserConfig().n);
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
                                                urVar.o(e, z10);
                                                if (sQLiteCursor != null) {
                                                    sQLiteCursor.dispose();
                                                }
                                                if (sQLitePreparedStatement2 != null) {
                                                    sQLitePreparedStatement2.dispose();
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                    sQLitePreparedStatement.dispose();
                                                }
                                                sQLiteDatabase2 = urVar.b;
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
                                                sQLiteDatabase = urVar.b;
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
                                            sQLiteDatabase = urVar.b;
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
                        sQLiteDatabase2 = urVar.b;
                        if (sQLiteDatabase2 == null) {
                            return;
                        }
                    } else {
                        urVar.b.beginTransaction();
                        SQLitePreparedStatement executeFast = urVar.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                        try {
                            SQLitePreparedStatement executeFast2 = urVar.b.executeFast("UPDATE media_v4 SET data = ? WHERE mid = ? AND uid = ?");
                            while (i10 < arrayList2.size()) {
                                try {
                                    TLRPC.Message message = (TLRPC.Message) arrayList2.get(i10);
                                    gj.q5(message);
                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                                    message.serializeToStream(nativeByteBuffer);
                                    executeFast.requery();
                                    executeFast.bindByteBuffer(1, nativeByteBuffer);
                                    executeFast.bindInteger(2, message.id);
                                    executeFast.bindLong(3, gj.B0(message));
                                    executeFast.step();
                                    executeFast2.requery();
                                    executeFast2.bindByteBuffer(1, nativeByteBuffer);
                                    executeFast2.bindInteger(2, message.id);
                                    executeFast2.bindLong(3, gj.B0(message));
                                    executeFast2.step();
                                    nativeByteBuffer.reuse();
                                    i10++;
                                } catch (Exception e12) {
                                    e = e12;
                                    sQLitePreparedStatement2 = executeFast;
                                    sQLitePreparedStatement = executeFast2;
                                    sQLiteCursor = null;
                                    z10 = true;
                                    urVar.o(e, z10);
                                    if (sQLiteCursor != null) {
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    sQLiteDatabase2 = urVar.b;
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
                                    sQLiteDatabase = urVar.b;
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            }
                            executeFast.dispose();
                            try {
                                executeFast2.dispose();
                                urVar.b.commitTransaction();
                                g0.g3(new rp(urVar, arrayList2, 11));
                                sQLiteDatabase2 = urVar.b;
                                if (sQLiteDatabase2 == null) {
                                    return;
                                }
                            } catch (Exception e13) {
                                e = e13;
                                sQLitePreparedStatement = executeFast2;
                                sQLiteCursor = null;
                                z10 = true;
                                sQLitePreparedStatement2 = null;
                                urVar.o(e, z10);
                                if (sQLiteCursor != null) {
                                }
                                if (sQLitePreparedStatement2 != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                sQLiteDatabase2 = urVar.b;
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
                                sQLiteDatabase = urVar.b;
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
                    urVar.getNotificationCenter().k(49, Long.valueOf(hVar.j(i14)), hVar.n(i14));
                }
                return;
            case 2:
                si mediaDataController = urVar.getMediaDataController();
                mediaDataController.t1.b();
                if (hVar != null) {
                    int m13 = hVar.m();
                    while (i10 < m13) {
                        long j10 = hVar.j(i10);
                        Integer num = (Integer) hVar.n(i10);
                        num.intValue();
                        mediaDataController.t1.k(num, j10);
                        i10++;
                    }
                    return;
                }
                return;
            default:
                qv I1 = urVar.getMessagesController().I1();
                ArrayList arrayList5 = I1.j;
                ArrayList arrayList6 = new ArrayList();
                boolean z12 = false;
                for (int i15 = 0; i15 < hVar.m(); i15++) {
                    long j11 = hVar.j(i15);
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
                            if (((pv) arrayList5.get(i18)).a == j11) {
                                pvVar = (pv) arrayList5.get(i18);
                            } else {
                                i18++;
                                arrayList7 = arrayList;
                            }
                        } else {
                            arrayList = arrayList7;
                            z11 = true;
                            pvVar = null;
                        }
                    }
                    if (pvVar != null) {
                        if (pvVar.i) {
                            int max = Math.max(0, pvVar.e - arrayList.size());
                            int i19 = pvVar.e;
                            if (max != i19) {
                                pvVar.e = Math.max(0, i19 - arrayList.size());
                                z12 = z11;
                            }
                        }
                        if (pvVar.i && pvVar.e <= 0) {
                            I1.j(pvVar.a);
                        } else if (pvVar.c <= i16) {
                            arrayList6.add(pvVar);
                        }
                        z12 = z11;
                    }
                }
                if (z12) {
                    if (arrayList6.isEmpty()) {
                        I1.l();
                        return;
                    }
                    int i20 = I1.a;
                    long e16 = k10.i(i20).e();
                    ur a02 = ur.a0(i20);
                    a02.a.c(new gm(I1, a02, arrayList6, e16, 17));
                    return;
                }
                return;
        }
    }
}
