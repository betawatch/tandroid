package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.s80;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class p6 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ s80 b;
    public final /* synthetic */ h7 c;

    public p6(h7 h7Var, long j10, s80 s80Var) {
        this.c = h7Var;
        this.a = j10;
        this.b = s80Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ai.c3(this, tLObject, this.a, this.b, 9));
    }
}
