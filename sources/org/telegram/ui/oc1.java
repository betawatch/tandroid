package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oc1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ vd1 b;

    public /* synthetic */ oc1(vd1 vd1Var, int i10) {
        this.a = i10;
        this.b = vd1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final vd1 vd1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                vd1.W(vd1Var, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        vd1 vd1Var2 = vd1Var;
                                        vd1Var2.W0 = tL_wallPaper;
                                        vd1Var2.b1(false);
                                        vd1Var2.j1();
                                        vd1Var2.U0.add(0, vd1Var2.W0);
                                        td1 td1Var = vd1Var2.Q0;
                                        if (td1Var != null) {
                                            td1Var.l();
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final vd1 vd1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                vd1.W(vd1Var2, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        vd1 vd1Var22 = vd1Var2;
                                        vd1Var22.W0 = tL_wallPaper;
                                        vd1Var22.b1(false);
                                        vd1Var22.j1();
                                        vd1Var22.U0.add(0, vd1Var22.W0);
                                        td1 td1Var = vd1Var22.Q0;
                                        if (td1Var != null) {
                                            td1Var.l();
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
