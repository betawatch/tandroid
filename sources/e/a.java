package e;

import ee.b;
import l6.m;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements b, fb.b {
    public final Object a;

    public /* synthetic */ a(Object obj) {
        this.a = obj;
    }

    public static a a(Object obj) {
        if (obj != null) {
            return new a(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public Object b() {
        if (p7.a.b == null) {
            p7.a.b = new m();
        }
        synchronized (p7.a.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override // cd.a
    public Object get() {
        return this.a;
    }
}
