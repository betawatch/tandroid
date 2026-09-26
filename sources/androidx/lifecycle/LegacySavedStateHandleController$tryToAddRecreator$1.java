package androidx.lifecycle;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements r {
    public final /* synthetic */ o a;
    public final /* synthetic */ m.p b;

    public LegacySavedStateHandleController$tryToAddRecreator$1(o oVar, m.p pVar) {
        this.a = oVar;
        this.b = pVar;
    }

    @Override // androidx.lifecycle.r
    public final void d(t tVar, m mVar) {
        if (mVar == m.ON_START) {
            this.a.b(this);
            this.b.g();
        }
    }
}
