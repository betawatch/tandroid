package lh;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ha0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class r2 implements ha0 {
    public final /* synthetic */ d4 a;

    public r2(d4 d4Var) {
        this.a = d4Var;
    }

    @Override // org.telegram.ui.Components.ha0
    public final void b(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        d4 d4Var = this.a;
        org.telegram.ui.Components.c5.a0(d4Var.y2, 1, d4Var.x1, new q2(i10, 0, this, botInlineResult, z10));
    }

    @Override // org.telegram.ui.Components.ha0
    public final Paint.FontMetricsInt n() {
        return this.a.X1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Components.ha0
    public final void p(TLRPC.TL_document tL_document, String str, Object obj) {
        d4 d4Var = this.a;
        org.telegram.ui.Components.c5.a0(d4Var.y2, 1, d4Var.x1, new eg.d1(this, tL_document, str, obj, 3));
    }

    @Override // org.telegram.ui.Components.ha0
    public final void r(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.a.X1.O0(i10, i11, charSequence, z10);
    }

    @Override // org.telegram.ui.Components.ha0
    public final void s(String str) {
        n2 n2Var = this.a.X1;
        n2Var.U();
        n2Var.Q0.h(str);
    }
}
