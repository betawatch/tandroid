package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o61 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ u71 b;

    public /* synthetic */ o61(u71 u71Var, int i7) {
        this.a = i7;
        this.b = u71Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final u71 u71Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.n61
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                u71.b0(u71Var, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        u71 u71Var2 = u71Var;
                                        u71Var2.X0 = tL_wallPaper;
                                        u71Var2.g1(false);
                                        u71Var2.o1();
                                        u71Var2.V0.add(0, u71Var2.X0);
                                        s71 s71Var = u71Var2.R0;
                                        if (s71Var != null) {
                                            s71Var.f();
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
                final u71 u71Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.n61
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                u71.b0(u71Var2, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        u71 u71Var22 = u71Var2;
                                        u71Var22.X0 = tL_wallPaper;
                                        u71Var22.g1(false);
                                        u71Var22.o1();
                                        u71Var22.V0.add(0, u71Var22.X0);
                                        s71 s71Var = u71Var22.R0;
                                        if (s71Var != null) {
                                            s71Var.f();
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
