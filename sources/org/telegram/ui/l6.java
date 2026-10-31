package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l6 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public float[] D;
    public final /* synthetic */ y6 E;
    public final org.telegram.ui.Components.f6 a;
    public final TextView[] b;
    public final RectF c;
    public final org.telegram.ui.Components.t80 d;
    public Float e;
    public Float f;
    public final org.telegram.ui.Components.t5 h;
    public final org.telegram.ui.Components.t5 n;
    public final org.telegram.ui.Components.t5 r;
    public final Paint s;
    public final Paint w;
    public final Paint x;
    public Path y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(y6 y6Var, Context context) {
        super(context);
        this.E = y6Var;
        this.b = new TextView[3];
        this.c = new RectF();
        this.d = new org.telegram.ui.Components.t80();
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.h = new org.telegram.ui.Components.t5(this, 450L, grVar);
        this.n = new org.telegram.ui.Components.t5(this, 450L, grVar);
        this.r = new org.telegram.ui.Components.t5(this, 450L, grVar);
        this.s = new Paint(1);
        this.w = new Paint(1);
        this.x = new Paint(1);
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, false, false);
        this.a = f6Var;
        f6Var.b(0.35f, 350L, grVar);
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        f6Var.setTextSize(org.telegram.messenger.i0.L(20.0f));
        f6Var.setText(org.telegram.messenger.cd.L0(2131744834, null));
        f6Var.setGravity(17);
        org.telegram.ui.ActionBar.a7.Z(f6Var, org.telegram.ui.ActionBar.t6.G6, null);
        addView(f6Var, w7.b6.e(-2, 26, 49));
        int i10 = 0;
        while (i10 < 3) {
            this.b[i10] = new TextView(context);
            this.b[i10].setTextSize(1, 13.0f);
            this.b[i10].setGravity(17);
            this.b[i10].setPadding(org.telegram.messenger.i0.L(24.0f), 0, org.telegram.messenger.i0.L(24.0f), 0);
            if (i10 == 0) {
                this.b[i10].setText(org.telegram.messenger.cd.L0(2131744833, null));
            } else if (i10 == 1) {
                this.b[i10].setAlpha(0.0f);
                this.b[i10].setText(org.telegram.messenger.cd.L0(2131744831, null));
                this.b[i10].setVisibility(4);
            } else if (i10 == 2) {
                this.b[i10].setText(org.telegram.messenger.cd.L0(2131744839, null));
                this.b[i10].setAlpha(0.0f);
                this.b[i10].setVisibility(4);
            }
            org.telegram.ui.ActionBar.a7.V(this.b[i10], org.telegram.ui.ActionBar.t6.B6, null);
            addView(this.b[i10], w7.b6.d(-2, -2.0f, 17, 0.0f, i10 == 2 ? 12.0f : -6.0f, 0.0f, 0.0f));
            i10++;
        }
        this.d.f(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.z8, false), org.telegram.ui.ActionBar.t6.r1(0.2f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.B6, false)));
        this.d.k(4.0f);
        this.d.setCallback(this);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        Path path = this.y;
        if (path == null) {
            this.y = new Path();
        } else {
            path.rewind();
        }
        if (this.D == null) {
            this.D = new float[8];
        }
        float[] fArr = this.D;
        fArr[7] = f7;
        fArr[6] = f7;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[5] = f10;
        fArr[4] = f10;
        fArr[3] = f10;
        fArr[2] = f10;
        this.y.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(this.y, paint);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z8));
    }

    public final void b(float f7, float f10, boolean z10) {
        this.a.setText(z10 ? org.telegram.messenger.cd.L0(2131744834, null) : org.telegram.messenger.cd.L0(2131744840, null));
        if (z10) {
            y6 y6Var = this.E;
            TextView[] textViewArr = this.b;
            if (f7 < 0.01f) {
                textViewArr[1].setText(org.telegram.messenger.cd.a0(null, null, 2131744830, y6.i0(y6Var, f7)));
            } else {
                textViewArr[1].setText(org.telegram.messenger.cd.a0(null, null, 2131744831, y6.i0(y6Var, f7)));
            }
            c(1);
        } else {
            c(2);
        }
        this.e = Float.valueOf(f7);
        this.f = Float.valueOf(f10);
        invalidate();
    }

    public final void c(int i10) {
        boolean z10 = System.currentTimeMillis() - this.E.a0 > 40;
        TextView[] textViewArr = this.b;
        d(textViewArr[0], i10 == 0, z10);
        d(textViewArr[1], i10 == 1, z10);
        d(textViewArr[2], i10 == 2, z10);
    }

    public final void d(TextView textView, boolean z10, boolean z11) {
        if (textView == null) {
            return;
        }
        if (textView.getParent() == null) {
            z11 = false;
        }
        textView.animate().setListener(null).cancel();
        if (!z11) {
            textView.setVisibility(z10 ? 0 : 4);
            textView.setTag(z10 ? 1 : null);
            textView.setAlpha(z10 ? 1.0f : 0.0f);
            textView.setTranslationY(z10 ? 0.0f : org.telegram.messenger.i0.L(8.0f));
            invalidate();
            return;
        }
        if (!z10) {
            final int i10 = 1;
            textView.animate().alpha(0.0f).translationY(org.telegram.messenger.i0.L(8.0f)).setListener(new eg.m(textView)).setInterpolator(org.telegram.ui.Components.gr.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.k6
                public final /* synthetic */ l6 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i10) {
                        case 0:
                            this.b.invalidate();
                            break;
                        default:
                            this.b.invalidate();
                            break;
                    }
                }
            }).start();
            return;
        }
        if (textView.getVisibility() != 0) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
            textView.setTranslationY(org.telegram.messenger.i0.L(8.0f));
        }
        final int i11 = 0;
        textView.animate().alpha(1.0f).translationY(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.k6
            public final /* synthetic */ l6 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        this.b.invalidate();
                        break;
                    default:
                        this.b.invalidate();
                        break;
                }
            }
        }).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        int i10;
        float alpha = 1.0f - this.b[2].getAlpha();
        float e = this.r.e(false, this.e == null ? 1.0f : 0.0f);
        Float f7 = this.e;
        float floatValue = f7 == null ? 0.0f : f7.floatValue();
        org.telegram.ui.Components.t5 t5Var = this.h;
        float e7 = t5Var.e(false, floatValue);
        Float f10 = this.f;
        float e10 = this.n.e(false, f10 == null ? 0.0f : f10.floatValue());
        int i11 = org.telegram.ui.ActionBar.t6.z8;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        Paint paint = this.s;
        paint.setColor(x02);
        paint.setAlpha((int) (paint.getAlpha() * alpha));
        RectF rectF2 = org.telegram.messenger.i0.P;
        RectF rectF3 = this.c;
        float f11 = 1.0f - e;
        rectF2.set(Math.max((Math.max(org.telegram.messenger.i0.L(4.0f), rectF3.width() * e10) * f11) + rectF3.left, (Math.max(org.telegram.messenger.i0.L(4.0f), rectF3.width() * e7) * f11) + rectF3.left) + org.telegram.messenger.i0.L(1.0f), rectF3.top, rectF3.right, rectF3.bottom);
        if (rectF2.left >= rectF2.right || rectF2.width() <= org.telegram.messenger.i0.L(3.0f)) {
            rectF = rectF3;
        } else {
            rectF = rectF3;
            a(org.telegram.messenger.i0.L(org.telegram.messenger.i0.W1(e, 1, 2)), org.telegram.messenger.i0.L(2.0f), canvas, paint, rectF2);
        }
        org.telegram.ui.Components.t80 t80Var = this.d;
        t80Var.e(rectF);
        t80Var.setAlpha((int) (255.0f * alpha * e));
        t80Var.draw(canvas);
        int i12 = org.telegram.ui.ActionBar.t6.h7;
        int f12 = i0.b.f(0.75f, org.telegram.ui.ActionBar.t6.x0(null, i12, false), org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        Paint paint2 = this.x;
        paint2.setColor(f12);
        paint2.setAlpha((int) (paint2.getAlpha() * alpha));
        rectF2.set((Math.max(org.telegram.messenger.i0.L(4.0f), rectF.width() * e7) * f11) + rectF.left + org.telegram.messenger.i0.L(1.0f), rectF.top, (Math.max(org.telegram.messenger.i0.L(4.0f), rectF.width() * e10) * f11) + rectF.left, rectF.bottom);
        if (rectF2.width() > org.telegram.messenger.i0.L(3.0f)) {
            i10 = i12;
            a(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(e10 > 0.97f ? 2.0f : 1.0f), canvas, paint2, rectF2);
        } else {
            i10 = i12;
        }
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        Paint paint3 = this.w;
        paint3.setColor(x03);
        paint3.setAlpha((int) (paint3.getAlpha() * alpha));
        float f13 = rectF.left;
        rectF2.set(f13, rectF.top, (Math.max(org.telegram.messenger.i0.L(4.0f), rectF.width() * e7) * f11) + f13, rectF.bottom);
        a(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(e7 > 0.97f ? 2.0f : 1.0f), canvas, paint3, rectF2);
        if (e > 0.0f || t5Var.i) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int min = (int) Math.min(org.telegram.messenger.i0.L(174.0f), size * 0.8d);
        measureChildren(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
        int L = org.telegram.messenger.i0.L(72.0f);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            TextView[] textViewArr = this.b;
            if (i12 >= textViewArr.length) {
                setMeasuredDimension(size, L + i13);
                this.c.set((size - min) / 2.0f, r8 - org.telegram.messenger.i0.L(30.0f), (size + min) / 2.0f, r8 - org.telegram.messenger.i0.L(26.0f));
                return;
            }
            i13 = Math.max(i13, textViewArr[i12].getMeasuredHeight() - (i12 == 2 ? org.telegram.messenger.i0.L(16.0f) : 0));
            i12++;
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            org.telegram.ui.Components.t80 t80Var = this.d;
            if (t80Var != null) {
                t80Var.f(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.z8, false), org.telegram.ui.ActionBar.t6.r1(0.2f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.B6, false)));
                invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
