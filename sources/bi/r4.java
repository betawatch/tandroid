package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;

    public /* synthetic */ r4(h7 h7Var, int i10) {
        this.a = i10;
        this.b = h7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final h7 h7Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bi.m2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                h7.R(h7Var, tLObject, tL_error);
                                break;
                            default:
                                h7.C0(h7Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final h7 h7Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bi.m2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                h7.R(h7Var2, tLObject, tL_error);
                                break;
                            default:
                                h7.C0(h7Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
