package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class g3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5 b;

    public /* synthetic */ g3(k5 k5Var, int i9) {
        this.a = i9;
        this.b = k5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i9 = 0;
                final k5 k5Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.x1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                k5.Z(k5Var, tLObject, tL_error);
                                break;
                            default:
                                k5.x0(k5Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final k5 k5Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.x1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                k5.Z(k5Var2, tLObject, tL_error);
                                break;
                            default:
                                k5.x0(k5Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
