package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kc1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ rc1 b;

    public /* synthetic */ kc1(rc1 rc1Var, int i10) {
        this.a = i10;
        this.b = rc1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final rc1 rc1Var = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.mc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                rc1.g0(rc1Var, tL_error, tLObject);
                                break;
                            default:
                                rc1.m0(rc1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                org.telegram.messenger.i0.g3(new nc1(this.b, tL_error, 0));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new nc1(this.b, tL_error, 1));
                break;
            case 3:
                org.telegram.messenger.i0.g3(new nc1(this.b, tL_error, 2));
                break;
            default:
                final int i11 = 1;
                final rc1 rc1Var2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.mc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                rc1.g0(rc1Var2, tL_error, tLObject);
                                break;
                            default:
                                rc1.m0(rc1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
