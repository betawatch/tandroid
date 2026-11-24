// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Editable;
import android.text.InputFilter;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class cv3 extends FrameLayout implements jm7, dla {
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;
    public final boolean J;
    public boolean K;
    public gb L;
    public final int M;
    public final ylb N;
    public boolean O;
    public boolean P;
    public final o1 Q;
    public boolean R;
    public float S;
    public boolean T;
    public boolean U;
    public int V;
    public final wu3 a;
    public final c51 b;
    public final n99 c;
    public xu3 d;
    public boolean e;
    public ela f;
    public final d h;
    public boolean n;
    public int r;
    public int s;
    public boolean w;
    public int x;
    public boolean y;

    public cv3(Context context, ela elaVar, d dVar, int i, boolean z, ylb ylbVar) {
        super(context);
        this.F = true;
        this.Q = new o1(this, (byte) 28);
        this.V = 2;
        this.J = z;
        this.N = ylbVar;
        this.M = i;
        this.h = dVar;
        this.f = elaVar;
        elaVar.r.add(this);
        wu3 wu3Var = new wu3(this, context, ylbVar, i);
        this.a = wu3Var;
        wu3Var.setImeOptions(TLObject.FLAG_28);
        wu3Var.setInputType(wu3Var.getInputType() | TLObject.FLAG_14);
        wu3Var.setFocusable(wu3Var.isEnabled());
        wu3Var.setCursorSize(gm.L(20.0f));
        wu3Var.setCursorWidth(1.5f);
        int i2 = cmb.F6;
        anb.l(wu3Var, 30, i2, ylbVar);
        if (i == 0) {
            wu3Var.setTextSize(1, 18.0f);
            wu3Var.setMaxLines(4);
            wu3Var.setGravity((jb6.a0 ? 5 : 3) | 16);
            wu3Var.setBackground(null);
            anb.F(wu3Var, cmb.j6, cmb.k6, cmb.o7, ylbVar);
            anb.D(wu3Var, cmb.G6, ylbVar);
            anb.X(wu3Var, i2, ylbVar);
            anb.l(wu3Var, 36, cmb.lg, ylbVar);
            wu3Var.setPadding(jb6.a0 ? gm.L(40.0f) : 0, 0, jb6.a0 ? 0 : gm.L(40.0f), gm.L(11.0f));
            boolean z2 = jb6.a0;
            addView(wu3Var, qoe.d(-1, -2.0f, 19, z2 ? 11.0f : 0.0f, 1.0f, z2 ? 0.0f : 11.0f, 0.0f));
        } else if (i == 2 || i == 3) {
            wu3Var.setTextSize(1, 16.0f);
            wu3Var.setMaxLines(8);
            wu3Var.setGravity(19);
            wu3Var.setAllowTextEntitiesIntersection(true);
            wu3Var.setHintTextColor(-1929379841);
            wu3Var.setTextColor(-1);
            wu3Var.setCursorColor(-1);
            wu3Var.setBackground(null);
            wu3Var.setClipToPadding(false);
            wu3Var.setPadding(0, gm.L(9.0f), 0, gm.L(9.0f));
            wu3Var.setHandlesColor(-1);
            wu3Var.setHighlightColor(822083583);
            wu3Var.setLinkTextColor(-12147733);
            wu3Var.E = -1;
            wu3Var.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(wu3Var, qoe.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i == 4) {
            wu3Var.setTextSize(1, 18.0f);
            wu3Var.setMaxLines(4);
            wu3Var.setGravity(19);
            anb.D(wu3Var, cmb.s5, ylbVar);
            anb.X(wu3Var, cmb.i5, ylbVar);
            wu3Var.setBackground(null);
            wu3Var.setPadding(0, gm.L(11.0f), 0, gm.L(12.0f));
            addView(wu3Var, qoe.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            wu3Var.setTextSize(1, 18.0f);
            wu3Var.setMaxLines(4);
            wu3Var.setGravity(19);
            anb.D(wu3Var, cmb.s5, ylbVar);
            anb.X(wu3Var, cmb.i5, ylbVar);
            wu3Var.setBackground(null);
            wu3Var.setPadding(0, gm.L(11.0f), 0, gm.L(12.0f));
            addView(wu3Var, qoe.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        c51 c51Var = new c51(this, context);
        this.b = c51Var;
        c51Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        n99 n99Var = new n99(context);
        this.c = n99Var;
        c51Var.setImageDrawable(n99Var);
        if (i == 0) {
            anb.x(this, n99Var, cmb.Ne, ylbVar, PorterDuff.Mode.MULTIPLY);
            n99Var.a(R.drawable.smiles_tab_smiles, false);
            addView(c51Var, qoe.d(48, 48.0f, (jb6.a0 ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i == 2 || i == 3) {
            n99Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            n99Var.a(R.drawable.input_smile, false);
            addView(c51Var, qoe.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i == 4) {
            anb.x(this, n99Var, cmb.Ne, ylbVar, PorterDuff.Mode.MULTIPLY);
            n99Var.a(R.drawable.input_smile, false);
            addView(c51Var, qoe.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i == 5) {
            anb.x(this, n99Var, cmb.e7, ylbVar, PorterDuff.Mode.MULTIPLY);
            n99Var.a(R.drawable.input_smile, false);
            addView(c51Var, qoe.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            anb.x(this, n99Var, cmb.Ne, ylbVar, PorterDuff.Mode.MULTIPLY);
            n99Var.a(R.drawable.input_smile, false);
            addView(c51Var, qoe.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i3 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.v0(i3, ylbVar), 1, -1);
        wmb M = anb.M(i3);
        c51Var.setBackground(f0);
        anb.j(c51Var, f0, null, M, ylbVar);
        c51Var.setOnClickListener(new b0(this, elaVar, ylbVar, (byte) 28));
        c51Var.setContentDescription(jb6.M0(2131751133, null));
    }

    @Override // dla
    public final void L(int i, boolean z) {
        boolean z2;
        int i2;
        if (i > gm.L(50.0f) && ((this.w || (i2 = this.M) == 2 || i2 == 3) && !gm.E && !gm.O1())) {
            if (z) {
                this.s = i;
                oc7.c1().edit().putInt("kbd_height_land3", this.s).commit();
            } else {
                this.r = i;
                oc7.c1().edit().putInt("kbd_height", this.r).commit();
            }
        }
        boolean z3 = false;
        if (this.e) {
            int i3 = (z ? this.s : this.r) + (this.K ? gm.n : 0);
            if (this.y) {
                i3 = Math.min(gm.L(200.0f) + i3, gm.q.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = gm.q.x;
            if (i4 != i5 || layoutParams.height != i3) {
                layoutParams.width = i5;
                layoutParams.height = i3;
                this.d.setLayoutParams(layoutParams);
                ela elaVar = this.f;
                if (elaVar != null) {
                    this.x = layoutParams.height;
                    elaVar.requestLayout();
                    this.f.getHeight();
                    if (this.U != this.y) {
                        p();
                    }
                }
            }
        }
        this.U = this.y;
        int i6 = this.H;
        wu3 wu3Var = this.a;
        if (i6 == i && this.I == z) {
            if (b()) {
                if (wu3Var.isFocused() && i > 0) {
                    z3 = true;
                }
                this.w = z3;
            }
            this.f.getHeight();
            return;
        }
        this.H = i;
        this.I = z;
        boolean z4 = this.w;
        boolean z5 = wu3Var.isFocused() && i > 0;
        this.w = z5;
        if (z5 && this.e) {
            x(0);
        }
        if (this.x != 0 && !(z2 = this.w) && z2 != z4 && !this.e) {
            this.x = 0;
            this.f.requestLayout();
        }
        if (this.w && this.O) {
            this.O = false;
            gm.r(this.Q);
        }
        this.f.getHeight();
    }

    public boolean a() {
        int i = this.M;
        return i == 2 || i == 3 || i == 5;
    }

    public boolean b() {
        return this instanceof m75;
    }

    public final void d() {
        gm.t1(this.a);
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.m4) {
            xu3 xu3Var = this.d;
            if (xu3Var != null) {
                xu3Var.Q.h1();
            }
            wu3 wu3Var = this.a;
            if (wu3Var != null) {
                int currentTextColor = wu3Var.getCurrentTextColor();
                wu3Var.setTextColor(-1);
                wu3Var.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        xu3 xu3Var = this.d;
        if (xu3Var != null && xu3Var.d1 != z8c.t0) {
            this.f.removeView(xu3Var);
            xu3Var = null;
            this.d = null;
        }
        if (xu3Var != null) {
            return;
        }
        Context context = getContext();
        boolean b = b();
        int i = this.M;
        xu3 xu3Var2 = new xu3(this, this.h, this.J, context, b, (i == 2 || i == 3 || i == 5) ? false : true, this.N, this.T);
        this.d = xu3Var2;
        xu3Var2.c = this.V;
        xu3Var2.V0 = this.R;
        xu3Var2.setVisibility(8);
        this.S = 0.0f;
        if (gm.O1()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new av3(this));
        this.f.addView(this.d);
    }

    public qu3 getEditText() {
        return this.a;
    }

    public View getEmojiButton() {
        return this.b;
    }

    public int getEmojiPadding() {
        return this.x;
    }

    public float getEmojiPaddingShown() {
        return this.S;
    }

    public e34 getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        Point point = gm.q;
        int i = (point.x > point.y ? this.s : this.r) + (this.K ? gm.n : 0);
        return this.y ? Math.min(gm.L(200.0f) + i, point.y) : i;
    }

    public Editable getText() {
        return this.a.getText();
    }

    public int h() {
        return vm.f();
    }

    public final void j() {
        xu3 xu3Var;
        if (!this.e && (xu3Var = this.d) != null && xu3Var.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.S = 0.0f;
        }
        this.x = 0;
        boolean z = this.y;
        this.y = false;
        if (z) {
            xu3 xu3Var2 = this.d;
            if (xu3Var2 != null) {
                xu3Var2.r(false);
            }
            y();
        }
    }

    public final void k(boolean z) {
        if (this.e) {
            x(0);
        }
        if (z) {
            xu3 xu3Var = this.d;
            if (xu3Var == null || xu3Var.getVisibility() != 0 || this.O) {
                j();
            } else {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.S = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new by0(this, measuredHeight, (byte) 1));
                this.P = true;
                ofFloat.addListener(new kh2(this, (byte) 16));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(gb.w);
                ofFloat.start();
            }
        }
        boolean z2 = this.y;
        this.y = false;
        if (z2) {
            xu3 xu3Var2 = this.d;
            if (xu3Var2 != null) {
                xu3Var2.r(false);
            }
            y();
        }
    }

    public final boolean l(View view) {
        return view == this.d;
    }

    public final boolean m() {
        xu3 xu3Var = this.d;
        return xu3Var != null && xu3Var.getVisibility() == 0;
    }

    public final int n() {
        return this.a.length();
    }

    public final void o() {
        this.E = true;
        xu3 xu3Var = this.d;
        if (xu3Var != null) {
            xu3Var.z();
        }
        ela elaVar = this.f;
        if (elaVar != null) {
            elaVar.r.remove(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.e().b(this, nm7.m4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.e().n(this, nm7.m4);
    }

    public final void r() {
        this.F = true;
        d();
    }

    public final void s() {
        this.F = false;
        if (this.G) {
            this.G = false;
            wu3 wu3Var = this.a;
            wu3Var.requestFocus();
            gm.E3(wu3Var);
            if (gm.D || this.w || gm.E || gm.O1()) {
                return;
            }
            this.O = true;
            u();
            o1 o1Var = this.Q;
            gm.r(o1Var);
            gm.d3(o1Var, 100L);
        }
    }

    public void setAdjustPanLayoutHelper(gb gbVar) {
        this.L = gbVar;
    }

    public void setEmojiViewCacheType(int i) {
        this.V = i;
        xu3 xu3Var = this.d;
        if (xu3Var != null) {
            xu3Var.c = i;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        wu3 wu3Var = this.a;
        wu3Var.setEnabled(z);
        this.b.setVisibility(z ? 0 : 8);
        int L = gm.L(this.M == 0 ? 11.0f : 8.0f);
        if (z) {
            wu3Var.setPadding(jb6.a0 ? gm.L(40.0f) : 0, 0, jb6.a0 ? 0 : gm.L(40.0f), L);
        } else {
            wu3Var.setPadding(0, 0, 0, L);
        }
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.a.setFilters(inputFilterArr);
    }

    @Override // android.view.View
    public void setFocusable(boolean z) {
        this.a.setFocusable(z);
    }

    public void setHint(CharSequence charSequence) {
        this.a.setHint(charSequence);
    }

    public void setMaxLines(int i) {
        this.a.setMaxLines(i);
    }

    public void setSelection(int i) {
        this.a.setSelection(i);
    }

    public void setSizeNotifierLayout(ela elaVar) {
        ela elaVar2 = this.f;
        if (elaVar2 != null) {
            elaVar2.r.remove(this);
        }
        this.f = elaVar;
        elaVar.r.add(this);
    }

    public void setSuggestionsEnabled(boolean z) {
        wu3 wu3Var = this.a;
        int inputType = wu3Var.getInputType();
        int i = !z ? inputType | TLObject.FLAG_19 : inputType & (-524289);
        if (wu3Var.getInputType() != i) {
            wu3Var.setInputType(i);
        }
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public boolean t(int i) {
        return true;
    }

    public final void v() {
        u();
        x((gm.D || this.F) ? 0 : 2);
        wu3 wu3Var = this.a;
        wu3Var.requestFocus();
        gm.E3(wu3Var);
        if (this.F) {
            this.G = true;
            return;
        }
        if (gm.D || this.w || gm.E || gm.O1()) {
            return;
        }
        this.O = true;
        o1 o1Var = this.Q;
        gm.r(o1Var);
        gm.d3(o1Var, 100L);
    }

    public final void w(int i, int i2) {
        this.a.setSelection(i, i2);
    }

    public final void x(int i) {
        n99 n99Var = this.c;
        if (i != 1) {
            if (this.b != null) {
                if (this.M == 0) {
                    n99Var.a(R.drawable.smiles_tab_smiles, true);
                } else {
                    n99Var.a(R.drawable.input_smile, true);
                }
            }
            if (this.d != null) {
                this.e = false;
                p();
                if (gm.D || gm.E) {
                    this.d.setVisibility(8);
                    this.S = 0.0f;
                }
            }
            ela elaVar = this.f;
            if (elaVar != null) {
                if (i == 0) {
                    this.x = 0;
                    this.S = 0.0f;
                }
                elaVar.requestLayout();
                this.f.getHeight();
                return;
            }
            return;
        }
        xu3 xu3Var = this.d;
        if (xu3Var != null) {
            xu3Var.getVisibility();
        }
        f();
        this.d.setVisibility(0);
        this.e = true;
        this.S = 1.0f;
        xu3 xu3Var2 = this.d;
        if (this.r <= 0) {
            if (gm.O1()) {
                this.r = gm.L(150.0f);
            } else {
                this.r = oc7.c1().getInt("kbd_height", gm.L(200.0f));
            }
        }
        int i2 = this.s;
        if (i2 <= 0) {
            if (gm.O1()) {
                i2 = gm.L(150.0f);
                this.s = i2;
            } else {
                i2 = oc7.c1().getInt("kbd_height_land3", gm.L(200.0f));
                this.s = i2;
            }
        }
        Point point = gm.q;
        if (point.x <= point.y) {
            i2 = this.r;
        }
        int i3 = i2 + (this.K ? gm.n : 0);
        if (this.y) {
            i3 = Math.min(gm.L(200.0f) + i3, point.y);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) xu3Var2.getLayoutParams();
        layoutParams.height = i3;
        xu3Var2.setLayoutParams(layoutParams);
        if (!gm.E && !gm.O1()) {
            gm.t1(this.a);
        }
        ela elaVar2 = this.f;
        if (elaVar2 != null) {
            this.x = i3;
            elaVar2.requestLayout();
            n99Var.a(R.drawable.input_keyboard, true);
            this.f.getHeight();
        }
        p();
        this.d.setAlpha(1.0f);
        this.S = 1.0f;
        c(0.0f);
    }

    public void c(float f) {
    }

    public void e() {
    }

    public void p() {
    }

    public void setDelegate(bv3 bv3Var) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, xu3 xu3Var) {
    }

    public void i(ActionMode actionMode, Menu menu) {
    }

    public void q(int i, int i2) {
    }

    public cv3(Context context, hz0 hz0Var, ba2 ba2Var) {
        this(context, hz0Var, ba2Var, 0, false, null);
    }
}
