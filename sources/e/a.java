package e;

import cc.k;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
