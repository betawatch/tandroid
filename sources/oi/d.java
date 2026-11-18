package oi;

import org.telegram.messenger.j10;
import org.telegram.ui.fg0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                fg0 fg0Var = oVar.P;
                if (fg0Var != null) {
                    fg0Var.h(false);
                    oVar.P = null;
                    break;
                }
                break;
            case 1:
                o oVar2 = this.b;
                oVar2.M(false, 0, 0, 0L, false);
                fg0 fg0Var2 = oVar2.P;
                if (fg0Var2 != null) {
                    fg0Var2.h(true);
                    oVar2.P = null;
                    break;
                }
                break;
            case 2:
                o oVar3 = this.b;
                if (!j10.i(oVar3.n).q()) {
                    new ug.z0(oVar3.b.a2, oVar3.getContext(), oVar3.n, 43, true).show();
                    break;
                }
                break;
            case 3:
                o oVar4 = this.b;
                x3 x3Var = oVar4.s;
                if (x3Var != null) {
                    x3Var.setSendEnabled(oVar4.r.P3());
                    break;
                }
                break;
            default:
                this.b.f0();
                break;
        }
    }
}
