package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.y60;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h6 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ y60 b;
    public final /* synthetic */ z6 c;

    public h6(z6 z6Var, long j3, y60 y60Var) {
        this.c = z6Var;
        this.a = j3;
        this.b = y60Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new bi.w2(this, tLObject, this.a, this.b, 9));
    }
}
