package androidx.lifecycle;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
