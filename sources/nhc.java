// default package

import java.util.Iterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
