package oi;

import org.telegram.messenger.k10;
import org.telegram.ui.eg0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ d(o oVar, int i7) {
        this.a = i7;
        this.b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o oVar = this.b;
                oVar.M(true, 2147483646, 0, 0L, false);
                eg0 eg0Var = oVar.P;
                if (eg0Var != null) {
                    eg0Var.h(false);
                    oVar.P = null;
                    break;
                }
                break;
            case 1:
                o oVar2 = this.b;
                oVar2.M(false, 0, 0, 0L, false);
                eg0 eg0Var2 = oVar2.P;
                if (eg0Var2 != null) {
                    eg0Var2.h(true);
                    oVar2.P = null;
                    break;
                }
                break;
            case 2:
                o oVar3 = this.b;
                if (!k10.i(oVar3.n).q()) {
                    new ug.y0(oVar3.b.a2, oVar3.getContext(), oVar3.n, 43, true).show();
                    break;
                }
                break;
            case 3:
                o oVar4 = this.b;
                y3 y3Var = oVar4.s;
                if (y3Var != null) {
                    y3Var.setSendEnabled(oVar4.r.P3());
                    break;
                }
                break;
            default:
                this.b.f0();
                break;
        }
    }
}
