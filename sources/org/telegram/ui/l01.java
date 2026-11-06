package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class l01 extends FrameLayout {
    public final Path a;
    public final Paint b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 e;
    public final /* synthetic */ Integer f;
    public final /* synthetic */ q11 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l01(q11 q11Var, Context context, boolean z9, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, Integer num) {
        super(context);
        this.h = q11Var;
        this.c = z9;
        this.d = z10;
        this.e = f6Var;
        this.f = num;
        this.a = new Path();
        this.b = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        q11 q11Var = this.h;
        if (!q11Var.Q0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (!this.c) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        boolean z9 = this.d;
        Paint paint = this.b;
        if (z9) {
            org.telegram.ui.ActionBar.k6.n(paint);
        }
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.e));
        paint.setAlpha((int) (getAlpha() * 255.0f));
        float width = (this.f == null ? getWidth() / 2.0f : r1.intValue()) + org.telegram.messenger.g0.L(20.0f);
        float width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (q11Var.n()) {
            org.telegram.messenger.g0.P.set((width - (q11Var.a1 * width)) + getPaddingLeft(), com.google.android.recaptcha.internal.a.z(1.0f, q11Var.b1, height, getPaddingTop()), ((width2 - width) * q11Var.a1) + getPaddingLeft() + width, getPaddingTop() + height);
        } else {
            org.telegram.messenger.g0.P.set((width - (q11Var.a1 * width)) + getPaddingLeft(), getPaddingTop(), ((width2 - width) * q11Var.a1) + getPaddingLeft() + width, (height * q11Var.b1) + getPaddingTop());
        }
        Path path = this.a;
        path.rewind();
        path.addRoundRect(org.telegram.messenger.g0.P, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
