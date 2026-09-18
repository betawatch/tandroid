package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class r8 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ e2.h b;
    public final /* synthetic */ l9 c;

    public r8(l9 l9Var, long j3, e2.h hVar) {
        this.c = l9Var;
        this.a = j3;
        this.b = hVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new p8(this, tLObject, this.a, this.b, 2));
    }
}
