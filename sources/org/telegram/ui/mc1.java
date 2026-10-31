package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mc1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc1 b;

    public /* synthetic */ mc1(tc1 tc1Var, int i10) {
        this.a = i10;
        this.b = tc1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final tc1 tc1Var = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.oc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                tc1.f0(tc1Var, tL_error, tLObject);
                                break;
                            default:
                                tc1.l0(tc1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                org.telegram.messenger.i0.g3(new pc1(this.b, tL_error, 0));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new pc1(this.b, tL_error, 1));
                break;
            case 3:
                org.telegram.messenger.i0.g3(new pc1(this.b, tL_error, 2));
                break;
            default:
                final int i11 = 1;
                final tc1 tc1Var2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.oc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                tc1.f0(tc1Var2, tL_error, tLObject);
                                break;
                            default:
                                tc1.l0(tc1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
