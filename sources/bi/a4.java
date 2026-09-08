package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.r21;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.f70;
import org.telegram.ui.id0;
import org.telegram.ui.s50;
import org.telegram.ui.t50;
import org.telegram.ui.u50;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class a4 extends View {
    public final /* synthetic */ int a = 4;
    public final Object b;
    public Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(org.telegram.ui.h8 h8Var, Context context, String[] strArr, Drawable drawable) {
        super(context);
        this.d = h8Var;
        this.b = strArr;
        this.c = drawable;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        int textColor;
        Canvas canvas2;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 3:
                r21 r21Var = (r21) this.d;
                org.telegram.ui.Components.p6 p6Var = r21Var.e;
                float g10 = p6Var.g();
                if (g10 > 0.0f) {
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, g10);
                    float max = Math.max(AndroidUtilities.dp(16.66f), p6Var.d() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    float dp = AndroidUtilities.dp(8.33f);
                    float dp2 = AndroidUtilities.dp(8.33f);
                    org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.b;
                    i6Var.setColor(i6Var.b.a(org.telegram.ui.ActionBar.j6.v0(r21Var.I, i6Var.a), false));
                    textColor = r21Var.getTextColor();
                    i6Var.setColor(i0.a.d(r21Var.F, i6Var.getColor(), textColor));
                    i6Var.setAlpha((int) (i6Var.getAlpha() * g10));
                    canvas.drawRoundRect(rectF, dp, dp2, i6Var);
                    p6Var.m(rectF);
                    p6Var.w = (int) (g10 * 255.0f);
                    p6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W8, (org.telegram.ui.ActionBar.f6) this.c));
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
                t50 t50Var = (t50) this.c;
                s50 s50Var = (s50) this.d;
                if (s50Var.h <= 0.0f || s50Var.d == null) {
                    canvas2 = canvas;
                } else {
                    s50Var.f.reset();
                    float width = getWidth() / s50Var.c.getWidth();
                    s50Var.f.postScale(width, width);
                    s50Var.e.setLocalMatrix(s50Var.f);
                    s50Var.d.setAlpha((int) (s50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), s50Var.d);
                }
                if (t50Var != null) {
                    if (!t50Var.isAttachedToWindow() || t50Var.getAlpha() <= 0.5f) {
                        s50Var.dismiss();
                    } else {
                        t50Var.getLocationInWindow(iArr);
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - t50Var.getScaleX()) * t50Var.getMeasuredWidth()), iArr[1] - ((1.0f - t50Var.getScaleY()) * t50Var.getMeasuredHeight()));
                    if (((u50) t50Var.b).a(canvas2, t50Var.getMeasuredWidth(), s50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    break;
                }
                break;
            case 6:
                super.dispatchDraw(canvas);
                int dp3 = AndroidUtilities.dp(48.0f);
                f70 f70Var = (f70) this.d;
                int i10 = dp3 + ((int) f70Var.b.e);
                Paint paint = (Paint) this.c;
                paint.setColor(f70Var.getThemedColor(org.telegram.ui.ActionBar.j6.s8));
                RectF rectF2 = (RectF) this.b;
                float measuredWidth = getMeasuredWidth();
                kVar = ((org.telegram.ui.ActionBar.n2) f70Var).actionBar;
                rectF2.set(0.0f, 0.0f, measuredWidth, kVar.getMeasuredHeight() + i10);
                f70.a0(f70Var, canvas, rectF2, paint);
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f7;
        qf0 qf0Var;
        switch (this.a) {
            case 0:
                h90 h90Var = (h90) this.b;
                super.onDraw(canvas);
                org.telegram.ui.Components.e6 e6Var = (org.telegram.ui.Components.e6) this.c;
                e6Var.a = this;
                ((o5) this.d).getClass();
                e6Var.d(0.0f, false);
                float f10 = e6Var.c;
                if (f10 != 0.0f) {
                    if (f10 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (e6Var.c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    h90Var.d(rectF);
                    h90Var.j(24.0f);
                    h90Var.f(i0.a.k(-1, 20), i0.a.k(-1, 50), i0.a.k(-1, 50), i0.a.k(-1, 70));
                    h90Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    break;
                }
                break;
            case 1:
                Drawable drawable = (Drawable) this.c;
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    canvas.drawText(((String[]) this.b)[i10], (measuredWidth / 2.0f) + (i10 * measuredWidth), ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((org.telegram.ui.h8) this.d).f);
                }
                drawable.setBounds(0, getMeasuredHeight() - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                break;
            case 2:
                super.onDraw(canvas);
                eg0 eg0Var = (eg0) this.d;
                if (!eg0Var.n || ((qf0Var = eg0Var.r) != null && qf0Var.x)) {
                    int width = getWidth();
                    int dp = AndroidUtilities.dp(10.0f);
                    float f11 = (width - dp) - dp;
                    int i11 = dp + ((int) (eg0Var.Z * f11));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f12 = eg0Var.a0;
                    if (f12 != 0.0f) {
                        float f13 = dp;
                        f7 = height;
                        canvas.drawLine(f13, f7, (f11 * f12) + f13, height, (Paint) this.c);
                    } else {
                        f7 = height;
                    }
                    canvas.drawLine(dp, f7, i11, f7, (Paint) this.b);
                    break;
                }
                break;
            case 3:
            case 5:
            case 6:
            default:
                super.onDraw(canvas);
                break;
            case 4:
                super.onDraw(canvas);
                org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) this.b;
                int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + p6Var.d());
                int width2 = (getWidth() - dpf2) / 2;
                int i12 = dpf2 + width2;
                dh.d dVar = (dh.d) this.c;
                if (dVar != null) {
                    dVar.setBounds(width2, 0, i12, getHeight());
                    ((dh.d) this.c).draw(canvas);
                }
                p6Var.draw(canvas);
                break;
            case 7:
                RectF rectF2 = (RectF) this.b;
                id0 id0Var = (id0) this.d;
                Drawable drawable2 = id0Var.s;
                Rect rect = (Rect) this.c;
                drawable2.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                id0Var.s.draw(canvas);
                int i13 = id0Var.G0;
                if (i13 == 0 || i13 == 1) {
                    int dp2 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp2) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp2) / 2, AndroidUtilities.dp(4.0f) + r5);
                    int themedColor = id0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.j6.t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.t0);
                    break;
                }
                break;
            case 8:
                float dp3 = AndroidUtilities.dp(10.0f);
                float f14 = dp3 * 2.0f;
                float measuredWidth2 = getMeasuredWidth() - f14;
                float measuredHeight = getMeasuredHeight() - f14;
                canvas.save();
                RectF rectF3 = AndroidUtilities.rectTmp;
                float f15 = dp3 + measuredWidth2;
                rectF3.set(dp3, dp3, f15, f15);
                rectF3.offset(0.0f, (measuredHeight - rectF3.height()) / 2.0f);
                float f16 = measuredWidth2 / 7.0f;
                Path path = (Path) this.c;
                path.rewind();
                path.addRoundRect(rectF3, f16, f16, Path.Direction.CW);
                canvas.clipPath(path);
                int dp4 = AndroidUtilities.dp(10.0f);
                canvas.save();
                canvas.translate(rectF3.left, rectF3.top);
                float f17 = dp4;
                int width3 = ((int) (rectF3.width() / f17)) + 1;
                int height2 = ((int) (rectF3.height() / f17)) + 1;
                for (int i14 = 0; i14 < height2; i14++) {
                    canvas.save();
                    for (int i15 = 0; i15 < width3; i15++) {
                        int i16 = i15 % 2;
                        if ((i16 == 0 && i14 % 2 == 0) || (i16 != 0 && i14 % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f17, f17, (Paint) this.b);
                        }
                        canvas.translate(f17, 0.0f);
                    }
                    canvas.restore();
                    canvas.translate(0.0f, f17);
                }
                canvas.restore();
                canvas.restore();
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((r21) this.d).e.d + AndroidUtilities.dp(10.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), TLObject.FLAG_30));
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
                return ((r21) this.d).e == drawable || super.verifyDrawable(drawable);
            case 4:
                return super.verifyDrawable(drawable) || drawable == ((org.telegram.ui.Components.p6) this.b);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(f70 f70Var, Context context) {
        super(context);
        this.d = f70Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(eg0 eg0Var, Context context) {
        super(context);
        this.d = eg0Var;
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
    public a4(id0 id0Var, Context context, Rect rect) {
        super(context);
        this.d = id0Var;
        this.c = rect;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(r21 r21Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = r21Var;
        this.c = f6Var;
        this.b = new org.telegram.ui.Components.i6(this, f6Var);
        r21Var.e.setCallback(this);
    }

    public a4(Activity activity) {
        super(activity);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(true, false, false, false);
        this.b = p6Var;
        p6Var.r(-1);
        p6Var.b = 17;
        p6Var.u(AndroidUtilities.bold());
        p6Var.t(AndroidUtilities.dp(14.0f));
        p6Var.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(o5 o5Var, Context context) {
        super(context);
        this.d = o5Var;
        this.b = new h90();
        this.c = new org.telegram.ui.Components.e6(250L, pr.f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
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
    public a4(s50 s50Var, Context context, t50 t50Var) {
        super(context);
        this.d = s50Var;
        this.c = t50Var;
        this.b = new int[2];
    }
}
