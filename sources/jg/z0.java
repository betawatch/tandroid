package jg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.vh;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ z0(d1 d1Var, int i10) {
        this.a = i10;
        this.b = d1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final d1 d1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: jg.x0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                d1 d1Var2 = d1Var;
                                d1Var2.b.b(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        d1Var2.finishFragment();
                                        break;
                                    } else {
                                        vh.n(R.string.UnknownError, wc.b0(d1Var2), null);
                                        break;
                                    }
                                } else {
                                    wc.e0(tL_error2);
                                    break;
                                }
                            default:
                                d1 d1Var3 = d1Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        d1Var3.finishFragment();
                                        break;
                                    } else {
                                        d1Var3.b.b(false);
                                        vh.n(R.string.UnknownError, wc.b0(d1Var3), null);
                                        break;
                                    }
                                } else {
                                    d1Var3.b.b(false);
                                    wc.e0(tL_error3);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final d1 d1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: jg.x0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                d1 d1Var22 = d1Var2;
                                d1Var22.b.b(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        d1Var22.finishFragment();
                                        break;
                                    } else {
                                        vh.n(R.string.UnknownError, wc.b0(d1Var22), null);
                                        break;
                                    }
                                } else {
                                    wc.e0(tL_error2);
                                    break;
                                }
                            default:
                                d1 d1Var3 = d1Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        d1Var3.finishFragment();
                                        break;
                                    } else {
                                        d1Var3.b.b(false);
                                        vh.n(R.string.UnknownError, wc.b0(d1Var3), null);
                                        break;
                                    }
                                } else {
                                    d1Var3.b.b(false);
                                    wc.e0(tL_error3);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
