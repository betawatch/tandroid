// default package

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class m15 extends e {
    public dr0 E;
    public int F;
    public x46 G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public final Paint L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public final j15 a;
    public final j15 b;
    public d79 c;
    public Drawable d;
    public eva e;
    public boolean f;
    public boolean h;
    public float n;
    public int r;
    public l15 s;
    public float w;
    public final Canvas x;
    public float y;

    public m15() {
        super(null);
        int i = aob.Gk;
        int i2 = aob.Hk;
        int i3 = aob.Ik;
        int i4 = aob.Jk;
        this.a = new j15(i, i2, i3, i4, null, (byte) 0);
        j15 j15Var = new j15(i, i2, i3, i4, null, (byte) 1);
        this.b = j15Var;
        this.x = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.F = -1;
        this.H = true;
        this.L = new Paint();
        j15Var.n = true;
        this.Q = -1;
    }

    @Override // org.telegram.ui.ActionBar.e
    public View createView(Context context) {
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        int themedColor = getThemedColor(aob.h5);
        this.P = themedColor;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        wk5 wk5Var = this.parentLayout;
        this.J = (wk5Var == null || !((ActionBarLayout) wk5Var).T0) ? hl.m : 0;
        this.s = new l15(this, getParentActivity());
        if (this.simpleActionBar == null) {
            wk5 wk5Var2 = this.parentLayout;
            if (wk5Var2 != null && ((ActionBarLayout) wk5Var2).T0) {
                this.actionBar.setOccupyStatusBar(false);
            }
            this.actionBar.setAddToContainer(false);
        }
        this.c = new d79(context, null);
        x46 k0 = k0(context);
        this.G = k0;
        this.c.setLayoutManager(k0);
        x46 x46Var = this.G;
        if (x46Var instanceof td4) {
            ((td4) x46Var).R = true;
        }
        j79 j0 = j0();
        this.c.setAdapter(j0);
        boolean z = j0 instanceof l9c;
        d79 d79Var = this.c;
        if (z) {
            p12 p12Var = new p12(this, (byte) 2);
            int L = hl.L(12.0f);
            float L2 = hl.L(16.0f);
            d79Var.getClass();
            SparseIntArray sparseIntArray = new SparseIntArray();
            Pair pair = new Pair(new r(d79Var, p12Var, sparseIntArray, (byte) 3), new p12(sparseIntArray, (byte) 7));
            d79Var.u1((qcc) pair.first, (qcc) pair.second, L, L2, true);
        } else {
            d79Var.setSections(true);
        }
        this.c.setClipToPadding(false);
        this.c.j(new to2(this, (byte) 15));
        this.E = new dr0(context);
        l15 l15Var = this.s;
        eva l0 = l0();
        this.e = l0;
        l15Var.addView(l0, tre.c(-2.0f, -1));
        this.s.addView(this.E, tre.c(-2.0f, -1));
        h0();
        this.s.addView(o0());
        this.fragmentView = this.s;
        kg2 kg2Var = new kg2(this, (byte) 22);
        jla jlaVar = this.simpleActionBar;
        if (jlaVar != null) {
            jlaVar.setBackground(null);
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.simpleActionBar.setActionBarMenuOnItemClick(kg2Var);
            this.simpleActionBar.setForceSkipTouches(true);
        } else {
            this.actionBar.setBackground(null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setActionBarMenuOnItemClick(kg2Var);
            this.actionBar.setForceSkipTouches(true);
        }
        x0();
        return this.fragmentView;
    }

    public void g0() {
        d79 d79Var = this.c;
        if (d79Var == null || this.G == null || this.Q < 0) {
            return;
        }
        int i = this.R;
        d79Var.L(0);
        this.G.g1(this.Q, i);
        this.Q = -1;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        return zye.a(new u00(this, (byte) 7), aob.Ck, aob.Dk, aob.Ek, aob.Fk, aob.Gk, aob.Hk, aob.Ik, aob.Jk, aob.Kk, aob.Mk, aob.Nk, aob.Lk, aob.Qk);
    }

    public void h0() {
        this.s.addView(this.c, tre.c(-1.0f, -1));
    }

    public final void i0(String str, CharSequence charSequence, FrameLayout frameLayout, io0 io0Var) {
        dr0 dr0Var = this.E;
        FrameLayout frameLayout2 = (FrameLayout) dr0Var.e;
        ((TextView) dr0Var.b).setText(str);
        p66 p66Var = (p66) dr0Var.c;
        p66Var.setText(charSequence);
        p66Var.setMaxWidth(kg5.a(p66Var.getText(), p66Var.getPaint()));
        FrameLayout frameLayout3 = (FrameLayout) dr0Var.d;
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, tre.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (io0Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(io0Var, tre.e(-1, -2, 1));
            frameLayout2.setClickable(io0Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        dr0Var.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        return this.N && !aob.I.o();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public abstract j79 j0();

    public x46 k0(Context context) {
        return this.H ? new td4((hl.L(68.0f) + this.J) - hl.L(16.0f), this.c) : new x46();
    }

    public eva l0() {
        return new vb(getParentActivity(), (byte) 3);
    }

    public boolean m0() {
        return !(this instanceof nza);
    }

    public View n0(Context context) {
        tb tbVar = new tb((byte) 14, (Activity) context, this);
        tbVar.setTag(-33024);
        return tbVar;
    }

    public final FrameLayout o0() {
        jla jlaVar = this.simpleActionBar;
        return jlaVar != null ? jlaVar : this.actionBar;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        y0(false);
    }

    @Override // org.telegram.ui.ActionBar.e
    public void onInsets(int i, int i2, int i3, int i4) {
        this.c.setPadding(0, 0, 0, i4);
    }

    @Override // org.telegram.ui.ActionBar.e
    public void onPause() {
        super.onPause();
        eva evaVar = this.e;
        if (evaVar != null) {
            evaVar.setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public void onResume() {
        super.onResume();
        this.e.setPaused(false);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int themedColor = getThemedColor(aob.h5);
            Drawable drawable = this.d;
            if (drawable != null && themedColor != this.P) {
                this.P = themedColor;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            eva evaVar = this.e;
            if (evaVar == null || evaVar.a == null || this.s == null) {
                return;
            }
            x0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public float p0() {
        return 0.0f;
    }

    public View q0() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final Dialog showDialog(Dialog dialog) {
        Dialog showDialog = super.showDialog(dialog);
        y0(showDialog != null);
        return showDialog;
    }

    public void t0() {
        View view;
        int i;
        d79 d79Var = this.c;
        if (d79Var == null || d79Var.getChildCount() <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.c.getChildCount()) {
                view = null;
                i = -1;
                break;
            }
            view = this.c.getChildAt(i2);
            this.c.getClass();
            i = RecyclerView.S(view);
            if (i >= 0 && view.getTop() < Integer.MAX_VALUE) {
                view.getTop();
                break;
            }
            i2++;
        }
        if (view != null) {
            this.Q = i;
            this.R = view.getTop();
        }
    }

    public final Paint u0(float f, float f2) {
        int measuredWidth = this.s.getMeasuredWidth();
        int measuredHeight = this.s.getMeasuredHeight();
        j15 j15Var = this.b;
        j15Var.d(0, (-f) - ((this.s.getMeasuredWidth() * 0.1f) * this.n), 0, measuredWidth, -f2, measuredHeight);
        return j15Var.f;
    }

    public final void w0() {
        if (this.s.getMeasuredWidth() == 0 || this.s.getMeasuredHeight() == 0 || this.E == null) {
            return;
        }
        int measuredWidth = this.s.getMeasuredWidth();
        int measuredHeight = this.s.getMeasuredHeight();
        j15 j15Var = this.a;
        j15Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
        Canvas canvas = this.x;
        canvas.save();
        canvas.scale(100.0f / this.s.getMeasuredWidth(), 100.0f / this.s.getMeasuredHeight());
        canvas.drawRect(0.0f, 0.0f, this.s.getMeasuredWidth(), this.s.getMeasuredHeight(), j15Var.f);
        canvas.restore();
    }

    public final void x0() {
        if (this.E != null) {
            if (this.actionBar == null && this.simpleActionBar == null) {
                return;
            }
            this.L.setColor(getThemedColor(aob.h5));
            if (this.actionBar != null) {
                int w0 = aob.w0(null, aob.Kk, false);
                if (w0 != this.O) {
                    this.O = w0;
                    this.actionBar.H(w0, false);
                }
                int o = vm2.o(w0, 60);
                a aVar = this.actionBar;
                if (aVar.q0 != o) {
                    aVar.G(o, false);
                }
            }
            this.e.a.g();
            dr0 dr0Var = this.E;
            if (dr0Var != null) {
                boolean z = this.N;
                TextView textView = (TextView) dr0Var.b;
                if (z) {
                    int i = aob.G6;
                    textView.setTextColor(aob.w0(null, i, false));
                    ((p66) this.E.c).setTextColor(aob.w0(null, i, false));
                    ((p66) this.E.c).setLinkTextColor(aob.w0(null, aob.Xc, false));
                } else {
                    int i2 = aob.Kk;
                    textView.setTextColor(aob.w0(null, i2, false));
                    ((p66) this.E.c).setTextColor(aob.w0(null, i2, false));
                    ((p66) this.E.c).setLinkTextColor(aob.w0(null, aob.Xc, false));
                }
            }
            w0();
        }
    }

    public final void y0(boolean z) {
        if (z != this.f) {
            this.f = z;
            this.e.setPaused(z);
            this.s.invalidate();
        }
    }

    public boolean z0() {
        return this instanceof nza;
    }

    public void r0(boolean z) {
    }

    public void s0(float f) {
    }
}
