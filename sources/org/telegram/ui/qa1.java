package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class qa1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ xa1 b;

    public /* synthetic */ qa1(xa1 xa1Var, int i7) {
        this.a = i7;
        this.b = xa1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final xa1 xa1Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.sa1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                xa1.g0(xa1Var, tL_error, tLObject);
                                break;
                            default:
                                xa1.m0(xa1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                org.telegram.messenger.g0.h3(new ta1(this.b, tL_error, 0));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new ta1(this.b, tL_error, 1));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new ta1(this.b, tL_error, 2));
                break;
            default:
                final int i10 = 1;
                final xa1 xa1Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.sa1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                xa1.g0(xa1Var2, tL_error, tLObject);
                                break;
                            default:
                                xa1.m0(xa1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
