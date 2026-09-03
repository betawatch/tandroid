package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j6 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ t7 b;

    public /* synthetic */ j6(t7 t7Var, int i10) {
        this.a = i10;
        this.b = t7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r6(this.b, tLObject, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new r6(this.b, tLObject, 1));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new r6(this.b, tLObject, 2));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new r6(this.b, tLObject, 3));
                break;
            default:
                AndroidUtilities.runOnUIThread(new r6(this.b, tLObject, 4));
                break;
        }
    }
}
