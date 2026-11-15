package oi;

import org.telegram.messenger.m10;
import org.telegram.ui.bg0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                bg0 bg0Var = oVar.P;
                if (bg0Var != null) {
                    bg0Var.h(false);
                    oVar.P = null;
                    break;
                }
                break;
            case 1:
                o oVar2 = this.b;
                oVar2.M(false, 0, 0, 0L, false);
                bg0 bg0Var2 = oVar2.P;
                if (bg0Var2 != null) {
                    bg0Var2.h(true);
                    oVar2.P = null;
                    break;
                }
                break;
            case 2:
                o oVar3 = this.b;
                if (!m10.i(oVar3.n).q()) {
                    new ug.x0(oVar3.b.a2, oVar3.getContext(), oVar3.n, 43, true).show();
                    break;
                }
                break;
            case 3:
                o oVar4 = this.b;
                v3 v3Var = oVar4.s;
                if (v3Var != null) {
                    v3Var.setSendEnabled(oVar4.r.P3());
                    break;
                }
                break;
            default:
                this.b.f0();
                break;
        }
    }
}
