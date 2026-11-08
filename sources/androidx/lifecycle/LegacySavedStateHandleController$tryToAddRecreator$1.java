package androidx.lifecycle;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements r {
    public final /* synthetic */ o a;
    public final /* synthetic */ m.q b;

    public LegacySavedStateHandleController$tryToAddRecreator$1(o oVar, m.q qVar) {
        this.a = oVar;
        this.b = qVar;
    }

    @Override // androidx.lifecycle.r
    public final void d(t tVar, m mVar) {
        if (mVar == m.ON_START) {
            this.a.b(this);
            this.b.g();
        }
    }
}
