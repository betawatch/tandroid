package org.telegram.ui;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ld b;

    public /* synthetic */ cd(ld ldVar, int i10) {
        this.a = i10;
        this.b = ldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ld ldVar = this.b;
                ldVar.j0 = true;
                ldVar.h0();
                break;
            case 1:
                ld ldVar2 = this.b;
                ldVar2.x = null;
                ldVar2.y = null;
                ldVar2.l0 = null;
                ldVar2.m0 = null;
                ldVar2.o0 = null;
                ldVar2.n0 = null;
                ldVar2.p0 = 0.0d;
                ldVar2.e0(false, true);
                ldVar2.e.h(null, null, ldVar2.s, null);
                ldVar2.h.setAnimation(ldVar2.J);
                ldVar2.J.M(0);
                break;
            case 2:
                this.b.g0(true);
                break;
            default:
                ld ldVar3 = this.b;
                ldVar3.j0 = true;
                if (ldVar3.w.length() > 0) {
                    ldVar3.d0(ldVar3.w.getText().toString());
                }
                ldVar3.h0();
                break;
        }
    }
}
