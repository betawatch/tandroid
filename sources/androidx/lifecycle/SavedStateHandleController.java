package androidx.lifecycle;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements r {
    public final String a;
    public final i0 b;
    public boolean c;

    public SavedStateHandleController(String str, i0 i0Var) {
        this.a = str;
        this.b = i0Var;
    }

    public final void c(o lifecycle, m.p registry) {
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
