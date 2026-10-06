package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.dg0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u90;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.d70;
import org.telegram.ui.gd0;
import org.telegram.ui.n20;
import org.telegram.ui.r50;
import org.telegram.ui.s50;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class n4 extends View {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public Object c;
    public Object d;

    public n4(Context context) {
        super(context);
        this.b = new pe.b();
        this.c = new tf.a(0, this);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        int textColor;
        Canvas canvas2;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 2:
                r31 r31Var = (r31) this.d;
                org.telegram.ui.Components.o6 o6Var = r31Var.e;
                float g10 = o6Var.g();
                if (g10 > 0.0f) {
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, g10);
                    float max = Math.max(AndroidUtilities.dp(16.66f), o6Var.d() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    float dp = AndroidUtilities.dp(8.33f);
                    float dp2 = AndroidUtilities.dp(8.33f);
                    org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.b;
                    i6Var.setColor(i6Var.b.a(org.telegram.ui.ActionBar.i6.v0(r31Var.I, i6Var.a), false));
                    textColor = r31Var.getTextColor();
                    i6Var.setColor(i0.a.d(r31Var.F, i6Var.getColor(), textColor));
                    i6Var.setAlpha((int) (i6Var.getAlpha() * g10));
                    canvas.drawRoundRect(rectF, dp, dp2, i6Var);
                    o6Var.m(rectF);
                    o6Var.w = (int) (g10 * 255.0f);
                    o6Var.r(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.W8, (org.telegram.ui.ActionBar.d6) this.c));
                    o6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
            default:
                super.dispatchDraw(canvas);
                break;
            case 4:
                int[] iArr = (int[]) this.b;
                n20 n20Var = (n20) this.c;
                r50 r50Var = (r50) this.d;
                if (r50Var.h <= 0.0f || r50Var.d == null) {
                    canvas2 = canvas;
                } else {
                    r50Var.f.reset();
                    float width = getWidth() / r50Var.c.getWidth();
                    r50Var.f.postScale(width, width);
                    r50Var.e.setLocalMatrix(r50Var.f);
                    r50Var.d.setAlpha((int) (r50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), r50Var.d);
                }
                if (n20Var != null) {
                    if (!n20Var.isAttachedToWindow() || n20Var.getAlpha() <= 0.5f) {
                        r50Var.dismiss();
                    } else {
                        n20Var.getLocationInWindow(iArr);
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - n20Var.getScaleX()) * n20Var.getMeasuredWidth()), iArr[1] - ((1.0f - n20Var.getScaleY()) * n20Var.getMeasuredHeight()));
                    if (((s50) n20Var.b).a(canvas2, n20Var.getMeasuredWidth(), r50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    break;
                }
                break;
            case 5:
                super.dispatchDraw(canvas);
                int dp3 = AndroidUtilities.dp(48.0f);
                d70 d70Var = (d70) this.d;
                int i10 = dp3 + ((int) d70Var.b.e);
                Paint paint = (Paint) this.c;
                paint.setColor(d70Var.getThemedColor(org.telegram.ui.ActionBar.i6.s8));
                RectF rectF2 = (RectF) this.b;
                float measuredWidth = getMeasuredWidth();
                kVar = ((org.telegram.ui.ActionBar.n2) d70Var).actionBar;
                rectF2.set(0.0f, 0.0f, measuredWidth, kVar.getMeasuredHeight() + i10);
                d70.Z(d70Var, canvas, rectF2, paint);
                break;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 8:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((tf.a) this.c);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 8:
                super.onDetachedFromWindow();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) this.d).removeOnDrawListener((tf.a) this.c);
                }
                this.d = null;
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        dg0 dg0Var;
        switch (this.a) {
            case 0:
                u90 u90Var = (u90) this.b;
                super.onDraw(canvas);
                org.telegram.ui.Components.e6 e6Var = (org.telegram.ui.Components.e6) this.c;
                e6Var.a = this;
                ((e6) this.d).getClass();
                e6Var.d(0.0f, false);
                float f7 = e6Var.c;
                if (f7 != 0.0f) {
                    if (f7 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (e6Var.c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    u90Var.d(rectF);
                    u90Var.j(24.0f);
                    u90Var.f(i0.a.k(-1, 20), i0.a.k(-1, 50), i0.a.k(-1, 50), i0.a.k(-1, 70));
                    u90Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                super.onDraw(canvas);
                rg0 rg0Var = (rg0) this.d;
                if (!rg0Var.n || ((dg0Var = rg0Var.r) != null && dg0Var.x)) {
                    int width = getWidth();
                    int dp = AndroidUtilities.dp(10.0f);
                    float f10 = (width - dp) - dp;
                    int i10 = dp + ((int) (rg0Var.Z * f10));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f11 = rg0Var.a0;
                    if (f11 != 0.0f) {
                        float f12 = dp;
                        canvas.drawLine(f12, height, (f11 * f10) + f12, height, (Paint) this.c);
                    }
                    canvas.drawLine(dp, height, i10, height, (Paint) this.b);
                    return;
                }
                return;
            case 2:
            case 4:
            case 5:
            default:
                super.onDraw(canvas);
                return;
            case 3:
                super.onDraw(canvas);
                org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.b;
                int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + o6Var.d());
                int width2 = (getWidth() - dpf2) / 2;
                int i11 = dpf2 + width2;
                ch.d dVar = (ch.d) this.c;
                if (dVar != null) {
                    dVar.setBounds(width2, 0, i11, getHeight());
                    ((ch.d) this.c).draw(canvas);
                }
                o6Var.draw(canvas);
                return;
            case 6:
                RectF rectF2 = (RectF) this.b;
                gd0 gd0Var = (gd0) this.d;
                Drawable drawable = gd0Var.s;
                Rect rect = (Rect) this.c;
                drawable.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                gd0Var.s.draw(canvas);
                int i12 = gd0Var.G0;
                if (i12 == 0 || i12 == 1) {
                    int dp2 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp2) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp2) / 2, AndroidUtilities.dp(4.0f) + r5);
                    int themedColor = gd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.i6.t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.t0);
                    return;
                }
                return;
            case 7:
                float dp3 = AndroidUtilities.dp(10.0f);
                float f13 = dp3 * 2.0f;
                float measuredWidth = getMeasuredWidth() - f13;
                float measuredHeight = getMeasuredHeight() - f13;
                canvas.save();
                RectF rectF3 = AndroidUtilities.rectTmp;
                float f14 = dp3 + measuredWidth;
                rectF3.set(dp3, dp3, f14, f14);
                rectF3.offset(0.0f, (measuredHeight - rectF3.height()) / 2.0f);
                float f15 = measuredWidth / 7.0f;
                Path path = (Path) this.c;
                path.rewind();
                path.addRoundRect(rectF3, f15, f15, Path.Direction.CW);
                canvas.clipPath(path);
                int dp4 = AndroidUtilities.dp(10.0f);
                canvas.save();
                canvas.translate(rectF3.left, rectF3.top);
                float f16 = dp4;
                int width3 = ((int) (rectF3.width() / f16)) + 1;
                int height2 = ((int) (rectF3.height() / f16)) + 1;
                for (int i13 = 0; i13 < height2; i13++) {
                    canvas.save();
                    for (int i14 = 0; i14 < width3; i14++) {
                        int i15 = i14 % 2;
                        if ((i15 == 0 && i13 % 2 == 0) || (i15 != 0 && i13 % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f16, f16, (Paint) this.b);
                        }
                        canvas.translate(f16, 0.0f);
                    }
                    canvas.restore();
                    canvas.translate(0.0f, f16);
                }
                canvas.restore();
                canvas.restore();
                return;
            case 8:
                Trace.beginSection("OnPostDraw");
                try {
                    Iterator it = ((pe.b) this.b).iterator();
                    while (it.hasNext()) {
                        ((li.h) it.next()).b();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((r31) this.d).e.d + AndroidUtilities.dp(10.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 3:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.o6) this.b).setBounds(0, 0, i10, i11);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.a) {
            case 7:
                super.setAlpha(f7);
                ((PhotoViewer) this.d).g0.invalidate();
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 2:
                return ((r31) this.d).e == drawable || super.verifyDrawable(drawable);
            case 3:
                return super.verifyDrawable(drawable) || drawable == ((org.telegram.ui.Components.o6) this.b);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(d70 d70Var, Context context) {
        super(context);
        this.d = d70Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(rg0 rg0Var, Context context) {
        super(context);
        this.d = rg0Var;
        Paint paint = new Paint();
        this.b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setColor(paint.getColor());
        paint2.setAlpha((int) (paint.getAlpha() * 0.3f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(gd0 gd0Var, Context context, Rect rect) {
        super(context);
        this.d = gd0Var;
        this.c = rect;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(r31 r31Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = r31Var;
        this.c = d6Var;
        this.b = new org.telegram.ui.Components.i6(this, d6Var);
        r31Var.e.setCallback(this);
    }

    public n4(Activity activity) {
        super(activity);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(true, false, false, false);
        this.b = o6Var;
        o6Var.r(-1);
        o6Var.b = 17;
        o6Var.u(AndroidUtilities.bold());
        o6Var.t(AndroidUtilities.dp(14.0f));
        o6Var.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(e6 e6Var, Context context) {
        super(context);
        this.d = e6Var;
        this.b = new u90();
        this.c = new org.telegram.ui.Components.e6(250L, tr.f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.d = photoViewer;
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(r50 r50Var, Context context, n20 n20Var) {
        super(context);
        this.d = r50Var;
        this.c = n20Var;
        this.b = new int[2];
    }
}
