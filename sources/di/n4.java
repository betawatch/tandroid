package di;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ap0;
import org.telegram.ui.b61;
import org.telegram.ui.l71;
import org.telegram.ui.ny0;
import org.telegram.ui.u61;
import org.telegram.ui.v71;
import org.telegram.ui.zo0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class n4 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final /* synthetic */ int a = 5;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ n4(Context context) {
        super(context);
    }

    public float a() {
        f6 f6Var = (f6) this.e;
        return (f6Var.X2.a(3) * f6Var.z2.getMeasuredHeight()) + (f6Var.X2.a(2) * f6Var.x2.getMeasuredHeight()) + (f6Var.X2.a(1) * f6Var.o2.getMeasuredHeight()) + (f6Var.X2.a(0) * f6Var.c2.getMeasuredHeight()) + f6Var.b2.getRealHeight() + 0.0f;
    }

    public void b(boolean z10) {
        ((ImageView) this.b).setVisibility(z10 ? 0 : 8);
        TextView textView = (TextView) this.c;
        boolean z11 = gd.a0;
        textView.setLayoutParams(c8.na.d(-1, -2.0f, 55, (z11 || !z10) ? 22.0f : 53.0f, 14.0f, (z11 && z10) ? 53.0f : 22.0f, 12.0f));
    }

    public void c(int i7, String str) {
        ((TextView) this.d).setText(str);
        ((ImageView) this.c).setImageDrawable(getContext().getDrawable(i7));
    }

    public void d() {
        ((qh0) this.e).animate().alpha(0.0f).setDuration(150L).start();
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
                f6 f6Var = (f6) this.e;
                org.telegram.ui.Components.ma maVar = f6Var.p1;
                FrameLayout frameLayout = f6Var.h2;
                f6Var.X0(canvas, this);
                canvas.save();
                float f10 = f();
                float L = org.telegram.messenger.g0.L(12.0f);
                RectF rectF = (RectF) this.b;
                rectF.set(f6Var.u0, f10, getWidth() - f6Var.u0, getHeight() + L);
                Paint paint = (Paint) this.c;
                paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, f6Var.J0));
                Path path = (Path) this.d;
                path.rewind();
                path.addRoundRect(rectF, L, L, Path.Direction.CW);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                if (getPaddingBottom() > 0 && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    paint.setAlpha((int) (frameLayout.getAlpha() * 255.0f));
                    canvas.drawRect(f6Var.u0, getHeight() - getPaddingBottom(), getWidth() - f6Var.u0, getHeight(), paint);
                    paint.setAlpha(ks.e4);
                }
                h();
                canvas.restore();
                if (maVar != null && maVar.getVisibility() == 0 && maVar.getAlpha() > 0.0f) {
                    if (maVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(maVar.getX(), maVar.getY(), maVar.getMeasuredWidth() + maVar.getX(), maVar.getMeasuredHeight() + maVar.getY(), (int) (maVar.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(maVar.getX(), maVar.getY(), maVar.getX() + maVar.getMeasuredWidth(), maVar.getY() + maVar.getMeasuredHeight());
                    }
                    canvas.translate(maVar.getX(), maVar.getY());
                    maVar.draw(canvas);
                    canvas.restore();
                }
                f6Var.W0(canvas, this);
                break;
            case 6:
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
            case 8:
                Paint paint3 = (Paint) this.d;
                Paint paint4 = (Paint) this.b;
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float L2 = org.telegram.messenger.g0.L(8.0f);
                Paint paint5 = (Paint) this.c;
                paint5.setColor(0);
                float N = org.telegram.messenger.g0.N(1.0f);
                float N2 = org.telegram.messenger.g0.N(0.33f);
                v71 v71Var = (v71) this.e;
                paint5.setShadowLayer(N, 0.0f, N2, i0.a.o(-16777216, (int) (v71Var.T1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF2, L2, L2, paint5);
                l71 l71Var = v71Var.z0;
                u61 u61Var = v71Var.a;
                org.telegram.ui.ActionBar.n6.t(this, l71Var, u61Var);
                Paint e10 = u61Var.e("paintChatActionBackground");
                int alpha = e10.getAlpha();
                e10.setAlpha((int) (v71Var.T1.getAlpha() * alpha));
                canvas.drawRoundRect(rectF2, L2, L2, e10);
                e10.setAlpha(alpha);
                if (v71Var.O1) {
                    float f11 = v71Var.p1;
                    if (f11 > 0.0f) {
                        paint3.setColor(i0.a.o(-16777216, (int) (f11 * 255.0f * v71Var.q1)));
                        canvas.drawRoundRect(rectF2, L2, L2, paint3);
                    }
                }
                paint4.setColor(520093695);
                paint4.setAlpha((int) (v71Var.T1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF2, L2, L2, paint4);
                super.dispatchDraw(canvas);
                break;
            case 10:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                Paint paint6 = (Paint) this.c;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                if (!limitPreviewView.Q) {
                    paint6.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, i6Var));
                } else if (limitPreviewView.d0 || limitPreviewView.S) {
                    paint6.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i6, i6Var));
                } else {
                    paint6.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.e7, i6Var));
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
                Paint e11 = limitPreviewView.S ? limitPreviewView.L : limitPreviewView.f0 != null ? (Paint) this.b : ia.e.d().e();
                ViewGroup viewGroup = limitPreviewView.E;
                if (viewGroup != null) {
                    ug.a1 a1Var = limitPreviewView.F;
                    if (a1Var != null) {
                        e11 = a1Var.f;
                        float f12 = limitPreviewView.c;
                        float f13 = -limitPreviewView.G;
                        a1Var.a();
                        Matrix matrix2 = a1Var.e;
                        matrix2.reset();
                        matrix2.postScale(1.0f, f12 / 100.0f, 0.0f, 0.0f);
                        matrix2.postTranslate(0.0f, f13);
                        a1Var.d.setLocalMatrix(matrix2);
                    } else {
                        float f14 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f14 += view.getY();
                        }
                        ia.e d = ia.e.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight2 = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d.f(globalXOffset2 - getLeft(), -f14, measuredWidth, measuredHeight2);
                    }
                } else {
                    ia.e d2 = ia.e.d();
                    int measuredWidth2 = limitPreviewView.getMeasuredWidth();
                    int measuredHeight3 = limitPreviewView.getMeasuredHeight();
                    globalXOffset = limitPreviewView.getGlobalXOffset();
                    d2.f(globalXOffset - getLeft(), -getTop(), measuredWidth2, measuredHeight3);
                }
                int alpha2 = e11.getAlpha();
                if (limitPreviewView.W && (valueAnimator2 = limitPreviewView.j0) != null) {
                    e11.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha2));
                } else if (limitPreviewView.V && (valueAnimator = limitPreviewView.j0) != null) {
                    e11.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha2));
                }
                if (limitPreviewView.Q) {
                    if (limitPreviewView.M || limitPreviewView.N) {
                        org.telegram.messenger.g0.P.set(limitPreviewView.n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    } else {
                        org.telegram.messenger.g0.P.set(0.0f, 0.0f, limitPreviewView.n, getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(org.telegram.messenger.g0.P, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), e11);
                e11.setAlpha(alpha2);
                canvas.restore();
                if (limitPreviewView.F == null && limitPreviewView.e0) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                break;
            case 11:
                Paint paint7 = (Paint) this.c;
                paint7.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, (org.telegram.ui.ActionBar.i6) this.d));
                ug.g0 g0Var = (ug.g0) this.e;
                canvas.drawLine(org.telegram.messenger.g0.L(18.0f), getHeight() / 2.0f, g0Var.d.getLeft() - org.telegram.messenger.g0.L(20.0f), getHeight() / 2.0f, paint7);
                canvas.drawLine(org.telegram.messenger.g0.L(20.0f) + g0Var.d.getRight(), getHeight() / 2.0f, getWidth() - org.telegram.messenger.g0.L(18.0f), getHeight() / 2.0f, paint7);
                RectF rectF4 = org.telegram.messenger.g0.P;
                rectF4.set(g0Var.d.getLeft() - org.telegram.messenger.g0.L(15.0f), ((g0Var.d.getBottom() + g0Var.d.getTop()) - org.telegram.messenger.g0.L(30.0f)) / 2.0f, org.telegram.messenger.g0.L(15.0f) + g0Var.d.getRight(), (org.telegram.messenger.g0.L(30.0f) + (g0Var.d.getBottom() + g0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF4.left, rectF4.top);
                rectF4.set(0.0f, 0.0f, rectF4.width(), rectF4.height());
                ug.a1 a1Var2 = (ug.a1) this.b;
                a1Var2.e(rectF4);
                canvas.drawRoundRect(rectF4, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), a1Var2.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 12:
                Drawable drawable = (Drawable) this.c;
                ug.y0 y0Var = (ug.y0) this.e;
                y0Var.s0.setBounds(0, org.telegram.ui.Cells.c0.i(2.0f, y0Var.H1 + y0Var.t0, 1), getMeasuredWidth(), getMeasuredHeight());
                y0Var.s0.draw(canvas);
                super.dispatchDraw(canvas);
                org.telegram.ui.Components.u7 u7Var = y0Var.I1;
                if (u7Var != null && u7Var.getVisibility() == 0 && y0Var.I1.getAlpha() != 0.0f) {
                    drawable.setBounds(0, y0Var.I1.getBottom(), getMeasuredWidth(), drawable.getIntrinsicHeight() + y0Var.I1.getBottom());
                    drawable.setAlpha((int) (y0Var.I1.getAlpha() * 255.0f));
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
                f6 f6Var = (f6) this.e;
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= f() || !f6Var.b.isAttachedToWindow()) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                f6Var.dismiss();
                return true;
            case 12:
                ug.y0 y0Var = (ug.y0) this.e;
                if (motionEvent.getAction() == 0) {
                    if (motionEvent.getY() < org.telegram.messenger.g0.L(2.0f) + (y0Var.H1 - y0Var.t0)) {
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
        org.telegram.ui.Cells.r1 cell;
        ImageReceiver photoImage;
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.e;
                if (view == f6Var.p1) {
                    return false;
                }
                if (view == f6Var.a2) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipPath((Path) this.d);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            case 9:
                float[] fArr = (float[]) this.c;
                Path path = (Path) this.d;
                Matrix matrix = (Matrix) this.b;
                hi.l5 l5Var = (hi.l5) this.e;
                tg.u0 u0Var = l5Var.t0;
                if (view != l5Var.y0) {
                    return super.drawChild(canvas, view, j3);
                }
                cell = l5Var.getCell();
                int i7 = 0;
                if (cell == null || (photoImage = cell.getPhotoImage()) == null) {
                    return false;
                }
                matrix.reset();
                float max = Math.max(photoImage.N0 / l5Var.A0, photoImage.O0 / l5Var.B0);
                matrix.postScale((l5Var.A0 / l5Var.y0.getWidth()) * max, (l5Var.B0 / l5Var.y0.getHeight()) * max);
                matrix.postTranslate((photoImage.r() + (cell.getX() + u0Var.getX())) - ((l5Var.A0 * max) / 2.0f), (photoImage.s() + (cell.getY() + u0Var.getY())) - ((l5Var.B0 * max) / 2.0f));
                l5Var.y0.setTransform(matrix);
                canvas.save();
                path.rewind();
                org.telegram.messenger.g0.P.set(cell.getX() + u0Var.getX() + photoImage.L0, cell.getY() + u0Var.getY() + photoImage.M0, photoImage.z() + cell.getX() + u0Var.getX(), photoImage.B() + cell.getY() + u0Var.getY());
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
            case 12:
                Path path2 = (Path) this.d;
                if (view != ((ScrollView) this.b)) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                path2.rewind();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(getPaddingLeft(), org.telegram.messenger.g0.L(18.0f) + ((ug.y0) this.e).H1, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                path2.addRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                super.drawChild(canvas, view, j3);
                canvas.restore();
                return true;
            case 13:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                bg.d0 d0Var = (bg.d0) this.c;
                bg.d0 d0Var2 = (bg.d0) this.b;
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                vh.g gVar = (vh.g) this.e;
                int i11 = (int) gVar.T1.f;
                if (view == gVar.d2 && i11 > 0) {
                    d0Var2.setBounds(0, org.telegram.messenger.g0.L(40.0f), getWidth(), org.telegram.messenger.g0.L(48.0f));
                    int i12 = org.telegram.ui.ActionBar.n6.h5;
                    d0Var2.b(org.telegram.ui.ActionBar.n6.w0(i12, i6Var));
                    d0Var2.draw(canvas);
                    int L = org.telegram.messenger.g0.L(48.0f) + i11;
                    d0Var.setBounds(0, L - org.telegram.messenger.g0.L(8.0f), getWidth(), L);
                    d0Var.b(org.telegram.ui.ActionBar.n6.w0(i12, i6Var));
                    d0Var.draw(canvas);
                }
                return drawChild3;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    public void e() {
        qh0 qh0Var = (qh0) this.e;
        qh0Var.animate().alpha(1.0f).setDuration(150L).start();
        ((TextView) this.b).animate().alpha(1.0f).setDuration(150L).start();
        ((TextView) this.c).animate().alpha(1.0f).setDuration(150L).start();
        ((View) this.d).animate().alpha(0.0f).setDuration(150L).start();
        qh0Var.d();
    }

    public float f() {
        e5 e5Var;
        float max = Math.max(0.0f, getHeight() - a());
        f6 f6Var = (f6) this.e;
        ek0 ek0Var = f6Var.o1;
        int childCount = ek0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = ek0Var.getChildAt(childCount);
            ek0Var.getClass();
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
                    max = childAt.getY() - f6Var.b2.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a10 = (f6Var.X2.a(4) * f6Var.R()) + max;
        Float f10 = f6Var.W2;
        return (f10 == null || (e5Var = f6Var.X2) == null || e5Var.a >= 1.0f) ? a10 : org.telegram.messenger.g0.T1(f10.floatValue(), a10, f6Var.X2.a);
    }

    public void g() {
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = ((oz) this.e).a;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        ((ImageView) this.b).setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        ((TextView) this.c).setTextColor(w02);
        ((TextView) this.d).setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.y6, i6Var));
        setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i6, i6Var), 2, -1));
    }

    public void h() {
        float f10 = f();
        f6 f6Var = (f6) this.e;
        k4 k4Var = f6Var.a2;
        k4Var.setTranslationY(f10 - k4Var.getHeight());
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(f10 - k4Var.getHeight(), 0.0f, org.telegram.messenger.g0.L(32.0f)));
        k4Var.setAlpha(f6Var.X2.a(0) * l10);
        k4Var.setScaleX(org.telegram.messenger.g0.T1(0.5f, 1.0f, l10));
        k4Var.setScaleY(org.telegram.messenger.g0.T1(0.5f, 1.0f, l10));
        z5 z5Var = f6Var.b2;
        z5Var.setTranslationY(f10);
        f6Var.c2.setTranslationY(z5Var.getRealHeight() + f10);
        f6Var.o2.setTranslationY(z5Var.getRealHeight() + f10);
        f6Var.x2.setTranslationY(z5Var.getRealHeight() + f10);
        f6Var.z2.setTranslationY(z5Var.getRealHeight() + f10);
        FrameLayout frameLayout = f6Var.F;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - org.telegram.messenger.g0.n);
        }
        org.telegram.messenger.g0.V3(f6Var.k2, f6Var.o1.canScrollVertically(1));
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        switch (this.a) {
            case 2:
                return false;
            case 12:
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
                f6 f6Var = (f6) this.e;
                l4 l4Var = f6Var.P2;
                if (l4Var != null) {
                    l4Var.H(f6Var.b2.getFinalHeight(), f6Var.B1() + ((f6Var.X2.d(1) && f6Var.j2.getVisibility() == 0) ? f6Var.j2.getMeasuredHeight() : 0));
                }
                f6Var.X1();
                break;
            case 6:
                super.onLayout(z10, i7, i10, i11, i12);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (photoViewer.I0.getVisibility() != 8) {
                    int L = (((i11 - i7) - (photoViewer.T0.getVisibility() == 0 ? org.telegram.messenger.g0.L(63.0f) : 0)) - photoViewer.I0.getMeasuredWidth()) / 2;
                    b61 b61Var = photoViewer.I0;
                    b61Var.layout(L, b61Var.getTop(), photoViewer.I0.getMeasuredWidth() + L, photoViewer.I0.getMeasuredHeight() + photoViewer.I0.getTop());
                    break;
                }
                break;
            case 9:
                hi.l5 l5Var = (hi.l5) this.e;
                tg.u0 u0Var = l5Var.t0;
                int measuredWidth = u0Var.getMeasuredWidth();
                int i13 = 0;
                for (int i14 = 0; i14 < u0Var.getChildCount(); i14++) {
                    View childAt = u0Var.getChildAt(i14);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                        org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                        left2 = childAt.getLeft() + r1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = r1Var.getBoundsRight();
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
                u0Var.layout(-measuredWidth, 0, u0Var.getMeasuredWidth() - measuredWidth, u0Var.getMeasuredHeight());
                TextureView textureView = l5Var.y0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), u0Var.getMeasuredHeight());
                    break;
                }
                break;
            case 10:
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
                f6 f6Var = (f6) this.e;
                int R = f6Var.R();
                int i11 = 0;
                setPadding(0, 0, 0, R);
                f6Var.b2.N.setPadding(0, 0, 0, R);
                int size = View.MeasureSpec.getSize(i10);
                f6Var.r1 = size;
                int size2 = View.MeasureSpec.getSize(i7);
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt instanceof hi.u3) {
                        childAt.measure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), TLObject.FLAG_30));
                    } else if (childAt == f6Var.o1) {
                        childAt.measure(i7, View.MeasureSpec.makeMeasureSpec(size - R, TLObject.FLAG_30));
                    } else {
                        childAt.measure(i7, View.MeasureSpec.makeMeasureSpec((childAt.getLayoutParams() == null || childAt.getLayoutParams().height != -1) ? 9999 : size, TLObject.FLAG_31));
                    }
                }
                setMeasuredDimension(size2, size);
                l4 l4Var = f6Var.P2;
                if (l4Var != null) {
                    int finalHeight = f6Var.b2.getFinalHeight();
                    int B1 = f6Var.B1();
                    if (f6Var.X2.d(1) && f6Var.j2.getVisibility() == 0) {
                        i11 = f6Var.j2.getMeasuredHeight();
                    }
                    l4Var.H(finalHeight, B1 + i11);
                    break;
                }
                break;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                ((FrameLayout.LayoutParams) photoViewer.I0.getLayoutParams()).rightMargin = photoViewer.T0.getVisibility() == 0 ? org.telegram.messenger.g0.L(63.0f) : 0;
                super.onMeasure(i7, i10);
                break;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
                break;
            case 9:
                hi.l5 l5Var = (hi.l5) this.e;
                tg.u0 u0Var = l5Var.t0;
                u0Var.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = l5Var.y0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(u0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(u0Var.getMeasuredHeight(), TLObject.FLAG_30));
                }
                int measuredWidth = u0Var.getMeasuredWidth();
                int i13 = 0;
                for (int i14 = 0; i14 < u0Var.getChildCount(); i14++) {
                    View childAt2 = u0Var.getChildAt(i14);
                    int left2 = childAt2.getLeft();
                    int right = childAt2.getRight();
                    if (childAt2 instanceof org.telegram.ui.Cells.r1) {
                        org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt2;
                        left2 = childAt2.getLeft() + r1Var.getBoundsLeft();
                        left = childAt2.getLeft();
                        boundsRight = r1Var.getBoundsRight();
                    } else if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt2;
                        left2 = childAt2.getLeft() + v0Var.getBoundsLeft();
                        left = childAt2.getLeft();
                        boundsRight = v0Var.getBoundsRight();
                    } else {
                        measuredWidth = Math.min(left2, measuredWidth);
                        i13 = Math.max(right, i13);
                    }
                    right = boundsRight + left;
                    measuredWidth = Math.min(left2, measuredWidth);
                    i13 = Math.max(right, i13);
                }
                setMeasuredDimension(i13 - measuredWidth, u0Var.getMeasuredHeight());
                break;
            case 10:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                org.telegram.ui.Components.n6 n6Var = limitPreviewView.w;
                TextView textView = limitPreviewView.x;
                hi.y3 y3Var = limitPreviewView.h0;
                hi.y3 y3Var2 = limitPreviewView.g0;
                if (getChildCount() == 2) {
                    int size3 = View.MeasureSpec.getSize(i7);
                    int size4 = View.MeasureSpec.getSize(i10);
                    y3Var2.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                    int max = Math.max(y3Var2.getMeasuredWidth(), limitPreviewView.O.getMeasuredWidth() + org.telegram.messenger.g0.L(24.0f) + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() + org.telegram.messenger.g0.L(24.0f) : 0));
                    y3Var.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
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
                            float measuredWidth2 = limitPreviewView.M ? 0.0f : y3Var2.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f);
                            limitPreviewView.n = (int) ((((size3 - measuredWidth2) - (limitPreviewView.M ? 0.0f : y3Var.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f))) * limitPreviewView.a) + measuredWidth2);
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
                        int i15 = (int) Utilities.i(size3 * limitPreviewView.a, size3 - Math.max(y3Var.getMeasuredWidth(), (limitPreviewView.P.getMeasuredWidth() + org.telegram.messenger.g0.L(24.0f)) + (n6Var.getVisibility() == 0 ? n6Var.getMeasuredWidth() + org.telegram.messenger.g0.L(24.0f) : 0)), max);
                        limitPreviewView.n = i15;
                        y3Var2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                        y3Var.measure(View.MeasureSpec.makeMeasureSpec(size3 - limitPreviewView.n, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                    }
                    setMeasuredDimension(size3, size4);
                    break;
                } else {
                    super.onMeasure(i7, i10);
                    break;
                }
                break;
            case 12:
                ug.y0 y0Var = (ug.y0) this.e;
                y0Var.G1 = 0;
                ScrollView scrollView = (ScrollView) this.b;
                scrollView.measure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_31));
                y0Var.G1 = (View.MeasureSpec.getSize(i10) - scrollView.getMeasuredHeight()) + y0Var.t0;
                super.onMeasure(i7, i10);
                y0Var.J0();
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 6:
                super.setAlpha(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.X7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.X7.setAlpha(f10);
                }
                zo0 zo0Var = photoViewer.V1;
                if (zo0Var != null && zo0Var.getVisibility() != 8) {
                    photoViewer.V1.setAlpha(photoViewer.E7[0] * f10);
                }
                ap0 ap0Var = photoViewer.W1;
                if (ap0Var != null && ap0Var.getVisibility() != 8) {
                    photoViewer.W1.setAlpha(f10 * photoViewer.F7[0]);
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
                FrameLayout frameLayout = ((f6) this.e).F;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((getTranslationY() - a()) - org.telegram.messenger.g0.n);
                    break;
                }
                break;
            case 6:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout2 = photoViewer.X7;
                if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
                    photoViewer.X7.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                }
                org.telegram.ui.k0 k0Var = photoViewer.Y1;
                if (k0Var != null) {
                    k0Var.setTranslationY(f10);
                }
                TextView textView = photoViewer.Z7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.Z7.setTranslationY(f10);
                    break;
                }
                break;
            case 12:
                super.setTranslationY(f10);
                ((ug.y0) this.e).g0(f10);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        switch (this.a) {
            case 6:
                super.setVisibility(i7);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.X7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.X7.setVisibility(i7 == 0 ? 0 : 4);
                    break;
                }
                break;
            default:
                super.setVisibility(i7);
                break;
        }
    }

    public n4(Activity activity, org.telegram.ui.Components.voip.m1 m1Var) {
        super(activity);
        this.d = new org.telegram.ui.Components.voip.g1[5];
        setWillNotDraw(false);
        ai.h0 h0Var = new ai.h0(activity, m1Var);
        this.b = h0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.c = frameLayout;
        h0Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i7 = 0; i7 < 5; i7++) {
            ((org.telegram.ui.Components.voip.g1[]) this.d)[i7] = new org.telegram.ui.Components.voip.g1(activity);
            ((org.telegram.ui.Components.voip.g1[]) this.d)[i7].setAllStarsProvider(new org.telegram.tgnet.g(this, 10));
            org.telegram.ui.Components.voip.g1 g1Var = ((org.telegram.ui.Components.voip.g1[]) this.d)[i7];
            g1Var.d = new org.telegram.ui.Components.g2(25, this, activity);
            g1Var.f = i7;
            ((FrameLayout) this.c).addView(g1Var, c8.na.d(-2, -2.0f, 51, i7 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView((ai.h0) this.b, c8.na.d(ks.X4, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView((FrameLayout) this.c, c8.na.d(ks.f3, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(hi.l5 l5Var, Context context) {
        super(context);
        this.e = l5Var;
        this.b = new Matrix();
        this.c = new float[8];
        this.d = new Path();
    }

    public n4(org.telegram.ui.j9 j9Var, Context context, vz vzVar) {
        super(context);
        addView(vzVar, c8.na.c(-1.0f, -1));
        this.d = vzVar;
        qh0 qh0Var = new qh0(context);
        this.e = qh0Var;
        qh0Var.f(R.raw.utyan_call, ks.v1, ks.v1, null);
        qh0Var.setAutoRepeat(false);
        addView(qh0Var, c8.na.d(ks.v1, 110.0f, 17, 52.0f, 17.0f, 52.0f, 60.0f));
        qh0Var.setOnClickListener(new org.telegram.ui.a(this, 9));
        TextView textView = new TextView(context);
        this.b = textView;
        m10.r(textView, org.telegram.ui.ActionBar.n6.G6, null, null, 2131748506);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        addView(textView, c8.na.d(-1, -2.0f, 17, 17.0f, 40.0f, 17.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        String a02 = gd.a0(null, null, 2131748505, Integer.valueOf(j9Var.getMessagesController().S6));
        if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.P1()) {
            a02 = a02.replace('\n', ' ');
        }
        textView2.setText(a02);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.c7, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView2, c8.na.d(-1, -2.0f, 17, 17.0f, 80.0f, 17.0f, 0.0f));
        vzVar.setAlpha(0.0f);
        qh0Var.setAlpha(0.0f);
        textView.setAlpha(0.0f);
        textView2.setAlpha(0.0f);
        setOnTouchListener(new gi.a(4));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(LimitPreviewView limitPreviewView, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.e = limitPreviewView;
        this.d = i6Var;
        this.c = new Paint();
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(-1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(Context context, org.telegram.ui.ActionBar.i6 i6Var, vh.g gVar) {
        super(context);
        this.e = gVar;
        this.d = i6Var;
        this.b = new bg.d0(2);
        this.c = new bg.d0(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(ug.y0 y0Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.e = y0Var;
        this.b = scrollView;
        this.c = drawable;
        this.d = new Path();
    }

    public n4(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.c = textView;
        m10.p(textView, 1, 20.0f);
        textView.setGravity(gd.a0 ? 5 : 3);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, i6Var);
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        this.d = x1Var;
        imageView.setImageDrawable(x1Var);
        x1Var.a(-1);
        addView(imageView, c8.na.d(24, 24.0f, (gd.a0 ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new ny0(this, 0));
        b(true);
        setMinimumHeight(org.telegram.messenger.g0.L(56.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(org.telegram.ui.t5 t5Var, Context context) {
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
        addView(imageView, c8.na.e(-2, -2, 1));
        addView(textView, c8.na.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        setMinimumWidth(org.telegram.messenger.g0.L(100.0f));
        int L = org.telegram.messenger.g0.L(10.0f);
        int o4 = i0.a.o(-16777216, 80);
        setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, 0, o4, o4));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(oz ozVar, Context context) {
        super(context);
        this.e = ozVar;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_markunread);
        addView(imageView, c8.na.d(48, 48.0f, 19, 6.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setText(gd.N0(2131750689, null));
        linearLayout.addView(textView, c8.na.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        textView2.setText(gd.N0(2131750682, null));
        linearLayout.addView(textView2, c8.na.t(-2, -2, 1, 0, 1, 0, 0));
        addView(linearLayout, c8.na.d(-1, -2.0f, 17, 56.0f, 0.0f, 56.0f, 0.0f));
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.Cells.c0.u(null, 2131750689, sb2, ", ");
        sb2.append(gd.N0(2131750682, null));
        setContentDescription(sb2.toString());
        setOnClickListener(new org.telegram.ui.Components.n0(this, 16));
        g();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(v71 v71Var, Activity activity) {
        super(activity);
        this.e = v71Var;
        this.c = new Paint(1);
        this.b = new Paint(1);
        this.d = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(f6 f6Var, Context context) {
        super(context);
        this.e = f6Var;
        this.b = new RectF();
        this.c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(ug.g0 g0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.e = g0Var;
        this.d = i6Var;
        this.b = new ug.a1(org.telegram.ui.ActionBar.n6.Ck, org.telegram.ui.ActionBar.n6.Dk, -1, -1, i6Var);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.e = photoViewer;
        this.c = new Paint(3);
        this.b = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d = new Matrix();
    }
}
