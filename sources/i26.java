// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
