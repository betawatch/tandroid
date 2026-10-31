package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ sh0 b;

    public /* synthetic */ mh0(sh0 sh0Var, int i10) {
        this.a = i10;
        this.b = sh0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final sh0 sh0Var = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.lh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                sh0.Y(sh0Var, tL_error, tLObject);
                                break;
                            case 1:
                                sh0.a0(sh0Var, tL_error, tLObject);
                                break;
                            default:
                                sh0.Z(sh0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final sh0 sh0Var2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.lh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                sh0.Y(sh0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                sh0.a0(sh0Var2, tL_error, tLObject);
                                break;
                            default:
                                sh0.Z(sh0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final sh0 sh0Var3 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.lh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                sh0.Y(sh0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                sh0.a0(sh0Var3, tL_error, tLObject);
                                break;
                            default:
                                sh0.Z(sh0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
