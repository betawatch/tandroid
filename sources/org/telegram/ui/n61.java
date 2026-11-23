package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n61 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ v71 b;

    public /* synthetic */ n61(v71 v71Var, int i7) {
        this.a = i7;
        this.b = v71Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final v71 v71Var = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.m61
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                v71.b0(v71Var, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        v71 v71Var2 = v71Var;
                                        v71Var2.Y0 = tL_wallPaper;
                                        v71Var2.g1(false);
                                        v71Var2.o1();
                                        v71Var2.W0.add(0, v71Var2.Y0);
                                        t71 t71Var = v71Var2.S0;
                                        if (t71Var != null) {
                                            t71Var.f();
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
                final v71 v71Var2 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.m61
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                v71.b0(v71Var2, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        v71 v71Var22 = v71Var2;
                                        v71Var22.Y0 = tL_wallPaper;
                                        v71Var22.g1(false);
                                        v71Var22.o1();
                                        v71Var22.W0.add(0, v71Var22.Y0);
                                        t71 t71Var = v71Var22.S0;
                                        if (t71Var != null) {
                                            t71Var.f();
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
