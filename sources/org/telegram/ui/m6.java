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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m6 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public float[] E;
    public final /* synthetic */ z6 F;
    public final org.telegram.ui.Components.h6 a;
    public final TextView[] b;
    public final RectF c;
    public final org.telegram.ui.Components.w70 d;
    public Float e;
    public Float f;
    public final org.telegram.ui.Components.u5 h;
    public final org.telegram.ui.Components.u5 n;
    public final org.telegram.ui.Components.u5 r;
    public final Paint s;
    public final Paint w;
    public final Paint x;
    public Path y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(z6 z6Var, Context context) {
        super(context);
        this.F = z6Var;
        this.b = new TextView[3];
        this.c = new RectF();
        this.d = new org.telegram.ui.Components.w70();
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.h = new org.telegram.ui.Components.u5(this, 450L, xqVar);
        this.n = new org.telegram.ui.Components.u5(this, 450L, xqVar);
        this.r = new org.telegram.ui.Components.u5(this, 450L, xqVar);
        this.s = new Paint(1);
        this.w = new Paint(1);
        this.x = new Paint(1);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.a = h6Var;
        h6Var.b(0.35f, 350L, xqVar);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setTextSize(org.telegram.messenger.g0.L(20.0f));
        h6Var.setText(org.telegram.messenger.bd.M0(2131744826, null));
        h6Var.setGravity(17);
        org.telegram.ui.ActionBar.r6.Z(h6Var, org.telegram.ui.ActionBar.k6.G6, null);
        addView(h6Var, b8.mf.e(-2, 26, 49));
        int i3 = 0;
        while (i3 < 3) {
            this.b[i3] = new TextView(context);
            this.b[i3].setTextSize(1, 13.0f);
            this.b[i3].setGravity(17);
            this.b[i3].setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
            if (i3 == 0) {
                this.b[i3].setText(org.telegram.messenger.bd.M0(2131744825, null));
            } else if (i3 == 1) {
                this.b[i3].setAlpha(0.0f);
                this.b[i3].setText(org.telegram.messenger.bd.M0(2131744823, null));
                this.b[i3].setVisibility(4);
            } else if (i3 == 2) {
                this.b[i3].setText(org.telegram.messenger.bd.M0(2131744831, null));
                this.b[i3].setAlpha(0.0f);
                this.b[i3].setVisibility(4);
            }
            org.telegram.ui.ActionBar.r6.V(this.b[i3], org.telegram.ui.ActionBar.k6.B6, null);
            addView(this.b[i3], b8.mf.d(-2, -2.0f, 17, 0.0f, i3 == 2 ? 12.0f : -6.0f, 0.0f, 0.0f));
            i3++;
        }
        this.d.f(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.z8, false), org.telegram.ui.ActionBar.k6.r1(0.2f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B6, false)));
        this.d.k(4.0f);
        this.d.setCallback(this);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        Path path = this.y;
        if (path == null) {
            this.y = new Path();
        } else {
            path.rewind();
        }
        if (this.E == null) {
            this.E = new float[8];
        }
        float[] fArr = this.E;
        fArr[7] = f10;
        fArr[6] = f10;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[5] = f11;
        fArr[4] = f11;
        fArr[3] = f11;
        fArr[2] = f11;
        this.y.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(this.y, paint);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z8));
    }

    public final void b(float f10, float f11, boolean z10) {
        this.a.setText(z10 ? org.telegram.messenger.bd.M0(2131744826, null) : org.telegram.messenger.bd.M0(2131744832, null));
        if (z10) {
            z6 z6Var = this.F;
            TextView[] textViewArr = this.b;
            if (f10 < 0.01f) {
                textViewArr[1].setText(org.telegram.messenger.bd.a0(null, null, 2131744822, z6.j0(z6Var, f10)));
            } else {
                textViewArr[1].setText(org.telegram.messenger.bd.a0(null, null, 2131744823, z6.j0(z6Var, f10)));
            }
            c(1);
        } else {
            c(2);
        }
        this.e = Float.valueOf(f10);
        this.f = Float.valueOf(f11);
        invalidate();
    }

    public final void c(int i3) {
        boolean z10 = System.currentTimeMillis() - this.F.b0 > 40;
        TextView[] textViewArr = this.b;
        d(textViewArr[0], i3 == 0, z10);
        d(textViewArr[1], i3 == 1, z10);
        d(textViewArr[2], i3 == 2, z10);
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
            textView.setTranslationY(z10 ? 0.0f : org.telegram.messenger.g0.L(8.0f));
            invalidate();
            return;
        }
        if (!z10) {
            final int i3 = 1;
            textView.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(8.0f)).setListener(new org.telegram.ui.Components.s9(textView)).setInterpolator(org.telegram.ui.Components.xq.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.l6
                public final /* synthetic */ m6 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i3) {
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
            textView.setTranslationY(org.telegram.messenger.g0.L(8.0f));
        }
        final int i10 = 0;
        textView.animate().alpha(1.0f).translationY(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.l6
            public final /* synthetic */ m6 b;

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
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        int i3;
        float alpha = 1.0f - this.b[2].getAlpha();
        float e10 = this.r.e(false, this.e == null ? 1.0f : 0.0f);
        Float f10 = this.e;
        float floatValue = f10 == null ? 0.0f : f10.floatValue();
        org.telegram.ui.Components.u5 u5Var = this.h;
        float e11 = u5Var.e(false, floatValue);
        Float f11 = this.f;
        float e12 = this.n.e(false, f11 == null ? 0.0f : f11.floatValue());
        int i10 = org.telegram.ui.ActionBar.k6.z8;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        Paint paint = this.s;
        paint.setColor(x02);
        paint.setAlpha((int) (paint.getAlpha() * alpha));
        RectF rectF2 = org.telegram.messenger.g0.P;
        RectF rectF3 = this.c;
        float f12 = 1.0f - e10;
        rectF2.set(Math.max((Math.max(org.telegram.messenger.g0.L(4.0f), rectF3.width() * e12) * f12) + rectF3.left, (Math.max(org.telegram.messenger.g0.L(4.0f), rectF3.width() * e11) * f12) + rectF3.left) + org.telegram.messenger.g0.L(1.0f), rectF3.top, rectF3.right, rectF3.bottom);
        if (rectF2.left >= rectF2.right || rectF2.width() <= org.telegram.messenger.g0.L(3.0f)) {
            rectF = rectF3;
        } else {
            rectF = rectF3;
            a(org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(e10, 1, 2)), org.telegram.messenger.g0.L(2.0f), canvas, paint, rectF2);
        }
        org.telegram.ui.Components.w70 w70Var = this.d;
        w70Var.e(rectF);
        w70Var.setAlpha((int) (255.0f * alpha * e10));
        w70Var.draw(canvas);
        int i11 = org.telegram.ui.ActionBar.k6.h7;
        int f13 = i0.a.f(0.75f, org.telegram.ui.ActionBar.k6.x0(null, i11, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        Paint paint2 = this.x;
        paint2.setColor(f13);
        paint2.setAlpha((int) (paint2.getAlpha() * alpha));
        rectF2.set((Math.max(org.telegram.messenger.g0.L(4.0f), rectF.width() * e11) * f12) + rectF.left + org.telegram.messenger.g0.L(1.0f), rectF.top, (Math.max(org.telegram.messenger.g0.L(4.0f), rectF.width() * e12) * f12) + rectF.left, rectF.bottom);
        if (rectF2.width() > org.telegram.messenger.g0.L(3.0f)) {
            i3 = i11;
            a(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(e12 > 0.97f ? 2.0f : 1.0f), canvas, paint2, rectF2);
        } else {
            i3 = i11;
        }
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        Paint paint3 = this.w;
        paint3.setColor(x03);
        paint3.setAlpha((int) (paint3.getAlpha() * alpha));
        float f14 = rectF.left;
        rectF2.set(f14, rectF.top, (Math.max(org.telegram.messenger.g0.L(4.0f), rectF.width() * e11) * f12) + f14, rectF.bottom);
        a(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(e11 > 0.97f ? 2.0f : 1.0f), canvas, paint3, rectF2);
        if (e10 > 0.0f || u5Var.i) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int min = (int) Math.min(org.telegram.messenger.g0.L(174.0f), size * 0.8d);
        measureChildren(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i10);
        int L = org.telegram.messenger.g0.L(72.0f);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            TextView[] textViewArr = this.b;
            if (i11 >= textViewArr.length) {
                setMeasuredDimension(size, L + i12);
                this.c.set((size - min) / 2.0f, r8 - org.telegram.messenger.g0.L(30.0f), (size + min) / 2.0f, r8 - org.telegram.messenger.g0.L(26.0f));
                return;
            }
            i12 = Math.max(i12, textViewArr[i11].getMeasuredHeight() - (i11 == 2 ? org.telegram.messenger.g0.L(16.0f) : 0));
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            org.telegram.ui.Components.w70 w70Var = this.d;
            if (w70Var != null) {
                w70Var.f(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.z8, false), org.telegram.ui.ActionBar.k6.r1(0.2f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B6, false)));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
