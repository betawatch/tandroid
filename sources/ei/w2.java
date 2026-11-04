package ei;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z80;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w2 implements z80 {
    public final /* synthetic */ j4 a;

    public w2(j4 j4Var) {
        this.a = j4Var;
    }

    @Override // org.telegram.ui.Components.z80
    public final void e(TLRPC.BotInlineResult botInlineResult, boolean z10, int i3) {
        j4 j4Var = this.a;
        org.telegram.ui.Components.t4.Z(j4Var.m2, 1, j4Var.l1, new v2(i3, 0, this, botInlineResult, z10));
    }

    @Override // org.telegram.ui.Components.z80
    public final Paint.FontMetricsInt n() {
        return this.a.L1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Components.z80
    public final void q(TLRPC.TL_document tL_document, String str, Object obj) {
        j4 j4Var = this.a;
        org.telegram.ui.Components.t4.Z(j4Var.m2, 1, j4Var.l1, new ai.v1(this, tL_document, str, obj, 1));
    }

    @Override // org.telegram.ui.Components.z80
    public final void t(int i3, int i10, CharSequence charSequence, boolean z10) {
        this.a.L1.N0(i3, i10, charSequence, z10);
    }

    @Override // org.telegram.ui.Components.z80
    public final void w(String str) {
        s2 s2Var = this.a.L1;
        s2Var.Q();
        s2Var.V0.h(str);
    }
}
