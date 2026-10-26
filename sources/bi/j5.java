package bi;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ic1;
import org.telegram.ui.os0;
import org.telegram.ui.ps0;
import org.telegram.ui.sb1;
import org.telegram.ui.t21;
import org.telegram.ui.tc1;
import org.telegram.ui.xa1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class j5 extends FrameLayout {
    public final /* synthetic */ int a = 2;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ j5(Context context) {
        super(context);
    }

    public float a() {
        h7 h7Var = (h7) this.e;
        return (h7Var.b1.a(3) * h7Var.D0.getMeasuredHeight()) + (h7Var.b1.a(2) * h7Var.B0.getMeasuredHeight()) + (h7Var.b1.a(1) * h7Var.s0.getMeasuredHeight()) + (h7Var.b1.a(0) * h7Var.g0.getMeasuredHeight()) + h7Var.f0.getRealHeight() + 0.0f;
    }

    public void b(boolean z10) {
        ((ImageView) this.b).setVisibility(z10 ? 0 : 8);
        TextView textView = (TextView) this.c;
        boolean z11 = LocaleController.isRTL;
        textView.setLayoutParams(gb1.h(-1, -2.0f, 55, (z11 || !z10) ? 22.0f : 53.0f, 14.0f, (z11 && z10) ? 53.0f : 22.0f, 12.0f));
    }

    public void c(int i10, String str) {
        ((TextView) this.d).setText(str);
        ((ImageView) this.c).setImageDrawable(getContext().getDrawable(i10));
    }

    public float d() {
        c6 c6Var;
        float max = Math.max(0.0f, getHeight() - a());
        h7 h7Var = (h7) this.e;
        mm0 mm0Var = h7Var.d;
        int childCount = mm0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = mm0Var.getChildAt(childCount);
            mm0Var.getClass();
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
                    max = childAt.getY() - h7Var.f0.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a2 = (h7Var.b1.a(4) * h7Var.getBottomInset()) + max;
        Float f7 = h7Var.a1;
        return (f7 == null || (c6Var = h7Var.b1) == null || c6Var.a >= 1.0f) ? a2 : AndroidUtilities.lerp(f7.floatValue(), a2, h7Var.b1.a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        float globalXOffset;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float globalXOffset2;
        Drawable drawable;
        int i14;
        Drawable drawable2;
        switch (this.a) {
            case 0:
                h7 h7Var = (h7) this.e;
                org.telegram.ui.Components.xa xaVar = h7Var.e;
                FrameLayout frameLayout = h7Var.l0;
                h7Var.I(canvas, this);
                canvas.save();
                float d = d();
                float dp = AndroidUtilities.dp(12.0f);
                RectF rectF = (RectF) this.b;
                i10 = ((org.telegram.ui.ActionBar.k3) h7Var).backgroundPaddingLeft;
                int width = getWidth();
                i11 = ((org.telegram.ui.ActionBar.k3) h7Var).backgroundPaddingLeft;
                rectF.set(i10, d, width - i11, getHeight() + dp);
                Paint paint = (Paint) this.c;
                paint.setColor(h7Var.getThemedColor(org.telegram.ui.ActionBar.y6.h5));
                Path path = (Path) this.d;
                path.rewind();
                path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                if (getPaddingBottom() > 0 && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    paint.setAlpha((int) (frameLayout.getAlpha() * 255.0f));
                    i12 = ((org.telegram.ui.ActionBar.k3) h7Var).backgroundPaddingLeft;
                    float height = getHeight() - getPaddingBottom();
                    int width2 = getWidth();
                    i13 = ((org.telegram.ui.ActionBar.k3) h7Var).backgroundPaddingLeft;
                    canvas.drawRect(i12, height, width2 - i13, getHeight(), paint);
                    paint.setAlpha(255);
                }
                e();
                canvas.restore();
                if (xaVar != null && xaVar.getVisibility() == 0 && xaVar.getAlpha() > 0.0f) {
                    if (xaVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(xaVar.getX(), xaVar.getY(), xaVar.getMeasuredWidth() + xaVar.getX(), xaVar.getMeasuredHeight() + xaVar.getY(), (int) (xaVar.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(xaVar.getX(), xaVar.getY(), xaVar.getX() + xaVar.getMeasuredWidth(), xaVar.getY() + xaVar.getMeasuredHeight());
                    }
                    canvas.translate(xaVar.getX(), xaVar.getY());
                    xaVar.draw(canvas);
                    canvas.restore();
                }
                h7Var.H(canvas, this);
                break;
            case 1:
            case 2:
            case 4:
            case 6:
            default:
                super.dispatchDraw(canvas);
                break;
            case 3:
                LinearGradient linearGradient = (LinearGradient) this.b;
                Matrix matrix = (Matrix) this.d;
                Paint paint2 = (Paint) this.c;
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (!photoViewer.S4) {
                    int measuredHeight = photoViewer.n0.getVisibility() == 0 ? getMeasuredHeight() - AndroidUtilities.dp(48.0f) : 0;
                    int i15 = photoViewer.c2;
                    if (i15 == 0 || i15 == 2 || i15 == -1) {
                        matrix.reset();
                        float min = Math.min(AndroidUtilities.dp(40.0f), getMeasuredHeight() - measuredHeight);
                        matrix.postTranslate(0.0f, measuredHeight);
                        matrix.postScale(1.0f, min / 16.0f);
                        linearGradient.setLocalMatrix(matrix);
                        paint2.setShader(linearGradient);
                    } else {
                        paint2.setShader(null);
                        paint2.setColor(2130706432);
                    }
                    canvas.drawRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight(), paint2);
                }
                super.dispatchDraw(canvas);
                break;
            case 5:
                Paint paint3 = (Paint) this.d;
                Paint paint4 = (Paint) this.b;
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float dp2 = AndroidUtilities.dp(8.0f);
                Paint paint5 = (Paint) this.c;
                paint5.setColor(0);
                float dpf2 = AndroidUtilities.dpf2(1.0f);
                float dpf22 = AndroidUtilities.dpf2(0.33f);
                tc1 tc1Var = (tc1) this.e;
                paint5.setShadowLayer(dpf2, 0.0f, dpf22, i0.a.o(-16777216, (int) (tc1Var.S1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF2, dp2, dp2, paint5);
                ic1 ic1Var = tc1Var.y0;
                sb1 sb1Var = tc1Var.a;
                org.telegram.ui.ActionBar.y6.s(this, ic1Var, sb1Var);
                Paint d10 = sb1Var.d("paintChatActionBackground");
                int alpha = d10.getAlpha();
                d10.setAlpha((int) (tc1Var.S1.getAlpha() * alpha));
                canvas.drawRoundRect(rectF2, dp2, dp2, d10);
                d10.setAlpha(alpha);
                if (tc1Var.N1) {
                    float f7 = tc1Var.o1;
                    if (f7 > 0.0f) {
                        paint3.setColor(i0.a.o(-16777216, (int) (f7 * 255.0f * tc1Var.p1)));
                        canvas.drawRoundRect(rectF2, dp2, dp2, paint3);
                    }
                }
                paint4.setColor(520093695);
                paint4.setAlpha((int) (tc1Var.S1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF2, dp2, dp2, paint4);
                super.dispatchDraw(canvas);
                break;
            case 7:
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.d;
                Paint paint6 = (Paint) this.c;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                if (!limitPreviewView.P) {
                    paint6.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.a7, u6Var));
                } else if (limitPreviewView.c0 || limitPreviewView.R) {
                    paint6.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.i6, u6Var));
                } else {
                    paint6.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.e7, u6Var));
                }
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                tg.t tVar = limitPreviewView.e0;
                if (tVar != null) {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ((org.telegram.ui.x5) ((org.telegram.ui.y0) tVar).b).r0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint6);
                }
                canvas.save();
                if (!limitPreviewView.P) {
                    canvas.clipRect(limitPreviewView.n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                Paint e = limitPreviewView.R ? limitPreviewView.K : limitPreviewView.e0 != null ? (Paint) this.b : tg.b1.d().e();
                ViewGroup viewGroup = limitPreviewView.y;
                if (viewGroup != null) {
                    tg.a1 a1Var = limitPreviewView.E;
                    if (a1Var != null) {
                        e = a1Var.f;
                        float f10 = limitPreviewView.c;
                        float f11 = -limitPreviewView.F;
                        a1Var.a();
                        Matrix matrix2 = a1Var.e;
                        matrix2.reset();
                        matrix2.postScale(1.0f, f10 / 100.0f, 0.0f, 0.0f);
                        matrix2.postTranslate(0.0f, f11);
                        a1Var.d.setLocalMatrix(matrix2);
                    } else {
                        float f12 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f12 += view.getY();
                        }
                        tg.b1 d11 = tg.b1.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight2 = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d11.f(globalXOffset2 - getLeft(), -f12, measuredWidth, measuredHeight2);
                    }
                } else {
                    tg.b1 d12 = tg.b1.d();
                    int measuredWidth2 = limitPreviewView.getMeasuredWidth();
                    int measuredHeight3 = limitPreviewView.getMeasuredHeight();
                    globalXOffset = limitPreviewView.getGlobalXOffset();
                    d12.f(globalXOffset - getLeft(), -getTop(), measuredWidth2, measuredHeight3);
                }
                int alpha2 = e.getAlpha();
                if (limitPreviewView.V && (valueAnimator2 = limitPreviewView.i0) != null) {
                    e.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha2));
                } else if (limitPreviewView.U && (valueAnimator = limitPreviewView.i0) != null) {
                    e.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha2));
                }
                if (limitPreviewView.P) {
                    if (limitPreviewView.L || limitPreviewView.M) {
                        AndroidUtilities.rectTmp.set(limitPreviewView.n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    } else {
                        AndroidUtilities.rectTmp.set(0.0f, 0.0f, limitPreviewView.n, getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), e);
                e.setAlpha(alpha2);
                canvas.restore();
                if (limitPreviewView.E == null && limitPreviewView.d0) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                break;
            case 8:
                Paint paint7 = (Paint) this.c;
                paint7.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ii, (org.telegram.ui.ActionBar.u6) this.d));
                tg.f0 f0Var = (tg.f0) this.e;
                canvas.drawLine(AndroidUtilities.dp(18.0f), getHeight() / 2.0f, f0Var.d.getLeft() - AndroidUtilities.dp(20.0f), getHeight() / 2.0f, paint7);
                canvas.drawLine(AndroidUtilities.dp(20.0f) + f0Var.d.getRight(), getHeight() / 2.0f, getWidth() - AndroidUtilities.dp(18.0f), getHeight() / 2.0f, paint7);
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(f0Var.d.getLeft() - AndroidUtilities.dp(15.0f), ((f0Var.d.getBottom() + f0Var.d.getTop()) - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(15.0f) + f0Var.d.getRight(), (AndroidUtilities.dp(30.0f) + (f0Var.d.getBottom() + f0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF4.left, rectF4.top);
                rectF4.set(0.0f, 0.0f, rectF4.width(), rectF4.height());
                tg.a1 a1Var2 = (tg.a1) this.b;
                a1Var2.e(rectF4);
                canvas.drawRoundRect(rectF4, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), a1Var2.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 9:
                Drawable drawable3 = (Drawable) this.c;
                tg.y0 y0Var = (tg.y0) this.e;
                drawable = ((org.telegram.ui.ActionBar.k3) y0Var).shadowDrawable;
                int i16 = y0Var.M;
                i14 = ((org.telegram.ui.ActionBar.k3) y0Var).backgroundPaddingTop;
                drawable.setBounds(0, org.telegram.ui.d3.w(2.0f, i14 + i16, 1), getMeasuredWidth(), getMeasuredHeight());
                drawable2 = ((org.telegram.ui.ActionBar.k3) y0Var).shadowDrawable;
                drawable2.draw(canvas);
                super.dispatchDraw(canvas);
                org.telegram.ui.Components.b8 b8Var = y0Var.N;
                if (b8Var != null && b8Var.getVisibility() == 0 && y0Var.N.getAlpha() != 0.0f) {
                    drawable3.setBounds(0, y0Var.N.getBottom(), getMeasuredWidth(), drawable3.getIntrinsicHeight() + y0Var.N.getBottom());
                    drawable3.setAlpha((int) (y0Var.N.getAlpha() * 255.0f));
                    drawable3.draw(canvas);
                    break;
                }
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewGroup viewGroup;
        int i10;
        switch (this.a) {
            case 0:
                h7 h7Var = (h7) this.e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < d()) {
                    viewGroup = ((org.telegram.ui.ActionBar.k3) h7Var).containerView;
                    if (viewGroup.isAttachedToWindow()) {
                        h7Var.dismiss();
                        return true;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
                tg.y0 y0Var = (tg.y0) this.e;
                if (motionEvent.getAction() == 0) {
                    float y3 = motionEvent.getY();
                    int i11 = y0Var.M;
                    i10 = ((org.telegram.ui.ActionBar.k3) y0Var).backgroundPaddingTop;
                    if (y3 < AndroidUtilities.dp(2.0f) + (i11 - i10)) {
                        y0Var.dismiss();
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
            case 1:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ((org.telegram.ui.x5) this.e).r0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
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
                h7 h7Var = (h7) this.e;
                if (view == h7Var.e) {
                    return false;
                }
                if (view == h7Var.e0) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipPath((Path) this.d);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            case 6:
                float[] fArr = (float[]) this.c;
                Path path = (Path) this.d;
                Matrix matrix = (Matrix) this.b;
                fi.q5 q5Var = (fi.q5) this.e;
                sg.y0 y0Var = q5Var.r0;
                if (view != q5Var.w0) {
                    return super.drawChild(canvas, view, j10);
                }
                cell = q5Var.getCell();
                if (cell == null || (photoImage = cell.getPhotoImage()) == null) {
                    return false;
                }
                matrix.reset();
                float max = Math.max(photoImage.getImageWidth() / q5Var.y0, photoImage.getImageHeight() / q5Var.z0);
                matrix.postScale((q5Var.y0 / q5Var.w0.getWidth()) * max, (q5Var.z0 / q5Var.w0.getHeight()) * max);
                matrix.postTranslate((photoImage.getCenterX() + (cell.getX() + y0Var.getX())) - ((q5Var.y0 * max) / 2.0f), (photoImage.getCenterY() + (cell.getY() + y0Var.getY())) - ((q5Var.z0 * max) / 2.0f));
                q5Var.w0.setTransform(matrix);
                canvas.save();
                path.rewind();
                AndroidUtilities.rectTmp.set(photoImage.getImageX() + cell.getX() + y0Var.getX(), photoImage.getImageY() + cell.getY() + y0Var.getY(), photoImage.getImageX2() + cell.getX() + y0Var.getX(), photoImage.getImageY2() + cell.getY() + y0Var.getY());
                for (int i10 = 0; i10 < photoImage.getRoundRadius().length; i10++) {
                    int i11 = i10 * 2;
                    fArr[i11] = photoImage.getRoundRadius()[i10];
                    fArr[i11 + 1] = photoImage.getRoundRadius()[i10];
                }
                path.addRoundRect(AndroidUtilities.rectTmp, fArr, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            case 9:
                Path path2 = (Path) this.d;
                if (view != ((ScrollView) this.b)) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                path2.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getPaddingLeft(), AndroidUtilities.dp(18.0f) + ((tg.y0) this.e).M, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                path2.addRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                super.drawChild(canvas, view, j10);
                canvas.restore();
                return true;
            case 10:
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.d;
                ag.h0 h0Var = (ag.h0) this.c;
                ag.h0 h0Var2 = (ag.h0) this.b;
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                vh.f fVar = (vh.f) this.e;
                int i12 = (int) fVar.X.f;
                if (view == fVar.h0 && i12 > 0) {
                    h0Var2.setBounds(0, AndroidUtilities.dp(40.0f), getWidth(), AndroidUtilities.dp(48.0f));
                    int i13 = org.telegram.ui.ActionBar.y6.h5;
                    h0Var2.b(org.telegram.ui.ActionBar.y6.w0(i13, u6Var));
                    h0Var2.draw(canvas);
                    int dp = AndroidUtilities.dp(48.0f) + i12;
                    h0Var.setBounds(0, dp - AndroidUtilities.dp(8.0f), getWidth(), dp);
                    h0Var.b(org.telegram.ui.ActionBar.y6.w0(i13, u6Var));
                    h0Var.draw(canvas);
                }
                return drawChild3;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    public void e() {
        float d = d();
        h7 h7Var = (h7) this.e;
        g5 g5Var = h7Var.e0;
        g5Var.setTranslationY(d - g5Var.getHeight());
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(d - g5Var.getHeight(), 0.0f, AndroidUtilities.dp(32.0f)));
        g5Var.setAlpha(h7Var.b1.a(0) * clamp01);
        g5Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        g5Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        b7 b7Var = h7Var.f0;
        b7Var.setTranslationY(d);
        h7Var.g0.setTranslationY(b7Var.getRealHeight() + d);
        h7Var.s0.setTranslationY(b7Var.getRealHeight() + d);
        h7Var.B0.setTranslationY(b7Var.getRealHeight() + d);
        h7Var.D0.setTranslationY(b7Var.getRealHeight() + d);
        FrameLayout frameLayout = h7Var.topBulletinContainer;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
        }
        AndroidUtilities.updateViewVisibilityAnimated(h7Var.o0, h7Var.d.canScrollVertically(1));
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        switch (this.a) {
            case 9:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float[] fArr = (float[]) this.e;
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
                Paint paint = (Paint) this.c;
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
                super.onLayout(z10, i10, i11, i12, i13);
                h7 h7Var = (h7) this.e;
                h5 h5Var = h7Var.T0;
                if (h5Var != null) {
                    h5Var.F(h7Var.f0.getFinalHeight(), h7Var.T1() + ((h7Var.b1.d(1) && h7Var.n0.getVisibility() == 0) ? h7Var.n0.getMeasuredHeight() : 0));
                }
                h7Var.n2();
                break;
            case 3:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (photoViewer.H0.getVisibility() != 8) {
                    int dp = (((i12 - i10) - (photoViewer.S0.getVisibility() == 0 ? AndroidUtilities.dp(63.0f) : 0)) - photoViewer.H0.getMeasuredWidth()) / 2;
                    xa1 xa1Var = photoViewer.H0;
                    xa1Var.layout(dp, xa1Var.getTop(), photoViewer.H0.getMeasuredWidth() + dp, photoViewer.H0.getMeasuredHeight() + photoViewer.H0.getTop());
                    break;
                }
                break;
            case 6:
                fi.q5 q5Var = (fi.q5) this.e;
                sg.y0 y0Var = q5Var.r0;
                int measuredWidth = y0Var.getMeasuredWidth();
                int i14 = 0;
                for (int i15 = 0; i15 < y0Var.getChildCount(); i15++) {
                    View childAt = y0Var.getChildAt(i15);
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
                y0Var.layout(-measuredWidth, 0, y0Var.getMeasuredWidth() - measuredWidth, y0Var.getMeasuredHeight());
                TextureView textureView = q5Var.w0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), y0Var.getMeasuredHeight());
                    break;
                }
                break;
            case 7:
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
                h7 h7Var = (h7) this.e;
                int bottomInset = h7Var.getBottomInset();
                int i13 = 0;
                setPadding(0, 0, 0, bottomInset);
                h7Var.f0.M.setPadding(0, 0, 0, bottomInset);
                int size = View.MeasureSpec.getSize(i11);
                h7Var.h = size;
                int size2 = View.MeasureSpec.getSize(i10);
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt instanceof fi.v3) {
                        childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_30));
                    } else if (childAt == h7Var.d) {
                        childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(size - bottomInset, TLObject.FLAG_30));
                    } else {
                        childAt.measure(i10, View.MeasureSpec.makeMeasureSpec((childAt.getLayoutParams() == null || childAt.getLayoutParams().height != -1) ? 9999 : size, TLObject.FLAG_31));
                    }
                }
                setMeasuredDimension(size2, size);
                h5 h5Var = h7Var.T0;
                if (h5Var != null) {
                    int finalHeight = h7Var.f0.getFinalHeight();
                    int T1 = h7Var.T1();
                    if (h7Var.b1.d(1) && h7Var.n0.getVisibility() == 0) {
                        i13 = h7Var.n0.getMeasuredHeight();
                    }
                    h5Var.F(finalHeight, T1 + i13);
                    break;
                }
                break;
            case 1:
            case 2:
            case 5:
            case 8:
            default:
                super.onMeasure(i10, i11);
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                ((FrameLayout.LayoutParams) photoViewer.H0.getLayoutParams()).rightMargin = photoViewer.S0.getVisibility() == 0 ? AndroidUtilities.dp(63.0f) : 0;
                super.onMeasure(i10, i11);
                break;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
                break;
            case 6:
                fi.q5 q5Var = (fi.q5) this.e;
                sg.y0 y0Var = q5Var.r0;
                y0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = q5Var.w0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(y0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(y0Var.getMeasuredHeight(), TLObject.FLAG_30));
                }
                int measuredWidth = y0Var.getMeasuredWidth();
                int i15 = 0;
                for (int i16 = 0; i16 < y0Var.getChildCount(); i16++) {
                    View childAt2 = y0Var.getChildAt(i16);
                    int left2 = childAt2.getLeft();
                    int right = childAt2.getRight();
                    if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt2;
                        left2 = childAt2.getLeft() + s1Var.getBoundsLeft();
                        left = childAt2.getLeft();
                        boundsRight = s1Var.getBoundsRight();
                    } else if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt2;
                        left2 = childAt2.getLeft() + v0Var.getBoundsLeft();
                        left = childAt2.getLeft();
                        boundsRight = v0Var.getBoundsRight();
                    } else {
                        measuredWidth = Math.min(left2, measuredWidth);
                        i15 = Math.max(right, i15);
                    }
                    right = boundsRight + left;
                    measuredWidth = Math.min(left2, measuredWidth);
                    i15 = Math.max(right, i15);
                }
                setMeasuredDimension(i15 - measuredWidth, y0Var.getMeasuredHeight());
                break;
            case 7:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                org.telegram.ui.Components.s6 s6Var = limitPreviewView.v;
                TextView textView = limitPreviewView.w;
                gh0 gh0Var = limitPreviewView.g0;
                gh0 gh0Var2 = limitPreviewView.f0;
                if (getChildCount() == 2) {
                    int size3 = View.MeasureSpec.getSize(i10);
                    int size4 = View.MeasureSpec.getSize(i11);
                    gh0Var2.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                    int max = Math.max(gh0Var2.getMeasuredWidth(), limitPreviewView.N.getMeasuredWidth() + AndroidUtilities.dp(24.0f) + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() + AndroidUtilities.dp(24.0f) : 0));
                    gh0Var.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                    if (limitPreviewView.P) {
                        float f7 = limitPreviewView.a;
                        if (f7 == 0.0f) {
                            limitPreviewView.n = 0;
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                limitPreviewView.setPremiumCountColor(limitPreviewView.L || limitPreviewView.e0 != null);
                                if (limitPreviewView.e0 != null) {
                                    limitPreviewView.setDefaultTextColor(true);
                                } else {
                                    limitPreviewView.setDefaultTextColor(false);
                                }
                            }
                        } else if (f7 < 1.0f) {
                            float measuredWidth2 = limitPreviewView.L ? 0.0f : gh0Var2.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            limitPreviewView.n = (int) ((((size3 - measuredWidth2) - (limitPreviewView.L ? 0.0f : gh0Var.getMeasuredWidth() - AndroidUtilities.dp(8.0f))) * limitPreviewView.a) + measuredWidth2);
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                limitPreviewView.setPremiumCountColor(limitPreviewView.L || limitPreviewView.e0 != null);
                                limitPreviewView.setDefaultTextColor(true);
                            }
                        } else {
                            limitPreviewView.n = size3;
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                limitPreviewView.setPremiumCountColor(true);
                                limitPreviewView.setDefaultTextColor(true);
                            }
                        }
                    } else {
                        int clamp = (int) Utilities.clamp(size3 * limitPreviewView.a, size3 - Math.max(gh0Var.getMeasuredWidth(), (limitPreviewView.O.getMeasuredWidth() + AndroidUtilities.dp(24.0f)) + (s6Var.getVisibility() == 0 ? s6Var.getMeasuredWidth() + AndroidUtilities.dp(24.0f) : 0)), max);
                        limitPreviewView.n = clamp;
                        gh0Var2.measure(View.MeasureSpec.makeMeasureSpec(clamp, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                        gh0Var.measure(View.MeasureSpec.makeMeasureSpec(size3 - limitPreviewView.n, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                    }
                    setMeasuredDimension(size3, size4);
                    break;
                } else {
                    super.onMeasure(i10, i11);
                    break;
                }
                break;
            case 9:
                tg.y0 y0Var2 = (tg.y0) this.e;
                y0Var2.L = 0;
                ScrollView scrollView = (ScrollView) this.b;
                scrollView.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_31));
                int size5 = View.MeasureSpec.getSize(i11) - scrollView.getMeasuredHeight();
                i12 = ((org.telegram.ui.ActionBar.k3) y0Var2).backgroundPaddingTop;
                y0Var2.L = i12 + size5;
                super.onMeasure(i10, i11);
                y0Var2.B();
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.a) {
            case 3:
                super.setAlpha(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.R7.setAlpha(f7);
                }
                os0 os0Var = photoViewer.U1;
                if (os0Var != null && os0Var.getVisibility() != 8) {
                    photoViewer.U1.setAlpha(photoViewer.y7[0] * f7);
                }
                ps0 ps0Var = photoViewer.V1;
                if (ps0Var != null && ps0Var.getVisibility() != 8) {
                    photoViewer.V1.setAlpha(f7 * photoViewer.z7[0]);
                    break;
                }
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.a) {
            case 0:
                super.setTranslationY(f7);
                FrameLayout frameLayout = ((h7) this.e).topBulletinContainer;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
                    break;
                }
                break;
            case 3:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout2 = photoViewer.R7;
                if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
                    photoViewer.R7.setTranslationY(photoViewer.P0.getTranslationY() - (photoViewer.U1.getAlpha() * org.telegram.messenger.t.c(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                }
                org.telegram.ui.k0 k0Var = photoViewer.X1;
                if (k0Var != null) {
                    k0Var.setTranslationY(f7);
                }
                TextView textView = photoViewer.T7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.T7.setTranslationY(f7);
                    break;
                }
                break;
            case 9:
                super.setTranslationY(f7);
                ((tg.y0) this.e).onContainerTranslationYChanged(f7);
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 3:
                super.setVisibility(i10);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.R7.setVisibility(i10 == 0 ? 0 : 4);
                    break;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(fi.q5 q5Var, Context context) {
        super(context);
        this.e = q5Var;
        this.b = new Matrix();
        this.c = new float[8];
        this.d = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(LimitPreviewView limitPreviewView, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.e = limitPreviewView;
        this.d = u6Var;
        this.c = new Paint();
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(-1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(Context context, org.telegram.ui.ActionBar.u6 u6Var, vh.f fVar) {
        super(context);
        this.e = fVar;
        this.d = u6Var;
        this.b = new ag.h0(2);
        this.c = new ag.h0(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(tg.y0 y0Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.e = y0Var;
        this.b = scrollView;
        this.c = drawable;
        this.d = new Path();
    }

    public j5(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.c = textView;
        vh.j(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, u6Var);
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(false);
        this.d = j2Var;
        imageView.setImageDrawable(j2Var);
        j2Var.a(-1);
        addView(imageView, gb1.h(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new t21(this, 0));
        b(true);
        setMinimumHeight(AndroidUtilities.dp(56.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(org.telegram.ui.x5 x5Var, Context context) {
        super(context);
        this.e = x5Var;
        this.b = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.c = imageView;
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        addView(imageView, gb1.i(-2, -2, 1));
        addView(textView, gb1.h(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setMinimumWidth(AndroidUtilities.dp(100.0f));
        int dp = AndroidUtilities.dp(10.0f);
        int o10 = i0.a.o(-16777216, 80);
        setBackground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 0, o10, o10));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(tc1 tc1Var, Activity activity) {
        super(activity);
        this.e = tc1Var;
        this.c = new Paint(1);
        this.b = new Paint(1);
        this.d = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(h7 h7Var, Context context) {
        super(context);
        this.e = h7Var;
        this.b = new RectF();
        this.c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(tg.f0 f0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.e = f0Var;
        this.d = u6Var;
        this.b = new tg.a1(org.telegram.ui.ActionBar.y6.Lj, org.telegram.ui.ActionBar.y6.Mj, -1, -1, u6Var);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.e = photoViewer;
        this.c = new Paint(3);
        this.b = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d = new Matrix();
    }
}
