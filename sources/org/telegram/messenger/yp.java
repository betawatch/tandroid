package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class yp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;
    public final /* synthetic */ int c;

    public /* synthetic */ yp(hs hsVar, int i10, int i11) {
        this.a = i11;
        this.b = hsVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int i10 = this.a;
        SQLiteCursor sQLiteCursor = null;
        int i11 = 2;
        int i12 = 3;
        int i13 = this.c;
        hs hsVar = this.b;
        switch (i10) {
            case 0:
                vp messagesController = hsVar.getMessagesController();
                d20 userConfig = messagesController.getUserConfig();
                int i14 = this.c;
                if (userConfig.g(i14)[0] != 2147483647L) {
                    messagesController.S2(i14, 0, 10, false, new bl(messagesController, i14, i11));
                    return;
                } else if (i14 != 1) {
                    messagesController.f4(i14);
                    return;
                } else {
                    messagesController.k0 = false;
                    messagesController.D();
                    return;
                }
            case 1:
                hsVar.getDownloadController().t(i13);
                return;
            case 2:
                hsVar.getClass();
                try {
                    hsVar.b.executeFast("DELETE FROM shortcut_widget WHERE id = " + i13).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    hsVar.o(e, true);
                    return;
                }
            case 3:
                hs hsVar2 = this.b;
                try {
                    try {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        a0.h hVar = new a0.h();
                        SQLiteCursor queryFinalized = i13 >= 0 ? hsVar2.b.queryFinalized(String.format(Locale.US, "SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0 AND folder_id = %1$d", Integer.valueOf(i13)), new Object[0]) : hsVar2.b.queryFinalized("SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0", new Object[0]);
                        while (queryFinalized.next()) {
                            try {
                                long longValue = queryFinalized.longValue(0);
                                if (!o5.D(longValue)) {
                                    ds dsVar = new ds();
                                    dsVar.a = queryFinalized.intValue(1);
                                    dsVar.c = queryFinalized.intValue(2);
                                    dsVar.b = queryFinalized.intValue(3);
                                    hVar.k(dsVar, longValue);
                                    if (o5.C(longValue)) {
                                        int i15 = (int) (longValue & 4294967295L);
                                        if (!arrayList3.contains(Integer.valueOf(i15))) {
                                            arrayList3.add(Integer.valueOf(i15));
                                        }
                                    } else if (o5.z(longValue)) {
                                        long j10 = -longValue;
                                        if (!arrayList2.contains(Long.valueOf(j10))) {
                                            arrayList2.add(Long.valueOf(j10));
                                        }
                                    } else if (!arrayList.contains(Long.valueOf(longValue))) {
                                        arrayList.add(Long.valueOf(longValue));
                                    }
                                }
                            } catch (Exception e7) {
                                e = e7;
                                sQLiteCursor = queryFinalized;
                                hsVar2.o(e, true);
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
                            hsVar2.V(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        }
                        if (!arrayList.isEmpty()) {
                            hsVar2.n0(arrayList, arrayList4, false);
                        }
                        if (!arrayList2.isEmpty()) {
                            hsVar2.Q(TextUtils.join(",", arrayList2), arrayList5);
                        }
                        i0.g3(new cn(hsVar2, arrayList4, arrayList5, arrayList6, hVar, 13));
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e10) {
                    e = e10;
                }
            case 4:
                hsVar.l(i13);
                return;
            case 5:
                try {
                    if (i13 == 0) {
                        hsVar.b.executeFast("DELETE FROM download_queue WHERE 1").stepThis().dispose();
                    } else {
                        SQLiteDatabase sQLiteDatabase = hsVar.b;
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM download_queue WHERE type = " + i13).stepThis().dispose();
                    }
                    return;
                } catch (Exception e11) {
                    hsVar.o(e11, true);
                    return;
                }
            default:
                try {
                    try {
                        ArrayList arrayList7 = new ArrayList();
                        SQLiteDatabase sQLiteDatabase2 = hsVar.b;
                        Locale locale2 = Locale.US;
                        SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT uid, type, data, parent FROM download_queue WHERE type = " + i13 + " ORDER BY date DESC LIMIT 3", new Object[0]);
                        while (queryFinalized2.next()) {
                            try {
                                c6 c6Var = new c6();
                                c6Var.b = queryFinalized2.intValue(1);
                                c6Var.c = queryFinalized2.longValue(0);
                                c6Var.f = queryFinalized2.stringValue(3);
                                NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(2);
                                if (byteBufferValue != null) {
                                    TLRPC.MessageMedia TLdeserialize = TLRPC.MessageMedia.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    byteBufferValue.reuse();
                                    TLRPC.Document document = TLdeserialize.document;
                                    if (document != null) {
                                        c6Var.a = document;
                                        if (!jj.K4(document)) {
                                            if (!jj.Q4(TLdeserialize.document)) {
                                                if (jj.i4(TLdeserialize.document)) {
                                                }
                                                z10 = false;
                                                c6Var.d = z10;
                                            }
                                        }
                                        int i16 = TLdeserialize.ttl_seconds;
                                        if ((i16 > 0 && i16 <= 60) || i16 == Integer.MAX_VALUE) {
                                            z10 = true;
                                            c6Var.d = z10;
                                        }
                                        z10 = false;
                                        c6Var.d = z10;
                                    } else {
                                        TLRPC.Photo photo = TLdeserialize.photo;
                                        if (photo != null) {
                                            c6Var.a = photo;
                                            int i17 = TLdeserialize.ttl_seconds;
                                            c6Var.d = (i17 > 0 && i17 <= 60) || i17 == Integer.MAX_VALUE;
                                        }
                                    }
                                    c6Var.e = (TLdeserialize.flags & TLObject.FLAG_31) != 0;
                                }
                                arrayList7.add(c6Var);
                            } catch (Exception e12) {
                                e = e12;
                                sQLiteCursor = queryFinalized2;
                                hsVar.o(e, true);
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
                        i0.g3(new zp(hsVar, i13, arrayList7, i12));
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Exception e13) {
                    e = e13;
                }
                return;
        }
    }
}
