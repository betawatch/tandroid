package ih;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.v11;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.k60;
import org.telegram.ui.pc0;
import org.telegram.ui.y40;
import org.telegram.ui.z40;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class b3 extends View {
    public final /* synthetic */ int a = 4;
    public final Object b;
    public Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(org.telegram.ui.g8 g8Var, Context context, String[] strArr, Drawable drawable) {
        super(context);
        this.d = g8Var;
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
                v11 v11Var = (v11) this.d;
                org.telegram.ui.Components.i6 i6Var = v11Var.e;
                float g10 = i6Var.g();
                if (g10 > 0.0f) {
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, g10);
                    float max = Math.max(AndroidUtilities.dp(16.66f), i6Var.d() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    float dp = AndroidUtilities.dp(8.33f);
                    float dp2 = AndroidUtilities.dp(8.33f);
                    org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) this.b;
                    c6Var.setColor(c6Var.b.a(org.telegram.ui.ActionBar.f6.v0(v11Var.E, c6Var.a), false));
                    textColor = v11Var.getTextColor();
                    c6Var.setColor(i0.a.d(v11Var.B, c6Var.getColor(), textColor));
                    c6Var.setAlpha((int) (c6Var.getAlpha() * g10));
                    canvas.drawRoundRect(rectF, dp, dp2, c6Var);
                    i6Var.m(rectF);
                    i6Var.w = (int) (g10 * 255.0f);
                    i6Var.r(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.W8, (org.telegram.ui.ActionBar.b6) this.c));
                    i6Var.draw(canvas);
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
                fh.l2 l2Var = (fh.l2) this.c;
                y40 y40Var = (y40) this.d;
                if (y40Var.h <= 0.0f || y40Var.d == null) {
                    canvas2 = canvas;
                } else {
                    y40Var.f.reset();
                    float width = getWidth() / y40Var.c.getWidth();
                    y40Var.f.postScale(width, width);
                    y40Var.e.setLocalMatrix(y40Var.f);
                    y40Var.d.setAlpha((int) (y40Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), y40Var.d);
                }
                if (l2Var != null) {
                    if (!l2Var.isAttachedToWindow() || l2Var.getAlpha() <= 0.5f) {
                        y40Var.dismiss();
                    } else {
                        l2Var.getLocationInWindow(iArr);
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - l2Var.getScaleX()) * l2Var.getMeasuredWidth()), iArr[1] - ((1.0f - l2Var.getScaleY()) * l2Var.getMeasuredHeight()));
                    if (((z40) l2Var.b).a(canvas2, l2Var.getMeasuredWidth(), y40Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    break;
                }
                break;
            case 6:
                super.dispatchDraw(canvas);
                int dp3 = AndroidUtilities.dp(48.0f);
                k60 k60Var = (k60) this.d;
                int i9 = dp3 + ((int) k60Var.b.e);
                Paint paint = (Paint) this.c;
                paint.setColor(k60Var.getThemedColor(org.telegram.ui.ActionBar.f6.s8));
                RectF rectF2 = (RectF) this.b;
                float measuredWidth = getMeasuredWidth();
                kVar = ((org.telegram.ui.ActionBar.o2) k60Var).actionBar;
                rectF2.set(0.0f, 0.0f, measuredWidth, kVar.getMeasuredHeight() + i9);
                k60.Z(k60Var, canvas, rectF2, paint);
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f10;
        ze0 ze0Var;
        switch (this.a) {
            case 0:
                p80 p80Var = (p80) this.b;
                super.onDraw(canvas);
                org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) this.c;
                y5Var.a = this;
                ((i4) this.d).getClass();
                y5Var.d(0.0f, false);
                float f11 = y5Var.c;
                if (f11 != 0.0f) {
                    if (f11 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (y5Var.c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    p80Var.d(rectF);
                    p80Var.j(24.0f);
                    p80Var.f(i0.a.k(-1, 20), i0.a.k(-1, 50), i0.a.k(-1, 50), i0.a.k(-1, 70));
                    p80Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    break;
                }
                break;
            case 1:
                Drawable drawable = (Drawable) this.c;
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 7.0f;
                for (int i9 = 0; i9 < 7; i9++) {
                    canvas.drawText(((String[]) this.b)[i9], (measuredWidth / 2.0f) + (i9 * measuredWidth), ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((org.telegram.ui.g8) this.d).f);
                }
                drawable.setBounds(0, getMeasuredHeight() - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                break;
            case 2:
                super.onDraw(canvas);
                pf0 pf0Var = (pf0) this.d;
                if (!pf0Var.n || ((ze0Var = pf0Var.r) != null && ze0Var.x)) {
                    int width = getWidth();
                    int dp = AndroidUtilities.dp(10.0f);
                    float f12 = (width - dp) - dp;
                    int i10 = dp + ((int) (pf0Var.V * f12));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f13 = pf0Var.W;
                    if (f13 != 0.0f) {
                        float f14 = dp;
                        f10 = height;
                        canvas.drawLine(f14, f10, (f12 * f13) + f14, height, (Paint) this.c);
                    } else {
                        f10 = height;
                    }
                    canvas.drawLine(dp, f10, i10, f10, (Paint) this.b);
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
                org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.b;
                int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + i6Var.d());
                int width2 = (getWidth() - dpf2) / 2;
                int i11 = dpf2 + width2;
                kg.d dVar = (kg.d) this.c;
                if (dVar != null) {
                    dVar.setBounds(width2, 0, i11, getHeight());
                    ((kg.d) this.c).draw(canvas);
                }
                i6Var.draw(canvas);
                break;
            case 7:
                RectF rectF2 = (RectF) this.b;
                pc0 pc0Var = (pc0) this.d;
                Drawable drawable2 = pc0Var.s;
                Rect rect = (Rect) this.c;
                drawable2.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                pc0Var.s.draw(canvas);
                int i12 = pc0Var.C0;
                if (i12 == 0 || i12 == 1) {
                    int dp2 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp2) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp2) / 2, AndroidUtilities.dp(4.0f) + r5);
                    int themedColor = pc0Var.getThemedColor(org.telegram.ui.ActionBar.f6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.f6.t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.t0);
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
                for (int i13 = 0; i13 < height2; i13++) {
                    canvas.save();
                    for (int i14 = 0; i14 < width3; i14++) {
                        int i15 = i14 % 2;
                        if ((i15 == 0 && i13 % 2 == 0) || (i15 != 0 && i13 % 2 != 0)) {
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
    public void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((v11) this.d).e.d + AndroidUtilities.dp(10.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 4:
                super.onSizeChanged(i9, i10, i11, i12);
                ((org.telegram.ui.Components.i6) this.b).setBounds(0, 0, i9, i10);
                break;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 8:
                super.setAlpha(f10);
                ((PhotoViewer) this.d).c0.invalidate();
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
                return ((v11) this.d).e == drawable || super.verifyDrawable(drawable);
            case 4:
                return super.verifyDrawable(drawable) || drawable == ((org.telegram.ui.Components.i6) this.b);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(k60 k60Var, Context context) {
        super(context);
        this.d = k60Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(pf0 pf0Var, Context context) {
        super(context);
        this.d = pf0Var;
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
    public b3(pc0 pc0Var, Context context, Rect rect) {
        super(context);
        this.d = pc0Var;
        this.c = rect;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(v11 v11Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.d = v11Var;
        this.c = b6Var;
        this.b = new org.telegram.ui.Components.c6(this, b6Var);
        v11Var.e.setCallback(this);
    }

    public b3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, false, false, false);
        this.b = i6Var;
        i6Var.r(-1);
        i6Var.b = 17;
        i6Var.u(AndroidUtilities.bold());
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(i4 i4Var, Context context) {
        super(context);
        this.d = i4Var;
        this.b = new p80();
        this.c = new org.telegram.ui.Components.y5(250L, gr.f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
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
    public b3(y40 y40Var, Context context, fh.l2 l2Var) {
        super(context);
        this.d = y40Var;
        this.c = l2Var;
        this.b = new int[2];
    }
}
