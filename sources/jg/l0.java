package jg;

import android.content.Context;
import android.graphics.Bitmap;
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
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.ff;
import org.telegram.messenger.h6;
import org.telegram.messenger.m5;
import org.telegram.messenger.od;
import org.telegram.messenger.ze;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.r5;
import org.telegram.ui.Cells.v5;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.ie;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.n81;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.ts0;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.ux;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.yk;
import org.telegram.ui.Components.z60;
import org.telegram.ui.cr0;
import w7.b6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class l0 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    public io a() {
        return ((io[]) this.b)[0];
    }

    public void b() {
        io[] ioVarArr = (io[]) this.b;
        io ioVar = ioVarArr[0];
        io ioVar2 = ioVarArr[1];
        ioVarArr[0] = ioVar2;
        ioVarArr[1] = ioVar;
        ioVar2.n = true;
        ioVar2.setVisibility(0);
        ioVarArr[0].setScaleX(0.8f);
        ioVarArr[0].setScaleY(0.8f);
        ioVarArr[0].setAlpha(0.0f);
        ioVarArr[0].setTranslationY(org.telegram.messenger.i0.L(20.0f));
        ViewPropertyAnimator translationY = ioVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        gr grVar = gr.h;
        a30.m(translationY, grVar, 320L);
        io ioVar3 = ioVarArr[1];
        ioVar3.n = false;
        ioVar3.setVisibility(0);
        ioVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.i0.L(20.0f)).setInterpolator(grVar).setDuration(320L).withEndAction(new ho(ioVar3, 0)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        ArrayList arrayList;
        switch (this.a) {
            case 3:
                d3 d3Var = (d3) this.b;
                if (d3Var.D > 0.0f && d3Var.s != null) {
                    d3Var.w.reset();
                    float width = getWidth() / d3Var.n.getWidth();
                    d3Var.w.postScale(width, width);
                    d3Var.r.setLocalMatrix(d3Var.w);
                    d3Var.s.setAlpha((int) (d3Var.D * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), d3Var.s);
                }
                super.dispatchDraw(canvas);
                break;
            case 22:
                ol0 ol0Var = (ol0) this.b;
                if (ol0Var.r > 0.0f && ol0Var.e != null) {
                    ol0Var.f.reset();
                    float width2 = getWidth() / ol0Var.c.getWidth();
                    ol0Var.f.postScale(width2, width2);
                    ol0Var.d.setLocalMatrix(ol0Var.f);
                    ol0Var.e.setAlpha((int) (ol0Var.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ol0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = ol0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (ol0Var.r * 255.0f));
                    canvas.save();
                    float f11 = ol0Var.H;
                    float f12 = ol0Var.G;
                    float f13 = ol0Var.r;
                    canvas.translate((f12 * f13) + f11, (0.0f * f13) + ol0Var.I);
                    float T1 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.T1(Math.min(ol0Var.J, ol0Var.K), Math.max(ol0Var.J, ol0Var.K), 0.75f), 1.0f, ol0Var.r);
                    canvas.scale(T1, T1, ((ol0Var.E.getBounds().width() / 2.0f) * ol0Var.J) + (-ol0Var.H) + ol0Var.E.getBounds().left, ((ol0Var.E.getBounds().height() / 2.0f) * ol0Var.K) + (-ol0Var.I) + ol0Var.E.getBounds().top);
                    vg.f fVar = ol0Var.F;
                    if (fVar != null) {
                        fVar.setAlpha((int) (ol0Var.r * 255.0f));
                        ol0Var.F.draw(canvas);
                    }
                    ol0Var.E.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 27:
                tx0 tx0Var = (tx0) this.b;
                rx0 rx0Var = tx0Var.c;
                if (rx0Var != null && rx0Var.getEditField() != null) {
                    h6 h6Var = tx0Var.V;
                    if (h6Var != null && h6Var.h) {
                        float x10 = tx0Var.c.getEditField().getX() + tx0Var.c.getEditField().getPaddingLeft();
                        h6 h6Var2 = tx0Var.V;
                        tx0Var.c0 = x10 + h6Var2.n;
                        tx0Var.W = h6Var2.r;
                    } else if (tx0Var.a0 != null && tx0Var.b0 != null) {
                        tx0Var.c0 = tx0Var.c.getEditField().getX() + tx0Var.c.getEditField().getPaddingLeft() + org.telegram.messenger.i0.L(12.0f);
                    }
                }
                boolean z10 = (!tx0Var.s || tx0Var.w || (arrayList = tx0Var.x) == null || arrayList.isEmpty() || tx0Var.y) ? false : true;
                float e = tx0Var.R.e(false, z10 ? 1.0f : 0.0f);
                float e7 = tx0Var.S.e(false, z10 ? 1.0f : 0.0f);
                float e10 = tx0Var.d0.e(false, tx0Var.c0);
                if (e <= 0.0f && e7 <= 0.0f && !z10) {
                    tx0Var.d.setVisibility(8);
                }
                tx0Var.O.rewind();
                float left = tx0Var.e.getLeft();
                int left2 = tx0Var.e.getLeft();
                ArrayList arrayList2 = tx0Var.x;
                float D = m5.D(44.0f, arrayList2 == null ? 0 : arrayList2.size(), left2);
                t5 t5Var = tx0Var.f0;
                float f14 = t5Var.c;
                boolean z11 = f14 <= 0.0f;
                float f15 = D - left;
                if (f15 > 0.0f) {
                    f14 = t5Var.e(z11, f15);
                }
                float e11 = tx0Var.e0.e(z11, (left + D) / 2.0f);
                rx0 rx0Var2 = tx0Var.c;
                if (rx0Var2 != null && rx0Var2.getEditField() != null) {
                    int i10 = tx0Var.h;
                    if (i10 == 0) {
                        tx0Var.d.setTranslationY(((-tx0Var.c.getEditField().getHeight()) - tx0Var.c.getEditField().getScrollY()) + tx0Var.W + org.telegram.messenger.i0.L(5.0f));
                    } else if (i10 == 1) {
                        tx0Var.d.setTranslationY(((-tx0Var.getMeasuredHeight()) - tx0Var.c.getEditField().getScrollY()) + tx0Var.W + org.telegram.messenger.i0.L(20.0f) + tx0Var.d.getHeight());
                    }
                }
                float f16 = f14 / 4.0f;
                float f17 = f14 / 2.0f;
                int max = (int) Math.max((tx0Var.c0 - Math.max(f16, Math.min(f17, org.telegram.messenger.i0.L(66.0f)))) - tx0Var.e.getLeft(), 0.0f);
                if (tx0Var.e.getPaddingLeft() != max) {
                    int paddingLeft = tx0Var.e.getPaddingLeft() - max;
                    f7 = 1.0f;
                    tx0Var.e.setPadding(max, 0, 0, 0);
                    tx0Var.e.scrollBy(paddingLeft, 0);
                } else {
                    f7 = 1.0f;
                }
                tx0Var.e.setTranslationX(((int) Math.max((e10 - Math.max(f16, Math.min(f17, org.telegram.messenger.i0.L(66.0f)))) - tx0Var.e.getLeft(), 0.0f)) - max);
                float translationX = tx0Var.e.getTranslationX() + (e11 - f17) + tx0Var.e.getPaddingLeft();
                float translationY = tx0Var.e.getTranslationY() + tx0Var.e.getTop() + tx0Var.e.getPaddingTop() + (tx0Var.h == 0 ? 0 : org.telegram.messenger.i0.L(6.66f));
                float min = Math.min(tx0Var.e.getTranslationX() + e11 + f17 + tx0Var.e.getPaddingLeft(), tx0Var.getWidth() - tx0Var.d.getPaddingRight());
                float translationY2 = (tx0Var.e.getTranslationY() + tx0Var.e.getBottom()) - (tx0Var.h == 0 ? org.telegram.messenger.i0.L(6.66f) : 0);
                float min2 = Math.min(org.telegram.messenger.i0.L(9.0f), f17) * 2.0f;
                int i11 = tx0Var.h;
                if (i11 == 0) {
                    RectF rectF = org.telegram.messenger.i0.P;
                    float f18 = translationY2 - min2;
                    float f19 = translationX + min2;
                    rectF.set(translationX, f18, f19, translationY2);
                    tx0Var.O.arcTo(rectF, 90.0f, 90.0f);
                    float f20 = translationY + min2;
                    rectF.set(translationX, translationY, f19, f20);
                    tx0Var.O.arcTo(rectF, -180.0f, 90.0f);
                    float f21 = min - min2;
                    rectF.set(f21, translationY, min, f20);
                    tx0Var.O.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f21, f18, min, translationY2);
                    tx0Var.O.arcTo(rectF, 0.0f, 90.0f);
                    tx0Var.O.lineTo(org.telegram.messenger.i0.L(8.66f) + e10, translationY2);
                    tx0Var.O.lineTo(e10, org.telegram.messenger.i0.L(6.66f) + translationY2);
                    tx0Var.O.lineTo(e10 - org.telegram.messenger.i0.L(8.66f), translationY2);
                } else if (i11 == 1) {
                    RectF rectF2 = org.telegram.messenger.i0.P;
                    float f22 = min - min2;
                    float f23 = translationY + min2;
                    rectF2.set(f22, translationY, min, f23);
                    tx0Var.O.arcTo(rectF2, -90.0f, 90.0f);
                    float f24 = translationY2 - min2;
                    rectF2.set(f22, f24, min, translationY2);
                    tx0Var.O.arcTo(rectF2, 0.0f, 90.0f);
                    float f25 = min2 + translationX;
                    rectF2.set(translationX, f24, f25, translationY2);
                    tx0Var.O.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, translationY, f25, f23);
                    tx0Var.O.arcTo(rectF2, -180.0f, 90.0f);
                    tx0Var.O.lineTo(e10 - org.telegram.messenger.i0.L(8.66f), translationY);
                    tx0Var.O.lineTo(e10, translationY - org.telegram.messenger.i0.L(6.66f));
                    tx0Var.O.lineTo(org.telegram.messenger.i0.L(8.66f) + e10, translationY);
                }
                tx0Var.O.close();
                if (tx0Var.Q == null) {
                    Paint paint = new Paint(1);
                    tx0Var.Q = paint;
                    paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(2.0f)));
                    tx0Var.Q.setShadowLayer(org.telegram.messenger.i0.L(4.33f), 0.0f, org.telegram.messenger.i0.L(0.33333334f), 855638016);
                    tx0Var.Q.setColor(t6.w0(t6.qf, tx0Var.b));
                }
                if (e < f7) {
                    tx0Var.P.rewind();
                    float L = tx0Var.h == 0 ? org.telegram.messenger.i0.L(6.66f) + translationY2 : translationY - org.telegram.messenger.i0.L(6.66f);
                    double d = e10 - translationX;
                    double d10 = L - translationY;
                    f10 = 255.0f;
                    double d11 = e10 - min;
                    double d12 = L - translationY2;
                    tx0Var.P.addCircle(e10, L, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d10, 2.0d) + Math.pow(d, 2.0d), Math.pow(d10, 2.0d) + Math.pow(d11, 2.0d)), Math.max(Math.pow(d12, 2.0d) + Math.pow(d, 2.0d), Math.pow(d12, 2.0d) + Math.pow(d11, 2.0d))))) * e, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(tx0Var.P);
                    canvas.saveLayerAlpha(0.0f, 0.0f, tx0Var.getWidth(), tx0Var.getHeight(), (int) (e * 255.0f), 31);
                } else {
                    f10 = 255.0f;
                }
                canvas.drawPath(tx0Var.O, tx0Var.Q);
                canvas.save();
                canvas.clipPath(tx0Var.O);
                super.dispatchDraw(canvas);
                float f26 = tx0Var.f0.c;
                float f27 = tx0Var.e0.c;
                float f28 = f26 / 2.0f;
                float translationX2 = tx0Var.e.getTranslationX() + (f27 - f28) + tx0Var.e.getPaddingLeft();
                float paddingTop = tx0Var.e.getPaddingTop() + tx0Var.e.getTop();
                float min3 = Math.min(tx0Var.e.getTranslationX() + f27 + f28 + tx0Var.e.getPaddingLeft(), tx0Var.getWidth() - tx0Var.d.getPaddingRight());
                float bottom = tx0Var.e.getBottom();
                float e12 = tx0Var.T.e(false, tx0Var.e.canScrollHorizontally(-1) ? f7 : 0.0f);
                if (e12 > 0.0f) {
                    int i12 = (int) translationX2;
                    t6.F4.setBounds(i12, (int) paddingTop, org.telegram.messenger.i0.L(32.0f) + i12, (int) bottom);
                    t6.F4.setAlpha((int) (e12 * f10));
                    t6.F4.draw(canvas);
                }
                float e13 = tx0Var.U.e(false, tx0Var.e.canScrollHorizontally(1) ? f7 : 0.0f);
                if (e13 > 0.0f) {
                    int i13 = (int) min3;
                    t6.E4.setBounds(i13 - org.telegram.messenger.i0.L(32.0f), (int) paddingTop, i13, (int) bottom);
                    t6.E4.setAlpha((int) (e13 * f10));
                    t6.E4.draw(canvas);
                }
                canvas.restore();
                if (tx0Var.R.c < f7) {
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
            case 23:
                ie ieVar = (ie) this.b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && ieVar.isShowing()) {
                    ieVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 3:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((d3) this.b).onBackPressed();
                return true;
            case 22:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((ol0) this.b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ts0[] ts0VarArr;
        ts0 ts0Var;
        switch (this.a) {
            case 13:
                if (motionEvent.getY() > getMeasuredHeight() - ((bl) this.b).y0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 20:
                n90 n90Var = (n90) this.b;
                m90 m90Var = n90Var.R;
                if (m90Var != null && (ts0Var = (ts0VarArr = m90Var.m0)[0]) != null && ts0Var.h.getFastScroll() != null && ts0VarArr[0].h.getFastScroll().n) {
                    return n90Var.R.Y(motionEvent);
                }
                m90 m90Var2 = n90Var.R;
                if (m90Var2 == null || !m90Var2.O(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            case 25:
                lu0 lu0Var = (lu0) this.b;
                if (motionEvent.getActionMasked() != 0 || (!lu0Var.d0 && motionEvent.getY() < lu0Var.a0)) {
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
            case 28:
                float a2 = ((dc) this.b).a(0.03f);
                canvas.save();
                canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
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
    public boolean drawChild(Canvas canvas, View view, long j10) {
        float measuredWidth;
        float measuredHeight;
        int i10;
        float f7;
        switch (this.a) {
            case 9:
                v5 v5Var = (v5) this.b;
                r5 r5Var = v5Var.a;
                if (v5Var.M == null || view != r5Var) {
                    return super.drawChild(canvas, view, j10);
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                if (!v5Var.N) {
                    return drawChild;
                }
                Rect rect = v5.a0;
                v5Var.M.c(canvas, v5Var.b, r5Var.getMeasuredWidth(), r5Var.getMeasuredHeight(), 1.0f, false);
                ff ffVar = v5Var.G;
                if (ffVar == null || ffVar.N <= 0 || r5Var.D == null) {
                    return drawChild;
                }
                Path path = r5Var.E;
                if (path == null) {
                    r5Var.E = new Path();
                } else {
                    path.rewind();
                }
                int i11 = r5Var.c;
                if (i11 == -1 || (i10 = r5Var.d) == -1) {
                    measuredWidth = r5Var.getMeasuredWidth();
                    measuredHeight = r5Var.getMeasuredHeight();
                } else {
                    measuredWidth = i11;
                    measuredHeight = i10;
                }
                float L = r5Var.D.c + org.telegram.messenger.i0.L(18.0f);
                float L2 = org.telegram.messenger.i0.L(28.0f);
                float f10 = (measuredWidth - L) / 2.0f;
                float f11 = measuredHeight / 2.0f;
                RectF rectF = org.telegram.messenger.i0.P;
                float f12 = L2 / 2.0f;
                rectF.set(f10, f11 - f12, L + f10, f11 + f12);
                r5Var.E.addRoundRect(rectF, f12, f12, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(r5Var.E);
                ImageReceiver imageReceiver = r5Var.b;
                if (imageReceiver != null && r5Var.s) {
                    imageReceiver.o1 = r5Var.F;
                    float alpha = imageReceiver.getAlpha();
                    r5Var.b.setAlpha(1.0f);
                    r5Var.b.h(canvas, null);
                    r5Var.b.setAlpha(alpha);
                    r5Var.b.o1 = null;
                }
                r5Var.D.c(f10 + org.telegram.messenger.i0.L(9.0f), f11, 1.0f, -1, canvas);
                canvas.restore();
                return drawChild;
            case 13:
                canvas.save();
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                bl blVar = (bl) this.b;
                canvas.clipRect(0, 0, measuredWidth2, measuredHeight2 - blVar.y0);
                boolean drawChild2 = blVar.E ? false : super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            case 25:
                lu0 lu0Var = (lu0) this.b;
                if (lu0Var.d0) {
                    vk0 vk0Var = lu0Var.D;
                    f7 = lu0Var.L.getX();
                    break;
                }
                f7 = 0.0f;
                int save = canvas.save();
                canvas.clipRect(Math.max(0.0f, f7), -lu0Var.S, Math.min(getWidth(), getWidth() + f7), Math.min(getHeight() + lu0Var.T, lu0Var.a0));
                canvas.translate(f7, 0.0f);
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restoreToCount(save);
                return drawChild3;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        switch (this.a) {
            case 8:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 16:
                hu huVar = (hu) this.b;
                n81 n81Var = huVar.j1;
                cu cuVar = huVar.i1;
                super.onDetachedFromWindow();
                try {
                    jf0 jf0Var = jf0.p0;
                    if (jf0Var.P) {
                        if (cuVar.getVisibility() != 0) {
                        }
                        if (n81Var.f() && !jf0Var.P) {
                            if (hu.J1 == huVar) {
                                hu.J1 = null;
                            }
                            n81Var.b();
                            break;
                        }
                    }
                    if (cuVar.getParent() != null) {
                        removeView(cuVar);
                        cuVar.stopLoading();
                        cuVar.loadUrl("about:blank");
                        cuVar.destroy();
                    }
                    if (n81Var.f()) {
                    }
                } catch (Exception e) {
                    f8.g(e, true);
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
            case 0:
                super.onDraw(canvas);
                cr0 cr0Var = (cr0) this.b;
                Paint paint = cr0Var.k1;
                t1 t1Var = cr0Var.d1;
                paint.setAlpha((int) ((1.0f - cr0Var.m1) * t1Var.getAlpha() * 102.0f));
                RectF rectF = org.telegram.messenger.i0.P;
                t1Var.b(rectF);
                float translationY = t1Var.getTranslationY() + cr0Var.L0.getTranslationY() + t1Var.getTop() + r4.getTop();
                float f7 = rectF.left;
                a2 a2Var = cr0Var.e1;
                rectF.set(org.telegram.messenger.i0.T1(f7, a2Var.getLeft(), cr0Var.m1), org.telegram.messenger.i0.T1(rectF.top + translationY, a2Var.getTop() - a2Var.getTranslationY(), cr0Var.m1), org.telegram.messenger.i0.T1(rectF.right, a2Var.getRight(), cr0Var.m1), org.telegram.messenger.i0.T1(translationY + rectF.bottom, a2Var.getBottom() - a2Var.getTranslationY(), cr0Var.m1));
                float L = org.telegram.messenger.i0.L(org.telegram.messenger.i0.W1(cr0Var.m1, 32, 16));
                Paint paint2 = cr0Var.l1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * cr0Var.m1));
                canvas.drawRoundRect(rectF, L, L, paint2);
                paint2.setAlpha(alpha);
                canvas.drawRoundRect(rectF, L, L, paint);
                break;
            case 1:
                e2 e2Var = (e2) this.b;
                Rect rect = e2Var.E0;
                Rect rect2 = e2Var.D0;
                Paint paint3 = e2Var.F0;
                qu0 qu0Var = e2Var.v0;
                Bitmap bitmap = e2Var.A0;
                if (e2Var.z0 != null) {
                    canvas.save();
                    float d = e2Var.u0.d(e2Var.t0);
                    canvas.scale(1.0f - (d * 2.0f), 1.0f, qu0Var.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, m5.A(1.0f, d, 4.0f * d, 0.25f));
                    float d10 = e2Var.y0.d(e2Var.x0);
                    if (!e2Var.x0) {
                        canvas.save();
                        paint3.setAlpha((int) ((1.0f - d10) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(r6.getWidth() / 2.0f, r6.getHeight() / 2.0f);
                            canvas.rotate(e2Var.w0);
                            float max = Math.max(qu0Var.a / bitmap.getWidth(), qu0Var.b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (e2Var.G0 != null) {
                                canvas.rotate(-e2Var.getOrientation());
                                int contentWidth = e2Var.getContentWidth();
                                int contentHeight = e2Var.getContentHeight();
                                if (((e2Var.getOrientation() + e2Var.G0.k) / 90) % 2 == 1) {
                                    contentWidth = e2Var.getContentHeight();
                                    contentHeight = e2Var.getContentWidth();
                                }
                                ze zeVar = e2Var.G0;
                                float f10 = zeVar.e;
                                float f11 = zeVar.f;
                                float f12 = contentWidth;
                                float f13 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f10) / 2.0f, ((-contentHeight) * f11) / 2.0f, (f10 * f12) / 2.0f, (f11 * f13) / 2.0f);
                                float f14 = e2Var.G0.c;
                                canvas.scale(f14, f14);
                                ze zeVar2 = e2Var.G0;
                                canvas.translate(zeVar2.a * f12, zeVar2.b * f13);
                                canvas.rotate(e2Var.G0.d + r4.k);
                                if (e2Var.G0.l) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(e2Var.getOrientation());
                            }
                            canvas.translate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
                            rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            canvas.drawBitmap(bitmap, rect2, rect, paint3);
                        }
                        canvas.restore();
                    }
                    canvas.restore();
                    break;
                }
                break;
            case 2:
                w2 w2Var = (w2) this.b;
                ImageReceiver imageReceiver = w2Var.x0;
                qu0 qu0Var2 = w2Var.v0;
                if (w2Var.w0 != null) {
                    canvas.save();
                    float d11 = w2Var.u0.d(w2Var.t0);
                    canvas.scale(1.0f - (d11 * 2.0f), 1.0f, qu0Var2.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, m5.A(1.0f, d11, 4.0f * d11, 0.25f));
                    imageReceiver.y0(0.0f, 0.0f, (int) qu0Var2.a, (int) qu0Var2.b);
                    imageReceiver.h(canvas, null);
                    canvas.restore();
                    break;
                }
                break;
            case 11:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.g) this.b) == null) {
                    org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
                    this.b = gVar;
                    gVar.k = false;
                    gVar.m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.g) this.b).f = getMeasuredWidth();
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.g) this.b).a(org.telegram.messenger.i0.L(4.0f), canvas, rectF2, null);
                invalidate();
                break;
            case 12:
                ((o9) this.b).e.a(canvas);
                break;
            case 13:
                bl blVar = (bl) this.b;
                blVar.b0.setColor(t6.w0(t6.h5, blVar.a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - blVar.y0, blVar.b0);
                break;
            case 24:
                eu0 eu0Var = (eu0) this.b;
                eu0Var.k1.setBounds(0, eu0Var.m1 - eu0Var.s0, getMeasuredWidth(), getMeasuredHeight());
                eu0Var.k1.draw(canvas);
                break;
            case 29:
                b61 b61Var = (b61) this.b;
                b61Var.i1.setBounds(0, (int) ((b61Var.n1 - b61Var.s0) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                b61Var.i1.draw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        kg.w0 w0Var;
        kg.w0 w0Var2;
        switch (this.a) {
            case 4:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                kg.x0 x0Var = (kg.x0) this.b;
                CharSequence text = (!x0Var.r || (w0Var2 = x0Var.h) == null) ? null : w0Var2.getText();
                if (text == null && (w0Var = x0Var.f) != null) {
                    text = w0Var.getText();
                }
                if (text != null) {
                    accessibilityNodeInfo.setText(text);
                    if (getContentDescription() == null) {
                        accessibilityNodeInfo.setContentDescription(text);
                        break;
                    }
                }
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 13:
                if (motionEvent.getY() > getMeasuredHeight() - ((bl) this.b).y0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 24:
                eu0 eu0Var = (eu0) this.b;
                if (motionEvent.getAction() != 0 || eu0Var.m1 == 0 || motionEvent.getY() >= eu0Var.m1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                eu0Var.dismiss();
                return true;
            case 29:
                b61 b61Var = (b61) this.b;
                if (motionEvent.getAction() != 0 || b61Var.n1 == 0 || motionEvent.getY() >= b61Var.n1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                b61Var.dismiss();
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int left;
        int measuredWidth;
        int measuredWidth2;
        int measuredHeight;
        int L;
        int measuredHeight2;
        int i16;
        int i17;
        float f7;
        boolean z11;
        switch (this.a) {
            case 7:
                int childCount = getChildCount();
                int i18 = i12 - i10;
                int i19 = -1;
                if (((org.telegram.ui.ActionBar.x1) this.b).M0) {
                    View findViewWithTag = findViewWithTag(-3);
                    View findViewWithTag2 = findViewWithTag(-4);
                    View findViewWithTag3 = findViewWithTag(-2);
                    View findViewWithTag4 = findViewWithTag(-1);
                    int paddingLeft = getPaddingLeft();
                    int paddingRight = i18 - getPaddingRight();
                    int max = Math.max(0, ((paddingRight - paddingLeft) - org.telegram.messenger.i0.L(8.0f)) / 2);
                    boolean z12 = dd.X;
                    int i20 = z12 ? paddingRight - max : paddingLeft;
                    if (!z12) {
                        paddingLeft = paddingRight - max;
                    }
                    int paddingTop = getPaddingTop();
                    int L2 = org.telegram.messenger.i0.L(44.0f) + paddingTop;
                    if (findViewWithTag != null) {
                        findViewWithTag.layout(i20, paddingTop, i20 + max, org.telegram.messenger.i0.L(40.0f) + paddingTop);
                    }
                    if (findViewWithTag2 != null) {
                        findViewWithTag2.layout(paddingLeft, paddingTop, paddingLeft + max, org.telegram.messenger.i0.L(40.0f) + paddingTop);
                    }
                    if (findViewWithTag3 != null) {
                        findViewWithTag3.layout(i20, L2, i20 + max, org.telegram.messenger.i0.L(40.0f) + L2);
                    }
                    if (findViewWithTag4 != null) {
                        findViewWithTag4.layout(paddingLeft, L2, max + paddingLeft, org.telegram.messenger.i0.L(40.0f) + L2);
                        break;
                    }
                } else {
                    View view = null;
                    int i21 = 0;
                    while (i21 < childCount) {
                        View childAt = getChildAt(i21);
                        Integer num = (Integer) childAt.getTag();
                        if (num == null) {
                            int measuredWidth3 = childAt.getMeasuredWidth();
                            int measuredHeight3 = childAt.getMeasuredHeight();
                            if (view != null) {
                                i15 = ((view.getMeasuredWidth() - measuredWidth3) / 2) + view.getLeft();
                                i14 = ((view.getMeasuredHeight() - measuredHeight3) / 2) + view.getTop();
                            } else {
                                i14 = 0;
                                i15 = 0;
                            }
                            childAt.layout(i15, i14, measuredWidth3 + i15, measuredHeight3 + i14);
                        } else if (num.intValue() == i19) {
                            if (dd.X) {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout((i18 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i18 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                            view = childAt;
                        } else if (num.intValue() == -2) {
                            if (dd.X) {
                                int paddingLeft2 = getPaddingLeft();
                                if (view != null) {
                                    paddingLeft2 = m5.C(8.0f, view.getMeasuredWidth(), paddingLeft2);
                                }
                                childAt.layout(paddingLeft2, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                int paddingRight2 = (i18 - getPaddingRight()) - childAt.getMeasuredWidth();
                                if (view != null) {
                                    paddingRight2 = a30.w(8.0f, view.getMeasuredWidth(), paddingRight2);
                                }
                                childAt.layout(paddingRight2, getPaddingTop(), childAt.getMeasuredWidth() + paddingRight2, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -4) {
                            View findViewWithTag5 = findViewWithTag(-3);
                            if (dd.X) {
                                if (findViewWithTag5 == null) {
                                    left = i18 - getPaddingRight();
                                    measuredWidth = childAt.getMeasuredWidth();
                                } else {
                                    left = findViewWithTag5.getLeft() - org.telegram.messenger.i0.L(8.0f);
                                    measuredWidth = childAt.getMeasuredWidth();
                                }
                                int i22 = left - measuredWidth;
                                childAt.layout(i22, getPaddingTop(), childAt.getMeasuredWidth() + i22, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                int paddingLeft3 = findViewWithTag5 == null ? getPaddingLeft() : findViewWithTag5.getRight() + org.telegram.messenger.i0.L(8.0f);
                                childAt.layout(paddingLeft3, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft3, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -3) {
                            if (dd.X) {
                                childAt.layout((i18 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i18 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        }
                        i21++;
                        i19 = -1;
                    }
                    break;
                }
                break;
            case 10:
                super.onLayout(z10, i10, i11, i12, i13);
                m20 m20Var = (m20) this.b;
                m20Var.setTranslationY((getMeasuredHeight() * 0.28f) - (m20Var.getMeasuredWidth() / 2.0f));
                m20Var.setTranslationX((getMeasuredWidth() * 0.82f) - (m20Var.getMeasuredWidth() / 2.0f));
                break;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                int L3 = org.telegram.messenger.i0.L(36.0f);
                int i23 = ((i12 - i10) - L3) / 2;
                int i24 = ((i13 - i11) - L3) / 2;
                ((o9) this.b).e.f(i23, i24, i23 + L3, L3 + i24);
                break;
            case 14:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                if (getMeasuredWidth() == org.telegram.messenger.i0.L(126.0f)) {
                    measuredWidth2 = getMeasuredWidth() / 2;
                    measuredHeight = getMeasuredHeight() / 2;
                    i16 = getMeasuredWidth() / 2;
                    int i25 = measuredHeight / 2;
                    measuredHeight2 = org.telegram.messenger.i0.L(17.0f) + measuredHeight + i25;
                    i17 = i25 - org.telegram.messenger.i0.L(17.0f);
                    L = i16;
                } else {
                    measuredWidth2 = getMeasuredWidth() / 2;
                    measuredHeight = (getMeasuredHeight() / 2) - org.telegram.messenger.i0.L(13.0f);
                    int i26 = measuredWidth2 / 2;
                    int L4 = measuredWidth2 + i26 + org.telegram.messenger.i0.L(17.0f);
                    L = i26 - org.telegram.messenger.i0.L(17.0f);
                    measuredHeight2 = (getMeasuredHeight() / 2) - org.telegram.messenger.i0.L(13.0f);
                    i16 = L4;
                    i17 = measuredHeight2;
                }
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.q0.getMeasuredHeight()) - org.telegram.messenger.i0.L(12.0f);
                if (getMeasuredWidth() == org.telegram.messenger.i0.L(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.q0;
                    textView.layout(measuredWidth2 - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.q0.getMeasuredWidth() / 2) + measuredWidth2, chatAttachAlertPhotoLayout.q0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.q0;
                    textView2.layout(measuredWidth2 - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.q0.getMeasuredWidth() / 2) + measuredWidth2, chatAttachAlertPhotoLayout.q0.getMeasuredHeight() + measuredHeight4);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.k0;
                shutterButton.layout(measuredWidth2 - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.k0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.k0.getMeasuredWidth() / 2) + measuredWidth2, (chatAttachAlertPhotoLayout.k0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.r0;
                imageView.layout(i16 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.r0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.r0.getMeasuredWidth() / 2) + i16, (chatAttachAlertPhotoLayout.r0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i27 = 0; i27 < 2; i27++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.S[i27];
                    imageView2.layout(L - (imageView2.getMeasuredWidth() / 2), i17 - (chatAttachAlertPhotoLayout.S[i27].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.S[i27].getMeasuredWidth() / 2) + L, (chatAttachAlertPhotoLayout.S[i27].getMeasuredHeight() / 2) + i17);
                }
                break;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                g20 g20Var = (g20) this.b;
                l0 l0Var = g20Var.b;
                int[] iArr = g20Var.G;
                l0Var.getLocationOnScreen(iArr);
                g20Var.N = iArr[0];
                g20Var.M = iArr[1] - org.telegram.messenger.i0.L(25.0f);
                break;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ol0 ol0Var = (ol0) this.b;
                l0 l0Var2 = ol0Var.s;
                vu0 vu0Var = ol0Var.w;
                Drawable drawable = ol0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (ol0Var.y != null) {
                        float f10 = bounds.left;
                        float f11 = ol0Var.H;
                        float f12 = f10 + f11;
                        float f13 = bounds.right + f11;
                        float f14 = bounds.top;
                        float f15 = ol0Var.I;
                        float f16 = f14 + f15;
                        float f17 = bounds.bottom + f15;
                        boolean z13 = false;
                        if (ol0Var.L) {
                            f7 = 4.0f;
                            z11 = false;
                        } else {
                            if (f13 - r5.getMeasuredWidth() < org.telegram.messenger.i0.L(8.0f)) {
                                ol0Var.D.setPivotX(org.telegram.messenger.i0.L(6.0f));
                                ol0Var.y.setX(Math.min(vu0Var.getWidth() - ol0Var.y.getWidth(), f12 - org.telegram.messenger.i0.L(10.0f)) - vu0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                ol0Var.D.setPivotX(r5.getMeasuredWidth() - org.telegram.messenger.i0.L(6.0f));
                                f7 = 4.0f;
                                ol0Var.y.setX(Math.max(org.telegram.messenger.i0.L(8.0f), (org.telegram.messenger.i0.L(4.0f) + f13) - ol0Var.y.getMeasuredWidth()) - vu0Var.getX());
                                z11 = true;
                            }
                            ol0Var.G = z11 ? ((ol0Var.y.getX() + ol0Var.y.getWidth()) - org.telegram.messenger.i0.L(6.0f)) - f13 : (ol0Var.y.getX() + org.telegram.messenger.i0.L(10.0f)) - f12;
                        }
                        float L5 = f17 + (ol0Var.F != null ? org.telegram.messenger.i0.L(21.0f) : 0);
                        if (ol0Var.y.getMeasuredHeight() + L5 > l0Var2.getMeasuredHeight() - org.telegram.messenger.i0.L(16.0f)) {
                            ol0Var.D.setPivotY(r2.getMeasuredHeight() - org.telegram.messenger.i0.L(6.0f));
                            ol0Var.y.setY(((f16 - org.telegram.messenger.i0.L(f7)) - ol0Var.y.getMeasuredHeight()) - vu0Var.getY());
                            z13 = true;
                        } else {
                            ol0Var.D.setPivotY(org.telegram.messenger.i0.L(6.0f));
                            ol0Var.y.setY(Math.min((l0Var2.getHeight() - ol0Var.y.getMeasuredHeight()) - org.telegram.messenger.i0.L(16.0f), L5) - vu0Var.getY());
                        }
                        z60 z60Var = ol0Var.x;
                        z60Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = z60Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z13;
                        break;
                    }
                }
                break;
            case 24:
                super.onLayout(z10, i10, i11, i12, i13);
                eu0.I0((eu0) this.b);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        float f7;
        float top;
        int measuredHeight;
        int i12;
        switch (this.a) {
            case 5:
                kg.i1 i1Var = (kg.i1) this.b;
                if (i1Var.J0) {
                    i1Var.q1 = View.MeasureSpec.getSize(i10);
                } else {
                    i1Var.q1 = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                break;
            case 6:
                super.onMeasure(i10, i11);
                kg.v1 v1Var = (kg.v1) ((kg.f) this.b).d;
                kg.h hVar = v1Var.j2;
                if (hVar == null) {
                    View view = v1Var.t2;
                    if (view == null) {
                        f7 = 0.0f;
                        v1Var.i2.setTranslationY(f7 - (r8.getMeasuredHeight() / 2.0f));
                        break;
                    } else {
                        top = view.getTop();
                        measuredHeight = v1Var.t2.getMeasuredHeight();
                    }
                } else {
                    top = hVar.getTop();
                    measuredHeight = v1Var.j2.getMeasuredHeight();
                }
                f7 = (measuredHeight / 2.0f) + top;
                v1Var.i2.setTranslationY(f7 - (r8.getMeasuredHeight() / 2.0f));
            case 7:
                super.onMeasure(i10, i11);
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int childCount = getChildCount();
                int i13 = 0;
                if (!((org.telegram.ui.ActionBar.x1) this.b).M0) {
                    int i14 = 0;
                    while (i13 < childCount) {
                        View childAt = getChildAt(i13);
                        if ((childAt instanceof TextView) && childAt.getTag() != null) {
                            i14 = childAt.getMeasuredWidth() + i14;
                        }
                        i13++;
                    }
                    if (i14 > measuredWidth) {
                        View findViewWithTag = findViewWithTag(-2);
                        View findViewWithTag2 = findViewWithTag(-4);
                        View findViewWithTag3 = findViewWithTag(-3);
                        if (findViewWithTag != null && findViewWithTag3 != null) {
                            if (findViewWithTag.getMeasuredWidth() >= findViewWithTag3.getMeasuredWidth()) {
                                findViewWithTag.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredWidth() - (i14 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            } else {
                                findViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredWidth() - (i14 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            }
                        } else if (findViewWithTag2 != null && findViewWithTag3 != null) {
                            if (findViewWithTag2.getMeasuredWidth() >= findViewWithTag3.getMeasuredWidth()) {
                                findViewWithTag2.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredWidth() - (i14 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            } else {
                                findViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredWidth() - (i14 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            }
                        }
                    }
                } else {
                    int max = Math.max(0, (measuredWidth - org.telegram.messenger.i0.L(8.0f)) / 2);
                    while (i13 < childCount) {
                        View childAt2 = getChildAt(i13);
                        if (childAt2.getTag() != null) {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(40.0f), TLObject.FLAG_30));
                        }
                        i13++;
                    }
                    break;
                }
                break;
            case 11:
                if (View.MeasureSpec.getSize(i10) <= org.telegram.messenger.i0.L(260.0f)) {
                    super.onMeasure(i10, i11);
                    break;
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(320.0f), TLObject.FLAG_30), i11);
                    break;
                }
            case 13:
                super.onMeasure(i10, i11);
                yk ykVar = ((bl) this.b).D;
                if (ykVar != null) {
                    ykVar.a();
                    break;
                }
                break;
            case 16:
                int size = View.MeasureSpec.getSize(i10);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L((((hu) this.b).A1 ? 22 : 0) + 84) + ((int) Math.min(r0.y1 / (r0.x1 / size), org.telegram.messenger.i0.q.y / 2)) + 1, TLObject.FLAG_30));
                break;
            case 17:
                ux uxVar = (ux) this.b;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((View) uxVar.F.getParent()) != null ? (int) (r0.getMeasuredHeight() - uxVar.F.getY()) : org.telegram.messenger.i0.L(120.0f)) - uxVar.F.b1, TLObject.FLAG_30));
                break;
            case 18:
                vy vyVar = ((qy) this.b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (a30.y(8.0f, vyVar.D0.getMeasuredHeight() - vyVar.b1, 3) * 1.7f), TLObject.FLAG_30));
                break;
            case 24:
                eu0 eu0Var = (eu0) this.b;
                ag.b1 b1Var = eu0Var.i1;
                int size2 = View.MeasureSpec.getSize(i11) - org.telegram.messenger.i0.m;
                getMeasuredWidth();
                int D = m5.D(54.0f, od.g(), m5.C(56.0f, org.telegram.messenger.i0.L(56.0f), 1));
                int i15 = size2 / 5;
                if (D < i15 * 3) {
                    i12 = org.telegram.messenger.i0.L(8.0f);
                } else {
                    i12 = i15 * 2;
                    if (D < size2) {
                        i12 -= size2 - D;
                    }
                }
                if (b1Var.getPaddingTop() != i12) {
                    eu0Var.n1 = true;
                    b1Var.setPadding(0, i12, 0, org.telegram.messenger.i0.L(8.0f));
                    eu0Var.n1 = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), TLObject.FLAG_30));
                break;
            case 27:
                tx0 tx0Var = (tx0) this.b;
                setPadding(tx0Var.n, tx0Var.h == 0 ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(6.66f), tx0Var.n, tx0Var.h == 0 ? org.telegram.messenger.i0.L(6.66f) : org.telegram.messenger.i0.L(8.0f));
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 22:
                super.onSizeChanged(i10, i11, i12, i13);
                ol0 ol0Var = (ol0) this.b;
                yg.d.c(ol0Var.h, ol0Var.s);
                ViewGroup viewGroup = ol0Var.D;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0) {
                    cr0 cr0Var = (cr0) this.b;
                    if (cr0Var.n1) {
                        cr0Var.y0(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            case 24:
                return !((eu0) this.b).I && super.onTouchEvent(motionEvent);
            case 29:
                return !((b61) this.b).I && super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
            case 21:
                uk0 uk0Var = (uk0) this.b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(uk0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(uk0Var.getMeasuredHeight(), TLObject.FLAG_30));
                    layout(0, 0, uk0Var.b1.getMeasuredWidth(), uk0Var.b1.getMeasuredHeight());
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 24:
                if (!((eu0) this.b).n1) {
                    super.requestLayout();
                    break;
                }
                break;
            case 26:
                if (!((dx0) this.b).X1) {
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
    public void setPressed(boolean z10) {
        switch (this.a) {
            case 28:
                super.setPressed(z10);
                ((dc) this.b).c(z10);
                break;
            default:
                super.setPressed(z10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.a) {
            case 8:
                super.setTranslationY(f7);
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.b;
                FrameLayout frameLayout = z2Var.E;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((-(z2Var.c.getHeight() - z2Var.b.getY())) + z2Var.s0);
                }
                z2Var.g0(f7);
                break;
            case 29:
                super.setTranslationY(f7);
                b61.I0((b61) this.b);
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 19:
                super.setVisibility(i10);
                ((g20) this.b).d.setVisibility(i10);
                break;
            case 27:
                tx0 tx0Var = (tx0) this.b;
                boolean z10 = getVisibility() == i10;
                super.setVisibility(i10);
                if (!z10) {
                    boolean z11 = i10 == 0;
                    if (tx0Var.e != null) {
                        for (int i11 = 0; i11 < tx0Var.e.getChildCount(); i11++) {
                            if (z11) {
                                sx0 sx0Var = (sx0) tx0Var.e.getChildAt(i11);
                                Drawable drawable = sx0Var.b;
                                if (drawable instanceof f5) {
                                    ((f5) drawable).a(sx0Var);
                                }
                                sx0Var.c = true;
                            } else {
                                sx0 sx0Var2 = (sx0) tx0Var.e.getChildAt(i11);
                                Drawable drawable2 = sx0Var2.b;
                                if (drawable2 instanceof f5) {
                                    ((f5) drawable2).n(sx0Var2);
                                }
                                sx0Var2.c = false;
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(w2 w2Var, Context context) {
        super(context);
        this.a = 2;
        this.b = w2Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Context context, p6 p6Var) {
        super(context);
        this.a = 15;
        this.b = new io[2];
        int i10 = 0;
        while (true) {
            io[] ioVarArr = (io[]) this.b;
            if (i10 < ioVarArr.length) {
                ioVarArr[i10] = new io(context, p6Var);
                addView(((io[]) this.b)[i10], b6.e(-1, -1, at.E1));
                i10++;
            } else {
                ioVarArr[0].setVisibility(0);
                ((io[]) this.b)[1].setVisibility(8);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(e2 e2Var, Context context) {
        super(context);
        this.a = 1;
        this.b = e2Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 28:
                super(context);
                this.b = new dc(this);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(cr0 cr0Var, Context context) {
        super(context);
        this.a = 0;
        this.b = cr0Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(lu0 lu0Var, Context context) {
        super(context);
        this.a = 25;
        this.b = lu0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Context context, m20 m20Var) {
        super(context);
        this.a = 10;
        this.b = m20Var;
    }
}
