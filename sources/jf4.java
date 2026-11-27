// default package

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class jf4 extends hf4 {
    public final /* synthetic */ kf4 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf4(kf4 kf4Var, Context context, e eVar, int i, int i2) {
        super(context, eVar, i, i2);
        this.F = kf4Var;
    }

    @Override // hf4
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.F.e.q0(tL_exportedChatlistInvite);
    }
}
