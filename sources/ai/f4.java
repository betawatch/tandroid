package ai;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wa0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class f4 implements wa0 {
    public final /* synthetic */ e6 a;

    public f4(e6 e6Var) {
        this.a = e6Var;
    }

    @Override // org.telegram.ui.Components.wa0
    public final void A(TLRPC.TL_document tL_document, String str, Object obj) {
        e6 e6Var = this.a;
        org.telegram.ui.Components.e5.a0(e6Var.C2, 1, e6Var.B1, new e4(this, tL_document, str, obj, 0));
    }

    @Override // org.telegram.ui.Components.wa0
    public final void O(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.a.b2.O0(i10, i11, charSequence, z10);
    }

    @Override // org.telegram.ui.Components.wa0
    public final void P(String str) {
        a4 a4Var = this.a.b2;
        a4Var.U();
        a4Var.U0.h(str);
    }

    @Override // org.telegram.ui.Components.wa0
    public final void f(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        e6 e6Var = this.a;
        org.telegram.ui.Components.e5.a0(e6Var.C2, 1, e6Var.B1, new d4(i10, 0, this, botInlineResult, z10));
    }

    @Override // org.telegram.ui.Components.wa0
    public final Paint.FontMetricsInt w() {
        return this.a.b2.getEditField().getPaint().getFontMetricsInt();
    }
}
