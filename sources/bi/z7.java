package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class z7 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ e2.h b;
    public final /* synthetic */ u8 c;

    public z7(u8 u8Var, long j3, e2.h hVar) {
        this.c = u8Var;
        this.a = j3;
        this.b = hVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new x7(this, tLObject, this.a, this.b, 2));
    }
}
