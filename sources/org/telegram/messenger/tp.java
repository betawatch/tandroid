package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class tp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vr b;
    public final /* synthetic */ int c;

    public /* synthetic */ tp(vr vrVar, int i7, int i10) {
        this.a = i10;
        this.b = vrVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int i7 = this.a;
        SQLiteCursor sQLiteCursor = null;
        int i10 = 2;
        int i11 = 3;
        int i12 = this.c;
        vr vrVar = this.b;
        switch (i7) {
            case 0:
                vrVar.getDownloadController().t(i12);
                return;
            case 1:
                vrVar.getClass();
                try {
                    vrVar.b.executeFast("DELETE FROM shortcut_widget WHERE id = " + i12).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    vrVar.o(e10, true);
                    return;
                }
            case 2:
                vr vrVar2 = this.b;
                try {
                    try {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        a0.h hVar = new a0.h();
                        SQLiteCursor queryFinalized = i12 >= 0 ? vrVar2.b.queryFinalized(String.format(Locale.US, "SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0 AND folder_id = %1$d", Integer.valueOf(i12)), new Object[0]) : vrVar2.b.queryFinalized("SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0", new Object[0]);
                        while (queryFinalized.next()) {
                            try {
                                long longValue = queryFinalized.longValue(0);
                                if (!m5.D(longValue)) {
                                    rr rrVar = new rr();
                                    rrVar.a = queryFinalized.intValue(1);
                                    rrVar.c = queryFinalized.intValue(2);
                                    rrVar.b = queryFinalized.intValue(3);
                                    hVar.k(rrVar, longValue);
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
                                vrVar2.o(e, true);
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
                            vrVar2.V(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        }
                        if (!arrayList.isEmpty()) {
                            vrVar2.n0(arrayList, arrayList4, false);
                        }
                        if (!arrayList2.isEmpty()) {
                            vrVar2.Q(TextUtils.join(",", arrayList2), arrayList5);
                        }
                        g0.h3(new jn(vrVar2, arrayList4, arrayList5, arrayList6, hVar, 13));
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            case 3:
                try {
                    if (i12 == 0) {
                        vrVar.b.executeFast("DELETE FROM download_queue WHERE 1").stepThis().dispose();
                    } else {
                        SQLiteDatabase sQLiteDatabase = vrVar.b;
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM download_queue WHERE type = " + i12).stepThis().dispose();
                    }
                    return;
                } catch (Exception e13) {
                    vrVar.o(e13, true);
                    return;
                }
            case 4:
                vrVar.l(i12);
                return;
            case 5:
                try {
                    try {
                        ArrayList arrayList7 = new ArrayList();
                        SQLiteDatabase sQLiteDatabase2 = vrVar.b;
                        Locale locale2 = Locale.US;
                        SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT uid, type, data, parent FROM download_queue WHERE type = " + i12 + " ORDER BY date DESC LIMIT 3", new Object[0]);
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
                                        if (!gj.K4(document)) {
                                            if (!gj.Q4(TLdeserialize.document)) {
                                                if (gj.i4(TLdeserialize.document)) {
                                                }
                                                z10 = false;
                                                a6Var.d = z10;
                                            }
                                        }
                                        int i14 = TLdeserialize.ttl_seconds;
                                        if ((i14 > 0 && i14 <= 60) || i14 == Integer.MAX_VALUE) {
                                            z10 = true;
                                            a6Var.d = z10;
                                        }
                                        z10 = false;
                                        a6Var.d = z10;
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
                                vrVar.o(e, true);
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
                        g0.h3(new op(vrVar, i12, arrayList7, i10));
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Exception e15) {
                    e = e15;
                }
                return;
            default:
                np messagesController = vrVar.getMessagesController();
                m10 userConfig = messagesController.getUserConfig();
                int i16 = this.c;
                if (userConfig.g(i16)[0] != 2147483647L) {
                    messagesController.U2(i16, 0, 10, false, new rk(messagesController, i16, i11));
                    return;
                } else if (i16 != 1) {
                    messagesController.i4(i16);
                    return;
                } else {
                    messagesController.l0 = false;
                    messagesController.D();
                    return;
                }
        }
    }
}
