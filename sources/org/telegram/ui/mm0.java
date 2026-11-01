package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class mm0 extends FrameLayout {
    public final Paint a;
    public float b;
    public o1.j c;
    public final /* synthetic */ qm0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm0(qm0 qm0Var, Context context) {
        super(context);
        this.d = qm0Var;
        this.a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        o1.j jVar = this.c;
        if (jVar != null) {
            jVar.d();
        }
        float f7 = z10 ? 1.0f : 0.0f;
        if (!z11) {
            this.b = f7;
            TextView textView = this.d.U;
            if (textView != null) {
                textView.setAlpha((f7 * 0.2f) + 0.8f);
            }
            invalidate();
            return;
        }
        float f10 = this.b;
        if (f10 == f7) {
            return;
        }
        o1.j jVar2 = new o1.j(new o1.i(f10 * 100.0f));
        o1.k kVar = new o1.k(f7 * 100.0f);
        kVar.b(z10 ? 500.0f : 650.0f);
        kVar.a(1.0f);
        jVar2.m = kVar;
        this.c = jVar2;
        jVar2.b(new ic0(this, 1));
        this.c.a(new m9(this, 1));
        this.c.h();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.t6.O6;
        qm0 qm0Var = this.d;
        canvas.drawColor(qm0Var.getThemedColor(i10));
        int themedColor = qm0Var.getThemedColor(org.telegram.ui.ActionBar.t6.Si);
        Paint paint = this.a;
        paint.setColor(themedColor);
        canvas.drawCircle(org.telegram.messenger.dd.X ? getWidth() - org.telegram.messenger.i0.L(28.0f) : org.telegram.messenger.i0.L(28.0f), -org.telegram.messenger.i0.L(28.0f), Math.max(getWidth(), getHeight()) * this.b, paint);
    }
}
