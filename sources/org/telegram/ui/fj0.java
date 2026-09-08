package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class fj0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ lj0 b;

    public /* synthetic */ fj0(lj0 lj0Var, int i10) {
        this.a = i10;
        this.b = lj0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final lj0 lj0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.dj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                lj0.U(lj0Var, tL_error, tLObject);
                                break;
                            case 1:
                                lj0.W(lj0Var, tL_error, tLObject);
                                break;
                            default:
                                lj0.V(lj0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final lj0 lj0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.dj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                lj0.U(lj0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                lj0.W(lj0Var2, tL_error, tLObject);
                                break;
                            default:
                                lj0.V(lj0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final lj0 lj0Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.dj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                lj0.U(lj0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                lj0.W(lj0Var3, tL_error, tLObject);
                                break;
                            default:
                                lj0.V(lj0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
