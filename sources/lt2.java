// default package

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
