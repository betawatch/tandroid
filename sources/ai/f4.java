package ai;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ya0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class f4 implements ya0 {
    public final /* synthetic */ e6 a;

    public f4(e6 e6Var) {
        this.a = e6Var;
    }

    @Override // org.telegram.ui.Components.ya0
    public final void C(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.a.b2.O0(i10, i11, charSequence, z10);
    }

    @Override // org.telegram.ui.Components.ya0
    public final void G(String str) {
        a4 a4Var = this.a.b2;
        a4Var.S();
        a4Var.U0.h(str);
    }

    @Override // org.telegram.ui.Components.ya0
    public final void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        e6 e6Var = this.a;
        org.telegram.ui.Components.e5.a0(e6Var.C2, 1, e6Var.B1, new d4(i10, 0, this, botInlineResult, z10));
    }

    @Override // org.telegram.ui.Components.ya0
    public final Paint.FontMetricsInt r() {
        return this.a.b2.getEditField().getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Components.ya0
    public final void y(TLRPC.TL_document tL_document, String str, Object obj) {
        e6 e6Var = this.a;
        org.telegram.ui.Components.e5.a0(e6Var.C2, 1, e6Var.B1, new e4(this, tL_document, str, obj, 0));
    }
}
