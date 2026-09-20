package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class gj0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ mj0 b;

    public /* synthetic */ gj0(mj0 mj0Var, int i10) {
        this.a = i10;
        this.b = mj0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final mj0 mj0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ej0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                mj0.U(mj0Var, tL_error, tLObject);
                                break;
                            case 1:
                                mj0.W(mj0Var, tL_error, tLObject);
                                break;
                            default:
                                mj0.V(mj0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final mj0 mj0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ej0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                mj0.U(mj0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                mj0.W(mj0Var2, tL_error, tLObject);
                                break;
                            default:
                                mj0.V(mj0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final mj0 mj0Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ej0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                mj0.U(mj0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                mj0.W(mj0Var3, tL_error, tLObject);
                                break;
                            default:
                                mj0.V(mj0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
