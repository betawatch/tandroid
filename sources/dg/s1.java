package dg;

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
import k7.b6;
import lh.c5;
import lh.g5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cc1;
import org.telegram.ui.cd1;
import org.telegram.ui.fs0;
import org.telegram.ui.gs0;
import org.telegram.ui.hb1;
import org.telegram.ui.i31;
import org.telegram.ui.rc1;
import org.telegram.ui.y5;
import ph.o4;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class s1 extends FrameLayout {
    public final /* synthetic */ int a = 7;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ s1(Context context) {
        super(context);
    }

    public float a() {
        g5 g5Var = (g5) this.e;
        return (g5Var.V0.a(3) * g5Var.x0.getMeasuredHeight()) + (g5Var.V0.a(2) * g5Var.v0.getMeasuredHeight()) + (g5Var.V0.a(1) * g5Var.o0.getMeasuredHeight()) + (g5Var.V0.a(0) * g5Var.c0.getMeasuredHeight()) + g5Var.b0.getRealHeight() + 0.0f;
    }

    public void b(boolean z4) {
        ((ImageView) this.b).setVisibility(z4 ? 0 : 8);
        TextView textView = (TextView) this.c;
        boolean z10 = LocaleController.isRTL;
        textView.setLayoutParams(b6.d(-1, -2.0f, 55, (z10 || !z4) ? 22.0f : 53.0f, 14.0f, (z10 && z4) ? 53.0f : 22.0f, 12.0f));
    }

    public void c(int i10, String str) {
        ((TextView) this.c).setText(str);
        ((ImageView) this.b).setImageDrawable(getContext().getDrawable(i10));
    }

    public float d() {
        c5.d dVar;
        float max = Math.max(0.0f, getHeight() - a());
        g5 g5Var = (g5) this.e;
        sl0 sl0Var = g5Var.d;
        int childCount = sl0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = sl0Var.getChildAt(childCount);
            sl0Var.getClass();
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
                    max = childAt.getY() - g5Var.b0.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a2 = (g5Var.V0.a(4) * g5Var.getBottomInset()) + max;
        Float f10 = g5Var.U0;
        return (f10 == null || (dVar = g5Var.V0) == null || dVar.c >= 1.0f) ? a2 : AndroidUtilities.lerp(f10.floatValue(), a2, g5Var.V0.c);
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
                f6 f6Var = (f6) this.d;
                Paint paint = (Paint) this.b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                if (!limitPreviewView.M) {
                    paint.setColor(j6.v0(j6.a7, f6Var));
                } else if (limitPreviewView.W || limitPreviewView.O) {
                    paint.setColor(j6.v0(j6.i6, f6Var));
                } else {
                    paint.setColor(j6.v0(j6.e7, f6Var));
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                eg.x xVar = limitPreviewView.b0;
                if (xVar != null) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ((y5) ((org.telegram.ui.a1) xVar).b).t0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                }
                canvas.save();
                if (!limitPreviewView.M) {
                    canvas.clipRect(limitPreviewView.n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                Paint e = limitPreviewView.O ? limitPreviewView.H : limitPreviewView.b0 != null ? (Paint) this.c : eg.r1.d().e();
                ViewGroup viewGroup = limitPreviewView.y;
                if (viewGroup != null) {
                    eg.q1 q1Var = limitPreviewView.B;
                    if (q1Var != null) {
                        e = q1Var.f;
                        float f10 = limitPreviewView.c;
                        float f11 = -limitPreviewView.C;
                        q1Var.a();
                        Matrix matrix = q1Var.e;
                        matrix.reset();
                        matrix.postScale(1.0f, f10 / 100.0f, 0.0f, 0.0f);
                        matrix.postTranslate(0.0f, f11);
                        q1Var.d.setLocalMatrix(matrix);
                    } else {
                        float f12 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f12 += view.getY();
                        }
                        eg.r1 d = eg.r1.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d.f(globalXOffset2 - getLeft(), -f12, measuredWidth, measuredHeight);
                    }
                } else {
                    eg.r1 d10 = eg.r1.d();
                    int measuredWidth2 = limitPreviewView.getMeasuredWidth();
                    int measuredHeight2 = limitPreviewView.getMeasuredHeight();
                    globalXOffset = limitPreviewView.getGlobalXOffset();
                    d10.f(globalXOffset - getLeft(), -getTop(), measuredWidth2, measuredHeight2);
                }
                int alpha = e.getAlpha();
                if (limitPreviewView.S && (valueAnimator2 = limitPreviewView.f0) != null) {
                    e.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha));
                } else if (limitPreviewView.R && (valueAnimator = limitPreviewView.f0) != null) {
                    e.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha));
                }
                if (limitPreviewView.M) {
                    if (limitPreviewView.I || limitPreviewView.J) {
                        AndroidUtilities.rectTmp.set(limitPreviewView.n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    } else {
                        AndroidUtilities.rectTmp.set(0.0f, 0.0f, limitPreviewView.n, getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), e);
                e.setAlpha(alpha);
                canvas.restore();
                if (limitPreviewView.B == null && limitPreviewView.a0) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                break;
            case 2:
                Paint paint2 = (Paint) this.c;
                paint2.setColor(j6.v0(j6.Ii, (f6) this.d));
                eg.q0 q0Var = (eg.q0) this.e;
                canvas.drawLine(AndroidUtilities.dp(18.0f), getHeight() / 2.0f, q0Var.d.getLeft() - AndroidUtilities.dp(20.0f), getHeight() / 2.0f, paint2);
                canvas.drawLine(AndroidUtilities.dp(20.0f) + q0Var.d.getRight(), getHeight() / 2.0f, getWidth() - AndroidUtilities.dp(18.0f), getHeight() / 2.0f, paint2);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(q0Var.d.getLeft() - AndroidUtilities.dp(15.0f), ((q0Var.d.getBottom() + q0Var.d.getTop()) - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(15.0f) + q0Var.d.getRight(), (AndroidUtilities.dp(30.0f) + (q0Var.d.getBottom() + q0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF2.left, rectF2.top);
                rectF2.set(0.0f, 0.0f, rectF2.width(), rectF2.height());
                eg.q1 q1Var2 = (eg.q1) this.b;
                q1Var2.e(rectF2);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), q1Var2.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 3:
                Drawable drawable3 = (Drawable) this.c;
                eg.o1 o1Var = (eg.o1) this.e;
                drawable = ((org.telegram.ui.ActionBar.g3) o1Var).shadowDrawable;
                int i13 = o1Var.J;
                i10 = ((org.telegram.ui.ActionBar.g3) o1Var).backgroundPaddingTop;
                drawable.setBounds(0, org.telegram.ui.b.C(2.0f, i10 + i13, 1), getMeasuredWidth(), getMeasuredHeight());
                drawable2 = ((org.telegram.ui.ActionBar.g3) o1Var).shadowDrawable;
                drawable2.draw(canvas);
                super.dispatchDraw(canvas);
                eg.l1 l1Var = o1Var.K;
                if (l1Var != null && l1Var.getVisibility() == 0 && o1Var.K.getAlpha() != 0.0f) {
                    drawable3.setBounds(0, o1Var.K.getBottom(), getMeasuredWidth(), drawable3.getIntrinsicHeight() + o1Var.K.getBottom());
                    drawable3.setAlpha((int) (o1Var.K.getAlpha() * 255.0f));
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
                g5 g5Var = (g5) this.e;
                g5Var.H(canvas, this);
                canvas.save();
                float d11 = d();
                float dp = AndroidUtilities.dp(12.0f);
                RectF rectF3 = (RectF) this.b;
                i11 = ((org.telegram.ui.ActionBar.g3) g5Var).backgroundPaddingLeft;
                int width = getWidth();
                i12 = ((org.telegram.ui.ActionBar.g3) g5Var).backgroundPaddingLeft;
                rectF3.set(i11, d11, width - i12, getHeight() + dp);
                Paint paint3 = (Paint) this.c;
                paint3.setColor(g5Var.getThemedColor(j6.h5));
                Path path = (Path) this.d;
                path.rewind();
                path.addRoundRect(rectF3, dp, dp, Path.Direction.CW);
                canvas.drawPath(path, paint3);
                super.dispatchDraw(canvas);
                e();
                canvas.restore();
                pa paVar = g5Var.e;
                if (paVar != null && paVar.getVisibility() == 0 && paVar.getAlpha() > 0.0f) {
                    if (paVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(paVar.getX(), paVar.getY(), paVar.getX() + paVar.getMeasuredWidth(), paVar.getY() + paVar.getMeasuredHeight(), (int) (paVar.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(paVar.getX(), paVar.getY(), paVar.getX() + paVar.getMeasuredWidth(), paVar.getY() + paVar.getMeasuredHeight());
                    }
                    canvas.translate(paVar.getX(), paVar.getY());
                    paVar.draw(canvas);
                    canvas.restore();
                }
                g5Var.G(canvas, this);
                break;
            case 8:
                Path path2 = (Path) this.d;
                v31 v31Var = (v31) this.e;
                float A = v31Var.A(true);
                float lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(12.0f), k7.n.a(A / AndroidUtilities.dpf2(24.0f), 0.0f, 1.0f));
                v31Var.x.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, A));
                boolean z4 = A <= ((float) AndroidUtilities.statusBarHeight) / 2.0f;
                Boolean bool = (Boolean) this.c;
                if (bool == null || bool.booleanValue() != z4) {
                    this.c = Boolean.valueOf(z4);
                    AndroidUtilities.setLightStatusBar(v31Var.getWindow(), AndroidUtilities.computePerceivedBrightness(z4 ? v31Var.getThemedColor(j6.h5) : j6.v(v31Var.getThemedColor(j6.s8), 855638016)) > 0.721f);
                }
                v31Var.topBulletinContainer.setTranslationY(Math.max(v31Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, A) + getTranslationY() + ((-r3.getTop()) - v31Var.topBulletinContainer.getHeight()));
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
                if (!photoViewer.P4) {
                    int measuredHeight3 = photoViewer.k0.getVisibility() == 0 ? getMeasuredHeight() - AndroidUtilities.dp(48.0f) : 0;
                    int i14 = photoViewer.Z1;
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
                cd1 cd1Var = (cd1) this.e;
                paint7.setShadowLayer(dpf2, 0.0f, dpf22, i0.a.k(-16777216, (int) (cd1Var.O1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF5, dp2, dp2, paint7);
                rc1 rc1Var = cd1Var.u0;
                cc1 cc1Var = cd1Var.a;
                j6.s(this, rc1Var, cc1Var);
                Paint G = cc1Var.G("paintChatActionBackground");
                int alpha2 = G.getAlpha();
                G.setAlpha((int) (cd1Var.O1.getAlpha() * alpha2));
                canvas.drawRoundRect(rectF5, dp2, dp2, G);
                G.setAlpha(alpha2);
                if (cd1Var.J1) {
                    float f13 = cd1Var.k1;
                    if (f13 > 0.0f) {
                        paint5.setColor(i0.a.k(-16777216, (int) (f13 * 255.0f * cd1Var.l1)));
                        canvas.drawRoundRect(rectF5, dp2, dp2, paint5);
                    }
                }
                paint6.setColor(520093695);
                paint6.setAlpha((int) (cd1Var.O1.getAlpha() * 30.0f));
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
                eg.o1 o1Var = (eg.o1) this.e;
                if (motionEvent.getAction() == 0) {
                    float y10 = motionEvent.getY();
                    int i11 = o1Var.J;
                    i10 = ((org.telegram.ui.ActionBar.g3) o1Var).backgroundPaddingTop;
                    if (y10 < AndroidUtilities.dp(2.0f) + (i11 - i10)) {
                        o1Var.dismiss();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                g5 g5Var = (g5) this.e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < d()) {
                    viewGroup = ((org.telegram.ui.ActionBar.g3) g5Var).containerView;
                    if (viewGroup.isAttachedToWindow()) {
                        g5Var.dismiss();
                        return true;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 8:
                v31 v31Var = (v31) this.e;
                if (v31Var.G != null && v31Var.H != null) {
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                        Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + v31Var.G.y());
                    }
                    if (v31Var.G.y() && v31Var.H.onTouchEvent(motionEvent)) {
                        Log.d("TA2", "overlay consumed (handle)");
                        return true;
                    }
                    boolean b10 = v31Var.H.b(motionEvent);
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
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ((y5) this.e).t0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
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
        org.telegram.ui.Cells.t1 cell;
        ImageReceiver photoImage;
        switch (this.a) {
            case 0:
                float[] fArr = (float[]) this.c;
                Path path = (Path) this.d;
                Matrix matrix = (Matrix) this.b;
                o4 o4Var = (o4) this.e;
                t1 t1Var = o4Var.o0;
                if (view != o4Var.t0) {
                    return super.drawChild(canvas, view, j10);
                }
                cell = o4Var.getCell();
                if (cell == null || (photoImage = cell.getPhotoImage()) == null) {
                    return false;
                }
                matrix.reset();
                float max = Math.max(photoImage.getImageWidth() / o4Var.v0, photoImage.getImageHeight() / o4Var.w0);
                matrix.postScale((o4Var.v0 / o4Var.t0.getWidth()) * max, (o4Var.w0 / o4Var.t0.getHeight()) * max);
                matrix.postTranslate((photoImage.getCenterX() + (cell.getX() + t1Var.getX())) - ((o4Var.v0 * max) / 2.0f), (photoImage.getCenterY() + (cell.getY() + t1Var.getY())) - ((o4Var.w0 * max) / 2.0f));
                o4Var.t0.setTransform(matrix);
                canvas.save();
                path.rewind();
                AndroidUtilities.rectTmp.set(photoImage.getImageX() + cell.getX() + t1Var.getX(), photoImage.getImageY() + cell.getY() + t1Var.getY(), photoImage.getImageX2() + cell.getX() + t1Var.getX(), photoImage.getImageY2() + cell.getY() + t1Var.getY());
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
                rectF.set(getPaddingLeft(), AndroidUtilities.dp(18.0f) + ((eg.o1) this.e).J, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                path2.addRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                super.drawChild(canvas, view, j10);
                canvas.restore();
                return true;
            case 4:
                f6 f6Var = (f6) this.d;
                lf.b0 b0Var = (lf.b0) this.c;
                lf.b0 b0Var2 = (lf.b0) this.b;
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                gh.f fVar = (gh.f) this.e;
                int i12 = (int) fVar.U.e;
                if (view == fVar.e0 && i12 > 0) {
                    b0Var2.setBounds(0, AndroidUtilities.dp(40.0f), getWidth(), AndroidUtilities.dp(48.0f));
                    int i13 = j6.h5;
                    b0Var2.b(j6.v0(i13, f6Var));
                    b0Var2.draw(canvas);
                    int dp = AndroidUtilities.dp(48.0f) + i12;
                    b0Var.setBounds(0, dp - AndroidUtilities.dp(8.0f), getWidth(), dp);
                    b0Var.b(j6.v0(i13, f6Var));
                    b0Var.draw(canvas);
                }
                return drawChild2;
            case 5:
                g5 g5Var = (g5) this.e;
                if (view == g5Var.e) {
                    return false;
                }
                if (view == g5Var.a0) {
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
        g5 g5Var = (g5) this.e;
        lh.q3 q3Var = g5Var.a0;
        q3Var.setTranslationY(d - q3Var.getHeight());
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(d - q3Var.getHeight(), 0.0f, AndroidUtilities.dp(32.0f)));
        q3Var.setAlpha(g5Var.V0.a(0) * clamp01);
        q3Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        q3Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        c5 c5Var = g5Var.b0;
        c5Var.setTranslationY(d);
        g5Var.c0.setTranslationY(c5Var.getRealHeight() + d);
        g5Var.o0.setTranslationY(c5Var.getRealHeight() + d);
        g5Var.v0.setTranslationY(c5Var.getRealHeight() + d);
        g5Var.x0.setTranslationY(c5Var.getRealHeight() + d);
        FrameLayout frameLayout = g5Var.topBulletinContainer;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
        }
        AndroidUtilities.updateViewVisibilityAnimated(g5Var.k0, g5Var.d.canScrollVertically(1));
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
                ic.a(this, new gg.w(8));
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
                ic.h(this);
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
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int left;
        int boundsRight;
        switch (this.a) {
            case 0:
                o4 o4Var = (o4) this.e;
                t1 t1Var = o4Var.o0;
                int measuredWidth = t1Var.getMeasuredWidth();
                int i14 = 0;
                for (int i15 = 0; i15 < t1Var.getChildCount(); i15++) {
                    View childAt = t1Var.getChildAt(i15);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                        left2 = childAt.getLeft() + t1Var2.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = t1Var2.getBoundsRight();
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
                t1Var.layout(-measuredWidth, 0, t1Var.getMeasuredWidth() - measuredWidth, t1Var.getMeasuredHeight());
                TextureView textureView = o4Var.t0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), t1Var.getMeasuredHeight());
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
                    super.onLayout(z4, i10, i11, i12, i13);
                    break;
                }
            case 5:
                super.onLayout(z4, i10, i11, i12, i13);
                g5 g5Var = (g5) this.e;
                eg.g gVar = g5Var.N0;
                if (gVar != null) {
                    gVar.F(g5Var.b0.getFinalHeight(), g5Var.z1() + ((g5Var.V0.d(1) && g5Var.j0.getVisibility() == 0) ? g5Var.j0.getMeasuredHeight() : 0));
                }
                g5Var.T1();
                break;
            case 9:
                super.onLayout(z4, i10, i11, i12, i13);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (photoViewer.E0.getVisibility() != 8) {
                    int dp = (((i12 - i10) - (photoViewer.P0.getVisibility() == 0 ? AndroidUtilities.dp(63.0f) : 0)) - photoViewer.E0.getMeasuredWidth()) / 2;
                    hb1 hb1Var = photoViewer.E0;
                    hb1Var.layout(dp, hb1Var.getTop(), photoViewer.E0.getMeasuredWidth() + dp, photoViewer.E0.getMeasuredHeight() + photoViewer.E0.getTop());
                    break;
                }
                break;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
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
                o4 o4Var = (o4) this.e;
                t1 t1Var = o4Var.o0;
                t1Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = o4Var.t0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(t1Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(t1Var.getMeasuredHeight(), TLObject.FLAG_30));
                }
                int measuredWidth = t1Var.getMeasuredWidth();
                int i13 = 0;
                for (int i14 = 0; i14 < t1Var.getChildCount(); i14++) {
                    View childAt = t1Var.getChildAt(i14);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                        left2 = childAt.getLeft() + t1Var2.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = t1Var2.getBoundsRight();
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
                setMeasuredDimension(i13 - measuredWidth, t1Var.getMeasuredHeight());
                break;
            case 1:
                f6 f6Var = (f6) this.d;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                TextView textView = limitPreviewView.w;
                eg.y yVar = limitPreviewView.d0;
                k6 k6Var = limitPreviewView.K;
                eg.y yVar2 = limitPreviewView.c0;
                k6 k6Var2 = limitPreviewView.v;
                if (getChildCount() == 2) {
                    int size = View.MeasureSpec.getSize(i10);
                    int size2 = View.MeasureSpec.getSize(i11);
                    yVar2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                    int max = Math.max(yVar2.getMeasuredWidth(), k6Var.getMeasuredWidth() + AndroidUtilities.dp(24.0f) + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() + AndroidUtilities.dp(24.0f) : 0));
                    yVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                    if (limitPreviewView.M) {
                        float f10 = limitPreviewView.a;
                        if (f10 == 0.0f) {
                            limitPreviewView.n = 0;
                            if (!limitPreviewView.R && !limitPreviewView.S) {
                                k6Var2.setTextColor((!limitPreviewView.I && limitPreviewView.b0 == null) ? j6.v0(j6.G6, f6Var) : -1);
                                k6Var.setTextColor(limitPreviewView.b0 == null ? j6.v0(j6.G6, f6Var) : -1);
                            }
                        } else if (f10 < 1.0f) {
                            float measuredWidth2 = limitPreviewView.I ? 0.0f : yVar2.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            limitPreviewView.n = (int) ((((size - measuredWidth2) - (limitPreviewView.I ? 0.0f : yVar.getMeasuredWidth() - AndroidUtilities.dp(8.0f))) * limitPreviewView.a) + measuredWidth2);
                            if (!limitPreviewView.R && !limitPreviewView.S) {
                                k6Var2.setTextColor((!limitPreviewView.I && limitPreviewView.b0 == null) ? j6.v0(j6.G6, f6Var) : -1);
                                k6Var.setTextColor(-1);
                            }
                        } else {
                            limitPreviewView.n = size;
                            if (!limitPreviewView.R && !limitPreviewView.S) {
                                k6Var2.setTextColor(-1);
                                k6Var.setTextColor(-1);
                            }
                        }
                    } else {
                        int clamp = (int) Utilities.clamp(size * limitPreviewView.a, size - Math.max(yVar.getMeasuredWidth(), (limitPreviewView.L.getMeasuredWidth() + AndroidUtilities.dp(24.0f)) + (k6Var2.getVisibility() == 0 ? k6Var2.getMeasuredWidth() + AndroidUtilities.dp(24.0f) : 0)), max);
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
                eg.o1 o1Var = (eg.o1) this.e;
                o1Var.I = 0;
                ScrollView scrollView = (ScrollView) this.b;
                scrollView.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_31));
                int size3 = View.MeasureSpec.getSize(i11) - scrollView.getMeasuredHeight();
                i12 = ((org.telegram.ui.ActionBar.g3) o1Var).backgroundPaddingTop;
                o1Var.I = i12 + size3;
                super.onMeasure(i10, i11);
                o1Var.y();
                break;
            case 5:
                g5 g5Var = (g5) this.e;
                int bottomInset = g5Var.getBottomInset();
                int i15 = 0;
                setPadding(0, 0, 0, bottomInset);
                g5Var.b0.I.setPadding(0, 0, 0, bottomInset);
                int size4 = View.MeasureSpec.getSize(i11);
                g5Var.h = size4;
                int size5 = View.MeasureSpec.getSize(i10);
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt2 = getChildAt(i16);
                    if (childAt2 instanceof ph.f3) {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_30));
                    } else if (childAt2 == g5Var.d) {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec(size4 - bottomInset, TLObject.FLAG_30));
                    } else {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec((childAt2.getLayoutParams() == null || childAt2.getLayoutParams().height != -1) ? 9999 : size4, TLObject.FLAG_31));
                    }
                }
                setMeasuredDimension(size5, size4);
                eg.g gVar = g5Var.N0;
                if (gVar != null) {
                    int finalHeight = g5Var.b0.getFinalHeight();
                    int z12 = g5Var.z1();
                    if (g5Var.V0.d(1) && g5Var.j0.getVisibility() == 0) {
                        i15 = g5Var.j0.getMeasuredHeight();
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
                ((FrameLayout.LayoutParams) photoViewer.E0.getLayoutParams()).rightMargin = photoViewer.P0.getVisibility() == 0 ? AndroidUtilities.dp(63.0f) : 0;
                super.onMeasure(i10, i11);
                break;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 9:
                super.setAlpha(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.N7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.N7.setAlpha(f10);
                }
                fs0 fs0Var = photoViewer.R1;
                if (fs0Var != null && fs0Var.getVisibility() != 8) {
                    photoViewer.R1.setAlpha(photoViewer.v7[0] * f10);
                }
                gs0 gs0Var = photoViewer.S1;
                if (gs0Var != null && gs0Var.getVisibility() != 8) {
                    photoViewer.S1.setAlpha(f10 * photoViewer.w7[0]);
                    break;
                }
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 3:
                super.setTranslationY(f10);
                ((eg.o1) this.e).onContainerTranslationYChanged(f10);
                break;
            case 4:
            case 6:
            case 7:
            default:
                super.setTranslationY(f10);
                break;
            case 5:
                super.setTranslationY(f10);
                FrameLayout frameLayout = ((g5) this.e).topBulletinContainer;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
                    break;
                }
                break;
            case 8:
                super.setTranslationY(f10);
                v31 v31Var = (v31) this.e;
                v31Var.topBulletinContainer.setTranslationY(Math.max(v31Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, v31Var.A(true)) + ((-r1.getTop()) - v31Var.topBulletinContainer.getHeight()) + f10);
                break;
            case 9:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout2 = photoViewer.N7;
                if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
                    photoViewer.N7.setTranslationY(photoViewer.M0.getTranslationY() - (photoViewer.R1.getAlpha() * kh.a2.c(46.0f, photoViewer.R1.getEditTextHeight(), 0)));
                }
                org.telegram.ui.l0 l0Var = photoViewer.U1;
                if (l0Var != null) {
                    l0Var.setTranslationY(f10);
                }
                TextView textView = photoViewer.P7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.P7.setTranslationY(f10);
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
                FrameLayout frameLayout = photoViewer.N7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.N7.setVisibility(i10 == 0 ? 0 : 4);
                    break;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(o4 o4Var, Context context) {
        super(context);
        this.e = o4Var;
        this.b = new Matrix();
        this.c = new float[8];
        this.d = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(LimitPreviewView limitPreviewView, Context context, f6 f6Var) {
        super(context);
        this.e = limitPreviewView;
        this.d = f6Var;
        this.b = new Paint();
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(-1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(Context context, gh.f fVar, f6 f6Var) {
        super(context);
        this.e = fVar;
        this.d = f6Var;
        this.b = new lf.b0(2);
        this.c = new lf.b0(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(eg.o1 o1Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.e = o1Var;
        this.b = scrollView;
        this.c = drawable;
        this.d = new Path();
    }

    public s1(Context context, f6 f6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.b.g(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTextColor(j6.v0(j6.j5, f6Var));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.d = i2Var;
        imageView.setImageDrawable(i2Var);
        i2Var.a(-1);
        addView(imageView, b6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new i31(this, 0));
        b(true);
        setMinimumHeight(AndroidUtilities.dp(56.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(y5 y5Var, Context context) {
        super(context);
        this.e = y5Var;
        this.d = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.b = imageView;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        addView(imageView, b6.e(-2, -2, 1));
        addView(textView, b6.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setMinimumWidth(AndroidUtilities.dp(100.0f));
        int dp = AndroidUtilities.dp(10.0f);
        int k10 = i0.a.k(-16777216, 80);
        setBackground(j6.i0(dp, dp, dp, dp, 0, k10, k10));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(v31 v31Var, Context context) {
        super(context);
        this.e = v31Var;
        this.d = new Path();
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(v31Var.getThemedColor(j6.h5));
        j6.m(paint);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(cd1 cd1Var, Activity activity) {
        super(activity);
        this.e = cd1Var;
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(g5 g5Var, Context context) {
        super(context);
        this.e = g5Var;
        this.b = new RectF();
        this.c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(eg.q0 q0Var, Context context, f6 f6Var) {
        super(context);
        this.e = q0Var;
        this.d = f6Var;
        this.b = new eg.q1(j6.Lj, j6.Mj, -1, -1, f6Var);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.e = photoViewer;
        this.c = new Paint(3);
        this.d = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.b = new Matrix();
    }
}
