// default package

import java.util.Iterator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
