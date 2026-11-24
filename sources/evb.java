// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class evb extends gb3 {
    public Runnable F;
    public int G;
    public final /* synthetic */ qvb H;

    public evb(qvb qvbVar) {
        this.H = qvbVar;
    }

    @Override // gb3
    public final void F() {
        if (this.G == -1) {
            this.G = this.H.getNotificationCenter().q(null, this.G, false);
            Runnable runnable = this.F;
            if (runnable != null) {
                gl.r(runnable);
                this.F = null;
            }
        }
    }

    @Override // gb3
    public final void N() {
        Runnable runnable = this.F;
        if (runnable != null) {
            gl.r(runnable);
            this.F = null;
        }
        dvb dvbVar = new dvb(this, (byte) 0);
        this.F = dvbVar;
        gl.c3(dvbVar);
    }

    @Override // gb3, b49
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            gl.r(runnable);
        }
        dvb dvbVar = new dvb(this, (byte) 1);
        this.F = dvbVar;
        gl.c3(dvbVar);
    }

    @Override // gb3
    public final void z(s49 s49Var) {
        qvb qvbVar = this.H;
        nvb nvbVar = qvbVar.d1;
        if (nvbVar == s49Var.a) {
            nvbVar.setTranslationX(0.0f);
            vub vubVar = qvbVar.P;
            if (vubVar != null) {
                vubVar.G.clear();
            }
            nvb nvbVar2 = qvbVar.d1;
            if (ug8.A(nvbVar2)) {
                nvbVar2.setTopicIcon(nvbVar2.d5);
            }
            qvbVar.d1 = null;
        }
    }
}
