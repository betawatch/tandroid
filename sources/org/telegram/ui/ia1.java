package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ia1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ra1 b;

    public /* synthetic */ ia1(ra1 ra1Var, int i3) {
        this.a = i3;
        this.b = ra1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i3 = 0;
                final ra1 ra1Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ka1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                ra1.g0(ra1Var, tL_error, tLObject);
                                break;
                            default:
                                ra1.m0(ra1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                org.telegram.messenger.g0.h3(new la1(this.b, tL_error, 0));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new la1(this.b, tL_error, 1));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new la1(this.b, tL_error, 2));
                break;
            default:
                final int i10 = 1;
                final ra1 ra1Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ka1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                ra1.g0(ra1Var2, tL_error, tLObject);
                                break;
                            default:
                                ra1.m0(ra1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
