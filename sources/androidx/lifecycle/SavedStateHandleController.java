package androidx.lifecycle;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements r {
    public final String a;
    public final i0 b;
    public boolean c;

    public SavedStateHandleController(String str, i0 i0Var) {
        this.a = str;
        this.b = i0Var;
    }

    public final void c(o lifecycle, g2.e registry) {
        kotlin.jvm.internal.j.e(registry, "registry");
        kotlin.jvm.internal.j.e(lifecycle, "lifecycle");
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
