package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class hg0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ og0 b;

    public /* synthetic */ hg0(og0 og0Var, int i7) {
        this.a = i7;
        this.b = og0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final og0 og0Var = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.gg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                og0.Z(og0Var, tL_error, tLObject);
                                break;
                            case 1:
                                og0.b0(og0Var, tL_error, tLObject);
                                break;
                            default:
                                og0.a0(og0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i10 = 1;
                final og0 og0Var2 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.gg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                og0.Z(og0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                og0.b0(og0Var2, tL_error, tLObject);
                                break;
                            default:
                                og0.a0(og0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 2;
                final og0 og0Var3 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.gg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                og0.Z(og0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                og0.b0(og0Var3, tL_error, tLObject);
                                break;
                            default:
                                og0.a0(og0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
