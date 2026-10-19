package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class oi0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui0 b;

    public /* synthetic */ oi0(ui0 ui0Var, int i10) {
        this.a = i10;
        this.b = ui0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final ui0 ui0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ni0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                ui0.U(ui0Var, tL_error, tLObject);
                                break;
                            case 1:
                                ui0.W(ui0Var, tL_error, tLObject);
                                break;
                            default:
                                ui0.V(ui0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final ui0 ui0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ni0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                ui0.U(ui0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                ui0.W(ui0Var2, tL_error, tLObject);
                                break;
                            default:
                                ui0.V(ui0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final ui0 ui0Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ni0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                ui0.U(ui0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                ui0.W(ui0Var3, tL_error, tLObject);
                                break;
                            default:
                                ui0.V(ui0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
