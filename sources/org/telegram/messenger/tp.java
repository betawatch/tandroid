package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class tp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr b;
    public final /* synthetic */ int c;

    public /* synthetic */ tp(yr yrVar, int i7, int i10) {
        this.a = i10;
        this.b = yrVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        int i7 = this.a;
        SQLiteCursor sQLiteCursor = null;
        int i10 = 3;
        int i11 = this.c;
        yr yrVar = this.b;
        switch (i7) {
            case 0:
                qp messagesController = yrVar.getMessagesController();
                p10 userConfig = messagesController.getUserConfig();
                int i12 = this.c;
                if (userConfig.g(i12)[0] != 2147483647L) {
                    messagesController.U2(i12, 0, 10, false, new tk(messagesController, i12, i10));
                    return;
                } else if (i12 != 1) {
                    messagesController.i4(i12);
                    return;
                } else {
                    messagesController.k0 = false;
                    messagesController.D();
                    return;
                }
            case 1:
                yrVar.getDownloadController().t(i11);
                return;
            case 2:
                yrVar.getClass();
                try {
                    yrVar.b.executeFast("DELETE FROM shortcut_widget WHERE id = " + i11).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    yrVar.o(e10, true);
                    return;
                }
            case 3:
                yr yrVar2 = this.b;
                try {
                    try {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        a0.h hVar = new a0.h();
                        SQLiteCursor queryFinalized = i11 >= 0 ? yrVar2.b.queryFinalized(String.format(Locale.US, "SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0 AND folder_id = %1$d", Integer.valueOf(i11)), new Object[0]) : yrVar2.b.queryFinalized("SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0", new Object[0]);
                        while (queryFinalized.next()) {
                            try {
                                long longValue = queryFinalized.longValue(0);
                                if (!m5.D(longValue)) {
                                    ur urVar = new ur();
                                    urVar.a = queryFinalized.intValue(1);
                                    urVar.c = queryFinalized.intValue(2);
                                    urVar.b = queryFinalized.intValue(3);
                                    hVar.k(urVar, longValue);
                                    if (m5.C(longValue)) {
                                        int i13 = (int) (longValue & 4294967295L);
                                        if (!arrayList3.contains(Integer.valueOf(i13))) {
                                            arrayList3.add(Integer.valueOf(i13));
                                        }
                                    } else if (m5.z(longValue)) {
                                        long j3 = -longValue;
                                        if (!arrayList2.contains(Long.valueOf(j3))) {
                                            arrayList2.add(Long.valueOf(j3));
                                        }
                                    } else if (!arrayList.contains(Long.valueOf(longValue))) {
                                        arrayList.add(Long.valueOf(longValue));
                                    }
                                }
                            } catch (Exception e11) {
                                e = e11;
                                sQLiteCursor = queryFinalized;
                                yrVar2.o(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteCursor = queryFinalized;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        }
                        queryFinalized.dispose();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        if (!arrayList3.isEmpty()) {
                            yrVar2.V(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        }
                        if (!arrayList.isEmpty()) {
                            yrVar2.n0(arrayList, arrayList4, false);
                        }
                        if (!arrayList2.isEmpty()) {
                            yrVar2.Q(TextUtils.join(",", arrayList2), arrayList5);
                        }
                        g0.h3(new mn(yrVar2, arrayList4, arrayList5, arrayList6, hVar, 13));
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            case 4:
                try {
                    if (i11 == 0) {
                        yrVar.b.executeFast("DELETE FROM download_queue WHERE 1").stepThis().dispose();
                    } else {
                        SQLiteDatabase sQLiteDatabase = yrVar.b;
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM download_queue WHERE type = " + i11).stepThis().dispose();
                    }
                    return;
                } catch (Exception e13) {
                    yrVar.o(e13, true);
                    return;
                }
            case 5:
                yrVar.l(i11);
                return;
            default:
                try {
                    try {
                        ArrayList arrayList7 = new ArrayList();
                        SQLiteDatabase sQLiteDatabase2 = yrVar.b;
                        Locale locale2 = Locale.US;
                        SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT uid, type, data, parent FROM download_queue WHERE type = " + i11 + " ORDER BY date DESC LIMIT 3", new Object[0]);
                        while (queryFinalized2.next()) {
                            try {
                                a6 a6Var = new a6();
                                a6Var.b = queryFinalized2.intValue(1);
                                a6Var.c = queryFinalized2.longValue(0);
                                a6Var.f = queryFinalized2.stringValue(3);
                                NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(2);
                                if (byteBufferValue != null) {
                                    TLRPC.MessageMedia TLdeserialize = TLRPC.MessageMedia.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    byteBufferValue.reuse();
                                    TLRPC.Document document = TLdeserialize.document;
                                    if (document != null) {
                                        a6Var.a = document;
                                        if (!ij.L4(document)) {
                                            if (!ij.R4(TLdeserialize.document)) {
                                                if (ij.j4(TLdeserialize.document)) {
                                                }
                                                z9 = false;
                                                a6Var.d = z9;
                                            }
                                        }
                                        int i14 = TLdeserialize.ttl_seconds;
                                        if ((i14 > 0 && i14 <= 60) || i14 == Integer.MAX_VALUE) {
                                            z9 = true;
                                            a6Var.d = z9;
                                        }
                                        z9 = false;
                                        a6Var.d = z9;
                                    } else {
                                        TLRPC.Photo photo = TLdeserialize.photo;
                                        if (photo != null) {
                                            a6Var.a = photo;
                                            int i15 = TLdeserialize.ttl_seconds;
                                            a6Var.d = (i15 > 0 && i15 <= 60) || i15 == Integer.MAX_VALUE;
                                        }
                                    }
                                    a6Var.e = (TLdeserialize.flags & TLObject.FLAG_31) != 0;
                                }
                                arrayList7.add(a6Var);
                            } catch (Exception e14) {
                                e = e14;
                                sQLiteCursor = queryFinalized2;
                                yrVar.o(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                sQLiteCursor = queryFinalized2;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        }
                        queryFinalized2.dispose();
                        g0.h3(new up(yrVar, i11, arrayList7, i10));
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Exception e15) {
                    e = e15;
                }
                return;
        }
    }
}
