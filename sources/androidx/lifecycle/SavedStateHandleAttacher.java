package androidx.lifecycle;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements r {
    public final l0 a;

    public SavedStateHandleAttacher(l0 l0Var) {
        this.a = l0Var;
    }

    @Override // androidx.lifecycle.r
    public final void d(t tVar, m mVar) {
        if (mVar == m.ON_CREATE) {
            tVar.m().b(this);
            this.a.b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + mVar).toString());
        }
    }
}
