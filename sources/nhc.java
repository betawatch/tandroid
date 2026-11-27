// default package

import java.util.Iterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
