package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xq;
import org.telegram.ui.t81;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class r8 extends FrameLayout {
    public boolean D;
    public final View a;
    public final EditTextBoldCursor b;
    public final View c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final k4 e;
    public final k4 f;
    public final Paint h;
    public final TextPaint n;
    public final RectF r;
    public ValueAnimator s;
    public float w;
    public float x;
    public boolean y;

    public r8(Context context, View view, org.telegram.ui.ActionBar.g6 g6Var, k4 k4Var, k4 k4Var2, k4 k4Var3) {
        super(context);
        this.h = new Paint(1);
        this.n = new TextPaint(1);
        this.r = new RectF();
        this.x = 1.0f;
        this.a = view;
        this.d = g6Var;
        this.e = k4Var;
        this.f = k4Var3;
        setWillNotDraw(false);
        addView(view, c8.ha.e(-2, 40, 51));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setTextSize(15.0f);
        int i7 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.s6.U(editTextBoldCursor, i7, g6Var);
        org.telegram.ui.ActionBar.s6.D(editTextBoldCursor, org.telegram.ui.ActionBar.l6.H6, g6Var);
        org.telegram.ui.ActionBar.s6.l(editTextBoldCursor, 30, i7, g6Var);
        editTextBoldCursor.setHint(id.M0(2131743026, null));
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setGravity(16);
        editTextBoldCursor.setImeOptions(3);
        editTextBoldCursor.setVisibility(4);
        editTextBoldCursor.setEnabled(false);
        editTextBoldCursor.setOnEditorActionListener(new q8(this, 0));
        editTextBoldCursor.addTextChangedListener(new ah.j(k4Var2, 27));
        addView(editTextBoldCursor, c8.ha.d(-1, 40.0f, 48, 40.0f, 0.0f, 44.0f, 0.0f));
        View view2 = new View(context);
        this.c = view2;
        view2.setContentDescription(id.M0(2131745836, null));
        int i10 = org.telegram.ui.ActionBar.l6.i6;
        Drawable h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i10, g6Var), 1, -1);
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i10);
        view2.setBackground(h02);
        org.telegram.ui.ActionBar.s6.j(view2, h02, null, M, g6Var);
        view2.setOnClickListener(new h3(this, 5));
        addView(view2, c8.ha.e(40, 40, 53));
    }

    public static float c(float f10, float f11, float f12) {
        float max = Math.max(0.0f, Math.min(1.0f, (f12 - f10) / (f11 - f10)));
        return com.google.android.recaptcha.internal.a.C(max, 2.0f, 3.0f, max * max);
    }

    public final void a() {
        if (this.y) {
            this.D = true;
            EditTextBoldCursor editTextBoldCursor = this.b;
            org.telegram.messenger.g0.v1(editTextBoldCursor);
            editTextBoldCursor.clearFocus();
        }
    }

    public final void b(boolean z9) {
        if (this.y == z9) {
            return;
        }
        this.y = z9;
        this.D = false;
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            this.s = null;
            valueAnimator.cancel();
        }
        EditTextBoldCursor editTextBoldCursor = this.b;
        editTextBoldCursor.setEnabled(z9);
        editTextBoldCursor.setVisibility(0);
        this.c.setContentDescription(id.M0(z9 ? 2131752041 : 2131745836, null));
        if (!z9) {
            org.telegram.messenger.g0.v1(editTextBoldCursor);
            editTextBoldCursor.clearFocus();
            editTextBoldCursor.setText("");
        }
        this.e.a(Boolean.valueOf(z9));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, z9 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.setDuration(z9 ? 380L : 300L);
        this.s.setInterpolator(xq.h);
        this.a.setVisibility(0);
        this.s.addUpdateListener(new p3(this, 7));
        this.s.addListener(new t81(this, 10));
        this.s.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            this.s = null;
            valueAnimator.cancel();
        }
        float f10 = this.y ? 1.0f : 0.0f;
        this.w = f10;
        this.f.a(Float.valueOf(f10));
        float f11 = this.y ? 0.0f : 1.0f;
        View view = this.a;
        view.setAlpha(f11);
        view.setScaleX(this.y ? 0.94f : 1.0f);
        view.setVisibility(this.y ? 4 : 0);
        float f12 = this.y ? 1.0f : 0.0f;
        EditTextBoldCursor editTextBoldCursor = this.b;
        editTextBoldCursor.setAlpha(f12);
        editTextBoldCursor.setTranslationX(0.0f);
        editTextBoldCursor.setVisibility(this.y ? 0 : 4);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Canvas canvas3;
        super.onDraw(canvas);
        float max = Math.max(this.x, this.w);
        if (max <= 0.0f) {
            return;
        }
        if (max < 1.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), Math.round(max * 255.0f));
            float f10 = (max * 0.2f) + 0.8f;
            float L = org.telegram.messenger.g0.L(40.0f) / 2.0f;
            canvas2.scale(f10, f10, getWidth() - L, L);
        } else {
            canvas2 = canvas;
        }
        float L2 = org.telegram.messenger.g0.L(40.0f);
        float f11 = L2 / 2.0f;
        float width = getWidth() - f11;
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.h;
        paint.setStyle(style);
        int i7 = org.telegram.ui.ActionBar.l6.d6;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        paint.setColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        float width2 = (1.0f - this.w) * (getWidth() - L2);
        float width3 = getWidth();
        RectF rectF = this.r;
        rectF.set(width2, 0.0f, width3, L2);
        canvas2.drawRoundRect(rectF, f11, f11, paint);
        paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G6, g6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.9f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        float c10 = c(0.08f, 0.85f, this.w);
        float f12 = 1.0f - c10;
        float L3 = org.telegram.messenger.g0.L(6.0f) * f12;
        if (L3 > 0.3f) {
            canvas2.drawCircle(width - (org.telegram.messenger.g0.L(1.5f) * f12), f11 - (org.telegram.messenger.g0.L(1.5f) * f12), L3, paint);
        }
        float L4 = (org.telegram.messenger.g0.L(2.6f) * f12) - (org.telegram.messenger.g0.L(5.0f) * c10);
        float L5 = (org.telegram.messenger.g0.L(5.0f) * c10) + (org.telegram.messenger.g0.L(6.5f) * f12);
        canvas2.drawLine(width + L4, L4 + f11, width + L5, L5 + f11, paint);
        float L6 = org.telegram.messenger.g0.L(5.0f) * c10;
        if (L6 > 0.3f) {
            float f13 = width + L6;
            float f14 = f11 - L6;
            float f15 = width - L6;
            float f16 = f11 + L6;
            canvas3 = canvas;
            canvas3.drawLine(f13, f14, f15, f16, paint);
        } else {
            canvas3 = canvas;
        }
        paint.setAlpha(Math.round(c(0.3f, 0.9f, this.w) * 255.0f));
        float e10 = ((1.0f - this.w) * jg.g.e(80.0f, getWidth(), 0)) + org.telegram.messenger.g0.L(22.0f);
        canvas3.drawCircle(e10 - org.telegram.messenger.g0.L(1.0f), f11 - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(5.0f), paint);
        canvas3.drawLine(org.telegram.messenger.g0.L(3.0f) + e10, org.telegram.messenger.g0.L(3.0f) + f11, e10 + org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f) + f11, paint);
        paint.setAlpha(qs.e4);
        if (max < 1.0f) {
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        float L = org.telegram.messenger.g0.L(14.0f);
        TextPaint textPaint = this.n;
        textPaint.setTextSize(L);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        int L2 = org.telegram.messenger.g0.L(62.0f) + ((int) Math.ceil(textPaint.measureText(id.M0(2131742982, null)))) + ((int) Math.ceil(textPaint.measureText(id.M0(2131743170, null))));
        int size = View.MeasureSpec.getSize(i7);
        int min = Math.min(L2, Math.max(0, size - org.telegram.messenger.g0.L(48.0f)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams.width = min;
        layoutParams.leftMargin = Math.max(0, Math.min((size - min) / 2, (size - org.telegram.messenger.g0.L(48.0f)) - min));
        super.onMeasure(i7, i10);
    }
}
