// default package

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ld4 extends jd4 {
    public final /* synthetic */ md4 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld4(md4 md4Var, Context context, d dVar, int i, int i2) {
        super(context, dVar, i, i2);
        this.F = md4Var;
    }

    @Override // jd4
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.F.e.q0(tL_exportedChatlistInvite);
    }
}
