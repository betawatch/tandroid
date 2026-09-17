package e;

import cc.k;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
