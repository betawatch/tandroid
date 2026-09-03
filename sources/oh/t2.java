package oh;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oa0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
