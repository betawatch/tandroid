// default package

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class lt2 implements f8a {
    public final AtomicReference a;

    public lt2(l8a l8aVar) {
        this.a = new AtomicReference(l8aVar);
    }

    @Override // f8a
    public final Iterator iterator() {
        f8a f8aVar = (f8a) this.a.getAndSet(null);
        if (f8aVar != null) {
            return f8aVar.iterator();
        }
        grb.i("This sequence can be consumed only once.");
        return null;
    }
}
