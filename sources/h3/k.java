package h3;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k implements d5.o {
    public final c2.c0 a;
    public final q0 b;
    public e c;
    public d5.o d;
    public boolean e = true;
    public boolean f;

    public k(q0 q0Var, d5.b0 b0Var) {
        this.b = q0Var;
        this.a = new c2.c0(b0Var);
    }

    @Override // d5.o
    public final x1 getPlaybackParameters() {
        d5.o oVar = this.d;
        return oVar != null ? oVar.getPlaybackParameters() : (x1) this.a.e;
    }

    @Override // d5.o
    public final long getPositionUs() {
        if (this.e) {
            return this.a.getPositionUs();
        }
        d5.o oVar = this.d;
        oVar.getClass();
        return oVar.getPositionUs();
    }

    @Override // d5.o
    public final void setPlaybackParameters(x1 x1Var) {
        d5.o oVar = this.d;
        if (oVar != null) {
            oVar.setPlaybackParameters(x1Var);
            x1Var = this.d.getPlaybackParameters();
        }
        this.a.setPlaybackParameters(x1Var);
    }
}
