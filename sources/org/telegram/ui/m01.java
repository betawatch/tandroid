package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class m01 extends FrameLayout {
    public final Path a;
    public final Paint b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 e;
    public final /* synthetic */ Integer f;
    public final /* synthetic */ r11 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m01(r11 r11Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.i6 i6Var, Integer num) {
        super(context);
        this.h = r11Var;
        this.c = z10;
        this.d = z11;
        this.e = i6Var;
        this.f = num;
        this.a = new Path();
        this.b = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        r11 r11Var = this.h;
        if (!r11Var.R0) {
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
            org.telegram.ui.ActionBar.n6.n(paint);
        }
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, this.e));
        paint.setAlpha((int) (getAlpha() * 255.0f));
        float width = (this.f == null ? getWidth() / 2.0f : r1.intValue()) + org.telegram.messenger.g0.L(20.0f);
        float width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (r11Var.n()) {
            org.telegram.messenger.g0.P.set((width - (r11Var.b1 * width)) + getPaddingLeft(), com.google.android.gms.internal.vision.e2.z(1.0f, r11Var.c1, height, getPaddingTop()), ((width2 - width) * r11Var.b1) + getPaddingLeft() + width, getPaddingTop() + height);
        } else {
            org.telegram.messenger.g0.P.set((width - (r11Var.b1 * width)) + getPaddingLeft(), getPaddingTop(), ((width2 - width) * r11Var.b1) + getPaddingLeft() + width, (height * r11Var.c1) + getPaddingTop());
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
