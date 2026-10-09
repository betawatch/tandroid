package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public abstract class w implements Cloneable {
    public final y a;
    public y b;
    public boolean c = false;

    public w(y yVar) {
        this.a = yVar;
        this.b = (y) yVar.a(4);
    }

    public final void a(y yVar) {
        b();
        y yVar2 = this.b;
        v0 v0Var = v0.c;
        v0Var.getClass();
        v0Var.a(yVar2.getClass()).c(yVar2, yVar);
    }

    public final void b() {
        if (this.c) {
            y yVar = (y) this.b.a(4);
            y yVar2 = this.b;
            v0 v0Var = v0.c;
            v0Var.getClass();
            v0Var.a(yVar.getClass()).c(yVar, yVar2);
            this.b = yVar;
            this.c = false;
        }
    }

    public final y c() {
        if (this.c) {
            return this.b;
        }
        y yVar = this.b;
        v0 v0Var = v0.c;
        v0Var.getClass();
        v0Var.a(yVar.getClass()).b(yVar);
        this.c = true;
        return this.b;
    }

    public final /* synthetic */ Object clone() {
        w wVar = (w) this.a.a(5);
        wVar.a(c());
        return wVar;
    }
}
