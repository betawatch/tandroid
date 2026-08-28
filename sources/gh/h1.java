package gh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ll;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.gr;
import org.telegram.ui.k60;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h1 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(Context context) {
        super(context);
        this.a = 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f10;
        int i9;
        float f11;
        switch (this.a) {
            case 3:
                RectF rectF = (RectF) this.b;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.c;
                paint.setColor(-1);
                float width = getWidth() - (AndroidUtilities.dpf2(5.0f) * 2.0f);
                kh.l6 l6Var = (kh.l6) this.d;
                float dpf2 = (width - AndroidUtilities.dpf2((l6Var.b - 1) * 2)) / l6Var.b;
                float dpf22 = AndroidUtilities.dpf2(5.0f);
                int i10 = 0;
                while (i10 < l6Var.b) {
                    rectF.set(dpf22, AndroidUtilities.dpf2(8.0f), dpf22 + dpf2, AndroidUtilities.dpf2(10.0f));
                    paint.setAlpha(i10 < l6Var.b + (-1) ? 255 : 133);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(1.0f), paint);
                    dpf22 += AndroidUtilities.dpf2(2.0f) + dpf2;
                    i10++;
                }
                break;
            case 7:
                Paint paint2 = (Paint) this.c;
                org.telegram.ui.ActionBar.f6.m(paint2);
                paint2.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, ((org.telegram.ui.Components.w8) this.d).getResourceProvider()));
                paint2.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.b;
                path.rewind();
                path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint2);
                super.dispatchDraw(canvas);
                break;
            case 9:
                a21 a21Var = (a21) this.d;
                float g10 = a21Var.f.g();
                int i11 = (g10 > 0.0f ? 1 : (g10 == 0.0f ? 0 : -1));
                boolean z10 = i11 > 0;
                float lerp = AndroidUtilities.lerp(0.5f, 1.0f, g10) * a21Var.G;
                float dp = AndroidUtilities.dp(10.0f);
                float dp2 = AndroidUtilities.dp(8.33f);
                float width2 = (getWidth() / 2.0f) + AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(12.0f);
                float max = Math.max(dp2 + dp2, a21Var.f.d() + AndroidUtilities.dp(10.0f));
                if (z10) {
                    i9 = i11;
                    f11 = dp3;
                    f10 = width2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                } else {
                    f10 = width2;
                    i9 = i11;
                    f11 = dp3;
                }
                super.dispatchDraw(canvas);
                if (z10) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f12 = max / 2.0f;
                    rectF3.set((f10 - f12) - AndroidUtilities.dp(1.33f), f11 - dp, f12 + f10 + AndroidUtilities.dp(1.33f), f11 + dp);
                    AndroidUtilities.scaleRect(rectF3, g10);
                    float f13 = dp * g10;
                    canvas.drawRoundRect(rectF3, f13, f13, (Paint) this.b);
                    canvas.restore();
                }
                if (i9 > 0) {
                    canvas.save();
                    canvas.scale(lerp, lerp, f10, f11);
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f14 = max / 2.0f;
                    rectF4.set(f10 - f14, f11 - dp2, f10 + f14, f11 + dp2);
                    org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) this.c;
                    c6Var.setColor(org.telegram.ui.ActionBar.f6.l1(g10, c6Var.b.a(org.telegram.ui.ActionBar.f6.v0(a21Var.A, c6Var.a), false)));
                    canvas.drawRoundRect(rectF4, dp2, dp2, c6Var);
                    a21Var.f.m(rectF4);
                    org.telegram.ui.Components.i6 i6Var = a21Var.f;
                    i6Var.w = (int) (g10 * 255.0f);
                    i6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 10:
                Paint paint3 = (Paint) this.c;
                k60 k60Var = (k60) this.d;
                paint3.setColor(k60Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF5 = (RectF) this.b;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF5.offset(0.0f, getTop());
                k60.Z(k60Var, canvas, rectF5, paint3);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 11:
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
                if (((ja) this.d).e > 1) {
                    paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, (org.telegram.ui.ActionBar.b6) this.c));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-AndroidUtilities.dp(1.66f), -AndroidUtilities.dp(1.66f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
                }
                return super.drawChild(canvas, view, j10);
            case 4:
                ff.c0 c0Var = (ff.c0) this.b;
                ff.c0 c0Var2 = (ff.c0) this.c;
                boolean drawChild = super.drawChild(canvas, view, j10);
                nh.o oVar = (nh.o) this.d;
                if (view == oVar.d) {
                    int i9 = org.telegram.ui.ActionBar.f6.a7;
                    c0Var.b(oVar.getThemedColor(i9));
                    c0Var.setBounds(0, 0, getWidth(), AndroidUtilities.statusBarHeight);
                    c0Var.draw(canvas);
                    float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(AndroidUtilities.navigationBarHeight);
                    if (navigationBarThirdButtonsFactor > 0.0f) {
                        c0Var2.setAlpha((int) (navigationBarThirdButtonsFactor * 255.0f));
                        c0Var2.b(oVar.getThemedColor(i9));
                        c0Var2.setBounds(0, getHeight() - AndroidUtilities.navigationBarHeight, getWidth(), getHeight());
                        c0Var2.draw(canvas);
                    }
                }
                return drawChild;
            case 12:
                yf.r2 r2Var = ((yf.t2) this.d).f;
                if (view != r2Var) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.translate(((org.telegram.ui.Components.y5) this.b).d(view.getX(), false), ((org.telegram.ui.Components.y5) this.c).d(view.getY(), false));
                r2Var.a(canvas);
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
                super.onDraw(canvas);
                Paint paint = (Paint) this.c;
                paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.p7, false));
                canvas.save();
                float measuredWidth = getMeasuredWidth();
                TextPaint textPaint = (TextPaint) this.d;
                canvas.translate((measuredWidth - textPaint.measureText("500")) - AndroidUtilities.dp(8.0f), AndroidUtilities.dpf2(7.0f));
                RectF rectF = (RectF) this.b;
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
    public void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 11:
                super.onMeasure(i9, i10);
                Path path = (Path) this.b;
                path.rewind();
                RectF rectF = (RectF) this.c;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                yf.r2 r2Var = ((yf.t2) this.d).f;
                if (r2Var != null) {
                    r2Var.setMaxWidth(getMeasuredWidth() - AndroidUtilities.dp(32.0f));
                    break;
                }
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 9:
                return ((a21) this.d).f == drawable || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        this.a = 5;
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.c = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(o9Var, g7.e6.d(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z10) {
            addView(new j5(context, b6Var), g7.e6.b(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.b = textView;
        ll.k(16.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.j5, b6Var));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, g7.e6.d(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.z6, b6Var));
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, g7.e6.d(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(kh.l6 l6Var, Context context) {
        super(context);
        this.a = 3;
        this.d = l6Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.a = 6;
        this.c = paint;
        this.d = textPaint;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(yf.t2 t2Var, Context context, int i9) {
        super(context);
        this.a = i9;
        switch (i9) {
            case 12:
                this.d = t2Var;
                super(context);
                gr grVar = gr.h;
                this.b = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
                this.c = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
                break;
            default:
                this.d = t2Var;
                this.b = new Path();
                this.c = new RectF();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(nh.o oVar, Context context) {
        super(context);
        this.a = 4;
        this.d = oVar;
        this.b = new ff.c0(2);
        this.c = new ff.c0(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(ih.s5 s5Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        this.a = 2;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, g7.e6.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        b6Var = ((org.telegram.ui.ActionBar.f3) s5Var).resourcesProvider;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        textView.setTextSize(1, 14.0f);
        addView(textView, g7.e6.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        int i10 = org.telegram.ui.ActionBar.f6.y6;
        b6Var2 = ((org.telegram.ui.ActionBar.f3) s5Var).resourcesProvider;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var2));
        textView2.setTextSize(1, 14.0f);
        addView(textView2, g7.e6.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(org.telegram.ui.Components.w8 w8Var, Activity activity) {
        super(activity);
        this.a = 7;
        this.d = w8Var;
        this.b = new Path();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(e80 e80Var, Context context) {
        super(context);
        this.a = 8;
        this.d = e80Var;
        c80 c80Var = new c80(this, context);
        this.c = c80Var;
        LinearLayout f10 = ll.f(context, 0);
        addView(f10, g7.e6.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        f10.addView(c80Var, g7.e6.n(-2, -1));
        f10.addView(textView, g7.e6.q(-2, -2, 16));
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        c80Var.a(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(k60 k60Var, Context context) {
        super(context);
        this.a = 10;
        this.d = k60Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(a21 a21Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.a = 9;
        this.d = a21Var;
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new org.telegram.ui.Components.c6(this, b6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        a21Var.f.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(ja jaVar, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.a = 1;
        this.d = jaVar;
        this.c = b6Var;
        this.b = new Paint(1);
    }
}
