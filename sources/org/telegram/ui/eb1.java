package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eb1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ nc1 b;

    public /* synthetic */ eb1(nc1 nc1Var, int i10) {
        this.a = i10;
        this.b = nc1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final nc1 nc1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cb1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                nc1.V(nc1Var, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        nc1 nc1Var2 = nc1Var;
                                        nc1Var2.S0 = tL_wallPaper;
                                        nc1Var2.b1(false);
                                        nc1Var2.j1();
                                        nc1Var2.Q0.add(0, nc1Var2.S0);
                                        lc1 lc1Var = nc1Var2.M0;
                                        if (lc1Var != null) {
                                            lc1Var.l();
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
                final nc1 nc1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cb1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                nc1.V(nc1Var2, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        nc1 nc1Var22 = nc1Var2;
                                        nc1Var22.S0 = tL_wallPaper;
                                        nc1Var22.b1(false);
                                        nc1Var22.j1();
                                        nc1Var22.Q0.add(0, nc1Var22.S0);
                                        lc1 lc1Var = nc1Var22.M0;
                                        if (lc1Var != null) {
                                            lc1Var.l();
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
