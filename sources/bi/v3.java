package bi;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lb0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class v3 implements lb0 {
    public final /* synthetic */ q5 a;

    public v3(q5 q5Var) {
        this.a = q5Var;
    }

    @Override // org.telegram.ui.Components.lb0
    public final void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        q5 q5Var = this.a;
        org.telegram.ui.Components.g5.Z(q5Var.C2, 1, q5Var.B1, new t3(i10, 0, this, botInlineResult, z10));
    }

    @Override // org.telegram.ui.Components.lb0
    public final Paint.FontMetricsInt i() {
        return this.a.b2.getEditField().getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Components.lb0
    public final void m(TLRPC.TL_document tL_document, String str, Object obj) {
        q5 q5Var = this.a;
        org.telegram.ui.Components.g5.Z(q5Var.C2, 1, q5Var.B1, new u3(this, tL_document, str, obj, 0));
    }

    @Override // org.telegram.ui.Components.lb0
    public final void r(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.a.b2.M0(i10, i11, charSequence, z10);
    }

    @Override // org.telegram.ui.Components.lb0
    public final void y(String str) {
        q3 q3Var = this.a.b2;
        q3Var.S();
        q3Var.U0.h(str);
    }
}
