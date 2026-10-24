package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class u8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ha b;

    public /* synthetic */ u8(ha haVar, int i10) {
        this.a = i10;
        this.b = haVar;
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
