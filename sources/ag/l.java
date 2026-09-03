package ag;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import eg.a1;
import f2.j0;
import f2.w;
import fg.n1;
import fg.p1;
import fg.s0;
import k7.c6;
import lf.b0;
import lh.t0;
import ng.c0;
import ng.d0;
import ng.g0;
import ng.s;
import ng.y;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.y0;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.jd0;
import org.telegram.ui.Components.ka;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.voip.h1;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.a61;
import org.telegram.ui.b61;
import org.telegram.ui.bt;
import org.telegram.ui.d5;
import org.telegram.ui.f61;
import org.telegram.ui.gl0;
import org.telegram.ui.h20;
import org.telegram.ui.jd1;
import org.telegram.ui.l4;
import org.telegram.ui.nt0;
import org.telegram.ui.p41;
import org.telegram.ui.qt;
import org.telegram.ui.r5;
import org.telegram.ui.t21;
import org.telegram.ui.u21;
import org.telegram.ui.v70;
import org.telegram.ui.w41;
import org.telegram.ui.w61;
import org.telegram.ui.yb;
import org.telegram.ui.z51;
import qh.e3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class l extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    public void b(int i10, CharSequence charSequence, boolean z4) {
        ImageView imageView = (ImageView) this.b;
        if (z4) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.c).setText(charSequence);
    }

    public void c(String str, boolean z4) {
        ((j6) this.c).q(str, z4 && !LocaleController.isRTL, true);
    }

    public void d(String str, boolean z4) {
        ((j6) this.b).q(str, z4 && !LocaleController.isRTL, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v25 */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        g6 g6Var;
        l5[] l5VarArr;
        ?? r82;
        float f10;
        char c3;
        float f11;
        float f12;
        z zVar;
        switch (this.a) {
            case 1:
                b0 b0Var = (b0) this.c;
                b0Var.b(k6.l1(0.65f, k6.v0(k6.d6, (g6) this.b)));
                b0Var.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 3:
                ((p1) this.b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                p1 p1Var = (p1) this.b;
                p1Var.f.setAlpha(((n1) this.c).H);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, p1Var.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.b;
                int i10 = k6.a7;
                g6Var = ((p2) ((r5) this.c).d).resourceProvider;
                paint.setColor(k6.v0(i10, g6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint);
                break;
            case 10:
                RectF rectF2 = (RectF) this.b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                y0 y0Var = (y0) this.c;
                int measuredWidth = y0Var.getMeasuredWidth();
                int i11 = y0Var.d;
                float x10 = y0Var.getX();
                float f13 = y0Var.c;
                g6 g6Var2 = y0Var.b;
                if (g6Var2 != null) {
                    g6Var2.l(x10, f13, measuredWidth, i11);
                } else {
                    k6.q(x10, f13, measuredWidth, i11);
                }
                float dp = AndroidUtilities.dp(18.0f);
                float dp2 = AndroidUtilities.dp(18.0f);
                Paint F = g6Var2 != null ? g6Var2.F("paintChatActionBackground") : null;
                if (F == null) {
                    F = k6.S0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF2, dp, dp2, F);
                if (g6Var2 != null ? g6Var2.o0() : k6.a1()) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    Paint F2 = g6Var2 != null ? g6Var2.F("paintChatActionBackgroundDarken") : null;
                    if (F2 == null) {
                        F2 = k6.S0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF2, dp3, dp4, F2);
                }
                super.dispatchDraw(canvas);
                break;
            case 11:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(k6.v0(k6.a7, ((yb) this.c).f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                break;
            case 12:
                float dp5 = AndroidUtilities.dp(20.0f);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.b;
                path.rewind();
                path.addRoundRect(rectF3, dp5, dp5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF3, 255, 31);
                super.dispatchDraw(canvas);
                rectF3.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + getPaddingTop());
                h20 h20Var = (h20) this.c;
                h20Var.b(canvas, rectF3, 1, 1.0f);
                rectF3.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                h20Var.b(canvas, rectF3, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                break;
            case 13:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.b;
                paint3.setColor(((mp) this.c).getThemedColor(k6.d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint3);
                break;
            case 14:
                yy yyVar = (yy) this.c;
                if (!yyVar.D.r0 && yyVar.w > 0.0f) {
                    if (((Paint) this.b) == null) {
                        Paint paint4 = new Paint();
                        this.b = paint4;
                        paint4.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.b).setAlpha((int) (yyVar.w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.b);
                    canvas.restore();
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
                break;
            case 15:
                j6 j6Var = (j6) this.b;
                int dp6 = AndroidUtilities.dp(29.0f);
                int dp7 = AndroidUtilities.dp(18.83f);
                j6 j6Var2 = (j6) this.c;
                j6Var.setBounds(getPaddingLeft(), r3 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r3);
                j6Var.draw(canvas);
                j6Var2.setBounds(getPaddingLeft(), r2 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r2);
                j6Var2.draw(canvas);
                break;
            case 17:
                Paint paint5 = (Paint) this.b;
                qk0 qk0Var = (qk0) this.c;
                int i12 = qk0Var.J0;
                paint5.setColor((i12 == 1 || i12 == 2 || i12 == 4) ? i0.a.k(-1, 30) : i0.a.d(0.7f, k6.v0(k6.F8, qk0Var.h0), k6.v0(k6.h5, qk0Var.h0)));
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g10 = qk0Var.g();
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(measuredWidth2 - measuredWidth3, (measuredHeight - measuredWidth3) - g10, measuredWidth2 + measuredWidth3, measuredHeight + measuredWidth3 + g10);
                canvas.save();
                canvas.scale(childAt.getScaleX(), childAt.getScaleY(), measuredWidth2, measuredHeight);
                canvas.drawRoundRect(rectF4, measuredWidth3, measuredWidth3, paint5);
                canvas.restore();
                canvas.save();
                canvas.translate(0.0f, g10);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            case 23:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                l5[] l5VarArr2 = profileActivity.r;
                if (profileActivity.T4 != null) {
                    canvas.save();
                    canvas.translate(l5VarArr2[0].getX(), l5VarArr2[0].getY());
                    l5VarArr = l5VarArr2;
                    r82 = 0;
                    f10 = 0.0f;
                    c3 = 2;
                    f11 = 24.0f;
                    f12 = 14.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.T4.getMeasuredWidth(), profileActivity.T4.getMeasuredHeight(), (int) ((1.0f - profileActivity.P1) * 255.0f), 31);
                    profileActivity.T4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    l5VarArr = l5VarArr2;
                    r82 = 0;
                    f10 = 0.0f;
                    c3 = 2;
                    f11 = 24.0f;
                    f12 = 14.0f;
                }
                if (profileActivity.m5 && profileActivity.V5 != f10 && profileActivity.k5 != 1.0f) {
                    float measuredHeight2 = (l5VarArr[1].getMeasuredHeight() / 2.0f) + l5VarArr[1].getY();
                    float dp8 = AndroidUtilities.dp(22.0f);
                    float x11 = ((l5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.l5)) - dp8) - profileActivity.Z3();
                    profileActivity.o5.setImageCoords(x11, measuredHeight2 - (dp8 / 2.0f), dp8, dp8);
                    profileActivity.o5.setAlpha(profileActivity.V5);
                    canvas.save();
                    float f14 = profileActivity.V5;
                    canvas.scale(f14, f14, profileActivity.o5.getCenterX(), profileActivity.o5.getCenterY());
                    profileActivity.o5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.k5 != f10) {
                        xc xcVar = (xc) this.b;
                        if (xcVar != null && (zVar = xcVar.e) != null) {
                            zVar.setState(StateSet.NOTHING);
                            zVar.jumpToCurrentState();
                            break;
                        }
                    } else {
                        if (((xc) this.b) == null) {
                            xc xcVar2 = new xc(this);
                            this.b = xcVar2;
                            xcVar2.h = new gl0(this, 29);
                        }
                        float dp9 = (1.0f - profileActivity.k5) * AndroidUtilities.dp(28.0f);
                        float textWidth = l5VarArr[c3].getTextWidth();
                        float max = Math.max(textWidth, profileActivity.Q != null ? (AndroidUtilities.dp(f11) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.Q.getVisibilityFactor() : 0.0f) + dp9;
                        RectF rectF5 = AndroidUtilities.rectTmp;
                        rectF5.set(x11 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(f12), x11 + max + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(f12));
                        xc xcVar3 = (xc) this.b;
                        xcVar3.i = r82;
                        xcVar3.c = r82;
                        xcVar3.a(rectF5);
                        xc xcVar4 = (xc) this.b;
                        xcVar4.n = true;
                        int k10 = i0.a.k(-1, 50);
                        xcVar4.g.setColor((int) r82);
                        z zVar2 = xcVar4.e;
                        if (zVar2 != null) {
                            k6.B1(zVar2, k10, true);
                        }
                        xc xcVar5 = (xc) this.b;
                        xcVar5.c(canvas, xcVar5.g);
                        z zVar3 = xcVar5.e;
                        if (zVar3 != null) {
                            zVar3.draw(canvas);
                            break;
                        }
                    }
                }
                break;
            case 24:
                Rect rect = (Rect) this.b;
                t21 t21Var = (t21) this.c;
                if (t21Var.O) {
                    t21Var.f.setBounds(-rect.left, -rect.top, getWidth() + rect.right, getHeight() + rect.bottom);
                    t21Var.f.draw(canvas);
                } else {
                    RectF rectF6 = AndroidUtilities.rectTmp;
                    rectF6.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                    canvas.drawRoundRect(rectF6, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), t21Var.a);
                }
                super.dispatchDraw(canvas);
                break;
            case 28:
                ImageReceiver imageReceiver = (ImageReceiver) this.b;
                imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.a) {
            case 7:
                if (keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 4) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                d0 d0Var = (d0) this.c;
                if (!d0Var.k) {
                    return true;
                }
                d0Var.d();
                return true;
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean z4) {
        switch (this.a) {
            case 7:
                break;
            default:
                super.dispatchSetPressed(z4);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 8:
                l4 l4Var = (l4) this.c;
                y9 o10 = l4Var.M0.o(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (l4Var.M0.y() && l4Var.M0.o(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (o10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() != 0 || !l4Var.M0.y() || (motionEvent.getY() >= linearLayout.getTop() && motionEvent.getY() <= linearLayout.getBottom())) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (l4Var.M0.o(getContext()).onTouchEvent(obtain)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            case 18:
                int action = motionEvent.getAction();
                h1 h1Var = (h1) this.c;
                if (h1Var.G != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(h1Var.G.getX(), h1Var.G.getY());
                    boolean dispatchTouchEvent = h1Var.G.dispatchTouchEvent(motionEvent);
                    obtain2.recycle();
                    if (action == 1 || action == 3) {
                        h1Var.G = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = h1Var.C.onTouchEvent(obtain3);
                obtain3.recycle();
                boolean z4 = !h1Var.C.isInProgress() && ((GestureDetector) h1Var.D.b).onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    h1Var.E = false;
                    h1Var.F = false;
                    o1.j jVar = h1Var.P;
                    if (!jVar.f) {
                        float f10 = h1Var.N;
                        jVar.b = f10;
                        jVar.c = true;
                        jVar.u.i = (h1Var.J / 2.0f) + f10 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - r7) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                        h1Var.P.f();
                    }
                    o1.j jVar2 = h1Var.Q;
                    if (!jVar2.f) {
                        jVar2.b = h1Var.O;
                        jVar2.c = true;
                        jVar2.u.i = k7.o.a(r2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.K) - AndroidUtilities.dp(16.0f));
                        h1Var.Q.f();
                    }
                }
                return onTouchEvent || z4;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z4;
        switch (this.a) {
            case 2:
                Path path = (Path) this.b;
                a1 a1Var = (a1) this.c;
                if (a1Var.h == null || (!((z4 = a1Var.f) && view == a1Var.d) && (z4 || view != a1Var.c))) {
                    return super.drawChild(canvas, view, j10);
                }
                float measuredWidth = ((z4 ? a1Var.e : 1.0f - a1Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            case 20:
                if (view instanceof jd0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 25:
                return view != ((SecretMediaViewer) this.b).w && super.drawChild(canvas, view, j10);
            case 26:
                Path path2 = (Path) this.b;
                w41 w41Var = (w41) this.c;
                RectF rectF = w41Var.O;
                if (view == w41Var.K || view == w41Var.x) {
                    canvas.save();
                    canvas.clipRect(0.0f, AndroidUtilities.lerp(w41Var.Q, 0.0f, w41Var.s), getWidth(), AndroidUtilities.lerp(w41Var.R, getHeight(), w41Var.s));
                    boolean drawChild2 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild2;
                }
                if (view != w41Var.M) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                path2.rewind();
                path2.addCircle(rectF.centerX() + w41Var.K.getX(), rectF.centerY() + w41Var.K.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.clipRect(0.0f, AndroidUtilities.lerp(w41Var.Q, 0.0f, w41Var.s), getWidth(), AndroidUtilities.lerp(w41Var.R, getHeight(), w41Var.s));
                canvas.translate(-w41Var.M.getX(), -w41Var.M.getY());
                canvas.translate(w41Var.K.getX() + rectF.left, w41Var.K.getY() + rectF.top);
                canvas.scale(rectF.width() / w41Var.M.getMeasuredWidth(), rectF.height() / w41Var.M.getMeasuredHeight(), w41Var.M.getX(), w41Var.M.getY());
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            case 27:
                if (view != ((w61) this.c).e0 || !g0.b || !g0.f) {
                    return super.drawChild(canvas, view, j10);
                }
                for (int i10 = 0; i10 < ((w61) this.c).e0.getChildCount(); i10++) {
                    View childAt = ((w61) this.c).e0.getChildAt(i10);
                    if (childAt instanceof f61) {
                        f61 f61Var = (f61) childAt;
                        if (f61Var.getAnimatedScale() == 1.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        } else if (f61Var.getAnimatedScale() > 0.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            ((Rect) this.b).set((int) (r2.centerX() - (f61Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f))), (int) (((Rect) this.b).centerY() - (f61Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f))), (int) ((f61Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f)) + ((Rect) this.b).centerX()), (int) ((f61Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f)) + ((Rect) this.b).centerY()));
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            canvas.scale(f61Var.getAnimatedScale(), f61Var.getAnimatedScale(), ((Rect) this.b).centerX(), ((Rect) this.b).centerY());
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        }
                    } else if ((childAt instanceof TextView) || (childAt instanceof a61) || (childAt instanceof z51) || (childAt instanceof b61)) {
                        ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                        canvas.save();
                        canvas.clipRect((Rect) this.b);
                        super.drawChild(canvas, view, j10);
                        canvas.restore();
                    }
                }
                return false;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        switch (this.a) {
            case 7:
                d0 d0Var = (d0) this.c;
                float f10 = d0Var.u;
                float f11 = rect.bottom;
                if (f10 != f11 && d0Var.v) {
                    d0Var.u = f11;
                    l lVar = d0Var.c;
                    c0 c0Var = d0Var.a;
                    if (!d0Var.q) {
                        float f12 = d0Var.t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = d0Var.y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f13 = dp;
                        if (c0Var.getMeasuredHeight() + f12 > (lVar.getMeasuredHeight() - d0Var.u) - f13) {
                            f12 = ((lVar.getMeasuredHeight() - d0Var.u) - c0Var.getMeasuredHeight()) - f13;
                        }
                        if (f12 < 0.0f) {
                            f12 = 0.0f;
                        }
                        c0Var.animate().translationY(f12).setDuration(250L).setUpdateListener(new y(d0Var, 1)).setInterpolator(pr.f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.a) {
            case 0:
                super.invalidate();
                ((o) this.c).invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 6:
                super.onAttachedToWindow();
                ((ng.o) this.b).c();
                break;
            case 7:
                super.onAttachedToWindow();
                ic.a(this, (t0) this.b);
                break;
            case 20:
                super.onAttachedToWindow();
                qt qtVar = (qt) this.c;
                qtVar.A.onAttachedToWindow();
                qtVar.B.onAttachedToWindow();
                break;
            case 23:
                super.onAttachedToWindow();
                ((ProfileActivity) this.c).o5.onAttachedToWindow();
                break;
            case 25:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.b).h.onAttachedToWindow();
                break;
            case 28:
                super.onAttachedToWindow();
                ((ImageReceiver) this.b).onAttachedToWindow();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.a) {
            case 18:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                h1 h1Var = (h1) this.c;
                AndroidUtilities.setPreferredMaxRefreshRate(h1Var.b, h1Var.d, h1Var.c);
                h1Var.i(false);
                break;
            default:
                super.onConfigurationChanged(configuration);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 6:
                super.onDetachedFromWindow();
                ((ng.o) this.b).d();
                break;
            case 7:
                super.onDetachedFromWindow();
                ic.h(this);
                break;
            case 20:
                super.onDetachedFromWindow();
                qt qtVar = (qt) this.c;
                qtVar.A.onDetachedFromWindow();
                qtVar.B.onDetachedFromWindow();
                break;
            case 23:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.c).o5.onDetachedFromWindow();
                break;
            case 25:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.b).h.onDetachedFromWindow();
                break;
            case 28:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.b).onDetachedFromWindow();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        int min;
        Drawable drawable;
        float f10;
        switch (this.a) {
            case 16:
                xd0 xd0Var = (xd0) this.c;
                Drawable drawable2 = xd0Var.a;
                if (drawable2 == null) {
                    super.onDraw(canvas);
                } else if ((drawable2 instanceof fc0) || (drawable2 instanceof ColorDrawable) || (drawable2 instanceof GradientDrawable)) {
                    drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    xd0Var.a.draw(canvas);
                } else {
                    float max = Math.max(getMeasuredWidth() / xd0Var.a.getIntrinsicWidth(), (getMeasuredHeight() + xd0Var.D) / xd0Var.a.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(xd0Var.a.getIntrinsicWidth() * max);
                    int ceil2 = (int) Math.ceil(xd0Var.a.getIntrinsicHeight() * max);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int measuredHeight = ((getMeasuredHeight() - ceil2) + xd0Var.D) / 2;
                    xd0Var.a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
                    xd0Var.a.draw(canvas);
                }
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.b);
                break;
            case 19:
                canvas.save();
                n2 n2Var = (n2) this.c;
                canvas.scale(n2Var.b.getScaleX(), n2Var.b.getScaleY(), n2Var.b.getPivotX() + n2Var.b.getLeft(), n2Var.b.getPivotY() + n2Var.b.getTop());
                Drawable drawable3 = (Drawable) this.b;
                drawable3.setBounds(n2Var.b.getLeft() - AndroidUtilities.dp(2.0f), n2Var.b.getTop() - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f) + n2Var.b.getRight(), AndroidUtilities.dp(2.0f) + n2Var.b.getBottom());
                drawable3.draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                break;
            case 20:
                qt qtVar = (qt) this.b;
                Paint paint = qtVar.N;
                ImageReceiver imageReceiver = qtVar.B;
                ColorDrawable colorDrawable = qtVar.u;
                ImageReceiver imageReceiver2 = qtVar.A;
                if (qtVar.z != null && colorDrawable != null) {
                    if (qtVar.K && qtVar.v == null && qtVar.w != null && !qtVar.e0) {
                        qtVar.e0 = true;
                        imageReceiver2.setVisible(false, false);
                        im0.d(new d5(qtVar, 8));
                    }
                    if (qtVar.v != null) {
                        boolean z4 = qtVar.K;
                        if (z4) {
                            float f11 = qtVar.M;
                            if (f11 != 1.0f) {
                                float f12 = f11 + 0.13333334f;
                                qtVar.M = f12;
                                if (f12 > 1.0f) {
                                    qtVar.M = 1.0f;
                                }
                                qtVar.z.invalidate();
                                f10 = qtVar.M;
                                if (f10 != 0.0f && qtVar.v != null) {
                                    paint.setAlpha((int) (f10 * 255.0f));
                                    if (paint.getAlpha() != 255) {
                                        canvas.drawColor(k6.l1(qtVar.M, k6.v0(k6.a7, qtVar.c0)));
                                    }
                                    canvas.drawPaint(paint);
                                }
                            }
                        }
                        if (!z4) {
                            float f13 = qtVar.M;
                            if (f13 != 0.0f) {
                                float f14 = f13 - 0.13333334f;
                                qtVar.M = f14;
                                if (f14 < 0.0f) {
                                    qtVar.M = 0.0f;
                                }
                                qtVar.z.invalidate();
                            }
                        }
                        f10 = qtVar.M;
                        if (f10 != 0.0f) {
                            paint.setAlpha((int) (f10 * 255.0f));
                            if (paint.getAlpha() != 255) {
                            }
                            canvas.drawPaint(paint);
                        }
                    }
                    colorDrawable.setAlpha((int) (qtVar.F * 180.0f));
                    colorDrawable.setBounds(0, 0, qtVar.z.getWidth(), qtVar.z.getHeight());
                    colorDrawable.draw(canvas);
                    canvas.save();
                    i0.b bVar = qtVar.q;
                    int i10 = bVar.d;
                    int i11 = bVar.b;
                    int i12 = i10 + i11;
                    if (qtVar.V == 1) {
                        min = Math.min(qtVar.z.getWidth(), qtVar.z.getHeight() - i12) - AndroidUtilities.dp(40.0f);
                    } else {
                        min = (int) (qtVar.S ? Math.min(qtVar.z.getWidth(), qtVar.z.getHeight() - i12) - AndroidUtilities.dpf2(40.0f) : Math.min(qtVar.z.getWidth(), qtVar.z.getHeight() - i12) / 1.8f);
                    }
                    float max2 = Math.max((min / 2) + i11 + (qtVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((qtVar.z.getHeight() - i12) - qtVar.I) / 2);
                    if (qtVar.S) {
                        max2 += AndroidUtilities.dp(40.0f);
                    }
                    canvas.translate(qtVar.z.getWidth() / 2, qtVar.e + max2);
                    int i13 = (int) (min * ((qtVar.F * 0.8f) / 0.8f));
                    if (qtVar.V == 3) {
                        canvas.translate(0.0f, AndroidUtilities.dp(70.0f));
                    }
                    if (qtVar.S) {
                        float f15 = i13;
                        float f16 = 0.6669f * f15;
                        imageReceiver2.setAlpha(qtVar.F);
                        float f17 = f15 - f16;
                        float f18 = f15 / 2.0f;
                        imageReceiver2.setImageCoords((f17 - f18) - (0.0546875f * f15), (f17 / 2.0f) - f18, f16, f16);
                        imageReceiver2.draw(canvas);
                        imageReceiver.setAlpha(qtVar.F);
                        float f19 = (-i13) / 2.0f;
                        imageReceiver.setImageCoords(f19, f19, f15, f15);
                        imageReceiver.draw(canvas);
                    } else {
                        imageReceiver2.setAlpha(qtVar.F);
                        float f20 = (-i13) / 2.0f;
                        float f21 = i13;
                        imageReceiver2.setImageCoords(f20, f20, f21, f21);
                        imageReceiver2.draw(canvas);
                    }
                    if (qtVar.C != null) {
                        canvas.save();
                        float f22 = (-i13) / 2.0f;
                        canvas.translate(f22, f22);
                        float f23 = i13;
                        canvas.scale(f23 / qtVar.C.getWidth(), f23 / qtVar.C.getHeight());
                        qtVar.C.setAlpha(qtVar.F);
                        if (qtVar.D == null) {
                            qtVar.D = new Path();
                        }
                        qtVar.D.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, qtVar.C.getWidth(), qtVar.C.getHeight());
                        float f24 = f23 / 8.0f;
                        qtVar.D.addRoundRect(rectF, f24, f24, Path.Direction.CW);
                        canvas.clipPath(qtVar.D);
                        qtVar.C.draw(canvas);
                        canvas.restore();
                    }
                    if (qtVar.V == 1 && !qtVar.m && (drawable = qtVar.J) != null) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = qtVar.J.getIntrinsicHeight();
                        int dp = (int) (imageReceiver2.getDrawRegion().top - AndroidUtilities.dp(((qtVar.d / AndroidUtilities.dp(60.0f)) * 6.0f) + 17.0f));
                        qtVar.J.setAlpha((int) ((1.0f - qtVar.g) * 255.0f));
                        qtVar.J.setBounds((-intrinsicWidth) / 2, (-intrinsicHeight) + dp, intrinsicWidth / 2, dp);
                        qtVar.J.draw(canvas);
                    }
                    if (qtVar.G != null) {
                        if (qtVar.S) {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
                        } else {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver2.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
                        }
                        qt.f0.setAlpha((int) (qtVar.F * 255.0f));
                        qtVar.G.draw(canvas);
                    }
                    canvas.restore();
                    if (qtVar.E) {
                        if (qtVar.F != 1.0f) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j10 = currentTimeMillis - qtVar.H;
                            qtVar.H = currentTimeMillis;
                            qtVar.F = (j10 / 120.0f) + qtVar.F;
                            qtVar.z.invalidate();
                            if (qtVar.F > 1.0f) {
                                qtVar.F = 1.0f;
                                break;
                            }
                        }
                    } else if (qtVar.F != 0.0f) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long j11 = currentTimeMillis2 - qtVar.H;
                        qtVar.H = currentTimeMillis2;
                        qtVar.F -= j11 / 120.0f;
                        qtVar.z.invalidate();
                        if (qtVar.F < 0.0f) {
                            qtVar.F = 0.0f;
                        }
                        if (qtVar.F == 0.0f) {
                            imageReceiver2.setImageBitmap((Drawable) null);
                            AndroidUtilities.unlockOrientation(qtVar.w);
                            AndroidUtilities.runOnUIThread(new bt(qtVar, 1));
                            Bitmap bitmap = qtVar.v;
                            if (bitmap != null) {
                                bitmap.recycle();
                                qtVar.v = null;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(qtVar.O, false, 1.0f, false);
                            qtVar.M = 0.0f;
                            try {
                                if (qtVar.y.getParent() != null) {
                                    ((WindowManager) qtVar.w.getSystemService("window")).removeView(qtVar.y);
                                    break;
                                }
                            } catch (Exception e6) {
                                FileLog.e(e6);
                                return;
                            }
                        }
                    }
                }
                break;
            case 25:
                SecretMediaViewer.b((SecretMediaViewer) this.b, canvas);
                break;
            case 29:
                int intrinsicHeight2 = k6.i3.getIntrinsicHeight();
                k6.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight2);
                k6.i3.draw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(((jd1) this.c).getThemedColor(k6.Sd));
                canvas.drawRect(0.0f, intrinsicHeight2, getMeasuredWidth(), getMeasuredHeight(), paint2);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        xc xcVar;
        switch (this.a) {
            case 23:
                return (((ProfileActivity) this.c).k5 == 0.0f && (xcVar = (xc) this.b) != null && xcVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 21:
                super.onLayout(z4, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int x10 = org.telegram.ui.b.x(275.0f, i15, 2);
                v70 v70Var = (v70) this.c;
                FrameLayout frameLayout = v70Var.r;
                frameLayout.layout(0, x10, frameLayout.getMeasuredWidth(), v70Var.r.getMeasuredHeight() + x10);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + x10;
                int measuredWidth = (getMeasuredWidth() - v70Var.e.getMeasuredWidth()) / 2;
                ka kaVar = v70Var.e;
                kaVar.layout(measuredWidth, dp, kaVar.getMeasuredWidth() + measuredWidth, v70Var.e.getMeasuredHeight() + dp);
                m2.h hVar = v70Var.d;
                hVar.layout(0, 0, hVar.getMeasuredWidth(), v70Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - v70Var.n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - v70Var.n.getMeasuredWidth()) / 2;
                s0 s0Var = v70Var.n;
                s0Var.layout(measuredWidth2, measuredHeight, s0Var.getMeasuredWidth() + measuredWidth2, v70Var.n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - v70Var.f.getMeasuredWidth()) / 2;
                TextView textView = v70Var.f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), v70Var.f.getMeasuredWidth() + measuredWidth3, dp2);
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int dp3 = AndroidUtilities.dp(4) + (AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight);
                if (marginLayoutParams.topMargin != dp3) {
                    marginLayoutParams.topMargin = dp3;
                    frameLayout2.requestLayout();
                    break;
                }
                break;
            case 22:
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + org.telegram.ui.b.x(275.0f, ((i13 - i11) / 4) * 3, 2);
                int dp5 = AndroidUtilities.dp(18.0f);
                TextView textView2 = (TextView) this.b;
                textView2.layout(dp5, dp4, textView2.getMeasuredWidth() + dp5, textView2.getMeasuredHeight() + dp4);
                int dp6 = AndroidUtilities.dp(18.0f) + dp4 + ((int) textView2.getTextSize());
                int dp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.c;
                textView3.layout(dp7, dp6, textView3.getMeasuredWidth() + dp7, textView3.getMeasuredHeight() + dp6);
                break;
            case 23:
                super.onLayout(z4, i10, i11, i12, i13);
                ((ProfileActivity) this.c).V4();
                break;
            case 24:
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                break;
            case 25:
                super.onLayout(z4, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                if (secretMediaViewer.n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    p41 p41Var = secretMediaViewer.n;
                    p41Var.layout(p41Var.getLeft(), currentActionBarHeight, secretMediaViewer.n.getRight(), secretMediaViewer.n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.r != null && secretMediaViewer.n != null) {
                    int measuredHeight2 = (secretMediaViewer.n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    e3 e3Var = secretMediaViewer.r;
                    e3Var.layout(e3Var.getLeft(), measuredHeight2, secretMediaViewer.r.getRight(), secretMediaViewer.r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.X != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    nt0 nt0Var = secretMediaViewer.X;
                    nt0Var.layout(nt0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.X.getRight(), secretMediaViewer.X.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f;
                if (view != null) {
                    int i16 = i13 - i11;
                    view.layout(0, i16, i12 - i10, AndroidUtilities.navigationBarHeight + i16);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        j0 wVar;
        switch (this.a) {
            case 3:
                super.onMeasure(i10, org.telegram.ui.b.B(2.0f, ((n1) this.c).s, TLObject.FLAG_30));
                break;
            case 8:
                super.onMeasure(i10, i11);
                super.onMeasure(i10, org.telegram.ui.b.B(8.0f, ((LinearLayout) this.b).getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 13:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                break;
            case 15:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
                setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                break;
            case 24:
                t21 t21Var = (t21) this.c;
                View view = t21Var.E;
                View view2 = t21Var.F;
                LinearLayout linearLayout = t21Var.v;
                TextView textView = t21Var.s;
                sl0 sl0Var = t21Var.y;
                boolean z4 = t21Var.P.M;
                int dp = AndroidUtilities.dp(12.0f);
                if (z4) {
                    sl0Var.setLayoutParams(c6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
                    sl0Var.setPadding(dp, 0, dp, 0);
                    if (linearLayout != null) {
                        textView.setLayoutParams(c6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(c6.d(-1, 48.0f, 8388691, 16.0f, 162.0f, 16.0f, 16.0f));
                    } else {
                        textView.setLayoutParams(c6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
                    }
                } else {
                    sl0Var.setPadding(dp, dp / 2, dp, dp);
                    if (linearLayout != null) {
                        sl0Var.setLayoutParams(c6.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 136.0f));
                        textView.setLayoutParams(c6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(c6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    } else {
                        sl0Var.setLayoutParams(c6.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 80.0f));
                        textView.setLayoutParams(c6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    }
                }
                if (z4) {
                    view2.setVisibility(8);
                    view.setVisibility(8);
                } else {
                    int i12 = textView != null ? 136 : 80;
                    view2.setVisibility(0);
                    view2.setLayoutParams(c6.d(-1, AndroidUtilities.dp(2.0f), 80, 0.0f, 0.0f, 0.0f, i12));
                    view.setVisibility(0);
                    view.setLayoutParams(c6.d(-1, AndroidUtilities.dp(2.0f), 48, 0.0f, 44.0f, 0.0f, 0.0f));
                }
                if (t21Var.O != z4) {
                    u21 u21Var = t21Var.d;
                    if (z4) {
                        u21Var.getParentActivity();
                        wVar = new j0(0, false);
                    } else {
                        u21Var.getParentActivity();
                        wVar = new w(3, false);
                    }
                    t21Var.D = wVar;
                    sl0Var.setLayoutManager(wVar);
                    sl0Var.requestLayout();
                    int i13 = t21Var.I;
                    if (i13 != -1) {
                        t21Var.b(i13);
                    }
                    t21Var.O = z4;
                }
                super.onMeasure(i10, i11);
                break;
            case 25:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                nt0 nt0Var = secretMediaViewer.X;
                if (nt0Var != null) {
                    nt0Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - (secretMediaViewer.R.getVisibility() != 0 ? 0 : secretMediaViewer.R.getMeasuredHeight()), TLObject.FLAG_30));
                }
                View view3 = secretMediaViewer.f;
                if (view3 != null) {
                    view3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.navigationBarHeight, TLObject.FLAG_30));
                    break;
                }
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                b0 b0Var = (b0) this.c;
                b0Var.setBounds(0, 0, i10, i11);
                b0Var.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                break;
            case 18:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0290, code lost:
    
        if (r1 > r4) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0281, code lost:
    
        if (r14 > r4) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02f6, code lost:
    
        if (r4 > r5) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e5, code lost:
    
        if (r4 > r5) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ec  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        DisplayMetrics displayMetrics;
        float f10;
        xc xcVar;
        switch (this.a) {
            case 0:
                o oVar = (o) this.c;
                g gVar = oVar.r;
                boolean onTouchEvent = ((GestureDetector) ((f1) this.b).b).onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    AndroidUtilities.runOnUIThread(gVar, 200L);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    if (!oVar.h) {
                        o1.k kVar = oVar.c.u;
                        if (((float) kVar.i) >= getWidth() / 2.0f) {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = 2.14748365E9f;
                        } else {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = -2.14748365E9f;
                        }
                        kVar.i = o.a(displayMetrics, f10);
                        oVar.d.u.i = o.b(getResources().getDisplayMetrics(), (float) oVar.d.u.i);
                        oVar.c.f();
                        oVar.d.f();
                    }
                    oVar.n = false;
                    oVar.f = false;
                    oVar.h = false;
                }
                return onTouchEvent;
            case 23:
                return (((ProfileActivity) this.c).k5 == 0.0f && (xcVar = (xc) this.b) != null && xcVar.b(motionEvent)) || super.onTouchEvent(motionEvent);
            case 25:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                if (secretMediaViewer.j0 == 0 && secretMediaViewer.G0 == 0) {
                    if (motionEvent.getPointerCount() == 1 && secretMediaViewer.I0.onTouchEvent(motionEvent) && secretMediaViewer.Y0) {
                        secretMediaViewer.Y0 = false;
                        secretMediaViewer.X0 = false;
                        secretMediaViewer.W0 = false;
                        secretMediaViewer.d(false);
                    } else if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                        secretMediaViewer.c1 = false;
                        vm0 vm0Var = secretMediaViewer.d1;
                        if (!vm0Var.q) {
                            vm0Var.a();
                        }
                        if (!secretMediaViewer.m0) {
                            if (motionEvent.getPointerCount() == 2) {
                                secretMediaViewer.K0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                secretMediaViewer.L0 = secretMediaViewer.v0;
                                secretMediaViewer.M0 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                                secretMediaViewer.N0 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                                secretMediaViewer.O0 = secretMediaViewer.t0;
                                secretMediaViewer.P0 = secretMediaViewer.u0;
                                secretMediaViewer.W0 = true;
                                secretMediaViewer.X0 = false;
                            } else if (motionEvent.getPointerCount() == 1) {
                                secretMediaViewer.Q0 = motionEvent.getX();
                                float y10 = motionEvent.getY();
                                secretMediaViewer.R0 = y10;
                                secretMediaViewer.n0 = y10;
                                secretMediaViewer.m0 = false;
                                secretMediaViewer.a1 = true;
                            }
                        }
                    } else {
                        float f11 = 0.0f;
                        if (motionEvent.getActionMasked() == 2) {
                            if (motionEvent.getPointerCount() == 2 && !secretMediaViewer.m0 && secretMediaViewer.W0) {
                                secretMediaViewer.c1 = true;
                                secretMediaViewer.v0 = (((float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0))) / secretMediaViewer.K0) * secretMediaViewer.L0;
                                secretMediaViewer.t0 = y3.A(secretMediaViewer.v0, secretMediaViewer.L0, (secretMediaViewer.M0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.O0, secretMediaViewer.M0 - (secretMediaViewer.e.getWidth() / 2));
                                float height = secretMediaViewer.N0 - (secretMediaViewer.e.getHeight() / 2);
                                float height2 = (secretMediaViewer.N0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.P0;
                                float f12 = secretMediaViewer.v0;
                                secretMediaViewer.u0 = y3.A(f12, secretMediaViewer.L0, height2, height);
                                secretMediaViewer.n(f12);
                                secretMediaViewer.e.invalidate();
                            } else if (motionEvent.getPointerCount() == 1) {
                                float abs = Math.abs(motionEvent.getX() - secretMediaViewer.Q0);
                                float abs2 = Math.abs(motionEvent.getY() - secretMediaViewer.n0);
                                if (abs > AndroidUtilities.dp(3.0f) || abs2 > AndroidUtilities.dp(3.0f)) {
                                    secretMediaViewer.c1 = true;
                                }
                                if (secretMediaViewer.a1 && !secretMediaViewer.m0 && secretMediaViewer.v0 == 1.0f && abs2 >= AndroidUtilities.dp(30.0f) && abs2 / 2.0f > abs) {
                                    secretMediaViewer.m0 = true;
                                    secretMediaViewer.X0 = false;
                                    secretMediaViewer.n0 = motionEvent.getY();
                                    if (secretMediaViewer.h0) {
                                        secretMediaViewer.m(false, true);
                                    }
                                } else if (secretMediaViewer.m0) {
                                    secretMediaViewer.u0 = motionEvent.getY() - secretMediaViewer.n0;
                                    secretMediaViewer.e.invalidate();
                                } else if (secretMediaViewer.Z0 || secretMediaViewer.G0 != 0) {
                                    secretMediaViewer.Z0 = false;
                                    secretMediaViewer.Q0 = motionEvent.getX();
                                    secretMediaViewer.R0 = motionEvent.getY();
                                } else {
                                    float x10 = secretMediaViewer.Q0 - motionEvent.getX();
                                    float y11 = secretMediaViewer.R0 - motionEvent.getY();
                                    if (secretMediaViewer.X0 || ((secretMediaViewer.v0 == 1.0f && Math.abs(y11) + AndroidUtilities.dp(12.0f) < Math.abs(x10)) || secretMediaViewer.v0 != 1.0f)) {
                                        if (!secretMediaViewer.X0) {
                                            secretMediaViewer.X0 = true;
                                            secretMediaViewer.a1 = false;
                                            x10 = 0.0f;
                                            y11 = 0.0f;
                                        }
                                        secretMediaViewer.Q0 = motionEvent.getX();
                                        secretMediaViewer.R0 = motionEvent.getY();
                                        secretMediaViewer.n(secretMediaViewer.v0);
                                        float f13 = secretMediaViewer.t0;
                                        if (f13 < secretMediaViewer.S0 || f13 > secretMediaViewer.T0) {
                                            x10 /= 3.0f;
                                        }
                                        float f14 = secretMediaViewer.V0;
                                        if (f14 == 0.0f) {
                                            float f15 = secretMediaViewer.U0;
                                            if (f15 == 0.0f) {
                                                float f16 = secretMediaViewer.u0 - y11;
                                                if (f16 < f15) {
                                                    secretMediaViewer.u0 = f15;
                                                } else {
                                                    if (f16 > f14) {
                                                        secretMediaViewer.u0 = f14;
                                                    }
                                                    f11 = y11;
                                                }
                                                secretMediaViewer.t0 = f13 - x10;
                                                if (secretMediaViewer.v0 != 1.0f) {
                                                    secretMediaViewer.u0 -= f11;
                                                }
                                                secretMediaViewer.e.invalidate();
                                            }
                                        }
                                        float f17 = secretMediaViewer.u0;
                                        if (f17 < secretMediaViewer.U0 || f17 > f14) {
                                            f11 = y11 / 3.0f;
                                            secretMediaViewer.t0 = f13 - x10;
                                            if (secretMediaViewer.v0 != 1.0f) {
                                            }
                                            secretMediaViewer.e.invalidate();
                                        }
                                        f11 = y11;
                                        secretMediaViewer.t0 = f13 - x10;
                                        if (secretMediaViewer.v0 != 1.0f) {
                                        }
                                        secretMediaViewer.e.invalidate();
                                    }
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                            if (secretMediaViewer.W0) {
                                secretMediaViewer.Z0 = true;
                                float f18 = secretMediaViewer.v0;
                                if (f18 < 1.0f) {
                                    secretMediaViewer.n(1.0f);
                                    secretMediaViewer.c(1.0f, 0.0f, 0.0f, true);
                                } else if (f18 > 3.0f) {
                                    float A = y3.A(3.0f, secretMediaViewer.L0, (secretMediaViewer.M0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.O0, secretMediaViewer.M0 - (secretMediaViewer.e.getWidth() / 2));
                                    float A2 = y3.A(3.0f, secretMediaViewer.L0, (secretMediaViewer.N0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.P0, secretMediaViewer.N0 - (secretMediaViewer.e.getHeight() / 2));
                                    secretMediaViewer.n(3.0f);
                                    float f19 = secretMediaViewer.S0;
                                    if (A >= f19) {
                                        f19 = secretMediaViewer.T0;
                                        break;
                                    }
                                    A = f19;
                                    float f20 = secretMediaViewer.U0;
                                    if (A2 >= f20) {
                                        f20 = secretMediaViewer.V0;
                                        break;
                                    }
                                    A2 = f20;
                                    secretMediaViewer.c(3.0f, A, A2, true);
                                } else {
                                    secretMediaViewer.d(true);
                                }
                                secretMediaViewer.W0 = false;
                            } else if (secretMediaViewer.m0) {
                                if (Math.abs(secretMediaViewer.n0 - motionEvent.getY()) > secretMediaViewer.e.getHeight() / 6.0f) {
                                    secretMediaViewer.e(true, false);
                                } else {
                                    secretMediaViewer.c(1.0f, 0.0f, 0.0f, false);
                                }
                                secretMediaViewer.m0 = false;
                            } else if (secretMediaViewer.X0) {
                                float f21 = secretMediaViewer.t0;
                                float f22 = secretMediaViewer.u0;
                                secretMediaViewer.n(secretMediaViewer.v0);
                                secretMediaViewer.X0 = false;
                                secretMediaViewer.a1 = true;
                                float f23 = secretMediaViewer.t0;
                                float f24 = secretMediaViewer.S0;
                                if (f23 >= f24) {
                                    f24 = secretMediaViewer.T0;
                                    break;
                                }
                                f21 = f24;
                                float f25 = secretMediaViewer.u0;
                                float f26 = secretMediaViewer.U0;
                                if (f25 >= f26) {
                                    f26 = secretMediaViewer.V0;
                                    break;
                                }
                                f22 = f26;
                                secretMediaViewer.c(secretMediaViewer.v0, f21, f22, false);
                            }
                        }
                    }
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        switch (this.a) {
            case 16:
                ((Paint) this.b).setColor(i10);
                break;
            default:
                super.setBackgroundColor(i10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        switch (this.a) {
            case 0:
                super.setTranslationX(f10);
                ((o) this.c).invalidate();
                break;
            default:
                super.setTranslationX(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 0:
                super.setTranslationY(f10);
                ((o) this.c).invalidate();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 15:
                return ((j6) this.b) == drawable || ((j6) this.c) == drawable || super.verifyDrawable(drawable);
            case 24:
                return drawable == ((t21) this.c).f || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, Object obj, int i10) {
        super(context);
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, int i10, g6 g6Var) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 4:
                super(context);
                LinearLayout f10 = y3.f(context, 1);
                org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
                this.b = k6Var;
                int i11 = k6.G6;
                k6Var.setTextColor(k6.v0(i11, g6Var));
                k6Var.setTextSize(AndroidUtilities.dp(17.0f));
                k6Var.setTypeface(AndroidUtilities.bold());
                f10.addView(k6Var, c6.q(-2, 23, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTextSize(1, 11.0f);
                textView.setTextColor(k6.v0(i11, g6Var));
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                f10.addView(textView, c6.q(-2, -2, 1));
                addView(f10, c6.e(-2, -2, 17));
                break;
            case 15:
                super(context);
                j6 j6Var = new j6(true, true, true, false);
                this.b = j6Var;
                pr prVar = pr.h;
                j6Var.k(0.3f, 430L, prVar);
                j6Var.u(AndroidUtilities.bold());
                j6Var.r(k6.v0(k6.A8, g6Var));
                j6Var.t(AndroidUtilities.dp(18.0f));
                j6Var.n(!LocaleController.isRTL);
                j6Var.setCallback(this);
                j6Var.G = AndroidUtilities.displaySize.x;
                j6 j6Var2 = new j6(true, true, true, false);
                this.c = j6Var2;
                j6Var2.k(0.3f, 430L, prVar);
                j6Var2.r(k6.v0(k6.B8, g6Var));
                j6Var2.t(AndroidUtilities.dp(14.0f));
                j6Var2.n(true ^ LocaleController.isRTL);
                j6Var2.setCallback(this);
                j6Var2.G = AndroidUtilities.displaySize.x;
                break;
            default:
                this.c = new b0(8);
                this.b = g6Var;
                break;
        }
    }

    private final void a(boolean z4) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(y0 y0Var, Context context) {
        super(context);
        this.a = 10;
        this.c = y0Var;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(d0 d0Var, Context context) {
        super(context);
        this.a = 7;
        this.c = d0Var;
        this.b = new t0(this, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(w41 w41Var, Context context) {
        super(context);
        this.a = 26;
        this.c = w41Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yb ybVar, Context context) {
        super(context);
        this.a = 11;
        this.c = ybVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(s sVar, Context context) {
        super(context);
        this.a = 6;
        this.c = sVar;
        this.b = new ng.o(this, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r5 r5Var, Activity activity) {
        super(activity);
        this.a = 9;
        this.c = r5Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h1 h1Var, Context context) {
        super(context);
        this.a = 18;
        this.c = h1Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(xd0 xd0Var, Context context) {
        super(context);
        this.a = 16;
        this.c = xd0Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, TextView textView, TextView textView2) {
        super(context);
        this.a = 22;
        this.b = textView;
        this.c = textView2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.a = 25;
        this.c = secretMediaViewer;
        this.b = secretMediaViewer;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(w61 w61Var, Context context) {
        super(context);
        this.a = 27;
        this.c = w61Var;
        this.b = new Rect();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(t21 t21Var, Activity activity, u21 u21Var) {
        super(activity);
        this.a = 24;
        this.c = t21Var;
        Rect rect = new Rect();
        this.b = rect;
        t21Var.a.setColor(u21Var.getThemedColor(k6.d6));
        Drawable drawable = t21Var.f;
        drawable.setCallback(this);
        drawable.getPadding(rect);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(mp mpVar, Context context) {
        super(context);
        this.a = 13;
        this.c = mpVar;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(qt qtVar, Activity activity) {
        super(activity);
        this.a = 20;
        this.c = qtVar;
        this.b = qtVar;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, jd1 jd1Var) {
        super(context);
        this.a = 29;
        this.c = jd1Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(a1 a1Var, Context context) {
        super(context);
        this.a = 2;
        this.c = a1Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(qk0 qk0Var, Context context) {
        super(context);
        this.a = 17;
        this.c = qk0Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context);
        this.a = 12;
        this.b = new Path();
        this.c = new h20();
    }
}
