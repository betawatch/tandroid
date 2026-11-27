// default package

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class c6d extends p3f {
    public final WeakReference a;

    public c6d(d6d d6dVar) {
        this.a = new WeakReference(d6dVar);
    }

    @Override // p3f
    public final void a() {
        d6d d6dVar = (d6d) this.a.get();
        if (d6dVar == null) {
            return;
        }
        d6dVar.g();
    }
}
