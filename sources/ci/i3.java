package ci;

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
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.c50;
import org.telegram.ui.d50;
import org.telegram.ui.n60;
import org.telegram.ui.pc0;
import org.telegram.ui.x10;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class i3 extends View {
    public final /* synthetic */ int a = 4;
    public final Object b;
    public Object c;
    public Object d;

    public i3(Context context) {
        super(context);
        this.b = new re.b();
        this.c = new vf.a(0, this);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        int textColor;
        Canvas canvas2;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 3:
                k31 k31Var = (k31) this.d;
                org.telegram.ui.Components.p6 p6Var = k31Var.e;
                float i10 = p6Var.i();
                if (i10 > 0.0f) {
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, i10);
                    float max = Math.max(AndroidUtilities.dp(16.66f), p6Var.c() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    float dp = AndroidUtilities.dp(8.33f);
                    float dp2 = AndroidUtilities.dp(8.33f);
                    org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.b;
                    j6Var.setColor(j6Var.b.a(org.telegram.ui.ActionBar.h6.w0(k31Var.I, j6Var.a), false));
                    textColor = k31Var.getTextColor();
                    j6Var.setColor(i0.a.f(k31Var.F, j6Var.getColor(), textColor));
                    j6Var.setAlpha((int) (j6Var.getAlpha() * i10));
                    canvas.drawRoundRect(rectF, dp, dp2, j6Var);
                    p6Var.p(rectF);
                    p6Var.B = (int) (i10 * 255.0f);
                    p6Var.u(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.W8, (org.telegram.ui.ActionBar.d6) this.c));
                    p6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                break;
            case 4:
            default:
                super.dispatchDraw(canvas);
                break;
            case 5:
                int[] iArr = (int[]) this.b;
                x10 x10Var = (x10) this.c;
                c50 c50Var = (c50) this.d;
                if (c50Var.h <= 0.0f || c50Var.d == null) {
                    canvas2 = canvas;
                } else {
                    c50Var.f.reset();
                    float width = getWidth() / c50Var.c.getWidth();
                    c50Var.f.postScale(width, width);
                    c50Var.e.setLocalMatrix(c50Var.f);
                    c50Var.d.setAlpha((int) (c50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), c50Var.d);
                }
                if (x10Var != null) {
                    if (!x10Var.isAttachedToWindow() || x10Var.getAlpha() <= 0.5f) {
                        c50Var.dismiss();
                    } else {
                        x10Var.getLocationInWindow(iArr);
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - x10Var.getScaleX()) * x10Var.getMeasuredWidth()), iArr[1] - ((1.0f - x10Var.getScaleY()) * x10Var.getMeasuredHeight()));
                    if (((d50) x10Var.b).a(canvas2, x10Var.getMeasuredWidth(), c50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    break;
                }
                break;
            case 6:
                super.dispatchDraw(canvas);
                int dp3 = AndroidUtilities.dp(48.0f);
                n60 n60Var = (n60) this.d;
                int i11 = dp3 + ((int) n60Var.b.e);
                Paint paint = (Paint) this.c;
                paint.setColor(n60Var.getThemedColor(org.telegram.ui.ActionBar.h6.s8));
                RectF rectF2 = (RectF) this.b;
                float measuredWidth = getMeasuredWidth();
                kVar = ((org.telegram.ui.ActionBar.n2) n60Var).actionBar;
                rectF2.set(0.0f, 0.0f, measuredWidth, kVar.getMeasuredHeight() + i11);
                n60.a0(n60Var, canvas, rectF2, paint);
                break;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 9:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((vf.a) this.c);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 9:
                super.onDetachedFromWindow();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) this.d).removeOnDrawListener((vf.a) this.c);
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
        kg0 kg0Var;
        switch (this.a) {
            case 0:
                ba0 ba0Var = (ba0) this.b;
                super.onDraw(canvas);
                org.telegram.ui.Components.f6 f6Var = (org.telegram.ui.Components.f6) this.c;
                f6Var.a = this;
                ((q4) this.d).getClass();
                f6Var.d(0.0f, false);
                float f7 = f6Var.c;
                if (f7 != 0.0f) {
                    if (f7 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (f6Var.c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    ba0Var.e(rectF);
                    ba0Var.k(24.0f);
                    ba0Var.g(i0.a.o(-1, 20), i0.a.o(-1, 50), i0.a.o(-1, 50), i0.a.o(-1, 70));
                    ba0Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                Drawable drawable = (Drawable) this.c;
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    canvas.drawText(((String[]) this.b)[i10], (measuredWidth / 2.0f) + (i10 * measuredWidth), ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((org.telegram.ui.k8) this.d).f);
                }
                drawable.setBounds(0, getMeasuredHeight() - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 2:
                super.onDraw(canvas);
                zg0 zg0Var = (zg0) this.d;
                if (!zg0Var.n || ((kg0Var = zg0Var.r) != null && kg0Var.x)) {
                    int width = getWidth();
                    int dp = AndroidUtilities.dp(10.0f);
                    float f10 = (width - dp) - dp;
                    int i11 = dp + ((int) (zg0Var.Z * f10));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f11 = zg0Var.a0;
                    if (f11 != 0.0f) {
                        float f12 = dp;
                        canvas.drawLine(f12, height, (f11 * f10) + f12, height, (Paint) this.c);
                    }
                    canvas.drawLine(dp, height, i11, height, (Paint) this.b);
                    return;
                }
                return;
            case 3:
            case 5:
            case 6:
            default:
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) this.b;
                int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + p6Var.c());
                int width2 = (getWidth() - dpf2) / 2;
                int i12 = dpf2 + width2;
                dh.d dVar = (dh.d) this.c;
                if (dVar != null) {
                    dVar.setBounds(width2, 0, i12, getHeight());
                    ((dh.d) this.c).draw(canvas);
                }
                p6Var.draw(canvas);
                return;
            case 7:
                RectF rectF2 = (RectF) this.b;
                pc0 pc0Var = (pc0) this.d;
                Drawable drawable2 = pc0Var.s;
                Rect rect = (Rect) this.c;
                drawable2.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                pc0Var.s.draw(canvas);
                int i13 = pc0Var.G0;
                if (i13 == 0 || i13 == 1) {
                    int dp2 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp2) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp2) / 2, AndroidUtilities.dp(4.0f) + r5);
                    int themedColor = pc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.h6.t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.t0);
                    return;
                }
                return;
            case 8:
                float dp3 = AndroidUtilities.dp(10.0f);
                float f13 = dp3 * 2.0f;
                float measuredWidth2 = getMeasuredWidth() - f13;
                float measuredHeight = getMeasuredHeight() - f13;
                canvas.save();
                RectF rectF3 = AndroidUtilities.rectTmp;
                float f14 = dp3 + measuredWidth2;
                rectF3.set(dp3, dp3, f14, f14);
                rectF3.offset(0.0f, (measuredHeight - rectF3.height()) / 2.0f);
                float f15 = measuredWidth2 / 7.0f;
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
                for (int i14 = 0; i14 < height2; i14++) {
                    canvas.save();
                    for (int i15 = 0; i15 < width3; i15++) {
                        int i16 = i15 % 2;
                        if ((i16 == 0 && i14 % 2 == 0) || (i16 != 0 && i14 % 2 != 0)) {
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
            case 9:
                Trace.beginSection("OnPostDraw");
                try {
                    Iterator it = ((re.b) this.b).iterator();
                    while (it.hasNext()) {
                        ((ni.a) it.next()).a();
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
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((k31) this.d).e.d + AndroidUtilities.dp(10.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.p6) this.b).setBounds(0, 0, i10, i11);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.a) {
            case 8:
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
            case 3:
                return ((k31) this.d).e == drawable || super.verifyDrawable(drawable);
            case 4:
                return super.verifyDrawable(drawable) || drawable == ((org.telegram.ui.Components.p6) this.b);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(org.telegram.ui.k8 k8Var, Context context, String[] strArr, Drawable drawable) {
        super(context);
        this.d = k8Var;
        this.b = strArr;
        this.c = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(n60 n60Var, Context context) {
        super(context);
        this.d = n60Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(zg0 zg0Var, Context context) {
        super(context);
        this.d = zg0Var;
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
    public i3(pc0 pc0Var, Context context, Rect rect) {
        super(context);
        this.d = pc0Var;
        this.c = rect;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(k31 k31Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = k31Var;
        this.c = d6Var;
        this.b = new org.telegram.ui.Components.j6(this, d6Var);
        k31Var.e.setCallback(this);
    }

    public i3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(true, false, false);
        this.b = p6Var;
        p6Var.u(-1);
        p6Var.b = 17;
        p6Var.x(AndroidUtilities.bold());
        p6Var.w(AndroidUtilities.dp(14.0f));
        p6Var.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(q4 q4Var, Context context) {
        super(context);
        this.d = q4Var;
        this.b = new ba0();
        this.c = new org.telegram.ui.Components.f6(250L, bs.f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
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
    public i3(c50 c50Var, Context context, x10 x10Var) {
        super(context);
        this.d = c50Var;
        this.c = x10Var;
        this.b = new int[2];
    }
}
