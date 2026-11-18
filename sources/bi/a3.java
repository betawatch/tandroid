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
import hi.ta;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ef;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.messenger.qd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mo;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.qo;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.qx;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.w71;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.xe;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.Components.z10;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class a3 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    public qo a() {
        return ((qo[]) this.b)[0];
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
        qo[] qoVarArr = (qo[]) this.b;
        qo qoVar = qoVarArr[0];
        qo qoVar2 = qoVarArr[1];
        qoVarArr[0] = qoVar2;
        qoVarArr[1] = qoVar;
        qoVar2.n = true;
        qoVar2.setVisibility(0);
        qoVarArr[0].setScaleX(0.8f);
        qoVarArr[0].setScaleY(0.8f);
        qoVarArr[0].setAlpha(0.0f);
        qoVarArr[0].setTranslationY(org.telegram.messenger.g0.L(20.0f));
        ViewPropertyAnimator translationY = qoVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        lr lrVar = lr.h;
        n10.o(translationY, lrVar, 320L);
        qo qoVar3 = qoVarArr[1];
        qoVar3.n = false;
        qoVar3.setVisibility(0);
        qoVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setInterpolator(lrVar).setDuration(320L).withEndAction(new mo(qoVar3, 1)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        ArrayList arrayList;
        switch (this.a) {
            case 24:
                wk0 wk0Var = (wk0) this.b;
                if (wk0Var.r > 0.0f && wk0Var.e != null) {
                    wk0Var.f.reset();
                    float width = getWidth() / wk0Var.c.getWidth();
                    wk0Var.f.postScale(width, width);
                    wk0Var.d.setLocalMatrix(wk0Var.f);
                    wk0Var.e.setAlpha((int) (wk0Var.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), wk0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = wk0Var.F;
                if (drawable != null) {
                    drawable.setAlpha((int) (wk0Var.r * 255.0f));
                    canvas.save();
                    float f12 = wk0Var.I;
                    float f13 = wk0Var.H;
                    float f14 = wk0Var.r;
                    canvas.translate((f13 * f14) + f12, (0.0f * f14) + wk0Var.J);
                    float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(Math.min(wk0Var.K, wk0Var.L), Math.max(wk0Var.K, wk0Var.L), 0.75f), 1.0f, wk0Var.r);
                    canvas.scale(T1, T1, ((wk0Var.F.getBounds().width() / 2.0f) * wk0Var.K) + (-wk0Var.I) + wk0Var.F.getBounds().left, ((wk0Var.F.getBounds().height() / 2.0f) * wk0Var.L) + (-wk0Var.J) + wk0Var.F.getBounds().top);
                    fh.g gVar = wk0Var.G;
                    if (gVar != null) {
                        gVar.setAlpha((int) (wk0Var.r * 255.0f));
                        wk0Var.G.draw(canvas);
                    }
                    wk0Var.F.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 29:
                yw0 yw0Var = (yw0) this.b;
                ww0 ww0Var = yw0Var.c;
                if (ww0Var != null && ww0Var.getEditField() != null) {
                    org.telegram.messenger.g6 g6Var = yw0Var.W;
                    if (g6Var != null && g6Var.h) {
                        float x10 = yw0Var.c.getEditField().getX() + yw0Var.c.getEditField().getPaddingLeft();
                        org.telegram.messenger.g6 g6Var2 = yw0Var.W;
                        yw0Var.d0 = x10 + g6Var2.n;
                        yw0Var.a0 = g6Var2.r;
                    } else if (yw0Var.b0 != null && yw0Var.c0 != null) {
                        yw0Var.d0 = yw0Var.c.getEditField().getX() + yw0Var.c.getEditField().getPaddingLeft() + org.telegram.messenger.g0.L(12.0f);
                    }
                }
                boolean z10 = (!yw0Var.s || yw0Var.w || (arrayList = yw0Var.x) == null || arrayList.isEmpty() || yw0Var.y) ? false : true;
                float e10 = yw0Var.S.e(false, z10 ? 1.0f : 0.0f);
                float e11 = yw0Var.T.e(false, z10 ? 1.0f : 0.0f);
                float e12 = yw0Var.e0.e(false, yw0Var.d0);
                if (e10 <= 0.0f && e11 <= 0.0f && !z10) {
                    yw0Var.d.setVisibility(8);
                }
                yw0Var.P.rewind();
                float left = yw0Var.e.getLeft();
                int left2 = yw0Var.e.getLeft();
                ArrayList arrayList2 = yw0Var.x;
                float D = org.telegram.messenger.f3.D(44.0f, arrayList2 == null ? 0 : arrayList2.size(), left2);
                org.telegram.ui.Components.c6 c6Var = yw0Var.g0;
                float f15 = c6Var.c;
                boolean z11 = f15 <= 0.0f;
                float f16 = D - left;
                if (f16 > 0.0f) {
                    f15 = c6Var.e(z11, f16);
                }
                float e13 = yw0Var.f0.e(z11, (left + D) / 2.0f);
                ww0 ww0Var2 = yw0Var.c;
                if (ww0Var2 != null && ww0Var2.getEditField() != null) {
                    int i7 = yw0Var.h;
                    if (i7 == 0) {
                        yw0Var.d.setTranslationY(((((-yw0Var.c.getEditField().getHeight()) - yw0Var.c.getEditField().getScrollY()) + yw0Var.a0) + org.telegram.messenger.g0.L(5.0f)) - yw0Var.c.getEditFieldBottomOffset());
                    } else if (i7 == 1) {
                        yw0Var.d.setTranslationY((((((-yw0Var.getMeasuredHeight()) - yw0Var.c.getEditField().getScrollY()) + yw0Var.a0) + org.telegram.messenger.g0.L(20.0f)) + yw0Var.d.getHeight()) - yw0Var.c.getEditFieldBottomOffset());
                    }
                }
                float f17 = f15 / 4.0f;
                float f18 = f15 / 2.0f;
                int max = (int) Math.max((yw0Var.d0 - Math.max(f17, Math.min(f18, org.telegram.messenger.g0.L(66.0f)))) - yw0Var.e.getLeft(), 0.0f);
                if (yw0Var.e.getPaddingLeft() != max) {
                    int paddingLeft = yw0Var.e.getPaddingLeft() - max;
                    f10 = 1.0f;
                    yw0Var.e.setPadding(max, 0, 0, 0);
                    yw0Var.e.scrollBy(paddingLeft, 0);
                } else {
                    f10 = 1.0f;
                }
                yw0Var.e.setTranslationX(((int) Math.max((e12 - Math.max(f17, Math.min(f18, org.telegram.messenger.g0.L(66.0f)))) - yw0Var.e.getLeft(), 0.0f)) - max);
                float translationX = yw0Var.e.getTranslationX() + (e13 - f18) + yw0Var.e.getPaddingLeft();
                float translationY = yw0Var.e.getTranslationY() + yw0Var.e.getTop() + yw0Var.e.getPaddingTop() + (yw0Var.h == 0 ? 0 : org.telegram.messenger.g0.L(6.66f));
                float min = Math.min(yw0Var.e.getTranslationX() + e13 + f18 + yw0Var.e.getPaddingLeft(), yw0Var.getWidth() - yw0Var.d.getPaddingRight());
                float translationY2 = (yw0Var.e.getTranslationY() + yw0Var.e.getBottom()) - (yw0Var.h == 0 ? org.telegram.messenger.g0.L(6.66f) : 0);
                float min2 = Math.min(org.telegram.messenger.g0.L(9.0f), f18) * 2.0f;
                int i10 = yw0Var.h;
                if (i10 == 0) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    float f19 = translationY2 - min2;
                    float f20 = translationX + min2;
                    rectF.set(translationX, f19, f20, translationY2);
                    yw0Var.P.arcTo(rectF, 90.0f, 90.0f);
                    float f21 = translationY + min2;
                    rectF.set(translationX, translationY, f20, f21);
                    yw0Var.P.arcTo(rectF, -180.0f, 90.0f);
                    float f22 = min - min2;
                    rectF.set(f22, translationY, min, f21);
                    yw0Var.P.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f22, f19, min, translationY2);
                    yw0Var.P.arcTo(rectF, 0.0f, 90.0f);
                    yw0Var.P.lineTo(org.telegram.messenger.g0.L(8.66f) + e12, translationY2);
                    yw0Var.P.lineTo(e12, org.telegram.messenger.g0.L(6.66f) + translationY2);
                    yw0Var.P.lineTo(e12 - org.telegram.messenger.g0.L(8.66f), translationY2);
                } else if (i10 == 1) {
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float f23 = min - min2;
                    float f24 = translationY + min2;
                    rectF2.set(f23, translationY, min, f24);
                    yw0Var.P.arcTo(rectF2, -90.0f, 90.0f);
                    float f25 = translationY2 - min2;
                    rectF2.set(f23, f25, min, translationY2);
                    yw0Var.P.arcTo(rectF2, 0.0f, 90.0f);
                    float f26 = min2 + translationX;
                    rectF2.set(translationX, f25, f26, translationY2);
                    yw0Var.P.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, translationY, f26, f24);
                    yw0Var.P.arcTo(rectF2, -180.0f, 90.0f);
                    yw0Var.P.lineTo(e12 - org.telegram.messenger.g0.L(8.66f), translationY);
                    yw0Var.P.lineTo(e12, translationY - org.telegram.messenger.g0.L(6.66f));
                    yw0Var.P.lineTo(org.telegram.messenger.g0.L(8.66f) + e12, translationY);
                }
                yw0Var.P.close();
                if (yw0Var.R == null) {
                    Paint paint = new Paint(1);
                    yw0Var.R = paint;
                    paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.0f)));
                    yw0Var.R.setShadowLayer(org.telegram.messenger.g0.L(4.33f), 0.0f, org.telegram.messenger.g0.L(0.33333334f), 855638016);
                    yw0Var.R.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.tf, yw0Var.b));
                }
                if (e10 < f10) {
                    yw0Var.Q.rewind();
                    float L = yw0Var.h == 0 ? org.telegram.messenger.g0.L(6.66f) + translationY2 : translationY - org.telegram.messenger.g0.L(6.66f);
                    double d = e12 - translationX;
                    double d2 = L - translationY;
                    f11 = 255.0f;
                    double d10 = e12 - min;
                    double d11 = L - translationY2;
                    yw0Var.Q.addCircle(e12, L, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d2, 2.0d) + Math.pow(d, 2.0d), Math.pow(d2, 2.0d) + Math.pow(d10, 2.0d)), Math.max(Math.pow(d11, 2.0d) + Math.pow(d, 2.0d), Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d))))) * e10, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(yw0Var.Q);
                    canvas.saveLayerAlpha(0.0f, 0.0f, yw0Var.getWidth(), yw0Var.getHeight(), (int) (e10 * 255.0f), 31);
                } else {
                    f11 = 255.0f;
                }
                canvas.drawPath(yw0Var.P, yw0Var.R);
                canvas.save();
                canvas.clipPath(yw0Var.P);
                super.dispatchDraw(canvas);
                float f27 = yw0Var.g0.c;
                float f28 = yw0Var.f0.c;
                float f29 = f27 / 2.0f;
                float translationX2 = yw0Var.e.getTranslationX() + (f28 - f29) + yw0Var.e.getPaddingLeft();
                float paddingTop = yw0Var.e.getPaddingTop() + yw0Var.e.getTop();
                float min3 = Math.min(yw0Var.e.getTranslationX() + f28 + f29 + yw0Var.e.getPaddingLeft(), yw0Var.getWidth() - yw0Var.d.getPaddingRight());
                float bottom = yw0Var.e.getBottom();
                float e14 = yw0Var.U.e(false, yw0Var.e.canScrollHorizontally(-1) ? f10 : 0.0f);
                if (e14 > 0.0f) {
                    int i11 = (int) translationX2;
                    org.telegram.ui.ActionBar.n6.F4.setBounds(i11, (int) paddingTop, org.telegram.messenger.g0.L(32.0f) + i11, (int) bottom);
                    org.telegram.ui.ActionBar.n6.F4.setAlpha((int) (e14 * f11));
                    org.telegram.ui.ActionBar.n6.F4.draw(canvas);
                }
                float e15 = yw0Var.V.e(false, yw0Var.e.canScrollHorizontally(1) ? f10 : 0.0f);
                if (e15 > 0.0f) {
                    int i12 = (int) min3;
                    org.telegram.ui.ActionBar.n6.E4.setBounds(i12 - org.telegram.messenger.g0.L(32.0f), (int) paddingTop, i12, (int) bottom);
                    org.telegram.ui.ActionBar.n6.E4.setAlpha((int) (e15 * f11));
                    org.telegram.ui.ActionBar.n6.E4.draw(canvas);
                }
                canvas.restore();
                if (yw0Var.S.c < f10) {
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
                ((wk0) this.b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        bs0[] bs0VarArr;
        bs0 bs0Var;
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
                kl klVar = (kl) this.b;
                if (motionEvent.getActionMasked() != 0 || (motionEvent.getY() >= klVar.x0 && motionEvent.getY() <= klVar.y0)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 22:
                i90 i90Var = (i90) this.b;
                h90 h90Var = i90Var.S;
                if (h90Var != null && (bs0Var = (bs0VarArr = h90Var.n0)[0]) != null && bs0Var.h.getFastScroll() != null && bs0VarArr[0].h.getFastScroll().n) {
                    return i90Var.S.Z(motionEvent);
                }
                h90 h90Var2 = i90Var.S;
                if (h90Var2 == null || !h90Var2.P(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            case 27:
                qt0 qt0Var = (qt0) this.b;
                if (motionEvent.getActionMasked() != 0 || (!qt0Var.e0 && motionEvent.getY() < qt0Var.b0)) {
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
                ef efVar = s5Var.I;
                if (efVar == null || efVar.N <= 0 || o5Var.E == null) {
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
                kl klVar = (kl) this.b;
                canvas.clipRect(0, 0, measuredWidth2, measuredHeight2 - klVar.z0);
                boolean drawChild2 = klVar.y ? false : super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild2;
            case 27:
                qt0 qt0Var = (qt0) this.b;
                if (qt0Var.e0) {
                    dk0 dk0Var = qt0Var.E;
                    f10 = qt0Var.M.getX();
                    break;
                }
                f10 = 0.0f;
                int save = canvas.save();
                canvas.clipRect(Math.max(0.0f, f10), -qt0Var.T, Math.min(getWidth(), getWidth() + f10), Math.min(getHeight() + qt0Var.U, qt0Var.b0));
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
                gu guVar = (gu) this.b;
                w71 w71Var = guVar.n1;
                cu cuVar = guVar.m1;
                super.onDetachedFromWindow();
                try {
                    if (guVar.N0()) {
                        if (cuVar.getVisibility() != 0) {
                        }
                        if (w71Var.f() && !guVar.N0()) {
                            if (gu.S1 == guVar) {
                                gu.S1 = null;
                            }
                            w71Var.b();
                            break;
                        }
                    }
                    if (cuVar.getParent() != null) {
                        removeView(cuVar);
                        cuVar.stopLoading();
                        cuVar.loadUrl("about:blank");
                        cuVar.destroy();
                    }
                    if (w71Var.f()) {
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
                kl klVar = (kl) this.b;
                klVar.a0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, klVar.a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - klVar.z0, klVar.a0);
                break;
            case 26:
                jt0 jt0Var = (jt0) this.b;
                jt0Var.o1.setBounds(0, jt0Var.q1 - jt0Var.t0, getMeasuredWidth(), getMeasuredHeight());
                jt0Var.o1.draw(canvas);
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
                kl klVar = (kl) this.b;
                if (motionEvent.getActionMasked() != 0 || (motionEvent.getY() >= klVar.x0 && motionEvent.getY() <= klVar.y0)) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return false;
            case 26:
                jt0 jt0Var = (jt0) this.b;
                if (motionEvent.getAction() != 0 || jt0Var.q1 == 0 || motionEvent.getY() >= jt0Var.q1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                jt0Var.dismiss();
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
                if (((org.telegram.ui.ActionBar.u1) this.b).L0) {
                    View findViewWithTag = findViewWithTag(-3);
                    View findViewWithTag2 = findViewWithTag(-4);
                    View findViewWithTag3 = findViewWithTag(-2);
                    View findViewWithTag4 = findViewWithTag(-1);
                    int paddingLeft = getPaddingLeft();
                    int paddingRight = i17 - getPaddingRight();
                    int max = Math.max(0, ((paddingRight - paddingLeft) - org.telegram.messenger.g0.L(8.0f)) / 2);
                    boolean z12 = gd.a0;
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
                            if (gd.a0) {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout((i17 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i17 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                            view = childAt;
                        } else if (num.intValue() == -2) {
                            if (gd.a0) {
                                int paddingLeft2 = getPaddingLeft();
                                if (view != null) {
                                    paddingLeft2 = org.telegram.messenger.f3.C(8.0f, view.getMeasuredWidth(), paddingLeft2);
                                }
                                childAt.layout(paddingLeft2, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                int paddingRight2 = (i17 - getPaddingRight()) - childAt.getMeasuredWidth();
                                if (view != null) {
                                    paddingRight2 = n10.x(8.0f, view.getMeasuredWidth(), paddingRight2);
                                }
                                childAt.layout(paddingRight2, getPaddingTop(), childAt.getMeasuredWidth() + paddingRight2, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -4) {
                            View findViewWithTag5 = findViewWithTag(-3);
                            if (gd.a0) {
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
                            if (gd.a0) {
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
                z10 z10Var = (z10) this.b;
                a3 a3Var = z10Var.b;
                int[] iArr = z10Var.I;
                a3Var.getLocationOnScreen(iArr);
                z10Var.P = iArr[0];
                z10Var.O = iArr[1] - org.telegram.messenger.g0.L(25.0f);
                break;
            case 24:
                super.onLayout(z10, i7, i10, i11, i12);
                wk0 wk0Var = (wk0) this.b;
                a3 a3Var2 = wk0Var.s;
                au0 au0Var = wk0Var.w;
                Drawable drawable = wk0Var.F;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (wk0Var.y != null) {
                        float f11 = bounds.left;
                        float f12 = wk0Var.I;
                        float f13 = f11 + f12;
                        float f14 = bounds.right + f12;
                        float f15 = bounds.top;
                        float f16 = wk0Var.J;
                        float f17 = f15 + f16;
                        float f18 = bounds.bottom + f16;
                        boolean z13 = false;
                        if (wk0Var.M) {
                            f10 = 4.0f;
                            z11 = false;
                        } else {
                            if (f14 - r5.getMeasuredWidth() < org.telegram.messenger.g0.L(8.0f)) {
                                wk0Var.E.setPivotX(org.telegram.messenger.g0.L(6.0f));
                                wk0Var.y.setX(Math.min(au0Var.getWidth() - wk0Var.y.getWidth(), f13 - org.telegram.messenger.g0.L(10.0f)) - au0Var.getX());
                                f10 = 4.0f;
                                z11 = false;
                            } else {
                                wk0Var.E.setPivotX(r5.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f));
                                f10 = 4.0f;
                                wk0Var.y.setX(Math.max(org.telegram.messenger.g0.L(8.0f), (org.telegram.messenger.g0.L(4.0f) + f14) - wk0Var.y.getMeasuredWidth()) - au0Var.getX());
                                z11 = true;
                            }
                            wk0Var.H = z11 ? ((wk0Var.y.getX() + wk0Var.y.getWidth()) - org.telegram.messenger.g0.L(6.0f)) - f14 : (wk0Var.y.getX() + org.telegram.messenger.g0.L(10.0f)) - f13;
                        }
                        float L5 = f18 + (wk0Var.G != null ? org.telegram.messenger.g0.L(21.0f) : 0);
                        if (wk0Var.y.getMeasuredHeight() + L5 > a3Var2.getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f)) {
                            wk0Var.E.setPivotY(r2.getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f));
                            wk0Var.y.setY(((f17 - org.telegram.messenger.g0.L(f10)) - wk0Var.y.getMeasuredHeight()) - au0Var.getY());
                            z13 = true;
                        } else {
                            wk0Var.E.setPivotY(org.telegram.messenger.g0.L(6.0f));
                            wk0Var.y.setY(Math.min((a3Var2.getHeight() - wk0Var.y.getMeasuredHeight()) - org.telegram.messenger.g0.L(16.0f), L5) - au0Var.getY());
                        }
                        y60 y60Var = wk0Var.x;
                        y60Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = y60Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z13;
                        break;
                    }
                }
                break;
            case 26:
                super.onLayout(z10, i7, i10, i11, i12);
                jt0.J0((jt0) this.b);
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
                ((c3) this.b).L.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 10:
                super.onMeasure(i7, i10);
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int childCount = getChildCount();
                int i12 = 0;
                if (!((org.telegram.ui.ActionBar.u1) this.b).L0) {
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
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L((((gu) this.b).E1 ? 22 : 0) + 84) + ((int) Math.min(r0.C1 / (r0.B1 / size), org.telegram.messenger.g0.q.y / 2)) + 1, TLObject.FLAG_30));
                break;
            case 19:
                qx qxVar = (qx) this.b;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((((View) qxVar.G.getParent()) != null ? (int) (r0.getMeasuredHeight() - qxVar.G.getY()) : org.telegram.messenger.g0.L(120.0f)) - qxVar.G.c1, TLObject.FLAG_30));
                break;
            case 20:
                ry ryVar = ((my) this.b).R;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (n10.z(8.0f, ryVar.E0.getMeasuredHeight() - ryVar.c1, 3) * 1.7f), TLObject.FLAG_30));
                break;
            case 26:
                jt0 jt0Var = (jt0) this.b;
                di.b1 b1Var = jt0Var.m1;
                int size2 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.m;
                getMeasuredWidth();
                int D = org.telegram.messenger.f3.D(54.0f, qd.g(), org.telegram.messenger.f3.C(56.0f, org.telegram.messenger.g0.L(56.0f), 1));
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
                    jt0Var.r1 = true;
                    b1Var.setPadding(0, i11, 0, org.telegram.messenger.g0.L(8.0f));
                    jt0Var.r1 = false;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), TLObject.FLAG_30));
                break;
            case 29:
                yw0 yw0Var = (yw0) this.b;
                setPadding(yw0Var.n, yw0Var.h == 0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(6.66f), yw0Var.n, yw0Var.h == 0 ? org.telegram.messenger.g0.L(6.66f) : org.telegram.messenger.g0.L(8.0f));
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
                wk0 wk0Var = (wk0) this.b;
                ih.d.c(wk0Var.h, wk0Var.s);
                ViewGroup viewGroup = wk0Var.E;
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
                return !((jt0) this.b).J && super.onTouchEvent(motionEvent);
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
                ck0 ck0Var = (ck0) this.b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(ck0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ck0Var.getMeasuredHeight(), TLObject.FLAG_30));
                    layout(0, 0, ck0Var.c1.getMeasuredWidth(), ck0Var.c1.getMeasuredHeight());
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 26:
                if (!((jt0) this.b).r1) {
                    super.requestLayout();
                    break;
                }
                break;
            case 28:
                if (!((iw0) this.b).b2) {
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
                ta taVar = (ta) this.b;
                if (getTranslationY() != f10 && taVar.d1 != null) {
                    super.setTranslationY(f10);
                    taVar.d1.y();
                    break;
                }
                break;
            case 11:
                super.setTranslationY(f10);
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) this.b;
                FrameLayout frameLayout = x2Var.F;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((-(x2Var.c.getHeight() - x2Var.b.getY())) + x2Var.t0);
                }
                x2Var.g0(f10);
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
                ((z10) this.b).d.setVisibility(i7);
                break;
            case 29:
                yw0 yw0Var = (yw0) this.b;
                boolean z10 = getVisibility() == i7;
                super.setVisibility(i7);
                if (!z10) {
                    boolean z11 = i7 == 0;
                    if (yw0Var.e != null) {
                        for (int i10 = 0; i10 < yw0Var.e.getChildCount(); i10++) {
                            if (z11) {
                                xw0 xw0Var = (xw0) yw0Var.e.getChildAt(i10);
                                Drawable drawable = xw0Var.b;
                                if (drawable instanceof org.telegram.ui.Components.o5) {
                                    ((org.telegram.ui.Components.o5) drawable).a(xw0Var);
                                }
                                xw0Var.c = true;
                            } else {
                                xw0 xw0Var2 = (xw0) yw0Var.e.getChildAt(i10);
                                Drawable drawable2 = xw0Var2.b;
                                if (drawable2 instanceof org.telegram.ui.Components.o5) {
                                    ((org.telegram.ui.Components.o5) drawable2).n(xw0Var2);
                                }
                                xw0Var2.c = false;
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
    public /* synthetic */ a3(Context context, int i7) {
        super(context);
        this.a = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(Context context) {
        super(context);
        this.a = 7;
        lh.f fVar = new lh.f(context);
        this.b = fVar;
        addView(fVar, ma.g());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.a = 17;
        this.b = new qo[2];
        int i7 = 0;
        while (true) {
            qo[] qoVarArr = (qo[]) this.b;
            if (i7 < qoVarArr.length) {
                qoVarArr[i7] = new qo(context, i6Var);
                addView(((qo[]) this.b)[i7], ma.e(-1, -1, ks.E1));
                i7++;
            } else {
                qoVarArr[0].setVisibility(0);
                ((qo[]) this.b)[1].setVisibility(8);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(Context context, String str, fi.b bVar) {
        super(context);
        this.a = 4;
        int L = org.telegram.messenger.g0.L(12.0f);
        int i7 = org.telegram.ui.ActionBar.n6.j5;
        Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(i7, bVar)));
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.06f, i7);
        setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(this, d02, K, null, bVar);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        addView(g10, ma.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, true, true);
        this.b = n6Var;
        n6Var.b(0.6f, 450L, lr.h);
        n6Var.setTextSize(org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.ActionBar.u6.Y(n6Var, i7, bVar);
        n6Var.setScaleProperty(0.7f);
        n6Var.setGravity(17);
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        n6Var.setAllowCancel(true);
        g10.addView(n6Var, ma.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.u6.U(textView, i7, bVar);
        textView.setGravity(17);
        g10.addView(textView, ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(ch.p pVar, Context context) {
        super(context);
        this.a = 1;
        this.b = pVar;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(qt0 qt0Var, Context context) {
        super(context);
        this.a = 27;
        this.b = qt0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }
}
