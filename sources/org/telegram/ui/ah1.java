package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ah1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ hh1 b;

    public /* synthetic */ ah1(hh1 hh1Var, int i10) {
        this.a = i10;
        this.b = hh1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final hh1 hh1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ch1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                hh1.b0(hh1Var, tL_error, tLObject);
                                break;
                            default:
                                hh1.h0(hh1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new dh1(this.b, tL_error, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new dh1(this.b, tL_error, 1));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new dh1(this.b, tL_error, 2));
                break;
            default:
                final int i11 = 1;
                final hh1 hh1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ch1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                hh1.b0(hh1Var2, tL_error, tLObject);
                                break;
                            default:
                                hh1.h0(hh1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
