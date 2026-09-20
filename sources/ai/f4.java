package ai;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sa0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class f4 implements sa0 {
    public final /* synthetic */ f6 a;

    public f4(f6 f6Var) {
        this.a = f6Var;
    }

    @Override // org.telegram.ui.Components.sa0
    public final void A(TLRPC.TL_document tL_document, String str, Object obj) {
        f6 f6Var = this.a;
        org.telegram.ui.Components.d5.a0(f6Var.C2, 1, f6Var.B1, new e4(this, tL_document, str, obj, 0));
    }

    @Override // org.telegram.ui.Components.sa0
    public final void O(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.a.b2.O0(i10, i11, charSequence, z10);
    }

    @Override // org.telegram.ui.Components.sa0
    public final void P(String str) {
        a4 a4Var = this.a.b2;
        a4Var.U();
        a4Var.U0.h(str);
    }

    @Override // org.telegram.ui.Components.sa0
    public final void f(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        f6 f6Var = this.a;
        org.telegram.ui.Components.d5.a0(f6Var.C2, 1, f6Var.B1, new d4(i10, 0, this, botInlineResult, z10));
    }

    @Override // org.telegram.ui.Components.sa0
    public final Paint.FontMetricsInt s() {
        return this.a.b2.getEditField().getPaint().getFontMetricsInt();
    }
}
