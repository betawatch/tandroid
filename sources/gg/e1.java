package gg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ k1 b;

    public /* synthetic */ e1(k1 k1Var, int i10) {
        this.a = i10;
        this.b = k1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final k1 k1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: gg.c1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                k1 k1Var2 = k1Var;
                                k1Var2.b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        k1Var2.finishFragment();
                                        break;
                                    } else {
                                        org.telegram.messenger.a2.p(R.string.UnknownError, wc.a0(k1Var2), null);
                                        break;
                                    }
                                } else {
                                    wc.b0(tL_error2);
                                    break;
                                }
                            default:
                                k1 k1Var3 = k1Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        k1Var3.finishFragment();
                                        break;
                                    } else {
                                        k1Var3.b.a(0.0f);
                                        org.telegram.messenger.a2.p(R.string.UnknownError, wc.a0(k1Var3), null);
                                        break;
                                    }
                                } else {
                                    k1Var3.b.a(0.0f);
                                    wc.b0(tL_error3);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final k1 k1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: gg.c1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                k1 k1Var22 = k1Var2;
                                k1Var22.b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        k1Var22.finishFragment();
                                        break;
                                    } else {
                                        org.telegram.messenger.a2.p(R.string.UnknownError, wc.a0(k1Var22), null);
                                        break;
                                    }
                                } else {
                                    wc.b0(tL_error2);
                                    break;
                                }
                            default:
                                k1 k1Var3 = k1Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        k1Var3.finishFragment();
                                        break;
                                    } else {
                                        k1Var3.b.a(0.0f);
                                        org.telegram.messenger.a2.p(R.string.UnknownError, wc.a0(k1Var3), null);
                                        break;
                                    }
                                } else {
                                    k1Var3.b.a(0.0f);
                                    wc.b0(tL_error3);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
