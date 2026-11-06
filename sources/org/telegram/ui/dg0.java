package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dg0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ jg0 b;

    public /* synthetic */ dg0(jg0 jg0Var, int i7) {
        this.a = i7;
        this.b = jg0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final jg0 jg0Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.cg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                jg0.Z(jg0Var, tL_error, tLObject);
                                break;
                            case 1:
                                jg0.b0(jg0Var, tL_error, tLObject);
                                break;
                            default:
                                jg0.a0(jg0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i10 = 1;
                final jg0 jg0Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.cg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                jg0.Z(jg0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                jg0.b0(jg0Var2, tL_error, tLObject);
                                break;
                            default:
                                jg0.a0(jg0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 2;
                final jg0 jg0Var3 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.cg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                jg0.Z(jg0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                jg0.b0(jg0Var3, tL_error, tLObject);
                                break;
                            default:
                                jg0.a0(jg0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
