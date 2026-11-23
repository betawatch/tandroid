package fi;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p90;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class m2 implements p90 {
    public final /* synthetic */ z3 a;

    public m2(z3 z3Var) {
        this.a = z3Var;
    }

    @Override // org.telegram.ui.Components.p90
    public final void E2(String str) {
        i2 i2Var = this.a.L1;
        i2Var.Z();
        i2Var.V0.h(str);
    }

    @Override // org.telegram.ui.Components.p90
    public final void G1(TLRPC.TL_document tL_document, String str, Object obj) {
        z3 z3Var = this.a;
        org.telegram.ui.Components.b5.X(z3Var.m2, 1, z3Var.l1, new bi.o2(this, tL_document, str, obj, 1));
    }

    @Override // org.telegram.ui.Components.p90
    public final void a0(TLRPC.BotInlineResult botInlineResult, boolean z10, int i7) {
        z3 z3Var = this.a;
        org.telegram.ui.Components.b5.X(z3Var.m2, 1, z3Var.l1, new l2(i7, 0, this, botInlineResult, z10));
    }

    @Override // org.telegram.ui.Components.p90
    public final Paint.FontMetricsInt j1() {
        return this.a.L1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Components.p90
    public final void x2(int i7, int i10, CharSequence charSequence, boolean z10) {
        this.a.L1.q1(i7, i10, charSequence, z10);
    }
}
