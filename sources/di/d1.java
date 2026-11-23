package di;

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
import org.telegram.messenger.ls;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.z11;
import org.telegram.ui.z40;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class d1 extends FrameLayout implements te.b {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(Context context) {
        super(context);
        this.a = 0;
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        invalidate();
    }

    public void a(TextView textView, boolean z10) {
        te.c cVar = (te.c) this.c;
        CharSequence text = textView.getText();
        float measureText = (text != null ? textView.getPaint().measureText(text, 0, text.length()) : 0.0f) + org.telegram.messenger.g0.L(32.0f);
        if (z10 && cVar.f > 0.0f) {
            cVar.a(measureText);
        } else {
            cVar.c(measureText);
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f10;
        int i7;
        boolean z10;
        float f11;
        float f12;
        switch (this.a) {
            case 3:
                RectF rectF = (RectF) this.b;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.c;
                paint.setColor(-1);
                float width = getWidth() - (org.telegram.messenger.g0.N(5.0f) * 2.0f);
                hi.p5 p5Var = (hi.p5) this.d;
                float N = (width - org.telegram.messenger.g0.N((p5Var.b - 1) * 2)) / p5Var.b;
                float N2 = org.telegram.messenger.g0.N(5.0f);
                int i10 = 0;
                while (i10 < p5Var.b) {
                    rectF.set(N2, org.telegram.messenger.g0.N(8.0f), N2 + N, org.telegram.messenger.g0.N(10.0f));
                    paint.setAlpha(i10 < p5Var.b + (-1) ? ls.e4 : 133);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(1.0f), org.telegram.messenger.g0.N(1.0f), paint);
                    N2 += org.telegram.messenger.g0.N(2.0f) + N;
                    i10++;
                }
                break;
            case 8:
                Paint paint2 = (Paint) this.c;
                org.telegram.ui.ActionBar.m6.n(paint2);
                paint2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, ((org.telegram.ui.Components.y8) this.d).getResourceProvider()));
                paint2.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.b;
                path.rewind();
                path.addRoundRect(rectF2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint2);
                super.dispatchDraw(canvas);
                break;
            case 10:
                z11 z11Var = (z11) this.d;
                org.telegram.ui.Components.n6 n6Var = z11Var.f;
                float i11 = n6Var.i();
                int i12 = (i11 > 0.0f ? 1 : (i11 == 0.0f ? 0 : -1));
                boolean z11 = i12 > 0;
                float T1 = org.telegram.messenger.g0.T1(0.5f, 1.0f, i11) * z11Var.M;
                float L = org.telegram.messenger.g0.L(10.0f);
                float L2 = org.telegram.messenger.g0.L(8.33f);
                float width2 = (getWidth() / 2.0f) + org.telegram.messenger.g0.L(12.0f);
                float L3 = org.telegram.messenger.g0.L(12.0f);
                float max = Math.max(L2 + L2, n6Var.c() + org.telegram.messenger.g0.L(10.0f));
                if (z11) {
                    i7 = i12;
                    f11 = width2;
                    z10 = z11;
                    f12 = L3;
                    f10 = L2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), ls.e4, 31);
                } else {
                    f10 = L2;
                    i7 = i12;
                    z10 = z11;
                    f11 = width2;
                    f12 = L3;
                }
                super.dispatchDraw(canvas);
                if (z10) {
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    float f13 = max / 2.0f;
                    rectF3.set((f11 - f13) - org.telegram.messenger.g0.L(1.33f), f12 - L, f13 + f11 + org.telegram.messenger.g0.L(1.33f), f12 + L);
                    org.telegram.messenger.g0.i3(rectF3, i11, rectF3.centerX(), rectF3.centerY());
                    float f14 = L * i11;
                    canvas.drawRoundRect(rectF3, f14, f14, (Paint) this.b);
                    canvas.restore();
                }
                if (i7 > 0) {
                    canvas.save();
                    canvas.scale(T1, T1, f11, f12);
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    float f15 = max / 2.0f;
                    rectF4.set(f11 - f15, f12 - f10, f11 + f15, f12 + f10);
                    org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.c;
                    h6Var.setColor(org.telegram.ui.ActionBar.m6.r1(i11, h6Var.b.a(org.telegram.ui.ActionBar.m6.w0(z11Var.G, h6Var.a), false)));
                    canvas.drawRoundRect(rectF4, f10, f10, h6Var);
                    n6Var.p(rectF4);
                    n6Var.C = (int) (i11 * 255.0f);
                    n6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 11:
                Paint paint3 = (Paint) this.c;
                z40 z40Var = (z40) this.d;
                paint3.setColor(z40Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF5 = (RectF) this.b;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF5.offset(0.0f, getTop());
                z40.f0(z40Var, canvas, rectF5, paint3);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 6:
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
            case 12:
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
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 1:
                Paint paint = (Paint) this.b;
                if (((kb) this.d).e > 1) {
                    paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, (org.telegram.ui.ActionBar.h6) this.c));
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-org.telegram.messenger.g0.L(1.66f), -org.telegram.messenger.g0.L(1.66f));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), paint);
                }
                return super.drawChild(canvas, view, j3);
            case 4:
                bg.d0 d0Var = (bg.d0) this.b;
                bg.d0 d0Var2 = (bg.d0) this.c;
                boolean drawChild = super.drawChild(canvas, view, j3);
                li.p pVar = (li.p) this.d;
                if (view == pVar.e) {
                    int i7 = org.telegram.ui.ActionBar.m6.a7;
                    d0Var.b(pVar.getThemedColor(i7));
                    d0Var.setBounds(0, 0, getWidth(), org.telegram.messenger.g0.m);
                    d0Var.draw(canvas);
                    float R0 = org.telegram.messenger.g0.R0(org.telegram.messenger.g0.n);
                    if (R0 > 0.0f) {
                        d0Var2.setAlpha((int) (R0 * 255.0f));
                        d0Var2.b(pVar.getThemedColor(i7));
                        d0Var2.setBounds(0, getHeight() - org.telegram.messenger.g0.n, getWidth(), getHeight());
                        d0Var2.draw(canvas);
                    }
                }
                return drawChild;
            case 13:
                tg.j2 j2Var = ((tg.l2) this.d).f;
                if (view != j2Var) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.translate(((org.telegram.ui.Components.d6) this.b).e(false, view.getX()), ((org.telegram.ui.Components.d6) this.c).e(false, view.getY()));
                j2Var.a(canvas);
                canvas.restore();
                return true;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 6:
                float min = Math.min(((te.c) this.c).f, getWidth() - org.telegram.messenger.g0.L(24.0f));
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                RectF rectF = (RectF) this.d;
                float f10 = min / 2.0f;
                rectF.set(width - f10, height - (org.telegram.messenger.g0.L(38.0f) / 2.0f), width + f10, (org.telegram.messenger.g0.L(38.0f) / 2.0f) + height);
                int L = org.telegram.messenger.g0.L(6.0f);
                fh.g gVar = (fh.g) this.b;
                gVar.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                gVar.draw(canvas);
                break;
            case 7:
                super.onDraw(canvas);
                Paint paint = (Paint) this.c;
                paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.p7, false));
                canvas.save();
                float measuredWidth = getMeasuredWidth();
                TextPaint textPaint = (TextPaint) this.d;
                canvas.translate((measuredWidth - textPaint.measureText("500")) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.N(7.0f));
                RectF rectF2 = (RectF) this.b;
                rectF2.set(0.0f, 0.0f, textPaint.measureText("500"), textPaint.getTextSize());
                rectF2.inset(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(3.0f));
                float textSize = (textPaint.getTextSize() / 2.0f) + org.telegram.messenger.g0.L(3.0f);
                canvas.drawRoundRect(rectF2, textSize, textSize, paint);
                canvas.drawText("500", 0.0f, textPaint.getTextSize() - org.telegram.messenger.g0.N(2.0f), textPaint);
                canvas.restore();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 12:
                super.onMeasure(i7, i10);
                Path path = (Path) this.b;
                path.rewind();
                RectF rectF = (RectF) this.c;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), Path.Direction.CW);
                tg.j2 j2Var = ((tg.l2) this.d).f;
                if (j2Var != null) {
                    j2Var.setMaxWidth(getMeasuredWidth() - org.telegram.messenger.g0.L(32.0f));
                    break;
                }
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 10:
                return ((z11) this.d).f == drawable || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context);
        this.a = 5;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.c = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        addView(q9Var, c8.ma.d(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z10) {
            addView(new mi.a(context, h6Var), c8.ma.b(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.b = textView;
        o10.p(textView, 1, 16.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, h6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, c8.ma.d(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.z6, h6Var);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, c8.ma.d(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(hi.p5 p5Var, Context context) {
        super(context);
        this.a = 3;
        this.d = p5Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.a = 7;
        this.c = paint;
        this.d = textPaint;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(tg.l2 l2Var, Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 13:
                this.d = l2Var;
                super(context);
                nr nrVar = nr.h;
                this.b = new org.telegram.ui.Components.d6(this, 0L, 350L, nrVar);
                this.c = new org.telegram.ui.Components.d6(this, 0L, 350L, nrVar);
                break;
            default:
                this.d = l2Var;
                this.b = new Path();
                this.c = new RectF();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(li.p pVar, Context context) {
        super(context);
        this.a = 4;
        this.d = pVar;
        this.b = new bg.d0(2);
        this.c = new bg.d0(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(fi.n5 n5Var, Context context) {
        super(context);
        this.a = 2;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.Fi, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ma.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, n5Var.J0);
        textView.setTextSize(1, 14.0f);
        addView(textView, c8.ma.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.y6, n5Var.J0);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, c8.ma.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    @Override // te.b
    public /* synthetic */ void D(float f10, int i7) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(org.telegram.ui.Components.y8 y8Var, Activity activity) {
        super(activity);
        this.a = 8;
        this.d = y8Var;
        this.b = new Path();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(g80 g80Var, Context context) {
        super(context);
        this.a = 9;
        this.d = g80Var;
        e80 e80Var = new e80(this, context);
        this.c = e80Var;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
        addView(g10, c8.ma.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        g10.addView(e80Var, c8.ma.o(-2, -1));
        g10.addView(textView, c8.ma.r(-2, -2, 16));
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        e80Var.a(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(org.telegram.ui.i8 i8Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.h6 h6Var;
        this.a = 6;
        this.c = new te.c(0, this, nr.h, 350L, 0.0f);
        this.d = new RectF();
        setWillNotDraw(false);
        fh.g c10 = i8Var.getBaseSimpleGlass().c.c(this, null, false);
        h6Var = ((org.telegram.ui.ActionBar.g2) i8Var).resourceProvider;
        c10.p(c8.i0.m(h6Var));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        c10.r(org.telegram.messenger.g0.L(19.0f));
        this.b = c10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(z40 z40Var, Context context) {
        super(context);
        this.a = 11;
        this.d = z40Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(z11 z11Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.a = 10;
        this.d = z11Var;
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new org.telegram.ui.Components.h6(this, h6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        z11Var.f.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(kb kbVar, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.a = 1;
        this.d = kbVar;
        this.c = h6Var;
        this.b = new Paint(1);
    }
}
