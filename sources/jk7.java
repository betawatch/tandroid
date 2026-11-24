// default package

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jk7 implements gk7 {
    public final kk7 a;
    public final WeakReference b;
    public final int c;

    public jk7(kk7 kk7Var, gk7 gk7Var) {
        this.a = kk7Var;
        this.b = new WeakReference(gk7Var);
        this.c = System.identityHashCode(gk7Var);
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        gk7 gk7Var = (gk7) this.b.get();
        if (gk7Var != null) {
            gk7Var.didReceivedNotification(i, i2, objArr);
        } else {
            this.a.n(this, i);
        }
    }

    public final boolean equals(Object obj) {
        gk7 gk7Var;
        if (this != obj) {
            return (obj instanceof jk7) && (gk7Var = (gk7) this.b.get()) != null && gk7Var == ((jk7) obj).b.get();
        }
        return true;
    }

    public final int hashCode() {
        return this.c;
    }
}
