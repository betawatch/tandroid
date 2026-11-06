package androidx.lifecycle;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
            this.a.a();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + mVar).toString());
        }
    }
}
