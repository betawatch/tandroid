package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class u8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ga b;

    public /* synthetic */ u8(ga gaVar, int i10) {
        this.a = i10;
        this.b = gaVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c9(this.b, tLObject, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new c9(this.b, tLObject, 1));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new c9(this.b, tLObject, 2));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new c9(this.b, tLObject, 3));
                break;
            default:
                AndroidUtilities.runOnUIThread(new c9(this.b, tLObject, 4));
                break;
        }
    }
}
