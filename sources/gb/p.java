package gb;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class p implements db.v {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // db.v
    public final db.u create(db.g gVar, kb.a aVar) {
        switch (this.a) {
            case 0:
                if (aVar.a == Number.class) {
                    return (q) this.b;
                }
                return null;
            case 1:
                if (aVar.a == Object.class) {
                    return new r(gVar, (db.t) this.b);
                }
                return null;
            default:
                Class cls = aVar.a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (s0) this.b;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((s0) this.b) + "]";
            default:
                return super.toString();
        }
    }
}
