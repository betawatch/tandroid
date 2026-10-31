package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g81 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ m91 b;

    public /* synthetic */ g81(m91 m91Var, int i10) {
        this.a = i10;
        this.b = m91Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final m91 m91Var = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.f81
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                m91.a0(m91Var, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        m91 m91Var2 = m91Var;
                                        m91Var2.X0 = tL_wallPaper;
                                        m91Var2.f1(false);
                                        m91Var2.n1();
                                        m91Var2.V0.add(0, m91Var2.X0);
                                        k91 k91Var = m91Var2.R0;
                                        if (k91Var != null) {
                                            k91Var.f();
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final m91 m91Var2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.f81
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                m91.a0(m91Var2, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        m91 m91Var22 = m91Var2;
                                        m91Var22.X0 = tL_wallPaper;
                                        m91Var22.f1(false);
                                        m91Var22.n1();
                                        m91Var22.V0.add(0, m91Var22.X0);
                                        k91 k91Var = m91Var22.R0;
                                        if (k91Var != null) {
                                            k91Var.f();
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
