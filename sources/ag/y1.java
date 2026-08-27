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
import h7.z5;
import lh.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Components.ap;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.a61;
import org.telegram.ui.at0;
import org.telegram.ui.b5;
import org.telegram.ui.c41;
import org.telegram.ui.d51;
import org.telegram.ui.e51;
import org.telegram.ui.f51;
import org.telegram.ui.j51;
import org.telegram.ui.kt;
import org.telegram.ui.ky0;
import org.telegram.ui.l70;
import org.telegram.ui.m4;
import org.telegram.ui.nc1;
import org.telegram.ui.p5;
import org.telegram.ui.v10;
import org.telegram.ui.v31;
import org.telegram.ui.vs;
import org.telegram.ui.wb;
import org.telegram.ui.x11;
import org.telegram.ui.y11;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class y1 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    public void b(int i10, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.b;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.c).setText(charSequence);
    }

    public void c(String str, boolean z10) {
        ((i6) this.c).q(str, z10 && !LocaleController.isRTL, true);
    }

    public void d(String str, boolean z10) {
        ((i6) this.b).q(str, z10 && !LocaleController.isRTL, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        c6 c6Var;
        h5[] h5VarArr;
        char c10;
        float f10;
        ?? r10;
        float f11;
        float f12;
        org.telegram.ui.Cells.z zVar;
        switch (this.a) {
            case 0:
                ((i2) this.b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                i2 i2Var = (i2) this.b;
                i2Var.f.setAlpha(((g2) this.c).G);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, i2Var.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 7:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.b;
                int i10 = g6.a7;
                c6Var = ((org.telegram.ui.ActionBar.n2) ((p5) this.c).d).resourceProvider;
                paint.setColor(g6.v0(i10, c6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint);
                break;
            case 8:
                RectF rectF2 = (RectF) this.b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.y0 y0Var = (org.telegram.ui.Cells.y0) this.c;
                int measuredWidth = y0Var.getMeasuredWidth();
                int i11 = y0Var.d;
                float x8 = y0Var.getX();
                float f13 = y0Var.c;
                c6 c6Var2 = y0Var.b;
                if (c6Var2 != null) {
                    c6Var2.m(x8, f13, measuredWidth, i11);
                } else {
                    g6.q(x8, f13, measuredWidth, i11);
                }
                float dp = AndroidUtilities.dp(18.0f);
                float dp2 = AndroidUtilities.dp(18.0f);
                Paint N = c6Var2 != null ? c6Var2.N("paintChatActionBackground") : null;
                if (N == null) {
                    N = g6.S0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF2, dp, dp2, N);
                if (c6Var2 != null ? c6Var2.u0() : g6.a1()) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    Paint N2 = c6Var2 != null ? c6Var2.N("paintChatActionBackgroundDarken") : null;
                    if (N2 == null) {
                        N2 = g6.S0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF2, dp3, dp4, N2);
                }
                super.dispatchDraw(canvas);
                break;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(g6.v0(g6.a7, ((wb) this.c).f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                break;
            case 10:
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
                v10 v10Var = (v10) this.c;
                v10Var.b(canvas, rectF3, 1, 1.0f);
                rectF3.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                v10Var.b(canvas, rectF3, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                break;
            case 11:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.b;
                paint3.setColor(((ap) this.c).getThemedColor(g6.d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint3);
                break;
            case 12:
                ky kyVar = (ky) this.c;
                if (!kyVar.C.q0 && kyVar.w > 0.0f) {
                    if (((Paint) this.b) == null) {
                        Paint paint4 = new Paint();
                        this.b = paint4;
                        paint4.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.b).setAlpha((int) (kyVar.w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.b);
                    canvas.restore();
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
            case 13:
                i6 i6Var = (i6) this.b;
                int dp6 = AndroidUtilities.dp(29.0f);
                int dp7 = AndroidUtilities.dp(18.83f);
                i6 i6Var2 = (i6) this.c;
                i6Var.setBounds(getPaddingLeft(), r3 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r3);
                i6Var.draw(canvas);
                i6Var2.setBounds(getPaddingLeft(), r2 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r2);
                i6Var2.draw(canvas);
                break;
            case 15:
                Paint paint5 = (Paint) this.b;
                wj0 wj0Var = (wj0) this.c;
                int i12 = wj0Var.I0;
                paint5.setColor((i12 == 1 || i12 == 2 || i12 == 4) ? i0.b.k(-1, 30) : i0.b.d(0.7f, g6.v0(g6.F8, wj0Var.g0), g6.v0(g6.h5, wj0Var.g0)));
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g10 = wj0Var.g();
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
            case 21:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                h5[] h5VarArr2 = profileActivity.r;
                if (profileActivity.S4 != null) {
                    canvas.save();
                    canvas.translate(h5VarArr2[0].getX(), h5VarArr2[0].getY());
                    h5VarArr = h5VarArr2;
                    c10 = 2;
                    f10 = 0.0f;
                    r10 = 0;
                    f11 = 24.0f;
                    f12 = 14.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.S4.getMeasuredWidth(), profileActivity.S4.getMeasuredHeight(), (int) ((1.0f - profileActivity.O1) * 255.0f), 31);
                    profileActivity.S4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    h5VarArr = h5VarArr2;
                    c10 = 2;
                    f10 = 0.0f;
                    r10 = 0;
                    f11 = 24.0f;
                    f12 = 14.0f;
                }
                if (profileActivity.l5 && profileActivity.U5 != f10 && profileActivity.j5 != 1.0f) {
                    float measuredHeight2 = (h5VarArr[1].getMeasuredHeight() / 2.0f) + h5VarArr[1].getY();
                    float dp8 = AndroidUtilities.dp(22.0f);
                    float x10 = ((h5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.k5)) - dp8) - profileActivity.Z3();
                    profileActivity.n5.setImageCoords(x10, measuredHeight2 - (dp8 / 2.0f), dp8, dp8);
                    profileActivity.n5.setAlpha(profileActivity.U5);
                    canvas.save();
                    float f14 = profileActivity.U5;
                    canvas.scale(f14, f14, profileActivity.n5.getCenterX(), profileActivity.n5.getCenterY());
                    profileActivity.n5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.j5 != f10) {
                        tc tcVar = (tc) this.b;
                        if (tcVar != null && (zVar = tcVar.e) != null) {
                            zVar.setState(StateSet.NOTHING);
                            zVar.jumpToCurrentState();
                            break;
                        }
                    } else {
                        if (((tc) this.b) == null) {
                            tc tcVar2 = new tc(this);
                            this.b = tcVar2;
                            tcVar2.h = new ky0(this, r10);
                        }
                        float dp9 = (1.0f - profileActivity.j5) * AndroidUtilities.dp(28.0f);
                        float textWidth = h5VarArr[c10].getTextWidth();
                        float max = Math.max(textWidth, profileActivity.P != null ? (AndroidUtilities.dp(f11) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.P.getVisibilityFactor() : 0.0f) + dp9;
                        RectF rectF5 = AndroidUtilities.rectTmp;
                        rectF5.set(x10 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(f12), x10 + max + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(f12));
                        tc tcVar3 = (tc) this.b;
                        tcVar3.i = r10;
                        tcVar3.c = r10;
                        tcVar3.a(rectF5);
                        tc tcVar4 = (tc) this.b;
                        tcVar4.n = true;
                        int k10 = i0.b.k(-1, 50);
                        tcVar4.g.setColor((int) r10);
                        org.telegram.ui.Cells.z zVar2 = tcVar4.e;
                        if (zVar2 != null) {
                            g6.B1(zVar2, k10, true);
                        }
                        tc tcVar5 = (tc) this.b;
                        tcVar5.c(canvas, tcVar5.g);
                        org.telegram.ui.Cells.z zVar3 = tcVar5.e;
                        if (zVar3 != null) {
                            zVar3.draw(canvas);
                            break;
                        }
                    }
                }
                break;
            case 22:
                Rect rect = (Rect) this.b;
                x11 x11Var = (x11) this.c;
                if (x11Var.N) {
                    x11Var.f.setBounds(-rect.left, -rect.top, getWidth() + rect.right, getHeight() + rect.bottom);
                    x11Var.f.draw(canvas);
                } else {
                    RectF rectF6 = AndroidUtilities.rectTmp;
                    rectF6.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                    canvas.drawRoundRect(rectF6, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), x11Var.a);
                }
                super.dispatchDraw(canvas);
                break;
            case 26:
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
            case 4:
                if (keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 4) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                ig.d0 d0Var = (ig.d0) this.c;
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
    public void dispatchSetPressed(boolean z10) {
        switch (this.a) {
            case 4:
                break;
            default:
                super.dispatchSetPressed(z10);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 6:
                m4 m4Var = (m4) this.c;
                v9 o10 = m4Var.L0.o(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (m4Var.L0.y() && m4Var.L0.o(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (o10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() != 0 || !m4Var.L0.y() || (motionEvent.getY() >= linearLayout.getTop() && motionEvent.getY() <= linearLayout.getBottom())) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (m4Var.L0.o(getContext()).onTouchEvent(obtain)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            case 16:
                int action = motionEvent.getAction();
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.c;
                if (g1Var.F != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(g1Var.F.getX(), g1Var.F.getY());
                    boolean dispatchTouchEvent = g1Var.F.dispatchTouchEvent(motionEvent);
                    obtain2.recycle();
                    if (action == 1 || action == 3) {
                        g1Var.F = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = g1Var.B.onTouchEvent(obtain3);
                obtain3.recycle();
                boolean z10 = !g1Var.B.isInProgress() && ((GestureDetector) g1Var.C.b).onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    g1Var.D = false;
                    g1Var.E = false;
                    o1.j jVar = g1Var.O;
                    if (!jVar.f) {
                        float f10 = g1Var.M;
                        jVar.b = f10;
                        jVar.c = true;
                        jVar.u.i = (g1Var.I / 2.0f) + f10 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - r7) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                        g1Var.O.f();
                    }
                    o1.j jVar2 = g1Var.P;
                    if (!jVar2.f) {
                        jVar2.b = g1Var.N;
                        jVar2.c = true;
                        jVar2.u.i = h7.n.a(r2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - g1Var.J) - AndroidUtilities.dp(16.0f));
                        g1Var.P.f();
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
            case 5:
                Path path = (Path) this.b;
                lh.c6 c6Var = (lh.c6) this.c;
                if (c6Var.h == null || (!((z10 = c6Var.f) && view == c6Var.d) && (z10 || view != c6Var.c))) {
                    return super.drawChild(canvas, view, j10);
                }
                float measuredWidth = ((z10 ? c6Var.e : 1.0f - c6Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            case 18:
                if (view instanceof rc0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 23:
                return view != ((SecretMediaViewer) this.b).w && super.drawChild(canvas, view, j10);
            case 24:
                Path path2 = (Path) this.b;
                c41 c41Var = (c41) this.c;
                RectF rectF = c41Var.N;
                if (view == c41Var.J || view == c41Var.x) {
                    canvas.save();
                    canvas.clipRect(0.0f, AndroidUtilities.lerp(c41Var.P, 0.0f, c41Var.s), getWidth(), AndroidUtilities.lerp(c41Var.Q, getHeight(), c41Var.s));
                    boolean drawChild2 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild2;
                }
                if (view != c41Var.L) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                path2.rewind();
                path2.addCircle(rectF.centerX() + c41Var.J.getX(), rectF.centerY() + c41Var.J.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.clipRect(0.0f, AndroidUtilities.lerp(c41Var.P, 0.0f, c41Var.s), getWidth(), AndroidUtilities.lerp(c41Var.Q, getHeight(), c41Var.s));
                canvas.translate(-c41Var.L.getX(), -c41Var.L.getY());
                canvas.translate(c41Var.J.getX() + rectF.left, c41Var.J.getY() + rectF.top);
                canvas.scale(rectF.width() / c41Var.L.getMeasuredWidth(), rectF.height() / c41Var.L.getMeasuredHeight(), c41Var.L.getX(), c41Var.L.getY());
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            case 25:
                if (view != ((a61) this.c).d0 || !ig.g0.b || !ig.g0.f) {
                    return super.drawChild(canvas, view, j10);
                }
                for (int i10 = 0; i10 < ((a61) this.c).d0.getChildCount(); i10++) {
                    View childAt = ((a61) this.c).d0.getChildAt(i10);
                    if (childAt instanceof j51) {
                        j51 j51Var = (j51) childAt;
                        if (j51Var.getAnimatedScale() == 1.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        } else if (j51Var.getAnimatedScale() > 0.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            ((Rect) this.b).set((int) (r2.centerX() - (j51Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f))), (int) (((Rect) this.b).centerY() - (j51Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f))), (int) ((j51Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f)) + ((Rect) this.b).centerX()), (int) ((j51Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f)) + ((Rect) this.b).centerY()));
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            canvas.scale(j51Var.getAnimatedScale(), j51Var.getAnimatedScale(), ((Rect) this.b).centerX(), ((Rect) this.b).centerY());
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        }
                    } else if ((childAt instanceof TextView) || (childAt instanceof e51) || (childAt instanceof d51) || (childAt instanceof f51)) {
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
            case 4:
                ig.d0 d0Var = (ig.d0) this.c;
                float f10 = d0Var.u;
                float f11 = rect.bottom;
                if (f10 != f11 && d0Var.v) {
                    d0Var.u = f11;
                    y1 y1Var = d0Var.c;
                    ig.c0 c0Var = d0Var.a;
                    if (!d0Var.q) {
                        float f12 = d0Var.t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = d0Var.y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f13 = dp;
                        if (c0Var.getMeasuredHeight() + f12 > (y1Var.getMeasuredHeight() - d0Var.u) - f13) {
                            f12 = ((y1Var.getMeasuredHeight() - d0Var.u) - c0Var.getMeasuredHeight()) - f13;
                        }
                        if (f12 < 0.0f) {
                            f12 = 0.0f;
                        }
                        c0Var.animate().translationY(f12).setDuration(250L).setUpdateListener(new ig.x(d0Var, 1)).setInterpolator(er.f).start();
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
            case 28:
                super.invalidate();
                org.telegram.ui.ActionBar.q0 q0Var = ((nc1) this.c).p0;
                if (q0Var != null) {
                    q0Var.invalidate();
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
            case 3:
                super.onAttachedToWindow();
                ((ig.o) this.b).c();
                break;
            case 4:
                super.onAttachedToWindow();
                ec.a(this, (gh.w0) this.b);
                break;
            case 18:
                super.onAttachedToWindow();
                kt ktVar = (kt) this.c;
                ktVar.A.onAttachedToWindow();
                ktVar.B.onAttachedToWindow();
                break;
            case 21:
                super.onAttachedToWindow();
                ((ProfileActivity) this.c).n5.onAttachedToWindow();
                break;
            case 23:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.b).h.onAttachedToWindow();
                break;
            case 26:
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
            case 16:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.c;
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
            case 3:
                super.onDetachedFromWindow();
                ((ig.o) this.b).d();
                break;
            case 4:
                super.onDetachedFromWindow();
                ec.h(this);
                break;
            case 18:
                super.onDetachedFromWindow();
                kt ktVar = (kt) this.c;
                ktVar.A.onDetachedFromWindow();
                ktVar.B.onDetachedFromWindow();
                break;
            case 21:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.c).n5.onDetachedFromWindow();
                break;
            case 23:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.b).h.onDetachedFromWindow();
                break;
            case 26:
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
            case 14:
                dd0 dd0Var = (dd0) this.c;
                Drawable drawable2 = dd0Var.a;
                if (drawable2 == null) {
                    super.onDraw(canvas);
                } else if ((drawable2 instanceof nb0) || (drawable2 instanceof ColorDrawable) || (drawable2 instanceof GradientDrawable)) {
                    drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    dd0Var.a.draw(canvas);
                } else {
                    float max = Math.max(getMeasuredWidth() / dd0Var.a.getIntrinsicWidth(), (getMeasuredHeight() + dd0Var.C) / dd0Var.a.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(dd0Var.a.getIntrinsicWidth() * max);
                    int ceil2 = (int) Math.ceil(dd0Var.a.getIntrinsicHeight() * max);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int measuredHeight = ((getMeasuredHeight() - ceil2) + dd0Var.C) / 2;
                    dd0Var.a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
                    dd0Var.a.draw(canvas);
                }
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.b);
                break;
            case 17:
                canvas.save();
                org.telegram.ui.Components.voip.l2 l2Var = (org.telegram.ui.Components.voip.l2) this.c;
                canvas.scale(l2Var.b.getScaleX(), l2Var.b.getScaleY(), l2Var.b.getPivotX() + l2Var.b.getLeft(), l2Var.b.getPivotY() + l2Var.b.getTop());
                Drawable drawable3 = (Drawable) this.b;
                drawable3.setBounds(l2Var.b.getLeft() - AndroidUtilities.dp(2.0f), l2Var.b.getTop() - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f) + l2Var.b.getRight(), AndroidUtilities.dp(2.0f) + l2Var.b.getBottom());
                drawable3.draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                break;
            case 18:
                kt ktVar = (kt) this.b;
                Paint paint = ktVar.N;
                ImageReceiver imageReceiver = ktVar.B;
                ColorDrawable colorDrawable = ktVar.u;
                ImageReceiver imageReceiver2 = ktVar.A;
                if (ktVar.z != null && colorDrawable != null) {
                    if (ktVar.K && ktVar.v == null && ktVar.w != null && !ktVar.e0) {
                        ktVar.e0 = true;
                        imageReceiver2.setVisible(false, false);
                        ol0.d(new b5(ktVar, 8));
                    }
                    if (ktVar.v != null) {
                        boolean z10 = ktVar.K;
                        if (z10) {
                            float f11 = ktVar.M;
                            if (f11 != 1.0f) {
                                float f12 = f11 + 0.13333334f;
                                ktVar.M = f12;
                                if (f12 > 1.0f) {
                                    ktVar.M = 1.0f;
                                }
                                ktVar.z.invalidate();
                                f10 = ktVar.M;
                                if (f10 != 0.0f && ktVar.v != null) {
                                    paint.setAlpha((int) (f10 * 255.0f));
                                    if (paint.getAlpha() != 255) {
                                        canvas.drawColor(g6.l1(ktVar.M, g6.v0(g6.a7, ktVar.c0)));
                                    }
                                    canvas.drawPaint(paint);
                                }
                            }
                        }
                        if (!z10) {
                            float f13 = ktVar.M;
                            if (f13 != 0.0f) {
                                float f14 = f13 - 0.13333334f;
                                ktVar.M = f14;
                                if (f14 < 0.0f) {
                                    ktVar.M = 0.0f;
                                }
                                ktVar.z.invalidate();
                            }
                        }
                        f10 = ktVar.M;
                        if (f10 != 0.0f) {
                            paint.setAlpha((int) (f10 * 255.0f));
                            if (paint.getAlpha() != 255) {
                            }
                            canvas.drawPaint(paint);
                        }
                    }
                    colorDrawable.setAlpha((int) (ktVar.F * 180.0f));
                    colorDrawable.setBounds(0, 0, ktVar.z.getWidth(), ktVar.z.getHeight());
                    colorDrawable.draw(canvas);
                    canvas.save();
                    i0.c cVar = ktVar.q;
                    int i10 = cVar.d;
                    int i11 = cVar.b;
                    int i12 = i10 + i11;
                    if (ktVar.V == 1) {
                        min = Math.min(ktVar.z.getWidth(), ktVar.z.getHeight() - i12) - AndroidUtilities.dp(40.0f);
                    } else {
                        min = (int) (ktVar.S ? Math.min(ktVar.z.getWidth(), ktVar.z.getHeight() - i12) - AndroidUtilities.dpf2(40.0f) : Math.min(ktVar.z.getWidth(), ktVar.z.getHeight() - i12) / 1.8f);
                    }
                    float max2 = Math.max((min / 2) + i11 + (ktVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((ktVar.z.getHeight() - i12) - ktVar.I) / 2);
                    if (ktVar.S) {
                        max2 += AndroidUtilities.dp(40.0f);
                    }
                    canvas.translate(ktVar.z.getWidth() / 2, ktVar.e + max2);
                    int i13 = (int) (min * ((ktVar.F * 0.8f) / 0.8f));
                    if (ktVar.V == 3) {
                        canvas.translate(0.0f, AndroidUtilities.dp(70.0f));
                    }
                    if (ktVar.S) {
                        float f15 = i13;
                        float f16 = 0.6669f * f15;
                        imageReceiver2.setAlpha(ktVar.F);
                        float f17 = f15 - f16;
                        float f18 = f15 / 2.0f;
                        imageReceiver2.setImageCoords((f17 - f18) - (0.0546875f * f15), (f17 / 2.0f) - f18, f16, f16);
                        imageReceiver2.draw(canvas);
                        imageReceiver.setAlpha(ktVar.F);
                        float f19 = (-i13) / 2.0f;
                        imageReceiver.setImageCoords(f19, f19, f15, f15);
                        imageReceiver.draw(canvas);
                    } else {
                        imageReceiver2.setAlpha(ktVar.F);
                        float f20 = (-i13) / 2.0f;
                        float f21 = i13;
                        imageReceiver2.setImageCoords(f20, f20, f21, f21);
                        imageReceiver2.draw(canvas);
                    }
                    if (ktVar.C != null) {
                        canvas.save();
                        float f22 = (-i13) / 2.0f;
                        canvas.translate(f22, f22);
                        float f23 = i13;
                        canvas.scale(f23 / ktVar.C.getWidth(), f23 / ktVar.C.getHeight());
                        ktVar.C.setAlpha(ktVar.F);
                        if (ktVar.D == null) {
                            ktVar.D = new Path();
                        }
                        ktVar.D.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, ktVar.C.getWidth(), ktVar.C.getHeight());
                        float f24 = f23 / 8.0f;
                        ktVar.D.addRoundRect(rectF, f24, f24, Path.Direction.CW);
                        canvas.clipPath(ktVar.D);
                        ktVar.C.draw(canvas);
                        canvas.restore();
                    }
                    if (ktVar.V == 1 && !ktVar.m && (drawable = ktVar.J) != null) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = ktVar.J.getIntrinsicHeight();
                        int dp = (int) (imageReceiver2.getDrawRegion().top - AndroidUtilities.dp(((ktVar.d / AndroidUtilities.dp(60.0f)) * 6.0f) + 17.0f));
                        ktVar.J.setAlpha((int) ((1.0f - ktVar.g) * 255.0f));
                        ktVar.J.setBounds((-intrinsicWidth) / 2, (-intrinsicHeight) + dp, intrinsicWidth / 2, dp);
                        ktVar.J.draw(canvas);
                    }
                    if (ktVar.G != null) {
                        if (ktVar.S) {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
                        } else {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver2.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
                        }
                        kt.f0.setAlpha((int) (ktVar.F * 255.0f));
                        ktVar.G.draw(canvas);
                    }
                    canvas.restore();
                    if (ktVar.E) {
                        if (ktVar.F != 1.0f) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j10 = currentTimeMillis - ktVar.H;
                            ktVar.H = currentTimeMillis;
                            ktVar.F = (j10 / 120.0f) + ktVar.F;
                            ktVar.z.invalidate();
                            if (ktVar.F > 1.0f) {
                                ktVar.F = 1.0f;
                                break;
                            }
                        }
                    } else if (ktVar.F != 0.0f) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long j11 = currentTimeMillis2 - ktVar.H;
                        ktVar.H = currentTimeMillis2;
                        ktVar.F -= j11 / 120.0f;
                        ktVar.z.invalidate();
                        if (ktVar.F < 0.0f) {
                            ktVar.F = 0.0f;
                        }
                        if (ktVar.F == 0.0f) {
                            imageReceiver2.setImageBitmap((Drawable) null);
                            AndroidUtilities.unlockOrientation(ktVar.w);
                            AndroidUtilities.runOnUIThread(new vs(ktVar, 1));
                            Bitmap bitmap = ktVar.v;
                            if (bitmap != null) {
                                bitmap.recycle();
                                ktVar.v = null;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(ktVar.O, false, 1.0f, false);
                            ktVar.M = 0.0f;
                            try {
                                if (ktVar.y.getParent() != null) {
                                    ((WindowManager) ktVar.w.getSystemService("window")).removeView(ktVar.y);
                                    break;
                                }
                            } catch (Exception e9) {
                                FileLog.e(e9);
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
                paint2.setColor(((nc1) this.c).getThemedColor(g6.Sd));
                canvas.drawRect(0.0f, intrinsicHeight2, getMeasuredWidth(), getMeasuredHeight(), paint2);
                break;
            case 28:
                int[] iArr = (int[]) this.b;
                nc1 nc1Var = (nc1) this.c;
                if (!AndroidUtilities.usingHardwareInput) {
                    getLocationInWindow(iArr);
                    if (nc1Var.o0.getTranslationY() != iArr[1]) {
                        nc1Var.o0.setTranslationY(-r0);
                        nc1Var.p0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < nc1Var.L) {
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
        tc tcVar;
        switch (this.a) {
            case 21:
                return (((ProfileActivity) this.c).j5 == 0.0f && (tcVar = (tc) this.b) != null && tcVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
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
                int x8 = rl.x(275.0f, i15, 2);
                l70 l70Var = (l70) this.c;
                FrameLayout frameLayout = l70Var.r;
                frameLayout.layout(0, x8, frameLayout.getMeasuredWidth(), l70Var.r.getMeasuredHeight() + x8);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + x8;
                int measuredWidth = (getMeasuredWidth() - l70Var.e.getMeasuredWidth()) / 2;
                ia iaVar = l70Var.e;
                iaVar.layout(measuredWidth, dp, iaVar.getMeasuredWidth() + measuredWidth, l70Var.e.getMeasuredHeight() + dp);
                m2.g gVar = l70Var.d;
                gVar.layout(0, 0, gVar.getMeasuredWidth(), l70Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - l70Var.n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - l70Var.n.getMeasuredWidth()) / 2;
                e1 e1Var = l70Var.n;
                e1Var.layout(measuredWidth2, measuredHeight, e1Var.getMeasuredWidth() + measuredWidth2, l70Var.n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - l70Var.f.getMeasuredWidth()) / 2;
                TextView textView = l70Var.f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), l70Var.f.getMeasuredWidth() + measuredWidth3, dp2);
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
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + rl.x(275.0f, ((i13 - i11) / 4) * 3, 2);
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
                    v31 v31Var = secretMediaViewer.n;
                    v31Var.layout(v31Var.getLeft(), currentActionBarHeight, secretMediaViewer.n.getRight(), secretMediaViewer.n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.r != null && secretMediaViewer.n != null) {
                    int measuredHeight2 = (secretMediaViewer.n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    w3 w3Var = secretMediaViewer.r;
                    w3Var.layout(w3Var.getLeft(), measuredHeight2, secretMediaViewer.r.getRight(), secretMediaViewer.r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.W != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    at0 at0Var = secretMediaViewer.W;
                    at0Var.layout(at0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.W.getRight(), secretMediaViewer.W.getMeasuredHeight() + currentActionBarHeight2);
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
        f2.k0 xVar;
        switch (this.a) {
            case 0:
                super.onMeasure(i10, rl.B(2.0f, ((g2) this.c).s, TLObject.FLAG_30));
                break;
            case 6:
                super.onMeasure(i10, i11);
                super.onMeasure(i10, rl.B(8.0f, ((LinearLayout) this.b).getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 11:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                break;
            case 13:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
                setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                break;
            case 22:
                x11 x11Var = (x11) this.c;
                View view = x11Var.D;
                View view2 = x11Var.E;
                LinearLayout linearLayout = x11Var.v;
                TextView textView = x11Var.s;
                zk0 zk0Var = x11Var.y;
                boolean z10 = x11Var.O.L;
                int dp = AndroidUtilities.dp(12.0f);
                if (z10) {
                    zk0Var.setLayoutParams(z5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
                    zk0Var.setPadding(dp, 0, dp, 0);
                    if (linearLayout != null) {
                        textView.setLayoutParams(z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(z5.d(-1, 48.0f, 8388691, 16.0f, 162.0f, 16.0f, 16.0f));
                    } else {
                        textView.setLayoutParams(z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
                    }
                } else {
                    zk0Var.setPadding(dp, dp / 2, dp, dp);
                    if (linearLayout != null) {
                        zk0Var.setLayoutParams(z5.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 136.0f));
                        textView.setLayoutParams(z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    } else {
                        zk0Var.setLayoutParams(z5.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 80.0f));
                        textView.setLayoutParams(z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    }
                }
                if (z10) {
                    view2.setVisibility(8);
                    view.setVisibility(8);
                } else {
                    int i12 = textView != null ? 136 : 80;
                    view2.setVisibility(0);
                    view2.setLayoutParams(z5.d(-1, AndroidUtilities.dp(2.0f), 80, 0.0f, 0.0f, 0.0f, i12));
                    view.setVisibility(0);
                    view.setLayoutParams(z5.d(-1, AndroidUtilities.dp(2.0f), 48, 0.0f, 44.0f, 0.0f, 0.0f));
                }
                if (x11Var.N != z10) {
                    y11 y11Var = x11Var.d;
                    if (z10) {
                        y11Var.getParentActivity();
                        xVar = new f2.k0(0, false);
                    } else {
                        y11Var.getParentActivity();
                        xVar = new f2.x(3, false);
                    }
                    x11Var.C = xVar;
                    zk0Var.setLayoutManager(xVar);
                    zk0Var.requestLayout();
                    int i13 = x11Var.H;
                    if (i13 != -1) {
                        x11Var.b(i13);
                    }
                    x11Var.N = z10;
                }
                super.onMeasure(i10, i11);
                break;
            case 23:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                at0 at0Var = secretMediaViewer.W;
                if (at0Var != null) {
                    at0Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - (secretMediaViewer.Q.getVisibility() != 0 ? 0 : secretMediaViewer.Q.getMeasuredHeight()), TLObject.FLAG_30));
                }
                View view3 = secretMediaViewer.f;
                if (view3 != null) {
                    view3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.navigationBarHeight, TLObject.FLAG_30));
                    break;
                }
                break;
            case 29:
                ViewGroup viewGroup = (ViewGroup) this.b;
                pf.d dVar = (pf.d) this.c;
                if (!dVar.G || !dVar.F) {
                    int size = View.MeasureSpec.getSize(i11);
                    if (size == 0) {
                        size = viewGroup.getMeasuredHeight();
                    }
                    if (size == 0) {
                        size = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                    }
                    int dp2 = AndroidUtilities.dp(50.0f);
                    int dp3 = dVar.v != 0 ? 0 : AndroidUtilities.dp(30.0f) + dp2;
                    if (!dVar.A && !dVar.w) {
                        dp3 += dp2;
                    }
                    int paddingTop = (size - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp3 < paddingTop ? paddingTop - dp3 : 0, TLObject.FLAG_30));
                    break;
                } else {
                    super.onMeasure(i10, i11);
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
        tc tcVar;
        switch (this.a) {
            case 21:
                return (((ProfileActivity) this.c).j5 == 0.0f && (tcVar = (tc) this.b) != null && tcVar.b(motionEvent)) || super.onTouchEvent(motionEvent);
            case 22:
            default:
                return super.onTouchEvent(motionEvent);
            case 23:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                if (secretMediaViewer.i0 == 0 && secretMediaViewer.F0 == 0) {
                    if (motionEvent.getPointerCount() == 1 && secretMediaViewer.H0.onTouchEvent(motionEvent) && secretMediaViewer.X0) {
                        secretMediaViewer.X0 = false;
                        secretMediaViewer.W0 = false;
                        secretMediaViewer.V0 = false;
                        secretMediaViewer.d(false);
                    } else if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                        secretMediaViewer.b1 = false;
                        bm0 bm0Var = secretMediaViewer.c1;
                        if (!bm0Var.q) {
                            bm0Var.a();
                        }
                        if (!secretMediaViewer.l0) {
                            if (motionEvent.getPointerCount() == 2) {
                                secretMediaViewer.J0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                secretMediaViewer.K0 = secretMediaViewer.u0;
                                secretMediaViewer.L0 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                                secretMediaViewer.M0 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                                secretMediaViewer.N0 = secretMediaViewer.s0;
                                secretMediaViewer.O0 = secretMediaViewer.t0;
                                secretMediaViewer.V0 = true;
                                secretMediaViewer.W0 = false;
                            } else if (motionEvent.getPointerCount() == 1) {
                                secretMediaViewer.P0 = motionEvent.getX();
                                float y10 = motionEvent.getY();
                                secretMediaViewer.Q0 = y10;
                                secretMediaViewer.m0 = y10;
                                secretMediaViewer.l0 = false;
                                secretMediaViewer.Z0 = true;
                            }
                        }
                    } else {
                        float f10 = 0.0f;
                        if (motionEvent.getActionMasked() == 2) {
                            if (motionEvent.getPointerCount() == 2 && !secretMediaViewer.l0 && secretMediaViewer.V0) {
                                secretMediaViewer.b1 = true;
                                secretMediaViewer.u0 = (((float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0))) / secretMediaViewer.J0) * secretMediaViewer.K0;
                                secretMediaViewer.s0 = rl.c(secretMediaViewer.u0, secretMediaViewer.K0, (secretMediaViewer.L0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.N0, secretMediaViewer.L0 - (secretMediaViewer.e.getWidth() / 2));
                                float height = secretMediaViewer.M0 - (secretMediaViewer.e.getHeight() / 2);
                                float height2 = (secretMediaViewer.M0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.O0;
                                float f11 = secretMediaViewer.u0;
                                secretMediaViewer.t0 = rl.c(f11, secretMediaViewer.K0, height2, height);
                                secretMediaViewer.n(f11);
                                secretMediaViewer.e.invalidate();
                            } else if (motionEvent.getPointerCount() == 1) {
                                float abs = Math.abs(motionEvent.getX() - secretMediaViewer.P0);
                                float abs2 = Math.abs(motionEvent.getY() - secretMediaViewer.m0);
                                if (abs > AndroidUtilities.dp(3.0f) || abs2 > AndroidUtilities.dp(3.0f)) {
                                    secretMediaViewer.b1 = true;
                                }
                                if (secretMediaViewer.Z0 && !secretMediaViewer.l0 && secretMediaViewer.u0 == 1.0f && abs2 >= AndroidUtilities.dp(30.0f) && abs2 / 2.0f > abs) {
                                    secretMediaViewer.l0 = true;
                                    secretMediaViewer.W0 = false;
                                    secretMediaViewer.m0 = motionEvent.getY();
                                    if (secretMediaViewer.g0) {
                                        secretMediaViewer.m(false, true);
                                    }
                                } else if (secretMediaViewer.l0) {
                                    secretMediaViewer.t0 = motionEvent.getY() - secretMediaViewer.m0;
                                    secretMediaViewer.e.invalidate();
                                } else if (secretMediaViewer.Y0 || secretMediaViewer.F0 != 0) {
                                    secretMediaViewer.Y0 = false;
                                    secretMediaViewer.P0 = motionEvent.getX();
                                    secretMediaViewer.Q0 = motionEvent.getY();
                                } else {
                                    float x8 = secretMediaViewer.P0 - motionEvent.getX();
                                    float y11 = secretMediaViewer.Q0 - motionEvent.getY();
                                    if (secretMediaViewer.W0 || ((secretMediaViewer.u0 == 1.0f && Math.abs(y11) + AndroidUtilities.dp(12.0f) < Math.abs(x8)) || secretMediaViewer.u0 != 1.0f)) {
                                        if (!secretMediaViewer.W0) {
                                            secretMediaViewer.W0 = true;
                                            secretMediaViewer.Z0 = false;
                                            x8 = 0.0f;
                                            y11 = 0.0f;
                                        }
                                        secretMediaViewer.P0 = motionEvent.getX();
                                        secretMediaViewer.Q0 = motionEvent.getY();
                                        secretMediaViewer.n(secretMediaViewer.u0);
                                        float f12 = secretMediaViewer.s0;
                                        if (f12 < secretMediaViewer.R0 || f12 > secretMediaViewer.S0) {
                                            x8 /= 3.0f;
                                        }
                                        float f13 = secretMediaViewer.U0;
                                        if (f13 == 0.0f) {
                                            float f14 = secretMediaViewer.T0;
                                            if (f14 == 0.0f) {
                                                float f15 = secretMediaViewer.t0 - y11;
                                                if (f15 < f14) {
                                                    secretMediaViewer.t0 = f14;
                                                } else {
                                                    if (f15 > f13) {
                                                        secretMediaViewer.t0 = f13;
                                                    }
                                                    f10 = y11;
                                                }
                                                secretMediaViewer.s0 = f12 - x8;
                                                if (secretMediaViewer.u0 != 1.0f) {
                                                    secretMediaViewer.t0 -= f10;
                                                }
                                                secretMediaViewer.e.invalidate();
                                            }
                                        }
                                        float f16 = secretMediaViewer.t0;
                                        if (f16 < secretMediaViewer.T0 || f16 > f13) {
                                            f10 = y11 / 3.0f;
                                            secretMediaViewer.s0 = f12 - x8;
                                            if (secretMediaViewer.u0 != 1.0f) {
                                            }
                                            secretMediaViewer.e.invalidate();
                                        }
                                        f10 = y11;
                                        secretMediaViewer.s0 = f12 - x8;
                                        if (secretMediaViewer.u0 != 1.0f) {
                                        }
                                        secretMediaViewer.e.invalidate();
                                    }
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                            if (secretMediaViewer.V0) {
                                secretMediaViewer.Y0 = true;
                                float f17 = secretMediaViewer.u0;
                                if (f17 < 1.0f) {
                                    secretMediaViewer.n(1.0f);
                                    secretMediaViewer.c(1.0f, 0.0f, 0.0f, true);
                                } else if (f17 > 3.0f) {
                                    float c10 = rl.c(3.0f, secretMediaViewer.K0, (secretMediaViewer.L0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.N0, secretMediaViewer.L0 - (secretMediaViewer.e.getWidth() / 2));
                                    float c11 = rl.c(3.0f, secretMediaViewer.K0, (secretMediaViewer.M0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.O0, secretMediaViewer.M0 - (secretMediaViewer.e.getHeight() / 2));
                                    secretMediaViewer.n(3.0f);
                                    float f18 = secretMediaViewer.R0;
                                    if (c10 >= f18) {
                                        f18 = secretMediaViewer.S0;
                                        break;
                                    }
                                    c10 = f18;
                                    float f19 = secretMediaViewer.T0;
                                    if (c11 >= f19) {
                                        f19 = secretMediaViewer.U0;
                                        break;
                                    }
                                    c11 = f19;
                                    secretMediaViewer.c(3.0f, c10, c11, true);
                                } else {
                                    secretMediaViewer.d(true);
                                }
                                secretMediaViewer.V0 = false;
                            } else if (secretMediaViewer.l0) {
                                if (Math.abs(secretMediaViewer.m0 - motionEvent.getY()) > secretMediaViewer.e.getHeight() / 6.0f) {
                                    secretMediaViewer.e(true, false);
                                } else {
                                    secretMediaViewer.c(1.0f, 0.0f, 0.0f, false);
                                }
                                secretMediaViewer.l0 = false;
                            } else if (secretMediaViewer.W0) {
                                float f20 = secretMediaViewer.s0;
                                float f21 = secretMediaViewer.t0;
                                secretMediaViewer.n(secretMediaViewer.u0);
                                secretMediaViewer.W0 = false;
                                secretMediaViewer.Z0 = true;
                                float f22 = secretMediaViewer.s0;
                                float f23 = secretMediaViewer.R0;
                                if (f22 >= f23) {
                                    f23 = secretMediaViewer.S0;
                                    break;
                                }
                                f20 = f23;
                                float f24 = secretMediaViewer.t0;
                                float f25 = secretMediaViewer.T0;
                                if (f24 >= f25) {
                                    f25 = secretMediaViewer.U0;
                                    break;
                                }
                                f21 = f25;
                                secretMediaViewer.c(secretMediaViewer.u0, f20, f21, false);
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
            case 14:
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
            case 13:
                return ((i6) this.b) == drawable || ((i6) this.c) == drawable || super.verifyDrawable(drawable);
            case 22:
                return drawable == ((x11) this.c).f || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(org.telegram.ui.Cells.y0 y0Var, Context context) {
        super(context);
        this.a = 8;
        this.c = y0Var;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(ig.d0 d0Var, Context context) {
        super(context);
        this.a = 4;
        this.c = d0Var;
        this.b = new gh.w0(this, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(c41 c41Var, Context context) {
        super(context);
        this.a = 24;
        this.c = c41Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(wb wbVar, Context context) {
        super(context);
        this.a = 9;
        this.c = wbVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(ig.s sVar, Context context) {
        super(context);
        this.a = 3;
        this.c = sVar;
        this.b = new ig.o(this, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(p5 p5Var, Activity activity) {
        super(activity);
        this.a = 7;
        this.c = p5Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(org.telegram.ui.Components.voip.g1 g1Var, Context context) {
        super(context);
        this.a = 16;
        this.c = g1Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(dd0 dd0Var, Context context) {
        super(context);
        this.a = 14;
        this.c = dd0Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(Context context, TextView textView, TextView textView2) {
        super(context);
        this.a = 20;
        this.b = textView;
        this.c = textView2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.a = 23;
        this.c = secretMediaViewer;
        this.b = secretMediaViewer;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(a61 a61Var, Context context) {
        super(context);
        this.a = 25;
        this.c = a61Var;
        this.b = new Rect();
    }

    private final void a(boolean z10) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(Context context, int i10, c6 c6Var) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 13:
                super(context);
                i6 i6Var = new i6(true, true, true, false);
                this.b = i6Var;
                er erVar = er.h;
                i6Var.k(0.3f, 430L, erVar);
                i6Var.u(AndroidUtilities.bold());
                i6Var.r(g6.v0(g6.A8, c6Var));
                i6Var.t(AndroidUtilities.dp(18.0f));
                i6Var.n(!LocaleController.isRTL);
                i6Var.setCallback(this);
                i6Var.G = AndroidUtilities.displaySize.x;
                i6 i6Var2 = new i6(true, true, true, false);
                this.c = i6Var2;
                i6Var2.k(0.3f, 430L, erVar);
                i6Var2.r(g6.v0(g6.B8, c6Var));
                i6Var2.t(AndroidUtilities.dp(14.0f));
                i6Var2.n(true ^ LocaleController.isRTL);
                i6Var2.setCallback(this);
                i6Var2.G = AndroidUtilities.displaySize.x;
                break;
            default:
                LinearLayout g10 = org.telegram.messenger.y1.g(context, 1);
                j6 j6Var = new j6(context, false, false, false);
                this.b = j6Var;
                int i11 = g6.G6;
                j6Var.setTextColor(g6.v0(i11, c6Var));
                j6Var.setTextSize(AndroidUtilities.dp(17.0f));
                j6Var.setTypeface(AndroidUtilities.bold());
                g10.addView(j6Var, z5.q(-2, 23, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTextSize(1, 11.0f);
                textView.setTextColor(g6.v0(i11, c6Var));
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                g10.addView(textView, z5.q(-2, -2, 1));
                addView(g10, z5.e(-2, -2, 17));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(x11 x11Var, Activity activity, y11 y11Var) {
        super(activity);
        this.a = 22;
        this.c = x11Var;
        Rect rect = new Rect();
        this.b = rect;
        x11Var.a.setColor(y11Var.getThemedColor(g6.d6));
        Drawable drawable = x11Var.f;
        drawable.setCallback(this);
        drawable.getPadding(rect);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(ap apVar, Context context) {
        super(context);
        this.a = 11;
        this.c = apVar;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(kt ktVar, Activity activity) {
        super(activity);
        this.a = 18;
        this.c = ktVar;
        this.b = ktVar;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(nc1 nc1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 28:
                this.c = nc1Var;
                super(context);
                this.b = new int[2];
                break;
            default:
                this.c = nc1Var;
                this.b = new Paint();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(wj0 wj0Var, Context context) {
        super(context);
        this.a = 15;
        this.c = wj0Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(Context context) {
        super(context);
        this.a = 10;
        this.b = new Path();
        this.c = new v10();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(lh.c6 c6Var, Context context) {
        super(context);
        this.a = 5;
        this.c = c6Var;
        this.b = new Path();
    }
}
