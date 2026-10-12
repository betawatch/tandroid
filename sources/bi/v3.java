package bi;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lb0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class v3 implements lb0 {
    public final /* synthetic */ q5 a;

    public v3(q5 q5Var) {
        this.a = q5Var;
    }

    @Override // org.telegram.ui.Components.lb0
    public final void E(String str) {
        q3 q3Var = this.a.b2;
        q3Var.S();
        q3Var.U0.h(str);
    }

    @Override // org.telegram.ui.Components.lb0
    public final void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        q5 q5Var = this.a;
        org.telegram.ui.Components.g5.Z(q5Var.C2, 1, q5Var.B1, new t3(i10, 0, this, botInlineResult, z10));
    }

    @Override // org.telegram.ui.Components.lb0
    public final Paint.FontMetricsInt m() {
        return this.a.b2.getEditField().getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Components.lb0
    public final void r(TLRPC.TL_document tL_document, String str, Object obj) {
        q5 q5Var = this.a;
        org.telegram.ui.Components.g5.Z(q5Var.C2, 1, q5Var.B1, new u3(this, tL_document, str, obj, 0));
    }

    @Override // org.telegram.ui.Components.lb0
    public final void y(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.a.b2.M0(i10, i11, charSequence, z10);
    }
}
