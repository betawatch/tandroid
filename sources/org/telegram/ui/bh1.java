package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class bh1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ih1 b;

    public /* synthetic */ bh1(ih1 ih1Var, int i10) {
        this.a = i10;
        this.b = ih1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final ih1 ih1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.dh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                ih1.b0(ih1Var, tL_error, tLObject);
                                break;
                            default:
                                ih1.h0(ih1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new eh1(this.b, tL_error, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new eh1(this.b, tL_error, 1));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new eh1(this.b, tL_error, 2));
                break;
            default:
                final int i11 = 1;
                final ih1 ih1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.dh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                ih1.b0(ih1Var2, tL_error, tLObject);
                                break;
                            default:
                                ih1.h0(ih1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
