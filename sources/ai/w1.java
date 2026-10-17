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
import org.telegram.messenger.wh;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.p31;
import org.telegram.ui.Components.q90;
import org.telegram.ui.n60;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class w1 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        this.a = 5;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(w9Var, w7.z5.a(46.0f, 21.0f, 6.0f, 0.0f, 6.0f, 46, 19));
        if (z10) {
            addView(new h7(context, d6Var), w7.z5.c(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.b = textView;
        wh.k(16.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.j5, d6Var));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, w7.z5.a(-2.0f, 80.0f, 7.0f, 0.0f, 0.0f, -1, 51));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.z6, d6Var));
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, w7.z5.a(-2.0f, 80.0f, 30.33f, 0.0f, 0.0f, -1, 51));
    }

    public void a(float[] fArr) {
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        float[] fArr2 = (float[]) this.c;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        float f7 = width;
        fArr2[2] = f7;
        fArr2[3] = 0.0f;
        fArr2[4] = f7;
        float f10 = height;
        fArr2[5] = f10;
        fArr2[6] = 0.0f;
        fArr2[7] = f10;
        ((Matrix) this.b).setPolyToPoly(fArr2, 0, fArr, 0, 4);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        float f10;
        switch (this.a) {
            case 3:
                RectF rectF = (RectF) this.b;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.c;
                paint.setColor(-1);
                float width = getWidth() - (AndroidUtilities.dpf2(5.0f) * 2.0f);
                ei.l6 l6Var = (ei.l6) this.d;
                float dpf2 = (width - AndroidUtilities.dpf2((l6Var.b - 1) * 2)) / l6Var.b;
                float dpf22 = AndroidUtilities.dpf2(5.0f);
                int i11 = 0;
                while (i11 < l6Var.b) {
                    rectF.set(dpf22, AndroidUtilities.dpf2(8.0f), dpf22 + dpf2, AndroidUtilities.dpf2(10.0f));
                    paint.setAlpha(i11 < l6Var.b + (-1) ? 255 : 133);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(1.0f), paint);
                    dpf22 += AndroidUtilities.dpf2(2.0f) + dpf2;
                    i11++;
                }
                break;
            case 4:
            case 5:
            case 6:
            case 8:
            default:
                super.dispatchDraw(canvas);
                break;
            case 7:
                Paint paint2 = (Paint) this.c;
                org.telegram.ui.ActionBar.h6.m(paint2);
                paint2.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, ((org.telegram.ui.Components.e9) this.d).getResourceProvider()));
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
                p31 p31Var = (p31) this.d;
                float i12 = p31Var.f.i();
                int i13 = (i12 > 0.0f ? 1 : (i12 == 0.0f ? 0 : -1));
                boolean z10 = i13 > 0;
                float lerp = AndroidUtilities.lerp(0.5f, 1.0f, i12) * p31Var.K;
                float dp = AndroidUtilities.dp(10.0f);
                float dp2 = AndroidUtilities.dp(8.33f);
                float width2 = (getWidth() / 2.0f) + AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(12.0f);
                float max = Math.max(dp2 + dp2, p31Var.f.c() + AndroidUtilities.dp(10.0f));
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
                    org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.c;
                    j6Var.setColor(org.telegram.ui.ActionBar.h6.m1(i12, j6Var.b.a(org.telegram.ui.ActionBar.h6.w0(p31Var.E, j6Var.a), false)));
                    canvas.drawRoundRect(rectF4, dp2, dp2, j6Var);
                    p31Var.f.p(rectF4);
                    org.telegram.ui.Components.p6 p6Var = p31Var.f;
                    p6Var.B = (int) (i12 * 255.0f);
                    p6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 10:
                Paint paint3 = (Paint) this.c;
                n60 n60Var = (n60) this.d;
                paint3.setColor(n60Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF5 = (RectF) this.b;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF5.offset(0.0f, getTop());
                n60.a0(n60Var, canvas, rectF5, paint3);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 11:
                int save = canvas.save();
                canvas.concat((Matrix) this.b);
                Path path2 = (Path) this.c;
                w7.i6.a(path2, getWidth(), getHeight());
                canvas.clipPath(path2);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(save);
                break;
            case 12:
                int save2 = canvas.save();
                canvas.concat((Matrix) this.b);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(save2);
                break;
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 13:
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
                if (((gd) this.d).e > 1) {
                    paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, (org.telegram.ui.ActionBar.d6) this.c));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-AndroidUtilities.dp(1.66f), -AndroidUtilities.dp(1.66f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
                }
                return super.drawChild(canvas, view, j10);
            case 4:
                zf.y yVar = (zf.y) this.b;
                zf.y yVar2 = (zf.y) this.c;
                boolean drawChild = super.drawChild(canvas, view, j10);
                hi.o oVar = (hi.o) this.d;
                if (view == oVar.d) {
                    int i10 = org.telegram.ui.ActionBar.h6.a7;
                    yVar.b(oVar.getThemedColor(i10));
                    yVar.setBounds(0, 0, getWidth(), AndroidUtilities.statusBarHeight);
                    yVar.draw(canvas);
                    float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(AndroidUtilities.navigationBarHeight);
                    if (navigationBarThirdButtonsFactor > 0.0f) {
                        yVar2.setAlpha((int) (navigationBarThirdButtonsFactor * 255.0f));
                        yVar2.b(oVar.getThemedColor(i10));
                        yVar2.setBounds(0, getHeight() - AndroidUtilities.navigationBarHeight, getWidth(), getHeight());
                        yVar2.draw(canvas);
                    }
                }
                return drawChild;
            case 14:
                rg.r2 r2Var = ((rg.t2) this.d).f;
                if (view != r2Var) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.translate(((org.telegram.ui.Components.f6) this.b).d(view.getX(), false), ((org.telegram.ui.Components.f6) this.c).d(view.getY(), false));
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
                paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.p7, false));
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
            case 13:
                super.onMeasure(i10, i11);
                Path path = (Path) this.b;
                path.rewind();
                RectF rectF = (RectF) this.c;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                rg.r2 r2Var = ((rg.t2) this.d).f;
                if (r2Var != null) {
                    r2Var.setMaxWidth(getMeasuredWidth() - AndroidUtilities.dp(32.0f));
                    break;
                }
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 12:
                super.onSizeChanged(i10, i11, i12, i13);
                FrameLayout frameLayout = (FrameLayout) this.d;
                frameLayout.setScaleX(i10 / AndroidUtilities.dp(336.0f));
                frameLayout.setScaleY(i11 / AndroidUtilities.dp(205.0f));
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 9:
                return ((p31) this.d).f == drawable || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(ei.l6 l6Var, Context context) {
        super(context);
        this.a = 3;
        this.d = l6Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.a = 6;
        this.c = paint;
        this.d = textPaint;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(rg.t2 t2Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 14:
                this.d = t2Var;
                super(context);
                bs bsVar = bs.h;
                this.b = new org.telegram.ui.Components.f6(this, 0L, 350L, bsVar);
                this.c = new org.telegram.ui.Components.f6(this, 0L, 350L, bsVar);
                break;
            default:
                this.d = t2Var;
                this.b = new Path();
                this.c = new RectF();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(hi.o oVar, Context context) {
        super(context);
        this.a = 4;
        this.d = oVar;
        this.b = new zf.y(2);
        this.c = new zf.y(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(ci.g6 g6Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        this.a = 2;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.z5.a(28.0f, 25.0f, 12.0f, 16.0f, 0.0f, 28, 0));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        d6Var = ((org.telegram.ui.ActionBar.f3) g6Var).resourcesProvider;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.z5.a(-2.0f, 68.0f, 8.0f, 16.0f, 0.0f, -1, 0));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        int i11 = org.telegram.ui.ActionBar.h6.y6;
        d6Var2 = ((org.telegram.ui.ActionBar.f3) g6Var).resourcesProvider;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var2));
        textView2.setTextSize(1, 14.0f);
        addView(textView2, w7.z5.a(-2.0f, 68.0f, 28.0f, 16.0f, 8.0f, -1, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(org.telegram.ui.Components.e9 e9Var, Activity activity) {
        super(activity);
        this.a = 7;
        this.d = e9Var;
        this.b = new Path();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(q90 q90Var, Context context) {
        super(context);
        this.a = 8;
        this.d = q90Var;
        o90 o90Var = new o90(this, context);
        this.c = o90Var;
        LinearLayout e = wh.e(context, 0);
        addView(e, w7.z5.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        e.addView(o90Var, w7.z5.n(-2, -1));
        e.addView(textView, w7.z5.q(-2, -2, 16));
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        o90Var.a(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 11:
                super(context);
                this.b = new Matrix();
                this.c = new Path();
                this.d = new float[8];
                setClipChildren(false);
                setClipToPadding(false);
                break;
            case 12:
                super(context);
                this.b = new Matrix();
                this.c = new float[8];
                setClipChildren(false);
                setClipToPadding(false);
                ci.m1 m1Var = new ci.m1(context, 1);
                m1Var.setLayerType(2, null);
                addView(m1Var, new FrameLayout.LayoutParams(-1, -1));
                FrameLayout frameLayout = new FrameLayout(context);
                this.d = frameLayout;
                frameLayout.setPivotX(0.0f);
                frameLayout.setPivotY(0.0f);
                m1Var.addView(frameLayout, new FrameLayout.LayoutParams(AndroidUtilities.dp(336.0f), AndroidUtilities.dp(205.0f)));
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(n60 n60Var, Context context) {
        super(context);
        this.a = 10;
        this.d = n60Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(p31 p31Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.a = 9;
        this.d = p31Var;
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new org.telegram.ui.Components.j6(this, d6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        p31Var.f.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(gd gdVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.a = 1;
        this.d = gdVar;
        this.c = d6Var;
        this.b = new Paint(1);
    }
}
