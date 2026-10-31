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
import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gr;
import org.telegram.ui.ns0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y8 extends FrameLayout {
    public boolean D;
    public final View a;
    public final EditTextBoldCursor b;
    public final View c;
    public final org.telegram.ui.ActionBar.p6 d;
    public final m4 e;
    public final m4 f;
    public final Paint h;
    public final TextPaint n;
    public final RectF r;
    public ValueAnimator s;
    public float w;
    public float x;
    public boolean y;

    public y8(Context context, View view, org.telegram.ui.ActionBar.p6 p6Var, m4 m4Var, m4 m4Var2, m4 m4Var3) {
        super(context);
        this.h = new Paint(1);
        this.n = new TextPaint(1);
        this.r = new RectF();
        this.x = 1.0f;
        this.a = view;
        this.d = p6Var;
        this.e = m4Var;
        this.f = m4Var3;
        setWillNotDraw(false);
        addView(view, w7.b6.e(-2, 40, 51));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setTextSize(15.0f);
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i10, p6Var);
        org.telegram.ui.ActionBar.a7.E(editTextBoldCursor, org.telegram.ui.ActionBar.t6.H6, p6Var);
        org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, i10, p6Var);
        editTextBoldCursor.setHint(cd.L0(2131743052, null));
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setGravity(16);
        editTextBoldCursor.setImeOptions(3);
        editTextBoldCursor.setVisibility(4);
        editTextBoldCursor.setEnabled(false);
        editTextBoldCursor.setOnEditorActionListener(new x8(this, 0));
        editTextBoldCursor.addTextChangedListener(new ag.a1(m4Var2, 22));
        addView(editTextBoldCursor, w7.b6.d(-1, 40.0f, 48, 40.0f, 0.0f, 44.0f, 0.0f));
        View view2 = new View(context);
        this.c = view2;
        view2.setContentDescription(cd.L0(2131745853, null));
        int i11 = org.telegram.ui.ActionBar.t6.i6;
        Drawable h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        view2.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(view2, h02, null, N, p6Var);
        view2.setOnClickListener(new i3(this, 5));
        addView(view2, w7.b6.e(40, 40, 53));
    }

    public static float c(float f7, float f10, float f11) {
        float max = Math.max(0.0f, Math.min(1.0f, (f11 - f7) / (f10 - f7)));
        return c3.i0.D(max, 2.0f, 3.0f, max * max);
    }

    public final void a() {
        if (this.y) {
            this.D = true;
            EditTextBoldCursor editTextBoldCursor = this.b;
            org.telegram.messenger.i0.v1(editTextBoldCursor);
            editTextBoldCursor.clearFocus();
        }
    }

    public final void b(boolean z10) {
        if (this.y == z10) {
            return;
        }
        this.y = z10;
        this.D = false;
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            this.s = null;
            valueAnimator.cancel();
        }
        EditTextBoldCursor editTextBoldCursor = this.b;
        editTextBoldCursor.setEnabled(z10);
        editTextBoldCursor.setVisibility(0);
        this.c.setContentDescription(cd.L0(z10 ? 2131752041 : 2131745853, null));
        if (!z10) {
            org.telegram.messenger.i0.v1(editTextBoldCursor);
            editTextBoldCursor.clearFocus();
            editTextBoldCursor.setText("");
        }
        this.e.a(Boolean.valueOf(z10));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, z10 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.setDuration(z10 ? 380L : 300L);
        this.s.setInterpolator(gr.h);
        this.a.setVisibility(0);
        this.s.addUpdateListener(new r3(this, 7));
        this.s.addListener(new ns0(this, 21));
        this.s.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            this.s = null;
            valueAnimator.cancel();
        }
        float f7 = this.y ? 1.0f : 0.0f;
        this.w = f7;
        this.f.a(Float.valueOf(f7));
        float f10 = this.y ? 0.0f : 1.0f;
        View view = this.a;
        view.setAlpha(f10);
        view.setScaleX(this.y ? 0.94f : 1.0f);
        view.setVisibility(this.y ? 4 : 0);
        float f11 = this.y ? 1.0f : 0.0f;
        EditTextBoldCursor editTextBoldCursor = this.b;
        editTextBoldCursor.setAlpha(f11);
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
            float f7 = (max * 0.2f) + 0.8f;
            float L = org.telegram.messenger.i0.L(40.0f) / 2.0f;
            canvas2.scale(f7, f7, getWidth() - L, L);
        } else {
            canvas2 = canvas;
        }
        float L2 = org.telegram.messenger.i0.L(40.0f);
        float f10 = L2 / 2.0f;
        float width = getWidth() - f10;
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.h;
        paint.setStyle(style);
        int i10 = org.telegram.ui.ActionBar.t6.d6;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        float width2 = (1.0f - this.w) * (getWidth() - L2);
        float width3 = getWidth();
        RectF rectF = this.r;
        rectF.set(width2, 0.0f, width3, L2);
        canvas2.drawRoundRect(rectF, f10, f10, paint);
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.9f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        float c10 = c(0.08f, 0.85f, this.w);
        float f11 = 1.0f - c10;
        float L3 = org.telegram.messenger.i0.L(6.0f) * f11;
        if (L3 > 0.3f) {
            canvas2.drawCircle(width - (org.telegram.messenger.i0.L(1.5f) * f11), f10 - (org.telegram.messenger.i0.L(1.5f) * f11), L3, paint);
        }
        float L4 = (org.telegram.messenger.i0.L(2.6f) * f11) - (org.telegram.messenger.i0.L(5.0f) * c10);
        float L5 = (org.telegram.messenger.i0.L(5.0f) * c10) + (org.telegram.messenger.i0.L(6.5f) * f11);
        canvas2.drawLine(width + L4, L4 + f10, width + L5, L5 + f10, paint);
        float L6 = org.telegram.messenger.i0.L(5.0f) * c10;
        if (L6 > 0.3f) {
            float f12 = width + L6;
            float f13 = f10 - L6;
            float f14 = width - L6;
            float f15 = f10 + L6;
            canvas3 = canvas;
            canvas3.drawLine(f12, f13, f14, f15, paint);
        } else {
            canvas3 = canvas;
        }
        paint.setAlpha(Math.round(c(0.3f, 0.9f, this.w) * 255.0f));
        float d = ((1.0f - this.w) * i0.a.d(80.0f, getWidth(), 0)) + org.telegram.messenger.i0.L(22.0f);
        canvas3.drawCircle(d - org.telegram.messenger.i0.L(1.0f), f10 - org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(5.0f), paint);
        canvas3.drawLine(org.telegram.messenger.i0.L(3.0f) + d, org.telegram.messenger.i0.L(3.0f) + f10, d + org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f) + f10, paint);
        paint.setAlpha(zs.e4);
        if (max < 1.0f) {
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float L = org.telegram.messenger.i0.L(14.0f);
        TextPaint textPaint = this.n;
        textPaint.setTextSize(L);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        int L2 = org.telegram.messenger.i0.L(62.0f) + ((int) Math.ceil(textPaint.measureText(cd.L0(2131743008, null)))) + ((int) Math.ceil(textPaint.measureText(cd.L0(2131743196, null))));
        int size = View.MeasureSpec.getSize(i10);
        int min = Math.min(L2, Math.max(0, size - org.telegram.messenger.i0.L(48.0f)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams.width = min;
        layoutParams.leftMargin = Math.max(0, Math.min((size - min) / 2, (size - org.telegram.messenger.i0.L(48.0f)) - min));
        super.onMeasure(i10, i11);
    }
}
