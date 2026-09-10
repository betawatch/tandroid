package bi;

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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.pd0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.ae1;
import org.telegram.ui.au0;
import org.telegram.ui.c80;
import org.telegram.ui.ft;
import org.telegram.ui.g51;
import org.telegram.ui.j31;
import org.telegram.ui.k31;
import org.telegram.ui.l71;
import org.telegram.ui.m20;
import org.telegram.ui.n51;
import org.telegram.ui.o61;
import org.telegram.ui.p61;
import org.telegram.ui.q61;
import org.telegram.ui.ql0;
import org.telegram.ui.tt;
import org.telegram.ui.u61;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class n7 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
    }

    public void a(String str, boolean z10) {
        ((org.telegram.ui.Components.n6) this.c).q(str, z10 && !LocaleController.isRTL, true);
    }

    public void b(String str, boolean z10) {
        ((org.telegram.ui.Components.n6) this.b).q(str, z10 && !LocaleController.isRTL, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v16 */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.l5[] l5VarArr;
        float f7;
        ?? r92;
        char c10;
        float f10;
        float f11;
        org.telegram.ui.Cells.z zVar;
        switch (this.a) {
            case 3:
                xf.z zVar2 = (xf.z) this.c;
                zVar2.b(org.telegram.ui.ActionBar.j6.l1(0.65f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, (org.telegram.ui.ActionBar.f6) this.b)));
                zVar2.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 5:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.b;
                int i10 = org.telegram.ui.ActionBar.j6.a7;
                f6Var = ((org.telegram.ui.ActionBar.p2) ((org.telegram.ui.o5) this.c).d).resourceProvider;
                paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
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
                org.telegram.ui.ActionBar.f6 f6Var2 = z0Var.b;
                if (f6Var2 != null) {
                    f6Var2.l(x10, f12, measuredWidth, i11);
                } else {
                    org.telegram.ui.ActionBar.j6.q(x10, f12, measuredWidth, i11);
                }
                float dp = AndroidUtilities.dp(18.0f);
                float dp2 = AndroidUtilities.dp(18.0f);
                Paint F = f6Var2 != null ? f6Var2.F("paintChatActionBackground") : null;
                if (F == null) {
                    F = org.telegram.ui.ActionBar.j6.S0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, dp, dp2, F);
                if (f6Var2 != null ? f6Var2.m0() : org.telegram.ui.ActionBar.j6.a1()) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    Paint F2 = f6Var2 != null ? f6Var2.F("paintChatActionBackgroundDarken") : null;
                    if (F2 == null) {
                        F2 = org.telegram.ui.ActionBar.j6.S0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, dp3, dp4, F2);
                }
                super.dispatchDraw(canvas);
                break;
            case 7:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, ((org.telegram.ui.cc) this.c).f.e));
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
                m20 m20Var = (m20) this.c;
                m20Var.b(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                m20Var.b(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                break;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.b;
                paint3.setColor(((sp) this.c).getThemedColor(org.telegram.ui.ActionBar.j6.d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint3);
                break;
            case 10:
                ez ezVar = (ez) this.c;
                if (!ezVar.G.u0 && ezVar.w > 0.0f) {
                    if (((Paint) this.b) == null) {
                        Paint paint4 = new Paint();
                        this.b = paint4;
                        paint4.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.b).setAlpha((int) (ezVar.w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.b);
                    canvas.restore();
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) this.b;
                int dp6 = AndroidUtilities.dp(29.0f);
                int dp7 = AndroidUtilities.dp(18.83f);
                org.telegram.ui.Components.n6 n6Var2 = (org.telegram.ui.Components.n6) this.c;
                n6Var.setBounds(getPaddingLeft(), r3 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r3);
                n6Var.draw(canvas);
                n6Var2.setBounds(getPaddingLeft(), r2 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r2);
                n6Var2.draw(canvas);
                break;
            case 13:
                Paint paint5 = (Paint) this.b;
                pk0 pk0Var = (pk0) this.c;
                int i12 = pk0Var.M0;
                paint5.setColor((i12 == 1 || i12 == 2 || i12 == 4) ? i0.a.k(-1, 30) : i0.a.d(0.7f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, pk0Var.k0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, pk0Var.k0)));
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g10 = pk0Var.g();
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
                org.telegram.ui.ActionBar.l5[] l5VarArr2 = profileActivity.r;
                if (profileActivity.W4 != null) {
                    canvas.save();
                    canvas.translate(l5VarArr2[0].getX(), l5VarArr2[0].getY());
                    l5VarArr = l5VarArr2;
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
                    l5VarArr = l5VarArr2;
                    f7 = 0.0f;
                    r92 = 0;
                    c10 = 2;
                    f10 = 14.0f;
                    f11 = 24.0f;
                }
                if (profileActivity.p5 && profileActivity.Y5 != f7 && profileActivity.n5 != 1.0f) {
                    float measuredHeight2 = (l5VarArr[1].getMeasuredHeight() / 2.0f) + l5VarArr[1].getY();
                    float dp8 = AndroidUtilities.dp(22.0f);
                    float x11 = ((l5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.o5)) - dp8) - profileActivity.Z3();
                    profileActivity.r5.setImageCoords(x11, measuredHeight2 - (dp8 / 2.0f), dp8, dp8);
                    profileActivity.r5.setAlpha(profileActivity.Y5);
                    canvas.save();
                    float f13 = profileActivity.Y5;
                    canvas.scale(f13, f13, profileActivity.r5.getCenterX(), profileActivity.r5.getCenterY());
                    profileActivity.r5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.n5 != f7) {
                        org.telegram.ui.Components.ed edVar = (org.telegram.ui.Components.ed) this.b;
                        if (edVar != null && (zVar = edVar.e) != null) {
                            zVar.setState(StateSet.NOTHING);
                            zVar.jumpToCurrentState();
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Components.ed) this.b) == null) {
                            org.telegram.ui.Components.ed edVar2 = new org.telegram.ui.Components.ed(this);
                            this.b = edVar2;
                            edVar2.h = new ql0(this, 29);
                        }
                        float dp9 = (1.0f - profileActivity.n5) * AndroidUtilities.dp(28.0f);
                        float textWidth = l5VarArr[c10].getTextWidth();
                        float max = Math.max(textWidth, profileActivity.T != null ? (AndroidUtilities.dp(f11) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.T.getVisibilityFactor() : 0.0f) + dp9;
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(x11 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(f10), x11 + max + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(f10));
                        org.telegram.ui.Components.ed edVar3 = (org.telegram.ui.Components.ed) this.b;
                        edVar3.i = r92;
                        edVar3.c = r92;
                        edVar3.a(rectF4);
                        org.telegram.ui.Components.ed edVar4 = (org.telegram.ui.Components.ed) this.b;
                        edVar4.n = true;
                        int k10 = i0.a.k(-1, 50);
                        edVar4.g.setColor((int) r92);
                        org.telegram.ui.Cells.z zVar3 = edVar4.e;
                        if (zVar3 != null) {
                            org.telegram.ui.ActionBar.j6.B1(zVar3, k10, true);
                        }
                        org.telegram.ui.Components.ed edVar5 = (org.telegram.ui.Components.ed) this.b;
                        edVar5.c(canvas, edVar5.g);
                        org.telegram.ui.Cells.z zVar4 = edVar5.e;
                        if (zVar4 != null) {
                            zVar4.draw(canvas);
                            break;
                        }
                    }
                }
                break;
            case 20:
                Rect rect = (Rect) this.b;
                j31 j31Var = (j31) this.c;
                if (j31Var.R) {
                    j31Var.f.setBounds(-rect.left, -rect.top, getWidth() + rect.right, getHeight() + rect.bottom);
                    j31Var.f.draw(canvas);
                } else {
                    RectF rectF5 = AndroidUtilities.rectTmp;
                    rectF5.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                    canvas.drawRoundRect(rectF5, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), j31Var.a);
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
                ((qg.c1) this.b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF6 = AndroidUtilities.rectTmp;
                rectF6.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                qg.c1 c1Var = (qg.c1) this.b;
                c1Var.f.setAlpha(((qg.a1) this.c).K);
                canvas.drawRoundRect(rectF6, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, c1Var.f);
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
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.c;
                org.telegram.ui.Cells.ea o9 = j4Var.P0.o(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (j4Var.P0.y() && j4Var.P0.o(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (o9.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() != 0 || !j4Var.P0.y() || (motionEvent.getY() >= linearLayout.getTop() && motionEvent.getY() <= linearLayout.getBottom())) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (j4Var.P0.o(getContext()).onTouchEvent(obtain)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            case 14:
                int action = motionEvent.getAction();
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) this.c;
                if (i1Var.J != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(i1Var.J.getX(), i1Var.J.getY());
                    boolean dispatchTouchEvent = i1Var.J.dispatchTouchEvent(motionEvent);
                    obtain2.recycle();
                    if (action == 1 || action == 3) {
                        i1Var.J = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = i1Var.F.onTouchEvent(obtain3);
                obtain3.recycle();
                boolean z10 = !i1Var.F.isInProgress() && ((GestureDetector) i1Var.G.b).onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    i1Var.H = false;
                    i1Var.I = false;
                    o1.k kVar = i1Var.S;
                    if (!kVar.f) {
                        float f7 = i1Var.Q;
                        kVar.b = f7;
                        kVar.c = true;
                        kVar.u.i = (i1Var.M / 2.0f) + f7 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - r7) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                        i1Var.S.f();
                    }
                    o1.k kVar2 = i1Var.T;
                    if (!kVar2.f) {
                        kVar2.b = i1Var.R;
                        kVar2.c = true;
                        kVar2.u.i = w7.q.a(r2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - i1Var.N) - AndroidUtilities.dp(16.0f));
                        i1Var.T.f();
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
                o7 o7Var = (o7) this.c;
                if (o7Var.h == null || (!((z10 = o7Var.f) && view == o7Var.d) && (z10 || view != o7Var.c))) {
                    return super.drawChild(canvas, view, j3);
                }
                float measuredWidth = ((z10 ? o7Var.e : 1.0f - o7Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            case 16:
                if (view instanceof pd0) {
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 21:
                return view != ((SecretMediaViewer) this.b).w && super.drawChild(canvas, view, j3);
            case 22:
                Path path2 = (Path) this.b;
                n51 n51Var = (n51) this.c;
                RectF rectF = n51Var.R;
                if (view == n51Var.N || view == n51Var.x) {
                    canvas.save();
                    canvas.clipRect(0.0f, AndroidUtilities.lerp(n51Var.T, 0.0f, n51Var.s), getWidth(), AndroidUtilities.lerp(n51Var.U, getHeight(), n51Var.s));
                    boolean drawChild2 = super.drawChild(canvas, view, j3);
                    canvas.restore();
                    return drawChild2;
                }
                if (view != n51Var.P) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                path2.rewind();
                path2.addCircle(rectF.centerX() + n51Var.N.getX(), rectF.centerY() + n51Var.N.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.clipRect(0.0f, AndroidUtilities.lerp(n51Var.T, 0.0f, n51Var.s), getWidth(), AndroidUtilities.lerp(n51Var.U, getHeight(), n51Var.s));
                canvas.translate(-n51Var.P.getX(), -n51Var.P.getY());
                canvas.translate(n51Var.N.getX() + rectF.left, n51Var.N.getY() + rectF.top);
                canvas.scale(rectF.width() / n51Var.P.getMeasuredWidth(), rectF.height() / n51Var.P.getMeasuredHeight(), n51Var.P.getX(), n51Var.P.getY());
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild3;
            case 23:
                if (view != ((l71) this.c).h0 || !yg.f0.b || !yg.f0.f) {
                    return super.drawChild(canvas, view, j3);
                }
                for (int i10 = 0; i10 < ((l71) this.c).h0.getChildCount(); i10++) {
                    View childAt = ((l71) this.c).h0.getChildAt(i10);
                    if (childAt instanceof u61) {
                        u61 u61Var = (u61) childAt;
                        if (u61Var.getAnimatedScale() == 1.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            super.drawChild(canvas, view, j3);
                            canvas.restore();
                        } else if (u61Var.getAnimatedScale() > 0.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            ((Rect) this.b).set((int) (r2.centerX() - (u61Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f))), (int) (((Rect) this.b).centerY() - (u61Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f))), (int) ((u61Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f)) + ((Rect) this.b).centerX()), (int) ((u61Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f)) + ((Rect) this.b).centerY()));
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            canvas.scale(u61Var.getAnimatedScale(), u61Var.getAnimatedScale(), ((Rect) this.b).centerX(), ((Rect) this.b).centerY());
                            super.drawChild(canvas, view, j3);
                            canvas.restore();
                        }
                    } else if ((childAt instanceof TextView) || (childAt instanceof p61) || (childAt instanceof o61) || (childAt instanceof q61)) {
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
                pg.l0 l0Var = (pg.l0) this.c;
                if (l0Var.h == null || (!((z11 = l0Var.f) && view == l0Var.d) && (z11 || view != l0Var.c))) {
                    return super.drawChild(canvas, view, j3);
                }
                float measuredWidth2 = ((z11 ? l0Var.e : 1.0f - l0Var.e) * getMeasuredWidth()) / 2.0f;
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
                ((lg.i) this.c).invalidate();
                break;
            case 26:
                super.invalidate();
                org.telegram.ui.ActionBar.r0 r0Var = ((ae1) this.c).t0;
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
            case 16:
                super.onAttachedToWindow();
                tt ttVar = (tt) this.c;
                ttVar.A.onAttachedToWindow();
                ttVar.B.onAttachedToWindow();
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
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) this.c;
                AndroidUtilities.setPreferredMaxRefreshRate(i1Var.b, i1Var.d, i1Var.c);
                i1Var.i(false);
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
                tt ttVar = (tt) this.c;
                ttVar.A.onDetachedFromWindow();
                ttVar.B.onDetachedFromWindow();
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
                be0 be0Var = (be0) this.c;
                Drawable drawable2 = be0Var.a;
                if (drawable2 == null) {
                    super.onDraw(canvas);
                } else if ((drawable2 instanceof lc0) || (drawable2 instanceof ColorDrawable) || (drawable2 instanceof GradientDrawable)) {
                    drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    be0Var.a.draw(canvas);
                } else {
                    float max = Math.max(getMeasuredWidth() / be0Var.a.getIntrinsicWidth(), (getMeasuredHeight() + be0Var.G) / be0Var.a.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(be0Var.a.getIntrinsicWidth() * max);
                    int ceil2 = (int) Math.ceil(be0Var.a.getIntrinsicHeight() * max);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int measuredHeight = ((getMeasuredHeight() - ceil2) + be0Var.G) / 2;
                    be0Var.a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
                    be0Var.a.draw(canvas);
                }
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.b);
                break;
            case 15:
                canvas.save();
                org.telegram.ui.Components.voip.l2 l2Var = (org.telegram.ui.Components.voip.l2) this.c;
                canvas.scale(l2Var.b.getScaleX(), l2Var.b.getScaleY(), l2Var.b.getPivotX() + l2Var.b.getLeft(), l2Var.b.getPivotY() + l2Var.b.getTop());
                Drawable drawable3 = (Drawable) this.b;
                drawable3.setBounds(l2Var.b.getLeft() - AndroidUtilities.dp(2.0f), l2Var.b.getTop() - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f) + l2Var.b.getRight(), AndroidUtilities.dp(2.0f) + l2Var.b.getBottom());
                drawable3.draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                break;
            case 16:
                tt ttVar = (tt) this.b;
                Paint paint = ttVar.N;
                ImageReceiver imageReceiver = ttVar.B;
                ColorDrawable colorDrawable = ttVar.u;
                ImageReceiver imageReceiver2 = ttVar.A;
                if (ttVar.z != null && colorDrawable != null) {
                    if (ttVar.K && ttVar.v == null && ttVar.w != null && !ttVar.e0) {
                        ttVar.e0 = true;
                        imageReceiver2.setVisible(false, false);
                        km0.d(new org.telegram.ui.b5(ttVar, 8));
                    }
                    if (ttVar.v != null) {
                        boolean z10 = ttVar.K;
                        if (z10) {
                            float f10 = ttVar.M;
                            if (f10 != 1.0f) {
                                float f11 = f10 + 0.13333334f;
                                ttVar.M = f11;
                                if (f11 > 1.0f) {
                                    ttVar.M = 1.0f;
                                }
                                ttVar.z.invalidate();
                                f7 = ttVar.M;
                                if (f7 != 0.0f && ttVar.v != null) {
                                    paint.setAlpha((int) (f7 * 255.0f));
                                    if (paint.getAlpha() != 255) {
                                        canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(ttVar.M, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, ttVar.c0)));
                                    }
                                    canvas.drawPaint(paint);
                                }
                            }
                        }
                        if (!z10) {
                            float f12 = ttVar.M;
                            if (f12 != 0.0f) {
                                float f13 = f12 - 0.13333334f;
                                ttVar.M = f13;
                                if (f13 < 0.0f) {
                                    ttVar.M = 0.0f;
                                }
                                ttVar.z.invalidate();
                            }
                        }
                        f7 = ttVar.M;
                        if (f7 != 0.0f) {
                            paint.setAlpha((int) (f7 * 255.0f));
                            if (paint.getAlpha() != 255) {
                            }
                            canvas.drawPaint(paint);
                        }
                    }
                    colorDrawable.setAlpha((int) (ttVar.F * 180.0f));
                    colorDrawable.setBounds(0, 0, ttVar.z.getWidth(), ttVar.z.getHeight());
                    colorDrawable.draw(canvas);
                    canvas.save();
                    i0.c cVar = ttVar.q;
                    int i10 = cVar.d;
                    int i11 = cVar.b;
                    int i12 = i10 + i11;
                    if (ttVar.V == 1) {
                        min = Math.min(ttVar.z.getWidth(), ttVar.z.getHeight() - i12) - AndroidUtilities.dp(40.0f);
                    } else {
                        min = (int) (ttVar.S ? Math.min(ttVar.z.getWidth(), ttVar.z.getHeight() - i12) - AndroidUtilities.dpf2(40.0f) : Math.min(ttVar.z.getWidth(), ttVar.z.getHeight() - i12) / 1.8f);
                    }
                    float max2 = Math.max((min / 2) + i11 + (ttVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((ttVar.z.getHeight() - i12) - ttVar.I) / 2);
                    if (ttVar.S) {
                        max2 += AndroidUtilities.dp(40.0f);
                    }
                    canvas.translate(ttVar.z.getWidth() / 2, ttVar.e + max2);
                    int i13 = (int) (min * ((ttVar.F * 0.8f) / 0.8f));
                    if (ttVar.V == 3) {
                        canvas.translate(0.0f, AndroidUtilities.dp(70.0f));
                    }
                    if (ttVar.S) {
                        float f14 = i13;
                        float f15 = 0.6669f * f14;
                        imageReceiver2.setAlpha(ttVar.F);
                        float f16 = f14 - f15;
                        float f17 = f14 / 2.0f;
                        imageReceiver2.setImageCoords((f16 - f17) - (0.0546875f * f14), (f16 / 2.0f) - f17, f15, f15);
                        imageReceiver2.draw(canvas);
                        imageReceiver.setAlpha(ttVar.F);
                        float f18 = (-i13) / 2.0f;
                        imageReceiver.setImageCoords(f18, f18, f14, f14);
                        imageReceiver.draw(canvas);
                    } else {
                        imageReceiver2.setAlpha(ttVar.F);
                        float f19 = (-i13) / 2.0f;
                        float f20 = i13;
                        imageReceiver2.setImageCoords(f19, f19, f20, f20);
                        imageReceiver2.draw(canvas);
                    }
                    if (ttVar.C != null) {
                        canvas.save();
                        float f21 = (-i13) / 2.0f;
                        canvas.translate(f21, f21);
                        float f22 = i13;
                        canvas.scale(f22 / ttVar.C.getWidth(), f22 / ttVar.C.getHeight());
                        ttVar.C.setAlpha(ttVar.F);
                        if (ttVar.D == null) {
                            ttVar.D = new Path();
                        }
                        ttVar.D.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, ttVar.C.getWidth(), ttVar.C.getHeight());
                        float f23 = f22 / 8.0f;
                        ttVar.D.addRoundRect(rectF, f23, f23, Path.Direction.CW);
                        canvas.clipPath(ttVar.D);
                        ttVar.C.draw(canvas);
                        canvas.restore();
                    }
                    if (ttVar.V == 1 && !ttVar.m && (drawable = ttVar.J) != null) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = ttVar.J.getIntrinsicHeight();
                        int dp = (int) (imageReceiver2.getDrawRegion().top - AndroidUtilities.dp(((ttVar.d / AndroidUtilities.dp(60.0f)) * 6.0f) + 17.0f));
                        ttVar.J.setAlpha((int) ((1.0f - ttVar.g) * 255.0f));
                        ttVar.J.setBounds((-intrinsicWidth) / 2, (-intrinsicHeight) + dp, intrinsicWidth / 2, dp);
                        ttVar.J.draw(canvas);
                    }
                    if (ttVar.G != null) {
                        if (ttVar.S) {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
                        } else {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver2.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
                        }
                        tt.f0.setAlpha((int) (ttVar.F * 255.0f));
                        ttVar.G.draw(canvas);
                    }
                    canvas.restore();
                    if (ttVar.E) {
                        if (ttVar.F != 1.0f) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j3 = currentTimeMillis - ttVar.H;
                            ttVar.H = currentTimeMillis;
                            ttVar.F = (j3 / 120.0f) + ttVar.F;
                            ttVar.z.invalidate();
                            if (ttVar.F > 1.0f) {
                                ttVar.F = 1.0f;
                                break;
                            }
                        }
                    } else if (ttVar.F != 0.0f) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long j10 = currentTimeMillis2 - ttVar.H;
                        ttVar.H = currentTimeMillis2;
                        ttVar.F -= j10 / 120.0f;
                        ttVar.z.invalidate();
                        if (ttVar.F < 0.0f) {
                            ttVar.F = 0.0f;
                        }
                        if (ttVar.F == 0.0f) {
                            imageReceiver2.setImageBitmap((Drawable) null);
                            AndroidUtilities.unlockOrientation(ttVar.w);
                            AndroidUtilities.runOnUIThread(new ft(ttVar, 1));
                            Bitmap bitmap = ttVar.v;
                            if (bitmap != null) {
                                bitmap.recycle();
                                ttVar.v = null;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(ttVar.O, false, 1.0f, false);
                            ttVar.M = 0.0f;
                            try {
                                if (ttVar.y.getParent() != null) {
                                    ((WindowManager) ttVar.w.getSystemService("window")).removeView(ttVar.y);
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
                int intrinsicHeight2 = org.telegram.ui.ActionBar.j6.i3.getIntrinsicHeight();
                org.telegram.ui.ActionBar.j6.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight2);
                org.telegram.ui.ActionBar.j6.i3.draw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(((ae1) this.c).getThemedColor(org.telegram.ui.ActionBar.j6.Sd));
                canvas.drawRect(0.0f, intrinsicHeight2, getMeasuredWidth(), getMeasuredHeight(), paint2);
                break;
            case 26:
                int[] iArr = (int[]) this.b;
                ae1 ae1Var = (ae1) this.c;
                if (!AndroidUtilities.usingHardwareInput) {
                    getLocationInWindow(iArr);
                    if (ae1Var.s0.getTranslationY() != iArr[1]) {
                        ae1Var.s0.setTranslationY(-r0);
                        ae1Var.t0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < ae1Var.P) {
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
        org.telegram.ui.Components.ed edVar;
        switch (this.a) {
            case 19:
                return (((ProfileActivity) this.c).n5 == 0.0f && (edVar = (org.telegram.ui.Components.ed) this.b) != null && edVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
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
                int y3 = em.y(275.0f, i15, 2);
                c80 c80Var = (c80) this.c;
                FrameLayout frameLayout = c80Var.r;
                frameLayout.layout(0, y3, frameLayout.getMeasuredWidth(), c80Var.r.getMeasuredHeight() + y3);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + y3;
                int measuredWidth = (getMeasuredWidth() - c80Var.e.getMeasuredWidth()) / 2;
                org.telegram.ui.Components.ra raVar = c80Var.e;
                raVar.layout(measuredWidth, dp, raVar.getMeasuredWidth() + measuredWidth, c80Var.e.getMeasuredHeight() + dp);
                z4.g gVar = c80Var.d;
                gVar.layout(0, 0, gVar.getMeasuredWidth(), c80Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - c80Var.n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - c80Var.n.getMeasuredWidth()) / 2;
                ai.t tVar = c80Var.n;
                tVar.layout(measuredWidth2, measuredHeight, tVar.getMeasuredWidth() + measuredWidth2, c80Var.n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - c80Var.f.getMeasuredWidth()) / 2;
                TextView textView = c80Var.f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), c80Var.f.getMeasuredWidth() + measuredWidth3, dp2);
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
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + em.y(275.0f, ((i13 - i11) / 4) * 3, 2);
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
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    g51 g51Var = secretMediaViewer.n;
                    g51Var.layout(g51Var.getLeft(), currentActionBarHeight, secretMediaViewer.n.getRight(), secretMediaViewer.n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.r != null && secretMediaViewer.n != null) {
                    int measuredHeight2 = (secretMediaViewer.n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    x4 x4Var = secretMediaViewer.r;
                    x4Var.layout(x4Var.getLeft(), measuredHeight2, secretMediaViewer.r.getRight(), secretMediaViewer.r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.a0 != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    au0 au0Var = secretMediaViewer.a0;
                    au0Var.layout(au0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.a0.getRight(), secretMediaViewer.a0.getMeasuredHeight() + currentActionBarHeight2);
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
                fg.e eVar = (fg.e) this.c;
                if (!eVar.K || !eVar.J) {
                    int size = View.MeasureSpec.getSize(i11);
                    if (size == 0) {
                        size = viewGroup.getMeasuredHeight();
                    }
                    if (size == 0) {
                        size = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
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
                super.onMeasure(i10, em.C(8.0f, ((LinearLayout) this.b).getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 9:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                break;
            case 11:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
                setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                break;
            case 20:
                j31 j31Var = (j31) this.c;
                View view = j31Var.H;
                View view2 = j31Var.I;
                LinearLayout linearLayout = j31Var.v;
                TextView textView = j31Var.s;
                vl0 vl0Var = j31Var.y;
                boolean z10 = j31Var.S.P;
                int dp3 = AndroidUtilities.dp(12.0f);
                if (z10) {
                    vl0Var.setLayoutParams(w7.a6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
                    vl0Var.setPadding(dp3, 0, dp3, 0);
                    if (linearLayout != null) {
                        textView.setLayoutParams(w7.a6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(w7.a6.d(-1, 48.0f, 8388691, 16.0f, 162.0f, 16.0f, 16.0f));
                    } else {
                        textView.setLayoutParams(w7.a6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
                    }
                } else {
                    vl0Var.setPadding(dp3, dp3 / 2, dp3, dp3);
                    if (linearLayout != null) {
                        vl0Var.setLayoutParams(w7.a6.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 136.0f));
                        textView.setLayoutParams(w7.a6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(w7.a6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    } else {
                        vl0Var.setLayoutParams(w7.a6.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 80.0f));
                        textView.setLayoutParams(w7.a6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    }
                }
                if (z10) {
                    view2.setVisibility(8);
                    view.setVisibility(8);
                } else {
                    int i12 = textView != null ? 136 : 80;
                    view2.setVisibility(0);
                    view2.setLayoutParams(w7.a6.d(-1, AndroidUtilities.dp(2.0f), 80, 0.0f, 0.0f, 0.0f, i12));
                    view.setVisibility(0);
                    view.setLayoutParams(w7.a6.d(-1, AndroidUtilities.dp(2.0f), 48, 0.0f, 44.0f, 0.0f, 0.0f));
                }
                if (j31Var.R != z10) {
                    k31 k31Var = j31Var.d;
                    if (z10) {
                        k31Var.getParentActivity();
                        sVar = new s4.c0(0, false);
                    } else {
                        k31Var.getParentActivity();
                        sVar = new s4.s(3, false);
                    }
                    j31Var.G = sVar;
                    vl0Var.setLayoutManager(sVar);
                    vl0Var.requestLayout();
                    int i13 = j31Var.L;
                    if (i13 != -1) {
                        j31Var.b(i13);
                    }
                    j31Var.R = z10;
                }
                super.onMeasure(i10, i11);
                break;
            case 21:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                au0 au0Var = secretMediaViewer.a0;
                if (au0Var != null) {
                    au0Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((measuredHeight - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - (secretMediaViewer.U.getVisibility() != 0 ? 0 : secretMediaViewer.U.getMeasuredHeight()), TLObject.FLAG_30));
                }
                View view3 = secretMediaViewer.f;
                if (view3 != null) {
                    view3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.navigationBarHeight, TLObject.FLAG_30));
                    break;
                }
                break;
            case 28:
                super.onMeasure(i10, em.C(2.0f, ((qg.a1) this.c).s, TLObject.FLAG_30));
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
                xf.z zVar = (xf.z) this.c;
                zVar.setBounds(0, 0, i10, i11);
                zVar.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
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
        org.telegram.ui.Components.ed edVar;
        switch (this.a) {
            case 2:
                lg.i iVar = (lg.i) this.c;
                lg.c cVar = iVar.r;
                boolean onTouchEvent = ((GestureDetector) ((l2.h) this.b).b).onTouchEvent(motionEvent);
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
                        lVar.i = lg.i.a(displayMetrics, f7);
                        iVar.d.u.i = lg.i.b(getResources().getDisplayMetrics(), (float) iVar.d.u.i);
                        iVar.c.f();
                        iVar.d.f();
                    }
                    iVar.n = false;
                    iVar.f = false;
                    iVar.h = false;
                }
                return onTouchEvent;
            case 19:
                return (((ProfileActivity) this.c).n5 == 0.0f && (edVar = (org.telegram.ui.Components.ed) this.b) != null && edVar.b(motionEvent)) || super.onTouchEvent(motionEvent);
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
                        xm0 xm0Var = secretMediaViewer.g1;
                        if (!xm0Var.q) {
                            xm0Var.a();
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
                                secretMediaViewer.w0 = em.c(secretMediaViewer.y0, secretMediaViewer.O0, (secretMediaViewer.P0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.R0, secretMediaViewer.P0 - (secretMediaViewer.e.getWidth() / 2));
                                float height = secretMediaViewer.Q0 - (secretMediaViewer.e.getHeight() / 2);
                                float height2 = (secretMediaViewer.Q0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.S0;
                                float f11 = secretMediaViewer.y0;
                                secretMediaViewer.x0 = em.c(f11, secretMediaViewer.O0, height2, height);
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
                                    float c10 = em.c(3.0f, secretMediaViewer.O0, (secretMediaViewer.P0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.R0, secretMediaViewer.P0 - (secretMediaViewer.e.getWidth() / 2));
                                    float c11 = em.c(3.0f, secretMediaViewer.O0, (secretMediaViewer.Q0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.S0, secretMediaViewer.Q0 - (secretMediaViewer.e.getHeight() / 2));
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
                ((lg.i) this.c).invalidate();
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
                ((lg.i) this.c).invalidate();
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
                return ((org.telegram.ui.Components.n6) this.b) == drawable || ((org.telegram.ui.Components.n6) this.c) == drawable || super.verifyDrawable(drawable);
            case 20:
                return drawable == ((j31) this.c).f || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 11:
                super(context);
                org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, true, true, false);
                this.b = n6Var;
                wr wrVar = wr.h;
                n6Var.k(0.3f, 430L, wrVar);
                n6Var.u(AndroidUtilities.bold());
                n6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, f6Var));
                n6Var.t(AndroidUtilities.dp(18.0f));
                n6Var.n(!LocaleController.isRTL);
                n6Var.setCallback(this);
                n6Var.G = AndroidUtilities.displaySize.x;
                org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(true, true, true, false);
                this.c = n6Var2;
                n6Var2.k(0.3f, 430L, wrVar);
                n6Var2.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, f6Var));
                n6Var2.t(AndroidUtilities.dp(14.0f));
                n6Var2.n(true ^ LocaleController.isRTL);
                n6Var2.setCallback(this);
                n6Var2.G = AndroidUtilities.displaySize.x;
                break;
            case 29:
                super(context);
                LinearLayout f7 = em.f(context, 1);
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
                this.b = o6Var;
                int i11 = org.telegram.ui.ActionBar.j6.G6;
                o6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
                o6Var.setTextSize(AndroidUtilities.dp(17.0f));
                o6Var.setTypeface(AndroidUtilities.bold());
                f7.addView(o6Var, w7.a6.q(-2, 23, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTextSize(1, 11.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                f7.addView(textView, w7.a6.q(-2, -2, 1));
                addView(f7, w7.a6.e(-2, -2, 17));
                break;
            default:
                this.c = new xf.z(8);
                this.b = f6Var;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(org.telegram.ui.Cells.z0 z0Var, Context context) {
        super(context);
        this.a = 6;
        this.c = z0Var;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(n51 n51Var, Context context) {
        super(context);
        this.a = 22;
        this.c = n51Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(org.telegram.ui.cc ccVar, Context context) {
        super(context);
        this.a = 7;
        this.c = ccVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(org.telegram.ui.o5 o5Var, Activity activity) {
        super(activity);
        this.a = 5;
        this.c = o5Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(org.telegram.ui.Components.voip.i1 i1Var, Context context) {
        super(context);
        this.a = 14;
        this.c = i1Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(be0 be0Var, Context context) {
        super(context);
        this.a = 12;
        this.c = be0Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(Context context, TextView textView, TextView textView2) {
        super(context);
        this.a = 18;
        this.b = textView;
        this.c = textView2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.a = 21;
        this.c = secretMediaViewer;
        this.b = secretMediaViewer;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(l71 l71Var, Context context) {
        super(context);
        this.a = 23;
        this.c = l71Var;
        this.b = new Rect();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(j31 j31Var, Activity activity, k31 k31Var) {
        super(activity);
        this.a = 20;
        this.c = j31Var;
        Rect rect = new Rect();
        this.b = rect;
        j31Var.a.setColor(k31Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        Drawable drawable = j31Var.f;
        drawable.setCallback(this);
        drawable.getPadding(rect);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(sp spVar, Context context) {
        super(context);
        this.a = 9;
        this.c = spVar;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(tt ttVar, Activity activity) {
        super(activity);
        this.a = 16;
        this.c = ttVar;
        this.b = ttVar;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(ae1 ae1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 26:
                this.c = ae1Var;
                super(context);
                this.b = new int[2];
                break;
            default:
                this.c = ae1Var;
                this.b = new Paint();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(pg.l0 l0Var, Context context) {
        super(context);
        this.a = 27;
        this.c = l0Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(pk0 pk0Var, Context context) {
        super(context);
        this.a = 13;
        this.c = pk0Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 24:
                super(context);
                break;
            default:
                this.b = new Path();
                this.c = new m20();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(o7 o7Var, Context context) {
        super(context);
        this.a = 0;
        this.c = o7Var;
        this.b = new Path();
    }
}
