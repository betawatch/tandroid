package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5 b;

    public /* synthetic */ g3(h5 h5Var, int i10) {
        this.a = i10;
        this.b = h5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final h5 h5Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: jh.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                h5.a0(h5Var, tLObject, tL_error);
                                break;
                            default:
                                h5.y0(h5Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final h5 h5Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: jh.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                h5.a0(h5Var2, tLObject, tL_error);
                                break;
                            default:
                                h5.y0(h5Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
