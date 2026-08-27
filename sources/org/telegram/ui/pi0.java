package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pi0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi0 b;

    public /* synthetic */ pi0(vi0 vi0Var, int i10) {
        this.a = i10;
        this.b = vi0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final vi0 vi0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.oi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                vi0.U(vi0Var, tL_error, tLObject);
                                break;
                            case 1:
                                vi0.W(vi0Var, tL_error, tLObject);
                                break;
                            default:
                                vi0.V(vi0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final vi0 vi0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.oi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                vi0.U(vi0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                vi0.W(vi0Var2, tL_error, tLObject);
                                break;
                            default:
                                vi0.V(vi0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final vi0 vi0Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.oi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                vi0.U(vi0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                vi0.W(vi0Var3, tL_error, tLObject);
                                break;
                            default:
                                vi0.V(vi0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
