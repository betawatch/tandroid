package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j6 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ s7 b;

    public /* synthetic */ j6(s7 s7Var, int i10) {
        this.a = i10;
        this.b = s7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q6(this.b, tLObject, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new q6(this.b, tLObject, 1));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new q6(this.b, tLObject, 2));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new q6(this.b, tLObject, 3));
                break;
            default:
                AndroidUtilities.runOnUIThread(new q6(this.b, tLObject, 4));
                break;
        }
    }
}
