package ci;

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
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.fd0;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.xy;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.b51;
import org.telegram.ui.bu0;
import org.telegram.ui.d80;
import org.telegram.ui.e31;
import org.telegram.ui.et;
import org.telegram.ui.f31;
import org.telegram.ui.h71;
import org.telegram.ui.i51;
import org.telegram.ui.k61;
import org.telegram.ui.l20;
import org.telegram.ui.l61;
import org.telegram.ui.m61;
import org.telegram.ui.pl0;
import org.telegram.ui.q61;
import org.telegram.ui.st;
import org.telegram.ui.wd1;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class n6 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n6(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
    }

    public void a(String str, boolean z10) {
        ((org.telegram.ui.Components.m6) this.c).q(str, z10 && !LocaleController.isRTL, true);
    }

    public void b(String str, boolean z10) {
        ((org.telegram.ui.Components.m6) this.b).q(str, z10 && !LocaleController.isRTL, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v16 */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.j5[] j5VarArr;
        float f7;
        ?? r92;
        char c10;
        float f10;
        float f11;
        org.telegram.ui.Cells.z zVar;
        switch (this.a) {
            case 3:
                yf.y yVar = (yf.y) this.c;
                yVar.b(org.telegram.ui.ActionBar.i6.l1(0.65f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, (org.telegram.ui.ActionBar.e6) this.b)));
                yVar.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 5:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.b;
                int i10 = org.telegram.ui.ActionBar.i6.a7;
                e6Var = ((org.telegram.ui.ActionBar.n2) ((org.telegram.ui.o5) this.c).d).resourceProvider;
                paint.setColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint);
                break;
            case 6:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.z0 z0Var = (org.telegram.ui.Cells.z0) this.c;
                int measuredWidth = z0Var.getMeasuredWidth();
                int i11 = z0Var.d;
                float x10 = z0Var.getX();
                float f12 = z0Var.c;
                org.telegram.ui.ActionBar.e6 e6Var2 = z0Var.b;
                if (e6Var2 != null) {
                    e6Var2.m(x10, f12, measuredWidth, i11);
                } else {
                    org.telegram.ui.ActionBar.i6.q(x10, f12, measuredWidth, i11);
                }
                float dp = AndroidUtilities.dp(18.0f);
                float dp2 = AndroidUtilities.dp(18.0f);
                Paint G = e6Var2 != null ? e6Var2.G("paintChatActionBackground") : null;
                if (G == null) {
                    G = org.telegram.ui.ActionBar.i6.S0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, dp, dp2, G);
                if (e6Var2 != null ? e6Var2.p0() : org.telegram.ui.ActionBar.i6.a1()) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    Paint G2 = e6Var2 != null ? e6Var2.G("paintChatActionBackgroundDarken") : null;
                    if (G2 == null) {
                        G2 = org.telegram.ui.ActionBar.i6.S0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, dp3, dp4, G2);
                }
                super.dispatchDraw(canvas);
                break;
            case 7:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.a7, ((org.telegram.ui.ac) this.c).f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                break;
            case 8:
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
                l20 l20Var = (l20) this.c;
                l20Var.b(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                l20Var.b(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                break;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.b;
                paint3.setColor(((mp) this.c).getThemedColor(org.telegram.ui.ActionBar.i6.d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint3);
                break;
            case 10:
                xy xyVar = (xy) this.c;
                if (!xyVar.G.u0 && xyVar.w > 0.0f) {
                    if (((Paint) this.b) == null) {
                        Paint paint4 = new Paint();
                        this.b = paint4;
                        paint4.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.b).setAlpha((int) (xyVar.w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.b);
                    canvas.restore();
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.m6 m6Var = (org.telegram.ui.Components.m6) this.b;
                int dp6 = AndroidUtilities.dp(29.0f);
                int dp7 = AndroidUtilities.dp(18.83f);
                org.telegram.ui.Components.m6 m6Var2 = (org.telegram.ui.Components.m6) this.c;
                m6Var.setBounds(getPaddingLeft(), r3 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r3);
                m6Var.draw(canvas);
                m6Var2.setBounds(getPaddingLeft(), r2 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r2);
                m6Var2.draw(canvas);
                break;
            case 13:
                Paint paint5 = (Paint) this.b;
                fk0 fk0Var = (fk0) this.c;
                int i12 = fk0Var.M0;
                paint5.setColor((i12 == 1 || i12 == 2 || i12 == 4) ? i0.a.k(-1, 30) : i0.a.d(0.7f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.F8, fk0Var.k0), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.h5, fk0Var.k0)));
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g10 = fk0Var.g();
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
            case 19:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                org.telegram.ui.ActionBar.j5[] j5VarArr2 = profileActivity.r;
                if (profileActivity.W4 != null) {
                    canvas.save();
                    canvas.translate(j5VarArr2[0].getX(), j5VarArr2[0].getY());
                    j5VarArr = j5VarArr2;
                    f7 = 0.0f;
                    r92 = 0;
                    c10 = 2;
                    f10 = 14.0f;
                    f11 = 24.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.W4.getMeasuredWidth(), profileActivity.W4.getMeasuredHeight(), (int) ((1.0f - profileActivity.S1) * 255.0f), 31);
                    profileActivity.W4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    j5VarArr = j5VarArr2;
                    f7 = 0.0f;
                    r92 = 0;
                    c10 = 2;
                    f10 = 14.0f;
                    f11 = 24.0f;
                }
                if (profileActivity.p5 && profileActivity.Y5 != f7 && profileActivity.n5 != 1.0f) {
                    float measuredHeight2 = (j5VarArr[1].getMeasuredHeight() / 2.0f) + j5VarArr[1].getY();
                    float dp8 = AndroidUtilities.dp(22.0f);
                    float x11 = ((j5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.o5)) - dp8) - profileActivity.Z3();
                    profileActivity.r5.setImageCoords(x11, measuredHeight2 - (dp8 / 2.0f), dp8, dp8);
                    profileActivity.r5.setAlpha(profileActivity.Y5);
                    canvas.save();
                    float f13 = profileActivity.Y5;
                    canvas.scale(f13, f13, profileActivity.r5.getCenterX(), profileActivity.r5.getCenterY());
                    profileActivity.r5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.n5 != f7) {
                        org.telegram.ui.Components.dd ddVar = (org.telegram.ui.Components.dd) this.b;
                        if (ddVar != null && (zVar = ddVar.e) != null) {
                            zVar.setState(StateSet.NOTHING);
                            zVar.jumpToCurrentState();
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Components.dd) this.b) == null) {
                            org.telegram.ui.Components.dd ddVar2 = new org.telegram.ui.Components.dd(this);
                            this.b = ddVar2;
                            ddVar2.h = new pl0(this, 29);
                        }
                        float dp9 = (1.0f - profileActivity.n5) * AndroidUtilities.dp(28.0f);
                        float textWidth = j5VarArr[c10].getTextWidth();
                        float max = Math.max(textWidth, profileActivity.T != null ? (AndroidUtilities.dp(f11) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.T.getVisibilityFactor() : 0.0f) + dp9;
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(x11 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(f10), x11 + max + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(f10));
                        org.telegram.ui.Components.dd ddVar3 = (org.telegram.ui.Components.dd) this.b;
                        ddVar3.i = r92;
                        ddVar3.c = r92;
                        ddVar3.a(rectF4);
                        org.telegram.ui.Components.dd ddVar4 = (org.telegram.ui.Components.dd) this.b;
                        ddVar4.n = true;
                        int k10 = i0.a.k(-1, 50);
                        ddVar4.g.setColor((int) r92);
                        org.telegram.ui.Cells.z zVar2 = ddVar4.e;
                        if (zVar2 != null) {
                            org.telegram.ui.ActionBar.i6.B1(zVar2, k10, true);
                        }
                        org.telegram.ui.Components.dd ddVar5 = (org.telegram.ui.Components.dd) this.b;
                        ddVar5.c(canvas, ddVar5.g);
                        org.telegram.ui.Cells.z zVar3 = ddVar5.e;
                        if (zVar3 != null) {
                            zVar3.draw(canvas);
                            break;
                        }
                    }
                }
                break;
            case 20:
                Rect rect = (Rect) this.b;
                e31 e31Var = (e31) this.c;
                if (e31Var.R) {
                    e31Var.f.setBounds(-rect.left, -rect.top, getWidth() + rect.right, getHeight() + rect.bottom);
                    e31Var.f.draw(canvas);
                } else {
                    RectF rectF5 = AndroidUtilities.rectTmp;
                    rectF5.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                    canvas.drawRoundRect(rectF5, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), e31Var.a);
                }
                super.dispatchDraw(canvas);
                break;
            case 24:
                ImageReceiver imageReceiver = (ImageReceiver) this.b;
                imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 28:
                ((rg.z0) this.b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF6 = AndroidUtilities.rectTmp;
                rectF6.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rg.z0 z0Var2 = (rg.z0) this.b;
                z0Var2.f.setAlpha(((rg.x0) this.c).K);
                canvas.drawRoundRect(rectF6, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, z0Var2.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 3:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 4:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.c;
                org.telegram.ui.Cells.ca o9 = h4Var.P0.o(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (h4Var.P0.y() && h4Var.P0.o(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (o9.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() != 0 || !h4Var.P0.y() || (motionEvent.getY() >= linearLayout.getTop() && motionEvent.getY() <= linearLayout.getBottom())) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (h4Var.P0.o(getContext()).onTouchEvent(obtain)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            case 14:
                int action = motionEvent.getAction();
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) this.c;
                if (j1Var.J != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(j1Var.J.getX(), j1Var.J.getY());
                    boolean dispatchTouchEvent = j1Var.J.dispatchTouchEvent(motionEvent);
                    obtain2.recycle();
                    if (action == 1 || action == 3) {
                        j1Var.J = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = j1Var.F.onTouchEvent(obtain3);
                obtain3.recycle();
                boolean z10 = !j1Var.F.isInProgress() && ((GestureDetector) j1Var.G.b).onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    j1Var.H = false;
                    j1Var.I = false;
                    o1.k kVar = j1Var.S;
                    if (!kVar.f) {
                        float f7 = j1Var.Q;
                        kVar.b = f7;
                        kVar.c = true;
                        kVar.u.i = (j1Var.M / 2.0f) + f7 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - r7) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                        j1Var.S.f();
                    }
                    o1.k kVar2 = j1Var.T;
                    if (!kVar2.f) {
                        kVar2.b = j1Var.R;
                        kVar2.c = true;
                        kVar2.u.i = w7.p.a(r2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - j1Var.N) - AndroidUtilities.dp(16.0f));
                        j1Var.T.f();
                    }
                }
                return onTouchEvent || z10;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                Path path = (Path) this.b;
                o6 o6Var = (o6) this.c;
                if (o6Var.h == null || (!((z10 = o6Var.f) && view == o6Var.d) && (z10 || view != o6Var.c))) {
                    return super.drawChild(canvas, view, j3);
                }
                float measuredWidth = ((z10 ? o6Var.e : 1.0f - o6Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            case 16:
                if (view instanceof fd0) {
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 21:
                return view != ((SecretMediaViewer) this.b).w && super.drawChild(canvas, view, j3);
            case 22:
                Path path2 = (Path) this.b;
                i51 i51Var = (i51) this.c;
                RectF rectF = i51Var.R;
                if (view == i51Var.N || view == i51Var.x) {
                    canvas.save();
                    canvas.clipRect(0.0f, AndroidUtilities.lerp(i51Var.T, 0.0f, i51Var.s), getWidth(), AndroidUtilities.lerp(i51Var.U, getHeight(), i51Var.s));
                    boolean drawChild2 = super.drawChild(canvas, view, j3);
                    canvas.restore();
                    return drawChild2;
                }
                if (view != i51Var.P) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                path2.rewind();
                path2.addCircle(rectF.centerX() + i51Var.N.getX(), rectF.centerY() + i51Var.N.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.clipRect(0.0f, AndroidUtilities.lerp(i51Var.T, 0.0f, i51Var.s), getWidth(), AndroidUtilities.lerp(i51Var.U, getHeight(), i51Var.s));
                canvas.translate(-i51Var.P.getX(), -i51Var.P.getY());
                canvas.translate(i51Var.N.getX() + rectF.left, i51Var.N.getY() + rectF.top);
                canvas.scale(rectF.width() / i51Var.P.getMeasuredWidth(), rectF.height() / i51Var.P.getMeasuredHeight(), i51Var.P.getX(), i51Var.P.getY());
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild3;
            case 23:
                if (view != ((h71) this.c).h0 || !zg.f0.b || !zg.f0.f) {
                    return super.drawChild(canvas, view, j3);
                }
                for (int i10 = 0; i10 < ((h71) this.c).h0.getChildCount(); i10++) {
                    View childAt = ((h71) this.c).h0.getChildAt(i10);
                    if (childAt instanceof q61) {
                        q61 q61Var = (q61) childAt;
                        if (q61Var.getAnimatedScale() == 1.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            super.drawChild(canvas, view, j3);
                            canvas.restore();
                        } else if (q61Var.getAnimatedScale() > 0.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            ((Rect) this.b).set((int) (r2.centerX() - (q61Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f))), (int) (((Rect) this.b).centerY() - (q61Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f))), (int) ((q61Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f)) + ((Rect) this.b).centerX()), (int) ((q61Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f)) + ((Rect) this.b).centerY()));
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            canvas.scale(q61Var.getAnimatedScale(), q61Var.getAnimatedScale(), ((Rect) this.b).centerX(), ((Rect) this.b).centerY());
                            super.drawChild(canvas, view, j3);
                            canvas.restore();
                        }
                    } else if ((childAt instanceof TextView) || (childAt instanceof l61) || (childAt instanceof k61) || (childAt instanceof m61)) {
                        ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                        canvas.save();
                        canvas.clipRect((Rect) this.b);
                        super.drawChild(canvas, view, j3);
                        canvas.restore();
                    }
                }
                return false;
            case 27:
                Path path3 = (Path) this.b;
                qg.o0 o0Var = (qg.o0) this.c;
                if (o0Var.h == null || (!((z11 = o0Var.f) && view == o0Var.d) && (z11 || view != o0Var.c))) {
                    return super.drawChild(canvas, view, j3);
                }
                float measuredWidth2 = ((z11 ? o0Var.e : 1.0f - o0Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path3.rewind();
                path3.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth2, Path.Direction.CW);
                canvas.clipPath(path3);
                boolean drawChild4 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild4;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.a) {
            case 2:
                super.invalidate();
                ((mg.i) this.c).invalidate();
                break;
            case 26:
                super.invalidate();
                org.telegram.ui.ActionBar.q0 q0Var = ((wd1) this.c).t0;
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
            case 16:
                super.onAttachedToWindow();
                st stVar = (st) this.c;
                stVar.A.onAttachedToWindow();
                stVar.B.onAttachedToWindow();
                break;
            case 19:
                super.onAttachedToWindow();
                ((ProfileActivity) this.c).r5.onAttachedToWindow();
                break;
            case 21:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.b).h.onAttachedToWindow();
                break;
            case 24:
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
            case 14:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) this.c;
                AndroidUtilities.setPreferredMaxRefreshRate(j1Var.b, j1Var.d, j1Var.c);
                j1Var.i(false);
                break;
            default:
                super.onConfigurationChanged(configuration);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 16:
                super.onDetachedFromWindow();
                st stVar = (st) this.c;
                stVar.A.onDetachedFromWindow();
                stVar.B.onDetachedFromWindow();
                break;
            case 19:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.c).r5.onDetachedFromWindow();
                break;
            case 21:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.b).h.onDetachedFromWindow();
                break;
            case 24:
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
        float f7;
        switch (this.a) {
            case 12:
                sd0 sd0Var = (sd0) this.c;
                Drawable drawable2 = sd0Var.a;
                if (drawable2 == null) {
                    super.onDraw(canvas);
                } else if ((drawable2 instanceof cc0) || (drawable2 instanceof ColorDrawable) || (drawable2 instanceof GradientDrawable)) {
                    drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    sd0Var.a.draw(canvas);
                } else {
                    float max = Math.max(getMeasuredWidth() / sd0Var.a.getIntrinsicWidth(), (getMeasuredHeight() + sd0Var.G) / sd0Var.a.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(sd0Var.a.getIntrinsicWidth() * max);
                    int ceil2 = (int) Math.ceil(sd0Var.a.getIntrinsicHeight() * max);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int measuredHeight = ((getMeasuredHeight() - ceil2) + sd0Var.G) / 2;
                    sd0Var.a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
                    sd0Var.a.draw(canvas);
                }
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.b);
                break;
            case 15:
                canvas.save();
                org.telegram.ui.Components.voip.m2 m2Var = (org.telegram.ui.Components.voip.m2) this.c;
                canvas.scale(m2Var.b.getScaleX(), m2Var.b.getScaleY(), m2Var.b.getPivotX() + m2Var.b.getLeft(), m2Var.b.getPivotY() + m2Var.b.getTop());
                Drawable drawable3 = (Drawable) this.b;
                drawable3.setBounds(m2Var.b.getLeft() - AndroidUtilities.dp(2.0f), m2Var.b.getTop() - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f) + m2Var.b.getRight(), AndroidUtilities.dp(2.0f) + m2Var.b.getBottom());
                drawable3.draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                break;
            case 16:
                st stVar = (st) this.b;
                Paint paint = stVar.N;
                ImageReceiver imageReceiver = stVar.B;
                ColorDrawable colorDrawable = stVar.u;
                ImageReceiver imageReceiver2 = stVar.A;
                if (stVar.z != null && colorDrawable != null) {
                    if (stVar.K && stVar.v == null && stVar.w != null && !stVar.e0) {
                        stVar.e0 = true;
                        imageReceiver2.setVisible(false, false);
                        am0.d(new org.telegram.ui.b5(stVar, 8));
                    }
                    if (stVar.v != null) {
                        boolean z10 = stVar.K;
                        if (z10) {
                            float f10 = stVar.M;
                            if (f10 != 1.0f) {
                                float f11 = f10 + 0.13333334f;
                                stVar.M = f11;
                                if (f11 > 1.0f) {
                                    stVar.M = 1.0f;
                                }
                                stVar.z.invalidate();
                                f7 = stVar.M;
                                if (f7 != 0.0f && stVar.v != null) {
                                    paint.setAlpha((int) (f7 * 255.0f));
                                    if (paint.getAlpha() != 255) {
                                        canvas.drawColor(org.telegram.ui.ActionBar.i6.l1(stVar.M, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.a7, stVar.c0)));
                                    }
                                    canvas.drawPaint(paint);
                                }
                            }
                        }
                        if (!z10) {
                            float f12 = stVar.M;
                            if (f12 != 0.0f) {
                                float f13 = f12 - 0.13333334f;
                                stVar.M = f13;
                                if (f13 < 0.0f) {
                                    stVar.M = 0.0f;
                                }
                                stVar.z.invalidate();
                            }
                        }
                        f7 = stVar.M;
                        if (f7 != 0.0f) {
                            paint.setAlpha((int) (f7 * 255.0f));
                            if (paint.getAlpha() != 255) {
                            }
                            canvas.drawPaint(paint);
                        }
                    }
                    colorDrawable.setAlpha((int) (stVar.F * 180.0f));
                    colorDrawable.setBounds(0, 0, stVar.z.getWidth(), stVar.z.getHeight());
                    colorDrawable.draw(canvas);
                    canvas.save();
                    i0.b bVar = stVar.q;
                    int i10 = bVar.d;
                    int i11 = bVar.b;
                    int i12 = i10 + i11;
                    if (stVar.V == 1) {
                        min = Math.min(stVar.z.getWidth(), stVar.z.getHeight() - i12) - AndroidUtilities.dp(40.0f);
                    } else {
                        min = (int) (stVar.S ? Math.min(stVar.z.getWidth(), stVar.z.getHeight() - i12) - AndroidUtilities.dpf2(40.0f) : Math.min(stVar.z.getWidth(), stVar.z.getHeight() - i12) / 1.8f);
                    }
                    float max2 = Math.max((min / 2) + i11 + (stVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((stVar.z.getHeight() - i12) - stVar.I) / 2);
                    if (stVar.S) {
                        max2 += AndroidUtilities.dp(40.0f);
                    }
                    canvas.translate(stVar.z.getWidth() / 2, stVar.e + max2);
                    int i13 = (int) (min * ((stVar.F * 0.8f) / 0.8f));
                    if (stVar.V == 3) {
                        canvas.translate(0.0f, AndroidUtilities.dp(70.0f));
                    }
                    if (stVar.S) {
                        float f14 = i13;
                        float f15 = 0.6669f * f14;
                        imageReceiver2.setAlpha(stVar.F);
                        float f16 = f14 - f15;
                        float f17 = f14 / 2.0f;
                        imageReceiver2.setImageCoords((f16 - f17) - (0.0546875f * f14), (f16 / 2.0f) - f17, f15, f15);
                        imageReceiver2.draw(canvas);
                        imageReceiver.setAlpha(stVar.F);
                        float f18 = (-i13) / 2.0f;
                        imageReceiver.setImageCoords(f18, f18, f14, f14);
                        imageReceiver.draw(canvas);
                    } else {
                        imageReceiver2.setAlpha(stVar.F);
                        float f19 = (-i13) / 2.0f;
                        float f20 = i13;
                        imageReceiver2.setImageCoords(f19, f19, f20, f20);
                        imageReceiver2.draw(canvas);
                    }
                    if (stVar.C != null) {
                        canvas.save();
                        float f21 = (-i13) / 2.0f;
                        canvas.translate(f21, f21);
                        float f22 = i13;
                        canvas.scale(f22 / stVar.C.getWidth(), f22 / stVar.C.getHeight());
                        stVar.C.setAlpha(stVar.F);
                        if (stVar.D == null) {
                            stVar.D = new Path();
                        }
                        stVar.D.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, stVar.C.getWidth(), stVar.C.getHeight());
                        float f23 = f22 / 8.0f;
                        stVar.D.addRoundRect(rectF, f23, f23, Path.Direction.CW);
                        canvas.clipPath(stVar.D);
                        stVar.C.draw(canvas);
                        canvas.restore();
                    }
                    if (stVar.V == 1 && !stVar.m && (drawable = stVar.J) != null) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = stVar.J.getIntrinsicHeight();
                        int dp = (int) (imageReceiver2.getDrawRegion().top - AndroidUtilities.dp(((stVar.d / AndroidUtilities.dp(60.0f)) * 6.0f) + 17.0f));
                        stVar.J.setAlpha((int) ((1.0f - stVar.g) * 255.0f));
                        stVar.J.setBounds((-intrinsicWidth) / 2, (-intrinsicHeight) + dp, intrinsicWidth / 2, dp);
                        stVar.J.draw(canvas);
                    }
                    if (stVar.G != null) {
                        if (stVar.S) {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
                        } else {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver2.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
                        }
                        st.f0.setAlpha((int) (stVar.F * 255.0f));
                        stVar.G.draw(canvas);
                    }
                    canvas.restore();
                    if (stVar.E) {
                        if (stVar.F != 1.0f) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j3 = currentTimeMillis - stVar.H;
                            stVar.H = currentTimeMillis;
                            stVar.F = (j3 / 120.0f) + stVar.F;
                            stVar.z.invalidate();
                            if (stVar.F > 1.0f) {
                                stVar.F = 1.0f;
                                break;
                            }
                        }
                    } else if (stVar.F != 0.0f) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long j10 = currentTimeMillis2 - stVar.H;
                        stVar.H = currentTimeMillis2;
                        stVar.F -= j10 / 120.0f;
                        stVar.z.invalidate();
                        if (stVar.F < 0.0f) {
                            stVar.F = 0.0f;
                        }
                        if (stVar.F == 0.0f) {
                            imageReceiver2.setImageBitmap((Drawable) null);
                            AndroidUtilities.unlockOrientation(stVar.w);
                            AndroidUtilities.runOnUIThread(new et(stVar, 1));
                            Bitmap bitmap = stVar.v;
                            if (bitmap != null) {
                                bitmap.recycle();
                                stVar.v = null;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(stVar.O, false, 1.0f, false);
                            stVar.M = 0.0f;
                            try {
                                if (stVar.y.getParent() != null) {
                                    ((WindowManager) stVar.w.getSystemService("window")).removeView(stVar.y);
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
            case 21:
                SecretMediaViewer.b((SecretMediaViewer) this.b, canvas);
                break;
            case 25:
                int intrinsicHeight2 = org.telegram.ui.ActionBar.i6.i3.getIntrinsicHeight();
                org.telegram.ui.ActionBar.i6.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight2);
                org.telegram.ui.ActionBar.i6.i3.draw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(((wd1) this.c).getThemedColor(org.telegram.ui.ActionBar.i6.Sd));
                canvas.drawRect(0.0f, intrinsicHeight2, getMeasuredWidth(), getMeasuredHeight(), paint2);
                break;
            case 26:
                int[] iArr = (int[]) this.b;
                wd1 wd1Var = (wd1) this.c;
                if (!AndroidUtilities.usingHardwareInput) {
                    getLocationInWindow(iArr);
                    if (wd1Var.s0.getTranslationY() != iArr[1]) {
                        wd1Var.s0.setTranslationY(-r0);
                        wd1Var.t0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < wd1Var.P) {
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
        org.telegram.ui.Components.dd ddVar;
        switch (this.a) {
            case 19:
                return (((ProfileActivity) this.c).n5 == 0.0f && (ddVar = (org.telegram.ui.Components.dd) this.b) != null && ddVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 17:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int y3 = vl.y(275.0f, i15, 2);
                d80 d80Var = (d80) this.c;
                FrameLayout frameLayout = d80Var.r;
                frameLayout.layout(0, y3, frameLayout.getMeasuredWidth(), d80Var.r.getMeasuredHeight() + y3);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + y3;
                int measuredWidth = (getMeasuredWidth() - d80Var.e.getMeasuredWidth()) / 2;
                org.telegram.ui.Components.qa qaVar = d80Var.e;
                qaVar.layout(measuredWidth, dp, qaVar.getMeasuredWidth() + measuredWidth, d80Var.e.getMeasuredHeight() + dp);
                z4.g gVar = d80Var.d;
                gVar.layout(0, 0, gVar.getMeasuredWidth(), d80Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - d80Var.n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - d80Var.n.getMeasuredWidth()) / 2;
                bi.o oVar = d80Var.n;
                oVar.layout(measuredWidth2, measuredHeight, oVar.getMeasuredWidth() + measuredWidth2, d80Var.n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - d80Var.f.getMeasuredWidth()) / 2;
                TextView textView = d80Var.f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), d80Var.f.getMeasuredWidth() + measuredWidth3, dp2);
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int dp3 = AndroidUtilities.dp(4) + (AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight);
                if (marginLayoutParams.topMargin != dp3) {
                    marginLayoutParams.topMargin = dp3;
                    frameLayout2.requestLayout();
                    break;
                }
                break;
            case 18:
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + vl.y(275.0f, ((i13 - i11) / 4) * 3, 2);
                int dp5 = AndroidUtilities.dp(18.0f);
                TextView textView2 = (TextView) this.b;
                textView2.layout(dp5, dp4, textView2.getMeasuredWidth() + dp5, textView2.getMeasuredHeight() + dp4);
                int dp6 = AndroidUtilities.dp(18.0f) + dp4 + ((int) textView2.getTextSize());
                int dp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.c;
                textView3.layout(dp7, dp6, textView3.getMeasuredWidth() + dp7, textView3.getMeasuredHeight() + dp6);
                break;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.c).V4();
                break;
            case 20:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 21:
                super.onLayout(z10, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                if (secretMediaViewer.n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    b51 b51Var = secretMediaViewer.n;
                    b51Var.layout(b51Var.getLeft(), currentActionBarHeight, secretMediaViewer.n.getRight(), secretMediaViewer.n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.r != null && secretMediaViewer.n != null) {
                    int measuredHeight2 = (secretMediaViewer.n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    f4 f4Var = secretMediaViewer.r;
                    f4Var.layout(f4Var.getLeft(), measuredHeight2, secretMediaViewer.r.getRight(), secretMediaViewer.r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.a0 != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    bu0 bu0Var = secretMediaViewer.a0;
                    bu0Var.layout(bu0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.a0.getRight(), secretMediaViewer.a0.getMeasuredHeight() + currentActionBarHeight2);
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
        s4.c0 sVar;
        switch (this.a) {
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.b;
                gg.e eVar = (gg.e) this.c;
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
            case 4:
                super.onMeasure(i10, i11);
                super.onMeasure(i10, vl.C(8.0f, ((LinearLayout) this.b).getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 9:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                break;
            case 11:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
                setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                break;
            case 20:
                e31 e31Var = (e31) this.c;
                View view = e31Var.H;
                View view2 = e31Var.I;
                LinearLayout linearLayout = e31Var.v;
                TextView textView = e31Var.s;
                ll0 ll0Var = e31Var.y;
                boolean z10 = e31Var.S.P;
                int dp3 = AndroidUtilities.dp(12.0f);
                if (z10) {
                    ll0Var.setLayoutParams(w7.x5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
                    ll0Var.setPadding(dp3, 0, dp3, 0);
                    if (linearLayout != null) {
                        textView.setLayoutParams(w7.x5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(w7.x5.d(-1, 48.0f, 8388691, 16.0f, 162.0f, 16.0f, 16.0f));
                    } else {
                        textView.setLayoutParams(w7.x5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
                    }
                } else {
                    ll0Var.setPadding(dp3, dp3 / 2, dp3, dp3);
                    if (linearLayout != null) {
                        ll0Var.setLayoutParams(w7.x5.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 136.0f));
                        textView.setLayoutParams(w7.x5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(w7.x5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    } else {
                        ll0Var.setLayoutParams(w7.x5.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 80.0f));
                        textView.setLayoutParams(w7.x5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    }
                }
                if (z10) {
                    view2.setVisibility(8);
                    view.setVisibility(8);
                } else {
                    int i12 = textView != null ? 136 : 80;
                    view2.setVisibility(0);
                    view2.setLayoutParams(w7.x5.d(-1, AndroidUtilities.dp(2.0f), 80, 0.0f, 0.0f, 0.0f, i12));
                    view.setVisibility(0);
                    view.setLayoutParams(w7.x5.d(-1, AndroidUtilities.dp(2.0f), 48, 0.0f, 44.0f, 0.0f, 0.0f));
                }
                if (e31Var.R != z10) {
                    f31 f31Var = e31Var.d;
                    if (z10) {
                        f31Var.getParentActivity();
                        sVar = new s4.c0(0, false);
                    } else {
                        f31Var.getParentActivity();
                        sVar = new s4.s(3, false);
                    }
                    e31Var.G = sVar;
                    ll0Var.setLayoutManager(sVar);
                    ll0Var.requestLayout();
                    int i13 = e31Var.L;
                    if (i13 != -1) {
                        e31Var.b(i13);
                    }
                    e31Var.R = z10;
                }
                super.onMeasure(i10, i11);
                break;
            case 21:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                bu0 bu0Var = secretMediaViewer.a0;
                if (bu0Var != null) {
                    bu0Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - (secretMediaViewer.U.getVisibility() != 0 ? 0 : secretMediaViewer.U.getMeasuredHeight()), TLObject.FLAG_30));
                }
                View view3 = secretMediaViewer.f;
                if (view3 != null) {
                    view3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.navigationBarHeight, TLObject.FLAG_30));
                    break;
                }
                break;
            case 28:
                super.onMeasure(i10, vl.C(2.0f, ((rg.x0) this.c).s, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 3:
                super.onSizeChanged(i10, i11, i12, i13);
                yf.y yVar = (yf.y) this.c;
                yVar.setBounds(0, 0, i10, i11);
                yVar.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                break;
            case 14:
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
        float f7;
        org.telegram.ui.Components.dd ddVar;
        switch (this.a) {
            case 2:
                mg.i iVar = (mg.i) this.c;
                mg.c cVar = iVar.r;
                boolean onTouchEvent = ((GestureDetector) ((k2.u) this.b).b).onTouchEvent(motionEvent);
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
                        lVar.i = mg.i.a(displayMetrics, f7);
                        iVar.d.u.i = mg.i.b(getResources().getDisplayMetrics(), (float) iVar.d.u.i);
                        iVar.c.f();
                        iVar.d.f();
                    }
                    iVar.n = false;
                    iVar.f = false;
                    iVar.h = false;
                }
                return onTouchEvent;
            case 19:
                return (((ProfileActivity) this.c).n5 == 0.0f && (ddVar = (org.telegram.ui.Components.dd) this.b) != null && ddVar.b(motionEvent)) || super.onTouchEvent(motionEvent);
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                if (secretMediaViewer.m0 == 0 && secretMediaViewer.J0 == 0) {
                    if (motionEvent.getPointerCount() == 1 && secretMediaViewer.L0.onTouchEvent(motionEvent) && secretMediaViewer.b1) {
                        secretMediaViewer.b1 = false;
                        secretMediaViewer.a1 = false;
                        secretMediaViewer.Z0 = false;
                        secretMediaViewer.d(false);
                    } else if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                        secretMediaViewer.f1 = false;
                        nm0 nm0Var = secretMediaViewer.g1;
                        if (!nm0Var.q) {
                            nm0Var.a();
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
                                secretMediaViewer.w0 = vl.c(secretMediaViewer.y0, secretMediaViewer.O0, (secretMediaViewer.P0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.R0, secretMediaViewer.P0 - (secretMediaViewer.e.getWidth() / 2));
                                float height = secretMediaViewer.Q0 - (secretMediaViewer.e.getHeight() / 2);
                                float height2 = (secretMediaViewer.Q0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.S0;
                                float f11 = secretMediaViewer.y0;
                                secretMediaViewer.x0 = vl.c(f11, secretMediaViewer.O0, height2, height);
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
                                    float c10 = vl.c(3.0f, secretMediaViewer.O0, (secretMediaViewer.P0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.R0, secretMediaViewer.P0 - (secretMediaViewer.e.getWidth() / 2));
                                    float c11 = vl.c(3.0f, secretMediaViewer.O0, (secretMediaViewer.Q0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.S0, secretMediaViewer.Q0 - (secretMediaViewer.e.getHeight() / 2));
                                    secretMediaViewer.n(3.0f);
                                    float f18 = secretMediaViewer.V0;
                                    if (c10 >= f18) {
                                        f18 = secretMediaViewer.W0;
                                        break;
                                    }
                                    c10 = f18;
                                    float f19 = secretMediaViewer.X0;
                                    if (c11 >= f19) {
                                        f19 = secretMediaViewer.Y0;
                                        break;
                                    }
                                    c11 = f19;
                                    secretMediaViewer.c(3.0f, c10, c11, true);
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
            case 12:
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
            case 2:
                super.setTranslationX(f7);
                ((mg.i) this.c).invalidate();
                break;
            default:
                super.setTranslationX(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.a) {
            case 2:
                super.setTranslationY(f7);
                ((mg.i) this.c).invalidate();
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 11:
                return ((org.telegram.ui.Components.m6) this.b) == drawable || ((org.telegram.ui.Components.m6) this.c) == drawable || super.verifyDrawable(drawable);
            case 20:
                return drawable == ((e31) this.c).f || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 11:
                super(context);
                org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(true, true, true, false);
                this.b = m6Var;
                qr qrVar = qr.h;
                m6Var.k(0.3f, 430L, qrVar);
                m6Var.u(AndroidUtilities.bold());
                m6Var.r(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.A8, e6Var));
                m6Var.t(AndroidUtilities.dp(18.0f));
                m6Var.n(!LocaleController.isRTL);
                m6Var.setCallback(this);
                m6Var.G = AndroidUtilities.displaySize.x;
                org.telegram.ui.Components.m6 m6Var2 = new org.telegram.ui.Components.m6(true, true, true, false);
                this.c = m6Var2;
                m6Var2.k(0.3f, 430L, qrVar);
                m6Var2.r(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.B8, e6Var));
                m6Var2.t(AndroidUtilities.dp(14.0f));
                m6Var2.n(true ^ LocaleController.isRTL);
                m6Var2.setCallback(this);
                m6Var2.G = AndroidUtilities.displaySize.x;
                break;
            case 29:
                super(context);
                LinearLayout f7 = vl.f(context, 1);
                org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, false, false);
                this.b = n6Var;
                int i11 = org.telegram.ui.ActionBar.i6.G6;
                n6Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
                n6Var.setTextSize(AndroidUtilities.dp(17.0f));
                n6Var.setTypeface(AndroidUtilities.bold());
                f7.addView(n6Var, w7.x5.q(-2, 23, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTextSize(1, 11.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                f7.addView(textView, w7.x5.q(-2, -2, 1));
                addView(f7, w7.x5.e(-2, -2, 17));
                break;
            default:
                this.c = new yf.y(8);
                this.b = e6Var;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(org.telegram.ui.Cells.z0 z0Var, Context context) {
        super(context);
        this.a = 6;
        this.c = z0Var;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(i51 i51Var, Context context) {
        super(context);
        this.a = 22;
        this.c = i51Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(org.telegram.ui.ac acVar, Context context) {
        super(context);
        this.a = 7;
        this.c = acVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(org.telegram.ui.o5 o5Var, Activity activity) {
        super(activity);
        this.a = 5;
        this.c = o5Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(org.telegram.ui.Components.voip.j1 j1Var, Context context) {
        super(context);
        this.a = 14;
        this.c = j1Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(sd0 sd0Var, Context context) {
        super(context);
        this.a = 12;
        this.c = sd0Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(Context context, TextView textView, TextView textView2) {
        super(context);
        this.a = 18;
        this.b = textView;
        this.c = textView2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.a = 21;
        this.c = secretMediaViewer;
        this.b = secretMediaViewer;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(h71 h71Var, Context context) {
        super(context);
        this.a = 23;
        this.c = h71Var;
        this.b = new Rect();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(e31 e31Var, Activity activity, f31 f31Var) {
        super(activity);
        this.a = 20;
        this.c = e31Var;
        Rect rect = new Rect();
        this.b = rect;
        e31Var.a.setColor(f31Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
        Drawable drawable = e31Var.f;
        drawable.setCallback(this);
        drawable.getPadding(rect);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(mp mpVar, Context context) {
        super(context);
        this.a = 9;
        this.c = mpVar;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(st stVar, Activity activity) {
        super(activity);
        this.a = 16;
        this.c = stVar;
        this.b = stVar;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(wd1 wd1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 26:
                this.c = wd1Var;
                super(context);
                this.b = new int[2];
                break;
            default:
                this.c = wd1Var;
                this.b = new Paint();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(qg.o0 o0Var, Context context) {
        super(context);
        this.a = 27;
        this.c = o0Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(fk0 fk0Var, Context context) {
        super(context);
        this.a = 13;
        this.c = fk0Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 24:
                super(context);
                break;
            default:
                this.b = new Path();
                this.c = new l20();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(o6 o6Var, Context context) {
        super(context);
        this.a = 0;
        this.c = o6Var;
        this.b = new Path();
    }
}
