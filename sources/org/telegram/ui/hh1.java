package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hh1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ oh1 b;

    public /* synthetic */ hh1(oh1 oh1Var, int i10) {
        this.a = i10;
        this.b = oh1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final oh1 oh1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.jh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                oh1.b0(oh1Var, tL_error, tLObject);
                                break;
                            default:
                                oh1.h0(oh1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new kh1(this.b, tL_error, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new kh1(this.b, tL_error, 1));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new kh1(this.b, tL_error, 2));
                break;
            default:
                final int i11 = 1;
                final oh1 oh1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.jh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                oh1.b0(oh1Var2, tL_error, tLObject);
                                break;
                            default:
                                oh1.h0(oh1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
