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
import bi.nd;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class y4 extends FrameLayout implements te.b, ls, a6, s4 {
    public CharSequence D;
    public CharSequence E;
    public boolean F;
    public boolean G;
    public fh.g H;
    public fh.g I;
    public fh.g J;
    public float K;
    public dh.c L;
    public gh.e M;
    public gh.a N;
    public dh.c O;
    public u10 P;
    public i5 Q;
    public r0 R;
    public final te.a S;
    public final te.a T;
    public final te.a U;
    public j V;
    public boolean W;
    public final f6 a;
    public int a0;
    public final nd b;
    public boolean b0;
    public final x4 c;
    public boolean c0;
    public e5 d;
    public int d0;
    public e5 e;
    public int e0;
    public org.telegram.ui.Components.j6 f;
    public int f0;
    public int g0;
    public org.telegram.ui.Components.j6 h;
    public int h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public b5 n;
    public dh.c n0;
    public ri.d o0;
    public final RectF p0;
    public boolean q0;
    public FrameLayout r;
    public float r0;
    public ah.i s;
    public ImageView w;
    public TextView x;
    public f5 y;

    public y4(Context context, f6 f6Var) {
        super(context);
        this.K = -1.0f;
        xq xqVar = xq.h;
        this.S = new te.a(0, this, xqVar, 380L, false);
        this.T = new te.a(1, this, xqVar, 380L, false);
        this.U = new te.a(2, this, xqVar, 250L, false);
        this.W = true;
        this.m0 = true;
        this.p0 = new RectF();
        this.r0 = 1.0f;
        this.a = f6Var;
        setClipChildren(false);
        setWillNotDraw(false);
        w();
        x4 x4Var = new x4(this, context);
        this.c = x4Var;
        addView(x4Var, ha.e(-1, -2, 51));
        nd ndVar = new nd(this, context);
        this.b = ndVar;
        ndVar.setVisibility(8);
        ndVar.setContentDescription(hd.M0(2131754878, null));
        ndVar.setOnClickListener(new v4(this, 0));
        addView(ndVar, ha.e(46, 46, 51));
    }

    public static /* synthetic */ void e(y4 y4Var, int i7, KeyEvent keyEvent) {
        if (i7 != 3) {
            if (keyEvent == null) {
                return;
            }
            if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                return;
            }
        }
        org.telegram.messenger.g0.v1(y4Var.s);
        n0 searchListener = y4Var.getSearchListener();
        if (searchListener != null) {
            searchListener.k(y4Var.s);
        }
    }

    private int getRowTop() {
        if (this.W) {
            return org.telegram.messenger.g0.m;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public n0 getSearchListener() {
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

    public static void z(View view, int i7, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i7;
        marginLayoutParams.topMargin = i10;
        marginLayoutParams.rightMargin = i11;
    }

    public final void A(CharSequence charSequence, boolean z9, long j3, Interpolator interpolator) {
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
        if (!z9) {
            L = -L;
        }
        k5Var2.setTranslationY(L);
        k5Var2.animate().alpha(1.0f).translationY(0.0f).setDuration(j3).setInterpolator(interpolator).start();
        k5Var.animate().cancel();
        k5Var.animate().alpha(0.0f).translationY(z9 ? -org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(16.0f)).setDuration(j3).setInterpolator(interpolator).withEndAction(new w4(k5Var, 1)).start();
        x4Var.requestLayout();
    }

    public final void B() {
        if (this.e == null || this.G) {
            return;
        }
        this.G = true;
        e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.g();
        }
        ah.i iVar = this.s;
        if (iVar != null && this.F) {
            org.telegram.messenger.g0.v1(iVar);
        }
        this.T.a(true, t());
        g();
        this.b.b(true, t());
        qs.e().k(qs.r4, new Object[0]);
    }

    public final void C() {
        ah.i iVar = this.s;
        int i7 = k6.G6;
        f6 f6Var = this.a;
        iVar.setTextColor(k6.w0(i7, f6Var));
        this.x.setTextColor(k6.w0(i7, f6Var));
        this.s.setHintTextColor(k6.w0(k6.H6, f6Var));
        this.s.setCursorColor(k6.w0(i7, f6Var));
        this.s.setHighlightColor(k6.w0(k6.ig, f6Var));
        this.s.setHandlesColor(k6.w0(k6.jg, f6Var));
        this.w.setColorFilter(new PorterDuffColorFilter(k6.w0(k6.m6, f6Var), PorterDuff.Mode.SRC_IN));
        this.w.setBackground(k6.h0(this.h0, 1, -1));
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 != 2) {
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
    public final boolean a(r0 r0Var, RectF rectF) {
        if (r0Var.getParent() == this.d && getSearchFactor() == 0.0f && getActionModeFactor() == 0.0f) {
            k(rectF);
            return true;
        }
        float L = org.telegram.messenger.g0.L(23.0f);
        View view = (View) r0Var.getParent();
        float width = (r0Var.getWidth() / 2.0f) + r0Var.getX() + (view != null ? view.getX() : 0.0f);
        float currentActionBarHeight = (k.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        rectF.set(width - L, currentActionBarHeight - L, width + L, currentActionBarHeight + L);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public final boolean b() {
        return this.m0;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public final fh.g c(i5 i5Var) {
        dh.c cVar = this.n0;
        if (cVar == null) {
            cVar = this.L;
        }
        if (cVar == null) {
            return null;
        }
        fh.g c10 = cVar.c(i5Var, null, false);
        c10.p(this.M);
        org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        return c10;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public final void d(i5 i5Var, r0 r0Var) {
        this.Q = i5Var;
        this.R = r0Var;
        invalidate();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.n4) {
            updateColors();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b5 b5Var;
        this.b0 = this.c0;
        int L = org.telegram.messenger.g0.L(6.0f);
        if (this.H != null) {
            nd ndVar = this.b;
            if (ndVar.getVisibility() == 0 && ndVar.getAlpha() > 0.0f) {
                float width = (ndVar.getWidth() / 2.0f) + ndVar.getX();
                float height = (ndVar.getHeight() / 2.0f) + ndVar.getY();
                float scaleX = ndVar.getScaleX() * (ndVar.getWidth() / 2.0f);
                float scaleY = ndVar.getScaleY() * (ndVar.getHeight() / 2.0f);
                this.H.setBounds(((int) (width - scaleX)) - L, ((int) (height - scaleY)) - L, ((int) (width + scaleX)) + L, ((int) (height + scaleY)) + L);
                this.H.setAlpha((int) (ndVar.getAlpha() * 255.0f));
                this.H.draw(canvas);
            }
        }
        if (this.J != null && (b5Var = this.n) != null && b5Var.c == a5.a && b5Var.getVisibility() == 0 && this.n.getAlpha() > 0.0f) {
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
            r0 r0Var = this.R;
            boolean z9 = r0Var != null && r0Var.getParent() == this.d;
            if (k10 > 0.0f && rectF.width() > 0.0f && !z9) {
                float height3 = rectF.height() / 2.0f;
                if (Math.abs(height3 - this.K) > 0.5f) {
                    this.K = height3;
                    this.I.r(height3);
                }
                this.I.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                this.I.setAlpha((int) (k10 * 255.0f));
                this.I.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        r0 r0Var;
        if (view == this.d && (r0Var = this.R) != null && r0Var.getParent() == this.d) {
            return false;
        }
        if (view != this.r || getSearchFactor() >= 1.0f) {
            return super.drawChild(canvas, view, j3);
        }
        RectF rectF = this.p0;
        k(rectF);
        canvas.save();
        canvas.clipRect(rectF);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    public final void g() {
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        float f10 = 1.0f - actionModeFactor;
        float f11 = searchFactor * f10;
        float f12 = (1.0f - searchFactor) * f10;
        float f13 = this.r0 * f12;
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
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
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
        org.telegram.ui.Components.j6 j6Var = this.f;
        if (j6Var != null) {
            y(j6Var, actionModeFactor);
            this.f.setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f10);
        }
        org.telegram.ui.Components.j6 j6Var2 = this.h;
        if (j6Var2 != null) {
            y(j6Var2, actionModeFactor);
            this.h.setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f10);
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            y(frameLayout, f11);
            RectF rectF = this.p0;
            k(rectF);
            this.r.setTranslationX(Math.max(0.0f, rectF.left - getSearchPillLeft()));
        }
        nd ndVar = this.b;
        if (((Drawable) ndVar.c) != null) {
            ndVar.setVisibility(0);
            ndVar.setAlpha(1.0f);
            ndVar.setScaleX(1.0f);
            ndVar.setScaleY(1.0f);
        } else {
            ndVar.setVisibility(actionModeFactor <= 0.0f ? 8 : 0);
            ndVar.setAlpha(actionModeFactor);
            ndVar.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, actionModeFactor));
            ndVar.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, actionModeFactor));
        }
        ndVar.invalidate();
        invalidate();
    }

    public j getActionBarMenuOnItemClick() {
        return this.V;
    }

    public e5 getActionMode() {
        return this.e;
    }

    public float getActionModeFactor() {
        return this.T.e;
    }

    public org.telegram.ui.Components.j6 getActionModeTitle() {
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
        gh.a aVar = this.N;
        if (aVar == null) {
            aVar = this.M;
        }
        if (aVar != null) {
            return aVar.e1();
        }
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public gh.a getButtonsGlassColorProvider() {
        gh.a aVar = this.N;
        return aVar != null ? aVar : this.M;
    }

    public b5 getDoneButton() {
        return this.n;
    }

    public int getExtraHeight() {
        return this.a0;
    }

    public e5 getMenu() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public gh.a getMenuGlassColorProvider() {
        return this.M;
    }

    public i5 getMenuOverlay() {
        u10 u10Var = this.P;
        if (u10Var != null) {
            return (i5) u10Var.run();
        }
        return null;
    }

    public float getMenuPillLeft() {
        RectF rectF = this.p0;
        k(rectF);
        return rectF.left;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public f6 getMenuResourcesProvider() {
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
        return this.W;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public i5 getOpenMenuOverlay() {
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
        return this.r0;
    }

    public final void h() {
        TextView textView;
        if (this.s == null) {
            return;
        }
        n0 searchListener = getSearchListener();
        boolean z9 = this.s.length() > 0 || ((textView = this.x) != null && textView.getVisibility() == 0 && (searchListener == null || searchListener.m())) || (searchListener != null && searchListener.d());
        this.U.a(z9, t() && this.F);
        this.w.setEnabled(z9);
    }

    public final void i() {
        n0 searchListener = getSearchListener();
        if (searchListener == null || searchListener.a()) {
            this.x.setVisibility(8);
            h();
            if (searchListener != null) {
                searchListener.f();
            }
        }
    }

    public final void j(boolean z9) {
        if (this.F) {
            n0 searchListener = getSearchListener();
            if (searchListener == null || searchListener.b()) {
                this.F = false;
                this.s.clearFocus();
                if (z9) {
                    org.telegram.messenger.g0.v1(this.s);
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
            float v = com.google.android.recaptcha.internal.a.v(1.0f, T1, L2, (width - max) / 2.0f);
            float f19 = f18 - v;
            width = f18 + v;
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
            addView(e5Var, indexOfChild(view), ha.e(-2, -2, 53));
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getContext(), true, true, true);
            this.f = j6Var;
            j6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
            this.f.setTypeface(org.telegram.messenger.g0.o());
            this.f.setTextColor(this.g0);
            this.f.setGravity(19);
            this.f.setEllipsizeByGradient(true);
            this.f.b(0.6f, 320L, xq.h);
            addView(this.f, indexOfChild(view), ha.e(-1, -2, 51));
            g();
        }
        return this.e;
    }

    public final void m() {
        dh.c cVar = this.O;
        if (cVar == null) {
            cVar = this.L;
        }
        if (cVar == null) {
            return;
        }
        gh.a aVar = this.N;
        if (aVar == null) {
            aVar = this.M;
        }
        fh.g c10 = cVar.c(this, null, false);
        c10.p(aVar);
        org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.H = c10;
        fh.g c11 = cVar.c(this, null, false);
        c11.p(aVar);
        org.telegram.messenger.camera.q.p(c11, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.I = c11;
        fh.g c12 = cVar.c(this, null, false);
        c12.p(aVar);
        org.telegram.messenger.camera.q.p(c12, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.J = c12;
        this.K = org.telegram.messenger.g0.L(23.0f);
        invalidate();
    }

    public final b5 n(String str) {
        if (this.n == null) {
            b5 b5Var = new b5(getContext(), this, str);
            this.n = b5Var;
            addView(b5Var, indexOfChild(this.b), ha.e(-2, 46, 53));
            g();
        }
        return this.n;
    }

    public final e5 o() {
        if (this.d == null) {
            e5 e5Var = new e5(getContext(), this, false);
            this.d = e5Var;
            addView(e5Var, indexOfChild(this.b), ha.e(-2, -2, 53));
            g();
        }
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c0 = true;
        qs.e().c(this, qs.n4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c0 = false;
        this.b0 = false;
        qs.e().n(this, qs.n4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        super.onLayout(z9, i7, i10, i11, i12);
        int rowTop = getRowTop();
        int currentActionBarHeight = k.getCurrentActionBarHeight();
        int i16 = i11 - i7;
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
                    int D = (jg.g.D(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                    childAt.layout(i13, D, measuredWidth + i13, measuredHeight + D);
                }
                i13 = i14 - i15;
                int D2 = (jg.g.D(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                childAt.layout(i13, D2, measuredWidth + i13, measuredHeight + D2);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int rowTop = getRowTop();
        int currentActionBarHeight = k.getCurrentActionBarHeight();
        int i11 = rowTop + currentActionBarHeight + this.a0;
        nd ndVar = this.b;
        boolean z9 = ((Drawable) ndVar.c) != null;
        int L = ((currentActionBarHeight - org.telegram.messenger.g0.L(46.0f)) / 2) + rowTop;
        z(ndVar, org.telegram.messenger.g0.L(6.0f), L, 0);
        e5 e5Var = this.d;
        float targetPillWidth = (e5Var == null || e5Var.getVisibility() == 8) ? 0.0f : this.d.getTargetPillWidth();
        float q10 = q(true);
        int max = Math.max(z9 ? org.telegram.messenger.g0.L(64.0f) : org.telegram.messenger.g0.L(18.0f), (targetPillWidth > 0.0f || q10 > 0.0f) ? org.telegram.messenger.g0.L(18.0f) + ((int) (targetPillWidth + q10)) : 0);
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
            org.telegram.ui.Components.j6 j6Var = this.h;
            if (j6Var == null || j6Var.getTag() == null) {
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
        return !this.q0;
    }

    public final void p() {
        if (this.r != null) {
            return;
        }
        Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        int i7 = 4;
        frameLayout.setVisibility(4);
        addView(this.r, indexOfChild(this.b), ha.e(-1, 46, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        this.r.addView(linearLayout, ha.d(-1, -1.0f, 51, 18.0f, 0.0f, 42.0f, 0.0f));
        TextView textView = new TextView(context);
        this.x = textView;
        int i10 = 1;
        textView.setTextSize(1, 17.0f);
        this.x.setSingleLine(true);
        this.x.setEllipsize(TextUtils.TruncateAt.END);
        this.x.setGravity(19);
        this.x.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
        this.x.setVisibility(8);
        linearLayout.addView(this.x, ha.o(-2, -1));
        ah.i iVar = new ah.i(i7, context, this);
        this.s = iVar;
        iVar.setTextSize(1, 17.0f);
        this.s.setSingleLine(true);
        this.s.setBackground(null);
        this.s.setPadding(0, 0, 0, 0);
        this.s.setGravity(19);
        ah.i iVar2 = this.s;
        iVar2.setInputType(iVar2.getInputType() | TLObject.FLAG_19);
        this.s.setImeOptions(33554435);
        this.s.setTextIsSelectable(false);
        this.s.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.s.setCursorWidth(1.5f);
        CharSequence charSequence = this.D;
        if (charSequence != null) {
            this.s.setHint(charSequence);
        }
        this.s.setOnEditorActionListener(new bi.p(this, i7));
        this.s.addTextChangedListener(new ah.j(this, 13));
        linearLayout.addView(this.s, ha.l(1.0f, 0, -1));
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.w.setImageResource(R.drawable.ic_close_white);
        this.w.setContentDescription(hd.M0(2131752099, null));
        this.w.setOnClickListener(new v4(this, i10));
        this.r.addView(this.w, ha.d(42, 42.0f, 21, 0.0f, 0.0f, 2.0f, 0.0f));
        C();
        h();
        Y(2, this.U.e, 0.0f, null);
    }

    public final float q(boolean z9) {
        float actionModeFactor;
        b5 b5Var = this.n;
        if (b5Var == null) {
            return 0.0f;
        }
        if (b5Var.getVisibility() == 8 && z9) {
            return 0.0f;
        }
        if (z9) {
            actionModeFactor = this.n.getTargetVisibleFactor();
        } else {
            actionModeFactor = (1.0f - getActionModeFactor()) * (1.0f - getSearchFactor()) * this.n.getVisibleFactor();
        }
        return (org.telegram.messenger.g0.L(12.0f) + this.n.getButtonWidth()) * actionModeFactor;
    }

    public final void r() {
        e5 e5Var = this.e;
        if (e5Var == null || !this.G) {
            return;
        }
        this.G = false;
        e5Var.g();
        this.T.a(false, t());
        g();
        this.b.b(false, t());
        qs.e().k(qs.r4, new Object[0]);
    }

    public final boolean s() {
        return this.e != null && this.G;
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.V = jVar;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        this.b.setContentDescription(charSequence);
    }

    public void setBackButtonDrawable(Drawable drawable) {
        this.b.c(drawable);
        g();
        requestLayout();
    }

    public void setBackButtonImage(int i7) {
        setBackButtonDrawable(i7 != 0 ? getContext().getDrawable(i7).mutate() : null);
    }

    public void setBackButtonImageAnimated(int i7) {
        Drawable mutate = getContext().getDrawable(i7).mutate();
        nd ndVar = this.b;
        Drawable drawable = (Drawable) ndVar.c;
        boolean z9 = drawable != null;
        te.c cVar = (te.c) ndVar.f;
        if (drawable == null || !((y4) ndVar.h).t()) {
            ndVar.c(mutate);
        } else {
            Drawable drawable2 = (Drawable) ndVar.c;
            ndVar.c(mutate);
            ndVar.d = drawable2;
            cVar.c(0.0f);
            cVar.a(1.0f);
        }
        if (z9) {
            return;
        }
        g();
        requestLayout();
    }

    public void setButtonsGlass(dh.c cVar) {
        this.O = cVar;
        if (this.L != null) {
            m();
        }
    }

    public void setButtonsGlassColorProvider(gh.a aVar) {
        this.N = aVar;
        if (aVar == null) {
            aVar = this.M;
        }
        fh.g gVar = this.H;
        if (gVar != null) {
            gVar.p(aVar);
            this.I.p(aVar);
            this.J.p(aVar);
        }
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        this.b.setEnabled(z9);
        e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.setEnabled(z9);
        }
        b5 b5Var = this.n;
        if (b5Var != null) {
            b5Var.setEnabled(z9);
        }
    }

    public void setExtraHeight(int i7) {
        if (this.a0 != i7) {
            this.a0 = i7;
            requestLayout();
        }
    }

    public void setForceSkipTouches(boolean z9) {
        this.q0 = z9;
    }

    @Override // org.telegram.ui.ActionBar.s4
    public void setMenuGlassFrostedProgress(float f10) {
        ri.d dVar = this.o0;
        if (dVar != null) {
            dVar.k(f10);
        }
    }

    public void setMenuGlassStroke(boolean z9) {
        this.m0 = z9;
    }

    public void setMenuOverlayProvider(u10 u10Var) {
        this.P = u10Var;
    }

    public void setOccupyStatusBar(boolean z9) {
        if (this.W != z9) {
            this.W = z9;
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
        ah.i iVar = this.s;
        if (iVar != null) {
            iVar.setHint(charSequence);
        }
    }

    public void setSearchFieldText(CharSequence charSequence) {
        ah.i iVar = this.s;
        if (iVar == null) {
            this.E = charSequence;
            return;
        }
        iVar.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.s.setSelection(charSequence.length());
    }

    public void setSearchItem(f5 f5Var) {
        if (f5Var == null && this.y != null && this.F) {
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

    public void setSubtitleColor(int i7) {
        this.k0 = true;
        this.e0 = i7;
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

    public void setTitleColor(int i7) {
        this.j0 = true;
        this.d0 = i7;
        this.c.d();
    }

    public void setTitlesAlpha(float f10) {
        if (this.r0 != f10) {
            this.r0 = f10;
            g();
        }
    }

    public final boolean t() {
        return this.b0 && this.c0;
    }

    public final boolean u(View view) {
        return view == this.b || view == this.c || view == this.d || view == this.e || view == this.f || view == this.h || view == this.r || view == this.n;
    }

    @Override // org.telegram.ui.ActionBar.a6
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
        org.telegram.ui.Components.j6 j6Var = this.f;
        if (j6Var != null) {
            j6Var.setTextColor(this.g0);
        }
        b5 b5Var = this.n;
        if (b5Var != null) {
            b5Var.c();
        }
        org.telegram.ui.Components.j6 j6Var2 = this.h;
        if (j6Var2 != null) {
            j6Var2.setTextColor(this.e0);
        }
        if (this.s != null) {
            C();
        }
        fh.g gVar = this.H;
        if (gVar != null) {
            gVar.updateColors();
        }
        fh.g gVar2 = this.I;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        invalidate();
    }

    public final boolean v(boolean z9, boolean z10) {
        n0 searchListener;
        boolean z11 = false;
        if (this.y == null || this.F || this.G || !((searchListener = getSearchListener()) == null || searchListener.c())) {
            return false;
        }
        p();
        this.F = true;
        e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.g();
        }
        ah.i iVar = this.s;
        CharSequence charSequence = this.E;
        if (charSequence == null) {
            charSequence = "";
        }
        iVar.setText(charSequence);
        this.E = null;
        this.s.requestFocus();
        if (z9) {
            org.telegram.messenger.g0.K3(this.s);
        }
        if (z10 && t()) {
            z11 = true;
        }
        this.S.a(true, z11);
        g();
        if (searchListener != null) {
            searchListener.i();
        }
        return true;
    }

    public final void w() {
        boolean z9 = this.j0;
        f6 f6Var = this.a;
        if (!z9) {
            this.d0 = k6.w0(k6.G6, f6Var);
        }
        if (!this.k0) {
            this.e0 = k6.w0(k6.y6, f6Var);
        }
        if (!this.l0) {
            this.f0 = k6.w0(k6.G6, f6Var);
        }
        this.g0 = k6.w0(k6.G6, f6Var);
        int i7 = k6.i6;
        this.h0 = k6.w0(i7, f6Var);
        this.i0 = k6.w0(i7, f6Var);
    }

    public final void x(int i7, boolean z9) {
        String E = hd.E(i7, ' ');
        l();
        this.f.c(E, z9 && t() && this.G, true);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.ui.ActionBar.s4
    public View getMenuHostView() {
        return this;
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
