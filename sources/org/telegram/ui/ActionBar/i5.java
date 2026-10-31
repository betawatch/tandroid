package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.i20;
import org.telegram.messenger.us;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class i5 extends FrameLayout implements fe.e, us, k6, b5 {
    public CharSequence D;
    public CharSequence E;
    public boolean F;
    public boolean G;
    public vg.f H;
    public vg.f I;
    public vg.f J;
    public float K;
    public tg.b L;
    public wg.d M;
    public wg.a N;
    public tg.b O;
    public i20 P;
    public s5 Q;
    public t0 R;
    public final fe.b S;
    public final fe.b T;
    public final fe.b U;
    public k V;
    public boolean W;
    public final p6 a;
    public int a0;
    public final f5 b;
    public boolean b0;
    public final h5 c;
    public boolean c0;
    public o5 d;
    public int d0;
    public o5 e;
    public int e0;
    public org.telegram.ui.Components.f6 f;
    public int f0;
    public int g0;
    public org.telegram.ui.Components.f6 h;
    public int h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public l5 n;
    public tg.b n0;
    public hi.d o0;
    public final RectF p0;
    public boolean q0;
    public FrameLayout r;
    public float r0;
    public n0 s;
    public ImageView w;
    public TextView x;
    public p5 y;

    public i5(Context context, p6 p6Var) {
        super(context);
        this.K = -1.0f;
        gr grVar = gr.h;
        this.S = new fe.b(0, this, grVar, 380L, false);
        this.T = new fe.b(1, this, grVar, 380L, false);
        this.U = new fe.b(2, this, grVar, 250L, false);
        this.W = true;
        this.m0 = true;
        this.p0 = new RectF();
        this.r0 = 1.0f;
        this.a = p6Var;
        setClipChildren(false);
        setWillNotDraw(false);
        x();
        h5 h5Var = new h5(this, context);
        this.c = h5Var;
        addView(h5Var, w7.b6.e(-1, -2, 51));
        f5 f5Var = new f5(this, context);
        this.b = f5Var;
        f5Var.setVisibility(8);
        f5Var.setContentDescription(cd.L0(2131754878, null));
        f5Var.setOnClickListener(new e5(this, 0));
        addView(f5Var, w7.b6.e(46, 46, 51));
    }

    public static void A(View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i10;
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.rightMargin = i12;
    }

    public static /* synthetic */ void e(i5 i5Var, int i10, KeyEvent keyEvent) {
        if (i10 != 3) {
            if (keyEvent == null) {
                return;
            }
            if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                return;
            }
        }
        org.telegram.messenger.i0.v1(i5Var.s);
        p0 searchListener = i5Var.getSearchListener();
        if (searchListener != null) {
            searchListener.k(i5Var.s);
        }
    }

    private int getRowTop() {
        if (this.W) {
            return org.telegram.messenger.i0.m;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public p0 getSearchListener() {
        p5 p5Var = this.y;
        if (p5Var != null) {
            return p5Var.getSearchListener();
        }
        return null;
    }

    private float getSearchPillLeft() {
        return org.telegram.messenger.i0.L(((Drawable) this.b.b) != null ? 58.0f : 6.0f);
    }

    public static void z(View view, float f7) {
        view.setAlpha(f7);
        view.setVisibility(f7 > 0.0f ? 0 : 4);
    }

    public final void B(CharSequence charSequence, boolean z10, long j10, Interpolator interpolator) {
        if (!t()) {
            setTitle(charSequence);
            return;
        }
        h5 h5Var = this.c;
        h5Var.b(0);
        h5Var.b(1);
        u5[] u5VarArr = (u5[]) h5Var.c;
        u5 u5Var = u5VarArr[0];
        u5 u5Var2 = u5VarArr[1];
        u5VarArr[0] = u5Var2;
        u5VarArr[1] = u5Var;
        u5Var2.animate().cancel();
        u5Var2.k(charSequence);
        u5Var2.setVisibility(0);
        u5Var2.setAlpha(0.0f);
        int L = org.telegram.messenger.i0.L(16.0f);
        if (!z10) {
            L = -L;
        }
        u5Var2.setTranslationY(L);
        u5Var2.animate().alpha(1.0f).translationY(0.0f).setDuration(j10).setInterpolator(interpolator).start();
        u5Var.animate().cancel();
        u5Var.animate().alpha(0.0f).translationY(z10 ? -org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(16.0f)).setDuration(j10).setInterpolator(interpolator).withEndAction(new g5(u5Var, 1)).start();
        h5Var.requestLayout();
    }

    public final void C() {
        if (this.e == null || this.G) {
            return;
        }
        this.G = true;
        o5 o5Var = this.d;
        if (o5Var != null) {
            o5Var.g();
        }
        n0 n0Var = this.s;
        if (n0Var != null && this.F) {
            org.telegram.messenger.i0.v1(n0Var);
        }
        this.T.a(true, t());
        g();
        this.b.b(true, t());
        zs.e().k(zs.r4, new Object[0]);
    }

    public final void D() {
        n0 n0Var = this.s;
        int i10 = t6.G6;
        p6 p6Var = this.a;
        n0Var.setTextColor(t6.w0(i10, p6Var));
        this.x.setTextColor(t6.w0(i10, p6Var));
        this.s.setHintTextColor(t6.w0(t6.H6, p6Var));
        this.s.setCursorColor(t6.w0(i10, p6Var));
        this.s.setHighlightColor(t6.w0(t6.ig, p6Var));
        this.s.setHandlesColor(t6.w0(t6.jg, p6Var));
        this.w.setColorFilter(new PorterDuffColorFilter(t6.w0(t6.m6, p6Var), PorterDuff.Mode.SRC_IN));
        this.w.setBackground(t6.h0(this.h0, 1, -1));
    }

    @Override // org.telegram.ui.ActionBar.b5
    public final boolean a(t0 t0Var, RectF rectF) {
        if (t0Var.getParent() == this.d && getSearchFactor() == 0.0f && getActionModeFactor() == 0.0f) {
            k(rectF);
            return true;
        }
        float L = org.telegram.messenger.i0.L(23.0f);
        View view = (View) t0Var.getParent();
        float width = (t0Var.getWidth() / 2.0f) + t0Var.getX() + (view != null ? view.getX() : 0.0f);
        float currentActionBarHeight = (l.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        rectF.set(width - L, currentActionBarHeight - L, width + L, currentActionBarHeight + L);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public final boolean b() {
        return this.m0;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public final vg.f c(s5 s5Var) {
        tg.b bVar = this.n0;
        if (bVar == null) {
            bVar = this.L;
        }
        if (bVar == null) {
            return null;
        }
        vg.f c10 = bVar.c(s5Var, null, false);
        c10.o(this.M);
        z20.u(c10, org.telegram.messenger.i0.L(23.0f), 6.0f);
        return c10;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public final void d(s5 s5Var, t0 t0Var) {
        this.Q = s5Var;
        this.R = t0Var;
        invalidate();
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.n4) {
            updateColors();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        l5 l5Var;
        this.b0 = this.c0;
        int L = org.telegram.messenger.i0.L(6.0f);
        if (this.H != null) {
            f5 f5Var = this.b;
            if (f5Var.getVisibility() == 0 && f5Var.getAlpha() > 0.0f) {
                float width = (f5Var.getWidth() / 2.0f) + f5Var.getX();
                float height = (f5Var.getHeight() / 2.0f) + f5Var.getY();
                float scaleX = f5Var.getScaleX() * (f5Var.getWidth() / 2.0f);
                float scaleY = f5Var.getScaleY() * (f5Var.getHeight() / 2.0f);
                this.H.setBounds(((int) (width - scaleX)) - L, ((int) (height - scaleY)) - L, ((int) (width + scaleX)) + L, ((int) (height + scaleY)) + L);
                this.H.setAlpha((int) (f5Var.getAlpha() * 255.0f));
                this.H.draw(canvas);
            }
        }
        if (this.J != null && (l5Var = this.n) != null && l5Var.c == k5.a && l5Var.getVisibility() == 0 && this.n.getAlpha() > 0.0f) {
            float width2 = (this.n.getWidth() / 2.0f) + this.n.getX();
            float height2 = (this.n.getHeight() / 2.0f) + this.n.getY();
            float scaleX2 = this.n.getScaleX() * (this.n.getWidth() / 2.0f);
            float scaleY2 = this.n.getScaleY() * (this.n.getHeight() / 2.0f);
            this.J.setBounds(((int) (width2 - scaleX2)) - L, ((int) (height2 - scaleY2)) - L, ((int) (width2 + scaleX2)) + L, ((int) (height2 + scaleY2)) + L);
            this.J.setAlpha((int) (this.n.getAlpha() * 255.0f));
            this.J.draw(canvas);
        }
        if (this.I != null) {
            RectF rectF = this.p0;
            float k10 = k(rectF);
            t0 t0Var = this.R;
            boolean z10 = t0Var != null && t0Var.getParent() == this.d;
            if (k10 > 0.0f && rectF.width() > 0.0f && !z10) {
                float height3 = rectF.height() / 2.0f;
                if (Math.abs(height3 - this.K) > 0.5f) {
                    this.K = height3;
                    this.I.q(height3);
                }
                this.I.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                this.I.setAlpha((int) (k10 * 255.0f));
                this.I.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        t0 t0Var;
        if (view == this.d && (t0Var = this.R) != null && t0Var.getParent() == this.d) {
            return false;
        }
        if (view != this.r || getSearchFactor() >= 1.0f) {
            return super.drawChild(canvas, view, j10);
        }
        RectF rectF = this.p0;
        k(rectF);
        canvas.save();
        canvas.clipRect(rectF);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void g() {
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        float f7 = 1.0f - actionModeFactor;
        float f10 = searchFactor * f7;
        float f11 = (1.0f - searchFactor) * f7;
        float f12 = this.r0 * f11;
        float T1 = org.telegram.messenger.i0.T1(1.0f, 0.94f, Math.max(searchFactor, actionModeFactor));
        h5 h5Var = this.c;
        z(h5Var, f12);
        h5Var.setScaleX(T1);
        h5Var.setScaleY(T1);
        l5 l5Var = this.n;
        if (l5Var != null) {
            float visibleFactor = l5Var.getVisibleFactor() * f11;
            z(this.n, visibleFactor);
            float T12 = this.n.c == k5.a ? org.telegram.messenger.i0.T1(0.6f, 1.0f, visibleFactor) : org.telegram.messenger.i0.T1(0.8f, 1.0f, f11);
            this.n.setScaleX(T12);
            this.n.setScaleY(T12);
        }
        o5 o5Var = this.d;
        if (o5Var != null) {
            o5Var.setTranslationX(-q(false));
            z(this.d, f11);
            float T13 = org.telegram.messenger.i0.T1(0.7f, 1.0f, f11);
            this.d.setPivotX(r11.getWidth() - org.telegram.messenger.i0.L(19.0f));
            this.d.setPivotY(r11.getHeight() / 2.0f);
            this.d.setScaleX(T13);
            this.d.setScaleY(T13);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (!u(childAt) && childAt.getVisibility() != 8) {
                z(childAt, f11);
            }
        }
        o5 o5Var2 = this.e;
        if (o5Var2 != null) {
            z(o5Var2, actionModeFactor);
            float T14 = org.telegram.messenger.i0.T1(0.7f, 1.0f, actionModeFactor);
            this.e.setPivotX(r5.getWidth() - org.telegram.messenger.i0.L(19.0f));
            this.e.setPivotY(r5.getHeight() / 2.0f);
            this.e.setScaleX(T14);
            this.e.setScaleY(T14);
        }
        org.telegram.ui.Components.f6 f6Var = this.f;
        if (f6Var != null) {
            z(f6Var, actionModeFactor);
            this.f.setTranslationX((-org.telegram.messenger.i0.L(16.0f)) * f7);
        }
        org.telegram.ui.Components.f6 f6Var2 = this.h;
        if (f6Var2 != null) {
            z(f6Var2, actionModeFactor);
            this.h.setTranslationX((-org.telegram.messenger.i0.L(16.0f)) * f7);
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            z(frameLayout, f10);
            RectF rectF = this.p0;
            k(rectF);
            this.r.setTranslationX(Math.max(0.0f, rectF.left - getSearchPillLeft()));
        }
        f5 f5Var = this.b;
        if (((Drawable) f5Var.b) != null) {
            f5Var.setVisibility(0);
            f5Var.setAlpha(1.0f);
            f5Var.setScaleX(1.0f);
            f5Var.setScaleY(1.0f);
        } else {
            f5Var.setVisibility(actionModeFactor <= 0.0f ? 8 : 0);
            f5Var.setAlpha(actionModeFactor);
            f5Var.setScaleX(org.telegram.messenger.i0.T1(0.6f, 1.0f, actionModeFactor));
            f5Var.setScaleY(org.telegram.messenger.i0.T1(0.6f, 1.0f, actionModeFactor));
        }
        f5Var.invalidate();
        invalidate();
    }

    public k getActionBarMenuOnItemClick() {
        return this.V;
    }

    public o5 getActionMode() {
        return this.e;
    }

    public float getActionModeFactor() {
        return this.T.e;
    }

    public org.telegram.ui.Components.f6 getActionModeTitle() {
        l();
        return this.f;
    }

    public View getBackButton() {
        return this.b;
    }

    public Drawable getBackButtonDrawable() {
        return (Drawable) this.b.b;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public int getButtonsGlassBackgroundColor() {
        wg.a aVar = this.N;
        if (aVar == null) {
            aVar = this.M;
        }
        if (aVar != null) {
            return aVar.n0();
        }
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public wg.a getButtonsGlassColorProvider() {
        wg.a aVar = this.N;
        return aVar != null ? aVar : this.M;
    }

    public l5 getDoneButton() {
        return this.n;
    }

    public int getExtraHeight() {
        return this.a0;
    }

    public o5 getMenu() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public wg.a getMenuGlassColorProvider() {
        return this.M;
    }

    public s5 getMenuOverlay() {
        i20 i20Var = this.P;
        if (i20Var != null) {
            return (s5) i20Var.run();
        }
        return null;
    }

    public float getMenuPillLeft() {
        RectF rectF = this.p0;
        k(rectF);
        return rectF.left;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public p6 getMenuResourcesProvider() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public View getMenuView() {
        return this.d;
    }

    public boolean getOccupyStatusBar() {
        return this.W;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public s5 getOpenMenuOverlay() {
        return this.Q;
    }

    public float getSearchFactor() {
        return this.S.e;
    }

    public EditTextBoldCursor getSearchField() {
        p();
        return this.s;
    }

    public String getSubtitle() {
        CharSequence charSequence = (CharSequence) this.c.f;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public u5 getSubtitleTextView() {
        return (u5) this.c.d;
    }

    public String getTitle() {
        u5 u5Var = ((u5[]) this.c.c)[0];
        CharSequence text = u5Var != null ? u5Var.getText() : null;
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        h5 h5Var = this.c;
        h5Var.b(0);
        return ((u5[]) h5Var.c)[0].getTextPaint().getFontMetricsInt();
    }

    public u5 getTitleTextView() {
        return ((u5[]) this.c.c)[0];
    }

    public u5 getTitleTextView2() {
        return ((u5[]) this.c.c)[1];
    }

    public float getTitlesAlpha() {
        return this.r0;
    }

    public final void h() {
        TextView textView;
        if (this.s == null) {
            return;
        }
        p0 searchListener = getSearchListener();
        boolean z10 = this.s.length() > 0 || ((textView = this.x) != null && textView.getVisibility() == 0 && (searchListener == null || searchListener.m())) || (searchListener != null && searchListener.d());
        this.U.a(z10, t() && this.F);
        this.w.setEnabled(z10);
    }

    public final void i() {
        p0 searchListener = getSearchListener();
        if (searchListener == null || searchListener.a()) {
            this.x.setVisibility(8);
            h();
            if (searchListener != null) {
                searchListener.f();
            }
        }
    }

    public final void j(boolean z10) {
        if (this.F) {
            p0 searchListener = getSearchListener();
            if (searchListener == null || searchListener.b()) {
                this.F = false;
                this.s.clearFocus();
                if (z10) {
                    org.telegram.messenger.i0.v1(this.s);
                }
                this.S.a(false, t());
                g();
                if (searchListener != null) {
                    searchListener.h();
                }
            }
        }
    }

    public final float k(RectF rectF) {
        float f7;
        float f10;
        float f11;
        int L = org.telegram.messenger.i0.L(6.0f);
        float L2 = org.telegram.messenger.i0.L(23.0f);
        float currentActionBarHeight = (l.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        o5 o5Var = this.d;
        float pillWidth = (o5Var == null || o5Var.getVisibility() == 8) ? 0.0f : this.d.getPillWidth();
        o5 o5Var2 = this.e;
        float pillWidth2 = o5Var2 != null ? o5Var2.getPillWidth() : 0.0f;
        if (pillWidth <= 0.0f) {
            f7 = actionModeFactor;
            pillWidth = pillWidth2;
        } else if (pillWidth2 <= 0.0f) {
            f7 = 1.0f - actionModeFactor;
        } else {
            pillWidth = org.telegram.messenger.i0.T1(pillWidth, pillWidth2, actionModeFactor);
            f7 = 1.0f;
        }
        float f12 = (1.0f - actionModeFactor) * searchFactor;
        float f13 = L2 * 2.0f;
        float f14 = pillWidth / f13;
        float T1 = org.telegram.messenger.i0.T1(0.8f, 1.0f, f7) * Math.min(1.0f, f14);
        float width = (getWidth() - L) - q(false);
        float max = width - Math.max(pillWidth, f13);
        float f15 = currentActionBarHeight - L2;
        float f16 = currentActionBarHeight + L2;
        if (T1 < 1.0f) {
            float f17 = (max + width) / 2.0f;
            float z10 = sc.e.z(1.0f, T1, L2, (width - max) / 2.0f);
            float f18 = f17 - z10;
            width = f17 + z10;
            float f19 = L2 * T1;
            float f20 = currentActionBarHeight - f19;
            f11 = currentActionBarHeight + f19;
            f10 = f20;
            max = f18;
        } else {
            f10 = f15;
            f11 = f16;
        }
        rectF.set(org.telegram.messenger.i0.T1(max, getSearchPillLeft(), f12), org.telegram.messenger.i0.T1(f10, f15, f12), org.telegram.messenger.i0.T1(width, getWidth() - L, f12), org.telegram.messenger.i0.T1(f11, f16, f12));
        return org.telegram.messenger.i0.T1(Math.min(1.0f, f14) * f7, 1.0f, f12);
    }

    public final o5 l() {
        if (this.e == null) {
            o5 o5Var = new o5(getContext(), this, true);
            this.e = o5Var;
            View view = this.b;
            addView(o5Var, indexOfChild(view), w7.b6.e(-2, -2, 53));
            org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(getContext(), true, true, true);
            this.f = f6Var;
            f6Var.setTextSize(org.telegram.messenger.i0.L(18.0f));
            this.f.setTypeface(org.telegram.messenger.i0.o());
            this.f.setTextColor(this.g0);
            this.f.setGravity(19);
            this.f.setEllipsizeByGradient(true);
            this.f.b(0.6f, 320L, gr.h);
            addView(this.f, indexOfChild(view), w7.b6.e(-1, -2, 51));
            g();
        }
        return this.e;
    }

    public final void m() {
        tg.b bVar = this.O;
        if (bVar == null) {
            bVar = this.L;
        }
        if (bVar == null) {
            return;
        }
        wg.a aVar = this.N;
        if (aVar == null) {
            aVar = this.M;
        }
        vg.f c10 = bVar.c(this, null, false);
        c10.o(aVar);
        z20.u(c10, org.telegram.messenger.i0.L(23.0f), 6.0f);
        this.H = c10;
        vg.f c11 = bVar.c(this, null, false);
        c11.o(aVar);
        z20.u(c11, org.telegram.messenger.i0.L(23.0f), 6.0f);
        this.I = c11;
        vg.f c12 = bVar.c(this, null, false);
        c12.o(aVar);
        z20.u(c12, org.telegram.messenger.i0.L(23.0f), 6.0f);
        this.J = c12;
        this.K = org.telegram.messenger.i0.L(23.0f);
        invalidate();
    }

    public final l5 n(String str) {
        if (this.n == null) {
            l5 l5Var = new l5(getContext(), this, str);
            this.n = l5Var;
            addView(l5Var, indexOfChild(this.b), w7.b6.e(-2, 46, 53));
            g();
        }
        return this.n;
    }

    public final o5 o() {
        if (this.d == null) {
            o5 o5Var = new o5(getContext(), this, false);
            this.d = o5Var;
            addView(o5Var, indexOfChild(this.b), w7.b6.e(-2, -2, 53));
            g();
        }
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c0 = true;
        zs.e().c(this, zs.n4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c0 = false;
        this.b0 = false;
        zs.e().n(this, zs.n4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        super.onLayout(z10, i10, i11, i12, i13);
        int rowTop = getRowTop();
        int currentActionBarHeight = l.getCurrentActionBarHeight();
        int i17 = i12 - i10;
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (!u(childAt) && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.gravity, getLayoutDirection()) & 7;
                if (absoluteGravity == 5) {
                    i15 = i17 - measuredWidth;
                    i16 = layoutParams.rightMargin;
                } else if (absoluteGravity == 1) {
                    i15 = ((i17 - measuredWidth) / 2) + layoutParams.leftMargin;
                    i16 = layoutParams.rightMargin;
                } else {
                    i14 = layoutParams.leftMargin;
                    int u10 = (i0.a.u(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                    childAt.layout(i14, u10, measuredWidth + i14, measuredHeight + u10);
                }
                i14 = i15 - i16;
                int u102 = (i0.a.u(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                childAt.layout(i14, u102, measuredWidth + i14, measuredHeight + u102);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int rowTop = getRowTop();
        int currentActionBarHeight = l.getCurrentActionBarHeight();
        int i12 = rowTop + currentActionBarHeight + this.a0;
        f5 f5Var = this.b;
        boolean z10 = ((Drawable) f5Var.b) != null;
        int L = ((currentActionBarHeight - org.telegram.messenger.i0.L(46.0f)) / 2) + rowTop;
        A(f5Var, org.telegram.messenger.i0.L(6.0f), L, 0);
        o5 o5Var = this.d;
        float targetPillWidth = (o5Var == null || o5Var.getVisibility() == 8) ? 0.0f : this.d.getTargetPillWidth();
        float q6 = q(true);
        int max = Math.max(z10 ? org.telegram.messenger.i0.L(64.0f) : org.telegram.messenger.i0.L(18.0f), (targetPillWidth > 0.0f || q6 > 0.0f) ? org.telegram.messenger.i0.L(18.0f) + ((int) (targetPillWidth + q6)) : 0);
        h5 h5Var = this.c;
        if (h5Var.b != max) {
            h5Var.b = max;
            h5Var.requestLayout();
        }
        A(h5Var, 0, rowTop, 0);
        h5Var.getLayoutParams().height = currentActionBarHeight;
        o5 o5Var2 = this.d;
        if (o5Var2 != null) {
            A(o5Var2, 0, rowTop, org.telegram.messenger.i0.L(10.0f));
            this.d.getLayoutParams().height = currentActionBarHeight;
        }
        o5 o5Var3 = this.e;
        if (o5Var3 != null) {
            A(o5Var3, 0, rowTop, org.telegram.messenger.i0.L(10.0f));
            this.e.getLayoutParams().height = currentActionBarHeight;
        }
        if (this.f != null) {
            o5 o5Var4 = this.e;
            int L2 = org.telegram.messenger.i0.L(18.0f) + ((int) (o5Var4 != null ? o5Var4.getTargetPillWidth() : 0.0f));
            org.telegram.ui.Components.f6 f6Var = this.h;
            if (f6Var == null || f6Var.getTag() == null) {
                A(this.f, org.telegram.messenger.i0.L(66.0f), rowTop, L2);
                this.f.getLayoutParams().height = currentActionBarHeight;
            } else {
                int i13 = (currentActionBarHeight / 2) + rowTop;
                A(this.f, org.telegram.messenger.i0.L(66.0f), i13 - org.telegram.messenger.i0.L(22.0f), L2);
                this.f.getLayoutParams().height = org.telegram.messenger.i0.L(22.0f);
                A(this.h, org.telegram.messenger.i0.L(66.0f), org.telegram.messenger.i0.L(1.0f) + i13, L2);
                this.h.getLayoutParams().height = org.telegram.messenger.i0.L(18.0f);
            }
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            A(frameLayout, (int) getSearchPillLeft(), L, org.telegram.messenger.i0.L(6.0f));
        }
        l5 l5Var = this.n;
        if (l5Var != null) {
            A(l5Var, 0, L, org.telegram.messenger.i0.L(6.0f));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return !this.q0;
    }

    public final void p() {
        if (this.r != null) {
            return;
        }
        Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setVisibility(4);
        addView(this.r, indexOfChild(this.b), w7.b6.e(-1, 46, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        this.r.addView(linearLayout, w7.b6.d(-1, -1.0f, 51, 18.0f, 0.0f, 42.0f, 0.0f));
        TextView textView = new TextView(context);
        this.x = textView;
        int i10 = 1;
        textView.setTextSize(1, 17.0f);
        this.x.setSingleLine(true);
        this.x.setEllipsize(TextUtils.TruncateAt.END);
        this.x.setGravity(19);
        this.x.setPadding(0, 0, org.telegram.messenger.i0.L(4.0f), 0);
        int i11 = 8;
        this.x.setVisibility(8);
        linearLayout.addView(this.x, w7.b6.o(-2, -1));
        n0 n0Var = new n0(this, context, i10);
        this.s = n0Var;
        n0Var.setTextSize(1, 17.0f);
        this.s.setSingleLine(true);
        this.s.setBackground(null);
        this.s.setPadding(0, 0, 0, 0);
        this.s.setGravity(19);
        n0 n0Var2 = this.s;
        n0Var2.setInputType(n0Var2.getInputType() | TLObject.FLAG_19);
        this.s.setImeOptions(33554435);
        this.s.setTextIsSelectable(false);
        this.s.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        this.s.setCursorWidth(1.5f);
        CharSequence charSequence = this.D;
        if (charSequence != null) {
            this.s.setHint(charSequence);
        }
        this.s.setOnEditorActionListener(new ag.r1(this, 3));
        this.s.addTextChangedListener(new ag.a1(this, i11));
        linearLayout.addView(this.s, w7.b6.l(1.0f, 0, -1));
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.w.setImageResource(R.drawable.ic_close_white);
        this.w.setContentDescription(cd.L0(2131752099, null));
        this.w.setOnClickListener(new e5(this, i10));
        this.r.addView(this.w, w7.b6.d(42, 42.0f, 21, 0.0f, 0.0f, 2.0f, 0.0f));
        D();
        h();
        v(2, this.U.e, 0.0f, null);
    }

    public final float q(boolean z10) {
        float actionModeFactor;
        l5 l5Var = this.n;
        if (l5Var == null) {
            return 0.0f;
        }
        if (l5Var.getVisibility() == 8 && z10) {
            return 0.0f;
        }
        if (z10) {
            actionModeFactor = this.n.getTargetVisibleFactor();
        } else {
            actionModeFactor = (1.0f - getActionModeFactor()) * (1.0f - getSearchFactor()) * this.n.getVisibleFactor();
        }
        return (org.telegram.messenger.i0.L(12.0f) + this.n.getButtonWidth()) * actionModeFactor;
    }

    public final void r() {
        o5 o5Var = this.e;
        if (o5Var == null || !this.G) {
            return;
        }
        this.G = false;
        o5Var.g();
        this.T.a(false, t());
        g();
        this.b.b(false, t());
        zs.e().k(zs.r4, new Object[0]);
    }

    public final boolean s() {
        return this.e != null && this.G;
    }

    public void setActionBarMenuOnItemClick(k kVar) {
        this.V = kVar;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        this.b.setContentDescription(charSequence);
    }

    public void setBackButtonDrawable(Drawable drawable) {
        this.b.c(drawable);
        g();
        requestLayout();
    }

    public void setBackButtonImage(int i10) {
        setBackButtonDrawable(i10 != 0 ? getContext().getDrawable(i10).mutate() : null);
    }

    public void setBackButtonImageAnimated(int i10) {
        Drawable mutate = getContext().getDrawable(i10).mutate();
        f5 f5Var = this.b;
        Drawable drawable = (Drawable) f5Var.b;
        boolean z10 = drawable != null;
        fe.f fVar = (fe.f) f5Var.f;
        if (drawable == null || !((i5) f5Var.h).t()) {
            f5Var.c(mutate);
        } else {
            Drawable drawable2 = (Drawable) f5Var.b;
            f5Var.c(mutate);
            f5Var.c = drawable2;
            fVar.c(0.0f);
            fVar.a(1.0f);
        }
        if (z10) {
            return;
        }
        g();
        requestLayout();
    }

    public void setButtonsGlass(tg.b bVar) {
        this.O = bVar;
        if (this.L != null) {
            m();
        }
    }

    public void setButtonsGlassColorProvider(wg.a aVar) {
        this.N = aVar;
        if (aVar == null) {
            aVar = this.M;
        }
        vg.f fVar = this.H;
        if (fVar != null) {
            fVar.o(aVar);
            this.I.o(aVar);
            this.J.o(aVar);
        }
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.b.setEnabled(z10);
        o5 o5Var = this.d;
        if (o5Var != null) {
            o5Var.setEnabled(z10);
        }
        l5 l5Var = this.n;
        if (l5Var != null) {
            l5Var.setEnabled(z10);
        }
    }

    public void setExtraHeight(int i10) {
        if (this.a0 != i10) {
            this.a0 = i10;
            requestLayout();
        }
    }

    public void setForceSkipTouches(boolean z10) {
        this.q0 = z10;
    }

    @Override // org.telegram.ui.ActionBar.b5
    public void setMenuGlassFrostedProgress(float f7) {
        hi.d dVar = this.o0;
        if (dVar != null) {
            dVar.b(f7);
        }
    }

    public void setMenuGlassStroke(boolean z10) {
        this.m0 = z10;
    }

    public void setMenuOverlayProvider(i20 i20Var) {
        this.P = i20Var;
    }

    public void setOccupyStatusBar(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            requestLayout();
        }
    }

    public void setSearchFieldCaption(CharSequence charSequence) {
        p();
        this.x.setText(charSequence);
        this.x.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        h();
    }

    public void setSearchFieldHint(CharSequence charSequence) {
        this.D = charSequence;
        n0 n0Var = this.s;
        if (n0Var != null) {
            n0Var.setHint(charSequence);
        }
    }

    public void setSearchFieldText(CharSequence charSequence) {
        n0 n0Var = this.s;
        if (n0Var == null) {
            this.E = charSequence;
            return;
        }
        n0Var.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.s.setSelection(charSequence.length());
    }

    public void setSearchItem(p5 p5Var) {
        if (p5Var == null && this.y != null && this.F) {
            j(true);
        }
        this.y = p5Var;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.c.c(charSequence);
    }

    public void setSubtitleAnimated(CharSequence charSequence) {
        if (!t()) {
            setSubtitle(charSequence);
            return;
        }
        h5 h5Var = this.c;
        u5 u5Var = (u5) h5Var.d;
        if (u5Var == null || u5Var.getVisibility() == 8 || TextUtils.isEmpty(charSequence) || TextUtils.equals((CharSequence) h5Var.f, charSequence)) {
            if (TextUtils.equals((CharSequence) h5Var.f, charSequence)) {
                return;
            }
            h5Var.c(charSequence);
            return;
        }
        h5Var.f = charSequence;
        if (((u5) h5Var.e) == null) {
            h5Var.e = h5Var.a();
        }
        u5 u5Var2 = (u5) h5Var.d;
        u5 u5Var3 = (u5) h5Var.e;
        h5Var.d = u5Var3;
        h5Var.e = u5Var2;
        u5Var3.animate().cancel();
        ((u5) h5Var.d).l(charSequence, false);
        ((u5) h5Var.d).setVisibility(0);
        ((u5) h5Var.d).setAlpha(0.0f);
        ((u5) h5Var.d).setTranslationY(org.telegram.messenger.i0.L(6.0f));
        ViewPropertyAnimator duration = ((u5) h5Var.d).animate().alpha(1.0f).translationY(0.0f).setDuration(380L);
        gr grVar = gr.h;
        duration.setInterpolator(grVar).start();
        u5Var2.animate().cancel();
        u5Var2.animate().alpha(0.0f).translationY(-org.telegram.messenger.i0.L(6.0f)).setDuration(380L).setInterpolator(grVar).withEndAction(new g5(u5Var2, 0)).start();
        h5Var.requestLayout();
    }

    public void setSubtitleColor(int i10) {
        this.k0 = true;
        this.e0 = i10;
        this.c.d();
    }

    public void setTitle(CharSequence charSequence) {
        h5 h5Var = this.c;
        h5Var.b(0);
        u5[] u5VarArr = (u5[]) h5Var.c;
        u5 u5Var = u5VarArr[1];
        if (u5Var != null) {
            u5Var.animate().cancel();
            u5VarArr[1].setVisibility(8);
        }
        u5VarArr[0].animate().cancel();
        u5VarArr[0].setAlpha(1.0f);
        u5VarArr[0].setTranslationY(0.0f);
        u5VarArr[0].k(charSequence);
        u5VarArr[0].setVisibility(TextUtils.isEmpty(charSequence) ? 4 : 0);
    }

    public void setTitleColor(int i10) {
        this.j0 = true;
        this.d0 = i10;
        this.c.d();
    }

    public void setTitlesAlpha(float f7) {
        if (this.r0 != f7) {
            this.r0 = f7;
            g();
        }
    }

    public final boolean t() {
        return this.b0 && this.c0;
    }

    public final boolean u(View view) {
        return view == this.b || view == this.c || view == this.d || view == this.e || view == this.f || view == this.h || view == this.r || view == this.n;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        x();
        this.c.d();
        this.b.d();
        o5 o5Var = this.d;
        if (o5Var != null) {
            o5Var.i();
        }
        o5 o5Var2 = this.e;
        if (o5Var2 != null) {
            o5Var2.i();
        }
        org.telegram.ui.Components.f6 f6Var = this.f;
        if (f6Var != null) {
            f6Var.setTextColor(this.g0);
        }
        l5 l5Var = this.n;
        if (l5Var != null) {
            l5Var.c();
        }
        org.telegram.ui.Components.f6 f6Var2 = this.h;
        if (f6Var2 != null) {
            f6Var2.setTextColor(this.e0);
        }
        if (this.s != null) {
            D();
        }
        vg.f fVar = this.H;
        if (fVar != null) {
            fVar.updateColors();
        }
        vg.f fVar2 = this.I;
        if (fVar2 != null) {
            fVar2.updateColors();
        }
        invalidate();
    }

    @Override // fe.e
    public void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 != 2) {
            g();
            return;
        }
        ImageView imageView = this.w;
        if (imageView != null) {
            imageView.setAlpha(f7);
            float f11 = (f7 * 0.5f) + 0.5f;
            this.w.setScaleX(f11);
            this.w.setScaleY(f11);
            this.w.setVisibility(f7 > 0.0f ? 0 : 4);
        }
    }

    public final boolean w(boolean z10, boolean z11) {
        p0 searchListener;
        boolean z12 = false;
        if (this.y == null || this.F || this.G || !((searchListener = getSearchListener()) == null || searchListener.c())) {
            return false;
        }
        p();
        this.F = true;
        o5 o5Var = this.d;
        if (o5Var != null) {
            o5Var.g();
        }
        n0 n0Var = this.s;
        CharSequence charSequence = this.E;
        if (charSequence == null) {
            charSequence = "";
        }
        n0Var.setText(charSequence);
        this.E = null;
        this.s.requestFocus();
        if (z10) {
            org.telegram.messenger.i0.J3(this.s);
        }
        if (z11 && t()) {
            z12 = true;
        }
        this.S.a(true, z12);
        g();
        if (searchListener != null) {
            searchListener.i();
        }
        return true;
    }

    public final void x() {
        boolean z10 = this.j0;
        p6 p6Var = this.a;
        if (!z10) {
            this.d0 = t6.w0(t6.G6, p6Var);
        }
        if (!this.k0) {
            this.e0 = t6.w0(t6.y6, p6Var);
        }
        if (!this.l0) {
            this.f0 = t6.w0(t6.G6, p6Var);
        }
        this.g0 = t6.w0(t6.G6, p6Var);
        int i10 = t6.i6;
        this.h0 = t6.w0(i10, p6Var);
        this.i0 = t6.w0(i10, p6Var);
    }

    public final void y(int i10, boolean z10) {
        String E = cd.E(i10, ' ');
        l();
        this.f.c(E, z10 && t() && this.G, true);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.ui.ActionBar.b5
    public View getMenuHostView() {
        return this;
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
