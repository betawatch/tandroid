package ci;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gb0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class z2 implements gb0 {
    public final /* synthetic */ p4 a;

    public z2(p4 p4Var) {
        this.a = p4Var;
    }

    @Override // org.telegram.ui.Components.gb0
    public final void B(TLRPC.TL_document tL_document, String str, Object obj) {
        p4 p4Var = this.a;
        org.telegram.ui.Components.f5.a0(p4Var.C2, 1, p4Var.B1, new y2(this, tL_document, str, obj, 0));
    }

    @Override // org.telegram.ui.Components.gb0
    public final void I(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.a.b2.M0(i10, i11, charSequence, z10);
    }

    @Override // org.telegram.ui.Components.gb0
    public final void L(String str) {
        u2 u2Var = this.a.b2;
        u2Var.R();
        u2Var.U0.h(str);
    }

    @Override // org.telegram.ui.Components.gb0
    public final void i(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        p4 p4Var = this.a;
        org.telegram.ui.Components.f5.a0(p4Var.C2, 1, p4Var.B1, new x2(i10, 0, this, botInlineResult, z10));
    }

    @Override // org.telegram.ui.Components.gb0
    public final Paint.FontMetricsInt v() {
        return this.a.b2.getEditField().getPaint().getFontMetricsInt();
    }
}
