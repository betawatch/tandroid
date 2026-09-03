package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class og1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg1 b;

    public /* synthetic */ og1(wg1 wg1Var, int i10) {
        this.a = i10;
        this.b = wg1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final wg1 wg1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.qg1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                wg1.b0(wg1Var, tL_error, tLObject);
                                break;
                            default:
                                wg1.h0(wg1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new rg1(this.b, tL_error, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new rg1(this.b, tL_error, 1));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new rg1(this.b, tL_error, 2));
                break;
            default:
                final int i11 = 1;
                final wg1 wg1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.qg1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                wg1.b0(wg1Var2, tL_error, tLObject);
                                break;
                            default:
                                wg1.h0(wg1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
