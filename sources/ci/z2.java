package ci;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fb0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class z2 implements fb0 {
    public final /* synthetic */ p4 a;

    public z2(p4 p4Var) {
        this.a = p4Var;
    }

    @Override // org.telegram.ui.Components.fb0
    public final void A(TLRPC.TL_document tL_document, String str, Object obj) {
        p4 p4Var = this.a;
        org.telegram.ui.Components.f5.Z(p4Var.C2, 1, p4Var.B1, new y2(this, tL_document, str, obj, 0));
    }

    @Override // org.telegram.ui.Components.fb0
    public final void H(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.a.b2.M0(i10, i11, charSequence, z10);
    }

    @Override // org.telegram.ui.Components.fb0
    public final void P(String str) {
        u2 u2Var = this.a.b2;
        u2Var.S();
        u2Var.U0.h(str);
    }

    @Override // org.telegram.ui.Components.fb0
    public final void b(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        p4 p4Var = this.a;
        org.telegram.ui.Components.f5.Z(p4Var.C2, 1, p4Var.B1, new x2(i10, 0, this, botInlineResult, z10));
    }

    @Override // org.telegram.ui.Components.fb0
    public final Paint.FontMetricsInt w() {
        return this.a.b2.getEditField().getPaint().getFontMetricsInt();
    }
}
