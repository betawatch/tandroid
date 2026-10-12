package e0;

import java.util.ArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class e0 {
    public ArrayList a = new ArrayList();
    public int b = 1;
    public ArrayList c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f = 80;
    public String g;
    public String h;

    public final void a(i iVar) {
        this.a.add(iVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        e0 e0Var = new e0();
        e0Var.a = new ArrayList(this.a);
        e0Var.b = this.b;
        e0Var.c = new ArrayList(this.c);
        e0Var.d = this.d;
        e0Var.e = this.e;
        e0Var.f = this.f;
        e0Var.g = this.g;
        e0Var.h = this.h;
        return e0Var;
    }
}
