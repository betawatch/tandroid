package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.tx;
import org.telegram.ui.Components.vo;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.a11;
import org.telegram.ui.ks;
import org.telegram.ui.kz0;
import org.telegram.ui.q11;
import org.telegram.ui.qu0;
import org.telegram.ui.rz0;
import org.telegram.ui.u01;
import org.telegram.ui.u50;
import org.telegram.ui.u71;
import org.telegram.ui.up0;
import org.telegram.ui.v01;
import org.telegram.ui.w01;
import org.telegram.ui.x90;
import org.telegram.ui.xr;
import org.telegram.ui.z10;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class x5 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.c = obj;
    }

    public void d(Canvas canvas) {
        ec0 ec0Var = (ec0) this.c;
        Drawable drawable = ec0Var.a;
        if (drawable == null) {
            super.onDraw(canvas);
        } else if ((drawable instanceof qa0) || (drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable)) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            ec0Var.a.draw(canvas);
        } else {
            float max = Math.max(getMeasuredWidth() / ec0Var.a.getIntrinsicWidth(), (getMeasuredHeight() + ec0Var.G) / ec0Var.a.getIntrinsicHeight());
            int ceil = (int) Math.ceil(ec0Var.a.getIntrinsicWidth() * max);
            int ceil2 = (int) Math.ceil(ec0Var.a.getIntrinsicHeight() * max);
            int measuredWidth = (getMeasuredWidth() - ceil) / 2;
            int measuredHeight = ((getMeasuredHeight() - ceil2) + ec0Var.G) / 2;
            ec0Var.a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
            ec0Var.a.draw(canvas);
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.b);
    }

    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        ?? r11;
        float f10;
        float f11;
        org.telegram.ui.Cells.y yVar;
        switch (this.a) {
            case 8:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.b;
                int i7 = org.telegram.ui.ActionBar.k6.a7;
                f6Var = ((org.telegram.ui.ActionBar.f2) ((org.telegram.ui.n5) this.c).d).resourceProvider;
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint);
                break;
            case 10:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.c;
                int measuredWidth = w0Var.getMeasuredWidth();
                int i10 = w0Var.e;
                float x10 = w0Var.getX();
                float f12 = w0Var.d;
                org.telegram.ui.ActionBar.f6 f6Var2 = w0Var.c;
                if (f6Var2 != null) {
                    f6Var2.b(x10, f12, measuredWidth, i10);
                } else {
                    org.telegram.ui.ActionBar.k6.r(x10, f12, measuredWidth, i10);
                }
                float L = org.telegram.messenger.g0.L(18.0f);
                float L2 = org.telegram.messenger.g0.L(18.0f);
                Paint d = f6Var2 != null ? f6Var2.d("paintChatActionBackground") : null;
                if (d == null) {
                    d = org.telegram.ui.ActionBar.k6.V0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, L, L2, d);
                if (f6Var2 != null ? f6Var2.g() : org.telegram.ui.ActionBar.k6.d1()) {
                    float L3 = org.telegram.messenger.g0.L(18.0f);
                    float L4 = org.telegram.messenger.g0.L(18.0f);
                    Paint d2 = f6Var2 != null ? f6Var2.d("paintChatActionBackgroundDarken") : null;
                    if (d2 == null) {
                        d2 = org.telegram.ui.ActionBar.k6.V0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, L3, L4, d2);
                }
                super.dispatchDraw(canvas);
                break;
            case 11:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, ((org.telegram.ui.rb) this.c).f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                break;
            case 12:
                float L5 = org.telegram.messenger.g0.L(20.0f);
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.b;
                path.rewind();
                path.addRoundRect(rectF2, L5, L5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF2, qs.e4, 31);
                super.dispatchDraw(canvas);
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), org.telegram.messenger.g0.L(6.0f) + getPaddingTop());
                h6.m mVar = (h6.m) this.c;
                mVar.m(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - org.telegram.messenger.g0.L(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                mVar.m(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                break;
            case 13:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.b;
                paint3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d7, ((vo) this.c).I0));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint3);
                break;
            case 14:
                tx txVar = (tx) this.c;
                if (!txVar.G.u0 && txVar.x > 0.0f) {
                    if (((Paint) this.b) == null) {
                        Paint paint4 = new Paint();
                        this.b = paint4;
                        paint4.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), qs.e4, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.b).setAlpha((int) (txVar.x * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), getMeasuredHeight(), (Paint) this.b);
                    canvas.restore();
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
                break;
            case 16:
                Paint paint5 = (Paint) this.b;
                ii0 ii0Var = (ii0) this.c;
                int i11 = ii0Var.M0;
                paint5.setColor((i11 == 1 || i11 == 2 || i11 == 4) ? i0.a.o(-1, 30) : i0.a.f(0.7f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, ii0Var.k0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, ii0Var.k0)));
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - org.telegram.messenger.g0.N(6.0f)) / 2.0f;
                float g10 = ii0Var.g();
                RectF rectF3 = org.telegram.messenger.g0.P;
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
            case 17:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.b;
                z10 z10Var = (z10) this.c;
                org.telegram.ui.Components.z8 z8Var = z10Var.J;
                TextView textView = z10Var.K;
                float f13 = z10Var.O;
                if (f13 == 1.0f) {
                    shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    z8Var.setTranslationX(0.0f);
                    textView.setTranslationX(0.0f);
                } else {
                    float interpolation = 1.0f - xq.f.getInterpolation(f13);
                    float left = (z10Var.P - getLeft()) * interpolation;
                    float left2 = (z10Var.Q - textView.getLeft()) * interpolation;
                    shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((z10Var.R - getRight()) * interpolation)), getMeasuredHeight());
                    z8Var.setTranslationX(left);
                    textView.setTranslationX(-left2);
                }
                shapeDrawable.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 18:
                RectF rectF4 = (RectF) this.c;
                rectF4.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) this.b;
                i1Var.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF4, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), i1Var.b());
                super.dispatchDraw(canvas);
                break;
            case 23:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                if (profileActivity.W4 != null) {
                    canvas.save();
                    canvas.translate(profileActivity.r.getX(), profileActivity.r.getY());
                    r11 = 1;
                    f10 = 0.0f;
                    f11 = 2.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.W4.getMeasuredWidth(), profileActivity.W4.getMeasuredHeight(), (int) ((1.0f - profileActivity.R1) * 255.0f), 31);
                    profileActivity.W4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    r11 = 1;
                    f10 = 0.0f;
                    f11 = 2.0f;
                }
                if (profileActivity.p5 && profileActivity.q6 != f10 && profileActivity.n5 != 1.0f) {
                    float measuredHeight2 = (profileActivity.r.getMeasuredHeight() / f11) + profileActivity.r.getY();
                    float L6 = org.telegram.messenger.g0.L(22.0f);
                    float x11 = ((profileActivity.r.getX() + (org.telegram.messenger.g0.L(28.0f) - profileActivity.o5)) - L6) - profileActivity.p4();
                    profileActivity.r5.y0(x11, measuredHeight2 - (L6 / f11), L6, L6);
                    profileActivity.r5.setAlpha(profileActivity.q6);
                    canvas.save();
                    float f14 = profileActivity.q6;
                    canvas.scale(f14, f14, profileActivity.r5.r(), profileActivity.r5.s());
                    profileActivity.r5.h(canvas, null);
                    canvas.restore();
                    if (profileActivity.n5 != f10) {
                        org.telegram.ui.Components.pc pcVar = (org.telegram.ui.Components.pc) this.b;
                        if (pcVar != null && (yVar = pcVar.e) != null) {
                            yVar.setState(StateSet.NOTHING);
                            yVar.jumpToCurrentState();
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Components.pc) this.b) == null) {
                            org.telegram.ui.Components.pc pcVar2 = new org.telegram.ui.Components.pc(this);
                            this.b = pcVar2;
                            pcVar2.h = new qu0(this, r11);
                        }
                        float L7 = (1.0f - profileActivity.n5) * org.telegram.messenger.g0.L(28.0f);
                        float textWidth = profileActivity.r.getTextWidth();
                        float max = Math.max(textWidth, profileActivity.S != null ? (org.telegram.messenger.g0.L(24.0f) + textWidth + org.telegram.messenger.g0.L(4.0f)) * profileActivity.S.getVisibilityFactor() : f10) + L7;
                        RectF rectF5 = org.telegram.messenger.g0.P;
                        rectF5.set(x11 - org.telegram.messenger.g0.L(4.0f), measuredHeight2 - org.telegram.messenger.g0.L(14.0f), x11 + max + org.telegram.messenger.g0.L(4.0f), measuredHeight2 + org.telegram.messenger.g0.L(14.0f));
                        org.telegram.ui.Components.pc pcVar3 = (org.telegram.ui.Components.pc) this.b;
                        pcVar3.i = false;
                        pcVar3.c = 0;
                        pcVar3.a(rectF5);
                        org.telegram.ui.Components.pc pcVar4 = (org.telegram.ui.Components.pc) this.b;
                        pcVar4.n = r11;
                        int o4 = i0.a.o(-1, 50);
                        pcVar4.g.setColor(0);
                        org.telegram.ui.Cells.y yVar2 = pcVar4.e;
                        if (yVar2 != null) {
                            org.telegram.ui.ActionBar.k6.H1(yVar2, o4, r11);
                        }
                        org.telegram.ui.Components.pc pcVar5 = (org.telegram.ui.Components.pc) this.b;
                        pcVar5.c(canvas, pcVar5.g);
                        org.telegram.ui.Cells.y yVar3 = pcVar5.e;
                        if (yVar3 != null) {
                            yVar3.draw(canvas);
                            break;
                        }
                    }
                }
                break;
            case 29:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.Wallet.y5) this.c).getClass();
                break;
            default:
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
                ch.b0 b0Var = (ch.b0) this.c;
                if (!b0Var.k) {
                    return true;
                }
                b0Var.d();
                return true;
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean z9) {
        switch (this.a) {
            case 3:
                break;
            default:
                super.dispatchSetPressed(z9);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 6:
                org.telegram.messenger.bb bbVar = (org.telegram.messenger.bb) ((a8.r7) this.c).c;
                return bbVar != null ? bbVar.b(motionEvent, new org.telegram.messenger.ia(this, 0)) : super.dispatchTouchEvent(motionEvent);
            case 7:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.c;
                org.telegram.ui.Cells.u9 n10 = g4Var.Q0.n(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (g4Var.Q0.x() && g4Var.Q0.n(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() != 0 || !g4Var.Q0.x() || (motionEvent.getY() >= linearLayout.getTop() && motionEvent.getY() <= linearLayout.getBottom())) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (g4Var.Q0.n(getContext()).onTouchEvent(obtain)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z9;
        switch (this.a) {
            case 4:
                Path path = (Path) this.b;
                fi.l5 l5Var = (fi.l5) this.c;
                if (l5Var.h == null || (!((z9 = l5Var.f) && view == l5Var.d) && (z9 || view != l5Var.c))) {
                    return super.drawChild(canvas, view, j3);
                }
                float measuredWidth = ((z9 ? l5Var.e : 1.0f - l5Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            case 20:
                if (view instanceof sb0) {
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 24:
                return view != ((SecretMediaViewer) this.b).x && super.drawChild(canvas, view, j3);
            case 25:
                Path path2 = (Path) this.b;
                rz0 rz0Var = (rz0) this.c;
                RectF rectF = rz0Var.R;
                if (view == rz0Var.N || view == rz0Var.y) {
                    canvas.save();
                    canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(rz0Var.T, 0.0f, rz0Var.s), getWidth(), org.telegram.messenger.g0.T1(rz0Var.U, getHeight(), rz0Var.s));
                    boolean drawChild2 = super.drawChild(canvas, view, j3);
                    canvas.restore();
                    return drawChild2;
                }
                if (view != rz0Var.P) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                path2.rewind();
                path2.addCircle(rectF.centerX() + rz0Var.N.getX(), rectF.centerY() + rz0Var.N.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(rz0Var.T, 0.0f, rz0Var.s), getWidth(), org.telegram.messenger.g0.T1(rz0Var.U, getHeight(), rz0Var.s));
                canvas.translate(-rz0Var.P.getX(), -rz0Var.P.getY());
                canvas.translate(rz0Var.N.getX() + rectF.left, rz0Var.N.getY() + rectF.top);
                canvas.scale(rectF.width() / rz0Var.P.getMeasuredWidth(), rectF.height() / rz0Var.P.getMeasuredHeight(), rz0Var.P.getX(), rz0Var.P.getY());
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild3;
            case 26:
                if (view != ((q11) this.c).h0 || !ch.e0.b || !ch.e0.f) {
                    return super.drawChild(canvas, view, j3);
                }
                for (int i7 = 0; i7 < ((q11) this.c).h0.getChildCount(); i7++) {
                    View childAt = ((q11) this.c).h0.getChildAt(i7);
                    if (childAt instanceof a11) {
                        a11 a11Var = (a11) childAt;
                        if (a11Var.getAnimatedScale() == 1.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            super.drawChild(canvas, view, j3);
                            canvas.restore();
                        } else if (a11Var.getAnimatedScale() > 0.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            ((Rect) this.b).set((int) (r2.centerX() - (a11Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f))), (int) (((Rect) this.b).centerY() - (a11Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f))), (int) ((a11Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f)) + ((Rect) this.b).centerX()), (int) ((a11Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f)) + ((Rect) this.b).centerY()));
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            canvas.scale(a11Var.getAnimatedScale(), a11Var.getAnimatedScale(), ((Rect) this.b).centerX(), ((Rect) this.b).centerY());
                            super.drawChild(canvas, view, j3);
                            canvas.restore();
                        }
                    } else if ((childAt instanceof TextView) || (childAt instanceof v01) || (childAt instanceof u01) || (childAt instanceof w01)) {
                        ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                        canvas.save();
                        canvas.clipRect((Rect) this.b);
                        super.drawChild(canvas, view, j3);
                        canvas.restore();
                    }
                }
                return false;
            case 29:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.c;
                if (view != y5Var.s0 || !y5Var.F) {
                    return super.drawChild(canvas, view, j3);
                }
                int save = canvas.save();
                canvas.concat(y5Var.I);
                boolean drawChild4 = super.drawChild(canvas, view, j3);
                canvas.restoreToCount(save);
                return drawChild4;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    public void e(int i7, CharSequence charSequence, boolean z9) {
        ImageView imageView = (ImageView) this.b;
        if (z9) {
            org.telegram.messenger.g0.R3(imageView, i7);
        } else {
            imageView.setImageResource(i7);
        }
        ((TextView) this.c).setText(charSequence);
        requestLayout();
    }

    public void f(float f10) {
        org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.b;
        j6Var.a();
        j6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(c8.j9.a(f10, 0.0f, 1.0f) * 100.0f))), !org.telegram.messenger.hd.a0, true);
        org.telegram.ui.r6 r6Var = (org.telegram.ui.r6) this.c;
        r6Var.c = f10;
        r6Var.invalidate();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        switch (this.a) {
            case 3:
                ch.b0 b0Var = (ch.b0) this.c;
                float f10 = b0Var.u;
                float f11 = rect.bottom;
                if (f10 != f11 && b0Var.v) {
                    b0Var.u = f11;
                    x5 x5Var = b0Var.c;
                    ch.a0 a0Var = b0Var.a;
                    if (!b0Var.q) {
                        float f12 = b0Var.t;
                        int L = org.telegram.messenger.g0.L(32.0f);
                        int i7 = b0Var.y;
                        if (i7 == 1 || i7 == 2) {
                            L = org.telegram.messenger.g0.L(24.0f);
                        }
                        float f13 = L;
                        if (a0Var.getMeasuredHeight() + f12 > (x5Var.getMeasuredHeight() - b0Var.u) - f13) {
                            f12 = ((x5Var.getMeasuredHeight() - b0Var.u) - a0Var.getMeasuredHeight()) - f13;
                        }
                        if (f12 < 0.0f) {
                            f12 = 0.0f;
                        }
                        a0Var.animate().translationY(f12).setDuration(250L).setUpdateListener(new ch.t(b0Var, 1)).setInterpolator(xq.f).start();
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
                org.telegram.ui.ActionBar.l0 l0Var = ((u71) this.c).u0;
                if (l0Var != null) {
                    l0Var.invalidate();
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
            case 2:
                super.onAttachedToWindow();
                ((ch.k) this.b).c();
                break;
            case 3:
                super.onAttachedToWindow();
                setTag(R.id.bulletin_delegate_tag, (ch.v) this.b);
                break;
            case 20:
                super.onAttachedToWindow();
                ks ksVar = (ks) this.c;
                ksVar.A.P();
                ksVar.B.P();
                break;
            case 23:
                super.onAttachedToWindow();
                ((ProfileActivity) this.c).r5.P();
                break;
            case 24:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.b).h.P();
                break;
            case 29:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((org.telegram.ui.Wallet.l5) this.b);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 2:
                super.onDetachedFromWindow();
                ((ch.k) this.b).d();
                break;
            case 3:
                super.onDetachedFromWindow();
                setTag(R.id.bulletin_delegate_tag, null);
                break;
            case 20:
                super.onDetachedFromWindow();
                ks ksVar = (ks) this.c;
                ksVar.A.R();
                ksVar.B.R();
                break;
            case 23:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.c).r5.R();
                break;
            case 24:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.b).h.R();
                break;
            case 29:
                getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Wallet.l5) this.b);
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
        float f10;
        Drawable drawable;
        float f11;
        switch (this.a) {
            case 15:
                d(canvas);
                ec0 ec0Var = (ec0) this.c;
                if (ec0Var.J != null && ec0Var.K != null && getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
                    ec0Var.J.eraseColor(0);
                    ec0Var.K.save();
                    ec0Var.K.scale(ec0Var.J.getWidth() / getMeasuredWidth(), ec0Var.J.getHeight() / getMeasuredHeight());
                    d(ec0Var.K);
                    ec0Var.K.restore();
                    ec0Var.I.d();
                    break;
                }
                break;
            case 19:
                canvas.save();
                org.telegram.ui.Components.voip.e2 e2Var = (org.telegram.ui.Components.voip.e2) this.c;
                canvas.scale(e2Var.b.getScaleX(), e2Var.b.getScaleY(), e2Var.b.getPivotX() + e2Var.b.getLeft(), e2Var.b.getPivotY() + e2Var.b.getTop());
                Drawable drawable2 = (Drawable) this.b;
                drawable2.setBounds(e2Var.b.getLeft() - org.telegram.messenger.g0.L(2.0f), e2Var.b.getTop() - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f) + e2Var.b.getRight(), org.telegram.messenger.g0.L(2.0f) + e2Var.b.getBottom());
                drawable2.draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                break;
            case 20:
                ks ksVar = (ks) this.b;
                Paint paint = ksVar.N;
                ImageReceiver imageReceiver = ksVar.B;
                ColorDrawable colorDrawable = ksVar.u;
                ImageReceiver imageReceiver2 = ksVar.A;
                if (ksVar.z != null && colorDrawable != null) {
                    if (ksVar.K && ksVar.v == null && ksVar.w != null && !ksVar.e0) {
                        ksVar.e0 = true;
                        imageReceiver2.O0(false, false);
                        jk0.d(new org.telegram.ui.a5(ksVar, 8));
                    }
                    if (ksVar.v != null) {
                        boolean z9 = ksVar.K;
                        if (z9) {
                            float f12 = ksVar.M;
                            if (f12 != 1.0f) {
                                float f13 = f12 + 0.13333334f;
                                ksVar.M = f13;
                                if (f13 > 1.0f) {
                                    ksVar.M = 1.0f;
                                }
                                ksVar.z.invalidate();
                                f11 = ksVar.M;
                                if (f11 != 0.0f && ksVar.v != null) {
                                    paint.setAlpha((int) (f11 * 255.0f));
                                    if (paint.getAlpha() != 255) {
                                        canvas.drawColor(org.telegram.ui.ActionBar.k6.r1(ksVar.M, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, ksVar.c0)));
                                    }
                                    canvas.drawPaint(paint);
                                }
                            }
                        }
                        if (!z9) {
                            float f14 = ksVar.M;
                            if (f14 != 0.0f) {
                                float f15 = f14 - 0.13333334f;
                                ksVar.M = f15;
                                if (f15 < 0.0f) {
                                    ksVar.M = 0.0f;
                                }
                                ksVar.z.invalidate();
                            }
                        }
                        f11 = ksVar.M;
                        if (f11 != 0.0f) {
                            paint.setAlpha((int) (f11 * 255.0f));
                            if (paint.getAlpha() != 255) {
                            }
                            canvas.drawPaint(paint);
                        }
                    }
                    colorDrawable.setAlpha((int) (ksVar.F * 180.0f));
                    colorDrawable.setBounds(0, 0, ksVar.z.getWidth(), ksVar.z.getHeight());
                    colorDrawable.draw(canvas);
                    canvas.save();
                    i0.b bVar = ksVar.q;
                    int i7 = bVar.d;
                    int i10 = bVar.b;
                    int i11 = i7 + i10;
                    if (ksVar.V == 1) {
                        min = Math.min(ksVar.z.getWidth(), ksVar.z.getHeight() - i11) - org.telegram.messenger.g0.L(40.0f);
                    } else {
                        min = (int) (ksVar.S ? Math.min(ksVar.z.getWidth(), ksVar.z.getHeight() - i11) - org.telegram.messenger.g0.N(40.0f) : Math.min(ksVar.z.getWidth(), ksVar.z.getHeight() - i11) / 1.8f);
                    }
                    float max = Math.max((min / 2) + i10 + (ksVar.G != null ? org.telegram.messenger.g0.L(40.0f) : 0), ((ksVar.z.getHeight() - i11) - ksVar.I) / 2);
                    if (ksVar.S) {
                        max += org.telegram.messenger.g0.L(40.0f);
                    }
                    canvas.translate(ksVar.z.getWidth() / 2, ksVar.e + max);
                    int i12 = (int) (min * ((ksVar.F * 0.8f) / 0.8f));
                    if (ksVar.V == 3) {
                        canvas.translate(0.0f, org.telegram.messenger.g0.L(70.0f));
                    }
                    if (ksVar.S) {
                        float f16 = i12;
                        float f17 = 0.6669f * f16;
                        f10 = 255.0f;
                        imageReceiver2.setAlpha(ksVar.F);
                        float f18 = f16 - f17;
                        float f19 = f16 / 2.0f;
                        imageReceiver2.y0((f18 - f19) - (0.0546875f * f16), (f18 / 2.0f) - f19, f17, f17);
                        imageReceiver2.h(canvas, null);
                        imageReceiver.setAlpha(ksVar.F);
                        float f20 = (-i12) / 2.0f;
                        imageReceiver.y0(f20, f20, f16, f16);
                        imageReceiver.h(canvas, null);
                    } else {
                        f10 = 255.0f;
                        imageReceiver2.setAlpha(ksVar.F);
                        float f21 = (-i12) / 2.0f;
                        float f22 = i12;
                        imageReceiver2.y0(f21, f21, f22, f22);
                        imageReceiver2.h(canvas, null);
                    }
                    if (ksVar.C != null) {
                        canvas.save();
                        float f23 = (-i12) / 2.0f;
                        canvas.translate(f23, f23);
                        float f24 = i12;
                        canvas.scale(f24 / ksVar.C.getWidth(), f24 / ksVar.C.getHeight());
                        ksVar.C.setAlpha(ksVar.F);
                        if (ksVar.D == null) {
                            ksVar.D = new Path();
                        }
                        ksVar.D.rewind();
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set(0.0f, 0.0f, ksVar.C.getWidth(), ksVar.C.getHeight());
                        float f25 = f24 / 8.0f;
                        ksVar.D.addRoundRect(rectF, f25, f25, Path.Direction.CW);
                        canvas.clipPath(ksVar.D);
                        ksVar.C.draw(canvas);
                        canvas.restore();
                    }
                    if (ksVar.V == 1 && !ksVar.m && (drawable = ksVar.J) != null) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = ksVar.J.getIntrinsicHeight();
                        int L = (int) (imageReceiver2.P0.top - org.telegram.messenger.g0.L(((ksVar.d / org.telegram.messenger.g0.L(60.0f)) * 6.0f) + 17.0f));
                        ksVar.J.setAlpha((int) ((1.0f - ksVar.g) * f10));
                        ksVar.J.setBounds((-intrinsicWidth) / 2, (-intrinsicHeight) + L, intrinsicWidth / 2, L);
                        ksVar.J.draw(canvas);
                    }
                    if (ksVar.G != null) {
                        if (ksVar.S) {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver.N0) / 2.0f) - org.telegram.messenger.g0.L(30.0f));
                        } else {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver2.N0) / 2.0f) - org.telegram.messenger.g0.L(30.0f));
                        }
                        ks.f0.setAlpha((int) (ksVar.F * f10));
                        ksVar.G.draw(canvas);
                    }
                    canvas.restore();
                    if (ksVar.E) {
                        if (ksVar.F != 1.0f) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j3 = currentTimeMillis - ksVar.H;
                            ksVar.H = currentTimeMillis;
                            ksVar.F = (j3 / 120.0f) + ksVar.F;
                            ksVar.z.invalidate();
                            if (ksVar.F > 1.0f) {
                                ksVar.F = 1.0f;
                                break;
                            }
                        }
                    } else if (ksVar.F != 0.0f) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long j10 = currentTimeMillis2 - ksVar.H;
                        ksVar.H = currentTimeMillis2;
                        ksVar.F -= j10 / 120.0f;
                        ksVar.z.invalidate();
                        if (ksVar.F < 0.0f) {
                            ksVar.F = 0.0f;
                        }
                        if (ksVar.F == 0.0f) {
                            imageReceiver2.w0(null);
                            org.telegram.messenger.g0.Q3(ksVar.w);
                            org.telegram.messenger.g0.h3(new xr(ksVar, 1));
                            Bitmap bitmap = ksVar.v;
                            if (bitmap != null) {
                                bitmap.recycle();
                                ksVar.v = null;
                            }
                            org.telegram.messenger.g0.Z3(ksVar.O, false, 1.0f, true, false);
                            ksVar.M = 0.0f;
                            try {
                                if (ksVar.y.getParent() != null) {
                                    ((WindowManager) ksVar.w.getSystemService("window")).removeView(ksVar.y);
                                    break;
                                }
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                                return;
                            }
                        }
                    }
                }
                break;
            case 24:
                SecretMediaViewer.b((SecretMediaViewer) this.b, canvas);
                break;
            case 27:
                int intrinsicHeight2 = org.telegram.ui.ActionBar.k6.i3.getIntrinsicHeight();
                org.telegram.ui.ActionBar.k6.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight2);
                org.telegram.ui.ActionBar.k6.i3.draw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(((u71) this.c).getThemedColor(org.telegram.ui.ActionBar.k6.Ge));
                canvas.drawRect(0.0f, intrinsicHeight2, getMeasuredWidth(), getMeasuredHeight(), paint2);
                break;
            case 28:
                int[] iArr = (int[]) this.b;
                u71 u71Var = (u71) this.c;
                if (!org.telegram.messenger.g0.D) {
                    getLocationInWindow(iArr);
                    if (u71Var.t0.getTranslationY() != iArr[1]) {
                        u71Var.t0.setTranslationY(-r0);
                        u71Var.u0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < u71Var.Q) {
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
        org.telegram.ui.Components.pc pcVar;
        switch (this.a) {
            case 6:
                org.telegram.messenger.bb bbVar = (org.telegram.messenger.bb) ((a8.r7) this.c).d;
                return bbVar != null ? bbVar.b(motionEvent, new org.telegram.messenger.ia(this, 1)) : super.onInterceptTouchEvent(motionEvent);
            case 23:
                return (((ProfileActivity) this.c).n5 == 0.0f && (pcVar = (org.telegram.ui.Components.pc) this.b) != null && pcVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 6:
                super.onLayout(z9, i7, i10, i11, i12);
                x90 x90Var = (x90) ((a8.r7) this.c).e;
                if (x90Var != null) {
                    x90Var.run();
                    break;
                }
                break;
            case 21:
                super.onLayout(z9, i7, i10, i11, i12);
                int i13 = (i12 - i10) / 4;
                int i14 = i13 * 3;
                int y10 = org.telegram.messenger.camera.q.y(275.0f, i14, 2);
                u50 u50Var = (u50) this.c;
                FrameLayout frameLayout = u50Var.r;
                frameLayout.layout(0, y10, frameLayout.getMeasuredWidth(), u50Var.r.getMeasuredHeight() + y10);
                int L = org.telegram.messenger.g0.L(139.0f) + org.telegram.messenger.g0.L(150.0f) + y10;
                int measuredWidth = (getMeasuredWidth() - u50Var.e.getMeasuredWidth()) / 2;
                org.telegram.ui.Components.ea eaVar = u50Var.e;
                eaVar.layout(measuredWidth, L, eaVar.getMeasuredWidth() + measuredWidth, u50Var.e.getMeasuredHeight() + L);
                c5.k kVar = u50Var.d;
                kVar.layout(0, 0, kVar.getMeasuredWidth(), u50Var.d.getMeasuredHeight());
                int measuredHeight = ((i13 - u50Var.n.getMeasuredHeight()) / 2) + i14;
                int measuredWidth2 = (getMeasuredWidth() - u50Var.n.getMeasuredWidth()) / 2;
                ei.k kVar2 = u50Var.n;
                kVar2.layout(measuredWidth2, measuredHeight, kVar2.getMeasuredWidth() + measuredWidth2, u50Var.n.getMeasuredHeight() + measuredHeight);
                int L2 = measuredHeight - org.telegram.messenger.g0.L(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - u50Var.f.getMeasuredWidth()) / 2;
                TextView textView = u50Var.f;
                textView.layout(measuredWidth3, L2 - textView.getMeasuredHeight(), u50Var.f.getMeasuredWidth() + measuredWidth3, L2);
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int L3 = org.telegram.messenger.g0.L(4) + (org.telegram.messenger.g0.Q1() ? 0 : org.telegram.messenger.g0.m);
                if (marginLayoutParams.topMargin != L3) {
                    marginLayoutParams.topMargin = L3;
                    frameLayout2.requestLayout();
                    break;
                }
                break;
            case 22:
                int L4 = org.telegram.messenger.g0.L(25.0f) + org.telegram.messenger.g0.L(150.0f) + org.telegram.messenger.camera.q.y(275.0f, ((i12 - i10) / 4) * 3, 2);
                int L5 = org.telegram.messenger.g0.L(18.0f);
                TextView textView2 = (TextView) this.b;
                textView2.layout(L5, L4, textView2.getMeasuredWidth() + L5, textView2.getMeasuredHeight() + L4);
                int L6 = org.telegram.messenger.g0.L(18.0f) + L4 + ((int) textView2.getTextSize());
                int L7 = org.telegram.messenger.g0.L(16.0f);
                TextView textView3 = (TextView) this.c;
                textView3.layout(L7, L6, textView3.getMeasuredWidth() + L7, textView3.getMeasuredHeight() + L6);
                break;
            case 23:
                super.onLayout(z9, i7, i10, i11, i12);
                ((ProfileActivity) this.c).q5();
                break;
            case 24:
                super.onLayout(z9, i7, i10, i11, i12);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                if (secretMediaViewer.n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + org.telegram.messenger.g0.m;
                    kz0 kz0Var = secretMediaViewer.n;
                    kz0Var.layout(kz0Var.getLeft(), currentActionBarHeight, secretMediaViewer.n.getRight(), secretMediaViewer.n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.r != null && secretMediaViewer.n != null) {
                    int measuredHeight2 = (secretMediaViewer.n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + org.telegram.messenger.g0.m)) - org.telegram.messenger.g0.L(10.0f);
                    fi.m3 m3Var = secretMediaViewer.r;
                    m3Var.layout(m3Var.getLeft(), measuredHeight2, secretMediaViewer.r.getRight(), secretMediaViewer.r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.Y != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
                    up0 up0Var = secretMediaViewer.Y;
                    up0Var.layout(up0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.Y.getRight(), secretMediaViewer.Y.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f;
                if (view != null) {
                    int i15 = i12 - i10;
                    view.layout(0, i15, i11 - i7, org.telegram.messenger.g0.n + i15);
                    break;
                }
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        int i11;
        boolean z9;
        int i12;
        float f10;
        float f11;
        float f12;
        StaticLayout staticLayout;
        switch (this.a) {
            case 1:
                int size = View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(8.0f);
                TextView textView = (TextView) this.c;
                CharSequence text = textView.getText();
                if (size > 0 && !TextUtils.isEmpty(text)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                    TextPaint textPaint = new TextPaint(textView.getPaint());
                    textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                    float measureText = textPaint.measureText(text, 0, text.length());
                    float f13 = size;
                    if (measureText > f13) {
                        textPaint.setTextSize(org.telegram.messenger.g0.L(11.0f));
                        String[] split = text.toString().split("\\s+");
                        int length = split.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= length) {
                                f11 = f13;
                                f12 = 12.0f;
                                i11 = 2;
                                z9 = true;
                                staticLayout = new StaticLayout(text, textPaint, size, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            } else if (textPaint.measureText(split[i13]) > f13) {
                                staticLayout = null;
                                f11 = f13;
                                f12 = 12.0f;
                                i11 = 2;
                                z9 = true;
                            } else {
                                i13++;
                            }
                        }
                        if (staticLayout == null || staticLayout.getLineCount() > i11) {
                            f10 = Math.max(8.0f, (f11 * f12) / measureText);
                            i12 = z9 ? 1 : 0;
                        } else {
                            i12 = i11;
                            f10 = 11.0f;
                        }
                    } else {
                        i11 = 2;
                        z9 = true;
                        i12 = 1;
                        f10 = 12.0f;
                    }
                    textView.setTextSize(z9 ? 1 : 0, f10);
                    textView.setMaxLines(i12);
                    textView.setSingleLine(i12 == z9 ? z9 ? 1 : 0 : false);
                    textView.setLineSpacing(0.0f, i12 == i11 ? 0.85f : 1.0f);
                    if (i12 == i11) {
                        z9 = false;
                    }
                    textView.setIncludeFontPadding(z9);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(i12 == i11 ? 29.0f : 35.0f);
                    ((FrameLayout.LayoutParams) ((ImageView) this.b).getLayoutParams()).topMargin = org.telegram.messenger.g0.L(i12 == i11 ? 4.0f : 8.0f);
                }
                super.onMeasure(i7, i10);
                break;
            case 5:
                ViewGroup viewGroup = (ViewGroup) this.b;
                jg.e eVar = (jg.e) this.c;
                if (!eVar.K || !eVar.J) {
                    int size2 = View.MeasureSpec.getSize(i10);
                    if (size2 == 0) {
                        size2 = viewGroup.getMeasuredHeight();
                    }
                    if (size2 == 0) {
                        size2 = (org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m;
                    }
                    int L = org.telegram.messenger.g0.L(50.0f);
                    int L2 = eVar.w != 0 ? 0 : org.telegram.messenger.g0.L(30.0f) + L;
                    if (!eVar.E && !eVar.x) {
                        L2 += L;
                    }
                    int paddingTop = (size2 - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(L2 < paddingTop ? paddingTop - L2 : 0, TLObject.FLAG_30));
                    break;
                } else {
                    super.onMeasure(i7, i10);
                    break;
                }
                break;
            case 7:
                super.onMeasure(i7, i10);
                super.onMeasure(i7, org.telegram.messenger.camera.q.B(8.0f, ((LinearLayout) this.b).getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 9:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(350.0f), TLObject.FLAG_30));
                break;
            case 13:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                break;
            case 24:
                super.onMeasure(i7, i10);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                up0 up0Var = secretMediaViewer.Y;
                if (up0Var != null) {
                    up0Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m) - (secretMediaViewer.S.getVisibility() != 0 ? 0 : secretMediaViewer.S.getMeasuredHeight()), TLObject.FLAG_30));
                }
                View view = secretMediaViewer.f;
                if (view != null) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.n, TLObject.FLAG_30));
                    break;
                }
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 15:
                ec0 ec0Var = (ec0) this.c;
                ri.b bVar = ec0Var.H;
                super.onSizeChanged(i7, i10, i11, i12);
                if (i7 > 0 && i10 > 0) {
                    ec0Var.J = Bitmap.createBitmap(54, Math.max(1, Math.round((i10 * 54) / i7)), Bitmap.Config.ARGB_8888);
                    ec0Var.K = new Canvas(ec0Var.J);
                    bVar.a(ec0Var.J);
                    bVar.b(i7, i10);
                    break;
                }
                break;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
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
        org.telegram.ui.Components.pc pcVar;
        switch (this.a) {
            case 23:
                return (((ProfileActivity) this.c).n5 == 0.0f && (pcVar = (org.telegram.ui.Components.pc) this.b) != null && pcVar.b(motionEvent)) || super.onTouchEvent(motionEvent);
            case 24:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                if (secretMediaViewer.k0 == 0 && secretMediaViewer.H0 == 0) {
                    if (motionEvent.getPointerCount() == 1 && secretMediaViewer.J0.onTouchEvent(motionEvent) && secretMediaViewer.Z0) {
                        secretMediaViewer.Z0 = false;
                        secretMediaViewer.Y0 = false;
                        secretMediaViewer.X0 = false;
                        secretMediaViewer.d(false);
                    } else if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                        secretMediaViewer.d1 = false;
                        wk0 wk0Var = secretMediaViewer.e1;
                        if (!wk0Var.q) {
                            wk0Var.a();
                        }
                        if (!secretMediaViewer.n0) {
                            if (motionEvent.getPointerCount() == 2) {
                                secretMediaViewer.L0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                secretMediaViewer.M0 = secretMediaViewer.w0;
                                secretMediaViewer.N0 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                                secretMediaViewer.O0 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                                secretMediaViewer.P0 = secretMediaViewer.u0;
                                secretMediaViewer.Q0 = secretMediaViewer.v0;
                                secretMediaViewer.X0 = true;
                                secretMediaViewer.Y0 = false;
                            } else if (motionEvent.getPointerCount() == 1) {
                                secretMediaViewer.R0 = motionEvent.getX();
                                float y10 = motionEvent.getY();
                                secretMediaViewer.S0 = y10;
                                secretMediaViewer.o0 = y10;
                                secretMediaViewer.n0 = false;
                                secretMediaViewer.b1 = true;
                            }
                        }
                    } else {
                        float f10 = 0.0f;
                        if (motionEvent.getActionMasked() == 2) {
                            if (motionEvent.getPointerCount() == 2 && !secretMediaViewer.n0 && secretMediaViewer.X0) {
                                secretMediaViewer.d1 = true;
                                secretMediaViewer.w0 = (((float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0))) / secretMediaViewer.L0) * secretMediaViewer.M0;
                                secretMediaViewer.u0 = org.telegram.messenger.camera.q.v(secretMediaViewer.w0, secretMediaViewer.M0, (secretMediaViewer.N0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.P0, secretMediaViewer.N0 - (secretMediaViewer.e.getWidth() / 2));
                                float height = secretMediaViewer.O0 - (secretMediaViewer.e.getHeight() / 2);
                                float height2 = (secretMediaViewer.O0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.Q0;
                                float f11 = secretMediaViewer.w0;
                                secretMediaViewer.v0 = org.telegram.messenger.camera.q.v(f11, secretMediaViewer.M0, height2, height);
                                secretMediaViewer.o(f11);
                                secretMediaViewer.e.invalidate();
                            } else if (motionEvent.getPointerCount() == 1) {
                                float abs = Math.abs(motionEvent.getX() - secretMediaViewer.R0);
                                float abs2 = Math.abs(motionEvent.getY() - secretMediaViewer.o0);
                                if (abs > org.telegram.messenger.g0.L(3.0f) || abs2 > org.telegram.messenger.g0.L(3.0f)) {
                                    secretMediaViewer.d1 = true;
                                }
                                if (secretMediaViewer.b1 && !secretMediaViewer.n0 && secretMediaViewer.w0 == 1.0f && abs2 >= org.telegram.messenger.g0.L(30.0f) && abs2 / 2.0f > abs) {
                                    secretMediaViewer.n0 = true;
                                    secretMediaViewer.Y0 = false;
                                    secretMediaViewer.o0 = motionEvent.getY();
                                    if (secretMediaViewer.i0) {
                                        secretMediaViewer.n(false, true);
                                    }
                                } else if (secretMediaViewer.n0) {
                                    secretMediaViewer.v0 = motionEvent.getY() - secretMediaViewer.o0;
                                    secretMediaViewer.e.invalidate();
                                } else if (secretMediaViewer.a1 || secretMediaViewer.H0 != 0) {
                                    secretMediaViewer.a1 = false;
                                    secretMediaViewer.R0 = motionEvent.getX();
                                    secretMediaViewer.S0 = motionEvent.getY();
                                } else {
                                    float x10 = secretMediaViewer.R0 - motionEvent.getX();
                                    float y11 = secretMediaViewer.S0 - motionEvent.getY();
                                    if (secretMediaViewer.Y0 || ((secretMediaViewer.w0 == 1.0f && Math.abs(y11) + org.telegram.messenger.g0.L(12.0f) < Math.abs(x10)) || secretMediaViewer.w0 != 1.0f)) {
                                        if (!secretMediaViewer.Y0) {
                                            secretMediaViewer.Y0 = true;
                                            secretMediaViewer.b1 = false;
                                            x10 = 0.0f;
                                            y11 = 0.0f;
                                        }
                                        secretMediaViewer.R0 = motionEvent.getX();
                                        secretMediaViewer.S0 = motionEvent.getY();
                                        secretMediaViewer.o(secretMediaViewer.w0);
                                        float f12 = secretMediaViewer.u0;
                                        if (f12 < secretMediaViewer.T0 || f12 > secretMediaViewer.U0) {
                                            x10 /= 3.0f;
                                        }
                                        float f13 = secretMediaViewer.W0;
                                        if (f13 == 0.0f) {
                                            float f14 = secretMediaViewer.V0;
                                            if (f14 == 0.0f) {
                                                float f15 = secretMediaViewer.v0 - y11;
                                                if (f15 < f14) {
                                                    secretMediaViewer.v0 = f14;
                                                } else {
                                                    if (f15 > f13) {
                                                        secretMediaViewer.v0 = f13;
                                                    }
                                                    f10 = y11;
                                                }
                                                secretMediaViewer.u0 = f12 - x10;
                                                if (secretMediaViewer.w0 != 1.0f) {
                                                    secretMediaViewer.v0 -= f10;
                                                }
                                                secretMediaViewer.e.invalidate();
                                            }
                                        }
                                        float f16 = secretMediaViewer.v0;
                                        if (f16 < secretMediaViewer.V0 || f16 > f13) {
                                            f10 = y11 / 3.0f;
                                            secretMediaViewer.u0 = f12 - x10;
                                            if (secretMediaViewer.w0 != 1.0f) {
                                            }
                                            secretMediaViewer.e.invalidate();
                                        }
                                        f10 = y11;
                                        secretMediaViewer.u0 = f12 - x10;
                                        if (secretMediaViewer.w0 != 1.0f) {
                                        }
                                        secretMediaViewer.e.invalidate();
                                    }
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                            if (secretMediaViewer.X0) {
                                secretMediaViewer.a1 = true;
                                float f17 = secretMediaViewer.w0;
                                if (f17 < 1.0f) {
                                    secretMediaViewer.o(1.0f);
                                    secretMediaViewer.c(1.0f, 0.0f, 0.0f, true);
                                } else if (f17 > 3.0f) {
                                    float v = org.telegram.messenger.camera.q.v(3.0f, secretMediaViewer.M0, (secretMediaViewer.N0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.P0, secretMediaViewer.N0 - (secretMediaViewer.e.getWidth() / 2));
                                    float v10 = org.telegram.messenger.camera.q.v(3.0f, secretMediaViewer.M0, (secretMediaViewer.O0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.Q0, secretMediaViewer.O0 - (secretMediaViewer.e.getHeight() / 2));
                                    secretMediaViewer.o(3.0f);
                                    float f18 = secretMediaViewer.T0;
                                    if (v >= f18) {
                                        f18 = secretMediaViewer.U0;
                                        break;
                                    }
                                    v = f18;
                                    float f19 = secretMediaViewer.V0;
                                    if (v10 >= f19) {
                                        f19 = secretMediaViewer.W0;
                                        break;
                                    }
                                    v10 = f19;
                                    secretMediaViewer.c(3.0f, v, v10, true);
                                } else {
                                    secretMediaViewer.d(true);
                                }
                                secretMediaViewer.X0 = false;
                            } else if (secretMediaViewer.n0) {
                                if (Math.abs(secretMediaViewer.o0 - motionEvent.getY()) > secretMediaViewer.e.getHeight() / 6.0f) {
                                    secretMediaViewer.e(true, false);
                                } else {
                                    secretMediaViewer.c(1.0f, 0.0f, 0.0f, false);
                                }
                                secretMediaViewer.n0 = false;
                            } else if (secretMediaViewer.Y0) {
                                float f20 = secretMediaViewer.u0;
                                float f21 = secretMediaViewer.v0;
                                secretMediaViewer.o(secretMediaViewer.w0);
                                secretMediaViewer.Y0 = false;
                                secretMediaViewer.b1 = true;
                                float f22 = secretMediaViewer.u0;
                                float f23 = secretMediaViewer.T0;
                                if (f22 >= f23) {
                                    f23 = secretMediaViewer.U0;
                                    break;
                                }
                                f20 = f23;
                                float f24 = secretMediaViewer.v0;
                                float f25 = secretMediaViewer.V0;
                                if (f24 >= f25) {
                                    f25 = secretMediaViewer.W0;
                                    break;
                                }
                                f21 = f25;
                                secretMediaViewer.c(secretMediaViewer.w0, f20, f21, false);
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
    public void setBackgroundColor(int i7) {
        switch (this.a) {
            case 15:
                ((Paint) this.b).setColor(i7);
                break;
            default:
                super.setBackgroundColor(i7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5(int i7, Context context, boolean z9) {
        super(context);
        this.a = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5(Object obj, Context context, Object obj2, int i7) {
        super(context);
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(org.telegram.ui.Cells.w0 w0Var, Context context) {
        super(context);
        this.a = 10;
        this.c = w0Var;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(ch.b0 b0Var, Context context) {
        super(context);
        this.a = 3;
        this.c = b0Var;
        this.b = new ch.v(this, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(org.telegram.ui.rb rbVar, Context context) {
        super(context);
        this.a = 11;
        this.c = rbVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(rz0 rz0Var, Context context) {
        super(context);
        this.a = 25;
        this.c = rz0Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(org.telegram.ui.n5 n5Var, Activity activity) {
        super(activity);
        this.a = 8;
        this.c = n5Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(ch.o oVar, Context context) {
        super(context);
        this.a = 2;
        this.c = oVar;
        this.b = new ch.k(this, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(Context context, org.telegram.ui.Components.voip.i1 i1Var) {
        super(context);
        this.a = 18;
        this.c = new RectF();
        this.b = i1Var;
        i1Var.a(this);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(org.telegram.messenger.hd.M0(2131743255, null));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(-1);
        textView2.setGravity(1);
        textView2.setText(org.telegram.messenger.hd.M0(2131743256, null));
        addView(textView, c8.ha.d(-1, -2.0f, 3, 0.0f, 24.0f, 0.0f, 0.0f));
        addView(textView2, c8.ha.d(-1, -2.0f, 3, 0.0f, 50.0f, 0.0f, 0.0f));
    }

    private final void c(boolean z9) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(a8.r7 r7Var, Context context) {
        super(context);
        this.a = 6;
        this.c = r7Var;
        m.q3 q3Var = new m.q3();
        q3Var.d = new cb.c(q3Var, 1);
        q3Var.g = new ArrayList();
        q3Var.e = this;
        q3Var.a = context;
        this.b = q3Var;
        setClickable(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(ec0 ec0Var, Context context) {
        super(context);
        this.a = 15;
        this.c = ec0Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(org.telegram.ui.Wallet.y5 y5Var, Context context) {
        super(context);
        this.a = 29;
        this.c = y5Var;
        this.b = new org.telegram.ui.Wallet.l5(0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(Context context, TextView textView, TextView textView2) {
        super(context);
        this.a = 22;
        this.b = textView;
        this.c = textView2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.a = 24;
        this.c = secretMediaViewer;
        this.b = secretMediaViewer;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(q11 q11Var, Context context) {
        super(context);
        this.a = 26;
        this.c = q11Var;
        this.b = new Rect();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(vo voVar, Context context) {
        super(context);
        this.a = 13;
        this.c = voVar;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(ks ksVar, Activity activity) {
        super(activity);
        this.a = 20;
        this.c = ksVar;
        this.b = ksVar;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(u71 u71Var, Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 28:
                this.c = u71Var;
                super(context);
                this.b = new int[2];
                break;
            default:
                this.c = u71Var;
                this.b = new Paint();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 12:
                super(context);
                this.b = new Path();
                this.c = new h6.m(28);
                break;
            default:
                ImageView imageView = new ImageView(context);
                this.b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                addView(imageView, c8.ha.d(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                addView(textView, c8.ha.d(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(ii0 ii0Var, Context context) {
        super(context);
        this.a = 16;
        this.c = ii0Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(fi.l5 l5Var, Context context) {
        super(context);
        this.a = 4;
        this.c = l5Var;
        this.b = new Path();
    }
}
