package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kh0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ qh0 b;

    public /* synthetic */ kh0(qh0 qh0Var, int i10) {
        this.a = i10;
        this.b = qh0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final qh0 qh0Var = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.jh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                qh0.Z(qh0Var, tL_error, tLObject);
                                break;
                            case 1:
                                qh0.b0(qh0Var, tL_error, tLObject);
                                break;
                            default:
                                qh0.a0(qh0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final qh0 qh0Var2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.jh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                qh0.Z(qh0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                qh0.b0(qh0Var2, tL_error, tLObject);
                                break;
                            default:
                                qh0.a0(qh0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final qh0 qh0Var3 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.jh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                qh0.Z(qh0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                qh0.b0(qh0Var3, tL_error, tLObject);
                                break;
                            default:
                                qh0.a0(qh0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
