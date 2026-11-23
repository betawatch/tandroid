package e;

import ab.b0;
import ib.b;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class a implements he.a, b {
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
        if (q7.a.b == null) {
            q7.a.b = new b0();
        }
        synchronized (q7.a.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override // fd.a
    public Object get() {
        return this.a;
    }
}
