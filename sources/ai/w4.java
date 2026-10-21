package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;

    public /* synthetic */ w4(l7 l7Var, int i10) {
        this.a = i10;
        this.b = l7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final l7 l7Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ai.p2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                l7.S(l7Var, tLObject, tL_error);
                                break;
                            default:
                                l7.D0(l7Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final l7 l7Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ai.p2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                l7.S(l7Var2, tLObject, tL_error);
                                break;
                            default:
                                l7.D0(l7Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
