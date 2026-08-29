package bg;

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
import i7.f6;
import nh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.a21;
import org.telegram.ui.b5;
import org.telegram.ui.d61;
import org.telegram.ui.f41;
import org.telegram.ui.g51;
import org.telegram.ui.h51;
import org.telegram.ui.ht;
import org.telegram.ui.i51;
import org.telegram.ui.k70;
import org.telegram.ui.ky0;
import org.telegram.ui.m4;
import org.telegram.ui.m51;
import org.telegram.ui.p5;
import org.telegram.ui.qc1;
import org.telegram.ui.ts;
import org.telegram.ui.u10;
import org.telegram.ui.ub;
import org.telegram.ui.xs0;
import org.telegram.ui.y31;
import org.telegram.ui.z11;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class d1 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(Context context, int i10) {
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
        ((n6) this.c).q(str, z10 && !LocaleController.isRTL, true);
    }

    public void d(String str, boolean z10) {
        ((n6) this.b).q(str, z10 && !LocaleController.isRTL, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        c6 c6Var;
        h5[] h5VarArr;
        char c3;
        float f9;
        ?? r10;
        float f10;
        float f11;
        org.telegram.ui.Cells.z zVar;
        switch (this.a) {
            case 1:
                ((cg.r1) this.b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                cg.r1 r1Var = (cg.r1) this.b;
                r1Var.f.setAlpha(((cg.p1) this.c).G);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, r1Var.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 8:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.b;
                int i10 = g6.a7;
                c6Var = ((org.telegram.ui.ActionBar.o2) ((p5) this.c).d).resourceProvider;
                paint.setColor(g6.v0(i10, c6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint);
                break;
            case 9:
                RectF rectF2 = (RectF) this.b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.y0 y0Var = (org.telegram.ui.Cells.y0) this.c;
                int measuredWidth = y0Var.getMeasuredWidth();
                int i11 = y0Var.d;
                float x4 = y0Var.getX();
                float f12 = y0Var.c;
                c6 c6Var2 = y0Var.b;
                if (c6Var2 != null) {
                    c6Var2.l(x4, f12, measuredWidth, i11);
                } else {
                    g6.q(x4, f12, measuredWidth, i11);
                }
                float dp = AndroidUtilities.dp(18.0f);
                float dp2 = AndroidUtilities.dp(18.0f);
                Paint G = c6Var2 != null ? c6Var2.G("paintChatActionBackground") : null;
                if (G == null) {
                    G = g6.S0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF2, dp, dp2, G);
                if (c6Var2 != null ? c6Var2.l0() : g6.a1()) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    Paint G2 = c6Var2 != null ? c6Var2.G("paintChatActionBackgroundDarken") : null;
                    if (G2 == null) {
                        G2 = g6.S0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF2, dp3, dp4, G2);
                }
                super.dispatchDraw(canvas);
                break;
            case 10:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(g6.v0(g6.a7, ((ub) this.c).f.e));
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
                u10 u10Var = (u10) this.c;
                u10Var.b(canvas, rectF3, 1, 1.0f);
                rectF3.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                u10Var.b(canvas, rectF3, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                break;
            case 12:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.b;
                paint3.setColor(((gp) this.c).getThemedColor(g6.d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint3);
                break;
            case 13:
                ry ryVar = (ry) this.c;
                if (!ryVar.C.q0 && ryVar.w > 0.0f) {
                    if (((Paint) this.b) == null) {
                        Paint paint4 = new Paint();
                        this.b = paint4;
                        paint4.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.b).setAlpha((int) (ryVar.w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.b);
                    canvas.restore();
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
            case 14:
                n6 n6Var = (n6) this.b;
                int dp6 = AndroidUtilities.dp(29.0f);
                int dp7 = AndroidUtilities.dp(18.83f);
                n6 n6Var2 = (n6) this.c;
                n6Var.setBounds(getPaddingLeft(), r3 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r3);
                n6Var.draw(canvas);
                n6Var2.setBounds(getPaddingLeft(), r2 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r2);
                n6Var2.draw(canvas);
                break;
            case 16:
                Paint paint5 = (Paint) this.b;
                fk0 fk0Var = (fk0) this.c;
                int i12 = fk0Var.I0;
                paint5.setColor((i12 == 1 || i12 == 2 || i12 == 4) ? i0.a.k(-1, 30) : i0.a.d(0.7f, g6.v0(g6.F8, fk0Var.g0), g6.v0(g6.h5, fk0Var.g0)));
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g10 = fk0Var.g();
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
                h5[] h5VarArr2 = profileActivity.r;
                if (profileActivity.S4 != null) {
                    canvas.save();
                    canvas.translate(h5VarArr2[0].getX(), h5VarArr2[0].getY());
                    h5VarArr = h5VarArr2;
                    c3 = 2;
                    f9 = 0.0f;
                    r10 = 0;
                    f10 = 24.0f;
                    f11 = 14.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.S4.getMeasuredWidth(), profileActivity.S4.getMeasuredHeight(), (int) ((1.0f - profileActivity.O1) * 255.0f), 31);
                    profileActivity.S4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    h5VarArr = h5VarArr2;
                    c3 = 2;
                    f9 = 0.0f;
                    r10 = 0;
                    f10 = 24.0f;
                    f11 = 14.0f;
                }
                if (profileActivity.l5 && profileActivity.U5 != f9 && profileActivity.j5 != 1.0f) {
                    float measuredHeight2 = (h5VarArr[1].getMeasuredHeight() / 2.0f) + h5VarArr[1].getY();
                    float dp8 = AndroidUtilities.dp(22.0f);
                    float x10 = ((h5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.k5)) - dp8) - profileActivity.Z3();
                    profileActivity.n5.setImageCoords(x10, measuredHeight2 - (dp8 / 2.0f), dp8, dp8);
                    profileActivity.n5.setAlpha(profileActivity.U5);
                    canvas.save();
                    float f13 = profileActivity.U5;
                    canvas.scale(f13, f13, profileActivity.n5.getCenterX(), profileActivity.n5.getCenterY());
                    profileActivity.n5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.j5 != f9) {
                        ad adVar = (ad) this.b;
                        if (adVar != null && (zVar = adVar.e) != null) {
                            zVar.setState(StateSet.NOTHING);
                            zVar.jumpToCurrentState();
                            break;
                        }
                    } else {
                        if (((ad) this.b) == null) {
                            ad adVar2 = new ad(this);
                            this.b = adVar2;
                            adVar2.h = new ky0(this, r10);
                        }
                        float dp9 = (1.0f - profileActivity.j5) * AndroidUtilities.dp(28.0f);
                        float textWidth = h5VarArr[c3].getTextWidth();
                        float max = Math.max(textWidth, profileActivity.P != null ? (AndroidUtilities.dp(f10) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.P.getVisibilityFactor() : 0.0f) + dp9;
                        RectF rectF5 = AndroidUtilities.rectTmp;
                        rectF5.set(x10 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(f11), x10 + max + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(f11));
                        ad adVar3 = (ad) this.b;
                        adVar3.i = r10;
                        adVar3.c = r10;
                        adVar3.a(rectF5);
                        ad adVar4 = (ad) this.b;
                        adVar4.n = true;
                        int k9 = i0.a.k(-1, 50);
                        adVar4.g.setColor((int) r10);
                        org.telegram.ui.Cells.z zVar2 = adVar4.e;
                        if (zVar2 != null) {
                            g6.B1(zVar2, k9, true);
                        }
                        ad adVar5 = (ad) this.b;
                        adVar5.c(canvas, adVar5.g);
                        org.telegram.ui.Cells.z zVar3 = adVar5.e;
                        if (zVar3 != null) {
                            zVar3.draw(canvas);
                            break;
                        }
                    }
                }
                break;
            case 23:
                Rect rect = (Rect) this.b;
                z11 z11Var = (z11) this.c;
                if (z11Var.N) {
                    z11Var.f.setBounds(-rect.left, -rect.top, getWidth() + rect.right, getHeight() + rect.bottom);
                    z11Var.f.draw(canvas);
                } else {
                    RectF rectF6 = AndroidUtilities.rectTmp;
                    rectF6.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                    canvas.drawRoundRect(rectF6, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), z11Var.a);
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
            case 5:
                if (keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 4) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                kg.d0 d0Var = (kg.d0) this.c;
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
            case 5:
                break;
            default:
                super.dispatchSetPressed(z10);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 7:
                m4 m4Var = (m4) this.c;
                w9 o10 = m4Var.L0.o(getContext());
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
            case 17:
                int action = motionEvent.getAction();
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.c;
                if (h1Var.F != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(h1Var.F.getX(), h1Var.F.getY());
                    boolean dispatchTouchEvent = h1Var.F.dispatchTouchEvent(motionEvent);
                    obtain2.recycle();
                    if (action == 1 || action == 3) {
                        h1Var.F = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = h1Var.B.onTouchEvent(obtain3);
                obtain3.recycle();
                boolean z10 = !h1Var.B.isInProgress() && ((GestureDetector) h1Var.C.b).onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    h1Var.D = false;
                    h1Var.E = false;
                    o1.k kVar = h1Var.O;
                    if (!kVar.f) {
                        float f9 = h1Var.M;
                        kVar.b = f9;
                        kVar.c = true;
                        kVar.u.i = (h1Var.I / 2.0f) + f9 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - r7) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                        h1Var.O.f();
                    }
                    o1.k kVar2 = h1Var.P;
                    if (!kVar2.f) {
                        kVar2.b = h1Var.N;
                        kVar2.c = true;
                        kVar2.u.i = i7.w.a(r2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.J) - AndroidUtilities.dp(16.0f));
                        h1Var.P.f();
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
        boolean z11;
        switch (this.a) {
            case 0:
                Path path = (Path) this.b;
                e1 e1Var = (e1) this.c;
                if (e1Var.h == null || (!((z10 = e1Var.f) && view == e1Var.d) && (z10 || view != e1Var.c))) {
                    return super.drawChild(canvas, view, j10);
                }
                float measuredWidth = ((z10 ? e1Var.e : 1.0f - e1Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            case 6:
                Path path2 = (Path) this.b;
                r5 r5Var = (r5) this.c;
                if (r5Var.h == null || (!((z11 = r5Var.f) && view == r5Var.d) && (z11 || view != r5Var.c))) {
                    return super.drawChild(canvas, view, j10);
                }
                float measuredWidth2 = ((z11 ? r5Var.e : 1.0f - r5Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path2.rewind();
                path2.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth2, Path.Direction.CW);
                canvas.clipPath(path2);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            case 19:
                if (view instanceof bd0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 24:
                return view != ((SecretMediaViewer) this.b).w && super.drawChild(canvas, view, j10);
            case 25:
                Path path3 = (Path) this.b;
                f41 f41Var = (f41) this.c;
                RectF rectF = f41Var.N;
                if (view == f41Var.J || view == f41Var.x) {
                    canvas.save();
                    canvas.clipRect(0.0f, AndroidUtilities.lerp(f41Var.P, 0.0f, f41Var.s), getWidth(), AndroidUtilities.lerp(f41Var.Q, getHeight(), f41Var.s));
                    boolean drawChild3 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild3;
                }
                if (view != f41Var.L) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                path3.rewind();
                path3.addCircle(rectF.centerX() + f41Var.J.getX(), rectF.centerY() + f41Var.J.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path3);
                canvas.clipRect(0.0f, AndroidUtilities.lerp(f41Var.P, 0.0f, f41Var.s), getWidth(), AndroidUtilities.lerp(f41Var.Q, getHeight(), f41Var.s));
                canvas.translate(-f41Var.L.getX(), -f41Var.L.getY());
                canvas.translate(f41Var.J.getX() + rectF.left, f41Var.J.getY() + rectF.top);
                canvas.scale(rectF.width() / f41Var.L.getMeasuredWidth(), rectF.height() / f41Var.L.getMeasuredHeight(), f41Var.L.getX(), f41Var.L.getY());
                boolean drawChild4 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild4;
            case 26:
                if (view != ((d61) this.c).d0 || !kg.g0.b || !kg.g0.f) {
                    return super.drawChild(canvas, view, j10);
                }
                for (int i10 = 0; i10 < ((d61) this.c).d0.getChildCount(); i10++) {
                    View childAt = ((d61) this.c).d0.getChildAt(i10);
                    if (childAt instanceof m51) {
                        m51 m51Var = (m51) childAt;
                        if (m51Var.getAnimatedScale() == 1.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        } else if (m51Var.getAnimatedScale() > 0.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            ((Rect) this.b).set((int) (r2.centerX() - (m51Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f))), (int) (((Rect) this.b).centerY() - (m51Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f))), (int) ((m51Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f)) + ((Rect) this.b).centerX()), (int) ((m51Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f)) + ((Rect) this.b).centerY()));
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            canvas.scale(m51Var.getAnimatedScale(), m51Var.getAnimatedScale(), ((Rect) this.b).centerX(), ((Rect) this.b).centerY());
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        }
                    } else if ((childAt instanceof TextView) || (childAt instanceof h51) || (childAt instanceof g51) || (childAt instanceof i51)) {
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
            case 5:
                kg.d0 d0Var = (kg.d0) this.c;
                float f9 = d0Var.u;
                float f10 = rect.bottom;
                if (f9 != f10 && d0Var.v) {
                    d0Var.u = f10;
                    d1 d1Var = d0Var.c;
                    kg.c0 c0Var = d0Var.a;
                    if (!d0Var.q) {
                        float f11 = d0Var.t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = d0Var.y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f12 = dp;
                        if (c0Var.getMeasuredHeight() + f11 > (d1Var.getMeasuredHeight() - d0Var.u) - f12) {
                            f11 = ((d1Var.getMeasuredHeight() - d0Var.u) - c0Var.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        c0Var.animate().translationY(f11).setDuration(250L).setUpdateListener(new kg.y(d0Var, 1)).setInterpolator(jr.f).start();
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
                org.telegram.ui.ActionBar.r0 r0Var = ((qc1) this.c).p0;
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
            case 4:
                super.onAttachedToWindow();
                ((kg.o) this.b).c();
                break;
            case 5:
                super.onAttachedToWindow();
                mc.a(this, (ih.u0) this.b);
                break;
            case 19:
                super.onAttachedToWindow();
                ht htVar = (ht) this.c;
                htVar.A.onAttachedToWindow();
                htVar.B.onAttachedToWindow();
                break;
            case 22:
                super.onAttachedToWindow();
                ((ProfileActivity) this.c).n5.onAttachedToWindow();
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
            case 4:
                super.onDetachedFromWindow();
                ((kg.o) this.b).d();
                break;
            case 5:
                super.onDetachedFromWindow();
                mc.h(this);
                break;
            case 19:
                super.onDetachedFromWindow();
                ht htVar = (ht) this.c;
                htVar.A.onDetachedFromWindow();
                htVar.B.onDetachedFromWindow();
                break;
            case 22:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.c).n5.onDetachedFromWindow();
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
        float f9;
        switch (this.a) {
            case 15:
                nd0 nd0Var = (nd0) this.c;
                Drawable drawable2 = nd0Var.a;
                if (drawable2 == null) {
                    super.onDraw(canvas);
                } else if ((drawable2 instanceof yb0) || (drawable2 instanceof ColorDrawable) || (drawable2 instanceof GradientDrawable)) {
                    drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    nd0Var.a.draw(canvas);
                } else {
                    float max = Math.max(getMeasuredWidth() / nd0Var.a.getIntrinsicWidth(), (getMeasuredHeight() + nd0Var.C) / nd0Var.a.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(nd0Var.a.getIntrinsicWidth() * max);
                    int ceil2 = (int) Math.ceil(nd0Var.a.getIntrinsicHeight() * max);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int measuredHeight = ((getMeasuredHeight() - ceil2) + nd0Var.C) / 2;
                    nd0Var.a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
                    nd0Var.a.draw(canvas);
                }
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.b);
                break;
            case 18:
                canvas.save();
                org.telegram.ui.Components.voip.o2 o2Var = (org.telegram.ui.Components.voip.o2) this.c;
                canvas.scale(o2Var.b.getScaleX(), o2Var.b.getScaleY(), o2Var.b.getPivotX() + o2Var.b.getLeft(), o2Var.b.getPivotY() + o2Var.b.getTop());
                Drawable drawable3 = (Drawable) this.b;
                drawable3.setBounds(o2Var.b.getLeft() - AndroidUtilities.dp(2.0f), o2Var.b.getTop() - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f) + o2Var.b.getRight(), AndroidUtilities.dp(2.0f) + o2Var.b.getBottom());
                drawable3.draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                break;
            case 19:
                ht htVar = (ht) this.b;
                Paint paint = htVar.N;
                ImageReceiver imageReceiver = htVar.B;
                ColorDrawable colorDrawable = htVar.u;
                ImageReceiver imageReceiver2 = htVar.A;
                if (htVar.z != null && colorDrawable != null) {
                    if (htVar.K && htVar.v == null && htVar.w != null && !htVar.e0) {
                        htVar.e0 = true;
                        imageReceiver2.setVisible(false, false);
                        yl0.d(new b5(htVar, 8));
                    }
                    if (htVar.v != null) {
                        boolean z10 = htVar.K;
                        if (z10) {
                            float f10 = htVar.M;
                            if (f10 != 1.0f) {
                                float f11 = f10 + 0.13333334f;
                                htVar.M = f11;
                                if (f11 > 1.0f) {
                                    htVar.M = 1.0f;
                                }
                                htVar.z.invalidate();
                                f9 = htVar.M;
                                if (f9 != 0.0f && htVar.v != null) {
                                    paint.setAlpha((int) (f9 * 255.0f));
                                    if (paint.getAlpha() != 255) {
                                        canvas.drawColor(g6.l1(htVar.M, g6.v0(g6.a7, htVar.c0)));
                                    }
                                    canvas.drawPaint(paint);
                                }
                            }
                        }
                        if (!z10) {
                            float f12 = htVar.M;
                            if (f12 != 0.0f) {
                                float f13 = f12 - 0.13333334f;
                                htVar.M = f13;
                                if (f13 < 0.0f) {
                                    htVar.M = 0.0f;
                                }
                                htVar.z.invalidate();
                            }
                        }
                        f9 = htVar.M;
                        if (f9 != 0.0f) {
                            paint.setAlpha((int) (f9 * 255.0f));
                            if (paint.getAlpha() != 255) {
                            }
                            canvas.drawPaint(paint);
                        }
                    }
                    colorDrawable.setAlpha((int) (htVar.F * 180.0f));
                    colorDrawable.setBounds(0, 0, htVar.z.getWidth(), htVar.z.getHeight());
                    colorDrawable.draw(canvas);
                    canvas.save();
                    i0.b bVar = htVar.q;
                    int i10 = bVar.d;
                    int i11 = bVar.b;
                    int i12 = i10 + i11;
                    if (htVar.V == 1) {
                        min = Math.min(htVar.z.getWidth(), htVar.z.getHeight() - i12) - AndroidUtilities.dp(40.0f);
                    } else {
                        min = (int) (htVar.S ? Math.min(htVar.z.getWidth(), htVar.z.getHeight() - i12) - AndroidUtilities.dpf2(40.0f) : Math.min(htVar.z.getWidth(), htVar.z.getHeight() - i12) / 1.8f);
                    }
                    float max2 = Math.max((min / 2) + i11 + (htVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((htVar.z.getHeight() - i12) - htVar.I) / 2);
                    if (htVar.S) {
                        max2 += AndroidUtilities.dp(40.0f);
                    }
                    canvas.translate(htVar.z.getWidth() / 2, htVar.e + max2);
                    int i13 = (int) (min * ((htVar.F * 0.8f) / 0.8f));
                    if (htVar.V == 3) {
                        canvas.translate(0.0f, AndroidUtilities.dp(70.0f));
                    }
                    if (htVar.S) {
                        float f14 = i13;
                        float f15 = 0.6669f * f14;
                        imageReceiver2.setAlpha(htVar.F);
                        float f16 = f14 - f15;
                        float f17 = f14 / 2.0f;
                        imageReceiver2.setImageCoords((f16 - f17) - (0.0546875f * f14), (f16 / 2.0f) - f17, f15, f15);
                        imageReceiver2.draw(canvas);
                        imageReceiver.setAlpha(htVar.F);
                        float f18 = (-i13) / 2.0f;
                        imageReceiver.setImageCoords(f18, f18, f14, f14);
                        imageReceiver.draw(canvas);
                    } else {
                        imageReceiver2.setAlpha(htVar.F);
                        float f19 = (-i13) / 2.0f;
                        float f20 = i13;
                        imageReceiver2.setImageCoords(f19, f19, f20, f20);
                        imageReceiver2.draw(canvas);
                    }
                    if (htVar.C != null) {
                        canvas.save();
                        float f21 = (-i13) / 2.0f;
                        canvas.translate(f21, f21);
                        float f22 = i13;
                        canvas.scale(f22 / htVar.C.getWidth(), f22 / htVar.C.getHeight());
                        htVar.C.setAlpha(htVar.F);
                        if (htVar.D == null) {
                            htVar.D = new Path();
                        }
                        htVar.D.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, htVar.C.getWidth(), htVar.C.getHeight());
                        float f23 = f22 / 8.0f;
                        htVar.D.addRoundRect(rectF, f23, f23, Path.Direction.CW);
                        canvas.clipPath(htVar.D);
                        htVar.C.draw(canvas);
                        canvas.restore();
                    }
                    if (htVar.V == 1 && !htVar.m && (drawable = htVar.J) != null) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = htVar.J.getIntrinsicHeight();
                        int dp = (int) (imageReceiver2.getDrawRegion().top - AndroidUtilities.dp(((htVar.d / AndroidUtilities.dp(60.0f)) * 6.0f) + 17.0f));
                        htVar.J.setAlpha((int) ((1.0f - htVar.g) * 255.0f));
                        htVar.J.setBounds((-intrinsicWidth) / 2, (-intrinsicHeight) + dp, intrinsicWidth / 2, dp);
                        htVar.J.draw(canvas);
                    }
                    if (htVar.G != null) {
                        if (htVar.S) {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
                        } else {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver2.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
                        }
                        ht.f0.setAlpha((int) (htVar.F * 255.0f));
                        htVar.G.draw(canvas);
                    }
                    canvas.restore();
                    if (htVar.E) {
                        if (htVar.F != 1.0f) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j10 = currentTimeMillis - htVar.H;
                            htVar.H = currentTimeMillis;
                            htVar.F = (j10 / 120.0f) + htVar.F;
                            htVar.z.invalidate();
                            if (htVar.F > 1.0f) {
                                htVar.F = 1.0f;
                                break;
                            }
                        }
                    } else if (htVar.F != 0.0f) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long j11 = currentTimeMillis2 - htVar.H;
                        htVar.H = currentTimeMillis2;
                        htVar.F -= j11 / 120.0f;
                        htVar.z.invalidate();
                        if (htVar.F < 0.0f) {
                            htVar.F = 0.0f;
                        }
                        if (htVar.F == 0.0f) {
                            imageReceiver2.setImageBitmap((Drawable) null);
                            AndroidUtilities.unlockOrientation(htVar.w);
                            AndroidUtilities.runOnUIThread(new ts(htVar, 1));
                            Bitmap bitmap = htVar.v;
                            if (bitmap != null) {
                                bitmap.recycle();
                                htVar.v = null;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(htVar.O, false, 1.0f, false);
                            htVar.M = 0.0f;
                            try {
                                if (htVar.y.getParent() != null) {
                                    ((WindowManager) htVar.w.getSystemService("window")).removeView(htVar.y);
                                    break;
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
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
                int intrinsicHeight2 = g6.i3.getIntrinsicHeight();
                g6.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight2);
                g6.i3.draw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(((qc1) this.c).getThemedColor(g6.Sd));
                canvas.drawRect(0.0f, intrinsicHeight2, getMeasuredWidth(), getMeasuredHeight(), paint2);
                break;
            case 29:
                int[] iArr = (int[]) this.b;
                qc1 qc1Var = (qc1) this.c;
                if (!AndroidUtilities.usingHardwareInput) {
                    getLocationInWindow(iArr);
                    if (qc1Var.o0.getTranslationY() != iArr[1]) {
                        qc1Var.o0.setTranslationY(-r0);
                        qc1Var.p0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < qc1Var.L) {
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
        ad adVar;
        switch (this.a) {
            case 22:
                return (((ProfileActivity) this.c).j5 == 0.0f && (adVar = (ad) this.b) != null && adVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int x4 = org.telegram.ui.b.x(275.0f, i15, 2);
                k70 k70Var = (k70) this.c;
                FrameLayout frameLayout = k70Var.r;
                frameLayout.layout(0, x4, frameLayout.getMeasuredWidth(), k70Var.r.getMeasuredHeight() + x4);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + x4;
                int measuredWidth = (getMeasuredWidth() - k70Var.e.getMeasuredWidth()) / 2;
                pa paVar = k70Var.e;
                paVar.layout(measuredWidth, dp, paVar.getMeasuredWidth() + measuredWidth, k70Var.e.getMeasuredHeight() + dp);
                m2.g gVar = k70Var.d;
                gVar.layout(0, 0, gVar.getMeasuredWidth(), k70Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - k70Var.n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - k70Var.n.getMeasuredWidth()) / 2;
                cg.s0 s0Var = k70Var.n;
                s0Var.layout(measuredWidth2, measuredHeight, s0Var.getMeasuredWidth() + measuredWidth2, k70Var.n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - k70Var.f.getMeasuredWidth()) / 2;
                TextView textView = k70Var.f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), k70Var.f.getMeasuredWidth() + measuredWidth3, dp2);
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
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.c).V4();
                break;
            case 23:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 24:
                super.onLayout(z10, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                if (secretMediaViewer.n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    y31 y31Var = secretMediaViewer.n;
                    y31Var.layout(y31Var.getLeft(), currentActionBarHeight, secretMediaViewer.n.getRight(), secretMediaViewer.n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.r != null && secretMediaViewer.n != null) {
                    int measuredHeight2 = (secretMediaViewer.n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    nh.t3 t3Var = secretMediaViewer.r;
                    t3Var.layout(t3Var.getLeft(), measuredHeight2, secretMediaViewer.r.getRight(), secretMediaViewer.r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.W != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    xs0 xs0Var = secretMediaViewer.W;
                    xs0Var.layout(xs0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.W.getRight(), secretMediaViewer.W.getMeasuredHeight() + currentActionBarHeight2);
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
        f2.j0 wVar;
        switch (this.a) {
            case 1:
                super.onMeasure(i10, org.telegram.ui.b.B(2.0f, ((cg.p1) this.c).s, TLObject.FLAG_30));
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
                z11 z11Var = (z11) this.c;
                View view = z11Var.D;
                View view2 = z11Var.E;
                LinearLayout linearLayout = z11Var.v;
                TextView textView = z11Var.s;
                jl0 jl0Var = z11Var.y;
                boolean z10 = z11Var.O.L;
                int dp = AndroidUtilities.dp(12.0f);
                if (z10) {
                    jl0Var.setLayoutParams(f6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
                    jl0Var.setPadding(dp, 0, dp, 0);
                    if (linearLayout != null) {
                        textView.setLayoutParams(f6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(f6.d(-1, 48.0f, 8388691, 16.0f, 162.0f, 16.0f, 16.0f));
                    } else {
                        textView.setLayoutParams(f6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
                    }
                } else {
                    jl0Var.setPadding(dp, dp / 2, dp, dp);
                    if (linearLayout != null) {
                        jl0Var.setLayoutParams(f6.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 136.0f));
                        textView.setLayoutParams(f6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(f6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    } else {
                        jl0Var.setLayoutParams(f6.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 80.0f));
                        textView.setLayoutParams(f6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    }
                }
                if (z10) {
                    view2.setVisibility(8);
                    view.setVisibility(8);
                } else {
                    int i12 = textView != null ? 136 : 80;
                    view2.setVisibility(0);
                    view2.setLayoutParams(f6.d(-1, AndroidUtilities.dp(2.0f), 80, 0.0f, 0.0f, 0.0f, i12));
                    view.setVisibility(0);
                    view.setLayoutParams(f6.d(-1, AndroidUtilities.dp(2.0f), 48, 0.0f, 44.0f, 0.0f, 0.0f));
                }
                if (z11Var.N != z10) {
                    a21 a21Var = z11Var.d;
                    if (z10) {
                        a21Var.getParentActivity();
                        wVar = new f2.j0(0, false);
                    } else {
                        a21Var.getParentActivity();
                        wVar = new f2.w(3, false);
                    }
                    z11Var.C = wVar;
                    jl0Var.setLayoutManager(wVar);
                    jl0Var.requestLayout();
                    int i13 = z11Var.H;
                    if (i13 != -1) {
                        z11Var.b(i13);
                    }
                    z11Var.N = z10;
                }
                super.onMeasure(i10, i11);
                break;
            case 24:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                xs0 xs0Var = secretMediaViewer.W;
                if (xs0Var != null) {
                    xs0Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((measuredHeight - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - (secretMediaViewer.Q.getVisibility() != 0 ? 0 : secretMediaViewer.Q.getMeasuredHeight()), TLObject.FLAG_30));
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
        ad adVar;
        switch (this.a) {
            case 22:
                return (((ProfileActivity) this.c).j5 == 0.0f && (adVar = (ad) this.b) != null && adVar.b(motionEvent)) || super.onTouchEvent(motionEvent);
            case 23:
            default:
                return super.onTouchEvent(motionEvent);
            case 24:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                if (secretMediaViewer.i0 == 0 && secretMediaViewer.F0 == 0) {
                    if (motionEvent.getPointerCount() == 1 && secretMediaViewer.H0.onTouchEvent(motionEvent) && secretMediaViewer.X0) {
                        secretMediaViewer.X0 = false;
                        secretMediaViewer.W0 = false;
                        secretMediaViewer.V0 = false;
                        secretMediaViewer.d(false);
                    } else if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                        secretMediaViewer.b1 = false;
                        lm0 lm0Var = secretMediaViewer.c1;
                        if (!lm0Var.q) {
                            lm0Var.a();
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
                                float y8 = motionEvent.getY();
                                secretMediaViewer.Q0 = y8;
                                secretMediaViewer.m0 = y8;
                                secretMediaViewer.l0 = false;
                                secretMediaViewer.Z0 = true;
                            }
                        }
                    } else {
                        float f9 = 0.0f;
                        if (motionEvent.getActionMasked() == 2) {
                            if (motionEvent.getPointerCount() == 2 && !secretMediaViewer.l0 && secretMediaViewer.V0) {
                                secretMediaViewer.b1 = true;
                                secretMediaViewer.u0 = (((float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0))) / secretMediaViewer.J0) * secretMediaViewer.K0;
                                secretMediaViewer.s0 = org.telegram.messenger.x3.A(secretMediaViewer.u0, secretMediaViewer.K0, (secretMediaViewer.L0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.N0, secretMediaViewer.L0 - (secretMediaViewer.e.getWidth() / 2));
                                float height = secretMediaViewer.M0 - (secretMediaViewer.e.getHeight() / 2);
                                float height2 = (secretMediaViewer.M0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.O0;
                                float f10 = secretMediaViewer.u0;
                                secretMediaViewer.t0 = org.telegram.messenger.x3.A(f10, secretMediaViewer.K0, height2, height);
                                secretMediaViewer.n(f10);
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
                                    float x4 = secretMediaViewer.P0 - motionEvent.getX();
                                    float y10 = secretMediaViewer.Q0 - motionEvent.getY();
                                    if (secretMediaViewer.W0 || ((secretMediaViewer.u0 == 1.0f && Math.abs(y10) + AndroidUtilities.dp(12.0f) < Math.abs(x4)) || secretMediaViewer.u0 != 1.0f)) {
                                        if (!secretMediaViewer.W0) {
                                            secretMediaViewer.W0 = true;
                                            secretMediaViewer.Z0 = false;
                                            x4 = 0.0f;
                                            y10 = 0.0f;
                                        }
                                        secretMediaViewer.P0 = motionEvent.getX();
                                        secretMediaViewer.Q0 = motionEvent.getY();
                                        secretMediaViewer.n(secretMediaViewer.u0);
                                        float f11 = secretMediaViewer.s0;
                                        if (f11 < secretMediaViewer.R0 || f11 > secretMediaViewer.S0) {
                                            x4 /= 3.0f;
                                        }
                                        float f12 = secretMediaViewer.U0;
                                        if (f12 == 0.0f) {
                                            float f13 = secretMediaViewer.T0;
                                            if (f13 == 0.0f) {
                                                float f14 = secretMediaViewer.t0 - y10;
                                                if (f14 < f13) {
                                                    secretMediaViewer.t0 = f13;
                                                } else {
                                                    if (f14 > f12) {
                                                        secretMediaViewer.t0 = f12;
                                                    }
                                                    f9 = y10;
                                                }
                                                secretMediaViewer.s0 = f11 - x4;
                                                if (secretMediaViewer.u0 != 1.0f) {
                                                    secretMediaViewer.t0 -= f9;
                                                }
                                                secretMediaViewer.e.invalidate();
                                            }
                                        }
                                        float f15 = secretMediaViewer.t0;
                                        if (f15 < secretMediaViewer.T0 || f15 > f12) {
                                            f9 = y10 / 3.0f;
                                            secretMediaViewer.s0 = f11 - x4;
                                            if (secretMediaViewer.u0 != 1.0f) {
                                            }
                                            secretMediaViewer.e.invalidate();
                                        }
                                        f9 = y10;
                                        secretMediaViewer.s0 = f11 - x4;
                                        if (secretMediaViewer.u0 != 1.0f) {
                                        }
                                        secretMediaViewer.e.invalidate();
                                    }
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                            if (secretMediaViewer.V0) {
                                secretMediaViewer.Y0 = true;
                                float f16 = secretMediaViewer.u0;
                                if (f16 < 1.0f) {
                                    secretMediaViewer.n(1.0f);
                                    secretMediaViewer.c(1.0f, 0.0f, 0.0f, true);
                                } else if (f16 > 3.0f) {
                                    float A = org.telegram.messenger.x3.A(3.0f, secretMediaViewer.K0, (secretMediaViewer.L0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.N0, secretMediaViewer.L0 - (secretMediaViewer.e.getWidth() / 2));
                                    float A2 = org.telegram.messenger.x3.A(3.0f, secretMediaViewer.K0, (secretMediaViewer.M0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.O0, secretMediaViewer.M0 - (secretMediaViewer.e.getHeight() / 2));
                                    secretMediaViewer.n(3.0f);
                                    float f17 = secretMediaViewer.R0;
                                    if (A >= f17) {
                                        f17 = secretMediaViewer.S0;
                                        break;
                                    }
                                    A = f17;
                                    float f18 = secretMediaViewer.T0;
                                    if (A2 >= f18) {
                                        f18 = secretMediaViewer.U0;
                                        break;
                                    }
                                    A2 = f18;
                                    secretMediaViewer.c(3.0f, A, A2, true);
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
                                float f19 = secretMediaViewer.s0;
                                float f20 = secretMediaViewer.t0;
                                secretMediaViewer.n(secretMediaViewer.u0);
                                secretMediaViewer.W0 = false;
                                secretMediaViewer.Z0 = true;
                                float f21 = secretMediaViewer.s0;
                                float f22 = secretMediaViewer.R0;
                                if (f21 >= f22) {
                                    f22 = secretMediaViewer.S0;
                                    break;
                                }
                                f19 = f22;
                                float f23 = secretMediaViewer.t0;
                                float f24 = secretMediaViewer.T0;
                                if (f23 >= f24) {
                                    f24 = secretMediaViewer.U0;
                                    break;
                                }
                                f20 = f24;
                                secretMediaViewer.c(secretMediaViewer.u0, f19, f20, false);
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
                return ((n6) this.b) == drawable || ((n6) this.c) == drawable || super.verifyDrawable(drawable);
            case 23:
                return drawable == ((z11) this.c).f || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, Object obj, int i10) {
        super(context);
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(org.telegram.ui.Cells.y0 y0Var, Context context) {
        super(context);
        this.a = 9;
        this.c = y0Var;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(kg.d0 d0Var, Context context) {
        super(context);
        this.a = 5;
        this.c = d0Var;
        this.b = new ih.u0(this, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(f41 f41Var, Context context) {
        super(context);
        this.a = 25;
        this.c = f41Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(ub ubVar, Context context) {
        super(context);
        this.a = 10;
        this.c = ubVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(kg.s sVar, Context context) {
        super(context);
        this.a = 4;
        this.c = sVar;
        this.b = new kg.o(this, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(p5 p5Var, Activity activity) {
        super(activity);
        this.a = 8;
        this.c = p5Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(org.telegram.ui.Components.voip.h1 h1Var, Context context) {
        super(context);
        this.a = 17;
        this.c = h1Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(nd0 nd0Var, Context context) {
        super(context);
        this.a = 15;
        this.c = nd0Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Context context, TextView textView, TextView textView2) {
        super(context);
        this.a = 21;
        this.b = textView;
        this.c = textView2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.a = 24;
        this.c = secretMediaViewer;
        this.b = secretMediaViewer;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(d61 d61Var, Context context) {
        super(context);
        this.a = 26;
        this.c = d61Var;
        this.b = new Rect();
    }

    private final void a(boolean z10) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Context context, int i10, c6 c6Var) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 14:
                super(context);
                n6 n6Var = new n6(true, true, true, false);
                this.b = n6Var;
                jr jrVar = jr.h;
                n6Var.k(0.3f, 430L, jrVar);
                n6Var.u(AndroidUtilities.bold());
                n6Var.r(g6.v0(g6.A8, c6Var));
                n6Var.t(AndroidUtilities.dp(18.0f));
                n6Var.n(!LocaleController.isRTL);
                n6Var.setCallback(this);
                n6Var.G = AndroidUtilities.displaySize.x;
                n6 n6Var2 = new n6(true, true, true, false);
                this.c = n6Var2;
                n6Var2.k(0.3f, 430L, jrVar);
                n6Var2.r(g6.v0(g6.B8, c6Var));
                n6Var2.t(AndroidUtilities.dp(14.0f));
                n6Var2.n(true ^ LocaleController.isRTL);
                n6Var2.setCallback(this);
                n6Var2.G = AndroidUtilities.displaySize.x;
                break;
            default:
                LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
                o6 o6Var = new o6(context, false, false, false);
                this.b = o6Var;
                int i11 = g6.G6;
                o6Var.setTextColor(g6.v0(i11, c6Var));
                o6Var.setTextSize(AndroidUtilities.dp(17.0f));
                o6Var.setTypeface(AndroidUtilities.bold());
                g10.addView(o6Var, f6.q(-2, 23, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTextSize(1, 11.0f);
                textView.setTextColor(g6.v0(i11, c6Var));
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                g10.addView(textView, f6.q(-2, -2, 1));
                addView(g10, f6.e(-2, -2, 17));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(z11 z11Var, Activity activity, a21 a21Var) {
        super(activity);
        this.a = 23;
        this.c = z11Var;
        Rect rect = new Rect();
        this.b = rect;
        z11Var.a.setColor(a21Var.getThemedColor(g6.d6));
        Drawable drawable = z11Var.f;
        drawable.setCallback(this);
        drawable.getPadding(rect);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(gp gpVar, Context context) {
        super(context);
        this.a = 12;
        this.c = gpVar;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(ht htVar, Activity activity) {
        super(activity);
        this.a = 19;
        this.c = htVar;
        this.b = htVar;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(qc1 qc1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 29:
                this.c = qc1Var;
                super(context);
                this.b = new int[2];
                break;
            default:
                this.c = qc1Var;
                this.b = new Paint();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e1 e1Var, Context context) {
        super(context);
        this.a = 0;
        this.c = e1Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(fk0 fk0Var, Context context) {
        super(context);
        this.a = 16;
        this.c = fk0Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Context context) {
        super(context);
        this.a = 11;
        this.b = new Path();
        this.c = new u10();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(r5 r5Var, Context context) {
        super(context);
        this.a = 6;
        this.c = r5Var;
        this.b = new Path();
    }
}
