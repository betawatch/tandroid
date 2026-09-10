package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ mh1 b;

    public /* synthetic */ fh1(mh1 mh1Var, int i10) {
        this.a = i10;
        this.b = mh1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final mh1 mh1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.hh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                mh1.b0(mh1Var, tL_error, tLObject);
                                break;
                            default:
                                mh1.h0(mh1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ih1(this.b, tL_error, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ih1(this.b, tL_error, 1));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ih1(this.b, tL_error, 2));
                break;
            default:
                final int i11 = 1;
                final mh1 mh1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.hh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                mh1.b0(mh1Var2, tL_error, tLObject);
                                break;
                            default:
                                mh1.h0(mh1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
