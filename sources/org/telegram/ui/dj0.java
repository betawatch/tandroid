package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dj0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ jj0 b;

    public /* synthetic */ dj0(jj0 jj0Var, int i10) {
        this.a = i10;
        this.b = jj0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final jj0 jj0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                jj0.U(jj0Var, tL_error, tLObject);
                                break;
                            case 1:
                                jj0.W(jj0Var, tL_error, tLObject);
                                break;
                            default:
                                jj0.V(jj0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final jj0 jj0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                jj0.U(jj0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                jj0.W(jj0Var2, tL_error, tLObject);
                                break;
                            default:
                                jj0.V(jj0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final jj0 jj0Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                jj0.U(jj0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                jj0.W(jj0Var3, tL_error, tLObject);
                                break;
                            default:
                                jj0.V(jj0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
