package ai;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
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
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
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
import b8.be;
import b8.ke;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ca;
import org.telegram.messenger.hs;
import org.telegram.messenger.ua;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.rx;
import org.telegram.ui.Components.vo;
import org.telegram.ui.Components.x8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.bz0;
import org.telegram.ui.g11;
import org.telegram.ui.is;
import org.telegram.ui.iz0;
import org.telegram.ui.k01;
import org.telegram.ui.l01;
import org.telegram.ui.m01;
import org.telegram.ui.mp0;
import org.telegram.ui.o50;
import org.telegram.ui.pb;
import org.telegram.ui.pu0;
import org.telegram.ui.q01;
import org.telegram.ui.u10;
import org.telegram.ui.u90;
import org.telegram.ui.vr;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c0 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i3, Context context, Object obj) {
        super(context);
        this.a = i3;
        this.c = obj;
    }

    public void d(Canvas canvas) {
        zb0 zb0Var = (zb0) this.c;
        Drawable drawable = zb0Var.a;
        if (drawable == null) {
            super.onDraw(canvas);
        } else if ((drawable instanceof la0) || (drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable)) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            zb0Var.a.draw(canvas);
        } else {
            float max = Math.max(getMeasuredWidth() / zb0Var.a.getIntrinsicWidth(), (getMeasuredHeight() + zb0Var.H) / zb0Var.a.getIntrinsicHeight());
            int ceil = (int) Math.ceil(zb0Var.a.getIntrinsicWidth() * max);
            int ceil2 = (int) Math.ceil(zb0Var.a.getIntrinsicHeight() * max);
            int measuredWidth = (getMeasuredWidth() - ceil) / 2;
            int measuredHeight = ((getMeasuredHeight() - ceil2) + zb0Var.H) / 2;
            zb0Var.a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
            zb0Var.a.draw(canvas);
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.e6 e6Var;
        ?? r10;
        float f10;
        float f11;
        org.telegram.ui.Cells.y yVar;
        switch (this.a) {
            case 9:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.b;
                int i3 = org.telegram.ui.ActionBar.k6.a7;
                e6Var = ((org.telegram.ui.ActionBar.d2) ((org.telegram.ui.p5) this.c).d).resourceProvider;
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint);
                break;
            case 10:
            case 16:
            case 19:
            case 21:
            case 22:
            case 23:
            case 24:
            case 26:
            case 27:
            case 28:
            default:
                super.dispatchDraw(canvas);
                break;
            case 11:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.c;
                int measuredWidth = w0Var.getMeasuredWidth();
                int i10 = w0Var.e;
                float x10 = w0Var.getX();
                float f12 = w0Var.d;
                org.telegram.ui.ActionBar.e6 e6Var2 = w0Var.c;
                if (e6Var2 != null) {
                    e6Var2.b(x10, f12, measuredWidth, i10);
                } else {
                    org.telegram.ui.ActionBar.k6.r(x10, f12, measuredWidth, i10);
                }
                float L = org.telegram.messenger.g0.L(18.0f);
                float L2 = org.telegram.messenger.g0.L(18.0f);
                Paint d = e6Var2 != null ? e6Var2.d("paintChatActionBackground") : null;
                if (d == null) {
                    d = org.telegram.ui.ActionBar.k6.V0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, L, L2, d);
                if (e6Var2 != null ? e6Var2.g() : org.telegram.ui.ActionBar.k6.d1()) {
                    float L3 = org.telegram.messenger.g0.L(18.0f);
                    float L4 = org.telegram.messenger.g0.L(18.0f);
                    Paint d10 = e6Var2 != null ? e6Var2.d("paintChatActionBackgroundDarken") : null;
                    if (d10 == null) {
                        d10 = org.telegram.ui.ActionBar.k6.V0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, L3, L4, d10);
                }
                super.dispatchDraw(canvas);
                break;
            case 12:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, ((pb) this.c).f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                break;
            case 13:
                float L5 = org.telegram.messenger.g0.L(20.0f);
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.b;
                path.rewind();
                path.addRoundRect(rectF2, L5, L5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF2, hs.e4, 31);
                super.dispatchDraw(canvas);
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), org.telegram.messenger.g0.L(6.0f) + getPaddingTop());
                k4.j jVar = (k4.j) this.c;
                jVar.w(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - org.telegram.messenger.g0.L(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                jVar.w(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                break;
            case 14:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.b;
                paint3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d7, ((vo) this.c).J0));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint3);
                break;
            case 15:
                rx rxVar = (rx) this.c;
                if (!rxVar.H.v0 && rxVar.x > 0.0f) {
                    if (((Paint) this.b) == null) {
                        Paint paint4 = new Paint();
                        this.b = paint4;
                        paint4.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), hs.e4, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.b).setAlpha((int) (rxVar.x * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), getMeasuredHeight(), (Paint) this.b);
                    canvas.restore();
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
                break;
            case 17:
                Paint paint5 = (Paint) this.b;
                li0 li0Var = (li0) this.c;
                int i11 = li0Var.N0;
                paint5.setColor((i11 == 1 || i11 == 2 || i11 == 4) ? i0.a.o(-1, 30) : i0.a.f(0.7f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, li0Var.l0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, li0Var.l0)));
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - org.telegram.messenger.g0.N(6.0f)) / 2.0f;
                float g7 = li0Var.g();
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(measuredWidth2 - measuredWidth3, (measuredHeight - measuredWidth3) - g7, measuredWidth2 + measuredWidth3, measuredHeight + measuredWidth3 + g7);
                canvas.save();
                canvas.scale(childAt.getScaleX(), childAt.getScaleY(), measuredWidth2, measuredHeight);
                canvas.drawRoundRect(rectF3, measuredWidth3, measuredWidth3, paint5);
                canvas.restore();
                canvas.save();
                canvas.translate(0.0f, g7);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            case 18:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.b;
                u10 u10Var = (u10) this.c;
                x8 x8Var = u10Var.K;
                TextView textView = u10Var.L;
                float f13 = u10Var.P;
                if (f13 == 1.0f) {
                    shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    x8Var.setTranslationX(0.0f);
                    textView.setTranslationX(0.0f);
                } else {
                    float interpolation = 1.0f - xq.f.getInterpolation(f13);
                    float left = (u10Var.Q - getLeft()) * interpolation;
                    float left2 = (u10Var.R - textView.getLeft()) * interpolation;
                    shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((u10Var.S - getRight()) * interpolation)), getMeasuredHeight());
                    x8Var.setTranslationX(left);
                    textView.setTranslationX(-left2);
                }
                shapeDrawable.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 20:
                RectF rectF4 = (RectF) this.c;
                rectF4.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.b;
                x0Var.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF4, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), x0Var.b());
                super.dispatchDraw(canvas);
                break;
            case 25:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                if (profileActivity.X4 != null) {
                    canvas.save();
                    canvas.translate(profileActivity.r.getX(), profileActivity.r.getY());
                    r10 = 0;
                    f10 = 0.0f;
                    f11 = 2.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.X4.getMeasuredWidth(), profileActivity.X4.getMeasuredHeight(), (int) ((1.0f - profileActivity.S1) * 255.0f), 31);
                    profileActivity.X4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    r10 = 0;
                    f10 = 0.0f;
                    f11 = 2.0f;
                }
                if (profileActivity.q5 && profileActivity.r6 != f10 && profileActivity.o5 != 1.0f) {
                    float measuredHeight2 = (profileActivity.r.getMeasuredHeight() / f11) + profileActivity.r.getY();
                    float L6 = org.telegram.messenger.g0.L(22.0f);
                    float x11 = ((profileActivity.r.getX() + (org.telegram.messenger.g0.L(28.0f) - profileActivity.p5)) - L6) - profileActivity.p4();
                    profileActivity.s5.y0(x11, measuredHeight2 - (L6 / f11), L6, L6);
                    profileActivity.s5.setAlpha(profileActivity.r6);
                    canvas.save();
                    float f14 = profileActivity.r6;
                    canvas.scale(f14, f14, profileActivity.s5.r(), profileActivity.s5.s());
                    profileActivity.s5.h(canvas, null);
                    canvas.restore();
                    if (profileActivity.o5 != f10) {
                        nc ncVar = (nc) this.b;
                        if (ncVar != null && (yVar = ncVar.e) != null) {
                            yVar.setState(StateSet.NOTHING);
                            yVar.jumpToCurrentState();
                            break;
                        }
                    } else {
                        if (((nc) this.b) == null) {
                            nc ncVar2 = new nc(this);
                            this.b = ncVar2;
                            ncVar2.h = new pu0(this, r10);
                        }
                        float L7 = (1.0f - profileActivity.o5) * org.telegram.messenger.g0.L(28.0f);
                        float textWidth = profileActivity.r.getTextWidth();
                        float max = Math.max(textWidth, profileActivity.T != null ? (org.telegram.messenger.g0.L(24.0f) + textWidth + org.telegram.messenger.g0.L(4.0f)) * profileActivity.T.getVisibilityFactor() : f10) + L7;
                        RectF rectF5 = org.telegram.messenger.g0.P;
                        rectF5.set(x11 - org.telegram.messenger.g0.L(4.0f), measuredHeight2 - org.telegram.messenger.g0.L(14.0f), x11 + max + org.telegram.messenger.g0.L(4.0f), measuredHeight2 + org.telegram.messenger.g0.L(14.0f));
                        nc ncVar3 = (nc) this.b;
                        ncVar3.i = r10;
                        ncVar3.c = r10;
                        ncVar3.a(rectF5);
                        nc ncVar4 = (nc) this.b;
                        ncVar4.n = true;
                        int o10 = i0.a.o(-1, 50);
                        ncVar4.g.setColor((int) r10);
                        org.telegram.ui.Cells.y yVar2 = ncVar4.e;
                        if (yVar2 != null) {
                            org.telegram.ui.ActionBar.k6.H1(yVar2, o10, true);
                        }
                        nc ncVar5 = (nc) this.b;
                        ncVar5.c(canvas, ncVar5.g);
                        org.telegram.ui.Cells.y yVar3 = ncVar5.e;
                        if (yVar3 != null) {
                            yVar3.draw(canvas);
                            break;
                        }
                    }
                }
                break;
            case 29:
                ImageReceiver imageReceiver = (ImageReceiver) this.b;
                imageReceiver.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.h(canvas, null);
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
                dh.a0 a0Var = (dh.a0) this.c;
                if (!a0Var.k) {
                    return true;
                }
                a0Var.d();
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
            case 7:
                ua uaVar = (ua) ((ke) this.c).c;
                return uaVar != null ? uaVar.b(motionEvent, new ca(this, 0)) : super.dispatchTouchEvent(motionEvent);
            case 8:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.c;
                t9 n4 = i4Var.R0.n(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (i4Var.R0.x() && i4Var.R0.n(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (n4.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() != 0 || !i4Var.R0.x() || (motionEvent.getY() >= linearLayout.getTop() && motionEvent.getY() <= linearLayout.getBottom())) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (i4Var.R0.n(getContext()).onTouchEvent(obtain)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            case 19:
                int action = motionEvent.getAction();
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) this.c;
                if (s0Var.K != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(s0Var.K.getX(), s0Var.K.getY());
                    boolean dispatchTouchEvent = s0Var.K.dispatchTouchEvent(motionEvent);
                    obtain2.recycle();
                    if (action == 1 || action == 3) {
                        s0Var.K = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = s0Var.G.onTouchEvent(obtain3);
                obtain3.recycle();
                boolean z10 = !s0Var.G.isInProgress() && ((GestureDetector) s0Var.H.a).onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    s0Var.I = false;
                    s0Var.J = false;
                    q1.g gVar = s0Var.T;
                    if (!gVar.f) {
                        float f10 = s0Var.R;
                        gVar.b = f10;
                        gVar.c = true;
                        gVar.m.i = (s0Var.N / 2.0f) + f10 >= ((float) org.telegram.messenger.g0.q.x) / 2.0f ? (r2 - r7) - org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(16.0f);
                        s0Var.T.h();
                    }
                    q1.g gVar2 = s0Var.U;
                    if (!gVar2.f) {
                        gVar2.b = s0Var.S;
                        gVar2.c = true;
                        gVar2.m.i = be.a(r2, org.telegram.messenger.g0.L(16.0f), (org.telegram.messenger.g0.q.y - s0Var.O) - org.telegram.messenger.g0.L(16.0f));
                        s0Var.U.h();
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
                gi.j5 j5Var = (gi.j5) this.c;
                if (j5Var.h == null || (!((z10 = j5Var.f) && view == j5Var.d) && (z10 || view != j5Var.c))) {
                    return super.drawChild(canvas, view, j10);
                }
                float measuredWidth = ((z10 ? j5Var.e : 1.0f - j5Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            case 22:
                if (view instanceof nb0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 26:
                return view != ((SecretMediaViewer) this.b).x && super.drawChild(canvas, view, j10);
            case 27:
                Path path2 = (Path) this.b;
                iz0 iz0Var = (iz0) this.c;
                RectF rectF = iz0Var.S;
                if (view == iz0Var.O || view == iz0Var.y) {
                    canvas.save();
                    canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(iz0Var.U, 0.0f, iz0Var.s), getWidth(), org.telegram.messenger.g0.T1(iz0Var.V, getHeight(), iz0Var.s));
                    boolean drawChild2 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild2;
                }
                if (view != iz0Var.Q) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                path2.rewind();
                path2.addCircle(rectF.centerX() + iz0Var.O.getX(), rectF.centerY() + iz0Var.O.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(iz0Var.U, 0.0f, iz0Var.s), getWidth(), org.telegram.messenger.g0.T1(iz0Var.V, getHeight(), iz0Var.s));
                canvas.translate(-iz0Var.Q.getX(), -iz0Var.Q.getY());
                canvas.translate(iz0Var.O.getX() + rectF.left, iz0Var.O.getY() + rectF.top);
                canvas.scale(rectF.width() / iz0Var.Q.getMeasuredWidth(), rectF.height() / iz0Var.Q.getMeasuredHeight(), iz0Var.Q.getX(), iz0Var.Q.getY());
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            case 28:
                if (view != ((g11) this.c).i0 || !dh.d0.b || !dh.d0.f) {
                    return super.drawChild(canvas, view, j10);
                }
                for (int i3 = 0; i3 < ((g11) this.c).i0.getChildCount(); i3++) {
                    View childAt = ((g11) this.c).i0.getChildAt(i3);
                    if (childAt instanceof q01) {
                        q01 q01Var = (q01) childAt;
                        if (q01Var.getAnimatedScale() == 1.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        } else if (q01Var.getAnimatedScale() > 0.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            ((Rect) this.b).set((int) (r2.centerX() - (q01Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f))), (int) (((Rect) this.b).centerY() - (q01Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f))), (int) ((q01Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f)) + ((Rect) this.b).centerX()), (int) ((q01Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f)) + ((Rect) this.b).centerY()));
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            canvas.scale(q01Var.getAnimatedScale(), q01Var.getAnimatedScale(), ((Rect) this.b).centerX(), ((Rect) this.b).centerY());
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        }
                    } else if ((childAt instanceof TextView) || (childAt instanceof l01) || (childAt instanceof k01) || (childAt instanceof m01)) {
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

    public void e(int i3, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.b;
        if (z10) {
            org.telegram.messenger.g0.R3(imageView, i3);
        } else {
            imageView.setImageResource(i3);
        }
        ((TextView) this.c).setText(charSequence);
        requestLayout();
    }

    public void f(float f10) {
        org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.b;
        h6Var.a();
        h6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(be.a(f10, 0.0f, 1.0f) * 100.0f))), !bd.a0, true);
        org.telegram.ui.s6 s6Var = (org.telegram.ui.s6) this.c;
        s6Var.c = f10;
        s6Var.invalidate();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        switch (this.a) {
            case 4:
                dh.a0 a0Var = (dh.a0) this.c;
                float f10 = a0Var.u;
                float f11 = rect.bottom;
                if (f10 != f11 && a0Var.v) {
                    a0Var.u = f11;
                    c0 c0Var = a0Var.c;
                    dh.z zVar = a0Var.a;
                    if (!a0Var.q) {
                        float f12 = a0Var.t;
                        int L = org.telegram.messenger.g0.L(32.0f);
                        int i3 = a0Var.y;
                        if (i3 == 1 || i3 == 2) {
                            L = org.telegram.messenger.g0.L(24.0f);
                        }
                        float f13 = L;
                        if (zVar.getMeasuredHeight() + f12 > (c0Var.getMeasuredHeight() - a0Var.u) - f13) {
                            f12 = ((c0Var.getMeasuredHeight() - a0Var.u) - zVar.getMeasuredHeight()) - f13;
                        }
                        if (f12 < 0.0f) {
                            f12 = 0.0f;
                        }
                        zVar.animate().translationY(f12).setDuration(250L).setUpdateListener(new dh.t(a0Var, 1)).setInterpolator(xq.f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 3:
                super.onAttachedToWindow();
                ((dh.k) this.b).c();
                break;
            case 4:
                super.onAttachedToWindow();
                setTag(R.id.bulletin_delegate_tag, (h1) this.b);
                break;
            case 22:
                super.onAttachedToWindow();
                is isVar = (is) this.c;
                isVar.A.P();
                isVar.B.P();
                break;
            case 25:
                super.onAttachedToWindow();
                ((ProfileActivity) this.c).s5.P();
                break;
            case 26:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.b).h.P();
                break;
            case 29:
                super.onAttachedToWindow();
                ((ImageReceiver) this.b).P();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.a) {
            case 19:
                org.telegram.messenger.g0.v(getContext(), configuration);
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) this.c;
                org.telegram.messenger.g0.y3(s0Var.b, s0Var.d, s0Var.c);
                s0Var.a(false);
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
                ((dh.k) this.b).d();
                break;
            case 4:
                super.onDetachedFromWindow();
                setTag(R.id.bulletin_delegate_tag, null);
                break;
            case 22:
                super.onDetachedFromWindow();
                is isVar = (is) this.c;
                isVar.A.R();
                isVar.B.R();
                break;
            case 25:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.c).s5.R();
                break;
            case 26:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.b).h.R();
                break;
            case 29:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.b).R();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
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
            case 16:
                d(canvas);
                zb0 zb0Var = (zb0) this.c;
                if (zb0Var.K != null && zb0Var.L != null && getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
                    zb0Var.K.eraseColor(0);
                    zb0Var.L.save();
                    zb0Var.L.scale(zb0Var.K.getWidth() / getMeasuredWidth(), zb0Var.K.getHeight() / getMeasuredHeight());
                    d(zb0Var.L);
                    zb0Var.L.restore();
                    zb0Var.J.d();
                    break;
                }
                break;
            case 21:
                canvas.save();
                org.telegram.ui.Components.voip.u1 u1Var = (org.telegram.ui.Components.voip.u1) this.c;
                canvas.scale(u1Var.b.getScaleX(), u1Var.b.getScaleY(), u1Var.b.getPivotX() + u1Var.b.getLeft(), u1Var.b.getPivotY() + u1Var.b.getTop());
                Drawable drawable2 = (Drawable) this.b;
                drawable2.setBounds(u1Var.b.getLeft() - org.telegram.messenger.g0.L(2.0f), u1Var.b.getTop() - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f) + u1Var.b.getRight(), org.telegram.messenger.g0.L(2.0f) + u1Var.b.getBottom());
                drawable2.draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                break;
            case 22:
                is isVar = (is) this.b;
                Paint paint = isVar.N;
                ImageReceiver imageReceiver = isVar.B;
                ColorDrawable colorDrawable = isVar.u;
                ImageReceiver imageReceiver2 = isVar.A;
                if (isVar.z != null && colorDrawable != null) {
                    if (isVar.K && isVar.v == null && isVar.w != null && !isVar.e0) {
                        isVar.e0 = true;
                        imageReceiver2.O0(false, false);
                        nk0.d(new org.telegram.ui.c5(isVar, 8));
                    }
                    if (isVar.v != null) {
                        boolean z10 = isVar.K;
                        if (z10) {
                            float f12 = isVar.M;
                            if (f12 != 1.0f) {
                                float f13 = f12 + 0.13333334f;
                                isVar.M = f13;
                                if (f13 > 1.0f) {
                                    isVar.M = 1.0f;
                                }
                                isVar.z.invalidate();
                                f11 = isVar.M;
                                if (f11 != 0.0f && isVar.v != null) {
                                    paint.setAlpha((int) (f11 * 255.0f));
                                    if (paint.getAlpha() != 255) {
                                        canvas.drawColor(org.telegram.ui.ActionBar.k6.r1(isVar.M, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, isVar.c0)));
                                    }
                                    canvas.drawPaint(paint);
                                }
                            }
                        }
                        if (!z10) {
                            float f14 = isVar.M;
                            if (f14 != 0.0f) {
                                float f15 = f14 - 0.13333334f;
                                isVar.M = f15;
                                if (f15 < 0.0f) {
                                    isVar.M = 0.0f;
                                }
                                isVar.z.invalidate();
                            }
                        }
                        f11 = isVar.M;
                        if (f11 != 0.0f) {
                            paint.setAlpha((int) (f11 * 255.0f));
                            if (paint.getAlpha() != 255) {
                            }
                            canvas.drawPaint(paint);
                        }
                    }
                    colorDrawable.setAlpha((int) (isVar.F * 180.0f));
                    colorDrawable.setBounds(0, 0, isVar.z.getWidth(), isVar.z.getHeight());
                    colorDrawable.draw(canvas);
                    canvas.save();
                    i0.b bVar = isVar.q;
                    int i3 = bVar.d;
                    int i10 = bVar.b;
                    int i11 = i3 + i10;
                    if (isVar.V == 1) {
                        min = Math.min(isVar.z.getWidth(), isVar.z.getHeight() - i11) - org.telegram.messenger.g0.L(40.0f);
                    } else {
                        min = (int) (isVar.S ? Math.min(isVar.z.getWidth(), isVar.z.getHeight() - i11) - org.telegram.messenger.g0.N(40.0f) : Math.min(isVar.z.getWidth(), isVar.z.getHeight() - i11) / 1.8f);
                    }
                    float max = Math.max((min / 2) + i10 + (isVar.G != null ? org.telegram.messenger.g0.L(40.0f) : 0), ((isVar.z.getHeight() - i11) - isVar.I) / 2);
                    if (isVar.S) {
                        max += org.telegram.messenger.g0.L(40.0f);
                    }
                    canvas.translate(isVar.z.getWidth() / 2, isVar.e + max);
                    int i12 = (int) (min * ((isVar.F * 0.8f) / 0.8f));
                    if (isVar.V == 3) {
                        canvas.translate(0.0f, org.telegram.messenger.g0.L(70.0f));
                    }
                    if (isVar.S) {
                        float f16 = i12;
                        float f17 = 0.6669f * f16;
                        f10 = 255.0f;
                        imageReceiver2.setAlpha(isVar.F);
                        float f18 = f16 - f17;
                        float f19 = f16 / 2.0f;
                        imageReceiver2.y0((f18 - f19) - (0.0546875f * f16), (f18 / 2.0f) - f19, f17, f17);
                        imageReceiver2.h(canvas, null);
                        imageReceiver.setAlpha(isVar.F);
                        float f20 = (-i12) / 2.0f;
                        imageReceiver.y0(f20, f20, f16, f16);
                        imageReceiver.h(canvas, null);
                    } else {
                        f10 = 255.0f;
                        imageReceiver2.setAlpha(isVar.F);
                        float f21 = (-i12) / 2.0f;
                        float f22 = i12;
                        imageReceiver2.y0(f21, f21, f22, f22);
                        imageReceiver2.h(canvas, null);
                    }
                    if (isVar.C != null) {
                        canvas.save();
                        float f23 = (-i12) / 2.0f;
                        canvas.translate(f23, f23);
                        float f24 = i12;
                        canvas.scale(f24 / isVar.C.getWidth(), f24 / isVar.C.getHeight());
                        isVar.C.setAlpha(isVar.F);
                        if (isVar.D == null) {
                            isVar.D = new Path();
                        }
                        isVar.D.rewind();
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set(0.0f, 0.0f, isVar.C.getWidth(), isVar.C.getHeight());
                        float f25 = f24 / 8.0f;
                        isVar.D.addRoundRect(rectF, f25, f25, Path.Direction.CW);
                        canvas.clipPath(isVar.D);
                        isVar.C.draw(canvas);
                        canvas.restore();
                    }
                    if (isVar.V == 1 && !isVar.m && (drawable = isVar.J) != null) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = isVar.J.getIntrinsicHeight();
                        int L = (int) (imageReceiver2.Q0.top - org.telegram.messenger.g0.L(((isVar.d / org.telegram.messenger.g0.L(60.0f)) * 6.0f) + 17.0f));
                        isVar.J.setAlpha((int) ((1.0f - isVar.g) * f10));
                        isVar.J.setBounds((-intrinsicWidth) / 2, (-intrinsicHeight) + L, intrinsicWidth / 2, L);
                        isVar.J.draw(canvas);
                    }
                    if (isVar.G != null) {
                        if (isVar.S) {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver.O0) / 2.0f) - org.telegram.messenger.g0.L(30.0f));
                        } else {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver2.O0) / 2.0f) - org.telegram.messenger.g0.L(30.0f));
                        }
                        is.f0.setAlpha((int) (isVar.F * f10));
                        isVar.G.draw(canvas);
                    }
                    canvas.restore();
                    if (isVar.E) {
                        if (isVar.F != 1.0f) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j10 = currentTimeMillis - isVar.H;
                            isVar.H = currentTimeMillis;
                            isVar.F = (j10 / 120.0f) + isVar.F;
                            isVar.z.invalidate();
                            if (isVar.F > 1.0f) {
                                isVar.F = 1.0f;
                                break;
                            }
                        }
                    } else if (isVar.F != 0.0f) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long j11 = currentTimeMillis2 - isVar.H;
                        isVar.H = currentTimeMillis2;
                        isVar.F -= j11 / 120.0f;
                        isVar.z.invalidate();
                        if (isVar.F < 0.0f) {
                            isVar.F = 0.0f;
                        }
                        if (isVar.F == 0.0f) {
                            imageReceiver2.w0(null);
                            org.telegram.messenger.g0.Q3(isVar.w);
                            org.telegram.messenger.g0.h3(new vr(isVar, 1));
                            Bitmap bitmap = isVar.v;
                            if (bitmap != null) {
                                bitmap.recycle();
                                isVar.v = null;
                            }
                            org.telegram.messenger.g0.Z3(isVar.O, false, 1.0f, true, false);
                            isVar.M = 0.0f;
                            try {
                                if (isVar.y.getParent() != null) {
                                    ((WindowManager) isVar.w.getSystemService("window")).removeView(isVar.y);
                                    break;
                                }
                            } catch (Exception e10) {
                                a8.g(e10, true);
                                return;
                            }
                        }
                    }
                }
                break;
            case 26:
                SecretMediaViewer.b((SecretMediaViewer) this.b, canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        nc ncVar;
        switch (this.a) {
            case 7:
                ua uaVar = (ua) ((ke) this.c).d;
                return uaVar != null ? uaVar.b(motionEvent, new ca(this, 1)) : super.onInterceptTouchEvent(motionEvent);
            case 25:
                return (((ProfileActivity) this.c).o5 == 0.0f && (ncVar = (nc) this.b) != null && ncVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 7:
                super.onLayout(z10, i3, i10, i11, i12);
                u90 u90Var = (u90) ((ke) this.c).e;
                if (u90Var != null) {
                    u90Var.run();
                    break;
                }
                break;
            case 23:
                super.onLayout(z10, i3, i10, i11, i12);
                int i13 = (i12 - i10) / 4;
                int i14 = i13 * 3;
                int y9 = org.telegram.messenger.camera.q.y(275.0f, i14, 2);
                o50 o50Var = (o50) this.c;
                FrameLayout frameLayout = o50Var.r;
                frameLayout.layout(0, y9, frameLayout.getMeasuredWidth(), o50Var.r.getMeasuredHeight() + y9);
                int L = org.telegram.messenger.g0.L(139.0f) + org.telegram.messenger.g0.L(150.0f) + y9;
                int measuredWidth = (getMeasuredWidth() - o50Var.e.getMeasuredWidth()) / 2;
                da daVar = o50Var.e;
                daVar.layout(measuredWidth, L, daVar.getMeasuredWidth() + measuredWidth, o50Var.e.getMeasuredHeight() + L);
                b5.l lVar = o50Var.d;
                lVar.layout(0, 0, lVar.getMeasuredWidth(), o50Var.d.getMeasuredHeight());
                int measuredHeight = ((i13 - o50Var.n.getMeasuredHeight()) / 2) + i14;
                int measuredWidth2 = (getMeasuredWidth() - o50Var.n.getMeasuredWidth()) / 2;
                fi.j jVar = o50Var.n;
                jVar.layout(measuredWidth2, measuredHeight, jVar.getMeasuredWidth() + measuredWidth2, o50Var.n.getMeasuredHeight() + measuredHeight);
                int L2 = measuredHeight - org.telegram.messenger.g0.L(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - o50Var.f.getMeasuredWidth()) / 2;
                TextView textView = o50Var.f;
                textView.layout(measuredWidth3, L2 - textView.getMeasuredHeight(), o50Var.f.getMeasuredWidth() + measuredWidth3, L2);
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int L3 = org.telegram.messenger.g0.L(4) + (org.telegram.messenger.g0.Q1() ? 0 : org.telegram.messenger.g0.m);
                if (marginLayoutParams.topMargin != L3) {
                    marginLayoutParams.topMargin = L3;
                    frameLayout2.requestLayout();
                    break;
                }
                break;
            case 24:
                int L4 = org.telegram.messenger.g0.L(25.0f) + org.telegram.messenger.g0.L(150.0f) + org.telegram.messenger.camera.q.y(275.0f, ((i12 - i10) / 4) * 3, 2);
                int L5 = org.telegram.messenger.g0.L(18.0f);
                TextView textView2 = (TextView) this.c;
                textView2.layout(L5, L4, textView2.getMeasuredWidth() + L5, textView2.getMeasuredHeight() + L4);
                int L6 = org.telegram.messenger.g0.L(18.0f) + L4 + ((int) textView2.getTextSize());
                int L7 = org.telegram.messenger.g0.L(16.0f);
                TextView textView3 = (TextView) this.b;
                textView3.layout(L7, L6, textView3.getMeasuredWidth() + L7, textView3.getMeasuredHeight() + L6);
                break;
            case 25:
                super.onLayout(z10, i3, i10, i11, i12);
                ((ProfileActivity) this.c).q5();
                break;
            case 26:
                super.onLayout(z10, i3, i10, i11, i12);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                if (secretMediaViewer.n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + org.telegram.messenger.g0.m;
                    bz0 bz0Var = secretMediaViewer.n;
                    bz0Var.layout(bz0Var.getLeft(), currentActionBarHeight, secretMediaViewer.n.getRight(), secretMediaViewer.n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.r != null && secretMediaViewer.n != null) {
                    int measuredHeight2 = (secretMediaViewer.n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + org.telegram.messenger.g0.m)) - org.telegram.messenger.g0.L(10.0f);
                    gi.l3 l3Var = secretMediaViewer.r;
                    l3Var.layout(l3Var.getLeft(), measuredHeight2, secretMediaViewer.r.getRight(), secretMediaViewer.r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.Z != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
                    mp0 mp0Var = secretMediaViewer.Z;
                    mp0Var.layout(mp0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.Z.getRight(), secretMediaViewer.Z.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f;
                if (view != null) {
                    int i15 = i12 - i10;
                    view.layout(0, i15, i11 - i3, org.telegram.messenger.g0.n + i15);
                    break;
                }
                break;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        int i11;
        boolean z10;
        int i12;
        float f10;
        float f11;
        float f12;
        StaticLayout staticLayout;
        switch (this.a) {
            case 2:
                int size = View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(8.0f);
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
                                z10 = true;
                                staticLayout = new StaticLayout(text, textPaint, size, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            } else if (textPaint.measureText(split[i13]) > f13) {
                                staticLayout = null;
                                f11 = f13;
                                f12 = 12.0f;
                                i11 = 2;
                                z10 = true;
                            } else {
                                i13++;
                            }
                        }
                        if (staticLayout == null || staticLayout.getLineCount() > i11) {
                            f10 = Math.max(8.0f, (f11 * f12) / measureText);
                            i12 = z10 ? 1 : 0;
                        } else {
                            i12 = i11;
                            f10 = 11.0f;
                        }
                    } else {
                        i11 = 2;
                        z10 = true;
                        i12 = 1;
                        f10 = 12.0f;
                    }
                    textView.setTextSize(z10 ? 1 : 0, f10);
                    textView.setMaxLines(i12);
                    textView.setSingleLine(i12 == z10 ? z10 ? 1 : 0 : false);
                    textView.setLineSpacing(0.0f, i12 == i11 ? 0.85f : 1.0f);
                    if (i12 == i11) {
                        z10 = false;
                    }
                    textView.setIncludeFontPadding(z10);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(i12 == i11 ? 29.0f : 35.0f);
                    ((FrameLayout.LayoutParams) ((ImageView) this.b).getLayoutParams()).topMargin = org.telegram.messenger.g0.L(i12 == i11 ? 4.0f : 8.0f);
                }
                super.onMeasure(i3, i10);
                break;
            case 6:
                ViewGroup viewGroup = (ViewGroup) this.b;
                kg.e eVar = (kg.e) this.c;
                if (!eVar.L || !eVar.K) {
                    int size2 = View.MeasureSpec.getSize(i10);
                    if (size2 == 0) {
                        size2 = viewGroup.getMeasuredHeight();
                    }
                    if (size2 == 0) {
                        size2 = (org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m;
                    }
                    int L = org.telegram.messenger.g0.L(50.0f);
                    int L2 = eVar.w != 0 ? 0 : org.telegram.messenger.g0.L(30.0f) + L;
                    if (!eVar.F && !eVar.x) {
                        L2 += L;
                    }
                    int paddingTop = (size2 - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(L2 < paddingTop ? paddingTop - L2 : 0, TLObject.FLAG_30));
                    break;
                } else {
                    super.onMeasure(i3, i10);
                    break;
                }
                break;
            case 8:
                super.onMeasure(i3, i10);
                super.onMeasure(i3, org.telegram.messenger.camera.q.B(8.0f, ((LinearLayout) this.b).getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(350.0f), TLObject.FLAG_30));
                break;
            case 14:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                break;
            case 26:
                super.onMeasure(i3, i10);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                mp0 mp0Var = secretMediaViewer.Z;
                if (mp0Var != null) {
                    mp0Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m) - (secretMediaViewer.T.getVisibility() != 0 ? 0 : secretMediaViewer.T.getMeasuredHeight()), TLObject.FLAG_30));
                }
                View view = secretMediaViewer.f;
                if (view != null) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.n, TLObject.FLAG_30));
                    break;
                }
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 16:
                zb0 zb0Var = (zb0) this.c;
                si.b bVar = zb0Var.I;
                super.onSizeChanged(i3, i10, i11, i12);
                if (i3 > 0 && i10 > 0) {
                    zb0Var.K = Bitmap.createBitmap(54, Math.max(1, Math.round((i10 * 54) / i3)), Bitmap.Config.ARGB_8888);
                    zb0Var.L = new Canvas(zb0Var.K);
                    bVar.a(zb0Var.K);
                    bVar.b(i3, i10);
                    break;
                }
                break;
            case 19:
                super.onSizeChanged(i3, i10, i11, i12);
                Path path = (Path) this.b;
                path.rewind();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, i3, i10);
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), Path.Direction.CW);
                break;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
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
        nc ncVar;
        switch (this.a) {
            case 25:
                return (((ProfileActivity) this.c).o5 == 0.0f && (ncVar = (nc) this.b) != null && ncVar.b(motionEvent)) || super.onTouchEvent(motionEvent);
            case 26:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                if (secretMediaViewer.l0 == 0 && secretMediaViewer.I0 == 0) {
                    if (motionEvent.getPointerCount() == 1 && secretMediaViewer.K0.onTouchEvent(motionEvent) && secretMediaViewer.a1) {
                        secretMediaViewer.a1 = false;
                        secretMediaViewer.Z0 = false;
                        secretMediaViewer.Y0 = false;
                        secretMediaViewer.d(false);
                    } else if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                        secretMediaViewer.e1 = false;
                        al0 al0Var = secretMediaViewer.f1;
                        if (!al0Var.q) {
                            al0Var.a();
                        }
                        if (!secretMediaViewer.o0) {
                            if (motionEvent.getPointerCount() == 2) {
                                secretMediaViewer.M0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                secretMediaViewer.N0 = secretMediaViewer.x0;
                                secretMediaViewer.O0 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                                secretMediaViewer.P0 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                                secretMediaViewer.Q0 = secretMediaViewer.v0;
                                secretMediaViewer.R0 = secretMediaViewer.w0;
                                secretMediaViewer.Y0 = true;
                                secretMediaViewer.Z0 = false;
                            } else if (motionEvent.getPointerCount() == 1) {
                                secretMediaViewer.S0 = motionEvent.getX();
                                float y9 = motionEvent.getY();
                                secretMediaViewer.T0 = y9;
                                secretMediaViewer.p0 = y9;
                                secretMediaViewer.o0 = false;
                                secretMediaViewer.c1 = true;
                            }
                        }
                    } else {
                        float f10 = 0.0f;
                        if (motionEvent.getActionMasked() == 2) {
                            if (motionEvent.getPointerCount() == 2 && !secretMediaViewer.o0 && secretMediaViewer.Y0) {
                                secretMediaViewer.e1 = true;
                                secretMediaViewer.x0 = (((float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0))) / secretMediaViewer.M0) * secretMediaViewer.N0;
                                secretMediaViewer.v0 = org.telegram.messenger.camera.q.v(secretMediaViewer.x0, secretMediaViewer.N0, (secretMediaViewer.O0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.Q0, secretMediaViewer.O0 - (secretMediaViewer.e.getWidth() / 2));
                                float height = secretMediaViewer.P0 - (secretMediaViewer.e.getHeight() / 2);
                                float height2 = (secretMediaViewer.P0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.R0;
                                float f11 = secretMediaViewer.x0;
                                secretMediaViewer.w0 = org.telegram.messenger.camera.q.v(f11, secretMediaViewer.N0, height2, height);
                                secretMediaViewer.o(f11);
                                secretMediaViewer.e.invalidate();
                            } else if (motionEvent.getPointerCount() == 1) {
                                float abs = Math.abs(motionEvent.getX() - secretMediaViewer.S0);
                                float abs2 = Math.abs(motionEvent.getY() - secretMediaViewer.p0);
                                if (abs > org.telegram.messenger.g0.L(3.0f) || abs2 > org.telegram.messenger.g0.L(3.0f)) {
                                    secretMediaViewer.e1 = true;
                                }
                                if (secretMediaViewer.c1 && !secretMediaViewer.o0 && secretMediaViewer.x0 == 1.0f && abs2 >= org.telegram.messenger.g0.L(30.0f) && abs2 / 2.0f > abs) {
                                    secretMediaViewer.o0 = true;
                                    secretMediaViewer.Z0 = false;
                                    secretMediaViewer.p0 = motionEvent.getY();
                                    if (secretMediaViewer.j0) {
                                        secretMediaViewer.n(false, true);
                                    }
                                } else if (secretMediaViewer.o0) {
                                    secretMediaViewer.w0 = motionEvent.getY() - secretMediaViewer.p0;
                                    secretMediaViewer.e.invalidate();
                                } else if (secretMediaViewer.b1 || secretMediaViewer.I0 != 0) {
                                    secretMediaViewer.b1 = false;
                                    secretMediaViewer.S0 = motionEvent.getX();
                                    secretMediaViewer.T0 = motionEvent.getY();
                                } else {
                                    float x10 = secretMediaViewer.S0 - motionEvent.getX();
                                    float y10 = secretMediaViewer.T0 - motionEvent.getY();
                                    if (secretMediaViewer.Z0 || ((secretMediaViewer.x0 == 1.0f && Math.abs(y10) + org.telegram.messenger.g0.L(12.0f) < Math.abs(x10)) || secretMediaViewer.x0 != 1.0f)) {
                                        if (!secretMediaViewer.Z0) {
                                            secretMediaViewer.Z0 = true;
                                            secretMediaViewer.c1 = false;
                                            x10 = 0.0f;
                                            y10 = 0.0f;
                                        }
                                        secretMediaViewer.S0 = motionEvent.getX();
                                        secretMediaViewer.T0 = motionEvent.getY();
                                        secretMediaViewer.o(secretMediaViewer.x0);
                                        float f12 = secretMediaViewer.v0;
                                        if (f12 < secretMediaViewer.U0 || f12 > secretMediaViewer.V0) {
                                            x10 /= 3.0f;
                                        }
                                        float f13 = secretMediaViewer.X0;
                                        if (f13 == 0.0f) {
                                            float f14 = secretMediaViewer.W0;
                                            if (f14 == 0.0f) {
                                                float f15 = secretMediaViewer.w0 - y10;
                                                if (f15 < f14) {
                                                    secretMediaViewer.w0 = f14;
                                                } else {
                                                    if (f15 > f13) {
                                                        secretMediaViewer.w0 = f13;
                                                    }
                                                    f10 = y10;
                                                }
                                                secretMediaViewer.v0 = f12 - x10;
                                                if (secretMediaViewer.x0 != 1.0f) {
                                                    secretMediaViewer.w0 -= f10;
                                                }
                                                secretMediaViewer.e.invalidate();
                                            }
                                        }
                                        float f16 = secretMediaViewer.w0;
                                        if (f16 < secretMediaViewer.W0 || f16 > f13) {
                                            f10 = y10 / 3.0f;
                                            secretMediaViewer.v0 = f12 - x10;
                                            if (secretMediaViewer.x0 != 1.0f) {
                                            }
                                            secretMediaViewer.e.invalidate();
                                        }
                                        f10 = y10;
                                        secretMediaViewer.v0 = f12 - x10;
                                        if (secretMediaViewer.x0 != 1.0f) {
                                        }
                                        secretMediaViewer.e.invalidate();
                                    }
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                            if (secretMediaViewer.Y0) {
                                secretMediaViewer.b1 = true;
                                float f17 = secretMediaViewer.x0;
                                if (f17 < 1.0f) {
                                    secretMediaViewer.o(1.0f);
                                    secretMediaViewer.c(1.0f, 0.0f, 0.0f, true);
                                } else if (f17 > 3.0f) {
                                    float v = org.telegram.messenger.camera.q.v(3.0f, secretMediaViewer.N0, (secretMediaViewer.O0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.Q0, secretMediaViewer.O0 - (secretMediaViewer.e.getWidth() / 2));
                                    float v10 = org.telegram.messenger.camera.q.v(3.0f, secretMediaViewer.N0, (secretMediaViewer.P0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.R0, secretMediaViewer.P0 - (secretMediaViewer.e.getHeight() / 2));
                                    secretMediaViewer.o(3.0f);
                                    float f18 = secretMediaViewer.U0;
                                    if (v >= f18) {
                                        f18 = secretMediaViewer.V0;
                                        break;
                                    }
                                    v = f18;
                                    float f19 = secretMediaViewer.W0;
                                    if (v10 >= f19) {
                                        f19 = secretMediaViewer.X0;
                                        break;
                                    }
                                    v10 = f19;
                                    secretMediaViewer.c(3.0f, v, v10, true);
                                } else {
                                    secretMediaViewer.d(true);
                                }
                                secretMediaViewer.Y0 = false;
                            } else if (secretMediaViewer.o0) {
                                if (Math.abs(secretMediaViewer.p0 - motionEvent.getY()) > secretMediaViewer.e.getHeight() / 6.0f) {
                                    secretMediaViewer.e(true, false);
                                } else {
                                    secretMediaViewer.c(1.0f, 0.0f, 0.0f, false);
                                }
                                secretMediaViewer.o0 = false;
                            } else if (secretMediaViewer.Z0) {
                                float f20 = secretMediaViewer.v0;
                                float f21 = secretMediaViewer.w0;
                                secretMediaViewer.o(secretMediaViewer.x0);
                                secretMediaViewer.Z0 = false;
                                secretMediaViewer.c1 = true;
                                float f22 = secretMediaViewer.v0;
                                float f23 = secretMediaViewer.U0;
                                if (f22 >= f23) {
                                    f23 = secretMediaViewer.V0;
                                    break;
                                }
                                f20 = f23;
                                float f24 = secretMediaViewer.w0;
                                float f25 = secretMediaViewer.W0;
                                if (f24 >= f25) {
                                    f25 = secretMediaViewer.X0;
                                    break;
                                }
                                f21 = f25;
                                secretMediaViewer.c(secretMediaViewer.x0, f20, f21, false);
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
    public void setBackgroundColor(int i3) {
        switch (this.a) {
            case 16:
                ((Paint) this.b).setColor(i3);
                break;
            default:
                super.setBackgroundColor(i3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i3, Context context, boolean z10) {
        super(context);
        this.a = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj, Context context, Object obj2, int i3) {
        super(context);
        this.a = i3;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(org.telegram.ui.Cells.w0 w0Var, Context context) {
        super(context);
        this.a = 11;
        this.c = w0Var;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(dh.a0 a0Var, Context context) {
        super(context);
        this.a = 4;
        this.c = a0Var;
        this.b = new h1(this, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(pb pbVar, Context context) {
        super(context);
        this.a = 12;
        this.c = pbVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(iz0 iz0Var, Context context) {
        super(context);
        this.a = 27;
        this.c = iz0Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(org.telegram.ui.p5 p5Var, Activity activity) {
        super(activity);
        this.a = 9;
        this.c = p5Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(dh.o oVar, Context context) {
        super(context);
        this.a = 3;
        this.c = oVar;
        this.b = new dh.k(this, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Context context, org.telegram.ui.Components.voip.x0 x0Var) {
        super(context);
        this.a = 20;
        this.c = new RectF();
        this.b = x0Var;
        x0Var.a(this);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(bd.M0(2131743264, null));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(-1);
        textView2.setGravity(1);
        textView2.setText(bd.M0(2131743265, null));
        addView(textView, mf.d(-1, -2.0f, 3, 0.0f, 24.0f, 0.0f, 0.0f));
        addView(textView2, mf.d(-1, -2.0f, 3, 0.0f, 50.0f, 0.0f, 0.0f));
    }

    private final void c(boolean z10) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(org.telegram.ui.Components.voip.s0 s0Var, Context context) {
        super(context);
        this.a = 19;
        this.c = s0Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(ke keVar, Context context) {
        super(context);
        this.a = 7;
        this.c = keVar;
        m.o3 o3Var = new m.o3();
        o3Var.d = new z6.c(o3Var);
        o3Var.g = new ArrayList();
        o3Var.e = this;
        o3Var.a = context;
        this.b = o3Var;
        setClickable(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(zb0 zb0Var, Context context) {
        super(context);
        this.a = 16;
        this.c = zb0Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Context context, TextView textView, TextView textView2) {
        super(context);
        this.a = 24;
        this.c = textView;
        this.b = textView2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.a = 26;
        this.c = secretMediaViewer;
        this.b = secretMediaViewer;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(g11 g11Var, Context context) {
        super(context);
        this.a = 28;
        this.c = g11Var;
        this.b = new Rect();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = 0;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.b = h6Var;
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.Z(h6Var, i3, e6Var);
        h6Var.setTextSize(org.telegram.messenger.g0.L(17.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(h6Var, mf.r(-2, 23, 1));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i3, e6Var);
        textView.setSingleLine();
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f10.addView(textView, mf.r(-2, -2, 1));
        addView(f10, mf.e(-2, -2, 17));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(vo voVar, Context context) {
        super(context);
        this.a = 14;
        this.c = voVar;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(is isVar, Activity activity) {
        super(activity);
        this.a = 22;
        this.c = isVar;
        this.b = isVar;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Context context, int i3) {
        super(context);
        this.a = i3;
        switch (i3) {
            case 13:
                super(context);
                this.b = new Path();
                this.c = new k4.j(24);
                break;
            default:
                ImageView imageView = new ImageView(context);
                this.b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                addView(imageView, mf.d(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                addView(textView, mf.d(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(li0 li0Var, Context context) {
        super(context);
        this.a = 17;
        this.c = li0Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(gi.j5 j5Var, Context context) {
        super(context);
        this.a = 5;
        this.c = j5Var;
        this.b = new Path();
    }
}
