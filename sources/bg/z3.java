package bg;

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
import i7.f6;
import jh.da;
import jh.g5;
import lh.q5;
import nh.x5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.l21;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.t9;
import org.telegram.ui.m60;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z3 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3(Context context) {
        super(context);
        this.a = 2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f9;
        int i10;
        float f10;
        switch (this.a) {
            case 5:
                RectF rectF = (RectF) this.d;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.c;
                paint.setColor(-1);
                float width = getWidth() - (AndroidUtilities.dpf2(5.0f) * 2.0f);
                x5 x5Var = (x5) this.b;
                float dpf2 = (width - AndroidUtilities.dpf2((x5Var.b - 1) * 2)) / x5Var.b;
                float dpf22 = AndroidUtilities.dpf2(5.0f);
                int i11 = 0;
                while (i11 < x5Var.b) {
                    rectF.set(dpf22, AndroidUtilities.dpf2(8.0f), dpf22 + dpf2, AndroidUtilities.dpf2(10.0f));
                    paint.setAlpha(i11 < x5Var.b + (-1) ? 255 : 133);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(1.0f), paint);
                    dpf22 += AndroidUtilities.dpf2(2.0f) + dpf2;
                    i11++;
                }
                break;
            case 6:
            case 8:
            default:
                super.dispatchDraw(canvas);
                break;
            case 7:
                Paint paint2 = (Paint) this.d;
                g6.m(paint2);
                paint2.setColor(g6.v0(g6.G8, ((b9) this.b).getResourceProvider()));
                paint2.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.c;
                path.rewind();
                path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint2);
                super.dispatchDraw(canvas);
                break;
            case 9:
                l21 l21Var = (l21) this.b;
                float g10 = l21Var.f.g();
                int i12 = (g10 > 0.0f ? 1 : (g10 == 0.0f ? 0 : -1));
                boolean z10 = i12 > 0;
                float lerp = AndroidUtilities.lerp(0.5f, 1.0f, g10) * l21Var.G;
                float dp = AndroidUtilities.dp(10.0f);
                float dp2 = AndroidUtilities.dp(8.33f);
                float width2 = (getWidth() / 2.0f) + AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(12.0f);
                float max = Math.max(dp2 + dp2, l21Var.f.d() + AndroidUtilities.dp(10.0f));
                if (z10) {
                    i10 = i12;
                    f10 = dp3;
                    f9 = width2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                } else {
                    f9 = width2;
                    i10 = i12;
                    f10 = dp3;
                }
                super.dispatchDraw(canvas);
                if (z10) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f11 = max / 2.0f;
                    rectF3.set((f9 - f11) - AndroidUtilities.dp(1.33f), f10 - dp, f11 + f9 + AndroidUtilities.dp(1.33f), f10 + dp);
                    AndroidUtilities.scaleRect(rectF3, g10);
                    float f12 = dp * g10;
                    canvas.drawRoundRect(rectF3, f12, f12, (Paint) this.c);
                    canvas.restore();
                }
                if (i10 > 0) {
                    canvas.save();
                    canvas.scale(lerp, lerp, f9, f10);
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f13 = max / 2.0f;
                    rectF4.set(f9 - f13, f10 - dp2, f9 + f13, f10 + dp2);
                    h6 h6Var = (h6) this.d;
                    h6Var.setColor(g6.l1(g10, h6Var.b.a(g6.v0(l21Var.A, h6Var.a), false)));
                    canvas.drawRoundRect(rectF4, dp2, dp2, h6Var);
                    l21Var.f.m(rectF4);
                    n6 n6Var = l21Var.f;
                    n6Var.w = (int) (g10 * 255.0f);
                    n6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 10:
                Paint paint3 = (Paint) this.c;
                m60 m60Var = (m60) this.b;
                paint3.setColor(m60Var.getThemedColor(g6.d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF5 = (RectF) this.d;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF5.offset(0.0f, getTop());
                m60.a0(m60Var, canvas, rectF5, paint3);
                canvas.restore();
                super.dispatchDraw(canvas);
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
                a4 a4Var = ((c4) this.b).f;
                if (view != a4Var) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.translate(((d6) this.c).d(view.getX(), false), ((d6) this.d).d(view.getY(), false));
                a4Var.a(canvas);
                canvas.restore();
                return true;
            case 3:
                Paint paint = (Paint) this.c;
                if (((da) this.b).e > 1) {
                    paint.setColor(g6.v0(g6.d6, (c6) this.d));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-AndroidUtilities.dp(1.66f), -AndroidUtilities.dp(1.66f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
                }
                return super.drawChild(canvas, view, j10);
            case 11:
                jf.b0 b0Var = (jf.b0) this.c;
                jf.b0 b0Var2 = (jf.b0) this.d;
                boolean drawChild = super.drawChild(canvas, view, j10);
                qh.n nVar = (qh.n) this.b;
                if (view == nVar.d) {
                    int i10 = g6.a7;
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
            case 6:
                super.onDraw(canvas);
                Paint paint = (Paint) this.c;
                paint.setColor(g6.w0(null, g6.p7, false));
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
                a4 a4Var = ((c4) this.b).f;
                if (a4Var != null) {
                    a4Var.setMaxWidth(getMeasuredWidth() - AndroidUtilities.dp(32.0f));
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
            case 9:
                return ((l21) this.b).f == drawable || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(Context context, c6 c6Var, boolean z10) {
        super(context);
        this.a = 12;
        t9 t9Var = new t9(context);
        this.c = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(t9Var, f6.d(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z10) {
            addView(new g5(context, c6Var), f6.b(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.ui.b.g(16.0f, 1, textView);
        textView.setTextColor(g6.v0(g6.j5, c6Var));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, f6.d(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(g6.v0(g6.z6, c6Var));
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, f6.d(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(x5 x5Var, Context context) {
        super(context);
        this.a = 5;
        this.b = x5Var;
        this.d = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.a = 6;
        this.c = paint;
        this.b = textPaint;
        this.d = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(c4 c4Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = c4Var;
                super(context);
                jr jrVar = jr.h;
                this.c = new d6(this, 0L, 350L, jrVar);
                this.d = new d6(this, 0L, 350L, jrVar);
                break;
            default:
                this.b = c4Var;
                this.c = new Path();
                this.d = new RectF();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(qh.n nVar, Context context) {
        super(context);
        this.a = 11;
        this.b = nVar;
        this.c = new jf.b0(2);
        this.d = new jf.b0(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(q5 q5Var, Context context) {
        super(context);
        c6 c6Var;
        c6 c6Var2;
        this.a = 4;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.Oh, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, f6.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i10 = g6.G6;
        c6Var = ((org.telegram.ui.ActionBar.f3) q5Var).resourcesProvider;
        textView.setTextColor(g6.v0(i10, c6Var));
        textView.setTextSize(1, 14.0f);
        addView(textView, f6.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        int i11 = g6.y6;
        c6Var2 = ((org.telegram.ui.ActionBar.f3) q5Var).resourcesProvider;
        textView2.setTextColor(g6.v0(i11, c6Var2));
        textView2.setTextSize(1, 14.0f);
        addView(textView2, f6.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(b9 b9Var, Activity activity) {
        super(activity);
        this.a = 7;
        this.b = b9Var;
        this.c = new Path();
        this.d = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(r80 r80Var, Context context) {
        super(context);
        this.a = 8;
        this.b = r80Var;
        p80 p80Var = new p80(this, context);
        this.d = p80Var;
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 0);
        addView(g10, f6.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        g10.addView(p80Var, f6.n(-2, -1));
        g10.addView(textView, f6.q(-2, -2, 16));
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        p80Var.a(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(m60 m60Var, Context context) {
        super(context);
        this.a = 10;
        this.b = m60Var;
        this.d = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(l21 l21Var, Context context, c6 c6Var) {
        super(context);
        this.a = 9;
        this.b = l21Var;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new h6(this, c6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        l21Var.f.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(da daVar, Context context, c6 c6Var) {
        super(context);
        this.a = 3;
        this.b = daVar;
        this.d = c6Var;
        this.c = new Paint(1);
    }
}
