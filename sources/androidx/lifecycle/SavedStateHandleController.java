package androidx.lifecycle;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements r {
    public final String a;
    public final i0 b;
    public boolean c;

    public SavedStateHandleController(String str, i0 i0Var) {
        this.a = str;
        this.b = i0Var;
    }

    public final void c(o lifecycle, m.q registry) {
        kotlin.jvm.internal.i.e(registry, "registry");
        kotlin.jvm.internal.i.e(lifecycle, "lifecycle");
        if (this.c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.c = true;
        lifecycle.a(this);
        registry.f(this.a, this.b.e);
    }

    @Override // androidx.lifecycle.r
    public final void d(t tVar, m mVar) {
        if (mVar == m.ON_DESTROY) {
            this.c = false;
            tVar.m().b(this);
        }
    }
}
