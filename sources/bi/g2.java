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
import c8.ja;
import di.mb;
import hi.sa;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.ff;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.ns;
import org.telegram.messenger.rd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.bt0;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.lx;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.oe;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.xt;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g2 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    public jo a() {
        return ((jo[]) this.b)[0];
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
        jo[] joVarArr = (jo[]) this.b;
        jo joVar = joVarArr[0];
        jo joVar2 = joVarArr[1];
        joVarArr[0] = joVar2;
        joVarArr[1] = joVar;
        joVar2.n = true;
        joVar2.setVisibility(0);
        joVarArr[0].setScaleX(0.8f);
        joVarArr[0].setScaleY(0.8f);
        joVarArr[0].setAlpha(0.0f);
        joVarArr[0].setTranslationY(org.telegram.messenger.g0.L(20.0f));
        ViewPropertyAnimator translationY = joVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        er erVar = er.h;
        i20.n(translationY, erVar, 320L);
        jo joVar3 = joVarArr[1];
        joVar3.n = false;
        joVar3.setVisibility(0);
        joVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setInterpolator(erVar).setDuration(320L).withEndAction(new fo(joVar3, 1)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        ArrayList arrayList;
        switch (this.a) {
            case 24:
                ok0 ok0Var = (ok0) this.b;
                if (ok0Var.r > 0.0f && ok0Var.e != null) {
                    ok0Var.f.reset();
                    float width = getWidth() / ok0Var.c.getWidth();
                    ok0Var.f.postScale(width, width);
                    ok0Var.d.setLocalMatrix(ok0Var.f);
                    ok0Var.e.setAlpha((int) (ok0Var.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ok0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = ok0Var.F;
                if (drawable != null) {
                    drawable.setAlpha((int) (ok0Var.r * 255.0f));
                    canvas.save();
                    float f12 = ok0Var.I;
                    float f13 = ok0Var.H;
                    float f14 = ok0Var.r;
                    canvas.translate((f13 * f14) + f12, (0.0f * f14) + ok0Var.J);
                    float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(Math.min(ok0Var.K, ok0Var.L), Math.max(ok0Var.K, ok0Var.L), 0.75f), 1.0f, ok0Var.r);
                    canvas.scale(T1, T1, ((ok0Var.F.getBounds().width() / 2.0f) * ok0Var.K) + (-ok0Var.I) + ok0Var.F.getBounds().left, ((ok0Var.F.getBounds().height() / 2.0f) * ok0Var.L) + (-ok0Var.J) + ok0Var.F.getBounds().top);
                    fh.g gVar = ok0Var.G;
                    if (gVar != null) {
                        gVar.setAlpha((int) (ok0Var.r * 255.0f));
                        ok0Var.G.draw(canvas);
                    }
                    ok0Var.F.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 29:
                rw0 rw0Var = (rw0) this.b;
                pw0 pw0Var = rw0Var.c;
                if (pw0Var != null && pw0Var.getEditField() != null) {
                    org.telegram.messenger.g6 g6Var = rw0Var.W;
                    if (g6Var != null && g6Var.h) {
                        float x10 = rw0Var.c.getEditField().getX() + rw0Var.c.getEditField().getPaddingLeft();
                        org.telegram.messenger.g6 g6Var2 = rw0Var.W;
                        rw0Var.d0 = x10 + g6Var2.n;
                        rw0Var.a0 = g6Var2.r;
                    } else if (rw0Var.b0 != null && rw0Var.c0 != null) {
                        rw0Var.d0 = rw0Var.c.getEditField().getX() + rw0Var.c.getEditField().getPaddingLeft() + org.telegram.messenger.g0.L(12.0f);
                    }
                }
                boolean z10 = (!rw0Var.s || rw0Var.w || (arrayList = rw0Var.x) == null || arrayList.isEmpty() || rw0Var.y) ? false : true;
                float e10 = rw0Var.S.e(false, z10 ? 1.0f : 0.0f);
                float e11 = rw0Var.T.e(false, z10 ? 1.0f : 0.0f);
                float e12 = rw0Var.e0.e(false, rw0Var.d0);
                if (e10 <= 0.0f && e11 <= 0.0f && !z10) {
                    rw0Var.d.setVisibility(8);
                }
                rw0Var.P.rewind();
                float left = rw0Var.e.getLeft();
                int left2 = rw0Var.e.getLeft();
                ArrayList arrayList2 = rw0Var.x;
                float D = org.telegram.messenger.k5.D(44.0f, arrayList2 == null ? 0 : arrayList2.size(), left2);
                org.telegram.ui.Components.u5 u5Var = rw0Var.g0;
                float f15 = u5Var.c;
                boolean z11 = f15 <= 0.0f;
                float f16 = D - left;
                if (f16 > 0.0f) {
                    f15 = u5Var.e(z11, f16);
                }
                float e13 = rw0Var.f0.e(z11, (left + D) / 2.0f);
                pw0 pw0Var2 = rw0Var.c;
                if (pw0Var2 != null && pw0Var2.getEditField() != null) {
                    int i7 = rw0Var.h;
                    if (i7 == 0) {
                        rw0Var.d.setTranslationY(((((-rw0Var.c.getEditField().getHeight()) - rw0Var.c.getEditField().getScrollY()) + rw0Var.a0) + org.telegram.messenger.g0.L(5.0f)) - rw0Var.c.getEditFieldBottomOffset());
                    } else if (i7 == 1) {
                        rw0Var.d.setTranslationY((((((-rw0Var.getMeasuredHeight()) - rw0Var.c.getEditField().getScrollY()) + rw0Var.a0) + org.telegram.messenger.g0.L(20.0f)) + rw0Var.d.getHeight()) - rw0Var.c.getEditFieldBottomOffset());
                    }
                }
                float f17 = f15 / 4.0f;
                float f18 = f15 / 2.0f;
                int max = (int) Math.max((rw0Var.d0 - Math.max(f17, Math.min(f18, org.telegram.messenger.g0.L(66.0f)))) - rw0Var.e.getLeft(), 0.0f);
                if (rw0Var.e.getPaddingLeft() != max) {
                    int paddingLeft = rw0Var.e.getPaddingLeft() - max;
                    f10 = 1.0f;
                    rw0Var.e.setPadding(max, 0, 0, 0);
                    rw0Var.e.scrollBy(paddingLeft, 0);
                } else {
                    f10 = 1.0f;
                }
                rw0Var.e.setTranslationX(((int) Math.max((e12 - Math.max(f17, Math.min(f18, org.telegram.messenger.g0.L(66.0f)))) - rw0Var.e.getLeft(), 0.0f)) - max);
                float translationX = rw0Var.e.getTranslationX() + (e13 - f18) + rw0Var.e.getPaddingLeft();
                float translationY = rw0Var.e.getTranslationY() + rw0Var.e.getTop() + rw0Var.e.getPaddingTop() + (rw0Var.h == 0 ? 0 : org.telegram.messenger.g0.L(6.66f));
                float min = Math.min(rw0Var.e.getTranslationX() + e13 + f18 + rw0Var.e.getPaddingLeft(), rw0Var.getWidth() - rw0Var.d.getPaddingRight());
                float translationY2 = (rw0Var.e.getTranslationY() + rw0Var.e.getBottom()) - (rw0Var.h == 0 ? org.telegram.messenger.g0.L(6.66f) : 0);
                float min2 = Math.min(org.telegram.messenger.g0.L(9.0f), f18) * 2.0f;
                int i10 = rw0Var.h;
                if (i10 == 0) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    float f19 = translationY2 - min2;
                    float f20 = translationX + min2;
                    rectF.set(translationX, f19, f20, translationY2);
                    rw0Var.P.arcTo(rectF, 90.0f, 90.0f);
                    float f21 = translationY + min2;
                    rectF.set(translationX, translationY, f20, f21);
                    rw0Var.P.arcTo(rectF, -180.0f, 90.0f);
                    float f22 = min - min2;
                    rectF.set(f22, translationY, min, f21);
                    rw0Var.P.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f22, f19, min, translationY2);
                    rw0Var.P.arcTo(rectF, 0.0f, 90.0f);
                    rw0Var.P.lineTo(org.telegram.messenger.g0.L(8.66f) + e12, translationY2);
                    rw0Var.P.lineTo(e12, org.telegram.messenger.g0.L(6.66f) + translationY2);
                    rw0Var.P.lineTo(e12 - org.telegram.messenger.g0.L(8.66f), translationY2);
                } else if (i10 == 1) {
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float f23 = min - min2;
                    float f24 = translationY + min2;
                    rectF2.set(f23, translationY, min, f24);
                    rw0Var.P.arcTo(rectF2, -90.0f, 90.0f);
                    float f25 = translationY2 - min2;
                    rectF2.set(f23, f25, min, translationY2);
                    rw0Var.P.arcTo(rectF2, 0.0f, 90.0f);
                    float f26 = min2 + translationX;
                    rectF2.set(translationX, f25, f26, translationY2);
                    rw0Var.P.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, translationY, f26, f24);
                    rw0Var.P.arcTo(rectF2, -180.0f, 90.0f);
                    rw0Var.P.lineTo(e12 - org.telegram.messenger.g0.L(8.66f), translationY);
                    rw0Var.P.lineTo(e12, translationY - org.telegram.messenger.g0.L(6.66f));
                    rw0Var.P.lineTo(org.telegram.messenger.g0.L(8.66f) + e12, translationY);
                }
                rw0Var.P.close();
                if (rw0Var.R == null) {
                    Paint paint = new Paint(1);
                    rw0Var.R = paint;
                    paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.0f)));
                    rw0Var.R.setShadowLayer(org.telegram.messenger.g0.L(4.33f), 0.0f, org.telegram.messenger.g0.L(0.33333334f), 855638016);
                    rw0Var.R.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.tf, rw0Var.b));
                }
                if (e10 < f10) {
                    rw0Var.Q.rewind();
                    float L = rw0Var.h == 0 ? org.telegram.messenger.g0.L(6.66f) + translationY2 : translationY - org.telegram.messenger.g0.L(6.66f);
                    double d = e12 - translationX;
                    double d2 = L - translationY;
                    f11 = 255.0f;
                    double d10 = e12 - min;
                    double d11 = L - translationY2;
                    rw0Var.Q.addCircle(e12, L, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d2, 2.0d) + Math.pow(d, 2.0d), Math.pow(d2, 2.0d) + Math.pow(d10, 2.0d)), Math.max(Math.pow(d11, 2.0d) + Math.pow(d, 2.0d), Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d))))) * e10, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(rw0Var.Q);
                    canvas.saveLayerAlpha(0.0f, 0.0f, rw0Var.getWidth(), rw0Var.getHeight(), (int) (e10 * 255.0f), 31);
                } else {
                    f11 = 255.0f;
                }
                canvas.drawPath(rw0Var.P, rw0Var.R);
                canvas.save();
                canvas.clipPath(rw0Var.P);
                super.dispatchDraw(canvas);
                float f27 = rw0Var.g0.c;
                float f28 = rw0Var.f0.c;
                float f29 = f27 / 2.0f;
                float translationX2 = rw0Var.e.getTranslationX() + (f28 - f29) + rw0Var.e.getPaddingLeft();
                float paddingTop = rw0Var.e.getPaddingTop() + rw0Var.e.getTop();
                float min3 = Math.min(rw0Var.e.getTranslationX() + f28 + f29 + rw0Var.e.getPaddingLeft(), rw0Var.getWidth() - rw0Var.d.getPaddingRight());
                float bottom = rw0Var.e.getBottom();
                float e14 = rw0Var.U.e(false, rw0Var.e.canScrollHorizontally(-1) ? f10 : 0.0f);
                if (e14 > 0.0f) {
                    int i11 = (int) translationX2;
                    org.telegram.ui.ActionBar.j6.F4.setBounds(i11, (int) paddingTop, org.telegram.messenger.g0.L(32.0f) + i11, (int) bottom);
                    org.telegram.ui.ActionBar.j6.F4.setAlpha((int) (e14 * f11));
                    org.telegram.ui.ActionBar.j6.F4.draw(canvas);
                }
                float e15 = rw0Var.V.e(false, rw0Var.e.canScrollHorizontally(1) ? f10 : 0.0f);
                if (e15 > 0.0f) {
                    int i12 = (int) min3;
                    org.telegram.ui.ActionBar.j6.E4.setBounds(i12 - org.telegram.messenger.g0.L(32.0f), (int) paddingTop, i12, (int) bottom);
                    org.telegram.ui.ActionBar.j6.E4.setAlpha((int) (e15 * f11));
                    org.telegram.ui.ActionBar.j6.E4.draw(canvas);
                }
                canvas.restore();
                if (rw0Var.S.c < f10) {
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
                oe oeVar = (oe) this.b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && oeVar.isShowing()) {
                    oeVar.dismiss();
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
                ((ok0) this.b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        tr0[] tr0VarArr;
        tr0 tr0Var;
        switch (this.a) {
            case 3:
                if (((mb) this.b).u0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 6:
                if (((ii.f) this.b).t0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 15:
                dl dlVar = (dl) this.b;
                if (motionEvent.getActionMasked() != 0 || (motionEvent.getY() >= dlVar.x0 && motionEvent.getY() <= dlVar.y0)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 22:
                x80 x80Var = (x80) this.b;
                w80 w80Var = x80Var.S;
                if (w80Var != null && (tr0Var = (tr0VarArr = w80Var.n0)[0]) != null && tr0Var.h.getFastScroll() != null && tr0VarArr[0].h.getFastScroll().n) {
                    return x80Var.S.Z(motionEvent);
                }
                w80 w80Var2 = x80Var.S;
                if (w80Var2 == null || !w80Var2.P(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            case 27:
                it0 it0Var = (it0) this.b;
                if (motionEvent.getActionMasked() != 0 || (!it0Var.e0 && motionEvent.getY() < it0Var.b0)) {
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
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) this.b;
                org.telegram.ui.Cells.m5 m5Var = q5Var.a;
                if (q5Var.O == null || view != m5Var) {
                    return super.drawChild(canvas, view, j3);
                }
                boolean drawChild = super.drawChild(canvas, view, j3);
                if (!q5Var.P) {
                    return drawChild;
                }
                Rect rect = org.telegram.ui.Cells.q5.c0;
                q5Var.O.c(canvas, q5Var.b, m5Var.getMeasuredWidth(), m5Var.getMeasuredHeight(), 1.0f, false);
                ff ffVar = q5Var.I;
                if (ffVar == null || ffVar.N <= 0 || m5Var.E == null) {
                    return drawChild;
                }
                Path path = m5Var.F;
                if (path == null) {
                    m5Var.F = new Path();
                } else {
                    path.rewind();
                }
                int i10 = m5Var.c;
                if (i10 == -1 || (i7 = m5Var.d) == -1) {
                    measuredWidth = m5Var.getMeasuredWidth();
                    measuredHeight = m5Var.getMeasuredHeight();
                } else {
                    measuredWidth = i10;
                    measuredHeight = i7;
                }
                float L = m5Var.E.c + org.telegram.messenger.g0.L(18.0f);
                float L2 = org.telegram.messenger.g0.L(28.0f);
                float f11 = (measuredWidth - L) / 2.0f;
                float f12 = measuredHeight / 2.0f;
                RectF rectF = org.telegram.messenger.g0.P;
                float f13 = L2 / 2.0f;
                rectF.set(f11, f12 - f13, L + f11, f12 + f13);
                m5Var.F.addRoundRect(rectF, f13, f13, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(m5Var.F);
                ImageReceiver imageReceiver = m5Var.b;
                if (imageReceiver != null && m5Var.s) {
                    imageReceiver.p1 = m5Var.G;
                    float alpha = imageReceiver.getAlpha();
                    m5Var.b.setAlpha(1.0f);
                    m5Var.b.h(canvas, null);
                    m5Var.b.setAlpha(alpha);
                    m5Var.b.p1 = null;
                }
                m5Var.E.c(f11 + org.telegram.messenger.g0.L(9.0f), f12, 1.0f, -1, canvas);
                canvas.restore();
                return drawChild;
            case 15:
                canvas.save();
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                dl dlVar = (dl) this.b;
                canvas.clipRect(0, 0, measuredWidth2, measuredHeight2 - dlVar.z0);
                boolean drawChild2 = dlVar.y ? false : super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild2;
            case 27:
                it0 it0Var = (it0) this.b;
                if (it0Var.e0) {
                    vj0 vj0Var = it0Var.E;
                    f10 = it0Var.M.getX();
                    break;
                }
                f10 = 0.0f;
                int save = canvas.save();
                canvas.clipRect(Math.max(0.0f, f10), -it0Var.T, Math.min(getWidth(), getWidth() + f10), Math.min(getHeight() + it0Var.U, it0Var.b0));
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
                bu buVar = (bu) this.b;
                m71 m71Var = buVar.n1;
                xt xtVar = buVar.m1;
                super.onDetachedFromWindow();
                try {
                    if (buVar.M0()) {
                        if (xtVar.getVisibility() != 0) {
                        }
                        if (m71Var.f() && !buVar.M0()) {
                            if (bu.S1 == buVar) {
                                bu.S1 = null;
                            }
                            m71Var.b();
                            break;
                        }
                    }
                    if (xtVar.getParent() != null) {
                        removeView(xtVar);
                        xtVar.stopLoading();
                        xtVar.loadUrl("about:blank");
                        xtVar.destroy();
                    }
                    if (m71Var.f()) {
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
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
                ch.o oVar = (ch.o) this.b;
                if (oVar.y > 0) {
                    canvas.drawRect(0.0f, getHeight() - oVar.y, getWidth(), getHeight(), oVar.E);
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
                ((q9) this.b).e.a(canvas);
                break;
            case 15:
                dl dlVar = (dl) this.b;
                dlVar.a0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, dlVar.a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - dlVar.z0, dlVar.a0);
                break;
            case 26:
                bt0 bt0Var = (bt0) this.b;
                bt0Var.o1.setBounds(0, bt0Var.q1 - bt0Var.t0, getMeasuredWidth(), getMeasuredHeight());
                bt0Var.o1.draw(canvas);
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
                dl dlVar = (dl) this.b;
                if (motionEvent.getActionMasked() != 0 || (motionEvent.getY() >= dlVar.x0 && motionEvent.getY() <= dlVar.y0)) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return false;
            case 26:
                bt0 bt0Var = (bt0) this.b;
                if (motionEvent.getAction() != 0 || bt0Var.q1 == 0 || motionEvent.getY() >= bt0Var.q1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                bt0Var.dismiss();
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
                ch.o oVar = (ch.o) this.b;
                if (oVar.P && z10) {
                    oVar.j0(oVar.R.e);
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
                                    paddingLeft2 = org.telegram.messenger.k5.C(8.0f, view.getMeasuredWidth(), paddingLeft2);
                                }
                                childAt.layout(paddingLeft2, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                int paddingRight2 = (i17 - getPaddingRight()) - childAt.getMeasuredWidth();
                                if (view != null) {
                                    paddingRight2 = i20.w(8.0f, view.getMeasuredWidth(), paddingRight2);
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
                ((q9) this.b).e.f(i22, i23, i22 + L3, L3 + i23);
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
                s10 s10Var = (s10) this.b;
                g2 g2Var = s10Var.b;
                int[] iArr = s10Var.I;
                g2Var.getLocationOnScreen(iArr);
                s10Var.P = iArr[0];
                s10Var.O = iArr[1] - org.telegram.messenger.g0.L(25.0f);
                break;
            case 24:
                super.onLayout(z10, i7, i10, i11, i12);
                ok0 ok0Var = (ok0) this.b;
                g2 g2Var2 = ok0Var.s;
                st0 st0Var = ok0Var.w;
                Drawable drawable = ok0Var.F;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (ok0Var.y != null) {
                        float f11 = bounds.left;
                        float f12 = ok0Var.I;
                        float f13 = f11 + f12;
                        float f14 = bounds.right + f12;
                        float f15 = bounds.top;
                        float f16 = ok0Var.J;
                        float f17 = f15 + f16;
                        float f18 = bounds.bottom + f16;
                        boolean z13 = false;
                        if (ok0Var.M) {
                            f10 = 4.0f;
                            z11 = false;
                        } else {
                            if (f14 - r5.getMeasuredWidth() < org.telegram.messenger.g0.L(8.0f)) {
                                ok0Var.E.setPivotX(org.telegram.messenger.g0.L(6.0f));
                                ok0Var.y.setX(Math.min(st0Var.getWidth() - ok0Var.y.getWidth(), f13 - org.telegram.messenger.g0.L(10.0f)) - st0Var.getX());
                                f10 = 4.0f;
                                z11 = false;
                            } else {
                                ok0Var.E.setPivotX(r5.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f));
                                f10 = 4.0f;
                                ok0Var.y.setX(Math.max(org.telegram.messenger.g0.L(8.0f), (org.telegram.messenger.g0.L(4.0f) + f14) - ok0Var.y.getMeasuredWidth()) - st0Var.getX());
                                z11 = true;
                            }
                            ok0Var.H = z11 ? ((ok0Var.y.getX() + ok0Var.y.getWidth()) - org.telegram.messenger.g0.L(6.0f)) - f14 : (ok0Var.y.getX() + org.telegram.messenger.g0.L(10.0f)) - f13;
                        }
                        float L5 = f18 + (ok0Var.G != null ? org.telegram.messenger.g0.L(21.0f) : 0);
                        if (ok0Var.y.getMeasuredHeight() + L5 > g2Var2.getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f)) {
                            ok0Var.E.setPivotY(r2.getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f));
                            ok0Var.y.setY(((f17 - org.telegram.messenger.g0.L(f10)) - ok0Var.y.getMeasuredHeight()) - st0Var.getY());
                            z13 = true;
                        } else {
                            ok0Var.E.setPivotY(org.telegram.messenger.g0.L(6.0f));
                            ok0Var.y.setY(Math.min((g2Var2.getHeight() - ok0Var.y.getMeasuredHeight()) - org.telegram.messenger.g0.L(16.0f), L5) - st0Var.getY());
                        }
                        m60 m60Var = ok0Var.x;
                        m60Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m60Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z13;
                        break;
                    }
                }
                break;
            case 26:
                super.onLayout(z10, i7, i10, i11, i12);
                bt0.I0((bt0) this.b);
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
                ((i2) this.b).L.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
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
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L((((bu) this.b).E1 ? 22 : 0) + 84) + ((int) Math.min(r0.C1 / (r0.B1 / size), org.telegram.messenger.g0.q.y / 2)) + 1, TLObject.FLAG_30));
                break;
            case 19:
                lx lxVar = (lx) this.b;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((((View) lxVar.G.getParent()) != null ? (int) (r0.getMeasuredHeight() - lxVar.G.getY()) : org.telegram.messenger.g0.L(120.0f)) - lxVar.G.c1, TLObject.FLAG_30));
                break;
            case 20:
                ly lyVar = ((gy) this.b).R;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (i20.y(8.0f, lyVar.E0.getMeasuredHeight() - lyVar.c1, 3) * 1.7f), TLObject.FLAG_30));
                break;
            case 26:
                bt0 bt0Var = (bt0) this.b;
                di.c1 c1Var = bt0Var.m1;
                int size2 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.m;
                getMeasuredWidth();
                int D = org.telegram.messenger.k5.D(54.0f, rd.g(), org.telegram.messenger.k5.C(56.0f, org.telegram.messenger.g0.L(56.0f), 1));
                int i14 = size2 / 5;
                if (D < i14 * 3) {
                    i11 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    i11 = i14 * 2;
                    if (D < size2) {
                        i11 -= size2 - D;
                    }
                }
                if (c1Var.getPaddingTop() != i11) {
                    bt0Var.r1 = true;
                    c1Var.setPadding(0, i11, 0, org.telegram.messenger.g0.L(8.0f));
                    bt0Var.r1 = false;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), TLObject.FLAG_30));
                break;
            case 29:
                rw0 rw0Var = (rw0) this.b;
                setPadding(rw0Var.n, rw0Var.h == 0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(6.66f), rw0Var.n, rw0Var.h == 0 ? org.telegram.messenger.g0.L(6.66f) : org.telegram.messenger.g0.L(8.0f));
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
                ok0 ok0Var = (ok0) this.b;
                ih.d.c(ok0Var.h, ok0Var.s);
                ViewGroup viewGroup = ok0Var.E;
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
                return !((bt0) this.b).J && super.onTouchEvent(motionEvent);
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
                uj0 uj0Var = (uj0) this.b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(uj0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(uj0Var.getMeasuredHeight(), TLObject.FLAG_30));
                    layout(0, 0, uj0Var.c1.getMeasuredWidth(), uj0Var.c1.getMeasuredHeight());
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 26:
                if (!((bt0) this.b).r1) {
                    super.requestLayout();
                    break;
                }
                break;
            case 28:
                if (!((bw0) this.b).b2) {
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
                di.c6 c6Var = (di.c6) this.b;
                di.h4 h4Var = c6Var.a2;
                if (h4Var != null && h4Var.getVisibility() == 0) {
                    c6Var.a2.invalidate();
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
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.b;
                FrameLayout frameLayout = u2Var.F;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((-(u2Var.c.getHeight() - u2Var.b.getY())) + u2Var.t0);
                }
                u2Var.g0(f10);
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
                ((s10) this.b).d.setVisibility(i7);
                break;
            case 29:
                rw0 rw0Var = (rw0) this.b;
                boolean z10 = getVisibility() == i7;
                super.setVisibility(i7);
                if (!z10) {
                    boolean z11 = i7 == 0;
                    if (rw0Var.e != null) {
                        for (int i10 = 0; i10 < rw0Var.e.getChildCount(); i10++) {
                            if (z11) {
                                qw0 qw0Var = (qw0) rw0Var.e.getChildAt(i10);
                                Drawable drawable = qw0Var.b;
                                if (drawable instanceof org.telegram.ui.Components.g5) {
                                    ((org.telegram.ui.Components.g5) drawable).a(qw0Var);
                                }
                                qw0Var.c = true;
                            } else {
                                qw0 qw0Var2 = (qw0) rw0Var.e.getChildAt(i10);
                                Drawable drawable2 = qw0Var2.b;
                                if (drawable2 instanceof org.telegram.ui.Components.g5) {
                                    ((org.telegram.ui.Components.g5) drawable2).n(qw0Var2);
                                }
                                qw0Var2.c = false;
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
    public /* synthetic */ g2(Context context, int i7) {
        super(context);
        this.a = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(Context context) {
        super(context);
        this.a = 7;
        lh.f fVar = new lh.f(context);
        this.b = fVar;
        addView(fVar, ja.g());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = 17;
        this.b = new jo[2];
        int i7 = 0;
        while (true) {
            jo[] joVarArr = (jo[]) this.b;
            if (i7 < joVarArr.length) {
                joVarArr[i7] = new jo(context, e6Var);
                addView(((jo[]) this.b)[i7], ja.e(-1, -1, ns.E1));
                i7++;
            } else {
                joVarArr[0].setVisibility(0);
                ((jo[]) this.b)[1].setVisibility(8);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(Context context, String str, fi.b bVar) {
        super(context);
        this.a = 4;
        int L = org.telegram.messenger.g0.L(12.0f);
        int i7 = org.telegram.ui.ActionBar.j6.j5;
        Drawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(i7, bVar)));
        org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.06f, i7);
        setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(this, d02, K, null, bVar);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, ja.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, true);
        this.b = h6Var;
        h6Var.b(0.6f, 450L, er.h);
        h6Var.setTextSize(org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.ActionBar.q6.Y(h6Var, i7, bVar);
        h6Var.setScaleProperty(0.7f);
        h6Var.setGravity(17);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setAllowCancel(true);
        f10.addView(h6Var, ja.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.q6.U(textView, i7, bVar);
        textView.setGravity(17);
        f10.addView(textView, ja.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(ch.o oVar, Context context) {
        super(context);
        this.a = 1;
        this.b = oVar;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(it0 it0Var, Context context) {
        super(context);
        this.a = 27;
        this.b = it0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }
}
