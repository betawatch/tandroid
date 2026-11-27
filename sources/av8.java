// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class av8 extends skb {
    public final yza a0;
    public final int b0;
    public final uk8 c0;

    public av8(int i, vnb vnbVar, Context context) {
        super(context, vnbVar);
        this.a0 = new yza(1, 15);
        this.c0 = new uk8(this, (byte) 14);
        this.b0 = i == 1 ? aob.Wk : aob.Dk;
    }

    @Override // skb, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean e = i86.e(131072);
        uk8 uk8Var = this.c0;
        if (e) {
            yza yzaVar = this.a0;
            yzaVar.d();
            yzaVar.a(canvas, aob.w0(null, this.b0, false));
            jh2.d().a(15, uk8Var);
        } else {
            jh2.d().g(uk8Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override // skb, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jh2.d().g(this.c0);
    }

    @Override // skb, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e29 e29Var = this.e;
        float width = (e29Var.getWidth() / 2.0f) + e29Var.getX();
        float height = ((e29Var.getHeight() / 2.0f) + (e29Var.getY() + e29Var.getPaddingTop())) - hl.L(3.0f);
        RectF rectF = hl.P;
        rectF.set(width - hl.L(16.0f), height - hl.L(16.0f), width + hl.L(16.0f), height + hl.L(16.0f));
        this.a0.g(rectF);
    }
}
