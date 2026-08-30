package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ og1 b;

    public /* synthetic */ gg1(og1 og1Var, int i10) {
        this.a = i10;
        this.b = og1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final og1 og1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ig1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                og1.b0(og1Var, tL_error, tLObject);
                                break;
                            default:
                                og1.h0(og1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new jg1(this.b, tL_error, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new jg1(this.b, tL_error, 1));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new jg1(this.b, tL_error, 2));
                break;
            default:
                final int i11 = 1;
                final og1 og1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ig1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                og1.b0(og1Var2, tL_error, tLObject);
                                break;
                            default:
                                og1.h0(og1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
