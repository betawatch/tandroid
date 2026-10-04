package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class kc1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ rd1 b;

    public /* synthetic */ kc1(rd1 rd1Var, int i10) {
        this.a = i10;
        this.b = rd1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final rd1 rd1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.jc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                rd1.U(rd1Var, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        rd1 rd1Var2 = rd1Var;
                                        rd1Var2.W0 = tL_wallPaper;
                                        rd1Var2.b1(false);
                                        rd1Var2.j1();
                                        rd1Var2.U0.add(0, rd1Var2.W0);
                                        pd1 pd1Var = rd1Var2.Q0;
                                        if (pd1Var != null) {
                                            pd1Var.l();
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
                final rd1 rd1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.jc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                rd1.U(rd1Var2, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        rd1 rd1Var22 = rd1Var2;
                                        rd1Var22.W0 = tL_wallPaper;
                                        rd1Var22.b1(false);
                                        rd1Var22.j1();
                                        rd1Var22.U0.add(0, rd1Var22.W0);
                                        pd1 pd1Var = rd1Var22.Q0;
                                        if (pd1Var != null) {
                                            pd1Var.l();
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
