package e0;

import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class g0 {
    public ArrayList a = new ArrayList();
    public int b = 1;
    public ArrayList c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f = 80;
    public String g;
    public String h;

    public final void a(k kVar) {
        this.a.add(kVar);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final Object clone() {
        g0 g0Var = new g0();
        g0Var.a = new ArrayList(this.a);
        g0Var.b = this.b;
        g0Var.c = new ArrayList(this.c);
        g0Var.d = this.d;
        g0Var.e = this.e;
        g0Var.f = this.f;
        g0Var.g = this.g;
        g0Var.h = this.h;
        return g0Var;
    }
}
