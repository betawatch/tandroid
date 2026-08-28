package bh;

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
import bg.z;
import ff.c0;
import g7.e6;
import g7.n;
import gh.g5;
import gh.k5;
import gh.l4;
import gh.s3;
import gh.t3;
import kh.s5;
import kh.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.l0;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.r7;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z21;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.b1;
import org.telegram.ui.dc1;
import org.telegram.ui.m0;
import org.telegram.ui.ob1;
import org.telegram.ui.oc1;
import org.telegram.ui.ta1;
import org.telegram.ui.u5;
import org.telegram.ui.w21;
import org.telegram.ui.yr0;
import org.telegram.ui.zr0;
import zf.a1;
import zf.f0;
import zf.t;
import zf.x0;
import zf.z0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g extends FrameLayout {
    public final /* synthetic */ int a = 3;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ g(Context context) {
        super(context);
    }

    public float a() {
        k5 k5Var = (k5) this.e;
        return (k5Var.U0.a(3) * k5Var.w0.getMeasuredHeight()) + (k5Var.U0.a(2) * k5Var.u0.getMeasuredHeight()) + (k5Var.U0.a(1) * k5Var.n0.getMeasuredHeight()) + (k5Var.U0.a(0) * k5Var.b0.getMeasuredHeight()) + k5Var.a0.getRealHeight() + 0.0f;
    }

    public void b(boolean z10) {
        ((ImageView) this.b).setVisibility(z10 ? 0 : 8);
        TextView textView = (TextView) this.c;
        boolean z11 = LocaleController.isRTL;
        textView.setLayoutParams(e6.d(-1, -2.0f, 55, (z11 || !z10) ? 22.0f : 53.0f, 14.0f, (z11 && z10) ? 53.0f : 22.0f, 12.0f));
    }

    public void c(int i9, String str) {
        ((TextView) this.c).setText(str);
        ((ImageView) this.b).setImageDrawable(getContext().getDrawable(i9));
    }

    public float d() {
        l4 l4Var;
        float max = Math.max(0.0f, getHeight() - a());
        k5 k5Var = (k5) this.e;
        wk0 wk0Var = k5Var.d;
        int childCount = wk0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = wk0Var.getChildAt(childCount);
            wk0Var.getClass();
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
                    max = childAt.getY() - k5Var.a0.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a2 = (k5Var.U0.a(4) * k5Var.getBottomInset()) + max;
        Float f10 = k5Var.T0;
        return (f10 == null || (l4Var = k5Var.U0) == null || l4Var.a >= 1.0f) ? a2 : AndroidUtilities.lerp(f10.floatValue(), a2, k5Var.U0.a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i9;
        int i10;
        float globalXOffset;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float globalXOffset2;
        Drawable drawable;
        int i11;
        Drawable drawable2;
        switch (this.a) {
            case 1:
                k5 k5Var = (k5) this.e;
                k5Var.H(canvas, this);
                canvas.save();
                float d = d();
                float dp = AndroidUtilities.dp(12.0f);
                RectF rectF = (RectF) this.b;
                i9 = ((f3) k5Var).backgroundPaddingLeft;
                int width = getWidth();
                i10 = ((f3) k5Var).backgroundPaddingLeft;
                rectF.set(i9, d, width - i10, getHeight() + dp);
                Paint paint = (Paint) this.c;
                paint.setColor(k5Var.getThemedColor(f6.h5));
                Path path = (Path) this.d;
                path.rewind();
                path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                e();
                canvas.restore();
                pa paVar = k5Var.e;
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
                k5Var.G(canvas, this);
                break;
            case 2:
            case 3:
            case 6:
            case 8:
            default:
                super.dispatchDraw(canvas);
                break;
            case 4:
                Path path2 = (Path) this.b;
                z21 z21Var = (z21) this.e;
                float z10 = z21Var.z(true);
                float lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(12.0f), n.a(z10 / AndroidUtilities.dpf2(24.0f), 0.0f, 1.0f));
                z21Var.x.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, z10));
                boolean z11 = z10 <= ((float) AndroidUtilities.statusBarHeight) / 2.0f;
                Boolean bool = (Boolean) this.d;
                if (bool == null || bool.booleanValue() != z11) {
                    this.d = Boolean.valueOf(z11);
                    AndroidUtilities.setLightStatusBar(z21Var.getWindow(), AndroidUtilities.computePerceivedBrightness(z11 ? z21Var.getThemedColor(f6.h5) : f6.v(z21Var.getThemedColor(f6.s8), 855638016)) > 0.721f);
                }
                z21Var.topBulletinContainer.setTranslationY(Math.max(z21Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, z10) + getTranslationY() + ((-r3.getTop()) - z21Var.topBulletinContainer.getHeight()));
                path2.rewind();
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, z10, getWidth(), getHeight() + lerp);
                path2.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
                canvas.drawPath(path2, (Paint) this.c);
                super.dispatchDraw(canvas);
                break;
            case 5:
                LinearGradient linearGradient = (LinearGradient) this.c;
                Matrix matrix = (Matrix) this.d;
                Paint paint2 = (Paint) this.b;
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (!photoViewer.O4) {
                    int measuredHeight = photoViewer.j0.getVisibility() == 0 ? getMeasuredHeight() - AndroidUtilities.dp(48.0f) : 0;
                    int i12 = photoViewer.Y1;
                    if (i12 == 0 || i12 == 2 || i12 == -1) {
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
            case 7:
                Paint paint3 = (Paint) this.d;
                Paint paint4 = (Paint) this.c;
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float dp2 = AndroidUtilities.dp(8.0f);
                Paint paint5 = (Paint) this.b;
                paint5.setColor(0);
                float dpf2 = AndroidUtilities.dpf2(1.0f);
                float dpf22 = AndroidUtilities.dpf2(0.33f);
                oc1 oc1Var = (oc1) this.e;
                paint5.setShadowLayer(dpf2, 0.0f, dpf22, i0.a.k(-16777216, (int) (oc1Var.N1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF3, dp2, dp2, paint5);
                dc1 dc1Var = oc1Var.t0;
                ob1 ob1Var = oc1Var.a;
                f6.s(this, dc1Var, ob1Var);
                Paint O = ob1Var.O("paintChatActionBackground");
                int alpha = O.getAlpha();
                O.setAlpha((int) (oc1Var.N1.getAlpha() * alpha));
                canvas.drawRoundRect(rectF3, dp2, dp2, O);
                O.setAlpha(alpha);
                if (oc1Var.I1) {
                    float f10 = oc1Var.j1;
                    if (f10 > 0.0f) {
                        paint3.setColor(i0.a.k(-16777216, (int) (f10 * 255.0f * oc1Var.k1)));
                        canvas.drawRoundRect(rectF3, dp2, dp2, paint3);
                    }
                }
                paint4.setColor(520093695);
                paint4.setAlpha((int) (oc1Var.N1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF3, dp2, dp2, paint4);
                super.dispatchDraw(canvas);
                break;
            case 9:
                b6 b6Var = (b6) this.d;
                Paint paint6 = (Paint) this.b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                if (!limitPreviewView.L) {
                    paint6.setColor(f6.v0(f6.a7, b6Var));
                } else if (limitPreviewView.V || limitPreviewView.N) {
                    paint6.setColor(f6.v0(f6.i6, b6Var));
                } else {
                    paint6.setColor(f6.v0(f6.e7, b6Var));
                }
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                t tVar = limitPreviewView.a0;
                if (tVar != null) {
                    canvas.drawRoundRect(rectF4, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ((u5) ((b1) tVar).b).s0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF4, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint6);
                }
                canvas.save();
                if (!limitPreviewView.L) {
                    canvas.clipRect(limitPreviewView.n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                Paint e10 = limitPreviewView.N ? limitPreviewView.G : limitPreviewView.a0 != null ? (Paint) this.c : a1.d().e();
                ViewGroup viewGroup = limitPreviewView.y;
                if (viewGroup != null) {
                    z0 z0Var = limitPreviewView.A;
                    if (z0Var != null) {
                        e10 = z0Var.f;
                        float f11 = limitPreviewView.c;
                        float f12 = -limitPreviewView.B;
                        z0Var.a();
                        Matrix matrix2 = z0Var.e;
                        matrix2.reset();
                        matrix2.postScale(1.0f, f11 / 100.0f, 0.0f, 0.0f);
                        matrix2.postTranslate(0.0f, f12);
                        z0Var.d.setLocalMatrix(matrix2);
                    } else {
                        float f13 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f13 += view.getY();
                        }
                        a1 d9 = a1.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight2 = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d9.f(globalXOffset2 - getLeft(), -f13, measuredWidth, measuredHeight2);
                    }
                } else {
                    a1 d10 = a1.d();
                    int measuredWidth2 = limitPreviewView.getMeasuredWidth();
                    int measuredHeight3 = limitPreviewView.getMeasuredHeight();
                    globalXOffset = limitPreviewView.getGlobalXOffset();
                    d10.f(globalXOffset - getLeft(), -getTop(), measuredWidth2, measuredHeight3);
                }
                int alpha2 = e10.getAlpha();
                if (limitPreviewView.R && (valueAnimator2 = limitPreviewView.e0) != null) {
                    e10.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha2));
                } else if (limitPreviewView.Q && (valueAnimator = limitPreviewView.e0) != null) {
                    e10.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha2));
                }
                if (limitPreviewView.L) {
                    if (limitPreviewView.H || limitPreviewView.I) {
                        AndroidUtilities.rectTmp.set(limitPreviewView.n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    } else {
                        AndroidUtilities.rectTmp.set(0.0f, 0.0f, limitPreviewView.n, getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), e10);
                e10.setAlpha(alpha2);
                canvas.restore();
                if (limitPreviewView.A == null && limitPreviewView.W) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                break;
            case 10:
                Paint paint7 = (Paint) this.c;
                paint7.setColor(f6.v0(f6.Ii, (b6) this.d));
                f0 f0Var = (f0) this.e;
                canvas.drawLine(AndroidUtilities.dp(18.0f), getHeight() / 2.0f, f0Var.d.getLeft() - AndroidUtilities.dp(20.0f), getHeight() / 2.0f, paint7);
                canvas.drawLine(AndroidUtilities.dp(20.0f) + f0Var.d.getRight(), getHeight() / 2.0f, getWidth() - AndroidUtilities.dp(18.0f), getHeight() / 2.0f, paint7);
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(f0Var.d.getLeft() - AndroidUtilities.dp(15.0f), ((f0Var.d.getBottom() + f0Var.d.getTop()) - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(15.0f) + f0Var.d.getRight(), (AndroidUtilities.dp(30.0f) + (f0Var.d.getBottom() + f0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF5.left, rectF5.top);
                rectF5.set(0.0f, 0.0f, rectF5.width(), rectF5.height());
                z0 z0Var2 = (z0) this.b;
                z0Var2.e(rectF5);
                canvas.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), z0Var2.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 11:
                Drawable drawable3 = (Drawable) this.d;
                x0 x0Var = (x0) this.e;
                drawable = ((f3) x0Var).shadowDrawable;
                int i13 = x0Var.I;
                i11 = ((f3) x0Var).backgroundPaddingTop;
                drawable.setBounds(0, ll.D(2.0f, i11 + i13, 1), getMeasuredWidth(), getMeasuredHeight());
                drawable2 = ((f3) x0Var).shadowDrawable;
                drawable2.draw(canvas);
                super.dispatchDraw(canvas);
                r7 r7Var = x0Var.J;
                if (r7Var != null && r7Var.getVisibility() == 0 && x0Var.J.getAlpha() != 0.0f) {
                    drawable3.setBounds(0, x0Var.J.getBottom(), getMeasuredWidth(), drawable3.getIntrinsicHeight() + x0Var.J.getBottom());
                    drawable3.setAlpha((int) (x0Var.J.getAlpha() * 255.0f));
                    drawable3.draw(canvas);
                    break;
                }
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewGroup viewGroup;
        int i9;
        switch (this.a) {
            case 1:
                k5 k5Var = (k5) this.e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < d()) {
                    viewGroup = ((f3) k5Var).containerView;
                    if (viewGroup.isAttachedToWindow()) {
                        k5Var.dismiss();
                        return true;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 4:
                z21 z21Var = (z21) this.e;
                if (z21Var.F != null && z21Var.G != null) {
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                        Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + z21Var.F.y());
                    }
                    if (z21Var.F.y() && z21Var.G.onTouchEvent(motionEvent)) {
                        Log.d("TA2", "overlay consumed (handle)");
                        return true;
                    }
                    boolean b10 = z21Var.G.b(motionEvent);
                    if (motionEvent.getAction() == 1) {
                        Log.d("TA2", "checkOnTap=" + b10);
                    }
                    if (b10) {
                        motionEvent.setAction(3);
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 11:
                x0 x0Var = (x0) this.e;
                if (motionEvent.getAction() == 0) {
                    float y10 = motionEvent.getY();
                    int i10 = x0Var.I;
                    i9 = ((f3) x0Var).backgroundPaddingTop;
                    if (y10 < AndroidUtilities.dp(2.0f) + (i10 - i9)) {
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
            case 2:
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ((u5) this.e).s0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
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
        t1 cell;
        ImageReceiver photoImage;
        switch (this.a) {
            case 0:
                b6 b6Var = (b6) this.d;
                c0 c0Var = (c0) this.c;
                c0 c0Var2 = (c0) this.b;
                boolean drawChild = super.drawChild(canvas, view, j10);
                j jVar = (j) this.e;
                int i9 = (int) jVar.T.e;
                if (view == jVar.d0 && i9 > 0) {
                    c0Var2.setBounds(0, AndroidUtilities.dp(40.0f), getWidth(), AndroidUtilities.dp(48.0f));
                    int i10 = f6.h5;
                    c0Var2.b(f6.v0(i10, b6Var));
                    c0Var2.draw(canvas);
                    int dp = AndroidUtilities.dp(48.0f) + i9;
                    c0Var.setBounds(0, dp - AndroidUtilities.dp(8.0f), getWidth(), dp);
                    c0Var.b(f6.v0(i10, b6Var));
                    c0Var.draw(canvas);
                }
                return drawChild;
            case 1:
                k5 k5Var = (k5) this.e;
                if (view == k5Var.e) {
                    return false;
                }
                if (view == k5Var.Z) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipPath((Path) this.d);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            case 8:
                float[] fArr = (float[]) this.c;
                Path path = (Path) this.d;
                Matrix matrix = (Matrix) this.b;
                s5 s5Var = (s5) this.e;
                yf.x0 x0Var = s5Var.n0;
                if (view != s5Var.s0) {
                    return super.drawChild(canvas, view, j10);
                }
                cell = s5Var.getCell();
                if (cell == null || (photoImage = cell.getPhotoImage()) == null) {
                    return false;
                }
                matrix.reset();
                float max = Math.max(photoImage.getImageWidth() / s5Var.u0, photoImage.getImageHeight() / s5Var.v0);
                matrix.postScale((s5Var.u0 / s5Var.s0.getWidth()) * max, (s5Var.v0 / s5Var.s0.getHeight()) * max);
                matrix.postTranslate((photoImage.getCenterX() + (cell.getX() + x0Var.getX())) - ((s5Var.u0 * max) / 2.0f), (photoImage.getCenterY() + (cell.getY() + x0Var.getY())) - ((s5Var.v0 * max) / 2.0f));
                s5Var.s0.setTransform(matrix);
                canvas.save();
                path.rewind();
                AndroidUtilities.rectTmp.set(photoImage.getImageX() + cell.getX() + x0Var.getX(), photoImage.getImageY() + cell.getY() + x0Var.getY(), photoImage.getImageX2() + cell.getX() + x0Var.getX(), photoImage.getImageY2() + cell.getY() + x0Var.getY());
                for (int i11 = 0; i11 < photoImage.getRoundRadius().length; i11++) {
                    int i12 = i11 * 2;
                    fArr[i12] = photoImage.getRoundRadius()[i11];
                    fArr[i12 + 1] = photoImage.getRoundRadius()[i11];
                }
                path.addRoundRect(AndroidUtilities.rectTmp, fArr, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            case 11:
                Path path2 = (Path) this.b;
                if (view != ((ScrollView) this.c)) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                path2.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getPaddingLeft(), AndroidUtilities.dp(18.0f) + ((x0) this.e).I, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                path2.addRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                super.drawChild(canvas, view, j10);
                canvas.restore();
                return true;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    public void e() {
        float d = d();
        k5 k5Var = (k5) this.e;
        s3 s3Var = k5Var.Z;
        s3Var.setTranslationY(d - s3Var.getHeight());
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(d - s3Var.getHeight(), 0.0f, AndroidUtilities.dp(32.0f)));
        s3Var.setAlpha(k5Var.U0.a(0) * clamp01);
        s3Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        s3Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        g5 g5Var = k5Var.a0;
        g5Var.setTranslationY(d);
        k5Var.b0.setTranslationY(g5Var.getRealHeight() + d);
        k5Var.n0.setTranslationY(g5Var.getRealHeight() + d);
        k5Var.u0.setTranslationY(g5Var.getRealHeight() + d);
        k5Var.w0.setTranslationY(g5Var.getRealHeight() + d);
        FrameLayout frameLayout = k5Var.topBulletinContainer;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
        }
        AndroidUtilities.updateViewVisibilityAnimated(k5Var.j0, k5Var.d.canScrollVertically(1));
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        switch (this.a) {
            case 11:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 4:
                super.onAttachedToWindow();
                gc.a(this, new z(13));
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 4:
                super.onDetachedFromWindow();
                gc.h(this);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 3:
                RectF rectF = (RectF) this.d;
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
                Path path = (Path) this.b;
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
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int left;
        int boundsRight;
        switch (this.a) {
            case 1:
                super.onLayout(z10, i9, i10, i11, i12);
                k5 k5Var = (k5) this.e;
                t3 t3Var = k5Var.M0;
                if (t3Var != null) {
                    t3Var.F(k5Var.a0.getFinalHeight(), k5Var.z1() + ((k5Var.U0.d(1) && k5Var.i0.getVisibility() == 0) ? k5Var.i0.getMeasuredHeight() : 0));
                }
                k5Var.T1();
                break;
            case 5:
                super.onLayout(z10, i9, i10, i11, i12);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (photoViewer.D0.getVisibility() != 8) {
                    int dp = (((i11 - i9) - (photoViewer.O0.getVisibility() == 0 ? AndroidUtilities.dp(63.0f) : 0)) - photoViewer.D0.getMeasuredWidth()) / 2;
                    ta1 ta1Var = photoViewer.D0;
                    ta1Var.layout(dp, ta1Var.getTop(), photoViewer.D0.getMeasuredWidth() + dp, photoViewer.D0.getMeasuredHeight() + photoViewer.D0.getTop());
                    break;
                }
                break;
            case 8:
                s5 s5Var = (s5) this.e;
                yf.x0 x0Var = s5Var.n0;
                int measuredWidth = x0Var.getMeasuredWidth();
                int i13 = 0;
                for (int i14 = 0; i14 < x0Var.getChildCount(); i14++) {
                    View childAt = x0Var.getChildAt(i14);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof t1) {
                        t1 t1Var = (t1) childAt;
                        left2 = childAt.getLeft() + t1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = t1Var.getBoundsRight();
                    } else if (childAt instanceof w0) {
                        w0 w0Var = (w0) childAt;
                        left2 = childAt.getLeft() + w0Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = w0Var.getBoundsRight();
                    } else {
                        measuredWidth = Math.min(left2, measuredWidth);
                        i13 = Math.max(right, i13);
                    }
                    right = boundsRight + left;
                    measuredWidth = Math.min(left2, measuredWidth);
                    i13 = Math.max(right, i13);
                }
                x0Var.layout(-measuredWidth, 0, x0Var.getMeasuredWidth() - measuredWidth, x0Var.getMeasuredHeight());
                TextureView textureView = s5Var.s0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), x0Var.getMeasuredHeight());
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
                    childAt3.layout(measuredWidth2, 0, i11 - i9, i15);
                    break;
                } else {
                    super.onLayout(z10, i9, i10, i11, i12);
                    break;
                }
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        int left;
        int boundsRight;
        int i11;
        switch (this.a) {
            case 1:
                k5 k5Var = (k5) this.e;
                int bottomInset = k5Var.getBottomInset();
                int i12 = 0;
                setPadding(0, 0, 0, bottomInset);
                k5Var.a0.H.setPadding(0, 0, 0, bottomInset);
                int size = View.MeasureSpec.getSize(i10);
                k5Var.h = size;
                int size2 = View.MeasureSpec.getSize(i9);
                for (int i13 = 0; i13 < getChildCount(); i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt instanceof x3) {
                        childAt.measure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_30));
                    } else if (childAt == k5Var.d) {
                        childAt.measure(i9, View.MeasureSpec.makeMeasureSpec(size - bottomInset, TLObject.FLAG_30));
                    } else {
                        childAt.measure(i9, View.MeasureSpec.makeMeasureSpec((childAt.getLayoutParams() == null || childAt.getLayoutParams().height != -1) ? 9999 : size, TLObject.FLAG_31));
                    }
                }
                setMeasuredDimension(size2, size);
                t3 t3Var = k5Var.M0;
                if (t3Var != null) {
                    int finalHeight = k5Var.a0.getFinalHeight();
                    int z12 = k5Var.z1();
                    if (k5Var.U0.d(1) && k5Var.i0.getVisibility() == 0) {
                        i12 = k5Var.i0.getMeasuredHeight();
                    }
                    t3Var.F(finalHeight, z12 + i12);
                    break;
                }
                break;
            case 2:
            case 3:
            case 7:
            case 10:
            default:
                super.onMeasure(i9, i10);
                break;
            case 4:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
                break;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                ((FrameLayout.LayoutParams) photoViewer.D0.getLayoutParams()).rightMargin = photoViewer.O0.getVisibility() == 0 ? AndroidUtilities.dp(63.0f) : 0;
                super.onMeasure(i9, i10);
                break;
            case 6:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), i10);
                break;
            case 8:
                s5 s5Var = (s5) this.e;
                yf.x0 x0Var = s5Var.n0;
                x0Var.measure(i9, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = s5Var.s0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(x0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(x0Var.getMeasuredHeight(), TLObject.FLAG_30));
                }
                int measuredWidth = x0Var.getMeasuredWidth();
                int i14 = 0;
                for (int i15 = 0; i15 < x0Var.getChildCount(); i15++) {
                    View childAt2 = x0Var.getChildAt(i15);
                    int left2 = childAt2.getLeft();
                    int right = childAt2.getRight();
                    if (childAt2 instanceof t1) {
                        t1 t1Var = (t1) childAt2;
                        left2 = childAt2.getLeft() + t1Var.getBoundsLeft();
                        left = childAt2.getLeft();
                        boundsRight = t1Var.getBoundsRight();
                    } else if (childAt2 instanceof w0) {
                        w0 w0Var = (w0) childAt2;
                        left2 = childAt2.getLeft() + w0Var.getBoundsLeft();
                        left = childAt2.getLeft();
                        boundsRight = w0Var.getBoundsRight();
                    } else {
                        measuredWidth = Math.min(left2, measuredWidth);
                        i14 = Math.max(right, i14);
                    }
                    right = boundsRight + left;
                    measuredWidth = Math.min(left2, measuredWidth);
                    i14 = Math.max(right, i14);
                }
                setMeasuredDimension(i14 - measuredWidth, x0Var.getMeasuredHeight());
                break;
            case 9:
                b6 b6Var = (b6) this.d;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                TextView textView = limitPreviewView.w;
                tf0 tf0Var = limitPreviewView.c0;
                j6 j6Var = limitPreviewView.J;
                tf0 tf0Var2 = limitPreviewView.b0;
                j6 j6Var2 = limitPreviewView.v;
                if (getChildCount() == 2) {
                    int size3 = View.MeasureSpec.getSize(i9);
                    int size4 = View.MeasureSpec.getSize(i10);
                    tf0Var2.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                    int max = Math.max(tf0Var2.getMeasuredWidth(), j6Var.getMeasuredWidth() + AndroidUtilities.dp(24.0f) + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() + AndroidUtilities.dp(24.0f) : 0));
                    tf0Var.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                    if (limitPreviewView.L) {
                        float f10 = limitPreviewView.a;
                        if (f10 == 0.0f) {
                            limitPreviewView.n = 0;
                            if (!limitPreviewView.Q && !limitPreviewView.R) {
                                j6Var2.setTextColor((!limitPreviewView.H && limitPreviewView.a0 == null) ? f6.v0(f6.G6, b6Var) : -1);
                                j6Var.setTextColor(limitPreviewView.a0 == null ? f6.v0(f6.G6, b6Var) : -1);
                            }
                        } else if (f10 < 1.0f) {
                            float measuredWidth2 = limitPreviewView.H ? 0.0f : tf0Var2.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            limitPreviewView.n = (int) ((((size3 - measuredWidth2) - (limitPreviewView.H ? 0.0f : tf0Var.getMeasuredWidth() - AndroidUtilities.dp(8.0f))) * limitPreviewView.a) + measuredWidth2);
                            if (!limitPreviewView.Q && !limitPreviewView.R) {
                                j6Var2.setTextColor((!limitPreviewView.H && limitPreviewView.a0 == null) ? f6.v0(f6.G6, b6Var) : -1);
                                j6Var.setTextColor(-1);
                            }
                        } else {
                            limitPreviewView.n = size3;
                            if (!limitPreviewView.Q && !limitPreviewView.R) {
                                j6Var2.setTextColor(-1);
                                j6Var.setTextColor(-1);
                            }
                        }
                    } else {
                        int clamp = (int) Utilities.clamp(size3 * limitPreviewView.a, size3 - Math.max(tf0Var.getMeasuredWidth(), (limitPreviewView.K.getMeasuredWidth() + AndroidUtilities.dp(24.0f)) + (j6Var2.getVisibility() == 0 ? j6Var2.getMeasuredWidth() + AndroidUtilities.dp(24.0f) : 0)), max);
                        limitPreviewView.n = clamp;
                        tf0Var2.measure(View.MeasureSpec.makeMeasureSpec(clamp, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                        tf0Var.measure(View.MeasureSpec.makeMeasureSpec(size3 - limitPreviewView.n, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                    }
                    setMeasuredDimension(size3, size4);
                    break;
                } else {
                    super.onMeasure(i9, i10);
                    break;
                }
                break;
            case 11:
                x0 x0Var2 = (x0) this.e;
                x0Var2.H = 0;
                ScrollView scrollView = (ScrollView) this.c;
                scrollView.measure(i9, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_31));
                int size5 = View.MeasureSpec.getSize(i10) - scrollView.getMeasuredHeight();
                i11 = ((f3) x0Var2).backgroundPaddingTop;
                x0Var2.H = i11 + size5;
                super.onMeasure(i9, i10);
                x0Var2.y();
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 5:
                super.setAlpha(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.M7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.M7.setAlpha(f10);
                }
                yr0 yr0Var = photoViewer.Q1;
                if (yr0Var != null && yr0Var.getVisibility() != 8) {
                    photoViewer.Q1.setAlpha(photoViewer.u7[0] * f10);
                }
                zr0 zr0Var = photoViewer.R1;
                if (zr0Var != null && zr0Var.getVisibility() != 8) {
                    photoViewer.R1.setAlpha(f10 * photoViewer.v7[0]);
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
            case 1:
                super.setTranslationY(f10);
                FrameLayout frameLayout = ((k5) this.e).topBulletinContainer;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
                    break;
                }
                break;
            case 4:
                super.setTranslationY(f10);
                z21 z21Var = (z21) this.e;
                z21Var.topBulletinContainer.setTranslationY(Math.max(z21Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, z21Var.z(true)) + ((-r1.getTop()) - z21Var.topBulletinContainer.getHeight()) + f10);
                break;
            case 5:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout2 = photoViewer.M7;
                if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
                    photoViewer.M7.setTranslationY(photoViewer.L0.getTranslationY() - (photoViewer.Q1.getAlpha() * l0.b(46.0f, photoViewer.Q1.getEditTextHeight(), 0)));
                }
                m0 m0Var = photoViewer.T1;
                if (m0Var != null) {
                    m0Var.setTranslationY(f10);
                }
                TextView textView = photoViewer.O7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.O7.setTranslationY(f10);
                    break;
                }
                break;
            case 11:
                super.setTranslationY(f10);
                ((x0) this.e).onContainerTranslationYChanged(f10);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        switch (this.a) {
            case 5:
                super.setVisibility(i9);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.M7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.M7.setVisibility(i9 == 0 ? 0 : 4);
                    break;
                }
                break;
            default:
                super.setVisibility(i9);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(s5 s5Var, Context context) {
        super(context);
        this.e = s5Var;
        this.b = new Matrix();
        this.c = new float[8];
        this.d = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LimitPreviewView limitPreviewView, Context context, b6 b6Var) {
        super(context);
        this.e = limitPreviewView;
        this.d = b6Var;
        this.b = new Paint();
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(-1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, j jVar, b6 b6Var) {
        super(context);
        this.e = jVar;
        this.d = b6Var;
        this.b = new c0(2);
        this.c = new c0(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(x0 x0Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.e = x0Var;
        this.c = scrollView;
        this.d = drawable;
        this.b = new Path();
    }

    public g(Context context, b6 b6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.c = textView;
        ll.k(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTextColor(f6.v0(f6.j5, b6Var));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        h2 h2Var = new h2(false);
        this.d = h2Var;
        imageView.setImageDrawable(h2Var);
        h2Var.a(-1);
        addView(imageView, e6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new w21(this, 0));
        b(true);
        setMinimumHeight(AndroidUtilities.dp(56.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(u5 u5Var, Context context) {
        super(context);
        this.e = u5Var;
        this.d = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.b = imageView;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        addView(imageView, e6.e(-2, -2, 1));
        addView(textView, e6.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setMinimumWidth(AndroidUtilities.dp(100.0f));
        int dp = AndroidUtilities.dp(10.0f);
        int k10 = i0.a.k(-16777216, 80);
        setBackground(f6.i0(dp, dp, dp, dp, 0, k10, k10));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(z21 z21Var, Context context) {
        super(context);
        this.e = z21Var;
        this.b = new Path();
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(z21Var.getThemedColor(f6.h5));
        f6.m(paint);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(oc1 oc1Var, Activity activity) {
        super(activity);
        this.e = oc1Var;
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k5 k5Var, Context context) {
        super(context);
        this.e = k5Var;
        this.b = new RectF();
        this.c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f0 f0Var, Context context, b6 b6Var) {
        super(context);
        this.e = f0Var;
        this.d = b6Var;
        this.b = new z0(f6.Lj, f6.Mj, -1, -1, b6Var);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.e = photoViewer;
        this.b = new Paint(3);
        this.c = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d = new Matrix();
    }
}
