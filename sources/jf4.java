// default package

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
