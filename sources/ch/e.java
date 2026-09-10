package ch;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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

    public final int a(d dVar) {
        if (dVar == null) {
            return 0;
        }
        f6 f6Var = this.a;
        return dVar.g(f6Var, ((f6Var instanceof zh.b) || f6Var != null) ? f6Var.a() : j6.I.q());
    }

    public final void b(int i10, int i11) {
        this.b = new c(i11, i10, 0);
    }

    public final void c(int i10, int i11) {
        this.d = new c(i11, i10, 0);
    }

    public final void d(int i10, int i11) {
        this.c = new c(i11, i10, 0);
    }

    @Override // ch.a
    public final int h() {
        return a(this.c);
    }

    @Override // ch.a
    public final int p() {
        return a(this.d);
    }

    @Override // ch.a
    public final int w() {
        return a(this.b);
    }

    @Override // ch.a
    public final int x() {
        return a(this.e);
    }
}
