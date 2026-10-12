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
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.d4;
import di.l6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.voip.k2;
import org.telegram.ui.Components.zp;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.Wallet.l4;
import org.telegram.ui.Wallet.z4;
import org.telegram.ui.a71;
import org.telegram.ui.ce1;
import org.telegram.ui.f5;
import org.telegram.ui.gc;
import org.telegram.ui.h80;
import org.telegram.ui.iu0;
import org.telegram.ui.jt;
import org.telegram.ui.k31;
import org.telegram.ui.k4;
import org.telegram.ui.k51;
import org.telegram.ui.l31;
import org.telegram.ui.p20;
import org.telegram.ui.r51;
import org.telegram.ui.r71;
import org.telegram.ui.s5;
import org.telegram.ui.u61;
import org.telegram.ui.uz0;
import org.telegram.ui.v61;
import org.telegram.ui.w61;
import org.telegram.ui.xt;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
    }

    public void b(String str, boolean z10) {
        ((r6) this.c).t(str, z10 && !LocaleController.isRTL, true);
    }

    public void c(String str, boolean z10) {
        ((r6) this.b).t(str, z10 && !LocaleController.isRTL, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        c6 c6Var;
        h5[] h5VarArr;
        char c10;
        float f7;
        float f10;
        org.telegram.ui.Cells.z zVar;
        int i10 = 0;
        switch (this.a) {
            case 5:
                zf.z zVar2 = (zf.z) this.c;
                zVar2.b(g6.m1(0.65f, g6.w0(g6.d6, (c6) this.b)));
                zVar2.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 6:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 23:
            case 24:
            case 25:
            case 27:
            case 28:
            default:
                super.dispatchDraw(canvas);
                break;
            case 7:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.b;
                int i11 = g6.a7;
                c6Var = ((m2) ((s5) this.c).d).resourceProvider;
                paint.setColor(g6.w0(i11, c6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint);
                break;
            case 8:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.a1 a1Var = (org.telegram.ui.Cells.a1) this.c;
                int measuredWidth = a1Var.getMeasuredWidth();
                int i12 = a1Var.d;
                float x10 = a1Var.getX();
                float f11 = a1Var.c;
                c6 c6Var2 = a1Var.b;
                if (c6Var2 != null) {
                    c6Var2.l(x10, f11, measuredWidth, i12);
                } else {
                    g6.q(x10, f11, measuredWidth, i12);
                }
                float dp = AndroidUtilities.dp(18.0f);
                float dp2 = AndroidUtilities.dp(18.0f);
                Paint G = c6Var2 != null ? c6Var2.G("paintChatActionBackground") : null;
                if (G == null) {
                    G = g6.T0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, dp, dp2, G);
                if (c6Var2 != null ? c6Var2.m0() : g6.b1()) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    Paint G2 = c6Var2 != null ? c6Var2.G("paintChatActionBackgroundDarken") : null;
                    if (G2 == null) {
                        G2 = g6.T0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, dp3, dp4, G2);
                }
                super.dispatchDraw(canvas);
                break;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(g6.w0(g6.a7, ((gc) this.c).f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                break;
            case 10:
                float dp5 = AndroidUtilities.dp(20.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.b;
                path.rewind();
                path.addRoundRect(rectF2, dp5, dp5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                super.dispatchDraw(canvas);
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + getPaddingTop());
                p20 p20Var = (p20) this.c;
                p20Var.b(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                p20Var.b(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                break;
            case 11:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.b;
                paint3.setColor(((zp) this.c).getThemedColor(g6.d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint3);
                break;
            case 12:
                iz izVar = (iz) this.c;
                if (!izVar.G.u0 && izVar.w > 0.0f) {
                    if (((Paint) this.b) == null) {
                        Paint paint4 = new Paint();
                        this.b = paint4;
                        paint4.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.b).setAlpha((int) (izVar.w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.b);
                    canvas.restore();
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
                break;
            case 13:
                r6 r6Var = (r6) this.b;
                int dp6 = AndroidUtilities.dp(29.0f);
                int dp7 = AndroidUtilities.dp(18.83f);
                r6 r6Var2 = (r6) this.c;
                r6Var.setBounds(getPaddingLeft(), r3 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r3);
                r6Var.draw(canvas);
                r6Var2.setBounds(getPaddingLeft(), r2 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r2);
                r6Var2.draw(canvas);
                break;
            case 15:
                Paint paint5 = (Paint) this.b;
                gl0 gl0Var = (gl0) this.c;
                int i13 = gl0Var.M0;
                paint5.setColor((i13 == 1 || i13 == 2 || i13 == 4) ? i0.a.k(-1, 30) : i0.a.d(0.7f, g6.w0(g6.F8, gl0Var.k0), g6.w0(g6.h5, gl0Var.k0)));
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g10 = gl0Var.g();
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(measuredWidth2 - measuredWidth3, (measuredHeight - measuredWidth3) - g10, measuredWidth2 + measuredWidth3, measuredHeight + measuredWidth3 + g10);
                canvas.save();
                canvas.scale(childAt.getScaleX(), childAt.getScaleY(), measuredWidth2, measuredHeight);
                canvas.drawRoundRect(rectF3, measuredWidth3, measuredWidth3, paint5);
                canvas.restore();
                canvas.save();
                canvas.translate(0.0f, g10);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            case 21:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                h5[] h5VarArr2 = profileActivity.r;
                if (profileActivity.W4 != null) {
                    canvas.save();
                    canvas.translate(h5VarArr2[0].getX(), h5VarArr2[0].getY());
                    f7 = 0.0f;
                    h5VarArr = h5VarArr2;
                    c10 = 2;
                    f10 = 2.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.W4.getMeasuredWidth(), profileActivity.W4.getMeasuredHeight(), (int) ((1.0f - profileActivity.S1) * 255.0f), 31);
                    profileActivity.W4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    h5VarArr = h5VarArr2;
                    c10 = 2;
                    f7 = 0.0f;
                    f10 = 2.0f;
                }
                if (profileActivity.p5 && profileActivity.Y5 != f7 && profileActivity.n5 != 1.0f) {
                    float measuredHeight2 = (h5VarArr[1].getMeasuredHeight() / f10) + h5VarArr[1].getY();
                    float dp8 = AndroidUtilities.dp(22.0f);
                    float x11 = ((h5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.o5)) - dp8) - profileActivity.Z3();
                    profileActivity.r5.setImageCoords(x11, measuredHeight2 - (dp8 / f10), dp8, dp8);
                    profileActivity.r5.setAlpha(profileActivity.Y5);
                    canvas.save();
                    float f12 = profileActivity.Y5;
                    canvas.scale(f12, f12, profileActivity.r5.getCenterX(), profileActivity.r5.getCenterY());
                    profileActivity.r5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.n5 != f7) {
                        hd hdVar = (hd) this.b;
                        if (hdVar != null && (zVar = hdVar.e) != null) {
                            zVar.setState(StateSet.NOTHING);
                            zVar.jumpToCurrentState();
                            break;
                        }
                    } else {
                        if (((hd) this.b) == null) {
                            hd hdVar2 = new hd(this);
                            this.b = hdVar2;
                            hdVar2.h = new uz0(this, i10);
                        }
                        float dp9 = (1.0f - profileActivity.n5) * AndroidUtilities.dp(28.0f);
                        float textWidth = h5VarArr[c10].getTextWidth();
                        float max = Math.max(textWidth, profileActivity.T != null ? (AndroidUtilities.dp(24.0f) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.T.getVisibilityFactor() : f7) + dp9;
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(x11 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(14.0f), x11 + max + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(14.0f));
                        hd hdVar3 = (hd) this.b;
                        hdVar3.i = false;
                        hdVar3.c = 0;
                        hdVar3.a(rectF4);
                        hd hdVar4 = (hd) this.b;
                        hdVar4.n = true;
                        int k10 = i0.a.k(-1, 50);
                        hdVar4.g.setColor(0);
                        org.telegram.ui.Cells.z zVar3 = hdVar4.e;
                        if (zVar3 != null) {
                            g6.C1(zVar3, k10, true);
                        }
                        hd hdVar5 = (hd) this.b;
                        hdVar5.c(canvas, hdVar5.g);
                        org.telegram.ui.Cells.z zVar4 = hdVar5.e;
                        if (zVar4 != null) {
                            zVar4.draw(canvas);
                            break;
                        }
                    }
                }
                break;
            case 22:
                Rect rect = (Rect) this.b;
                k31 k31Var = (k31) this.c;
                if (k31Var.R) {
                    k31Var.f.setBounds(-rect.left, -rect.top, getWidth() + rect.right, getHeight() + rect.bottom);
                    k31Var.f.draw(canvas);
                } else {
                    RectF rectF5 = AndroidUtilities.rectTmp;
                    rectF5.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                    canvas.drawRoundRect(rectF5, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), k31Var.a);
                }
                super.dispatchDraw(canvas);
                break;
            case 26:
                ImageReceiver imageReceiver = (ImageReceiver) this.b;
                imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 29:
                super.dispatchDraw(canvas);
                z4 z4Var = (z4) this.c;
                if (z4Var.G) {
                    int save = canvas.save();
                    canvas.concat(z4Var.J);
                    canvas.translate(-z4Var.q0.getLeft(), -z4Var.q0.getTop());
                    super.drawChild(canvas, z4Var.q0, getDrawingTime());
                    canvas.restoreToCount(save);
                    break;
                }
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.a) {
            case 1:
                if (keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 4) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                t0 t0Var = (t0) this.c;
                if (!t0Var.k) {
                    return true;
                }
                t0Var.d();
                return true;
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean z10) {
        switch (this.a) {
            case 1:
                break;
            default:
                super.dispatchSetPressed(z10);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 5:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 6:
                k4 k4Var = (k4) this.c;
                aa n10 = k4Var.P0.n(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (k4Var.P0.x() && k4Var.P0.n(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() != 0 || !k4Var.P0.x() || (motionEvent.getY() >= linearLayout.getTop() && motionEvent.getY() <= linearLayout.getBottom())) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (k4Var.P0.n(getContext()).onTouchEvent(obtain)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            case 16:
                int action = motionEvent.getAction();
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.c;
                if (h1Var.J != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(h1Var.J.getX(), h1Var.J.getY());
                    boolean dispatchTouchEvent = h1Var.J.dispatchTouchEvent(motionEvent);
                    obtain2.recycle();
                    if (action == 1 || action == 3) {
                        h1Var.J = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = h1Var.F.onTouchEvent(obtain3);
                obtain3.recycle();
                boolean z10 = !h1Var.F.isInProgress() && ((GestureDetector) h1Var.G.b).onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    h1Var.H = false;
                    h1Var.I = false;
                    o1.k kVar = h1Var.S;
                    if (!kVar.f) {
                        float f7 = h1Var.Q;
                        kVar.b = f7;
                        kVar.c = true;
                        kVar.u.i = (h1Var.M / 2.0f) + f7 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - r7) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                        h1Var.S.h();
                    }
                    o1.k kVar2 = h1Var.T;
                    if (!kVar2.f) {
                        kVar2.b = h1Var.R;
                        kVar2.c = true;
                        kVar2.u.i = w7.s.a(r2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.N) - AndroidUtilities.dp(16.0f));
                        h1Var.T.h();
                    }
                }
                return onTouchEvent || z10;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        switch (this.a) {
            case 2:
                Path path = (Path) this.b;
                l6 l6Var = (l6) this.c;
                if (l6Var.h == null || (!((z10 = l6Var.f) && view == l6Var.d) && (z10 || view != l6Var.c))) {
                    return super.drawChild(canvas, view, j10);
                }
                float measuredWidth = ((z10 ? l6Var.e : 1.0f - l6Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            case 18:
                if (view instanceof fe0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 23:
                return view != ((SecretMediaViewer) this.b).w && super.drawChild(canvas, view, j10);
            case 24:
                Path path2 = (Path) this.b;
                r51 r51Var = (r51) this.c;
                RectF rectF = r51Var.R;
                if (view == r51Var.N || view == r51Var.x) {
                    canvas.save();
                    canvas.clipRect(0.0f, AndroidUtilities.lerp(r51Var.T, 0.0f, r51Var.s), getWidth(), AndroidUtilities.lerp(r51Var.U, getHeight(), r51Var.s));
                    boolean drawChild2 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild2;
                }
                if (view != r51Var.P) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                path2.rewind();
                path2.addCircle(rectF.centerX() + r51Var.N.getX(), rectF.centerY() + r51Var.N.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.clipRect(0.0f, AndroidUtilities.lerp(r51Var.T, 0.0f, r51Var.s), getWidth(), AndroidUtilities.lerp(r51Var.U, getHeight(), r51Var.s));
                canvas.translate(-r51Var.P.getX(), -r51Var.P.getY());
                canvas.translate(r51Var.N.getX() + rectF.left, r51Var.N.getY() + rectF.top);
                canvas.scale(rectF.width() / r51Var.P.getMeasuredWidth(), rectF.height() / r51Var.P.getMeasuredHeight(), r51Var.P.getX(), r51Var.P.getY());
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            case 25:
                if (view != ((r71) this.c).h0 || !x0.b || !x0.f) {
                    return super.drawChild(canvas, view, j10);
                }
                for (int i10 = 0; i10 < ((r71) this.c).h0.getChildCount(); i10++) {
                    View childAt = ((r71) this.c).h0.getChildAt(i10);
                    if (childAt instanceof a71) {
                        a71 a71Var = (a71) childAt;
                        if (a71Var.getAnimatedScale() == 1.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        } else if (a71Var.getAnimatedScale() > 0.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            ((Rect) this.b).set((int) (r2.centerX() - (a71Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f))), (int) (((Rect) this.b).centerY() - (a71Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f))), (int) ((a71Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f)) + ((Rect) this.b).centerX()), (int) ((a71Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f)) + ((Rect) this.b).centerY()));
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            canvas.scale(a71Var.getAnimatedScale(), a71Var.getAnimatedScale(), ((Rect) this.b).centerX(), ((Rect) this.b).centerY());
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        }
                    } else if ((childAt instanceof TextView) || (childAt instanceof v61) || (childAt instanceof u61) || (childAt instanceof w61)) {
                        ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                        canvas.save();
                        canvas.clipRect((Rect) this.b);
                        super.drawChild(canvas, view, j10);
                        canvas.restore();
                    }
                }
                return false;
            case 29:
                z4 z4Var = (z4) this.c;
                if (view != z4Var.q0 || !z4Var.F) {
                    return super.drawChild(canvas, view, j10);
                }
                int save = canvas.save();
                canvas.concat(z4Var.J);
                boolean drawChild4 = super.drawChild(canvas, view, j10);
                canvas.restoreToCount(save);
                return drawChild4;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        switch (this.a) {
            case 1:
                t0 t0Var = (t0) this.c;
                float f7 = t0Var.u;
                float f10 = rect.bottom;
                if (f7 != f10 && t0Var.v) {
                    t0Var.u = f10;
                    v vVar = t0Var.c;
                    s0 s0Var = t0Var.a;
                    if (!t0Var.q) {
                        float f11 = t0Var.t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = t0Var.y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f12 = dp;
                        if (s0Var.getMeasuredHeight() + f11 > (vVar.getMeasuredHeight() - t0Var.u) - f12) {
                            f11 = ((vVar.getMeasuredHeight() - t0Var.u) - s0Var.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        s0Var.animate().translationY(f11).setDuration(250L).setUpdateListener(new j0(t0Var, 1)).setInterpolator(es.f).start();
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
            case 4:
                super.invalidate();
                ((ng.i) this.c).invalidate();
                break;
            case 28:
                super.invalidate();
                org.telegram.ui.ActionBar.p0 p0Var = ((ce1) this.c).t0;
                if (p0Var != null) {
                    p0Var.invalidate();
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
            case 0:
                super.onAttachedToWindow();
                ((u) this.b).c();
                break;
            case 1:
                super.onAttachedToWindow();
                sc.a(this, (m0) this.b);
                break;
            case 18:
                super.onAttachedToWindow();
                xt xtVar = (xt) this.c;
                xtVar.A.onAttachedToWindow();
                xtVar.B.onAttachedToWindow();
                break;
            case 21:
                super.onAttachedToWindow();
                ((ProfileActivity) this.c).r5.onAttachedToWindow();
                break;
            case 23:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.b).h.onAttachedToWindow();
                break;
            case 26:
                super.onAttachedToWindow();
                ((ImageReceiver) this.b).onAttachedToWindow();
                break;
            case 29:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((l4) this.b);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.a) {
            case 16:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.c;
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
            case 0:
                super.onDetachedFromWindow();
                ((u) this.b).d();
                break;
            case 1:
                super.onDetachedFromWindow();
                sc.h(this);
                break;
            case 18:
                super.onDetachedFromWindow();
                xt xtVar = (xt) this.c;
                xtVar.A.onDetachedFromWindow();
                xtVar.B.onDetachedFromWindow();
                break;
            case 21:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.c).r5.onDetachedFromWindow();
                break;
            case 23:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.b).h.onDetachedFromWindow();
                break;
            case 26:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.b).onDetachedFromWindow();
                break;
            case 29:
                getViewTreeObserver().removeOnPreDrawListener((l4) this.b);
                super.onDetachedFromWindow();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x010b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        int min;
        Drawable drawable;
        float f7;
        switch (this.a) {
            case 14:
                re0 re0Var = (re0) this.c;
                Drawable drawable2 = re0Var.a;
                if (drawable2 == null) {
                    super.onDraw(canvas);
                } else if ((drawable2 instanceof cd0) || (drawable2 instanceof ColorDrawable) || (drawable2 instanceof GradientDrawable)) {
                    drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    re0Var.a.draw(canvas);
                } else {
                    float max = Math.max(getMeasuredWidth() / re0Var.a.getIntrinsicWidth(), (getMeasuredHeight() + re0Var.G) / re0Var.a.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(re0Var.a.getIntrinsicWidth() * max);
                    int ceil2 = (int) Math.ceil(re0Var.a.getIntrinsicHeight() * max);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int measuredHeight = ((getMeasuredHeight() - ceil2) + re0Var.G) / 2;
                    re0Var.a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
                    re0Var.a.draw(canvas);
                }
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.b);
                break;
            case 17:
                canvas.save();
                k2 k2Var = (k2) this.c;
                canvas.scale(k2Var.b.getScaleX(), k2Var.b.getScaleY(), k2Var.b.getPivotX() + k2Var.b.getLeft(), k2Var.b.getPivotY() + k2Var.b.getTop());
                Drawable drawable3 = (Drawable) this.b;
                drawable3.setBounds(k2Var.b.getLeft() - AndroidUtilities.dp(2.0f), k2Var.b.getTop() - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f) + k2Var.b.getRight(), AndroidUtilities.dp(2.0f) + k2Var.b.getBottom());
                drawable3.draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                break;
            case 18:
                xt xtVar = (xt) this.b;
                Paint paint = xtVar.N;
                ImageReceiver imageReceiver = xtVar.B;
                ColorDrawable colorDrawable = xtVar.u;
                ImageReceiver imageReceiver2 = xtVar.A;
                if (xtVar.z != null && colorDrawable != null) {
                    if (xtVar.K && xtVar.v == null && xtVar.w != null && !xtVar.e0) {
                        xtVar.e0 = true;
                        imageReceiver2.setVisible(false, false);
                        cn0.d(new f5(xtVar, 8));
                    }
                    if (xtVar.v != null) {
                        boolean z10 = xtVar.K;
                        if (z10) {
                            float f10 = xtVar.M;
                            if (f10 != 1.0f) {
                                float f11 = f10 + 0.13333334f;
                                xtVar.M = f11;
                                if (f11 > 1.0f) {
                                    xtVar.M = 1.0f;
                                }
                                xtVar.z.invalidate();
                                f7 = xtVar.M;
                                if (f7 != 0.0f && xtVar.v != null) {
                                    paint.setAlpha((int) (f7 * 255.0f));
                                    if (paint.getAlpha() != 255) {
                                        canvas.drawColor(g6.m1(xtVar.M, g6.w0(g6.a7, xtVar.c0)));
                                    }
                                    canvas.drawPaint(paint);
                                }
                            }
                        }
                        if (!z10) {
                            float f12 = xtVar.M;
                            if (f12 != 0.0f) {
                                float f13 = f12 - 0.13333334f;
                                xtVar.M = f13;
                                if (f13 < 0.0f) {
                                    xtVar.M = 0.0f;
                                }
                                xtVar.z.invalidate();
                            }
                        }
                        f7 = xtVar.M;
                        if (f7 != 0.0f) {
                            paint.setAlpha((int) (f7 * 255.0f));
                            if (paint.getAlpha() != 255) {
                            }
                            canvas.drawPaint(paint);
                        }
                    }
                    colorDrawable.setAlpha((int) (xtVar.F * 180.0f));
                    colorDrawable.setBounds(0, 0, xtVar.z.getWidth(), xtVar.z.getHeight());
                    colorDrawable.draw(canvas);
                    canvas.save();
                    i0.b bVar = xtVar.q;
                    int i10 = bVar.d;
                    int i11 = bVar.b;
                    int i12 = i10 + i11;
                    if (xtVar.V == 1) {
                        min = Math.min(xtVar.z.getWidth(), xtVar.z.getHeight() - i12) - AndroidUtilities.dp(40.0f);
                    } else {
                        min = (int) (xtVar.S ? Math.min(xtVar.z.getWidth(), xtVar.z.getHeight() - i12) - AndroidUtilities.dpf2(40.0f) : Math.min(xtVar.z.getWidth(), xtVar.z.getHeight() - i12) / 1.8f);
                    }
                    float max2 = Math.max((min / 2) + i11 + (xtVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((xtVar.z.getHeight() - i12) - xtVar.I) / 2);
                    if (xtVar.S) {
                        max2 += AndroidUtilities.dp(40.0f);
                    }
                    canvas.translate(xtVar.z.getWidth() / 2, xtVar.e + max2);
                    int i13 = (int) (min * ((xtVar.F * 0.8f) / 0.8f));
                    if (xtVar.V == 3) {
                        canvas.translate(0.0f, AndroidUtilities.dp(70.0f));
                    }
                    if (xtVar.S) {
                        float f14 = i13;
                        float f15 = 0.6669f * f14;
                        imageReceiver2.setAlpha(xtVar.F);
                        float f16 = f14 - f15;
                        float f17 = f14 / 2.0f;
                        imageReceiver2.setImageCoords((f16 - f17) - (0.0546875f * f14), (f16 / 2.0f) - f17, f15, f15);
                        imageReceiver2.draw(canvas);
                        imageReceiver.setAlpha(xtVar.F);
                        float f18 = (-i13) / 2.0f;
                        imageReceiver.setImageCoords(f18, f18, f14, f14);
                        imageReceiver.draw(canvas);
                    } else {
                        imageReceiver2.setAlpha(xtVar.F);
                        float f19 = (-i13) / 2.0f;
                        float f20 = i13;
                        imageReceiver2.setImageCoords(f19, f19, f20, f20);
                        imageReceiver2.draw(canvas);
                    }
                    if (xtVar.C != null) {
                        canvas.save();
                        float f21 = (-i13) / 2.0f;
                        canvas.translate(f21, f21);
                        float f22 = i13;
                        canvas.scale(f22 / xtVar.C.getWidth(), f22 / xtVar.C.getHeight());
                        xtVar.C.setAlpha(xtVar.F);
                        if (xtVar.D == null) {
                            xtVar.D = new Path();
                        }
                        xtVar.D.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, xtVar.C.getWidth(), xtVar.C.getHeight());
                        float f23 = f22 / 8.0f;
                        xtVar.D.addRoundRect(rectF, f23, f23, Path.Direction.CW);
                        canvas.clipPath(xtVar.D);
                        xtVar.C.draw(canvas);
                        canvas.restore();
                    }
                    if (xtVar.V == 1 && !xtVar.m && (drawable = xtVar.J) != null) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = xtVar.J.getIntrinsicHeight();
                        int dp = (int) (imageReceiver2.getDrawRegion().top - AndroidUtilities.dp(((xtVar.d / AndroidUtilities.dp(60.0f)) * 6.0f) + 17.0f));
                        xtVar.J.setAlpha((int) ((1.0f - xtVar.g) * 255.0f));
                        xtVar.J.setBounds((-intrinsicWidth) / 2, (-intrinsicHeight) + dp, intrinsicWidth / 2, dp);
                        xtVar.J.draw(canvas);
                    }
                    if (xtVar.G != null) {
                        if (xtVar.S) {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
                        } else {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver2.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
                        }
                        xt.f0.setAlpha((int) (xtVar.F * 255.0f));
                        xtVar.G.draw(canvas);
                    }
                    canvas.restore();
                    if (xtVar.E) {
                        if (xtVar.F != 1.0f) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j10 = currentTimeMillis - xtVar.H;
                            xtVar.H = currentTimeMillis;
                            xtVar.F = (j10 / 120.0f) + xtVar.F;
                            xtVar.z.invalidate();
                            if (xtVar.F > 1.0f) {
                                xtVar.F = 1.0f;
                                break;
                            }
                        }
                    } else if (xtVar.F != 0.0f) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long j11 = currentTimeMillis2 - xtVar.H;
                        xtVar.H = currentTimeMillis2;
                        xtVar.F -= j11 / 120.0f;
                        xtVar.z.invalidate();
                        if (xtVar.F < 0.0f) {
                            xtVar.F = 0.0f;
                        }
                        if (xtVar.F == 0.0f) {
                            imageReceiver2.setImageBitmap((Drawable) null);
                            AndroidUtilities.unlockOrientation(xtVar.w);
                            AndroidUtilities.runOnUIThread(new jt(xtVar, 1));
                            Bitmap bitmap = xtVar.v;
                            if (bitmap != null) {
                                bitmap.recycle();
                                xtVar.v = null;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(xtVar.O, false, 1.0f, false);
                            xtVar.M = 0.0f;
                            try {
                                if (xtVar.y.getParent() != null) {
                                    ((WindowManager) xtVar.w.getSystemService("window")).removeView(xtVar.y);
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
            case 23:
                SecretMediaViewer.b((SecretMediaViewer) this.b, canvas);
                break;
            case 27:
                int intrinsicHeight2 = g6.i3.getIntrinsicHeight();
                g6.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight2);
                g6.i3.draw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(((ce1) this.c).getThemedColor(g6.Sd));
                canvas.drawRect(0.0f, intrinsicHeight2, getMeasuredWidth(), getMeasuredHeight(), paint2);
                break;
            case 28:
                int[] iArr = (int[]) this.b;
                ce1 ce1Var = (ce1) this.c;
                if (!AndroidUtilities.usingHardwareInput) {
                    getLocationInWindow(iArr);
                    if (ce1Var.s0.getTranslationY() != iArr[1]) {
                        ce1Var.s0.setTranslationY(-r0);
                        ce1Var.t0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < ce1Var.P) {
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
        hd hdVar;
        switch (this.a) {
            case 21:
                return (((ProfileActivity) this.c).n5 == 0.0f && (hdVar = (hd) this.b) != null && hdVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int B = yh.B(275.0f, i15, 2);
                h80 h80Var = (h80) this.c;
                FrameLayout frameLayout = h80Var.r;
                frameLayout.layout(0, B, frameLayout.getMeasuredWidth(), h80Var.r.getMeasuredHeight() + B);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + B;
                int measuredWidth = (getMeasuredWidth() - h80Var.e.getMeasuredWidth()) / 2;
                ua uaVar = h80Var.e;
                uaVar.layout(measuredWidth, dp, uaVar.getMeasuredWidth() + measuredWidth, h80Var.e.getMeasuredHeight() + dp);
                z4.g gVar = h80Var.d;
                gVar.layout(0, 0, gVar.getMeasuredWidth(), h80Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - h80Var.n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - h80Var.n.getMeasuredWidth()) / 2;
                ci.n nVar = h80Var.n;
                nVar.layout(measuredWidth2, measuredHeight, nVar.getMeasuredWidth() + measuredWidth2, h80Var.n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - h80Var.f.getMeasuredWidth()) / 2;
                TextView textView = h80Var.f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), h80Var.f.getMeasuredWidth() + measuredWidth3, dp2);
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int dp3 = AndroidUtilities.dp(4) + (AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight);
                if (marginLayoutParams.topMargin != dp3) {
                    marginLayoutParams.topMargin = dp3;
                    frameLayout2.requestLayout();
                    break;
                }
                break;
            case 20:
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + yh.B(275.0f, ((i13 - i11) / 4) * 3, 2);
                int dp5 = AndroidUtilities.dp(18.0f);
                TextView textView2 = (TextView) this.b;
                textView2.layout(dp5, dp4, textView2.getMeasuredWidth() + dp5, textView2.getMeasuredHeight() + dp4);
                int dp6 = AndroidUtilities.dp(18.0f) + dp4 + ((int) textView2.getTextSize());
                int dp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.c;
                textView3.layout(dp7, dp6, textView3.getMeasuredWidth() + dp7, textView3.getMeasuredHeight() + dp6);
                break;
            case 21:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.c).V4();
                break;
            case 22:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                if (secretMediaViewer.n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    k51 k51Var = secretMediaViewer.n;
                    k51Var.layout(k51Var.getLeft(), currentActionBarHeight, secretMediaViewer.n.getRight(), secretMediaViewer.n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.r != null && secretMediaViewer.n != null) {
                    int measuredHeight2 = (secretMediaViewer.n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    d4 d4Var = secretMediaViewer.r;
                    d4Var.layout(d4Var.getLeft(), measuredHeight2, secretMediaViewer.r.getRight(), secretMediaViewer.r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.a0 != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    iu0 iu0Var = secretMediaViewer.a0;
                    iu0Var.layout(iu0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.a0.getRight(), secretMediaViewer.a0.getMeasuredHeight() + currentActionBarHeight2);
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
        s4.b0 sVar;
        switch (this.a) {
            case 3:
                ViewGroup viewGroup = (ViewGroup) this.b;
                hg.e eVar = (hg.e) this.c;
                if (!eVar.K || !eVar.J) {
                    int size = View.MeasureSpec.getSize(i11);
                    if (size == 0) {
                        size = viewGroup.getMeasuredHeight();
                    }
                    if (size == 0) {
                        size = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                    }
                    int dp = AndroidUtilities.dp(50.0f);
                    int dp2 = eVar.v != 0 ? 0 : AndroidUtilities.dp(30.0f) + dp;
                    if (!eVar.E && !eVar.w) {
                        dp2 += dp;
                    }
                    int paddingTop = (size - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp2 < paddingTop ? paddingTop - dp2 : 0, TLObject.FLAG_30));
                    break;
                } else {
                    super.onMeasure(i10, i11);
                    break;
                }
                break;
            case 6:
                super.onMeasure(i10, i11);
                super.onMeasure(i10, yh.D(8.0f, ((LinearLayout) this.b).getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 11:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                break;
            case 13:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
                setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                break;
            case 22:
                k31 k31Var = (k31) this.c;
                View view = k31Var.H;
                View view2 = k31Var.I;
                LinearLayout linearLayout = k31Var.v;
                TextView textView = k31Var.s;
                mm0 mm0Var = k31Var.y;
                boolean z10 = k31Var.S.P;
                int dp3 = AndroidUtilities.dp(12.0f);
                if (z10) {
                    mm0Var.setLayoutParams(a6.a(104.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 8388611));
                    mm0Var.setPadding(dp3, 0, dp3, 0);
                    if (linearLayout != null) {
                        textView.setLayoutParams(a6.a(48.0f, 16.0f, 162.0f, 16.0f, 72.0f, -1, 8388611));
                        linearLayout.setLayoutParams(a6.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388691));
                    } else {
                        textView.setLayoutParams(a6.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
                    }
                } else {
                    mm0Var.setPadding(dp3, dp3 / 2, dp3, dp3);
                    if (linearLayout != null) {
                        mm0Var.setLayoutParams(a6.a(-1.0f, 0.0f, 44.0f, 0.0f, 136.0f, -1, 8388611));
                        textView.setLayoutParams(a6.a(48.0f, 16.0f, 0.0f, 16.0f, 72.0f, -1, 80));
                        linearLayout.setLayoutParams(a6.a(48.0f, 16.0f, 0.0f, 16.0f, 16.0f, -1, 80));
                    } else {
                        mm0Var.setLayoutParams(a6.a(-1.0f, 0.0f, 44.0f, 0.0f, 80.0f, -1, 8388611));
                        textView.setLayoutParams(a6.a(48.0f, 16.0f, 0.0f, 16.0f, 16.0f, -1, 80));
                    }
                }
                if (z10) {
                    view2.setVisibility(8);
                    view.setVisibility(8);
                } else {
                    int i12 = textView != null ? 136 : 80;
                    view2.setVisibility(0);
                    view2.setLayoutParams(a6.a(AndroidUtilities.dp(2.0f), 0.0f, 0.0f, 0.0f, i12, -1, 80));
                    view.setVisibility(0);
                    view.setLayoutParams(a6.a(AndroidUtilities.dp(2.0f), 0.0f, 44.0f, 0.0f, 0.0f, -1, 48));
                }
                if (k31Var.R != z10) {
                    l31 l31Var = k31Var.d;
                    if (z10) {
                        l31Var.getParentActivity();
                        sVar = new s4.b0(0, false);
                    } else {
                        l31Var.getParentActivity();
                        sVar = new s4.s(3, false);
                    }
                    k31Var.G = sVar;
                    mm0Var.setLayoutManager(sVar);
                    mm0Var.requestLayout();
                    int i13 = k31Var.L;
                    if (i13 != -1) {
                        k31Var.b(i13);
                    }
                    k31Var.R = z10;
                }
                super.onMeasure(i10, i11);
                break;
            case 23:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                iu0 iu0Var = secretMediaViewer.a0;
                if (iu0Var != null) {
                    iu0Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - (secretMediaViewer.U.getVisibility() != 0 ? 0 : secretMediaViewer.U.getMeasuredHeight()), TLObject.FLAG_30));
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
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                zf.z zVar = (zf.z) this.c;
                zVar.setBounds(0, 0, i10, i11);
                zVar.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                break;
            case 16:
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

    /* JADX WARN: Code restructure failed: missing block: B:116:0x028f, code lost:
    
        if (r1 > r4) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0280, code lost:
    
        if (r14 > r4) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02f5, code lost:
    
        if (r4 > r5) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e4, code lost:
    
        if (r4 > r5) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01eb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        DisplayMetrics displayMetrics;
        float f7;
        hd hdVar;
        switch (this.a) {
            case 4:
                ng.i iVar = (ng.i) this.c;
                ng.c cVar = iVar.r;
                boolean onTouchEvent = ((GestureDetector) ((ji.d4) this.b).b).onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    AndroidUtilities.runOnUIThread(cVar, 200L);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.cancelRunOnUIThread(cVar);
                    if (!iVar.h) {
                        o1.l lVar = iVar.c.u;
                        if (((float) lVar.i) >= getWidth() / 2.0f) {
                            displayMetrics = getResources().getDisplayMetrics();
                            f7 = 2.14748365E9f;
                        } else {
                            displayMetrics = getResources().getDisplayMetrics();
                            f7 = -2.14748365E9f;
                        }
                        lVar.i = ng.i.a(displayMetrics, f7);
                        iVar.d.u.i = ng.i.b(getResources().getDisplayMetrics(), (float) iVar.d.u.i);
                        iVar.c.h();
                        iVar.d.h();
                    }
                    iVar.n = false;
                    iVar.f = false;
                    iVar.h = false;
                }
                return onTouchEvent;
            case 21:
                return (((ProfileActivity) this.c).n5 == 0.0f && (hdVar = (hd) this.b) != null && hdVar.b(motionEvent)) || super.onTouchEvent(motionEvent);
            case 23:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                if (secretMediaViewer.m0 == 0 && secretMediaViewer.J0 == 0) {
                    if (motionEvent.getPointerCount() == 1 && secretMediaViewer.L0.onTouchEvent(motionEvent) && secretMediaViewer.b1) {
                        secretMediaViewer.b1 = false;
                        secretMediaViewer.a1 = false;
                        secretMediaViewer.Z0 = false;
                        secretMediaViewer.d(false);
                    } else if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                        secretMediaViewer.f1 = false;
                        pn0 pn0Var = secretMediaViewer.g1;
                        if (!pn0Var.q) {
                            pn0Var.a();
                        }
                        if (!secretMediaViewer.p0) {
                            if (motionEvent.getPointerCount() == 2) {
                                secretMediaViewer.N0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                secretMediaViewer.O0 = secretMediaViewer.y0;
                                secretMediaViewer.P0 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                                secretMediaViewer.Q0 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                                secretMediaViewer.R0 = secretMediaViewer.w0;
                                secretMediaViewer.S0 = secretMediaViewer.x0;
                                secretMediaViewer.Z0 = true;
                                secretMediaViewer.a1 = false;
                            } else if (motionEvent.getPointerCount() == 1) {
                                secretMediaViewer.T0 = motionEvent.getX();
                                float y3 = motionEvent.getY();
                                secretMediaViewer.U0 = y3;
                                secretMediaViewer.q0 = y3;
                                secretMediaViewer.p0 = false;
                                secretMediaViewer.d1 = true;
                            }
                        }
                    } else {
                        float f10 = 0.0f;
                        if (motionEvent.getActionMasked() == 2) {
                            if (motionEvent.getPointerCount() == 2 && !secretMediaViewer.p0 && secretMediaViewer.Z0) {
                                secretMediaViewer.f1 = true;
                                secretMediaViewer.y0 = (((float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0))) / secretMediaViewer.N0) * secretMediaViewer.O0;
                                secretMediaViewer.w0 = yh.b(secretMediaViewer.y0, secretMediaViewer.O0, (secretMediaViewer.P0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.R0, secretMediaViewer.P0 - (secretMediaViewer.e.getWidth() / 2));
                                float height = secretMediaViewer.Q0 - (secretMediaViewer.e.getHeight() / 2);
                                float height2 = (secretMediaViewer.Q0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.S0;
                                float f11 = secretMediaViewer.y0;
                                secretMediaViewer.x0 = yh.b(f11, secretMediaViewer.O0, height2, height);
                                secretMediaViewer.n(f11);
                                secretMediaViewer.e.invalidate();
                            } else if (motionEvent.getPointerCount() == 1) {
                                float abs = Math.abs(motionEvent.getX() - secretMediaViewer.T0);
                                float abs2 = Math.abs(motionEvent.getY() - secretMediaViewer.q0);
                                if (abs > AndroidUtilities.dp(3.0f) || abs2 > AndroidUtilities.dp(3.0f)) {
                                    secretMediaViewer.f1 = true;
                                }
                                if (secretMediaViewer.d1 && !secretMediaViewer.p0 && secretMediaViewer.y0 == 1.0f && abs2 >= AndroidUtilities.dp(30.0f) && abs2 / 2.0f > abs) {
                                    secretMediaViewer.p0 = true;
                                    secretMediaViewer.a1 = false;
                                    secretMediaViewer.q0 = motionEvent.getY();
                                    if (secretMediaViewer.k0) {
                                        secretMediaViewer.m(false, true);
                                    }
                                } else if (secretMediaViewer.p0) {
                                    secretMediaViewer.x0 = motionEvent.getY() - secretMediaViewer.q0;
                                    secretMediaViewer.e.invalidate();
                                } else if (secretMediaViewer.c1 || secretMediaViewer.J0 != 0) {
                                    secretMediaViewer.c1 = false;
                                    secretMediaViewer.T0 = motionEvent.getX();
                                    secretMediaViewer.U0 = motionEvent.getY();
                                } else {
                                    float x10 = secretMediaViewer.T0 - motionEvent.getX();
                                    float y10 = secretMediaViewer.U0 - motionEvent.getY();
                                    if (secretMediaViewer.a1 || ((secretMediaViewer.y0 == 1.0f && Math.abs(y10) + AndroidUtilities.dp(12.0f) < Math.abs(x10)) || secretMediaViewer.y0 != 1.0f)) {
                                        if (!secretMediaViewer.a1) {
                                            secretMediaViewer.a1 = true;
                                            secretMediaViewer.d1 = false;
                                            x10 = 0.0f;
                                            y10 = 0.0f;
                                        }
                                        secretMediaViewer.T0 = motionEvent.getX();
                                        secretMediaViewer.U0 = motionEvent.getY();
                                        secretMediaViewer.n(secretMediaViewer.y0);
                                        float f12 = secretMediaViewer.w0;
                                        if (f12 < secretMediaViewer.V0 || f12 > secretMediaViewer.W0) {
                                            x10 /= 3.0f;
                                        }
                                        float f13 = secretMediaViewer.Y0;
                                        if (f13 == 0.0f) {
                                            float f14 = secretMediaViewer.X0;
                                            if (f14 == 0.0f) {
                                                float f15 = secretMediaViewer.x0 - y10;
                                                if (f15 < f14) {
                                                    secretMediaViewer.x0 = f14;
                                                } else {
                                                    if (f15 > f13) {
                                                        secretMediaViewer.x0 = f13;
                                                    }
                                                    f10 = y10;
                                                }
                                                secretMediaViewer.w0 = f12 - x10;
                                                if (secretMediaViewer.y0 != 1.0f) {
                                                    secretMediaViewer.x0 -= f10;
                                                }
                                                secretMediaViewer.e.invalidate();
                                            }
                                        }
                                        float f16 = secretMediaViewer.x0;
                                        if (f16 < secretMediaViewer.X0 || f16 > f13) {
                                            f10 = y10 / 3.0f;
                                            secretMediaViewer.w0 = f12 - x10;
                                            if (secretMediaViewer.y0 != 1.0f) {
                                            }
                                            secretMediaViewer.e.invalidate();
                                        }
                                        f10 = y10;
                                        secretMediaViewer.w0 = f12 - x10;
                                        if (secretMediaViewer.y0 != 1.0f) {
                                        }
                                        secretMediaViewer.e.invalidate();
                                    }
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                            if (secretMediaViewer.Z0) {
                                secretMediaViewer.c1 = true;
                                float f17 = secretMediaViewer.y0;
                                if (f17 < 1.0f) {
                                    secretMediaViewer.n(1.0f);
                                    secretMediaViewer.c(1.0f, 0.0f, 0.0f, true);
                                } else if (f17 > 3.0f) {
                                    float b10 = yh.b(3.0f, secretMediaViewer.O0, (secretMediaViewer.P0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.R0, secretMediaViewer.P0 - (secretMediaViewer.e.getWidth() / 2));
                                    float b11 = yh.b(3.0f, secretMediaViewer.O0, (secretMediaViewer.Q0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.S0, secretMediaViewer.Q0 - (secretMediaViewer.e.getHeight() / 2));
                                    secretMediaViewer.n(3.0f);
                                    float f18 = secretMediaViewer.V0;
                                    if (b10 >= f18) {
                                        f18 = secretMediaViewer.W0;
                                        break;
                                    }
                                    b10 = f18;
                                    float f19 = secretMediaViewer.X0;
                                    if (b11 >= f19) {
                                        f19 = secretMediaViewer.Y0;
                                        break;
                                    }
                                    b11 = f19;
                                    secretMediaViewer.c(3.0f, b10, b11, true);
                                } else {
                                    secretMediaViewer.d(true);
                                }
                                secretMediaViewer.Z0 = false;
                            } else if (secretMediaViewer.p0) {
                                if (Math.abs(secretMediaViewer.q0 - motionEvent.getY()) > secretMediaViewer.e.getHeight() / 6.0f) {
                                    secretMediaViewer.e(true, false);
                                } else {
                                    secretMediaViewer.c(1.0f, 0.0f, 0.0f, false);
                                }
                                secretMediaViewer.p0 = false;
                            } else if (secretMediaViewer.a1) {
                                float f20 = secretMediaViewer.w0;
                                float f21 = secretMediaViewer.x0;
                                secretMediaViewer.n(secretMediaViewer.y0);
                                secretMediaViewer.a1 = false;
                                secretMediaViewer.d1 = true;
                                float f22 = secretMediaViewer.w0;
                                float f23 = secretMediaViewer.V0;
                                if (f22 >= f23) {
                                    f23 = secretMediaViewer.W0;
                                    break;
                                }
                                f20 = f23;
                                float f24 = secretMediaViewer.x0;
                                float f25 = secretMediaViewer.X0;
                                if (f24 >= f25) {
                                    f25 = secretMediaViewer.Y0;
                                    break;
                                }
                                f21 = f25;
                                secretMediaViewer.c(secretMediaViewer.y0, f20, f21, false);
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
            case 14:
                ((Paint) this.b).setColor(i10);
                break;
            default:
                super.setBackgroundColor(i10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        switch (this.a) {
            case 4:
                super.setTranslationX(f7);
                ((ng.i) this.c).invalidate();
                break;
            default:
                super.setTranslationX(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.a) {
            case 4:
                super.setTranslationY(f7);
                ((ng.i) this.c).invalidate();
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 13:
                return ((r6) this.b) == drawable || ((r6) this.c) == drawable || super.verifyDrawable(drawable);
            case 22:
                return drawable == ((k31) this.c).f || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, int i10, c6 c6Var) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 13:
                super(context);
                r6 r6Var = new r6(true, true, true);
                this.b = r6Var;
                es esVar = es.h;
                r6Var.n(0.3f, 430L, esVar);
                r6Var.x(AndroidUtilities.bold());
                r6Var.u(g6.w0(g6.A8, c6Var));
                r6Var.w(AndroidUtilities.dp(18.0f));
                r6Var.q(!LocaleController.isRTL);
                r6Var.setCallback(this);
                r6Var.M = AndroidUtilities.displaySize.x;
                r6 r6Var2 = new r6(true, true, true);
                this.c = r6Var2;
                r6Var2.n(0.3f, 430L, esVar);
                r6Var2.u(g6.w0(g6.B8, c6Var));
                r6Var2.w(AndroidUtilities.dp(14.0f));
                r6Var2.q(true ^ LocaleController.isRTL);
                r6Var2.setCallback(this);
                r6Var2.M = AndroidUtilities.displaySize.x;
                break;
            default:
                this.c = new zf.z(8);
                this.b = c6Var;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(org.telegram.ui.Cells.a1 a1Var, Context context) {
        super(context);
        this.a = 8;
        this.c = a1Var;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(t0 t0Var, Context context) {
        super(context);
        this.a = 1;
        this.c = t0Var;
        this.b = new m0(this, 0);
    }

    private final void a(boolean z10) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(r51 r51Var, Context context) {
        super(context);
        this.a = 24;
        this.c = r51Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(gc gcVar, Context context) {
        super(context);
        this.a = 9;
        this.c = gcVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(a0 a0Var, Context context) {
        super(context);
        this.a = 0;
        this.c = a0Var;
        this.b = new u(this, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(s5 s5Var, Activity activity) {
        super(activity);
        this.a = 7;
        this.c = s5Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(org.telegram.ui.Components.voip.h1 h1Var, Context context) {
        super(context);
        this.a = 16;
        this.c = h1Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(re0 re0Var, Context context) {
        super(context);
        this.a = 14;
        this.c = re0Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z4 z4Var, Context context) {
        super(context);
        this.a = 29;
        this.c = z4Var;
        this.b = new l4(this, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, TextView textView, TextView textView2) {
        super(context);
        this.a = 20;
        this.b = textView;
        this.c = textView2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.a = 23;
        this.c = secretMediaViewer;
        this.b = secretMediaViewer;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(r71 r71Var, Context context) {
        super(context);
        this.a = 25;
        this.c = r71Var;
        this.b = new Rect();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(k31 k31Var, Activity activity, l31 l31Var) {
        super(activity);
        this.a = 22;
        this.c = k31Var;
        Rect rect = new Rect();
        this.b = rect;
        k31Var.a.setColor(l31Var.getThemedColor(g6.d6));
        Drawable drawable = k31Var.f;
        drawable.setCallback(this);
        drawable.getPadding(rect);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(zp zpVar, Context context) {
        super(context);
        this.a = 11;
        this.c = zpVar;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(xt xtVar, Activity activity) {
        super(activity);
        this.a = 18;
        this.c = xtVar;
        this.b = xtVar;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ce1 ce1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 28:
                this.c = ce1Var;
                super(context);
                this.b = new int[2];
                break;
            default:
                this.c = ce1Var;
                this.b = new Paint();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(gl0 gl0Var, Context context) {
        super(context);
        this.a = 15;
        this.c = gl0Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 26:
                super(context);
                break;
            default:
                this.b = new Path();
                this.c = new p20();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(l6 l6Var, Context context) {
        super(context);
        this.a = 2;
        this.c = l6Var;
        this.b = new Path();
    }
}
