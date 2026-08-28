package ih;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t90;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class t2 implements t90 {
    public final /* synthetic */ i4 a;

    public t2(i4 i4Var) {
        this.a = i4Var;
    }

    @Override // org.telegram.ui.Components.t90
    public final void A(String str) {
        p2 p2Var = this.a.X1;
        p2Var.T();
        p2Var.Q0.h(str);
    }

    @Override // org.telegram.ui.Components.t90
    public final void a(TLRPC.BotInlineResult botInlineResult, boolean z10, int i9) {
        i4 i4Var = this.a;
        org.telegram.ui.Components.y4.a0(i4Var.y2, 1, i4Var.x1, new s2(i9, 0, this, botInlineResult, z10));
    }

    @Override // org.telegram.ui.Components.t90
    public final Paint.FontMetricsInt h() {
        return this.a.X1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Components.t90
    public final void p(TLRPC.TL_document tL_document, String str, Object obj) {
        i4 i4Var = this.a;
        org.telegram.ui.Components.y4.a0(i4Var.y2, 1, i4Var.x1, new bg.j1(this, tL_document, str, obj, 3));
    }

    @Override // org.telegram.ui.Components.t90
    public final void y(int i9, int i10, CharSequence charSequence, boolean z10) {
        this.a.X1.O0(i9, i10, charSequence, z10);
    }
}
