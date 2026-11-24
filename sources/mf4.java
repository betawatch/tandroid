// default package

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mf4 extends kf4 {
    public final /* synthetic */ nf4 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf4(nf4 nf4Var, Context context, d dVar, int i, int i2) {
        super(context, dVar, i, i2);
        this.F = nf4Var;
    }

    @Override // kf4
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.F.e.r0(tL_exportedChatlistInvite);
    }
}
