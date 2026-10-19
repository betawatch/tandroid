package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ vf1 b;

    public /* synthetic */ nf1(vf1 vf1Var, int i10) {
        this.a = i10;
        this.b = vf1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final vf1 vf1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                vf1.b0(vf1Var, tL_error, tLObject);
                                break;
                            default:
                                vf1.h0(vf1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new qf1(this.b, tL_error, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new qf1(this.b, tL_error, 1));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new qf1(this.b, tL_error, 2));
                break;
            default:
                final int i11 = 1;
                final vf1 vf1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                vf1.b0(vf1Var2, tL_error, tLObject);
                                break;
                            default:
                                vf1.h0(vf1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
