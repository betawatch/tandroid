// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class gb0 extends FrameLayout implements s84 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(vnb vnbVar, Context context, boolean z) {
        super(context);
        this.a = (byte) 2;
        de0 de0Var = new de0(context);
        this.b = de0Var;
        de0Var.setRoundRadius(hl.L(23.0f));
        addView(de0Var, tre.d(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z) {
            addView(new ln2(context, vnbVar), tre.b(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.c = textView;
        ik8.v(textView, 1, 16.0f);
        yob.X(textView, aob.j5, vnbVar);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, tre.d(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        yob.X(textView2, aob.z6, vnbVar);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, tre.d(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    public final void a(TextView textView, boolean z) {
        t84 t84Var = (t84) this.c;
        CharSequence text = textView.getText();
        float measureText = (text != null ? textView.getPaint().measureText(text, 0, text.length()) : 0.0f) + hl.L(32.0f);
        if (z && t84Var.f > 0.0f) {
            t84Var.a(measureText);
        } else {
            t84Var.c(measureText);
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        float f5;
        Canvas canvas2;
        float f6;
        float f7;
        switch (this.a) {
            case 0:
                Paint paint = (Paint) this.c;
                aob.m(paint);
                paint.setColor(aob.v0(aob.G8, ((ob0) this.d).getResourceProvider()));
                paint.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF = hl.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.b;
                path.rewind();
                path.addRoundRect(rectF, hl.L(12.0f), hl.L(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                break;
            case 4:
                Paint paint2 = (Paint) this.c;
                rc5 rc5Var = (rc5) this.d;
                paint2.setColor(rc5Var.getThemedColor(aob.d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF2 = (RectF) this.b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(0.0f, getTop());
                rc5Var.m0(canvas, rectF2, paint2);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 6:
                RectF rectF3 = (RectF) this.b;
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.c;
                paint3.setColor(-1);
                float width = getWidth() - (hl.N(5.0f) * 2.0f);
                jm8 jm8Var = (jm8) this.d;
                float N = (width - hl.N((jm8Var.b - 1) << 1)) / jm8Var.b;
                float N2 = hl.N(5.0f);
                int i2 = 0;
                while (i2 < jm8Var.b) {
                    rectF3.set(N2, hl.N(8.0f), N2 + N, hl.N(10.0f));
                    paint3.setAlpha(i2 < jm8Var.b - 1 ? jn7.d4 : jn7.Q1);
                    canvas.drawRoundRect(rectF3, hl.N(1.0f), hl.N(1.0f), paint3);
                    N2 += hl.N(2.0f) + N;
                    i2++;
                }
                break;
            case 13:
                k1c k1cVar = (k1c) this.d;
                hn hnVar = k1cVar.f;
                float i3 = hnVar.i();
                int i4 = (i3 > 0.0f ? 1 : (i3 == 0.0f ? 0 : -1));
                boolean z = i4 > 0;
                float R1 = hl.R1(0.5f, 1.0f, i3) * k1cVar.M;
                float L = hl.L(10.0f);
                float L2 = hl.L(8.33f);
                float width2 = (getWidth() / 2.0f) + hl.L(12.0f);
                float L3 = hl.L(12.0f);
                float max = Math.max(L2 + L2, hnVar.c() + hl.L(10.0f));
                if (z) {
                    f2 = L;
                    f = R1;
                    f3 = width2;
                    f5 = 255.0f;
                    canvas2 = canvas;
                    f4 = 2.0f;
                    f6 = L2;
                    i = i4;
                    f7 = L3;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), jn7.d4, 31);
                } else {
                    f = R1;
                    f2 = L;
                    f3 = width2;
                    f4 = 2.0f;
                    i = i4;
                    f5 = 255.0f;
                    canvas2 = canvas;
                    f6 = L2;
                    f7 = L3;
                }
                super.dispatchDraw(canvas);
                if (z) {
                    RectF rectF4 = hl.P;
                    float f8 = max / f4;
                    rectF4.set((f3 - f8) - hl.L(1.33f), f7 - f2, f8 + f3 + hl.L(1.33f), f7 + f2);
                    hl.e3(rectF4, i3, rectF4.centerX(), rectF4.centerY());
                    float f9 = f2 * i3;
                    canvas2.drawRoundRect(rectF4, f9, f9, (Paint) this.c);
                    canvas2.restore();
                }
                if (i > 0) {
                    canvas2.save();
                    canvas2.scale(f, f, f3, f7);
                    RectF rectF5 = hl.P;
                    float f10 = max / f4;
                    rectF5.set(f3 - f10, f7 - f6, f3 + f10, f7 + f6);
                    sm smVar = (sm) this.b;
                    smVar.setColor(aob.p1(i3, smVar.b.a(aob.v0(k1cVar.G, smVar.a), false)));
                    canvas2.drawRoundRect(rectF5, f6, f6, smVar);
                    hnVar.p(rectF5);
                    hnVar.C = (int) (i3 * f5);
                    hnVar.draw(canvas2);
                    canvas2.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                if (motionEvent.getAction() != 0 || ((RectF) this.d).contains(motionEvent.getX(), motionEvent.getY())) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 10:
                canvas.save();
                canvas.clipPath((Path) this.b);
                super.draw(canvas);
                canvas.restore();
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 3:
                n15 n15Var = (n15) this.b;
                n15 n15Var2 = (n15) this.c;
                boolean drawChild = super.drawChild(canvas, view, j);
                xn2 xn2Var = (xn2) this.d;
                if (view == xn2Var.e) {
                    int i = aob.a7;
                    n15Var.b(xn2Var.getThemedColor(i));
                    n15Var.setBounds(0, 0, getWidth(), hl.m);
                    n15Var.draw(canvas);
                    float Q0 = hl.Q0(hl.n);
                    if (Q0 > 0.0f) {
                        n15Var2.setAlpha((int) (Q0 * 255.0f));
                        n15Var2.b(xn2Var.getThemedColor(i));
                        n15Var2.setBounds(0, getHeight() - hl.n, getWidth(), getHeight());
                        n15Var2.draw(canvas);
                    }
                }
                return drawChild;
            case 8:
                Paint paint = (Paint) this.c;
                if (((iza) this.d).e > 1) {
                    paint.setColor(aob.v0(aob.d6, (vnb) this.b));
                    RectF rectF = hl.P;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-hl.L(1.66f), -hl.L(1.66f));
                    canvas.drawRoundRect(rectF, hl.L(13.0f), hl.L(13.0f), paint);
                }
                return super.drawChild(canvas, view, j);
            case 11:
                i8b i8bVar = ((k8b) this.d).f;
                if (view != i8bVar) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                canvas.translate(((mm) this.b).e(false, view.getX()), ((mm) this.c).e(false, view.getY()));
                i8bVar.a(canvas);
                canvas.restore();
                return true;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                float min = Math.min(((t84) this.c).f, getWidth() - hl.L(24.0f));
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                RectF rectF = (RectF) this.d;
                float f = min / 2.0f;
                rectF.set(width - f, height - (hl.L(38.0f) / 2.0f), width + f, (hl.L(38.0f) / 2.0f) + height);
                int L = hl.L(6.0f);
                jl0 jl0Var = (jl0) this.b;
                jl0Var.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                jl0Var.draw(canvas);
                break;
            case 12:
                super.onDraw(canvas);
                Paint paint = (Paint) this.c;
                paint.setColor(aob.w0(null, aob.p7, false));
                canvas.save();
                float measuredWidth = getMeasuredWidth();
                TextPaint textPaint = (TextPaint) this.d;
                canvas.translate((measuredWidth - textPaint.measureText("500")) - hl.L(8.0f), hl.N(7.0f));
                RectF rectF2 = (RectF) this.b;
                rectF2.set(0.0f, 0.0f, textPaint.measureText("500"), textPaint.getTextSize());
                rectF2.inset(-hl.L(6.0f), -hl.L(3.0f));
                float textSize = (textPaint.getTextSize() / 2.0f) + hl.L(3.0f);
                canvas.drawRoundRect(rectF2, textSize, textSize, paint);
                canvas.drawText("500", 0.0f, textPaint.getTextSize() - hl.N(2.0f), textPaint);
                canvas.restore();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 10:
                super.onMeasure(i, i2);
                Path path = (Path) this.b;
                path.rewind();
                RectF rectF = (RectF) this.c;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, hl.L(10.0f), hl.L(10.0f), Path.Direction.CW);
                i8b i8bVar = ((k8b) this.d).f;
                if (i8bVar != null) {
                    i8bVar.setMaxWidth(getMeasuredWidth() - hl.L(32.0f));
                    break;
                }
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 13:
                return ((k1c) this.d).f == drawable || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    @Override // s84
    public final void v0(float f, int i) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gb0(Context context) {
        super(context);
        this.a = (byte) 7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(jm8 jm8Var, Context context) {
        super(context);
        this.a = (byte) 6;
        this.d = jm8Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.a = (byte) 12;
        this.c = paint;
        this.d = textPaint;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(k8b k8bVar, Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 11:
                this.d = k8bVar;
                super(context);
                k43 k43Var = k43.h;
                this.b = new mm(this, 0L, 350L, k43Var);
                this.c = new mm(this, 0L, 350L, k43Var);
                break;
            default:
                this.d = k8bVar;
                this.b = new Path();
                this.c = new RectF();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(xn2 xn2Var, Context context) {
        super(context);
        this.a = (byte) 3;
        this.d = xn2Var;
        this.b = new n15(2);
        this.c = new n15(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(g2b g2bVar, Context context) {
        super(context);
        this.a = (byte) 9;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        yob.s(imageView, aob.Fi, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, tre.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTypeface(hl.o());
        yob.X(textView, aob.G6, g2bVar.J0);
        textView.setTextSize(1, 14.0f);
        addView(textView, tre.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        yob.X(textView2, aob.y6, g2bVar.J0);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, tre.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(ob0 ob0Var, Activity activity) {
        super(activity);
        this.a = (byte) 0;
        this.d = ob0Var;
        this.b = new Path();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(i56 i56Var, Context context) {
        super(context);
        this.a = (byte) 5;
        this.d = i56Var;
        g56 g56Var = new g56(this, context);
        this.c = g56Var;
        LinearLayout j = uh9.j(context, 0);
        addView(j, tre.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(hl.o());
        j.addView(g56Var, tre.o(-2, -1));
        j.addView(textView, tre.r(-2, -2, 16));
        setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
        g56Var.a(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(j81 j81Var, Context context) {
        super(context);
        vnb vnbVar;
        this.a = (byte) 1;
        this.c = new t84(0, this, k43.h, 350L, 0.0f);
        this.d = new RectF();
        setWillNotDraw(false);
        jl0 c = j81Var.getBaseSimpleGlass().c.c(this, null, false);
        vnbVar = ((e) j81Var).resourceProvider;
        c.p(dtd.l(vnbVar));
        c.q(hl.L(6.0f));
        c.r(hl.L(19.0f));
        this.b = c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(rc5 rc5Var, Context context) {
        super(context);
        this.a = (byte) 4;
        this.d = rc5Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(k1c k1cVar, Context context, vnb vnbVar) {
        super(context);
        this.a = (byte) 13;
        this.d = k1cVar;
        Paint paint = new Paint(1);
        this.c = paint;
        this.b = new sm(this, vnbVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        k1cVar.f.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(iza izaVar, Context context, vnb vnbVar) {
        super(context);
        this.a = (byte) 8;
        this.d = izaVar;
        this.b = vnbVar;
        this.c = new Paint(1);
    }
}
