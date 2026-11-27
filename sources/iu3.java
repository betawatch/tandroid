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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class iu3 extends FrameLayout implements fn7, vma {
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;
    public final boolean J;
    public boolean K;
    public hb L;
    public final int M;
    public final vnb N;
    public boolean O;
    public boolean P;
    public final p1 Q;
    public boolean R;
    public float S;
    public boolean T;
    public boolean U;
    public int V;
    public final du3 a;
    public final d41 b;
    public final ya9 c;
    public eu3 d;
    public boolean e;
    public wma f;
    public final e h;
    public boolean n;
    public int r;
    public int s;
    public boolean w;
    public int x;
    public boolean y;

    public iu3(Context context, wma wmaVar, e eVar, int i, boolean z, vnb vnbVar) {
        super(context);
        this.F = true;
        this.Q = new p1(this, (byte) 28);
        this.V = 2;
        this.J = z;
        this.N = vnbVar;
        this.M = i;
        this.h = eVar;
        this.f = wmaVar;
        wmaVar.r.add(this);
        du3 du3Var = new du3(this, context, vnbVar, i);
        this.a = du3Var;
        du3Var.setImeOptions(TLObject.FLAG_28);
        du3Var.setInputType(du3Var.getInputType() | TLObject.FLAG_14);
        du3Var.setFocusable(du3Var.isEnabled());
        du3Var.setCursorSize(hl.L(20.0f));
        du3Var.setCursorWidth(1.5f);
        int i2 = aob.G6;
        yob.l(du3Var, 30, i2, vnbVar);
        if (i == 0) {
            du3Var.setTextSize(1, 18.0f);
            du3Var.setMaxLines(4);
            du3Var.setGravity((ob6.a0 ? 5 : 3) | 16);
            du3Var.setBackground(null);
            yob.F(du3Var, aob.k6, aob.l6, aob.p7, vnbVar);
            yob.D(du3Var, aob.H6, vnbVar);
            yob.X(du3Var, i2, vnbVar);
            yob.l(du3Var, 36, aob.mg, vnbVar);
            du3Var.setPadding(ob6.a0 ? hl.L(40.0f) : 0, 0, ob6.a0 ? 0 : hl.L(40.0f), hl.L(11.0f));
            boolean z2 = ob6.a0;
            addView(du3Var, tre.d(-1, -2.0f, 19, z2 ? 11.0f : 0.0f, 1.0f, z2 ? 0.0f : 11.0f, 0.0f));
        } else if (i == 2 || i == 3) {
            du3Var.setTextSize(1, 16.0f);
            du3Var.setMaxLines(8);
            du3Var.setGravity(19);
            du3Var.setAllowTextEntitiesIntersection(true);
            du3Var.setHintTextColor(-1929379841);
            du3Var.setTextColor(-1);
            du3Var.setCursorColor(-1);
            du3Var.setBackground(null);
            du3Var.setClipToPadding(false);
            du3Var.setPadding(0, hl.L(9.0f), 0, hl.L(9.0f));
            du3Var.setHandlesColor(-1);
            du3Var.setHighlightColor(822083583);
            du3Var.setLinkTextColor(-12147733);
            du3Var.E = -1;
            du3Var.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(du3Var, tre.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i == 4) {
            du3Var.setTextSize(1, 18.0f);
            du3Var.setMaxLines(4);
            du3Var.setGravity(19);
            yob.D(du3Var, aob.t5, vnbVar);
            yob.X(du3Var, aob.j5, vnbVar);
            du3Var.setBackground(null);
            du3Var.setPadding(0, hl.L(11.0f), 0, hl.L(12.0f));
            addView(du3Var, tre.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            du3Var.setTextSize(1, 18.0f);
            du3Var.setMaxLines(4);
            du3Var.setGravity(19);
            yob.D(du3Var, aob.t5, vnbVar);
            yob.X(du3Var, aob.j5, vnbVar);
            du3Var.setBackground(null);
            du3Var.setPadding(0, hl.L(11.0f), 0, hl.L(12.0f));
            addView(du3Var, tre.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        d41 d41Var = new d41(this, context);
        this.b = d41Var;
        d41Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ya9 ya9Var = new ya9(context);
        this.c = ya9Var;
        d41Var.setImageDrawable(ya9Var);
        if (i == 0) {
            yob.x(this, ya9Var, aob.Oe, vnbVar, PorterDuff.Mode.MULTIPLY);
            ya9Var.a(R.drawable.smiles_tab_smiles, false);
            addView(d41Var, tre.d(48, 48.0f, (ob6.a0 ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i == 2 || i == 3) {
            ya9Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            ya9Var.a(R.drawable.input_smile, false);
            addView(d41Var, tre.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i == 4) {
            yob.x(this, ya9Var, aob.Oe, vnbVar, PorterDuff.Mode.MULTIPLY);
            ya9Var.a(R.drawable.input_smile, false);
            addView(d41Var, tre.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i == 5) {
            yob.x(this, ya9Var, aob.f7, vnbVar, PorterDuff.Mode.MULTIPLY);
            ya9Var.a(R.drawable.input_smile, false);
            addView(d41Var, tre.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            yob.x(this, ya9Var, aob.Oe, vnbVar, PorterDuff.Mode.MULTIPLY);
            ya9Var.a(R.drawable.input_smile, false);
            addView(d41Var, tre.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i3 = aob.i6;
        hf0 f0 = aob.f0(aob.v0(i3, vnbVar), 1, -1);
        uob M = yob.M(i3);
        d41Var.setBackground(f0);
        yob.j(d41Var, f0, null, M, vnbVar);
        d41Var.setOnClickListener(new c0(this, wmaVar, vnbVar, (byte) 28));
        d41Var.setContentDescription(ob6.M0(2131751161, null));
    }

    @Override // vma
    public final void L(int i, boolean z) {
        boolean z2;
        int i2;
        if (i > hl.L(50.0f) && ((this.w || (i2 = this.M) == 2 || i2 == 3) && !hl.E && !hl.O1())) {
            if (z) {
                this.s = i;
                uc7.d1().edit().putInt("kbd_height_land3", this.s).commit();
            } else {
                this.r = i;
                uc7.d1().edit().putInt("kbd_height", this.r).commit();
            }
        }
        boolean z3 = false;
        if (this.e) {
            int i3 = (z ? this.s : this.r) + (this.K ? hl.n : 0);
            if (this.y) {
                i3 = Math.min(hl.L(200.0f) + i3, hl.q.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = hl.q.x;
            if (i4 != i5 || layoutParams.height != i3) {
                layoutParams.width = i5;
                layoutParams.height = i3;
                this.d.setLayoutParams(layoutParams);
                wma wmaVar = this.f;
                if (wmaVar != null) {
                    this.x = layoutParams.height;
                    wmaVar.requestLayout();
                    this.f.getHeight();
                    if (this.U != this.y) {
                        p();
                    }
                }
            }
        }
        this.U = this.y;
        int i6 = this.H;
        du3 du3Var = this.a;
        if (i6 == i && this.I == z) {
            if (b()) {
                if (du3Var.isFocused() && i > 0) {
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
        boolean z5 = du3Var.isFocused() && i > 0;
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
            hl.r(this.Q);
        }
        this.f.getHeight();
    }

    public boolean a() {
        int i = this.M;
        return i == 2 || i == 3 || i == 5;
    }

    public boolean b() {
        return this instanceof q75;
    }

    public final void d() {
        hl.t1(this.a);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.l4) {
            eu3 eu3Var = this.d;
            if (eu3Var != null) {
                eu3Var.Q.i1();
            }
            du3 du3Var = this.a;
            if (du3Var != null) {
                int currentTextColor = du3Var.getCurrentTextColor();
                du3Var.setTextColor(-1);
                du3Var.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        eu3 eu3Var = this.d;
        if (eu3Var != null && eu3Var.d1 != yac.t0) {
            this.f.removeView(eu3Var);
            eu3Var = null;
            this.d = null;
        }
        if (eu3Var != null) {
            return;
        }
        Context context = getContext();
        boolean b = b();
        int i = this.M;
        eu3 eu3Var2 = new eu3(this, this.h, this.J, context, b, (i == 2 || i == 3 || i == 5) ? false : true, this.N, this.T);
        this.d = eu3Var2;
        eu3Var2.c = this.V;
        eu3Var2.V0 = this.R;
        eu3Var2.setVisibility(8);
        this.S = 0.0f;
        if (hl.O1()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new gu3(this));
        this.f.addView(this.d);
    }

    public xt3 getEditText() {
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

    public o24 getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        Point point = hl.q;
        int i = (point.x > point.y ? this.s : this.r) + (this.K ? hl.n : 0);
        return this.y ? Math.min(hl.L(200.0f) + i, point.y) : i;
    }

    public Editable getText() {
        return this.a.getText();
    }

    public int h() {
        return wl.f();
    }

    public final void j() {
        eu3 eu3Var;
        if (!this.e && (eu3Var = this.d) != null && eu3Var.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.S = 0.0f;
        }
        this.x = 0;
        boolean z = this.y;
        this.y = false;
        if (z) {
            eu3 eu3Var2 = this.d;
            if (eu3Var2 != null) {
                eu3Var2.r(false);
            }
            y();
        }
    }

    public final void k(boolean z) {
        if (this.e) {
            x(0);
        }
        if (z) {
            eu3 eu3Var = this.d;
            if (eu3Var == null || eu3Var.getVisibility() != 0 || this.O) {
                j();
            } else {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.S = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new dx0(this, measuredHeight, (byte) 1));
                this.P = true;
                ofFloat.addListener(new cn2(this, (byte) 14));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(hb.w);
                ofFloat.start();
            }
        }
        boolean z2 = this.y;
        this.y = false;
        if (z2) {
            eu3 eu3Var2 = this.d;
            if (eu3Var2 != null) {
                eu3Var2.r(false);
            }
            y();
        }
    }

    public final boolean l(View view) {
        return view == this.d;
    }

    public final boolean m() {
        eu3 eu3Var = this.d;
        return eu3Var != null && eu3Var.getVisibility() == 0;
    }

    public final int n() {
        return this.a.length();
    }

    public final void o() {
        this.E = true;
        eu3 eu3Var = this.d;
        if (eu3Var != null) {
            eu3Var.A();
        }
        wma wmaVar = this.f;
        if (wmaVar != null) {
            wmaVar.r.remove(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.e().b(this, jn7.l4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.e().n(this, jn7.l4);
    }

    public final void r() {
        this.F = true;
        d();
    }

    public final void s() {
        this.F = false;
        if (this.G) {
            this.G = false;
            du3 du3Var = this.a;
            du3Var.requestFocus();
            hl.E3(du3Var);
            if (hl.D || this.w || hl.E || hl.O1()) {
                return;
            }
            this.O = true;
            u();
            p1 p1Var = this.Q;
            hl.r(p1Var);
            hl.d3(p1Var, 100L);
        }
    }

    public void setAdjustPanLayoutHelper(hb hbVar) {
        this.L = hbVar;
    }

    public void setEmojiViewCacheType(int i) {
        this.V = i;
        eu3 eu3Var = this.d;
        if (eu3Var != null) {
            eu3Var.c = i;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        du3 du3Var = this.a;
        du3Var.setEnabled(z);
        this.b.setVisibility(z ? 0 : 8);
        int L = hl.L(this.M == 0 ? 11.0f : 8.0f);
        if (z) {
            du3Var.setPadding(ob6.a0 ? hl.L(40.0f) : 0, 0, ob6.a0 ? 0 : hl.L(40.0f), L);
        } else {
            du3Var.setPadding(0, 0, 0, L);
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

    public void setSizeNotifierLayout(wma wmaVar) {
        wma wmaVar2 = this.f;
        if (wmaVar2 != null) {
            wmaVar2.r.remove(this);
        }
        this.f = wmaVar;
        wmaVar.r.add(this);
    }

    public void setSuggestionsEnabled(boolean z) {
        du3 du3Var = this.a;
        int inputType = du3Var.getInputType();
        int i = !z ? inputType | TLObject.FLAG_19 : inputType & (-524289);
        if (du3Var.getInputType() != i) {
            du3Var.setInputType(i);
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
        x((hl.D || this.F) ? 0 : 2);
        du3 du3Var = this.a;
        du3Var.requestFocus();
        hl.E3(du3Var);
        if (this.F) {
            this.G = true;
            return;
        }
        if (hl.D || this.w || hl.E || hl.O1()) {
            return;
        }
        this.O = true;
        p1 p1Var = this.Q;
        hl.r(p1Var);
        hl.d3(p1Var, 100L);
    }

    public final void w(int i, int i2) {
        this.a.setSelection(i, i2);
    }

    public final void x(int i) {
        ya9 ya9Var = this.c;
        if (i != 1) {
            if (this.b != null) {
                if (this.M == 0) {
                    ya9Var.a(R.drawable.smiles_tab_smiles, true);
                } else {
                    ya9Var.a(R.drawable.input_smile, true);
                }
            }
            if (this.d != null) {
                this.e = false;
                p();
                if (hl.D || hl.E) {
                    this.d.setVisibility(8);
                    this.S = 0.0f;
                }
            }
            wma wmaVar = this.f;
            if (wmaVar != null) {
                if (i == 0) {
                    this.x = 0;
                    this.S = 0.0f;
                }
                wmaVar.requestLayout();
                this.f.getHeight();
                return;
            }
            return;
        }
        eu3 eu3Var = this.d;
        if (eu3Var != null) {
            eu3Var.getVisibility();
        }
        f();
        this.d.setVisibility(0);
        this.e = true;
        this.S = 1.0f;
        eu3 eu3Var2 = this.d;
        if (this.r <= 0) {
            if (hl.O1()) {
                this.r = hl.L(150.0f);
            } else {
                this.r = uc7.d1().getInt("kbd_height", hl.L(200.0f));
            }
        }
        int i2 = this.s;
        if (i2 <= 0) {
            if (hl.O1()) {
                i2 = hl.L(150.0f);
                this.s = i2;
            } else {
                i2 = uc7.d1().getInt("kbd_height_land3", hl.L(200.0f));
                this.s = i2;
            }
        }
        Point point = hl.q;
        if (point.x <= point.y) {
            i2 = this.r;
        }
        int i3 = i2 + (this.K ? hl.n : 0);
        if (this.y) {
            i3 = Math.min(hl.L(200.0f) + i3, point.y);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) eu3Var2.getLayoutParams();
        layoutParams.height = i3;
        eu3Var2.setLayoutParams(layoutParams);
        if (!hl.E && !hl.O1()) {
            hl.t1(this.a);
        }
        wma wmaVar2 = this.f;
        if (wmaVar2 != null) {
            this.x = i3;
            wmaVar2.requestLayout();
            ya9Var.a(R.drawable.input_keyboard, true);
            this.f.getHeight();
        }
        p();
        this.d.setAlpha(1.0f);
        this.S = 1.0f;
        c(0.0f);
    }

    public void e() {
    }

    public void p() {
    }

    public void u() {
    }

    public void y() {
    }

    public void c(float f) {
    }

    public void setDelegate(hu3 hu3Var) {
    }

    public void g(Canvas canvas, eu3 eu3Var) {
    }

    public void i(ActionMode actionMode, Menu menu) {
    }

    public void q(int i, int i2) {
    }

    public iu3(Context context, iy0 iy0Var, g92 g92Var) {
        this(context, iy0Var, g92Var, 0, false, null);
    }
}
