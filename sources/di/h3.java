package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.b20;
import org.telegram.ui.g50;
import org.telegram.ui.h50;
import org.telegram.ui.rc0;
import org.telegram.ui.t60;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h3 extends View {
    public final /* synthetic */ int a = 8;
    public final Object b;
    public Object c;
    public Object d;

    public h3(Context context) {
        super(context);
        this.b = new se.b();
        this.c = new ag.e0(1, this);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        int textColor;
        Canvas canvas2;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 2:
                a41 a41Var = (a41) this.d;
                org.telegram.ui.Components.r6 r6Var = a41Var.e;
                float i10 = r6Var.i();
                if (i10 > 0.0f) {
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, i10);
                    float max = Math.max(AndroidUtilities.dp(16.66f), r6Var.c() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    float dp = AndroidUtilities.dp(8.33f);
                    float dp2 = AndroidUtilities.dp(8.33f);
                    org.telegram.ui.Components.l6 l6Var = (org.telegram.ui.Components.l6) this.b;
                    l6Var.setColor(l6Var.b.a(org.telegram.ui.ActionBar.y6.w0(a41Var.I, l6Var.a), false));
                    textColor = a41Var.getTextColor();
                    l6Var.setColor(i0.a.f(a41Var.F, l6Var.getColor(), textColor));
                    l6Var.setAlpha((int) (l6Var.getAlpha() * i10));
                    canvas.drawRoundRect(rectF, dp, dp2, l6Var);
                    r6Var.p(rectF);
                    r6Var.B = (int) (i10 * 255.0f);
                    r6Var.u(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.W8, (org.telegram.ui.ActionBar.u6) this.c));
                    r6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
                int[] iArr = (int[]) this.b;
                b20 b20Var = (b20) this.c;
                g50 g50Var = (g50) this.d;
                if (g50Var.h <= 0.0f || g50Var.d == null) {
                    canvas2 = canvas;
                } else {
                    g50Var.f.reset();
                    float width = getWidth() / g50Var.c.getWidth();
                    g50Var.f.postScale(width, width);
                    g50Var.e.setLocalMatrix(g50Var.f);
                    g50Var.d.setAlpha((int) (g50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), g50Var.d);
                }
                if (b20Var != null) {
                    if (!b20Var.isAttachedToWindow() || b20Var.getAlpha() <= 0.5f) {
                        g50Var.dismiss();
                    } else {
                        b20Var.getLocationInWindow(iArr);
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - b20Var.getScaleX()) * b20Var.getMeasuredWidth()), iArr[1] - ((1.0f - b20Var.getScaleY()) * b20Var.getMeasuredHeight()));
                    if (((h50) b20Var.b).a(canvas2, b20Var.getMeasuredWidth(), g50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    break;
                }
                break;
            case 4:
                super.dispatchDraw(canvas);
                int dp3 = AndroidUtilities.dp(48.0f);
                t60 t60Var = (t60) this.d;
                int i11 = dp3 + ((int) t60Var.b.f);
                Paint paint = (Paint) this.c;
                paint.setColor(t60Var.getThemedColor(org.telegram.ui.ActionBar.y6.s8));
                RectF rectF2 = (RectF) this.b;
                float measuredWidth = getMeasuredWidth();
                kVar = ((org.telegram.ui.ActionBar.r2) t60Var).actionBar;
                rectF2.set(0.0f, 0.0f, measuredWidth, kVar.getMeasuredHeight() + i11);
                t60.b0(t60Var, canvas, rectF2, paint);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 7:
                super.onAttachedToWindow();
                if (((ai.g) this.c) != null) {
                    postDelayed((org.telegram.ui.Wallet.m) this.d, 200L);
                    break;
                }
                break;
            case 8:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((ag.e0) this.c);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 7:
                super.onDetachedFromWindow();
                org.telegram.ui.Wallet.m mVar = (org.telegram.ui.Wallet.m) this.d;
                removeCallbacks(mVar);
                mVar.run();
                break;
            case 8:
                super.onDetachedFromWindow();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) this.d).removeOnDrawListener((ag.e0) this.c);
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
        ng0 ng0Var;
        switch (this.a) {
            case 0:
                ea0 ea0Var = (ea0) this.b;
                super.onDraw(canvas);
                org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.c;
                h6Var.a = this;
                ((q4) this.d).getClass();
                h6Var.d(0.0f, false);
                float f7 = h6Var.c;
                if (f7 != 0.0f) {
                    if (f7 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (h6Var.c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    ea0Var.e(rectF);
                    ea0Var.k(24.0f);
                    ea0Var.g(i0.a.o(-1, 20), i0.a.o(-1, 50), i0.a.o(-1, 50), i0.a.o(-1, 70));
                    ea0Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                super.onDraw(canvas);
                dh0 dh0Var = (dh0) this.d;
                if (!dh0Var.n || ((ng0Var = dh0Var.r) != null && ng0Var.x)) {
                    int width = getWidth();
                    int dp = AndroidUtilities.dp(10.0f);
                    float f10 = (width - dp) - dp;
                    int i10 = dp + ((int) (dh0Var.Z * f10));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f11 = dh0Var.a0;
                    if (f11 != 0.0f) {
                        float f12 = dp;
                        canvas.drawLine(f12, height, (f11 * f10) + f12, height, (Paint) this.c);
                    }
                    canvas.drawLine(dp, height, i10, height, (Paint) this.b);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            default:
                super.onDraw(canvas);
                return;
            case 5:
                RectF rectF2 = (RectF) this.b;
                rc0 rc0Var = (rc0) this.d;
                Drawable drawable = rc0Var.s;
                Rect rect = (Rect) this.c;
                drawable.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                rc0Var.s.draw(canvas);
                int i11 = rc0Var.F0;
                if (i11 == 0 || i11 == 1) {
                    int dp2 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp2) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp2) / 2, AndroidUtilities.dp(4.0f) + r5);
                    int themedColor = rc0Var.getThemedColor(org.telegram.ui.ActionBar.y6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.y6.t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.y6.t0);
                    return;
                }
                return;
            case 6:
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
                int width2 = ((int) (rectF3.width() / f16)) + 1;
                int height2 = ((int) (rectF3.height() / f16)) + 1;
                for (int i12 = 0; i12 < height2; i12++) {
                    canvas.save();
                    for (int i13 = 0; i13 < width2; i13++) {
                        int i14 = i13 % 2;
                        if ((i14 == 0 && i12 % 2 == 0) || (i14 != 0 && i12 % 2 != 0)) {
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
            case 7:
                ai.h hVar = (ai.h) this.b;
                hVar.e(canvas, 0.0f, 0.0f, getWidth());
                if (hVar.o < 1.0f || hVar.l > 0) {
                    invalidate();
                    return;
                }
                return;
            case 8:
                Trace.beginSection("OnPostDraw");
                try {
                    Iterator it = ((se.b) this.b).iterator();
                    while (it.hasNext()) {
                        ((oi.h) it.next()).b();
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
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((a41) this.d).e.d + AndroidUtilities.dp(10.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.a) {
            case 6:
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
                return ((a41) this.d).e == drawable || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(t60 t60Var, Context context) {
        super(context);
        this.d = t60Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(dh0 dh0Var, Context context) {
        super(context);
        this.d = dh0Var;
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
    public h3(rc0 rc0Var, Context context, Rect rect) {
        super(context);
        this.d = rc0Var;
        this.c = rect;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(a41 a41Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.d = a41Var;
        this.c = u6Var;
        this.b = new org.telegram.ui.Components.l6(this, u6Var);
        a41Var.e.setCallback(this);
    }

    public h3(Context context, ai.g gVar) {
        super(context);
        ai.h hVar = new ai.h();
        this.b = hVar;
        this.d = new org.telegram.ui.Wallet.m(this, 9);
        if (hVar.y != -16777216 || hVar.z == null) {
            hVar.y = -16777216;
            hVar.z = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
        }
        this.c = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(q4 q4Var, Context context) {
        super(context);
        this.d = q4Var;
        this.b = new ea0();
        this.c = new org.telegram.ui.Components.h6(250L, ds.f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
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
    public h3(g50 g50Var, Context context, b20 b20Var) {
        super(context);
        this.d = g50Var;
        this.c = b20Var;
        this.b = new int[2];
    }
}
