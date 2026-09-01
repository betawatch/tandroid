package oh;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oa0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class t2 implements oa0 {
    public final /* synthetic */ f4 a;

    public t2(f4 f4Var) {
        this.a = f4Var;
    }

    @Override // org.telegram.ui.Components.oa0
    public final void N(TLRPC.TL_document tL_document, String str, Object obj) {
        f4 f4Var = this.a;
        org.telegram.ui.Components.z4.a0(f4Var.z2, 1, f4Var.y1, new hg.c1(this, tL_document, str, obj, 3));
    }

    @Override // org.telegram.ui.Components.oa0
    public final void U(int i10, int i11, CharSequence charSequence, boolean z4) {
        this.a.Y1.O0(i10, i11, charSequence, z4);
    }

    @Override // org.telegram.ui.Components.oa0
    public final void X(String str) {
        p2 p2Var = this.a.Y1;
        p2Var.U();
        p2Var.R0.h(str);
    }

    @Override // org.telegram.ui.Components.oa0
    public final void l(TLRPC.BotInlineResult botInlineResult, boolean z4, int i10) {
        f4 f4Var = this.a;
        org.telegram.ui.Components.z4.a0(f4Var.z2, 1, f4Var.y1, new s2(i10, 0, this, botInlineResult, z4));
    }

    @Override // org.telegram.ui.Components.oa0
    public final Paint.FontMetricsInt w() {
        return this.a.Y1.getEditField().getPaint().getFontMetricsInt();
    }
}
