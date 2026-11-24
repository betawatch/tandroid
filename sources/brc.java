// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class brc extends FrameLayout {
    public boolean E;
    public boolean F;
    public final View a;
    public final EditTextBoldCursor b;
    public final View c;
    public final ylb d;
    public final smc e;
    public final smc f;
    public final Paint h;
    public final TextPaint n;
    public final RectF r;
    public ValueAnimator s;
    public float w;
    public float x;
    public im0 y;

    public brc(Context context, View view, ylb ylbVar, smc smcVar, smc smcVar2, smc smcVar3) {
        super(context);
        this.h = new Paint(1);
        this.n = new TextPaint(1);
        this.r = new RectF();
        this.x = 1.0f;
        this.a = view;
        this.d = ylbVar;
        this.e = smcVar;
        this.f = smcVar3;
        setWillNotDraw(false);
        addView(view, qoe.e(-2, 40, 51));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setTextSize(15.0f);
        int i = cmb.F6;
        anb.X(editTextBoldCursor, i, ylbVar);
        anb.D(editTextBoldCursor, cmb.G6, ylbVar);
        anb.l(editTextBoldCursor, 30, i, ylbVar);
        editTextBoldCursor.setHint(jb6.M0(2131742689, null));
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setGravity(16);
        editTextBoldCursor.setImeOptions(3);
        editTextBoldCursor.setVisibility(4);
        editTextBoldCursor.setEnabled(false);
        editTextBoldCursor.setOnEditorActionListener(new arc(this, (byte) 0));
        editTextBoldCursor.addTextChangedListener(new og6(smcVar2, (byte) 25));
        addView(editTextBoldCursor, qoe.d(-1, 40.0f, 48, 40.0f, 0.0f, 44.0f, 0.0f));
        View view2 = new View(context);
        this.c = view2;
        view2.setContentDescription(jb6.M0(2131745570, null));
        int i2 = cmb.h6;
        Drawable f0 = cmb.f0(cmb.v0(i2, ylbVar), 1, -1);
        wmb M = anb.M(i2);
        view2.setBackground(f0);
        anb.j(view2, f0, null, M, ylbVar);
        view2.setOnClickListener(new kpc(this, (byte) 1));
        addView(view2, qoe.e(40, 40, 53));
    }

    public static float c(float f, float f2, float f3) {
        float max = Math.max(0.0f, Math.min(1.0f, (f3 - f) / (f2 - f)));
        return mlb.B(max, 2.0f, 3.0f, max * max);
    }

    public final void a() {
        if (this.E) {
            this.F = true;
            EditTextBoldCursor editTextBoldCursor = this.b;
            gm.t1(editTextBoldCursor);
            editTextBoldCursor.clearFocus();
        }
    }

    public final void b(boolean z) {
        if (this.E == z) {
            return;
        }
        this.E = z;
        this.F = false;
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            this.s = null;
            valueAnimator.cancel();
        }
        EditTextBoldCursor editTextBoldCursor = this.b;
        editTextBoldCursor.setEnabled(z);
        editTextBoldCursor.setVisibility(0);
        this.c.setContentDescription(jb6.M0(z ? 2131751978 : 2131745570, null));
        if (!z) {
            gm.t1(editTextBoldCursor);
            editTextBoldCursor.clearFocus();
            editTextBoldCursor.setText("");
        }
        this.e.a(Boolean.valueOf(z));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, z ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.setDuration(z ? 380L : 300L);
        this.s.setInterpolator(d53.h);
        this.a.setVisibility(0);
        this.s.addUpdateListener(new oxb(this, (byte) 17));
        this.s.addListener(new koc(this, (byte) 2));
        this.s.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            this.s = null;
            valueAnimator.cancel();
        }
        float f = this.E ? 1.0f : 0.0f;
        this.w = f;
        this.f.a(Float.valueOf(f));
        float f2 = this.E ? 0.0f : 1.0f;
        View view = this.a;
        view.setAlpha(f2);
        view.setScaleX(this.E ? 0.94f : 1.0f);
        view.setVisibility(this.E ? 4 : 0);
        float f3 = this.E ? 1.0f : 0.0f;
        EditTextBoldCursor editTextBoldCursor = this.b;
        editTextBoldCursor.setAlpha(f3);
        editTextBoldCursor.setTranslationX(0.0f);
        editTextBoldCursor.setVisibility(this.E ? 0 : 4);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float max = Math.max(this.x, this.w);
        if (max > 0.0f) {
            if (max < 1.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), Math.round(max * 255.0f));
                float f = (max * 0.2f) + 0.8f;
                float L = gm.L(40.0f) / 2.0f;
                canvas.scale(f, f, getWidth() - L, L);
            }
            float L2 = gm.L(40.0f);
            float f2 = L2 / 2.0f;
            float width = getWidth() - f2;
            float width2 = (1.0f - this.w) * (getWidth() - L2);
            float width3 = getWidth();
            RectF rectF = this.r;
            rectF.set(width2, 0.0f, width3, L2);
            im0 im0Var = this.y;
            ylb ylbVar = this.d;
            Paint paint = this.h;
            if (im0Var != null) {
                im0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.y.draw(canvas);
            } else {
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(cmb.v0(cmb.c6, ylbVar));
                canvas.drawRoundRect(rectF, f2, f2, paint);
            }
            paint.setColor(cmb.v0(cmb.F6, ylbVar));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(gm.L(1.9f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            float c = c(0.08f, 0.85f, this.w);
            float f3 = 1.0f - c;
            float L3 = gm.L(6.0f) * f3;
            if (L3 > 0.3f) {
                canvas.drawCircle(width - (gm.L(1.5f) * f3), f2 - (gm.L(1.5f) * f3), L3, paint);
            }
            float L4 = (gm.L(2.6f) * f3) - (gm.L(5.0f) * c);
            float L5 = (gm.L(5.0f) * c) + (gm.L(6.5f) * f3);
            canvas.drawLine(width + L4, L4 + f2, width + L5, L5 + f2, paint);
            float L6 = gm.L(5.0f) * c;
            if (L6 > 0.3f) {
                canvas.drawLine(width + L6, f2 - L6, width - L6, f2 + L6, paint);
            }
            paint.setAlpha(Math.round(c(0.3f, 0.9f, this.w) * 255.0f));
            float c2 = ((1.0f - this.w) * b10.c(80.0f, getWidth(), 0)) + gm.L(22.0f);
            canvas.drawCircle(c2 - gm.L(1.0f), f2 - gm.L(1.0f), gm.L(5.0f), paint);
            canvas.drawLine(gm.L(3.0f) + c2, gm.L(3.0f) + f2, c2 + gm.L(7.0f), f2 + gm.L(7.0f), paint);
            paint.setAlpha(nm7.d4);
            if (max < 1.0f) {
                canvas.restore();
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float L = gm.L(14.0f);
        TextPaint textPaint = this.n;
        textPaint.setTextSize(L);
        textPaint.setTypeface(gm.o());
        int L2 = gm.L(62.0f) + ((int) Math.ceil(textPaint.measureText(jb6.M0(2131742645, null)))) + ((int) Math.ceil(textPaint.measureText(jb6.M0(2131742853, null))));
        int size = View.MeasureSpec.getSize(i);
        int min = Math.min(L2, Math.max(0, size - gm.L(48.0f)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams.width = min;
        layoutParams.leftMargin = Math.max(0, Math.min((size - min) / 2, (size - gm.L(48.0f)) - min));
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.y || super.verifyDrawable(drawable);
    }
}
