package bi;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.la0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class s3 implements la0 {
    public final /* synthetic */ o5 a;

    public s3(o5 o5Var) {
        this.a = o5Var;
    }

    @Override // org.telegram.ui.Components.la0
    public final void f(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        o5 o5Var = this.a;
        org.telegram.ui.Components.e5.a0(o5Var.C2, 1, o5Var.B1, new q3(i10, 0, this, botInlineResult, z10));
    }

    @Override // org.telegram.ui.Components.la0
    public final Paint.FontMetricsInt k() {
        return this.a.b2.getEditField().getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Components.la0
    public final void n(TLRPC.TL_document tL_document, String str, Object obj) {
        o5 o5Var = this.a;
        org.telegram.ui.Components.e5.a0(o5Var.C2, 1, o5Var.B1, new r3(this, tL_document, str, obj, 0));
    }

    @Override // org.telegram.ui.Components.la0
    public final void v(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.a.b2.O0(i10, i11, charSequence, z10);
    }

    @Override // org.telegram.ui.Components.la0
    public final void x(String str) {
        n3 n3Var = this.a.b2;
        n3Var.U();
        n3Var.U0.h(str);
    }
}
