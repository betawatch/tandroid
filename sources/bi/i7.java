package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
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
import org.telegram.messenger.yh;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.x31;
import org.telegram.ui.j70;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class i7 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.a = 3;
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.d = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(z9Var, w7.a6.a(46.0f, 21.0f, 6.0f, 0.0f, 6.0f, 46, 19));
        if (z10) {
            addView(new hi.a(context, c6Var), w7.a6.c(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.b = textView;
        yh.k(16.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.j5, c6Var));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, w7.a6.a(-2.0f, 80.0f, 7.0f, 0.0f, 0.0f, -1, 51));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.z6, c6Var));
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, w7.a6.a(-2.0f, 80.0f, 30.33f, 0.0f, 0.0f, -1, 51));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        float f10;
        switch (this.a) {
            case 1:
                RectF rectF = (RectF) this.b;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.c;
                paint.setColor(-1);
                float width = getWidth() - (AndroidUtilities.dpf2(5.0f) * 2.0f);
                di.t6 t6Var = (di.t6) this.d;
                float dpf2 = (width - AndroidUtilities.dpf2((t6Var.b - 1) * 2)) / t6Var.b;
                float dpf22 = AndroidUtilities.dpf2(5.0f);
                int i11 = 0;
                while (i11 < t6Var.b) {
                    rectF.set(dpf22, AndroidUtilities.dpf2(8.0f), dpf22 + dpf2, AndroidUtilities.dpf2(10.0f));
                    paint.setAlpha(i11 < t6Var.b + (-1) ? 255 : 133);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(1.0f), paint);
                    dpf22 += AndroidUtilities.dpf2(2.0f) + dpf2;
                    i11++;
                }
                break;
            case 2:
            case 3:
            case 4:
            case 6:
            default:
                super.dispatchDraw(canvas);
                break;
            case 5:
                Paint paint2 = (Paint) this.c;
                org.telegram.ui.ActionBar.g6.m(paint2);
                paint2.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G8, ((org.telegram.ui.Components.h9) this.d).getResourceProvider()));
                paint2.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.b;
                path.rewind();
                path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint2);
                super.dispatchDraw(canvas);
                break;
            case 7:
                x31 x31Var = (x31) this.d;
                float i12 = x31Var.f.i();
                int i13 = (i12 > 0.0f ? 1 : (i12 == 0.0f ? 0 : -1));
                boolean z10 = i13 > 0;
                float lerp = AndroidUtilities.lerp(0.5f, 1.0f, i12) * x31Var.K;
                float dp = AndroidUtilities.dp(10.0f);
                float dp2 = AndroidUtilities.dp(8.33f);
                float width2 = (getWidth() / 2.0f) + AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(12.0f);
                float max = Math.max(dp2 + dp2, x31Var.f.c() + AndroidUtilities.dp(10.0f));
                if (z10) {
                    i10 = i13;
                    f10 = dp3;
                    f7 = width2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                } else {
                    f7 = width2;
                    i10 = i13;
                    f10 = dp3;
                }
                super.dispatchDraw(canvas);
                if (z10) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f11 = max / 2.0f;
                    rectF3.set((f7 - f11) - AndroidUtilities.dp(1.33f), f10 - dp, f11 + f7 + AndroidUtilities.dp(1.33f), f10 + dp);
                    AndroidUtilities.scaleRect(rectF3, i12);
                    float f12 = dp * i12;
                    canvas.drawRoundRect(rectF3, f12, f12, (Paint) this.b);
                    canvas.restore();
                }
                if (i10 > 0) {
                    canvas.save();
                    canvas.scale(lerp, lerp, f7, f10);
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f13 = max / 2.0f;
                    rectF4.set(f7 - f13, f10 - dp2, f7 + f13, f10 + dp2);
                    org.telegram.ui.Components.k6 k6Var = (org.telegram.ui.Components.k6) this.c;
                    k6Var.setColor(org.telegram.ui.ActionBar.g6.m1(i12, k6Var.b.a(org.telegram.ui.ActionBar.g6.w0(x31Var.E, k6Var.a), false)));
                    canvas.drawRoundRect(rectF4, dp2, dp2, k6Var);
                    x31Var.f.p(rectF4);
                    org.telegram.ui.Components.r6 r6Var = x31Var.f;
                    r6Var.B = (int) (i12 * 255.0f);
                    r6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 8:
                Paint paint3 = (Paint) this.c;
                j70 j70Var = (j70) this.d;
                paint3.setColor(j70Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF5 = (RectF) this.b;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF5.offset(0.0f, getTop());
                j70.a0(j70Var, canvas, rectF5, paint3);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 9:
                int save = canvas.save();
                canvas.concat((Matrix) this.b);
                Path path2 = (Path) this.c;
                w7.j6.a(path2, getWidth(), getHeight());
                canvas.clipPath(path2);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(save);
                break;
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
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
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 2:
                zf.z zVar = (zf.z) this.b;
                zf.z zVar2 = (zf.z) this.c;
                boolean drawChild = super.drawChild(canvas, view, j10);
                gi.p pVar = (gi.p) this.d;
                if (view == pVar.d) {
                    int i10 = org.telegram.ui.ActionBar.g6.a7;
                    zVar.b(pVar.getThemedColor(i10));
                    zVar.setBounds(0, 0, getWidth(), AndroidUtilities.statusBarHeight);
                    zVar.draw(canvas);
                    float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(AndroidUtilities.navigationBarHeight);
                    if (navigationBarThirdButtonsFactor > 0.0f) {
                        zVar2.setAlpha((int) (navigationBarThirdButtonsFactor * 255.0f));
                        zVar2.b(pVar.getThemedColor(i10));
                        zVar2.setBounds(0, getHeight() - AndroidUtilities.navigationBarHeight, getWidth(), getHeight());
                        zVar2.draw(canvas);
                    }
                }
                return drawChild;
            case 11:
                rg.t2 t2Var = ((rg.v2) this.d).f;
                if (view != t2Var) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.translate(((org.telegram.ui.Components.g6) this.b).d(view.getX(), false), ((org.telegram.ui.Components.g6) this.c).d(view.getY(), false));
                t2Var.a(canvas);
                canvas.restore();
                return true;
            case 13:
                Paint paint = (Paint) this.b;
                if (((zh.j7) this.d).e > 1) {
                    paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, (org.telegram.ui.ActionBar.c6) this.c));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-AndroidUtilities.dp(1.66f), -AndroidUtilities.dp(1.66f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 4:
                super.onDraw(canvas);
                Paint paint = (Paint) this.c;
                paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.p7, false));
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
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 10:
                super.onMeasure(i10, i11);
                Path path = (Path) this.b;
                path.rewind();
                RectF rectF = (RectF) this.c;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                rg.t2 t2Var = ((rg.v2) this.d).f;
                if (t2Var != null) {
                    t2Var.setMaxWidth(getMeasuredWidth() - AndroidUtilities.dp(32.0f));
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
            case 7:
                return ((x31) this.d).f == drawable || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(di.t6 t6Var, Context context) {
        super(context);
        this.a = 1;
        this.d = t6Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.a = 4;
        this.c = paint;
        this.d = textPaint;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(rg.v2 v2Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 11:
                this.d = v2Var;
                super(context);
                es esVar = es.h;
                this.b = new org.telegram.ui.Components.g6(this, 0L, 350L, esVar);
                this.c = new org.telegram.ui.Components.g6(this, 0L, 350L, esVar);
                break;
            default:
                this.d = v2Var;
                this.b = new Path();
                this.c = new RectF();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(gi.p pVar, Context context) {
        super(context);
        this.a = 2;
        this.d = pVar;
        this.b = new zf.z(2);
        this.c = new zf.z(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(j7 j7Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        this.a = 0;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Oh, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.a6.a(28.0f, 25.0f, 12.0f, 16.0f, 0.0f, 28, 0));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        c6Var = ((org.telegram.ui.ActionBar.e3) j7Var).resourcesProvider;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.a6.a(-2.0f, 68.0f, 8.0f, 16.0f, 0.0f, -1, 0));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        int i11 = org.telegram.ui.ActionBar.g6.y6;
        c6Var2 = ((org.telegram.ui.ActionBar.e3) j7Var).resourcesProvider;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var2));
        textView2.setTextSize(1, 14.0f);
        addView(textView2, w7.a6.a(-2.0f, 68.0f, 28.0f, 16.0f, 8.0f, -1, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(org.telegram.ui.Components.h9 h9Var, Activity activity) {
        super(activity);
        this.a = 5;
        this.d = h9Var;
        this.b = new Path();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 12:
                super(context);
                break;
            default:
                this.b = new Matrix();
                this.c = new Path();
                this.d = new float[8];
                setClipChildren(false);
                setClipToPadding(false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(w90 w90Var, Context context) {
        super(context);
        this.a = 6;
        this.d = w90Var;
        u90 u90Var = new u90(this, context);
        this.c = u90Var;
        LinearLayout e = yh.e(context, 0);
        addView(e, w7.a6.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        e.addView(u90Var, w7.a6.n(-2, -1));
        e.addView(textView, w7.a6.q(-2, -2, 16));
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        u90Var.a(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(j70 j70Var, Context context) {
        super(context);
        this.a = 8;
        this.d = j70Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(x31 x31Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.a = 7;
        this.d = x31Var;
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new org.telegram.ui.Components.k6(this, c6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        x31Var.f.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(zh.j7 j7Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.a = 13;
        this.d = j7Var;
        this.c = c6Var;
        this.b = new Paint(1);
    }
}
