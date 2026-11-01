package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e81 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ k91 b;

    public /* synthetic */ e81(k91 k91Var, int i10) {
        this.a = i10;
        this.b = k91Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final k91 k91Var = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.d81
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                k91.b0(k91Var, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        k91 k91Var2 = k91Var;
                                        k91Var2.X0 = tL_wallPaper;
                                        k91Var2.g1(false);
                                        k91Var2.o1();
                                        k91Var2.V0.add(0, k91Var2.X0);
                                        i91 i91Var = k91Var2.R0;
                                        if (i91Var != null) {
                                            i91Var.f();
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
                final k91 k91Var2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.d81
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                k91.b0(k91Var2, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        k91 k91Var22 = k91Var2;
                                        k91Var22.X0 = tL_wallPaper;
                                        k91Var22.g1(false);
                                        k91Var22.o1();
                                        k91Var22.V0.add(0, k91Var22.X0);
                                        i91 i91Var = k91Var22.R0;
                                        if (i91Var != null) {
                                            i91Var.f();
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
