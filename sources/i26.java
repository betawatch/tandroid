// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class i26 implements vw8 {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile vw8 b;

    public i26(vw8 vw8Var) {
        this.b = vw8Var;
    }

    @Override // vw8
    public final Object get() {
        Object obj;
        Object obj2 = this.a;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.a;
            if (obj == obj3) {
                obj = this.b.get();
                this.a = obj;
                this.b = null;
            }
        }
        return obj;
    }
}
