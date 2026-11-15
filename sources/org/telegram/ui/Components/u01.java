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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class u01 extends FrameLayout implements l60 {
    public final i9 a;
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
    public final /* synthetic */ v01 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u01(v01 v01Var, Context context) {
        super(context);
        this.y = v01Var;
        this.b = new Paint(1);
        setWillNotDraw(false);
        i9 i9Var = new i9(context);
        this.a = i9Var;
        addView(i9Var, c8.ja.d(20, 20.0f, 51, 12.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.l60
    public final void f(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // org.telegram.ui.Components.l60
    public final void h(Canvas canvas, float f10) {
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, this.y.e);
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
        v01 v01Var = this.y;
        if (translationY != 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, v01Var.e));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.s) {
            paint.setColor(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, v01Var.e)));
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
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.y6, v01Var.e);
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
            float max = Math.max(org.telegram.messenger.g0.L(23.0f), v01Var.m0.measureText(this.h) + org.telegram.messenger.g0.L(14.0f));
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(this.n ? org.telegram.ui.ActionBar.j6.V8 : org.telegram.ui.ActionBar.j6.U8, v01Var.e));
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(f13 - max, org.telegram.messenger.g0.L(34.0f), f13, org.telegram.messenger.g0.L(57.0f));
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), paint);
            v01Var.m0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.W8, v01Var.e));
            canvas2.drawText(this.h, rectF2.centerX() - (v01Var.m0.measureText(this.h) / f12), rectF2.centerY() - ((v01Var.m0.ascent() + v01Var.m0.descent()) / f12), v01Var.m0);
        }
        if (!this.c || this.s) {
            return;
        }
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d7, v01Var.e));
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
