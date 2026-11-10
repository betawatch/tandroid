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
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class z4 extends FrameLayout implements te.b, ls, c6, t4 {
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
    public j5 Q;
    public r0 R;
    public final te.a S;
    public final te.a T;
    public final te.a U;
    public k V;
    public boolean W;
    public final h6 a;
    public int a0;
    public final nd b;
    public boolean b0;
    public final y4 c;
    public boolean c0;
    public f5 d;
    public int d0;
    public f5 e;
    public int e0;
    public org.telegram.ui.Components.i6 f;
    public int f0;
    public int g0;
    public org.telegram.ui.Components.i6 h;
    public int h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public c5 n;
    public dh.c n0;
    public ri.d o0;
    public final RectF p0;
    public int q0;
    public FrameLayout r;
    public boolean r0;
    public ah.i s;
    public float s0;
    public ImageView w;
    public TextView x;
    public g5 y;

    public z4(Context context, h6 h6Var) {
        super(context);
        this.K = -1.0f;
        wq wqVar = wq.h;
        this.S = new te.a(0, this, wqVar, 380L, false);
        this.T = new te.a(1, this, wqVar, 380L, false);
        this.U = new te.a(2, this, wqVar, 250L, false);
        this.W = true;
        this.m0 = true;
        this.p0 = new RectF();
        this.s0 = 1.0f;
        this.a = h6Var;
        setClipChildren(false);
        setWillNotDraw(false);
        y();
        y4 y4Var = new y4(this, context);
        this.c = y4Var;
        addView(y4Var, ha.e(-1, -2, 51));
        nd ndVar = new nd(this, context);
        this.b = ndVar;
        ndVar.setVisibility(8);
        ndVar.setContentDescription(id.M0(2131754878, null));
        ndVar.setOnClickListener(new w4(this, 0));
        addView(ndVar, ha.e(46, 46, 51));
    }

    public static void A(View view, float f10) {
        view.setAlpha(f10);
        view.setVisibility(f10 > 0.0f ? 0 : 4);
    }

    public static void B(View view, int i7, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i7;
        marginLayoutParams.topMargin = i10;
        marginLayoutParams.rightMargin = i11;
    }

    public static /* synthetic */ void c(z4 z4Var, int i7, KeyEvent keyEvent) {
        if (i7 != 3) {
            if (keyEvent == null) {
                return;
            }
            if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                return;
            }
        }
        org.telegram.messenger.g0.v1(z4Var.s);
        n0 searchListener = z4Var.getSearchListener();
        if (searchListener != null) {
            searchListener.k(z4Var.s);
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
        g5 g5Var = this.y;
        if (g5Var != null) {
            return g5Var.getSearchListener();
        }
        return null;
    }

    private float getSearchPillLeft() {
        return org.telegram.messenger.g0.L(((Drawable) this.b.c) != null ? 58.0f : 6.0f);
    }

    public final void C(CharSequence charSequence, boolean z9, long j3, Interpolator interpolator) {
        if (!v()) {
            setTitle(charSequence);
            return;
        }
        y4 y4Var = this.c;
        y4Var.b(0);
        y4Var.b(1);
        m5[] m5VarArr = (m5[]) y4Var.c;
        m5 m5Var = m5VarArr[0];
        m5 m5Var2 = m5VarArr[1];
        m5VarArr[0] = m5Var2;
        m5VarArr[1] = m5Var;
        m5Var2.animate().cancel();
        m5Var2.k(charSequence);
        m5Var2.setVisibility(0);
        m5Var2.setAlpha(0.0f);
        int L = org.telegram.messenger.g0.L(16.0f);
        if (!z9) {
            L = -L;
        }
        m5Var2.setTranslationY(L);
        m5Var2.animate().alpha(1.0f).translationY(0.0f).setDuration(j3).setInterpolator(interpolator).start();
        m5Var.animate().cancel();
        m5Var.animate().alpha(0.0f).translationY(z9 ? -org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(16.0f)).setDuration(j3).setInterpolator(interpolator).withEndAction(new x4(m5Var, 1)).start();
        y4Var.requestLayout();
    }

    public final void D() {
        if (this.e == null || this.G) {
            return;
        }
        this.G = true;
        f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.g();
        }
        ah.i iVar = this.s;
        if (iVar != null && this.F) {
            org.telegram.messenger.g0.v1(iVar);
        }
        this.T.a(true, v());
        i();
        this.b.b(true, v());
        qs.e().k(qs.r4, new Object[0]);
    }

    public final void E() {
        ah.i iVar = this.s;
        int i7 = m6.G6;
        h6 h6Var = this.a;
        iVar.setTextColor(m6.w0(i7, h6Var));
        this.x.setTextColor(m6.w0(i7, h6Var));
        this.s.setHintTextColor(m6.w0(m6.H6, h6Var));
        this.s.setCursorColor(m6.w0(i7, h6Var));
        this.s.setHighlightColor(m6.w0(m6.ig, h6Var));
        this.s.setHandlesColor(m6.w0(m6.jg, h6Var));
        this.w.setColorFilter(new PorterDuffColorFilter(m6.w0(m6.m6, h6Var), PorterDuff.Mode.SRC_IN));
        this.w.setBackground(m6.h0(this.h0, 1, -1));
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 != 2) {
            i();
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

    @Override // org.telegram.ui.ActionBar.t4
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final boolean b(r0 r0Var, RectF rectF) {
        if (r0Var.getParent() == this.d && getSearchFactor() == 0.0f && getActionModeFactor() == 0.0f) {
            m(rectF);
            return true;
        }
        float L = org.telegram.messenger.g0.L(23.0f);
        View view = (View) r0Var.getParent();
        float width = (r0Var.getWidth() / 2.0f) + r0Var.getX() + (view != null ? view.getX() : 0.0f);
        float currentActionBarHeight = (l.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        rectF.set(width - L, currentActionBarHeight - L, width + L, currentActionBarHeight + L);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final /* synthetic */ boolean d() {
        return true;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.n4) {
            updateColors();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c5 c5Var;
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
        if (this.J != null && (c5Var = this.n) != null && c5Var.c == b5.a && c5Var.getVisibility() == 0 && this.n.getAlpha() > 0.0f) {
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
            float m10 = m(rectF);
            r0 r0Var = this.R;
            boolean z9 = r0Var != null && r0Var.getParent() == this.d;
            if (m10 > 0.0f && rectF.width() > 0.0f && !z9) {
                float height3 = rectF.height() / 2.0f;
                if (Math.abs(height3 - this.K) > 0.5f) {
                    this.K = height3;
                    this.I.r(height3);
                }
                this.I.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                this.I.setAlpha((int) (m10 * 255.0f));
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
        m(rectF);
        canvas.save();
        canvas.clipRect(rectF);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final boolean e() {
        return this.m0;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final fh.g f(j5 j5Var) {
        dh.c cVar = this.n0;
        if (cVar == null) {
            cVar = this.L;
        }
        if (cVar == null) {
            return null;
        }
        fh.g c10 = cVar.c(j5Var, null, false);
        c10.p(this.M);
        org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        return c10;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final void g(j5 j5Var, r0 r0Var) {
        this.Q = j5Var;
        this.R = r0Var;
        invalidate();
    }

    public k getActionBarMenuOnItemClick() {
        return this.V;
    }

    public f5 getActionMode() {
        return this.e;
    }

    public float getActionModeFactor() {
        return this.T.e;
    }

    public org.telegram.ui.Components.i6 getActionModeTitle() {
        n();
        return this.f;
    }

    public View getBackButton() {
        return this.b;
    }

    public Drawable getBackButtonDrawable() {
        return (Drawable) this.b.c;
    }

    @Override // org.telegram.ui.ActionBar.t4
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

    @Override // org.telegram.ui.ActionBar.t4
    public gh.a getButtonsGlassColorProvider() {
        gh.a aVar = this.N;
        return aVar != null ? aVar : this.M;
    }

    public c5 getDoneButton() {
        return this.n;
    }

    public int getExtraHeight() {
        return this.a0;
    }

    public f5 getMenu() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public gh.a getMenuGlassColorProvider() {
        return this.M;
    }

    public j5 getMenuOverlay() {
        u10 u10Var = this.P;
        if (u10Var != null) {
            return (j5) u10Var.run();
        }
        return null;
    }

    public float getMenuPillLeft() {
        RectF rectF = this.p0;
        m(rectF);
        return rectF.left;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public h6 getMenuResourcesProvider() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public /* bridge */ /* synthetic */ int getMenuRise() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public View getMenuView() {
        return this.d;
    }

    public boolean getOccupyStatusBar() {
        return this.W;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public j5 getOpenMenuOverlay() {
        return this.Q;
    }

    public float getSearchFactor() {
        return this.S.e;
    }

    public EditTextBoldCursor getSearchField() {
        r();
        return this.s;
    }

    public String getSubtitle() {
        CharSequence charSequence = (CharSequence) this.c.f;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public m5 getSubtitleTextView() {
        return (m5) this.c.d;
    }

    public String getTitle() {
        m5 m5Var = ((m5[]) this.c.c)[0];
        CharSequence text = m5Var != null ? m5Var.getText() : null;
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        y4 y4Var = this.c;
        y4Var.b(0);
        return ((m5[]) y4Var.c)[0].getTextPaint().getFontMetricsInt();
    }

    public m5 getTitleTextView() {
        return ((m5[]) this.c.c)[0];
    }

    public m5 getTitleTextView2() {
        return ((m5[]) this.c.c)[1];
    }

    public float getTitlesAlpha() {
        return this.s0;
    }

    public final void i() {
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        float f10 = 1.0f - actionModeFactor;
        float f11 = searchFactor * f10;
        float f12 = (1.0f - searchFactor) * f10;
        float f13 = this.s0 * f12;
        float T1 = org.telegram.messenger.g0.T1(1.0f, 0.94f, Math.max(searchFactor, actionModeFactor));
        y4 y4Var = this.c;
        A(y4Var, f13);
        y4Var.setScaleX(T1);
        y4Var.setScaleY(T1);
        c5 c5Var = this.n;
        if (c5Var != null) {
            float visibleFactor = c5Var.getVisibleFactor() * f12;
            A(this.n, visibleFactor);
            float T12 = this.n.c == b5.a ? org.telegram.messenger.g0.T1(0.6f, 1.0f, visibleFactor) : org.telegram.messenger.g0.T1(0.8f, 1.0f, f12);
            this.n.setScaleX(T12);
            this.n.setScaleY(T12);
        }
        f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.setTranslationX(-s(false));
            A(this.d, f12);
            float T13 = org.telegram.messenger.g0.T1(0.7f, 1.0f, f12);
            this.d.setPivotX(r11.getWidth() - org.telegram.messenger.g0.L(19.0f));
            this.d.setPivotY(r11.getHeight() / 2.0f);
            this.d.setScaleX(T13);
            this.d.setScaleY(T13);
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (!w(childAt) && childAt.getVisibility() != 8) {
                A(childAt, f12);
            }
        }
        f5 f5Var2 = this.e;
        if (f5Var2 != null) {
            A(f5Var2, actionModeFactor);
            float T14 = org.telegram.messenger.g0.T1(0.7f, 1.0f, actionModeFactor);
            this.e.setPivotX(r5.getWidth() - org.telegram.messenger.g0.L(19.0f));
            this.e.setPivotY(r5.getHeight() / 2.0f);
            this.e.setScaleX(T14);
            this.e.setScaleY(T14);
        }
        org.telegram.ui.Components.i6 i6Var = this.f;
        if (i6Var != null) {
            A(i6Var, actionModeFactor);
            this.f.setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f10);
        }
        org.telegram.ui.Components.i6 i6Var2 = this.h;
        if (i6Var2 != null) {
            A(i6Var2, actionModeFactor);
            this.h.setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f10);
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            A(frameLayout, f11);
            RectF rectF = this.p0;
            m(rectF);
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

    public final void j() {
        TextView textView;
        if (this.s == null) {
            return;
        }
        n0 searchListener = getSearchListener();
        boolean z9 = this.s.length() > 0 || ((textView = this.x) != null && textView.getVisibility() == 0 && (searchListener == null || searchListener.m())) || (searchListener != null && searchListener.d());
        this.U.a(z9, v() && this.F);
        this.w.setEnabled(z9);
    }

    public final void k() {
        n0 searchListener = getSearchListener();
        if (searchListener == null || searchListener.a()) {
            this.x.setVisibility(8);
            j();
            if (searchListener != null) {
                searchListener.f();
            }
        }
    }

    public final void l(boolean z9) {
        if (this.F) {
            n0 searchListener = getSearchListener();
            if (searchListener == null || searchListener.b()) {
                this.F = false;
                this.s.clearFocus();
                if (z9) {
                    org.telegram.messenger.g0.v1(this.s);
                }
                this.S.a(false, v());
                i();
                if (searchListener != null) {
                    searchListener.h();
                }
            }
        }
    }

    public final float m(RectF rectF) {
        float f10;
        float f11;
        float f12;
        int L = org.telegram.messenger.g0.L(6.0f);
        float L2 = org.telegram.messenger.g0.L(23.0f);
        float currentActionBarHeight = (l.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        f5 f5Var = this.d;
        float pillWidth = (f5Var == null || f5Var.getVisibility() == 8) ? 0.0f : this.d.getPillWidth();
        f5 f5Var2 = this.e;
        float pillWidth2 = f5Var2 != null ? f5Var2.getPillWidth() : 0.0f;
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
        float width = (getWidth() - L) - s(false);
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

    public final f5 n() {
        if (this.e == null) {
            f5 f5Var = new f5(getContext(), this, true);
            this.e = f5Var;
            View view = this.b;
            addView(f5Var, indexOfChild(view), ha.e(-2, -2, 53));
            org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(getContext(), true, true, true);
            this.f = i6Var;
            i6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
            this.f.setTypeface(org.telegram.messenger.g0.o());
            this.f.setTextColor(this.g0);
            this.f.setGravity(19);
            this.f.setEllipsizeByGradient(true);
            this.f.b(0.6f, 320L, wq.h);
            addView(this.f, indexOfChild(view), ha.e(-1, -2, 51));
            i();
        }
        return this.e;
    }

    public final void o() {
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
        int currentActionBarHeight = l.getCurrentActionBarHeight();
        int i16 = i11 - i7;
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (!w(childAt) && childAt.getVisibility() != 8) {
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
        int currentActionBarHeight = l.getCurrentActionBarHeight();
        int i11 = rowTop + currentActionBarHeight + this.a0;
        nd ndVar = this.b;
        boolean z9 = ((Drawable) ndVar.c) != null;
        int L = ((currentActionBarHeight - org.telegram.messenger.g0.L(46.0f)) / 2) + rowTop;
        B(ndVar, org.telegram.messenger.g0.L(6.0f), L, 0);
        f5 f5Var = this.d;
        float targetPillWidth = (f5Var == null || f5Var.getVisibility() == 8) ? 0.0f : this.d.getTargetPillWidth();
        float s5 = s(true);
        int max = Math.max(Math.max(z9 ? org.telegram.messenger.g0.L(64.0f) : org.telegram.messenger.g0.L(18.0f), (targetPillWidth > 0.0f || s5 > 0.0f) ? org.telegram.messenger.g0.L(18.0f) + ((int) (targetPillWidth + s5)) : 0), this.q0);
        y4 y4Var = this.c;
        if (y4Var.b != max) {
            y4Var.b = max;
            y4Var.requestLayout();
        }
        B(y4Var, 0, rowTop, 0);
        y4Var.getLayoutParams().height = currentActionBarHeight;
        f5 f5Var2 = this.d;
        if (f5Var2 != null) {
            B(f5Var2, 0, rowTop, org.telegram.messenger.g0.L(10.0f));
            this.d.getLayoutParams().height = currentActionBarHeight;
        }
        f5 f5Var3 = this.e;
        if (f5Var3 != null) {
            B(f5Var3, 0, rowTop, org.telegram.messenger.g0.L(10.0f));
            this.e.getLayoutParams().height = currentActionBarHeight;
        }
        if (this.f != null) {
            f5 f5Var4 = this.e;
            int L2 = org.telegram.messenger.g0.L(18.0f) + ((int) (f5Var4 != null ? f5Var4.getTargetPillWidth() : 0.0f));
            org.telegram.ui.Components.i6 i6Var = this.h;
            if (i6Var == null || i6Var.getTag() == null) {
                B(this.f, org.telegram.messenger.g0.L(66.0f), rowTop, L2);
                this.f.getLayoutParams().height = currentActionBarHeight;
            } else {
                int i12 = (currentActionBarHeight / 2) + rowTop;
                B(this.f, org.telegram.messenger.g0.L(66.0f), i12 - org.telegram.messenger.g0.L(22.0f), L2);
                this.f.getLayoutParams().height = org.telegram.messenger.g0.L(22.0f);
                B(this.h, org.telegram.messenger.g0.L(66.0f), org.telegram.messenger.g0.L(1.0f) + i12, L2);
                this.h.getLayoutParams().height = org.telegram.messenger.g0.L(18.0f);
            }
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            B(frameLayout, (int) getSearchPillLeft(), L, org.telegram.messenger.g0.L(6.0f));
        }
        c5 c5Var = this.n;
        if (c5Var != null) {
            B(c5Var, 0, L, org.telegram.messenger.g0.L(6.0f));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return !this.r0;
    }

    public final c5 p(String str) {
        if (this.n == null) {
            c5 c5Var = new c5(getContext(), this, str);
            this.n = c5Var;
            addView(c5Var, indexOfChild(this.b), ha.e(-2, 46, 53));
            i();
        }
        return this.n;
    }

    public final f5 q() {
        if (this.d == null) {
            f5 f5Var = new f5(getContext(), this, false);
            this.d = f5Var;
            addView(f5Var, indexOfChild(this.b), ha.e(-2, -2, 53));
            i();
        }
        return this.d;
    }

    public final void r() {
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
        this.w.setContentDescription(id.M0(2131752099, null));
        this.w.setOnClickListener(new w4(this, i10));
        this.r.addView(this.w, ha.d(42, 42.0f, 21, 0.0f, 0.0f, 2.0f, 0.0f));
        E();
        j();
        Y(2, this.U.e, 0.0f, null);
    }

    public final float s(boolean z9) {
        float actionModeFactor;
        c5 c5Var = this.n;
        if (c5Var == null) {
            return 0.0f;
        }
        if (c5Var.getVisibility() == 8 && z9) {
            return 0.0f;
        }
        if (z9) {
            actionModeFactor = this.n.getTargetVisibleFactor();
        } else {
            actionModeFactor = (1.0f - getActionModeFactor()) * (1.0f - getSearchFactor()) * this.n.getVisibleFactor();
        }
        return (org.telegram.messenger.g0.L(12.0f) + this.n.getButtonWidth()) * actionModeFactor;
    }

    public void setActionBarMenuOnItemClick(k kVar) {
        this.V = kVar;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        this.b.setContentDescription(charSequence);
    }

    public void setBackButtonDrawable(Drawable drawable) {
        this.b.c(drawable);
        i();
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
        if (drawable == null || !((z4) ndVar.h).v()) {
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
        i();
        requestLayout();
    }

    public void setButtonsGlass(dh.c cVar) {
        this.O = cVar;
        if (this.L != null) {
            o();
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
        f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.setEnabled(z9);
        }
        c5 c5Var = this.n;
        if (c5Var != null) {
            c5Var.setEnabled(z9);
        }
    }

    public void setExtraHeight(int i7) {
        if (this.a0 != i7) {
            this.a0 = i7;
            requestLayout();
        }
    }

    public void setForceSkipTouches(boolean z9) {
        this.r0 = z9;
    }

    @Override // org.telegram.ui.ActionBar.t4
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
        r();
        this.x.setText(charSequence);
        this.x.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        j();
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

    public void setSearchItem(g5 g5Var) {
        if (g5Var == null && this.y != null && this.F) {
            l(true);
        }
        this.y = g5Var;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.c.c(charSequence);
    }

    public void setSubtitleAnimated(CharSequence charSequence) {
        if (!v()) {
            setSubtitle(charSequence);
            return;
        }
        y4 y4Var = this.c;
        m5 m5Var = (m5) y4Var.d;
        if (m5Var == null || m5Var.getVisibility() == 8 || TextUtils.isEmpty(charSequence) || TextUtils.equals((CharSequence) y4Var.f, charSequence)) {
            if (TextUtils.equals((CharSequence) y4Var.f, charSequence)) {
                return;
            }
            y4Var.c(charSequence);
            return;
        }
        y4Var.f = charSequence;
        if (((m5) y4Var.e) == null) {
            y4Var.e = y4Var.a();
        }
        m5 m5Var2 = (m5) y4Var.d;
        m5 m5Var3 = (m5) y4Var.e;
        y4Var.d = m5Var3;
        y4Var.e = m5Var2;
        m5Var3.animate().cancel();
        ((m5) y4Var.d).l(charSequence, false);
        ((m5) y4Var.d).setVisibility(0);
        ((m5) y4Var.d).setAlpha(0.0f);
        ((m5) y4Var.d).setTranslationY(org.telegram.messenger.g0.L(6.0f));
        ViewPropertyAnimator duration = ((m5) y4Var.d).animate().alpha(1.0f).translationY(0.0f).setDuration(380L);
        wq wqVar = wq.h;
        duration.setInterpolator(wqVar).start();
        m5Var2.animate().cancel();
        m5Var2.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(6.0f)).setDuration(380L).setInterpolator(wqVar).withEndAction(new x4(m5Var2, 0)).start();
        y4Var.requestLayout();
    }

    public void setSubtitleColor(int i7) {
        this.k0 = true;
        this.e0 = i7;
        this.c.d();
    }

    public void setTitle(CharSequence charSequence) {
        y4 y4Var = this.c;
        y4Var.b(0);
        m5[] m5VarArr = (m5[]) y4Var.c;
        m5 m5Var = m5VarArr[1];
        if (m5Var != null) {
            m5Var.animate().cancel();
            m5VarArr[1].setVisibility(8);
        }
        m5VarArr[0].animate().cancel();
        m5VarArr[0].setAlpha(1.0f);
        m5VarArr[0].setTranslationY(0.0f);
        m5VarArr[0].k(charSequence);
        m5VarArr[0].setVisibility(TextUtils.isEmpty(charSequence) ? 4 : 0);
    }

    public void setTitleColor(int i7) {
        this.j0 = true;
        this.d0 = i7;
        this.c.d();
    }

    public void setTitleMinSideInset(int i7) {
        if (this.q0 != i7) {
            this.q0 = i7;
            requestLayout();
        }
    }

    public void setTitlesAlpha(float f10) {
        if (this.s0 != f10) {
            this.s0 = f10;
            i();
        }
    }

    public final void t() {
        f5 f5Var = this.e;
        if (f5Var == null || !this.G) {
            return;
        }
        this.G = false;
        f5Var.g();
        this.T.a(false, v());
        i();
        this.b.b(false, v());
        qs.e().k(qs.r4, new Object[0]);
    }

    public final boolean u() {
        return this.e != null && this.G;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        y();
        this.c.d();
        this.b.d();
        f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.i();
        }
        f5 f5Var2 = this.e;
        if (f5Var2 != null) {
            f5Var2.i();
        }
        org.telegram.ui.Components.i6 i6Var = this.f;
        if (i6Var != null) {
            i6Var.setTextColor(this.g0);
        }
        c5 c5Var = this.n;
        if (c5Var != null) {
            c5Var.c();
        }
        org.telegram.ui.Components.i6 i6Var2 = this.h;
        if (i6Var2 != null) {
            i6Var2.setTextColor(this.e0);
        }
        if (this.s != null) {
            E();
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

    public final boolean v() {
        return this.b0 && this.c0;
    }

    public final boolean w(View view) {
        return view == this.b || view == this.c || view == this.d || view == this.e || view == this.f || view == this.h || view == this.r || view == this.n;
    }

    public final boolean x(boolean z9, boolean z10) {
        n0 searchListener;
        boolean z11 = false;
        if (this.y == null || this.F || this.G || !((searchListener = getSearchListener()) == null || searchListener.c())) {
            return false;
        }
        r();
        this.F = true;
        f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.g();
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
        if (z10 && v()) {
            z11 = true;
        }
        this.S.a(true, z11);
        i();
        if (searchListener != null) {
            searchListener.i();
        }
        return true;
    }

    public final void y() {
        boolean z9 = this.j0;
        h6 h6Var = this.a;
        if (!z9) {
            this.d0 = m6.w0(m6.G6, h6Var);
        }
        if (!this.k0) {
            this.e0 = m6.w0(m6.y6, h6Var);
        }
        if (!this.l0) {
            this.f0 = m6.w0(m6.G6, h6Var);
        }
        this.g0 = m6.w0(m6.G6, h6Var);
        int i7 = m6.i6;
        this.h0 = m6.w0(i7, h6Var);
        this.i0 = m6.w0(i7, h6Var);
    }

    public final void z(int i7, boolean z9) {
        String E = id.E(i7, ' ');
        n();
        this.f.c(E, z9 && v() && this.G, true);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.ui.ActionBar.t4
    public View getMenuHostView() {
        return this;
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
