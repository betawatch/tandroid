package j3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k implements f5.n {
    public final c2.e0 a;
    public final q0 b;
    public e c;
    public f5.n d;
    public boolean e = true;
    public boolean f;

    public k(q0 q0Var, f5.y yVar) {
        this.b = q0Var;
        this.a = new c2.e0(yVar);
    }

    @Override // f5.n
    public final x1 getPlaybackParameters() {
        f5.n nVar = this.d;
        return nVar != null ? nVar.getPlaybackParameters() : (x1) this.a.e;
    }

    @Override // f5.n
    public final long getPositionUs() {
        if (this.e) {
            return this.a.getPositionUs();
        }
        f5.n nVar = this.d;
        nVar.getClass();
        return nVar.getPositionUs();
    }

    @Override // f5.n
    public final void setPlaybackParameters(x1 x1Var) {
        f5.n nVar = this.d;
        if (nVar != null) {
            nVar.setPlaybackParameters(x1Var);
            x1Var = this.d.getPlaybackParameters();
        }
        this.a.setPlaybackParameters(x1Var);
    }
}
