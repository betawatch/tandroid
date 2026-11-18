package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ng0 b;

    public /* synthetic */ gg0(ng0 ng0Var, int i7) {
        this.a = i7;
        this.b = ng0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final ng0 ng0Var = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.fg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                ng0.Z(ng0Var, tL_error, tLObject);
                                break;
                            case 1:
                                ng0.b0(ng0Var, tL_error, tLObject);
                                break;
                            default:
                                ng0.a0(ng0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i10 = 1;
                final ng0 ng0Var2 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.fg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                ng0.Z(ng0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                ng0.b0(ng0Var2, tL_error, tLObject);
                                break;
                            default:
                                ng0.a0(ng0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 2;
                final ng0 ng0Var3 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.fg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                ng0.Z(ng0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                ng0.b0(ng0Var3, tL_error, tLObject);
                                break;
                            default:
                                ng0.a0(ng0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
