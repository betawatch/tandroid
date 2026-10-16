package ig;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.sk;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                                        sk.q(R.string.UnknownError, zc.a0(e1Var2), null);
                                        break;
                                    }
                                } else {
                                    zc.d0(tL_error2);
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
                                        sk.q(R.string.UnknownError, zc.a0(e1Var3), null);
                                        break;
                                    }
                                } else {
                                    e1Var3.b.a(0.0f);
                                    zc.d0(tL_error3);
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
                                        sk.q(R.string.UnknownError, zc.a0(e1Var22), null);
                                        break;
                                    }
                                } else {
                                    zc.d0(tL_error2);
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
                                        sk.q(R.string.UnknownError, zc.a0(e1Var3), null);
                                        break;
                                    }
                                } else {
                                    e1Var3.b.a(0.0f);
                                    zc.d0(tL_error3);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
