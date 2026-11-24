// default package

import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class odc {
    public final pdc a = new pdc();

    public final void a() {
        pdc pdcVar = this.a;
        if (!pdcVar.d) {
            pdcVar.d = true;
            synchronized (pdcVar.a) {
                Iterator it = pdcVar.b.values().iterator();
                while (it.hasNext()) {
                    pdc.a((AutoCloseable) it.next());
                }
                Iterator it2 = pdcVar.c.iterator();
                while (it2.hasNext()) {
                    pdc.a((AutoCloseable) it2.next());
                }
                pdcVar.c.clear();
            }
        }
        b();
    }

    public void b() {
    }
}
