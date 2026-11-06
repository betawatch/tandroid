package di;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d90;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class t2 implements d90 {
    public final /* synthetic */ i4 a;

    public t2(i4 i4Var) {
        this.a = i4Var;
    }

    @Override // org.telegram.ui.Components.d90
    public final void G1(String str) {
        o2 o2Var = this.a.K1;
        o2Var.Q();
        o2Var.U0.h(str);
    }

    @Override // org.telegram.ui.Components.d90
    public final void M(TLRPC.BotInlineResult botInlineResult, boolean z9, int i7) {
        i4 i4Var = this.a;
        org.telegram.ui.Components.v4.X(i4Var.l2, 1, i4Var.k1, new r2(i7, 0, this, botInlineResult, z9));
    }

    @Override // org.telegram.ui.Components.d90
    public final Paint.FontMetricsInt R0() {
        return this.a.K1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Components.d90
    public final void e1(TLRPC.TL_document tL_document, String str, Object obj) {
        i4 i4Var = this.a;
        org.telegram.ui.Components.v4.X(i4Var.l2, 1, i4Var.k1, new s2(this, tL_document, str, obj, 0));
    }

    @Override // org.telegram.ui.Components.d90
    public final void z1(int i7, int i10, CharSequence charSequence, boolean z9) {
        this.a.K1.O0(i7, i10, charSequence, z9);
    }
}
