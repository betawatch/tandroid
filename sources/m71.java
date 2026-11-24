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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m71 extends FrameLayout implements vlb {
    public float[] E;
    public final /* synthetic */ y71 F;
    public final io a;
    public final TextView[] b;
    public final RectF c;
    public final qa6 d;
    public Float e;
    public Float f;
    public final ln h;
    public final ln n;
    public final ln r;
    public final Paint s;
    public final Paint w;
    public final Paint x;
    public Path y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m71(y71 y71Var, Context context) {
        super(context);
        this.F = y71Var;
        this.b = new TextView[3];
        this.c = new RectF();
        this.d = new qa6();
        d53 d53Var = d53.h;
        this.h = new ln(450L, this, d53Var);
        this.n = new ln(450L, this, d53Var);
        this.r = new ln(450L, this, d53Var);
        this.s = new Paint(1);
        this.w = new Paint(1);
        this.x = new Paint(1);
        io ioVar = new io(context, false, false, false);
        this.a = ioVar;
        ioVar.b(0.35f, 350L, d53Var);
        ioVar.setTypeface(gm.o());
        ioVar.setTextSize(gm.L(20.0f));
        ioVar.setText(jb6.M0(2131744505, null));
        ioVar.setGravity(17);
        anb.U(ioVar, cmb.F6, null);
        addView(ioVar, qoe.e(-2, 26, 49));
        int i = 0;
        while (i < 3) {
            this.b[i] = new TextView(context);
            this.b[i].setTextSize(1, 13.0f);
            this.b[i].setGravity(17);
            this.b[i].setPadding(gm.L(24.0f), 0, gm.L(24.0f), 0);
            if (i == 0) {
                this.b[i].setText(jb6.M0(2131744504, null));
            } else if (i == 1) {
                this.b[i].setAlpha(0.0f);
                this.b[i].setText(jb6.M0(2131744502, null));
                this.b[i].setVisibility(4);
            } else if (i == 2) {
                this.b[i].setText(jb6.M0(2131744510, null));
                this.b[i].setAlpha(0.0f);
                this.b[i].setVisibility(4);
            }
            anb.X(this.b[i], cmb.A6, null);
            addView(this.b[i], qoe.d(-2, -2.0f, 17, 0.0f, i == 2 ? 12.0f : -6.0f, 0.0f, 0.0f));
            i++;
        }
        this.d.f(cmb.w0(null, cmb.y8, false), cmb.p1(0.2f, cmb.w0(null, cmb.A6, false)));
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

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.y8));
    }

    public final void b(float f, float f2, boolean z) {
        this.a.setText(z ? jb6.M0(2131744505, null) : jb6.M0(2131744511, null));
        if (z) {
            TextView[] textViewArr = this.b;
            if (f < 0.01f) {
                textViewArr[1].setText(jb6.a0(null, null, 2131744501, y71.l0(f)));
            } else {
                textViewArr[1].setText(jb6.a0(null, null, 2131744502, y71.l0(f)));
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
            textView.setTranslationY(z ? 0.0f : gm.L(8.0f));
            invalidate();
            return;
        }
        if (!z) {
            textView.animate().alpha(0.0f).translationY(gm.L(8.0f)).setListener(new jf4(textView)).setInterpolator(d53.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: l71
                public final /* synthetic */ m71 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b2 = b;
                    m71 m71Var = this.b;
                    switch (b2) {
                        case 0:
                            m71Var.invalidate();
                            break;
                        default:
                            m71Var.invalidate();
                            break;
                    }
                }
            }).start();
            return;
        }
        if (textView.getVisibility() != 0) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
            textView.setTranslationY(gm.L(8.0f));
        }
        textView.animate().alpha(1.0f).translationY(0.0f).setInterpolator(d53.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: l71
            public final /* synthetic */ m71 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b2 = r2;
                m71 m71Var = this.b;
                switch (b2) {
                    case 0:
                        m71Var.invalidate();
                        break;
                    default:
                        m71Var.invalidate();
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
        ln lnVar = this.h;
        float e2 = lnVar.e(false, floatValue);
        Float f2 = this.f;
        float e3 = this.n.e(false, f2 == null ? 0.0f : f2.floatValue());
        int i2 = cmb.y8;
        int w0 = cmb.w0(null, i2, false);
        Paint paint = this.s;
        paint.setColor(w0);
        paint.setAlpha((int) (paint.getAlpha() * alpha));
        RectF rectF2 = gm.P;
        RectF rectF3 = this.c;
        float f3 = 1.0f - e;
        rectF2.set(Math.max((Math.max(gm.L(4.0f), rectF3.width() * e3) * f3) + rectF3.left, (Math.max(gm.L(4.0f), rectF3.width() * e2) * f3) + rectF3.left) + gm.L(1.0f), rectF3.top, rectF3.right, rectF3.bottom);
        if (rectF2.left >= rectF2.right || rectF2.width() <= gm.L(3.0f)) {
            rectF = rectF3;
        } else {
            rectF = rectF3;
            a(gm.L(gm.U1(e, 1, 2)), gm.L(2.0f), canvas, paint, rectF2);
        }
        qa6 qa6Var = this.d;
        qa6Var.e(rectF);
        qa6Var.setAlpha((int) (255.0f * alpha * e));
        qa6Var.draw(canvas);
        int i3 = cmb.g7;
        int f4 = on2.f(0.75f, cmb.w0(null, i3, false), cmb.w0(null, i2, false));
        Paint paint2 = this.x;
        paint2.setColor(f4);
        paint2.setAlpha((int) (paint2.getAlpha() * alpha));
        rectF2.set((Math.max(gm.L(4.0f), rectF.width() * e2) * f3) + rectF.left + gm.L(1.0f), rectF.top, (Math.max(gm.L(4.0f), rectF.width() * e3) * f3) + rectF.left, rectF.bottom);
        if (rectF2.width() > gm.L(3.0f)) {
            i = i3;
            a(gm.L(1.0f), gm.L(e3 > 0.97f ? 2.0f : 1.0f), canvas, paint2, rectF2);
        } else {
            i = i3;
        }
        int w02 = cmb.w0(null, i, false);
        Paint paint3 = this.w;
        paint3.setColor(w02);
        paint3.setAlpha((int) (paint3.getAlpha() * alpha));
        float f5 = rectF.left;
        rectF2.set(f5, rectF.top, (Math.max(gm.L(4.0f), rectF.width() * e2) * f3) + f5, rectF.bottom);
        a(gm.L(2.0f), gm.L(e2 > 0.97f ? 2.0f : 1.0f), canvas, paint3, rectF2);
        if (e > 0.0f || lnVar.i) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int min = (int) Math.min(gm.L(174.0f), size * 0.8d);
        measureChildren(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i2);
        int L = gm.L(72.0f);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            TextView[] textViewArr = this.b;
            if (i3 >= textViewArr.length) {
                setMeasuredDimension(size, L + i4);
                this.c.set((size - min) / 2.0f, r8 - gm.L(30.0f), (size + min) / 2.0f, r8 - gm.L(26.0f));
                return;
            }
            i4 = Math.max(i4, textViewArr[i3].getMeasuredHeight() - (i3 == 2 ? gm.L(16.0f) : 0));
            i3++;
        }
    }

    @Override // vlb
    public final void updateColors() {
        try {
            qa6 qa6Var = this.d;
            if (qa6Var != null) {
                qa6Var.f(cmb.w0(null, cmb.y8, false), cmb.p1(0.2f, cmb.w0(null, cmb.A6, false)));
                invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
