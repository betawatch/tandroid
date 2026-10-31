package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d21 extends FrameLayout {
    public final Path a;
    public final Paint b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 e;
    public final /* synthetic */ Integer f;
    public final /* synthetic */ i31 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d21(i31 i31Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.p6 p6Var, Integer num) {
        super(context);
        this.h = i31Var;
        this.c = z10;
        this.d = z11;
        this.e = p6Var;
        this.f = num;
        this.a = new Path();
        this.b = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i31 i31Var = this.h;
        if (!i31Var.Q0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (!this.c) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        boolean z10 = this.d;
        Paint paint = this.b;
        if (z10) {
            org.telegram.ui.ActionBar.t6.n(paint);
        }
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, this.e));
        paint.setAlpha((int) (getAlpha() * 255.0f));
        float width = (this.f == null ? getWidth() / 2.0f : r1.intValue()) + org.telegram.messenger.i0.L(20.0f);
        float width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (i31Var.n()) {
            org.telegram.messenger.i0.P.set((width - (i31Var.a1 * width)) + getPaddingLeft(), c3.i0.z(1.0f, i31Var.b1, height, getPaddingTop()), ((width2 - width) * i31Var.a1) + getPaddingLeft() + width, getPaddingTop() + height);
        } else {
            org.telegram.messenger.i0.P.set((width - (i31Var.a1 * width)) + getPaddingLeft(), getPaddingTop(), ((width2 - width) * i31Var.a1) + getPaddingLeft() + width, (height * i31Var.b1) + getPaddingTop());
        }
        Path path = this.a;
        path.rewind();
        path.addRoundRect(org.telegram.messenger.i0.P, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
