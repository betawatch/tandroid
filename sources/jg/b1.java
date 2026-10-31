package jg;

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.a01;
import org.telegram.ui.c91;
import org.telegram.ui.j9;
import org.telegram.ui.jq0;
import org.telegram.ui.kq0;
import org.telegram.ui.m91;
import org.telegram.ui.n81;
import org.telegram.ui.t5;
import org.telegram.ui.u71;
import rh.e4;
import rh.y3;
import vh.s3;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b1 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final /* synthetic */ int a = 8;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ b1(Context context) {
        super(context);
    }

    public float a() {
        e4 e4Var = (e4) this.e;
        return (e4Var.T2.a(3) * e4Var.v2.getMeasuredHeight()) + (e4Var.T2.a(2) * e4Var.t2.getMeasuredHeight()) + (e4Var.T2.a(1) * e4Var.k2.getMeasuredHeight()) + (e4Var.T2.a(0) * e4Var.Y1.getMeasuredHeight()) + e4Var.X1.getRealHeight() + 0.0f;
    }

    public void b(boolean z10) {
        ((ImageView) this.b).setVisibility(z10 ? 0 : 8);
        TextView textView = (TextView) this.c;
        boolean z11 = cd.X;
        textView.setLayoutParams(b6.d(-1, -2.0f, 55, (z11 || !z10) ? 22.0f : 53.0f, 14.0f, (z11 && z10) ? 53.0f : 22.0f, 12.0f));
    }

    public void c(int i10, String str) {
        ((TextView) this.c).setText(str);
        ((ImageView) this.b).setImageDrawable(getContext().getDrawable(i10));
    }

    public void d() {
        ((ei0) this.e).animate().alpha(0.0f).setDuration(150L).start();
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
            case 1:
                p6 p6Var = (p6) this.d;
                Paint paint = (Paint) this.b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                if (!limitPreviewView.P) {
                    paint.setColor(t6.w0(t6.a7, p6Var));
                } else if (limitPreviewView.c0 || limitPreviewView.R) {
                    paint.setColor(t6.w0(t6.i6, p6Var));
                } else {
                    paint.setColor(t6.w0(t6.e7, p6Var));
                }
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                kg.w wVar = limitPreviewView.e0;
                if (wVar != null) {
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), ((t5) ((org.telegram.ui.y0) wVar).b).u0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint);
                }
                canvas.save();
                if (!limitPreviewView.P) {
                    canvas.clipRect(limitPreviewView.n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                Paint e = limitPreviewView.R ? limitPreviewView.K : limitPreviewView.e0 != null ? (Paint) this.c : ea.f.d().e();
                ViewGroup viewGroup = limitPreviewView.D;
                if (viewGroup != null) {
                    kg.k1 k1Var = limitPreviewView.E;
                    if (k1Var != null) {
                        e = k1Var.f;
                        float f7 = limitPreviewView.c;
                        float f10 = -limitPreviewView.F;
                        k1Var.a();
                        Matrix matrix = k1Var.e;
                        matrix.reset();
                        matrix.postScale(1.0f, f7 / 100.0f, 0.0f, 0.0f);
                        matrix.postTranslate(0.0f, f10);
                        k1Var.d.setLocalMatrix(matrix);
                    } else {
                        float f11 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f11 += view.getY();
                        }
                        ea.f d = ea.f.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d.f(globalXOffset2 - getLeft(), -f11, measuredWidth, measuredHeight);
                    }
                } else {
                    ea.f d10 = ea.f.d();
                    int measuredWidth2 = limitPreviewView.getMeasuredWidth();
                    int measuredHeight2 = limitPreviewView.getMeasuredHeight();
                    globalXOffset = limitPreviewView.getGlobalXOffset();
                    d10.f(globalXOffset - getLeft(), -getTop(), measuredWidth2, measuredHeight2);
                }
                int alpha = e.getAlpha();
                if (limitPreviewView.V && (valueAnimator2 = limitPreviewView.i0) != null) {
                    e.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha));
                } else if (limitPreviewView.U && (valueAnimator = limitPreviewView.i0) != null) {
                    e.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha));
                }
                if (limitPreviewView.P) {
                    if (limitPreviewView.L || limitPreviewView.M) {
                        org.telegram.messenger.i0.P.set(limitPreviewView.n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    } else {
                        org.telegram.messenger.i0.P.set(0.0f, 0.0f, limitPreviewView.n, getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(org.telegram.messenger.i0.P, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), e);
                e.setAlpha(alpha);
                canvas.restore();
                if (limitPreviewView.E == null && limitPreviewView.d0) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                break;
            case 2:
                Paint paint2 = (Paint) this.c;
                paint2.setColor(t6.w0(t6.wj, (p6) this.d));
                kg.m0 m0Var = (kg.m0) this.e;
                canvas.drawLine(org.telegram.messenger.i0.L(18.0f), getHeight() / 2.0f, m0Var.d.getLeft() - org.telegram.messenger.i0.L(20.0f), getHeight() / 2.0f, paint2);
                canvas.drawLine(org.telegram.messenger.i0.L(20.0f) + m0Var.d.getRight(), getHeight() / 2.0f, getWidth() - org.telegram.messenger.i0.L(18.0f), getHeight() / 2.0f, paint2);
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(m0Var.d.getLeft() - org.telegram.messenger.i0.L(15.0f), ((m0Var.d.getBottom() + m0Var.d.getTop()) - org.telegram.messenger.i0.L(30.0f)) / 2.0f, org.telegram.messenger.i0.L(15.0f) + m0Var.d.getRight(), (org.telegram.messenger.i0.L(30.0f) + (m0Var.d.getBottom() + m0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF2.left, rectF2.top);
                rectF2.set(0.0f, 0.0f, rectF2.width(), rectF2.height());
                kg.k1 k1Var2 = (kg.k1) this.b;
                k1Var2.e(rectF2);
                canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f), k1Var2.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 3:
                Drawable drawable = (Drawable) this.c;
                kg.i1 i1Var = (kg.i1) this.e;
                i1Var.r0.setBounds(0, z20.D(2.0f, i1Var.D1 + i1Var.s0, 1), getMeasuredWidth(), getMeasuredHeight());
                i1Var.r0.draw(canvas);
                super.dispatchDraw(canvas);
                kg.g1 g1Var = i1Var.E1;
                if (g1Var != null && g1Var.getVisibility() == 0 && i1Var.E1.getAlpha() != 0.0f) {
                    drawable.setBounds(0, i1Var.E1.getBottom(), getMeasuredWidth(), drawable.getIntrinsicHeight() + i1Var.E1.getBottom());
                    drawable.setAlpha((int) (i1Var.E1.getAlpha() * 255.0f));
                    drawable.draw(canvas);
                    break;
                }
                break;
            case 9:
                LinearGradient linearGradient = (LinearGradient) this.d;
                Matrix matrix2 = (Matrix) this.b;
                Paint paint3 = (Paint) this.c;
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (!photoViewer.S4) {
                    int measuredHeight3 = photoViewer.n0.getVisibility() == 0 ? getMeasuredHeight() - org.telegram.messenger.i0.L(48.0f) : 0;
                    int i10 = photoViewer.c2;
                    if (i10 == 0 || i10 == 2 || i10 == -1) {
                        matrix2.reset();
                        float min = Math.min(org.telegram.messenger.i0.L(40.0f), getMeasuredHeight() - measuredHeight3);
                        matrix2.postTranslate(0.0f, measuredHeight3);
                        matrix2.postScale(1.0f, min / 16.0f);
                        linearGradient.setLocalMatrix(matrix2);
                        paint3.setShader(linearGradient);
                    } else {
                        paint3.setShader(null);
                        paint3.setColor(2130706432);
                    }
                    canvas.drawRect(0.0f, measuredHeight3, getMeasuredWidth(), getMeasuredHeight(), paint3);
                }
                super.dispatchDraw(canvas);
                break;
            case 11:
                Paint paint4 = (Paint) this.d;
                Paint paint5 = (Paint) this.c;
                RectF rectF3 = org.telegram.messenger.i0.P;
                rectF3.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float L = org.telegram.messenger.i0.L(8.0f);
                Paint paint6 = (Paint) this.b;
                paint6.setColor(0);
                float N = org.telegram.messenger.i0.N(1.0f);
                float N2 = org.telegram.messenger.i0.N(0.33f);
                m91 m91Var = (m91) this.e;
                paint6.setShadowLayer(N, 0.0f, N2, i0.b.o(-16777216, (int) (m91Var.S1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF3, L, L, paint6);
                c91 c91Var = m91Var.y0;
                n81 n81Var = m91Var.a;
                t6.t(this, c91Var, n81Var);
                Paint d11 = n81Var.d("paintChatActionBackground");
                int alpha2 = d11.getAlpha();
                d11.setAlpha((int) (m91Var.S1.getAlpha() * alpha2));
                canvas.drawRoundRect(rectF3, L, L, d11);
                d11.setAlpha(alpha2);
                if (m91Var.N1) {
                    float f12 = m91Var.o1;
                    if (f12 > 0.0f) {
                        paint4.setColor(i0.b.o(-16777216, (int) (f12 * 255.0f * m91Var.p1)));
                        canvas.drawRoundRect(rectF3, L, L, paint4);
                    }
                }
                paint5.setColor(520093695);
                paint5.setAlpha((int) (m91Var.S1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF3, L, L, paint5);
                super.dispatchDraw(canvas);
                break;
            case 12:
                e4 e4Var = (e4) this.e;
                da daVar = e4Var.l1;
                FrameLayout frameLayout = e4Var.d2;
                e4Var.W0(canvas, this);
                canvas.save();
                float f13 = f();
                float L2 = org.telegram.messenger.i0.L(12.0f);
                RectF rectF4 = (RectF) this.b;
                rectF4.set(e4Var.t0, f13, getWidth() - e4Var.t0, getHeight() + L2);
                Paint paint7 = (Paint) this.c;
                paint7.setColor(t6.w0(t6.h5, e4Var.I0));
                Path path = (Path) this.d;
                path.rewind();
                path.addRoundRect(rectF4, L2, L2, Path.Direction.CW);
                canvas.drawPath(path, paint7);
                super.dispatchDraw(canvas);
                if (getPaddingBottom() > 0 && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    paint7.setAlpha((int) (frameLayout.getAlpha() * 255.0f));
                    canvas.drawRect(e4Var.t0, getHeight() - getPaddingBottom(), getWidth() - e4Var.t0, getHeight(), paint7);
                    paint7.setAlpha(zs.e4);
                }
                g();
                canvas.restore();
                if (daVar != null && daVar.getVisibility() == 0 && daVar.getAlpha() > 0.0f) {
                    if (daVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(daVar.getX(), daVar.getY(), daVar.getMeasuredWidth() + daVar.getX(), daVar.getMeasuredHeight() + daVar.getY(), (int) (daVar.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(daVar.getX(), daVar.getY(), daVar.getX() + daVar.getMeasuredWidth(), daVar.getY() + daVar.getMeasuredHeight());
                    }
                    canvas.translate(daVar.getX(), daVar.getY());
                    daVar.draw(canvas);
                    canvas.restore();
                }
                e4Var.V0(canvas, this);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 3:
                kg.i1 i1Var = (kg.i1) this.e;
                if (motionEvent.getAction() == 0) {
                    if (motionEvent.getY() < org.telegram.messenger.i0.L(2.0f) + (i1Var.D1 - i1Var.s0)) {
                        i1Var.dismiss();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 12:
                e4 e4Var = (e4) this.e;
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= f() || !e4Var.b.isAttachedToWindow()) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                e4Var.dismiss();
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 5:
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), ((t5) this.e).u0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
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
                float[] fArr = (float[]) this.c;
                Path path = (Path) this.d;
                Matrix matrix = (Matrix) this.b;
                s3 s3Var = (s3) this.e;
                c1 c1Var = s3Var.r0;
                if (view != s3Var.w0) {
                    return super.drawChild(canvas, view, j10);
                }
                cell = s3Var.getCell();
                int i10 = 0;
                if (cell == null || (photoImage = cell.getPhotoImage()) == null) {
                    return false;
                }
                matrix.reset();
                float max = Math.max(photoImage.M0 / s3Var.y0, photoImage.N0 / s3Var.z0);
                matrix.postScale((s3Var.y0 / s3Var.w0.getWidth()) * max, (s3Var.z0 / s3Var.w0.getHeight()) * max);
                matrix.postTranslate((photoImage.r() + (cell.getX() + c1Var.getX())) - ((s3Var.y0 * max) / 2.0f), (photoImage.s() + (cell.getY() + c1Var.getY())) - ((s3Var.z0 * max) / 2.0f));
                s3Var.w0.setTransform(matrix);
                canvas.save();
                path.rewind();
                org.telegram.messenger.i0.P.set(cell.getX() + c1Var.getX() + photoImage.K0, cell.getY() + c1Var.getY() + photoImage.L0, photoImage.y() + cell.getX() + c1Var.getX(), photoImage.A() + cell.getY() + c1Var.getY());
                while (true) {
                    int[] iArr = photoImage.W0;
                    if (i10 >= iArr.length) {
                        path.addRoundRect(org.telegram.messenger.i0.P, fArr, Path.Direction.CW);
                        canvas.clipPath(path);
                        boolean drawChild = super.drawChild(canvas, view, j10);
                        canvas.restore();
                        return drawChild;
                    }
                    int i11 = i10 * 2;
                    float f7 = iArr[i10];
                    fArr[i11] = f7;
                    fArr[i11 + 1] = f7;
                    i10++;
                }
                break;
            case 3:
                Path path2 = (Path) this.d;
                if (view != ((ScrollView) this.b)) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                path2.rewind();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(getPaddingLeft(), org.telegram.messenger.i0.L(18.0f) + ((kg.i1) this.e).D1, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                path2.addRoundRect(rectF, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                super.drawChild(canvas, view, j10);
                canvas.restore();
                return true;
            case 4:
                p6 p6Var = (p6) this.d;
                rf.w wVar = (rf.w) this.c;
                rf.w wVar2 = (rf.w) this.b;
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                lh.g gVar = (lh.g) this.e;
                int i12 = (int) gVar.P1.f;
                if (view == gVar.Z1 && i12 > 0) {
                    wVar2.setBounds(0, org.telegram.messenger.i0.L(40.0f), getWidth(), org.telegram.messenger.i0.L(48.0f));
                    int i13 = t6.h5;
                    wVar2.b(t6.w0(i13, p6Var));
                    wVar2.draw(canvas);
                    int L = org.telegram.messenger.i0.L(48.0f) + i12;
                    wVar.setBounds(0, L - org.telegram.messenger.i0.L(8.0f), getWidth(), L);
                    wVar.b(t6.w0(i13, p6Var));
                    wVar.draw(canvas);
                }
                return drawChild2;
            case 12:
                e4 e4Var = (e4) this.e;
                if (view == e4Var.l1) {
                    return false;
                }
                if (view == e4Var.W1) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipPath((Path) this.d);
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    public void e() {
        ei0 ei0Var = (ei0) this.e;
        ei0Var.animate().alpha(1.0f).setDuration(150L).start();
        ((TextView) this.b).animate().alpha(1.0f).setDuration(150L).start();
        ((TextView) this.c).animate().alpha(1.0f).setDuration(150L).start();
        ((View) this.d).animate().alpha(0.0f).setDuration(150L).start();
        ei0Var.d();
    }

    public float f() {
        f4.d dVar;
        float max = Math.max(0.0f, getHeight() - a());
        e4 e4Var = (e4) this.e;
        tk0 tk0Var = e4Var.k1;
        int childCount = tk0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = tk0Var.getChildAt(childCount);
            tk0Var.getClass();
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
                    max = childAt.getY() - e4Var.X1.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a2 = (e4Var.T2.a(4) * e4Var.R()) + max;
        Float f7 = e4Var.S2;
        return (f7 == null || (dVar = e4Var.T2) == null || dVar.c >= 1.0f) ? a2 : org.telegram.messenger.i0.T1(f7.floatValue(), a2, e4Var.T2.c);
    }

    public void g() {
        float f7 = f();
        e4 e4Var = (e4) this.e;
        rh.n2 n2Var = e4Var.W1;
        n2Var.setTranslationY(f7 - n2Var.getHeight());
        float l4 = Utilities.l(org.telegram.messenger.i0.z1(f7 - n2Var.getHeight(), 0.0f, org.telegram.messenger.i0.L(32.0f)));
        n2Var.setAlpha(e4Var.T2.a(0) * l4);
        n2Var.setScaleX(org.telegram.messenger.i0.T1(0.5f, 1.0f, l4));
        n2Var.setScaleY(org.telegram.messenger.i0.T1(0.5f, 1.0f, l4));
        y3 y3Var = e4Var.X1;
        y3Var.setTranslationY(f7);
        e4Var.Y1.setTranslationY(y3Var.getRealHeight() + f7);
        e4Var.k2.setTranslationY(y3Var.getRealHeight() + f7);
        e4Var.t2.setTranslationY(y3Var.getRealHeight() + f7);
        e4Var.v2.setTranslationY(y3Var.getRealHeight() + f7);
        FrameLayout frameLayout = e4Var.E;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - org.telegram.messenger.i0.n);
        }
        org.telegram.messenger.i0.W3(e4Var.g2, e4Var.k1.canScrollVertically(1));
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        switch (this.a) {
            case 3:
                return false;
            case 6:
                return false;
            default:
                return super.hasOverlappingRendering();
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
                float L = org.telegram.messenger.i0.L(4.0f);
                fArr[7] = L;
                fArr[6] = L;
                fArr[5] = L;
                fArr[4] = L;
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
                s3 s3Var = (s3) this.e;
                c1 c1Var = s3Var.r0;
                int measuredWidth = c1Var.getMeasuredWidth();
                int i14 = 0;
                for (int i15 = 0; i15 < c1Var.getChildCount(); i15++) {
                    View childAt = c1Var.getChildAt(i15);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                        left2 = childAt.getLeft() + q1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = q1Var.getBoundsRight();
                    } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                        org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) childAt;
                        left2 = childAt.getLeft() + s0Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = s0Var.getBoundsRight();
                    } else {
                        measuredWidth = Math.min(left2, measuredWidth);
                        i14 = Math.max(right, i14);
                    }
                    right = boundsRight + left;
                    measuredWidth = Math.min(left2, measuredWidth);
                    i14 = Math.max(right, i14);
                }
                c1Var.layout(-measuredWidth, 0, c1Var.getMeasuredWidth() - measuredWidth, c1Var.getMeasuredHeight());
                TextureView textureView = s3Var.w0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), c1Var.getMeasuredHeight());
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
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (photoViewer.H0.getVisibility() != 8) {
                    int L = (((i12 - i10) - (photoViewer.S0.getVisibility() == 0 ? org.telegram.messenger.i0.L(63.0f) : 0)) - photoViewer.H0.getMeasuredWidth()) / 2;
                    u71 u71Var = photoViewer.H0;
                    u71Var.layout(L, u71Var.getTop(), photoViewer.H0.getMeasuredWidth() + L, photoViewer.H0.getMeasuredHeight() + photoViewer.H0.getTop());
                    break;
                }
                break;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                e4 e4Var = (e4) this.e;
                kg.f fVar = e4Var.L2;
                if (fVar != null) {
                    fVar.H(e4Var.X1.getFinalHeight(), e4Var.w1() + ((e4Var.T2.d(1) && e4Var.f2.getVisibility() == 0) ? e4Var.f2.getMeasuredHeight() : 0));
                }
                e4Var.P1();
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
        switch (this.a) {
            case 0:
                s3 s3Var = (s3) this.e;
                c1 c1Var = s3Var.r0;
                c1Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = s3Var.w0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(c1Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(c1Var.getMeasuredHeight(), TLObject.FLAG_30));
                }
                int measuredWidth = c1Var.getMeasuredWidth();
                int i12 = 0;
                for (int i13 = 0; i13 < c1Var.getChildCount(); i13++) {
                    View childAt = c1Var.getChildAt(i13);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                        left2 = childAt.getLeft() + q1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = q1Var.getBoundsRight();
                    } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                        org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) childAt;
                        left2 = childAt.getLeft() + s0Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = s0Var.getBoundsRight();
                    } else {
                        measuredWidth = Math.min(left2, measuredWidth);
                        i12 = Math.max(right, i12);
                    }
                    right = boundsRight + left;
                    measuredWidth = Math.min(left2, measuredWidth);
                    i12 = Math.max(right, i12);
                }
                setMeasuredDimension(i12 - measuredWidth, c1Var.getMeasuredHeight());
                break;
            case 1:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                f6 f6Var = limitPreviewView.w;
                TextView textView = limitPreviewView.x;
                kg.x xVar = limitPreviewView.g0;
                kg.x xVar2 = limitPreviewView.f0;
                if (getChildCount() == 2) {
                    int size = View.MeasureSpec.getSize(i10);
                    int size2 = View.MeasureSpec.getSize(i11);
                    xVar2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                    int max = Math.max(xVar2.getMeasuredWidth(), limitPreviewView.N.getMeasuredWidth() + org.telegram.messenger.i0.L(24.0f) + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() + org.telegram.messenger.i0.L(24.0f) : 0));
                    xVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
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
                            float measuredWidth2 = limitPreviewView.L ? 0.0f : xVar2.getMeasuredWidth() - org.telegram.messenger.i0.L(8.0f);
                            limitPreviewView.n = (int) ((((size - measuredWidth2) - (limitPreviewView.L ? 0.0f : xVar.getMeasuredWidth() - org.telegram.messenger.i0.L(8.0f))) * limitPreviewView.a) + measuredWidth2);
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                limitPreviewView.setPremiumCountColor(limitPreviewView.L || limitPreviewView.e0 != null);
                                limitPreviewView.setDefaultTextColor(true);
                            }
                        } else {
                            limitPreviewView.n = size;
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                limitPreviewView.setPremiumCountColor(true);
                                limitPreviewView.setDefaultTextColor(true);
                            }
                        }
                    } else {
                        int i14 = (int) Utilities.i(size * limitPreviewView.a, size - Math.max(xVar.getMeasuredWidth(), (limitPreviewView.O.getMeasuredWidth() + org.telegram.messenger.i0.L(24.0f)) + (f6Var.getVisibility() == 0 ? f6Var.getMeasuredWidth() + org.telegram.messenger.i0.L(24.0f) : 0)), max);
                        limitPreviewView.n = i14;
                        xVar2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                        xVar.measure(View.MeasureSpec.makeMeasureSpec(size - limitPreviewView.n, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                    }
                    setMeasuredDimension(size, size2);
                    break;
                } else {
                    super.onMeasure(i10, i11);
                    break;
                }
            case 3:
                kg.i1 i1Var = (kg.i1) this.e;
                i1Var.C1 = 0;
                ScrollView scrollView = (ScrollView) this.b;
                scrollView.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_31));
                i1Var.C1 = (View.MeasureSpec.getSize(i11) - scrollView.getMeasuredHeight()) + i1Var.s0;
                super.onMeasure(i10, i11);
                i1Var.I0();
                break;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                ((FrameLayout.LayoutParams) photoViewer.H0.getLayoutParams()).rightMargin = photoViewer.S0.getVisibility() == 0 ? org.telegram.messenger.i0.L(63.0f) : 0;
                super.onMeasure(i10, i11);
                break;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
                break;
            case 12:
                e4 e4Var = (e4) this.e;
                int R = e4Var.R();
                int i15 = 0;
                setPadding(0, 0, 0, R);
                e4Var.X1.M.setPadding(0, 0, 0, R);
                int size3 = View.MeasureSpec.getSize(i11);
                e4Var.n1 = size3;
                int size4 = View.MeasureSpec.getSize(i10);
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt2 = getChildAt(i16);
                    if (childAt2 instanceof vh.p2) {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(100.0f), TLObject.FLAG_30));
                    } else if (childAt2 == e4Var.k1) {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec(size3 - R, TLObject.FLAG_30));
                    } else {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec((childAt2.getLayoutParams() == null || childAt2.getLayoutParams().height != -1) ? 9999 : size3, TLObject.FLAG_31));
                    }
                }
                setMeasuredDimension(size4, size3);
                kg.f fVar = e4Var.L2;
                if (fVar != null) {
                    int finalHeight = e4Var.X1.getFinalHeight();
                    int w12 = e4Var.w1();
                    if (e4Var.T2.d(1) && e4Var.f2.getVisibility() == 0) {
                        i15 = e4Var.f2.getMeasuredHeight();
                    }
                    fVar.H(finalHeight, w12 + i15);
                    break;
                }
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.a) {
            case 9:
                super.setAlpha(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.R7.setAlpha(f7);
                }
                jq0 jq0Var = photoViewer.U1;
                if (jq0Var != null && jq0Var.getVisibility() != 8) {
                    photoViewer.U1.setAlpha(photoViewer.y7[0] * f7);
                }
                kq0 kq0Var = photoViewer.V1;
                if (kq0Var != null && kq0Var.getVisibility() != 8) {
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
            case 3:
                super.setTranslationY(f7);
                ((kg.i1) this.e).g0(f7);
                break;
            case 9:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.R7.setTranslationY(photoViewer.P0.getTranslationY() - (photoViewer.U1.getAlpha() * i0.a.d(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
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
            case 12:
                super.setTranslationY(f7);
                FrameLayout frameLayout2 = ((e4) this.e).E;
                if (frameLayout2 != null) {
                    frameLayout2.setTranslationY((getTranslationY() - a()) - org.telegram.messenger.i0.n);
                    break;
                }
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 9:
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

    public b1(Activity activity, org.telegram.ui.Components.voip.x0 x0Var) {
        super(activity);
        this.d = new org.telegram.ui.Components.voip.v0[5];
        setWillNotDraw(false);
        fg.i iVar = new fg.i(activity, x0Var);
        this.b = iVar;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.c = frameLayout;
        iVar.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i10 = 0; i10 < 5; i10++) {
            ((org.telegram.ui.Components.voip.v0[]) this.d)[i10] = new org.telegram.ui.Components.voip.v0(activity);
            ((org.telegram.ui.Components.voip.v0[]) this.d)[i10].setAllStarsProvider(new mg.l(this, 15));
            org.telegram.ui.Components.voip.v0 v0Var = ((org.telegram.ui.Components.voip.v0[]) this.d)[i10];
            v0Var.d = new org.telegram.ui.Components.f2(23, this, activity);
            v0Var.f = i10;
            ((FrameLayout) this.c).addView(v0Var, b6.d(-2, -2.0f, 51, i10 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView((fg.i) this.b, b6.d(zs.X4, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView((FrameLayout) this.c, b6.d(zs.f3, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(s3 s3Var, Context context) {
        super(context);
        this.e = s3Var;
        this.b = new Matrix();
        this.c = new float[8];
        this.d = new Path();
    }

    public b1(j9 j9Var, Context context, zz zzVar) {
        super(context);
        addView(zzVar, b6.c(-1.0f, -1));
        this.d = zzVar;
        ei0 ei0Var = new ei0(context);
        this.e = ei0Var;
        ei0Var.f(R.raw.utyan_call, zs.v1, zs.v1, null);
        ei0Var.setAutoRepeat(false);
        addView(ei0Var, b6.d(zs.v1, 110.0f, 17, 52.0f, 17.0f, 52.0f, 60.0f));
        ei0Var.setOnClickListener(new org.telegram.ui.a(this, 9));
        TextView textView = new TextView(context);
        this.b = textView;
        z20.p(textView, t6.G6, null, null, 2131748714);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        addView(textView, b6.d(-1, -2.0f, 17, 17.0f, 40.0f, 17.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        String a02 = cd.a0(null, null, 2131748713, Integer.valueOf(j9Var.getMessagesController().Q6));
        if (org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.P1()) {
            a02 = a02.replace('\n', ' ');
        }
        textView2.setText(a02);
        a7.V(textView2, t6.c7, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        addView(textView2, b6.d(-1, -2.0f, 17, 17.0f, 80.0f, 17.0f, 0.0f));
        zzVar.setAlpha(0.0f);
        ei0Var.setAlpha(0.0f);
        textView.setAlpha(0.0f);
        textView2.setAlpha(0.0f);
        setOnTouchListener(new org.telegram.ui.ActionBar.n2(3));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(LimitPreviewView limitPreviewView, Context context, p6 p6Var) {
        super(context);
        this.e = limitPreviewView;
        this.d = p6Var;
        this.b = new Paint();
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(-1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(Context context, lh.g gVar, p6 p6Var) {
        super(context);
        this.e = gVar;
        this.d = p6Var;
        this.b = new rf.w(2);
        this.c = new rf.w(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(kg.i1 i1Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.e = i1Var;
        this.b = scrollView;
        this.c = drawable;
        this.d = new Path();
    }

    public b1(Context context, p6 p6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.c = textView;
        z20.n(textView, 1, 20.0f);
        textView.setGravity(cd.X ? 5 : 3);
        a7.V(textView, t6.j5, p6Var);
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
        this.d = c2Var;
        imageView.setImageDrawable(c2Var);
        c2Var.a(-1);
        addView(imageView, b6.d(24, 24.0f, (cd.X ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new a01(this, 0));
        b(true);
        setMinimumHeight(org.telegram.messenger.i0.L(56.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(t5 t5Var, Context context) {
        super(context);
        this.e = t5Var;
        this.d = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.b = imageView;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 12.0f);
        addView(imageView, b6.e(-2, -2, 1));
        addView(textView, b6.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        setMinimumWidth(org.telegram.messenger.i0.L(100.0f));
        int L = org.telegram.messenger.i0.L(10.0f);
        int o10 = i0.b.o(-16777216, 80);
        setBackground(t6.k0(L, L, L, L, 0, o10, o10));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(m91 m91Var, Activity activity) {
        super(activity);
        this.e = m91Var;
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(e4 e4Var, Context context) {
        super(context);
        this.e = e4Var;
        this.b = new RectF();
        this.c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(kg.m0 m0Var, Context context, p6 p6Var) {
        super(context);
        this.e = m0Var;
        this.d = p6Var;
        this.b = new kg.k1(t6.zk, t6.Ak, -1, -1, p6Var);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.e = photoViewer;
        this.c = new Paint(3);
        this.d = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.b = new Matrix();
    }
}
