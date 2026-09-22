package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class e implements a {
    public final f6 a;
    public d b;
    public d c;
    public d d;
    public d e;
    public float f;
    public float h;
    public float n;
    public float r;

    public e(f6 f6Var) {
        this.a = f6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.n = dpf2;
        this.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f = dpf23;
        this.h = dpf24;
    }

    @Override // dh.a
    public final int H() {
        return a(this.e);
    }

    public final int a(d dVar) {
        if (dVar == null) {
            return 0;
        }
        f6 f6Var = this.a;
        return dVar.f(f6Var, ((f6Var instanceof ai.d) || f6Var != null) ? f6Var.a() : j6.I.q());
    }

    @Override // dh.a
    public final int b() {
        return a(this.c);
    }

    public final void c(int i10, int i11) {
        this.b = new c(i11, i10, 0);
    }

    public final void d(int i10, int i11) {
        this.d = new c(i11, i10, 0);
    }

    public final void e(int i10, int i11) {
        this.c = new c(i11, i10, 0);
    }

    @Override // dh.a
    public final int g() {
        return a(this.d);
    }

    @Override // dh.a
    public final int x() {
        return a(this.b);
    }
}
