package fh;

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
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.ka;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.b61;
import org.telegram.ui.d41;
import org.telegram.ui.e51;
import org.telegram.ui.f51;
import org.telegram.ui.g51;
import org.telegram.ui.ht;
import org.telegram.ui.i70;
import org.telegram.ui.k51;
import org.telegram.ui.ky0;
import org.telegram.ui.oc1;
import org.telegram.ui.s10;
import org.telegram.ui.us;
import org.telegram.ui.vb;
import org.telegram.ui.w31;
import org.telegram.ui.y11;
import org.telegram.ui.z11;
import org.telegram.ui.zs0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class v extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Context context, int i9) {
        super(context);
        this.a = i9;
    }

    public void b(int i9, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.c;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i9);
        } else {
            imageView.setImageResource(i9);
        }
        ((TextView) this.b).setText(charSequence);
    }

    public void c(String str, boolean z10) {
        ((org.telegram.ui.Components.i6) this.b).q(str, z10 && !LocaleController.isRTL, true);
    }

    public void d(String str, boolean z10) {
        ((org.telegram.ui.Components.i6) this.c).q(str, z10 && !LocaleController.isRTL, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.h5[] h5VarArr;
        float f10;
        char c10;
        float f11;
        org.telegram.ui.Cells.z zVar;
        int i9 = 0;
        switch (this.a) {
            case 7:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.c;
                int i10 = org.telegram.ui.ActionBar.f6.a7;
                b6Var = ((org.telegram.ui.ActionBar.o2) ((org.telegram.ui.o5) this.b).d).resourceProvider;
                paint.setColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint);
                break;
            case 8:
                RectF rectF = (RectF) this.c;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.z0 z0Var = (org.telegram.ui.Cells.z0) this.b;
                int measuredWidth = z0Var.getMeasuredWidth();
                int i11 = z0Var.d;
                float x10 = z0Var.getX();
                float f12 = z0Var.c;
                org.telegram.ui.ActionBar.b6 b6Var2 = z0Var.b;
                if (b6Var2 != null) {
                    b6Var2.o(x10, f12, measuredWidth, i11);
                } else {
                    org.telegram.ui.ActionBar.f6.q(x10, f12, measuredWidth, i11);
                }
                float dp = AndroidUtilities.dp(18.0f);
                float dp2 = AndroidUtilities.dp(18.0f);
                Paint O = b6Var2 != null ? b6Var2.O("paintChatActionBackground") : null;
                if (O == null) {
                    O = org.telegram.ui.ActionBar.f6.S0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, dp, dp2, O);
                if (b6Var2 != null ? b6Var2.t0() : org.telegram.ui.ActionBar.f6.a1()) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    Paint O2 = b6Var2 != null ? b6Var2.O("paintChatActionBackgroundDarken") : null;
                    if (O2 == null) {
                        O2 = org.telegram.ui.ActionBar.f6.S0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, dp3, dp4, O2);
                }
                super.dispatchDraw(canvas);
                break;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.c;
                paint2.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.a7, ((vb) this.b).f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                break;
            case 10:
                float dp5 = AndroidUtilities.dp(20.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.c;
                path.rewind();
                path.addRoundRect(rectF2, dp5, dp5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                super.dispatchDraw(canvas);
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + getPaddingTop());
                s10 s10Var = (s10) this.b;
                s10Var.b(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                s10Var.b(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                break;
            case 11:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.c;
                paint3.setColor(((cp) this.b).getThemedColor(org.telegram.ui.ActionBar.f6.d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint3);
                break;
            case 12:
                jy jyVar = (jy) this.b;
                if (!jyVar.C.q0 && jyVar.w > 0.0f) {
                    if (((Paint) this.c) == null) {
                        Paint paint4 = new Paint();
                        this.c = paint4;
                        paint4.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.c).setAlpha((int) (jyVar.w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.c);
                    canvas.restore();
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.c;
                int dp6 = AndroidUtilities.dp(29.0f);
                int dp7 = AndroidUtilities.dp(18.83f);
                org.telegram.ui.Components.i6 i6Var2 = (org.telegram.ui.Components.i6) this.b;
                i6Var.setBounds(getPaddingLeft(), r3 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r3);
                i6Var.draw(canvas);
                i6Var2.setBounds(getPaddingLeft(), r2 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r2);
                i6Var2.draw(canvas);
                break;
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 23:
            case 24:
            case 25:
            default:
                super.dispatchDraw(canvas);
                break;
            case 15:
                Paint paint5 = (Paint) this.c;
                uj0 uj0Var = (uj0) this.b;
                int i12 = uj0Var.I0;
                paint5.setColor((i12 == 1 || i12 == 2 || i12 == 4) ? i0.a.k(-1, 30) : i0.a.d(0.7f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.F8, uj0Var.g0), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, uj0Var.g0)));
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g10 = uj0Var.g();
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
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                org.telegram.ui.ActionBar.h5[] h5VarArr2 = profileActivity.r;
                if (profileActivity.S4 != null) {
                    canvas.save();
                    canvas.translate(h5VarArr2[0].getX(), h5VarArr2[0].getY());
                    f10 = 0.0f;
                    h5VarArr = h5VarArr2;
                    c10 = 2;
                    f11 = 2.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.S4.getMeasuredWidth(), profileActivity.S4.getMeasuredHeight(), (int) ((1.0f - profileActivity.O1) * 255.0f), 31);
                    profileActivity.S4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    h5VarArr = h5VarArr2;
                    f10 = 0.0f;
                    c10 = 2;
                    f11 = 2.0f;
                }
                if (profileActivity.l5 && profileActivity.U5 != f10 && profileActivity.j5 != 1.0f) {
                    float measuredHeight2 = (h5VarArr[1].getMeasuredHeight() / f11) + h5VarArr[1].getY();
                    float dp8 = AndroidUtilities.dp(22.0f);
                    float x11 = ((h5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.k5)) - dp8) - profileActivity.Z3();
                    profileActivity.n5.setImageCoords(x11, measuredHeight2 - (dp8 / f11), dp8, dp8);
                    profileActivity.n5.setAlpha(profileActivity.U5);
                    canvas.save();
                    float f13 = profileActivity.U5;
                    canvas.scale(f13, f13, profileActivity.n5.getCenterX(), profileActivity.n5.getCenterY());
                    profileActivity.n5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.j5 != f10) {
                        wc wcVar = (wc) this.c;
                        if (wcVar != null && (zVar = wcVar.e) != null) {
                            zVar.setState(StateSet.NOTHING);
                            zVar.jumpToCurrentState();
                            break;
                        }
                    } else {
                        if (((wc) this.c) == null) {
                            wc wcVar2 = new wc(this);
                            this.c = wcVar2;
                            wcVar2.h = new ky0(this, i9);
                        }
                        float dp9 = (1.0f - profileActivity.j5) * AndroidUtilities.dp(28.0f);
                        float textWidth = h5VarArr[c10].getTextWidth();
                        float max = Math.max(textWidth, profileActivity.P != null ? (AndroidUtilities.dp(24.0f) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.P.getVisibilityFactor() : 0.0f) + dp9;
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(x11 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(14.0f), x11 + max + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(14.0f));
                        wc wcVar3 = (wc) this.c;
                        wcVar3.i = false;
                        wcVar3.c = 0;
                        wcVar3.a(rectF4);
                        wc wcVar4 = (wc) this.c;
                        wcVar4.n = true;
                        int k10 = i0.a.k(-1, 50);
                        wcVar4.g.setColor(0);
                        org.telegram.ui.Cells.z zVar2 = wcVar4.e;
                        if (zVar2 != null) {
                            org.telegram.ui.ActionBar.f6.B1(zVar2, k10, true);
                        }
                        wc wcVar5 = (wc) this.c;
                        wcVar5.c(canvas, wcVar5.g);
                        org.telegram.ui.Cells.z zVar3 = wcVar5.e;
                        if (zVar3 != null) {
                            zVar3.draw(canvas);
                            break;
                        }
                    }
                }
                break;
            case 22:
                Rect rect = (Rect) this.c;
                y11 y11Var = (y11) this.b;
                if (y11Var.N) {
                    y11Var.f.setBounds(-rect.left, -rect.top, getWidth() + rect.right, getHeight() + rect.bottom);
                    y11Var.f.draw(canvas);
                } else {
                    RectF rectF5 = AndroidUtilities.rectTmp;
                    rectF5.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                    canvas.drawRoundRect(rectF5, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), y11Var.a);
                }
                super.dispatchDraw(canvas);
                break;
            case 26:
                ImageReceiver imageReceiver = (ImageReceiver) this.c;
                imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.draw(canvas);
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.a) {
            case 3:
                if (keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 4) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                hg.e0 e0Var = (hg.e0) this.b;
                if (!e0Var.k) {
                    return true;
                }
                e0Var.d();
                return true;
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean z10) {
        switch (this.a) {
            case 3:
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
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.b;
                z9 o6 = l4Var.L0.o(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.c;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (l4Var.L0.y() && l4Var.L0.o(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (o6.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() != 0 || !l4Var.L0.y() || (motionEvent.getY() >= linearLayout.getTop() && motionEvent.getY() <= linearLayout.getBottom())) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (l4Var.L0.o(getContext()).onTouchEvent(obtain)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            case 16:
                int action = motionEvent.getAction();
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.b;
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
                        jVar2.u.i = g7.n.a(r2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - g1Var.J) - AndroidUtilities.dp(16.0f));
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
            case 4:
                Path path = (Path) this.c;
                kh.d6 d6Var = (kh.d6) this.b;
                if (d6Var.h == null || (!((z10 = d6Var.f) && view == d6Var.d) && (z10 || view != d6Var.c))) {
                    return super.drawChild(canvas, view, j10);
                }
                float measuredWidth = ((z10 ? d6Var.e : 1.0f - d6Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            case 18:
                if (view instanceof mc0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 23:
                return view != ((SecretMediaViewer) this.c).w && super.drawChild(canvas, view, j10);
            case 24:
                Path path2 = (Path) this.c;
                d41 d41Var = (d41) this.b;
                RectF rectF = d41Var.N;
                if (view == d41Var.J || view == d41Var.x) {
                    canvas.save();
                    canvas.clipRect(0.0f, AndroidUtilities.lerp(d41Var.P, 0.0f, d41Var.s), getWidth(), AndroidUtilities.lerp(d41Var.Q, getHeight(), d41Var.s));
                    boolean drawChild2 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild2;
                }
                if (view != d41Var.L) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                path2.rewind();
                path2.addCircle(rectF.centerX() + d41Var.J.getX(), rectF.centerY() + d41Var.J.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.clipRect(0.0f, AndroidUtilities.lerp(d41Var.P, 0.0f, d41Var.s), getWidth(), AndroidUtilities.lerp(d41Var.Q, getHeight(), d41Var.s));
                canvas.translate(-d41Var.L.getX(), -d41Var.L.getY());
                canvas.translate(d41Var.J.getX() + rectF.left, d41Var.J.getY() + rectF.top);
                canvas.scale(rectF.width() / d41Var.L.getMeasuredWidth(), rectF.height() / d41Var.L.getMeasuredHeight(), d41Var.L.getX(), d41Var.L.getY());
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            case 25:
                if (view != ((b61) this.b).d0 || !hg.h0.b || !hg.h0.f) {
                    return super.drawChild(canvas, view, j10);
                }
                for (int i9 = 0; i9 < ((b61) this.b).d0.getChildCount(); i9++) {
                    View childAt = ((b61) this.b).d0.getChildAt(i9);
                    if (childAt instanceof k51) {
                        k51 k51Var = (k51) childAt;
                        if (k51Var.getAnimatedScale() == 1.0f) {
                            ((Rect) this.c).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.c);
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        } else if (k51Var.getAnimatedScale() > 0.0f) {
                            ((Rect) this.c).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            ((Rect) this.c).set((int) (r2.centerX() - (k51Var.getAnimatedScale() * (((Rect) this.c).width() / 2.0f))), (int) (((Rect) this.c).centerY() - (k51Var.getAnimatedScale() * (((Rect) this.c).height() / 2.0f))), (int) ((k51Var.getAnimatedScale() * (((Rect) this.c).width() / 2.0f)) + ((Rect) this.c).centerX()), (int) ((k51Var.getAnimatedScale() * (((Rect) this.c).height() / 2.0f)) + ((Rect) this.c).centerY()));
                            canvas.save();
                            canvas.clipRect((Rect) this.c);
                            canvas.scale(k51Var.getAnimatedScale(), k51Var.getAnimatedScale(), ((Rect) this.c).centerX(), ((Rect) this.c).centerY());
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        }
                    } else if ((childAt instanceof TextView) || (childAt instanceof f51) || (childAt instanceof e51) || (childAt instanceof g51)) {
                        ((Rect) this.c).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                        canvas.save();
                        canvas.clipRect((Rect) this.c);
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
            case 3:
                hg.e0 e0Var = (hg.e0) this.b;
                float f10 = e0Var.u;
                float f11 = rect.bottom;
                if (f10 != f11 && e0Var.v) {
                    e0Var.u = f11;
                    v vVar = e0Var.c;
                    hg.d0 d0Var = e0Var.a;
                    if (!e0Var.q) {
                        float f12 = e0Var.t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i9 = e0Var.y;
                        if (i9 == 1 || i9 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f13 = dp;
                        if (d0Var.getMeasuredHeight() + f12 > (vVar.getMeasuredHeight() - e0Var.u) - f13) {
                            f12 = ((vVar.getMeasuredHeight() - e0Var.u) - d0Var.getMeasuredHeight()) - f13;
                        }
                        if (f12 < 0.0f) {
                            f12 = 0.0f;
                        }
                        d0Var.animate().translationY(f12).setDuration(250L).setUpdateListener(new hg.x(e0Var, 1)).setInterpolator(gr.f).start();
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
                org.telegram.ui.ActionBar.r0 r0Var = ((oc1) this.b).p0;
                if (r0Var != null) {
                    r0Var.invalidate();
                    break;
                }
                break;
            case 29:
                super.invalidate();
                ((uf.h) this.b).invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 2:
                super.onAttachedToWindow();
                ((hg.o) this.c).c();
                break;
            case 3:
                super.onAttachedToWindow();
                gc.a(this, (y0) this.c);
                break;
            case 18:
                super.onAttachedToWindow();
                ht htVar = (ht) this.b;
                htVar.A.onAttachedToWindow();
                htVar.B.onAttachedToWindow();
                break;
            case 21:
                super.onAttachedToWindow();
                ((ProfileActivity) this.b).n5.onAttachedToWindow();
                break;
            case 23:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.c).h.onAttachedToWindow();
                break;
            case 26:
                super.onAttachedToWindow();
                ((ImageReceiver) this.c).onAttachedToWindow();
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
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.b;
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
            case 2:
                super.onDetachedFromWindow();
                ((hg.o) this.c).d();
                break;
            case 3:
                super.onDetachedFromWindow();
                gc.h(this);
                break;
            case 18:
                super.onDetachedFromWindow();
                ht htVar = (ht) this.b;
                htVar.A.onDetachedFromWindow();
                htVar.B.onDetachedFromWindow();
                break;
            case 21:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.b).n5.onDetachedFromWindow();
                break;
            case 23:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.c).h.onDetachedFromWindow();
                break;
            case 26:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.c).onDetachedFromWindow();
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
                yc0 yc0Var = (yc0) this.b;
                Drawable drawable2 = yc0Var.a;
                if (drawable2 == null) {
                    super.onDraw(canvas);
                } else if ((drawable2 instanceof jb0) || (drawable2 instanceof ColorDrawable) || (drawable2 instanceof GradientDrawable)) {
                    drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    yc0Var.a.draw(canvas);
                } else {
                    float max = Math.max(getMeasuredWidth() / yc0Var.a.getIntrinsicWidth(), (getMeasuredHeight() + yc0Var.C) / yc0Var.a.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(yc0Var.a.getIntrinsicWidth() * max);
                    int ceil2 = (int) Math.ceil(yc0Var.a.getIntrinsicHeight() * max);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int measuredHeight = ((getMeasuredHeight() - ceil2) + yc0Var.C) / 2;
                    yc0Var.a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
                    yc0Var.a.draw(canvas);
                }
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.c);
                break;
            case 17:
                canvas.save();
                org.telegram.ui.Components.voip.l2 l2Var = (org.telegram.ui.Components.voip.l2) this.b;
                canvas.scale(l2Var.b.getScaleX(), l2Var.b.getScaleY(), l2Var.b.getPivotX() + l2Var.b.getLeft(), l2Var.b.getPivotY() + l2Var.b.getTop());
                Drawable drawable3 = (Drawable) this.c;
                drawable3.setBounds(l2Var.b.getLeft() - AndroidUtilities.dp(2.0f), l2Var.b.getTop() - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f) + l2Var.b.getRight(), AndroidUtilities.dp(2.0f) + l2Var.b.getBottom());
                drawable3.draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                break;
            case 18:
                ht htVar = (ht) this.c;
                Paint paint = htVar.N;
                ImageReceiver imageReceiver = htVar.B;
                ColorDrawable colorDrawable = htVar.u;
                ImageReceiver imageReceiver2 = htVar.A;
                if (htVar.z != null && colorDrawable != null) {
                    if (htVar.K && htVar.v == null && htVar.w != null && !htVar.e0) {
                        htVar.e0 = true;
                        imageReceiver2.setVisible(false, false);
                        ll0.d(new org.telegram.ui.a5(htVar, 8));
                    }
                    if (htVar.v != null) {
                        boolean z10 = htVar.K;
                        if (z10) {
                            float f11 = htVar.M;
                            if (f11 != 1.0f) {
                                float f12 = f11 + 0.13333334f;
                                htVar.M = f12;
                                if (f12 > 1.0f) {
                                    htVar.M = 1.0f;
                                }
                                htVar.z.invalidate();
                                f10 = htVar.M;
                                if (f10 != 0.0f && htVar.v != null) {
                                    paint.setAlpha((int) (f10 * 255.0f));
                                    if (paint.getAlpha() != 255) {
                                        canvas.drawColor(org.telegram.ui.ActionBar.f6.l1(htVar.M, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.a7, htVar.c0)));
                                    }
                                    canvas.drawPaint(paint);
                                }
                            }
                        }
                        if (!z10) {
                            float f13 = htVar.M;
                            if (f13 != 0.0f) {
                                float f14 = f13 - 0.13333334f;
                                htVar.M = f14;
                                if (f14 < 0.0f) {
                                    htVar.M = 0.0f;
                                }
                                htVar.z.invalidate();
                            }
                        }
                        f10 = htVar.M;
                        if (f10 != 0.0f) {
                            paint.setAlpha((int) (f10 * 255.0f));
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
                    int i9 = bVar.d;
                    int i10 = bVar.b;
                    int i11 = i9 + i10;
                    if (htVar.V == 1) {
                        min = Math.min(htVar.z.getWidth(), htVar.z.getHeight() - i11) - AndroidUtilities.dp(40.0f);
                    } else {
                        min = (int) (htVar.S ? Math.min(htVar.z.getWidth(), htVar.z.getHeight() - i11) - AndroidUtilities.dpf2(40.0f) : Math.min(htVar.z.getWidth(), htVar.z.getHeight() - i11) / 1.8f);
                    }
                    float max2 = Math.max((min / 2) + i10 + (htVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((htVar.z.getHeight() - i11) - htVar.I) / 2);
                    if (htVar.S) {
                        max2 += AndroidUtilities.dp(40.0f);
                    }
                    canvas.translate(htVar.z.getWidth() / 2, htVar.e + max2);
                    int i12 = (int) (min * ((htVar.F * 0.8f) / 0.8f));
                    if (htVar.V == 3) {
                        canvas.translate(0.0f, AndroidUtilities.dp(70.0f));
                    }
                    if (htVar.S) {
                        float f15 = i12;
                        float f16 = 0.6669f * f15;
                        imageReceiver2.setAlpha(htVar.F);
                        float f17 = f15 - f16;
                        float f18 = f15 / 2.0f;
                        imageReceiver2.setImageCoords((f17 - f18) - (0.0546875f * f15), (f17 / 2.0f) - f18, f16, f16);
                        imageReceiver2.draw(canvas);
                        imageReceiver.setAlpha(htVar.F);
                        float f19 = (-i12) / 2.0f;
                        imageReceiver.setImageCoords(f19, f19, f15, f15);
                        imageReceiver.draw(canvas);
                    } else {
                        imageReceiver2.setAlpha(htVar.F);
                        float f20 = (-i12) / 2.0f;
                        float f21 = i12;
                        imageReceiver2.setImageCoords(f20, f20, f21, f21);
                        imageReceiver2.draw(canvas);
                    }
                    if (htVar.C != null) {
                        canvas.save();
                        float f22 = (-i12) / 2.0f;
                        canvas.translate(f22, f22);
                        float f23 = i12;
                        canvas.scale(f23 / htVar.C.getWidth(), f23 / htVar.C.getHeight());
                        htVar.C.setAlpha(htVar.F);
                        if (htVar.D == null) {
                            htVar.D = new Path();
                        }
                        htVar.D.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, htVar.C.getWidth(), htVar.C.getHeight());
                        float f24 = f23 / 8.0f;
                        htVar.D.addRoundRect(rectF, f24, f24, Path.Direction.CW);
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
                            AndroidUtilities.runOnUIThread(new us(htVar, 1));
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
            case 23:
                SecretMediaViewer.b((SecretMediaViewer) this.c, canvas);
                break;
            case 27:
                int intrinsicHeight2 = org.telegram.ui.ActionBar.f6.i3.getIntrinsicHeight();
                org.telegram.ui.ActionBar.f6.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight2);
                org.telegram.ui.ActionBar.f6.i3.draw(canvas);
                Paint paint2 = (Paint) this.c;
                paint2.setColor(((oc1) this.b).getThemedColor(org.telegram.ui.ActionBar.f6.Sd));
                canvas.drawRect(0.0f, intrinsicHeight2, getMeasuredWidth(), getMeasuredHeight(), paint2);
                break;
            case 28:
                int[] iArr = (int[]) this.c;
                oc1 oc1Var = (oc1) this.b;
                if (!AndroidUtilities.usingHardwareInput) {
                    getLocationInWindow(iArr);
                    if (oc1Var.o0.getTranslationY() != iArr[1]) {
                        oc1Var.o0.setTranslationY(-r0);
                        oc1Var.p0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < oc1Var.L) {
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
        wc wcVar;
        switch (this.a) {
            case 21:
                return (((ProfileActivity) this.b).j5 == 0.0f && (wcVar = (wc) this.c) != null && wcVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 19:
                super.onLayout(z10, i9, i10, i11, i12);
                int i13 = (i12 - i10) / 4;
                int i14 = i13 * 3;
                int y10 = ll.y(275.0f, i14, 2);
                i70 i70Var = (i70) this.b;
                FrameLayout frameLayout = i70Var.r;
                frameLayout.layout(0, y10, frameLayout.getMeasuredWidth(), i70Var.r.getMeasuredHeight() + y10);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + y10;
                int measuredWidth = (getMeasuredWidth() - i70Var.e.getMeasuredWidth()) / 2;
                ka kaVar = i70Var.e;
                kaVar.layout(measuredWidth, dp, kaVar.getMeasuredWidth() + measuredWidth, i70Var.e.getMeasuredHeight() + dp);
                m2.g gVar = i70Var.d;
                gVar.layout(0, 0, gVar.getMeasuredWidth(), i70Var.d.getMeasuredHeight());
                int measuredHeight = ((i13 - i70Var.n.getMeasuredHeight()) / 2) + i14;
                int measuredWidth2 = (getMeasuredWidth() - i70Var.n.getMeasuredWidth()) / 2;
                bh.e eVar = i70Var.n;
                eVar.layout(measuredWidth2, measuredHeight, eVar.getMeasuredWidth() + measuredWidth2, i70Var.n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - i70Var.f.getMeasuredWidth()) / 2;
                TextView textView = i70Var.f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), i70Var.f.getMeasuredWidth() + measuredWidth3, dp2);
                FrameLayout frameLayout2 = (FrameLayout) this.c;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int dp3 = AndroidUtilities.dp(4) + (AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight);
                if (marginLayoutParams.topMargin != dp3) {
                    marginLayoutParams.topMargin = dp3;
                    frameLayout2.requestLayout();
                    break;
                }
                break;
            case 20:
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + ll.y(275.0f, ((i12 - i10) / 4) * 3, 2);
                int dp5 = AndroidUtilities.dp(18.0f);
                TextView textView2 = (TextView) this.b;
                textView2.layout(dp5, dp4, textView2.getMeasuredWidth() + dp5, textView2.getMeasuredHeight() + dp4);
                int dp6 = AndroidUtilities.dp(18.0f) + dp4 + ((int) textView2.getTextSize());
                int dp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.c;
                textView3.layout(dp7, dp6, textView3.getMeasuredWidth() + dp7, textView3.getMeasuredHeight() + dp6);
                break;
            case 21:
                super.onLayout(z10, i9, i10, i11, i12);
                ((ProfileActivity) this.b).V4();
                break;
            case 22:
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
            case 23:
                super.onLayout(z10, i9, i10, i11, i12);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                if (secretMediaViewer.n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    w31 w31Var = secretMediaViewer.n;
                    w31Var.layout(w31Var.getLeft(), currentActionBarHeight, secretMediaViewer.n.getRight(), secretMediaViewer.n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.r != null && secretMediaViewer.n != null) {
                    int measuredHeight2 = (secretMediaViewer.n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    kh.x3 x3Var = secretMediaViewer.r;
                    x3Var.layout(x3Var.getLeft(), measuredHeight2, secretMediaViewer.r.getRight(), secretMediaViewer.r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.W != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    zs0 zs0Var = secretMediaViewer.W;
                    zs0Var.layout(zs0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.W.getRight(), secretMediaViewer.W.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f;
                if (view != null) {
                    int i15 = i12 - i10;
                    view.layout(0, i15, i11 - i9, AndroidUtilities.navigationBarHeight + i15);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        f2.m0 yVar;
        switch (this.a) {
            case 5:
                ViewGroup viewGroup = (ViewGroup) this.c;
                of.e eVar = (of.e) this.b;
                if (!eVar.G || !eVar.F) {
                    int size = View.MeasureSpec.getSize(i10);
                    if (size == 0) {
                        size = viewGroup.getMeasuredHeight();
                    }
                    if (size == 0) {
                        size = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                    }
                    int dp = AndroidUtilities.dp(50.0f);
                    int dp2 = eVar.v != 0 ? 0 : AndroidUtilities.dp(30.0f) + dp;
                    if (!eVar.A && !eVar.w) {
                        dp2 += dp;
                    }
                    int paddingTop = (size - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp2 < paddingTop ? paddingTop - dp2 : 0, TLObject.FLAG_30));
                    break;
                } else {
                    super.onMeasure(i9, i10);
                    break;
                }
                break;
            case 6:
                super.onMeasure(i9, i10);
                super.onMeasure(i9, ll.C(8.0f, ((LinearLayout) this.c).getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 11:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                break;
            case 13:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
                setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                break;
            case 22:
                y11 y11Var = (y11) this.b;
                View view = y11Var.D;
                View view2 = y11Var.E;
                LinearLayout linearLayout = y11Var.v;
                TextView textView = y11Var.s;
                wk0 wk0Var = y11Var.y;
                boolean z10 = y11Var.O.L;
                int dp3 = AndroidUtilities.dp(12.0f);
                if (z10) {
                    wk0Var.setLayoutParams(g7.e6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
                    wk0Var.setPadding(dp3, 0, dp3, 0);
                    if (linearLayout != null) {
                        textView.setLayoutParams(g7.e6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(g7.e6.d(-1, 48.0f, 8388691, 16.0f, 162.0f, 16.0f, 16.0f));
                    } else {
                        textView.setLayoutParams(g7.e6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
                    }
                } else {
                    wk0Var.setPadding(dp3, dp3 / 2, dp3, dp3);
                    if (linearLayout != null) {
                        wk0Var.setLayoutParams(g7.e6.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 136.0f));
                        textView.setLayoutParams(g7.e6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(g7.e6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    } else {
                        wk0Var.setLayoutParams(g7.e6.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 80.0f));
                        textView.setLayoutParams(g7.e6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    }
                }
                if (z10) {
                    view2.setVisibility(8);
                    view.setVisibility(8);
                } else {
                    int i11 = textView != null ? 136 : 80;
                    view2.setVisibility(0);
                    view2.setLayoutParams(g7.e6.d(-1, AndroidUtilities.dp(2.0f), 80, 0.0f, 0.0f, 0.0f, i11));
                    view.setVisibility(0);
                    view.setLayoutParams(g7.e6.d(-1, AndroidUtilities.dp(2.0f), 48, 0.0f, 44.0f, 0.0f, 0.0f));
                }
                if (y11Var.N != z10) {
                    z11 z11Var = y11Var.d;
                    if (z10) {
                        z11Var.getParentActivity();
                        yVar = new f2.m0(0, false);
                    } else {
                        z11Var.getParentActivity();
                        yVar = new f2.y(3, false);
                    }
                    y11Var.C = yVar;
                    wk0Var.setLayoutManager(yVar);
                    wk0Var.requestLayout();
                    int i12 = y11Var.H;
                    if (i12 != -1) {
                        y11Var.b(i12);
                    }
                    y11Var.N = z10;
                }
                super.onMeasure(i9, i10);
                break;
            case 23:
                super.onMeasure(i9, i10);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                zs0 zs0Var = secretMediaViewer.W;
                if (zs0Var != null) {
                    zs0Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - (secretMediaViewer.Q.getVisibility() != 0 ? 0 : secretMediaViewer.Q.getMeasuredHeight()), TLObject.FLAG_30));
                }
                View view3 = secretMediaViewer.f;
                if (view3 != null) {
                    view3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.navigationBarHeight, TLObject.FLAG_30));
                    break;
                }
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 16:
                super.onSizeChanged(i9, i10, i11, i12);
                Path path = (Path) this.c;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i9, i10);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                break;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x031f, code lost:
    
        if (r1 > r4) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0310, code lost:
    
        if (r14 > r4) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0385, code lost:
    
        if (r4 > r5) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0374, code lost:
    
        if (r4 > r5) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        wc wcVar;
        DisplayMetrics displayMetrics;
        float f10;
        switch (this.a) {
            case 21:
                return (((ProfileActivity) this.b).j5 == 0.0f && (wcVar = (wc) this.c) != null && wcVar.b(motionEvent)) || super.onTouchEvent(motionEvent);
            case 23:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                if (secretMediaViewer.i0 == 0 && secretMediaViewer.F0 == 0) {
                    if (motionEvent.getPointerCount() == 1 && secretMediaViewer.H0.onTouchEvent(motionEvent) && secretMediaViewer.X0) {
                        secretMediaViewer.X0 = false;
                        secretMediaViewer.W0 = false;
                        secretMediaViewer.V0 = false;
                        secretMediaViewer.d(false);
                    } else if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                        secretMediaViewer.b1 = false;
                        yl0 yl0Var = secretMediaViewer.c1;
                        if (!yl0Var.q) {
                            yl0Var.a();
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
                        float f11 = 0.0f;
                        if (motionEvent.getActionMasked() == 2) {
                            if (motionEvent.getPointerCount() == 2 && !secretMediaViewer.l0 && secretMediaViewer.V0) {
                                secretMediaViewer.b1 = true;
                                secretMediaViewer.u0 = (((float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0))) / secretMediaViewer.J0) * secretMediaViewer.K0;
                                secretMediaViewer.s0 = ll.c(secretMediaViewer.u0, secretMediaViewer.K0, (secretMediaViewer.L0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.N0, secretMediaViewer.L0 - (secretMediaViewer.e.getWidth() / 2));
                                float height = secretMediaViewer.M0 - (secretMediaViewer.e.getHeight() / 2);
                                float height2 = (secretMediaViewer.M0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.O0;
                                float f12 = secretMediaViewer.u0;
                                secretMediaViewer.t0 = ll.c(f12, secretMediaViewer.K0, height2, height);
                                secretMediaViewer.n(f12);
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
                                    float x10 = secretMediaViewer.P0 - motionEvent.getX();
                                    float y11 = secretMediaViewer.Q0 - motionEvent.getY();
                                    if (secretMediaViewer.W0 || ((secretMediaViewer.u0 == 1.0f && Math.abs(y11) + AndroidUtilities.dp(12.0f) < Math.abs(x10)) || secretMediaViewer.u0 != 1.0f)) {
                                        if (!secretMediaViewer.W0) {
                                            secretMediaViewer.W0 = true;
                                            secretMediaViewer.Z0 = false;
                                            x10 = 0.0f;
                                            y11 = 0.0f;
                                        }
                                        secretMediaViewer.P0 = motionEvent.getX();
                                        secretMediaViewer.Q0 = motionEvent.getY();
                                        secretMediaViewer.n(secretMediaViewer.u0);
                                        float f13 = secretMediaViewer.s0;
                                        if (f13 < secretMediaViewer.R0 || f13 > secretMediaViewer.S0) {
                                            x10 /= 3.0f;
                                        }
                                        float f14 = secretMediaViewer.U0;
                                        if (f14 == 0.0f) {
                                            float f15 = secretMediaViewer.T0;
                                            if (f15 == 0.0f) {
                                                float f16 = secretMediaViewer.t0 - y11;
                                                if (f16 < f15) {
                                                    secretMediaViewer.t0 = f15;
                                                } else {
                                                    if (f16 > f14) {
                                                        secretMediaViewer.t0 = f14;
                                                    }
                                                    f11 = y11;
                                                }
                                                secretMediaViewer.s0 = f13 - x10;
                                                if (secretMediaViewer.u0 != 1.0f) {
                                                    secretMediaViewer.t0 -= f11;
                                                }
                                                secretMediaViewer.e.invalidate();
                                            }
                                        }
                                        float f17 = secretMediaViewer.t0;
                                        if (f17 < secretMediaViewer.T0 || f17 > f14) {
                                            f11 = y11 / 3.0f;
                                            secretMediaViewer.s0 = f13 - x10;
                                            if (secretMediaViewer.u0 != 1.0f) {
                                            }
                                            secretMediaViewer.e.invalidate();
                                        }
                                        f11 = y11;
                                        secretMediaViewer.s0 = f13 - x10;
                                        if (secretMediaViewer.u0 != 1.0f) {
                                        }
                                        secretMediaViewer.e.invalidate();
                                    }
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                            if (secretMediaViewer.V0) {
                                secretMediaViewer.Y0 = true;
                                float f18 = secretMediaViewer.u0;
                                if (f18 < 1.0f) {
                                    secretMediaViewer.n(1.0f);
                                    secretMediaViewer.c(1.0f, 0.0f, 0.0f, true);
                                } else if (f18 > 3.0f) {
                                    float c10 = ll.c(3.0f, secretMediaViewer.K0, (secretMediaViewer.L0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.N0, secretMediaViewer.L0 - (secretMediaViewer.e.getWidth() / 2));
                                    float c11 = ll.c(3.0f, secretMediaViewer.K0, (secretMediaViewer.M0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.O0, secretMediaViewer.M0 - (secretMediaViewer.e.getHeight() / 2));
                                    secretMediaViewer.n(3.0f);
                                    float f19 = secretMediaViewer.R0;
                                    if (c10 >= f19) {
                                        f19 = secretMediaViewer.S0;
                                        break;
                                    }
                                    c10 = f19;
                                    float f20 = secretMediaViewer.T0;
                                    if (c11 >= f20) {
                                        f20 = secretMediaViewer.U0;
                                        break;
                                    }
                                    c11 = f20;
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
                                float f21 = secretMediaViewer.s0;
                                float f22 = secretMediaViewer.t0;
                                secretMediaViewer.n(secretMediaViewer.u0);
                                secretMediaViewer.W0 = false;
                                secretMediaViewer.Z0 = true;
                                float f23 = secretMediaViewer.s0;
                                float f24 = secretMediaViewer.R0;
                                if (f23 >= f24) {
                                    f24 = secretMediaViewer.S0;
                                    break;
                                }
                                f21 = f24;
                                float f25 = secretMediaViewer.t0;
                                float f26 = secretMediaViewer.T0;
                                if (f25 >= f26) {
                                    f26 = secretMediaViewer.U0;
                                    break;
                                }
                                f22 = f26;
                                secretMediaViewer.c(secretMediaViewer.u0, f21, f22, false);
                            }
                        }
                    }
                }
                return true;
            case 29:
                uf.h hVar = (uf.h) this.b;
                uf.c cVar = hVar.r;
                boolean onTouchEvent = ((GestureDetector) ((m5.c0) this.c).b).onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    AndroidUtilities.runOnUIThread(cVar, 200L);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.cancelRunOnUIThread(cVar);
                    if (!hVar.h) {
                        o1.k kVar = hVar.c.u;
                        if (((float) kVar.i) >= getWidth() / 2.0f) {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = 2.14748365E9f;
                        } else {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = -2.14748365E9f;
                        }
                        kVar.i = uf.h.a(displayMetrics, f10);
                        hVar.d.u.i = uf.h.b(getResources().getDisplayMetrics(), (float) hVar.d.u.i);
                        hVar.c.f();
                        hVar.d.f();
                    }
                    hVar.n = false;
                    hVar.f = false;
                    hVar.h = false;
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i9) {
        switch (this.a) {
            case 14:
                ((Paint) this.c).setColor(i9);
                break;
            default:
                super.setBackgroundColor(i9);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        switch (this.a) {
            case 29:
                super.setTranslationX(f10);
                ((uf.h) this.b).invalidate();
                break;
            default:
                super.setTranslationX(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 29:
                super.setTranslationY(f10);
                ((uf.h) this.b).invalidate();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 13:
                return ((org.telegram.ui.Components.i6) this.c) == drawable || ((org.telegram.ui.Components.i6) this.b) == drawable || super.verifyDrawable(drawable);
            case 22:
                return drawable == ((y11) this.b).f || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, Context context, Object obj2, int i9) {
        super(context);
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(org.telegram.ui.Cells.z0 z0Var, Context context) {
        super(context);
        this.a = 8;
        this.b = z0Var;
        this.c = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(hg.e0 e0Var, Context context) {
        super(context);
        this.a = 3;
        this.b = e0Var;
        this.c = new y0(this, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(d41 d41Var, Context context) {
        super(context);
        this.a = 24;
        this.b = d41Var;
        this.c = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(vb vbVar, Context context) {
        super(context);
        this.a = 9;
        this.b = vbVar;
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(hg.s sVar, Context context) {
        super(context);
        this.a = 2;
        this.b = sVar;
        this.c = new hg.o(this, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(org.telegram.ui.o5 o5Var, Activity activity) {
        super(activity);
        this.a = 7;
        this.b = o5Var;
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(org.telegram.ui.Components.voip.g1 g1Var, Context context) {
        super(context);
        this.a = 16;
        this.b = g1Var;
        this.c = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(yc0 yc0Var, Context context) {
        super(context);
        this.a = 14;
        this.b = yc0Var;
        this.c = new Paint();
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
        this.b = secretMediaViewer;
        this.c = secretMediaViewer;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(b61 b61Var, Context context) {
        super(context);
        this.a = 25;
        this.b = b61Var;
        this.c = new Rect();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.a = i9;
        switch (i9) {
            case 13:
                super(context);
                org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, true, true, false);
                this.c = i6Var;
                gr grVar = gr.h;
                i6Var.k(0.3f, 430L, grVar);
                i6Var.u(AndroidUtilities.bold());
                i6Var.r(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A8, b6Var));
                i6Var.t(AndroidUtilities.dp(18.0f));
                i6Var.n(!LocaleController.isRTL);
                i6Var.setCallback(this);
                i6Var.G = AndroidUtilities.displaySize.x;
                org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(true, true, true, false);
                this.b = i6Var2;
                i6Var2.k(0.3f, 430L, grVar);
                i6Var2.r(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.B8, b6Var));
                i6Var2.t(AndroidUtilities.dp(14.0f));
                i6Var2.n(true ^ LocaleController.isRTL);
                i6Var2.setCallback(this);
                i6Var2.G = AndroidUtilities.displaySize.x;
                break;
            default:
                LinearLayout f10 = ll.f(context, 1);
                org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
                this.c = j6Var;
                int i10 = org.telegram.ui.ActionBar.f6.G6;
                j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
                j6Var.setTextSize(AndroidUtilities.dp(17.0f));
                j6Var.setTypeface(AndroidUtilities.bold());
                f10.addView(j6Var, g7.e6.q(-2, 23, 1));
                TextView textView = new TextView(context);
                this.b = textView;
                textView.setTextSize(1, 11.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                f10.addView(textView, g7.e6.q(-2, -2, 1));
                addView(f10, g7.e6.e(-2, -2, 17));
                break;
        }
    }

    private final void a(boolean z10) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y11 y11Var, Activity activity, z11 z11Var) {
        super(activity);
        this.a = 22;
        this.b = y11Var;
        Rect rect = new Rect();
        this.c = rect;
        y11Var.a.setColor(z11Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
        Drawable drawable = y11Var.f;
        drawable.setCallback(this);
        drawable.getPadding(rect);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(cp cpVar, Context context) {
        super(context);
        this.a = 11;
        this.b = cpVar;
        this.c = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ht htVar, Activity activity) {
        super(activity);
        this.a = 18;
        this.b = htVar;
        this.c = htVar;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(oc1 oc1Var, Context context, int i9) {
        super(context);
        this.a = i9;
        switch (i9) {
            case 28:
                this.b = oc1Var;
                super(context);
                this.c = new int[2];
                break;
            default:
                this.b = oc1Var;
                this.c = new Paint();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(uj0 uj0Var, Context context) {
        super(context);
        this.a = 15;
        this.b = uj0Var;
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context) {
        super(context);
        this.a = 10;
        this.c = new Path();
        this.b = new s10();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kh.d6 d6Var, Context context) {
        super(context);
        this.a = 4;
        this.b = d6Var;
        this.c = new Path();
    }
}
