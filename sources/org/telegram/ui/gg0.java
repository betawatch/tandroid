package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ mg0 b;

    public /* synthetic */ gg0(mg0 mg0Var, int i7) {
        this.a = i7;
        this.b = mg0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final mg0 mg0Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.fg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                mg0.Z(mg0Var, tL_error, tLObject);
                                break;
                            case 1:
                                mg0.b0(mg0Var, tL_error, tLObject);
                                break;
                            default:
                                mg0.a0(mg0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i10 = 1;
                final mg0 mg0Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.fg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                mg0.Z(mg0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                mg0.b0(mg0Var2, tL_error, tLObject);
                                break;
                            default:
                                mg0.a0(mg0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 2;
                final mg0 mg0Var3 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.fg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                mg0.Z(mg0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                mg0.b0(mg0Var3, tL_error, tLObject);
                                break;
                            default:
                                mg0.a0(mg0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
