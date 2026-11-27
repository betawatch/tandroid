// default package

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class in7 implements fn7 {
    public final jn7 a;
    public final WeakReference b;
    public final int c;

    public in7(jn7 jn7Var, fn7 fn7Var) {
        this.a = jn7Var;
        this.b = new WeakReference(fn7Var);
        this.c = System.identityHashCode(fn7Var);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        fn7 fn7Var = (fn7) this.b.get();
        if (fn7Var != null) {
            fn7Var.didReceivedNotification(i, i2, objArr);
        } else {
            this.a.n(this, i);
        }
    }

    public final boolean equals(Object obj) {
        fn7 fn7Var;
        if (this != obj) {
            return (obj instanceof in7) && (fn7Var = (fn7) this.b.get()) != null && fn7Var == ((in7) obj).b.get();
        }
        return true;
    }

    public final int hashCode() {
        return this.c;
    }
}
