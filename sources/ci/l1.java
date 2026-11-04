package ci;

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
import b8.cd;
import b8.mf;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.r40;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l1 extends FrameLayout implements qe.b {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(Context context) {
        super(context);
        this.a = 0;
    }

    @Override // qe.b
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        invalidate();
    }

    public void a(TextView textView, boolean z10) {
        qe.c cVar = (qe.c) this.c;
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
        int i3;
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
                gi.r5 r5Var = (gi.r5) this.d;
                float N = (width - org.telegram.messenger.g0.N((r5Var.b - 1) * 2)) / r5Var.b;
                float N2 = org.telegram.messenger.g0.N(5.0f);
                int i10 = 0;
                while (i10 < r5Var.b) {
                    rectF.set(N2, org.telegram.messenger.g0.N(8.0f), N2 + N, org.telegram.messenger.g0.N(10.0f));
                    paint.setAlpha(i10 < r5Var.b + (-1) ? hs.e4 : 133);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(1.0f), org.telegram.messenger.g0.N(1.0f), paint);
                    N2 += org.telegram.messenger.g0.N(2.0f) + N;
                    i10++;
                }
                break;
            case 8:
                Paint paint2 = (Paint) this.c;
                org.telegram.ui.ActionBar.k6.n(paint2);
                paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, ((org.telegram.ui.Components.r8) this.d).getResourceProvider()));
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
                f11 f11Var = (f11) this.d;
                org.telegram.ui.Components.g6 g6Var = f11Var.f;
                float i11 = g6Var.i();
                int i12 = (i11 > 0.0f ? 1 : (i11 == 0.0f ? 0 : -1));
                boolean z11 = i12 > 0;
                float T1 = org.telegram.messenger.g0.T1(0.5f, 1.0f, i11) * f11Var.M;
                float L = org.telegram.messenger.g0.L(10.0f);
                float L2 = org.telegram.messenger.g0.L(8.33f);
                float width2 = (getWidth() / 2.0f) + org.telegram.messenger.g0.L(12.0f);
                float L3 = org.telegram.messenger.g0.L(12.0f);
                float max = Math.max(L2 + L2, g6Var.c() + org.telegram.messenger.g0.L(10.0f));
                if (z11) {
                    i3 = i12;
                    f11 = width2;
                    z10 = z11;
                    f12 = L3;
                    f10 = L2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), hs.e4, 31);
                } else {
                    f10 = L2;
                    i3 = i12;
                    z10 = z11;
                    f11 = width2;
                    f12 = L3;
                }
                super.dispatchDraw(canvas);
                if (z10) {
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    float f13 = max / 2.0f;
                    rectF3.set((f11 - f13) - org.telegram.messenger.g0.L(1.33f), f12 - L, f13 + f11 + org.telegram.messenger.g0.L(1.33f), f12 + L);
                    org.telegram.messenger.g0.j3(rectF3, i11, rectF3.centerX(), rectF3.centerY());
                    float f14 = L * i11;
                    canvas.drawRoundRect(rectF3, f14, f14, (Paint) this.b);
                    canvas.restore();
                }
                if (i3 > 0) {
                    canvas.save();
                    canvas.scale(T1, T1, f11, f12);
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    float f15 = max / 2.0f;
                    rectF4.set(f11 - f15, f12 - f10, f11 + f15, f12 + f10);
                    org.telegram.ui.Components.z5 z5Var = (org.telegram.ui.Components.z5) this.c;
                    z5Var.setColor(org.telegram.ui.ActionBar.k6.r1(i11, z5Var.b.a(org.telegram.ui.ActionBar.k6.w0(f11Var.G, z5Var.a), false)));
                    canvas.drawRoundRect(rectF4, f10, f10, z5Var);
                    g6Var.p(rectF4);
                    g6Var.B = (int) (i11 * 255.0f);
                    g6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 11:
                Paint paint3 = (Paint) this.c;
                r40 r40Var = (r40) this.d;
                paint3.setColor(r40Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF5 = (RectF) this.b;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF5.offset(0.0f, getTop());
                r40.f0(r40Var, canvas, rectF5, paint3);
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
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 1:
                Paint paint = (Paint) this.b;
                if (((rb) this.d).e > 1) {
                    paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, (org.telegram.ui.ActionBar.e6) this.c));
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-org.telegram.messenger.g0.L(1.66f), -org.telegram.messenger.g0.L(1.66f));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), paint);
                }
                return super.drawChild(canvas, view, j10);
            case 4:
                cg.b0 b0Var = (cg.b0) this.b;
                cg.b0 b0Var2 = (cg.b0) this.c;
                boolean drawChild = super.drawChild(canvas, view, j10);
                ji.n nVar = (ji.n) this.d;
                if (view == nVar.e) {
                    int i3 = org.telegram.ui.ActionBar.k6.a7;
                    b0Var.b(nVar.getThemedColor(i3));
                    b0Var.setBounds(0, 0, getWidth(), org.telegram.messenger.g0.m);
                    b0Var.draw(canvas);
                    float R0 = org.telegram.messenger.g0.R0(org.telegram.messenger.g0.n);
                    if (R0 > 0.0f) {
                        b0Var2.setAlpha((int) (R0 * 255.0f));
                        b0Var2.b(nVar.getThemedColor(i3));
                        b0Var2.setBounds(0, getHeight() - org.telegram.messenger.g0.n, getWidth(), getHeight());
                        b0Var2.draw(canvas);
                    }
                }
                return drawChild;
            case 13:
                ug.h2 h2Var = ((ug.j2) this.d).f;
                if (view != h2Var) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.translate(((org.telegram.ui.Components.u5) this.b).e(false, view.getX()), ((org.telegram.ui.Components.u5) this.c).e(false, view.getY()));
                h2Var.a(canvas);
                canvas.restore();
                return true;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 6:
                float min = Math.min(((qe.c) this.c).f, getWidth() - org.telegram.messenger.g0.L(24.0f));
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                RectF rectF = (RectF) this.d;
                float f10 = min / 2.0f;
                rectF.set(width - f10, height - (org.telegram.messenger.g0.L(38.0f) / 2.0f), width + f10, (org.telegram.messenger.g0.L(38.0f) / 2.0f) + height);
                int L = org.telegram.messenger.g0.L(6.0f);
                gh.g gVar = (gh.g) this.b;
                gVar.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                gVar.draw(canvas);
                break;
            case 7:
                super.onDraw(canvas);
                Paint paint = (Paint) this.c;
                paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.p7, false));
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
    public void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 12:
                super.onMeasure(i3, i10);
                Path path = (Path) this.b;
                path.rewind();
                RectF rectF = (RectF) this.c;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), Path.Direction.CW);
                ug.h2 h2Var = ((ug.j2) this.d).f;
                if (h2Var != null) {
                    h2Var.setMaxWidth(getMeasuredWidth() - org.telegram.messenger.g0.L(32.0f));
                    break;
                }
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 10:
                return ((f11) this.d).f == drawable || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.a = 5;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.c = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        addView(k9Var, mf.d(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z10) {
            addView(new ki.a(context, e6Var), mf.b(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, e6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, mf.d(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.z6, e6Var);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, mf.d(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(gi.r5 r5Var, Context context) {
        super(context);
        this.a = 3;
        this.d = r5Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.a = 7;
        this.c = paint;
        this.d = textPaint;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(ug.j2 j2Var, Context context, int i3) {
        super(context);
        this.a = i3;
        switch (i3) {
            case 13:
                this.d = j2Var;
                super(context);
                xq xqVar = xq.h;
                this.b = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
                this.c = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
                break;
            default:
                this.d = j2Var;
                this.b = new Path();
                this.c = new RectF();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(ji.n nVar, Context context) {
        super(context);
        this.a = 4;
        this.d = nVar;
        this.b = new cg.b0(2);
        this.c = new cg.b0(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(ei.w5 w5Var, Context context) {
        super(context);
        this.a = 2;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Ci, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, mf.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, w5Var.J0);
        textView.setTextSize(1, 14.0f);
        addView(textView, mf.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.y6, w5Var.J0);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, mf.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    @Override // qe.b
    public /* synthetic */ void F(float f10, int i3) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(org.telegram.ui.Components.r8 r8Var, Activity activity) {
        super(activity);
        this.a = 8;
        this.d = r8Var;
        this.b = new Path();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(m70 m70Var, Context context) {
        super(context);
        this.a = 9;
        this.d = m70Var;
        k70 k70Var = new k70(this, context);
        this.c = k70Var;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        addView(f10, mf.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(k70Var, mf.o(-2, -1));
        f10.addView(textView, mf.r(-2, -2, 16));
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        k70Var.a(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(org.telegram.ui.i8 i8Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        this.a = 6;
        this.c = new qe.c(0, this, xq.h, 350L, 0.0f);
        this.d = new RectF();
        setWillNotDraw(false);
        gh.g c2 = i8Var.getBaseSimpleGlass().c.c(this, null, false);
        e6Var = ((org.telegram.ui.ActionBar.d2) i8Var).resourceProvider;
        c2.p(cd.m(e6Var));
        c2.q(org.telegram.messenger.g0.L(6.0f));
        c2.r(org.telegram.messenger.g0.L(19.0f));
        this.b = c2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(r40 r40Var, Context context) {
        super(context);
        this.a = 11;
        this.d = r40Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(f11 f11Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = 10;
        this.d = f11Var;
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new org.telegram.ui.Components.z5(this, e6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        f11Var.f.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(rb rbVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = 1;
        this.d = rbVar;
        this.c = e6Var;
        this.b = new Paint(1);
    }
}
