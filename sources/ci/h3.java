package ci;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.d50;
import org.telegram.ui.e50;
import org.telegram.ui.f50;
import org.telegram.ui.p60;
import org.telegram.ui.sc0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class h3 extends View {
    public final /* synthetic */ int a = 9;
    public final Object b;
    public Object c;
    public Object d;

    public h3(Context context) {
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
                r31 r31Var = (r31) this.d;
                org.telegram.ui.Components.p6 p6Var = r31Var.e;
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
                    j6Var.setColor(j6Var.b.a(org.telegram.ui.ActionBar.k6.w0(r31Var.I, j6Var.a), false));
                    textColor = r31Var.getTextColor();
                    j6Var.setColor(i0.a.f(r31Var.F, j6Var.getColor(), textColor));
                    j6Var.setAlpha((int) (j6Var.getAlpha() * i10));
                    canvas.drawRoundRect(rectF, dp, dp2, j6Var);
                    p6Var.p(rectF);
                    p6Var.B = (int) (i10 * 255.0f);
                    p6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W8, (org.telegram.ui.ActionBar.g6) this.c));
                    p6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                break;
            case 4:
                int[] iArr = (int[]) this.b;
                e50 e50Var = (e50) this.c;
                d50 d50Var = (d50) this.d;
                if (d50Var.h <= 0.0f || d50Var.d == null) {
                    canvas2 = canvas;
                } else {
                    d50Var.f.reset();
                    float width = getWidth() / d50Var.c.getWidth();
                    d50Var.f.postScale(width, width);
                    d50Var.e.setLocalMatrix(d50Var.f);
                    d50Var.d.setAlpha((int) (d50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), d50Var.d);
                }
                if (e50Var != null) {
                    if (!e50Var.isAttachedToWindow() || e50Var.getAlpha() <= 0.5f) {
                        d50Var.dismiss();
                    } else {
                        e50Var.getLocationInWindow(iArr);
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - e50Var.getScaleX()) * e50Var.getMeasuredWidth()), iArr[1] - ((1.0f - e50Var.getScaleY()) * e50Var.getMeasuredHeight()));
                    if (((f50) e50Var.b).a(canvas2, e50Var.getMeasuredWidth(), d50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    break;
                }
                break;
            case 5:
                super.dispatchDraw(canvas);
                int dp3 = AndroidUtilities.dp(48.0f);
                p60 p60Var = (p60) this.d;
                int i11 = dp3 + ((int) p60Var.b.e);
                Paint paint = (Paint) this.c;
                paint.setColor(p60Var.getThemedColor(org.telegram.ui.ActionBar.k6.s8));
                RectF rectF2 = (RectF) this.b;
                float measuredWidth = getMeasuredWidth();
                kVar = ((org.telegram.ui.ActionBar.o2) p60Var).actionBar;
                rectF2.set(0.0f, 0.0f, measuredWidth, kVar.getMeasuredHeight() + i11);
                p60.a0(p60Var, canvas, rectF2, paint);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 8:
                super.onAttachedToWindow();
                if (((zh.e) this.c) != null) {
                    postDelayed((org.telegram.ui.Wallet.m) this.d, 200L);
                    break;
                }
                break;
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
            case 8:
                super.onDetachedFromWindow();
                org.telegram.ui.Wallet.m mVar = (org.telegram.ui.Wallet.m) this.d;
                removeCallbacks(mVar);
                mVar.run();
                break;
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
        pg0 pg0Var;
        switch (this.a) {
            case 0:
                ca0 ca0Var = (ca0) this.b;
                super.onDraw(canvas);
                org.telegram.ui.Components.f6 f6Var = (org.telegram.ui.Components.f6) this.c;
                f6Var.a = this;
                ((p4) this.d).getClass();
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
                    ca0Var.e(rectF);
                    ca0Var.k(24.0f);
                    ca0Var.g(i0.a.o(-1, 20), i0.a.o(-1, 50), i0.a.o(-1, 50), i0.a.o(-1, 70));
                    ca0Var.draw(canvas);
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
                dh0 dh0Var = (dh0) this.d;
                if (!dh0Var.n || ((pg0Var = dh0Var.r) != null && pg0Var.x)) {
                    int width = getWidth();
                    int dp = AndroidUtilities.dp(10.0f);
                    float f10 = (width - dp) - dp;
                    int i11 = dp + ((int) (dh0Var.Z * f10));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f11 = dh0Var.a0;
                    if (f11 != 0.0f) {
                        float f12 = dp;
                        canvas.drawLine(f12, height, (f11 * f10) + f12, height, (Paint) this.c);
                    }
                    canvas.drawLine(dp, height, i11, height, (Paint) this.b);
                    return;
                }
                return;
            case 3:
            case 4:
            case 5:
            default:
                super.onDraw(canvas);
                return;
            case 6:
                RectF rectF2 = (RectF) this.b;
                sc0 sc0Var = (sc0) this.d;
                Drawable drawable2 = sc0Var.s;
                Rect rect = (Rect) this.c;
                drawable2.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                sc0Var.s.draw(canvas);
                int i12 = sc0Var.G0;
                if (i12 == 0 || i12 == 1) {
                    int dp2 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp2) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp2) / 2, AndroidUtilities.dp(4.0f) + r5);
                    int themedColor = sc0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.k6.t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.k6.t0);
                    return;
                }
                return;
            case 7:
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
                int width2 = ((int) (rectF3.width() / f16)) + 1;
                int height2 = ((int) (rectF3.height() / f16)) + 1;
                for (int i13 = 0; i13 < height2; i13++) {
                    canvas.save();
                    for (int i14 = 0; i14 < width2; i14++) {
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
                zh.f fVar = (zh.f) this.b;
                fVar.e(canvas, 0.0f, 0.0f, getWidth());
                if (fVar.o < 1.0f || fVar.l > 0) {
                    invalidate();
                    return;
                }
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
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((r31) this.d).e.d + AndroidUtilities.dp(10.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
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
            case 3:
                return ((r31) this.d).e == drawable || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(org.telegram.ui.k8 k8Var, Context context, String[] strArr, Drawable drawable) {
        super(context);
        this.d = k8Var;
        this.b = strArr;
        this.c = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(p60 p60Var, Context context) {
        super(context);
        this.d = p60Var;
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
    public h3(sc0 sc0Var, Context context, Rect rect) {
        super(context);
        this.d = sc0Var;
        this.c = rect;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(r31 r31Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = r31Var;
        this.c = g6Var;
        this.b = new org.telegram.ui.Components.j6(this, g6Var);
        r31Var.e.setCallback(this);
    }

    public h3(Context context, zh.e eVar) {
        super(context);
        zh.f fVar = new zh.f();
        this.b = fVar;
        this.d = new org.telegram.ui.Wallet.m(this, 9);
        if (fVar.y != -16777216 || fVar.z == null) {
            fVar.y = -16777216;
            fVar.z = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
        }
        this.c = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(p4 p4Var, Context context) {
        super(context);
        this.d = p4Var;
        this.b = new ca0();
        this.c = new org.telegram.ui.Components.f6(250L, bs.f);
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
    public h3(d50 d50Var, Context context, e50 e50Var) {
        super(context);
        this.d = d50Var;
        this.c = e50Var;
        this.b = new int[2];
    }
}
