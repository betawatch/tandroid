package oa;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p implements la.v {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // la.v
    public final la.u create(la.g gVar, sa.a aVar) {
        switch (this.a) {
            case 0:
                if (aVar.a == Number.class) {
                    return (q) this.b;
                }
                return null;
            case 1:
                if (aVar.a == Object.class) {
                    return new r(gVar, (la.t) this.b);
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
