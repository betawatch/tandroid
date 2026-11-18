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
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.lr;
import org.telegram.ui.k71;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class j9 extends FrameLayout {
    public boolean E;
    public boolean F;
    public final View a;
    public final EditTextBoldCursor b;
    public final View c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final v4 e;
    public final v4 f;
    public final Paint h;
    public final TextPaint n;
    public final RectF r;
    public ValueAnimator s;
    public float w;
    public float x;
    public fh.g y;

    public j9(Context context, View view, org.telegram.ui.ActionBar.i6 i6Var, v4 v4Var, v4 v4Var2, v4 v4Var3) {
        super(context);
        this.h = new Paint(1);
        this.n = new TextPaint(1);
        this.r = new RectF();
        this.x = 1.0f;
        this.a = view;
        this.d = i6Var;
        this.e = v4Var;
        this.f = v4Var3;
        int i7 = 0;
        setWillNotDraw(false);
        addView(view, c8.ma.e(-2, 40, 51));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setTextSize(15.0f);
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i10, i6Var);
        org.telegram.ui.ActionBar.u6.D(editTextBoldCursor, org.telegram.ui.ActionBar.n6.H6, i6Var);
        org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 30, i10, i6Var);
        editTextBoldCursor.setHint(gd.M0(2131742768, null));
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setGravity(16);
        editTextBoldCursor.setImeOptions(3);
        editTextBoldCursor.setVisibility(4);
        editTextBoldCursor.setEnabled(false);
        editTextBoldCursor.setOnEditorActionListener(new h9(this, i7));
        editTextBoldCursor.addTextChangedListener(new i9(v4Var2, i7));
        addView(editTextBoldCursor, c8.ma.d(-1, 40.0f, 48, 40.0f, 0.0f, 44.0f, 0.0f));
        View view2 = new View(context);
        this.c = view2;
        view2.setContentDescription(gd.M0(2131745641, null));
        int i11 = org.telegram.ui.ActionBar.n6.i6;
        Drawable h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        view2.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(view2, h02, null, M, i6Var);
        view2.setOnClickListener(new o3(this, 5));
        addView(view2, c8.ma.e(40, 40, 53));
    }

    public static float c(float f10, float f11, float f12) {
        float max = Math.max(0.0f, Math.min(1.0f, (f12 - f10) / (f11 - f10)));
        return com.google.android.gms.internal.vision.e2.C(max, 2.0f, 3.0f, max * max);
    }

    public final void a() {
        if (this.E) {
            this.F = true;
            EditTextBoldCursor editTextBoldCursor = this.b;
            org.telegram.messenger.g0.v1(editTextBoldCursor);
            editTextBoldCursor.clearFocus();
        }
    }

    public final void b(boolean z10) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        this.F = false;
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            this.s = null;
            valueAnimator.cancel();
        }
        EditTextBoldCursor editTextBoldCursor = this.b;
        editTextBoldCursor.setEnabled(z10);
        editTextBoldCursor.setVisibility(0);
        this.c.setContentDescription(gd.M0(z10 ? 2131752030 : 2131745641, null));
        if (!z10) {
            org.telegram.messenger.g0.v1(editTextBoldCursor);
            editTextBoldCursor.clearFocus();
            editTextBoldCursor.setText("");
        }
        this.e.a(Boolean.valueOf(z10));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, z10 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.setDuration(z10 ? 380L : 300L);
        this.s.setInterpolator(lr.h);
        this.a.setVisibility(0);
        this.s.addUpdateListener(new z3(this, 7));
        this.s.addListener(new k71(this, 11));
        this.s.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            this.s = null;
            valueAnimator.cancel();
        }
        float f10 = this.E ? 1.0f : 0.0f;
        this.w = f10;
        this.f.a(Float.valueOf(f10));
        float f11 = this.E ? 0.0f : 1.0f;
        View view = this.a;
        view.setAlpha(f11);
        view.setScaleX(this.E ? 0.94f : 1.0f);
        view.setVisibility(this.E ? 4 : 0);
        float f12 = this.E ? 1.0f : 0.0f;
        EditTextBoldCursor editTextBoldCursor = this.b;
        editTextBoldCursor.setAlpha(f12);
        editTextBoldCursor.setTranslationX(0.0f);
        editTextBoldCursor.setVisibility(this.E ? 0 : 4);
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
        float width2 = (1.0f - this.w) * (getWidth() - L2);
        float width3 = getWidth();
        RectF rectF = this.r;
        rectF.set(width2, 0.0f, width3, L2);
        fh.g gVar = this.y;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        Paint paint = this.h;
        if (gVar != null) {
            gVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.y.draw(canvas2);
        } else {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, i6Var));
            canvas2.drawRoundRect(rectF, f11, f11, paint);
        }
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var));
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
        float d = ((1.0f - this.w) * i5.c.d(80.0f, getWidth(), 0)) + org.telegram.messenger.g0.L(22.0f);
        canvas3.drawCircle(d - org.telegram.messenger.g0.L(1.0f), f11 - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(5.0f), paint);
        canvas3.drawLine(org.telegram.messenger.g0.L(3.0f) + d, org.telegram.messenger.g0.L(3.0f) + f11, d + org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f) + f11, paint);
        paint.setAlpha(ks.e4);
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
        int L2 = org.telegram.messenger.g0.L(62.0f) + ((int) Math.ceil(textPaint.measureText(gd.M0(2131742724, null)))) + ((int) Math.ceil(textPaint.measureText(gd.M0(2131742932, null))));
        int size = View.MeasureSpec.getSize(i7);
        int min = Math.min(L2, Math.max(0, size - org.telegram.messenger.g0.L(48.0f)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams.width = min;
        layoutParams.leftMargin = Math.max(0, Math.min((size - min) / 2, (size - org.telegram.messenger.g0.L(48.0f)) - min));
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.y || super.verifyDrawable(drawable);
    }
}
