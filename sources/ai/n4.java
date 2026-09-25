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
import org.telegram.ui.Components.ag0;
import org.telegram.ui.Components.f31;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.rr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cd0;
import org.telegram.ui.m50;
import org.telegram.ui.n50;
import org.telegram.ui.o50;
import org.telegram.ui.z60;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class n4 extends View {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public Object c;
    public Object d;

    public n4(Context context) {
        super(context);
        this.b = new pe.b(true);
        this.c = new tf.a(0, this);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        int textColor;
        Canvas canvas2;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 3:
                f31 f31Var = (f31) this.d;
                org.telegram.ui.Components.o6 o6Var = f31Var.e;
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
                    i6Var.setColor(i6Var.b.a(org.telegram.ui.ActionBar.h6.v0(f31Var.I, i6Var.a), false));
                    textColor = f31Var.getTextColor();
                    i6Var.setColor(i0.a.d(f31Var.F, i6Var.getColor(), textColor));
                    i6Var.setAlpha((int) (i6Var.getAlpha() * g10));
                    canvas.drawRoundRect(rectF, dp, dp2, i6Var);
                    o6Var.m(rectF);
                    o6Var.w = (int) (g10 * 255.0f);
                    o6Var.r(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.W8, (org.telegram.ui.ActionBar.d6) this.c));
                    o6Var.draw(canvas);
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
                n50 n50Var = (n50) this.c;
                m50 m50Var = (m50) this.d;
                if (m50Var.h <= 0.0f || m50Var.d == null) {
                    canvas2 = canvas;
                } else {
                    m50Var.f.reset();
                    float width = getWidth() / m50Var.c.getWidth();
                    m50Var.f.postScale(width, width);
                    m50Var.e.setLocalMatrix(m50Var.f);
                    m50Var.d.setAlpha((int) (m50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), m50Var.d);
                }
                if (n50Var != null) {
                    if (!n50Var.isAttachedToWindow() || n50Var.getAlpha() <= 0.5f) {
                        m50Var.dismiss();
                    } else {
                        n50Var.getLocationInWindow(iArr);
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - n50Var.getScaleX()) * n50Var.getMeasuredWidth()), iArr[1] - ((1.0f - n50Var.getScaleY()) * n50Var.getMeasuredHeight()));
                    if (((o50) n50Var.b).a(canvas2, n50Var.getMeasuredWidth(), m50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    break;
                }
                break;
            case 6:
                super.dispatchDraw(canvas);
                int dp3 = AndroidUtilities.dp(48.0f);
                z60 z60Var = (z60) this.d;
                int i10 = dp3 + ((int) z60Var.b.e);
                Paint paint = (Paint) this.c;
                paint.setColor(z60Var.getThemedColor(org.telegram.ui.ActionBar.h6.s8));
                RectF rectF2 = (RectF) this.b;
                float measuredWidth = getMeasuredWidth();
                kVar = ((org.telegram.ui.ActionBar.m2) z60Var).actionBar;
                rectF2.set(0.0f, 0.0f, measuredWidth, kVar.getMeasuredHeight() + i10);
                z60.a0(z60Var, canvas, rectF2, paint);
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
            case 9:
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
        ag0 ag0Var;
        switch (this.a) {
            case 0:
                r90 r90Var = (r90) this.b;
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
                    r90Var.d(rectF);
                    r90Var.j(24.0f);
                    r90Var.f(i0.a.k(-1, 20), i0.a.k(-1, 50), i0.a.k(-1, 50), i0.a.k(-1, 70));
                    r90Var.draw(canvas);
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
                    canvas.drawText(((String[]) this.b)[i10], (measuredWidth / 2.0f) + (i10 * measuredWidth), ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((org.telegram.ui.h8) this.d).f);
                }
                drawable.setBounds(0, getMeasuredHeight() - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 2:
                super.onDraw(canvas);
                og0 og0Var = (og0) this.d;
                if (!og0Var.n || ((ag0Var = og0Var.r) != null && ag0Var.x)) {
                    int width = getWidth();
                    int dp = AndroidUtilities.dp(10.0f);
                    float f10 = (width - dp) - dp;
                    int i11 = dp + ((int) (og0Var.Z * f10));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f11 = og0Var.a0;
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
                org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.b;
                int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + o6Var.d());
                int width2 = (getWidth() - dpf2) / 2;
                int i12 = dpf2 + width2;
                ch.d dVar = (ch.d) this.c;
                if (dVar != null) {
                    dVar.setBounds(width2, 0, i12, getHeight());
                    ((ch.d) this.c).draw(canvas);
                }
                o6Var.draw(canvas);
                return;
            case 7:
                RectF rectF2 = (RectF) this.b;
                cd0 cd0Var = (cd0) this.d;
                Drawable drawable2 = cd0Var.s;
                Rect rect = (Rect) this.c;
                drawable2.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                cd0Var.s.draw(canvas);
                int i13 = cd0Var.G0;
                if (i13 == 0 || i13 == 1) {
                    int dp2 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp2) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp2) / 2, AndroidUtilities.dp(4.0f) + r5);
                    int themedColor = cd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Ii);
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
                    Iterator it = ((pe.b) this.b).iterator();
                    while (it.hasNext()) {
                        ((li.a) it.next()).a();
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
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((f31) this.d).e.d + AndroidUtilities.dp(10.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), TLObject.FLAG_30));
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
                return ((f31) this.d).e == drawable || super.verifyDrawable(drawable);
            case 4:
                return super.verifyDrawable(drawable) || drawable == ((org.telegram.ui.Components.o6) this.b);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(org.telegram.ui.h8 h8Var, Context context, String[] strArr, Drawable drawable) {
        super(context);
        this.d = h8Var;
        this.b = strArr;
        this.c = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(z60 z60Var, Context context) {
        super(context);
        this.d = z60Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(og0 og0Var, Context context) {
        super(context);
        this.d = og0Var;
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
    public n4(cd0 cd0Var, Context context, Rect rect) {
        super(context);
        this.d = cd0Var;
        this.c = rect;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(f31 f31Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = f31Var;
        this.c = d6Var;
        this.b = new org.telegram.ui.Components.i6(this, d6Var);
        f31Var.e.setCallback(this);
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
        this.b = new r90();
        this.c = new org.telegram.ui.Components.e6(250L, rr.f);
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
    public n4(m50 m50Var, Context context, n50 n50Var) {
        super(context);
        this.d = m50Var;
        this.c = n50Var;
        this.b = new int[2];
    }
}
