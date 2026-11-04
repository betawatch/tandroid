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
import b8.mf;
import ci.fc;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class y4 extends FrameLayout implements qe.b, cs, z5, s4 {
    public CharSequence E;
    public CharSequence F;
    public boolean G;
    public boolean H;
    public gh.g I;
    public gh.g J;
    public gh.g K;
    public float L;
    public eh.c M;
    public hh.e N;
    public hh.a O;
    public eh.c P;
    public m10 Q;
    public i5 R;
    public q0 S;
    public final qe.a T;
    public final qe.a U;
    public final qe.a V;
    public j W;
    public final e6 a;
    public boolean a0;
    public final fc b;
    public int b0;
    public final x4 c;
    public boolean c0;
    public e5 d;
    public boolean d0;
    public e5 e;
    public int e0;
    public org.telegram.ui.Components.h6 f;
    public int f0;
    public int g0;
    public org.telegram.ui.Components.h6 h;
    public int h0;
    public int i0;
    public int j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public b5 n;
    public boolean n0;
    public eh.c o0;
    public si.d p0;
    public final RectF q0;
    public FrameLayout r;
    public boolean r0;
    public bh.g s;
    public float s0;
    public ImageView w;
    public TextView x;
    public f5 y;

    public y4(Context context, e6 e6Var) {
        super(context);
        this.L = -1.0f;
        xq xqVar = xq.h;
        this.T = new qe.a(0, this, xqVar, 380L, false);
        this.U = new qe.a(1, this, xqVar, 380L, false);
        this.V = new qe.a(2, this, xqVar, 250L, false);
        this.a0 = true;
        this.n0 = true;
        this.q0 = new RectF();
        this.s0 = 1.0f;
        this.a = e6Var;
        setClipChildren(false);
        setWillNotDraw(false);
        w();
        x4 x4Var = new x4(this, context);
        this.c = x4Var;
        addView(x4Var, mf.e(-1, -2, 51));
        fc fcVar = new fc(this, context);
        this.b = fcVar;
        fcVar.setVisibility(8);
        fcVar.setContentDescription(bd.M0(2131754878, null));
        fcVar.setOnClickListener(new v4(this, 0));
        addView(fcVar, mf.e(46, 46, 51));
    }

    public static /* synthetic */ void e(y4 y4Var, int i3, KeyEvent keyEvent) {
        if (i3 != 3) {
            if (keyEvent == null) {
                return;
            }
            if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                return;
            }
        }
        org.telegram.messenger.g0.v1(y4Var.s);
        m0 searchListener = y4Var.getSearchListener();
        if (searchListener != null) {
            searchListener.k(y4Var.s);
        }
    }

    private int getRowTop() {
        if (this.a0) {
            return org.telegram.messenger.g0.m;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public m0 getSearchListener() {
        f5 f5Var = this.y;
        if (f5Var != null) {
            return f5Var.getSearchListener();
        }
        return null;
    }

    private float getSearchPillLeft() {
        return org.telegram.messenger.g0.L(((Drawable) this.b.c) != null ? 58.0f : 6.0f);
    }

    public static void y(View view, float f10) {
        view.setAlpha(f10);
        view.setVisibility(f10 > 0.0f ? 0 : 4);
    }

    public static void z(View view, int i3, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i3;
        marginLayoutParams.topMargin = i10;
        marginLayoutParams.rightMargin = i11;
    }

    public final void A(CharSequence charSequence, boolean z10, long j10, Interpolator interpolator) {
        if (!t()) {
            setTitle(charSequence);
            return;
        }
        x4 x4Var = this.c;
        x4Var.b(0);
        x4Var.b(1);
        k5[] k5VarArr = (k5[]) x4Var.c;
        k5 k5Var = k5VarArr[0];
        k5 k5Var2 = k5VarArr[1];
        k5VarArr[0] = k5Var2;
        k5VarArr[1] = k5Var;
        k5Var2.animate().cancel();
        k5Var2.k(charSequence);
        k5Var2.setVisibility(0);
        k5Var2.setAlpha(0.0f);
        int L = org.telegram.messenger.g0.L(16.0f);
        if (!z10) {
            L = -L;
        }
        k5Var2.setTranslationY(L);
        k5Var2.animate().alpha(1.0f).translationY(0.0f).setDuration(j10).setInterpolator(interpolator).start();
        k5Var.animate().cancel();
        k5Var.animate().alpha(0.0f).translationY(z10 ? -org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(16.0f)).setDuration(j10).setInterpolator(interpolator).withEndAction(new w4(k5Var, 1)).start();
        x4Var.requestLayout();
    }

    public final void B() {
        if (this.e == null || this.H) {
            return;
        }
        this.H = true;
        e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.g();
        }
        bh.g gVar = this.s;
        if (gVar != null && this.G) {
            org.telegram.messenger.g0.v1(gVar);
        }
        this.U.a(true, t());
        g();
        this.b.b(true, t());
        hs.e().k(hs.r4, new Object[0]);
    }

    public final void C() {
        bh.g gVar = this.s;
        int i3 = k6.G6;
        e6 e6Var = this.a;
        gVar.setTextColor(k6.w0(i3, e6Var));
        this.x.setTextColor(k6.w0(i3, e6Var));
        this.s.setHintTextColor(k6.w0(k6.H6, e6Var));
        this.s.setCursorColor(k6.w0(i3, e6Var));
        this.s.setHighlightColor(k6.w0(k6.ig, e6Var));
        this.s.setHandlesColor(k6.w0(k6.jg, e6Var));
        this.w.setColorFilter(new PorterDuffColorFilter(k6.w0(k6.m6, e6Var), PorterDuff.Mode.SRC_IN));
        this.w.setBackground(k6.h0(this.i0, 1, -1));
    }

    @Override // qe.b
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 != 2) {
            g();
            return;
        }
        ImageView imageView = this.w;
        if (imageView != null) {
            imageView.setAlpha(f10);
            float f12 = (f10 * 0.5f) + 0.5f;
            this.w.setScaleX(f12);
            this.w.setScaleY(f12);
            this.w.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    @Override // org.telegram.ui.ActionBar.s4
    public final boolean a(q0 q0Var, RectF rectF) {
        if (q0Var.getParent() == this.d && getSearchFactor() == 0.0f && getActionModeFactor() == 0.0f) {
            k(rectF);
            return true;
        }
        float L = org.telegram.messenger.g0.L(23.0f);
        View view = (View) q0Var.getParent();
        float width = (q0Var.getWidth() / 2.0f) + q0Var.getX() + (view != null ? view.getX() : 0.0f);
        float currentActionBarHeight = (k.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        rectF.set(width - L, currentActionBarHeight - L, width + L, currentActionBarHeight + L);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public final boolean b() {
        return this.n0;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public final gh.g c(i5 i5Var) {
        eh.c cVar = this.o0;
        if (cVar == null) {
            cVar = this.M;
        }
        if (cVar == null) {
            return null;
        }
        gh.g c2 = cVar.c(i5Var, null, false);
        c2.p(this.N);
        org.telegram.messenger.camera.q.p(c2, org.telegram.messenger.g0.L(23.0f), 6.0f);
        return c2;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public final void d(i5 i5Var, q0 q0Var) {
        this.R = i5Var;
        this.S = q0Var;
        invalidate();
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.n4) {
            updateColors();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b5 b5Var;
        this.c0 = this.d0;
        int L = org.telegram.messenger.g0.L(6.0f);
        if (this.I != null) {
            fc fcVar = this.b;
            if (fcVar.getVisibility() == 0 && fcVar.getAlpha() > 0.0f) {
                float width = (fcVar.getWidth() / 2.0f) + fcVar.getX();
                float height = (fcVar.getHeight() / 2.0f) + fcVar.getY();
                float scaleX = fcVar.getScaleX() * (fcVar.getWidth() / 2.0f);
                float scaleY = fcVar.getScaleY() * (fcVar.getHeight() / 2.0f);
                this.I.setBounds(((int) (width - scaleX)) - L, ((int) (height - scaleY)) - L, ((int) (width + scaleX)) + L, ((int) (height + scaleY)) + L);
                this.I.setAlpha((int) (fcVar.getAlpha() * 255.0f));
                this.I.draw(canvas);
            }
        }
        if (this.K != null && (b5Var = this.n) != null && b5Var.c == a5.a && b5Var.getVisibility() == 0 && this.n.getAlpha() > 0.0f) {
            float width2 = (this.n.getWidth() / 2.0f) + this.n.getX();
            float height2 = (this.n.getHeight() / 2.0f) + this.n.getY();
            float scaleX2 = this.n.getScaleX() * (this.n.getWidth() / 2.0f);
            float scaleY2 = this.n.getScaleY() * (this.n.getHeight() / 2.0f);
            this.K.setBounds(((int) (width2 - scaleX2)) - L, ((int) (height2 - scaleY2)) - L, ((int) (width2 + scaleX2)) + L, ((int) (height2 + scaleY2)) + L);
            this.K.setAlpha((int) (this.n.getAlpha() * 255.0f));
            this.K.draw(canvas);
        }
        if (this.J != null) {
            RectF rectF = this.q0;
            float k10 = k(rectF);
            q0 q0Var = this.S;
            boolean z10 = q0Var != null && q0Var.getParent() == this.d;
            if (k10 > 0.0f && rectF.width() > 0.0f && !z10) {
                float height3 = rectF.height() / 2.0f;
                if (Math.abs(height3 - this.L) > 0.5f) {
                    this.L = height3;
                    this.J.r(height3);
                }
                this.J.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                this.J.setAlpha((int) (k10 * 255.0f));
                this.J.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        q0 q0Var;
        if (view == this.d && (q0Var = this.S) != null && q0Var.getParent() == this.d) {
            return false;
        }
        if (view != this.r || getSearchFactor() >= 1.0f) {
            return super.drawChild(canvas, view, j10);
        }
        RectF rectF = this.q0;
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
        float f10 = 1.0f - actionModeFactor;
        float f11 = searchFactor * f10;
        float f12 = (1.0f - searchFactor) * f10;
        float f13 = this.s0 * f12;
        float T1 = org.telegram.messenger.g0.T1(1.0f, 0.94f, Math.max(searchFactor, actionModeFactor));
        x4 x4Var = this.c;
        y(x4Var, f13);
        x4Var.setScaleX(T1);
        x4Var.setScaleY(T1);
        b5 b5Var = this.n;
        if (b5Var != null) {
            float visibleFactor = b5Var.getVisibleFactor() * f12;
            y(this.n, visibleFactor);
            float T12 = this.n.c == a5.a ? org.telegram.messenger.g0.T1(0.6f, 1.0f, visibleFactor) : org.telegram.messenger.g0.T1(0.8f, 1.0f, f12);
            this.n.setScaleX(T12);
            this.n.setScaleY(T12);
        }
        e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.setTranslationX(-q(false));
            y(this.d, f12);
            float T13 = org.telegram.messenger.g0.T1(0.7f, 1.0f, f12);
            this.d.setPivotX(r11.getWidth() - org.telegram.messenger.g0.L(19.0f));
            this.d.setPivotY(r11.getHeight() / 2.0f);
            this.d.setScaleX(T13);
            this.d.setScaleY(T13);
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!u(childAt) && childAt.getVisibility() != 8) {
                y(childAt, f12);
            }
        }
        e5 e5Var2 = this.e;
        if (e5Var2 != null) {
            y(e5Var2, actionModeFactor);
            float T14 = org.telegram.messenger.g0.T1(0.7f, 1.0f, actionModeFactor);
            this.e.setPivotX(r5.getWidth() - org.telegram.messenger.g0.L(19.0f));
            this.e.setPivotY(r5.getHeight() / 2.0f);
            this.e.setScaleX(T14);
            this.e.setScaleY(T14);
        }
        org.telegram.ui.Components.h6 h6Var = this.f;
        if (h6Var != null) {
            y(h6Var, actionModeFactor);
            this.f.setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f10);
        }
        org.telegram.ui.Components.h6 h6Var2 = this.h;
        if (h6Var2 != null) {
            y(h6Var2, actionModeFactor);
            this.h.setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f10);
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            y(frameLayout, f11);
            RectF rectF = this.q0;
            k(rectF);
            this.r.setTranslationX(Math.max(0.0f, rectF.left - getSearchPillLeft()));
        }
        fc fcVar = this.b;
        if (((Drawable) fcVar.c) != null) {
            fcVar.setVisibility(0);
            fcVar.setAlpha(1.0f);
            fcVar.setScaleX(1.0f);
            fcVar.setScaleY(1.0f);
        } else {
            fcVar.setVisibility(actionModeFactor <= 0.0f ? 8 : 0);
            fcVar.setAlpha(actionModeFactor);
            fcVar.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, actionModeFactor));
            fcVar.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, actionModeFactor));
        }
        fcVar.invalidate();
        invalidate();
    }

    public j getActionBarMenuOnItemClick() {
        return this.W;
    }

    public e5 getActionMode() {
        return this.e;
    }

    public float getActionModeFactor() {
        return this.U.e;
    }

    public org.telegram.ui.Components.h6 getActionModeTitle() {
        l();
        return this.f;
    }

    public View getBackButton() {
        return this.b;
    }

    public Drawable getBackButtonDrawable() {
        return (Drawable) this.b.c;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public int getButtonsGlassBackgroundColor() {
        hh.a aVar = this.O;
        if (aVar == null) {
            aVar = this.N;
        }
        if (aVar != null) {
            return aVar.w0();
        }
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public hh.a getButtonsGlassColorProvider() {
        hh.a aVar = this.O;
        return aVar != null ? aVar : this.N;
    }

    public b5 getDoneButton() {
        return this.n;
    }

    public int getExtraHeight() {
        return this.b0;
    }

    public e5 getMenu() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public hh.a getMenuGlassColorProvider() {
        return this.N;
    }

    public i5 getMenuOverlay() {
        m10 m10Var = this.Q;
        if (m10Var != null) {
            return (i5) m10Var.run();
        }
        return null;
    }

    public float getMenuPillLeft() {
        RectF rectF = this.q0;
        k(rectF);
        return rectF.left;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public e6 getMenuResourcesProvider() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public /* bridge */ /* synthetic */ int getMenuRise() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public View getMenuView() {
        return this.d;
    }

    public boolean getOccupyStatusBar() {
        return this.a0;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public i5 getOpenMenuOverlay() {
        return this.R;
    }

    public float getSearchFactor() {
        return this.T.e;
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

    public k5 getSubtitleTextView() {
        return (k5) this.c.d;
    }

    public String getTitle() {
        k5 k5Var = ((k5[]) this.c.c)[0];
        CharSequence text = k5Var != null ? k5Var.getText() : null;
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        x4 x4Var = this.c;
        x4Var.b(0);
        return ((k5[]) x4Var.c)[0].getTextPaint().getFontMetricsInt();
    }

    public k5 getTitleTextView() {
        return ((k5[]) this.c.c)[0];
    }

    public k5 getTitleTextView2() {
        return ((k5[]) this.c.c)[1];
    }

    public float getTitlesAlpha() {
        return this.s0;
    }

    public final void h() {
        TextView textView;
        if (this.s == null) {
            return;
        }
        m0 searchListener = getSearchListener();
        boolean z10 = this.s.length() > 0 || ((textView = this.x) != null && textView.getVisibility() == 0 && (searchListener == null || searchListener.m())) || (searchListener != null && searchListener.d());
        this.V.a(z10, t() && this.G);
        this.w.setEnabled(z10);
    }

    public final void i() {
        m0 searchListener = getSearchListener();
        if (searchListener == null || searchListener.a()) {
            this.x.setVisibility(8);
            h();
            if (searchListener != null) {
                searchListener.f();
            }
        }
    }

    public final void j(boolean z10) {
        if (this.G) {
            m0 searchListener = getSearchListener();
            if (searchListener == null || searchListener.b()) {
                this.G = false;
                this.s.clearFocus();
                if (z10) {
                    org.telegram.messenger.g0.v1(this.s);
                }
                this.T.a(false, t());
                g();
                if (searchListener != null) {
                    searchListener.h();
                }
            }
        }
    }

    public final float k(RectF rectF) {
        float f10;
        float f11;
        float f12;
        int L = org.telegram.messenger.g0.L(6.0f);
        float L2 = org.telegram.messenger.g0.L(23.0f);
        float currentActionBarHeight = (k.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        e5 e5Var = this.d;
        float pillWidth = (e5Var == null || e5Var.getVisibility() == 8) ? 0.0f : this.d.getPillWidth();
        e5 e5Var2 = this.e;
        float pillWidth2 = e5Var2 != null ? e5Var2.getPillWidth() : 0.0f;
        if (pillWidth <= 0.0f) {
            f10 = actionModeFactor;
            pillWidth = pillWidth2;
        } else if (pillWidth2 <= 0.0f) {
            f10 = 1.0f - actionModeFactor;
        } else {
            pillWidth = org.telegram.messenger.g0.T1(pillWidth, pillWidth2, actionModeFactor);
            f10 = 1.0f;
        }
        float f13 = (1.0f - actionModeFactor) * searchFactor;
        float f14 = L2 * 2.0f;
        float f15 = pillWidth / f14;
        float T1 = org.telegram.messenger.g0.T1(0.8f, 1.0f, f10) * Math.min(1.0f, f15);
        float width = (getWidth() - L) - q(false);
        float max = width - Math.max(pillWidth, f14);
        float f16 = currentActionBarHeight - L2;
        float f17 = currentActionBarHeight + L2;
        if (T1 < 1.0f) {
            float f18 = (max + width) / 2.0f;
            float D = a1.g.D(1.0f, T1, L2, (width - max) / 2.0f);
            float f19 = f18 - D;
            width = f18 + D;
            float f20 = L2 * T1;
            float f21 = currentActionBarHeight - f20;
            f12 = currentActionBarHeight + f20;
            f11 = f21;
            max = f19;
        } else {
            f11 = f16;
            f12 = f17;
        }
        rectF.set(org.telegram.messenger.g0.T1(max, getSearchPillLeft(), f13), org.telegram.messenger.g0.T1(f11, f16, f13), org.telegram.messenger.g0.T1(width, getWidth() - L, f13), org.telegram.messenger.g0.T1(f12, f17, f13));
        return org.telegram.messenger.g0.T1(Math.min(1.0f, f15) * f10, 1.0f, f13);
    }

    public final e5 l() {
        if (this.e == null) {
            e5 e5Var = new e5(getContext(), this, true);
            this.e = e5Var;
            View view = this.b;
            addView(e5Var, indexOfChild(view), mf.e(-2, -2, 53));
            org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(getContext(), true, true, true);
            this.f = h6Var;
            h6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
            this.f.setTypeface(org.telegram.messenger.g0.o());
            this.f.setTextColor(this.h0);
            this.f.setGravity(19);
            this.f.setEllipsizeByGradient(true);
            this.f.b(0.6f, 320L, xq.h);
            addView(this.f, indexOfChild(view), mf.e(-1, -2, 51));
            g();
        }
        return this.e;
    }

    public final void m() {
        eh.c cVar = this.P;
        if (cVar == null) {
            cVar = this.M;
        }
        if (cVar == null) {
            return;
        }
        hh.a aVar = this.O;
        if (aVar == null) {
            aVar = this.N;
        }
        gh.g c2 = cVar.c(this, null, false);
        c2.p(aVar);
        org.telegram.messenger.camera.q.p(c2, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.I = c2;
        gh.g c10 = cVar.c(this, null, false);
        c10.p(aVar);
        org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.J = c10;
        gh.g c11 = cVar.c(this, null, false);
        c11.p(aVar);
        org.telegram.messenger.camera.q.p(c11, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.K = c11;
        this.L = org.telegram.messenger.g0.L(23.0f);
        invalidate();
    }

    public final b5 n(String str) {
        if (this.n == null) {
            b5 b5Var = new b5(getContext(), this, str);
            this.n = b5Var;
            addView(b5Var, indexOfChild(this.b), mf.e(-2, 46, 53));
            g();
        }
        return this.n;
    }

    public final e5 o() {
        if (this.d == null) {
            e5 e5Var = new e5(getContext(), this, false);
            this.d = e5Var;
            addView(e5Var, indexOfChild(this.b), mf.e(-2, -2, 53));
            g();
        }
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d0 = true;
        hs.e().c(this, hs.n4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d0 = false;
        this.c0 = false;
        hs.e().n(this, hs.n4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        super.onLayout(z10, i3, i10, i11, i12);
        int rowTop = getRowTop();
        int currentActionBarHeight = k.getCurrentActionBarHeight();
        int i16 = i11 - i3;
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (!u(childAt) && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.gravity, getLayoutDirection()) & 7;
                if (absoluteGravity == 5) {
                    i14 = i16 - measuredWidth;
                    i15 = layoutParams.rightMargin;
                } else if (absoluteGravity == 1) {
                    i14 = ((i16 - measuredWidth) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else {
                    i13 = layoutParams.leftMargin;
                    int e10 = (k2.p1.e(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                    childAt.layout(i13, e10, measuredWidth + i13, measuredHeight + e10);
                }
                i13 = i14 - i15;
                int e102 = (k2.p1.e(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                childAt.layout(i13, e102, measuredWidth + i13, measuredHeight + e102);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int rowTop = getRowTop();
        int currentActionBarHeight = k.getCurrentActionBarHeight();
        int i11 = rowTop + currentActionBarHeight + this.b0;
        fc fcVar = this.b;
        boolean z10 = ((Drawable) fcVar.c) != null;
        int L = ((currentActionBarHeight - org.telegram.messenger.g0.L(46.0f)) / 2) + rowTop;
        z(fcVar, org.telegram.messenger.g0.L(6.0f), L, 0);
        e5 e5Var = this.d;
        float targetPillWidth = (e5Var == null || e5Var.getVisibility() == 8) ? 0.0f : this.d.getTargetPillWidth();
        float q10 = q(true);
        int max = Math.max(z10 ? org.telegram.messenger.g0.L(64.0f) : org.telegram.messenger.g0.L(18.0f), (targetPillWidth > 0.0f || q10 > 0.0f) ? org.telegram.messenger.g0.L(18.0f) + ((int) (targetPillWidth + q10)) : 0);
        x4 x4Var = this.c;
        if (x4Var.b != max) {
            x4Var.b = max;
            x4Var.requestLayout();
        }
        z(x4Var, 0, rowTop, 0);
        x4Var.getLayoutParams().height = currentActionBarHeight;
        e5 e5Var2 = this.d;
        if (e5Var2 != null) {
            z(e5Var2, 0, rowTop, org.telegram.messenger.g0.L(10.0f));
            this.d.getLayoutParams().height = currentActionBarHeight;
        }
        e5 e5Var3 = this.e;
        if (e5Var3 != null) {
            z(e5Var3, 0, rowTop, org.telegram.messenger.g0.L(10.0f));
            this.e.getLayoutParams().height = currentActionBarHeight;
        }
        if (this.f != null) {
            e5 e5Var4 = this.e;
            int L2 = org.telegram.messenger.g0.L(18.0f) + ((int) (e5Var4 != null ? e5Var4.getTargetPillWidth() : 0.0f));
            org.telegram.ui.Components.h6 h6Var = this.h;
            if (h6Var == null || h6Var.getTag() == null) {
                z(this.f, org.telegram.messenger.g0.L(66.0f), rowTop, L2);
                this.f.getLayoutParams().height = currentActionBarHeight;
            } else {
                int i12 = (currentActionBarHeight / 2) + rowTop;
                z(this.f, org.telegram.messenger.g0.L(66.0f), i12 - org.telegram.messenger.g0.L(22.0f), L2);
                this.f.getLayoutParams().height = org.telegram.messenger.g0.L(22.0f);
                z(this.h, org.telegram.messenger.g0.L(66.0f), org.telegram.messenger.g0.L(1.0f) + i12, L2);
                this.h.getLayoutParams().height = org.telegram.messenger.g0.L(18.0f);
            }
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            z(frameLayout, (int) getSearchPillLeft(), L, org.telegram.messenger.g0.L(6.0f));
        }
        b5 b5Var = this.n;
        if (b5Var != null) {
            z(b5Var, 0, L, org.telegram.messenger.g0.L(6.0f));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return !this.r0;
    }

    public final void p() {
        if (this.r != null) {
            return;
        }
        Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        int i3 = 4;
        frameLayout.setVisibility(4);
        addView(this.r, indexOfChild(this.b), mf.e(-1, 46, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        this.r.addView(linearLayout, mf.d(-1, -1.0f, 51, 18.0f, 0.0f, 42.0f, 0.0f));
        TextView textView = new TextView(context);
        this.x = textView;
        int i10 = 1;
        textView.setTextSize(1, 17.0f);
        this.x.setSingleLine(true);
        this.x.setEllipsize(TextUtils.TruncateAt.END);
        this.x.setGravity(19);
        this.x.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
        this.x.setVisibility(8);
        linearLayout.addView(this.x, mf.o(-2, -1));
        bh.g gVar = new bh.g(i3, context, this);
        this.s = gVar;
        gVar.setTextSize(1, 17.0f);
        this.s.setSingleLine(true);
        this.s.setBackground(null);
        this.s.setPadding(0, 0, 0, 0);
        this.s.setGravity(19);
        bh.g gVar2 = this.s;
        gVar2.setInputType(gVar2.getInputType() | TLObject.FLAG_19);
        this.s.setImeOptions(33554435);
        this.s.setTextIsSelectable(false);
        this.s.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.s.setCursorWidth(1.5f);
        CharSequence charSequence = this.E;
        if (charSequence != null) {
            this.s.setHint(charSequence);
        }
        this.s.setOnEditorActionListener(new ci.o(this, i3));
        this.s.addTextChangedListener(new bh.h(this, 13));
        linearLayout.addView(this.s, mf.l(1.0f, 0, -1));
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.w.setImageResource(R.drawable.ic_close_white);
        this.w.setContentDescription(bd.M0(2131752099, null));
        this.w.setOnClickListener(new v4(this, i10));
        this.r.addView(this.w, mf.d(42, 42.0f, 21, 0.0f, 0.0f, 2.0f, 0.0f));
        C();
        h();
        Y(2, this.V.e, 0.0f, null);
    }

    public final float q(boolean z10) {
        float actionModeFactor;
        b5 b5Var = this.n;
        if (b5Var == null) {
            return 0.0f;
        }
        if (b5Var.getVisibility() == 8 && z10) {
            return 0.0f;
        }
        if (z10) {
            actionModeFactor = this.n.getTargetVisibleFactor();
        } else {
            actionModeFactor = (1.0f - getActionModeFactor()) * (1.0f - getSearchFactor()) * this.n.getVisibleFactor();
        }
        return (org.telegram.messenger.g0.L(12.0f) + this.n.getButtonWidth()) * actionModeFactor;
    }

    public final void r() {
        e5 e5Var = this.e;
        if (e5Var == null || !this.H) {
            return;
        }
        this.H = false;
        e5Var.g();
        this.U.a(false, t());
        g();
        this.b.b(false, t());
        hs.e().k(hs.r4, new Object[0]);
    }

    public final boolean s() {
        return this.e != null && this.H;
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.W = jVar;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        this.b.setContentDescription(charSequence);
    }

    public void setBackButtonDrawable(Drawable drawable) {
        this.b.c(drawable);
        g();
        requestLayout();
    }

    public void setBackButtonImage(int i3) {
        setBackButtonDrawable(i3 != 0 ? getContext().getDrawable(i3).mutate() : null);
    }

    public void setBackButtonImageAnimated(int i3) {
        Drawable mutate = getContext().getDrawable(i3).mutate();
        fc fcVar = this.b;
        Drawable drawable = (Drawable) fcVar.c;
        boolean z10 = drawable != null;
        qe.c cVar = (qe.c) fcVar.f;
        if (drawable == null || !((y4) fcVar.h).t()) {
            fcVar.c(mutate);
        } else {
            Drawable drawable2 = (Drawable) fcVar.c;
            fcVar.c(mutate);
            fcVar.d = drawable2;
            cVar.c(0.0f);
            cVar.a(1.0f);
        }
        if (z10) {
            return;
        }
        g();
        requestLayout();
    }

    public void setButtonsGlass(eh.c cVar) {
        this.P = cVar;
        if (this.M != null) {
            m();
        }
    }

    public void setButtonsGlassColorProvider(hh.a aVar) {
        this.O = aVar;
        if (aVar == null) {
            aVar = this.N;
        }
        gh.g gVar = this.I;
        if (gVar != null) {
            gVar.p(aVar);
            this.J.p(aVar);
            this.K.p(aVar);
        }
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.b.setEnabled(z10);
        e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.setEnabled(z10);
        }
        b5 b5Var = this.n;
        if (b5Var != null) {
            b5Var.setEnabled(z10);
        }
    }

    public void setExtraHeight(int i3) {
        if (this.b0 != i3) {
            this.b0 = i3;
            requestLayout();
        }
    }

    public void setForceSkipTouches(boolean z10) {
        this.r0 = z10;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public void setMenuGlassFrostedProgress(float f10) {
        si.d dVar = this.p0;
        if (dVar != null) {
            dVar.j(f10);
        }
    }

    public void setMenuGlassStroke(boolean z10) {
        this.n0 = z10;
    }

    public void setMenuOverlayProvider(m10 m10Var) {
        this.Q = m10Var;
    }

    public void setOccupyStatusBar(boolean z10) {
        if (this.a0 != z10) {
            this.a0 = z10;
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
        this.E = charSequence;
        bh.g gVar = this.s;
        if (gVar != null) {
            gVar.setHint(charSequence);
        }
    }

    public void setSearchFieldText(CharSequence charSequence) {
        bh.g gVar = this.s;
        if (gVar == null) {
            this.F = charSequence;
            return;
        }
        gVar.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.s.setSelection(charSequence.length());
    }

    public void setSearchItem(f5 f5Var) {
        if (f5Var == null && this.y != null && this.G) {
            j(true);
        }
        this.y = f5Var;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.c.c(charSequence);
    }

    public void setSubtitleAnimated(CharSequence charSequence) {
        if (!t()) {
            setSubtitle(charSequence);
            return;
        }
        x4 x4Var = this.c;
        k5 k5Var = (k5) x4Var.d;
        if (k5Var == null || k5Var.getVisibility() == 8 || TextUtils.isEmpty(charSequence) || TextUtils.equals((CharSequence) x4Var.f, charSequence)) {
            if (TextUtils.equals((CharSequence) x4Var.f, charSequence)) {
                return;
            }
            x4Var.c(charSequence);
            return;
        }
        x4Var.f = charSequence;
        if (((k5) x4Var.e) == null) {
            x4Var.e = x4Var.a();
        }
        k5 k5Var2 = (k5) x4Var.d;
        k5 k5Var3 = (k5) x4Var.e;
        x4Var.d = k5Var3;
        x4Var.e = k5Var2;
        k5Var3.animate().cancel();
        ((k5) x4Var.d).l(charSequence, false);
        ((k5) x4Var.d).setVisibility(0);
        ((k5) x4Var.d).setAlpha(0.0f);
        ((k5) x4Var.d).setTranslationY(org.telegram.messenger.g0.L(6.0f));
        ViewPropertyAnimator duration = ((k5) x4Var.d).animate().alpha(1.0f).translationY(0.0f).setDuration(380L);
        xq xqVar = xq.h;
        duration.setInterpolator(xqVar).start();
        k5Var2.animate().cancel();
        k5Var2.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(6.0f)).setDuration(380L).setInterpolator(xqVar).withEndAction(new w4(k5Var2, 0)).start();
        x4Var.requestLayout();
    }

    public void setSubtitleColor(int i3) {
        this.l0 = true;
        this.f0 = i3;
        this.c.d();
    }

    public void setTitle(CharSequence charSequence) {
        x4 x4Var = this.c;
        x4Var.b(0);
        k5[] k5VarArr = (k5[]) x4Var.c;
        k5 k5Var = k5VarArr[1];
        if (k5Var != null) {
            k5Var.animate().cancel();
            k5VarArr[1].setVisibility(8);
        }
        k5VarArr[0].animate().cancel();
        k5VarArr[0].setAlpha(1.0f);
        k5VarArr[0].setTranslationY(0.0f);
        k5VarArr[0].k(charSequence);
        k5VarArr[0].setVisibility(TextUtils.isEmpty(charSequence) ? 4 : 0);
    }

    public void setTitleColor(int i3) {
        this.k0 = true;
        this.e0 = i3;
        this.c.d();
    }

    public void setTitlesAlpha(float f10) {
        if (this.s0 != f10) {
            this.s0 = f10;
            g();
        }
    }

    public final boolean t() {
        return this.c0 && this.d0;
    }

    public final boolean u(View view) {
        return view == this.b || view == this.c || view == this.d || view == this.e || view == this.f || view == this.h || view == this.r || view == this.n;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        w();
        this.c.d();
        this.b.d();
        e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.i();
        }
        e5 e5Var2 = this.e;
        if (e5Var2 != null) {
            e5Var2.i();
        }
        org.telegram.ui.Components.h6 h6Var = this.f;
        if (h6Var != null) {
            h6Var.setTextColor(this.h0);
        }
        b5 b5Var = this.n;
        if (b5Var != null) {
            b5Var.c();
        }
        org.telegram.ui.Components.h6 h6Var2 = this.h;
        if (h6Var2 != null) {
            h6Var2.setTextColor(this.f0);
        }
        if (this.s != null) {
            C();
        }
        gh.g gVar = this.I;
        if (gVar != null) {
            gVar.updateColors();
        }
        gh.g gVar2 = this.J;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        invalidate();
    }

    public final boolean v(boolean z10, boolean z11) {
        m0 searchListener;
        boolean z12 = false;
        if (this.y == null || this.G || this.H || !((searchListener = getSearchListener()) == null || searchListener.c())) {
            return false;
        }
        p();
        this.G = true;
        e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.g();
        }
        bh.g gVar = this.s;
        CharSequence charSequence = this.F;
        if (charSequence == null) {
            charSequence = "";
        }
        gVar.setText(charSequence);
        this.F = null;
        this.s.requestFocus();
        if (z10) {
            org.telegram.messenger.g0.K3(this.s);
        }
        if (z11 && t()) {
            z12 = true;
        }
        this.T.a(true, z12);
        g();
        if (searchListener != null) {
            searchListener.i();
        }
        return true;
    }

    public final void w() {
        boolean z10 = this.k0;
        e6 e6Var = this.a;
        if (!z10) {
            this.e0 = k6.w0(k6.G6, e6Var);
        }
        if (!this.l0) {
            this.f0 = k6.w0(k6.y6, e6Var);
        }
        if (!this.m0) {
            this.g0 = k6.w0(k6.G6, e6Var);
        }
        this.h0 = k6.w0(k6.G6, e6Var);
        int i3 = k6.i6;
        this.i0 = k6.w0(i3, e6Var);
        this.j0 = k6.w0(i3, e6Var);
    }

    public final void x(int i3, boolean z10) {
        String E = bd.E(i3, ' ');
        l();
        this.f.c(E, z10 && t() && this.H, true);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.ui.ActionBar.s4
    public View getMenuHostView() {
        return this;
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }
}
