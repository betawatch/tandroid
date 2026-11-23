package androidx.lifecycle;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
class LiveData$LifecycleBoundObserver extends y implements r {
    public final t e;
    public final /* synthetic */ z f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveData$LifecycleBoundObserver(z zVar, t tVar, a0 a0Var) {
        super(zVar, a0Var);
        this.f = zVar;
        this.e = tVar;
    }

    @Override // androidx.lifecycle.r
    public final void d(t tVar, m mVar) {
        t tVar2 = this.e;
        n nVar = ((v) tVar2.m()).c;
        if (nVar == n.a) {
            this.f.i(this.a);
            return;
        }
        n nVar2 = null;
        while (nVar2 != nVar) {
            c(k());
            nVar2 = nVar;
            nVar = ((v) tVar2.m()).c;
        }
    }

    @Override // androidx.lifecycle.y
    public final void h() {
        this.e.m().b(this);
    }

    @Override // androidx.lifecycle.y
    public final boolean j(t tVar) {
        return this.e == tVar;
    }

    @Override // androidx.lifecycle.y
    public final boolean k() {
        return ((v) this.e.m()).c.compareTo(n.d) >= 0;
    }
}
