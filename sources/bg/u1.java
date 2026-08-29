package bg;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import i7.f6;
import jh.d5;
import jh.h5;
import nh.f5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.ua;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fc1;
import org.telegram.ui.pb1;
import org.telegram.ui.qc1;
import org.telegram.ui.ua1;
import org.telegram.ui.v5;
import org.telegram.ui.w21;
import org.telegram.ui.xr0;
import org.telegram.ui.yr0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u1 extends FrameLayout {
    public final /* synthetic */ int a = 7;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ u1(Context context) {
        super(context);
    }

    public float a() {
        h5 h5Var = (h5) this.e;
        return (h5Var.U0.a(3) * h5Var.w0.getMeasuredHeight()) + (h5Var.U0.a(2) * h5Var.u0.getMeasuredHeight()) + (h5Var.U0.a(1) * h5Var.n0.getMeasuredHeight()) + (h5Var.U0.a(0) * h5Var.b0.getMeasuredHeight()) + h5Var.a0.getRealHeight() + 0.0f;
    }

    public void b(boolean z10) {
        ((ImageView) this.b).setVisibility(z10 ? 0 : 8);
        TextView textView = (TextView) this.c;
        boolean z11 = LocaleController.isRTL;
        textView.setLayoutParams(f6.d(-1, -2.0f, 55, (z11 || !z10) ? 22.0f : 53.0f, 14.0f, (z11 && z10) ? 53.0f : 22.0f, 12.0f));
    }

    public void c(int i10, String str) {
        ((TextView) this.c).setText(str);
        ((ImageView) this.b).setImageDrawable(getContext().getDrawable(i10));
    }

    public float d() {
        a5.d dVar;
        float max = Math.max(0.0f, getHeight() - a());
        h5 h5Var = (h5) this.e;
        jl0 jl0Var = h5Var.d;
        int childCount = jl0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = jl0Var.getChildAt(childCount);
            jl0Var.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                if (R == 2) {
                    max = childAt.getHeight() + childAt.getTranslationY() + childAt.getTop();
                    break;
                }
                if (R == 1) {
                    max = childAt.getY();
                    break;
                }
                if (R == 0) {
                    max = childAt.getY() - h5Var.a0.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a2 = (h5Var.U0.a(4) * h5Var.getBottomInset()) + max;
        Float f9 = h5Var.T0;
        return (f9 == null || (dVar = h5Var.U0) == null || dVar.c >= 1.0f) ? a2 : AndroidUtilities.lerp(f9.floatValue(), a2, h5Var.U0.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float globalXOffset;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float globalXOffset2;
        Drawable drawable;
        int i10;
        Drawable drawable2;
        int i11;
        int i12;
        switch (this.a) {
            case 1:
                c6 c6Var = (c6) this.d;
                Paint paint = (Paint) this.b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                if (!limitPreviewView.L) {
                    paint.setColor(g6.v0(g6.a7, c6Var));
                } else if (limitPreviewView.V || limitPreviewView.N) {
                    paint.setColor(g6.v0(g6.i6, c6Var));
                } else {
                    paint.setColor(g6.v0(g6.e7, c6Var));
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                cg.x xVar = limitPreviewView.a0;
                if (xVar != null) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ((v5) ((org.telegram.ui.c1) xVar).b).t0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                }
                canvas.save();
                if (!limitPreviewView.L) {
                    canvas.clipRect(limitPreviewView.n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                Paint e10 = limitPreviewView.N ? limitPreviewView.G : limitPreviewView.a0 != null ? (Paint) this.c : cg.s1.d().e();
                ViewGroup viewGroup = limitPreviewView.y;
                if (viewGroup != null) {
                    cg.r1 r1Var = limitPreviewView.A;
                    if (r1Var != null) {
                        e10 = r1Var.f;
                        float f9 = limitPreviewView.c;
                        float f10 = -limitPreviewView.B;
                        r1Var.a();
                        Matrix matrix = r1Var.e;
                        matrix.reset();
                        matrix.postScale(1.0f, f9 / 100.0f, 0.0f, 0.0f);
                        matrix.postTranslate(0.0f, f10);
                        r1Var.d.setLocalMatrix(matrix);
                    } else {
                        float f11 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f11 += view.getY();
                        }
                        cg.s1 d = cg.s1.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d.f(globalXOffset2 - getLeft(), -f11, measuredWidth, measuredHeight);
                    }
                } else {
                    cg.s1 d10 = cg.s1.d();
                    int measuredWidth2 = limitPreviewView.getMeasuredWidth();
                    int measuredHeight2 = limitPreviewView.getMeasuredHeight();
                    globalXOffset = limitPreviewView.getGlobalXOffset();
                    d10.f(globalXOffset - getLeft(), -getTop(), measuredWidth2, measuredHeight2);
                }
                int alpha = e10.getAlpha();
                if (limitPreviewView.R && (valueAnimator2 = limitPreviewView.e0) != null) {
                    e10.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha));
                } else if (limitPreviewView.Q && (valueAnimator = limitPreviewView.e0) != null) {
                    e10.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha));
                }
                if (limitPreviewView.L) {
                    if (limitPreviewView.H || limitPreviewView.I) {
                        AndroidUtilities.rectTmp.set(limitPreviewView.n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    } else {
                        AndroidUtilities.rectTmp.set(0.0f, 0.0f, limitPreviewView.n, getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), e10);
                e10.setAlpha(alpha);
                canvas.restore();
                if (limitPreviewView.A == null && limitPreviewView.W) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                break;
            case 2:
                Paint paint2 = (Paint) this.c;
                paint2.setColor(g6.v0(g6.Ii, (c6) this.d));
                cg.q0 q0Var = (cg.q0) this.e;
                canvas.drawLine(AndroidUtilities.dp(18.0f), getHeight() / 2.0f, q0Var.d.getLeft() - AndroidUtilities.dp(20.0f), getHeight() / 2.0f, paint2);
                canvas.drawLine(AndroidUtilities.dp(20.0f) + q0Var.d.getRight(), getHeight() / 2.0f, getWidth() - AndroidUtilities.dp(18.0f), getHeight() / 2.0f, paint2);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(q0Var.d.getLeft() - AndroidUtilities.dp(15.0f), ((q0Var.d.getBottom() + q0Var.d.getTop()) - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(15.0f) + q0Var.d.getRight(), (AndroidUtilities.dp(30.0f) + (q0Var.d.getBottom() + q0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF2.left, rectF2.top);
                rectF2.set(0.0f, 0.0f, rectF2.width(), rectF2.height());
                cg.r1 r1Var2 = (cg.r1) this.b;
                r1Var2.e(rectF2);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), r1Var2.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 3:
                Drawable drawable3 = (Drawable) this.c;
                cg.p1 p1Var = (cg.p1) this.e;
                drawable = ((org.telegram.ui.ActionBar.f3) p1Var).shadowDrawable;
                int i13 = p1Var.I;
                i10 = ((org.telegram.ui.ActionBar.f3) p1Var).backgroundPaddingTop;
                drawable.setBounds(0, org.telegram.ui.b.C(2.0f, i10 + i13, 1), getMeasuredWidth(), getMeasuredHeight());
                drawable2 = ((org.telegram.ui.ActionBar.f3) p1Var).shadowDrawable;
                drawable2.draw(canvas);
                super.dispatchDraw(canvas);
                cg.m1 m1Var = p1Var.J;
                if (m1Var != null && m1Var.getVisibility() == 0 && p1Var.J.getAlpha() != 0.0f) {
                    drawable3.setBounds(0, p1Var.J.getBottom(), getMeasuredWidth(), drawable3.getIntrinsicHeight() + p1Var.J.getBottom());
                    drawable3.setAlpha((int) (p1Var.J.getAlpha() * 255.0f));
                    drawable3.draw(canvas);
                    break;
                }
                break;
            case 4:
            case 6:
            case 7:
            case 10:
            default:
                super.dispatchDraw(canvas);
                break;
            case 5:
                h5 h5Var = (h5) this.e;
                h5Var.H(canvas, this);
                canvas.save();
                float d11 = d();
                float dp = AndroidUtilities.dp(12.0f);
                RectF rectF3 = (RectF) this.b;
                i11 = ((org.telegram.ui.ActionBar.f3) h5Var).backgroundPaddingLeft;
                int width = getWidth();
                i12 = ((org.telegram.ui.ActionBar.f3) h5Var).backgroundPaddingLeft;
                rectF3.set(i11, d11, width - i12, getHeight() + dp);
                Paint paint3 = (Paint) this.c;
                paint3.setColor(h5Var.getThemedColor(g6.h5));
                Path path = (Path) this.d;
                path.rewind();
                path.addRoundRect(rectF3, dp, dp, Path.Direction.CW);
                canvas.drawPath(path, paint3);
                super.dispatchDraw(canvas);
                e();
                canvas.restore();
                ua uaVar = h5Var.e;
                if (uaVar != null && uaVar.getVisibility() == 0 && uaVar.getAlpha() > 0.0f) {
                    if (uaVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(uaVar.getX(), uaVar.getY(), uaVar.getX() + uaVar.getMeasuredWidth(), uaVar.getY() + uaVar.getMeasuredHeight(), (int) (uaVar.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(uaVar.getX(), uaVar.getY(), uaVar.getX() + uaVar.getMeasuredWidth(), uaVar.getY() + uaVar.getMeasuredHeight());
                    }
                    canvas.translate(uaVar.getX(), uaVar.getY());
                    uaVar.draw(canvas);
                    canvas.restore();
                }
                h5Var.G(canvas, this);
                break;
            case 8:
                Path path2 = (Path) this.d;
                k31 k31Var = (k31) this.e;
                float A = k31Var.A(true);
                float lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(12.0f), i7.w.a(A / AndroidUtilities.dpf2(24.0f), 0.0f, 1.0f));
                k31Var.x.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, A));
                boolean z10 = A <= ((float) AndroidUtilities.statusBarHeight) / 2.0f;
                Boolean bool = (Boolean) this.c;
                if (bool == null || bool.booleanValue() != z10) {
                    this.c = Boolean.valueOf(z10);
                    AndroidUtilities.setLightStatusBar(k31Var.getWindow(), AndroidUtilities.computePerceivedBrightness(z10 ? k31Var.getThemedColor(g6.h5) : g6.v(k31Var.getThemedColor(g6.s8), 855638016)) > 0.721f);
                }
                k31Var.topBulletinContainer.setTranslationY(Math.max(k31Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, A) + getTranslationY() + ((-r3.getTop()) - k31Var.topBulletinContainer.getHeight()));
                path2.rewind();
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(0.0f, A, getWidth(), getHeight() + lerp);
                path2.addRoundRect(rectF4, lerp, lerp, Path.Direction.CW);
                canvas.drawPath(path2, (Paint) this.b);
                super.dispatchDraw(canvas);
                break;
            case 9:
                LinearGradient linearGradient = (LinearGradient) this.d;
                Matrix matrix2 = (Matrix) this.b;
                Paint paint4 = (Paint) this.c;
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (!photoViewer.O4) {
                    int measuredHeight3 = photoViewer.j0.getVisibility() == 0 ? getMeasuredHeight() - AndroidUtilities.dp(48.0f) : 0;
                    int i14 = photoViewer.Y1;
                    if (i14 == 0 || i14 == 2 || i14 == -1) {
                        matrix2.reset();
                        float min = Math.min(AndroidUtilities.dp(40.0f), getMeasuredHeight() - measuredHeight3);
                        matrix2.postTranslate(0.0f, measuredHeight3);
                        matrix2.postScale(1.0f, min / 16.0f);
                        linearGradient.setLocalMatrix(matrix2);
                        paint4.setShader(linearGradient);
                    } else {
                        paint4.setShader(null);
                        paint4.setColor(2130706432);
                    }
                    canvas.drawRect(0.0f, measuredHeight3, getMeasuredWidth(), getMeasuredHeight(), paint4);
                }
                super.dispatchDraw(canvas);
                break;
            case 11:
                Paint paint5 = (Paint) this.d;
                Paint paint6 = (Paint) this.c;
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float dp2 = AndroidUtilities.dp(8.0f);
                Paint paint7 = (Paint) this.b;
                paint7.setColor(0);
                float dpf2 = AndroidUtilities.dpf2(1.0f);
                float dpf22 = AndroidUtilities.dpf2(0.33f);
                qc1 qc1Var = (qc1) this.e;
                paint7.setShadowLayer(dpf2, 0.0f, dpf22, i0.a.k(-16777216, (int) (qc1Var.N1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF5, dp2, dp2, paint7);
                fc1 fc1Var = qc1Var.t0;
                pb1 pb1Var = qc1Var.a;
                g6.s(this, fc1Var, pb1Var);
                Paint G = pb1Var.G("paintChatActionBackground");
                int alpha2 = G.getAlpha();
                G.setAlpha((int) (qc1Var.N1.getAlpha() * alpha2));
                canvas.drawRoundRect(rectF5, dp2, dp2, G);
                G.setAlpha(alpha2);
                if (qc1Var.I1) {
                    float f12 = qc1Var.j1;
                    if (f12 > 0.0f) {
                        paint5.setColor(i0.a.k(-16777216, (int) (f12 * 255.0f * qc1Var.k1)));
                        canvas.drawRoundRect(rectF5, dp2, dp2, paint5);
                    }
                }
                paint6.setColor(520093695);
                paint6.setAlpha((int) (qc1Var.N1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF5, dp2, dp2, paint6);
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        ViewGroup viewGroup;
        switch (this.a) {
            case 3:
                cg.p1 p1Var = (cg.p1) this.e;
                if (motionEvent.getAction() == 0) {
                    float y8 = motionEvent.getY();
                    int i11 = p1Var.I;
                    i10 = ((org.telegram.ui.ActionBar.f3) p1Var).backgroundPaddingTop;
                    if (y8 < AndroidUtilities.dp(2.0f) + (i11 - i10)) {
                        p1Var.dismiss();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                h5 h5Var = (h5) this.e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < d()) {
                    viewGroup = ((org.telegram.ui.ActionBar.f3) h5Var).containerView;
                    if (viewGroup.isAttachedToWindow()) {
                        h5Var.dismiss();
                        return true;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 8:
                k31 k31Var = (k31) this.e;
                if (k31Var.F != null && k31Var.G != null) {
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                        Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + k31Var.F.y());
                    }
                    if (k31Var.F.y() && k31Var.G.onTouchEvent(motionEvent)) {
                        Log.d("TA2", "overlay consumed (handle)");
                        return true;
                    }
                    boolean b10 = k31Var.G.b(motionEvent);
                    if (motionEvent.getAction() == 1) {
                        Log.d("TA2", "checkOnTap=" + b10);
                    }
                    if (b10) {
                        motionEvent.setAction(3);
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 6:
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ((v5) this.e).t0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
                invalidate();
                super.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.s1 cell;
        ImageReceiver photoImage;
        switch (this.a) {
            case 0:
                float[] fArr = (float[]) this.c;
                Path path = (Path) this.d;
                Matrix matrix = (Matrix) this.b;
                f5 f5Var = (f5) this.e;
                v1 v1Var = f5Var.n0;
                if (view != f5Var.s0) {
                    return super.drawChild(canvas, view, j10);
                }
                cell = f5Var.getCell();
                if (cell == null || (photoImage = cell.getPhotoImage()) == null) {
                    return false;
                }
                matrix.reset();
                float max = Math.max(photoImage.getImageWidth() / f5Var.u0, photoImage.getImageHeight() / f5Var.v0);
                matrix.postScale((f5Var.u0 / f5Var.s0.getWidth()) * max, (f5Var.v0 / f5Var.s0.getHeight()) * max);
                matrix.postTranslate((photoImage.getCenterX() + (cell.getX() + v1Var.getX())) - ((f5Var.u0 * max) / 2.0f), (photoImage.getCenterY() + (cell.getY() + v1Var.getY())) - ((f5Var.v0 * max) / 2.0f));
                f5Var.s0.setTransform(matrix);
                canvas.save();
                path.rewind();
                AndroidUtilities.rectTmp.set(photoImage.getImageX() + cell.getX() + v1Var.getX(), photoImage.getImageY() + cell.getY() + v1Var.getY(), photoImage.getImageX2() + cell.getX() + v1Var.getX(), photoImage.getImageY2() + cell.getY() + v1Var.getY());
                for (int i10 = 0; i10 < photoImage.getRoundRadius().length; i10++) {
                    int i11 = i10 * 2;
                    fArr[i11] = photoImage.getRoundRadius()[i10];
                    fArr[i11 + 1] = photoImage.getRoundRadius()[i10];
                }
                path.addRoundRect(AndroidUtilities.rectTmp, fArr, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            case 1:
            case 2:
            default:
                return super.drawChild(canvas, view, j10);
            case 3:
                Path path2 = (Path) this.d;
                if (view != ((ScrollView) this.b)) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                path2.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getPaddingLeft(), AndroidUtilities.dp(18.0f) + ((cg.p1) this.e).I, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                path2.addRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                super.drawChild(canvas, view, j10);
                canvas.restore();
                return true;
            case 4:
                c6 c6Var = (c6) this.d;
                jf.b0 b0Var = (jf.b0) this.c;
                jf.b0 b0Var2 = (jf.b0) this.b;
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                eh.f fVar = (eh.f) this.e;
                int i12 = (int) fVar.T.e;
                if (view == fVar.d0 && i12 > 0) {
                    b0Var2.setBounds(0, AndroidUtilities.dp(40.0f), getWidth(), AndroidUtilities.dp(48.0f));
                    int i13 = g6.h5;
                    b0Var2.b(g6.v0(i13, c6Var));
                    b0Var2.draw(canvas);
                    int dp = AndroidUtilities.dp(48.0f) + i12;
                    b0Var.setBounds(0, dp - AndroidUtilities.dp(8.0f), getWidth(), dp);
                    b0Var.b(g6.v0(i13, c6Var));
                    b0Var.draw(canvas);
                }
                return drawChild2;
            case 5:
                h5 h5Var = (h5) this.e;
                if (view == h5Var.e) {
                    return false;
                }
                if (view == h5Var.Z) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipPath((Path) this.d);
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
        }
    }

    public void e() {
        float d = d();
        h5 h5Var = (h5) this.e;
        jh.r3 r3Var = h5Var.Z;
        r3Var.setTranslationY(d - r3Var.getHeight());
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(d - r3Var.getHeight(), 0.0f, AndroidUtilities.dp(32.0f)));
        r3Var.setAlpha(h5Var.U0.a(0) * clamp01);
        r3Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        r3Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        d5 d5Var = h5Var.a0;
        d5Var.setTranslationY(d);
        h5Var.b0.setTranslationY(d5Var.getRealHeight() + d);
        h5Var.n0.setTranslationY(d5Var.getRealHeight() + d);
        h5Var.u0.setTranslationY(d5Var.getRealHeight() + d);
        h5Var.w0.setTranslationY(d5Var.getRealHeight() + d);
        FrameLayout frameLayout = h5Var.topBulletinContainer;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
        }
        AndroidUtilities.updateViewVisibilityAnimated(h5Var.j0, h5Var.d.canScrollVertically(1));
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        switch (this.a) {
            case 3:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 8:
                super.onAttachedToWindow();
                mc.a(this, new eg.x(11));
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 8:
                super.onDetachedFromWindow();
                mc.h(this);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 7:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float[] fArr = (float[]) this.c;
                fArr[3] = 0.0f;
                fArr[2] = 0.0f;
                fArr[1] = 0.0f;
                fArr[0] = 0.0f;
                float dp = AndroidUtilities.dp(4.0f);
                fArr[7] = dp;
                fArr[6] = dp;
                fArr[5] = dp;
                fArr[4] = dp;
                Path path = (Path) this.d;
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                Paint paint = (Paint) this.e;
                paint.setColor(2130706432);
                canvas.drawPath(path, paint);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int left;
        int boundsRight;
        switch (this.a) {
            case 0:
                f5 f5Var = (f5) this.e;
                v1 v1Var = f5Var.n0;
                int measuredWidth = v1Var.getMeasuredWidth();
                int i14 = 0;
                for (int i15 = 0; i15 < v1Var.getChildCount(); i15++) {
                    View childAt = v1Var.getChildAt(i15);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                        left2 = childAt.getLeft() + s1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = s1Var.getBoundsRight();
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                        left2 = childAt.getLeft() + v0Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = v0Var.getBoundsRight();
                    } else {
                        measuredWidth = Math.min(left2, measuredWidth);
                        i14 = Math.max(right, i14);
                    }
                    right = boundsRight + left;
                    measuredWidth = Math.min(left2, measuredWidth);
                    i14 = Math.max(right, i14);
                }
                v1Var.layout(-measuredWidth, 0, v1Var.getMeasuredWidth() - measuredWidth, v1Var.getMeasuredHeight());
                TextureView textureView = f5Var.s0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), v1Var.getMeasuredHeight());
                    break;
                }
                break;
            case 1:
                if (getChildCount() == 2) {
                    View childAt2 = getChildAt(0);
                    View childAt3 = getChildAt(1);
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int i16 = i13 - i11;
                    childAt2.layout(0, 0, measuredWidth2, i16);
                    childAt3.layout(measuredWidth2, 0, i12 - i10, i16);
                    break;
                } else {
                    super.onLayout(z10, i10, i11, i12, i13);
                    break;
                }
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                h5 h5Var = (h5) this.e;
                cg.g gVar = h5Var.M0;
                if (gVar != null) {
                    gVar.F(h5Var.a0.getFinalHeight(), h5Var.z1() + ((h5Var.U0.d(1) && h5Var.i0.getVisibility() == 0) ? h5Var.i0.getMeasuredHeight() : 0));
                }
                h5Var.T1();
                break;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (photoViewer.D0.getVisibility() != 8) {
                    int dp = (((i12 - i10) - (photoViewer.O0.getVisibility() == 0 ? AndroidUtilities.dp(63.0f) : 0)) - photoViewer.D0.getMeasuredWidth()) / 2;
                    ua1 ua1Var = photoViewer.D0;
                    ua1Var.layout(dp, ua1Var.getTop(), photoViewer.D0.getMeasuredWidth() + dp, photoViewer.D0.getMeasuredHeight() + photoViewer.D0.getTop());
                    break;
                }
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int left;
        int boundsRight;
        int i12;
        switch (this.a) {
            case 0:
                f5 f5Var = (f5) this.e;
                v1 v1Var = f5Var.n0;
                v1Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = f5Var.s0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(v1Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(v1Var.getMeasuredHeight(), TLObject.FLAG_30));
                }
                int measuredWidth = v1Var.getMeasuredWidth();
                int i13 = 0;
                for (int i14 = 0; i14 < v1Var.getChildCount(); i14++) {
                    View childAt = v1Var.getChildAt(i14);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                        left2 = childAt.getLeft() + s1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = s1Var.getBoundsRight();
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                        left2 = childAt.getLeft() + v0Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = v0Var.getBoundsRight();
                    } else {
                        measuredWidth = Math.min(left2, measuredWidth);
                        i13 = Math.max(right, i13);
                    }
                    right = boundsRight + left;
                    measuredWidth = Math.min(left2, measuredWidth);
                    i13 = Math.max(right, i13);
                }
                setMeasuredDimension(i13 - measuredWidth, v1Var.getMeasuredHeight());
                break;
            case 1:
                c6 c6Var = (c6) this.d;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                TextView textView = limitPreviewView.w;
                cg.y yVar = limitPreviewView.c0;
                o6 o6Var = limitPreviewView.J;
                cg.y yVar2 = limitPreviewView.b0;
                o6 o6Var2 = limitPreviewView.v;
                if (getChildCount() == 2) {
                    int size = View.MeasureSpec.getSize(i10);
                    int size2 = View.MeasureSpec.getSize(i11);
                    yVar2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                    int max = Math.max(yVar2.getMeasuredWidth(), o6Var.getMeasuredWidth() + AndroidUtilities.dp(24.0f) + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() + AndroidUtilities.dp(24.0f) : 0));
                    yVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                    if (limitPreviewView.L) {
                        float f9 = limitPreviewView.a;
                        if (f9 == 0.0f) {
                            limitPreviewView.n = 0;
                            if (!limitPreviewView.Q && !limitPreviewView.R) {
                                o6Var2.setTextColor((!limitPreviewView.H && limitPreviewView.a0 == null) ? g6.v0(g6.G6, c6Var) : -1);
                                o6Var.setTextColor(limitPreviewView.a0 == null ? g6.v0(g6.G6, c6Var) : -1);
                            }
                        } else if (f9 < 1.0f) {
                            float measuredWidth2 = limitPreviewView.H ? 0.0f : yVar2.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            limitPreviewView.n = (int) ((((size - measuredWidth2) - (limitPreviewView.H ? 0.0f : yVar.getMeasuredWidth() - AndroidUtilities.dp(8.0f))) * limitPreviewView.a) + measuredWidth2);
                            if (!limitPreviewView.Q && !limitPreviewView.R) {
                                o6Var2.setTextColor((!limitPreviewView.H && limitPreviewView.a0 == null) ? g6.v0(g6.G6, c6Var) : -1);
                                o6Var.setTextColor(-1);
                            }
                        } else {
                            limitPreviewView.n = size;
                            if (!limitPreviewView.Q && !limitPreviewView.R) {
                                o6Var2.setTextColor(-1);
                                o6Var.setTextColor(-1);
                            }
                        }
                    } else {
                        int clamp = (int) Utilities.clamp(size * limitPreviewView.a, size - Math.max(yVar.getMeasuredWidth(), (limitPreviewView.K.getMeasuredWidth() + AndroidUtilities.dp(24.0f)) + (o6Var2.getVisibility() == 0 ? o6Var2.getMeasuredWidth() + AndroidUtilities.dp(24.0f) : 0)), max);
                        limitPreviewView.n = clamp;
                        yVar2.measure(View.MeasureSpec.makeMeasureSpec(clamp, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                        yVar.measure(View.MeasureSpec.makeMeasureSpec(size - limitPreviewView.n, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                    }
                    setMeasuredDimension(size, size2);
                    break;
                } else {
                    super.onMeasure(i10, i11);
                    break;
                }
                break;
            case 2:
            case 4:
            case 6:
            case 7:
            default:
                super.onMeasure(i10, i11);
                break;
            case 3:
                cg.p1 p1Var = (cg.p1) this.e;
                p1Var.H = 0;
                ScrollView scrollView = (ScrollView) this.b;
                scrollView.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_31));
                int size3 = View.MeasureSpec.getSize(i11) - scrollView.getMeasuredHeight();
                i12 = ((org.telegram.ui.ActionBar.f3) p1Var).backgroundPaddingTop;
                p1Var.H = i12 + size3;
                super.onMeasure(i10, i11);
                p1Var.y();
                break;
            case 5:
                h5 h5Var = (h5) this.e;
                int bottomInset = h5Var.getBottomInset();
                int i15 = 0;
                setPadding(0, 0, 0, bottomInset);
                h5Var.a0.H.setPadding(0, 0, 0, bottomInset);
                int size4 = View.MeasureSpec.getSize(i11);
                h5Var.h = size4;
                int size5 = View.MeasureSpec.getSize(i10);
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt2 = getChildAt(i16);
                    if (childAt2 instanceof nh.t3) {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_30));
                    } else if (childAt2 == h5Var.d) {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec(size4 - bottomInset, TLObject.FLAG_30));
                    } else {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec((childAt2.getLayoutParams() == null || childAt2.getLayoutParams().height != -1) ? 9999 : size4, TLObject.FLAG_31));
                    }
                }
                setMeasuredDimension(size5, size4);
                cg.g gVar = h5Var.M0;
                if (gVar != null) {
                    int finalHeight = h5Var.a0.getFinalHeight();
                    int z12 = h5Var.z1();
                    if (h5Var.U0.d(1) && h5Var.i0.getVisibility() == 0) {
                        i15 = h5Var.i0.getMeasuredHeight();
                    }
                    gVar.F(finalHeight, z12 + i15);
                    break;
                }
                break;
            case 8:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
                break;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                ((FrameLayout.LayoutParams) photoViewer.D0.getLayoutParams()).rightMargin = photoViewer.O0.getVisibility() == 0 ? AndroidUtilities.dp(63.0f) : 0;
                super.onMeasure(i10, i11);
                break;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f9) {
        switch (this.a) {
            case 9:
                super.setAlpha(f9);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.M7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.M7.setAlpha(f9);
                }
                xr0 xr0Var = photoViewer.Q1;
                if (xr0Var != null && xr0Var.getVisibility() != 8) {
                    photoViewer.Q1.setAlpha(photoViewer.u7[0] * f9);
                }
                yr0 yr0Var = photoViewer.R1;
                if (yr0Var != null && yr0Var.getVisibility() != 8) {
                    photoViewer.R1.setAlpha(f9 * photoViewer.v7[0]);
                    break;
                }
                break;
            default:
                super.setAlpha(f9);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f9) {
        switch (this.a) {
            case 3:
                super.setTranslationY(f9);
                ((cg.p1) this.e).onContainerTranslationYChanged(f9);
                break;
            case 4:
            case 6:
            case 7:
            default:
                super.setTranslationY(f9);
                break;
            case 5:
                super.setTranslationY(f9);
                FrameLayout frameLayout = ((h5) this.e).topBulletinContainer;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
                    break;
                }
                break;
            case 8:
                super.setTranslationY(f9);
                k31 k31Var = (k31) this.e;
                k31Var.topBulletinContainer.setTranslationY(Math.max(k31Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, k31Var.A(true)) + ((-r1.getTop()) - k31Var.topBulletinContainer.getHeight()) + f9);
                break;
            case 9:
                super.setTranslationY(f9);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout2 = photoViewer.M7;
                if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
                    photoViewer.M7.setTranslationY(photoViewer.L0.getTranslationY() - (photoViewer.Q1.getAlpha() * j7.l1.d(46.0f, photoViewer.Q1.getEditTextHeight(), 0)));
                }
                org.telegram.ui.n0 n0Var = photoViewer.T1;
                if (n0Var != null) {
                    n0Var.setTranslationY(f9);
                }
                TextView textView = photoViewer.O7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.O7.setTranslationY(f9);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 9:
                super.setVisibility(i10);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.M7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.M7.setVisibility(i10 == 0 ? 0 : 4);
                    break;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(f5 f5Var, Context context) {
        super(context);
        this.e = f5Var;
        this.b = new Matrix();
        this.c = new float[8];
        this.d = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(LimitPreviewView limitPreviewView, Context context, c6 c6Var) {
        super(context);
        this.e = limitPreviewView;
        this.d = c6Var;
        this.b = new Paint();
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(-1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(Context context, eh.f fVar, c6 c6Var) {
        super(context);
        this.e = fVar;
        this.d = c6Var;
        this.b = new jf.b0(2);
        this.c = new jf.b0(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(cg.p1 p1Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.e = p1Var;
        this.b = scrollView;
        this.c = drawable;
        this.d = new Path();
    }

    public u1(Context context, c6 c6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.b.g(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTextColor(g6.v0(g6.j5, c6Var));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.d = h2Var;
        imageView.setImageDrawable(h2Var);
        h2Var.a(-1);
        addView(imageView, f6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new w21(this, 0));
        b(true);
        setMinimumHeight(AndroidUtilities.dp(56.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(v5 v5Var, Context context) {
        super(context);
        this.e = v5Var;
        this.d = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.b = imageView;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        addView(imageView, f6.e(-2, -2, 1));
        addView(textView, f6.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setMinimumWidth(AndroidUtilities.dp(100.0f));
        int dp = AndroidUtilities.dp(10.0f);
        int k9 = i0.a.k(-16777216, 80);
        setBackground(g6.i0(dp, dp, dp, dp, 0, k9, k9));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(k31 k31Var, Context context) {
        super(context);
        this.e = k31Var;
        this.d = new Path();
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(k31Var.getThemedColor(g6.h5));
        g6.m(paint);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(qc1 qc1Var, Activity activity) {
        super(activity);
        this.e = qc1Var;
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(h5 h5Var, Context context) {
        super(context);
        this.e = h5Var;
        this.b = new RectF();
        this.c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(cg.q0 q0Var, Context context, c6 c6Var) {
        super(context);
        this.e = q0Var;
        this.d = c6Var;
        this.b = new cg.r1(g6.Lj, g6.Mj, -1, -1, c6Var);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.e = photoViewer;
        this.c = new Paint(3);
        this.d = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.b = new Matrix();
    }
}
