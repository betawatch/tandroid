// default package

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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class n61 extends FrameLayout implements snb {
    public float[] E;
    public final /* synthetic */ z61 F;
    public final in a;
    public final TextView[] b;
    public final RectF c;
    public final va6 d;
    public Float e;
    public Float f;
    public final mm h;
    public final mm n;
    public final mm r;
    public final Paint s;
    public final Paint w;
    public final Paint x;
    public Path y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n61(z61 z61Var, Context context) {
        super(context);
        this.F = z61Var;
        this.b = new TextView[3];
        this.c = new RectF();
        this.d = new va6();
        k43 k43Var = k43.h;
        this.h = new mm(450L, this, k43Var);
        this.n = new mm(450L, this, k43Var);
        this.r = new mm(450L, this, k43Var);
        this.s = new Paint(1);
        this.w = new Paint(1);
        this.x = new Paint(1);
        in inVar = new in(context, false, false, false);
        this.a = inVar;
        inVar.b(0.35f, 350L, k43Var);
        inVar.setTypeface(hl.o());
        inVar.setTextSize(hl.L(20.0f));
        inVar.setText(ob6.M0(2131744473, null));
        inVar.setGravity(17);
        yob.U(inVar, aob.G6, null);
        addView(inVar, tre.e(-2, 26, 49));
        int i = 0;
        while (i < 3) {
            this.b[i] = new TextView(context);
            this.b[i].setTextSize(1, 13.0f);
            this.b[i].setGravity(17);
            this.b[i].setPadding(hl.L(24.0f), 0, hl.L(24.0f), 0);
            if (i == 0) {
                this.b[i].setText(ob6.M0(2131744472, null));
            } else if (i == 1) {
                this.b[i].setAlpha(0.0f);
                this.b[i].setText(ob6.M0(2131744470, null));
                this.b[i].setVisibility(4);
            } else if (i == 2) {
                this.b[i].setText(ob6.M0(2131744478, null));
                this.b[i].setAlpha(0.0f);
                this.b[i].setVisibility(4);
            }
            yob.X(this.b[i], aob.B6, null);
            addView(this.b[i], tre.d(-2, -2.0f, 17, 0.0f, i == 2 ? 12.0f : -6.0f, 0.0f, 0.0f));
            i++;
        }
        this.d.f(aob.w0(null, aob.z8, false), aob.p1(0.2f, aob.w0(null, aob.B6, false)));
        this.d.j(4.0f);
        this.d.setCallback(this);
    }

    public final void a(float f, float f2, Canvas canvas, Paint paint, RectF rectF) {
        Path path = this.y;
        if (path == null) {
            this.y = new Path();
        } else {
            path.rewind();
        }
        float[] fArr = this.E;
        if (fArr == null) {
            fArr = new float[8];
            this.E = fArr;
        }
        fArr[7] = f;
        fArr[6] = f;
        fArr[1] = f;
        fArr[0] = f;
        fArr[5] = f2;
        fArr[4] = f2;
        fArr[3] = f2;
        fArr[2] = f2;
        this.y.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(this.y, paint);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.z8));
    }

    public final void b(float f, float f2, boolean z) {
        this.a.setText(z ? ob6.M0(2131744473, null) : ob6.M0(2131744479, null));
        if (z) {
            TextView[] textViewArr = this.b;
            if (f < 0.01f) {
                textViewArr[1].setText(ob6.a0(null, null, 2131744469, z61.k0(f)));
            } else {
                textViewArr[1].setText(ob6.a0(null, null, 2131744470, z61.k0(f)));
            }
            c(1);
        } else {
            c(2);
        }
        this.e = Float.valueOf(f);
        this.f = Float.valueOf(f2);
        invalidate();
    }

    public final void c(int i) {
        boolean z = System.currentTimeMillis() - this.F.b0 > 40;
        TextView[] textViewArr = this.b;
        d(textViewArr[0], i == 0, z);
        d(textViewArr[1], i == 1, z);
        d(textViewArr[2], i == 2, z);
    }

    public final void d(TextView textView, boolean z, boolean z2) {
        if (textView == null) {
            return;
        }
        if (textView.getParent() == null) {
            z2 = false;
        }
        textView.animate().setListener(null).cancel();
        final byte b = 1;
        if (!z2) {
            textView.setVisibility(z ? (byte) 0 : (byte) 4);
            textView.setTag(z ? 1 : null);
            textView.setAlpha(z ? 1.0f : 0.0f);
            textView.setTranslationY(z ? 0.0f : hl.L(8.0f));
            invalidate();
            return;
        }
        if (!z) {
            textView.animate().alpha(0.0f).translationY(hl.L(8.0f)).setListener(new gf4(textView)).setInterpolator(k43.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: m61
                public final /* synthetic */ n61 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b2 = b;
                    n61 n61Var = this.b;
                    switch (b2) {
                        case 0:
                            n61Var.invalidate();
                            break;
                        default:
                            n61Var.invalidate();
                            break;
                    }
                }
            }).start();
            return;
        }
        if (textView.getVisibility() != 0) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
            textView.setTranslationY(hl.L(8.0f));
        }
        textView.animate().alpha(1.0f).translationY(0.0f).setInterpolator(k43.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: m61
            public final /* synthetic */ n61 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b2 = r2;
                n61 n61Var = this.b;
                switch (b2) {
                    case 0:
                        n61Var.invalidate();
                        break;
                    default:
                        n61Var.invalidate();
                        break;
                }
            }
        }).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        int i;
        float alpha = 1.0f - this.b[2].getAlpha();
        float e = this.r.e(false, this.e == null ? 1.0f : 0.0f);
        Float f = this.e;
        float floatValue = f == null ? 0.0f : f.floatValue();
        mm mmVar = this.h;
        float e2 = mmVar.e(false, floatValue);
        Float f2 = this.f;
        float e3 = this.n.e(false, f2 == null ? 0.0f : f2.floatValue());
        int i2 = aob.z8;
        int w0 = aob.w0(null, i2, false);
        Paint paint = this.s;
        paint.setColor(w0);
        paint.setAlpha((int) (paint.getAlpha() * alpha));
        RectF rectF2 = hl.P;
        RectF rectF3 = this.c;
        float f3 = 1.0f - e;
        rectF2.set(Math.max((Math.max(hl.L(4.0f), rectF3.width() * e3) * f3) + rectF3.left, (Math.max(hl.L(4.0f), rectF3.width() * e2) * f3) + rectF3.left) + hl.L(1.0f), rectF3.top, rectF3.right, rectF3.bottom);
        if (rectF2.left >= rectF2.right || rectF2.width() <= hl.L(3.0f)) {
            rectF = rectF3;
        } else {
            rectF = rectF3;
            a(hl.L(hl.U1(e, 1, 2)), hl.L(2.0f), canvas, paint, rectF2);
        }
        va6 va6Var = this.d;
        va6Var.e(rectF);
        va6Var.setAlpha((int) (255.0f * alpha * e));
        va6Var.draw(canvas);
        int i3 = aob.h7;
        int f4 = vm2.f(0.75f, aob.w0(null, i3, false), aob.w0(null, i2, false));
        Paint paint2 = this.x;
        paint2.setColor(f4);
        paint2.setAlpha((int) (paint2.getAlpha() * alpha));
        rectF2.set((Math.max(hl.L(4.0f), rectF.width() * e2) * f3) + rectF.left + hl.L(1.0f), rectF.top, (Math.max(hl.L(4.0f), rectF.width() * e3) * f3) + rectF.left, rectF.bottom);
        if (rectF2.width() > hl.L(3.0f)) {
            i = i3;
            a(hl.L(1.0f), hl.L(e3 > 0.97f ? 2.0f : 1.0f), canvas, paint2, rectF2);
        } else {
            i = i3;
        }
        int w02 = aob.w0(null, i, false);
        Paint paint3 = this.w;
        paint3.setColor(w02);
        paint3.setAlpha((int) (paint3.getAlpha() * alpha));
        float f5 = rectF.left;
        rectF2.set(f5, rectF.top, (Math.max(hl.L(4.0f), rectF.width() * e2) * f3) + f5, rectF.bottom);
        a(hl.L(2.0f), hl.L(e2 > 0.97f ? 2.0f : 1.0f), canvas, paint3, rectF2);
        if (e > 0.0f || mmVar.i) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int min = (int) Math.min(hl.L(174.0f), size * 0.8d);
        measureChildren(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i2);
        int L = hl.L(72.0f);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            TextView[] textViewArr = this.b;
            if (i3 >= textViewArr.length) {
                setMeasuredDimension(size, L + i4);
                this.c.set((size - min) / 2.0f, r8 - hl.L(30.0f), (size + min) / 2.0f, r8 - hl.L(26.0f));
                return;
            }
            i4 = Math.max(i4, textViewArr[i3].getMeasuredHeight() - (i3 == 2 ? hl.L(16.0f) : 0));
            i3++;
        }
    }

    @Override // snb
    public final void updateColors() {
        try {
            va6 va6Var = this.d;
            if (va6Var != null) {
                va6Var.f(aob.w0(null, aob.z8, false), aob.p1(0.2f, aob.w0(null, aob.B6, false)));
                invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
