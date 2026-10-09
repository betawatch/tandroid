package ai;

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
import org.telegram.messenger.bi;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.x90;
import org.telegram.ui.c70;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class x7 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.a = 3;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.d = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(y9Var, w7.x5.a(46.0f, 21.0f, 6.0f, 0.0f, 6.0f, 46, 19));
        if (z10) {
            addView(new gi.a(context, e6Var), w7.x5.c(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.b = textView;
        bi.k(16.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.j5, e6Var));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, w7.x5.a(-2.0f, 80.0f, 7.0f, 0.0f, 0.0f, -1, 51));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.z6, e6Var));
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, w7.x5.a(-2.0f, 80.0f, 30.33f, 0.0f, 0.0f, -1, 51));
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
                ci.v6 v6Var = (ci.v6) this.d;
                float dpf2 = (width - AndroidUtilities.dpf2((v6Var.b - 1) * 2)) / v6Var.b;
                float dpf22 = AndroidUtilities.dpf2(5.0f);
                int i11 = 0;
                while (i11 < v6Var.b) {
                    rectF.set(dpf22, AndroidUtilities.dpf2(8.0f), dpf22 + dpf2, AndroidUtilities.dpf2(10.0f));
                    paint.setAlpha(i11 < v6Var.b + (-1) ? 255 : 133);
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
                org.telegram.ui.ActionBar.i6.m(paint2);
                paint2.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G8, ((org.telegram.ui.Components.g9) this.d).getResourceProvider()));
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
                b41 b41Var = (b41) this.d;
                float i12 = b41Var.f.i();
                int i13 = (i12 > 0.0f ? 1 : (i12 == 0.0f ? 0 : -1));
                boolean z10 = i13 > 0;
                float lerp = AndroidUtilities.lerp(0.5f, 1.0f, i12) * b41Var.K;
                float dp = AndroidUtilities.dp(10.0f);
                float dp2 = AndroidUtilities.dp(8.33f);
                float width2 = (getWidth() / 2.0f) + AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(12.0f);
                float max = Math.max(dp2 + dp2, b41Var.f.c() + AndroidUtilities.dp(10.0f));
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
                    k6Var.setColor(org.telegram.ui.ActionBar.i6.m1(i12, k6Var.b.a(org.telegram.ui.ActionBar.i6.w0(b41Var.E, k6Var.a), false)));
                    canvas.drawRoundRect(rectF4, dp2, dp2, k6Var);
                    b41Var.f.p(rectF4);
                    org.telegram.ui.Components.q6 q6Var = b41Var.f;
                    q6Var.B = (int) (i12 * 255.0f);
                    q6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 8:
                Paint paint3 = (Paint) this.c;
                c70 c70Var = (c70) this.d;
                paint3.setColor(c70Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF5 = (RectF) this.b;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF5.offset(0.0f, getTop());
                c70.a0(c70Var, canvas, rectF5, paint3);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 9:
                int save = canvas.save();
                canvas.concat((Matrix) this.b);
                Path path2 = (Path) this.c;
                w7.g6.a(path2, getWidth(), getHeight());
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
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 2:
                yf.y yVar = (yf.y) this.b;
                yf.y yVar2 = (yf.y) this.c;
                boolean drawChild = super.drawChild(canvas, view, j3);
                fi.p pVar = (fi.p) this.d;
                if (view == pVar.d) {
                    int i10 = org.telegram.ui.ActionBar.i6.a7;
                    yVar.b(pVar.getThemedColor(i10));
                    yVar.setBounds(0, 0, getWidth(), AndroidUtilities.statusBarHeight);
                    yVar.draw(canvas);
                    float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(AndroidUtilities.navigationBarHeight);
                    if (navigationBarThirdButtonsFactor > 0.0f) {
                        yVar2.setAlpha((int) (navigationBarThirdButtonsFactor * 255.0f));
                        yVar2.b(pVar.getThemedColor(i10));
                        yVar2.setBounds(0, getHeight() - AndroidUtilities.navigationBarHeight, getWidth(), getHeight());
                        yVar2.draw(canvas);
                    }
                }
                return drawChild;
            case 11:
                qg.s2 s2Var = ((qg.u2) this.d).f;
                if (view != s2Var) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.translate(((org.telegram.ui.Components.g6) this.b).d(view.getX(), false), ((org.telegram.ui.Components.g6) this.c).d(view.getY(), false));
                s2Var.a(canvas);
                canvas.restore();
                return true;
            case 13:
                Paint paint = (Paint) this.b;
                if (((yh.j7) this.d).e > 1) {
                    paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, (org.telegram.ui.ActionBar.e6) this.c));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-AndroidUtilities.dp(1.66f), -AndroidUtilities.dp(1.66f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 4:
                super.onDraw(canvas);
                Paint paint = (Paint) this.c;
                paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.p7, false));
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
                qg.s2 s2Var = ((qg.u2) this.d).f;
                if (s2Var != null) {
                    s2Var.setMaxWidth(getMeasuredWidth() - AndroidUtilities.dp(32.0f));
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
                return ((b41) this.d).f == drawable || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(ci.v6 v6Var, Context context) {
        super(context);
        this.a = 1;
        this.d = v6Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.a = 4;
        this.c = paint;
        this.d = textPaint;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(qg.u2 u2Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 11:
                this.d = u2Var;
                super(context);
                hs hsVar = hs.h;
                this.b = new org.telegram.ui.Components.g6(this, 0L, 350L, hsVar);
                this.c = new org.telegram.ui.Components.g6(this, 0L, 350L, hsVar);
                break;
            default:
                this.d = u2Var;
                this.b = new Path();
                this.c = new RectF();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(fi.p pVar, Context context) {
        super(context);
        this.a = 2;
        this.d = pVar;
        this.b = new yf.y(2);
        this.c = new yf.y(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(y7 y7Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        this.a = 0;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.x5.a(28.0f, 25.0f, 12.0f, 16.0f, 0.0f, 28, 0));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        e6Var = ((org.telegram.ui.ActionBar.f3) y7Var).resourcesProvider;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.x5.a(-2.0f, 68.0f, 8.0f, 16.0f, 0.0f, -1, 0));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        int i11 = org.telegram.ui.ActionBar.i6.y6;
        e6Var2 = ((org.telegram.ui.ActionBar.f3) y7Var).resourcesProvider;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var2));
        textView2.setTextSize(1, 14.0f);
        addView(textView2, w7.x5.a(-2.0f, 68.0f, 28.0f, 16.0f, 8.0f, -1, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(org.telegram.ui.Components.g9 g9Var, Activity activity) {
        super(activity);
        this.a = 5;
        this.d = g9Var;
        this.b = new Path();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(Context context, int i10) {
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
    public x7(x90 x90Var, Context context) {
        super(context);
        this.a = 6;
        this.d = x90Var;
        v90 v90Var = new v90(this, context);
        this.c = v90Var;
        LinearLayout e7 = bi.e(context, 0);
        addView(e7, w7.x5.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        e7.addView(v90Var, w7.x5.n(-2, -1));
        e7.addView(textView, w7.x5.q(-2, -2, 16));
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        v90Var.a(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(c70 c70Var, Context context) {
        super(context);
        this.a = 8;
        this.d = c70Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(b41 b41Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = 7;
        this.d = b41Var;
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new org.telegram.ui.Components.k6(this, e6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        b41Var.f.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(yh.j7 j7Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = 13;
        this.d = j7Var;
        this.c = e6Var;
        this.b = new Paint(1);
    }
}
