// default package

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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class jla extends FrameLayout implements s84, fn7, snb, o27, cu5 {
    public final RectF A0;
    public int B0;
    public boolean C0;
    public float D0;
    public ImageView E;
    public View F;
    public boolean G;
    public final RectF H;
    public sla I;
    public CharSequence J;
    public CharSequence K;
    public boolean L;
    public boolean M;
    public jl0 N;
    public jl0 O;
    public jl0 P;
    public jl0 Q;
    public float R;
    public ll0 S;
    public ol0 T;
    public bl0 U;
    public ll0 V;
    public hcc W;
    public final vnb a;
    public ula a0;
    public final gla b;
    public s7 b0;
    public final r98 c;
    public final fm0 c0;
    public rla d;
    public final fm0 d0;
    public rla e;
    public final fm0 e0;
    public in f;
    public d6 f0;
    public boolean g0;
    public in h;
    public int h0;
    public boolean i0;
    public boolean j0;
    public int k0;
    public int l0;
    public int m0;
    public nla n;
    public int n0;
    public int o0;
    public int p0;
    public boolean q0;
    public FrameLayout r;
    public boolean r0;
    public m7 s;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public ll0 v0;
    public ImageView w;
    public pz4 w0;
    public TextView x;
    public final RectF x0;
    public LinearLayout y;
    public float y0;
    public final Path z0;

    public jla(Context context, vnb vnbVar) {
        super(context);
        this.H = new RectF();
        this.R = -1.0f;
        k43 k43Var = k43.h;
        this.c0 = new fm0(0, this, k43Var, 380L, false);
        this.d0 = new fm0(1, this, k43Var, 380L, false);
        this.e0 = new fm0(2, this, k43Var, 250L, false);
        this.g0 = true;
        this.u0 = true;
        this.x0 = new RectF();
        this.y0 = 1.0f;
        this.z0 = new Path();
        this.A0 = new RectF();
        this.D0 = 1.0f;
        this.a = vnbVar;
        setClipChildren(false);
        setWillNotDraw(false);
        G();
        r98 r98Var = new r98(this, context);
        this.c = r98Var;
        addView(r98Var, tre.e(-1, -2, 51));
        gla glaVar = new gla(this, context);
        this.b = glaVar;
        glaVar.setVisibility(8);
        glaVar.setContentDescription(ob6.M0(2131754874, null));
        glaVar.setOnClickListener(new fla(this, (byte) 0));
        addView(glaVar, tre.e(46, 46, 51));
    }

    public static void I(View view, float f) {
        view.setAlpha(f);
        view.setVisibility(f > 0.0f ? 0 : 4);
    }

    public static void J(View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i;
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.rightMargin = i3;
    }

    private int getRowTop() {
        if (this.g0) {
            return hl.m;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public o7 getSearchListener() {
        sla slaVar = this.I;
        if (slaVar != null) {
            return slaVar.getSearchListener();
        }
        return null;
    }

    private float getSearchPillLeft() {
        return hl.L(((Drawable) this.b.b) != null ? 58.0f : 6.0f);
    }

    private void setSearchCloseCircle(boolean z) {
        if (this.G == z) {
            return;
        }
        this.G = z;
        this.w.setVisibility(z ? 8 : 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.y.getLayoutParams();
        marginLayoutParams.rightMargin = hl.L(z ? 18.0f : 42.0f);
        this.y.setLayoutParams(marginLayoutParams);
        requestLayout();
    }

    public final boolean A() {
        return this.i0 && this.j0;
    }

    public final boolean B(View view) {
        return view == this.b || view == this.c || view == this.d || view == this.e || view == this.f || view == this.h || view == this.r || view == this.n || view == this.E;
    }

    public final boolean C() {
        TextView textView = this.x;
        return textView != null && textView.getVisibility() == 0;
    }

    public final /* synthetic */ void D(int i, KeyEvent keyEvent) {
        if (i != 3) {
            if (keyEvent == null) {
                return;
            }
            if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                return;
            }
        }
        hl.t1(this.s);
        o7 searchListener = getSearchListener();
        if (searchListener != null) {
            searchListener.k(this.s);
        }
    }

    public final boolean E() {
        ula ulaVar = this.a0;
        if (ulaVar != null) {
            ulaVar.a(true);
            return true;
        }
        if (this.M || !this.L) {
            return false;
        }
        o(true);
        return true;
    }

    public final boolean F(boolean z, boolean z2) {
        o7 searchListener;
        rla rlaVar;
        boolean z3 = false;
        if (this.I == null || this.L || this.M || !((searchListener = getSearchListener()) == null || searchListener.c())) {
            return false;
        }
        w();
        setSearchCloseCircle(this.F != null && ((rlaVar = this.d) == null || rlaVar.getVisibility() == 8 || this.d.getPillWidth() <= 0.0f));
        this.L = true;
        rla rlaVar2 = this.d;
        if (rlaVar2 != null) {
            rlaVar2.f();
        }
        m7 m7Var = this.s;
        CharSequence charSequence = this.K;
        if (charSequence == null) {
            charSequence = "";
        }
        m7Var.setText(charSequence);
        this.K = null;
        this.s.requestFocus();
        if (z) {
            hl.E3(this.s);
        }
        rla rlaVar3 = this.d;
        boolean z4 = (rlaVar3 == null || rlaVar3.getVisibility() == 8 || this.d.getPillWidth() <= 0.0f) ? false : true;
        k43 k43Var = z4 ? k43.h : k43.f;
        fm0 fm0Var = this.c0;
        fm0Var.c = k43Var;
        t84 t84Var = fm0Var.h;
        if (t84Var != null) {
            t84Var.c = k43Var;
        }
        long j = z4 ? 380L : 220L;
        fm0Var.d = j;
        if (t84Var != null) {
            t84Var.d = j;
        }
        if (z2 && A()) {
            z3 = true;
        }
        fm0Var.a(true, z3);
        l();
        if (searchListener != null) {
            searchListener.i();
        }
        return true;
    }

    public final void G() {
        boolean z = this.q0;
        vnb vnbVar = this.a;
        if (!z) {
            this.k0 = aob.v0(aob.G6, vnbVar);
        }
        if (!this.r0) {
            this.l0 = aob.v0(aob.y6, vnbVar);
        }
        if (!this.s0) {
            this.m0 = aob.v0(aob.G6, vnbVar);
        }
        this.n0 = aob.v0(aob.G6, vnbVar);
        if (!this.t0) {
            this.o0 = aob.v0(aob.i6, vnbVar);
        }
        this.p0 = aob.v0(aob.i6, vnbVar);
    }

    public final void H(int i, boolean z) {
        String E = ob6.E(i, ' ');
        r();
        this.f.c(E, z && A() && this.M, true);
    }

    public final void K(CharSequence charSequence, boolean z, long j, k43 k43Var) {
        if (!A()) {
            setTitle(charSequence);
            return;
        }
        r98 r98Var = this.c;
        r98Var.b(0);
        r98Var.b(1);
        ema[] emaVarArr = (ema[]) r98Var.c;
        ema emaVar = emaVarArr[0];
        ema emaVar2 = emaVarArr[1];
        emaVarArr[0] = emaVar2;
        emaVarArr[1] = emaVar;
        emaVar2.animate().cancel();
        emaVar2.k(charSequence);
        emaVar2.setVisibility(0);
        emaVar2.setAlpha(0.0f);
        int L = hl.L(16.0f);
        if (!z) {
            L = -L;
        }
        emaVar2.setTranslationY(L);
        emaVar2.animate().alpha(1.0f).translationY(0.0f).setDuration(j).setInterpolator(k43Var).start();
        emaVar.animate().cancel();
        emaVar.animate().alpha(0.0f).translationY(z ? -hl.L(16.0f) : hl.L(16.0f)).setDuration(j).setInterpolator(k43Var).withEndAction(new ila(emaVar, (byte) 1)).start();
        r98Var.requestLayout();
    }

    public final void L() {
        if (this.e == null || this.M) {
            return;
        }
        this.M = true;
        rla rlaVar = this.d;
        if (rlaVar != null) {
            rlaVar.f();
        }
        m7 m7Var = this.s;
        if (m7Var != null && this.L) {
            hl.t1(m7Var);
        }
        this.d0.a(true, A());
        l();
        this.b.b(true, A());
        jn7.e().k(jn7.u4, new Object[0]);
    }

    public final void M() {
        jl0 jl0Var = this.N;
        if (jl0Var != null) {
            jl0Var.updateColors();
            this.O.updateColors();
            this.P.updateColors();
            this.Q.updateColors();
        }
        invalidate();
        ula ulaVar = this.a0;
        if (ulaVar != null) {
            ulaVar.invalidate();
        }
    }

    public final void N() {
        m7 m7Var = this.s;
        int i = aob.G6;
        vnb vnbVar = this.a;
        m7Var.setTextColor(aob.v0(i, vnbVar));
        this.x.setTextColor(aob.v0(i, vnbVar));
        this.s.setHintTextColor(aob.v0(aob.H6, vnbVar));
        this.s.setCursorColor(aob.v0(i, vnbVar));
        this.s.setHighlightColor(aob.v0(aob.lg, vnbVar));
        this.s.setHandlesColor(aob.v0(aob.mg, vnbVar));
        int v0 = aob.v0(aob.m6, vnbVar);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.w.setColorFilter(new PorterDuffColorFilter(v0, mode));
        this.w.setBackground(aob.f0(this.o0, 1, -1));
        this.E.setColorFilter(new PorterDuffColorFilter(this.m0, mode));
        this.E.setBackground(aob.f0(this.o0, 1, -1));
    }

    @Override // o27
    public final boolean a() {
        return false;
    }

    @Override // o27
    public final void b(ula ulaVar, s7 s7Var) {
        this.a0 = ulaVar;
        this.b0 = s7Var;
        invalidate();
    }

    @Override // o27
    public final boolean c(s7 s7Var, RectF rectF) {
        if (s7Var.getParent() == this.d && getSearchFactor() == 0.0f && getActionModeFactor() == 0.0f) {
            p(rectF);
            return true;
        }
        float L = hl.L(23.0f);
        View view = (View) s7Var.getParent();
        float width = (s7Var.getWidth() / 2.0f) + s7Var.getX() + (view != null ? view.getX() : 0.0f);
        float currentActionBarHeight = (a.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        rectF.set(width - L, currentActionBarHeight - L, width + L, currentActionBarHeight + L);
        return false;
    }

    @Override // o27
    public final boolean d() {
        return true;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.q4) {
            updateColors();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        nla nlaVar;
        this.i0 = this.j0;
        int L = hl.L(6.0f);
        if (this.N != null) {
            gla glaVar = this.b;
            if (glaVar.getVisibility() == 0 && glaVar.getAlpha() > 0.0f) {
                float width = (glaVar.getWidth() / 2.0f) + glaVar.getX();
                float height = (glaVar.getHeight() / 2.0f) + glaVar.getY();
                float scaleX = glaVar.getScaleX() * (glaVar.getWidth() / 2.0f);
                float scaleY = glaVar.getScaleY() * (glaVar.getHeight() / 2.0f);
                this.N.setBounds(((int) (width - scaleX)) - L, ((int) (height - scaleY)) - L, ((int) (width + scaleX)) + L, ((int) (height + scaleY)) + L);
                this.N.setAlpha((int) (glaVar.getAlpha() * 255.0f));
                this.N.draw(canvas);
            }
        }
        if (this.P != null && (nlaVar = this.n) != null && nlaVar.c == mla.a && nlaVar.getVisibility() == 0 && this.n.getAlpha() > 0.0f) {
            float width2 = (this.n.getWidth() / 2.0f) + this.n.getX();
            float height2 = (this.n.getHeight() / 2.0f) + this.n.getY();
            float scaleX2 = this.n.getScaleX() * (this.n.getWidth() / 2.0f);
            float scaleY2 = this.n.getScaleY() * (this.n.getHeight() / 2.0f);
            this.P.setBounds(((int) (width2 - scaleX2)) - L, ((int) (height2 - scaleY2)) - L, ((int) (width2 + scaleX2)) + L, ((int) (height2 + scaleY2)) + L);
            this.P.setAlpha((int) (this.n.getAlpha() * 255.0f));
            this.P.draw(canvas);
        }
        if (this.O != null) {
            RectF rectF = this.x0;
            float p = p(rectF);
            s7 s7Var = this.b0;
            boolean z = s7Var != null && s7Var.getParent() == this.d;
            if (p > 0.0f && rectF.width() > 0.0f && !z) {
                float height3 = rectF.height() / 2.0f;
                if (Math.abs(height3 - this.R) > 0.5f) {
                    this.R = height3;
                    this.O.r(height3);
                }
                this.O.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                this.O.setAlpha((int) (p * 255.0f * this.y0));
                this.O.draw(canvas);
            }
        }
        if (this.Q != null) {
            RectF rectF2 = this.H;
            if (q(rectF2)) {
                this.Q.setBounds(((int) rectF2.left) - L, ((int) rectF2.top) - L, ((int) rectF2.right) + L, ((int) rectF2.bottom) + L);
                this.Q.setAlpha(jn7.d4);
                this.Q.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        s7 s7Var;
        if (view == this.d && (s7Var = this.b0) != null && s7Var.getParent() == this.d) {
            return false;
        }
        if (view != this.r || getSearchFactor() >= 1.0f) {
            return super.drawChild(canvas, view, j);
        }
        RectF rectF = this.x0;
        p(rectF);
        canvas.save();
        canvas.clipRect(rectF);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    @Override // cu5
    public final void e(au5 au5Var) {
        nla nlaVar;
        if (this.N != null) {
            gla glaVar = this.b;
            if (glaVar.getVisibility() == 0 && glaVar.getAlpha() > 0.0f) {
                k(glaVar, au5Var);
            }
        }
        if (this.P != null && (nlaVar = this.n) != null && nlaVar.c == mla.a && nlaVar.getVisibility() == 0 && this.n.getAlpha() > 0.0f) {
            k(this.n, au5Var);
        }
        jl0 jl0Var = this.O;
        RectF rectF = this.A0;
        Path path = this.z0;
        if (jl0Var != null && p(rectF) > 0.0f && rectF.width() > 0.0f) {
            path.rewind();
            path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
            au5Var.a(path);
        }
        if (this.Q != null && q(rectF)) {
            path.rewind();
            path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
            au5Var.a(path);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (!B(childAt) && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && (childAt.getBackground() instanceof jl0) && (childAt != this.F || !this.G || getSearchFactor() <= 0.0f)) {
                path.rewind();
                path.addPath(((jl0) childAt.getBackground()).S.k, childAt.getX(), childAt.getY());
                au5Var.a(path);
            }
        }
    }

    @Override // o27
    public final boolean f() {
        return this.u0;
    }

    @Override // o27
    public final boolean g() {
        return false;
    }

    public d6 getActionBarMenuOnItemClick() {
        return this.f0;
    }

    public rla getActionMode() {
        return this.e;
    }

    public float getActionModeFactor() {
        return this.d0.e;
    }

    public in getActionModeTitle() {
        r();
        return this.f;
    }

    public View getBackButton() {
        return this.b;
    }

    public Drawable getBackButtonDrawable() {
        return (Drawable) this.b.b;
    }

    @Override // o27
    public int getButtonsGlassBackgroundColor() {
        bl0 bl0Var = this.U;
        if (bl0Var == null) {
            bl0Var = this.T;
        }
        if (bl0Var != null) {
            return bl0Var.Q1();
        }
        return 0;
    }

    @Override // o27
    public bl0 getButtonsGlassColorProvider() {
        bl0 bl0Var = this.U;
        return bl0Var != null ? bl0Var : this.T;
    }

    public nla getDoneButton() {
        return this.n;
    }

    public int getExtraHeight() {
        return this.h0;
    }

    public rla getMenu() {
        return this.d;
    }

    @Override // o27
    public int getMenuAnchorTint() {
        return 0;
    }

    @Override // o27
    public int getMenuDimAlpha() {
        return -1;
    }

    @Override // o27
    public int getMenuExtraBelow() {
        return 0;
    }

    @Override // o27
    public bl0 getMenuGlassColorProvider() {
        return this.T;
    }

    @Override // o27
    public int getMenuMaxHeight() {
        return 0;
    }

    public ula getMenuOverlay() {
        hcc hccVar = this.W;
        if (hccVar != null) {
            return (ula) hccVar.run();
        }
        return null;
    }

    public float getMenuPillLeft() {
        RectF rectF = this.x0;
        p(rectF);
        return rectF.left;
    }

    @Override // o27
    public vnb getMenuResourcesProvider() {
        return this.a;
    }

    @Override // o27
    public int getMenuRise() {
        return 0;
    }

    @Override // o27
    public View getMenuView() {
        return this.d;
    }

    public boolean getOccupyStatusBar() {
        return this.g0;
    }

    @Override // o27
    public ula getOpenMenuOverlay() {
        return this.a0;
    }

    public float getSearchFactor() {
        return this.c0.e;
    }

    public EditTextBoldCursor getSearchField() {
        w();
        return this.s;
    }

    public String getSubtitle() {
        CharSequence charSequence = (CharSequence) this.c.f;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public ema getSubtitleTextView() {
        return (ema) this.c.d;
    }

    public String getTitle() {
        ema emaVar = ((ema[]) this.c.c)[0];
        CharSequence text = emaVar != null ? emaVar.getText() : null;
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        r98 r98Var = this.c;
        r98Var.b(0);
        return ((ema[]) r98Var.c)[0].getTextPaint().getFontMetricsInt();
    }

    public ema getTitleTextView() {
        return ((ema[]) this.c.c)[0];
    }

    public ema getTitleTextView2() {
        return ((ema[]) this.c.c)[1];
    }

    public float getTitlesAlpha() {
        return this.D0;
    }

    @Override // o27
    public final boolean h() {
        return false;
    }

    @Override // o27
    public final jl0 i(ula ulaVar) {
        ll0 ll0Var = this.v0;
        if (ll0Var == null) {
            ll0Var = this.S;
        }
        if (ll0Var == null) {
            return null;
        }
        jl0 c = ll0Var.c(ulaVar, null, false);
        c.p(this.T);
        ik8.r(c, hl.L(23.0f), 6.0f);
        return c;
    }

    public final void k(View view, au5 au5Var) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        float height = (view.getHeight() / 2.0f) + view.getY();
        float scaleX = view.getScaleX() * (view.getWidth() / 2.0f);
        float scaleY = view.getScaleY() * (view.getHeight() / 2.0f);
        RectF rectF = this.A0;
        rectF.set(width - scaleX, height - scaleY, width + scaleX, height + scaleY);
        Path path = this.z0;
        path.rewind();
        path.addRoundRect(rectF, scaleY, scaleY, Path.Direction.CW);
        au5Var.a(path);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l() {
        float f;
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        float f2 = 1.0f - actionModeFactor;
        float f3 = searchFactor * f2;
        float f4 = (1.0f - searchFactor) * f2;
        float f5 = this.D0 * f4;
        float R1 = hl.R1(1.0f, 0.94f, Math.max(searchFactor, actionModeFactor));
        r98 r98Var = this.c;
        I(r98Var, f5);
        r98Var.setScaleX(R1);
        r98Var.setScaleY(R1);
        nla nlaVar = this.n;
        if (nlaVar != null) {
            float visibleFactor = nlaVar.getVisibleFactor() * f4;
            I(this.n, visibleFactor);
            float R12 = this.n.c == mla.a ? hl.R1(0.6f, 1.0f, visibleFactor) : hl.R1(0.8f, 1.0f, f4);
            this.n.setScaleX(R12);
            this.n.setScaleY(R12);
        }
        rla rlaVar = this.d;
        float f6 = 2.0f;
        if (rlaVar != null) {
            rlaVar.setTranslationX(-x(false));
            I(this.d, f4);
            float R13 = hl.R1(0.7f, 1.0f, f4);
            this.d.setPivotX(r12.getWidth() - hl.L(19.0f));
            this.d.setPivotY(r12.getHeight() / 2.0f);
            this.d.setScaleX(R13);
            this.d.setScaleY(R13);
        }
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = getChildAt(i);
            if (B(childAt)) {
                f = f6;
            } else {
                f = f6;
                if (childAt.getVisibility() != 8) {
                    if (childAt == this.F) {
                        float f7 = this.G ? f3 : 0.0f;
                        ((qc9) ((hla) childAt)).setSearchCloseMorph(f7);
                        if (this.G) {
                            I(childAt, f7 < 1.0f ? 1.0f : 0.0f);
                        }
                    }
                    I(childAt, f4);
                }
            }
            i++;
            f6 = f;
        }
        float f8 = f6;
        rla rlaVar2 = this.e;
        if (rlaVar2 != null) {
            I(rlaVar2, actionModeFactor);
            float R14 = hl.R1(0.7f, 1.0f, actionModeFactor);
            this.e.setPivotX(r6.getWidth() - hl.L(19.0f));
            this.e.setPivotY(r6.getHeight() / f8);
            this.e.setScaleX(R14);
            this.e.setScaleY(R14);
        }
        in inVar = this.f;
        if (inVar != null) {
            I(inVar, actionModeFactor);
            this.f.setTranslationX((-hl.L(16.0f)) * f2);
        }
        in inVar2 = this.h;
        if (inVar2 != null) {
            I(inVar2, actionModeFactor);
            this.h.setTranslationX((-hl.L(16.0f)) * f2);
        }
        ImageView imageView = this.E;
        if (imageView != null) {
            float f9 = this.G ? f3 : 0.0f;
            I(imageView, f9);
            this.E.setScaleX(hl.R1(0.5f, 1.0f, f9));
            this.E.setScaleY(hl.R1(0.5f, 1.0f, f9));
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            I(frameLayout, f3);
            RectF rectF = this.x0;
            p(rectF);
            this.r.setTranslationX(Math.max(0.0f, rectF.left - getSearchPillLeft()));
        }
        gla glaVar = this.b;
        if (((Drawable) glaVar.b) != null) {
            glaVar.setVisibility(0);
            glaVar.setAlpha(1.0f);
            glaVar.setScaleX(1.0f);
            glaVar.setScaleY(1.0f);
        } else {
            glaVar.setVisibility(actionModeFactor <= 0.0f ? 8 : 0);
            glaVar.setAlpha(actionModeFactor);
            glaVar.setScaleX(hl.R1(0.6f, 1.0f, actionModeFactor));
            glaVar.setScaleY(hl.R1(0.6f, 1.0f, actionModeFactor));
        }
        glaVar.invalidate();
        invalidate();
    }

    public final void m() {
        if (this.s == null) {
            return;
        }
        o7 searchListener = getSearchListener();
        boolean z = this.s.length() > 0 || (C() && (searchListener == null || searchListener.m())) || (searchListener != null && searchListener.d());
        this.e0.a(z, A() && this.L);
        this.w.setEnabled(z);
    }

    public final void n() {
        o7 searchListener = getSearchListener();
        if (searchListener == null || searchListener.a()) {
            this.x.setVisibility(8);
            m();
            if (searchListener != null) {
                searchListener.f();
            }
        }
    }

    public final void o(boolean z) {
        if (this.L) {
            o7 searchListener = getSearchListener();
            if (searchListener == null || searchListener.b()) {
                this.L = false;
                this.s.clearFocus();
                if (z) {
                    hl.t1(this.s);
                }
                rla rlaVar = this.d;
                boolean z2 = (rlaVar == null || rlaVar.getVisibility() == 8 || this.d.getPillWidth() <= 0.0f) ? false : true;
                k43 k43Var = z2 ? k43.h : k43.f;
                fm0 fm0Var = this.c0;
                fm0Var.c = k43Var;
                t84 t84Var = fm0Var.h;
                if (t84Var != null) {
                    t84Var.c = k43Var;
                }
                long j = z2 ? 380L : 220L;
                fm0Var.d = j;
                if (t84Var != null) {
                    t84Var.d = j;
                }
                fm0Var.a(false, A());
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
        this.j0 = true;
        jn7.e().b(this, jn7.q4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.j0 = false;
        this.i0 = false;
        jn7.e().n(this, jn7.q4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int g;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        int rowTop = getRowTop();
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        int i7 = i3 - i;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (!B(childAt) && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.gravity, getLayoutDirection()) & 7;
                if (absoluteGravity == 5) {
                    g = i7 - measuredWidth;
                    i6 = layoutParams.rightMargin;
                } else {
                    int i9 = layoutParams.leftMargin;
                    if (absoluteGravity == 1) {
                        g = ik8.g(i7, measuredWidth, 2, i9);
                        i6 = layoutParams.rightMargin;
                    } else {
                        i5 = i9;
                        int g2 = (ik8.g(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                        childAt.layout(i5, g2, measuredWidth + i5, measuredHeight + g2);
                    }
                }
                i5 = g - i6;
                int g22 = (ik8.g(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                childAt.layout(i5, g22, measuredWidth + i5, measuredHeight + g22);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int rowTop = getRowTop();
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        int i3 = rowTop + currentActionBarHeight + this.h0;
        gla glaVar = this.b;
        boolean z = ((Drawable) glaVar.b) != null;
        int L = ((currentActionBarHeight - hl.L(46.0f)) / 2) + rowTop;
        J(glaVar, hl.L(6.0f), L, 0);
        rla rlaVar = this.d;
        float targetPillWidth = (rlaVar == null || rlaVar.getVisibility() == 8) ? 0.0f : this.d.getTargetPillWidth();
        float x = x(true);
        int max = Math.max(Math.max(z ? hl.L(64.0f) : hl.L(18.0f), (targetPillWidth > 0.0f || x > 0.0f) ? hl.L(18.0f) + ((int) (targetPillWidth + x)) : 0), this.B0);
        r98 r98Var = this.c;
        if (r98Var.b != max) {
            r98Var.b = max;
            r98Var.requestLayout();
        }
        J(r98Var, 0, rowTop, 0);
        r98Var.getLayoutParams().height = currentActionBarHeight;
        rla rlaVar2 = this.d;
        if (rlaVar2 != null) {
            J(rlaVar2, 0, rowTop, hl.L(10.0f));
            this.d.getLayoutParams().height = currentActionBarHeight;
        }
        rla rlaVar3 = this.e;
        if (rlaVar3 != null) {
            J(rlaVar3, 0, rowTop, hl.L(10.0f));
            this.e.getLayoutParams().height = currentActionBarHeight;
        }
        if (this.f != null) {
            rla rlaVar4 = this.e;
            int L2 = hl.L(18.0f) + ((int) (rlaVar4 != null ? rlaVar4.getTargetPillWidth() : 0.0f));
            in inVar = this.h;
            boolean z2 = (inVar == null || inVar.getTag() == null) ? false : true;
            in inVar2 = this.f;
            if (z2) {
                int i4 = (currentActionBarHeight / 2) + rowTop;
                J(inVar2, hl.L(66.0f), i4 - hl.L(22.0f), L2);
                this.f.getLayoutParams().height = hl.L(22.0f);
                J(this.h, hl.L(66.0f), hl.L(1.0f) + i4, L2);
                this.h.getLayoutParams().height = hl.L(18.0f);
            } else {
                J(inVar2, hl.L(66.0f), rowTop, L2);
                this.f.getLayoutParams().height = currentActionBarHeight;
            }
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            J(frameLayout, (int) getSearchPillLeft(), L, hl.L(6.0f) + (this.G ? hl.L(52.0f) : 0));
        }
        ImageView imageView = this.E;
        if (imageView != null) {
            J(imageView, 0, L, hl.L(6.0f));
        }
        nla nlaVar = this.n;
        if (nlaVar != null) {
            J(nlaVar, 0, L, hl.L(6.0f));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return !this.C0;
    }

    public final float p(RectF rectF) {
        float f;
        float f2;
        float f3;
        int L = hl.L(6.0f);
        float L2 = hl.L(23.0f);
        float currentActionBarHeight = (a.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        rla rlaVar = this.d;
        float pillWidth = (rlaVar == null || rlaVar.getVisibility() == 8) ? 0.0f : this.d.getPillWidth();
        rla rlaVar2 = this.e;
        float pillWidth2 = rlaVar2 != null ? rlaVar2.getPillWidth() : 0.0f;
        if (pillWidth <= 0.0f) {
            if (pillWidth2 <= 0.0f) {
                float f4 = (1.0f - actionModeFactor) * searchFactor;
                float L3 = (1.0f - f4) * hl.L(12.0f);
                float R1 = hl.R1(0.85f, 1.0f, f4) * L2;
                rectF.set(getSearchPillLeft() + L3, currentActionBarHeight - R1, ((getWidth() - L) - (this.G ? (L2 * 2.0f) + L : 0.0f)) - L3, currentActionBarHeight + R1);
                return f4;
            }
            f = actionModeFactor;
            pillWidth = pillWidth2;
        } else if (pillWidth2 <= 0.0f) {
            f = 1.0f - actionModeFactor;
        } else {
            pillWidth = hl.R1(pillWidth, pillWidth2, actionModeFactor);
            f = 1.0f;
        }
        float f5 = (1.0f - actionModeFactor) * searchFactor;
        float f6 = L2 * 2.0f;
        float f7 = pillWidth / f6;
        float R12 = hl.R1(0.8f, 1.0f, f) * Math.min(1.0f, f7);
        float width = (getWidth() - L) - x(false);
        float max = width - Math.max(pillWidth, f6);
        float f8 = currentActionBarHeight - L2;
        float f9 = currentActionBarHeight + L2;
        if (R12 < 1.0f) {
            float f10 = (max + width) / 2.0f;
            float B = qu6.B(1.0f, R12, L2, (width - max) / 2.0f);
            float f11 = f10 - B;
            width = f10 + B;
            float f12 = L2 * R12;
            float f13 = currentActionBarHeight - f12;
            f3 = currentActionBarHeight + f12;
            f2 = f13;
            max = f11;
        } else {
            f2 = f8;
            f3 = f9;
        }
        rectF.set(hl.R1(max, getSearchPillLeft(), f5), hl.R1(f2, f8, f5), hl.R1(width, getWidth() - L, f5), hl.R1(f3, f9, f5));
        return hl.R1(Math.min(1.0f, f7) * f, 1.0f, f5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean q(RectF rectF) {
        float actionModeFactor = (1.0f - getActionModeFactor()) * getSearchFactor();
        if (!this.G || actionModeFactor <= 0.0f) {
            return false;
        }
        int L = hl.L(6.0f);
        float L2 = hl.L(23.0f);
        float currentActionBarHeight = (a.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        float width = getWidth() - L;
        float f = width - (2.0f * L2);
        View view = this.F;
        if (view == 0 || view.getParent() != this || view.getVisibility() == 8) {
            rectF.set(f, currentActionBarHeight - L2, width, currentActionBarHeight + L2);
        } else {
            qc9 qc9Var = (qc9) ((hla) view);
            float L3 = hl.L(6.0f);
            rectF.set(L3, L3, qc9Var.getWidth() - r0, qc9Var.getHeight() - r0);
            rectF.offset(view.getX(), view.getY());
        }
        rectF.set(hl.R1(rectF.left, f, actionModeFactor), hl.R1(rectF.top, currentActionBarHeight - L2, actionModeFactor), hl.R1(rectF.right, width, actionModeFactor), hl.R1(rectF.bottom, currentActionBarHeight + L2, actionModeFactor));
        return true;
    }

    public final rla r() {
        if (this.e == null) {
            rla rlaVar = new rla(getContext(), this, true);
            this.e = rlaVar;
            View view = this.b;
            addView(rlaVar, indexOfChild(view), tre.e(-2, -2, 53));
            in inVar = new in(getContext(), true, true, true);
            this.f = inVar;
            inVar.setTextSize(hl.L(18.0f));
            this.f.setTypeface(hl.o());
            this.f.setTextColor(this.n0);
            this.f.setGravity(19);
            this.f.setEllipsizeByGradient(true);
            this.f.b(0.6f, 320L, k43.h);
            addView(this.f, indexOfChild(view), tre.e(-1, -2, 51));
            l();
        }
        return this.e;
    }

    public final void s() {
        ll0 ll0Var = this.V;
        if (ll0Var == null) {
            ll0Var = this.S;
        }
        if (ll0Var == null) {
            return;
        }
        bl0 bl0Var = this.U;
        if (bl0Var == null) {
            bl0Var = this.T;
        }
        jl0 c = ll0Var.c(this, null, false);
        c.p(bl0Var);
        ik8.r(c, hl.L(23.0f), 6.0f);
        this.N = c;
        jl0 c2 = ll0Var.c(this, null, false);
        c2.p(bl0Var);
        ik8.r(c2, hl.L(23.0f), 6.0f);
        this.O = c2;
        jl0 c3 = ll0Var.c(this, null, false);
        c3.p(bl0Var);
        ik8.r(c3, hl.L(23.0f), 6.0f);
        this.P = c3;
        jl0 c4 = ll0Var.c(this, null, false);
        c4.p(bl0Var);
        ik8.r(c4, hl.L(23.0f), 6.0f);
        this.Q = c4;
        this.R = hl.L(23.0f);
        invalidate();
    }

    public void setActionBarMenuOnItemClick(d6 d6Var) {
        this.f0 = d6Var;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        this.b.setContentDescription(charSequence);
    }

    public void setBackButtonDrawable(Drawable drawable) {
        this.b.c(drawable);
        l();
        requestLayout();
    }

    public void setBackButtonImage(int i) {
        setBackButtonDrawable(i != 0 ? getContext().getDrawable(i).mutate() : null);
    }

    public void setBackButtonImageAnimated(int i) {
        Drawable mutate = getContext().getDrawable(i).mutate();
        gla glaVar = this.b;
        Drawable drawable = (Drawable) glaVar.b;
        boolean z = drawable != null;
        t84 t84Var = (t84) glaVar.f;
        if (drawable == null || !((jla) glaVar.h).A()) {
            glaVar.c(mutate);
        } else {
            Drawable drawable2 = (Drawable) glaVar.b;
            glaVar.c(mutate);
            glaVar.c = drawable2;
            t84Var.c(0.0f);
            t84Var.a(1.0f);
        }
        if (z) {
            return;
        }
        l();
        requestLayout();
    }

    public void setButtonsGlass(ll0 ll0Var) {
        this.V = ll0Var;
        if (this.S != null) {
            s();
        }
    }

    public void setButtonsGlassColorProvider(bl0 bl0Var) {
        this.U = bl0Var;
        if (bl0Var == null) {
            bl0Var = this.T;
        }
        jl0 jl0Var = this.N;
        if (jl0Var != null) {
            jl0Var.p(bl0Var);
            this.O.p(bl0Var);
            this.P.p(bl0Var);
            this.Q.p(bl0Var);
        }
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.b.setEnabled(z);
        rla rlaVar = this.d;
        if (rlaVar != null) {
            rlaVar.setEnabled(z);
        }
        nla nlaVar = this.n;
        if (nlaVar != null) {
            nlaVar.setEnabled(z);
        }
    }

    public void setExtraHeight(int i) {
        if (this.h0 != i) {
            this.h0 = i;
            requestLayout();
        }
    }

    public void setForceSkipTouches(boolean z) {
        this.C0 = z;
    }

    @Override // o27
    public void setMenuGlassFrostedProgress(float f) {
        pz4 pz4Var = this.w0;
        if (pz4Var != null) {
            pz4Var.k(f);
        }
    }

    public void setMenuGlassStroke(boolean z) {
        this.u0 = z;
    }

    public void setMenuOverlayProvider(hcc hccVar) {
        this.W = hccVar;
    }

    public void setMenuPillAlpha(float f) {
        if (this.y0 == f) {
            return;
        }
        this.y0 = f;
        invalidate();
    }

    public void setOccupyStatusBar(boolean z) {
        if (this.g0 != z) {
            this.g0 = z;
            requestLayout();
        }
    }

    public void setSearchCloseAnchor(View view) {
        if (view != null && !(view instanceof hla)) {
            lq5.j("the anchor must implement SearchCloseAnchor");
            return;
        }
        KeyEvent.Callback callback = this.F;
        if (callback != null && callback != view) {
            ((qc9) ((hla) callback)).setSearchCloseMorph(0.0f);
            I(this.F, 1.0f);
        }
        this.F = view;
        l();
    }

    public void setSearchFieldCaption(CharSequence charSequence) {
        w();
        this.x.setText(charSequence);
        this.x.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        m();
    }

    public void setSearchFieldHint(CharSequence charSequence) {
        this.J = charSequence;
        m7 m7Var = this.s;
        if (m7Var != null) {
            m7Var.setHint(charSequence);
        }
    }

    public void setSearchFieldText(CharSequence charSequence) {
        m7 m7Var = this.s;
        if (m7Var == null) {
            this.K = charSequence;
            return;
        }
        m7Var.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.s.setSelection(charSequence.length());
    }

    public void setSearchItem(sla slaVar) {
        if (slaVar == null && this.I != null && this.L) {
            o(true);
        }
        this.I = slaVar;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.c.c(charSequence);
    }

    public void setSubtitleAnimated(CharSequence charSequence) {
        if (!A()) {
            setSubtitle(charSequence);
            return;
        }
        r98 r98Var = this.c;
        ema emaVar = (ema) r98Var.d;
        if (emaVar == null || emaVar.getVisibility() == 8 || TextUtils.isEmpty(charSequence) || TextUtils.equals((CharSequence) r98Var.f, charSequence)) {
            if (TextUtils.equals((CharSequence) r98Var.f, charSequence)) {
                return;
            }
            r98Var.c(charSequence);
            return;
        }
        r98Var.f = charSequence;
        ema emaVar2 = (ema) r98Var.e;
        if (emaVar2 == null) {
            emaVar2 = r98Var.a();
            r98Var.e = emaVar2;
        }
        ema emaVar3 = (ema) r98Var.d;
        r98Var.d = emaVar2;
        r98Var.e = emaVar3;
        emaVar2.animate().cancel();
        ((ema) r98Var.d).l(charSequence, false);
        ((ema) r98Var.d).setVisibility(0);
        ((ema) r98Var.d).setAlpha(0.0f);
        ((ema) r98Var.d).setTranslationY(hl.L(6.0f));
        ViewPropertyAnimator duration = ((ema) r98Var.d).animate().alpha(1.0f).translationY(0.0f).setDuration(380L);
        k43 k43Var = k43.h;
        duration.setInterpolator(k43Var).start();
        emaVar3.animate().cancel();
        emaVar3.animate().alpha(0.0f).translationY(-hl.L(6.0f)).setDuration(380L).setInterpolator(k43Var).withEndAction(new ila(emaVar3, (byte) 0)).start();
        r98Var.requestLayout();
    }

    public void setSubtitleColor(int i) {
        this.r0 = true;
        this.l0 = i;
        this.c.d();
    }

    public void setTitle(CharSequence charSequence) {
        r98 r98Var = this.c;
        r98Var.b(0);
        ema[] emaVarArr = (ema[]) r98Var.c;
        ema emaVar = emaVarArr[1];
        if (emaVar != null) {
            emaVar.animate().cancel();
            emaVarArr[1].setVisibility(8);
        }
        emaVarArr[0].animate().cancel();
        emaVarArr[0].setAlpha(1.0f);
        emaVarArr[0].setTranslationY(0.0f);
        emaVarArr[0].k(charSequence);
        emaVarArr[0].setVisibility(TextUtils.isEmpty(charSequence) ? 4 : 0);
    }

    public void setTitleColor(int i) {
        this.q0 = true;
        this.k0 = i;
        this.c.d();
    }

    public void setTitleMinSideInset(int i) {
        if (this.B0 != i) {
            this.B0 = i;
            requestLayout();
        }
    }

    public void setTitlesAlpha(float f) {
        if (this.D0 != f) {
            this.D0 = f;
            l();
        }
    }

    @Override // s84
    public void t(int i, float f, float f2, t84 t84Var) {
        if (i != 2) {
            l();
            return;
        }
        ImageView imageView = this.w;
        if (imageView != null) {
            imageView.setAlpha(f);
            float f3 = (f * 0.5f) + 0.5f;
            this.w.setScaleX(f3);
            this.w.setScaleY(f3);
            this.w.setVisibility(this.G ? 8 : f > 0.0f ? 0 : 4);
        }
    }

    public final nla u(String str) {
        if (this.n == null) {
            nla nlaVar = new nla(getContext(), this, str);
            this.n = nlaVar;
            addView(nlaVar, indexOfChild(this.b), tre.e(-2, 46, 53));
            l();
        }
        return this.n;
    }

    @Override // snb
    public final void updateColors() {
        G();
        this.c.d();
        this.b.d();
        rla rlaVar = this.d;
        if (rlaVar != null) {
            rlaVar.h();
        }
        rla rlaVar2 = this.e;
        if (rlaVar2 != null) {
            rlaVar2.h();
        }
        in inVar = this.f;
        if (inVar != null) {
            inVar.setTextColor(this.n0);
        }
        nla nlaVar = this.n;
        if (nlaVar != null) {
            nlaVar.c();
        }
        in inVar2 = this.h;
        if (inVar2 != null) {
            inVar2.setTextColor(this.l0);
        }
        if (this.s != null) {
            N();
        }
        jl0 jl0Var = this.N;
        if (jl0Var != null) {
            jl0Var.updateColors();
        }
        jl0 jl0Var2 = this.O;
        if (jl0Var2 != null) {
            jl0Var2.updateColors();
        }
        invalidate();
    }

    public final rla v() {
        if (this.d == null) {
            rla rlaVar = new rla(getContext(), this, false);
            this.d = rlaVar;
            addView(rlaVar, indexOfChild(this.b), tre.e(-2, -2, 53));
            l();
        }
        return this.d;
    }

    public final void w() {
        if (this.r != null) {
            return;
        }
        Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setVisibility(4);
        addView(this.r, indexOfChild(this.b), tre.e(-1, 46, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.y = linearLayout;
        linearLayout.setOrientation(0);
        this.r.addView(this.y, tre.d(-1, -1.0f, 51, 18.0f, 0.0f, 42.0f, 0.0f));
        TextView textView = new TextView(context);
        this.x = textView;
        byte b = 1;
        textView.setTextSize(1, 17.0f);
        this.x.setSingleLine(true);
        this.x.setEllipsize(TextUtils.TruncateAt.END);
        this.x.setGravity(19);
        this.x.setPadding(0, 0, hl.L(4.0f), 0);
        this.x.setVisibility(8);
        this.y.addView(this.x, tre.o(-2, -1));
        m7 m7Var = new m7((byte) 7, context, this);
        this.s = m7Var;
        m7Var.setTextSize(1, 17.0f);
        this.s.setSingleLine(true);
        this.s.setBackground(null);
        this.s.setPadding(0, 0, 0, 0);
        this.s.setGravity(19);
        m7 m7Var2 = this.s;
        m7Var2.setInputType(m7Var2.getInputType() | TLObject.FLAG_19);
        this.s.setImeOptions(33554435);
        this.s.setTextIsSelectable(false);
        this.s.setCursorSize(hl.L(20.0f));
        this.s.setCursorWidth(1.5f);
        CharSequence charSequence = this.J;
        if (charSequence != null) {
            this.s.setHint(charSequence);
        }
        this.s.setOnEditorActionListener(new j(this, (byte) 25));
        this.s.addTextChangedListener(new nh6(this, (byte) 14));
        this.y.addView(this.s, tre.l(1.0f, 0, -1));
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.w.setImageResource(R.drawable.ic_close_white);
        this.w.setContentDescription(ob6.M0(2131752064, null));
        this.w.setOnClickListener(new fla(this, b));
        this.r.addView(this.w, tre.d(42, 42.0f, 21, 0.0f, 0.0f, 2.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.E = imageView2;
        imageView2.setScaleType(scaleType);
        this.E.setImageResource(R.drawable.ic_close_white);
        this.E.setContentDescription(ob6.M0(2131752006, null));
        this.E.setVisibility(8);
        this.E.setOnClickListener(new fla(this, (byte) 2));
        addView(this.E, tre.e(46, 46, 53));
        N();
        m();
        t(2, this.e0.e, 0.0f, null);
    }

    public final float x(boolean z) {
        float actionModeFactor;
        nla nlaVar = this.n;
        if (nlaVar == null) {
            return 0.0f;
        }
        if (nlaVar.getVisibility() == 8 && z) {
            return 0.0f;
        }
        nla nlaVar2 = this.n;
        if (z) {
            actionModeFactor = nlaVar2.getTargetVisibleFactor();
        } else {
            actionModeFactor = (1.0f - getActionModeFactor()) * (1.0f - getSearchFactor()) * nlaVar2.getVisibleFactor();
        }
        return (hl.L(12.0f) + this.n.getButtonWidth()) * actionModeFactor;
    }

    public final void y() {
        rla rlaVar = this.e;
        if (rlaVar == null || !this.M) {
            return;
        }
        this.M = false;
        rlaVar.f();
        this.d0.a(false, A());
        l();
        this.b.b(false, A());
        jn7.e().k(jn7.u4, new Object[0]);
    }

    public final boolean z() {
        return this.e != null && this.M;
    }

    @Override // o27
    public View getMenuHostView() {
        return this;
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}
