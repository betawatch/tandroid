package hg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vc;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;

    public /* synthetic */ b1(f1 f1Var, int i10) {
        this.a = i10;
        this.b = f1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final f1 f1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: hg.z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                f1 f1Var2 = f1Var;
                                f1Var2.b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        f1Var2.finishFragment();
                                        break;
                                    } else {
                                        org.telegram.messenger.y0.p(R.string.UnknownError, vc.a0(f1Var2), null);
                                        break;
                                    }
                                } else {
                                    vc.b0(tL_error2);
                                    break;
                                }
                            default:
                                f1 f1Var3 = f1Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        f1Var3.finishFragment();
                                        break;
                                    } else {
                                        f1Var3.b.a(0.0f);
                                        org.telegram.messenger.y0.p(R.string.UnknownError, vc.a0(f1Var3), null);
                                        break;
                                    }
                                } else {
                                    f1Var3.b.a(0.0f);
                                    vc.b0(tL_error3);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final f1 f1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: hg.z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                f1 f1Var22 = f1Var2;
                                f1Var22.b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        f1Var22.finishFragment();
                                        break;
                                    } else {
                                        org.telegram.messenger.y0.p(R.string.UnknownError, vc.a0(f1Var22), null);
                                        break;
                                    }
                                } else {
                                    vc.b0(tL_error2);
                                    break;
                                }
                            default:
                                f1 f1Var3 = f1Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        f1Var3.finishFragment();
                                        break;
                                    } else {
                                        f1Var3.b.a(0.0f);
                                        org.telegram.messenger.y0.p(R.string.UnknownError, vc.a0(f1Var3), null);
                                        break;
                                    }
                                } else {
                                    f1Var3.b.a(0.0f);
                                    vc.b0(tL_error3);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
