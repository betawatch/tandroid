package e;

import cc.k;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
