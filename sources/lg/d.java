package lg;

import h3.z;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d implements a {
    public final b6 a;
    public c b;
    public c c;
    public c d;
    public c e;
    public float f;
    public float h;
    public float n;
    public float r;

    public d(b6 b6Var) {
        this.a = b6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.n = dpf2;
        this.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f = dpf23;
        this.h = dpf24;
    }

    public final int a(c cVar) {
        if (cVar == null) {
            return 0;
        }
        b6 b6Var = this.a;
        return cVar.g(b6Var, ((b6Var instanceof ih.b) || b6Var != null) ? b6Var.a() : f6.I.q());
    }

    public final void b(int i9, int i10) {
        this.b = new z(i10, i9, 2);
    }

    public final void c(int i9, int i10) {
        this.d = new z(i10, i9, 2);
    }

    public final void d(int i9, int i10) {
        this.c = new z(i10, i9, 2);
    }

    @Override // lg.a
    public final int e() {
        return a(this.c);
    }

    @Override // lg.a
    public final int g() {
        return a(this.d);
    }

    @Override // lg.a
    public final int j() {
        return a(this.b);
    }

    @Override // lg.a
    public final int k() {
        return a(this.e);
    }
}
