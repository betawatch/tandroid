package ih;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.y90;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class c6 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ y90 b;
    public final /* synthetic */ v6 c;

    public c6(v6 v6Var, long j10, y90 y90Var) {
        this.c = v6Var;
        this.a = j10;
        this.b = y90Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new gh.e2(this, tLObject, this.a, this.b, 9));
    }
}
