package ah;

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
import android.os.SystemClock;
import android.text.TextUtils;
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
import dg.c1;
import eg.o1;
import eg.q1;
import eg.s0;
import f2.i0;
import f2.w;
import k7.b6;
import k7.n;
import kh.t0;
import lf.b0;
import m2.h;
import mg.c0;
import mg.d0;
import mg.g0;
import mg.o;
import mg.s;
import mg.y;
import o1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.r0;
import org.telegram.ui.Cells.y0;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.ka;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.voip.g1;
import org.telegram.ui.Components.voip.m2;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.at;
import org.telegram.ui.cd1;
import org.telegram.ui.d5;
import org.telegram.ui.g20;
import org.telegram.ui.gt0;
import org.telegram.ui.i41;
import org.telegram.ui.l21;
import org.telegram.ui.l4;
import org.telegram.ui.m21;
import org.telegram.ui.p41;
import org.telegram.ui.pt;
import org.telegram.ui.q61;
import org.telegram.ui.r5;
import org.telegram.ui.s51;
import org.telegram.ui.t51;
import org.telegram.ui.u51;
import org.telegram.ui.u70;
import org.telegram.ui.vy0;
import org.telegram.ui.y51;
import org.telegram.ui.zb;
import ph.f3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class d extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Context context, int i10) {
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
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        f6 f6Var;
        k5[] k5VarArr;
        char c3;
        float f10;
        ?? r10;
        float f11;
        float f12;
        z zVar;
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) this.c;
                b0Var.b(org.telegram.ui.ActionBar.j6.l1(0.65f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, (f6) this.b)));
                b0Var.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 2:
                ((q1) this.b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                q1 q1Var = (q1) this.b;
                q1Var.f.setAlpha(((o1) this.c).H);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, q1Var.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 8:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.b;
                int i10 = org.telegram.ui.ActionBar.j6.a7;
                f6Var = ((p2) ((r5) this.c).d).resourceProvider;
                paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint);
                break;
            case 9:
                RectF rectF2 = (RectF) this.b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                y0 y0Var = (y0) this.c;
                int measuredWidth = y0Var.getMeasuredWidth();
                int i11 = y0Var.d;
                float x10 = y0Var.getX();
                float f13 = y0Var.c;
                f6 f6Var2 = y0Var.b;
                if (f6Var2 != null) {
                    f6Var2.l(x10, f13, measuredWidth, i11);
                } else {
                    org.telegram.ui.ActionBar.j6.q(x10, f13, measuredWidth, i11);
                }
                float dp = AndroidUtilities.dp(18.0f);
                float dp2 = AndroidUtilities.dp(18.0f);
                Paint G = f6Var2 != null ? f6Var2.G("paintChatActionBackground") : null;
                if (G == null) {
                    G = org.telegram.ui.ActionBar.j6.S0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF2, dp, dp2, G);
                if (f6Var2 != null ? f6Var2.m0() : org.telegram.ui.ActionBar.j6.a1()) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    Paint G2 = f6Var2 != null ? f6Var2.G("paintChatActionBackgroundDarken") : null;
                    if (G2 == null) {
                        G2 = org.telegram.ui.ActionBar.j6.S0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF2, dp3, dp4, G2);
                }
                super.dispatchDraw(canvas);
                break;
            case 10:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, ((zb) this.c).f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                break;
            case 11:
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
                g20 g20Var = (g20) this.c;
                g20Var.b(canvas, rectF3, 1, 1.0f);
                rectF3.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                g20Var.b(canvas, rectF3, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                break;
            case 12:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.b;
                paint3.setColor(((kp) this.c).getThemedColor(org.telegram.ui.ActionBar.j6.d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint3);
                break;
            case 13:
                wy wyVar = (wy) this.c;
                if (!wyVar.D.r0 && wyVar.w > 0.0f) {
                    if (((Paint) this.b) == null) {
                        Paint paint4 = new Paint();
                        this.b = paint4;
                        paint4.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.b).setAlpha((int) (wyVar.w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.b);
                    canvas.restore();
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
            case 14:
                j6 j6Var = (j6) this.b;
                int dp6 = AndroidUtilities.dp(29.0f);
                int dp7 = AndroidUtilities.dp(18.83f);
                j6 j6Var2 = (j6) this.c;
                j6Var.setBounds(getPaddingLeft(), r3 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r3);
                j6Var.draw(canvas);
                j6Var2.setBounds(getPaddingLeft(), r2 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r2);
                j6Var2.draw(canvas);
                break;
            case 16:
                Paint paint5 = (Paint) this.b;
                pk0 pk0Var = (pk0) this.c;
                int i12 = pk0Var.J0;
                paint5.setColor((i12 == 1 || i12 == 2 || i12 == 4) ? i0.a.k(-1, 30) : i0.a.d(0.7f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, pk0Var.h0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, pk0Var.h0)));
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g10 = pk0Var.g();
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
            case 22:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                k5[] k5VarArr2 = profileActivity.r;
                if (profileActivity.T4 != null) {
                    canvas.save();
                    canvas.translate(k5VarArr2[0].getX(), k5VarArr2[0].getY());
                    k5VarArr = k5VarArr2;
                    c3 = 2;
                    f10 = 0.0f;
                    r10 = 0;
                    f11 = 24.0f;
                    f12 = 14.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.T4.getMeasuredWidth(), profileActivity.T4.getMeasuredHeight(), (int) ((1.0f - profileActivity.P1) * 255.0f), 31);
                    profileActivity.T4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    k5VarArr = k5VarArr2;
                    c3 = 2;
                    f10 = 0.0f;
                    r10 = 0;
                    f11 = 24.0f;
                    f12 = 14.0f;
                }
                if (profileActivity.m5 && profileActivity.V5 != f10 && profileActivity.k5 != 1.0f) {
                    float measuredHeight2 = (k5VarArr[1].getMeasuredHeight() / 2.0f) + k5VarArr[1].getY();
                    float dp8 = AndroidUtilities.dp(22.0f);
                    float x11 = ((k5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.l5)) - dp8) - profileActivity.Z3();
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
                            xcVar2.h = new vy0(this, r10);
                        }
                        float dp9 = (1.0f - profileActivity.k5) * AndroidUtilities.dp(28.0f);
                        float textWidth = k5VarArr[c3].getTextWidth();
                        float max = Math.max(textWidth, profileActivity.Q != null ? (AndroidUtilities.dp(f11) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.Q.getVisibilityFactor() : 0.0f) + dp9;
                        RectF rectF5 = AndroidUtilities.rectTmp;
                        rectF5.set(x11 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(f12), x11 + max + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(f12));
                        xc xcVar3 = (xc) this.b;
                        xcVar3.i = r10;
                        xcVar3.c = r10;
                        xcVar3.a(rectF5);
                        xc xcVar4 = (xc) this.b;
                        xcVar4.n = true;
                        int k10 = i0.a.k(-1, 50);
                        xcVar4.g.setColor((int) r10);
                        z zVar2 = xcVar4.e;
                        if (zVar2 != null) {
                            org.telegram.ui.ActionBar.j6.B1(zVar2, k10, true);
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
            case 23:
                Rect rect = (Rect) this.b;
                l21 l21Var = (l21) this.c;
                if (l21Var.O) {
                    l21Var.f.setBounds(-rect.left, -rect.top, getWidth() + rect.right, getHeight() + rect.bottom);
                    l21Var.f.draw(canvas);
                } else {
                    RectF rectF6 = AndroidUtilities.rectTmp;
                    rectF6.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                    canvas.drawRoundRect(rectF6, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), l21Var.a);
                }
                super.dispatchDraw(canvas);
                break;
            case 27:
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
            case 6:
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
            case 6:
                break;
            default:
                super.dispatchSetPressed(z4);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 7:
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
            case 17:
                int action = motionEvent.getAction();
                g1 g1Var = (g1) this.c;
                if (g1Var.G != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(g1Var.G.getX(), g1Var.G.getY());
                    boolean dispatchTouchEvent = g1Var.G.dispatchTouchEvent(motionEvent);
                    obtain2.recycle();
                    if (action == 1 || action == 3) {
                        g1Var.G = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = g1Var.C.onTouchEvent(obtain3);
                obtain3.recycle();
                boolean z4 = !g1Var.C.isInProgress() && ((GestureDetector) g1Var.D.b).onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    g1Var.E = false;
                    g1Var.F = false;
                    j jVar = g1Var.P;
                    if (!jVar.f) {
                        float f10 = g1Var.N;
                        jVar.b = f10;
                        jVar.c = true;
                        jVar.u.i = (g1Var.J / 2.0f) + f10 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - r7) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                        g1Var.P.f();
                    }
                    j jVar2 = g1Var.Q;
                    if (!jVar2.f) {
                        jVar2.b = g1Var.O;
                        jVar2.c = true;
                        jVar2.u.i = n.a(r2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - g1Var.K) - AndroidUtilities.dp(16.0f));
                        g1Var.Q.f();
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
            case 1:
                Path path = (Path) this.b;
                c1 c1Var = (c1) this.c;
                if (c1Var.h == null || (!((z4 = c1Var.f) && view == c1Var.d) && (z4 || view != c1Var.c))) {
                    return super.drawChild(canvas, view, j10);
                }
                float measuredWidth = ((z4 ? c1Var.e : 1.0f - c1Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            case 19:
                if (view instanceof hd0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 24:
                return view != ((SecretMediaViewer) this.b).w && super.drawChild(canvas, view, j10);
            case 25:
                Path path2 = (Path) this.b;
                p41 p41Var = (p41) this.c;
                RectF rectF = p41Var.O;
                if (view == p41Var.K || view == p41Var.x) {
                    canvas.save();
                    canvas.clipRect(0.0f, AndroidUtilities.lerp(p41Var.Q, 0.0f, p41Var.s), getWidth(), AndroidUtilities.lerp(p41Var.R, getHeight(), p41Var.s));
                    boolean drawChild2 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild2;
                }
                if (view != p41Var.M) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                path2.rewind();
                path2.addCircle(rectF.centerX() + p41Var.K.getX(), rectF.centerY() + p41Var.K.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.clipRect(0.0f, AndroidUtilities.lerp(p41Var.Q, 0.0f, p41Var.s), getWidth(), AndroidUtilities.lerp(p41Var.R, getHeight(), p41Var.s));
                canvas.translate(-p41Var.M.getX(), -p41Var.M.getY());
                canvas.translate(p41Var.K.getX() + rectF.left, p41Var.K.getY() + rectF.top);
                canvas.scale(rectF.width() / p41Var.M.getMeasuredWidth(), rectF.height() / p41Var.M.getMeasuredHeight(), p41Var.M.getX(), p41Var.M.getY());
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            case 26:
                if (view != ((q61) this.c).e0 || !g0.b || !g0.f) {
                    return super.drawChild(canvas, view, j10);
                }
                for (int i10 = 0; i10 < ((q61) this.c).e0.getChildCount(); i10++) {
                    View childAt = ((q61) this.c).e0.getChildAt(i10);
                    if (childAt instanceof y51) {
                        y51 y51Var = (y51) childAt;
                        if (y51Var.getAnimatedScale() == 1.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        } else if (y51Var.getAnimatedScale() > 0.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            ((Rect) this.b).set((int) (r2.centerX() - (y51Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f))), (int) (((Rect) this.b).centerY() - (y51Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f))), (int) ((y51Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f)) + ((Rect) this.b).centerX()), (int) ((y51Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f)) + ((Rect) this.b).centerY()));
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            canvas.scale(y51Var.getAnimatedScale(), y51Var.getAnimatedScale(), ((Rect) this.b).centerX(), ((Rect) this.b).centerY());
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        }
                    } else if ((childAt instanceof TextView) || (childAt instanceof t51) || (childAt instanceof s51) || (childAt instanceof u51)) {
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
            case 6:
                d0 d0Var = (d0) this.c;
                float f10 = d0Var.u;
                float f11 = rect.bottom;
                if (f10 != f11 && d0Var.v) {
                    d0Var.u = f11;
                    d dVar = d0Var.c;
                    c0 c0Var = d0Var.a;
                    if (!d0Var.q) {
                        float f12 = d0Var.t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = d0Var.y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f13 = dp;
                        if (c0Var.getMeasuredHeight() + f12 > (dVar.getMeasuredHeight() - d0Var.u) - f13) {
                            f12 = ((dVar.getMeasuredHeight() - d0Var.u) - c0Var.getMeasuredHeight()) - f13;
                        }
                        if (f12 < 0.0f) {
                            f12 = 0.0f;
                        }
                        c0Var.animate().translationY(f12).setDuration(250L).setUpdateListener(new y(d0Var, 1)).setInterpolator(nr.f).start();
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
            case 29:
                super.invalidate();
                r0 r0Var = ((cd1) this.c).q0;
                if (r0Var != null) {
                    r0Var.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 5:
                super.onAttachedToWindow();
                ((o) this.b).c();
                break;
            case 6:
                super.onAttachedToWindow();
                ic.a(this, (t0) this.b);
                break;
            case 19:
                super.onAttachedToWindow();
                pt ptVar = (pt) this.c;
                ptVar.A.onAttachedToWindow();
                ptVar.B.onAttachedToWindow();
                break;
            case 22:
                super.onAttachedToWindow();
                ((ProfileActivity) this.c).o5.onAttachedToWindow();
                break;
            case 24:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.b).h.onAttachedToWindow();
                break;
            case 27:
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
            case 17:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                g1 g1Var = (g1) this.c;
                AndroidUtilities.setPreferredMaxRefreshRate(g1Var.b, g1Var.d, g1Var.c);
                g1Var.i(false);
                break;
            default:
                super.onConfigurationChanged(configuration);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 5:
                super.onDetachedFromWindow();
                ((o) this.b).d();
                break;
            case 6:
                super.onDetachedFromWindow();
                ic.h(this);
                break;
            case 19:
                super.onDetachedFromWindow();
                pt ptVar = (pt) this.c;
                ptVar.A.onDetachedFromWindow();
                ptVar.B.onDetachedFromWindow();
                break;
            case 22:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.c).o5.onDetachedFromWindow();
                break;
            case 24:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.b).h.onDetachedFromWindow();
                break;
            case 27:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.b).onDetachedFromWindow();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        int min;
        Drawable drawable;
        float f10;
        switch (this.a) {
            case 15:
                vd0 vd0Var = (vd0) this.c;
                Drawable drawable2 = vd0Var.a;
                if (drawable2 == null) {
                    super.onDraw(canvas);
                } else if ((drawable2 instanceof dc0) || (drawable2 instanceof ColorDrawable) || (drawable2 instanceof GradientDrawable)) {
                    drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    vd0Var.a.draw(canvas);
                } else {
                    float max = Math.max(getMeasuredWidth() / vd0Var.a.getIntrinsicWidth(), (getMeasuredHeight() + vd0Var.D) / vd0Var.a.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(vd0Var.a.getIntrinsicWidth() * max);
                    int ceil2 = (int) Math.ceil(vd0Var.a.getIntrinsicHeight() * max);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int measuredHeight = ((getMeasuredHeight() - ceil2) + vd0Var.D) / 2;
                    vd0Var.a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
                    vd0Var.a.draw(canvas);
                }
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.b);
                break;
            case 18:
                canvas.save();
                m2 m2Var = (m2) this.c;
                canvas.scale(m2Var.b.getScaleX(), m2Var.b.getScaleY(), m2Var.b.getPivotX() + m2Var.b.getLeft(), m2Var.b.getPivotY() + m2Var.b.getTop());
                Drawable drawable3 = (Drawable) this.b;
                drawable3.setBounds(m2Var.b.getLeft() - AndroidUtilities.dp(2.0f), m2Var.b.getTop() - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f) + m2Var.b.getRight(), AndroidUtilities.dp(2.0f) + m2Var.b.getBottom());
                drawable3.draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                break;
            case 19:
                pt ptVar = (pt) this.b;
                Paint paint = ptVar.N;
                ImageReceiver imageReceiver = ptVar.B;
                ColorDrawable colorDrawable = ptVar.u;
                ImageReceiver imageReceiver2 = ptVar.A;
                if (ptVar.z != null && colorDrawable != null) {
                    if (ptVar.K && ptVar.v == null && ptVar.w != null && !ptVar.e0) {
                        ptVar.e0 = true;
                        imageReceiver2.setVisible(false, false);
                        im0.d(new d5(ptVar, 8));
                    }
                    if (ptVar.v != null) {
                        boolean z4 = ptVar.K;
                        if (z4) {
                            float f11 = ptVar.M;
                            if (f11 != 1.0f) {
                                float f12 = f11 + 0.13333334f;
                                ptVar.M = f12;
                                if (f12 > 1.0f) {
                                    ptVar.M = 1.0f;
                                }
                                ptVar.z.invalidate();
                                f10 = ptVar.M;
                                if (f10 != 0.0f && ptVar.v != null) {
                                    paint.setAlpha((int) (f10 * 255.0f));
                                    if (paint.getAlpha() != 255) {
                                        canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(ptVar.M, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, ptVar.c0)));
                                    }
                                    canvas.drawPaint(paint);
                                }
                            }
                        }
                        if (!z4) {
                            float f13 = ptVar.M;
                            if (f13 != 0.0f) {
                                float f14 = f13 - 0.13333334f;
                                ptVar.M = f14;
                                if (f14 < 0.0f) {
                                    ptVar.M = 0.0f;
                                }
                                ptVar.z.invalidate();
                            }
                        }
                        f10 = ptVar.M;
                        if (f10 != 0.0f) {
                            paint.setAlpha((int) (f10 * 255.0f));
                            if (paint.getAlpha() != 255) {
                            }
                            canvas.drawPaint(paint);
                        }
                    }
                    colorDrawable.setAlpha((int) (ptVar.F * 180.0f));
                    colorDrawable.setBounds(0, 0, ptVar.z.getWidth(), ptVar.z.getHeight());
                    colorDrawable.draw(canvas);
                    canvas.save();
                    i0.b bVar = ptVar.q;
                    int i10 = bVar.d;
                    int i11 = bVar.b;
                    int i12 = i10 + i11;
                    if (ptVar.V == 1) {
                        min = Math.min(ptVar.z.getWidth(), ptVar.z.getHeight() - i12) - AndroidUtilities.dp(40.0f);
                    } else {
                        min = (int) (ptVar.S ? Math.min(ptVar.z.getWidth(), ptVar.z.getHeight() - i12) - AndroidUtilities.dpf2(40.0f) : Math.min(ptVar.z.getWidth(), ptVar.z.getHeight() - i12) / 1.8f);
                    }
                    float max2 = Math.max((min / 2) + i11 + (ptVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((ptVar.z.getHeight() - i12) - ptVar.I) / 2);
                    if (ptVar.S) {
                        max2 += AndroidUtilities.dp(40.0f);
                    }
                    canvas.translate(ptVar.z.getWidth() / 2, ptVar.e + max2);
                    int i13 = (int) (min * ((ptVar.F * 0.8f) / 0.8f));
                    if (ptVar.V == 3) {
                        canvas.translate(0.0f, AndroidUtilities.dp(70.0f));
                    }
                    if (ptVar.S) {
                        float f15 = i13;
                        float f16 = 0.6669f * f15;
                        imageReceiver2.setAlpha(ptVar.F);
                        float f17 = f15 - f16;
                        float f18 = f15 / 2.0f;
                        imageReceiver2.setImageCoords((f17 - f18) - (0.0546875f * f15), (f17 / 2.0f) - f18, f16, f16);
                        imageReceiver2.draw(canvas);
                        imageReceiver.setAlpha(ptVar.F);
                        float f19 = (-i13) / 2.0f;
                        imageReceiver.setImageCoords(f19, f19, f15, f15);
                        imageReceiver.draw(canvas);
                    } else {
                        imageReceiver2.setAlpha(ptVar.F);
                        float f20 = (-i13) / 2.0f;
                        float f21 = i13;
                        imageReceiver2.setImageCoords(f20, f20, f21, f21);
                        imageReceiver2.draw(canvas);
                    }
                    if (ptVar.C != null) {
                        canvas.save();
                        float f22 = (-i13) / 2.0f;
                        canvas.translate(f22, f22);
                        float f23 = i13;
                        canvas.scale(f23 / ptVar.C.getWidth(), f23 / ptVar.C.getHeight());
                        ptVar.C.setAlpha(ptVar.F);
                        if (ptVar.D == null) {
                            ptVar.D = new Path();
                        }
                        ptVar.D.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, ptVar.C.getWidth(), ptVar.C.getHeight());
                        float f24 = f23 / 8.0f;
                        ptVar.D.addRoundRect(rectF, f24, f24, Path.Direction.CW);
                        canvas.clipPath(ptVar.D);
                        ptVar.C.draw(canvas);
                        canvas.restore();
                    }
                    if (ptVar.V == 1 && !ptVar.m && (drawable = ptVar.J) != null) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = ptVar.J.getIntrinsicHeight();
                        int dp = (int) (imageReceiver2.getDrawRegion().top - AndroidUtilities.dp(((ptVar.d / AndroidUtilities.dp(60.0f)) * 6.0f) + 17.0f));
                        ptVar.J.setAlpha((int) ((1.0f - ptVar.g) * 255.0f));
                        ptVar.J.setBounds((-intrinsicWidth) / 2, (-intrinsicHeight) + dp, intrinsicWidth / 2, dp);
                        ptVar.J.draw(canvas);
                    }
                    if (ptVar.G != null) {
                        if (ptVar.S) {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
                        } else {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver2.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
                        }
                        pt.f0.setAlpha((int) (ptVar.F * 255.0f));
                        ptVar.G.draw(canvas);
                    }
                    canvas.restore();
                    if (ptVar.E) {
                        if (ptVar.F != 1.0f) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j10 = currentTimeMillis - ptVar.H;
                            ptVar.H = currentTimeMillis;
                            ptVar.F = (j10 / 120.0f) + ptVar.F;
                            ptVar.z.invalidate();
                            if (ptVar.F > 1.0f) {
                                ptVar.F = 1.0f;
                                break;
                            }
                        }
                    } else if (ptVar.F != 0.0f) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long j11 = currentTimeMillis2 - ptVar.H;
                        ptVar.H = currentTimeMillis2;
                        ptVar.F -= j11 / 120.0f;
                        ptVar.z.invalidate();
                        if (ptVar.F < 0.0f) {
                            ptVar.F = 0.0f;
                        }
                        if (ptVar.F == 0.0f) {
                            imageReceiver2.setImageBitmap((Drawable) null);
                            AndroidUtilities.unlockOrientation(ptVar.w);
                            AndroidUtilities.runOnUIThread(new at(ptVar, 1));
                            Bitmap bitmap = ptVar.v;
                            if (bitmap != null) {
                                bitmap.recycle();
                                ptVar.v = null;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(ptVar.O, false, 1.0f, false);
                            ptVar.M = 0.0f;
                            try {
                                if (ptVar.y.getParent() != null) {
                                    ((WindowManager) ptVar.w.getSystemService("window")).removeView(ptVar.y);
                                    break;
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                    }
                }
                break;
            case 24:
                SecretMediaViewer.b((SecretMediaViewer) this.b, canvas);
                break;
            case 28:
                int intrinsicHeight2 = org.telegram.ui.ActionBar.j6.i3.getIntrinsicHeight();
                org.telegram.ui.ActionBar.j6.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight2);
                org.telegram.ui.ActionBar.j6.i3.draw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(((cd1) this.c).getThemedColor(org.telegram.ui.ActionBar.j6.Sd));
                canvas.drawRect(0.0f, intrinsicHeight2, getMeasuredWidth(), getMeasuredHeight(), paint2);
                break;
            case 29:
                int[] iArr = (int[]) this.b;
                cd1 cd1Var = (cd1) this.c;
                if (!AndroidUtilities.usingHardwareInput) {
                    getLocationInWindow(iArr);
                    if (cd1Var.p0.getTranslationY() != iArr[1]) {
                        cd1Var.p0.setTranslationY(-r0);
                        cd1Var.q0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < cd1Var.M) {
                        invalidate();
                        break;
                    }
                }
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
            case 22:
                return (((ProfileActivity) this.c).k5 == 0.0f && (xcVar = (xc) this.b) != null && xcVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 20:
                super.onLayout(z4, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int x10 = org.telegram.ui.b.x(275.0f, i15, 2);
                u70 u70Var = (u70) this.c;
                FrameLayout frameLayout = u70Var.r;
                frameLayout.layout(0, x10, frameLayout.getMeasuredWidth(), u70Var.r.getMeasuredHeight() + x10);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + x10;
                int measuredWidth = (getMeasuredWidth() - u70Var.e.getMeasuredWidth()) / 2;
                ka kaVar = u70Var.e;
                kaVar.layout(measuredWidth, dp, kaVar.getMeasuredWidth() + measuredWidth, u70Var.e.getMeasuredHeight() + dp);
                h hVar = u70Var.d;
                hVar.layout(0, 0, hVar.getMeasuredWidth(), u70Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - u70Var.n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - u70Var.n.getMeasuredWidth()) / 2;
                s0 s0Var = u70Var.n;
                s0Var.layout(measuredWidth2, measuredHeight, s0Var.getMeasuredWidth() + measuredWidth2, u70Var.n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - u70Var.f.getMeasuredWidth()) / 2;
                TextView textView = u70Var.f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), u70Var.f.getMeasuredWidth() + measuredWidth3, dp2);
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int dp3 = AndroidUtilities.dp(4) + (AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight);
                if (marginLayoutParams.topMargin != dp3) {
                    marginLayoutParams.topMargin = dp3;
                    frameLayout2.requestLayout();
                    break;
                }
                break;
            case 21:
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + org.telegram.ui.b.x(275.0f, ((i13 - i11) / 4) * 3, 2);
                int dp5 = AndroidUtilities.dp(18.0f);
                TextView textView2 = (TextView) this.b;
                textView2.layout(dp5, dp4, textView2.getMeasuredWidth() + dp5, textView2.getMeasuredHeight() + dp4);
                int dp6 = AndroidUtilities.dp(18.0f) + dp4 + ((int) textView2.getTextSize());
                int dp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.c;
                textView3.layout(dp7, dp6, textView3.getMeasuredWidth() + dp7, textView3.getMeasuredHeight() + dp6);
                break;
            case 22:
                super.onLayout(z4, i10, i11, i12, i13);
                ((ProfileActivity) this.c).V4();
                break;
            case 23:
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                break;
            case 24:
                super.onLayout(z4, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                if (secretMediaViewer.n != null) {
                    int currentActionBarHeight = ((k.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    i41 i41Var = secretMediaViewer.n;
                    i41Var.layout(i41Var.getLeft(), currentActionBarHeight, secretMediaViewer.n.getRight(), secretMediaViewer.n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.r != null && secretMediaViewer.n != null) {
                    int measuredHeight2 = (secretMediaViewer.n.getMeasuredHeight() + (((k.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    f3 f3Var = secretMediaViewer.r;
                    f3Var.layout(f3Var.getLeft(), measuredHeight2, secretMediaViewer.r.getRight(), secretMediaViewer.r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.X != null) {
                    int currentActionBarHeight2 = k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    gt0 gt0Var = secretMediaViewer.X;
                    gt0Var.layout(gt0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.X.getRight(), secretMediaViewer.X.getMeasuredHeight() + currentActionBarHeight2);
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
        i0 wVar;
        switch (this.a) {
            case 2:
                super.onMeasure(i10, org.telegram.ui.b.B(2.0f, ((o1) this.c).s, TLObject.FLAG_30));
                break;
            case 7:
                super.onMeasure(i10, i11);
                super.onMeasure(i10, org.telegram.ui.b.B(8.0f, ((LinearLayout) this.b).getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 12:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                break;
            case 14:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
                setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                break;
            case 23:
                l21 l21Var = (l21) this.c;
                View view = l21Var.E;
                View view2 = l21Var.F;
                LinearLayout linearLayout = l21Var.v;
                TextView textView = l21Var.s;
                sl0 sl0Var = l21Var.y;
                boolean z4 = l21Var.P.M;
                int dp = AndroidUtilities.dp(12.0f);
                if (z4) {
                    sl0Var.setLayoutParams(b6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
                    sl0Var.setPadding(dp, 0, dp, 0);
                    if (linearLayout != null) {
                        textView.setLayoutParams(b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(b6.d(-1, 48.0f, 8388691, 16.0f, 162.0f, 16.0f, 16.0f));
                    } else {
                        textView.setLayoutParams(b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
                    }
                } else {
                    sl0Var.setPadding(dp, dp / 2, dp, dp);
                    if (linearLayout != null) {
                        sl0Var.setLayoutParams(b6.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 136.0f));
                        textView.setLayoutParams(b6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(b6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    } else {
                        sl0Var.setLayoutParams(b6.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 80.0f));
                        textView.setLayoutParams(b6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    }
                }
                if (z4) {
                    view2.setVisibility(8);
                    view.setVisibility(8);
                } else {
                    int i12 = textView != null ? 136 : 80;
                    view2.setVisibility(0);
                    view2.setLayoutParams(b6.d(-1, AndroidUtilities.dp(2.0f), 80, 0.0f, 0.0f, 0.0f, i12));
                    view.setVisibility(0);
                    view.setLayoutParams(b6.d(-1, AndroidUtilities.dp(2.0f), 48, 0.0f, 44.0f, 0.0f, 0.0f));
                }
                if (l21Var.O != z4) {
                    m21 m21Var = l21Var.d;
                    if (z4) {
                        m21Var.getParentActivity();
                        wVar = new i0(0, false);
                    } else {
                        m21Var.getParentActivity();
                        wVar = new w(3, false);
                    }
                    l21Var.D = wVar;
                    sl0Var.setLayoutManager(wVar);
                    sl0Var.requestLayout();
                    int i13 = l21Var.I;
                    if (i13 != -1) {
                        l21Var.b(i13);
                    }
                    l21Var.O = z4;
                }
                super.onMeasure(i10, i11);
                break;
            case 24:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                gt0 gt0Var = secretMediaViewer.X;
                if (gt0Var != null) {
                    gt0Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((measuredHeight - k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - (secretMediaViewer.R.getVisibility() != 0 ? 0 : secretMediaViewer.R.getMeasuredHeight()), TLObject.FLAG_30));
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
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                b0 b0Var = (b0) this.c;
                b0Var.setBounds(0, 0, i10, i11);
                b0Var.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                break;
            case 17:
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
        xc xcVar;
        switch (this.a) {
            case 22:
                return (((ProfileActivity) this.c).k5 == 0.0f && (xcVar = (xc) this.b) != null && xcVar.b(motionEvent)) || super.onTouchEvent(motionEvent);
            case 23:
            default:
                return super.onTouchEvent(motionEvent);
            case 24:
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
                        float f10 = 0.0f;
                        if (motionEvent.getActionMasked() == 2) {
                            if (motionEvent.getPointerCount() == 2 && !secretMediaViewer.m0 && secretMediaViewer.W0) {
                                secretMediaViewer.c1 = true;
                                secretMediaViewer.v0 = (((float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0))) / secretMediaViewer.K0) * secretMediaViewer.L0;
                                secretMediaViewer.t0 = y3.A(secretMediaViewer.v0, secretMediaViewer.L0, (secretMediaViewer.M0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.O0, secretMediaViewer.M0 - (secretMediaViewer.e.getWidth() / 2));
                                float height = secretMediaViewer.N0 - (secretMediaViewer.e.getHeight() / 2);
                                float height2 = (secretMediaViewer.N0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.P0;
                                float f11 = secretMediaViewer.v0;
                                secretMediaViewer.u0 = y3.A(f11, secretMediaViewer.L0, height2, height);
                                secretMediaViewer.n(f11);
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
                                        float f12 = secretMediaViewer.t0;
                                        if (f12 < secretMediaViewer.S0 || f12 > secretMediaViewer.T0) {
                                            x10 /= 3.0f;
                                        }
                                        float f13 = secretMediaViewer.V0;
                                        if (f13 == 0.0f) {
                                            float f14 = secretMediaViewer.U0;
                                            if (f14 == 0.0f) {
                                                float f15 = secretMediaViewer.u0 - y11;
                                                if (f15 < f14) {
                                                    secretMediaViewer.u0 = f14;
                                                } else {
                                                    if (f15 > f13) {
                                                        secretMediaViewer.u0 = f13;
                                                    }
                                                    f10 = y11;
                                                }
                                                secretMediaViewer.t0 = f12 - x10;
                                                if (secretMediaViewer.v0 != 1.0f) {
                                                    secretMediaViewer.u0 -= f10;
                                                }
                                                secretMediaViewer.e.invalidate();
                                            }
                                        }
                                        float f16 = secretMediaViewer.u0;
                                        if (f16 < secretMediaViewer.U0 || f16 > f13) {
                                            f10 = y11 / 3.0f;
                                            secretMediaViewer.t0 = f12 - x10;
                                            if (secretMediaViewer.v0 != 1.0f) {
                                            }
                                            secretMediaViewer.e.invalidate();
                                        }
                                        f10 = y11;
                                        secretMediaViewer.t0 = f12 - x10;
                                        if (secretMediaViewer.v0 != 1.0f) {
                                        }
                                        secretMediaViewer.e.invalidate();
                                    }
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                            if (secretMediaViewer.W0) {
                                secretMediaViewer.Z0 = true;
                                float f17 = secretMediaViewer.v0;
                                if (f17 < 1.0f) {
                                    secretMediaViewer.n(1.0f);
                                    secretMediaViewer.c(1.0f, 0.0f, 0.0f, true);
                                } else if (f17 > 3.0f) {
                                    float A = y3.A(3.0f, secretMediaViewer.L0, (secretMediaViewer.M0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.O0, secretMediaViewer.M0 - (secretMediaViewer.e.getWidth() / 2));
                                    float A2 = y3.A(3.0f, secretMediaViewer.L0, (secretMediaViewer.N0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.P0, secretMediaViewer.N0 - (secretMediaViewer.e.getHeight() / 2));
                                    secretMediaViewer.n(3.0f);
                                    float f18 = secretMediaViewer.S0;
                                    if (A >= f18) {
                                        f18 = secretMediaViewer.T0;
                                        break;
                                    }
                                    A = f18;
                                    float f19 = secretMediaViewer.U0;
                                    if (A2 >= f19) {
                                        f19 = secretMediaViewer.V0;
                                        break;
                                    }
                                    A2 = f19;
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
                                float f20 = secretMediaViewer.t0;
                                float f21 = secretMediaViewer.u0;
                                secretMediaViewer.n(secretMediaViewer.v0);
                                secretMediaViewer.X0 = false;
                                secretMediaViewer.a1 = true;
                                float f22 = secretMediaViewer.t0;
                                float f23 = secretMediaViewer.S0;
                                if (f22 >= f23) {
                                    f23 = secretMediaViewer.T0;
                                    break;
                                }
                                f20 = f23;
                                float f24 = secretMediaViewer.u0;
                                float f25 = secretMediaViewer.U0;
                                if (f24 >= f25) {
                                    f25 = secretMediaViewer.V0;
                                    break;
                                }
                                f21 = f25;
                                secretMediaViewer.c(secretMediaViewer.v0, f20, f21, false);
                            }
                        }
                    }
                }
                return true;
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        switch (this.a) {
            case 15:
                ((Paint) this.b).setColor(i10);
                break;
            default:
                super.setBackgroundColor(i10);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 14:
                return ((j6) this.b) == drawable || ((j6) this.c) == drawable || super.verifyDrawable(drawable);
            case 23:
                return drawable == ((l21) this.c).f || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, Object obj, int i10) {
        super(context);
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, int i10, f6 f6Var) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 3:
                super(context);
                LinearLayout f10 = y3.f(context, 1);
                k6 k6Var = new k6(context, false, false, false);
                this.b = k6Var;
                int i11 = org.telegram.ui.ActionBar.j6.G6;
                k6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
                k6Var.setTextSize(AndroidUtilities.dp(17.0f));
                k6Var.setTypeface(AndroidUtilities.bold());
                f10.addView(k6Var, b6.q(-2, 23, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTextSize(1, 11.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                f10.addView(textView, b6.q(-2, -2, 1));
                addView(f10, b6.e(-2, -2, 17));
                break;
            case 14:
                super(context);
                j6 j6Var = new j6(true, true, true, false);
                this.b = j6Var;
                nr nrVar = nr.h;
                j6Var.k(0.3f, 430L, nrVar);
                j6Var.u(AndroidUtilities.bold());
                j6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, f6Var));
                j6Var.t(AndroidUtilities.dp(18.0f));
                j6Var.n(!LocaleController.isRTL);
                j6Var.setCallback(this);
                j6Var.G = AndroidUtilities.displaySize.x;
                j6 j6Var2 = new j6(true, true, true, false);
                this.c = j6Var2;
                j6Var2.k(0.3f, 430L, nrVar);
                j6Var2.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, f6Var));
                j6Var2.t(AndroidUtilities.dp(14.0f));
                j6Var2.n(true ^ LocaleController.isRTL);
                j6Var2.setCallback(this);
                j6Var2.G = AndroidUtilities.displaySize.x;
                break;
            default:
                this.c = new b0(8);
                this.b = f6Var;
                break;
        }
    }

    private final void a(boolean z4) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(y0 y0Var, Context context) {
        super(context);
        this.a = 9;
        this.c = y0Var;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(d0 d0Var, Context context) {
        super(context);
        this.a = 6;
        this.c = d0Var;
        this.b = new t0(this, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p41 p41Var, Context context) {
        super(context);
        this.a = 25;
        this.c = p41Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zb zbVar, Context context) {
        super(context);
        this.a = 10;
        this.c = zbVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(s sVar, Context context) {
        super(context);
        this.a = 5;
        this.c = sVar;
        this.b = new o(this, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r5 r5Var, Activity activity) {
        super(activity);
        this.a = 8;
        this.c = r5Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g1 g1Var, Context context) {
        super(context);
        this.a = 17;
        this.c = g1Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(vd0 vd0Var, Context context) {
        super(context);
        this.a = 15;
        this.c = vd0Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, TextView textView, TextView textView2) {
        super(context);
        this.a = 21;
        this.b = textView;
        this.c = textView2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.a = 24;
        this.c = secretMediaViewer;
        this.b = secretMediaViewer;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(q61 q61Var, Context context) {
        super(context);
        this.a = 26;
        this.c = q61Var;
        this.b = new Rect();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l21 l21Var, Activity activity, m21 m21Var) {
        super(activity);
        this.a = 23;
        this.c = l21Var;
        Rect rect = new Rect();
        this.b = rect;
        l21Var.a.setColor(m21Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        Drawable drawable = l21Var.f;
        drawable.setCallback(this);
        drawable.getPadding(rect);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kp kpVar, Context context) {
        super(context);
        this.a = 12;
        this.c = kpVar;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(pt ptVar, Activity activity) {
        super(activity);
        this.a = 19;
        this.c = ptVar;
        this.b = ptVar;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(cd1 cd1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 29:
                this.c = cd1Var;
                super(context);
                this.b = new int[2];
                break;
            default:
                this.c = cd1Var;
                this.b = new Paint();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c1 c1Var, Context context) {
        super(context);
        this.a = 1;
        this.c = c1Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(pk0 pk0Var, Context context) {
        super(context);
        this.a = 16;
        this.c = pk0Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        this.a = 11;
        this.b = new Path();
        this.c = new g20();
    }
}
