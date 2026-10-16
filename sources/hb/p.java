package hb;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class p implements eb.v {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // eb.v
    public final eb.u create(eb.g gVar, lb.a aVar) {
        switch (this.a) {
            case 0:
                if (aVar.a == Number.class) {
                    return (q) this.b;
                }
                return null;
            case 1:
                if (aVar.a == Object.class) {
                    return new r(gVar, (eb.t) this.b);
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
