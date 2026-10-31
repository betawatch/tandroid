package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s11 extends FrameLayout {
    public final g9 a;
    public final Paint b;
    public boolean c;
    public StaticLayout d;
    public StaticLayout e;
    public StaticLayout f;
    public String h;
    public boolean n;
    public boolean r;
    public boolean s;
    public Drawable w;
    public Drawable x;
    public final /* synthetic */ t11 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s11(t11 t11Var, Context context) {
        super(context);
        this.y = t11Var;
        this.b = new Paint(1);
        setWillNotDraw(false);
        g9 g9Var = new g9(context);
        this.a = g9Var;
        addView(g9Var, w7.b6.d(20, 20.0f, 51, 12.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        Drawable drawable;
        Drawable drawable2;
        boolean z10 = this.s;
        Paint paint = this.b;
        t11 t11Var = this.y;
        if (z10) {
            paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, t11Var.e)));
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), paint);
        }
        int L = org.telegram.messenger.i0.L(12.0f);
        int width = getWidth() - org.telegram.messenger.i0.L(12.0f);
        if (this.d != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.i0.L(26.0f) + L, ((org.telegram.messenger.i0.L(20.0f) - this.d.getHeight()) / 2.0f) + org.telegram.messenger.i0.L(10.0f));
            this.d.draw(canvas);
            canvas.restore();
        }
        float f12 = width;
        if (this.f != null) {
            float width2 = f12 - r7.getWidth();
            canvas.save();
            canvas.translate(width2, ((org.telegram.messenger.i0.L(20.0f) - this.f.getHeight()) / 2.0f) + org.telegram.messenger.i0.L(10.0f));
            this.f.draw(canvas);
            canvas.restore();
            f7 = width2 - org.telegram.messenger.i0.L(6.0f);
        } else {
            f7 = f12;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, t11Var.e);
        if (!this.r || (drawable2 = this.x) == null) {
            f10 = 12.0f;
            f11 = 2.0f;
        } else {
            drawable2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            int L2 = org.telegram.messenger.i0.L(13.0f);
            int i10 = (int) f7;
            f10 = 12.0f;
            f11 = 2.0f;
            this.x.setBounds(i10 - L2, org.telegram.messenger.i0.L(14.0f), i10, org.telegram.messenger.i0.L(14.0f) + L2);
            this.x.draw(canvas);
            f7 -= org.telegram.messenger.i0.L(6.0f) + L2;
        }
        if (this.n && (drawable = this.w) != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            int L3 = org.telegram.messenger.i0.L(f10);
            int i11 = (int) f7;
            this.w.setBounds(i11 - L3, org.telegram.messenger.i0.L(14.0f), i11, org.telegram.messenger.i0.L(14.0f) + L3);
            this.w.draw(canvas);
        }
        if (this.e != null) {
            canvas.save();
            canvas.translate(L, org.telegram.messenger.i0.L(34.0f));
            this.e.draw(canvas);
            canvas.restore();
        }
        if (this.h != null) {
            float max = Math.max(org.telegram.messenger.i0.L(23.0f), t11Var.W.measureText(this.h) + org.telegram.messenger.i0.L(14.0f));
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(this.n ? org.telegram.ui.ActionBar.t6.V8 : org.telegram.ui.ActionBar.t6.U8, t11Var.e));
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(f12 - max, org.telegram.messenger.i0.L(34.0f), f12, org.telegram.messenger.i0.L(57.0f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(11.5f), org.telegram.messenger.i0.L(11.5f), paint);
            t11Var.W.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.W8, t11Var.e));
            canvas.drawText(this.h, rectF2.centerX() - (t11Var.W.measureText(this.h) / f11), rectF2.centerY() - ((t11Var.W.ascent() + t11Var.W.descent()) / f11), t11Var.W);
        }
        if (!this.c || this.s) {
            return;
        }
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d7, t11Var.e));
        canvas.drawRect(L, getHeight() - 1, f12, getHeight(), paint);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        StaticLayout staticLayout = this.e;
        int height = (staticLayout == null || staticLayout.getText().length() <= 0) ? 0 : this.e.getHeight();
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.i0.L(48.0f), org.telegram.messenger.i0.L(height > org.telegram.messenger.i0.L(24.0f) ? 6.0f : 10.0f) + org.telegram.messenger.i0.L(34.0f) + height), TLObject.FLAG_30));
    }
}
