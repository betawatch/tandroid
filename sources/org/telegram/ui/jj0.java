package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class jj0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ qj0 b;

    public /* synthetic */ jj0(qj0 qj0Var, int i10) {
        this.a = i10;
        this.b = qj0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final qj0 qj0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ij0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                qj0.U(qj0Var, tL_error, tLObject);
                                break;
                            case 1:
                                qj0.W(qj0Var, tL_error, tLObject);
                                break;
                            default:
                                qj0.V(qj0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final qj0 qj0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ij0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                qj0.U(qj0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                qj0.W(qj0Var2, tL_error, tLObject);
                                break;
                            default:
                                qj0.V(qj0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final qj0 qj0Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ij0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                qj0.U(qj0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                qj0.W(qj0Var3, tL_error, tLObject);
                                break;
                            default:
                                qj0.V(qj0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
