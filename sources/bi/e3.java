package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import di.pb;
import hi.sa;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ff;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.o10;
import org.telegram.messenger.rd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.so;
import org.telegram.ui.Components.sx;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.xe;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.Components.z71;
import org.telegram.ui.Components.zw0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class e3 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    public so a() {
        return ((so[]) this.b)[0];
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, int i10) {
        switch (this.a) {
            case 8:
                super.addView(view, i7, i10);
                ((jh.f) this.b).e();
                break;
            default:
                super.addView(view, i7, i10);
                break;
        }
    }

    public void b(dh.c cVar, gh.e eVar) {
        lh.f fVar = (lh.f) this.b;
        fVar.c(cVar, eVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(org.telegram.messenger.g0.L(48.0f));
        fVar.setFadeHeightBottom(org.telegram.messenger.g0.L(48.0f));
    }

    public void c() {
        so[] soVarArr = (so[]) this.b;
        so soVar = soVarArr[0];
        so soVar2 = soVarArr[1];
        soVarArr[0] = soVar2;
        soVarArr[1] = soVar;
        soVar2.n = true;
        soVar2.setVisibility(0);
        soVarArr[0].setScaleX(0.8f);
        soVarArr[0].setScaleY(0.8f);
        soVarArr[0].setAlpha(0.0f);
        soVarArr[0].setTranslationY(org.telegram.messenger.g0.L(20.0f));
        ViewPropertyAnimator translationY = soVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        nr nrVar = nr.h;
        o10.o(translationY, nrVar, 320L);
        so soVar3 = soVarArr[1];
        soVar3.n = false;
        soVar3.setVisibility(0);
        soVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setInterpolator(nrVar).setDuration(320L).withEndAction(new oo(soVar3, 1)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        ArrayList arrayList;
        switch (this.a) {
            case 24:
                yk0 yk0Var = (yk0) this.b;
                if (yk0Var.r > 0.0f && yk0Var.e != null) {
                    yk0Var.f.reset();
                    float width = getWidth() / yk0Var.c.getWidth();
                    yk0Var.f.postScale(width, width);
                    yk0Var.d.setLocalMatrix(yk0Var.f);
                    yk0Var.e.setAlpha((int) (yk0Var.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), yk0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = yk0Var.F;
                if (drawable != null) {
                    drawable.setAlpha((int) (yk0Var.r * 255.0f));
                    canvas.save();
                    float f12 = yk0Var.I;
                    float f13 = yk0Var.H;
                    float f14 = yk0Var.r;
                    canvas.translate((f13 * f14) + f12, (0.0f * f14) + yk0Var.J);
                    float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(Math.min(yk0Var.K, yk0Var.L), Math.max(yk0Var.K, yk0Var.L), 0.75f), 1.0f, yk0Var.r);
                    canvas.scale(T1, T1, ((yk0Var.F.getBounds().width() / 2.0f) * yk0Var.K) + (-yk0Var.I) + yk0Var.F.getBounds().left, ((yk0Var.F.getBounds().height() / 2.0f) * yk0Var.L) + (-yk0Var.J) + yk0Var.F.getBounds().top);
                    fh.g gVar = yk0Var.G;
                    if (gVar != null) {
                        gVar.setAlpha((int) (yk0Var.r * 255.0f));
                        yk0Var.G.draw(canvas);
                    }
                    yk0Var.F.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 29:
                ax0 ax0Var = (ax0) this.b;
                yw0 yw0Var = ax0Var.c;
                if (yw0Var != null && yw0Var.getEditField() != null) {
                    org.telegram.messenger.g6 g6Var = ax0Var.W;
                    if (g6Var != null && g6Var.h) {
                        float x10 = ax0Var.c.getEditField().getX() + ax0Var.c.getEditField().getPaddingLeft();
                        org.telegram.messenger.g6 g6Var2 = ax0Var.W;
                        ax0Var.d0 = x10 + g6Var2.n;
                        ax0Var.a0 = g6Var2.r;
                    } else if (ax0Var.b0 != null && ax0Var.c0 != null) {
                        ax0Var.d0 = ax0Var.c.getEditField().getX() + ax0Var.c.getEditField().getPaddingLeft() + org.telegram.messenger.g0.L(12.0f);
                    }
                }
                boolean z10 = (!ax0Var.s || ax0Var.w || (arrayList = ax0Var.x) == null || arrayList.isEmpty() || ax0Var.y) ? false : true;
                float e10 = ax0Var.S.e(false, z10 ? 1.0f : 0.0f);
                float e11 = ax0Var.T.e(false, z10 ? 1.0f : 0.0f);
                float e12 = ax0Var.e0.e(false, ax0Var.d0);
                if (e10 <= 0.0f && e11 <= 0.0f && !z10) {
                    ax0Var.d.setVisibility(8);
                }
                ax0Var.P.rewind();
                float left = ax0Var.e.getLeft();
                int left2 = ax0Var.e.getLeft();
                ArrayList arrayList2 = ax0Var.x;
                float D = org.telegram.messenger.f3.D(44.0f, arrayList2 == null ? 0 : arrayList2.size(), left2);
                org.telegram.ui.Components.d6 d6Var = ax0Var.g0;
                float f15 = d6Var.c;
                boolean z11 = f15 <= 0.0f;
                float f16 = D - left;
                if (f16 > 0.0f) {
                    f15 = d6Var.e(z11, f16);
                }
                float e13 = ax0Var.f0.e(z11, (left + D) / 2.0f);
                yw0 yw0Var2 = ax0Var.c;
                if (yw0Var2 != null && yw0Var2.getEditField() != null) {
                    int i7 = ax0Var.h;
                    if (i7 == 0) {
                        ax0Var.d.setTranslationY(((((-ax0Var.c.getEditField().getHeight()) - ax0Var.c.getEditField().getScrollY()) + ax0Var.a0) + org.telegram.messenger.g0.L(5.0f)) - ax0Var.c.getEditFieldBottomOffset());
                    } else if (i7 == 1) {
                        ax0Var.d.setTranslationY((((((-ax0Var.getMeasuredHeight()) - ax0Var.c.getEditField().getScrollY()) + ax0Var.a0) + org.telegram.messenger.g0.L(20.0f)) + ax0Var.d.getHeight()) - ax0Var.c.getEditFieldBottomOffset());
                    }
                }
                float f17 = f15 / 4.0f;
                float f18 = f15 / 2.0f;
                int max = (int) Math.max((ax0Var.d0 - Math.max(f17, Math.min(f18, org.telegram.messenger.g0.L(66.0f)))) - ax0Var.e.getLeft(), 0.0f);
                if (ax0Var.e.getPaddingLeft() != max) {
                    int paddingLeft = ax0Var.e.getPaddingLeft() - max;
                    f10 = 1.0f;
                    ax0Var.e.setPadding(max, 0, 0, 0);
                    ax0Var.e.scrollBy(paddingLeft, 0);
                } else {
                    f10 = 1.0f;
                }
                ax0Var.e.setTranslationX(((int) Math.max((e12 - Math.max(f17, Math.min(f18, org.telegram.messenger.g0.L(66.0f)))) - ax0Var.e.getLeft(), 0.0f)) - max);
                float translationX = ax0Var.e.getTranslationX() + (e13 - f18) + ax0Var.e.getPaddingLeft();
                float translationY = ax0Var.e.getTranslationY() + ax0Var.e.getTop() + ax0Var.e.getPaddingTop() + (ax0Var.h == 0 ? 0 : org.telegram.messenger.g0.L(6.66f));
                float min = Math.min(ax0Var.e.getTranslationX() + e13 + f18 + ax0Var.e.getPaddingLeft(), ax0Var.getWidth() - ax0Var.d.getPaddingRight());
                float translationY2 = (ax0Var.e.getTranslationY() + ax0Var.e.getBottom()) - (ax0Var.h == 0 ? org.telegram.messenger.g0.L(6.66f) : 0);
                float min2 = Math.min(org.telegram.messenger.g0.L(9.0f), f18) * 2.0f;
                int i10 = ax0Var.h;
                if (i10 == 0) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    float f19 = translationY2 - min2;
                    float f20 = translationX + min2;
                    rectF.set(translationX, f19, f20, translationY2);
                    ax0Var.P.arcTo(rectF, 90.0f, 90.0f);
                    float f21 = translationY + min2;
                    rectF.set(translationX, translationY, f20, f21);
                    ax0Var.P.arcTo(rectF, -180.0f, 90.0f);
                    float f22 = min - min2;
                    rectF.set(f22, translationY, min, f21);
                    ax0Var.P.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f22, f19, min, translationY2);
                    ax0Var.P.arcTo(rectF, 0.0f, 90.0f);
                    ax0Var.P.lineTo(org.telegram.messenger.g0.L(8.66f) + e12, translationY2);
                    ax0Var.P.lineTo(e12, org.telegram.messenger.g0.L(6.66f) + translationY2);
                    ax0Var.P.lineTo(e12 - org.telegram.messenger.g0.L(8.66f), translationY2);
                } else if (i10 == 1) {
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float f23 = min - min2;
                    float f24 = translationY + min2;
                    rectF2.set(f23, translationY, min, f24);
                    ax0Var.P.arcTo(rectF2, -90.0f, 90.0f);
                    float f25 = translationY2 - min2;
                    rectF2.set(f23, f25, min, translationY2);
                    ax0Var.P.arcTo(rectF2, 0.0f, 90.0f);
                    float f26 = min2 + translationX;
                    rectF2.set(translationX, f25, f26, translationY2);
                    ax0Var.P.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, translationY, f26, f24);
                    ax0Var.P.arcTo(rectF2, -180.0f, 90.0f);
                    ax0Var.P.lineTo(e12 - org.telegram.messenger.g0.L(8.66f), translationY);
                    ax0Var.P.lineTo(e12, translationY - org.telegram.messenger.g0.L(6.66f));
                    ax0Var.P.lineTo(org.telegram.messenger.g0.L(8.66f) + e12, translationY);
                }
                ax0Var.P.close();
                if (ax0Var.R == null) {
                    Paint paint = new Paint(1);
                    ax0Var.R = paint;
                    paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.0f)));
                    ax0Var.R.setShadowLayer(org.telegram.messenger.g0.L(4.33f), 0.0f, org.telegram.messenger.g0.L(0.33333334f), 855638016);
                    ax0Var.R.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.tf, ax0Var.b));
                }
                if (e10 < f10) {
                    ax0Var.Q.rewind();
                    float L = ax0Var.h == 0 ? org.telegram.messenger.g0.L(6.66f) + translationY2 : translationY - org.telegram.messenger.g0.L(6.66f);
                    double d = e12 - translationX;
                    double d2 = L - translationY;
                    f11 = 255.0f;
                    double d10 = e12 - min;
                    double d11 = L - translationY2;
                    ax0Var.Q.addCircle(e12, L, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d2, 2.0d) + Math.pow(d, 2.0d), Math.pow(d2, 2.0d) + Math.pow(d10, 2.0d)), Math.max(Math.pow(d11, 2.0d) + Math.pow(d, 2.0d), Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d))))) * e10, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(ax0Var.Q);
                    canvas.saveLayerAlpha(0.0f, 0.0f, ax0Var.getWidth(), ax0Var.getHeight(), (int) (e10 * 255.0f), 31);
                } else {
                    f11 = 255.0f;
                }
                canvas.drawPath(ax0Var.P, ax0Var.R);
                canvas.save();
                canvas.clipPath(ax0Var.P);
                super.dispatchDraw(canvas);
                float f27 = ax0Var.g0.c;
                float f28 = ax0Var.f0.c;
                float f29 = f27 / 2.0f;
                float translationX2 = ax0Var.e.getTranslationX() + (f28 - f29) + ax0Var.e.getPaddingLeft();
                float paddingTop = ax0Var.e.getPaddingTop() + ax0Var.e.getTop();
                float min3 = Math.min(ax0Var.e.getTranslationX() + f28 + f29 + ax0Var.e.getPaddingLeft(), ax0Var.getWidth() - ax0Var.d.getPaddingRight());
                float bottom = ax0Var.e.getBottom();
                float e14 = ax0Var.U.e(false, ax0Var.e.canScrollHorizontally(-1) ? f10 : 0.0f);
                if (e14 > 0.0f) {
                    int i11 = (int) translationX2;
                    org.telegram.ui.ActionBar.m6.F4.setBounds(i11, (int) paddingTop, org.telegram.messenger.g0.L(32.0f) + i11, (int) bottom);
                    org.telegram.ui.ActionBar.m6.F4.setAlpha((int) (e14 * f11));
                    org.telegram.ui.ActionBar.m6.F4.draw(canvas);
                }
                float e15 = ax0Var.V.e(false, ax0Var.e.canScrollHorizontally(1) ? f10 : 0.0f);
                if (e15 > 0.0f) {
                    int i12 = (int) min3;
                    org.telegram.ui.ActionBar.m6.E4.setBounds(i12 - org.telegram.messenger.g0.L(32.0f), (int) paddingTop, i12, (int) bottom);
                    org.telegram.ui.ActionBar.m6.E4.setAlpha((int) (e15 * f11));
                    org.telegram.ui.ActionBar.m6.E4.draw(canvas);
                }
                canvas.restore();
                if (ax0Var.S.c < f10) {
                    canvas.restore();
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.a) {
            case 25:
                xe xeVar = (xe) this.b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && xeVar.isShowing()) {
                    xeVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 24:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((yk0) this.b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ds0[] ds0VarArr;
        ds0 ds0Var;
        switch (this.a) {
            case 3:
                if (((pb) this.b).u0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 6:
                if (((ii.t) this.b).t0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 15:
                ml mlVar = (ml) this.b;
                if (motionEvent.getActionMasked() != 0 || (motionEvent.getY() >= mlVar.x0 && motionEvent.getY() <= mlVar.y0)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 22:
                k90 k90Var = (k90) this.b;
                j90 j90Var = k90Var.S;
                if (j90Var != null && (ds0Var = (ds0VarArr = j90Var.n0)[0]) != null && ds0Var.h.getFastScroll() != null && ds0VarArr[0].h.getFastScroll().n) {
                    return k90Var.S.Z(motionEvent);
                }
                j90 j90Var2 = k90Var.S;
                if (j90Var2 == null || !j90Var2.P(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            case 27:
                tt0 tt0Var = (tt0) this.b;
                if (motionEvent.getActionMasked() != 0 || (!tt0Var.e0 && motionEvent.getY() < tt0Var.b0)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r2.f != false) goto L12;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean drawChild(Canvas canvas, View view, long j3) {
        float measuredWidth;
        float measuredHeight;
        int i7;
        float f10;
        switch (this.a) {
            case 12:
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) this.b;
                org.telegram.ui.Cells.o5 o5Var = s5Var.a;
                if (s5Var.O == null || view != o5Var) {
                    return super.drawChild(canvas, view, j3);
                }
                boolean drawChild = super.drawChild(canvas, view, j3);
                if (!s5Var.P) {
                    return drawChild;
                }
                Rect rect = org.telegram.ui.Cells.s5.c0;
                s5Var.O.c(canvas, s5Var.b, o5Var.getMeasuredWidth(), o5Var.getMeasuredHeight(), 1.0f, false);
                ff ffVar = s5Var.I;
                if (ffVar == null || ffVar.N <= 0 || o5Var.E == null) {
                    return drawChild;
                }
                Path path = o5Var.F;
                if (path == null) {
                    o5Var.F = new Path();
                } else {
                    path.rewind();
                }
                int i10 = o5Var.c;
                if (i10 == -1 || (i7 = o5Var.d) == -1) {
                    measuredWidth = o5Var.getMeasuredWidth();
                    measuredHeight = o5Var.getMeasuredHeight();
                } else {
                    measuredWidth = i10;
                    measuredHeight = i7;
                }
                float L = o5Var.E.c + org.telegram.messenger.g0.L(18.0f);
                float L2 = org.telegram.messenger.g0.L(28.0f);
                float f11 = (measuredWidth - L) / 2.0f;
                float f12 = measuredHeight / 2.0f;
                RectF rectF = org.telegram.messenger.g0.P;
                float f13 = L2 / 2.0f;
                rectF.set(f11, f12 - f13, L + f11, f12 + f13);
                o5Var.F.addRoundRect(rectF, f13, f13, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(o5Var.F);
                ImageReceiver imageReceiver = o5Var.b;
                if (imageReceiver != null && o5Var.s) {
                    imageReceiver.p1 = o5Var.G;
                    float alpha = imageReceiver.getAlpha();
                    o5Var.b.setAlpha(1.0f);
                    o5Var.b.h(canvas, null);
                    o5Var.b.setAlpha(alpha);
                    o5Var.b.p1 = null;
                }
                o5Var.E.c(f11 + org.telegram.messenger.g0.L(9.0f), f12, 1.0f, -1, canvas);
                canvas.restore();
                return drawChild;
            case 15:
                canvas.save();
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                ml mlVar = (ml) this.b;
                canvas.clipRect(0, 0, measuredWidth2, measuredHeight2 - mlVar.z0);
                boolean drawChild2 = mlVar.y ? false : super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild2;
            case 27:
                tt0 tt0Var = (tt0) this.b;
                if (tt0Var.e0) {
                    fk0 fk0Var = tt0Var.E;
                    f10 = tt0Var.M.getX();
                    break;
                }
                f10 = 0.0f;
                int save = canvas.save();
                canvas.clipRect(Math.max(0.0f, f10), -tt0Var.T, Math.min(getWidth(), getWidth() + f10), Math.min(getHeight() + tt0Var.U, tt0Var.b0));
                canvas.translate(f10, 0.0f);
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                canvas.restoreToCount(save);
                return drawChild3;
            default:
                return super.drawChild(canvas, view, j3);
        }
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
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 18:
                iu iuVar = (iu) this.b;
                z71 z71Var = iuVar.n1;
                eu euVar = iuVar.m1;
                super.onDetachedFromWindow();
                try {
                    if (iuVar.N0()) {
                        if (euVar.getVisibility() != 0) {
                        }
                        if (z71Var.f() && !iuVar.N0()) {
                            if (iu.S1 == iuVar) {
                                iu.S1 = null;
                            }
                            z71Var.b();
                            break;
                        }
                    }
                    if (euVar.getParent() != null) {
                        removeView(euVar);
                        euVar.stopLoading();
                        euVar.loadUrl("about:blank");
                        euVar.destroy();
                    }
                    if (z71Var.f()) {
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.onDraw(canvas);
                ch.p pVar = (ch.p) this.b;
                if (pVar.y > 0) {
                    canvas.drawRect(0.0f, getHeight() - pVar.y, getWidth(), getHeight(), pVar.E);
                    break;
                }
                break;
            case 13:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.n) this.b) == null) {
                    org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
                    this.b = nVar;
                    nVar.k = false;
                    nVar.m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.n) this.b).f = getMeasuredWidth();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.n) this.b).a(org.telegram.messenger.g0.L(4.0f), canvas, rectF, null);
                invalidate();
                break;
            case 14:
                ((y9) this.b).e.a(canvas);
                break;
            case 15:
                ml mlVar = (ml) this.b;
                mlVar.a0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, mlVar.a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - mlVar.z0, mlVar.a0);
                break;
            case 26:
                mt0 mt0Var = (mt0) this.b;
                mt0Var.o1.setBounds(0, mt0Var.q1 - mt0Var.t0, getMeasuredWidth(), getMeasuredHeight());
                mt0Var.o1.draw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 15:
                ml mlVar = (ml) this.b;
                if (motionEvent.getActionMasked() != 0 || (motionEvent.getY() >= mlVar.x0 && motionEvent.getY() <= mlVar.y0)) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return false;
            case 26:
                mt0 mt0Var = (mt0) this.b;
                if (motionEvent.getAction() != 0 || mt0Var.q1 == 0 || motionEvent.getY() >= mt0Var.q1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                mt0Var.dismiss();
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int left;
        int measuredWidth;
        int measuredWidth2;
        int measuredHeight;
        int L;
        int measuredHeight2;
        int i15;
        int i16;
        float f10;
        boolean z11;
        switch (this.a) {
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                ch.p pVar = (ch.p) this.b;
                if (pVar.P && z10) {
                    pVar.j0(pVar.R.e);
                    break;
                }
                break;
            case 10:
                int childCount = getChildCount();
                int i17 = i11 - i7;
                int i18 = -1;
                if (((org.telegram.ui.ActionBar.t1) this.b).L0) {
                    View findViewWithTag = findViewWithTag(-3);
                    View findViewWithTag2 = findViewWithTag(-4);
                    View findViewWithTag3 = findViewWithTag(-2);
                    View findViewWithTag4 = findViewWithTag(-1);
                    int paddingLeft = getPaddingLeft();
                    int paddingRight = i17 - getPaddingRight();
                    int max = Math.max(0, ((paddingRight - paddingLeft) - org.telegram.messenger.g0.L(8.0f)) / 2);
                    boolean z12 = hd.a0;
                    int i19 = z12 ? paddingRight - max : paddingLeft;
                    if (!z12) {
                        paddingLeft = paddingRight - max;
                    }
                    int paddingTop = getPaddingTop();
                    int L2 = org.telegram.messenger.g0.L(44.0f) + paddingTop;
                    if (findViewWithTag != null) {
                        findViewWithTag.layout(i19, paddingTop, i19 + max, org.telegram.messenger.g0.L(40.0f) + paddingTop);
                    }
                    if (findViewWithTag2 != null) {
                        findViewWithTag2.layout(paddingLeft, paddingTop, paddingLeft + max, org.telegram.messenger.g0.L(40.0f) + paddingTop);
                    }
                    if (findViewWithTag3 != null) {
                        findViewWithTag3.layout(i19, L2, i19 + max, org.telegram.messenger.g0.L(40.0f) + L2);
                    }
                    if (findViewWithTag4 != null) {
                        findViewWithTag4.layout(paddingLeft, L2, max + paddingLeft, org.telegram.messenger.g0.L(40.0f) + L2);
                        break;
                    }
                } else {
                    View view = null;
                    int i20 = 0;
                    while (i20 < childCount) {
                        View childAt = getChildAt(i20);
                        Integer num = (Integer) childAt.getTag();
                        if (num == null) {
                            int measuredWidth3 = childAt.getMeasuredWidth();
                            int measuredHeight3 = childAt.getMeasuredHeight();
                            if (view != null) {
                                i14 = ((view.getMeasuredWidth() - measuredWidth3) / 2) + view.getLeft();
                                i13 = ((view.getMeasuredHeight() - measuredHeight3) / 2) + view.getTop();
                            } else {
                                i13 = 0;
                                i14 = 0;
                            }
                            childAt.layout(i14, i13, measuredWidth3 + i14, measuredHeight3 + i13);
                        } else if (num.intValue() == i18) {
                            if (hd.a0) {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout((i17 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i17 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                            view = childAt;
                        } else if (num.intValue() == -2) {
                            if (hd.a0) {
                                int paddingLeft2 = getPaddingLeft();
                                if (view != null) {
                                    paddingLeft2 = org.telegram.messenger.f3.C(8.0f, view.getMeasuredWidth(), paddingLeft2);
                                }
                                childAt.layout(paddingLeft2, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                int paddingRight2 = (i17 - getPaddingRight()) - childAt.getMeasuredWidth();
                                if (view != null) {
                                    paddingRight2 = o10.x(8.0f, view.getMeasuredWidth(), paddingRight2);
                                }
                                childAt.layout(paddingRight2, getPaddingTop(), childAt.getMeasuredWidth() + paddingRight2, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -4) {
                            View findViewWithTag5 = findViewWithTag(-3);
                            if (hd.a0) {
                                if (findViewWithTag5 == null) {
                                    left = i17 - getPaddingRight();
                                    measuredWidth = childAt.getMeasuredWidth();
                                } else {
                                    left = findViewWithTag5.getLeft() - org.telegram.messenger.g0.L(8.0f);
                                    measuredWidth = childAt.getMeasuredWidth();
                                }
                                int i21 = left - measuredWidth;
                                childAt.layout(i21, getPaddingTop(), childAt.getMeasuredWidth() + i21, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                int paddingLeft3 = findViewWithTag5 == null ? getPaddingLeft() : findViewWithTag5.getRight() + org.telegram.messenger.g0.L(8.0f);
                                childAt.layout(paddingLeft3, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft3, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -3) {
                            if (hd.a0) {
                                childAt.layout((i17 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i17 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        }
                        i20++;
                        i18 = -1;
                    }
                    break;
                }
                break;
            case 14:
                super.onLayout(z10, i7, i10, i11, i12);
                int L3 = org.telegram.messenger.g0.L(36.0f);
                int i22 = ((i11 - i7) - L3) / 2;
                int i23 = ((i12 - i10) - L3) / 2;
                ((y9) this.b).e.f(i22, i23, i22 + L3, L3 + i23);
                break;
            case 16:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                if (getMeasuredWidth() == org.telegram.messenger.g0.L(126.0f)) {
                    measuredWidth2 = getMeasuredWidth() / 2;
                    measuredHeight = getMeasuredHeight() / 2;
                    i15 = getMeasuredWidth() / 2;
                    int i24 = measuredHeight / 2;
                    measuredHeight2 = org.telegram.messenger.g0.L(17.0f) + measuredHeight + i24;
                    i16 = i24 - org.telegram.messenger.g0.L(17.0f);
                    L = i15;
                } else {
                    measuredWidth2 = getMeasuredWidth() / 2;
                    measuredHeight = (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(13.0f);
                    int i25 = measuredWidth2 / 2;
                    int L4 = measuredWidth2 + i25 + org.telegram.messenger.g0.L(17.0f);
                    L = i25 - org.telegram.messenger.g0.L(17.0f);
                    measuredHeight2 = (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(13.0f);
                    i15 = L4;
                    i16 = measuredHeight2;
                }
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.r0.getMeasuredHeight()) - org.telegram.messenger.g0.L(12.0f);
                if (getMeasuredWidth() == org.telegram.messenger.g0.L(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.r0;
                    textView.layout(measuredWidth2 - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.r0.getMeasuredWidth() / 2) + measuredWidth2, chatAttachAlertPhotoLayout.r0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.r0;
                    textView2.layout(measuredWidth2 - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.r0.getMeasuredWidth() / 2) + measuredWidth2, chatAttachAlertPhotoLayout.r0.getMeasuredHeight() + measuredHeight4);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.l0;
                shutterButton.layout(measuredWidth2 - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.l0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.l0.getMeasuredWidth() / 2) + measuredWidth2, (chatAttachAlertPhotoLayout.l0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.s0;
                imageView.layout(i15 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.s0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.s0.getMeasuredWidth() / 2) + i15, (chatAttachAlertPhotoLayout.s0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i26 = 0; i26 < 2; i26++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.T[i26];
                    imageView2.layout(L - (imageView2.getMeasuredWidth() / 2), i16 - (chatAttachAlertPhotoLayout.T[i26].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.T[i26].getMeasuredWidth() / 2) + L, (chatAttachAlertPhotoLayout.T[i26].getMeasuredHeight() / 2) + i16);
                }
                break;
            case 21:
                super.onLayout(z10, i7, i10, i11, i12);
                c20 c20Var = (c20) this.b;
                e3 e3Var = c20Var.b;
                int[] iArr = c20Var.I;
                e3Var.getLocationOnScreen(iArr);
                c20Var.P = iArr[0];
                c20Var.O = iArr[1] - org.telegram.messenger.g0.L(25.0f);
                break;
            case 24:
                super.onLayout(z10, i7, i10, i11, i12);
                yk0 yk0Var = (yk0) this.b;
                e3 e3Var2 = yk0Var.s;
                du0 du0Var = yk0Var.w;
                Drawable drawable = yk0Var.F;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (yk0Var.y != null) {
                        float f11 = bounds.left;
                        float f12 = yk0Var.I;
                        float f13 = f11 + f12;
                        float f14 = bounds.right + f12;
                        float f15 = bounds.top;
                        float f16 = yk0Var.J;
                        float f17 = f15 + f16;
                        float f18 = bounds.bottom + f16;
                        boolean z13 = false;
                        if (yk0Var.M) {
                            f10 = 4.0f;
                            z11 = false;
                        } else {
                            if (f14 - r5.getMeasuredWidth() < org.telegram.messenger.g0.L(8.0f)) {
                                yk0Var.E.setPivotX(org.telegram.messenger.g0.L(6.0f));
                                yk0Var.y.setX(Math.min(du0Var.getWidth() - yk0Var.y.getWidth(), f13 - org.telegram.messenger.g0.L(10.0f)) - du0Var.getX());
                                f10 = 4.0f;
                                z11 = false;
                            } else {
                                yk0Var.E.setPivotX(r5.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f));
                                f10 = 4.0f;
                                yk0Var.y.setX(Math.max(org.telegram.messenger.g0.L(8.0f), (org.telegram.messenger.g0.L(4.0f) + f14) - yk0Var.y.getMeasuredWidth()) - du0Var.getX());
                                z11 = true;
                            }
                            yk0Var.H = z11 ? ((yk0Var.y.getX() + yk0Var.y.getWidth()) - org.telegram.messenger.g0.L(6.0f)) - f14 : (yk0Var.y.getX() + org.telegram.messenger.g0.L(10.0f)) - f13;
                        }
                        float L5 = f18 + (yk0Var.G != null ? org.telegram.messenger.g0.L(21.0f) : 0);
                        if (yk0Var.y.getMeasuredHeight() + L5 > e3Var2.getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f)) {
                            yk0Var.E.setPivotY(r2.getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f));
                            yk0Var.y.setY(((f17 - org.telegram.messenger.g0.L(f10)) - yk0Var.y.getMeasuredHeight()) - du0Var.getY());
                            z13 = true;
                        } else {
                            yk0Var.E.setPivotY(org.telegram.messenger.g0.L(6.0f));
                            yk0Var.y.setY(Math.min((e3Var2.getHeight() - yk0Var.y.getMeasuredHeight()) - org.telegram.messenger.g0.L(16.0f), L5) - du0Var.getY());
                        }
                        a70 a70Var = yk0Var.x;
                        a70Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = a70Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z13;
                        break;
                    }
                }
                break;
            case 26:
                super.onLayout(z10, i7, i10, i11, i12);
                mt0.J0((mt0) this.b);
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        int i11;
        switch (this.a) {
            case 0:
                super.onMeasure(i7, i10);
                ((g3) this.b).L.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 10:
                super.onMeasure(i7, i10);
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int childCount = getChildCount();
                int i12 = 0;
                if (!((org.telegram.ui.ActionBar.t1) this.b).L0) {
                    int i13 = 0;
                    while (i12 < childCount) {
                        View childAt = getChildAt(i12);
                        if ((childAt instanceof TextView) && childAt.getTag() != null) {
                            i13 = childAt.getMeasuredWidth() + i13;
                        }
                        i12++;
                    }
                    if (i13 > measuredWidth) {
                        View findViewWithTag = findViewWithTag(-2);
                        View findViewWithTag2 = findViewWithTag(-4);
                        View findViewWithTag3 = findViewWithTag(-3);
                        if (findViewWithTag != null && findViewWithTag3 != null) {
                            if (findViewWithTag.getMeasuredWidth() >= findViewWithTag3.getMeasuredWidth()) {
                                findViewWithTag.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredWidth() - (i13 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            } else {
                                findViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredWidth() - (i13 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            }
                        } else if (findViewWithTag2 != null && findViewWithTag3 != null) {
                            if (findViewWithTag2.getMeasuredWidth() >= findViewWithTag3.getMeasuredWidth()) {
                                findViewWithTag2.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredWidth() - (i13 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            } else {
                                findViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredWidth() - (i13 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            }
                        }
                    }
                } else {
                    int max = Math.max(0, (measuredWidth - org.telegram.messenger.g0.L(8.0f)) / 2);
                    while (i12 < childCount) {
                        View childAt2 = getChildAt(i12);
                        if (childAt2.getTag() != null) {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), TLObject.FLAG_30));
                        }
                        i12++;
                    }
                    break;
                }
                break;
            case 13:
                if (View.MeasureSpec.getSize(i7) <= org.telegram.messenger.g0.L(260.0f)) {
                    super.onMeasure(i7, i10);
                    break;
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(320.0f), TLObject.FLAG_30), i10);
                    break;
                }
            case 18:
                int size = View.MeasureSpec.getSize(i7);
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L((((iu) this.b).E1 ? 22 : 0) + 84) + ((int) Math.min(r0.C1 / (r0.B1 / size), org.telegram.messenger.g0.q.y / 2)) + 1, TLObject.FLAG_30));
                break;
            case 19:
                sx sxVar = (sx) this.b;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((((View) sxVar.G.getParent()) != null ? (int) (r0.getMeasuredHeight() - sxVar.G.getY()) : org.telegram.messenger.g0.L(120.0f)) - sxVar.G.c1, TLObject.FLAG_30));
                break;
            case 20:
                ty tyVar = ((oy) this.b).R;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (o10.z(8.0f, tyVar.E0.getMeasuredHeight() - tyVar.c1, 3) * 1.7f), TLObject.FLAG_30));
                break;
            case 26:
                mt0 mt0Var = (mt0) this.b;
                di.b1 b1Var = mt0Var.m1;
                int size2 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.m;
                getMeasuredWidth();
                int D = org.telegram.messenger.f3.D(54.0f, rd.g(), org.telegram.messenger.f3.C(56.0f, org.telegram.messenger.g0.L(56.0f), 1));
                int i14 = size2 / 5;
                if (D < i14 * 3) {
                    i11 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    i11 = i14 * 2;
                    if (D < size2) {
                        i11 -= size2 - D;
                    }
                }
                if (b1Var.getPaddingTop() != i11) {
                    mt0Var.r1 = true;
                    b1Var.setPadding(0, i11, 0, org.telegram.messenger.g0.L(8.0f));
                    mt0Var.r1 = false;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), TLObject.FLAG_30));
                break;
            case 29:
                ax0 ax0Var = (ax0) this.b;
                setPadding(ax0Var.n, ax0Var.h == 0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(6.66f), ax0Var.n, ax0Var.h == 0 ? org.telegram.messenger.g0.L(6.66f) : org.telegram.messenger.g0.L(8.0f));
                super.onMeasure(i7, i10);
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 24:
                super.onSizeChanged(i7, i10, i11, i12);
                yk0 yk0Var = (yk0) this.b;
                ih.d.c(yk0Var.h, yk0Var.s);
                ViewGroup viewGroup = yk0Var.E;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 26:
                return !((mt0) this.b).J && super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        switch (this.a) {
            case 7:
                super.onViewAdded(view);
                bringChildToFront((lh.f) this.b);
                break;
            default:
                super.onViewAdded(view);
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
            case 23:
                ek0 ek0Var = (ek0) this.b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(ek0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ek0Var.getMeasuredHeight(), TLObject.FLAG_30));
                    layout(0, 0, ek0Var.c1.getMeasuredWidth(), ek0Var.c1.getMeasuredHeight());
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 26:
                if (!((mt0) this.b).r1) {
                    super.requestLayout();
                    break;
                }
                break;
            case 28:
                if (!((kw0) this.b).b2) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 2:
                super.setTranslationY(f10);
                di.f6 f6Var = (di.f6) this.b;
                di.k4 k4Var = f6Var.a2;
                if (k4Var != null && k4Var.getVisibility() == 0) {
                    f6Var.a2.invalidate();
                    break;
                }
                break;
            case 5:
                sa saVar = (sa) this.b;
                if (getTranslationY() != f10 && saVar.d1 != null) {
                    super.setTranslationY(f10);
                    saVar.d1.y();
                    break;
                }
                break;
            case 11:
                super.setTranslationY(f10);
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.b;
                FrameLayout frameLayout = w2Var.F;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((-(w2Var.c.getHeight() - w2Var.b.getY())) + w2Var.t0);
                }
                w2Var.g0(f10);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        switch (this.a) {
            case 21:
                super.setVisibility(i7);
                ((c20) this.b).d.setVisibility(i7);
                break;
            case 29:
                ax0 ax0Var = (ax0) this.b;
                boolean z10 = getVisibility() == i7;
                super.setVisibility(i7);
                if (!z10) {
                    boolean z11 = i7 == 0;
                    if (ax0Var.e != null) {
                        for (int i10 = 0; i10 < ax0Var.e.getChildCount(); i10++) {
                            if (z11) {
                                zw0 zw0Var = (zw0) ax0Var.e.getChildAt(i10);
                                Drawable drawable = zw0Var.b;
                                if (drawable instanceof org.telegram.ui.Components.p5) {
                                    ((org.telegram.ui.Components.p5) drawable).a(zw0Var);
                                }
                                zw0Var.c = true;
                            } else {
                                zw0 zw0Var2 = (zw0) ax0Var.e.getChildAt(i10);
                                Drawable drawable2 = zw0Var2.b;
                                if (drawable2 instanceof org.telegram.ui.Components.p5) {
                                    ((org.telegram.ui.Components.p5) drawable2).n(zw0Var2);
                                }
                                zw0Var2.c = false;
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                super.setVisibility(i7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3(Context context, int i7) {
        super(context);
        this.a = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(Context context) {
        super(context);
        this.a = 7;
        lh.f fVar = new lh.f(context);
        this.b = fVar;
        addView(fVar, ma.g());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.a = 17;
        this.b = new so[2];
        int i7 = 0;
        while (true) {
            so[] soVarArr = (so[]) this.b;
            if (i7 < soVarArr.length) {
                soVarArr[i7] = new so(context, h6Var);
                addView(((so[]) this.b)[i7], ma.e(-1, -1, ls.E1));
                i7++;
            } else {
                soVarArr[0].setVisibility(0);
                ((so[]) this.b)[1].setVisibility(8);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(Context context, String str, fi.b bVar) {
        super(context);
        this.a = 4;
        int L = org.telegram.messenger.g0.L(12.0f);
        int i7 = org.telegram.ui.ActionBar.m6.j5;
        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(i7, bVar)));
        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.06f, i7);
        setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(this, d02, K, null, bVar);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        addView(g10, ma.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, true);
        this.b = o6Var;
        o6Var.b(0.6f, 450L, nr.h);
        o6Var.setTextSize(org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.ActionBar.t6.Y(o6Var, i7, bVar);
        o6Var.setScaleProperty(0.7f);
        o6Var.setGravity(17);
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        o6Var.setAllowCancel(true);
        g10.addView(o6Var, ma.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.t6.U(textView, i7, bVar);
        textView.setGravity(17);
        g10.addView(textView, ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(ch.p pVar, Context context) {
        super(context);
        this.a = 1;
        this.b = pVar;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(tt0 tt0Var, Context context) {
        super(context);
        this.a = 27;
        this.b = tt0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }
}
