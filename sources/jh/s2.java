package jh;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x90;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class s2 implements x90 {
    public final /* synthetic */ e4 a;

    public s2(e4 e4Var) {
        this.a = e4Var;
    }

    @Override // org.telegram.ui.Components.x90
    public final void H(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.a.X1.O0(i10, i11, charSequence, z10);
    }

    @Override // org.telegram.ui.Components.x90
    public final void K(String str) {
        o2 o2Var = this.a.X1;
        o2Var.U();
        o2Var.Q0.h(str);
    }

    @Override // org.telegram.ui.Components.x90
    public final void c(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        e4 e4Var = this.a;
        org.telegram.ui.Components.y4.a0(e4Var.y2, 1, e4Var.x1, new r2(i10, 0, this, botInlineResult, z10));
    }

    @Override // org.telegram.ui.Components.x90
    public final Paint.FontMetricsInt u() {
        return this.a.X1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Components.x90
    public final void x(TLRPC.TL_document tL_document, String str, Object obj) {
        e4 e4Var = this.a;
        org.telegram.ui.Components.y4.a0(e4Var.y2, 1, e4Var.x1, new cg.e1(this, tL_document, str, obj, 3));
    }
}
