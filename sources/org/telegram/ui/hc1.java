package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hc1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ od1 b;

    public /* synthetic */ hc1(od1 od1Var, int i10) {
        this.a = i10;
        this.b = od1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final od1 od1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.gc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                od1.W(od1Var, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        od1 od1Var2 = od1Var;
                                        od1Var2.W0 = tL_wallPaper;
                                        od1Var2.b1(false);
                                        od1Var2.j1();
                                        od1Var2.U0.add(0, od1Var2.W0);
                                        md1 md1Var = od1Var2.Q0;
                                        if (md1Var != null) {
                                            md1Var.l();
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
                final od1 od1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.gc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                od1.W(od1Var2, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        od1 od1Var22 = od1Var2;
                                        od1Var22.W0 = tL_wallPaper;
                                        od1Var22.b1(false);
                                        od1Var22.j1();
                                        od1Var22.U0.add(0, od1Var22.W0);
                                        md1 md1Var = od1Var22.Q0;
                                        if (md1Var != null) {
                                            md1Var.l();
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
