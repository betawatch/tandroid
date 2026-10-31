package e0;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
