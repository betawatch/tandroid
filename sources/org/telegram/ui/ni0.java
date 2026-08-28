package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ni0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti0 b;

    public /* synthetic */ ni0(ti0 ti0Var, int i9) {
        this.a = i9;
        this.b = ti0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i9 = 0;
                final ti0 ti0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                ti0.T(ti0Var, tL_error, tLObject);
                                break;
                            case 1:
                                ti0.V(ti0Var, tL_error, tLObject);
                                break;
                            default:
                                ti0.U(ti0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i10 = 1;
                final ti0 ti0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                ti0.T(ti0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                ti0.V(ti0Var2, tL_error, tLObject);
                                break;
                            default:
                                ti0.U(ti0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 2;
                final ti0 ti0Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                ti0.T(ti0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                ti0.V(ti0Var3, tL_error, tLObject);
                                break;
                            default:
                                ti0.U(ti0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
