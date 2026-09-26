package androidx.lifecycle;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
