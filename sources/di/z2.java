package di;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.db0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class z2 implements db0 {
    public final /* synthetic */ q4 a;

    public z2(q4 q4Var) {
        this.a = q4Var;
    }

    @Override // org.telegram.ui.Components.db0
    public final Paint.FontMetricsInt D() {
        return this.a.Q1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Components.db0
    public final void J(TLRPC.TL_document tL_document, String str, Object obj) {
        q4 q4Var = this.a;
        org.telegram.ui.Components.g5.Z(q4Var.r2, 1, q4Var.q1, new y2(this, tL_document, str, obj, 0));
    }

    @Override // org.telegram.ui.Components.db0
    public final void X(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.a.Q1.M0(i10, i11, charSequence, z10);
    }

    @Override // org.telegram.ui.Components.db0
    public final void b0(String str) {
        u2 u2Var = this.a.Q1;
        u2Var.R();
        u2Var.U0.h(str);
    }

    @Override // org.telegram.ui.Components.db0
    public final void j(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        q4 q4Var = this.a;
        org.telegram.ui.Components.g5.Z(q4Var.r2, 1, q4Var.q1, new x2(i10, 0, this, botInlineResult, z10));
    }
}
