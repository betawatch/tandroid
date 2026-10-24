package ai;

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
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fc1;
import org.telegram.ui.ks0;
import org.telegram.ui.ls0;
import org.telegram.ui.qb1;
import org.telegram.ui.qc1;
import org.telegram.ui.va1;
import org.telegram.ui.w50;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class o5 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ o5(Context context) {
        super(context);
    }

    public float a() {
        l7 l7Var = (l7) this.e;
        return (l7Var.b1.a(3) * l7Var.D0.getMeasuredHeight()) + (l7Var.b1.a(2) * l7Var.B0.getMeasuredHeight()) + (l7Var.b1.a(1) * l7Var.s0.getMeasuredHeight()) + (l7Var.b1.a(0) * l7Var.g0.getMeasuredHeight()) + l7Var.f0.getRealHeight() + 0.0f;
    }

    public void b(boolean z10) {
        ((ImageView) this.b).setVisibility(z10 ? 0 : 8);
        TextView textView = (TextView) this.c;
        boolean z11 = LocaleController.isRTL;
        textView.setLayoutParams(w7.z5.d(-1, -2.0f, 55, (z11 || !z10) ? 22.0f : 53.0f, 14.0f, (z11 && z10) ? 53.0f : 22.0f, 12.0f));
    }

    public void c(int i10, String str) {
        ((TextView) this.d).setText(str);
        ((ImageView) this.c).setImageDrawable(getContext().getDrawable(i10));
    }

    public float d() {
        h6 h6Var;
        float max = Math.max(0.0f, getHeight() - a());
        l7 l7Var = (l7) this.e;
        mm0 mm0Var = l7Var.d;
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
                    max = childAt.getY() - l7Var.f0.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a2 = (l7Var.b1.a(4) * l7Var.getBottomInset()) + max;
        Float f7 = l7Var.a1;
        return (f7 == null || (h6Var = l7Var.b1) == null || h6Var.a >= 1.0f) ? a2 : AndroidUtilities.lerp(f7.floatValue(), a2, l7Var.b1.a);
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
                l7 l7Var = (l7) this.e;
                org.telegram.ui.Components.xa xaVar = l7Var.e;
                FrameLayout frameLayout = l7Var.l0;
                l7Var.I(canvas, this);
                canvas.save();
                float d = d();
                float dp = AndroidUtilities.dp(12.0f);
                RectF rectF = (RectF) this.b;
                i10 = ((org.telegram.ui.ActionBar.h3) l7Var).backgroundPaddingLeft;
                int width = getWidth();
                i11 = ((org.telegram.ui.ActionBar.h3) l7Var).backgroundPaddingLeft;
                rectF.set(i10, d, width - i11, getHeight() + dp);
                Paint paint = (Paint) this.c;
                paint.setColor(l7Var.getThemedColor(org.telegram.ui.ActionBar.k6.h5));
                Path path = (Path) this.d;
                path.rewind();
                path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                if (getPaddingBottom() > 0 && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    paint.setAlpha((int) (frameLayout.getAlpha() * 255.0f));
                    i12 = ((org.telegram.ui.ActionBar.h3) l7Var).backgroundPaddingLeft;
                    float height = getHeight() - getPaddingBottom();
                    int width2 = getWidth();
                    i13 = ((org.telegram.ui.ActionBar.h3) l7Var).backgroundPaddingLeft;
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
                l7Var.G(canvas, this);
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
                qc1 qc1Var = (qc1) this.e;
                paint5.setShadowLayer(dpf2, 0.0f, dpf22, i0.a.o(-16777216, (int) (qc1Var.S1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF2, dp2, dp2, paint5);
                fc1 fc1Var = qc1Var.y0;
                qb1 qb1Var = qc1Var.a;
                org.telegram.ui.ActionBar.k6.s(this, fc1Var, qb1Var);
                Paint d10 = qb1Var.d("paintChatActionBackground");
                int alpha = d10.getAlpha();
                d10.setAlpha((int) (qc1Var.S1.getAlpha() * alpha));
                canvas.drawRoundRect(rectF2, dp2, dp2, d10);
                d10.setAlpha(alpha);
                if (qc1Var.N1) {
                    float f7 = qc1Var.o1;
                    if (f7 > 0.0f) {
                        paint3.setColor(i0.a.o(-16777216, (int) (f7 * 255.0f * qc1Var.p1)));
                        canvas.drawRoundRect(rectF2, dp2, dp2, paint3);
                    }
                }
                paint4.setColor(520093695);
                paint4.setAlpha((int) (qc1Var.S1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF2, dp2, dp2, paint4);
                super.dispatchDraw(canvas);
                break;
            case 7:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                Paint paint6 = (Paint) this.c;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                if (!limitPreviewView.P) {
                    paint6.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, g6Var));
                } else if (limitPreviewView.c0 || limitPreviewView.R) {
                    paint6.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, g6Var));
                } else {
                    paint6.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.e7, g6Var));
                }
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                sg.t tVar = limitPreviewView.e0;
                if (tVar != null) {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ((org.telegram.ui.y5) ((org.telegram.ui.a1) tVar).b).u0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint6);
                }
                canvas.save();
                if (!limitPreviewView.P) {
                    canvas.clipRect(limitPreviewView.n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                Paint e = limitPreviewView.R ? limitPreviewView.K : limitPreviewView.e0 != null ? (Paint) this.b : sg.b1.d().e();
                ViewGroup viewGroup = limitPreviewView.y;
                if (viewGroup != null) {
                    sg.a1 a1Var = limitPreviewView.E;
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
                        sg.b1 d11 = sg.b1.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight2 = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d11.f(globalXOffset2 - getLeft(), -f12, measuredWidth, measuredHeight2);
                    }
                } else {
                    sg.b1 d12 = sg.b1.d();
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
                paint7.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ii, (org.telegram.ui.ActionBar.g6) this.d));
                sg.f0 f0Var = (sg.f0) this.e;
                canvas.drawLine(AndroidUtilities.dp(18.0f), getHeight() / 2.0f, f0Var.d.getLeft() - AndroidUtilities.dp(20.0f), getHeight() / 2.0f, paint7);
                canvas.drawLine(AndroidUtilities.dp(20.0f) + f0Var.d.getRight(), getHeight() / 2.0f, getWidth() - AndroidUtilities.dp(18.0f), getHeight() / 2.0f, paint7);
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(f0Var.d.getLeft() - AndroidUtilities.dp(15.0f), ((f0Var.d.getBottom() + f0Var.d.getTop()) - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(15.0f) + f0Var.d.getRight(), (AndroidUtilities.dp(30.0f) + (f0Var.d.getBottom() + f0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF4.left, rectF4.top);
                rectF4.set(0.0f, 0.0f, rectF4.width(), rectF4.height());
                sg.a1 a1Var2 = (sg.a1) this.b;
                a1Var2.e(rectF4);
                canvas.drawRoundRect(rectF4, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), a1Var2.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 9:
                Drawable drawable3 = (Drawable) this.c;
                sg.y0 y0Var = (sg.y0) this.e;
                drawable = ((org.telegram.ui.ActionBar.h3) y0Var).shadowDrawable;
                int i16 = y0Var.M;
                i14 = ((org.telegram.ui.ActionBar.h3) y0Var).backgroundPaddingTop;
                drawable.setBounds(0, sl.D(2.0f, i14 + i16, 1), getMeasuredWidth(), getMeasuredHeight());
                drawable2 = ((org.telegram.ui.ActionBar.h3) y0Var).shadowDrawable;
                drawable2.draw(canvas);
                super.dispatchDraw(canvas);
                org.telegram.ui.Components.z7 z7Var = y0Var.N;
                if (z7Var != null && z7Var.getVisibility() == 0 && y0Var.N.getAlpha() != 0.0f) {
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
                l7 l7Var = (l7) this.e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < d()) {
                    viewGroup = ((org.telegram.ui.ActionBar.h3) l7Var).containerView;
                    if (viewGroup.isAttachedToWindow()) {
                        l7Var.dismiss();
                        return true;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
                sg.y0 y0Var = (sg.y0) this.e;
                if (motionEvent.getAction() == 0) {
                    float y3 = motionEvent.getY();
                    int i11 = y0Var.M;
                    i10 = ((org.telegram.ui.ActionBar.h3) y0Var).backgroundPaddingTop;
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
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ((org.telegram.ui.y5) this.e).u0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
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
                l7 l7Var = (l7) this.e;
                if (view == l7Var.e) {
                    return false;
                }
                if (view == l7Var.e0) {
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
                ei.r5 r5Var = (ei.r5) this.e;
                rg.x0 x0Var = r5Var.r0;
                if (view != r5Var.w0) {
                    return super.drawChild(canvas, view, j10);
                }
                cell = r5Var.getCell();
                if (cell == null || (photoImage = cell.getPhotoImage()) == null) {
                    return false;
                }
                matrix.reset();
                float max = Math.max(photoImage.getImageWidth() / r5Var.y0, photoImage.getImageHeight() / r5Var.z0);
                matrix.postScale((r5Var.y0 / r5Var.w0.getWidth()) * max, (r5Var.z0 / r5Var.w0.getHeight()) * max);
                matrix.postTranslate((photoImage.getCenterX() + (cell.getX() + x0Var.getX())) - ((r5Var.y0 * max) / 2.0f), (photoImage.getCenterY() + (cell.getY() + x0Var.getY())) - ((r5Var.z0 * max) / 2.0f));
                r5Var.w0.setTransform(matrix);
                canvas.save();
                path.rewind();
                AndroidUtilities.rectTmp.set(photoImage.getImageX() + cell.getX() + x0Var.getX(), photoImage.getImageY() + cell.getY() + x0Var.getY(), photoImage.getImageX2() + cell.getX() + x0Var.getX(), photoImage.getImageY2() + cell.getY() + x0Var.getY());
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
                rectF.set(getPaddingLeft(), AndroidUtilities.dp(18.0f) + ((sg.y0) this.e).M, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                path2.addRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                super.drawChild(canvas, view, j10);
                canvas.restore();
                return true;
            case 10:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                zf.y yVar = (zf.y) this.c;
                zf.y yVar2 = (zf.y) this.b;
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                uh.f fVar = (uh.f) this.e;
                int i12 = (int) fVar.X.e;
                if (view == fVar.h0 && i12 > 0) {
                    yVar2.setBounds(0, AndroidUtilities.dp(40.0f), getWidth(), AndroidUtilities.dp(48.0f));
                    int i13 = org.telegram.ui.ActionBar.k6.h5;
                    yVar2.b(org.telegram.ui.ActionBar.k6.w0(i13, g6Var));
                    yVar2.draw(canvas);
                    int dp = AndroidUtilities.dp(48.0f) + i12;
                    yVar.setBounds(0, dp - AndroidUtilities.dp(8.0f), getWidth(), dp);
                    yVar.b(org.telegram.ui.ActionBar.k6.w0(i13, g6Var));
                    yVar.draw(canvas);
                }
                return drawChild3;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    public void e() {
        float d = d();
        l7 l7Var = (l7) this.e;
        l5 l5Var = l7Var.e0;
        l5Var.setTranslationY(d - l5Var.getHeight());
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(d - l5Var.getHeight(), 0.0f, AndroidUtilities.dp(32.0f)));
        l5Var.setAlpha(l7Var.b1.a(0) * clamp01);
        l5Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        l5Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        f7 f7Var = l7Var.f0;
        f7Var.setTranslationY(d);
        l7Var.g0.setTranslationY(f7Var.getRealHeight() + d);
        l7Var.s0.setTranslationY(f7Var.getRealHeight() + d);
        l7Var.B0.setTranslationY(f7Var.getRealHeight() + d);
        l7Var.D0.setTranslationY(f7Var.getRealHeight() + d);
        FrameLayout frameLayout = l7Var.topBulletinContainer;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
        }
        AndroidUtilities.updateViewVisibilityAnimated(l7Var.o0, l7Var.d.canScrollVertically(1));
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
                l7 l7Var = (l7) this.e;
                m5 m5Var = l7Var.T0;
                if (m5Var != null) {
                    m5Var.F(l7Var.f0.getFinalHeight(), l7Var.T1() + ((l7Var.b1.d(1) && l7Var.n0.getVisibility() == 0) ? l7Var.n0.getMeasuredHeight() : 0));
                }
                l7Var.n2();
                break;
            case 3:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (photoViewer.H0.getVisibility() != 8) {
                    int dp = (((i12 - i10) - (photoViewer.S0.getVisibility() == 0 ? AndroidUtilities.dp(63.0f) : 0)) - photoViewer.H0.getMeasuredWidth()) / 2;
                    va1 va1Var = photoViewer.H0;
                    va1Var.layout(dp, va1Var.getTop(), photoViewer.H0.getMeasuredWidth() + dp, photoViewer.H0.getMeasuredHeight() + photoViewer.H0.getTop());
                    break;
                }
                break;
            case 6:
                ei.r5 r5Var = (ei.r5) this.e;
                rg.x0 x0Var = r5Var.r0;
                int measuredWidth = x0Var.getMeasuredWidth();
                int i14 = 0;
                for (int i15 = 0; i15 < x0Var.getChildCount(); i15++) {
                    View childAt = x0Var.getChildAt(i15);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                        left2 = childAt.getLeft() + t1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = t1Var.getBoundsRight();
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
                x0Var.layout(-measuredWidth, 0, x0Var.getMeasuredWidth() - measuredWidth, x0Var.getMeasuredHeight());
                TextureView textureView = r5Var.w0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), x0Var.getMeasuredHeight());
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
                l7 l7Var = (l7) this.e;
                int bottomInset = l7Var.getBottomInset();
                int i13 = 0;
                setPadding(0, 0, 0, bottomInset);
                l7Var.f0.M.setPadding(0, 0, 0, bottomInset);
                int size = View.MeasureSpec.getSize(i11);
                l7Var.h = size;
                int size2 = View.MeasureSpec.getSize(i10);
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt instanceof ei.x3) {
                        childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_30));
                    } else if (childAt == l7Var.d) {
                        childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(size - bottomInset, TLObject.FLAG_30));
                    } else {
                        childAt.measure(i10, View.MeasureSpec.makeMeasureSpec((childAt.getLayoutParams() == null || childAt.getLayoutParams().height != -1) ? 9999 : size, TLObject.FLAG_31));
                    }
                }
                setMeasuredDimension(size2, size);
                m5 m5Var = l7Var.T0;
                if (m5Var != null) {
                    int finalHeight = l7Var.f0.getFinalHeight();
                    int T1 = l7Var.T1();
                    if (l7Var.b1.d(1) && l7Var.n0.getVisibility() == 0) {
                        i13 = l7Var.n0.getMeasuredHeight();
                    }
                    m5Var.F(finalHeight, T1 + i13);
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
                ei.r5 r5Var = (ei.r5) this.e;
                rg.x0 x0Var = r5Var.r0;
                x0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = r5Var.w0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(x0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(x0Var.getMeasuredHeight(), TLObject.FLAG_30));
                }
                int measuredWidth = x0Var.getMeasuredWidth();
                int i15 = 0;
                for (int i16 = 0; i16 < x0Var.getChildCount(); i16++) {
                    View childAt2 = x0Var.getChildAt(i16);
                    int left2 = childAt2.getLeft();
                    int right = childAt2.getRight();
                    if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt2;
                        left2 = childAt2.getLeft() + t1Var.getBoundsLeft();
                        left = childAt2.getLeft();
                        boundsRight = t1Var.getBoundsRight();
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
                setMeasuredDimension(i15 - measuredWidth, x0Var.getMeasuredHeight());
                break;
            case 7:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                org.telegram.ui.Components.q6 q6Var = limitPreviewView.v;
                TextView textView = limitPreviewView.w;
                hh0 hh0Var = limitPreviewView.g0;
                hh0 hh0Var2 = limitPreviewView.f0;
                if (getChildCount() == 2) {
                    int size3 = View.MeasureSpec.getSize(i10);
                    int size4 = View.MeasureSpec.getSize(i11);
                    hh0Var2.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                    int max = Math.max(hh0Var2.getMeasuredWidth(), limitPreviewView.N.getMeasuredWidth() + AndroidUtilities.dp(24.0f) + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() + AndroidUtilities.dp(24.0f) : 0));
                    hh0Var.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
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
                            float measuredWidth2 = limitPreviewView.L ? 0.0f : hh0Var2.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            limitPreviewView.n = (int) ((((size3 - measuredWidth2) - (limitPreviewView.L ? 0.0f : hh0Var.getMeasuredWidth() - AndroidUtilities.dp(8.0f))) * limitPreviewView.a) + measuredWidth2);
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
                        int clamp = (int) Utilities.clamp(size3 * limitPreviewView.a, size3 - Math.max(hh0Var.getMeasuredWidth(), (limitPreviewView.O.getMeasuredWidth() + AndroidUtilities.dp(24.0f)) + (q6Var.getVisibility() == 0 ? q6Var.getMeasuredWidth() + AndroidUtilities.dp(24.0f) : 0)), max);
                        limitPreviewView.n = clamp;
                        hh0Var2.measure(View.MeasureSpec.makeMeasureSpec(clamp, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                        hh0Var.measure(View.MeasureSpec.makeMeasureSpec(size3 - limitPreviewView.n, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                    }
                    setMeasuredDimension(size3, size4);
                    break;
                } else {
                    super.onMeasure(i10, i11);
                    break;
                }
                break;
            case 9:
                sg.y0 y0Var = (sg.y0) this.e;
                y0Var.L = 0;
                ScrollView scrollView = (ScrollView) this.b;
                scrollView.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_31));
                int size5 = View.MeasureSpec.getSize(i11) - scrollView.getMeasuredHeight();
                i12 = ((org.telegram.ui.ActionBar.h3) y0Var).backgroundPaddingTop;
                y0Var.L = i12 + size5;
                super.onMeasure(i10, i11);
                y0Var.B();
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
                ks0 ks0Var = photoViewer.U1;
                if (ks0Var != null && ks0Var.getVisibility() != 8) {
                    photoViewer.U1.setAlpha(photoViewer.y7[0] * f7);
                }
                ls0 ls0Var = photoViewer.V1;
                if (ls0Var != null && ls0Var.getVisibility() != 8) {
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
                FrameLayout frameLayout = ((l7) this.e).topBulletinContainer;
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
                    photoViewer.R7.setTranslationY(photoViewer.P0.getTranslationY() - (photoViewer.U1.getAlpha() * i2.o1.g(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                }
                org.telegram.ui.l0 l0Var = photoViewer.X1;
                if (l0Var != null) {
                    l0Var.setTranslationY(f7);
                }
                TextView textView = photoViewer.T7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.T7.setTranslationY(f7);
                    break;
                }
                break;
            case 9:
                super.setTranslationY(f7);
                ((sg.y0) this.e).onContainerTranslationYChanged(f7);
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
    public o5(ei.r5 r5Var, Context context) {
        super(context);
        this.e = r5Var;
        this.b = new Matrix();
        this.c = new float[8];
        this.d = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(LimitPreviewView limitPreviewView, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.e = limitPreviewView;
        this.d = g6Var;
        this.c = new Paint();
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(-1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(Context context, org.telegram.ui.ActionBar.g6 g6Var, uh.f fVar) {
        super(context);
        this.e = fVar;
        this.d = g6Var;
        this.b = new zf.y(2);
        this.c = new zf.y(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(sg.y0 y0Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.e = y0Var;
        this.b = scrollView;
        this.c = drawable;
        this.d = new Path();
    }

    public o5(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.c = textView;
        sl.k(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.j5, g6Var);
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.d = h2Var;
        imageView.setImageDrawable(h2Var);
        h2Var.a(-1);
        addView(imageView, w7.z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new w50(this, 28));
        b(true);
        setMinimumHeight(AndroidUtilities.dp(56.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(org.telegram.ui.y5 y5Var, Context context) {
        super(context);
        this.e = y5Var;
        this.b = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.c = imageView;
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        addView(imageView, w7.z5.e(-2, -2, 1));
        addView(textView, w7.z5.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setMinimumWidth(AndroidUtilities.dp(100.0f));
        int dp = AndroidUtilities.dp(10.0f);
        int o10 = i0.a.o(-16777216, 80);
        setBackground(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, 0, o10, o10));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(qc1 qc1Var, Activity activity) {
        super(activity);
        this.e = qc1Var;
        this.c = new Paint(1);
        this.b = new Paint(1);
        this.d = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(l7 l7Var, Context context) {
        super(context);
        this.e = l7Var;
        this.b = new RectF();
        this.c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(sg.f0 f0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.e = f0Var;
        this.d = g6Var;
        this.b = new sg.a1(org.telegram.ui.ActionBar.k6.Lj, org.telegram.ui.ActionBar.k6.Mj, -1, -1, g6Var);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.e = photoViewer;
        this.c = new Paint(3);
        this.b = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d = new Matrix();
    }
}
