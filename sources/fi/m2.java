package fi;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q90;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class m2 implements q90 {
    public final /* synthetic */ z3 a;

    public m2(z3 z3Var) {
        this.a = z3Var;
    }

    @Override // org.telegram.ui.Components.q90
    public final Paint.FontMetricsInt P() {
        return this.a.L1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Components.q90
    public final void Y(TLRPC.TL_document tL_document, String str, Object obj) {
        z3 z3Var = this.a;
        org.telegram.ui.Components.b5.X(z3Var.m2, 1, z3Var.l1, new bi.i2(this, tL_document, str, obj, 1));
    }

    @Override // org.telegram.ui.Components.q90
    public final void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i7) {
        z3 z3Var = this.a;
        org.telegram.ui.Components.b5.X(z3Var.m2, 1, z3Var.l1, new l2(i7, 0, this, botInlineResult, z10));
    }

    @Override // org.telegram.ui.Components.q90
    public final void l0(int i7, int i10, CharSequence charSequence, boolean z10) {
        this.a.L1.l1(i7, i10, charSequence, z10);
    }

    @Override // org.telegram.ui.Components.q90
    public final void q0(String str) {
        i2 i2Var = this.a.L1;
        i2Var.Z();
        i2Var.V0.h(str);
    }
}
