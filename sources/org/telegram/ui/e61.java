package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e61 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ l71 b;

    public /* synthetic */ e61(l71 l71Var, int i3) {
        this.a = i3;
        this.b = l71Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i3 = 1;
                final l71 l71Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.d61
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                l71.b0(l71Var, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        l71 l71Var2 = l71Var;
                                        l71Var2.Y0 = tL_wallPaper;
                                        l71Var2.g1(false);
                                        l71Var2.o1();
                                        l71Var2.W0.add(0, l71Var2.Y0);
                                        j71 j71Var = l71Var2.S0;
                                        if (j71Var != null) {
                                            j71Var.f();
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
                final l71 l71Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.d61
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                l71.b0(l71Var2, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        l71 l71Var22 = l71Var2;
                                        l71Var22.Y0 = tL_wallPaper;
                                        l71Var22.g1(false);
                                        l71Var22.o1();
                                        l71Var22.W0.add(0, l71Var22.Y0);
                                        j71 j71Var = l71Var22.S0;
                                        if (j71Var != null) {
                                            j71Var.f();
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
