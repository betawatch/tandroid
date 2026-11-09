package di;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e90;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class t2 implements e90 {
    public final /* synthetic */ j4 a;

    public t2(j4 j4Var) {
        this.a = j4Var;
    }

    @Override // org.telegram.ui.Components.e90
    public final void G1(String str) {
        o2 o2Var = this.a.K1;
        o2Var.Q();
        o2Var.U0.h(str);
    }

    @Override // org.telegram.ui.Components.e90
    public final void M(TLRPC.BotInlineResult botInlineResult, boolean z9, int i7) {
        j4 j4Var = this.a;
        org.telegram.ui.Components.v4.X(j4Var.l2, 1, j4Var.k1, new r2(i7, 0, this, botInlineResult, z9));
    }

    @Override // org.telegram.ui.Components.e90
    public final Paint.FontMetricsInt R0() {
        return this.a.K1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Components.e90
    public final void e1(TLRPC.TL_document tL_document, String str, Object obj) {
        j4 j4Var = this.a;
        org.telegram.ui.Components.v4.X(j4Var.l2, 1, j4Var.k1, new s2(this, tL_document, str, obj, 0));
    }

    @Override // org.telegram.ui.Components.e90
    public final void z1(int i7, int i10, CharSequence charSequence, boolean z9) {
        this.a.K1.O0(i7, i10, charSequence, z9);
    }
}
