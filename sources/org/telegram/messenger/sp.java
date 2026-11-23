package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class sp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur b;
    public final /* synthetic */ int c;

    public /* synthetic */ sp(ur urVar, int i7, int i10) {
        this.a = i10;
        this.b = urVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int i7 = this.a;
        SQLiteCursor sQLiteCursor = null;
        int i10 = 2;
        int i11 = this.c;
        ur urVar = this.b;
        switch (i7) {
            case 0:
                urVar.getDownloadController().t(i11);
                return;
            case 1:
                urVar.getClass();
                try {
                    urVar.b.executeFast("DELETE FROM shortcut_widget WHERE id = " + i11).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    urVar.o(e10, true);
                    return;
                }
            case 2:
                ur urVar2 = this.b;
                try {
                    try {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        a0.h hVar = new a0.h();
                        SQLiteCursor queryFinalized = i11 >= 0 ? urVar2.b.queryFinalized(String.format(Locale.US, "SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0 AND folder_id = %1$d", Integer.valueOf(i11)), new Object[0]) : urVar2.b.queryFinalized("SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0", new Object[0]);
                        while (queryFinalized.next()) {
                            try {
                                long longValue = queryFinalized.longValue(0);
                                if (!n5.D(longValue)) {
                                    qr qrVar = new qr();
                                    qrVar.a = queryFinalized.intValue(1);
                                    qrVar.c = queryFinalized.intValue(2);
                                    qrVar.b = queryFinalized.intValue(3);
                                    hVar.k(qrVar, longValue);
                                    if (n5.C(longValue)) {
                                        int i12 = (int) (longValue & 4294967295L);
                                        if (!arrayList3.contains(Integer.valueOf(i12))) {
                                            arrayList3.add(Integer.valueOf(i12));
                                        }
                                    } else if (n5.z(longValue)) {
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
                                urVar2.o(e, true);
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
                            urVar2.V(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        }
                        if (!arrayList.isEmpty()) {
                            urVar2.n0(arrayList, arrayList4, false);
                        }
                        if (!arrayList2.isEmpty()) {
                            urVar2.Q(TextUtils.join(",", arrayList2), arrayList5);
                        }
                        g0.g3(new gn(urVar2, arrayList4, arrayList5, arrayList6, hVar, 13));
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            case 3:
                urVar.l(i11);
                return;
            case 4:
                try {
                    if (i11 == 0) {
                        urVar.b.executeFast("DELETE FROM download_queue WHERE 1").stepThis().dispose();
                    } else {
                        SQLiteDatabase sQLiteDatabase = urVar.b;
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM download_queue WHERE type = " + i11).stepThis().dispose();
                    }
                    return;
                } catch (Exception e13) {
                    urVar.o(e13, true);
                    return;
                }
            case 5:
                try {
                    try {
                        ArrayList arrayList7 = new ArrayList();
                        SQLiteDatabase sQLiteDatabase2 = urVar.b;
                        Locale locale2 = Locale.US;
                        SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT uid, type, data, parent FROM download_queue WHERE type = " + i11 + " ORDER BY date DESC LIMIT 3", new Object[0]);
                        while (queryFinalized2.next()) {
                            try {
                                b6 b6Var = new b6();
                                b6Var.b = queryFinalized2.intValue(1);
                                b6Var.c = queryFinalized2.longValue(0);
                                b6Var.f = queryFinalized2.stringValue(3);
                                NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(2);
                                if (byteBufferValue != null) {
                                    TLRPC.MessageMedia TLdeserialize = TLRPC.MessageMedia.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    byteBufferValue.reuse();
                                    TLRPC.Document document = TLdeserialize.document;
                                    if (document != null) {
                                        b6Var.a = document;
                                        if (!gj.K4(document)) {
                                            if (!gj.Q4(TLdeserialize.document)) {
                                                if (gj.i4(TLdeserialize.document)) {
                                                }
                                                z10 = false;
                                                b6Var.d = z10;
                                            }
                                        }
                                        int i13 = TLdeserialize.ttl_seconds;
                                        if ((i13 > 0 && i13 <= 60) || i13 == Integer.MAX_VALUE) {
                                            z10 = true;
                                            b6Var.d = z10;
                                        }
                                        z10 = false;
                                        b6Var.d = z10;
                                    } else {
                                        TLRPC.Photo photo = TLdeserialize.photo;
                                        if (photo != null) {
                                            b6Var.a = photo;
                                            int i14 = TLdeserialize.ttl_seconds;
                                            b6Var.d = (i14 > 0 && i14 <= 60) || i14 == Integer.MAX_VALUE;
                                        }
                                    }
                                    b6Var.e = (TLdeserialize.flags & TLObject.FLAG_31) != 0;
                                }
                                arrayList7.add(b6Var);
                            } catch (Exception e14) {
                                e = e14;
                                sQLiteCursor = queryFinalized2;
                                urVar.o(e, true);
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
                        g0.g3(new up(urVar, i11, arrayList7, i10));
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Exception e15) {
                    e = e15;
                }
                return;
            default:
                np messagesController = urVar.getMessagesController();
                k10 userConfig = messagesController.getUserConfig();
                int i15 = this.c;
                if (userConfig.g(i15)[0] != 2147483647L) {
                    messagesController.a3(i15, 0, 10, false, new qk(messagesController, i15, i10));
                    return;
                } else if (i15 != 1) {
                    messagesController.q4(i15);
                    return;
                } else {
                    messagesController.l0 = false;
                    messagesController.D();
                    return;
                }
        }
    }
}
