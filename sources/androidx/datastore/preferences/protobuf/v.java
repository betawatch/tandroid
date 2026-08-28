package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class v implements Cloneable {
    public final x a;
    public x b;
    public boolean c = false;

    public v(x xVar) {
        this.a = xVar;
        this.b = (x) xVar.d(4);
    }

    public static void d(x xVar, x xVar2) {
        z0 z0Var = z0.c;
        z0Var.getClass();
        z0Var.a(xVar.getClass()).f(xVar, xVar2);
    }

    public final x a() {
        x b10 = b();
        if (b10.g()) {
            return b10;
        }
        throw new androidx.car.app.j();
    }

    public final x b() {
        if (this.c) {
            return this.b;
        }
        x xVar = this.b;
        xVar.getClass();
        z0 z0Var = z0.c;
        z0Var.getClass();
        z0Var.a(xVar.getClass()).c(xVar);
        this.c = true;
        return this.b;
    }

    public final void c() {
        if (this.c) {
            x xVar = (x) this.b.d(4);
            d(xVar, this.b);
            this.b = xVar;
            this.c = false;
        }
    }

    public final Object clone() {
        v vVar = (v) this.a.d(5);
        x b10 = b();
        vVar.c();
        d(vVar.b, b10);
        return vVar;
    }
}
