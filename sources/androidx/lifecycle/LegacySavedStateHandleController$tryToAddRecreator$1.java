package androidx.lifecycle;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
