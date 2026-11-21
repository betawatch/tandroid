package androidx.lifecycle;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
