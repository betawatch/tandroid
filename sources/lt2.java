// default package

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
