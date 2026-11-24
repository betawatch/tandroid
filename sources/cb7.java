// default package

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class cb7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ad7 b;
    public final /* synthetic */ vf6 c;

    public /* synthetic */ cb7(ad7 ad7Var, vf6 vf6Var, byte b) {
        this.a = b;
        this.b = ad7Var;
        this.c = vf6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e3  */
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
        SQLitePreparedStatement executeFast;
        up9 up9Var;
        byte b = this.a;
        vf6 vf6Var = this.c;
        ad7 ad7Var = this.b;
        int i = 0;
        switch (b) {
            case 0:
                try {
                    ArrayList arrayList = new ArrayList();
                    int m = vf6Var.m();
                    for (int i2 = 0; i2 < m; i2++) {
                        SQLiteCursor queryFinalized = ad7Var.b.queryFinalized("SELECT mid, uid FROM webpage_pending_v2 WHERE id = " + vf6Var.j(i2), new Object[0]);
                        try {
                            vf6 vf6Var2 = new vf6();
                            while (queryFinalized.next()) {
                                long longValue = queryFinalized.longValue(1);
                                ArrayList arrayList2 = (ArrayList) vf6Var2.f(longValue);
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                    vf6Var2.k(arrayList2, longValue);
                                }
                                arrayList2.add(Integer.valueOf(queryFinalized.intValue(0)));
                            }
                            queryFinalized.dispose();
                            if (!vf6Var2.i()) {
                                int m2 = vf6Var2.m();
                                for (int i3 = 0; i3 < m2; i3++) {
                                    long j = vf6Var2.j(i3);
                                    ArrayList arrayList3 = (ArrayList) vf6Var2.n(i3);
                                    SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
                                    Locale locale = Locale.US;
                                    SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT mid, data FROM messages_v2 WHERE mid IN (" + TextUtils.join(",", arrayList3) + ") AND uid = " + j, new Object[0]);
                                    while (queryFinalized2.next()) {
                                        try {
                                            int intValue = queryFinalized2.intValue(0);
                                            NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(1);
                                            if (byteBufferValue != null) {
                                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                TLdeserialize.readAttachPath(byteBufferValue, ad7Var.getUserConfig().n);
                                                byteBufferValue.reuse();
                                                TLRPC.MessageMedia messageMedia = TLdeserialize.media;
                                                if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                                                    TLdeserialize.id = intValue;
                                                    messageMedia.webpage = (TLRPC.WebPage) vf6Var.n(i2);
                                                    arrayList.add(TLdeserialize);
                                                }
                                            }
                                        } catch (Exception e) {
                                            e = e;
                                            sQLiteCursor = queryFinalized2;
                                            sQLitePreparedStatement = null;
                                            sQLitePreparedStatement2 = null;
                                            try {
                                                ad7Var.n(e, true);
                                                if (sQLiteCursor != null) {
                                                    sQLiteCursor.dispose();
                                                }
                                                if (sQLitePreparedStatement2 != null) {
                                                    sQLitePreparedStatement2.dispose();
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                    sQLitePreparedStatement.dispose();
                                                }
                                                sQLiteDatabase2 = ad7Var.b;
                                                if (sQLiteDatabase2 == null) {
                                                    return;
                                                }
                                                sQLiteDatabase2.commitTransaction();
                                                return;
                                            } catch (Throwable th) {
                                                th = th;
                                                if (sQLiteCursor != null) {
                                                    sQLiteCursor.dispose();
                                                }
                                                if (sQLitePreparedStatement2 != null) {
                                                    sQLitePreparedStatement2.dispose();
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                    sQLitePreparedStatement.dispose();
                                                }
                                                sQLiteDatabase = ad7Var.b;
                                                if (sQLiteDatabase != null) {
                                                    sQLiteDatabase.commitTransaction();
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sQLiteCursor = queryFinalized2;
                                            sQLitePreparedStatement = null;
                                            sQLitePreparedStatement2 = null;
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement2 != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            sQLiteDatabase = ad7Var.b;
                                            if (sQLiteDatabase != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    queryFinalized2.dispose();
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            sQLiteCursor = queryFinalized;
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteCursor = queryFinalized;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        sQLiteDatabase2 = ad7Var.b;
                        if (sQLiteDatabase2 == null) {
                            return;
                        }
                    } else {
                        ad7Var.b.beginTransaction();
                        SQLitePreparedStatement executeFast2 = ad7Var.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                        try {
                            executeFast = ad7Var.b.executeFast("UPDATE media_v4 SET data = ? WHERE mid = ? AND uid = ?");
                            while (i < arrayList.size()) {
                                try {
                                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
                                    k27.p5(message);
                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                                    message.serializeToStream(nativeByteBuffer);
                                    executeFast2.requery();
                                    executeFast2.bindByteBuffer(1, nativeByteBuffer);
                                    executeFast2.bindInteger(2, message.id);
                                    executeFast2.bindLong(3, k27.B0(message));
                                    executeFast2.step();
                                    executeFast.requery();
                                    executeFast.bindByteBuffer(1, nativeByteBuffer);
                                    executeFast.bindInteger(2, message.id);
                                    executeFast.bindLong(3, k27.B0(message));
                                    executeFast.step();
                                    nativeByteBuffer.reuse();
                                    i++;
                                } catch (Exception e3) {
                                    e = e3;
                                    sQLitePreparedStatement2 = executeFast2;
                                    sQLitePreparedStatement = executeFast;
                                    sQLiteCursor = null;
                                    ad7Var.n(e, true);
                                    if (sQLiteCursor != null) {
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    sQLiteDatabase2 = ad7Var.b;
                                    if (sQLiteDatabase2 == null) {
                                    }
                                    sQLiteDatabase2.commitTransaction();
                                    return;
                                } catch (Throwable th4) {
                                    th = th4;
                                    sQLitePreparedStatement2 = executeFast2;
                                    sQLitePreparedStatement = executeFast;
                                    sQLiteCursor = null;
                                    if (sQLiteCursor != null) {
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    sQLiteDatabase = ad7Var.b;
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            }
                            executeFast2.dispose();
                        } catch (Exception e4) {
                            e = e4;
                            sQLitePreparedStatement2 = executeFast2;
                            sQLitePreparedStatement = null;
                        } catch (Throwable th5) {
                            th = th5;
                            sQLitePreparedStatement2 = executeFast2;
                            sQLitePreparedStatement = null;
                        }
                        try {
                            executeFast.dispose();
                            ad7Var.b.commitTransaction();
                            gl.d3(new i41(ad7Var, arrayList, (byte) 13));
                            sQLiteDatabase2 = ad7Var.b;
                            if (sQLiteDatabase2 == null) {
                                return;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            sQLitePreparedStatement = executeFast;
                            sQLiteCursor = null;
                            sQLitePreparedStatement2 = null;
                            ad7Var.n(e, true);
                            if (sQLiteCursor != null) {
                            }
                            if (sQLitePreparedStatement2 != null) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            sQLiteDatabase2 = ad7Var.b;
                            if (sQLiteDatabase2 == null) {
                            }
                            sQLiteDatabase2.commitTransaction();
                            return;
                        } catch (Throwable th6) {
                            th = th6;
                            sQLitePreparedStatement = executeFast;
                            sQLiteCursor = null;
                            sQLitePreparedStatement2 = null;
                            if (sQLiteCursor != null) {
                            }
                            if (sQLitePreparedStatement2 != null) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            sQLiteDatabase = ad7Var.b;
                            if (sQLiteDatabase != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Exception e6) {
                    e = e6;
                    sQLitePreparedStatement = null;
                } catch (Throwable th7) {
                    th = th7;
                    sQLitePreparedStatement = null;
                }
                sQLiteDatabase2.commitTransaction();
                return;
            case 1:
                int m3 = vf6Var.m();
                for (int i4 = 0; i4 < m3; i4++) {
                    ad7Var.getNotificationCenter().k(49, Long.valueOf(vf6Var.j(i4)), vf6Var.n(i4));
                }
                return;
            case 2:
                hq6 mediaDataController = ad7Var.getMediaDataController();
                mediaDataController.t1.b();
                if (vf6Var != null) {
                    int m4 = vf6Var.m();
                    while (i < m4) {
                        long j2 = vf6Var.j(i);
                        Integer num = (Integer) vf6Var.n(i);
                        num.intValue();
                        mediaDataController.t1.k(num, j2);
                        i++;
                    }
                    return;
                }
                return;
            default:
                vp9 D1 = ad7Var.getMessagesController().D1();
                ArrayList arrayList4 = D1.j;
                ArrayList arrayList5 = new ArrayList();
                boolean z = false;
                for (int i5 = 0; i5 < vf6Var.m(); i5++) {
                    long j3 = vf6Var.j(i5);
                    ArrayList arrayList6 = (ArrayList) vf6Var.n(i5);
                    int i6 = 0;
                    for (int i7 = 0; i7 < arrayList6.size(); i7++) {
                        i6 = Math.max(i6, ((Integer) arrayList6.get(i7)).intValue());
                    }
                    int i8 = 0;
                    while (true) {
                        if (i8 >= arrayList4.size()) {
                            up9Var = null;
                        } else if (((up9) arrayList4.get(i8)).a == j3) {
                            up9Var = (up9) arrayList4.get(i8);
                        } else {
                            i8++;
                        }
                    }
                    if (up9Var != null) {
                        if (up9Var.i) {
                            int max = Math.max(0, up9Var.e - arrayList6.size());
                            int i9 = up9Var.e;
                            if (max != i9) {
                                up9Var.e = Math.max(0, i9 - arrayList6.size());
                                z = true;
                            }
                        }
                        if (up9Var.i && up9Var.e <= 0) {
                            D1.i(up9Var.a);
                        } else if (up9Var.c <= i6) {
                            arrayList5.add(up9Var);
                        }
                        z = true;
                    }
                }
                if (z) {
                    if (arrayList5.isEmpty()) {
                        D1.k();
                        return;
                    }
                    int i10 = D1.a;
                    long e7 = y6c.h(i10).e();
                    ad7 Y = ad7.Y(i10);
                    Y.a.c(new mx8((Object) D1, (Object) Y, (Object) arrayList5, e7, (byte) 1));
                    return;
                }
                return;
        }
    }
}
