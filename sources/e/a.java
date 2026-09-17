package e;

import cc.k;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class a implements he.a {
    public final Object a;

    public /* synthetic */ a(Object obj) {
        this.a = obj;
    }

    public Object a() {
        if (n7.a.b == null) {
            n7.a.b = new k();
        }
        synchronized (n7.a.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
