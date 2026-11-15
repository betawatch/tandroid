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
import c8.ja;
import di.ub;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class w4 extends FrameLayout implements te.b, is, z5, q4 {
    public CharSequence E;
    public CharSequence F;
    public boolean G;
    public boolean H;
    public fh.g I;
    public fh.g J;
    public fh.g K;
    public float L;
    public dh.c M;
    public gh.e N;
    public gh.a O;
    public dh.c P;
    public r10 Q;
    public g5 R;
    public q0 S;
    public final te.a T;
    public final te.a U;
    public final te.a V;
    public j W;
    public final e6 a;
    public boolean a0;
    public final ub b;
    public int b0;
    public final v4 c;
    public boolean c0;
    public c5 d;
    public boolean d0;
    public c5 e;
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
    public z4 n;
    public boolean n0;
    public dh.c o0;
    public ui.d p0;
    public final RectF q0;
    public FrameLayout r;
    public int r0;
    public ah.i s;
    public boolean s0;
    public float t0;
    public ImageView w;
    public TextView x;
    public d5 y;

    public w4(Context context, e6 e6Var) {
        super(context);
        this.L = -1.0f;
        er erVar = er.h;
        this.T = new te.a(0, this, erVar, 380L, false);
        this.U = new te.a(1, this, erVar, 380L, false);
        this.V = new te.a(2, this, erVar, 250L, false);
        this.a0 = true;
        this.n0 = true;
        this.q0 = new RectF();
        this.t0 = 1.0f;
        this.a = e6Var;
        setClipChildren(false);
        setWillNotDraw(false);
        z();
        v4 v4Var = new v4(this, context);
        this.c = v4Var;
        addView(v4Var, ja.e(-1, -2, 51));
        ub ubVar = new ub(this, context);
        this.b = ubVar;
        ubVar.setVisibility(8);
        ubVar.setContentDescription(hd.M0(2131754878, null));
        ubVar.setOnClickListener(new t4(this, 0));
        addView(ubVar, ja.e(46, 46, 51));
    }

    public static void B(View view, float f10) {
        view.setAlpha(f10);
        view.setVisibility(f10 > 0.0f ? 0 : 4);
    }

    public static void C(View view, int i7, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i7;
        marginLayoutParams.topMargin = i10;
        marginLayoutParams.rightMargin = i11;
    }

    public static /* synthetic */ void c(w4 w4Var, int i7, KeyEvent keyEvent) {
        if (i7 != 3) {
            if (keyEvent == null) {
                return;
            }
            if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                return;
            }
        }
        org.telegram.messenger.g0.v1(w4Var.s);
        m0 searchListener = w4Var.getSearchListener();
        if (searchListener != null) {
            searchListener.k(w4Var.s);
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
        d5 d5Var = this.y;
        if (d5Var != null) {
            return d5Var.getSearchListener();
        }
        return null;
    }

    private float getSearchPillLeft() {
        return org.telegram.messenger.g0.L(((Drawable) this.b.c) != null ? 58.0f : 6.0f);
    }

    public final void A(int i7, boolean z10) {
        String E = hd.E(i7, ' ');
        o();
        this.f.c(E, z10 && w() && this.H, true);
    }

    public final void D(CharSequence charSequence, boolean z10, long j3, Interpolator interpolator) {
        if (!w()) {
            setTitle(charSequence);
            return;
        }
        v4 v4Var = this.c;
        v4Var.b(0);
        v4Var.b(1);
        j5[] j5VarArr = (j5[]) v4Var.c;
        j5 j5Var = j5VarArr[0];
        j5 j5Var2 = j5VarArr[1];
        j5VarArr[0] = j5Var2;
        j5VarArr[1] = j5Var;
        j5Var2.animate().cancel();
        j5Var2.k(charSequence);
        j5Var2.setVisibility(0);
        j5Var2.setAlpha(0.0f);
        int L = org.telegram.messenger.g0.L(16.0f);
        if (!z10) {
            L = -L;
        }
        j5Var2.setTranslationY(L);
        j5Var2.animate().alpha(1.0f).translationY(0.0f).setDuration(j3).setInterpolator(interpolator).start();
        j5Var.animate().cancel();
        j5Var.animate().alpha(0.0f).translationY(z10 ? -org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(16.0f)).setDuration(j3).setInterpolator(interpolator).withEndAction(new u4(j5Var, 1)).start();
        v4Var.requestLayout();
    }

    public final void F() {
        if (this.e == null || this.H) {
            return;
        }
        this.H = true;
        c5 c5Var = this.d;
        if (c5Var != null) {
            c5Var.g();
        }
        ah.i iVar = this.s;
        if (iVar != null && this.G) {
            org.telegram.messenger.g0.v1(iVar);
        }
        this.U.a(true, w());
        j();
        this.b.b(true, w());
        ns.e().k(ns.r4, new Object[0]);
    }

    @Override // te.b
    public void G(int i7, float f10, float f11, te.c cVar) {
        if (i7 != 2) {
            j();
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

    public final void H() {
        ah.i iVar = this.s;
        int i7 = j6.G6;
        e6 e6Var = this.a;
        iVar.setTextColor(j6.w0(i7, e6Var));
        this.x.setTextColor(j6.w0(i7, e6Var));
        this.s.setHintTextColor(j6.w0(j6.H6, e6Var));
        this.s.setCursorColor(j6.w0(i7, e6Var));
        this.s.setHighlightColor(j6.w0(j6.lg, e6Var));
        this.s.setHandlesColor(j6.w0(j6.mg, e6Var));
        this.w.setColorFilter(new PorterDuffColorFilter(j6.w0(j6.m6, e6Var), PorterDuff.Mode.SRC_IN));
        this.w.setBackground(j6.h0(this.i0, 1, -1));
    }

    @Override // org.telegram.ui.ActionBar.q4
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public final boolean b(q0 q0Var, RectF rectF) {
        if (q0Var.getParent() == this.d && getSearchFactor() == 0.0f && getActionModeFactor() == 0.0f) {
            n(rectF);
            return true;
        }
        float L = org.telegram.messenger.g0.L(23.0f);
        View view = (View) q0Var.getParent();
        float width = (q0Var.getWidth() / 2.0f) + q0Var.getX() + (view != null ? view.getX() : 0.0f);
        float currentActionBarHeight = (k.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        rectF.set(width - L, currentActionBarHeight - L, width + L, currentActionBarHeight + L);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public final /* synthetic */ boolean d() {
        return true;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.n4) {
            updateColors();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        z4 z4Var;
        this.c0 = this.d0;
        int L = org.telegram.messenger.g0.L(6.0f);
        if (this.I != null) {
            ub ubVar = this.b;
            if (ubVar.getVisibility() == 0 && ubVar.getAlpha() > 0.0f) {
                float width = (ubVar.getWidth() / 2.0f) + ubVar.getX();
                float height = (ubVar.getHeight() / 2.0f) + ubVar.getY();
                float scaleX = ubVar.getScaleX() * (ubVar.getWidth() / 2.0f);
                float scaleY = ubVar.getScaleY() * (ubVar.getHeight() / 2.0f);
                this.I.setBounds(((int) (width - scaleX)) - L, ((int) (height - scaleY)) - L, ((int) (width + scaleX)) + L, ((int) (height + scaleY)) + L);
                this.I.setAlpha((int) (ubVar.getAlpha() * 255.0f));
                this.I.draw(canvas);
            }
        }
        if (this.K != null && (z4Var = this.n) != null && z4Var.c == y4.a && z4Var.getVisibility() == 0 && this.n.getAlpha() > 0.0f) {
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
            float n10 = n(rectF);
            q0 q0Var = this.S;
            boolean z10 = q0Var != null && q0Var.getParent() == this.d;
            if (n10 > 0.0f && rectF.width() > 0.0f && !z10) {
                float height3 = rectF.height() / 2.0f;
                if (Math.abs(height3 - this.L) > 0.5f) {
                    this.L = height3;
                    this.J.r(height3);
                }
                this.J.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                this.J.setAlpha((int) (n10 * 255.0f));
                this.J.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        q0 q0Var;
        if (view == this.d && (q0Var = this.S) != null && q0Var.getParent() == this.d) {
            return false;
        }
        if (view != this.r || getSearchFactor() >= 1.0f) {
            return super.drawChild(canvas, view, j3);
        }
        RectF rectF = this.q0;
        n(rectF);
        canvas.save();
        canvas.clipRect(rectF);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public final boolean e() {
        return this.n0;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public final fh.g g(g5 g5Var) {
        dh.c cVar = this.o0;
        if (cVar == null) {
            cVar = this.M;
        }
        if (cVar == null) {
            return null;
        }
        fh.g c10 = cVar.c(g5Var, null, false);
        c10.p(this.N);
        i20.r(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        return c10;
    }

    public j getActionBarMenuOnItemClick() {
        return this.W;
    }

    public c5 getActionMode() {
        return this.e;
    }

    public float getActionModeFactor() {
        return this.U.e;
    }

    public org.telegram.ui.Components.h6 getActionModeTitle() {
        o();
        return this.f;
    }

    public View getBackButton() {
        return this.b;
    }

    public Drawable getBackButtonDrawable() {
        return (Drawable) this.b.c;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public int getButtonsGlassBackgroundColor() {
        gh.a aVar = this.O;
        if (aVar == null) {
            aVar = this.N;
        }
        if (aVar != null) {
            return aVar.A2();
        }
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public gh.a getButtonsGlassColorProvider() {
        gh.a aVar = this.O;
        return aVar != null ? aVar : this.N;
    }

    public z4 getDoneButton() {
        return this.n;
    }

    public int getExtraHeight() {
        return this.b0;
    }

    public c5 getMenu() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public /* bridge */ /* synthetic */ int getMenuDimAlpha() {
        return -1;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public /* bridge */ /* synthetic */ int getMenuExtraBelow() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public gh.a getMenuGlassColorProvider() {
        return this.N;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public /* bridge */ /* synthetic */ int getMenuMaxHeight() {
        return 0;
    }

    public g5 getMenuOverlay() {
        r10 r10Var = this.Q;
        if (r10Var != null) {
            return (g5) r10Var.run();
        }
        return null;
    }

    public float getMenuPillLeft() {
        RectF rectF = this.q0;
        n(rectF);
        return rectF.left;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public e6 getMenuResourcesProvider() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public /* bridge */ /* synthetic */ int getMenuRise() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public View getMenuView() {
        return this.d;
    }

    public boolean getOccupyStatusBar() {
        return this.a0;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public g5 getOpenMenuOverlay() {
        return this.R;
    }

    public float getSearchFactor() {
        return this.T.e;
    }

    public EditTextBoldCursor getSearchField() {
        s();
        return this.s;
    }

    public String getSubtitle() {
        CharSequence charSequence = (CharSequence) this.c.f;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public j5 getSubtitleTextView() {
        return (j5) this.c.d;
    }

    public String getTitle() {
        j5 j5Var = ((j5[]) this.c.c)[0];
        CharSequence text = j5Var != null ? j5Var.getText() : null;
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        v4 v4Var = this.c;
        v4Var.b(0);
        return ((j5[]) v4Var.c)[0].getTextPaint().getFontMetricsInt();
    }

    public j5 getTitleTextView() {
        return ((j5[]) this.c.c)[0];
    }

    public j5 getTitleTextView2() {
        return ((j5[]) this.c.c)[1];
    }

    public float getTitlesAlpha() {
        return this.t0;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public final void h(g5 g5Var, q0 q0Var) {
        this.R = g5Var;
        this.S = q0Var;
        invalidate();
    }

    public final void j() {
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        float f10 = 1.0f - actionModeFactor;
        float f11 = searchFactor * f10;
        float f12 = (1.0f - searchFactor) * f10;
        float f13 = this.t0 * f12;
        float T1 = org.telegram.messenger.g0.T1(1.0f, 0.94f, Math.max(searchFactor, actionModeFactor));
        v4 v4Var = this.c;
        B(v4Var, f13);
        v4Var.setScaleX(T1);
        v4Var.setScaleY(T1);
        z4 z4Var = this.n;
        if (z4Var != null) {
            float visibleFactor = z4Var.getVisibleFactor() * f12;
            B(this.n, visibleFactor);
            float T12 = this.n.c == y4.a ? org.telegram.messenger.g0.T1(0.6f, 1.0f, visibleFactor) : org.telegram.messenger.g0.T1(0.8f, 1.0f, f12);
            this.n.setScaleX(T12);
            this.n.setScaleY(T12);
        }
        c5 c5Var = this.d;
        if (c5Var != null) {
            c5Var.setTranslationX(-t(false));
            B(this.d, f12);
            float T13 = org.telegram.messenger.g0.T1(0.7f, 1.0f, f12);
            this.d.setPivotX(r11.getWidth() - org.telegram.messenger.g0.L(19.0f));
            this.d.setPivotY(r11.getHeight() / 2.0f);
            this.d.setScaleX(T13);
            this.d.setScaleY(T13);
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (!x(childAt) && childAt.getVisibility() != 8) {
                B(childAt, f12);
            }
        }
        c5 c5Var2 = this.e;
        if (c5Var2 != null) {
            B(c5Var2, actionModeFactor);
            float T14 = org.telegram.messenger.g0.T1(0.7f, 1.0f, actionModeFactor);
            this.e.setPivotX(r5.getWidth() - org.telegram.messenger.g0.L(19.0f));
            this.e.setPivotY(r5.getHeight() / 2.0f);
            this.e.setScaleX(T14);
            this.e.setScaleY(T14);
        }
        org.telegram.ui.Components.h6 h6Var = this.f;
        if (h6Var != null) {
            B(h6Var, actionModeFactor);
            this.f.setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f10);
        }
        org.telegram.ui.Components.h6 h6Var2 = this.h;
        if (h6Var2 != null) {
            B(h6Var2, actionModeFactor);
            this.h.setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f10);
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            B(frameLayout, f11);
            RectF rectF = this.q0;
            n(rectF);
            this.r.setTranslationX(Math.max(0.0f, rectF.left - getSearchPillLeft()));
        }
        ub ubVar = this.b;
        if (((Drawable) ubVar.c) != null) {
            ubVar.setVisibility(0);
            ubVar.setAlpha(1.0f);
            ubVar.setScaleX(1.0f);
            ubVar.setScaleY(1.0f);
        } else {
            ubVar.setVisibility(actionModeFactor <= 0.0f ? 8 : 0);
            ubVar.setAlpha(actionModeFactor);
            ubVar.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, actionModeFactor));
            ubVar.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, actionModeFactor));
        }
        ubVar.invalidate();
        invalidate();
    }

    public final void k() {
        TextView textView;
        if (this.s == null) {
            return;
        }
        m0 searchListener = getSearchListener();
        boolean z10 = this.s.length() > 0 || ((textView = this.x) != null && textView.getVisibility() == 0 && (searchListener == null || searchListener.m())) || (searchListener != null && searchListener.d());
        this.V.a(z10, w() && this.G);
        this.w.setEnabled(z10);
    }

    public final void l() {
        m0 searchListener = getSearchListener();
        if (searchListener == null || searchListener.a()) {
            this.x.setVisibility(8);
            k();
            if (searchListener != null) {
                searchListener.f();
            }
        }
    }

    public final void m(boolean z10) {
        if (this.G) {
            m0 searchListener = getSearchListener();
            if (searchListener == null || searchListener.b()) {
                this.G = false;
                this.s.clearFocus();
                if (z10) {
                    org.telegram.messenger.g0.v1(this.s);
                }
                this.T.a(false, w());
                j();
                if (searchListener != null) {
                    searchListener.h();
                }
            }
        }
    }

    public final float n(RectF rectF) {
        float f10;
        float f11;
        float f12;
        int L = org.telegram.messenger.g0.L(6.0f);
        float L2 = org.telegram.messenger.g0.L(23.0f);
        float currentActionBarHeight = (k.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        c5 c5Var = this.d;
        float pillWidth = (c5Var == null || c5Var.getVisibility() == 8) ? 0.0f : this.d.getPillWidth();
        c5 c5Var2 = this.e;
        float pillWidth2 = c5Var2 != null ? c5Var2.getPillWidth() : 0.0f;
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
        float width = (getWidth() - L) - t(false);
        float max = width - Math.max(pillWidth, f14);
        float f16 = currentActionBarHeight - L2;
        float f17 = currentActionBarHeight + L2;
        if (T1 < 1.0f) {
            float f18 = (max + width) / 2.0f;
            float t6 = com.google.android.gms.internal.vision.e2.t(1.0f, T1, L2, (width - max) / 2.0f);
            float f19 = f18 - t6;
            width = f18 + t6;
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

    public final c5 o() {
        if (this.e == null) {
            c5 c5Var = new c5(getContext(), this, true);
            this.e = c5Var;
            View view = this.b;
            addView(c5Var, indexOfChild(view), ja.e(-2, -2, 53));
            org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(getContext(), true, true, true);
            this.f = h6Var;
            h6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
            this.f.setTypeface(org.telegram.messenger.g0.o());
            this.f.setTextColor(this.h0);
            this.f.setGravity(19);
            this.f.setEllipsizeByGradient(true);
            this.f.b(0.6f, 320L, er.h);
            addView(this.f, indexOfChild(view), ja.e(-1, -2, 51));
            j();
        }
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d0 = true;
        ns.e().c(this, ns.n4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d0 = false;
        this.c0 = false;
        ns.e().n(this, ns.n4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        super.onLayout(z10, i7, i10, i11, i12);
        int rowTop = getRowTop();
        int currentActionBarHeight = k.getCurrentActionBarHeight();
        int i16 = i11 - i7;
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (!x(childAt) && childAt.getVisibility() != 8) {
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
                    int e10 = (i5.c.e(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                    childAt.layout(i13, e10, measuredWidth + i13, measuredHeight + e10);
                }
                i13 = i14 - i15;
                int e102 = (i5.c.e(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                childAt.layout(i13, e102, measuredWidth + i13, measuredHeight + e102);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int rowTop = getRowTop();
        int currentActionBarHeight = k.getCurrentActionBarHeight();
        int i11 = rowTop + currentActionBarHeight + this.b0;
        ub ubVar = this.b;
        boolean z10 = ((Drawable) ubVar.c) != null;
        int L = ((currentActionBarHeight - org.telegram.messenger.g0.L(46.0f)) / 2) + rowTop;
        C(ubVar, org.telegram.messenger.g0.L(6.0f), L, 0);
        c5 c5Var = this.d;
        float targetPillWidth = (c5Var == null || c5Var.getVisibility() == 8) ? 0.0f : this.d.getTargetPillWidth();
        float t6 = t(true);
        int max = Math.max(Math.max(z10 ? org.telegram.messenger.g0.L(64.0f) : org.telegram.messenger.g0.L(18.0f), (targetPillWidth > 0.0f || t6 > 0.0f) ? org.telegram.messenger.g0.L(18.0f) + ((int) (targetPillWidth + t6)) : 0), this.r0);
        v4 v4Var = this.c;
        if (v4Var.b != max) {
            v4Var.b = max;
            v4Var.requestLayout();
        }
        C(v4Var, 0, rowTop, 0);
        v4Var.getLayoutParams().height = currentActionBarHeight;
        c5 c5Var2 = this.d;
        if (c5Var2 != null) {
            C(c5Var2, 0, rowTop, org.telegram.messenger.g0.L(10.0f));
            this.d.getLayoutParams().height = currentActionBarHeight;
        }
        c5 c5Var3 = this.e;
        if (c5Var3 != null) {
            C(c5Var3, 0, rowTop, org.telegram.messenger.g0.L(10.0f));
            this.e.getLayoutParams().height = currentActionBarHeight;
        }
        if (this.f != null) {
            c5 c5Var4 = this.e;
            int L2 = org.telegram.messenger.g0.L(18.0f) + ((int) (c5Var4 != null ? c5Var4.getTargetPillWidth() : 0.0f));
            org.telegram.ui.Components.h6 h6Var = this.h;
            if (h6Var == null || h6Var.getTag() == null) {
                C(this.f, org.telegram.messenger.g0.L(66.0f), rowTop, L2);
                this.f.getLayoutParams().height = currentActionBarHeight;
            } else {
                int i12 = (currentActionBarHeight / 2) + rowTop;
                C(this.f, org.telegram.messenger.g0.L(66.0f), i12 - org.telegram.messenger.g0.L(22.0f), L2);
                this.f.getLayoutParams().height = org.telegram.messenger.g0.L(22.0f);
                C(this.h, org.telegram.messenger.g0.L(66.0f), org.telegram.messenger.g0.L(1.0f) + i12, L2);
                this.h.getLayoutParams().height = org.telegram.messenger.g0.L(18.0f);
            }
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            C(frameLayout, (int) getSearchPillLeft(), L, org.telegram.messenger.g0.L(6.0f));
        }
        z4 z4Var = this.n;
        if (z4Var != null) {
            C(z4Var, 0, L, org.telegram.messenger.g0.L(6.0f));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return !this.s0;
    }

    public final void p() {
        dh.c cVar = this.P;
        if (cVar == null) {
            cVar = this.M;
        }
        if (cVar == null) {
            return;
        }
        gh.a aVar = this.O;
        if (aVar == null) {
            aVar = this.N;
        }
        fh.g c10 = cVar.c(this, null, false);
        c10.p(aVar);
        i20.r(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.I = c10;
        fh.g c11 = cVar.c(this, null, false);
        c11.p(aVar);
        i20.r(c11, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.J = c11;
        fh.g c12 = cVar.c(this, null, false);
        c12.p(aVar);
        i20.r(c12, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.K = c12;
        this.L = org.telegram.messenger.g0.L(23.0f);
        invalidate();
    }

    public final z4 q(String str) {
        if (this.n == null) {
            z4 z4Var = new z4(getContext(), this, str);
            this.n = z4Var;
            addView(z4Var, indexOfChild(this.b), ja.e(-2, 46, 53));
            j();
        }
        return this.n;
    }

    public final c5 r() {
        if (this.d == null) {
            c5 c5Var = new c5(getContext(), this, false);
            this.d = c5Var;
            addView(c5Var, indexOfChild(this.b), ja.e(-2, -2, 53));
            j();
        }
        return this.d;
    }

    public final void s() {
        if (this.r != null) {
            return;
        }
        Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        int i7 = 4;
        frameLayout.setVisibility(4);
        addView(this.r, indexOfChild(this.b), ja.e(-1, 46, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        this.r.addView(linearLayout, ja.d(-1, -1.0f, 51, 18.0f, 0.0f, 42.0f, 0.0f));
        TextView textView = new TextView(context);
        this.x = textView;
        int i10 = 1;
        textView.setTextSize(1, 17.0f);
        this.x.setSingleLine(true);
        this.x.setEllipsize(TextUtils.TruncateAt.END);
        this.x.setGravity(19);
        this.x.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
        this.x.setVisibility(8);
        linearLayout.addView(this.x, ja.o(-2, -1));
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
        CharSequence charSequence = this.E;
        if (charSequence != null) {
            this.s.setHint(charSequence);
        }
        this.s.setOnEditorActionListener(new di.m(this, i7));
        this.s.addTextChangedListener(new ah.j(this, 15));
        linearLayout.addView(this.s, ja.l(1.0f, 0, -1));
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.w.setImageResource(R.drawable.ic_close_white);
        this.w.setContentDescription(hd.M0(2131752099, null));
        this.w.setOnClickListener(new t4(this, i10));
        this.r.addView(this.w, ja.d(42, 42.0f, 21, 0.0f, 0.0f, 2.0f, 0.0f));
        H();
        k();
        G(2, this.V.e, 0.0f, null);
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.W = jVar;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        this.b.setContentDescription(charSequence);
    }

    public void setBackButtonDrawable(Drawable drawable) {
        this.b.c(drawable);
        j();
        requestLayout();
    }

    public void setBackButtonImage(int i7) {
        setBackButtonDrawable(i7 != 0 ? getContext().getDrawable(i7).mutate() : null);
    }

    public void setBackButtonImageAnimated(int i7) {
        Drawable mutate = getContext().getDrawable(i7).mutate();
        ub ubVar = this.b;
        Drawable drawable = (Drawable) ubVar.c;
        boolean z10 = drawable != null;
        te.c cVar = (te.c) ubVar.f;
        if (drawable == null || !((w4) ubVar.h).w()) {
            ubVar.c(mutate);
        } else {
            Drawable drawable2 = (Drawable) ubVar.c;
            ubVar.c(mutate);
            ubVar.d = drawable2;
            cVar.c(0.0f);
            cVar.a(1.0f);
        }
        if (z10) {
            return;
        }
        j();
        requestLayout();
    }

    public void setButtonsGlass(dh.c cVar) {
        this.P = cVar;
        if (this.M != null) {
            p();
        }
    }

    public void setButtonsGlassColorProvider(gh.a aVar) {
        this.O = aVar;
        if (aVar == null) {
            aVar = this.N;
        }
        fh.g gVar = this.I;
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
        c5 c5Var = this.d;
        if (c5Var != null) {
            c5Var.setEnabled(z10);
        }
        z4 z4Var = this.n;
        if (z4Var != null) {
            z4Var.setEnabled(z10);
        }
    }

    public void setExtraHeight(int i7) {
        if (this.b0 != i7) {
            this.b0 = i7;
            requestLayout();
        }
    }

    public void setForceSkipTouches(boolean z10) {
        this.s0 = z10;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setMenuGlassFrostedProgress(float f10) {
        ui.d dVar = this.p0;
        if (dVar != null) {
            dVar.j(f10);
        }
    }

    public void setMenuGlassStroke(boolean z10) {
        this.n0 = z10;
    }

    public void setMenuOverlayProvider(r10 r10Var) {
        this.Q = r10Var;
    }

    public void setOccupyStatusBar(boolean z10) {
        if (this.a0 != z10) {
            this.a0 = z10;
            requestLayout();
        }
    }

    public void setSearchFieldCaption(CharSequence charSequence) {
        s();
        this.x.setText(charSequence);
        this.x.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        k();
    }

    public void setSearchFieldHint(CharSequence charSequence) {
        this.E = charSequence;
        ah.i iVar = this.s;
        if (iVar != null) {
            iVar.setHint(charSequence);
        }
    }

    public void setSearchFieldText(CharSequence charSequence) {
        ah.i iVar = this.s;
        if (iVar == null) {
            this.F = charSequence;
            return;
        }
        iVar.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.s.setSelection(charSequence.length());
    }

    public void setSearchItem(d5 d5Var) {
        if (d5Var == null && this.y != null && this.G) {
            m(true);
        }
        this.y = d5Var;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.c.c(charSequence);
    }

    public void setSubtitleAnimated(CharSequence charSequence) {
        if (!w()) {
            setSubtitle(charSequence);
            return;
        }
        v4 v4Var = this.c;
        j5 j5Var = (j5) v4Var.d;
        if (j5Var == null || j5Var.getVisibility() == 8 || TextUtils.isEmpty(charSequence) || TextUtils.equals((CharSequence) v4Var.f, charSequence)) {
            if (TextUtils.equals((CharSequence) v4Var.f, charSequence)) {
                return;
            }
            v4Var.c(charSequence);
            return;
        }
        v4Var.f = charSequence;
        if (((j5) v4Var.e) == null) {
            v4Var.e = v4Var.a();
        }
        j5 j5Var2 = (j5) v4Var.d;
        j5 j5Var3 = (j5) v4Var.e;
        v4Var.d = j5Var3;
        v4Var.e = j5Var2;
        j5Var3.animate().cancel();
        ((j5) v4Var.d).l(charSequence, false);
        ((j5) v4Var.d).setVisibility(0);
        ((j5) v4Var.d).setAlpha(0.0f);
        ((j5) v4Var.d).setTranslationY(org.telegram.messenger.g0.L(6.0f));
        ViewPropertyAnimator duration = ((j5) v4Var.d).animate().alpha(1.0f).translationY(0.0f).setDuration(380L);
        er erVar = er.h;
        duration.setInterpolator(erVar).start();
        j5Var2.animate().cancel();
        j5Var2.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(6.0f)).setDuration(380L).setInterpolator(erVar).withEndAction(new u4(j5Var2, 0)).start();
        v4Var.requestLayout();
    }

    public void setSubtitleColor(int i7) {
        this.l0 = true;
        this.f0 = i7;
        this.c.d();
    }

    public void setTitle(CharSequence charSequence) {
        v4 v4Var = this.c;
        v4Var.b(0);
        j5[] j5VarArr = (j5[]) v4Var.c;
        j5 j5Var = j5VarArr[1];
        if (j5Var != null) {
            j5Var.animate().cancel();
            j5VarArr[1].setVisibility(8);
        }
        j5VarArr[0].animate().cancel();
        j5VarArr[0].setAlpha(1.0f);
        j5VarArr[0].setTranslationY(0.0f);
        j5VarArr[0].k(charSequence);
        j5VarArr[0].setVisibility(TextUtils.isEmpty(charSequence) ? 4 : 0);
    }

    public void setTitleColor(int i7) {
        this.k0 = true;
        this.e0 = i7;
        this.c.d();
    }

    public void setTitleMinSideInset(int i7) {
        if (this.r0 != i7) {
            this.r0 = i7;
            requestLayout();
        }
    }

    public void setTitlesAlpha(float f10) {
        if (this.t0 != f10) {
            this.t0 = f10;
            j();
        }
    }

    public final float t(boolean z10) {
        float actionModeFactor;
        z4 z4Var = this.n;
        if (z4Var == null) {
            return 0.0f;
        }
        if (z4Var.getVisibility() == 8 && z10) {
            return 0.0f;
        }
        if (z10) {
            actionModeFactor = this.n.getTargetVisibleFactor();
        } else {
            actionModeFactor = (1.0f - getActionModeFactor()) * (1.0f - getSearchFactor()) * this.n.getVisibleFactor();
        }
        return (org.telegram.messenger.g0.L(12.0f) + this.n.getButtonWidth()) * actionModeFactor;
    }

    public final void u() {
        c5 c5Var = this.e;
        if (c5Var == null || !this.H) {
            return;
        }
        this.H = false;
        c5Var.g();
        this.U.a(false, w());
        j();
        this.b.b(false, w());
        ns.e().k(ns.r4, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        z();
        this.c.d();
        this.b.d();
        c5 c5Var = this.d;
        if (c5Var != null) {
            c5Var.i();
        }
        c5 c5Var2 = this.e;
        if (c5Var2 != null) {
            c5Var2.i();
        }
        org.telegram.ui.Components.h6 h6Var = this.f;
        if (h6Var != null) {
            h6Var.setTextColor(this.h0);
        }
        z4 z4Var = this.n;
        if (z4Var != null) {
            z4Var.c();
        }
        org.telegram.ui.Components.h6 h6Var2 = this.h;
        if (h6Var2 != null) {
            h6Var2.setTextColor(this.f0);
        }
        if (this.s != null) {
            H();
        }
        fh.g gVar = this.I;
        if (gVar != null) {
            gVar.updateColors();
        }
        fh.g gVar2 = this.J;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        invalidate();
    }

    public final boolean v() {
        return this.e != null && this.H;
    }

    public final boolean w() {
        return this.c0 && this.d0;
    }

    public final boolean x(View view) {
        return view == this.b || view == this.c || view == this.d || view == this.e || view == this.f || view == this.h || view == this.r || view == this.n;
    }

    public final boolean y(boolean z10, boolean z11) {
        m0 searchListener;
        boolean z12 = false;
        if (this.y == null || this.G || this.H || !((searchListener = getSearchListener()) == null || searchListener.c())) {
            return false;
        }
        s();
        this.G = true;
        c5 c5Var = this.d;
        if (c5Var != null) {
            c5Var.g();
        }
        ah.i iVar = this.s;
        CharSequence charSequence = this.F;
        if (charSequence == null) {
            charSequence = "";
        }
        iVar.setText(charSequence);
        this.F = null;
        this.s.requestFocus();
        if (z10) {
            org.telegram.messenger.g0.J3(this.s);
        }
        if (z11 && w()) {
            z12 = true;
        }
        this.T.a(true, z12);
        j();
        if (searchListener != null) {
            searchListener.i();
        }
        return true;
    }

    public final void z() {
        boolean z10 = this.k0;
        e6 e6Var = this.a;
        if (!z10) {
            this.e0 = j6.w0(j6.G6, e6Var);
        }
        if (!this.l0) {
            this.f0 = j6.w0(j6.y6, e6Var);
        }
        if (!this.m0) {
            this.g0 = j6.w0(j6.G6, e6Var);
        }
        this.h0 = j6.w0(j6.G6, e6Var);
        int i7 = j6.i6;
        this.i0 = j6.w0(i7, e6Var);
        this.j0 = j6.w0(i7, e6Var);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.ui.ActionBar.q4
    public View getMenuHostView() {
        return this;
    }

    @Override // te.b
    public final /* synthetic */ void E(float f10, int i7) {
    }
}
