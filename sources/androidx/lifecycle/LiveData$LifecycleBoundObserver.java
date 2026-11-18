package androidx.lifecycle;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
