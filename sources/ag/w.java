package ag;

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
import h7.z5;
import hh.e5;
import hh.i5;
import hh.j4;
import hh.r3;
import lh.r5;
import lh.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.as0;
import org.telegram.ui.cc1;
import org.telegram.ui.mb1;
import org.telegram.ui.nc1;
import org.telegram.ui.ra1;
import org.telegram.ui.v21;
import org.telegram.ui.v5;
import org.telegram.ui.zr0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w extends FrameLayout {
    public final /* synthetic */ int a = 1;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ w(Context context) {
        super(context);
    }

    public float a() {
        i5 i5Var = (i5) this.e;
        return (i5Var.U0.a(3) * i5Var.w0.getMeasuredHeight()) + (i5Var.U0.a(2) * i5Var.u0.getMeasuredHeight()) + (i5Var.U0.a(1) * i5Var.n0.getMeasuredHeight()) + (i5Var.U0.a(0) * i5Var.b0.getMeasuredHeight()) + i5Var.a0.getRealHeight() + 0.0f;
    }

    public void b(boolean z10) {
        ((ImageView) this.b).setVisibility(z10 ? 0 : 8);
        TextView textView = (TextView) this.d;
        boolean z11 = LocaleController.isRTL;
        textView.setLayoutParams(z5.d(-1, -2.0f, 55, (z11 || !z10) ? 22.0f : 53.0f, 14.0f, (z11 && z10) ? 53.0f : 22.0f, 12.0f));
    }

    public void c(int i10, String str) {
        ((TextView) this.d).setText(str);
        ((ImageView) this.b).setImageDrawable(getContext().getDrawable(i10));
    }

    public float d() {
        j4 j4Var;
        float max = Math.max(0.0f, getHeight() - a());
        i5 i5Var = (i5) this.e;
        zk0 zk0Var = i5Var.d;
        int childCount = zk0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = zk0Var.getChildAt(childCount);
            zk0Var.getClass();
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
                    max = childAt.getY() - i5Var.a0.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a2 = (i5Var.U0.a(4) * i5Var.getBottomInset()) + max;
        Float f10 = i5Var.T0;
        return (f10 == null || (j4Var = i5Var.U0) == null || j4Var.a >= 1.0f) ? a2 : AndroidUtilities.lerp(f10.floatValue(), a2, i5Var.U0.a);
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
            case 0:
                c6 c6Var = (c6) this.c;
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
                c0 c0Var = limitPreviewView.a0;
                if (c0Var != null) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ((v5) ((org.telegram.ui.c1) c0Var).b).t0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                }
                canvas.save();
                if (!limitPreviewView.L) {
                    canvas.clipRect(limitPreviewView.n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                Paint e9 = limitPreviewView.N ? limitPreviewView.G : limitPreviewView.a0 != null ? (Paint) this.d : j2.d().e();
                ViewGroup viewGroup = limitPreviewView.y;
                if (viewGroup != null) {
                    i2 i2Var = limitPreviewView.A;
                    if (i2Var != null) {
                        e9 = i2Var.f;
                        float f10 = limitPreviewView.c;
                        float f11 = -limitPreviewView.B;
                        i2Var.a();
                        Matrix matrix = i2Var.e;
                        matrix.reset();
                        matrix.postScale(1.0f, f10 / 100.0f, 0.0f, 0.0f);
                        matrix.postTranslate(0.0f, f11);
                        i2Var.d.setLocalMatrix(matrix);
                    } else {
                        float f12 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f12 += view.getY();
                        }
                        j2 d = j2.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d.f(globalXOffset2 - getLeft(), -f12, measuredWidth, measuredHeight);
                    }
                } else {
                    j2 d10 = j2.d();
                    int measuredWidth2 = limitPreviewView.getMeasuredWidth();
                    int measuredHeight2 = limitPreviewView.getMeasuredHeight();
                    globalXOffset = limitPreviewView.getGlobalXOffset();
                    d10.f(globalXOffset - getLeft(), -getTop(), measuredWidth2, measuredHeight2);
                }
                int alpha = e9.getAlpha();
                if (limitPreviewView.R && (valueAnimator2 = limitPreviewView.e0) != null) {
                    e9.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha));
                } else if (limitPreviewView.Q && (valueAnimator = limitPreviewView.e0) != null) {
                    e9.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha));
                }
                if (limitPreviewView.L) {
                    if (limitPreviewView.H || limitPreviewView.I) {
                        AndroidUtilities.rectTmp.set(limitPreviewView.n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    } else {
                        AndroidUtilities.rectTmp.set(0.0f, 0.0f, limitPreviewView.n, getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), e9);
                e9.setAlpha(alpha);
                canvas.restore();
                if (limitPreviewView.A == null && limitPreviewView.W) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                Paint paint2 = (Paint) this.b;
                paint2.setColor(g6.v0(g6.Ii, (c6) this.c));
                c1 c1Var = (c1) this.e;
                canvas.drawLine(AndroidUtilities.dp(18.0f), getHeight() / 2.0f, c1Var.d.getLeft() - AndroidUtilities.dp(20.0f), getHeight() / 2.0f, paint2);
                canvas.drawLine(AndroidUtilities.dp(20.0f) + c1Var.d.getRight(), getHeight() / 2.0f, getWidth() - AndroidUtilities.dp(18.0f), getHeight() / 2.0f, paint2);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(c1Var.d.getLeft() - AndroidUtilities.dp(15.0f), ((c1Var.d.getBottom() + c1Var.d.getTop()) - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(15.0f) + c1Var.d.getRight(), (AndroidUtilities.dp(30.0f) + (c1Var.d.getBottom() + c1Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF2.left, rectF2.top);
                rectF2.set(0.0f, 0.0f, rectF2.width(), rectF2.height());
                i2 i2Var2 = (i2) this.d;
                i2Var2.e(rectF2);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), i2Var2.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 2:
                Drawable drawable3 = (Drawable) this.c;
                g2 g2Var = (g2) this.e;
                drawable = ((org.telegram.ui.ActionBar.e3) g2Var).shadowDrawable;
                int i13 = g2Var.I;
                i10 = ((org.telegram.ui.ActionBar.e3) g2Var).backgroundPaddingTop;
                drawable.setBounds(0, rl.C(2.0f, i10 + i13, 1), getMeasuredWidth(), getMeasuredHeight());
                drawable2 = ((org.telegram.ui.ActionBar.e3) g2Var).shadowDrawable;
                drawable2.draw(canvas);
                super.dispatchDraw(canvas);
                d2 d2Var = g2Var.J;
                if (d2Var != null && d2Var.getVisibility() == 0 && g2Var.J.getAlpha() != 0.0f) {
                    drawable3.setBounds(0, g2Var.J.getBottom(), getMeasuredWidth(), drawable3.getIntrinsicHeight() + g2Var.J.getBottom());
                    drawable3.setAlpha((int) (g2Var.J.getAlpha() * 255.0f));
                    drawable3.draw(canvas);
                    break;
                }
                break;
            case 3:
            case 5:
            case 6:
            case 9:
            default:
                super.dispatchDraw(canvas);
                break;
            case 4:
                i5 i5Var = (i5) this.e;
                i5Var.I(canvas, this);
                canvas.save();
                float d11 = d();
                float dp = AndroidUtilities.dp(12.0f);
                RectF rectF3 = (RectF) this.d;
                i11 = ((org.telegram.ui.ActionBar.e3) i5Var).backgroundPaddingLeft;
                int width = getWidth();
                i12 = ((org.telegram.ui.ActionBar.e3) i5Var).backgroundPaddingLeft;
                rectF3.set(i11, d11, width - i12, getHeight() + dp);
                Paint paint3 = (Paint) this.b;
                paint3.setColor(i5Var.getThemedColor(g6.h5));
                Path path = (Path) this.c;
                path.rewind();
                path.addRoundRect(rectF3, dp, dp, Path.Direction.CW);
                canvas.drawPath(path, paint3);
                super.dispatchDraw(canvas);
                e();
                canvas.restore();
                na naVar = i5Var.e;
                if (naVar != null && naVar.getVisibility() == 0 && naVar.getAlpha() > 0.0f) {
                    if (naVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(naVar.getX(), naVar.getY(), naVar.getX() + naVar.getMeasuredWidth(), naVar.getY() + naVar.getMeasuredHeight(), (int) (naVar.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(naVar.getX(), naVar.getY(), naVar.getX() + naVar.getMeasuredWidth(), naVar.getY() + naVar.getMeasuredHeight());
                    }
                    canvas.translate(naVar.getX(), naVar.getY());
                    naVar.draw(canvas);
                    canvas.restore();
                }
                i5Var.H(canvas, this);
                break;
            case 7:
                Path path2 = (Path) this.d;
                b31 b31Var = (b31) this.e;
                float B = b31Var.B(true);
                float lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(12.0f), h7.n.a(B / AndroidUtilities.dpf2(24.0f), 0.0f, 1.0f));
                b31Var.x.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, B));
                boolean z10 = B <= ((float) AndroidUtilities.statusBarHeight) / 2.0f;
                Boolean bool = (Boolean) this.c;
                if (bool == null || bool.booleanValue() != z10) {
                    this.c = Boolean.valueOf(z10);
                    AndroidUtilities.setLightStatusBar(b31Var.getWindow(), AndroidUtilities.computePerceivedBrightness(z10 ? b31Var.getThemedColor(g6.h5) : g6.v(b31Var.getThemedColor(g6.s8), 855638016)) > 0.721f);
                }
                b31Var.topBulletinContainer.setTranslationY(Math.max(b31Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, B) + getTranslationY() + ((-r3.getTop()) - b31Var.topBulletinContainer.getHeight()));
                path2.rewind();
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(0.0f, B, getWidth(), getHeight() + lerp);
                path2.addRoundRect(rectF4, lerp, lerp, Path.Direction.CW);
                canvas.drawPath(path2, (Paint) this.b);
                super.dispatchDraw(canvas);
                break;
            case 8:
                LinearGradient linearGradient = (LinearGradient) this.d;
                Matrix matrix2 = (Matrix) this.c;
                Paint paint4 = (Paint) this.b;
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
            case 10:
                Paint paint5 = (Paint) this.c;
                Paint paint6 = (Paint) this.d;
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float dp2 = AndroidUtilities.dp(8.0f);
                Paint paint7 = (Paint) this.b;
                paint7.setColor(0);
                float dpf2 = AndroidUtilities.dpf2(1.0f);
                float dpf22 = AndroidUtilities.dpf2(0.33f);
                nc1 nc1Var = (nc1) this.e;
                paint7.setShadowLayer(dpf2, 0.0f, dpf22, i0.b.k(-16777216, (int) (nc1Var.N1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF5, dp2, dp2, paint7);
                cc1 cc1Var = nc1Var.t0;
                mb1 mb1Var = nc1Var.a;
                g6.s(this, cc1Var, mb1Var);
                Paint N = mb1Var.N("paintChatActionBackground");
                int alpha2 = N.getAlpha();
                N.setAlpha((int) (nc1Var.N1.getAlpha() * alpha2));
                canvas.drawRoundRect(rectF5, dp2, dp2, N);
                N.setAlpha(alpha2);
                if (nc1Var.I1) {
                    float f13 = nc1Var.j1;
                    if (f13 > 0.0f) {
                        paint5.setColor(i0.b.k(-16777216, (int) (f13 * 255.0f * nc1Var.k1)));
                        canvas.drawRoundRect(rectF5, dp2, dp2, paint5);
                    }
                }
                paint6.setColor(520093695);
                paint6.setAlpha((int) (nc1Var.N1.getAlpha() * 30.0f));
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
            case 2:
                g2 g2Var = (g2) this.e;
                if (motionEvent.getAction() == 0) {
                    float y10 = motionEvent.getY();
                    int i11 = g2Var.I;
                    i10 = ((org.telegram.ui.ActionBar.e3) g2Var).backgroundPaddingTop;
                    if (y10 < AndroidUtilities.dp(2.0f) + (i11 - i10)) {
                        g2Var.dismiss();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 4:
                i5 i5Var = (i5) this.e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < d()) {
                    viewGroup = ((org.telegram.ui.ActionBar.e3) i5Var).containerView;
                    if (viewGroup.isAttachedToWindow()) {
                        i5Var.dismiss();
                        return true;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 7:
                b31 b31Var = (b31) this.e;
                if (b31Var.F != null && b31Var.G != null) {
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                        Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + b31Var.F.y());
                    }
                    if (b31Var.F.y() && b31Var.G.onTouchEvent(motionEvent)) {
                        Log.d("TA2", "overlay consumed (handle)");
                        return true;
                    }
                    boolean b10 = b31Var.G.b(motionEvent);
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
            case 5:
                RectF rectF = (RectF) this.c;
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
            case 2:
                Path path = (Path) this.b;
                if (view != ((ScrollView) this.d)) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getPaddingLeft(), AndroidUtilities.dp(18.0f) + ((g2) this.e).I, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Path.Direction.CW);
                canvas.clipPath(path);
                super.drawChild(canvas, view, j10);
                canvas.restore();
                return true;
            case 3:
                c6 c6Var = (c6) this.c;
                gf.c0 c0Var = (gf.c0) this.d;
                gf.c0 c0Var2 = (gf.c0) this.b;
                boolean drawChild = super.drawChild(canvas, view, j10);
                ch.h hVar = (ch.h) this.e;
                int i10 = (int) hVar.T.e;
                if (view == hVar.d0 && i10 > 0) {
                    c0Var2.setBounds(0, AndroidUtilities.dp(40.0f), getWidth(), AndroidUtilities.dp(48.0f));
                    int i11 = g6.h5;
                    c0Var2.b(g6.v0(i11, c6Var));
                    c0Var2.draw(canvas);
                    int dp = AndroidUtilities.dp(48.0f) + i10;
                    c0Var.setBounds(0, dp - AndroidUtilities.dp(8.0f), getWidth(), dp);
                    c0Var.b(g6.v0(i11, c6Var));
                    c0Var.draw(canvas);
                }
                return drawChild;
            case 4:
                i5 i5Var = (i5) this.e;
                if (view == i5Var.e) {
                    return false;
                }
                if (view == i5Var.Z) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipPath((Path) this.c);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            case 11:
                float[] fArr = (float[]) this.d;
                Path path2 = (Path) this.c;
                Matrix matrix = (Matrix) this.b;
                r5 r5Var = (r5) this.e;
                zf.x0 x0Var = r5Var.n0;
                if (view != r5Var.s0) {
                    return super.drawChild(canvas, view, j10);
                }
                cell = r5Var.getCell();
                if (cell == null || (photoImage = cell.getPhotoImage()) == null) {
                    return false;
                }
                matrix.reset();
                float max = Math.max(photoImage.getImageWidth() / r5Var.u0, photoImage.getImageHeight() / r5Var.v0);
                matrix.postScale((r5Var.u0 / r5Var.s0.getWidth()) * max, (r5Var.v0 / r5Var.s0.getHeight()) * max);
                matrix.postTranslate((photoImage.getCenterX() + (cell.getX() + x0Var.getX())) - ((r5Var.u0 * max) / 2.0f), (photoImage.getCenterY() + (cell.getY() + x0Var.getY())) - ((r5Var.v0 * max) / 2.0f));
                r5Var.s0.setTransform(matrix);
                canvas.save();
                path2.rewind();
                AndroidUtilities.rectTmp.set(photoImage.getImageX() + cell.getX() + x0Var.getX(), photoImage.getImageY() + cell.getY() + x0Var.getY(), photoImage.getImageX2() + cell.getX() + x0Var.getX(), photoImage.getImageY2() + cell.getY() + x0Var.getY());
                for (int i12 = 0; i12 < photoImage.getRoundRadius().length; i12++) {
                    int i13 = i12 * 2;
                    fArr[i13] = photoImage.getRoundRadius()[i12];
                    fArr[i13 + 1] = photoImage.getRoundRadius()[i12];
                }
                path2.addRoundRect(AndroidUtilities.rectTmp, fArr, Path.Direction.CW);
                canvas.clipPath(path2);
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    public void e() {
        float d = d();
        i5 i5Var = (i5) this.e;
        r3 r3Var = i5Var.Z;
        r3Var.setTranslationY(d - r3Var.getHeight());
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(d - r3Var.getHeight(), 0.0f, AndroidUtilities.dp(32.0f)));
        r3Var.setAlpha(i5Var.U0.a(0) * clamp01);
        r3Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        r3Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        e5 e5Var = i5Var.a0;
        e5Var.setTranslationY(d);
        i5Var.b0.setTranslationY(e5Var.getRealHeight() + d);
        i5Var.n0.setTranslationY(e5Var.getRealHeight() + d);
        i5Var.u0.setTranslationY(e5Var.getRealHeight() + d);
        i5Var.w0.setTranslationY(e5Var.getRealHeight() + d);
        FrameLayout frameLayout = i5Var.topBulletinContainer;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
        }
        AndroidUtilities.updateViewVisibilityAnimated(i5Var.j0, i5Var.d.canScrollVertically(1));
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        switch (this.a) {
            case 2:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 7:
                super.onAttachedToWindow();
                ec.a(this, new cg.w(13));
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 7:
                super.onDetachedFromWindow();
                ec.h(this);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 6:
                RectF rectF = (RectF) this.e;
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
                Paint paint = (Paint) this.b;
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
                if (getChildCount() == 2) {
                    View childAt = getChildAt(0);
                    View childAt2 = getChildAt(1);
                    int measuredWidth = childAt.getMeasuredWidth();
                    int i14 = i13 - i11;
                    childAt.layout(0, 0, measuredWidth, i14);
                    childAt2.layout(measuredWidth, 0, i12 - i10, i14);
                    break;
                } else {
                    super.onLayout(z10, i10, i11, i12, i13);
                    break;
                }
            case 4:
                super.onLayout(z10, i10, i11, i12, i13);
                i5 i5Var = (i5) this.e;
                i iVar = i5Var.M0;
                if (iVar != null) {
                    iVar.F(i5Var.a0.getFinalHeight(), i5Var.z1() + ((i5Var.U0.d(1) && i5Var.i0.getVisibility() == 0) ? i5Var.i0.getMeasuredHeight() : 0));
                }
                i5Var.T1();
                break;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (photoViewer.D0.getVisibility() != 8) {
                    int dp = (((i12 - i10) - (photoViewer.O0.getVisibility() == 0 ? AndroidUtilities.dp(63.0f) : 0)) - photoViewer.D0.getMeasuredWidth()) / 2;
                    ra1 ra1Var = photoViewer.D0;
                    ra1Var.layout(dp, ra1Var.getTop(), photoViewer.D0.getMeasuredWidth() + dp, photoViewer.D0.getMeasuredHeight() + photoViewer.D0.getTop());
                    break;
                }
                break;
            case 11:
                r5 r5Var = (r5) this.e;
                zf.x0 x0Var = r5Var.n0;
                int measuredWidth2 = x0Var.getMeasuredWidth();
                int i15 = 0;
                for (int i16 = 0; i16 < x0Var.getChildCount(); i16++) {
                    View childAt3 = x0Var.getChildAt(i16);
                    int left2 = childAt3.getLeft();
                    int right = childAt3.getRight();
                    if (childAt3 instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt3;
                        left2 = childAt3.getLeft() + s1Var.getBoundsLeft();
                        left = childAt3.getLeft();
                        boundsRight = s1Var.getBoundsRight();
                    } else if (childAt3 instanceof org.telegram.ui.Cells.v0) {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt3;
                        left2 = childAt3.getLeft() + v0Var.getBoundsLeft();
                        left = childAt3.getLeft();
                        boundsRight = v0Var.getBoundsRight();
                    } else {
                        measuredWidth2 = Math.min(left2, measuredWidth2);
                        i15 = Math.max(right, i15);
                    }
                    right = boundsRight + left;
                    measuredWidth2 = Math.min(left2, measuredWidth2);
                    i15 = Math.max(right, i15);
                }
                x0Var.layout(-measuredWidth2, 0, x0Var.getMeasuredWidth() - measuredWidth2, x0Var.getMeasuredHeight());
                TextureView textureView = r5Var.s0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), x0Var.getMeasuredHeight());
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
        int i12;
        int left;
        int boundsRight;
        switch (this.a) {
            case 0:
                c6 c6Var = (c6) this.c;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                TextView textView = limitPreviewView.w;
                d0 d0Var = limitPreviewView.c0;
                j6 j6Var = limitPreviewView.J;
                d0 d0Var2 = limitPreviewView.b0;
                j6 j6Var2 = limitPreviewView.v;
                if (getChildCount() == 2) {
                    int size = View.MeasureSpec.getSize(i10);
                    int size2 = View.MeasureSpec.getSize(i11);
                    d0Var2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                    int max = Math.max(d0Var2.getMeasuredWidth(), j6Var.getMeasuredWidth() + AndroidUtilities.dp(24.0f) + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() + AndroidUtilities.dp(24.0f) : 0));
                    d0Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                    if (limitPreviewView.L) {
                        float f10 = limitPreviewView.a;
                        if (f10 == 0.0f) {
                            limitPreviewView.n = 0;
                            if (!limitPreviewView.Q && !limitPreviewView.R) {
                                j6Var2.setTextColor((!limitPreviewView.H && limitPreviewView.a0 == null) ? g6.v0(g6.G6, c6Var) : -1);
                                j6Var.setTextColor(limitPreviewView.a0 == null ? g6.v0(g6.G6, c6Var) : -1);
                            }
                        } else if (f10 < 1.0f) {
                            float measuredWidth = limitPreviewView.H ? 0.0f : d0Var2.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            limitPreviewView.n = (int) ((((size - measuredWidth) - (limitPreviewView.H ? 0.0f : d0Var.getMeasuredWidth() - AndroidUtilities.dp(8.0f))) * limitPreviewView.a) + measuredWidth);
                            if (!limitPreviewView.Q && !limitPreviewView.R) {
                                j6Var2.setTextColor((!limitPreviewView.H && limitPreviewView.a0 == null) ? g6.v0(g6.G6, c6Var) : -1);
                                j6Var.setTextColor(-1);
                            }
                        } else {
                            limitPreviewView.n = size;
                            if (!limitPreviewView.Q && !limitPreviewView.R) {
                                j6Var2.setTextColor(-1);
                                j6Var.setTextColor(-1);
                            }
                        }
                    } else {
                        int clamp = (int) Utilities.clamp(size * limitPreviewView.a, size - Math.max(d0Var.getMeasuredWidth(), (limitPreviewView.K.getMeasuredWidth() + AndroidUtilities.dp(24.0f)) + (j6Var2.getVisibility() == 0 ? j6Var2.getMeasuredWidth() + AndroidUtilities.dp(24.0f) : 0)), max);
                        limitPreviewView.n = clamp;
                        d0Var2.measure(View.MeasureSpec.makeMeasureSpec(clamp, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                        d0Var.measure(View.MeasureSpec.makeMeasureSpec(size - limitPreviewView.n, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                    }
                    setMeasuredDimension(size, size2);
                    break;
                } else {
                    super.onMeasure(i10, i11);
                    break;
                }
                break;
            case 1:
            case 3:
            case 5:
            case 6:
            case 10:
            default:
                super.onMeasure(i10, i11);
                break;
            case 2:
                g2 g2Var = (g2) this.e;
                g2Var.H = 0;
                ScrollView scrollView = (ScrollView) this.d;
                scrollView.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_31));
                int size3 = View.MeasureSpec.getSize(i11) - scrollView.getMeasuredHeight();
                i12 = ((org.telegram.ui.ActionBar.e3) g2Var).backgroundPaddingTop;
                g2Var.H = i12 + size3;
                super.onMeasure(i10, i11);
                g2Var.z();
                break;
            case 4:
                i5 i5Var = (i5) this.e;
                int bottomInset = i5Var.getBottomInset();
                int i13 = 0;
                setPadding(0, 0, 0, bottomInset);
                i5Var.a0.H.setPadding(0, 0, 0, bottomInset);
                int size4 = View.MeasureSpec.getSize(i11);
                i5Var.h = size4;
                int size5 = View.MeasureSpec.getSize(i10);
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt instanceof w3) {
                        childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_30));
                    } else if (childAt == i5Var.d) {
                        childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(size4 - bottomInset, TLObject.FLAG_30));
                    } else {
                        childAt.measure(i10, View.MeasureSpec.makeMeasureSpec((childAt.getLayoutParams() == null || childAt.getLayoutParams().height != -1) ? 9999 : size4, TLObject.FLAG_31));
                    }
                }
                setMeasuredDimension(size5, size4);
                i iVar = i5Var.M0;
                if (iVar != null) {
                    int finalHeight = i5Var.a0.getFinalHeight();
                    int z12 = i5Var.z1();
                    if (i5Var.U0.d(1) && i5Var.i0.getVisibility() == 0) {
                        i13 = i5Var.i0.getMeasuredHeight();
                    }
                    iVar.F(finalHeight, z12 + i13);
                    break;
                }
                break;
            case 7:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
                break;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                ((FrameLayout.LayoutParams) photoViewer.D0.getLayoutParams()).rightMargin = photoViewer.O0.getVisibility() == 0 ? AndroidUtilities.dp(63.0f) : 0;
                super.onMeasure(i10, i11);
                break;
            case 9:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
                break;
            case 11:
                r5 r5Var = (r5) this.e;
                zf.x0 x0Var = r5Var.n0;
                x0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = r5Var.s0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(x0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(x0Var.getMeasuredHeight(), TLObject.FLAG_30));
                }
                int measuredWidth2 = x0Var.getMeasuredWidth();
                int i15 = 0;
                for (int i16 = 0; i16 < x0Var.getChildCount(); i16++) {
                    View childAt2 = x0Var.getChildAt(i16);
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
                        measuredWidth2 = Math.min(left2, measuredWidth2);
                        i15 = Math.max(right, i15);
                    }
                    right = boundsRight + left;
                    measuredWidth2 = Math.min(left2, measuredWidth2);
                    i15 = Math.max(right, i15);
                }
                setMeasuredDimension(i15 - measuredWidth2, x0Var.getMeasuredHeight());
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 8:
                super.setAlpha(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.M7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.M7.setAlpha(f10);
                }
                zr0 zr0Var = photoViewer.Q1;
                if (zr0Var != null && zr0Var.getVisibility() != 8) {
                    photoViewer.Q1.setAlpha(photoViewer.u7[0] * f10);
                }
                as0 as0Var = photoViewer.R1;
                if (as0Var != null && as0Var.getVisibility() != 8) {
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
            case 2:
                super.setTranslationY(f10);
                ((g2) this.e).onContainerTranslationYChanged(f10);
                break;
            case 3:
            case 5:
            case 6:
            default:
                super.setTranslationY(f10);
                break;
            case 4:
                super.setTranslationY(f10);
                FrameLayout frameLayout = ((i5) this.e).topBulletinContainer;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
                    break;
                }
                break;
            case 7:
                super.setTranslationY(f10);
                b31 b31Var = (b31) this.e;
                b31Var.topBulletinContainer.setTranslationY(Math.max(b31Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, b31Var.B(true)) + ((-r1.getTop()) - b31Var.topBulletinContainer.getHeight()) + f10);
                break;
            case 8:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout2 = photoViewer.M7;
                if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
                    photoViewer.M7.setTranslationY(photoViewer.L0.getTranslationY() - (photoViewer.Q1.getAlpha() * i0.a.d(46.0f, photoViewer.Q1.getEditTextHeight(), 0)));
                }
                org.telegram.ui.n0 n0Var = photoViewer.T1;
                if (n0Var != null) {
                    n0Var.setTranslationY(f10);
                }
                TextView textView = photoViewer.O7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.O7.setTranslationY(f10);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 8:
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
    public w(r5 r5Var, Context context) {
        super(context);
        this.e = r5Var;
        this.b = new Matrix();
        this.d = new float[8];
        this.c = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(LimitPreviewView limitPreviewView, Context context, c6 c6Var) {
        super(context);
        this.e = limitPreviewView;
        this.c = c6Var;
        this.b = new Paint();
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(-1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, ch.h hVar, c6 c6Var) {
        super(context);
        this.e = hVar;
        this.c = c6Var;
        this.b = new gf.c0(2);
        this.d = new gf.c0(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(g2 g2Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.e = g2Var;
        this.d = scrollView;
        this.c = drawable;
        this.b = new Path();
    }

    public w(Context context, c6 c6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.d = textView;
        rl.h(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTextColor(g6.v0(g6.j5, c6Var));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.c = g2Var;
        imageView.setImageDrawable(g2Var);
        g2Var.a(-1);
        addView(imageView, z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new v21(this, 0));
        b(true);
        setMinimumHeight(AndroidUtilities.dp(56.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(v5 v5Var, Context context) {
        super(context);
        this.e = v5Var;
        this.c = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.b = imageView;
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        addView(imageView, z5.e(-2, -2, 1));
        addView(textView, z5.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setMinimumWidth(AndroidUtilities.dp(100.0f));
        int dp = AndroidUtilities.dp(10.0f);
        int k10 = i0.b.k(-16777216, 80);
        setBackground(g6.i0(dp, dp, dp, dp, 0, k10, k10));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(b31 b31Var, Context context) {
        super(context);
        this.e = b31Var;
        this.d = new Path();
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(b31Var.getThemedColor(g6.h5));
        g6.m(paint);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(nc1 nc1Var, Activity activity) {
        super(activity);
        this.e = nc1Var;
        this.b = new Paint(1);
        this.d = new Paint(1);
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(i5 i5Var, Context context) {
        super(context);
        this.e = i5Var;
        this.d = new RectF();
        this.b = new Paint(1);
        this.c = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(c1 c1Var, Context context, c6 c6Var) {
        super(context);
        this.e = c1Var;
        this.c = c6Var;
        this.d = new i2(g6.Lj, g6.Mj, -1, -1, c6Var);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.e = photoViewer;
        this.b = new Paint(3);
        this.d = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.c = new Matrix();
    }
}
