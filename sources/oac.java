// default package

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class oac implements sgb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ds9 b;

    public /* synthetic */ oac(ds9 ds9Var, byte b) {
        this.a = b;
        this.b = ds9Var;
    }

    @Override // sgb
    public final Object g() {
        SQLiteDatabase a;
        byte b = this.a;
        ds9 ds9Var = this.b;
        switch (b) {
            case 0:
                ds9Var.getClass();
                int i = ij2.e;
                lyc lycVar = new lyc((byte) 3, false);
                lycVar.b = null;
                lycVar.c = new ArrayList();
                lycVar.d = null;
                lycVar.e = "";
                HashMap hashMap = new HashMap();
                a = ds9Var.a();
                a.beginTransaction();
                try {
                    ij2 ij2Var = (ij2) ds9.h(a.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new o48(ds9Var, hashMap, lycVar, (byte) 10));
                    a.setTransactionSuccessful();
                    return ij2Var;
                } finally {
                }
            default:
                long e = ds9Var.b.e() - ds9Var.d.d;
                a = ds9Var.a();
                a.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(e)};
                    Cursor rawQuery = a.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            ds9Var.e(rawQuery.getInt(0), be6.c, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = a.delete("events", "timestamp_ms < ?", strArr);
                    a.setTransactionSuccessful();
                    a.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
        }
    }
}
