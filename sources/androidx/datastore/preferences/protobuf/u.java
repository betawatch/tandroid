package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public abstract class u implements Cloneable {
    public final w a;
    public w b;
    public boolean c = false;

    public u(w wVar) {
        this.a = wVar;
        this.b = (w) wVar.d(4);
    }

    public static void d(w wVar, w wVar2) {
        y0 y0Var = y0.c;
        y0Var.getClass();
        y0Var.a(wVar.getClass()).g(wVar, wVar2);
    }

    public final w a() {
        w b10 = b();
        if (b10.g()) {
            return b10;
        }
        throw new androidx.car.app.j();
    }

    public final w b() {
        if (this.c) {
            return this.b;
        }
        w wVar = this.b;
        wVar.getClass();
        y0 y0Var = y0.c;
        y0Var.getClass();
        y0Var.a(wVar.getClass()).d(wVar);
        this.c = true;
        return this.b;
    }

    public final void c() {
        if (this.c) {
            w wVar = (w) this.b.d(4);
            d(wVar, this.b);
            this.b = wVar;
            this.c = false;
        }
    }

    public final Object clone() {
        u uVar = (u) this.a.d(5);
        w b10 = b();
        uVar.c();
        d(uVar.b, b10);
        return uVar;
    }
}
