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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class k6 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public float[] D;
    public final /* synthetic */ y6 E;
    public final org.telegram.ui.Components.j6 a;
    public final TextView[] b;
    public final RectF c;
    public final org.telegram.ui.Components.a80 d;
    public Float e;
    public Float f;
    public final org.telegram.ui.Components.w5 h;
    public final org.telegram.ui.Components.w5 n;
    public final org.telegram.ui.Components.w5 r;
    public final Paint s;
    public final Paint w;
    public final Paint x;
    public Path y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(y6 y6Var, Context context) {
        super(context);
        this.E = y6Var;
        this.b = new TextView[3];
        this.c = new RectF();
        this.d = new org.telegram.ui.Components.a80();
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.h = new org.telegram.ui.Components.w5(this, 450L, xqVar);
        this.n = new org.telegram.ui.Components.w5(this, 450L, xqVar);
        this.r = new org.telegram.ui.Components.w5(this, 450L, xqVar);
        this.s = new Paint(1);
        this.w = new Paint(1);
        this.x = new Paint(1);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.a = j6Var;
        j6Var.b(0.35f, 350L, xqVar);
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        j6Var.setTextSize(org.telegram.messenger.g0.L(20.0f));
        j6Var.setText(org.telegram.messenger.hd.M0(2131744817, null));
        j6Var.setGravity(17);
        org.telegram.ui.ActionBar.r6.Z(j6Var, org.telegram.ui.ActionBar.k6.G6, null);
        addView(j6Var, c8.ha.e(-2, 26, 49));
        int i7 = 0;
        while (i7 < 3) {
            this.b[i7] = new TextView(context);
            this.b[i7].setTextSize(1, 13.0f);
            this.b[i7].setGravity(17);
            this.b[i7].setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
            if (i7 == 0) {
                this.b[i7].setText(org.telegram.messenger.hd.M0(2131744816, null));
            } else if (i7 == 1) {
                this.b[i7].setAlpha(0.0f);
                this.b[i7].setText(org.telegram.messenger.hd.M0(2131744814, null));
                this.b[i7].setVisibility(4);
            } else if (i7 == 2) {
                this.b[i7].setText(org.telegram.messenger.hd.M0(2131744822, null));
                this.b[i7].setAlpha(0.0f);
                this.b[i7].setVisibility(4);
            }
            org.telegram.ui.ActionBar.r6.V(this.b[i7], org.telegram.ui.ActionBar.k6.B6, null);
            addView(this.b[i7], c8.ha.d(-2, -2.0f, 17, 0.0f, i7 == 2 ? 12.0f : -6.0f, 0.0f, 0.0f));
            i7++;
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
        if (this.D == null) {
            this.D = new float[8];
        }
        float[] fArr = this.D;
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

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z8));
    }

    public final void b(float f10, float f11, boolean z9) {
        this.a.setText(z9 ? org.telegram.messenger.hd.M0(2131744817, null) : org.telegram.messenger.hd.M0(2131744823, null));
        if (z9) {
            y6 y6Var = this.E;
            TextView[] textViewArr = this.b;
            if (f10 < 0.01f) {
                textViewArr[1].setText(org.telegram.messenger.hd.a0(null, null, 2131744813, y6.j0(y6Var, f10)));
            } else {
                textViewArr[1].setText(org.telegram.messenger.hd.a0(null, null, 2131744814, y6.j0(y6Var, f10)));
            }
            c(1);
        } else {
            c(2);
        }
        this.e = Float.valueOf(f10);
        this.f = Float.valueOf(f11);
        invalidate();
    }

    public final void c(int i7) {
        boolean z9 = System.currentTimeMillis() - this.E.a0 > 40;
        TextView[] textViewArr = this.b;
        d(textViewArr[0], i7 == 0, z9);
        d(textViewArr[1], i7 == 1, z9);
        d(textViewArr[2], i7 == 2, z9);
    }

    public final void d(TextView textView, boolean z9, boolean z10) {
        if (textView == null) {
            return;
        }
        if (textView.getParent() == null) {
            z10 = false;
        }
        textView.animate().setListener(null).cancel();
        if (!z10) {
            textView.setVisibility(z9 ? 0 : 4);
            textView.setTag(z9 ? 1 : null);
            textView.setAlpha(z9 ? 1.0f : 0.0f);
            textView.setTranslationY(z9 ? 0.0f : org.telegram.messenger.g0.L(8.0f));
            invalidate();
            return;
        }
        if (!z9) {
            final int i7 = 1;
            textView.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(8.0f)).setListener(new org.telegram.ui.Components.t9(textView)).setInterpolator(org.telegram.ui.Components.xq.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.j6
                public final /* synthetic */ k6 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i7) {
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
        textView.animate().alpha(1.0f).translationY(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.j6
            public final /* synthetic */ k6 b;

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
        int i7;
        float alpha = 1.0f - this.b[2].getAlpha();
        float e10 = this.r.e(false, this.e == null ? 1.0f : 0.0f);
        Float f10 = this.e;
        float floatValue = f10 == null ? 0.0f : f10.floatValue();
        org.telegram.ui.Components.w5 w5Var = this.h;
        float e11 = w5Var.e(false, floatValue);
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
        org.telegram.ui.Components.a80 a80Var = this.d;
        a80Var.e(rectF);
        a80Var.setAlpha((int) (255.0f * alpha * e10));
        a80Var.draw(canvas);
        int i11 = org.telegram.ui.ActionBar.k6.h7;
        int f13 = i0.a.f(0.75f, org.telegram.ui.ActionBar.k6.x0(null, i11, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        Paint paint2 = this.x;
        paint2.setColor(f13);
        paint2.setAlpha((int) (paint2.getAlpha() * alpha));
        rectF2.set((Math.max(org.telegram.messenger.g0.L(4.0f), rectF.width() * e11) * f12) + rectF.left + org.telegram.messenger.g0.L(1.0f), rectF.top, (Math.max(org.telegram.messenger.g0.L(4.0f), rectF.width() * e12) * f12) + rectF.left, rectF.bottom);
        if (rectF2.width() > org.telegram.messenger.g0.L(3.0f)) {
            i7 = i11;
            a(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(e12 > 0.97f ? 2.0f : 1.0f), canvas, paint2, rectF2);
        } else {
            i7 = i11;
        }
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        Paint paint3 = this.w;
        paint3.setColor(x03);
        paint3.setAlpha((int) (paint3.getAlpha() * alpha));
        float f14 = rectF.left;
        rectF2.set(f14, rectF.top, (Math.max(org.telegram.messenger.g0.L(4.0f), rectF.width() * e11) * f12) + f14, rectF.bottom);
        a(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(e11 > 0.97f ? 2.0f : 1.0f), canvas, paint3, rectF2);
        if (e10 > 0.0f || w5Var.i) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
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

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            org.telegram.ui.Components.a80 a80Var = this.d;
            if (a80Var != null) {
                a80Var.f(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.z8, false), org.telegram.ui.ActionBar.k6.r1(0.2f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B6, false)));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
