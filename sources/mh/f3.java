package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;

    public /* synthetic */ f3(g5 g5Var, int i10) {
        this.a = i10;
        this.b = g5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final g5 g5Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: mh.u1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                g5.a0(g5Var, tLObject, tL_error);
                                break;
                            default:
                                g5.y0(g5Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final g5 g5Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: mh.u1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                g5.a0(g5Var2, tLObject, tL_error);
                                break;
                            default:
                                g5.y0(g5Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
