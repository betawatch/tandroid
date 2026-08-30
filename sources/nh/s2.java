package nh;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ma0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class s2 implements ma0 {
    public final /* synthetic */ d4 a;

    public s2(d4 d4Var) {
        this.a = d4Var;
    }

    @Override // org.telegram.ui.Components.ma0
    public final void a(TLRPC.BotInlineResult botInlineResult, boolean z4, int i10) {
        d4 d4Var = this.a;
        org.telegram.ui.Components.z4.a0(d4Var.z2, 1, d4Var.y1, new r2(i10, 0, this, botInlineResult, z4));
    }

    @Override // org.telegram.ui.Components.ma0
    public final Paint.FontMetricsInt d() {
        return this.a.Y1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Components.ma0
    public final void i(TLRPC.TL_document tL_document, String str, Object obj) {
        d4 d4Var = this.a;
        org.telegram.ui.Components.z4.a0(d4Var.z2, 1, d4Var.y1, new gg.c1(this, tL_document, str, obj, 3));
    }

    @Override // org.telegram.ui.Components.ma0
    public final void j(int i10, int i11, CharSequence charSequence, boolean z4) {
        this.a.Y1.O0(i10, i11, charSequence, z4);
    }

    @Override // org.telegram.ui.Components.ma0
    public final void k(String str) {
        o2 o2Var = this.a.Y1;
        o2Var.U();
        o2Var.R0.h(str);
    }
}
