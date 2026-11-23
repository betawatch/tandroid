package ai;

import a8.r7;
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
import bi.n3;
import c8.l9;
import c8.ma;
import hi.h5;
import hi.l3;
import java.util.ArrayList;
import m.o3;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.ab;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.ha;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.a5;
import org.telegram.ui.aa0;
import org.telegram.ui.as;
import org.telegram.ui.b20;
import org.telegram.ui.c11;
import org.telegram.ui.g4;
import org.telegram.ui.n5;
import org.telegram.ui.ns;
import org.telegram.ui.nz0;
import org.telegram.ui.q6;
import org.telegram.ui.qb;
import org.telegram.ui.ru0;
import org.telegram.ui.s11;
import org.telegram.ui.uz0;
import org.telegram.ui.v50;
import org.telegram.ui.w01;
import org.telegram.ui.wp0;
import org.telegram.ui.x01;
import org.telegram.ui.y01;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class l0 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.c = obj;
    }

    public void d(Canvas canvas) {
        qc0 qc0Var = (qc0) this.c;
        Drawable drawable = qc0Var.a;
        if (drawable == null) {
            super.onDraw(canvas);
        } else if ((drawable instanceof cb0) || (drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable)) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            qc0Var.a.draw(canvas);
        } else {
            int max = Math.max(0, qc0Var.H);
            float max2 = Math.max(getMeasuredWidth() / qc0Var.a.getIntrinsicWidth(), (getMeasuredHeight() + max) / qc0Var.a.getIntrinsicHeight());
            int ceil = (int) Math.ceil(qc0Var.a.getIntrinsicWidth() * max2);
            int ceil2 = (int) Math.ceil(qc0Var.a.getIntrinsicHeight() * max2);
            int measuredWidth = (getMeasuredWidth() - ceil) / 2;
            int measuredHeight = ((getMeasuredHeight() - ceil2) + max) / 2;
            qc0Var.a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
            qc0Var.a.draw(canvas);
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        h6 h6Var;
        ?? r12;
        ?? r13;
        float f10;
        float f11;
        float f12;
        org.telegram.ui.Cells.y yVar;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                float L = org.telegram.messenger.g0.L(28.0f);
                float height = getHeight() / 2.0f;
                canvas.drawCircle(L, height, org.telegram.messenger.g0.N(9.2f), (Paint) this.b);
                for (int i7 = -1; i7 <= 1; i7++) {
                    canvas.drawCircle(org.telegram.ui.Cells.c0.e(4.0f, i7, L), height, org.telegram.messenger.g0.N(1.35f), (Paint) this.c);
                }
                break;
            case 11:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.b;
                int i10 = m6.a7;
                h6Var = ((org.telegram.ui.ActionBar.g2) ((n5) this.c).d).resourceProvider;
                paint.setColor(m6.w0(i10, h6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint);
                break;
            case 13:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.y0 y0Var = (org.telegram.ui.Cells.y0) this.c;
                int measuredWidth = y0Var.getMeasuredWidth();
                int i11 = y0Var.e;
                float x10 = y0Var.getX();
                float f13 = y0Var.d;
                h6 h6Var2 = y0Var.c;
                if (h6Var2 != null) {
                    h6Var2.e(x10, f13, measuredWidth, i11);
                } else {
                    m6.r(x10, f13, measuredWidth, i11);
                }
                float L2 = org.telegram.messenger.g0.L(18.0f);
                float L3 = org.telegram.messenger.g0.L(18.0f);
                Paint g10 = h6Var2 != null ? h6Var2.g("paintChatActionBackground") : null;
                if (g10 == null) {
                    g10 = m6.V0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, L2, L3, g10);
                if (h6Var2 != null ? h6Var2.j() : m6.d1()) {
                    float L4 = org.telegram.messenger.g0.L(18.0f);
                    float L5 = org.telegram.messenger.g0.L(18.0f);
                    Paint g11 = h6Var2 != null ? h6Var2.g("paintChatActionBackgroundDarken") : null;
                    if (g11 == null) {
                        g11 = m6.V0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, L4, L5, g11);
                }
                super.dispatchDraw(canvas);
                break;
            case 14:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(m6.w0(m6.a7, ((qb) this.c).f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                break;
            case 15:
                float L6 = org.telegram.messenger.g0.L(20.0f);
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.b;
                path.rewind();
                path.addRoundRect(rectF2, L6, L6, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF2, ls.e4, 31);
                super.dispatchDraw(canvas);
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), org.telegram.messenger.g0.L(6.0f) + getPaddingTop());
                h6.m mVar = (h6.m) this.c;
                mVar.n(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - org.telegram.messenger.g0.L(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                mVar.n(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                break;
            case 16:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.b;
                paint3.setColor(m6.w0(m6.d7, ((np) this.c).J0));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint3);
                break;
            case 17:
                gy gyVar = (gy) this.c;
                if (gyVar.H.v0 || gyVar.x <= 0.0f) {
                    super.dispatchDraw(canvas);
                    break;
                } else {
                    if (((Paint) this.b) == null) {
                        Paint paint4 = new Paint();
                        this.b = paint4;
                        paint4.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), ls.e4, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.b).setAlpha((int) (gyVar.x * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), getMeasuredHeight(), (Paint) this.b);
                    canvas.restore();
                    break;
                }
                break;
            case 19:
                Paint paint5 = (Paint) this.b;
                xi0 xi0Var = (xi0) this.c;
                int i12 = xi0Var.N0;
                paint5.setColor((i12 == 1 || i12 == 2 || i12 == 4) ? i0.a.o(-1, 30) : i0.a.f(0.7f, m6.w0(m6.F8, xi0Var.l0), m6.w0(m6.h5, xi0Var.l0)));
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - org.telegram.messenger.g0.N(6.0f)) / 2.0f;
                float g12 = xi0Var.g();
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(measuredWidth2 - measuredWidth3, (measuredHeight - measuredWidth3) - g12, measuredWidth2 + measuredWidth3, measuredHeight + measuredWidth3 + g12);
                canvas.save();
                canvas.scale(childAt.getScaleX(), childAt.getScaleY(), measuredWidth2, measuredHeight);
                canvas.drawRoundRect(rectF3, measuredWidth3, measuredWidth3, paint5);
                canvas.restore();
                canvas.save();
                canvas.translate(0.0f, g12);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            case 20:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.b;
                b20 b20Var = (b20) this.c;
                e9 e9Var = b20Var.K;
                TextView textView = b20Var.L;
                float f14 = b20Var.P;
                if (f14 == 1.0f) {
                    shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    e9Var.setTranslationX(0.0f);
                    textView.setTranslationX(0.0f);
                } else {
                    float interpolation = 1.0f - nr.f.getInterpolation(f14);
                    float left = (b20Var.Q - getLeft()) * interpolation;
                    float left2 = (b20Var.R - textView.getLeft()) * interpolation;
                    shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((b20Var.S - getRight()) * interpolation)), getMeasuredHeight());
                    e9Var.setTranslationX(left);
                    textView.setTranslationX(-left2);
                }
                shapeDrawable.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 21:
                RectF rectF4 = (RectF) this.c;
                rectF4.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.l1 l1Var = (org.telegram.ui.Components.voip.l1) this.b;
                l1Var.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF4, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), l1Var.b());
                super.dispatchDraw(canvas);
                break;
            case 26:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                if (profileActivity.a5 != null) {
                    canvas.save();
                    canvas.translate(profileActivity.r.getX() + profileActivity.b5, profileActivity.r.getY());
                    f10 = 0.0f;
                    r12 = 0;
                    r13 = 1;
                    f11 = 2.0f;
                    f12 = 28.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.a5.getMeasuredWidth(), profileActivity.a5.getMeasuredHeight(), (int) ((1.0f - profileActivity.T1) * 255.0f), 31);
                    profileActivity.a5.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    r12 = 0;
                    r13 = 1;
                    f10 = 0.0f;
                    f11 = 2.0f;
                    f12 = 28.0f;
                }
                if (profileActivity.v5 && profileActivity.x6 != f10 && profileActivity.t5 != 1.0f) {
                    float measuredHeight2 = (profileActivity.r.getMeasuredHeight() / f11) + profileActivity.r.getY();
                    float L7 = org.telegram.messenger.g0.L(22.0f);
                    float x11 = ((profileActivity.r.getX() + (org.telegram.messenger.g0.L(f12) - profileActivity.u5)) - L7) - profileActivity.r4();
                    profileActivity.x5.y0(x11, measuredHeight2 - (L7 / f11), L7, L7);
                    profileActivity.x5.setAlpha(profileActivity.x6);
                    canvas.save();
                    float f15 = profileActivity.x6;
                    canvas.scale(f15, f15, profileActivity.x5.r(), profileActivity.x5.s());
                    profileActivity.x5.h(canvas, null);
                    canvas.restore();
                    if (profileActivity.t5 == f10) {
                        if (((tc) this.b) == null) {
                            tc tcVar = new tc(this);
                            this.b = tcVar;
                            tcVar.h = new ru0(this, r13);
                        }
                        float L8 = (1.0f - profileActivity.t5) * org.telegram.messenger.g0.L(f12);
                        float textWidth = profileActivity.r.getTextWidth();
                        float max = Math.max(textWidth, profileActivity.T != null ? profileActivity.T.getVisibilityFactor() * (org.telegram.messenger.g0.L(24.0f) + textWidth + org.telegram.messenger.g0.L(4.0f)) : f10) + L8;
                        RectF rectF5 = org.telegram.messenger.g0.P;
                        rectF5.set(x11 - org.telegram.messenger.g0.L(4.0f), measuredHeight2 - org.telegram.messenger.g0.L(14.0f), x11 + max + org.telegram.messenger.g0.L(4.0f), measuredHeight2 + org.telegram.messenger.g0.L(14.0f));
                        tc tcVar2 = (tc) this.b;
                        tcVar2.i = r12;
                        tcVar2.c = r12;
                        tcVar2.a(rectF5);
                        tc tcVar3 = (tc) this.b;
                        tcVar3.n = r13;
                        int o4 = i0.a.o(-1, 50);
                        tcVar3.g.setColor((int) r12);
                        org.telegram.ui.Cells.y yVar2 = tcVar3.e;
                        if (yVar2 != null) {
                            m6.H1(yVar2, o4, r13);
                        }
                        tc tcVar4 = (tc) this.b;
                        tcVar4.c(canvas, tcVar4.g);
                        org.telegram.ui.Cells.y yVar3 = tcVar4.e;
                        if (yVar3 != null) {
                            yVar3.draw(canvas);
                            break;
                        }
                    } else {
                        tc tcVar5 = (tc) this.b;
                        if (tcVar5 != null && (yVar = tcVar5.e) != null) {
                            yVar.setState(StateSet.NOTHING);
                            yVar.jumpToCurrentState();
                            break;
                        }
                    }
                }
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
            case 9:
                ab abVar = (ab) ((r7) this.c).c;
                return abVar != null ? abVar.b(motionEvent, new ha(this, 0)) : super.dispatchTouchEvent(motionEvent);
            case 10:
                g4 g4Var = (g4) this.c;
                v9 n10 = g4Var.R0.n(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (g4Var.R0.x() && g4Var.R0.n(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() != 0 || !g4Var.R0.x() || (motionEvent.getY() >= linearLayout.getTop() && motionEvent.getY() <= linearLayout.getBottom())) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (g4Var.R0.n(getContext()).onTouchEvent(obtain)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        switch (this.a) {
            case 7:
                Path path = (Path) this.b;
                h5 h5Var = (h5) this.c;
                if (h5Var.h == null || (!((z10 = h5Var.f) && view == h5Var.d) && (z10 || view != h5Var.c))) {
                    return super.drawChild(canvas, view, j3);
                }
                float measuredWidth = ((z10 ? h5Var.e : 1.0f - h5Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            case 23:
                if (view instanceof ec0) {
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                float f10 = profileActivity.R1;
                if (f10 >= 1.0f || view == profileActivity.a0 || view == profileActivity.c0 || view == profileActivity.d0) {
                    return super.drawChild(canvas, view, j3);
                }
                if (f10 <= 0.0f) {
                    return false;
                }
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (profileActivity.R1 * 255.0f), 31);
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild2;
            case 27:
                return view != ((SecretMediaViewer) this.b).x && super.drawChild(canvas, view, j3);
            case 28:
                Path path2 = (Path) this.b;
                uz0 uz0Var = (uz0) this.c;
                RectF rectF = uz0Var.S;
                if (view == uz0Var.O || view == uz0Var.y) {
                    canvas.save();
                    canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(uz0Var.U, 0.0f, uz0Var.s), getWidth(), org.telegram.messenger.g0.T1(uz0Var.V, getHeight(), uz0Var.s));
                    boolean drawChild3 = super.drawChild(canvas, view, j3);
                    canvas.restore();
                    return drawChild3;
                }
                if (view != uz0Var.Q) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                path2.rewind();
                path2.addCircle(rectF.centerX() + uz0Var.O.getX(), rectF.centerY() + uz0Var.O.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(uz0Var.U, 0.0f, uz0Var.s), getWidth(), org.telegram.messenger.g0.T1(uz0Var.V, getHeight(), uz0Var.s));
                canvas.translate(-uz0Var.Q.getX(), -uz0Var.Q.getY());
                canvas.translate(uz0Var.O.getX() + rectF.left, uz0Var.O.getY() + rectF.top);
                canvas.scale(rectF.width() / uz0Var.Q.getMeasuredWidth(), rectF.height() / uz0Var.Q.getMeasuredHeight(), uz0Var.Q.getX(), uz0Var.Q.getY());
                boolean drawChild4 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild4;
            case 29:
                if (view != ((s11) this.c).i0 || !ch.f0.b || !ch.f0.f) {
                    return super.drawChild(canvas, view, j3);
                }
                for (int i7 = 0; i7 < ((s11) this.c).i0.getChildCount(); i7++) {
                    View childAt = ((s11) this.c).i0.getChildAt(i7);
                    if (childAt instanceof c11) {
                        c11 c11Var = (c11) childAt;
                        if (c11Var.getAnimatedScale() == 1.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            super.drawChild(canvas, view, j3);
                            canvas.restore();
                        } else if (c11Var.getAnimatedScale() > 0.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            ((Rect) this.b).set((int) (r2.centerX() - (c11Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f))), (int) (((Rect) this.b).centerY() - (c11Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f))), (int) ((c11Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f)) + ((Rect) this.b).centerX()), (int) ((c11Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f)) + ((Rect) this.b).centerY()));
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            canvas.scale(c11Var.getAnimatedScale(), c11Var.getAnimatedScale(), ((Rect) this.b).centerX(), ((Rect) this.b).centerY());
                            super.drawChild(canvas, view, j3);
                            canvas.restore();
                        }
                    } else if ((childAt instanceof TextView) || (childAt instanceof x01) || (childAt instanceof w01) || (childAt instanceof y01)) {
                        ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                        canvas.save();
                        canvas.clipRect((Rect) this.b);
                        super.drawChild(canvas, view, j3);
                        canvas.restore();
                    }
                }
                return false;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    public void e(int i7, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.b;
        if (z10) {
            org.telegram.messenger.g0.P3(imageView, i7);
        } else {
            imageView.setImageResource(i7);
        }
        ((TextView) this.c).setText(charSequence);
        requestLayout();
    }

    public void f(float f10) {
        o6 o6Var = (o6) this.b;
        o6Var.a();
        o6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(l9.a(f10, 0.0f, 1.0f) * 100.0f))), !hd.a0, true);
        q6 q6Var = (q6) this.c;
        q6Var.c = f10;
        q6Var.invalidate();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        switch (this.a) {
            case 4:
                ch.b0 b0Var = (ch.b0) this.c;
                float f10 = b0Var.u;
                float f11 = rect.bottom;
                if (f10 != f11 && b0Var.v) {
                    b0Var.u = f11;
                    l0 l0Var = b0Var.c;
                    ch.a0 a0Var = b0Var.a;
                    if (!b0Var.q) {
                        float f12 = b0Var.t;
                        int L = org.telegram.messenger.g0.L(32.0f);
                        int i7 = b0Var.y;
                        if (i7 == 1 || i7 == 2) {
                            L = org.telegram.messenger.g0.L(24.0f);
                        }
                        float f13 = L;
                        if (a0Var.getMeasuredHeight() + f12 > (l0Var.getMeasuredHeight() - b0Var.u) - f13) {
                            f12 = ((l0Var.getMeasuredHeight() - b0Var.u) - a0Var.getMeasuredHeight()) - f13;
                        }
                        if (f12 < 0.0f) {
                            f12 = 0.0f;
                        }
                        a0Var.animate().translationY(f12).setDuration(250L).setUpdateListener(new ch.u(b0Var, 1)).setInterpolator(nr.f).start();
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
                ((ch.l) this.b).c();
                break;
            case 4:
                super.onAttachedToWindow();
                setTag(R.id.bulletin_delegate_tag, (bi.i1) this.b);
                break;
            case 23:
                super.onAttachedToWindow();
                ns nsVar = (ns) this.c;
                nsVar.A.P();
                nsVar.B.P();
                break;
            case 26:
                super.onAttachedToWindow();
                ((ProfileActivity) this.c).x5.P();
                break;
            case 27:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.b).h.P();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 3:
                super.onDetachedFromWindow();
                ((ch.l) this.b).d();
                break;
            case 4:
                super.onDetachedFromWindow();
                setTag(R.id.bulletin_delegate_tag, null);
                break;
            case 23:
                super.onDetachedFromWindow();
                ns nsVar = (ns) this.c;
                nsVar.A.R();
                nsVar.B.R();
                break;
            case 26:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.c).x5.R();
                break;
            case 27:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.b).h.R();
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
            case 18:
                d(canvas);
                qc0 qc0Var = (qc0) this.c;
                if (qc0Var.K != null && qc0Var.L != null && getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
                    qc0Var.K.eraseColor(0);
                    qc0Var.L.save();
                    qc0Var.L.scale(qc0Var.K.getWidth() / getMeasuredWidth(), qc0Var.K.getHeight() / getMeasuredHeight());
                    d(qc0Var.L);
                    qc0Var.L.restore();
                    qc0Var.J.d();
                    break;
                }
                break;
            case 22:
                canvas.save();
                org.telegram.ui.Components.voip.h2 h2Var = (org.telegram.ui.Components.voip.h2) this.c;
                canvas.scale(h2Var.b.getScaleX(), h2Var.b.getScaleY(), h2Var.b.getPivotX() + h2Var.b.getLeft(), h2Var.b.getPivotY() + h2Var.b.getTop());
                Drawable drawable2 = (Drawable) this.b;
                drawable2.setBounds(h2Var.b.getLeft() - org.telegram.messenger.g0.L(2.0f), h2Var.b.getTop() - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f) + h2Var.b.getRight(), org.telegram.messenger.g0.L(2.0f) + h2Var.b.getBottom());
                drawable2.draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                break;
            case 23:
                ns nsVar = (ns) this.b;
                Paint paint = nsVar.N;
                ImageReceiver imageReceiver = nsVar.B;
                ColorDrawable colorDrawable = nsVar.u;
                ImageReceiver imageReceiver2 = nsVar.A;
                if (nsVar.z != null && colorDrawable != null) {
                    if (nsVar.K && nsVar.v == null && nsVar.w != null && !nsVar.e0) {
                        nsVar.e0 = true;
                        imageReceiver2.O0(false, false);
                        yk0.d(new a5(nsVar, 8));
                    }
                    if (nsVar.v != null) {
                        boolean z10 = nsVar.K;
                        if (z10) {
                            float f12 = nsVar.M;
                            if (f12 != 1.0f) {
                                float f13 = f12 + 0.13333334f;
                                nsVar.M = f13;
                                if (f13 > 1.0f) {
                                    nsVar.M = 1.0f;
                                }
                                nsVar.z.invalidate();
                                f11 = nsVar.M;
                                if (f11 != 0.0f && nsVar.v != null) {
                                    paint.setAlpha((int) (f11 * 255.0f));
                                    if (paint.getAlpha() != 255) {
                                        canvas.drawColor(m6.r1(nsVar.M, m6.w0(m6.a7, nsVar.c0)));
                                    }
                                    canvas.drawPaint(paint);
                                }
                            }
                        }
                        if (!z10) {
                            float f14 = nsVar.M;
                            if (f14 != 0.0f) {
                                float f15 = f14 - 0.13333334f;
                                nsVar.M = f15;
                                if (f15 < 0.0f) {
                                    nsVar.M = 0.0f;
                                }
                                nsVar.z.invalidate();
                            }
                        }
                        f11 = nsVar.M;
                        if (f11 != 0.0f) {
                            paint.setAlpha((int) (f11 * 255.0f));
                            if (paint.getAlpha() != 255) {
                            }
                            canvas.drawPaint(paint);
                        }
                    }
                    colorDrawable.setAlpha((int) (nsVar.F * 180.0f));
                    colorDrawable.setBounds(0, 0, nsVar.z.getWidth(), nsVar.z.getHeight());
                    colorDrawable.draw(canvas);
                    canvas.save();
                    i0.b bVar = nsVar.q;
                    int i7 = bVar.d;
                    int i10 = bVar.b;
                    int i11 = i7 + i10;
                    if (nsVar.V == 1) {
                        min = Math.min(nsVar.z.getWidth(), nsVar.z.getHeight() - i11) - org.telegram.messenger.g0.L(40.0f);
                    } else {
                        min = (int) (nsVar.S ? Math.min(nsVar.z.getWidth(), nsVar.z.getHeight() - i11) - org.telegram.messenger.g0.N(40.0f) : Math.min(nsVar.z.getWidth(), nsVar.z.getHeight() - i11) / 1.8f);
                    }
                    float max = Math.max((min / 2) + i10 + (nsVar.G != null ? org.telegram.messenger.g0.L(40.0f) : 0), ((nsVar.z.getHeight() - i11) - nsVar.I) / 2);
                    if (nsVar.S) {
                        max += org.telegram.messenger.g0.L(40.0f);
                    }
                    canvas.translate(nsVar.z.getWidth() / 2, nsVar.e + max);
                    int i12 = (int) (min * ((nsVar.F * 0.8f) / 0.8f));
                    if (nsVar.V == 3) {
                        canvas.translate(0.0f, org.telegram.messenger.g0.L(70.0f));
                    }
                    if (nsVar.S) {
                        float f16 = i12;
                        float f17 = 0.6669f * f16;
                        f10 = 255.0f;
                        imageReceiver2.setAlpha(nsVar.F);
                        float f18 = f16 - f17;
                        float f19 = f16 / 2.0f;
                        imageReceiver2.y0((f18 - f19) - (0.0546875f * f16), (f18 / 2.0f) - f19, f17, f17);
                        imageReceiver2.h(canvas, null);
                        imageReceiver.setAlpha(nsVar.F);
                        float f20 = (-i12) / 2.0f;
                        imageReceiver.y0(f20, f20, f16, f16);
                        imageReceiver.h(canvas, null);
                    } else {
                        f10 = 255.0f;
                        imageReceiver2.setAlpha(nsVar.F);
                        float f21 = (-i12) / 2.0f;
                        float f22 = i12;
                        imageReceiver2.y0(f21, f21, f22, f22);
                        imageReceiver2.h(canvas, null);
                    }
                    if (nsVar.C != null) {
                        canvas.save();
                        float f23 = (-i12) / 2.0f;
                        canvas.translate(f23, f23);
                        float f24 = i12;
                        canvas.scale(f24 / nsVar.C.getWidth(), f24 / nsVar.C.getHeight());
                        nsVar.C.setAlpha(nsVar.F);
                        if (nsVar.D == null) {
                            nsVar.D = new Path();
                        }
                        nsVar.D.rewind();
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set(0.0f, 0.0f, nsVar.C.getWidth(), nsVar.C.getHeight());
                        float f25 = f24 / 8.0f;
                        nsVar.D.addRoundRect(rectF, f25, f25, Path.Direction.CW);
                        canvas.clipPath(nsVar.D);
                        nsVar.C.draw(canvas);
                        canvas.restore();
                    }
                    if (nsVar.V == 1 && !nsVar.m && (drawable = nsVar.J) != null) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = nsVar.J.getIntrinsicHeight();
                        int L = (int) (imageReceiver2.Q0.top - org.telegram.messenger.g0.L(((nsVar.d / org.telegram.messenger.g0.L(60.0f)) * 6.0f) + 17.0f));
                        nsVar.J.setAlpha((int) ((1.0f - nsVar.g) * f10));
                        nsVar.J.setBounds((-intrinsicWidth) / 2, (-intrinsicHeight) + L, intrinsicWidth / 2, L);
                        nsVar.J.draw(canvas);
                    }
                    if (nsVar.G != null) {
                        if (nsVar.S) {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver.O0) / 2.0f) - org.telegram.messenger.g0.L(30.0f));
                        } else {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver2.O0) / 2.0f) - org.telegram.messenger.g0.L(30.0f));
                        }
                        ns.f0.setAlpha((int) (nsVar.F * f10));
                        nsVar.G.draw(canvas);
                    }
                    canvas.restore();
                    if (nsVar.E) {
                        if (nsVar.F != 1.0f) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j3 = currentTimeMillis - nsVar.H;
                            nsVar.H = currentTimeMillis;
                            nsVar.F = (j3 / 120.0f) + nsVar.F;
                            nsVar.z.invalidate();
                            if (nsVar.F > 1.0f) {
                                nsVar.F = 1.0f;
                                break;
                            }
                        }
                    } else if (nsVar.F != 0.0f) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long j10 = currentTimeMillis2 - nsVar.H;
                        nsVar.H = currentTimeMillis2;
                        nsVar.F -= j10 / 120.0f;
                        nsVar.z.invalidate();
                        if (nsVar.F < 0.0f) {
                            nsVar.F = 0.0f;
                        }
                        if (nsVar.F == 0.0f) {
                            imageReceiver2.w0(null);
                            org.telegram.messenger.g0.O3(nsVar.w);
                            org.telegram.messenger.g0.g3(new as(nsVar, 1));
                            Bitmap bitmap = nsVar.v;
                            if (bitmap != null) {
                                bitmap.recycle();
                                nsVar.v = null;
                            }
                            org.telegram.messenger.g0.X3(nsVar.O, false, 1.0f, true, false);
                            nsVar.M = 0.0f;
                            try {
                                if (nsVar.y.getParent() != null) {
                                    ((WindowManager) nsVar.w.getSystemService("window")).removeView(nsVar.y);
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
            case 27:
                SecretMediaViewer.b((SecretMediaViewer) this.b, canvas);
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
            case 9:
                ab abVar = (ab) ((r7) this.c).d;
                return abVar != null ? abVar.b(motionEvent, new ha(this, 1)) : super.onInterceptTouchEvent(motionEvent);
            case 26:
                return (((ProfileActivity) this.c).t5 == 0.0f && (tcVar = (tc) this.b) != null && tcVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 9:
                super.onLayout(z10, i7, i10, i11, i12);
                aa0 aa0Var = (aa0) ((r7) this.c).e;
                if (aa0Var != null) {
                    aa0Var.run();
                    break;
                }
                break;
            case 24:
                super.onLayout(z10, i7, i10, i11, i12);
                int i13 = (i12 - i10) / 4;
                int i14 = i13 * 3;
                int z11 = o10.z(275.0f, i14, 2);
                v50 v50Var = (v50) this.c;
                FrameLayout frameLayout = v50Var.r;
                frameLayout.layout(0, z11, frameLayout.getMeasuredWidth(), v50Var.r.getMeasuredHeight() + z11);
                int L = org.telegram.messenger.g0.L(139.0f) + org.telegram.messenger.g0.L(150.0f) + z11;
                int measuredWidth = (getMeasuredWidth() - v50Var.e.getMeasuredWidth()) / 2;
                ia iaVar = v50Var.e;
                iaVar.layout(measuredWidth, L, iaVar.getMeasuredWidth() + measuredWidth, v50Var.e.getMeasuredHeight() + L);
                c5.l lVar = v50Var.d;
                lVar.layout(0, 0, lVar.getMeasuredWidth(), v50Var.d.getMeasuredHeight());
                int measuredHeight = ((i13 - v50Var.n.getMeasuredHeight()) / 2) + i14;
                int measuredWidth2 = (getMeasuredWidth() - v50Var.n.getMeasuredWidth()) / 2;
                gi.j jVar = v50Var.n;
                jVar.layout(measuredWidth2, measuredHeight, jVar.getMeasuredWidth() + measuredWidth2, v50Var.n.getMeasuredHeight() + measuredHeight);
                int L2 = measuredHeight - org.telegram.messenger.g0.L(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - v50Var.f.getMeasuredWidth()) / 2;
                TextView textView = v50Var.f;
                textView.layout(measuredWidth3, L2 - textView.getMeasuredHeight(), v50Var.f.getMeasuredWidth() + measuredWidth3, L2);
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int L3 = org.telegram.messenger.g0.L(4) + (org.telegram.messenger.g0.Q1() ? 0 : org.telegram.messenger.g0.m);
                if (marginLayoutParams.topMargin != L3) {
                    marginLayoutParams.topMargin = L3;
                    frameLayout2.requestLayout();
                    break;
                }
                break;
            case 25:
                int L4 = org.telegram.messenger.g0.L(25.0f) + org.telegram.messenger.g0.L(150.0f) + o10.z(275.0f, ((i12 - i10) / 4) * 3, 2);
                int L5 = org.telegram.messenger.g0.L(18.0f);
                TextView textView2 = (TextView) this.b;
                textView2.layout(L5, L4, textView2.getMeasuredWidth() + L5, textView2.getMeasuredHeight() + L4);
                int L6 = org.telegram.messenger.g0.L(18.0f) + L4 + ((int) textView2.getTextSize());
                int L7 = org.telegram.messenger.g0.L(16.0f);
                TextView textView3 = (TextView) this.c;
                textView3.layout(L7, L6, textView3.getMeasuredWidth() + L7, textView3.getMeasuredHeight() + L6);
                break;
            case 26:
                super.onLayout(z10, i7, i10, i11, i12);
                ((ProfileActivity) this.c).t5();
                break;
            case 27:
                super.onLayout(z10, i7, i10, i11, i12);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                if (secretMediaViewer.n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + org.telegram.messenger.g0.m;
                    nz0 nz0Var = secretMediaViewer.n;
                    nz0Var.layout(nz0Var.getLeft(), currentActionBarHeight, secretMediaViewer.n.getRight(), secretMediaViewer.n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.r != null && secretMediaViewer.n != null) {
                    int measuredHeight2 = (secretMediaViewer.n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + org.telegram.messenger.g0.m)) - org.telegram.messenger.g0.L(10.0f);
                    l3 l3Var = secretMediaViewer.r;
                    l3Var.layout(l3Var.getLeft(), measuredHeight2, secretMediaViewer.r.getRight(), secretMediaViewer.r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.Z != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
                    wp0 wp0Var = secretMediaViewer.Z;
                    wp0Var.layout(wp0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.Z.getRight(), secretMediaViewer.Z.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f;
                if (view != null) {
                    int i15 = i12 - i10;
                    view.layout(0, i15, i11 - i7, org.telegram.messenger.g0.n + i15);
                    break;
                }
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        int i11;
        boolean z10;
        int i12;
        float f10;
        float f11;
        float f12;
        StaticLayout staticLayout;
        switch (this.a) {
            case 2:
                n3 n3Var = (n3) this.c;
                TextPaint textPaint = (TextPaint) this.b;
                textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int L = org.telegram.messenger.g0.L(14.0f);
                for (int i13 = 0; i13 < n3Var.B2.size(); i13++) {
                    L = f3.C(24.0f, (int) Math.ceil(textPaint.measureText(((CharSequence) n3Var.B2.get(i13)).toString())), L);
                }
                int size = View.MeasureSpec.getSize(i7);
                int min = Math.min(L, Math.max(0, size - org.telegram.messenger.g0.L(32.0f)));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) n3Var.A2.getLayoutParams();
                layoutParams.width = min;
                layoutParams.leftMargin = (size - min) / 2;
                super.onMeasure(i7, i10);
                break;
            case 6:
                int size2 = View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(8.0f);
                TextView textView = (TextView) this.c;
                CharSequence text = textView.getText();
                if (size2 > 0 && !TextUtils.isEmpty(text)) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView.getLayoutParams();
                    TextPaint textPaint2 = new TextPaint(textView.getPaint());
                    textPaint2.setTextSize(org.telegram.messenger.g0.L(12.0f));
                    float measureText = textPaint2.measureText(text, 0, text.length());
                    float f13 = size2;
                    if (measureText > f13) {
                        textPaint2.setTextSize(org.telegram.messenger.g0.L(11.0f));
                        String[] split = text.toString().split("\\s+");
                        int length = split.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                f11 = f13;
                                f12 = 12.0f;
                                i11 = 2;
                                z10 = true;
                                staticLayout = new StaticLayout(text, textPaint2, size2, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            } else if (textPaint2.measureText(split[i14]) > f13) {
                                staticLayout = null;
                                f11 = f13;
                                f12 = 12.0f;
                                i11 = 2;
                                z10 = true;
                            } else {
                                i14++;
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
                    layoutParams2.topMargin = org.telegram.messenger.g0.L(i12 == i11 ? 29.0f : 35.0f);
                    ((FrameLayout.LayoutParams) ((ImageView) this.b).getLayoutParams()).topMargin = org.telegram.messenger.g0.L(i12 == i11 ? 4.0f : 8.0f);
                }
                super.onMeasure(i7, i10);
                break;
            case 8:
                ViewGroup viewGroup = (ViewGroup) this.b;
                jg.e eVar = (jg.e) this.c;
                if (!eVar.L || !eVar.K) {
                    int size3 = View.MeasureSpec.getSize(i10);
                    if (size3 == 0) {
                        size3 = viewGroup.getMeasuredHeight();
                    }
                    if (size3 == 0) {
                        size3 = (org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m;
                    }
                    int L2 = org.telegram.messenger.g0.L(50.0f);
                    int L3 = eVar.w != 0 ? 0 : org.telegram.messenger.g0.L(30.0f) + L2;
                    if (!eVar.F && !eVar.x) {
                        L3 += L2;
                    }
                    int paddingTop = (size3 - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(L3 < paddingTop ? paddingTop - L3 : 0, TLObject.FLAG_30));
                    break;
                } else {
                    super.onMeasure(i7, i10);
                    break;
                }
                break;
            case 10:
                super.onMeasure(i7, i10);
                super.onMeasure(i7, o10.C(8.0f, ((LinearLayout) this.b).getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 12:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(350.0f), TLObject.FLAG_30));
                break;
            case 16:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                break;
            case 27:
                super.onMeasure(i7, i10);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                wp0 wp0Var = secretMediaViewer.Z;
                if (wp0Var != null) {
                    wp0Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m) - (secretMediaViewer.T.getVisibility() != 0 ? 0 : secretMediaViewer.T.getMeasuredHeight()), TLObject.FLAG_30));
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
            case 18:
                qc0 qc0Var = (qc0) this.c;
                ui.b bVar = qc0Var.I;
                super.onSizeChanged(i7, i10, i11, i12);
                if (i7 > 0 && i10 > 0) {
                    qc0Var.K = Bitmap.createBitmap(54, Math.max(1, Math.round((i10 * 54) / i7)), Bitmap.Config.ARGB_8888);
                    qc0Var.L = new Canvas(qc0Var.K);
                    bVar.a(qc0Var.K);
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
        tc tcVar;
        switch (this.a) {
            case 26:
                return (((ProfileActivity) this.c).t5 == 0.0f && (tcVar = (tc) this.b) != null && tcVar.b(motionEvent)) || super.onTouchEvent(motionEvent);
            case 27:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                if (secretMediaViewer.l0 == 0 && secretMediaViewer.I0 == 0) {
                    if (motionEvent.getPointerCount() == 1 && secretMediaViewer.K0.onTouchEvent(motionEvent) && secretMediaViewer.a1) {
                        secretMediaViewer.a1 = false;
                        secretMediaViewer.Z0 = false;
                        secretMediaViewer.Y0 = false;
                        secretMediaViewer.d(false);
                    } else if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                        secretMediaViewer.e1 = false;
                        ll0 ll0Var = secretMediaViewer.f1;
                        if (!ll0Var.q) {
                            ll0Var.a();
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
                                float y10 = motionEvent.getY();
                                secretMediaViewer.T0 = y10;
                                secretMediaViewer.p0 = y10;
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
                                secretMediaViewer.v0 = o10.w(secretMediaViewer.x0, secretMediaViewer.N0, (secretMediaViewer.O0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.Q0, secretMediaViewer.O0 - (secretMediaViewer.e.getWidth() / 2));
                                float height = secretMediaViewer.P0 - (secretMediaViewer.e.getHeight() / 2);
                                float height2 = (secretMediaViewer.P0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.R0;
                                float f11 = secretMediaViewer.x0;
                                secretMediaViewer.w0 = o10.w(f11, secretMediaViewer.N0, height2, height);
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
                                    float y11 = secretMediaViewer.T0 - motionEvent.getY();
                                    if (secretMediaViewer.Z0 || ((secretMediaViewer.x0 == 1.0f && Math.abs(y11) + org.telegram.messenger.g0.L(12.0f) < Math.abs(x10)) || secretMediaViewer.x0 != 1.0f)) {
                                        if (!secretMediaViewer.Z0) {
                                            secretMediaViewer.Z0 = true;
                                            secretMediaViewer.c1 = false;
                                            x10 = 0.0f;
                                            y11 = 0.0f;
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
                                                float f15 = secretMediaViewer.w0 - y11;
                                                if (f15 < f14) {
                                                    secretMediaViewer.w0 = f14;
                                                } else {
                                                    if (f15 > f13) {
                                                        secretMediaViewer.w0 = f13;
                                                    }
                                                    f10 = y11;
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
                                            f10 = y11 / 3.0f;
                                            secretMediaViewer.v0 = f12 - x10;
                                            if (secretMediaViewer.x0 != 1.0f) {
                                            }
                                            secretMediaViewer.e.invalidate();
                                        }
                                        f10 = y11;
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
                                    float w10 = o10.w(3.0f, secretMediaViewer.N0, (secretMediaViewer.O0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.Q0, secretMediaViewer.O0 - (secretMediaViewer.e.getWidth() / 2));
                                    float w11 = o10.w(3.0f, secretMediaViewer.N0, (secretMediaViewer.P0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.R0, secretMediaViewer.P0 - (secretMediaViewer.e.getHeight() / 2));
                                    secretMediaViewer.o(3.0f);
                                    float f18 = secretMediaViewer.U0;
                                    if (w10 >= f18) {
                                        f18 = secretMediaViewer.V0;
                                        break;
                                    }
                                    w10 = f18;
                                    float f19 = secretMediaViewer.W0;
                                    if (w11 >= f19) {
                                        f19 = secretMediaViewer.X0;
                                        break;
                                    }
                                    w11 = f19;
                                    secretMediaViewer.c(3.0f, w10, w11, true);
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
    public void setBackgroundColor(int i7) {
        switch (this.a) {
            case 18:
                ((Paint) this.b).setColor(i7);
                break;
            default:
                super.setBackgroundColor(i7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i7, Context context, boolean z10) {
        super(context);
        this.a = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj, Context context, Object obj2, int i7) {
        super(context);
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(org.telegram.ui.Cells.y0 y0Var, Context context) {
        super(context);
        this.a = 13;
        this.c = y0Var;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ch.b0 b0Var, Context context) {
        super(context);
        this.a = 4;
        this.c = b0Var;
        this.b = new bi.i1(this, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(qb qbVar, Context context) {
        super(context);
        this.a = 14;
        this.c = qbVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(uz0 uz0Var, Context context) {
        super(context);
        this.a = 28;
        this.c = uz0Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n5 n5Var, Activity activity) {
        super(activity);
        this.a = 11;
        this.c = n5Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ch.p pVar, Context context) {
        super(context);
        this.a = 3;
        this.c = pVar;
        this.b = new ch.l(this, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Context context, org.telegram.ui.Components.voip.l1 l1Var) {
        super(context);
        this.a = 21;
        this.c = new RectF();
        this.b = l1Var;
        l1Var.a(this);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        o10.l(15.0f, 2131743009, 1, textView, null);
        textView.setGravity(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(-1);
        textView2.setGravity(1);
        textView2.setText(hd.N0(2131743010, null));
        addView(textView, ma.d(-1, -2.0f, 3, 0.0f, 24.0f, 0.0f, 0.0f));
        addView(textView2, ma.d(-1, -2.0f, 3, 0.0f, 50.0f, 0.0f, 0.0f));
    }

    private final void c(boolean z10) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(r7 r7Var, Context context) {
        super(context);
        this.a = 9;
        this.c = r7Var;
        o3 o3Var = new o3();
        o3Var.d = new cb.c(o3Var, 1);
        o3Var.g = new ArrayList();
        o3Var.e = this;
        o3Var.a = context;
        this.b = o3Var;
        setClickable(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(qc0 qc0Var, Context context) {
        super(context);
        this.a = 18;
        this.c = qc0Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Context context, TextView textView, TextView textView2) {
        super(context);
        this.a = 25;
        this.b = textView;
        this.c = textView2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.a = 27;
        this.c = secretMediaViewer;
        this.b = secretMediaViewer;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(s11 s11Var, Context context) {
        super(context);
        this.a = 29;
        this.c = s11Var;
        this.b = new Rect();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Context context, h6 h6Var) {
        super(context);
        this.a = 1;
        LinearLayout g10 = f3.g(context, 1);
        o6 o6Var = new o6(context, false, false, false);
        this.b = o6Var;
        int i7 = m6.G6;
        t6.Y(o6Var, i7, h6Var);
        o6Var.setTextSize(org.telegram.messenger.g0.L(17.0f));
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        g10.addView(o6Var, ma.r(-2, 23, 1));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 11.0f);
        t6.U(textView, i7, h6Var);
        textView.setSingleLine();
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        g10.addView(textView, ma.r(-2, -2, 1));
        addView(g10, ma.e(-2, -2, 17));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Context context, int i7, int i10) {
        super(context);
        this.a = 0;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        o10.l(16.0f, 2131745070, 1, textView, null);
        textView.setTextColor(i7);
        textView.setSingleLine(true);
        textView.setGravity(16);
        addView(textView, ma.d(-2, -1.0f, 3, 54.0f, 0.0f, 40.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
        paint.setColor(i10);
        paint2.setColor(i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(np npVar, Context context) {
        super(context);
        this.a = 16;
        this.c = npVar;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ns nsVar, Activity activity) {
        super(activity);
        this.a = 23;
        this.c = nsVar;
        this.b = nsVar;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 15:
                super(context);
                this.b = new Path();
                this.c = new h6.m(29);
                break;
            default:
                ImageView imageView = new ImageView(context);
                this.b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                addView(imageView, ma.d(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                addView(textView, ma.d(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(xi0 xi0Var, Context context) {
        super(context);
        this.a = 19;
        this.c = xi0Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(h5 h5Var, Context context) {
        super(context);
        this.a = 7;
        this.c = h5Var;
        this.b = new Path();
    }
}
