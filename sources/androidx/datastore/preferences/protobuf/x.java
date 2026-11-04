package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class x implements Cloneable {
    public final z a;
    public z b;

    public x(z zVar) {
        this.a = zVar;
        if (zVar.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = zVar.i();
    }

    public final z a() {
        z b10 = b();
        b10.getClass();
        if (z.f(b10, true)) {
            return b10;
        }
        throw new g1();
    }

    public final z b() {
        if (!this.b.g()) {
            return this.b;
        }
        z zVar = this.b;
        zVar.getClass();
        y0 y0Var = y0.c;
        y0Var.getClass();
        y0Var.a(zVar.getClass()).d(zVar);
        zVar.h();
        return this.b;
    }

    public final void c() {
        if (this.b.g()) {
            return;
        }
        z i3 = this.a.i();
        z zVar = this.b;
        y0 y0Var = y0.c;
        y0Var.getClass();
        y0Var.a(i3.getClass()).b(i3, zVar);
        this.b = i3;
    }

    public final Object clone() {
        x xVar = (x) this.a.c(5);
        xVar.b = b();
        return xVar;
    }
}
