package oh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class b6 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ h5.d b;
    public final /* synthetic */ t6 c;

    public b6(t6 t6Var, long j10, h5.d dVar) {
        this.c = t6Var;
        this.a = j10;
        this.b = dVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new mh.b2(this, tLObject, this.a, this.b, 10));
    }
}
