package ai;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mb0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class g4 implements mb0 {
    public final /* synthetic */ f6 a;

    public g4(f6 f6Var) {
        this.a = f6Var;
    }

    @Override // org.telegram.ui.Components.mb0
    public final void e(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        f6 f6Var = this.a;
        org.telegram.ui.Components.g5.Z(f6Var.C2, 1, f6Var.B1, new e4(i10, 0, this, botInlineResult, z10));
    }

    @Override // org.telegram.ui.Components.mb0
    public final Paint.FontMetricsInt f() {
        return this.a.b2.getEditField().getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Components.mb0
    public final void i(TLRPC.TL_document tL_document, String str, Object obj) {
        f6 f6Var = this.a;
        org.telegram.ui.Components.g5.Z(f6Var.C2, 1, f6Var.B1, new f4(this, tL_document, str, obj, 0));
    }

    @Override // org.telegram.ui.Components.mb0
    public final void k(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.a.b2.M0(i10, i11, charSequence, z10);
    }

    @Override // org.telegram.ui.Components.mb0
    public final void m(String str) {
        b4 b4Var = this.a.b2;
        b4Var.S();
        b4Var.U0.h(str);
    }
}
