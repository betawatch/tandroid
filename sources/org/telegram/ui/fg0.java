package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ lg0 b;

    public /* synthetic */ fg0(lg0 lg0Var, int i7) {
        this.a = i7;
        this.b = lg0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final lg0 lg0Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.eg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                lg0.Z(lg0Var, tL_error, tLObject);
                                break;
                            case 1:
                                lg0.b0(lg0Var, tL_error, tLObject);
                                break;
                            default:
                                lg0.a0(lg0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i10 = 1;
                final lg0 lg0Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.eg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                lg0.Z(lg0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                lg0.b0(lg0Var2, tL_error, tLObject);
                                break;
                            default:
                                lg0.a0(lg0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 2;
                final lg0 lg0Var3 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.eg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                lg0.Z(lg0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                lg0.b0(lg0Var3, tL_error, tLObject);
                                break;
                            default:
                                lg0.a0(lg0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
