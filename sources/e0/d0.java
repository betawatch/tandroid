package e0;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class d0 {
    public ArrayList a = new ArrayList();
    public int b = 1;
    public ArrayList c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f = 80;
    public String g;
    public String h;

    public final void a(h hVar) {
        this.a.add(hVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        d0 d0Var = new d0();
        d0Var.a = new ArrayList(this.a);
        d0Var.b = this.b;
        d0Var.c = new ArrayList(this.c);
        d0Var.d = this.d;
        d0Var.e = this.e;
        d0Var.f = this.f;
        d0Var.g = this.g;
        d0Var.h = this.h;
        return d0Var;
    }
}
