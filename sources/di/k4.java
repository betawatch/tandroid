package di;

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
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.j71;
import org.telegram.ui.ky0;
import org.telegram.ui.s61;
import org.telegram.ui.t71;
import org.telegram.ui.xo0;
import org.telegram.ui.yo0;
import org.telegram.ui.z51;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class k4 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final /* synthetic */ int a = 4;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ k4(Context context) {
        super(context);
    }

    public float a() {
        c6 c6Var = (c6) this.e;
        return (c6Var.X2.a(3) * c6Var.z2.getMeasuredHeight()) + (c6Var.X2.a(2) * c6Var.x2.getMeasuredHeight()) + (c6Var.X2.a(1) * c6Var.o2.getMeasuredHeight()) + (c6Var.X2.a(0) * c6Var.c2.getMeasuredHeight()) + c6Var.b2.getRealHeight() + 0.0f;
    }

    public void b(boolean z10) {
        ((ImageView) this.b).setVisibility(z10 ? 0 : 8);
        TextView textView = (TextView) this.c;
        boolean z11 = hd.a0;
        textView.setLayoutParams(c8.ja.d(-1, -2.0f, 55, (z11 || !z10) ? 22.0f : 53.0f, 14.0f, (z11 && z10) ? 53.0f : 22.0f, 12.0f));
    }

    public void c(int i7, String str) {
        ((TextView) this.d).setText(str);
        ((ImageView) this.c).setImageDrawable(getContext().getDrawable(i7));
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
                c6 c6Var = (c6) this.e;
                org.telegram.ui.Components.fa faVar = c6Var.p1;
                FrameLayout frameLayout = c6Var.h2;
                c6Var.W0(canvas, this);
                canvas.save();
                float f10 = f();
                float L = org.telegram.messenger.g0.L(12.0f);
                RectF rectF = (RectF) this.b;
                rectF.set(c6Var.u0, f10, getWidth() - c6Var.u0, getHeight() + L);
                Paint paint = (Paint) this.c;
                paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, c6Var.J0));
                Path path = (Path) this.d;
                path.rewind();
                path.addRoundRect(rectF, L, L, Path.Direction.CW);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                if (getPaddingBottom() > 0 && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    paint.setAlpha((int) (frameLayout.getAlpha() * 255.0f));
                    canvas.drawRect(c6Var.u0, getHeight() - getPaddingBottom(), getWidth() - c6Var.u0, getHeight(), paint);
                    paint.setAlpha(ns.e4);
                }
                g();
                canvas.restore();
                if (faVar != null && faVar.getVisibility() == 0 && faVar.getAlpha() > 0.0f) {
                    if (faVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(faVar.getX(), faVar.getY(), faVar.getMeasuredWidth() + faVar.getX(), faVar.getMeasuredHeight() + faVar.getY(), (int) (faVar.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(faVar.getX(), faVar.getY(), faVar.getX() + faVar.getMeasuredWidth(), faVar.getY() + faVar.getMeasuredHeight());
                    }
                    canvas.translate(faVar.getX(), faVar.getY());
                    faVar.draw(canvas);
                    canvas.restore();
                }
                c6Var.V0(canvas, this);
                break;
            case 5:
                LinearGradient linearGradient = (LinearGradient) this.b;
                Matrix matrix = (Matrix) this.d;
                Paint paint2 = (Paint) this.c;
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (!photoViewer.S4) {
                    int measuredHeight = photoViewer.o0.getVisibility() == 0 ? getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f) : 0;
                    int i7 = photoViewer.d2;
                    if (i7 == 0 || i7 == 2 || i7 == -1) {
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
                t71 t71Var = (t71) this.e;
                paint5.setShadowLayer(N, 0.0f, N2, i0.a.o(-16777216, (int) (t71Var.T1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF2, L2, L2, paint5);
                j71 j71Var = t71Var.z0;
                s61 s61Var = t71Var.a;
                org.telegram.ui.ActionBar.j6.t(this, j71Var, s61Var);
                Paint d = s61Var.d("paintChatActionBackground");
                int alpha = d.getAlpha();
                d.setAlpha((int) (t71Var.T1.getAlpha() * alpha));
                canvas.drawRoundRect(rectF2, L2, L2, d);
                d.setAlpha(alpha);
                if (t71Var.O1) {
                    float f11 = t71Var.p1;
                    if (f11 > 0.0f) {
                        paint3.setColor(i0.a.o(-16777216, (int) (f11 * 255.0f * t71Var.q1)));
                        canvas.drawRoundRect(rectF2, L2, L2, paint3);
                    }
                }
                paint4.setColor(520093695);
                paint4.setAlpha((int) (t71Var.T1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF2, L2, L2, paint4);
                super.dispatchDraw(canvas);
                break;
            case 9:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                Paint paint6 = (Paint) this.c;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                if (!limitPreviewView.Q) {
                    paint6.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, e6Var));
                } else if (limitPreviewView.d0 || limitPreviewView.S) {
                    paint6.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.i6, e6Var));
                } else {
                    paint6.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.e7, e6Var));
                }
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ug.s sVar = limitPreviewView.f0;
                if (sVar != null) {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), ((org.telegram.ui.t5) ((org.telegram.ui.w0) sVar).b).v0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint6);
                }
                canvas.save();
                if (!limitPreviewView.Q) {
                    canvas.clipRect(limitPreviewView.n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                Paint e10 = limitPreviewView.S ? limitPreviewView.L : limitPreviewView.f0 != null ? (Paint) this.b : ia.f.d().e();
                ViewGroup viewGroup = limitPreviewView.E;
                if (viewGroup != null) {
                    ug.z0 z0Var = limitPreviewView.F;
                    if (z0Var != null) {
                        e10 = z0Var.f;
                        float f12 = limitPreviewView.c;
                        float f13 = -limitPreviewView.G;
                        z0Var.a();
                        Matrix matrix2 = z0Var.e;
                        matrix2.reset();
                        matrix2.postScale(1.0f, f12 / 100.0f, 0.0f, 0.0f);
                        matrix2.postTranslate(0.0f, f13);
                        z0Var.d.setLocalMatrix(matrix2);
                    } else {
                        float f14 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f14 += view.getY();
                        }
                        ia.f d2 = ia.f.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight2 = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d2.f(globalXOffset2 - getLeft(), -f14, measuredWidth, measuredHeight2);
                    }
                } else {
                    ia.f d10 = ia.f.d();
                    int measuredWidth2 = limitPreviewView.getMeasuredWidth();
                    int measuredHeight3 = limitPreviewView.getMeasuredHeight();
                    globalXOffset = limitPreviewView.getGlobalXOffset();
                    d10.f(globalXOffset - getLeft(), -getTop(), measuredWidth2, measuredHeight3);
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
                paint7.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.zj, (org.telegram.ui.ActionBar.e6) this.d));
                ug.f0 f0Var = (ug.f0) this.e;
                canvas.drawLine(org.telegram.messenger.g0.L(18.0f), getHeight() / 2.0f, f0Var.d.getLeft() - org.telegram.messenger.g0.L(20.0f), getHeight() / 2.0f, paint7);
                canvas.drawLine(org.telegram.messenger.g0.L(20.0f) + f0Var.d.getRight(), getHeight() / 2.0f, getWidth() - org.telegram.messenger.g0.L(18.0f), getHeight() / 2.0f, paint7);
                RectF rectF4 = org.telegram.messenger.g0.P;
                rectF4.set(f0Var.d.getLeft() - org.telegram.messenger.g0.L(15.0f), ((f0Var.d.getBottom() + f0Var.d.getTop()) - org.telegram.messenger.g0.L(30.0f)) / 2.0f, org.telegram.messenger.g0.L(15.0f) + f0Var.d.getRight(), (org.telegram.messenger.g0.L(30.0f) + (f0Var.d.getBottom() + f0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF4.left, rectF4.top);
                rectF4.set(0.0f, 0.0f, rectF4.width(), rectF4.height());
                ug.z0 z0Var2 = (ug.z0) this.b;
                z0Var2.e(rectF4);
                canvas.drawRoundRect(rectF4, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), z0Var2.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 11:
                Drawable drawable = (Drawable) this.c;
                ug.x0 x0Var = (ug.x0) this.e;
                x0Var.s0.setBounds(0, i20.D(2.0f, x0Var.H1 + x0Var.t0, 1), getMeasuredWidth(), getMeasuredHeight());
                x0Var.s0.draw(canvas);
                super.dispatchDraw(canvas);
                org.telegram.ui.Components.o7 o7Var = x0Var.I1;
                if (o7Var != null && o7Var.getVisibility() == 0 && x0Var.I1.getAlpha() != 0.0f) {
                    drawable.setBounds(0, x0Var.I1.getBottom(), getMeasuredWidth(), drawable.getIntrinsicHeight() + x0Var.I1.getBottom());
                    drawable.setAlpha((int) (x0Var.I1.getAlpha() * 255.0f));
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
                c6 c6Var = (c6) this.e;
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= f() || !c6Var.b.isAttachedToWindow()) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                c6Var.dismiss();
                return true;
            case 11:
                ug.x0 x0Var = (ug.x0) this.e;
                if (motionEvent.getAction() == 0) {
                    if (motionEvent.getY() < org.telegram.messenger.g0.L(2.0f) + (x0Var.H1 - x0Var.t0)) {
                        x0Var.dismiss();
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
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), ((org.telegram.ui.t5) this.e).v0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
                invalidate();
                super.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Cells.q1 cell;
        ImageReceiver photoImage;
        switch (this.a) {
            case 0:
                c6 c6Var = (c6) this.e;
                if (view == c6Var.p1) {
                    return false;
                }
                if (view == c6Var.a2) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipPath((Path) this.d);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            case 8:
                float[] fArr = (float[]) this.c;
                Path path = (Path) this.d;
                Matrix matrix = (Matrix) this.b;
                hi.c5 c5Var = (hi.c5) this.e;
                tg.p0 p0Var = c5Var.s0;
                if (view != c5Var.x0) {
                    return super.drawChild(canvas, view, j3);
                }
                cell = c5Var.getCell();
                int i7 = 0;
                if (cell == null || (photoImage = cell.getPhotoImage()) == null) {
                    return false;
                }
                matrix.reset();
                float max = Math.max(photoImage.N0 / c5Var.z0, photoImage.O0 / c5Var.A0);
                matrix.postScale((c5Var.z0 / c5Var.x0.getWidth()) * max, (c5Var.A0 / c5Var.x0.getHeight()) * max);
                matrix.postTranslate((photoImage.r() + (cell.getX() + p0Var.getX())) - ((c5Var.z0 * max) / 2.0f), (photoImage.s() + (cell.getY() + p0Var.getY())) - ((c5Var.A0 * max) / 2.0f));
                c5Var.x0.setTransform(matrix);
                canvas.save();
                path.rewind();
                org.telegram.messenger.g0.P.set(cell.getX() + p0Var.getX() + photoImage.L0, cell.getY() + p0Var.getY() + photoImage.M0, photoImage.y() + cell.getX() + p0Var.getX(), photoImage.A() + cell.getY() + p0Var.getY());
                while (true) {
                    int[] iArr = photoImage.X0;
                    if (i7 >= iArr.length) {
                        path.addRoundRect(org.telegram.messenger.g0.P, fArr, Path.Direction.CW);
                        canvas.clipPath(path);
                        boolean drawChild2 = super.drawChild(canvas, view, j3);
                        canvas.restore();
                        return drawChild2;
                    }
                    int i10 = i7 * 2;
                    float f10 = iArr[i7];
                    fArr[i10] = f10;
                    fArr[i10 + 1] = f10;
                    i7++;
                }
                break;
            case 11:
                Path path2 = (Path) this.d;
                if (view != ((ScrollView) this.b)) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                path2.rewind();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(getPaddingLeft(), org.telegram.messenger.g0.L(18.0f) + ((ug.x0) this.e).H1, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                path2.addRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                super.drawChild(canvas, view, j3);
                canvas.restore();
                return true;
            case 12:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                bg.c0 c0Var = (bg.c0) this.c;
                bg.c0 c0Var2 = (bg.c0) this.b;
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                vh.h hVar = (vh.h) this.e;
                int i11 = (int) hVar.T1.f;
                if (view == hVar.d2 && i11 > 0) {
                    c0Var2.setBounds(0, org.telegram.messenger.g0.L(40.0f), getWidth(), org.telegram.messenger.g0.L(48.0f));
                    int i12 = org.telegram.ui.ActionBar.j6.h5;
                    c0Var2.b(org.telegram.ui.ActionBar.j6.w0(i12, e6Var));
                    c0Var2.draw(canvas);
                    int L = org.telegram.messenger.g0.L(48.0f) + i11;
                    c0Var.setBounds(0, L - org.telegram.messenger.g0.L(8.0f), getWidth(), L);
                    c0Var.b(org.telegram.ui.ActionBar.j6.w0(i12, e6Var));
                    c0Var.draw(canvas);
                }
                return drawChild3;
            default:
                return super.drawChild(canvas, view, j3);
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
        b5 b5Var;
        float max = Math.max(0.0f, getHeight() - a());
        c6 c6Var = (c6) this.e;
        uj0 uj0Var = c6Var.o1;
        int childCount = uj0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = uj0Var.getChildAt(childCount);
            uj0Var.getClass();
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
                    max = childAt.getY() - c6Var.b2.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a10 = (c6Var.X2.a(4) * c6Var.R()) + max;
        Float f10 = c6Var.W2;
        return (f10 == null || (b5Var = c6Var.X2) == null || b5Var.a >= 1.0f) ? a10 : org.telegram.messenger.g0.T1(f10.floatValue(), a10, c6Var.X2.a);
    }

    public void g() {
        float f10 = f();
        c6 c6Var = (c6) this.e;
        h4 h4Var = c6Var.a2;
        h4Var.setTranslationY(f10 - h4Var.getHeight());
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(f10 - h4Var.getHeight(), 0.0f, org.telegram.messenger.g0.L(32.0f)));
        h4Var.setAlpha(c6Var.X2.a(0) * l10);
        h4Var.setScaleX(org.telegram.messenger.g0.T1(0.5f, 1.0f, l10));
        h4Var.setScaleY(org.telegram.messenger.g0.T1(0.5f, 1.0f, l10));
        w5 w5Var = c6Var.b2;
        w5Var.setTranslationY(f10);
        c6Var.c2.setTranslationY(w5Var.getRealHeight() + f10);
        c6Var.o2.setTranslationY(w5Var.getRealHeight() + f10);
        c6Var.x2.setTranslationY(w5Var.getRealHeight() + f10);
        c6Var.z2.setTranslationY(w5Var.getRealHeight() + f10);
        FrameLayout frameLayout = c6Var.F;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - org.telegram.messenger.g0.n);
        }
        org.telegram.messenger.g0.W3(c6Var.k2, c6Var.o1.canScrollVertically(1));
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
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int left;
        int boundsRight;
        switch (this.a) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                c6 c6Var = (c6) this.e;
                i4 i4Var = c6Var.P2;
                if (i4Var != null) {
                    i4Var.H(c6Var.b2.getFinalHeight(), c6Var.w1() + ((c6Var.X2.d(1) && c6Var.j2.getVisibility() == 0) ? c6Var.j2.getMeasuredHeight() : 0));
                }
                c6Var.P1();
                break;
            case 5:
                super.onLayout(z10, i7, i10, i11, i12);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (photoViewer.I0.getVisibility() != 8) {
                    int L = (((i11 - i7) - (photoViewer.T0.getVisibility() == 0 ? org.telegram.messenger.g0.L(63.0f) : 0)) - photoViewer.I0.getMeasuredWidth()) / 2;
                    z51 z51Var = photoViewer.I0;
                    z51Var.layout(L, z51Var.getTop(), photoViewer.I0.getMeasuredWidth() + L, photoViewer.I0.getMeasuredHeight() + photoViewer.I0.getTop());
                    break;
                }
                break;
            case 8:
                hi.c5 c5Var = (hi.c5) this.e;
                tg.p0 p0Var = c5Var.s0;
                int measuredWidth = p0Var.getMeasuredWidth();
                int i13 = 0;
                for (int i14 = 0; i14 < p0Var.getChildCount(); i14++) {
                    View childAt = p0Var.getChildAt(i14);
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
                p0Var.layout(-measuredWidth, 0, p0Var.getMeasuredWidth() - measuredWidth, p0Var.getMeasuredHeight());
                TextureView textureView = c5Var.x0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), p0Var.getMeasuredHeight());
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
                    childAt3.layout(measuredWidth2, 0, i11 - i7, i15);
                    break;
                } else {
                    super.onLayout(z10, i7, i10, i11, i12);
                    break;
                }
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        int left;
        int boundsRight;
        switch (this.a) {
            case 0:
                c6 c6Var = (c6) this.e;
                int R = c6Var.R();
                int i11 = 0;
                setPadding(0, 0, 0, R);
                c6Var.b2.N.setPadding(0, 0, 0, R);
                int size = View.MeasureSpec.getSize(i10);
                c6Var.r1 = size;
                int size2 = View.MeasureSpec.getSize(i7);
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt instanceof hi.l3) {
                        childAt.measure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), TLObject.FLAG_30));
                    } else if (childAt == c6Var.o1) {
                        childAt.measure(i7, View.MeasureSpec.makeMeasureSpec(size - R, TLObject.FLAG_30));
                    } else {
                        childAt.measure(i7, View.MeasureSpec.makeMeasureSpec((childAt.getLayoutParams() == null || childAt.getLayoutParams().height != -1) ? 9999 : size, TLObject.FLAG_31));
                    }
                }
                setMeasuredDimension(size2, size);
                i4 i4Var = c6Var.P2;
                if (i4Var != null) {
                    int finalHeight = c6Var.b2.getFinalHeight();
                    int w12 = c6Var.w1();
                    if (c6Var.X2.d(1) && c6Var.j2.getVisibility() == 0) {
                        i11 = c6Var.j2.getMeasuredHeight();
                    }
                    i4Var.H(finalHeight, w12 + i11);
                    break;
                }
                break;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                ((FrameLayout.LayoutParams) photoViewer.I0.getLayoutParams()).rightMargin = photoViewer.T0.getVisibility() == 0 ? org.telegram.messenger.g0.L(63.0f) : 0;
                super.onMeasure(i7, i10);
                break;
            case 6:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
                break;
            case 8:
                hi.c5 c5Var = (hi.c5) this.e;
                tg.p0 p0Var = c5Var.s0;
                p0Var.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = c5Var.x0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(p0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(p0Var.getMeasuredHeight(), TLObject.FLAG_30));
                }
                int measuredWidth = p0Var.getMeasuredWidth();
                int i13 = 0;
                for (int i14 = 0; i14 < p0Var.getChildCount(); i14++) {
                    View childAt2 = p0Var.getChildAt(i14);
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
                setMeasuredDimension(i13 - measuredWidth, p0Var.getMeasuredHeight());
                break;
            case 9:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                org.telegram.ui.Components.h6 h6Var = limitPreviewView.w;
                TextView textView = limitPreviewView.x;
                hi.q3 q3Var = limitPreviewView.h0;
                hi.q3 q3Var2 = limitPreviewView.g0;
                if (getChildCount() == 2) {
                    int size3 = View.MeasureSpec.getSize(i7);
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
                    super.onMeasure(i7, i10);
                    break;
                }
                break;
            case 11:
                ug.x0 x0Var = (ug.x0) this.e;
                x0Var.G1 = 0;
                ScrollView scrollView = (ScrollView) this.b;
                scrollView.measure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_31));
                x0Var.G1 = (View.MeasureSpec.getSize(i10) - scrollView.getMeasuredHeight()) + x0Var.t0;
                super.onMeasure(i7, i10);
                x0Var.I0();
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 5:
                super.setAlpha(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.R7.setAlpha(f10);
                }
                xo0 xo0Var = photoViewer.V1;
                if (xo0Var != null && xo0Var.getVisibility() != 8) {
                    photoViewer.V1.setAlpha(photoViewer.y7[0] * f10);
                }
                yo0 yo0Var = photoViewer.W1;
                if (yo0Var != null && yo0Var.getVisibility() != 8) {
                    photoViewer.W1.setAlpha(f10 * photoViewer.z7[0]);
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
                FrameLayout frameLayout = ((c6) this.e).F;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((getTranslationY() - a()) - org.telegram.messenger.g0.n);
                    break;
                }
                break;
            case 5:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout2 = photoViewer.R7;
                if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
                    photoViewer.R7.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                }
                org.telegram.ui.k0 k0Var = photoViewer.Y1;
                if (k0Var != null) {
                    k0Var.setTranslationY(f10);
                }
                TextView textView = photoViewer.T7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.T7.setTranslationY(f10);
                    break;
                }
                break;
            case 11:
                super.setTranslationY(f10);
                ((ug.x0) this.e).g0(f10);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        switch (this.a) {
            case 5:
                super.setVisibility(i7);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.R7.setVisibility(i7 == 0 ? 0 : 4);
                    break;
                }
                break;
            default:
                super.setVisibility(i7);
                break;
        }
    }

    public k4(Activity activity, org.telegram.ui.Components.voip.m1 m1Var) {
        super(activity);
        this.d = new org.telegram.ui.Components.voip.g1[5];
        setWillNotDraw(false);
        ai.j0 j0Var = new ai.j0(activity, m1Var);
        this.b = j0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.c = frameLayout;
        j0Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i7 = 0; i7 < 5; i7++) {
            ((org.telegram.ui.Components.voip.g1[]) this.d)[i7] = new org.telegram.ui.Components.voip.g1(activity);
            ((org.telegram.ui.Components.voip.g1[]) this.d)[i7].setAllStarsProvider(new org.telegram.ui.ActionBar.z(this, 6));
            org.telegram.ui.Components.voip.g1 g1Var = ((org.telegram.ui.Components.voip.g1[]) this.d)[i7];
            g1Var.d = new org.telegram.ui.Components.f1(26, this, activity);
            g1Var.f = i7;
            ((FrameLayout) this.c).addView(g1Var, c8.ja.d(-2, -2.0f, 51, i7 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView((ai.j0) this.b, c8.ja.d(ns.X4, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView((FrameLayout) this.c, c8.ja.d(ns.f3, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(hi.c5 c5Var, Context context) {
        super(context);
        this.e = c5Var;
        this.b = new Matrix();
        this.c = new float[8];
        this.d = new Path();
    }

    public k4(org.telegram.ui.i9 i9Var, Context context, pz pzVar) {
        super(context);
        addView(pzVar, c8.ja.c(-1.0f, -1));
        this.d = pzVar;
        fh0 fh0Var = new fh0(context);
        this.e = fh0Var;
        fh0Var.f(R.raw.utyan_call, ns.v1, ns.v1, null);
        fh0Var.setAutoRepeat(false);
        addView(fh0Var, c8.ja.d(ns.v1, 110.0f, 17, 52.0f, 17.0f, 52.0f, 60.0f));
        fh0Var.setOnClickListener(new org.telegram.ui.a(this, 9));
        TextView textView = new TextView(context);
        this.b = textView;
        i20.q(textView, org.telegram.ui.ActionBar.j6.G6, null, null, 2131748699);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        addView(textView, c8.ja.d(-1, -2.0f, 17, 17.0f, 40.0f, 17.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        String a02 = hd.a0(null, null, 2131748698, Integer.valueOf(i9Var.getMessagesController().Q6));
        if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.P1()) {
            a02 = a02.replace('\n', ' ');
        }
        textView2.setText(a02);
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.c7, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView2, c8.ja.d(-1, -2.0f, 17, 17.0f, 80.0f, 17.0f, 0.0f));
        pzVar.setAlpha(0.0f);
        fh0Var.setAlpha(0.0f);
        textView.setAlpha(0.0f);
        textView2.setAlpha(0.0f);
        setOnTouchListener(new gi.a(4));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(LimitPreviewView limitPreviewView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = limitPreviewView;
        this.d = e6Var;
        this.c = new Paint();
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(-1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(Context context, org.telegram.ui.ActionBar.e6 e6Var, vh.h hVar) {
        super(context);
        this.e = hVar;
        this.d = e6Var;
        this.b = new bg.c0(2);
        this.c = new bg.c0(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(ug.x0 x0Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.e = x0Var;
        this.b = scrollView;
        this.c = drawable;
        this.d = new Path();
    }

    public k4(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.c = textView;
        i20.o(textView, 1, 20.0f);
        textView.setGravity(hd.a0 ? 5 : 3);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.j5, e6Var);
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        this.d = x1Var;
        imageView.setImageDrawable(x1Var);
        x1Var.a(-1);
        addView(imageView, c8.ja.d(24, 24.0f, (hd.a0 ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new ky0(this, 0));
        b(true);
        setMinimumHeight(org.telegram.messenger.g0.L(56.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(org.telegram.ui.t5 t5Var, Context context) {
        super(context);
        this.e = t5Var;
        this.b = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.c = imageView;
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        addView(imageView, c8.ja.e(-2, -2, 1));
        addView(textView, c8.ja.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        setMinimumWidth(org.telegram.messenger.g0.L(100.0f));
        int L = org.telegram.messenger.g0.L(10.0f);
        int o4 = i0.a.o(-16777216, 80);
        setBackground(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, 0, o4, o4));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(t71 t71Var, Activity activity) {
        super(activity);
        this.e = t71Var;
        this.c = new Paint(1);
        this.b = new Paint(1);
        this.d = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(c6 c6Var, Context context) {
        super(context);
        this.e = c6Var;
        this.b = new RectF();
        this.c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(ug.f0 f0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = f0Var;
        this.d = e6Var;
        this.b = new ug.z0(org.telegram.ui.ActionBar.j6.Ck, org.telegram.ui.ActionBar.j6.Dk, -1, -1, e6Var);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.e = photoViewer;
        this.c = new Paint(3);
        this.b = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d = new Matrix();
    }
}
