package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q61 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ w71 b;

    public /* synthetic */ q61(w71 w71Var, int i7) {
        this.a = i7;
        this.b = w71Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final w71 w71Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.o61
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                w71.b0(w71Var, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        w71 w71Var2 = w71Var;
                                        w71Var2.X0 = tL_wallPaper;
                                        w71Var2.g1(false);
                                        w71Var2.o1();
                                        w71Var2.V0.add(0, w71Var2.X0);
                                        u71 u71Var = w71Var2.R0;
                                        if (u71Var != null) {
                                            u71Var.f();
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
                final w71 w71Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.o61
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                w71.b0(w71Var2, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        w71 w71Var22 = w71Var2;
                                        w71Var22.X0 = tL_wallPaper;
                                        w71Var22.g1(false);
                                        w71Var22.o1();
                                        w71Var22.V0.add(0, w71Var22.X0);
                                        u71 u71Var = w71Var22.R0;
                                        if (u71Var != null) {
                                            u71Var.f();
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
