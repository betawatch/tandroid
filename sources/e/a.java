package e;

import cc.k;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
