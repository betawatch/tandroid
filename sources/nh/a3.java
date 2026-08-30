package nh;

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
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.r21;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ad0;
import org.telegram.ui.m50;
import org.telegram.ui.n50;
import org.telegram.ui.y60;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class a3 extends View {
    public final /* synthetic */ int a = 4;
    public final Object b;
    public Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(org.telegram.ui.j8 j8Var, Context context, String[] strArr, Drawable drawable) {
        super(context);
        this.d = j8Var;
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
                org.telegram.ui.Components.j6 j6Var = r21Var.e;
                float g10 = j6Var.g();
                if (g10 > 0.0f) {
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, g10);
                    float max = Math.max(AndroidUtilities.dp(16.66f), j6Var.d() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    float dp = AndroidUtilities.dp(8.33f);
                    float dp2 = AndroidUtilities.dp(8.33f);
                    org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) this.b;
                    d6Var.setColor(d6Var.b.a(org.telegram.ui.ActionBar.j6.v0(r21Var.F, d6Var.a), false));
                    textColor = r21Var.getTextColor();
                    d6Var.setColor(i0.a.d(r21Var.C, d6Var.getColor(), textColor));
                    d6Var.setAlpha((int) (d6Var.getAlpha() * g10));
                    canvas.drawRoundRect(rectF, dp, dp2, d6Var);
                    j6Var.m(rectF);
                    j6Var.w = (int) (g10 * 255.0f);
                    j6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W8, (org.telegram.ui.ActionBar.f6) this.c));
                    j6Var.draw(canvas);
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
                eg.h0 h0Var = (eg.h0) this.c;
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
                if (h0Var != null) {
                    if (!h0Var.isAttachedToWindow() || h0Var.getAlpha() <= 0.5f) {
                        m50Var.dismiss();
                    } else {
                        h0Var.getLocationInWindow(iArr);
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - h0Var.getScaleX()) * h0Var.getMeasuredWidth()), iArr[1] - ((1.0f - h0Var.getScaleY()) * h0Var.getMeasuredHeight()));
                    if (((n50) h0Var.b).a(canvas2, h0Var.getMeasuredWidth(), m50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    break;
                }
                break;
            case 6:
                super.dispatchDraw(canvas);
                int dp3 = AndroidUtilities.dp(48.0f);
                y60 y60Var = (y60) this.d;
                int i10 = dp3 + ((int) y60Var.b.e);
                Paint paint = (Paint) this.c;
                paint.setColor(y60Var.getThemedColor(org.telegram.ui.ActionBar.j6.s8));
                RectF rectF2 = (RectF) this.b;
                float measuredWidth = getMeasuredWidth();
                kVar = ((org.telegram.ui.ActionBar.p2) y60Var).actionBar;
                rectF2.set(0.0f, 0.0f, measuredWidth, kVar.getMeasuredHeight() + i10);
                y60.a0(y60Var, canvas, rectF2, paint);
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f10;
        vf0 vf0Var;
        switch (this.a) {
            case 0:
                i90 i90Var = (i90) this.b;
                super.onDraw(canvas);
                org.telegram.ui.Components.z5 z5Var = (org.telegram.ui.Components.z5) this.c;
                z5Var.a = this;
                ((d4) this.d).getClass();
                z5Var.d(0.0f, false);
                float f11 = z5Var.c;
                if (f11 != 0.0f) {
                    if (f11 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (z5Var.c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    i90Var.d(rectF);
                    i90Var.j(24.0f);
                    i90Var.f(i0.a.k(-1, 20), i0.a.k(-1, 50), i0.a.k(-1, 50), i0.a.k(-1, 70));
                    i90Var.draw(canvas);
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
                    canvas.drawText(((String[]) this.b)[i10], (measuredWidth / 2.0f) + (i10 * measuredWidth), ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((org.telegram.ui.j8) this.d).f);
                }
                drawable.setBounds(0, getMeasuredHeight() - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                break;
            case 2:
                super.onDraw(canvas);
                lg0 lg0Var = (lg0) this.d;
                if (!lg0Var.n || ((vf0Var = lg0Var.r) != null && vf0Var.x)) {
                    int width = getWidth();
                    int dp = AndroidUtilities.dp(10.0f);
                    float f12 = (width - dp) - dp;
                    int i11 = dp + ((int) (lg0Var.W * f12));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f13 = lg0Var.X;
                    if (f13 != 0.0f) {
                        float f14 = dp;
                        f10 = height;
                        canvas.drawLine(f14, f10, (f12 * f13) + f14, height, (Paint) this.c);
                    } else {
                        f10 = height;
                    }
                    canvas.drawLine(dp, f10, i11, f10, (Paint) this.b);
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
                org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.b;
                int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + j6Var.d());
                int width2 = (getWidth() - dpf2) / 2;
                int i12 = dpf2 + width2;
                pg.b bVar = (pg.b) this.c;
                if (bVar != null) {
                    bVar.setBounds(width2, 0, i12, getHeight());
                    ((pg.b) this.c).draw(canvas);
                }
                j6Var.draw(canvas);
                break;
            case 7:
                RectF rectF2 = (RectF) this.b;
                ad0 ad0Var = (ad0) this.d;
                Drawable drawable2 = ad0Var.s;
                Rect rect = (Rect) this.c;
                drawable2.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                ad0Var.s.draw(canvas);
                int i13 = ad0Var.D0;
                if (i13 == 0 || i13 == 1) {
                    int dp2 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp2) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp2) / 2, AndroidUtilities.dp(4.0f) + r5);
                    int themedColor = ad0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.j6.t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.t0);
                    break;
                }
                break;
            case 8:
                float dp3 = AndroidUtilities.dp(10.0f);
                float f15 = dp3 * 2.0f;
                float measuredWidth2 = getMeasuredWidth() - f15;
                float measuredHeight = getMeasuredHeight() - f15;
                canvas.save();
                RectF rectF3 = AndroidUtilities.rectTmp;
                float f16 = dp3 + measuredWidth2;
                rectF3.set(dp3, dp3, f16, f16);
                rectF3.offset(0.0f, (measuredHeight - rectF3.height()) / 2.0f);
                float f17 = measuredWidth2 / 7.0f;
                Path path = (Path) this.c;
                path.rewind();
                path.addRoundRect(rectF3, f17, f17, Path.Direction.CW);
                canvas.clipPath(path);
                int dp4 = AndroidUtilities.dp(10.0f);
                canvas.save();
                canvas.translate(rectF3.left, rectF3.top);
                float f18 = dp4;
                int width3 = ((int) (rectF3.width() / f18)) + 1;
                int height2 = ((int) (rectF3.height() / f18)) + 1;
                for (int i14 = 0; i14 < height2; i14++) {
                    canvas.save();
                    for (int i15 = 0; i15 < width3; i15++) {
                        int i16 = i15 % 2;
                        if ((i16 == 0 && i14 % 2 == 0) || (i16 != 0 && i14 % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f18, f18, (Paint) this.b);
                        }
                        canvas.translate(f18, 0.0f);
                    }
                    canvas.restore();
                    canvas.translate(0.0f, f18);
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
                ((org.telegram.ui.Components.j6) this.b).setBounds(0, 0, i10, i11);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 8:
                super.setAlpha(f10);
                ((PhotoViewer) this.d).d0.invalidate();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 3:
                return ((r21) this.d).e == drawable || super.verifyDrawable(drawable);
            case 4:
                return super.verifyDrawable(drawable) || drawable == ((org.telegram.ui.Components.j6) this.b);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(y60 y60Var, Context context) {
        super(context);
        this.d = y60Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(lg0 lg0Var, Context context) {
        super(context);
        this.d = lg0Var;
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
    public a3(ad0 ad0Var, Context context, Rect rect) {
        super(context);
        this.d = ad0Var;
        this.c = rect;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(r21 r21Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = r21Var;
        this.c = f6Var;
        this.b = new org.telegram.ui.Components.d6(this, f6Var);
        r21Var.e.setCallback(this);
    }

    public a3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(true, false, false, false);
        this.b = j6Var;
        j6Var.r(-1);
        j6Var.b = 17;
        j6Var.u(AndroidUtilities.bold());
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(d4 d4Var, Context context) {
        super(context);
        this.d = d4Var;
        this.b = new i90();
        this.c = new org.telegram.ui.Components.z5(250L, nr.f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
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
    public a3(m50 m50Var, Context context, eg.h0 h0Var) {
        super(context);
        this.d = m50Var;
        this.c = h0Var;
        this.b = new int[2];
    }
}
