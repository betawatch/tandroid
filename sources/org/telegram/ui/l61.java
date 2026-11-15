package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l61 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ t71 b;

    public /* synthetic */ l61(t71 t71Var, int i7) {
        this.a = i7;
        this.b = t71Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final t71 t71Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.k61
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                t71.b0(t71Var, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        t71 t71Var2 = t71Var;
                                        t71Var2.Y0 = tL_wallPaper;
                                        t71Var2.g1(false);
                                        t71Var2.o1();
                                        t71Var2.W0.add(0, t71Var2.Y0);
                                        r71 r71Var = t71Var2.S0;
                                        if (r71Var != null) {
                                            r71Var.f();
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
                final int i10 = 0;
                final t71 t71Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.k61
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                t71.b0(t71Var2, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        t71 t71Var22 = t71Var2;
                                        t71Var22.Y0 = tL_wallPaper;
                                        t71Var22.g1(false);
                                        t71Var22.o1();
                                        t71Var22.W0.add(0, t71Var22.Y0);
                                        r71 r71Var = t71Var22.S0;
                                        if (r71Var != null) {
                                            r71Var.f();
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
