package ig;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.sl;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ y0(c1 c1Var, int i10) {
        this.a = i10;
        this.b = c1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final c1 c1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ig.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                c1 c1Var2 = c1Var;
                                c1Var2.b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        c1Var2.finishFragment();
                                        break;
                                    } else {
                                        sl.q(R.string.UnknownError, xc.a0(c1Var2), null);
                                        break;
                                    }
                                } else {
                                    xc.d0(tL_error2);
                                    break;
                                }
                            default:
                                c1 c1Var3 = c1Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        c1Var3.finishFragment();
                                        break;
                                    } else {
                                        c1Var3.b.a(0.0f);
                                        sl.q(R.string.UnknownError, xc.a0(c1Var3), null);
                                        break;
                                    }
                                } else {
                                    c1Var3.b.a(0.0f);
                                    xc.d0(tL_error3);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final c1 c1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ig.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                c1 c1Var22 = c1Var2;
                                c1Var22.b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        c1Var22.finishFragment();
                                        break;
                                    } else {
                                        sl.q(R.string.UnknownError, xc.a0(c1Var22), null);
                                        break;
                                    }
                                } else {
                                    xc.d0(tL_error2);
                                    break;
                                }
                            default:
                                c1 c1Var3 = c1Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        c1Var3.finishFragment();
                                        break;
                                    } else {
                                        c1Var3.b.a(0.0f);
                                        sl.q(R.string.UnknownError, xc.a0(c1Var3), null);
                                        break;
                                    }
                                } else {
                                    c1Var3.b.a(0.0f);
                                    xc.d0(tL_error3);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
