// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class axb extends it5 {
    public final /* synthetic */ long u2;
    public final /* synthetic */ cxb v2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axb(cxb cxbVar, Context context, int i, vh6 vh6Var, long j, d dVar, long j2) {
        super(context, i, vh6Var, j, dVar, null);
        this.v2 = cxbVar;
        this.u2 = j2;
    }

    @Override // it5
    public final boolean M0() {
        TLRPC.Chat L0 = this.v2.b.getMessagesController().L0(Long.valueOf(this.u2));
        return L0 != null && sd2.y(3, L0);
    }
}
