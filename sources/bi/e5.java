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
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gf;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.ct0;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.hx;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.kk0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.ne;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.ur0;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.wk;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.xf;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zn;
import org.telegram.ui.Components.zv0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class e5 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e5(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    public zn a() {
        return ((zn[]) this.b)[0];
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
        zn[] znVarArr = (zn[]) this.b;
        zn znVar = znVarArr[0];
        zn znVar2 = znVarArr[1];
        znVarArr[0] = znVar2;
        znVarArr[1] = znVar;
        znVar2.n = true;
        znVar2.setVisibility(0);
        znVarArr[0].setScaleX(0.8f);
        znVarArr[0].setScaleY(0.8f);
        znVarArr[0].setAlpha(0.0f);
        znVarArr[0].setTranslationY(org.telegram.messenger.g0.L(20.0f));
        ViewPropertyAnimator translationY = znVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        xq xqVar = xq.h;
        org.telegram.messenger.camera.q.l(translationY, xqVar, 320L);
        zn znVar3 = znVarArr[1];
        znVar3.n = false;
        znVar3.setVisibility(0);
        znVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setInterpolator(xqVar).setDuration(320L).withEndAction(new xf(znVar3, 29)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        ArrayList arrayList;
        switch (this.a) {
            case 23:
                kk0 kk0Var = (kk0) this.b;
                if (kk0Var.r > 0.0f && kk0Var.e != null) {
                    kk0Var.f.reset();
                    float width = getWidth() / kk0Var.c.getWidth();
                    kk0Var.f.postScale(width, width);
                    kk0Var.d.setLocalMatrix(kk0Var.f);
                    kk0Var.e.setAlpha((int) (kk0Var.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), kk0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = kk0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (kk0Var.r * 255.0f));
                    canvas.save();
                    float f12 = kk0Var.H;
                    float f13 = kk0Var.G;
                    float f14 = kk0Var.r;
                    canvas.translate((f13 * f14) + f12, (0.0f * f14) + kk0Var.I);
                    float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(Math.min(kk0Var.J, kk0Var.K), Math.max(kk0Var.J, kk0Var.K), 0.75f), 1.0f, kk0Var.r);
                    canvas.scale(T1, T1, ((kk0Var.E.getBounds().width() / 2.0f) * kk0Var.J) + (-kk0Var.H) + kk0Var.E.getBounds().left, ((kk0Var.E.getBounds().height() / 2.0f) * kk0Var.K) + (-kk0Var.I) + kk0Var.E.getBounds().top);
                    fh.g gVar = kk0Var.F;
                    if (gVar != null) {
                        gVar.setAlpha((int) (kk0Var.r * 255.0f));
                        kk0Var.F.draw(canvas);
                    }
                    kk0Var.E.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 28:
                pw0 pw0Var = (pw0) this.b;
                nw0 nw0Var = pw0Var.c;
                if (nw0Var != null && nw0Var.getEditField() != null) {
                    org.telegram.messenger.f6 f6Var = pw0Var.V;
                    if (f6Var != null && f6Var.h) {
                        float x10 = pw0Var.c.getEditField().getX() + pw0Var.c.getEditField().getPaddingLeft();
                        org.telegram.messenger.f6 f6Var2 = pw0Var.V;
                        pw0Var.c0 = x10 + f6Var2.n;
                        pw0Var.W = f6Var2.r;
                    } else if (pw0Var.a0 != null && pw0Var.b0 != null) {
                        pw0Var.c0 = pw0Var.c.getEditField().getX() + pw0Var.c.getEditField().getPaddingLeft() + org.telegram.messenger.g0.L(12.0f);
                    }
                }
                boolean z9 = (!pw0Var.s || pw0Var.w || (arrayList = pw0Var.x) == null || arrayList.isEmpty() || pw0Var.y) ? false : true;
                float e10 = pw0Var.R.e(false, z9 ? 1.0f : 0.0f);
                float e11 = pw0Var.S.e(false, z9 ? 1.0f : 0.0f);
                float e12 = pw0Var.d0.e(false, pw0Var.c0);
                if (e10 <= 0.0f && e11 <= 0.0f && !z9) {
                    pw0Var.d.setVisibility(8);
                }
                pw0Var.O.rewind();
                float left = pw0Var.e.getLeft();
                int left2 = pw0Var.e.getLeft();
                ArrayList arrayList2 = pw0Var.x;
                float D = org.telegram.messenger.k5.D(44.0f, arrayList2 == null ? 0 : arrayList2.size(), left2);
                org.telegram.ui.Components.w5 w5Var = pw0Var.f0;
                float f15 = w5Var.c;
                boolean z10 = f15 <= 0.0f;
                float f16 = D - left;
                if (f16 > 0.0f) {
                    f15 = w5Var.e(z10, f16);
                }
                float e13 = pw0Var.e0.e(z10, (left + D) / 2.0f);
                nw0 nw0Var2 = pw0Var.c;
                if (nw0Var2 != null && nw0Var2.getEditField() != null) {
                    int i7 = pw0Var.h;
                    if (i7 == 0) {
                        pw0Var.d.setTranslationY(((-pw0Var.c.getEditField().getHeight()) - pw0Var.c.getEditField().getScrollY()) + pw0Var.W + org.telegram.messenger.g0.L(5.0f));
                    } else if (i7 == 1) {
                        pw0Var.d.setTranslationY(((-pw0Var.getMeasuredHeight()) - pw0Var.c.getEditField().getScrollY()) + pw0Var.W + org.telegram.messenger.g0.L(20.0f) + pw0Var.d.getHeight());
                    }
                }
                float f17 = f15 / 4.0f;
                float f18 = f15 / 2.0f;
                int max = (int) Math.max((pw0Var.c0 - Math.max(f17, Math.min(f18, org.telegram.messenger.g0.L(66.0f)))) - pw0Var.e.getLeft(), 0.0f);
                if (pw0Var.e.getPaddingLeft() != max) {
                    int paddingLeft = pw0Var.e.getPaddingLeft() - max;
                    f10 = 1.0f;
                    pw0Var.e.setPadding(max, 0, 0, 0);
                    pw0Var.e.scrollBy(paddingLeft, 0);
                } else {
                    f10 = 1.0f;
                }
                pw0Var.e.setTranslationX(((int) Math.max((e12 - Math.max(f17, Math.min(f18, org.telegram.messenger.g0.L(66.0f)))) - pw0Var.e.getLeft(), 0.0f)) - max);
                float translationX = pw0Var.e.getTranslationX() + (e13 - f18) + pw0Var.e.getPaddingLeft();
                float translationY = pw0Var.e.getTranslationY() + pw0Var.e.getTop() + pw0Var.e.getPaddingTop() + (pw0Var.h == 0 ? 0 : org.telegram.messenger.g0.L(6.66f));
                float min = Math.min(pw0Var.e.getTranslationX() + e13 + f18 + pw0Var.e.getPaddingLeft(), pw0Var.getWidth() - pw0Var.d.getPaddingRight());
                float translationY2 = (pw0Var.e.getTranslationY() + pw0Var.e.getBottom()) - (pw0Var.h == 0 ? org.telegram.messenger.g0.L(6.66f) : 0);
                float min2 = Math.min(org.telegram.messenger.g0.L(9.0f), f18) * 2.0f;
                int i10 = pw0Var.h;
                if (i10 == 0) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    float f19 = translationY2 - min2;
                    float f20 = translationX + min2;
                    rectF.set(translationX, f19, f20, translationY2);
                    pw0Var.O.arcTo(rectF, 90.0f, 90.0f);
                    float f21 = translationY + min2;
                    rectF.set(translationX, translationY, f20, f21);
                    pw0Var.O.arcTo(rectF, -180.0f, 90.0f);
                    float f22 = min - min2;
                    rectF.set(f22, translationY, min, f21);
                    pw0Var.O.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f22, f19, min, translationY2);
                    pw0Var.O.arcTo(rectF, 0.0f, 90.0f);
                    pw0Var.O.lineTo(org.telegram.messenger.g0.L(8.66f) + e12, translationY2);
                    pw0Var.O.lineTo(e12, org.telegram.messenger.g0.L(6.66f) + translationY2);
                    pw0Var.O.lineTo(e12 - org.telegram.messenger.g0.L(8.66f), translationY2);
                } else if (i10 == 1) {
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float f23 = min - min2;
                    float f24 = translationY + min2;
                    rectF2.set(f23, translationY, min, f24);
                    pw0Var.O.arcTo(rectF2, -90.0f, 90.0f);
                    float f25 = translationY2 - min2;
                    rectF2.set(f23, f25, min, translationY2);
                    pw0Var.O.arcTo(rectF2, 0.0f, 90.0f);
                    float f26 = min2 + translationX;
                    rectF2.set(translationX, f25, f26, translationY2);
                    pw0Var.O.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, translationY, f26, f24);
                    pw0Var.O.arcTo(rectF2, -180.0f, 90.0f);
                    pw0Var.O.lineTo(e12 - org.telegram.messenger.g0.L(8.66f), translationY);
                    pw0Var.O.lineTo(e12, translationY - org.telegram.messenger.g0.L(6.66f));
                    pw0Var.O.lineTo(org.telegram.messenger.g0.L(8.66f) + e12, translationY);
                }
                pw0Var.O.close();
                if (pw0Var.Q == null) {
                    Paint paint = new Paint(1);
                    pw0Var.Q = paint;
                    paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.0f)));
                    pw0Var.Q.setShadowLayer(org.telegram.messenger.g0.L(4.33f), 0.0f, org.telegram.messenger.g0.L(0.33333334f), 855638016);
                    pw0Var.Q.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.qf, pw0Var.b));
                }
                if (e10 < f10) {
                    pw0Var.P.rewind();
                    float L = pw0Var.h == 0 ? org.telegram.messenger.g0.L(6.66f) + translationY2 : translationY - org.telegram.messenger.g0.L(6.66f);
                    double d = e12 - translationX;
                    double d2 = L - translationY;
                    f11 = 255.0f;
                    double d10 = e12 - min;
                    double d11 = L - translationY2;
                    pw0Var.P.addCircle(e12, L, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d2, 2.0d) + Math.pow(d, 2.0d), Math.pow(d2, 2.0d) + Math.pow(d10, 2.0d)), Math.max(Math.pow(d11, 2.0d) + Math.pow(d, 2.0d), Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d))))) * e10, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(pw0Var.P);
                    canvas.saveLayerAlpha(0.0f, 0.0f, pw0Var.getWidth(), pw0Var.getHeight(), (int) (e10 * 255.0f), 31);
                } else {
                    f11 = 255.0f;
                }
                canvas.drawPath(pw0Var.O, pw0Var.Q);
                canvas.save();
                canvas.clipPath(pw0Var.O);
                super.dispatchDraw(canvas);
                float f27 = pw0Var.f0.c;
                float f28 = pw0Var.e0.c;
                float f29 = f27 / 2.0f;
                float translationX2 = pw0Var.e.getTranslationX() + (f28 - f29) + pw0Var.e.getPaddingLeft();
                float paddingTop = pw0Var.e.getPaddingTop() + pw0Var.e.getTop();
                float min3 = Math.min(pw0Var.e.getTranslationX() + f28 + f29 + pw0Var.e.getPaddingLeft(), pw0Var.getWidth() - pw0Var.d.getPaddingRight());
                float bottom = pw0Var.e.getBottom();
                float e14 = pw0Var.T.e(false, pw0Var.e.canScrollHorizontally(-1) ? f10 : 0.0f);
                if (e14 > 0.0f) {
                    int i11 = (int) translationX2;
                    org.telegram.ui.ActionBar.l6.F4.setBounds(i11, (int) paddingTop, org.telegram.messenger.g0.L(32.0f) + i11, (int) bottom);
                    org.telegram.ui.ActionBar.l6.F4.setAlpha((int) (e14 * f11));
                    org.telegram.ui.ActionBar.l6.F4.draw(canvas);
                }
                float e15 = pw0Var.U.e(false, pw0Var.e.canScrollHorizontally(1) ? f10 : 0.0f);
                if (e15 > 0.0f) {
                    int i12 = (int) min3;
                    org.telegram.ui.ActionBar.l6.E4.setBounds(i12 - org.telegram.messenger.g0.L(32.0f), (int) paddingTop, i12, (int) bottom);
                    org.telegram.ui.ActionBar.l6.E4.setAlpha((int) (e15 * f11));
                    org.telegram.ui.ActionBar.l6.E4.draw(canvas);
                }
                canvas.restore();
                if (pw0Var.R.c < f10) {
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
            case 24:
                ne neVar = (ne) this.b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && neVar.isShowing()) {
                    neVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 23:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((kk0) this.b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ur0[] ur0VarArr;
        ur0 ur0Var;
        switch (this.a) {
            case 1:
                if (((dd) this.b).t0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                if (((gi.f) this.b).s0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 14:
                wk wkVar = (wk) this.b;
                if (motionEvent.getActionMasked() != 0 || (motionEvent.getY() >= wkVar.w0 && motionEvent.getY() <= wkVar.x0)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 21:
                v80 v80Var = (v80) this.b;
                u80 u80Var = v80Var.R;
                if (u80Var != null && (ur0Var = (ur0VarArr = u80Var.m0)[0]) != null && ur0Var.h.getFastScroll() != null && ur0VarArr[0].h.getFastScroll().n) {
                    return v80Var.R.Z(motionEvent);
                }
                u80 u80Var2 = v80Var.R;
                if (u80Var2 == null || !u80Var2.P(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            case 26:
                jt0 jt0Var = (jt0) this.b;
                if (motionEvent.getActionMasked() != 0 || (!jt0Var.d0 && motionEvent.getY() < jt0Var.a0)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 29:
                float a10 = ((org.telegram.ui.Components.ic) this.b).a(0.03f);
                canvas.save();
                canvas.scale(a10, a10, getWidth() / 2.0f, getHeight() / 2.0f);
                super.draw(canvas);
                canvas.restore();
                break;
            default:
                super.draw(canvas);
                break;
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
            case 11:
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) this.b;
                org.telegram.ui.Cells.m5 m5Var = q5Var.a;
                if (q5Var.N == null || view != m5Var) {
                    return super.drawChild(canvas, view, j3);
                }
                boolean drawChild = super.drawChild(canvas, view, j3);
                if (!q5Var.O) {
                    return drawChild;
                }
                Rect rect = org.telegram.ui.Cells.q5.b0;
                q5Var.N.c(canvas, q5Var.b, m5Var.getMeasuredWidth(), m5Var.getMeasuredHeight(), 1.0f, false);
                gf gfVar = q5Var.H;
                if (gfVar == null || gfVar.N <= 0 || m5Var.D == null) {
                    return drawChild;
                }
                Path path = m5Var.E;
                if (path == null) {
                    m5Var.E = new Path();
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
                float L = m5Var.D.c + org.telegram.messenger.g0.L(18.0f);
                float L2 = org.telegram.messenger.g0.L(28.0f);
                float f11 = (measuredWidth - L) / 2.0f;
                float f12 = measuredHeight / 2.0f;
                RectF rectF = org.telegram.messenger.g0.P;
                float f13 = L2 / 2.0f;
                rectF.set(f11, f12 - f13, L + f11, f12 + f13);
                m5Var.E.addRoundRect(rectF, f13, f13, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(m5Var.E);
                ImageReceiver imageReceiver = m5Var.b;
                if (imageReceiver != null && m5Var.s) {
                    imageReceiver.o1 = m5Var.F;
                    float alpha = imageReceiver.getAlpha();
                    m5Var.b.setAlpha(1.0f);
                    m5Var.b.h(canvas, null);
                    m5Var.b.setAlpha(alpha);
                    m5Var.b.o1 = null;
                }
                m5Var.D.c(f11 + org.telegram.messenger.g0.L(9.0f), f12, 1.0f, -1, canvas);
                canvas.restore();
                return drawChild;
            case 14:
                canvas.save();
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                wk wkVar = (wk) this.b;
                canvas.clipRect(0, 0, measuredWidth2, measuredHeight2 - wkVar.y0);
                boolean drawChild2 = wkVar.y ? false : super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild2;
            case 26:
                jt0 jt0Var = (jt0) this.b;
                if (jt0Var.d0) {
                    rj0 rj0Var = jt0Var.D;
                    f10 = jt0Var.L.getX();
                    break;
                }
                f10 = 0.0f;
                int save = canvas.save();
                canvas.clipRect(Math.max(0.0f, f10), -jt0Var.S, Math.min(getWidth(), getWidth() + f10), Math.min(getHeight() + jt0Var.T, jt0Var.a0));
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
            case 10:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 17:
                wt wtVar = (wt) this.b;
                m71 m71Var = wtVar.j1;
                st stVar = wtVar.i1;
                super.onDetachedFromWindow();
                try {
                    if (wtVar.M0()) {
                        if (stVar.getVisibility() != 0) {
                        }
                        if (m71Var.f() && !wtVar.M0()) {
                            if (wt.O1 == wtVar) {
                                wt.O1 = null;
                            }
                            m71Var.b();
                            break;
                        }
                    }
                    if (stVar.getParent() != null) {
                        removeView(stVar);
                        stVar.stopLoading();
                        stVar.loadUrl("about:blank");
                        stVar.destroy();
                    }
                    if (m71Var.f()) {
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
            case 2:
                super.onDraw(canvas);
                ch.o oVar = (ch.o) this.b;
                if (oVar.y > 0) {
                    canvas.drawRect(0.0f, getHeight() - oVar.y, getWidth(), getHeight(), oVar.D);
                    break;
                }
                break;
            case 12:
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
            case 13:
                ((org.telegram.ui.Components.u9) this.b).e.a(canvas);
                break;
            case 14:
                wk wkVar = (wk) this.b;
                wkVar.W.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.h5, wkVar.a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - wkVar.y0, wkVar.W);
                break;
            case 25:
                ct0 ct0Var = (ct0) this.b;
                ct0Var.k1.setBounds(0, ct0Var.m1 - ct0Var.s0, getMeasuredWidth(), getMeasuredHeight());
                ct0Var.k1.draw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 14:
                wk wkVar = (wk) this.b;
                if (motionEvent.getActionMasked() != 0 || (motionEvent.getY() >= wkVar.w0 && motionEvent.getY() <= wkVar.x0)) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return false;
            case 25:
                ct0 ct0Var = (ct0) this.b;
                if (motionEvent.getAction() != 0 || ct0Var.m1 == 0 || motionEvent.getY() >= ct0Var.m1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                ct0Var.dismiss();
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
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
        boolean z10;
        switch (this.a) {
            case 2:
                super.onLayout(z9, i7, i10, i11, i12);
                ch.o oVar = (ch.o) this.b;
                if (oVar.O && z9) {
                    oVar.j0(oVar.Q.e);
                    break;
                }
                break;
            case 9:
                int childCount = getChildCount();
                int i17 = i11 - i7;
                int i18 = -1;
                if (((org.telegram.ui.ActionBar.u1) this.b).K0) {
                    View findViewWithTag = findViewWithTag(-3);
                    View findViewWithTag2 = findViewWithTag(-4);
                    View findViewWithTag3 = findViewWithTag(-2);
                    View findViewWithTag4 = findViewWithTag(-1);
                    int paddingLeft = getPaddingLeft();
                    int paddingRight = i17 - getPaddingRight();
                    int max = Math.max(0, ((paddingRight - paddingLeft) - org.telegram.messenger.g0.L(8.0f)) / 2);
                    boolean z11 = org.telegram.messenger.id.a0;
                    int i19 = z11 ? paddingRight - max : paddingLeft;
                    if (!z11) {
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
                            if (org.telegram.messenger.id.a0) {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout((i17 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i17 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                            view = childAt;
                        } else if (num.intValue() == -2) {
                            if (org.telegram.messenger.id.a0) {
                                int paddingLeft2 = getPaddingLeft();
                                if (view != null) {
                                    paddingLeft2 = org.telegram.messenger.k5.C(8.0f, view.getMeasuredWidth(), paddingLeft2);
                                }
                                childAt.layout(paddingLeft2, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                int paddingRight2 = (i17 - getPaddingRight()) - childAt.getMeasuredWidth();
                                if (view != null) {
                                    paddingRight2 = org.telegram.messenger.camera.q.w(8.0f, view.getMeasuredWidth(), paddingRight2);
                                }
                                childAt.layout(paddingRight2, getPaddingTop(), childAt.getMeasuredWidth() + paddingRight2, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -4) {
                            View findViewWithTag5 = findViewWithTag(-3);
                            if (org.telegram.messenger.id.a0) {
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
                            if (org.telegram.messenger.id.a0) {
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
            case 13:
                super.onLayout(z9, i7, i10, i11, i12);
                int L3 = org.telegram.messenger.g0.L(36.0f);
                int i22 = ((i11 - i7) - L3) / 2;
                int i23 = ((i12 - i10) - L3) / 2;
                ((org.telegram.ui.Components.u9) this.b).e.f(i22, i23, i22 + L3, L3 + i23);
                break;
            case 15:
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
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.q0.getMeasuredHeight()) - org.telegram.messenger.g0.L(12.0f);
                if (getMeasuredWidth() == org.telegram.messenger.g0.L(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.q0;
                    textView.layout(measuredWidth2 - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.q0.getMeasuredWidth() / 2) + measuredWidth2, chatAttachAlertPhotoLayout.q0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.q0;
                    textView2.layout(measuredWidth2 - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.q0.getMeasuredWidth() / 2) + measuredWidth2, chatAttachAlertPhotoLayout.q0.getMeasuredHeight() + measuredHeight4);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.k0;
                shutterButton.layout(measuredWidth2 - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.k0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.k0.getMeasuredWidth() / 2) + measuredWidth2, (chatAttachAlertPhotoLayout.k0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.r0;
                imageView.layout(i15 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.r0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.r0.getMeasuredWidth() / 2) + i15, (chatAttachAlertPhotoLayout.r0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i26 = 0; i26 < 2; i26++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.S[i26];
                    imageView2.layout(L - (imageView2.getMeasuredWidth() / 2), i16 - (chatAttachAlertPhotoLayout.S[i26].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.S[i26].getMeasuredWidth() / 2) + L, (chatAttachAlertPhotoLayout.S[i26].getMeasuredHeight() / 2) + i16);
                }
                break;
            case 20:
                super.onLayout(z9, i7, i10, i11, i12);
                q10 q10Var = (q10) this.b;
                e5 e5Var = q10Var.b;
                int[] iArr = q10Var.H;
                e5Var.getLocationOnScreen(iArr);
                q10Var.O = iArr[0];
                q10Var.N = iArr[1] - org.telegram.messenger.g0.L(25.0f);
                break;
            case 23:
                super.onLayout(z9, i7, i10, i11, i12);
                kk0 kk0Var = (kk0) this.b;
                e5 e5Var2 = kk0Var.s;
                tt0 tt0Var = kk0Var.w;
                Drawable drawable = kk0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (kk0Var.y != null) {
                        float f11 = bounds.left;
                        float f12 = kk0Var.H;
                        float f13 = f11 + f12;
                        float f14 = bounds.right + f12;
                        float f15 = bounds.top;
                        float f16 = kk0Var.I;
                        float f17 = f15 + f16;
                        float f18 = bounds.bottom + f16;
                        boolean z12 = false;
                        if (kk0Var.L) {
                            f10 = 4.0f;
                            z10 = false;
                        } else {
                            if (f14 - r5.getMeasuredWidth() < org.telegram.messenger.g0.L(8.0f)) {
                                kk0Var.D.setPivotX(org.telegram.messenger.g0.L(6.0f));
                                kk0Var.y.setX(Math.min(tt0Var.getWidth() - kk0Var.y.getWidth(), f13 - org.telegram.messenger.g0.L(10.0f)) - tt0Var.getX());
                                f10 = 4.0f;
                                z10 = false;
                            } else {
                                kk0Var.D.setPivotX(r5.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f));
                                f10 = 4.0f;
                                kk0Var.y.setX(Math.max(org.telegram.messenger.g0.L(8.0f), (org.telegram.messenger.g0.L(4.0f) + f14) - kk0Var.y.getMeasuredWidth()) - tt0Var.getX());
                                z10 = true;
                            }
                            kk0Var.G = z10 ? ((kk0Var.y.getX() + kk0Var.y.getWidth()) - org.telegram.messenger.g0.L(6.0f)) - f14 : (kk0Var.y.getX() + org.telegram.messenger.g0.L(10.0f)) - f13;
                        }
                        float L5 = f18 + (kk0Var.F != null ? org.telegram.messenger.g0.L(21.0f) : 0);
                        if (kk0Var.y.getMeasuredHeight() + L5 > e5Var2.getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f)) {
                            kk0Var.D.setPivotY(r2.getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f));
                            kk0Var.y.setY(((f17 - org.telegram.messenger.g0.L(f10)) - kk0Var.y.getMeasuredHeight()) - tt0Var.getY());
                            z12 = true;
                        } else {
                            kk0Var.D.setPivotY(org.telegram.messenger.g0.L(6.0f));
                            kk0Var.y.setY(Math.min((e5Var2.getHeight() - kk0Var.y.getMeasuredHeight()) - org.telegram.messenger.g0.L(16.0f), L5) - tt0Var.getY());
                        }
                        l60 l60Var = kk0Var.x;
                        l60Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = l60Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.c = z10;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        break;
                    }
                }
                break;
            case 25:
                super.onLayout(z9, i7, i10, i11, i12);
                ct0.I0((ct0) this.b);
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        int i11;
        switch (this.a) {
            case 9:
                super.onMeasure(i7, i10);
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int childCount = getChildCount();
                int i12 = 0;
                if (!((org.telegram.ui.ActionBar.u1) this.b).K0) {
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
            case 12:
                if (View.MeasureSpec.getSize(i7) <= org.telegram.messenger.g0.L(260.0f)) {
                    super.onMeasure(i7, i10);
                    break;
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(320.0f), TLObject.FLAG_30), i10);
                    break;
                }
            case 17:
                int size = View.MeasureSpec.getSize(i7);
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L((((wt) this.b).A1 ? 22 : 0) + 84) + ((int) Math.min(r0.y1 / (r0.x1 / size), org.telegram.messenger.g0.q.y / 2)) + 1, TLObject.FLAG_30));
                break;
            case 18:
                hx hxVar = (hx) this.b;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((((View) hxVar.F.getParent()) != null ? (int) (r0.getMeasuredHeight() - hxVar.F.getY()) : org.telegram.messenger.g0.L(120.0f)) - hxVar.F.b1, TLObject.FLAG_30));
                break;
            case 19:
                hy hyVar = ((cy) this.b).Q;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.camera.q.y(8.0f, hyVar.D0.getMeasuredHeight() - hyVar.b1, 3) * 1.7f), TLObject.FLAG_30));
                break;
            case 25:
                ct0 ct0Var = (ct0) this.b;
                q1 q1Var = ct0Var.i1;
                int size2 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.m;
                getMeasuredWidth();
                int D = org.telegram.messenger.k5.D(54.0f, org.telegram.messenger.sd.g(), org.telegram.messenger.k5.C(56.0f, org.telegram.messenger.g0.L(56.0f), 1));
                int i14 = size2 / 5;
                if (D < i14 * 3) {
                    i11 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    i11 = i14 * 2;
                    if (D < size2) {
                        i11 -= size2 - D;
                    }
                }
                if (q1Var.getPaddingTop() != i11) {
                    ct0Var.n1 = true;
                    q1Var.setPadding(0, i11, 0, org.telegram.messenger.g0.L(8.0f));
                    ct0Var.n1 = false;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), TLObject.FLAG_30));
                break;
            case 28:
                pw0 pw0Var = (pw0) this.b;
                setPadding(pw0Var.n, pw0Var.h == 0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(6.66f), pw0Var.n, pw0Var.h == 0 ? org.telegram.messenger.g0.L(6.66f) : org.telegram.messenger.g0.L(8.0f));
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
            case 23:
                super.onSizeChanged(i7, i10, i11, i12);
                kk0 kk0Var = (kk0) this.b;
                ih.d.c(kk0Var.h, kk0Var.s);
                ViewGroup viewGroup = kk0Var.D;
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
            case 25:
                return !((ct0) this.b).I && super.onTouchEvent(motionEvent);
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
            case 22:
                qj0 qj0Var = (qj0) this.b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(qj0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(qj0Var.getMeasuredHeight(), TLObject.FLAG_30));
                    layout(0, 0, qj0Var.b1.getMeasuredWidth(), qj0Var.b1.getMeasuredHeight());
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 25:
                if (!((ct0) this.b).n1) {
                    super.requestLayout();
                    break;
                }
                break;
            case 27:
                if (!((zv0) this.b).X1) {
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
    public void setPressed(boolean z9) {
        switch (this.a) {
            case 29:
                super.setPressed(z9);
                ((org.telegram.ui.Components.ic) this.b).c(z9);
                break;
            default:
                super.setPressed(z9);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 0:
                super.setTranslationY(f10);
                k7 k7Var = (k7) this.b;
                j5 j5Var = k7Var.W1;
                if (j5Var != null && j5Var.getVisibility() == 0) {
                    k7Var.W1.invalidate();
                    break;
                }
                break;
            case 4:
                fi.va vaVar = (fi.va) this.b;
                if (getTranslationY() != f10 && vaVar.c1 != null) {
                    super.setTranslationY(f10);
                    vaVar.c1.y();
                    break;
                }
                break;
            case 10:
                super.setTranslationY(f10);
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) this.b;
                FrameLayout frameLayout = v2Var.E;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((-(v2Var.c.getHeight() - v2Var.b.getY())) + v2Var.s0);
                }
                v2Var.g0(f10);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        switch (this.a) {
            case 20:
                super.setVisibility(i7);
                ((q10) this.b).d.setVisibility(i7);
                break;
            case 28:
                pw0 pw0Var = (pw0) this.b;
                boolean z9 = getVisibility() == i7;
                super.setVisibility(i7);
                if (!z9) {
                    boolean z10 = i7 == 0;
                    if (pw0Var.e != null) {
                        for (int i10 = 0; i10 < pw0Var.e.getChildCount(); i10++) {
                            if (z10) {
                                ow0 ow0Var = (ow0) pw0Var.e.getChildAt(i10);
                                Drawable drawable = ow0Var.b;
                                if (drawable instanceof org.telegram.ui.Components.i5) {
                                    ((org.telegram.ui.Components.i5) drawable).a(ow0Var);
                                }
                                ow0Var.c = true;
                            } else {
                                ow0 ow0Var2 = (ow0) pw0Var.e.getChildAt(i10);
                                Drawable drawable2 = ow0Var2.b;
                                if (drawable2 instanceof org.telegram.ui.Components.i5) {
                                    ((org.telegram.ui.Components.i5) drawable2).n(ow0Var2);
                                }
                                ow0Var2.c = false;
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
    public /* synthetic */ e5(int i7, Context context, boolean z9) {
        super(context);
        this.a = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 29:
                super(context);
                this.b = new org.telegram.ui.Components.ic(this);
                break;
            default:
                lh.f fVar = new lh.f(context);
                this.b = fVar;
                addView(fVar, c8.ha.g());
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = 16;
        this.b = new zn[2];
        int i7 = 0;
        while (true) {
            zn[] znVarArr = (zn[]) this.b;
            if (i7 < znVarArr.length) {
                znVarArr[i7] = new zn(context, g6Var);
                addView(((zn[]) this.b)[i7], c8.ha.e(-1, -1, qs.E1));
                i7++;
            } else {
                znVarArr[0].setVisibility(0);
                ((zn[]) this.b)[1].setVisibility(8);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(Context context, String str, di.b bVar) {
        super(context);
        this.a = 3;
        int L = org.telegram.messenger.g0.L(12.0f);
        int i7 = org.telegram.ui.ActionBar.l6.j5;
        Drawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(i7, bVar)));
        org.telegram.ui.ActionBar.o6 K = org.telegram.ui.ActionBar.s6.K(0.06f, i7);
        setBackground(d02);
        org.telegram.ui.ActionBar.s6.j(this, d02, K, null, bVar);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, c8.ha.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
        this.b = j6Var;
        j6Var.b(0.6f, 450L, xq.h);
        j6Var.setTextSize(org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.ActionBar.s6.Y(j6Var, i7, bVar);
        j6Var.setScaleProperty(0.7f);
        j6Var.setGravity(17);
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        j6Var.setAllowCancel(true);
        f10.addView(j6Var, c8.ha.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.s6.U(textView, i7, bVar);
        textView.setGravity(17);
        f10.addView(textView, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(ch.o oVar, Context context) {
        super(context);
        this.a = 2;
        this.b = oVar;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(jt0 jt0Var, Context context) {
        super(context);
        this.a = 26;
        this.b = jt0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }
}
