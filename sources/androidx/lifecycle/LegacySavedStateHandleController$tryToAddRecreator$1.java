package androidx.lifecycle;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
