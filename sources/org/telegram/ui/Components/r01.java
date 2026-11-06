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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class r01 extends FrameLayout implements j60 {
    public final l9 a;
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
    public final /* synthetic */ s01 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r01(s01 s01Var, Context context) {
        super(context);
        this.y = s01Var;
        this.b = new Paint(1);
        setWillNotDraw(false);
        l9 l9Var = new l9(context);
        this.a = l9Var;
        addView(l9Var, c8.ha.d(20, 20.0f, 51, 12.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.j60
    public final void g(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // org.telegram.ui.Components.j60
    public final void h(Canvas canvas, float f10) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.y.e);
        Paint paint = this.b;
        paint.setColor(w02);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint);
        draw(canvas);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        Drawable drawable;
        Drawable drawable2;
        float translationY = getTranslationY();
        Paint paint = this.b;
        s01 s01Var = this.y;
        if (translationY != 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, s01Var.e));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.s) {
            paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, s01Var.e)));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint);
        }
        int L = org.telegram.messenger.g0.L(12.0f);
        int width = getWidth() - org.telegram.messenger.g0.L(12.0f);
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(26.0f) + L, ((org.telegram.messenger.g0.L(20.0f) - this.d.getHeight()) / 2.0f) + org.telegram.messenger.g0.L(10.0f));
            this.d.draw(canvas2);
            canvas2.restore();
        }
        float f13 = width;
        if (this.f != null) {
            float width2 = f13 - r5.getWidth();
            canvas2.save();
            canvas2.translate(width2, ((org.telegram.messenger.g0.L(20.0f) - this.f.getHeight()) / 2.0f) + org.telegram.messenger.g0.L(10.0f));
            this.f.draw(canvas2);
            canvas2.restore();
            f10 = width2 - org.telegram.messenger.g0.L(6.0f);
        } else {
            f10 = f13;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, s01Var.e);
        if (!this.r || (drawable2 = this.x) == null) {
            f11 = 12.0f;
            f12 = 2.0f;
        } else {
            drawable2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            int L2 = org.telegram.messenger.g0.L(13.0f);
            int i7 = (int) f10;
            f11 = 12.0f;
            f12 = 2.0f;
            this.x.setBounds(i7 - L2, org.telegram.messenger.g0.L(14.0f), i7, org.telegram.messenger.g0.L(14.0f) + L2);
            this.x.draw(canvas2);
            f10 -= org.telegram.messenger.g0.L(6.0f) + L2;
        }
        if (this.n && (drawable = this.w) != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            int L3 = org.telegram.messenger.g0.L(f11);
            int i10 = (int) f10;
            this.w.setBounds(i10 - L3, org.telegram.messenger.g0.L(14.0f), i10, org.telegram.messenger.g0.L(14.0f) + L3);
            this.w.draw(canvas2);
        }
        if (this.e != null) {
            canvas2.save();
            canvas2.translate(L, org.telegram.messenger.g0.L(34.0f));
            this.e.draw(canvas2);
            canvas2.restore();
        }
        if (this.h != null) {
            float max = Math.max(org.telegram.messenger.g0.L(23.0f), s01Var.l0.measureText(this.h) + org.telegram.messenger.g0.L(14.0f));
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(this.n ? org.telegram.ui.ActionBar.k6.V8 : org.telegram.ui.ActionBar.k6.U8, s01Var.e));
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(f13 - max, org.telegram.messenger.g0.L(34.0f), f13, org.telegram.messenger.g0.L(57.0f));
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), paint);
            s01Var.l0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W8, s01Var.e));
            canvas2.drawText(this.h, rectF2.centerX() - (s01Var.l0.measureText(this.h) / f12), rectF2.centerY() - ((s01Var.l0.ascent() + s01Var.l0.descent()) / f12), s01Var.l0);
        }
        if (!this.c || this.s) {
            return;
        }
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d7, s01Var.e));
        canvas2.drawRect(L, getHeight() - 1, f13, getHeight(), paint);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        StaticLayout staticLayout = this.e;
        int height = (staticLayout == null || staticLayout.getText().length() <= 0) ? 0 : this.e.getHeight();
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(height > org.telegram.messenger.g0.L(24.0f) ? 6.0f : 10.0f) + org.telegram.messenger.g0.L(34.0f) + height), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if ((getTranslationY() != 0.0f) != (f10 != 0.0f)) {
            invalidate();
        }
        super.setTranslationY(f10);
    }
}
