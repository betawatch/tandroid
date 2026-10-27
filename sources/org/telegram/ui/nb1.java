package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nb1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ vc1 b;

    public /* synthetic */ nb1(vc1 vc1Var, int i10) {
        this.a = i10;
        this.b = vc1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final vc1 vc1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mb1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                vc1.X(vc1Var, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        vc1 vc1Var2 = vc1Var;
                                        vc1Var2.X0 = tL_wallPaper;
                                        vc1Var2.c1(false);
                                        vc1Var2.k1();
                                        vc1Var2.V0.add(0, vc1Var2.X0);
                                        tc1 tc1Var = vc1Var2.R0;
                                        if (tc1Var != null) {
                                            tc1Var.l();
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
                final vc1 vc1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mb1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                vc1.X(vc1Var2, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        vc1 vc1Var22 = vc1Var2;
                                        vc1Var22.X0 = tL_wallPaper;
                                        vc1Var22.c1(false);
                                        vc1Var22.k1();
                                        vc1Var22.V0.add(0, vc1Var22.X0);
                                        tc1 tc1Var = vc1Var22.R0;
                                        if (tc1Var != null) {
                                            tc1Var.l();
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
