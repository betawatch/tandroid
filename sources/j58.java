// default package

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class j58 implements y17 {
    public final /* synthetic */ o68 a;

    public j58(o68 o68Var) {
        this.a = o68Var;
    }

    @Override // y17
    public final void H0(int i, int i2, CharSequence charSequence, boolean z) {
        this.a.L1.y1(i, i2, charSequence, z);
    }

    @Override // y17
    public final void T0(String str) {
        g58 g58Var = this.a.L1;
        g58Var.Z();
        g58Var.V0.d(str);
    }

    @Override // y17
    public final void m0(TLRPC.TL_document tL_document, String str, Object obj) {
        o68 o68Var = this.a;
        jj.X(o68Var.m2, o68Var.l1, 1, new ku0(this, tL_document, str, obj, (byte) 13));
    }

    @Override // y17
    public final void s(TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
        o68 o68Var = this.a;
        jj.X(o68Var.m2, o68Var.l1, 1, new g32(this, i, botInlineResult, z, (byte) 1));
    }

    @Override // y17
    public final Paint.FontMetricsInt w() {
        return this.a.L1.getEditField().getPaint().getFontMetricsInt();
    }
}
