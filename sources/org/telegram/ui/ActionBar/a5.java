package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
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
import c8.ma;
import di.yb;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.v60;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class a5 extends FrameLayout implements te.b, fs, c6, u4, v60 {
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
    public p10 Q;
    public k5 R;
    public r0 S;
    public final te.a T;
    public final te.a U;
    public final te.a V;
    public j W;
    public final i6 a;
    public boolean a0;
    public final yb b;
    public int b0;
    public final z4 c;
    public boolean c0;
    public g5 d;
    public boolean d0;
    public g5 e;
    public int e0;
    public org.telegram.ui.Components.n6 f;
    public int f0;
    public int g0;
    public org.telegram.ui.Components.n6 h;
    public int h0;
    public int i0;
    public int j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public d5 n;
    public boolean n0;
    public dh.c o0;
    public ui.d p0;
    public final RectF q0;
    public FrameLayout r;
    public final Path r0;
    public ah.i s;
    public final RectF s0;
    public int t0;
    public boolean u0;
    public float v0;
    public ImageView w;
    public TextView x;
    public h5 y;

    public a5(Context context, i6 i6Var) {
        super(context);
        this.L = -1.0f;
        lr lrVar = lr.h;
        this.T = new te.a(0, this, lrVar, 380L, false);
        this.U = new te.a(1, this, lrVar, 380L, false);
        this.V = new te.a(2, this, lrVar, 250L, false);
        this.a0 = true;
        this.n0 = true;
        this.q0 = new RectF();
        this.r0 = new Path();
        this.s0 = new RectF();
        this.v0 = 1.0f;
        this.a = i6Var;
        setClipChildren(false);
        setWillNotDraw(false);
        C();
        z4 z4Var = new z4(this, context);
        this.c = z4Var;
        addView(z4Var, ma.e(-1, -2, 51));
        yb ybVar = new yb(this, context);
        this.b = ybVar;
        ybVar.setVisibility(8);
        ybVar.setContentDescription(gd.M0(2131754878, null));
        ybVar.setOnClickListener(new x4(this, 0));
        addView(ybVar, ma.e(46, 46, 51));
    }

    public static void F(View view, float f10) {
        view.setAlpha(f10);
        view.setVisibility(f10 > 0.0f ? 0 : 4);
    }

    public static void G(View view, int i7, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i7;
        marginLayoutParams.topMargin = i10;
        marginLayoutParams.rightMargin = i11;
    }

    private int getRowTop() {
        if (this.a0) {
            return org.telegram.messenger.g0.m;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public n0 getSearchListener() {
        h5 h5Var = this.y;
        if (h5Var != null) {
            return h5Var.getSearchListener();
        }
        return null;
    }

    private float getSearchPillLeft() {
        return org.telegram.messenger.g0.L(((Drawable) this.b.c) != null ? 58.0f : 6.0f);
    }

    public static /* synthetic */ void i(a5 a5Var, int i7, KeyEvent keyEvent) {
        if (i7 != 3) {
            if (keyEvent == null) {
                return;
            }
            if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                return;
            }
        }
        org.telegram.messenger.g0.v1(a5Var.s);
        n0 searchListener = a5Var.getSearchListener();
        if (searchListener != null) {
            searchListener.k(a5Var.s);
        }
    }

    public final boolean A() {
        k5 k5Var = this.R;
        if (k5Var != null) {
            k5Var.a(true);
            return true;
        }
        if (this.H || !this.G) {
            return false;
        }
        o(true);
        return true;
    }

    public final boolean B(boolean z10, boolean z11) {
        n0 searchListener;
        boolean z12 = false;
        if (this.y == null || this.G || this.H || !((searchListener = getSearchListener()) == null || searchListener.c())) {
            return false;
        }
        u();
        this.G = true;
        g5 g5Var = this.d;
        if (g5Var != null) {
            g5Var.g();
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
            org.telegram.messenger.g0.I3(this.s);
        }
        if (z11 && y()) {
            z12 = true;
        }
        this.T.a(true, z12);
        l();
        if (searchListener != null) {
            searchListener.i();
        }
        return true;
    }

    public final void C() {
        boolean z10 = this.k0;
        i6 i6Var = this.a;
        if (!z10) {
            this.e0 = n6.w0(n6.G6, i6Var);
        }
        if (!this.l0) {
            this.f0 = n6.w0(n6.y6, i6Var);
        }
        if (!this.m0) {
            this.g0 = n6.w0(n6.G6, i6Var);
        }
        this.h0 = n6.w0(n6.G6, i6Var);
        int i7 = n6.i6;
        this.i0 = n6.w0(i7, i6Var);
        this.j0 = n6.w0(i7, i6Var);
    }

    public final void E(int i7, boolean z10) {
        String E = gd.E(i7, ' ');
        q();
        this.f.c(E, z10 && y() && this.H, true);
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 != 2) {
            l();
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

    public final void I(CharSequence charSequence, boolean z10, long j3, Interpolator interpolator) {
        if (!y()) {
            setTitle(charSequence);
            return;
        }
        z4 z4Var = this.c;
        z4Var.b(0);
        z4Var.b(1);
        n5[] n5VarArr = (n5[]) z4Var.c;
        n5 n5Var = n5VarArr[0];
        n5 n5Var2 = n5VarArr[1];
        n5VarArr[0] = n5Var2;
        n5VarArr[1] = n5Var;
        n5Var2.animate().cancel();
        n5Var2.k(charSequence);
        n5Var2.setVisibility(0);
        n5Var2.setAlpha(0.0f);
        int L = org.telegram.messenger.g0.L(16.0f);
        if (!z10) {
            L = -L;
        }
        n5Var2.setTranslationY(L);
        n5Var2.animate().alpha(1.0f).translationY(0.0f).setDuration(j3).setInterpolator(interpolator).start();
        n5Var.animate().cancel();
        n5Var.animate().alpha(0.0f).translationY(z10 ? -org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(16.0f)).setDuration(j3).setInterpolator(interpolator).withEndAction(new y4(n5Var, 1)).start();
        z4Var.requestLayout();
    }

    public final void J() {
        if (this.e == null || this.H) {
            return;
        }
        this.H = true;
        g5 g5Var = this.d;
        if (g5Var != null) {
            g5Var.g();
        }
        ah.i iVar = this.s;
        if (iVar != null && this.G) {
            org.telegram.messenger.g0.v1(iVar);
        }
        this.U.a(true, y());
        l();
        this.b.b(true, y());
        ks.e().k(ks.t4, new Object[0]);
    }

    public final void K() {
        ah.i iVar = this.s;
        int i7 = n6.G6;
        i6 i6Var = this.a;
        iVar.setTextColor(n6.w0(i7, i6Var));
        this.x.setTextColor(n6.w0(i7, i6Var));
        this.s.setHintTextColor(n6.w0(n6.H6, i6Var));
        this.s.setCursorColor(n6.w0(i7, i6Var));
        this.s.setHighlightColor(n6.w0(n6.lg, i6Var));
        this.s.setHandlesColor(n6.w0(n6.mg, i6Var));
        this.w.setColorFilter(new PorterDuffColorFilter(n6.w0(n6.m6, i6Var), PorterDuff.Mode.SRC_IN));
        this.w.setBackground(n6.h0(this.i0, 1, -1));
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final boolean b(r0 r0Var, RectF rectF) {
        if (r0Var.getParent() == this.d && getSearchFactor() == 0.0f && getActionModeFactor() == 0.0f) {
            p(rectF);
            return true;
        }
        float L = org.telegram.messenger.g0.L(23.0f);
        View view = (View) r0Var.getParent();
        float width = (r0Var.getWidth() / 2.0f) + r0Var.getX() + (view != null ? view.getX() : 0.0f);
        float currentActionBarHeight = (k.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        rectF.set(width - L, currentActionBarHeight - L, width + L, currentActionBarHeight + L);
        return false;
    }

    @Override // org.telegram.ui.Components.v60
    public final void c(t60 t60Var) {
        d5 d5Var;
        if (this.I != null) {
            yb ybVar = this.b;
            if (ybVar.getVisibility() == 0 && ybVar.getAlpha() > 0.0f) {
                k(ybVar, t60Var);
            }
        }
        if (this.K != null && (d5Var = this.n) != null && d5Var.c == c5.a && d5Var.getVisibility() == 0 && this.n.getAlpha() > 0.0f) {
            k(this.n, t60Var);
        }
        fh.g gVar = this.J;
        Path path = this.r0;
        if (gVar != null) {
            RectF rectF = this.s0;
            if (p(rectF) > 0.0f && rectF.width() > 0.0f) {
                path.rewind();
                path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
                t60Var.a(path);
            }
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (!z(childAt) && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && (childAt.getBackground() instanceof fh.g)) {
                path.rewind();
                path.addPath(((fh.g) childAt.getBackground()).R.k, childAt.getX(), childAt.getY());
                t60Var.a(path);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final /* synthetic */ boolean d() {
        return true;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.p4) {
            updateColors();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        d5 d5Var;
        this.c0 = this.d0;
        int L = org.telegram.messenger.g0.L(6.0f);
        if (this.I != null) {
            yb ybVar = this.b;
            if (ybVar.getVisibility() == 0 && ybVar.getAlpha() > 0.0f) {
                float width = (ybVar.getWidth() / 2.0f) + ybVar.getX();
                float height = (ybVar.getHeight() / 2.0f) + ybVar.getY();
                float scaleX = ybVar.getScaleX() * (ybVar.getWidth() / 2.0f);
                float scaleY = ybVar.getScaleY() * (ybVar.getHeight() / 2.0f);
                this.I.setBounds(((int) (width - scaleX)) - L, ((int) (height - scaleY)) - L, ((int) (width + scaleX)) + L, ((int) (height + scaleY)) + L);
                this.I.setAlpha((int) (ybVar.getAlpha() * 255.0f));
                this.I.draw(canvas);
            }
        }
        if (this.K != null && (d5Var = this.n) != null && d5Var.c == c5.a && d5Var.getVisibility() == 0 && this.n.getAlpha() > 0.0f) {
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
            float p10 = p(rectF);
            r0 r0Var = this.S;
            boolean z10 = r0Var != null && r0Var.getParent() == this.d;
            if (p10 > 0.0f && rectF.width() > 0.0f && !z10) {
                float height3 = rectF.height() / 2.0f;
                if (Math.abs(height3 - this.L) > 0.5f) {
                    this.L = height3;
                    this.J.r(height3);
                }
                this.J.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                this.J.setAlpha((int) (p10 * 255.0f));
                this.J.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        r0 r0Var;
        if (view == this.d && (r0Var = this.S) != null && r0Var.getParent() == this.d) {
            return false;
        }
        if (view != this.r || getSearchFactor() >= 1.0f) {
            return super.drawChild(canvas, view, j3);
        }
        RectF rectF = this.q0;
        p(rectF);
        canvas.save();
        canvas.clipRect(rectF);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final boolean e() {
        return this.n0;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final fh.g g(k5 k5Var) {
        dh.c cVar = this.o0;
        if (cVar == null) {
            cVar = this.M;
        }
        if (cVar == null) {
            return null;
        }
        fh.g c10 = cVar.c(k5Var, null, false);
        c10.p(this.N);
        n10.s(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        return c10;
    }

    public j getActionBarMenuOnItemClick() {
        return this.W;
    }

    public g5 getActionMode() {
        return this.e;
    }

    public float getActionModeFactor() {
        return this.U.e;
    }

    public org.telegram.ui.Components.n6 getActionModeTitle() {
        q();
        return this.f;
    }

    public View getBackButton() {
        return this.b;
    }

    public Drawable getBackButtonDrawable() {
        return (Drawable) this.b.c;
    }

    @Override // org.telegram.ui.ActionBar.u4
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

    @Override // org.telegram.ui.ActionBar.u4
    public gh.a getButtonsGlassColorProvider() {
        gh.a aVar = this.O;
        return aVar != null ? aVar : this.N;
    }

    public d5 getDoneButton() {
        return this.n;
    }

    public int getExtraHeight() {
        return this.b0;
    }

    public g5 getMenu() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public /* bridge */ /* synthetic */ int getMenuAnchorTint() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public /* bridge */ /* synthetic */ int getMenuDimAlpha() {
        return -1;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public /* bridge */ /* synthetic */ int getMenuExtraBelow() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public gh.a getMenuGlassColorProvider() {
        return this.N;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public /* bridge */ /* synthetic */ int getMenuMaxHeight() {
        return 0;
    }

    public k5 getMenuOverlay() {
        p10 p10Var = this.Q;
        if (p10Var != null) {
            return (k5) p10Var.run();
        }
        return null;
    }

    public float getMenuPillLeft() {
        RectF rectF = this.q0;
        p(rectF);
        return rectF.left;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public i6 getMenuResourcesProvider() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public /* bridge */ /* synthetic */ int getMenuRise() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public View getMenuView() {
        return this.d;
    }

    public boolean getOccupyStatusBar() {
        return this.a0;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public k5 getOpenMenuOverlay() {
        return this.R;
    }

    public float getSearchFactor() {
        return this.T.e;
    }

    public EditTextBoldCursor getSearchField() {
        u();
        return this.s;
    }

    public String getSubtitle() {
        CharSequence charSequence = (CharSequence) this.c.f;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public n5 getSubtitleTextView() {
        return (n5) this.c.d;
    }

    public String getTitle() {
        n5 n5Var = ((n5[]) this.c.c)[0];
        CharSequence text = n5Var != null ? n5Var.getText() : null;
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        z4 z4Var = this.c;
        z4Var.b(0);
        return ((n5[]) z4Var.c)[0].getTextPaint().getFontMetricsInt();
    }

    public n5 getTitleTextView() {
        return ((n5[]) this.c.c)[0];
    }

    public n5 getTitleTextView2() {
        return ((n5[]) this.c.c)[1];
    }

    public float getTitlesAlpha() {
        return this.v0;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final void h(k5 k5Var, r0 r0Var) {
        this.R = k5Var;
        this.S = r0Var;
        invalidate();
    }

    public final void k(View view, t60 t60Var) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        float height = (view.getHeight() / 2.0f) + view.getY();
        float scaleX = view.getScaleX() * (view.getWidth() / 2.0f);
        float scaleY = view.getScaleY() * (view.getHeight() / 2.0f);
        RectF rectF = this.s0;
        rectF.set(width - scaleX, height - scaleY, width + scaleX, height + scaleY);
        Path path = this.r0;
        path.rewind();
        path.addRoundRect(rectF, scaleY, scaleY, Path.Direction.CW);
        t60Var.a(path);
    }

    public final void l() {
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        float f10 = 1.0f - actionModeFactor;
        float f11 = searchFactor * f10;
        float f12 = (1.0f - searchFactor) * f10;
        float f13 = this.v0 * f12;
        float T1 = org.telegram.messenger.g0.T1(1.0f, 0.94f, Math.max(searchFactor, actionModeFactor));
        z4 z4Var = this.c;
        F(z4Var, f13);
        z4Var.setScaleX(T1);
        z4Var.setScaleY(T1);
        d5 d5Var = this.n;
        if (d5Var != null) {
            float visibleFactor = d5Var.getVisibleFactor() * f12;
            F(this.n, visibleFactor);
            float T12 = this.n.c == c5.a ? org.telegram.messenger.g0.T1(0.6f, 1.0f, visibleFactor) : org.telegram.messenger.g0.T1(0.8f, 1.0f, f12);
            this.n.setScaleX(T12);
            this.n.setScaleY(T12);
        }
        g5 g5Var = this.d;
        if (g5Var != null) {
            g5Var.setTranslationX(-v(false));
            F(this.d, f12);
            float T13 = org.telegram.messenger.g0.T1(0.7f, 1.0f, f12);
            this.d.setPivotX(r11.getWidth() - org.telegram.messenger.g0.L(19.0f));
            this.d.setPivotY(r11.getHeight() / 2.0f);
            this.d.setScaleX(T13);
            this.d.setScaleY(T13);
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (!z(childAt) && childAt.getVisibility() != 8) {
                F(childAt, f12);
            }
        }
        g5 g5Var2 = this.e;
        if (g5Var2 != null) {
            F(g5Var2, actionModeFactor);
            float T14 = org.telegram.messenger.g0.T1(0.7f, 1.0f, actionModeFactor);
            this.e.setPivotX(r5.getWidth() - org.telegram.messenger.g0.L(19.0f));
            this.e.setPivotY(r5.getHeight() / 2.0f);
            this.e.setScaleX(T14);
            this.e.setScaleY(T14);
        }
        org.telegram.ui.Components.n6 n6Var = this.f;
        if (n6Var != null) {
            F(n6Var, actionModeFactor);
            this.f.setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f10);
        }
        org.telegram.ui.Components.n6 n6Var2 = this.h;
        if (n6Var2 != null) {
            F(n6Var2, actionModeFactor);
            this.h.setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f10);
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            F(frameLayout, f11);
            RectF rectF = this.q0;
            p(rectF);
            this.r.setTranslationX(Math.max(0.0f, rectF.left - getSearchPillLeft()));
        }
        yb ybVar = this.b;
        if (((Drawable) ybVar.c) != null) {
            ybVar.setVisibility(0);
            ybVar.setAlpha(1.0f);
            ybVar.setScaleX(1.0f);
            ybVar.setScaleY(1.0f);
        } else {
            ybVar.setVisibility(actionModeFactor <= 0.0f ? 8 : 0);
            ybVar.setAlpha(actionModeFactor);
            ybVar.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, actionModeFactor));
            ybVar.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, actionModeFactor));
        }
        ybVar.invalidate();
        invalidate();
    }

    public final void m() {
        TextView textView;
        if (this.s == null) {
            return;
        }
        n0 searchListener = getSearchListener();
        boolean z10 = this.s.length() > 0 || ((textView = this.x) != null && textView.getVisibility() == 0 && (searchListener == null || searchListener.m())) || (searchListener != null && searchListener.d());
        this.V.a(z10, y() && this.G);
        this.w.setEnabled(z10);
    }

    public final void n() {
        n0 searchListener = getSearchListener();
        if (searchListener == null || searchListener.a()) {
            this.x.setVisibility(8);
            m();
            if (searchListener != null) {
                searchListener.f();
            }
        }
    }

    public final void o(boolean z10) {
        if (this.G) {
            n0 searchListener = getSearchListener();
            if (searchListener == null || searchListener.b()) {
                this.G = false;
                this.s.clearFocus();
                if (z10) {
                    org.telegram.messenger.g0.v1(this.s);
                }
                this.T.a(false, y());
                l();
                if (searchListener != null) {
                    searchListener.h();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d0 = true;
        ks.e().c(this, ks.p4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d0 = false;
        this.c0 = false;
        ks.e().n(this, ks.p4);
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
            if (!z(childAt) && childAt.getVisibility() != 8) {
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
        yb ybVar = this.b;
        boolean z10 = ((Drawable) ybVar.c) != null;
        int L = ((currentActionBarHeight - org.telegram.messenger.g0.L(46.0f)) / 2) + rowTop;
        G(ybVar, org.telegram.messenger.g0.L(6.0f), L, 0);
        g5 g5Var = this.d;
        float targetPillWidth = (g5Var == null || g5Var.getVisibility() == 8) ? 0.0f : this.d.getTargetPillWidth();
        float v = v(true);
        int max = Math.max(Math.max(z10 ? org.telegram.messenger.g0.L(64.0f) : org.telegram.messenger.g0.L(18.0f), (targetPillWidth > 0.0f || v > 0.0f) ? org.telegram.messenger.g0.L(18.0f) + ((int) (targetPillWidth + v)) : 0), this.t0);
        z4 z4Var = this.c;
        if (z4Var.b != max) {
            z4Var.b = max;
            z4Var.requestLayout();
        }
        G(z4Var, 0, rowTop, 0);
        z4Var.getLayoutParams().height = currentActionBarHeight;
        g5 g5Var2 = this.d;
        if (g5Var2 != null) {
            G(g5Var2, 0, rowTop, org.telegram.messenger.g0.L(10.0f));
            this.d.getLayoutParams().height = currentActionBarHeight;
        }
        g5 g5Var3 = this.e;
        if (g5Var3 != null) {
            G(g5Var3, 0, rowTop, org.telegram.messenger.g0.L(10.0f));
            this.e.getLayoutParams().height = currentActionBarHeight;
        }
        if (this.f != null) {
            g5 g5Var4 = this.e;
            int L2 = org.telegram.messenger.g0.L(18.0f) + ((int) (g5Var4 != null ? g5Var4.getTargetPillWidth() : 0.0f));
            org.telegram.ui.Components.n6 n6Var = this.h;
            if (n6Var == null || n6Var.getTag() == null) {
                G(this.f, org.telegram.messenger.g0.L(66.0f), rowTop, L2);
                this.f.getLayoutParams().height = currentActionBarHeight;
            } else {
                int i12 = (currentActionBarHeight / 2) + rowTop;
                G(this.f, org.telegram.messenger.g0.L(66.0f), i12 - org.telegram.messenger.g0.L(22.0f), L2);
                this.f.getLayoutParams().height = org.telegram.messenger.g0.L(22.0f);
                G(this.h, org.telegram.messenger.g0.L(66.0f), org.telegram.messenger.g0.L(1.0f) + i12, L2);
                this.h.getLayoutParams().height = org.telegram.messenger.g0.L(18.0f);
            }
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            G(frameLayout, (int) getSearchPillLeft(), L, org.telegram.messenger.g0.L(6.0f));
        }
        d5 d5Var = this.n;
        if (d5Var != null) {
            G(d5Var, 0, L, org.telegram.messenger.g0.L(6.0f));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return !this.u0;
    }

    public final float p(RectF rectF) {
        float f10;
        float f11;
        float f12;
        int L = org.telegram.messenger.g0.L(6.0f);
        float L2 = org.telegram.messenger.g0.L(23.0f);
        float currentActionBarHeight = (k.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        g5 g5Var = this.d;
        float pillWidth = (g5Var == null || g5Var.getVisibility() == 8) ? 0.0f : this.d.getPillWidth();
        g5 g5Var2 = this.e;
        float pillWidth2 = g5Var2 != null ? g5Var2.getPillWidth() : 0.0f;
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
        float width = (getWidth() - L) - v(false);
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

    public final g5 q() {
        if (this.e == null) {
            g5 g5Var = new g5(getContext(), this, true);
            this.e = g5Var;
            View view = this.b;
            addView(g5Var, indexOfChild(view), ma.e(-2, -2, 53));
            org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(getContext(), true, true, true);
            this.f = n6Var;
            n6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
            this.f.setTypeface(org.telegram.messenger.g0.o());
            this.f.setTextColor(this.h0);
            this.f.setGravity(19);
            this.f.setEllipsizeByGradient(true);
            this.f.b(0.6f, 320L, lr.h);
            addView(this.f, indexOfChild(view), ma.e(-1, -2, 51));
            l();
        }
        return this.e;
    }

    public final void r() {
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
        n10.s(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.I = c10;
        fh.g c11 = cVar.c(this, null, false);
        c11.p(aVar);
        n10.s(c11, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.J = c11;
        fh.g c12 = cVar.c(this, null, false);
        c12.p(aVar);
        n10.s(c12, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.K = c12;
        this.L = org.telegram.messenger.g0.L(23.0f);
        invalidate();
    }

    public final d5 s(String str) {
        if (this.n == null) {
            d5 d5Var = new d5(getContext(), this, str);
            this.n = d5Var;
            addView(d5Var, indexOfChild(this.b), ma.e(-2, 46, 53));
            l();
        }
        return this.n;
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.W = jVar;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        this.b.setContentDescription(charSequence);
    }

    public void setBackButtonDrawable(Drawable drawable) {
        this.b.c(drawable);
        l();
        requestLayout();
    }

    public void setBackButtonImage(int i7) {
        setBackButtonDrawable(i7 != 0 ? getContext().getDrawable(i7).mutate() : null);
    }

    public void setBackButtonImageAnimated(int i7) {
        Drawable mutate = getContext().getDrawable(i7).mutate();
        yb ybVar = this.b;
        Drawable drawable = (Drawable) ybVar.c;
        boolean z10 = drawable != null;
        te.c cVar = (te.c) ybVar.f;
        if (drawable == null || !((a5) ybVar.h).y()) {
            ybVar.c(mutate);
        } else {
            Drawable drawable2 = (Drawable) ybVar.c;
            ybVar.c(mutate);
            ybVar.d = drawable2;
            cVar.c(0.0f);
            cVar.a(1.0f);
        }
        if (z10) {
            return;
        }
        l();
        requestLayout();
    }

    public void setButtonsGlass(dh.c cVar) {
        this.P = cVar;
        if (this.M != null) {
            r();
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
        g5 g5Var = this.d;
        if (g5Var != null) {
            g5Var.setEnabled(z10);
        }
        d5 d5Var = this.n;
        if (d5Var != null) {
            d5Var.setEnabled(z10);
        }
    }

    public void setExtraHeight(int i7) {
        if (this.b0 != i7) {
            this.b0 = i7;
            requestLayout();
        }
    }

    public void setForceSkipTouches(boolean z10) {
        this.u0 = z10;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public void setMenuGlassFrostedProgress(float f10) {
        ui.d dVar = this.p0;
        if (dVar != null) {
            dVar.j(f10);
        }
    }

    public void setMenuGlassStroke(boolean z10) {
        this.n0 = z10;
    }

    public void setMenuOverlayProvider(p10 p10Var) {
        this.Q = p10Var;
    }

    public void setOccupyStatusBar(boolean z10) {
        if (this.a0 != z10) {
            this.a0 = z10;
            requestLayout();
        }
    }

    public void setSearchFieldCaption(CharSequence charSequence) {
        u();
        this.x.setText(charSequence);
        this.x.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        m();
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

    public void setSearchItem(h5 h5Var) {
        if (h5Var == null && this.y != null && this.G) {
            o(true);
        }
        this.y = h5Var;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.c.c(charSequence);
    }

    public void setSubtitleAnimated(CharSequence charSequence) {
        if (!y()) {
            setSubtitle(charSequence);
            return;
        }
        z4 z4Var = this.c;
        n5 n5Var = (n5) z4Var.d;
        if (n5Var == null || n5Var.getVisibility() == 8 || TextUtils.isEmpty(charSequence) || TextUtils.equals((CharSequence) z4Var.f, charSequence)) {
            if (TextUtils.equals((CharSequence) z4Var.f, charSequence)) {
                return;
            }
            z4Var.c(charSequence);
            return;
        }
        z4Var.f = charSequence;
        if (((n5) z4Var.e) == null) {
            z4Var.e = z4Var.a();
        }
        n5 n5Var2 = (n5) z4Var.d;
        n5 n5Var3 = (n5) z4Var.e;
        z4Var.d = n5Var3;
        z4Var.e = n5Var2;
        n5Var3.animate().cancel();
        ((n5) z4Var.d).l(charSequence, false);
        ((n5) z4Var.d).setVisibility(0);
        ((n5) z4Var.d).setAlpha(0.0f);
        ((n5) z4Var.d).setTranslationY(org.telegram.messenger.g0.L(6.0f));
        ViewPropertyAnimator duration = ((n5) z4Var.d).animate().alpha(1.0f).translationY(0.0f).setDuration(380L);
        lr lrVar = lr.h;
        duration.setInterpolator(lrVar).start();
        n5Var2.animate().cancel();
        n5Var2.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(6.0f)).setDuration(380L).setInterpolator(lrVar).withEndAction(new y4(n5Var2, 0)).start();
        z4Var.requestLayout();
    }

    public void setSubtitleColor(int i7) {
        this.l0 = true;
        this.f0 = i7;
        this.c.d();
    }

    public void setTitle(CharSequence charSequence) {
        z4 z4Var = this.c;
        z4Var.b(0);
        n5[] n5VarArr = (n5[]) z4Var.c;
        n5 n5Var = n5VarArr[1];
        if (n5Var != null) {
            n5Var.animate().cancel();
            n5VarArr[1].setVisibility(8);
        }
        n5VarArr[0].animate().cancel();
        n5VarArr[0].setAlpha(1.0f);
        n5VarArr[0].setTranslationY(0.0f);
        n5VarArr[0].k(charSequence);
        n5VarArr[0].setVisibility(TextUtils.isEmpty(charSequence) ? 4 : 0);
    }

    public void setTitleColor(int i7) {
        this.k0 = true;
        this.e0 = i7;
        this.c.d();
    }

    public void setTitleMinSideInset(int i7) {
        if (this.t0 != i7) {
            this.t0 = i7;
            requestLayout();
        }
    }

    public void setTitlesAlpha(float f10) {
        if (this.v0 != f10) {
            this.v0 = f10;
            l();
        }
    }

    public final g5 t() {
        if (this.d == null) {
            g5 g5Var = new g5(getContext(), this, false);
            this.d = g5Var;
            addView(g5Var, indexOfChild(this.b), ma.e(-2, -2, 53));
            l();
        }
        return this.d;
    }

    public final void u() {
        if (this.r != null) {
            return;
        }
        Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        int i7 = 4;
        frameLayout.setVisibility(4);
        addView(this.r, indexOfChild(this.b), ma.e(-1, 46, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        this.r.addView(linearLayout, ma.d(-1, -1.0f, 51, 18.0f, 0.0f, 42.0f, 0.0f));
        TextView textView = new TextView(context);
        this.x = textView;
        int i10 = 1;
        textView.setTextSize(1, 17.0f);
        this.x.setSingleLine(true);
        this.x.setEllipsize(TextUtils.TruncateAt.END);
        this.x.setGravity(19);
        this.x.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
        this.x.setVisibility(8);
        linearLayout.addView(this.x, ma.o(-2, -1));
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
        this.s.setOnEditorActionListener(new di.n(this, i7));
        this.s.addTextChangedListener(new ah.j(this, 16));
        linearLayout.addView(this.s, ma.l(1.0f, 0, -1));
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.w.setImageResource(R.drawable.ic_close_white);
        this.w.setContentDescription(gd.M0(2131752088, null));
        this.w.setOnClickListener(new x4(this, i10));
        this.r.addView(this.w, ma.d(42, 42.0f, 21, 0.0f, 0.0f, 2.0f, 0.0f));
        K();
        m();
        H(2, this.V.e, 0.0f, null);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        C();
        this.c.d();
        this.b.d();
        g5 g5Var = this.d;
        if (g5Var != null) {
            g5Var.i();
        }
        g5 g5Var2 = this.e;
        if (g5Var2 != null) {
            g5Var2.i();
        }
        org.telegram.ui.Components.n6 n6Var = this.f;
        if (n6Var != null) {
            n6Var.setTextColor(this.h0);
        }
        d5 d5Var = this.n;
        if (d5Var != null) {
            d5Var.c();
        }
        org.telegram.ui.Components.n6 n6Var2 = this.h;
        if (n6Var2 != null) {
            n6Var2.setTextColor(this.f0);
        }
        if (this.s != null) {
            K();
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

    public final float v(boolean z10) {
        float actionModeFactor;
        d5 d5Var = this.n;
        if (d5Var == null) {
            return 0.0f;
        }
        if (d5Var.getVisibility() == 8 && z10) {
            return 0.0f;
        }
        if (z10) {
            actionModeFactor = this.n.getTargetVisibleFactor();
        } else {
            actionModeFactor = (1.0f - getActionModeFactor()) * (1.0f - getSearchFactor()) * this.n.getVisibleFactor();
        }
        return (org.telegram.messenger.g0.L(12.0f) + this.n.getButtonWidth()) * actionModeFactor;
    }

    public final void w() {
        g5 g5Var = this.e;
        if (g5Var == null || !this.H) {
            return;
        }
        this.H = false;
        g5Var.g();
        this.U.a(false, y());
        l();
        this.b.b(false, y());
        ks.e().k(ks.t4, new Object[0]);
    }

    public final boolean x() {
        return this.e != null && this.H;
    }

    public final boolean y() {
        return this.c0 && this.d0;
    }

    public final boolean z(View view) {
        return view == this.b || view == this.c || view == this.d || view == this.e || view == this.f || view == this.h || view == this.r || view == this.n;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.ui.ActionBar.u4
    public View getMenuHostView() {
        return this;
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
