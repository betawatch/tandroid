package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public abstract class x implements Cloneable {
    public final z a;
    public z b;
    public boolean c = false;

    public x(z zVar) {
        this.a = zVar;
        this.b = (z) zVar.a(4);
    }

    public final void a(z zVar) {
        b();
        z zVar2 = this.b;
        v0 v0Var = v0.c;
        v0Var.getClass();
        v0Var.a(zVar2.getClass()).c(zVar2, zVar);
    }

    public final void b() {
        if (this.c) {
            z zVar = (z) this.b.a(4);
            z zVar2 = this.b;
            v0 v0Var = v0.c;
            v0Var.getClass();
            v0Var.a(zVar.getClass()).c(zVar, zVar2);
            this.b = zVar;
            this.c = false;
        }
    }

    public final z c() {
        if (this.c) {
            return this.b;
        }
        z zVar = this.b;
        v0 v0Var = v0.c;
        v0Var.getClass();
        v0Var.a(zVar.getClass()).b(zVar);
        this.c = true;
        return this.b;
    }

    public final /* synthetic */ Object clone() {
        x xVar = (x) this.a.a(5);
        xVar.a(c());
        return xVar;
    }
}
