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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class t11 extends FrameLayout implements y60 {
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
    public final /* synthetic */ u11 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t11(u11 u11Var, Context context) {
        super(context);
        this.y = u11Var;
        this.b = new Paint(1);
        setWillNotDraw(false);
        g9 g9Var = new g9(context);
        this.a = g9Var;
        addView(g9Var, w7.b6.d(20, 20.0f, 51, 12.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.y60
    public final void a(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // org.telegram.ui.Components.y60
    public final void b(Canvas canvas, float f7) {
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, this.y.e);
        Paint paint = this.b;
        paint.setColor(w02);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), paint);
        draw(canvas);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        Drawable drawable;
        Drawable drawable2;
        float translationY = getTranslationY();
        Paint paint = this.b;
        u11 u11Var = this.y;
        if (translationY != 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, u11Var.e));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.s) {
            paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, u11Var.e)));
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), paint);
        }
        int L = org.telegram.messenger.i0.L(12.0f);
        int width = getWidth() - org.telegram.messenger.i0.L(12.0f);
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.i0.L(26.0f) + L, ((org.telegram.messenger.i0.L(20.0f) - this.d.getHeight()) / 2.0f) + org.telegram.messenger.i0.L(10.0f));
            this.d.draw(canvas2);
            canvas2.restore();
        }
        float f12 = width;
        if (this.f != null) {
            float width2 = f12 - r5.getWidth();
            canvas2.save();
            canvas2.translate(width2, ((org.telegram.messenger.i0.L(20.0f) - this.f.getHeight()) / 2.0f) + org.telegram.messenger.i0.L(10.0f));
            this.f.draw(canvas2);
            canvas2.restore();
            f7 = width2 - org.telegram.messenger.i0.L(6.0f);
        } else {
            f7 = f12;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, u11Var.e);
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
            this.x.draw(canvas2);
            f7 -= org.telegram.messenger.i0.L(6.0f) + L2;
        }
        if (this.n && (drawable = this.w) != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            int L3 = org.telegram.messenger.i0.L(f10);
            int i11 = (int) f7;
            this.w.setBounds(i11 - L3, org.telegram.messenger.i0.L(14.0f), i11, org.telegram.messenger.i0.L(14.0f) + L3);
            this.w.draw(canvas2);
        }
        if (this.e != null) {
            canvas2.save();
            canvas2.translate(L, org.telegram.messenger.i0.L(34.0f));
            this.e.draw(canvas2);
            canvas2.restore();
        }
        if (this.h != null) {
            float max = Math.max(org.telegram.messenger.i0.L(23.0f), u11Var.d0.measureText(this.h) + org.telegram.messenger.i0.L(14.0f));
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(this.n ? org.telegram.ui.ActionBar.t6.V8 : org.telegram.ui.ActionBar.t6.U8, u11Var.e));
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(f12 - max, org.telegram.messenger.i0.L(34.0f), f12, org.telegram.messenger.i0.L(57.0f));
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(11.5f), org.telegram.messenger.i0.L(11.5f), paint);
            u11Var.d0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.W8, u11Var.e));
            canvas2.drawText(this.h, rectF2.centerX() - (u11Var.d0.measureText(this.h) / f11), rectF2.centerY() - ((u11Var.d0.ascent() + u11Var.d0.descent()) / f11), u11Var.d0);
        }
        if (!this.c || this.s) {
            return;
        }
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d7, u11Var.e));
        canvas2.drawRect(L, getHeight() - 1, f12, getHeight(), paint);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        StaticLayout staticLayout = this.e;
        int height = (staticLayout == null || staticLayout.getText().length() <= 0) ? 0 : this.e.getHeight();
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.i0.L(48.0f), org.telegram.messenger.i0.L(height > org.telegram.messenger.i0.L(24.0f) ? 6.0f : 10.0f) + org.telegram.messenger.i0.L(34.0f) + height), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if ((getTranslationY() != 0.0f) != (f7 != 0.0f)) {
            invalidate();
        }
        super.setTranslationY(f7);
    }
}
