package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca b;

    public /* synthetic */ q8(ca caVar, int i10) {
        this.a = i10;
        this.b = caVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x8(this.b, tLObject, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new x8(this.b, tLObject, 1));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new x8(this.b, tLObject, 2));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new x8(this.b, tLObject, 3));
                break;
            default:
                AndroidUtilities.runOnUIThread(new x8(this.b, tLObject, 4));
                break;
        }
    }
}
