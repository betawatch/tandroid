// default package

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class o6c implements xcb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lo9 b;

    public /* synthetic */ o6c(lo9 lo9Var, byte b) {
        this.a = b;
        this.b = lo9Var;
    }

    @Override // xcb
    public final Object m() {
        SQLiteDatabase a;
        byte b = this.a;
        lo9 lo9Var = this.b;
        switch (b) {
            case 0:
                lo9Var.getClass();
                int i = mi2.e;
                wtc wtcVar = new wtc();
                wtcVar.a = null;
                wtcVar.b = new ArrayList();
                wtcVar.c = null;
                wtcVar.d = "";
                HashMap hashMap = new HashMap();
                a = lo9Var.a();
                a.beginTransaction();
                try {
                    mi2 mi2Var = (mi2) lo9.h(a.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new io9(lo9Var, hashMap, wtcVar, (byte) 1));
                    a.setTransactionSuccessful();
                    return mi2Var;
                } finally {
                }
            default:
                long e = lo9Var.b.e() - lo9Var.d.d;
                a = lo9Var.a();
                a.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(e)};
                    Cursor rawQuery = a.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            lo9Var.e(rawQuery.getInt(0), xb6.c, rawQuery.getString(1));
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
