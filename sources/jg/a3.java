package jg;

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
import org.telegram.messenger.m5;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.n21;
import org.telegram.ui.Components.o8;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.y5;
import org.telegram.ui.h8;
import org.telegram.ui.v50;
import rh.c8;
import th.h4;
import vh.g4;
import w7.b6;
import w7.b9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a3 extends FrameLayout implements fe.e {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(Context context) {
        super(context);
        this.a = 8;
    }

    public void a(TextView textView, boolean z10) {
        fe.f fVar = (fe.f) this.b;
        CharSequence text = textView.getText();
        float measureText = (text != null ? textView.getPaint().measureText(text, 0, text.length()) : 0.0f) + org.telegram.messenger.i0.L(32.0f);
        if (z10 && fVar.f > 0.0f) {
            fVar.a(measureText);
        } else {
            fVar.c(measureText);
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        boolean z10;
        float f10;
        float f11;
        switch (this.a) {
            case 4:
                Paint paint = (Paint) this.d;
                t6.n(paint);
                paint.setColor(t6.w0(t6.G8, ((o8) this.b).getResourceProvider()));
                paint.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.c;
                path.rewind();
                path.addRoundRect(rectF, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                break;
            case 6:
                n21 n21Var = (n21) this.b;
                e6 e6Var = n21Var.f;
                float i11 = e6Var.i();
                int i12 = (i11 > 0.0f ? 1 : (i11 == 0.0f ? 0 : -1));
                boolean z11 = i12 > 0;
                float T1 = org.telegram.messenger.i0.T1(0.5f, 1.0f, i11) * n21Var.L;
                float L = org.telegram.messenger.i0.L(10.0f);
                float L2 = org.telegram.messenger.i0.L(8.33f);
                float width = (getWidth() / 2.0f) + org.telegram.messenger.i0.L(12.0f);
                float L3 = org.telegram.messenger.i0.L(12.0f);
                float max = Math.max(L2 + L2, e6Var.c() + org.telegram.messenger.i0.L(10.0f));
                if (z11) {
                    i10 = i12;
                    f10 = width;
                    z10 = z11;
                    f11 = L3;
                    f7 = L2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), zs.e4, 31);
                } else {
                    f7 = L2;
                    i10 = i12;
                    z10 = z11;
                    f10 = width;
                    f11 = L3;
                }
                super.dispatchDraw(canvas);
                if (z10) {
                    RectF rectF2 = org.telegram.messenger.i0.P;
                    float f12 = max / 2.0f;
                    rectF2.set((f10 - f12) - org.telegram.messenger.i0.L(1.33f), f11 - L, f12 + f10 + org.telegram.messenger.i0.L(1.33f), f11 + L);
                    org.telegram.messenger.i0.i3(rectF2, i11, rectF2.centerX(), rectF2.centerY());
                    float f13 = L * i11;
                    canvas.drawRoundRect(rectF2, f13, f13, (Paint) this.c);
                    canvas.restore();
                }
                if (i10 > 0) {
                    canvas.save();
                    canvas.scale(T1, T1, f10, f11);
                    RectF rectF3 = org.telegram.messenger.i0.P;
                    float f14 = max / 2.0f;
                    rectF3.set(f10 - f14, f11 - f7, f10 + f14, f11 + f7);
                    y5 y5Var = (y5) this.d;
                    y5Var.setColor(t6.r1(i11, y5Var.b.a(t6.w0(n21Var.F, y5Var.a), false)));
                    canvas.drawRoundRect(rectF3, f7, f7, y5Var);
                    e6Var.p(rectF3);
                    e6Var.B = (int) (i11 * 255.0f);
                    e6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 7:
                Paint paint2 = (Paint) this.c;
                v50 v50Var = (v50) this.b;
                paint2.setColor(v50Var.getThemedColor(t6.d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF4 = (RectF) this.d;
                rectF4.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF4.offset(0.0f, getTop());
                v50.e0(v50Var, canvas, rectF4, paint2);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 11:
                RectF rectF5 = (RectF) this.d;
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.c;
                paint3.setColor(-1);
                float width2 = getWidth() - (org.telegram.messenger.i0.N(5.0f) * 2.0f);
                g4 g4Var = (g4) this.b;
                float N = (width2 - org.telegram.messenger.i0.N((g4Var.b - 1) * 2)) / g4Var.b;
                float N2 = org.telegram.messenger.i0.N(5.0f);
                int i13 = 0;
                while (i13 < g4Var.b) {
                    rectF5.set(N2, org.telegram.messenger.i0.N(8.0f), N2 + N, org.telegram.messenger.i0.N(10.0f));
                    paint3.setAlpha(i13 < g4Var.b + (-1) ? zs.e4 : 133);
                    canvas.drawRoundRect(rectF5, org.telegram.messenger.i0.N(1.0f), org.telegram.messenger.i0.N(1.0f), paint3);
                    N2 += org.telegram.messenger.i0.N(2.0f) + N;
                    i13++;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                if (motionEvent.getAction() != 0 || ((RectF) this.d).contains(motionEvent.getX(), motionEvent.getY())) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                canvas.save();
                canvas.clipPath((Path) this.c);
                super.draw(canvas);
                canvas.restore();
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 1:
                b3 b3Var = ((d3) this.b).f;
                if (view != b3Var) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.translate(((t5) this.c).e(false, view.getX()), ((t5) this.d).e(false, view.getY()));
                b3Var.a(canvas);
                canvas.restore();
                return true;
            case 9:
                Paint paint = (Paint) this.c;
                if (((c8) this.b).e > 1) {
                    paint.setColor(t6.w0(t6.d6, (p6) this.d));
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-org.telegram.messenger.i0.L(1.66f), -org.telegram.messenger.i0.L(1.66f));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), paint);
                }
                return super.drawChild(canvas, view, j10);
            case 12:
                rf.w wVar = (rf.w) this.c;
                rf.w wVar2 = (rf.w) this.d;
                boolean drawChild = super.drawChild(canvas, view, j10);
                yh.l lVar = (yh.l) this.b;
                if (view == lVar.e) {
                    int i10 = t6.a7;
                    wVar.b(lVar.getThemedColor(i10));
                    wVar.setBounds(0, 0, getWidth(), org.telegram.messenger.i0.m);
                    wVar.draw(canvas);
                    float R0 = org.telegram.messenger.i0.R0(org.telegram.messenger.i0.n);
                    if (R0 > 0.0f) {
                        wVar2.setAlpha((int) (R0 * 255.0f));
                        wVar2.b(lVar.getThemedColor(i10));
                        wVar2.setBounds(0, getHeight() - org.telegram.messenger.i0.n, getWidth(), getHeight());
                        wVar2.draw(canvas);
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                float min = Math.min(((fe.f) this.b).f, getWidth() - org.telegram.messenger.i0.L(24.0f));
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                RectF rectF = (RectF) this.d;
                float f7 = min / 2.0f;
                rectF.set(width - f7, height - (org.telegram.messenger.i0.L(38.0f) / 2.0f), width + f7, (org.telegram.messenger.i0.L(38.0f) / 2.0f) + height);
                int L = org.telegram.messenger.i0.L(6.0f);
                vg.f fVar = (vg.f) this.c;
                fVar.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                fVar.draw(canvas);
                break;
            case 3:
                super.onDraw(canvas);
                Paint paint = (Paint) this.c;
                paint.setColor(t6.x0(null, t6.p7, false));
                canvas.save();
                float measuredWidth = getMeasuredWidth();
                TextPaint textPaint = (TextPaint) this.b;
                canvas.translate((measuredWidth - textPaint.measureText("500")) - org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.N(7.0f));
                RectF rectF2 = (RectF) this.d;
                rectF2.set(0.0f, 0.0f, textPaint.measureText("500"), textPaint.getTextSize());
                rectF2.inset(-org.telegram.messenger.i0.L(6.0f), -org.telegram.messenger.i0.L(3.0f));
                float textSize = (textPaint.getTextSize() / 2.0f) + org.telegram.messenger.i0.L(3.0f);
                canvas.drawRoundRect(rectF2, textSize, textSize, paint);
                canvas.drawText("500", 0.0f, textPaint.getTextSize() - org.telegram.messenger.i0.N(2.0f), textPaint);
                canvas.restore();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(i10, i11);
                Path path = (Path) this.c;
                path.rewind();
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), Path.Direction.CW);
                b3 b3Var = ((d3) this.b).f;
                if (b3Var != null) {
                    b3Var.setMaxWidth(getMeasuredWidth() - org.telegram.messenger.i0.L(32.0f));
                    break;
                }
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // fe.e
    public void v(int i10, float f7, float f10, fe.f fVar) {
        invalidate();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 6:
                return ((n21) this.b).f == drawable || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(Context context, p6 p6Var, boolean z10) {
        super(context);
        this.a = 13;
        g9 g9Var = new g9(context);
        this.c = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(23.0f));
        addView(g9Var, b6.d(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z10) {
            addView(new zh.a(context, p6Var), b6.b(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        z20.n(textView, 1, 16.0f);
        a7.V(textView, t6.j5, p6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, b6.d(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 14.0f);
        a7.V(textView2, t6.z6, p6Var);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, b6.d(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(g4 g4Var, Context context) {
        super(context);
        this.a = 11;
        this.b = g4Var;
        this.d = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.a = 3;
        this.c = paint;
        this.b = textPaint;
        this.d = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(d3 d3Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = d3Var;
                super(context);
                gr grVar = gr.h;
                this.c = new t5(this, 0L, 350L, grVar);
                this.d = new t5(this, 0L, 350L, grVar);
                break;
            default:
                this.b = d3Var;
                this.c = new Path();
                this.d = new RectF();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(yh.l lVar, Context context) {
        super(context);
        this.a = 12;
        this.b = lVar;
        this.c = new rf.w(2);
        this.d = new rf.w(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(h4 h4Var, Context context) {
        super(context);
        this.a = 10;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        a7.t(imageView, t6.Ci, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, b6.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTypeface(org.telegram.messenger.i0.o());
        a7.V(textView, t6.G6, h4Var.I0);
        textView.setTextSize(1, 14.0f);
        addView(textView, b6.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        a7.V(textView2, t6.y6, h4Var.I0);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, b6.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    @Override // fe.e
    public /* synthetic */ void E(float f7, int i10) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(o8 o8Var, Activity activity) {
        super(activity);
        this.a = 4;
        this.b = o8Var;
        this.c = new Path();
        this.d = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(h8 h8Var, Context context) {
        super(context);
        p6 p6Var;
        this.a = 2;
        this.b = new fe.f(0, this, gr.h, 350L, 0.0f);
        this.d = new RectF();
        setWillNotDraw(false);
        vg.f c10 = h8Var.getBaseSimpleGlass().c.c(this, null, false);
        p6Var = ((org.telegram.ui.ActionBar.k2) h8Var).resourceProvider;
        c10.o(b9.m(p6Var));
        c10.p(org.telegram.messenger.i0.L(6.0f));
        c10.q(org.telegram.messenger.i0.L(19.0f));
        this.c = c10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(j80 j80Var, Context context) {
        super(context);
        this.a = 5;
        this.b = j80Var;
        h80 h80Var = new h80(this, context);
        this.d = h80Var;
        LinearLayout f7 = m5.f(context, 0);
        addView(f7, b6.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        f7.addView(h80Var, b6.o(-2, -1));
        f7.addView(textView, b6.r(-2, -2, 16));
        setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        h80Var.a(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(v50 v50Var, Context context) {
        super(context);
        this.a = 7;
        this.b = v50Var;
        this.d = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(n21 n21Var, Context context, p6 p6Var) {
        super(context);
        this.a = 6;
        this.b = n21Var;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new y5(this, p6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        n21Var.f.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(c8 c8Var, Context context, p6 p6Var) {
        super(context);
        this.a = 9;
        this.b = c8Var;
        this.d = p6Var;
        this.c = new Paint(1);
    }
}
