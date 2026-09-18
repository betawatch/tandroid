package ai;

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
import org.telegram.messenger.wl;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.x21;
import org.telegram.ui.g70;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class v7 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v7(Context context) {
        super(context);
        this.a = 11;
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
                ci.w6 w6Var = (ci.w6) this.d;
                float dpf2 = (width - AndroidUtilities.dpf2((w6Var.b - 1) * 2)) / w6Var.b;
                float dpf22 = AndroidUtilities.dpf2(5.0f);
                int i11 = 0;
                while (i11 < w6Var.b) {
                    rectF.set(dpf22, AndroidUtilities.dpf2(8.0f), dpf22 + dpf2, AndroidUtilities.dpf2(10.0f));
                    paint.setAlpha(i11 < w6Var.b + (-1) ? 255 : 133);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(1.0f), paint);
                    dpf22 += AndroidUtilities.dpf2(2.0f) + dpf2;
                    i11++;
                }
                break;
            case 5:
                Paint paint2 = (Paint) this.c;
                org.telegram.ui.ActionBar.j6.m(paint2);
                paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, ((org.telegram.ui.Components.c9) this.d).getResourceProvider()));
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
                x21 x21Var = (x21) this.d;
                float g10 = x21Var.f.g();
                int i12 = (g10 > 0.0f ? 1 : (g10 == 0.0f ? 0 : -1));
                boolean z10 = i12 > 0;
                float lerp = AndroidUtilities.lerp(0.5f, 1.0f, g10) * x21Var.K;
                float dp = AndroidUtilities.dp(10.0f);
                float dp2 = AndroidUtilities.dp(8.33f);
                float width2 = (getWidth() / 2.0f) + AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(12.0f);
                float max = Math.max(dp2 + dp2, x21Var.f.d() + AndroidUtilities.dp(10.0f));
                if (z10) {
                    i10 = i12;
                    f10 = dp3;
                    f7 = width2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                } else {
                    f7 = width2;
                    i10 = i12;
                    f10 = dp3;
                }
                super.dispatchDraw(canvas);
                if (z10) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f11 = max / 2.0f;
                    rectF3.set((f7 - f11) - AndroidUtilities.dp(1.33f), f10 - dp, f11 + f7 + AndroidUtilities.dp(1.33f), f10 + dp);
                    AndroidUtilities.scaleRect(rectF3, g10);
                    float f12 = dp * g10;
                    canvas.drawRoundRect(rectF3, f12, f12, (Paint) this.b);
                    canvas.restore();
                }
                if (i10 > 0) {
                    canvas.save();
                    canvas.scale(lerp, lerp, f7, f10);
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f13 = max / 2.0f;
                    rectF4.set(f7 - f13, f10 - dp2, f7 + f13, f10 + dp2);
                    org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) this.c;
                    g6Var.setColor(org.telegram.ui.ActionBar.j6.l1(g10, g6Var.b.a(org.telegram.ui.ActionBar.j6.v0(x21Var.E, g6Var.a), false)));
                    canvas.drawRoundRect(rectF4, dp2, dp2, g6Var);
                    x21Var.f.m(rectF4);
                    org.telegram.ui.Components.m6 m6Var = x21Var.f;
                    m6Var.w = (int) (g10 * 255.0f);
                    m6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 8:
                Paint paint3 = (Paint) this.c;
                g70 g70Var = (g70) this.d;
                paint3.setColor(g70Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF5 = (RectF) this.b;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF5.offset(0.0f, getTop());
                g70.a0(g70Var, canvas, rectF5, paint3);
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
            case 9:
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
                    int i10 = org.telegram.ui.ActionBar.j6.a7;
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
            case 10:
                qg.t2 t2Var = ((qg.v2) this.d).f;
                if (view != t2Var) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.translate(((org.telegram.ui.Components.c6) this.b).d(view.getX(), false), ((org.telegram.ui.Components.c6) this.c).d(view.getY(), false));
                t2Var.a(canvas);
                canvas.restore();
                return true;
            case 12:
                Paint paint = (Paint) this.b;
                if (((yh.s7) this.d).e > 1) {
                    paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, (org.telegram.ui.ActionBar.f6) this.c));
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
                paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
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
            case 9:
                super.onMeasure(i10, i11);
                Path path = (Path) this.b;
                path.rewind();
                RectF rectF = (RectF) this.c;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                qg.t2 t2Var = ((qg.v2) this.d).f;
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
                return ((x21) this.d).f == drawable || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.a = 3;
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.d = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(u9Var, w7.x5.d(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z10) {
            addView(new gi.a(context, f6Var), w7.x5.b(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.b = textView;
        wl.j(16.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, w7.x5.d(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var));
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, w7.x5.d(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(ci.w6 w6Var, Context context) {
        super(context);
        this.a = 1;
        this.d = w6Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.a = 4;
        this.c = paint;
        this.d = textPaint;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(qg.v2 v2Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 10:
                this.d = v2Var;
                super(context);
                qr qrVar = qr.h;
                this.b = new org.telegram.ui.Components.c6(this, 0L, 350L, qrVar);
                this.c = new org.telegram.ui.Components.c6(this, 0L, 350L, qrVar);
                break;
            default:
                this.d = v2Var;
                this.b = new Path();
                this.c = new RectF();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(fi.p pVar, Context context) {
        super(context);
        this.a = 2;
        this.d = pVar;
        this.b = new yf.y(2);
        this.c = new yf.y(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(w7 w7Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        this.a = 0;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.x5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        f6Var = ((org.telegram.ui.ActionBar.g3) w7Var).resourcesProvider;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.x5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        int i11 = org.telegram.ui.ActionBar.j6.y6;
        f6Var2 = ((org.telegram.ui.ActionBar.g3) w7Var).resourcesProvider;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var2));
        textView2.setTextSize(1, 14.0f);
        addView(textView2, w7.x5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(org.telegram.ui.Components.c9 c9Var, Activity activity) {
        super(activity);
        this.a = 5;
        this.d = c9Var;
        this.b = new Path();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(v80 v80Var, Context context) {
        super(context);
        this.a = 6;
        this.d = v80Var;
        t80 t80Var = new t80(this, context);
        this.c = t80Var;
        LinearLayout f7 = wl.f(context, 0);
        addView(f7, w7.x5.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        f7.addView(t80Var, w7.x5.n(-2, -1));
        f7.addView(textView, w7.x5.q(-2, -2, 16));
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        t80Var.a(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(g70 g70Var, Context context) {
        super(context);
        this.a = 8;
        this.d = g70Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(x21 x21Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = 7;
        this.d = x21Var;
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new org.telegram.ui.Components.g6(this, f6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        x21Var.f.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(yh.s7 s7Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = 12;
        this.d = s7Var;
        this.c = f6Var;
        this.b = new Paint(1);
    }
}
