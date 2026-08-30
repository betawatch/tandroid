package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v6 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;

    public /* synthetic */ v6(int i10, Utilities.Callback callback) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c7(tLObject, this.b, 0));
                break;
            default:
                AndroidUtilities.runOnUIThread(new nh.n4(1, this.b, tL_error));
                break;
        }
    }
}
