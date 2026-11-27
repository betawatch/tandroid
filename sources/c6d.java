// default package

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
