// default package

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
