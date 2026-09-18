package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qc1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd1 b;

    public /* synthetic */ qc1(xd1 xd1Var, int i10) {
        this.a = i10;
        this.b = xd1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final xd1 xd1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.oc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                xd1.W(xd1Var, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        xd1 xd1Var2 = xd1Var;
                                        xd1Var2.W0 = tL_wallPaper;
                                        xd1Var2.b1(false);
                                        xd1Var2.j1();
                                        xd1Var2.U0.add(0, xd1Var2.W0);
                                        vd1 vd1Var = xd1Var2.Q0;
                                        if (vd1Var != null) {
                                            vd1Var.l();
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
                final xd1 xd1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.oc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                xd1.W(xd1Var2, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        xd1 xd1Var22 = xd1Var2;
                                        xd1Var22.W0 = tL_wallPaper;
                                        xd1Var22.b1(false);
                                        xd1Var22.j1();
                                        xd1Var22.U0.add(0, xd1Var22.W0);
                                        vd1 vd1Var = xd1Var22.Q0;
                                        if (vd1Var != null) {
                                            vd1Var.l();
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
