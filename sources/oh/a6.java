package oh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ka0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class a6 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ ka0 b;
    public final /* synthetic */ t6 c;

    public a6(t6 t6Var, long j10, ka0 ka0Var) {
        this.c = t6Var;
        this.a = j10;
        this.b = ka0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new mh.b2(this, tLObject, this.a, this.b, 9));
    }
}
