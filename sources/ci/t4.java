package ci;

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
import b8.mf;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.b71;
import org.telegram.ui.cy0;
import org.telegram.ui.l61;
import org.telegram.ui.l71;
import org.telegram.ui.qo0;
import org.telegram.ui.ro0;
import org.telegram.ui.s51;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t4 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final /* synthetic */ int a = 4;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ t4(Context context) {
        super(context);
    }

    public float a() {
        l6 l6Var = (l6) this.e;
        return (l6Var.U2.a(3) * l6Var.w2.getMeasuredHeight()) + (l6Var.U2.a(2) * l6Var.u2.getMeasuredHeight()) + (l6Var.U2.a(1) * l6Var.l2.getMeasuredHeight()) + (l6Var.U2.a(0) * l6Var.Z1.getMeasuredHeight()) + l6Var.Y1.getRealHeight() + 0.0f;
    }

    public void b(boolean z10) {
        ((ImageView) this.b).setVisibility(z10 ? 0 : 8);
        TextView textView = (TextView) this.c;
        boolean z11 = bd.a0;
        textView.setLayoutParams(mf.d(-1, -2.0f, 55, (z11 || !z10) ? 22.0f : 53.0f, 14.0f, (z11 && z10) ? 53.0f : 22.0f, 12.0f));
    }

    public void c(int i3, String str) {
        ((TextView) this.d).setText(str);
        ((ImageView) this.c).setImageDrawable(getContext().getDrawable(i3));
    }

    public void d() {
        ((fh0) this.e).animate().alpha(0.0f).setDuration(150L).start();
        ((TextView) this.b).animate().alpha(0.0f).setDuration(150L).start();
        ((TextView) this.c).animate().alpha(0.0f).setDuration(150L).start();
        ((View) this.d).animate().alpha(1.0f).setDuration(150L).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float globalXOffset;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float globalXOffset2;
        switch (this.a) {
            case 0:
                l6 l6Var = (l6) this.e;
                org.telegram.ui.Components.ia iaVar = l6Var.m1;
                FrameLayout frameLayout = l6Var.e2;
                l6Var.W0(canvas, this);
                canvas.save();
                float f10 = f();
                float L = org.telegram.messenger.g0.L(12.0f);
                RectF rectF = (RectF) this.b;
                rectF.set(l6Var.u0, f10, getWidth() - l6Var.u0, getHeight() + L);
                Paint paint = (Paint) this.c;
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, l6Var.J0));
                Path path = (Path) this.d;
                path.rewind();
                path.addRoundRect(rectF, L, L, Path.Direction.CW);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                if (getPaddingBottom() > 0 && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    paint.setAlpha((int) (frameLayout.getAlpha() * 255.0f));
                    canvas.drawRect(l6Var.u0, getHeight() - getPaddingBottom(), getWidth() - l6Var.u0, getHeight(), paint);
                    paint.setAlpha(hs.e4);
                }
                g();
                canvas.restore();
                if (iaVar != null && iaVar.getVisibility() == 0 && iaVar.getAlpha() > 0.0f) {
                    if (iaVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(iaVar.getX(), iaVar.getY(), iaVar.getMeasuredWidth() + iaVar.getX(), iaVar.getMeasuredHeight() + iaVar.getY(), (int) (iaVar.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(iaVar.getX(), iaVar.getY(), iaVar.getX() + iaVar.getMeasuredWidth(), iaVar.getY() + iaVar.getMeasuredHeight());
                    }
                    canvas.translate(iaVar.getX(), iaVar.getY());
                    iaVar.draw(canvas);
                    canvas.restore();
                }
                l6Var.V0(canvas, this);
                break;
            case 5:
                LinearGradient linearGradient = (LinearGradient) this.b;
                Matrix matrix = (Matrix) this.d;
                Paint paint2 = (Paint) this.c;
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (!photoViewer.T4) {
                    int measuredHeight = photoViewer.o0.getVisibility() == 0 ? getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f) : 0;
                    int i3 = photoViewer.d2;
                    if (i3 == 0 || i3 == 2 || i3 == -1) {
                        matrix.reset();
                        float min = Math.min(org.telegram.messenger.g0.L(40.0f), getMeasuredHeight() - measuredHeight);
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
            case 7:
                Paint paint3 = (Paint) this.d;
                Paint paint4 = (Paint) this.b;
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float L2 = org.telegram.messenger.g0.L(8.0f);
                Paint paint5 = (Paint) this.c;
                paint5.setColor(0);
                float N = org.telegram.messenger.g0.N(1.0f);
                float N2 = org.telegram.messenger.g0.N(0.33f);
                l71 l71Var = (l71) this.e;
                paint5.setShadowLayer(N, 0.0f, N2, i0.a.o(-16777216, (int) (l71Var.T1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF2, L2, L2, paint5);
                b71 b71Var = l71Var.z0;
                l61 l61Var = l71Var.a;
                org.telegram.ui.ActionBar.k6.t(this, b71Var, l61Var);
                Paint d = l61Var.d("paintChatActionBackground");
                int alpha = d.getAlpha();
                d.setAlpha((int) (l71Var.T1.getAlpha() * alpha));
                canvas.drawRoundRect(rectF2, L2, L2, d);
                d.setAlpha(alpha);
                if (l71Var.O1) {
                    float f11 = l71Var.p1;
                    if (f11 > 0.0f) {
                        paint3.setColor(i0.a.o(-16777216, (int) (f11 * 255.0f * l71Var.q1)));
                        canvas.drawRoundRect(rectF2, L2, L2, paint3);
                    }
                }
                paint4.setColor(520093695);
                paint4.setAlpha((int) (l71Var.T1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF2, L2, L2, paint4);
                super.dispatchDraw(canvas);
                break;
            case 9:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                Paint paint6 = (Paint) this.c;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                if (!limitPreviewView.Q) {
                    paint6.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, e6Var));
                } else if (limitPreviewView.d0 || limitPreviewView.S) {
                    paint6.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, e6Var));
                } else {
                    paint6.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.e7, e6Var));
                }
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                vg.s sVar = limitPreviewView.f0;
                if (sVar != null) {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), ((org.telegram.ui.v5) ((org.telegram.ui.x0) sVar).b).v0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint6);
                }
                canvas.save();
                if (!limitPreviewView.Q) {
                    canvas.clipRect(limitPreviewView.n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                Paint e10 = limitPreviewView.S ? limitPreviewView.L : limitPreviewView.f0 != null ? (Paint) this.b : ha.e.d().e();
                ViewGroup viewGroup = limitPreviewView.E;
                if (viewGroup != null) {
                    vg.x0 x0Var = limitPreviewView.F;
                    if (x0Var != null) {
                        e10 = x0Var.f;
                        float f12 = limitPreviewView.c;
                        float f13 = -limitPreviewView.G;
                        x0Var.a();
                        Matrix matrix2 = x0Var.e;
                        matrix2.reset();
                        matrix2.postScale(1.0f, f12 / 100.0f, 0.0f, 0.0f);
                        matrix2.postTranslate(0.0f, f13);
                        x0Var.d.setLocalMatrix(matrix2);
                    } else {
                        float f14 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f14 += view.getY();
                        }
                        ha.e d10 = ha.e.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight2 = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d10.f(globalXOffset2 - getLeft(), -f14, measuredWidth, measuredHeight2);
                    }
                } else {
                    ha.e d11 = ha.e.d();
                    int measuredWidth2 = limitPreviewView.getMeasuredWidth();
                    int measuredHeight3 = limitPreviewView.getMeasuredHeight();
                    globalXOffset = limitPreviewView.getGlobalXOffset();
                    d11.f(globalXOffset - getLeft(), -getTop(), measuredWidth2, measuredHeight3);
                }
                int alpha2 = e10.getAlpha();
                if (limitPreviewView.W && (valueAnimator2 = limitPreviewView.j0) != null) {
                    e10.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha2));
                } else if (limitPreviewView.V && (valueAnimator = limitPreviewView.j0) != null) {
                    e10.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha2));
                }
                if (limitPreviewView.Q) {
                    if (limitPreviewView.M || limitPreviewView.N) {
                        org.telegram.messenger.g0.P.set(limitPreviewView.n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    } else {
                        org.telegram.messenger.g0.P.set(0.0f, 0.0f, limitPreviewView.n, getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(org.telegram.messenger.g0.P, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), e10);
                e10.setAlpha(alpha2);
                canvas.restore();
                if (limitPreviewView.F == null && limitPreviewView.e0) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                break;
            case 10:
                Paint paint7 = (Paint) this.c;
                paint7.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, (org.telegram.ui.ActionBar.e6) this.d));
                vg.e0 e0Var = (vg.e0) this.e;
                canvas.drawLine(org.telegram.messenger.g0.L(18.0f), getHeight() / 2.0f, e0Var.d.getLeft() - org.telegram.messenger.g0.L(20.0f), getHeight() / 2.0f, paint7);
                canvas.drawLine(org.telegram.messenger.g0.L(20.0f) + e0Var.d.getRight(), getHeight() / 2.0f, getWidth() - org.telegram.messenger.g0.L(18.0f), getHeight() / 2.0f, paint7);
                RectF rectF4 = org.telegram.messenger.g0.P;
                rectF4.set(e0Var.d.getLeft() - org.telegram.messenger.g0.L(15.0f), ((e0Var.d.getBottom() + e0Var.d.getTop()) - org.telegram.messenger.g0.L(30.0f)) / 2.0f, org.telegram.messenger.g0.L(15.0f) + e0Var.d.getRight(), (org.telegram.messenger.g0.L(30.0f) + (e0Var.d.getBottom() + e0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF4.left, rectF4.top);
                rectF4.set(0.0f, 0.0f, rectF4.width(), rectF4.height());
                vg.x0 x0Var2 = (vg.x0) this.b;
                x0Var2.e(rectF4);
                canvas.drawRoundRect(rectF4, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), x0Var2.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 11:
                Drawable drawable = (Drawable) this.c;
                vg.v0 v0Var = (vg.v0) this.e;
                v0Var.s0.setBounds(0, org.telegram.messenger.camera.q.D(2.0f, v0Var.E1 + v0Var.t0, 1), getMeasuredWidth(), getMeasuredHeight());
                v0Var.s0.draw(canvas);
                super.dispatchDraw(canvas);
                org.telegram.ui.Components.p7 p7Var = v0Var.F1;
                if (p7Var != null && p7Var.getVisibility() == 0 && v0Var.F1.getAlpha() != 0.0f) {
                    drawable.setBounds(0, v0Var.F1.getBottom(), getMeasuredWidth(), drawable.getIntrinsicHeight() + v0Var.F1.getBottom());
                    drawable.setAlpha((int) (v0Var.F1.getAlpha() * 255.0f));
                    drawable.draw(canvas);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                l6 l6Var = (l6) this.e;
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= f() || !l6Var.b.isAttachedToWindow()) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                l6Var.dismiss();
                return true;
            case 11:
                vg.v0 v0Var = (vg.v0) this.e;
                if (motionEvent.getAction() == 0) {
                    if (motionEvent.getY() < org.telegram.messenger.g0.L(2.0f) + (v0Var.E1 - v0Var.t0)) {
                        v0Var.dismiss();
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
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), ((org.telegram.ui.v5) this.e).v0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
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
        org.telegram.ui.Cells.q1 cell;
        ImageReceiver photoImage;
        switch (this.a) {
            case 0:
                l6 l6Var = (l6) this.e;
                if (view == l6Var.m1) {
                    return false;
                }
                if (view == l6Var.X1) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipPath((Path) this.d);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            case 8:
                float[] fArr = (float[]) this.c;
                Path path = (Path) this.d;
                Matrix matrix = (Matrix) this.b;
                gi.c5 c5Var = (gi.c5) this.e;
                ug.o0 o0Var = c5Var.s0;
                if (view != c5Var.x0) {
                    return super.drawChild(canvas, view, j10);
                }
                cell = c5Var.getCell();
                int i3 = 0;
                if (cell == null || (photoImage = cell.getPhotoImage()) == null) {
                    return false;
                }
                matrix.reset();
                float max = Math.max(photoImage.N0 / c5Var.z0, photoImage.O0 / c5Var.A0);
                matrix.postScale((c5Var.z0 / c5Var.x0.getWidth()) * max, (c5Var.A0 / c5Var.x0.getHeight()) * max);
                matrix.postTranslate((photoImage.r() + (cell.getX() + o0Var.getX())) - ((c5Var.z0 * max) / 2.0f), (photoImage.s() + (cell.getY() + o0Var.getY())) - ((c5Var.A0 * max) / 2.0f));
                c5Var.x0.setTransform(matrix);
                canvas.save();
                path.rewind();
                org.telegram.messenger.g0.P.set(cell.getX() + o0Var.getX() + photoImage.L0, cell.getY() + o0Var.getY() + photoImage.M0, photoImage.y() + cell.getX() + o0Var.getX(), photoImage.A() + cell.getY() + o0Var.getY());
                while (true) {
                    int[] iArr = photoImage.X0;
                    if (i3 >= iArr.length) {
                        path.addRoundRect(org.telegram.messenger.g0.P, fArr, Path.Direction.CW);
                        canvas.clipPath(path);
                        boolean drawChild2 = super.drawChild(canvas, view, j10);
                        canvas.restore();
                        return drawChild2;
                    }
                    int i10 = i3 * 2;
                    float f10 = iArr[i3];
                    fArr[i10] = f10;
                    fArr[i10 + 1] = f10;
                    i3++;
                }
                break;
            case 11:
                Path path2 = (Path) this.d;
                if (view != ((ScrollView) this.b)) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                path2.rewind();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(getPaddingLeft(), org.telegram.messenger.g0.L(18.0f) + ((vg.v0) this.e).E1, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                path2.addRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                super.drawChild(canvas, view, j10);
                canvas.restore();
                return true;
            case 12:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                cg.b0 b0Var = (cg.b0) this.c;
                cg.b0 b0Var2 = (cg.b0) this.b;
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                wh.h hVar = (wh.h) this.e;
                int i11 = (int) hVar.Q1.f;
                if (view == hVar.a2 && i11 > 0) {
                    b0Var2.setBounds(0, org.telegram.messenger.g0.L(40.0f), getWidth(), org.telegram.messenger.g0.L(48.0f));
                    int i12 = org.telegram.ui.ActionBar.k6.h5;
                    b0Var2.b(org.telegram.ui.ActionBar.k6.w0(i12, e6Var));
                    b0Var2.draw(canvas);
                    int L = org.telegram.messenger.g0.L(48.0f) + i11;
                    b0Var.setBounds(0, L - org.telegram.messenger.g0.L(8.0f), getWidth(), L);
                    b0Var.b(org.telegram.ui.ActionBar.k6.w0(i12, e6Var));
                    b0Var.draw(canvas);
                }
                return drawChild3;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    public void e() {
        fh0 fh0Var = (fh0) this.e;
        fh0Var.animate().alpha(1.0f).setDuration(150L).start();
        ((TextView) this.b).animate().alpha(1.0f).setDuration(150L).start();
        ((TextView) this.c).animate().alpha(1.0f).setDuration(150L).start();
        ((View) this.d).animate().alpha(0.0f).setDuration(150L).start();
        fh0Var.d();
    }

    public float f() {
        k5 k5Var;
        float max = Math.max(0.0f, getHeight() - a());
        l6 l6Var = (l6) this.e;
        tj0 tj0Var = l6Var.l1;
        int childCount = tj0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = tj0Var.getChildAt(childCount);
            tj0Var.getClass();
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
                    max = childAt.getY() - l6Var.Y1.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a10 = (l6Var.U2.a(4) * l6Var.Q()) + max;
        Float f10 = l6Var.T2;
        return (f10 == null || (k5Var = l6Var.U2) == null || k5Var.a >= 1.0f) ? a10 : org.telegram.messenger.g0.T1(f10.floatValue(), a10, l6Var.U2.a);
    }

    public void g() {
        float f10 = f();
        l6 l6Var = (l6) this.e;
        q4 q4Var = l6Var.X1;
        q4Var.setTranslationY(f10 - q4Var.getHeight());
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(f10 - q4Var.getHeight(), 0.0f, org.telegram.messenger.g0.L(32.0f)));
        q4Var.setAlpha(l6Var.U2.a(0) * l10);
        q4Var.setScaleX(org.telegram.messenger.g0.T1(0.5f, 1.0f, l10));
        q4Var.setScaleY(org.telegram.messenger.g0.T1(0.5f, 1.0f, l10));
        f6 f6Var = l6Var.Y1;
        f6Var.setTranslationY(f10);
        l6Var.Z1.setTranslationY(f6Var.getRealHeight() + f10);
        l6Var.l2.setTranslationY(f6Var.getRealHeight() + f10);
        l6Var.u2.setTranslationY(f6Var.getRealHeight() + f10);
        l6Var.w2.setTranslationY(f6Var.getRealHeight() + f10);
        FrameLayout frameLayout = l6Var.F;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - org.telegram.messenger.g0.n);
        }
        org.telegram.messenger.g0.X3(l6Var.h2, l6Var.l1.canScrollVertically(1));
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        switch (this.a) {
            case 2:
                return false;
            case 11:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 3:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float[] fArr = (float[]) this.e;
                fArr[3] = 0.0f;
                fArr[2] = 0.0f;
                fArr[1] = 0.0f;
                fArr[0] = 0.0f;
                float L = org.telegram.messenger.g0.L(4.0f);
                fArr[7] = L;
                fArr[6] = L;
                fArr[5] = L;
                fArr[4] = L;
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
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int left;
        int boundsRight;
        switch (this.a) {
            case 0:
                super.onLayout(z10, i3, i10, i11, i12);
                l6 l6Var = (l6) this.e;
                r4 r4Var = l6Var.M2;
                if (r4Var != null) {
                    r4Var.H(l6Var.Y1.getFinalHeight(), l6Var.w1() + ((l6Var.U2.d(1) && l6Var.g2.getVisibility() == 0) ? l6Var.g2.getMeasuredHeight() : 0));
                }
                l6Var.P1();
                break;
            case 5:
                super.onLayout(z10, i3, i10, i11, i12);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (photoViewer.I0.getVisibility() != 8) {
                    int L = (((i11 - i3) - (photoViewer.T0.getVisibility() == 0 ? org.telegram.messenger.g0.L(63.0f) : 0)) - photoViewer.I0.getMeasuredWidth()) / 2;
                    s51 s51Var = photoViewer.I0;
                    s51Var.layout(L, s51Var.getTop(), photoViewer.I0.getMeasuredWidth() + L, photoViewer.I0.getMeasuredHeight() + photoViewer.I0.getTop());
                    break;
                }
                break;
            case 8:
                gi.c5 c5Var = (gi.c5) this.e;
                ug.o0 o0Var = c5Var.s0;
                int measuredWidth = o0Var.getMeasuredWidth();
                int i13 = 0;
                for (int i14 = 0; i14 < o0Var.getChildCount(); i14++) {
                    View childAt = o0Var.getChildAt(i14);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                        left2 = childAt.getLeft() + q1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = q1Var.getBoundsRight();
                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                        org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                        left2 = childAt.getLeft() + t0Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = t0Var.getBoundsRight();
                    } else {
                        measuredWidth = Math.min(left2, measuredWidth);
                        i13 = Math.max(right, i13);
                    }
                    right = boundsRight + left;
                    measuredWidth = Math.min(left2, measuredWidth);
                    i13 = Math.max(right, i13);
                }
                o0Var.layout(-measuredWidth, 0, o0Var.getMeasuredWidth() - measuredWidth, o0Var.getMeasuredHeight());
                TextureView textureView = c5Var.x0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), o0Var.getMeasuredHeight());
                    break;
                }
                break;
            case 9:
                if (getChildCount() == 2) {
                    View childAt2 = getChildAt(0);
                    View childAt3 = getChildAt(1);
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int i15 = i12 - i10;
                    childAt2.layout(0, 0, measuredWidth2, i15);
                    childAt3.layout(measuredWidth2, 0, i11 - i3, i15);
                    break;
                } else {
                    super.onLayout(z10, i3, i10, i11, i12);
                    break;
                }
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        int left;
        int boundsRight;
        switch (this.a) {
            case 0:
                l6 l6Var = (l6) this.e;
                int Q = l6Var.Q();
                int i11 = 0;
                setPadding(0, 0, 0, Q);
                l6Var.Y1.N.setPadding(0, 0, 0, Q);
                int size = View.MeasureSpec.getSize(i10);
                l6Var.o1 = size;
                int size2 = View.MeasureSpec.getSize(i3);
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt instanceof gi.l3) {
                        childAt.measure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), TLObject.FLAG_30));
                    } else if (childAt == l6Var.l1) {
                        childAt.measure(i3, View.MeasureSpec.makeMeasureSpec(size - Q, TLObject.FLAG_30));
                    } else {
                        childAt.measure(i3, View.MeasureSpec.makeMeasureSpec((childAt.getLayoutParams() == null || childAt.getLayoutParams().height != -1) ? 9999 : size, TLObject.FLAG_31));
                    }
                }
                setMeasuredDimension(size2, size);
                r4 r4Var = l6Var.M2;
                if (r4Var != null) {
                    int finalHeight = l6Var.Y1.getFinalHeight();
                    int w12 = l6Var.w1();
                    if (l6Var.U2.d(1) && l6Var.g2.getVisibility() == 0) {
                        i11 = l6Var.g2.getMeasuredHeight();
                    }
                    r4Var.H(finalHeight, w12 + i11);
                    break;
                }
                break;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                ((FrameLayout.LayoutParams) photoViewer.I0.getLayoutParams()).rightMargin = photoViewer.T0.getVisibility() == 0 ? org.telegram.messenger.g0.L(63.0f) : 0;
                super.onMeasure(i3, i10);
                break;
            case 6:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), i10);
                break;
            case 8:
                gi.c5 c5Var = (gi.c5) this.e;
                ug.o0 o0Var = c5Var.s0;
                o0Var.measure(i3, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = c5Var.x0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(o0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(o0Var.getMeasuredHeight(), TLObject.FLAG_30));
                }
                int measuredWidth = o0Var.getMeasuredWidth();
                int i13 = 0;
                for (int i14 = 0; i14 < o0Var.getChildCount(); i14++) {
                    View childAt2 = o0Var.getChildAt(i14);
                    int left2 = childAt2.getLeft();
                    int right = childAt2.getRight();
                    if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt2;
                        left2 = childAt2.getLeft() + q1Var.getBoundsLeft();
                        left = childAt2.getLeft();
                        boundsRight = q1Var.getBoundsRight();
                    } else if (childAt2 instanceof org.telegram.ui.Cells.t0) {
                        org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt2;
                        left2 = childAt2.getLeft() + t0Var.getBoundsLeft();
                        left = childAt2.getLeft();
                        boundsRight = t0Var.getBoundsRight();
                    } else {
                        measuredWidth = Math.min(left2, measuredWidth);
                        i13 = Math.max(right, i13);
                    }
                    right = boundsRight + left;
                    measuredWidth = Math.min(left2, measuredWidth);
                    i13 = Math.max(right, i13);
                }
                setMeasuredDimension(i13 - measuredWidth, o0Var.getMeasuredHeight());
                break;
            case 9:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                org.telegram.ui.Components.h6 h6Var = limitPreviewView.w;
                TextView textView = limitPreviewView.x;
                gi.q3 q3Var = limitPreviewView.h0;
                gi.q3 q3Var2 = limitPreviewView.g0;
                if (getChildCount() == 2) {
                    int size3 = View.MeasureSpec.getSize(i3);
                    int size4 = View.MeasureSpec.getSize(i10);
                    q3Var2.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                    int max = Math.max(q3Var2.getMeasuredWidth(), limitPreviewView.O.getMeasuredWidth() + org.telegram.messenger.g0.L(24.0f) + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() + org.telegram.messenger.g0.L(24.0f) : 0));
                    q3Var.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                    if (limitPreviewView.Q) {
                        float f10 = limitPreviewView.a;
                        if (f10 == 0.0f) {
                            limitPreviewView.n = 0;
                            if (!limitPreviewView.V && !limitPreviewView.W) {
                                limitPreviewView.setPremiumCountColor(limitPreviewView.M || limitPreviewView.f0 != null);
                                if (limitPreviewView.f0 != null) {
                                    limitPreviewView.setDefaultTextColor(true);
                                } else {
                                    limitPreviewView.setDefaultTextColor(false);
                                }
                            }
                        } else if (f10 < 1.0f) {
                            float measuredWidth2 = limitPreviewView.M ? 0.0f : q3Var2.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f);
                            limitPreviewView.n = (int) ((((size3 - measuredWidth2) - (limitPreviewView.M ? 0.0f : q3Var.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f))) * limitPreviewView.a) + measuredWidth2);
                            if (!limitPreviewView.V && !limitPreviewView.W) {
                                limitPreviewView.setPremiumCountColor(limitPreviewView.M || limitPreviewView.f0 != null);
                                limitPreviewView.setDefaultTextColor(true);
                            }
                        } else {
                            limitPreviewView.n = size3;
                            if (!limitPreviewView.V && !limitPreviewView.W) {
                                limitPreviewView.setPremiumCountColor(true);
                                limitPreviewView.setDefaultTextColor(true);
                            }
                        }
                    } else {
                        int i15 = (int) Utilities.i(size3 * limitPreviewView.a, size3 - Math.max(q3Var.getMeasuredWidth(), (limitPreviewView.P.getMeasuredWidth() + org.telegram.messenger.g0.L(24.0f)) + (h6Var.getVisibility() == 0 ? h6Var.getMeasuredWidth() + org.telegram.messenger.g0.L(24.0f) : 0)), max);
                        limitPreviewView.n = i15;
                        q3Var2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                        q3Var.measure(View.MeasureSpec.makeMeasureSpec(size3 - limitPreviewView.n, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                    }
                    setMeasuredDimension(size3, size4);
                    break;
                } else {
                    super.onMeasure(i3, i10);
                    break;
                }
                break;
            case 11:
                vg.v0 v0Var = (vg.v0) this.e;
                v0Var.D1 = 0;
                ScrollView scrollView = (ScrollView) this.b;
                scrollView.measure(i3, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_31));
                v0Var.D1 = (View.MeasureSpec.getSize(i10) - scrollView.getMeasuredHeight()) + v0Var.t0;
                super.onMeasure(i3, i10);
                v0Var.I0();
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 5:
                super.setAlpha(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.S7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.S7.setAlpha(f10);
                }
                qo0 qo0Var = photoViewer.V1;
                if (qo0Var != null && qo0Var.getVisibility() != 8) {
                    photoViewer.V1.setAlpha(photoViewer.z7[0] * f10);
                }
                ro0 ro0Var = photoViewer.W1;
                if (ro0Var != null && ro0Var.getVisibility() != 8) {
                    photoViewer.W1.setAlpha(f10 * photoViewer.A7[0]);
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
            case 0:
                super.setTranslationY(f10);
                FrameLayout frameLayout = ((l6) this.e).F;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((getTranslationY() - a()) - org.telegram.messenger.g0.n);
                    break;
                }
                break;
            case 5:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout2 = photoViewer.S7;
                if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
                    photoViewer.S7.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * k2.p1.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                }
                org.telegram.ui.l0 l0Var = photoViewer.Y1;
                if (l0Var != null) {
                    l0Var.setTranslationY(f10);
                }
                TextView textView = photoViewer.U7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.U7.setTranslationY(f10);
                    break;
                }
                break;
            case 11:
                super.setTranslationY(f10);
                ((vg.v0) this.e).g0(f10);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        switch (this.a) {
            case 5:
                super.setVisibility(i3);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.S7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.S7.setVisibility(i3 == 0 ? 0 : 4);
                    break;
                }
                break;
            default:
                super.setVisibility(i3);
                break;
        }
    }

    public t4(Activity activity, org.telegram.ui.Components.voip.x0 x0Var) {
        super(activity);
        this.d = new org.telegram.ui.Components.voip.v0[5];
        setWillNotDraw(false);
        ai.c0 c0Var = new ai.c0(activity, x0Var);
        this.b = c0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.c = frameLayout;
        c0Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i3 = 0; i3 < 5; i3++) {
            ((org.telegram.ui.Components.voip.v0[]) this.d)[i3] = new org.telegram.ui.Components.voip.v0(activity);
            ((org.telegram.ui.Components.voip.v0[]) this.d)[i3].setAllStarsProvider(new org.telegram.ui.ActionBar.e3(this, 3));
            org.telegram.ui.Components.voip.v0 v0Var = ((org.telegram.ui.Components.voip.v0[]) this.d)[i3];
            v0Var.d = new i41(2, this, activity);
            v0Var.f = i3;
            ((FrameLayout) this.c).addView(v0Var, mf.d(-2, -2.0f, 51, i3 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView((ai.c0) this.b, mf.d(hs.X4, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView((FrameLayout) this.c, mf.d(hs.f3, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(gi.c5 c5Var, Context context) {
        super(context);
        this.e = c5Var;
        this.b = new Matrix();
        this.c = new float[8];
        this.d = new Path();
    }

    public t4(org.telegram.ui.h9 h9Var, Context context, iz izVar) {
        super(context);
        addView(izVar, mf.c(-1.0f, -1));
        this.d = izVar;
        fh0 fh0Var = new fh0(context);
        this.e = fh0Var;
        fh0Var.f(R.raw.utyan_call, hs.v1, hs.v1, null);
        fh0Var.setAutoRepeat(false);
        addView(fh0Var, mf.d(hs.v1, 110.0f, 17, 52.0f, 17.0f, 52.0f, 60.0f));
        fh0Var.setOnClickListener(new org.telegram.ui.a(this, 9));
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.messenger.camera.q.o(textView, org.telegram.ui.ActionBar.k6.G6, null, null, 2131748707);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        addView(textView, mf.d(-1, -2.0f, 17, 17.0f, 40.0f, 17.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        String a02 = bd.a0(null, null, 2131748706, Integer.valueOf(h9Var.getMessagesController().P6));
        if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.P1()) {
            a02 = a02.replace('\n', ' ');
        }
        textView2.setText(a02);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.c7, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView2, mf.d(-1, -2.0f, 17, 17.0f, 80.0f, 17.0f, 0.0f));
        izVar.setAlpha(0.0f);
        fh0Var.setAlpha(0.0f);
        textView.setAlpha(0.0f);
        textView2.setAlpha(0.0f);
        setOnTouchListener(new fi.a(4));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(LimitPreviewView limitPreviewView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = limitPreviewView;
        this.d = e6Var;
        this.c = new Paint();
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(-1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(Context context, org.telegram.ui.ActionBar.e6 e6Var, wh.h hVar) {
        super(context);
        this.e = hVar;
        this.d = e6Var;
        this.b = new cg.b0(2);
        this.c = new cg.b0(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(vg.v0 v0Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.e = v0Var;
        this.b = scrollView;
        this.c = drawable;
        this.d = new Path();
    }

    public t4(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        textView.setGravity(bd.a0 ? 5 : 3);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, e6Var);
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(false);
        this.d = w1Var;
        imageView.setImageDrawable(w1Var);
        w1Var.a(-1);
        addView(imageView, mf.d(24, 24.0f, (bd.a0 ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new cy0(this, 0));
        b(true);
        setMinimumHeight(org.telegram.messenger.g0.L(56.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(org.telegram.ui.v5 v5Var, Context context) {
        super(context);
        this.e = v5Var;
        this.b = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.c = imageView;
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        addView(imageView, mf.e(-2, -2, 1));
        addView(textView, mf.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        setMinimumWidth(org.telegram.messenger.g0.L(100.0f));
        int L = org.telegram.messenger.g0.L(10.0f);
        int o10 = i0.a.o(-16777216, 80);
        setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, o10, o10));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(l71 l71Var, Activity activity) {
        super(activity);
        this.e = l71Var;
        this.c = new Paint(1);
        this.b = new Paint(1);
        this.d = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(l6 l6Var, Context context) {
        super(context);
        this.e = l6Var;
        this.b = new RectF();
        this.c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(vg.e0 e0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = e0Var;
        this.d = e6Var;
        this.b = new vg.x0(org.telegram.ui.ActionBar.k6.zk, org.telegram.ui.ActionBar.k6.Ak, -1, -1, e6Var);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.e = photoViewer;
        this.c = new Paint(3);
        this.b = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d = new Matrix();
    }
}
