package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ca0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class y5 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ ca0 b;
    public final /* synthetic */ s6 c;

    public y5(s6 s6Var, long j10, ca0 ca0Var) {
        this.c = s6Var;
        this.a = j10;
        this.b = ca0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new hh.e2(this, tLObject, this.a, this.b, 9));
    }
}
