// default package

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class kc7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ad7 b;
    public final /* synthetic */ byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ kc7(ad7 ad7Var, int i, byte b) {
        this.a = b;
        this.b = ad7Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        byte b = this.a;
        byte b2 = this.c;
        ad7 ad7Var = this.b;
        switch (b) {
            case 0:
                try {
                    SQLiteDatabase sQLiteDatabase = ad7Var.b;
                    if (b2 == 0) {
                        sQLiteDatabase.executeFast("DELETE FROM download_queue WHERE 1").stepThis().dispose();
                    } else {
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM download_queue WHERE type = " + ((int) b2)).stepThis().dispose();
                    }
                    return;
                } catch (Exception e) {
                    ad7Var.n(e, true);
                    return;
                }
            default:
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        ArrayList arrayList = new ArrayList();
                        SQLiteDatabase sQLiteDatabase2 = ad7Var.b;
                        Locale locale2 = Locale.US;
                        try {
                            SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT uid, type, data, parent FROM download_queue WHERE type = " + ((int) b2) + " ORDER BY date DESC LIMIT 3", new Object[0]);
                            while (queryFinalized.next()) {
                                try {
                                    vp3 vp3Var = new vp3();
                                    vp3Var.b = queryFinalized.intValue(1);
                                    vp3Var.c = queryFinalized.longValue(0);
                                    vp3Var.f = queryFinalized.stringValue(3);
                                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(2);
                                    if (byteBufferValue != null) {
                                        TLRPC.MessageMedia TLdeserialize = TLRPC.MessageMedia.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                        byteBufferValue.reuse();
                                        TLRPC.Document document = TLdeserialize.document;
                                        if (document != null) {
                                            vp3Var.a = document;
                                            vp3Var.d = (k27.J4(document) || k27.P4(TLdeserialize.document) || k27.h4(TLdeserialize.document)) && (((i = TLdeserialize.ttl_seconds) > 0 && i <= 60) || i == Integer.MAX_VALUE);
                                        } else {
                                            TLRPC.Photo photo = TLdeserialize.photo;
                                            if (photo != null) {
                                                vp3Var.a = photo;
                                                int i2 = TLdeserialize.ttl_seconds;
                                                vp3Var.d = (i2 > 0 && i2 <= 60) || i2 == Integer.MAX_VALUE;
                                            }
                                        }
                                        vp3Var.e = (TLdeserialize.flags & TLObject.FLAG_31) != 0;
                                    }
                                    arrayList.add(vp3Var);
                                } catch (Exception e2) {
                                    e = e2;
                                    sQLiteCursor = queryFinalized;
                                    ad7Var.n(e, true);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    sQLiteCursor = queryFinalized;
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th;
                                }
                            }
                            queryFinalized.dispose();
                            gl.d3(new o94((Object) ad7Var, (int) b2, (Object) arrayList, (byte) 12));
                        } catch (Exception e3) {
                            e = e3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e4) {
                    e = e4;
                }
                return;
        }
    }
}
