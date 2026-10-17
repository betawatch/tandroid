package ci;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fb0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class a3 implements fb0 {
    public final /* synthetic */ q4 a;

    public a3(q4 q4Var) {
        this.a = q4Var;
    }

    @Override // org.telegram.ui.Components.fb0
    public final void A(TLRPC.TL_document tL_document, String str, Object obj) {
        q4 q4Var = this.a;
        org.telegram.ui.Components.f5.Z(q4Var.C2, 1, q4Var.B1, new z2(this, tL_document, str, obj, 0));
    }

    @Override // org.telegram.ui.Components.fb0
    public final void H(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.a.b2.M0(i10, i11, charSequence, z10);
    }

    @Override // org.telegram.ui.Components.fb0
    public final void P(String str) {
        v2 v2Var = this.a.b2;
        v2Var.S();
        v2Var.U0.h(str);
    }

    @Override // org.telegram.ui.Components.fb0
    public final void b(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        q4 q4Var = this.a;
        org.telegram.ui.Components.f5.Z(q4Var.C2, 1, q4Var.B1, new y2(i10, 0, this, botInlineResult, z10));
    }

    @Override // org.telegram.ui.Components.fb0
    public final Paint.FontMetricsInt w() {
        return this.a.b2.getEditField().getPaint().getFontMetricsInt();
    }
}
