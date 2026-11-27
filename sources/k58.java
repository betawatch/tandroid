// default package

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class k58 implements y17 {
    public final /* synthetic */ o68 a;

    public k58(o68 o68Var) {
        this.a = o68Var;
    }

    @Override // y17
    public final void H0(int i, int i2, CharSequence charSequence, boolean z) {
        this.a.L1.y1(i, i2, charSequence, z);
    }

    @Override // y17
    public final void T0(String str) {
        h58 h58Var = this.a.L1;
        h58Var.Z();
        h58Var.V0.d(str);
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
