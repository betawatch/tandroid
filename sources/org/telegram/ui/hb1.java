package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hb1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ qc1 b;

    public /* synthetic */ hb1(qc1 qc1Var, int i10) {
        this.a = i10;
        this.b = qc1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final qc1 qc1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.fb1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                qc1.V(qc1Var, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        qc1 qc1Var2 = qc1Var;
                                        qc1Var2.S0 = tL_wallPaper;
                                        qc1Var2.b1(false);
                                        qc1Var2.j1();
                                        qc1Var2.Q0.add(0, qc1Var2.S0);
                                        oc1 oc1Var = qc1Var2.M0;
                                        if (oc1Var != null) {
                                            oc1Var.l();
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
                final qc1 qc1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.fb1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                qc1.V(qc1Var2, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        qc1 qc1Var22 = qc1Var2;
                                        qc1Var22.S0 = tL_wallPaper;
                                        qc1Var22.b1(false);
                                        qc1Var22.j1();
                                        qc1Var22.Q0.add(0, qc1Var22.S0);
                                        oc1 oc1Var = qc1Var22.M0;
                                        if (oc1Var != null) {
                                            oc1Var.l();
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
