// default package

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mm7 implements jm7 {
    public final nm7 a;
    public final WeakReference b;
    public final int c;

    public mm7(nm7 nm7Var, jm7 jm7Var) {
        this.a = nm7Var;
        this.b = new WeakReference(jm7Var);
        this.c = System.identityHashCode(jm7Var);
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        jm7 jm7Var = (jm7) this.b.get();
        if (jm7Var != null) {
            jm7Var.didReceivedNotification(i, i2, objArr);
        } else {
            this.a.n(this, i);
        }
    }

    public final boolean equals(Object obj) {
        jm7 jm7Var;
        if (this != obj) {
            return (obj instanceof mm7) && (jm7Var = (jm7) this.b.get()) != null && jm7Var == ((mm7) obj).b.get();
        }
        return true;
    }

    public final int hashCode() {
        return this.c;
    }
}
