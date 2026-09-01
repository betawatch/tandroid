package eg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.c6;
import mh.ea;
import oh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.w21;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.y80;
import org.telegram.ui.Components.z5;
import org.telegram.ui.z60;
import qh.f5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class t3 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(Context context) {
        super(context);
        this.a = 2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f10;
        int i10;
        float f11;
        switch (this.a) {
            case 6:
                Paint paint = (Paint) this.d;
                k6.m(paint);
                paint.setColor(k6.v0(k6.G8, ((w8) this.b).getResourceProvider()));
                paint.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.c;
                path.rewind();
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                break;
            case 7:
            default:
                super.dispatchDraw(canvas);
                break;
            case 8:
                w21 w21Var = (w21) this.b;
                float g10 = w21Var.f.g();
                int i11 = (g10 > 0.0f ? 1 : (g10 == 0.0f ? 0 : -1));
                boolean z4 = i11 > 0;
                float lerp = AndroidUtilities.lerp(0.5f, 1.0f, g10) * w21Var.H;
                float dp = AndroidUtilities.dp(10.0f);
                float dp2 = AndroidUtilities.dp(8.33f);
                float width = (getWidth() / 2.0f) + AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(12.0f);
                float max = Math.max(dp2 + dp2, w21Var.f.d() + AndroidUtilities.dp(10.0f));
                if (z4) {
                    i10 = i11;
                    f11 = dp3;
                    f10 = width;
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                } else {
                    f10 = width;
                    i10 = i11;
                    f11 = dp3;
                }
                super.dispatchDraw(canvas);
                if (z4) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f12 = max / 2.0f;
                    rectF2.set((f10 - f12) - AndroidUtilities.dp(1.33f), f11 - dp, f12 + f10 + AndroidUtilities.dp(1.33f), f11 + dp);
                    AndroidUtilities.scaleRect(rectF2, g10);
                    float f13 = dp * g10;
                    canvas.drawRoundRect(rectF2, f13, f13, (Paint) this.c);
                    canvas.restore();
                }
                if (i10 > 0) {
                    canvas.save();
                    canvas.scale(lerp, lerp, f10, f11);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f14 = max / 2.0f;
                    rectF3.set(f10 - f14, f11 - dp2, f10 + f14, f11 + dp2);
                    d6 d6Var = (d6) this.d;
                    d6Var.setColor(k6.l1(g10, d6Var.b.a(k6.v0(w21Var.B, d6Var.a), false)));
                    canvas.drawRoundRect(rectF3, dp2, dp2, d6Var);
                    w21Var.f.m(rectF3);
                    j6 j6Var = w21Var.f;
                    j6Var.w = (int) (g10 * 255.0f);
                    j6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 9:
                Paint paint2 = (Paint) this.c;
                z60 z60Var = (z60) this.b;
                paint2.setColor(z60Var.getThemedColor(k6.d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF4 = (RectF) this.d;
                rectF4.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF4.offset(0.0f, getTop());
                z60.a0(z60Var, canvas, rectF4, paint2);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 10:
                RectF rectF5 = (RectF) this.d;
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.c;
                paint3.setColor(-1);
                float width2 = getWidth() - (AndroidUtilities.dpf2(5.0f) * 2.0f);
                f5 f5Var = (f5) this.b;
                float dpf2 = (width2 - AndroidUtilities.dpf2((f5Var.b - 1) * 2)) / f5Var.b;
                float dpf22 = AndroidUtilities.dpf2(5.0f);
                int i12 = 0;
                while (i12 < f5Var.b) {
                    rectF5.set(dpf22, AndroidUtilities.dpf2(8.0f), dpf22 + dpf2, AndroidUtilities.dpf2(10.0f));
                    paint3.setAlpha(i12 < f5Var.b + (-1) ? 255 : 133);
                    canvas.drawRoundRect(rectF5, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(1.0f), paint3);
                    dpf22 += AndroidUtilities.dpf2(2.0f) + dpf2;
                    i12++;
                }
                break;
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
                u3 u3Var = ((w3) this.b).f;
                if (view != u3Var) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.translate(((z5) this.c).d(view.getX(), false), ((z5) this.d).d(view.getY(), false));
                u3Var.a(canvas);
                canvas.restore();
                return true;
            case 3:
                Paint paint = (Paint) this.c;
                if (((ea) this.b).e > 1) {
                    paint.setColor(k6.v0(k6.d6, (g6) this.d));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-AndroidUtilities.dp(1.66f), -AndroidUtilities.dp(1.66f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
                }
                return super.drawChild(canvas, view, j10);
            case 11:
                lf.b0 b0Var = (lf.b0) this.c;
                lf.b0 b0Var2 = (lf.b0) this.d;
                boolean drawChild = super.drawChild(canvas, view, j10);
                th.n nVar = (th.n) this.b;
                if (view == nVar.d) {
                    int i10 = k6.a7;
                    b0Var.b(nVar.getThemedColor(i10));
                    b0Var.setBounds(0, 0, getWidth(), AndroidUtilities.statusBarHeight);
                    b0Var.draw(canvas);
                    float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(AndroidUtilities.navigationBarHeight);
                    if (navigationBarThirdButtonsFactor > 0.0f) {
                        b0Var2.setAlpha((int) (navigationBarThirdButtonsFactor * 255.0f));
                        b0Var2.b(nVar.getThemedColor(i10));
                        b0Var2.setBounds(0, getHeight() - AndroidUtilities.navigationBarHeight, getWidth(), getHeight());
                        b0Var2.draw(canvas);
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
            case 5:
                super.onDraw(canvas);
                Paint paint = (Paint) this.c;
                paint.setColor(k6.w0(null, k6.p7, false));
                canvas.save();
                float measuredWidth = getMeasuredWidth();
                TextPaint textPaint = (TextPaint) this.b;
                canvas.translate((measuredWidth - textPaint.measureText("500")) - AndroidUtilities.dp(8.0f), AndroidUtilities.dpf2(7.0f));
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, textPaint.measureText("500"), textPaint.getTextSize());
                rectF.inset(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(3.0f));
                float textSize = (textPaint.getTextSize() / 2.0f) + AndroidUtilities.dp(3.0f);
                canvas.drawRoundRect(rectF, textSize, textSize, paint);
                canvas.drawText("500", 0.0f, textPaint.getTextSize() - AndroidUtilities.dpf2(2.0f), textPaint);
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
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                u3 u3Var = ((w3) this.b).f;
                if (u3Var != null) {
                    u3Var.setMaxWidth(getMeasuredWidth() - AndroidUtilities.dp(32.0f));
                    break;
                }
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 8:
                return ((w21) this.b).f == drawable || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(Context context, g6 g6Var, boolean z4) {
        super(context);
        this.a = 12;
        p9 p9Var = new p9(context);
        this.c = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(p9Var, c6.d(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z4) {
            addView(new mh.f5(context, g6Var), c6.b(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.ui.b.g(16.0f, 1, textView);
        textView.setTextColor(k6.v0(k6.j5, g6Var));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, c6.d(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(k6.v0(k6.z6, g6Var));
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, c6.d(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(f5 f5Var, Context context) {
        super(context);
        this.a = 10;
        this.b = f5Var;
        this.d = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.a = 5;
        this.c = paint;
        this.b = textPaint;
        this.d = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(w3 w3Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = w3Var;
                super(context);
                pr prVar = pr.h;
                this.c = new z5(this, 0L, 350L, prVar);
                this.d = new z5(this, 0L, 350L, prVar);
                break;
            default:
                this.b = w3Var;
                this.c = new Path();
                this.d = new RectF();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(th.n nVar, Context context) {
        super(context);
        this.a = 11;
        this.b = nVar;
        this.c = new lf.b0(2);
        this.d = new lf.b0(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(r5 r5Var, Context context) {
        super(context);
        g6 g6Var;
        g6 g6Var2;
        this.a = 4;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(k6.w0(null, k6.Oh, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, c6.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i10 = k6.G6;
        g6Var = ((org.telegram.ui.ActionBar.h3) r5Var).resourcesProvider;
        textView.setTextColor(k6.v0(i10, g6Var));
        textView.setTextSize(1, 14.0f);
        addView(textView, c6.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        int i11 = k6.y6;
        g6Var2 = ((org.telegram.ui.ActionBar.h3) r5Var).resourcesProvider;
        textView2.setTextColor(k6.v0(i11, g6Var2));
        textView2.setTextSize(1, 14.0f);
        addView(textView2, c6.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(w8 w8Var, Activity activity) {
        super(activity);
        this.a = 6;
        this.b = w8Var;
        this.c = new Path();
        this.d = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(y80 y80Var, Context context) {
        super(context);
        this.a = 7;
        this.b = y80Var;
        w80 w80Var = new w80(this, context);
        this.d = w80Var;
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 0);
        addView(f10, c6.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        f10.addView(w80Var, c6.n(-2, -1));
        f10.addView(textView, c6.q(-2, -2, 16));
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        w80Var.a(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(z60 z60Var, Context context) {
        super(context);
        this.a = 9;
        this.b = z60Var;
        this.d = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(w21 w21Var, Context context, g6 g6Var) {
        super(context);
        this.a = 8;
        this.b = w21Var;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new d6(this, g6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        w21Var.f.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(ea eaVar, Context context, g6 g6Var) {
        super(context);
        this.a = 3;
        this.b = eaVar;
        this.d = g6Var;
        this.c = new Paint(1);
    }
}
