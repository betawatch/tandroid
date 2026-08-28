package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gb1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc1 b;

    public /* synthetic */ gb1(oc1 oc1Var, int i9) {
        this.a = i9;
        this.b = oc1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i9 = 1;
                final oc1 oc1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.eb1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                oc1.U(oc1Var, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        oc1 oc1Var2 = oc1Var;
                                        oc1Var2.S0 = tL_wallPaper;
                                        oc1Var2.b1(false);
                                        oc1Var2.j1();
                                        oc1Var2.Q0.add(0, oc1Var2.S0);
                                        mc1 mc1Var = oc1Var2.M0;
                                        if (mc1Var != null) {
                                            mc1Var.l();
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
                final int i10 = 0;
                final oc1 oc1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.eb1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                oc1.U(oc1Var2, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        oc1 oc1Var22 = oc1Var2;
                                        oc1Var22.S0 = tL_wallPaper;
                                        oc1Var22.b1(false);
                                        oc1Var22.j1();
                                        oc1Var22.Q0.add(0, oc1Var22.S0);
                                        mc1 mc1Var = oc1Var22.M0;
                                        if (mc1Var != null) {
                                            mc1Var.l();
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
