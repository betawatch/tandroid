package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class m6 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ v7 b;

    public /* synthetic */ m6(v7 v7Var, int i9) {
        this.a = i9;
        this.b = v7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t6(this.b, tLObject, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new t6(this.b, tLObject, 1));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new t6(this.b, tLObject, 2));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new t6(this.b, tLObject, 3));
                break;
            default:
                AndroidUtilities.runOnUIThread(new t6(this.b, tLObject, 4));
                break;
        }
    }
}
