// default package

import java.util.Iterator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class nhc {
    public final ohc a = new ohc();

    public final void a() {
        ohc ohcVar = this.a;
        if (!ohcVar.d) {
            ohcVar.d = true;
            synchronized (ohcVar.a) {
                Iterator it = ohcVar.b.values().iterator();
                while (it.hasNext()) {
                    ohc.a((AutoCloseable) it.next());
                }
                Iterator it2 = ohcVar.c.iterator();
                while (it2.hasNext()) {
                    ohc.a((AutoCloseable) it2.next());
                }
                ohcVar.c.clear();
            }
        }
        b();
    }

    public void b() {
    }
}
