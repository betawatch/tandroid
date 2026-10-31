package fg;

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
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
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
import bi.j6;
import java.util.ArrayList;
import jg.p0;
import kg.i1;
import kg.k1;
import m.p3;
import m2.t;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bb;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.ja;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.m0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.voip.s0;
import org.telegram.ui.Components.voip.t1;
import org.telegram.ui.Components.voip.x0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.Wallet.b6;
import org.telegram.ui.Wallet.n5;
import org.telegram.ui.a11;
import org.telegram.ui.cb0;
import org.telegram.ui.fr0;
import org.telegram.ui.h4;
import org.telegram.ui.i11;
import org.telegram.ui.i31;
import org.telegram.ui.lt;
import org.telegram.ui.m21;
import org.telegram.ui.m5;
import org.telegram.ui.m91;
import org.telegram.ui.n21;
import org.telegram.ui.o21;
import org.telegram.ui.r6;
import org.telegram.ui.s21;
import org.telegram.ui.s60;
import org.telegram.ui.ws;
import org.telegram.ui.wv0;
import org.telegram.ui.xb;
import org.telegram.ui.y20;
import org.telegram.ui.z4;
import rf.w;
import sg.e0;
import vh.p2;
import w7.u;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    public void c(Canvas canvas) {
        zc0 zc0Var = (zc0) this.c;
        Drawable drawable = zc0Var.a;
        if (drawable == null) {
            super.onDraw(canvas);
        } else if ((drawable instanceof jb0) || (drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable)) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            zc0Var.a.draw(canvas);
        } else {
            float max = Math.max(getMeasuredWidth() / zc0Var.a.getIntrinsicWidth(), (getMeasuredHeight() + zc0Var.G) / zc0Var.a.getIntrinsicHeight());
            int ceil = (int) Math.ceil(zc0Var.a.getIntrinsicWidth() * max);
            int ceil2 = (int) Math.ceil(zc0Var.a.getIntrinsicHeight() * max);
            int measuredWidth = (getMeasuredWidth() - ceil) / 2;
            int measuredHeight = ((getMeasuredHeight() - ceil2) + zc0Var.G) / 2;
            zc0Var.a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
            zc0Var.a.draw(canvas);
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.b);
    }

    public void d(float f7) {
        f6 f6Var = (f6) this.b;
        f6Var.a();
        f6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(u.a(f7, 0.0f, 1.0f) * 100.0f))), !cd.X, true);
        r6 r6Var = (r6) this.c;
        r6Var.c = f7;
        r6Var.invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        p6 p6Var;
        float f7;
        boolean z10;
        ?? r14;
        float f10;
        float f11;
        y yVar;
        int i10 = 3;
        switch (this.a) {
            case 1:
                w wVar = (w) this.c;
                wVar.b(t6.r1(0.65f, t6.w0(t6.d6, (p6) this.b)));
                wVar.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 3:
                ((k1) this.b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = i0.P;
                rectF.set(0.0f, i0.L(2.0f), getMeasuredWidth(), i0.L(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                k1 k1Var = (k1) this.b;
                k1Var.f.setAlpha(((i1) this.c).B1);
                canvas.drawRoundRect(rectF, i0.L(24.0f) - 1, i0.L(24.0f) - 1, k1Var.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 6:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.b;
                int i11 = t6.a7;
                p6Var = ((k2) ((m5) this.c).d).resourceProvider;
                paint.setColor(t6.w0(i11, p6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint);
                break;
            case 8:
                RectF rectF2 = (RectF) this.b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                v0 v0Var = (v0) this.c;
                int measuredWidth = v0Var.getMeasuredWidth();
                int i12 = v0Var.e;
                float x10 = v0Var.getX();
                float f12 = v0Var.d;
                p6 p6Var2 = v0Var.c;
                if (p6Var2 != null) {
                    p6Var2.b(x10, f12, measuredWidth, i12);
                } else {
                    t6.r(x10, f12, measuredWidth, i12);
                }
                float L = i0.L(18.0f);
                float L2 = i0.L(18.0f);
                Paint d = p6Var2 != null ? p6Var2.d("paintChatActionBackground") : null;
                if (d == null) {
                    d = t6.V0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF2, L, L2, d);
                if (p6Var2 != null ? p6Var2.g() : t6.d1()) {
                    float L3 = i0.L(18.0f);
                    float L4 = i0.L(18.0f);
                    Paint d10 = p6Var2 != null ? p6Var2.d("paintChatActionBackgroundDarken") : null;
                    if (d10 == null) {
                        d10 = t6.V0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF2, L3, L4, d10);
                }
                super.dispatchDraw(canvas);
                break;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(t6.w0(t6.a7, ((xb) this.c).f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                break;
            case 10:
                float L5 = i0.L(20.0f);
                RectF rectF3 = i0.P;
                rectF3.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.b;
                path.rewind();
                path.addRoundRect(rectF3, L5, L5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF3, zs.e4, 31);
                super.dispatchDraw(canvas);
                rectF3.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), i0.L(6.0f) + getPaddingTop());
                li.k kVar = (li.k) this.c;
                kVar.o(canvas, rectF3, 1, 1.0f);
                rectF3.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - i0.L(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                kVar.o(canvas, rectF3, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                break;
            case 11:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.b;
                paint3.setColor(t6.w0(t6.d7, ((dp) this.c).I0));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint3);
                break;
            case 12:
                iy iyVar = (iy) this.c;
                if (!iyVar.G.u0 && iyVar.x > 0.0f) {
                    if (((Paint) this.b) == null) {
                        Paint paint4 = new Paint();
                        this.b = paint4;
                        paint4.setShader(new LinearGradient(0.0f, 0.0f, i0.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), zs.e4, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.b).setAlpha((int) (iyVar.x * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, i0.L(18.0f), getMeasuredHeight(), (Paint) this.b);
                    canvas.restore();
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
            case 14:
                Paint paint5 = (Paint) this.b;
                mj0 mj0Var = (mj0) this.c;
                int i13 = mj0Var.M0;
                paint5.setColor((i13 == 1 || i13 == 2 || i13 == 4) ? i0.b.o(-1, 30) : i0.b.f(0.7f, t6.w0(t6.F8, mj0Var.k0), t6.w0(t6.h5, mj0Var.k0)));
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - i0.N(6.0f)) / 2.0f;
                float g10 = mj0Var.g();
                RectF rectF4 = i0.P;
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
            case 15:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.b;
                y20 y20Var = (y20) this.c;
                u8 u8Var = y20Var.J;
                TextView textView = y20Var.K;
                float f13 = y20Var.O;
                if (f13 == 1.0f) {
                    shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    u8Var.setTranslationX(0.0f);
                    textView.setTranslationX(0.0f);
                } else {
                    float interpolation = 1.0f - gr.f.getInterpolation(f13);
                    float left = (y20Var.P - getLeft()) * interpolation;
                    float left2 = (y20Var.Q - textView.getLeft()) * interpolation;
                    shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((y20Var.R - getRight()) * interpolation)), getMeasuredHeight());
                    u8Var.setTranslationX(left);
                    textView.setTranslationX(-left2);
                }
                shapeDrawable.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 17:
                RectF rectF5 = (RectF) this.c;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                x0 x0Var = (x0) this.b;
                x0Var.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF5, i0.L(28.0f), i0.L(28.0f), x0Var.b());
                super.dispatchDraw(canvas);
                break;
            case 22:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                if (profileActivity.W4 != null) {
                    canvas.save();
                    canvas.translate(profileActivity.r.getX(), profileActivity.r.getY());
                    r14 = 0;
                    f7 = 1.0f;
                    z10 = true;
                    f10 = 28.0f;
                    f11 = 2.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.W4.getMeasuredWidth(), profileActivity.W4.getMeasuredHeight(), (int) ((1.0f - profileActivity.R1) * 255.0f), 31);
                    profileActivity.W4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    f7 = 1.0f;
                    z10 = true;
                    r14 = 0;
                    f10 = 28.0f;
                    f11 = 2.0f;
                }
                if (profileActivity.p5 && profileActivity.p6 != 0.0f && profileActivity.n5 != f7) {
                    float measuredHeight2 = (profileActivity.r.getMeasuredHeight() / f11) + profileActivity.r.getY();
                    float L6 = i0.L(22.0f);
                    float x11 = ((profileActivity.r.getX() + (i0.L(f10) - profileActivity.o5)) - L6) - profileActivity.o4();
                    profileActivity.r5.y0(x11, measuredHeight2 - (L6 / f11), L6, L6);
                    profileActivity.r5.setAlpha(profileActivity.p6);
                    canvas.save();
                    float f14 = profileActivity.p6;
                    canvas.scale(f14, f14, profileActivity.r5.r(), profileActivity.r5.s());
                    profileActivity.r5.h(canvas, null);
                    canvas.restore();
                    if (profileActivity.n5 != 0.0f) {
                        jc jcVar = (jc) this.b;
                        if (jcVar != null && (yVar = jcVar.e) != null) {
                            yVar.setState(StateSet.NOTHING);
                            yVar.jumpToCurrentState();
                            break;
                        }
                    } else {
                        if (((jc) this.b) == null) {
                            jc jcVar2 = new jc(this);
                            this.b = jcVar2;
                            jcVar2.h = new wv0(this, i10);
                        }
                        float L7 = (f7 - profileActivity.n5) * i0.L(f10);
                        float textWidth = profileActivity.r.getTextWidth();
                        float max = Math.max(textWidth, profileActivity.S != null ? profileActivity.S.getVisibilityFactor() * (i0.L(24.0f) + textWidth + i0.L(4.0f)) : 0.0f) + L7;
                        RectF rectF6 = i0.P;
                        rectF6.set(x11 - i0.L(4.0f), measuredHeight2 - i0.L(14.0f), x11 + max + i0.L(4.0f), measuredHeight2 + i0.L(14.0f));
                        jc jcVar3 = (jc) this.b;
                        jcVar3.i = r14;
                        jcVar3.c = r14;
                        jcVar3.a(rectF6);
                        jc jcVar4 = (jc) this.b;
                        jcVar4.n = z10;
                        int o10 = i0.b.o(-1, 50);
                        jcVar4.g.setColor((int) r14);
                        y yVar2 = jcVar4.e;
                        if (yVar2 != null) {
                            t6.H1(yVar2, o10, z10);
                        }
                        jc jcVar5 = (jc) this.b;
                        jcVar5.c(canvas, jcVar5.g);
                        y yVar3 = jcVar5.e;
                        if (yVar3 != null) {
                            yVar3.draw(canvas);
                            break;
                        }
                    }
                }
                break;
            case 26:
                ImageReceiver imageReceiver = (ImageReceiver) this.b;
                imageReceiver.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.h(canvas, null);
                super.dispatchDraw(canvas);
                break;
            case 29:
                super.dispatchDraw(canvas);
                ((b6) this.c).getClass();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 4:
                bb bbVar = (bb) ((bh.d) this.c).b;
                return bbVar != null ? bbVar.c(motionEvent, new ja(this, 0)) : super.dispatchTouchEvent(motionEvent);
            case 5:
                h4 h4Var = (h4) this.c;
                v9 n10 = h4Var.Q0.n(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (h4Var.Q0.x() && h4Var.Q0.n(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() != 0 || !h4Var.Q0.x() || (motionEvent.getY() >= linearLayout.getTop() && motionEvent.getY() <= linearLayout.getBottom())) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (h4Var.Q0.n(getContext()).onTouchEvent(obtain)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            case 16:
                int action = motionEvent.getAction();
                s0 s0Var = (s0) this.c;
                if (s0Var.J != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(s0Var.J.getX(), s0Var.J.getY());
                    boolean dispatchTouchEvent = s0Var.J.dispatchTouchEvent(motionEvent);
                    obtain2.recycle();
                    if (action == 1 || action == 3) {
                        s0Var.J = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = s0Var.F.onTouchEvent(obtain3);
                obtain3.recycle();
                boolean z10 = !s0Var.F.isInProgress() && ((GestureDetector) s0Var.G.b).onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    s0Var.H = false;
                    s0Var.I = false;
                    o1.j jVar = s0Var.S;
                    if (!jVar.f) {
                        float f7 = s0Var.Q;
                        jVar.b = f7;
                        jVar.c = true;
                        jVar.m.i = (s0Var.M / 2.0f) + f7 >= ((float) i0.q.x) / 2.0f ? (r2 - r7) - i0.L(16.0f) : i0.L(16.0f);
                        s0Var.S.h();
                    }
                    o1.j jVar2 = s0Var.T;
                    if (!jVar2.f) {
                        jVar2.b = s0Var.R;
                        jVar2.c = true;
                        jVar2.m.i = u.a(r2, i0.L(16.0f), (i0.q.y - s0Var.N) - i0.L(16.0f));
                        s0Var.T.h();
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
                p0 p0Var = (p0) this.c;
                if (p0Var.h == null || (!((z10 = p0Var.f) && view == p0Var.d) && (z10 || view != p0Var.c))) {
                    return super.drawChild(canvas, view, j10);
                }
                float measuredWidth = ((z10 ? p0Var.e : 1.0f - p0Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            case 19:
                if (view instanceof lc0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 23:
                return view != ((SecretMediaViewer) this.b).x && super.drawChild(canvas, view, j10);
            case 24:
                Path path2 = (Path) this.b;
                i11 i11Var = (i11) this.c;
                RectF rectF = i11Var.R;
                if (view == i11Var.N || view == i11Var.y) {
                    canvas.save();
                    canvas.clipRect(0.0f, i0.T1(i11Var.T, 0.0f, i11Var.s), getWidth(), i0.T1(i11Var.U, getHeight(), i11Var.s));
                    boolean drawChild2 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild2;
                }
                if (view != i11Var.P) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                path2.rewind();
                path2.addCircle(rectF.centerX() + i11Var.N.getX(), rectF.centerY() + i11Var.N.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.clipRect(0.0f, i0.T1(i11Var.T, 0.0f, i11Var.s), getWidth(), i0.T1(i11Var.U, getHeight(), i11Var.s));
                canvas.translate(-i11Var.P.getX(), -i11Var.P.getY());
                canvas.translate(i11Var.N.getX() + rectF.left, i11Var.N.getY() + rectF.top);
                canvas.scale(rectF.width() / i11Var.P.getMeasuredWidth(), rectF.height() / i11Var.P.getMeasuredHeight(), i11Var.P.getX(), i11Var.P.getY());
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            case 25:
                if (view != ((i31) this.c).h0 || !e0.b || !e0.f) {
                    return super.drawChild(canvas, view, j10);
                }
                for (int i10 = 0; i10 < ((i31) this.c).h0.getChildCount(); i10++) {
                    View childAt = ((i31) this.c).h0.getChildAt(i10);
                    if (childAt instanceof s21) {
                        s21 s21Var = (s21) childAt;
                        if (s21Var.getAnimatedScale() == 1.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        } else if (s21Var.getAnimatedScale() > 0.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            ((Rect) this.b).set((int) (r2.centerX() - (s21Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f))), (int) (((Rect) this.b).centerY() - (s21Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f))), (int) ((s21Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f)) + ((Rect) this.b).centerX()), (int) ((s21Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f)) + ((Rect) this.b).centerY()));
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            canvas.scale(s21Var.getAnimatedScale(), s21Var.getAnimatedScale(), ((Rect) this.b).centerX(), ((Rect) this.b).centerY());
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        }
                    } else if ((childAt instanceof TextView) || (childAt instanceof n21) || (childAt instanceof m21) || (childAt instanceof o21)) {
                        ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                        canvas.save();
                        canvas.clipRect((Rect) this.b);
                        super.drawChild(canvas, view, j10);
                        canvas.restore();
                    }
                }
                return false;
            case 29:
                b6 b6Var = (b6) this.c;
                if (view != b6Var.s0 || !b6Var.F) {
                    return super.drawChild(canvas, view, j10);
                }
                int save = canvas.save();
                canvas.concat(b6Var.I);
                boolean drawChild4 = super.drawChild(canvas, view, j10);
                canvas.restoreToCount(save);
                return drawChild4;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.a) {
            case 0:
                super.invalidate();
                ((l) this.c).invalidate();
                break;
            case 28:
                super.invalidate();
                m0 m0Var = ((m91) this.c).u0;
                if (m0Var != null) {
                    m0Var.invalidate();
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
            case 19:
                super.onAttachedToWindow();
                lt ltVar = (lt) this.c;
                ltVar.A.P();
                ltVar.B.P();
                break;
            case 22:
                super.onAttachedToWindow();
                ((ProfileActivity) this.c).r5.P();
                break;
            case 23:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.b).h.P();
                break;
            case 26:
                super.onAttachedToWindow();
                ((ImageReceiver) this.b).P();
                break;
            case 29:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((n5) this.b);
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
                i0.v(getContext(), configuration);
                s0 s0Var = (s0) this.c;
                i0.x3(s0Var.b, s0Var.d, s0Var.c);
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
            case 19:
                super.onDetachedFromWindow();
                lt ltVar = (lt) this.c;
                ltVar.A.R();
                ltVar.B.R();
                break;
            case 22:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.c).r5.R();
                break;
            case 23:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.b).h.R();
                break;
            case 26:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.b).R();
                break;
            case 29:
                getViewTreeObserver().removeOnPreDrawListener((n5) this.b);
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
        float f7;
        Drawable drawable;
        float f10;
        switch (this.a) {
            case 13:
                c(canvas);
                zc0 zc0Var = (zc0) this.c;
                if (zc0Var.J != null && zc0Var.K != null && getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
                    zc0Var.J.eraseColor(0);
                    zc0Var.K.save();
                    zc0Var.K.scale(zc0Var.J.getWidth() / getMeasuredWidth(), zc0Var.J.getHeight() / getMeasuredHeight());
                    c(zc0Var.K);
                    zc0Var.K.restore();
                    zc0Var.I.d();
                    break;
                }
                break;
            case 18:
                canvas.save();
                t1 t1Var = (t1) this.c;
                canvas.scale(t1Var.b.getScaleX(), t1Var.b.getScaleY(), t1Var.b.getPivotX() + t1Var.b.getLeft(), t1Var.b.getPivotY() + t1Var.b.getTop());
                Drawable drawable2 = (Drawable) this.b;
                drawable2.setBounds(t1Var.b.getLeft() - i0.L(2.0f), t1Var.b.getTop() - i0.L(2.0f), i0.L(2.0f) + t1Var.b.getRight(), i0.L(2.0f) + t1Var.b.getBottom());
                drawable2.draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                break;
            case 19:
                lt ltVar = (lt) this.b;
                Paint paint = ltVar.N;
                ImageReceiver imageReceiver = ltVar.B;
                ColorDrawable colorDrawable = ltVar.u;
                ImageReceiver imageReceiver2 = ltVar.A;
                if (ltVar.z != null && colorDrawable != null) {
                    if (ltVar.K && ltVar.v == null && ltVar.w != null && !ltVar.e0) {
                        ltVar.e0 = true;
                        imageReceiver2.O0(false, false);
                        nl0.d(new z4(ltVar, 8));
                    }
                    if (ltVar.v != null) {
                        boolean z10 = ltVar.K;
                        if (z10) {
                            float f11 = ltVar.M;
                            if (f11 != 1.0f) {
                                float f12 = f11 + 0.13333334f;
                                ltVar.M = f12;
                                if (f12 > 1.0f) {
                                    ltVar.M = 1.0f;
                                }
                                ltVar.z.invalidate();
                                f10 = ltVar.M;
                                if (f10 != 0.0f && ltVar.v != null) {
                                    paint.setAlpha((int) (f10 * 255.0f));
                                    if (paint.getAlpha() != 255) {
                                        canvas.drawColor(t6.r1(ltVar.M, t6.w0(t6.a7, ltVar.c0)));
                                    }
                                    canvas.drawPaint(paint);
                                }
                            }
                        }
                        if (!z10) {
                            float f13 = ltVar.M;
                            if (f13 != 0.0f) {
                                float f14 = f13 - 0.13333334f;
                                ltVar.M = f14;
                                if (f14 < 0.0f) {
                                    ltVar.M = 0.0f;
                                }
                                ltVar.z.invalidate();
                            }
                        }
                        f10 = ltVar.M;
                        if (f10 != 0.0f) {
                            paint.setAlpha((int) (f10 * 255.0f));
                            if (paint.getAlpha() != 255) {
                            }
                            canvas.drawPaint(paint);
                        }
                    }
                    colorDrawable.setAlpha((int) (ltVar.F * 180.0f));
                    colorDrawable.setBounds(0, 0, ltVar.z.getWidth(), ltVar.z.getHeight());
                    colorDrawable.draw(canvas);
                    canvas.save();
                    i0.c cVar = ltVar.q;
                    int i10 = cVar.d;
                    int i11 = cVar.b;
                    int i12 = i10 + i11;
                    if (ltVar.V == 1) {
                        min = Math.min(ltVar.z.getWidth(), ltVar.z.getHeight() - i12) - i0.L(40.0f);
                    } else {
                        min = (int) (ltVar.S ? Math.min(ltVar.z.getWidth(), ltVar.z.getHeight() - i12) - i0.N(40.0f) : Math.min(ltVar.z.getWidth(), ltVar.z.getHeight() - i12) / 1.8f);
                    }
                    float max = Math.max((min / 2) + i11 + (ltVar.G != null ? i0.L(40.0f) : 0), ((ltVar.z.getHeight() - i12) - ltVar.I) / 2);
                    if (ltVar.S) {
                        max += i0.L(40.0f);
                    }
                    canvas.translate(ltVar.z.getWidth() / 2, ltVar.e + max);
                    int i13 = (int) (min * ((ltVar.F * 0.8f) / 0.8f));
                    if (ltVar.V == 3) {
                        canvas.translate(0.0f, i0.L(70.0f));
                    }
                    if (ltVar.S) {
                        float f15 = i13;
                        float f16 = 0.6669f * f15;
                        f7 = 255.0f;
                        imageReceiver2.setAlpha(ltVar.F);
                        float f17 = f15 - f16;
                        float f18 = f15 / 2.0f;
                        imageReceiver2.y0((f17 - f18) - (0.0546875f * f15), (f17 / 2.0f) - f18, f16, f16);
                        imageReceiver2.h(canvas, null);
                        imageReceiver.setAlpha(ltVar.F);
                        float f19 = (-i13) / 2.0f;
                        imageReceiver.y0(f19, f19, f15, f15);
                        imageReceiver.h(canvas, null);
                    } else {
                        f7 = 255.0f;
                        imageReceiver2.setAlpha(ltVar.F);
                        float f20 = (-i13) / 2.0f;
                        float f21 = i13;
                        imageReceiver2.y0(f20, f20, f21, f21);
                        imageReceiver2.h(canvas, null);
                    }
                    if (ltVar.C != null) {
                        canvas.save();
                        float f22 = (-i13) / 2.0f;
                        canvas.translate(f22, f22);
                        float f23 = i13;
                        canvas.scale(f23 / ltVar.C.getWidth(), f23 / ltVar.C.getHeight());
                        ltVar.C.setAlpha(ltVar.F);
                        if (ltVar.D == null) {
                            ltVar.D = new Path();
                        }
                        ltVar.D.rewind();
                        RectF rectF = i0.P;
                        rectF.set(0.0f, 0.0f, ltVar.C.getWidth(), ltVar.C.getHeight());
                        float f24 = f23 / 8.0f;
                        ltVar.D.addRoundRect(rectF, f24, f24, Path.Direction.CW);
                        canvas.clipPath(ltVar.D);
                        ltVar.C.draw(canvas);
                        canvas.restore();
                    }
                    if (ltVar.V == 1 && !ltVar.m && (drawable = ltVar.J) != null) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = ltVar.J.getIntrinsicHeight();
                        int L = (int) (imageReceiver2.P0.top - i0.L(((ltVar.d / i0.L(60.0f)) * 6.0f) + 17.0f));
                        ltVar.J.setAlpha((int) ((1.0f - ltVar.g) * f7));
                        ltVar.J.setBounds((-intrinsicWidth) / 2, (-intrinsicHeight) + L, intrinsicWidth / 2, L);
                        ltVar.J.draw(canvas);
                    }
                    if (ltVar.G != null) {
                        if (ltVar.S) {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver.N0) / 2.0f) - i0.L(30.0f));
                        } else {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver2.N0) / 2.0f) - i0.L(30.0f));
                        }
                        lt.f0.setAlpha((int) (ltVar.F * f7));
                        ltVar.G.draw(canvas);
                    }
                    canvas.restore();
                    if (ltVar.E) {
                        if (ltVar.F != 1.0f) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j10 = currentTimeMillis - ltVar.H;
                            ltVar.H = currentTimeMillis;
                            ltVar.F = (j10 / 120.0f) + ltVar.F;
                            ltVar.z.invalidate();
                            if (ltVar.F > 1.0f) {
                                ltVar.F = 1.0f;
                                break;
                            }
                        }
                    } else if (ltVar.F != 0.0f) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long j11 = currentTimeMillis2 - ltVar.H;
                        ltVar.H = currentTimeMillis2;
                        ltVar.F -= j11 / 120.0f;
                        ltVar.z.invalidate();
                        if (ltVar.F < 0.0f) {
                            ltVar.F = 0.0f;
                        }
                        if (ltVar.F == 0.0f) {
                            imageReceiver2.w0(null);
                            i0.P3(ltVar.w);
                            i0.g3(new ws(ltVar, 1));
                            Bitmap bitmap = ltVar.v;
                            if (bitmap != null) {
                                bitmap.recycle();
                                ltVar.v = null;
                            }
                            i0.Y3(ltVar.O, false, 1.0f, true, false);
                            ltVar.M = 0.0f;
                            try {
                                if (ltVar.y.getParent() != null) {
                                    ((WindowManager) ltVar.w.getSystemService("window")).removeView(ltVar.y);
                                    break;
                                }
                            } catch (Exception e) {
                                f8.g(e, true);
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
                int intrinsicHeight2 = t6.i3.getIntrinsicHeight();
                t6.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight2);
                t6.i3.draw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(((m91) this.c).getThemedColor(t6.Ge));
                canvas.drawRect(0.0f, intrinsicHeight2, getMeasuredWidth(), getMeasuredHeight(), paint2);
                break;
            case 28:
                int[] iArr = (int[]) this.b;
                m91 m91Var = (m91) this.c;
                if (!i0.D) {
                    getLocationInWindow(iArr);
                    if (m91Var.t0.getTranslationY() != iArr[1]) {
                        m91Var.t0.setTranslationY(-r0);
                        m91Var.u0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < m91Var.Q) {
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
        jc jcVar;
        switch (this.a) {
            case 4:
                bb bbVar = (bb) ((bh.d) this.c).c;
                return bbVar != null ? bbVar.c(motionEvent, new ja(this, 1)) : super.onInterceptTouchEvent(motionEvent);
            case 22:
                return (((ProfileActivity) this.c).n5 == 0.0f && (jcVar = (jc) this.b) != null && jcVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 4:
                super.onLayout(z10, i10, i11, i12, i13);
                cb0 cb0Var = (cb0) ((bh.d) this.c).d;
                if (cb0Var != null) {
                    cb0Var.run();
                    break;
                }
                break;
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int y3 = z20.y(275.0f, i15, 2);
                s60 s60Var = (s60) this.c;
                FrameLayout frameLayout = s60Var.r;
                frameLayout.layout(0, y3, frameLayout.getMeasuredWidth(), s60Var.r.getMeasuredHeight() + y3);
                int L = i0.L(139.0f) + i0.L(150.0f) + y3;
                int measuredWidth = (getMeasuredWidth() - s60Var.e.getMeasuredWidth()) / 2;
                y9 y9Var = s60Var.e;
                y9Var.layout(measuredWidth, L, y9Var.getMeasuredWidth() + measuredWidth, s60Var.e.getMeasuredHeight() + L);
                z4.g gVar = s60Var.d;
                gVar.layout(0, 0, gVar.getMeasuredWidth(), s60Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - s60Var.n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - s60Var.n.getMeasuredWidth()) / 2;
                j6 j6Var = s60Var.n;
                j6Var.layout(measuredWidth2, measuredHeight, j6Var.getMeasuredWidth() + measuredWidth2, s60Var.n.getMeasuredHeight() + measuredHeight);
                int L2 = measuredHeight - i0.L(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - s60Var.f.getMeasuredWidth()) / 2;
                TextView textView = s60Var.f;
                textView.layout(measuredWidth3, L2 - textView.getMeasuredHeight(), s60Var.f.getMeasuredWidth() + measuredWidth3, L2);
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int L3 = i0.L(4) + (i0.Q1() ? 0 : i0.m);
                if (marginLayoutParams.topMargin != L3) {
                    marginLayoutParams.topMargin = L3;
                    frameLayout2.requestLayout();
                    break;
                }
                break;
            case 21:
                int L4 = i0.L(25.0f) + i0.L(150.0f) + z20.y(275.0f, ((i13 - i11) / 4) * 3, 2);
                int L5 = i0.L(18.0f);
                TextView textView2 = (TextView) this.b;
                textView2.layout(L5, L4, textView2.getMeasuredWidth() + L5, textView2.getMeasuredHeight() + L4);
                int L6 = i0.L(18.0f) + L4 + ((int) textView2.getTextSize());
                int L7 = i0.L(16.0f);
                TextView textView3 = (TextView) this.c;
                textView3.layout(L7, L6, textView3.getMeasuredWidth() + L7, textView3.getMeasuredHeight() + L6);
                break;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.c).p5();
                break;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                if (secretMediaViewer.n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + i0.m;
                    a11 a11Var = secretMediaViewer.n;
                    a11Var.layout(a11Var.getLeft(), currentActionBarHeight, secretMediaViewer.n.getRight(), secretMediaViewer.n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.r != null && secretMediaViewer.n != null) {
                    int measuredHeight2 = (secretMediaViewer.n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + i0.m)) - i0.L(10.0f);
                    p2 p2Var = secretMediaViewer.r;
                    p2Var.layout(p2Var.getLeft(), measuredHeight2, secretMediaViewer.r.getRight(), secretMediaViewer.r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.Y != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i0.m;
                    fr0 fr0Var = secretMediaViewer.Y;
                    fr0Var.layout(fr0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.Y.getRight(), secretMediaViewer.Y.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f;
                if (view != null) {
                    int i16 = i13 - i11;
                    view.layout(0, i16, i12 - i10, i0.n + i16);
                    break;
                }
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 3:
                super.onMeasure(i10, z20.B(2.0f, ((i1) this.c).q1, TLObject.FLAG_30));
                break;
            case 5:
                super.onMeasure(i10, i11);
                super.onMeasure(i10, z20.B(8.0f, ((LinearLayout) this.b).getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i0.L(350.0f), TLObject.FLAG_30));
                break;
            case 11:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i0.L(48.0f), TLObject.FLAG_30));
                break;
            case 23:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                fr0 fr0Var = secretMediaViewer.Y;
                if (fr0Var != null) {
                    fr0Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((measuredHeight - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - i0.m) - (secretMediaViewer.S.getVisibility() != 0 ? 0 : secretMediaViewer.S.getMeasuredHeight()), TLObject.FLAG_30));
                }
                View view = secretMediaViewer.f;
                if (view != null) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i0.n, TLObject.FLAG_30));
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
                w wVar = (w) this.c;
                wVar.setBounds(0, 0, i10, i11);
                wVar.c(0, i0.L(24.0f) + getPaddingBottom());
                break;
            case 13:
                zc0 zc0Var = (zc0) this.c;
                hi.b bVar = zc0Var.H;
                super.onSizeChanged(i10, i11, i12, i13);
                if (i10 > 0 && i11 > 0) {
                    zc0Var.J = Bitmap.createBitmap(54, Math.max(1, Math.round((i11 * 54) / i10)), Bitmap.Config.ARGB_8888);
                    zc0Var.K = new Canvas(zc0Var.J);
                    bVar.a(zc0Var.J);
                    bVar.b(i10, i11);
                    break;
                }
                break;
            case 16:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.b;
                path.rewind();
                RectF rectF = i0.P;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, i0.L(10.0f), i0.L(10.0f), Path.Direction.CW);
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
        jc jcVar;
        switch (this.a) {
            case 0:
                l lVar = (l) this.c;
                e eVar = lVar.r;
                boolean onTouchEvent = ((GestureDetector) ((t) this.b).b).onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    i0.h3(eVar, 200L);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    i0.r(eVar);
                    if (!lVar.h) {
                        o1.k kVar = lVar.c.m;
                        if (((float) kVar.i) >= getWidth() / 2.0f) {
                            displayMetrics = getResources().getDisplayMetrics();
                            f7 = 2.14748365E9f;
                        } else {
                            displayMetrics = getResources().getDisplayMetrics();
                            f7 = -2.14748365E9f;
                        }
                        kVar.i = l.a(displayMetrics, f7);
                        lVar.d.m.i = l.b(getResources().getDisplayMetrics(), (float) lVar.d.m.i);
                        lVar.c.h();
                        lVar.d.h();
                    }
                    lVar.n = false;
                    lVar.f = false;
                    lVar.h = false;
                }
                return onTouchEvent;
            case 22:
                return (((ProfileActivity) this.c).n5 == 0.0f && (jcVar = (jc) this.b) != null && jcVar.b(motionEvent)) || super.onTouchEvent(motionEvent);
            case 23:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                if (secretMediaViewer.k0 == 0 && secretMediaViewer.H0 == 0) {
                    if (motionEvent.getPointerCount() == 1 && secretMediaViewer.J0.onTouchEvent(motionEvent) && secretMediaViewer.Z0) {
                        secretMediaViewer.Z0 = false;
                        secretMediaViewer.Y0 = false;
                        secretMediaViewer.X0 = false;
                        secretMediaViewer.d(false);
                    } else if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                        secretMediaViewer.d1 = false;
                        zl0 zl0Var = secretMediaViewer.e1;
                        if (!zl0Var.q) {
                            zl0Var.a();
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
                                float y3 = motionEvent.getY();
                                secretMediaViewer.S0 = y3;
                                secretMediaViewer.o0 = y3;
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
                                secretMediaViewer.u0 = z20.v(secretMediaViewer.w0, secretMediaViewer.M0, (secretMediaViewer.N0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.P0, secretMediaViewer.N0 - (secretMediaViewer.e.getWidth() / 2));
                                float height = secretMediaViewer.O0 - (secretMediaViewer.e.getHeight() / 2);
                                float height2 = (secretMediaViewer.O0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.Q0;
                                float f11 = secretMediaViewer.w0;
                                secretMediaViewer.v0 = z20.v(f11, secretMediaViewer.M0, height2, height);
                                secretMediaViewer.o(f11);
                                secretMediaViewer.e.invalidate();
                            } else if (motionEvent.getPointerCount() == 1) {
                                float abs = Math.abs(motionEvent.getX() - secretMediaViewer.R0);
                                float abs2 = Math.abs(motionEvent.getY() - secretMediaViewer.o0);
                                if (abs > i0.L(3.0f) || abs2 > i0.L(3.0f)) {
                                    secretMediaViewer.d1 = true;
                                }
                                if (secretMediaViewer.b1 && !secretMediaViewer.n0 && secretMediaViewer.w0 == 1.0f && abs2 >= i0.L(30.0f) && abs2 / 2.0f > abs) {
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
                                    float y10 = secretMediaViewer.S0 - motionEvent.getY();
                                    if (secretMediaViewer.Y0 || ((secretMediaViewer.w0 == 1.0f && Math.abs(y10) + i0.L(12.0f) < Math.abs(x10)) || secretMediaViewer.w0 != 1.0f)) {
                                        if (!secretMediaViewer.Y0) {
                                            secretMediaViewer.Y0 = true;
                                            secretMediaViewer.b1 = false;
                                            x10 = 0.0f;
                                            y10 = 0.0f;
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
                                                float f15 = secretMediaViewer.v0 - y10;
                                                if (f15 < f14) {
                                                    secretMediaViewer.v0 = f14;
                                                } else {
                                                    if (f15 > f13) {
                                                        secretMediaViewer.v0 = f13;
                                                    }
                                                    f10 = y10;
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
                                            f10 = y10 / 3.0f;
                                            secretMediaViewer.u0 = f12 - x10;
                                            if (secretMediaViewer.w0 != 1.0f) {
                                            }
                                            secretMediaViewer.e.invalidate();
                                        }
                                        f10 = y10;
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
                                    float v = z20.v(3.0f, secretMediaViewer.M0, (secretMediaViewer.N0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.P0, secretMediaViewer.N0 - (secretMediaViewer.e.getWidth() / 2));
                                    float v10 = z20.v(3.0f, secretMediaViewer.M0, (secretMediaViewer.O0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.Q0, secretMediaViewer.O0 - (secretMediaViewer.e.getHeight() / 2));
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
    public void setBackgroundColor(int i10) {
        switch (this.a) {
            case 13:
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
            case 0:
                super.setTranslationX(f7);
                ((l) this.c).invalidate();
                break;
            default:
                super.setTranslationX(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.a) {
            case 0:
                super.setTranslationY(f7);
                ((l) this.c).invalidate();
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, p6 p6Var) {
        super(context);
        this.a = 1;
        this.c = new w(8);
        this.b = p6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(v0 v0Var, Context context) {
        super(context);
        this.a = 8;
        this.c = v0Var;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xb xbVar, Context context) {
        super(context);
        this.a = 9;
        this.c = xbVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(i11 i11Var, Context context) {
        super(context);
        this.a = 24;
        this.c = i11Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m5 m5Var, Activity activity) {
        super(activity);
        this.a = 6;
        this.c = m5Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, x0 x0Var) {
        super(context);
        this.a = 17;
        this.c = new RectF();
        this.b = x0Var;
        x0Var.a(this);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(cd.L0(2131743280, null));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(1);
        textView.setTypeface(i0.o());
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(-1);
        textView2.setGravity(1);
        textView2.setText(cd.L0(2131743281, null));
        addView(textView, w7.b6.d(-1, -2.0f, 3, 0.0f, 24.0f, 0.0f, 0.0f));
        addView(textView2, w7.b6.d(-1, -2.0f, 3, 0.0f, 50.0f, 0.0f, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(s0 s0Var, Context context) {
        super(context);
        this.a = 16;
        this.c = s0Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(bh.d dVar, Context context) {
        super(context);
        this.a = 4;
        this.c = dVar;
        p3 p3Var = new p3();
        p3Var.d = new s9.g(p3Var);
        p3Var.h = new ArrayList();
        p3Var.e = this;
        p3Var.a = context;
        this.b = p3Var;
        setClickable(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(zc0 zc0Var, Context context) {
        super(context);
        this.a = 13;
        this.c = zc0Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b6 b6Var, Context context) {
        super(context);
        this.a = 29;
        this.c = b6Var;
        this.b = new n5(0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, TextView textView, TextView textView2) {
        super(context);
        this.a = 21;
        this.b = textView;
        this.c = textView2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.a = 23;
        this.c = secretMediaViewer;
        this.b = secretMediaViewer;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(i31 i31Var, Context context) {
        super(context);
        this.a = 25;
        this.c = i31Var;
        this.b = new Rect();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(dp dpVar, Context context) {
        super(context);
        this.a = 11;
        this.c = dpVar;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(lt ltVar, Activity activity) {
        super(activity);
        this.a = 19;
        this.c = ltVar;
        this.b = ltVar;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m91 m91Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 28:
                this.c = m91Var;
                super(context);
                this.b = new int[2];
                break;
            default:
                this.c = m91Var;
                this.b = new Paint();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p0 p0Var, Context context) {
        super(context);
        this.a = 2;
        this.c = p0Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(mj0 mj0Var, Context context) {
        super(context);
        this.a = 14;
        this.c = mj0Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context);
        this.a = 10;
        this.b = new Path();
        this.c = new li.k(23);
    }
}
