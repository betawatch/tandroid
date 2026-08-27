package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class l6 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ u7 b;

    public /* synthetic */ l6(u7 u7Var, int i10) {
        this.a = i10;
        this.b = u7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s6(this.b, tLObject, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new s6(this.b, tLObject, 1));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new s6(this.b, tLObject, 2));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new s6(this.b, tLObject, 3));
                break;
            default:
                AndroidUtilities.runOnUIThread(new s6(this.b, tLObject, 4));
                break;
        }
    }
}
