package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class s8 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ l9 c;

    public s8(l9 l9Var, long j3, Utilities.Callback callback) {
        this.c = l9Var;
        this.a = j3;
        this.b = callback;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new q8(this, tLObject, this.a, this.b, 2));
    }
}
