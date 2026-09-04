package ig;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;

    public /* synthetic */ a1(e1 e1Var, int i10) {
        this.a = i10;
        this.b = e1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final e1 e1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ig.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                e1 e1Var2 = e1Var;
                                e1Var2.b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        e1Var2.finishFragment();
                                        break;
                                    } else {
                                        org.telegram.messenger.w1.p(R.string.UnknownError, yc.a0(e1Var2), null);
                                        break;
                                    }
                                } else {
                                    yc.b0(tL_error2);
                                    break;
                                }
                            default:
                                e1 e1Var3 = e1Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        e1Var3.finishFragment();
                                        break;
                                    } else {
                                        e1Var3.b.a(0.0f);
                                        org.telegram.messenger.w1.p(R.string.UnknownError, yc.a0(e1Var3), null);
                                        break;
                                    }
                                } else {
                                    e1Var3.b.a(0.0f);
                                    yc.b0(tL_error3);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final e1 e1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ig.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                e1 e1Var22 = e1Var2;
                                e1Var22.b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        e1Var22.finishFragment();
                                        break;
                                    } else {
                                        org.telegram.messenger.w1.p(R.string.UnknownError, yc.a0(e1Var22), null);
                                        break;
                                    }
                                } else {
                                    yc.b0(tL_error2);
                                    break;
                                }
                            default:
                                e1 e1Var3 = e1Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        e1Var3.finishFragment();
                                        break;
                                    } else {
                                        e1Var3.b.a(0.0f);
                                        org.telegram.messenger.w1.p(R.string.UnknownError, yc.a0(e1Var3), null);
                                        break;
                                    }
                                } else {
                                    e1Var3.b.a(0.0f);
                                    yc.b0(tL_error3);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
