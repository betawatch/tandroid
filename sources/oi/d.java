package oi;

import org.telegram.messenger.i10;
import org.telegram.ui.dg0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ d(p pVar, int i7) {
        this.a = i7;
        this.b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p pVar = this.b;
                pVar.M(true, 2147483646, 0, 0L, false);
                dg0 dg0Var = pVar.P;
                if (dg0Var != null) {
                    dg0Var.h(false);
                    pVar.P = null;
                    break;
                }
                break;
            case 1:
                p pVar2 = this.b;
                pVar2.M(false, 0, 0, 0L, false);
                dg0 dg0Var2 = pVar2.P;
                if (dg0Var2 != null) {
                    dg0Var2.h(true);
                    pVar2.P = null;
                    break;
                }
                break;
            case 2:
                p pVar3 = this.b;
                if (!i10.i(pVar3.n).q()) {
                    new ug.y0(pVar3.b.a2, pVar3.getContext(), pVar3.n, 43, true).show();
                    break;
                }
                break;
            case 3:
                p pVar4 = this.b;
                y3 y3Var = pVar4.s;
                if (y3Var != null) {
                    y3Var.setSendEnabled(pVar4.r.P3());
                    break;
                }
                break;
            default:
                this.b.f0();
                break;
        }
    }
}
