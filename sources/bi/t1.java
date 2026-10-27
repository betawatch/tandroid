package bi;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.s90;
import org.telegram.ui.t60;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class t1 extends FrameLayout implements oe.d {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(Context context) {
        super(context);
        this.a = 0;
    }

    @Override // oe.d
    public void E(int i10, float f7, float f10, oe.e eVar) {
        invalidate();
    }

    public void a(TextView textView, boolean z10) {
        oe.e eVar = (oe.e) this.c;
        CharSequence text = textView.getText();
        float measureText = (text != null ? textView.getPaint().measureText(text, 0, text.length()) : 0.0f) + AndroidUtilities.dp(32.0f);
        if (z10 && eVar.f > 0.0f) {
            eVar.a(measureText);
        } else {
            eVar.c(measureText);
            invalidate();
        }
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
                fi.j6 j6Var = (fi.j6) this.d;
                float dpf2 = (width - AndroidUtilities.dpf2((j6Var.b - 1) * 2)) / j6Var.b;
                float dpf22 = AndroidUtilities.dpf2(5.0f);
                int i11 = 0;
                while (i11 < j6Var.b) {
                    rectF.set(dpf22, AndroidUtilities.dpf2(8.0f), dpf22 + dpf2, AndroidUtilities.dpf2(10.0f));
                    paint.setAlpha(i11 < j6Var.b + (-1) ? 255 : 133);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(1.0f), paint);
                    dpf22 += AndroidUtilities.dpf2(2.0f) + dpf2;
                    i11++;
                }
                break;
            case 8:
                Paint paint2 = (Paint) this.c;
                org.telegram.ui.ActionBar.y6.m(paint2);
                paint2.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G8, ((org.telegram.ui.Components.g9) this.d).getResourceProvider()));
                paint2.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.b;
                path.rewind();
                path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint2);
                super.dispatchDraw(canvas);
                break;
            case 10:
                e41 e41Var = (e41) this.d;
                float i12 = e41Var.f.i();
                int i13 = (i12 > 0.0f ? 1 : (i12 == 0.0f ? 0 : -1));
                boolean z10 = i13 > 0;
                float lerp = AndroidUtilities.lerp(0.5f, 1.0f, i12) * e41Var.L;
                float dp = AndroidUtilities.dp(10.0f);
                float dp2 = AndroidUtilities.dp(8.33f);
                float width2 = (getWidth() / 2.0f) + AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(12.0f);
                float max = Math.max(dp2 + dp2, e41Var.f.c() + AndroidUtilities.dp(10.0f));
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
                    org.telegram.ui.Components.l6 l6Var = (org.telegram.ui.Components.l6) this.c;
                    l6Var.setColor(org.telegram.ui.ActionBar.y6.o1(i12, l6Var.b.a(org.telegram.ui.ActionBar.y6.w0(e41Var.F, l6Var.a), false)));
                    canvas.drawRoundRect(rectF4, dp2, dp2, l6Var);
                    e41Var.f.p(rectF4);
                    org.telegram.ui.Components.r6 r6Var = e41Var.f;
                    r6Var.B = (int) (i12 * 255.0f);
                    r6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 11:
                Paint paint3 = (Paint) this.c;
                t60 t60Var = (t60) this.d;
                paint3.setColor(t60Var.getThemedColor(org.telegram.ui.ActionBar.y6.d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF5 = (RectF) this.b;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF5.offset(0.0f, getTop());
                t60.b0(t60Var, canvas, rectF5, paint3);
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
                if (((yc) this.d).e > 1) {
                    paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, (org.telegram.ui.ActionBar.u6) this.c));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-AndroidUtilities.dp(1.66f), -AndroidUtilities.dp(1.66f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
                }
                return super.drawChild(canvas, view, j10);
            case 4:
                ag.h0 h0Var = (ag.h0) this.b;
                ag.h0 h0Var2 = (ag.h0) this.c;
                boolean drawChild = super.drawChild(canvas, view, j10);
                ii.o oVar = (ii.o) this.d;
                if (view == oVar.e) {
                    int i10 = org.telegram.ui.ActionBar.y6.a7;
                    h0Var.b(oVar.getThemedColor(i10));
                    h0Var.setBounds(0, 0, getWidth(), AndroidUtilities.statusBarHeight);
                    h0Var.draw(canvas);
                    float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(AndroidUtilities.navigationBarHeight);
                    if (navigationBarThirdButtonsFactor > 0.0f) {
                        h0Var2.setAlpha((int) (navigationBarThirdButtonsFactor * 255.0f));
                        h0Var2.b(oVar.getThemedColor(i10));
                        h0Var2.setBounds(0, getHeight() - AndroidUtilities.navigationBarHeight, getWidth(), getHeight());
                        h0Var2.draw(canvas);
                    }
                }
                return drawChild;
            case 13:
                sg.s2 s2Var = ((sg.u2) this.d).f;
                if (view != s2Var) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.translate(((org.telegram.ui.Components.h6) this.b).d(view.getX(), false), ((org.telegram.ui.Components.h6) this.c).d(view.getY(), false));
                s2Var.a(canvas);
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
                float min = Math.min(((oe.e) this.c).f, getWidth() - AndroidUtilities.dp(24.0f));
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                RectF rectF = (RectF) this.d;
                float f7 = min / 2.0f;
                rectF.set(width - f7, height - (AndroidUtilities.dp(38.0f) / 2.0f), width + f7, (AndroidUtilities.dp(38.0f) / 2.0f) + height);
                int dp = AndroidUtilities.dp(6.0f);
                eh.d dVar = (eh.d) this.b;
                dVar.setBounds(((int) rectF.left) - dp, ((int) rectF.top) - dp, ((int) rectF.right) + dp, ((int) rectF.bottom) + dp);
                dVar.draw(canvas);
                break;
            case 7:
                super.onDraw(canvas);
                Paint paint = (Paint) this.c;
                paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.p7, false));
                canvas.save();
                float measuredWidth = getMeasuredWidth();
                TextPaint textPaint = (TextPaint) this.d;
                canvas.translate((measuredWidth - textPaint.measureText("500")) - AndroidUtilities.dp(8.0f), AndroidUtilities.dpf2(7.0f));
                RectF rectF2 = (RectF) this.b;
                rectF2.set(0.0f, 0.0f, textPaint.measureText("500"), textPaint.getTextSize());
                rectF2.inset(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(3.0f));
                float textSize = (textPaint.getTextSize() / 2.0f) + AndroidUtilities.dp(3.0f);
                canvas.drawRoundRect(rectF2, textSize, textSize, paint);
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
            case 12:
                super.onMeasure(i10, i11);
                Path path = (Path) this.b;
                path.rewind();
                RectF rectF = (RectF) this.c;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                sg.s2 s2Var = ((sg.u2) this.d).f;
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
            case 10:
                return ((e41) this.d).f == drawable || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        this.a = 5;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(y9Var, kb1.h(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z10) {
            addView(new ji.a(context, u6Var), kb1.f(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.b = textView;
        wh.j(16.0f, 1, textView);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, u6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, kb1.h(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.z6, u6Var);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, kb1.h(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(fi.j6 j6Var, Context context) {
        super(context);
        this.a = 3;
        this.d = j6Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.a = 7;
        this.c = paint;
        this.d = textPaint;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(sg.u2 u2Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 13:
                this.d = u2Var;
                super(context);
                ds dsVar = ds.h;
                this.b = new org.telegram.ui.Components.h6(this, 0L, 350L, dsVar);
                this.c = new org.telegram.ui.Components.h6(this, 0L, 350L, dsVar);
                break;
            default:
                this.d = u2Var;
                this.b = new Path();
                this.c = new RectF();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(ii.o oVar, Context context) {
        super(context);
        this.a = 4;
        this.d = oVar;
        this.b = new ag.h0(2);
        this.c = new ag.h0(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(di.f6 f6Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        this.a = 2;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.Oh, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, kb1.h(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        u6Var = ((org.telegram.ui.ActionBar.k3) f6Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.V(textView, i10, u6Var);
        textView.setTextSize(1, 14.0f);
        addView(textView, kb1.h(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        int i11 = org.telegram.ui.ActionBar.y6.y6;
        u6Var2 = ((org.telegram.ui.ActionBar.k3) f6Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.V(textView2, i11, u6Var2);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, kb1.h(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(org.telegram.ui.Components.g9 g9Var, Activity activity) {
        super(activity);
        this.a = 8;
        this.d = g9Var;
        this.b = new Path();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(org.telegram.ui.n8 n8Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var;
        this.a = 6;
        this.c = new oe.e(0, this, ds.h, 350L, 0.0f);
        this.d = new RectF();
        setWillNotDraw(false);
        eh.d c10 = n8Var.getBaseSimpleGlass().c.c(this, null, false);
        u6Var = ((org.telegram.ui.ActionBar.r2) n8Var).resourceProvider;
        c10.v(gh.c.m(u6Var));
        c10.w(AndroidUtilities.dp(6.0f));
        c10.x(AndroidUtilities.dp(19.0f));
        this.b = c10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(s90 s90Var, Context context) {
        super(context);
        this.a = 9;
        this.d = s90Var;
        q90 q90Var = new q90(this, context);
        this.c = q90Var;
        LinearLayout d = wh.d(context, 0);
        addView(d, kb1.i(-2, -1, 1));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        d.addView(q90Var, kb1.r(-2, -1));
        d.addView(textView, kb1.u(-2, -2, 16));
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        q90Var.a(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(t60 t60Var, Context context) {
        super(context);
        this.a = 11;
        this.d = t60Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(e41 e41Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.a = 10;
        this.d = e41Var;
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new org.telegram.ui.Components.l6(this, u6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        e41Var.f.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(yc ycVar, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.a = 1;
        this.d = ycVar;
        this.c = u6Var;
        this.b = new Paint(1);
    }

    @Override // oe.d
    public /* synthetic */ void z(float f7, int i10) {
    }
}
