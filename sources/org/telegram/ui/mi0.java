package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mi0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ si0 b;

    public /* synthetic */ mi0(si0 si0Var, int i10) {
        this.a = i10;
        this.b = si0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final si0 si0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.li0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                si0.U(si0Var, tL_error, tLObject);
                                break;
                            case 1:
                                si0.W(si0Var, tL_error, tLObject);
                                break;
                            default:
                                si0.V(si0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final si0 si0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.li0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                si0.U(si0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                si0.W(si0Var2, tL_error, tLObject);
                                break;
                            default:
                                si0.V(si0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final si0 si0Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.li0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                si0.U(si0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                si0.W(si0Var3, tL_error, tLObject);
                                break;
                            default:
                                si0.V(si0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
