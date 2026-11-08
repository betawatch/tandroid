package androidx.lifecycle;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
