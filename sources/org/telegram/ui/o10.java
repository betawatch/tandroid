package org.telegram.ui;

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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class o10 extends org.telegram.ui.ActionBar.k2 {
    public l10 D;
    public int E;
    public s4.a0 F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final Paint K;
    public int L;
    public boolean M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final k10 a;
    public final k10 b;
    public org.telegram.ui.Components.uk0 c;
    public Drawable d;
    public kg.g2 e;
    public boolean f;
    public boolean h;
    public float n;
    public int r;
    public n10 s;
    public float w;
    public final Canvas x;
    public float y;

    public o10() {
        super(null);
        int i10 = org.telegram.ui.ActionBar.t6.Dk;
        int i11 = org.telegram.ui.ActionBar.t6.Ek;
        int i12 = org.telegram.ui.ActionBar.t6.Fk;
        int i13 = org.telegram.ui.ActionBar.t6.Gk;
        this.a = new k10(i10, i11, i12, i13, null, 0);
        k10 k10Var = new k10(i10, i11, i12, i13, null, 1);
        this.b = k10Var;
        this.x = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.E = -1;
        this.G = true;
        this.K = new Paint();
        k10Var.n = true;
        this.P = -1;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public View createView(Context context) {
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.h5);
        this.O = themedColor;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        int i10 = 0;
        this.I = (z4Var == null || !((ActionBarLayout) z4Var).S0) ? org.telegram.messenger.i0.m : 0;
        this.s = new n10(this, getParentActivity());
        if (this.simpleActionBar == null) {
            org.telegram.ui.ActionBar.z4 z4Var2 = this.parentLayout;
            if (z4Var2 != null && ((ActionBarLayout) z4Var2).S0) {
                this.actionBar.setOccupyStatusBar(false);
            }
            this.actionBar.setAddToContainer(false);
        }
        this.c = new org.telegram.ui.Components.uk0(context, null);
        s4.a0 l02 = l0(context);
        this.F = l02;
        this.c.setLayoutManager(l02);
        s4.a0 a0Var = this.F;
        if (a0Var instanceof org.telegram.ui.Components.az) {
            ((org.telegram.ui.Components.az) a0Var).R = true;
        }
        s4.g0 k02 = k0();
        this.c.setAdapter(k02);
        if (k02 instanceof org.telegram.ui.Components.q51) {
            org.telegram.ui.Components.uk0 uk0Var = this.c;
            j10 j10Var = new j10(this, i10);
            int L = org.telegram.messenger.i0.L(12.0f);
            float L2 = org.telegram.messenger.i0.L(16.0f);
            uk0Var.getClass();
            SparseIntArray sparseIntArray = new SparseIntArray();
            int i11 = 2;
            Pair pair = new Pair(new org.telegram.ui.Components.i(uk0Var, j10Var, sparseIntArray, i11), new org.telegram.ui.Components.di(sparseIntArray, i11));
            uk0Var.t1((org.telegram.messenger.s20) pair.first, (org.telegram.messenger.s20) pair.second, L, L2, true);
        } else {
            this.c.setSections(true);
        }
        this.c.setClipToPadding(false);
        this.c.j(new h3(this, 12));
        this.D = new l10(context);
        n10 n10Var = this.s;
        kg.g2 m0 = m0();
        this.e = m0;
        n10Var.addView(m0, w7.b6.c(-2.0f, -1));
        this.s.addView(this.D, w7.b6.c(-2.0f, -1));
        i0();
        this.s.addView(p0());
        this.fragmentView = this.s;
        ar arVar = new ar(this, 24);
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        if (i5Var != null) {
            i5Var.setBackground(null);
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.simpleActionBar.setActionBarMenuOnItemClick(arVar);
            this.simpleActionBar.setForceSkipTouches(true);
        } else {
            this.actionBar.setBackground(null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setActionBarMenuOnItemClick(arVar);
            this.actionBar.setForceSkipTouches(true);
        }
        x0();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        return w7.f6.a(new g6(9, this), org.telegram.ui.ActionBar.t6.zk, org.telegram.ui.ActionBar.t6.Ak, org.telegram.ui.ActionBar.t6.Bk, org.telegram.ui.ActionBar.t6.Ck, org.telegram.ui.ActionBar.t6.Dk, org.telegram.ui.ActionBar.t6.Ek, org.telegram.ui.ActionBar.t6.Fk, org.telegram.ui.ActionBar.t6.Gk, org.telegram.ui.ActionBar.t6.Hk, org.telegram.ui.ActionBar.t6.Jk, org.telegram.ui.ActionBar.t6.Kk, org.telegram.ui.ActionBar.t6.Ik, org.telegram.ui.ActionBar.t6.Nk);
    }

    public void h0() {
        org.telegram.ui.Components.uk0 uk0Var = this.c;
        if (uk0Var == null || this.F == null || this.P < 0) {
            return;
        }
        int i10 = this.Q;
        uk0Var.K(0);
        this.F.h1(this.P, i10);
        this.P = -1;
    }

    public void i0() {
        this.s.addView(this.c, w7.b6.c(-1.0f, -1));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        return this.M && !org.telegram.ui.ActionBar.t6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public final void j0(String str, CharSequence charSequence, FrameLayout frameLayout, r5 r5Var) {
        l10 l10Var = this.D;
        FrameLayout frameLayout2 = (FrameLayout) l10Var.e;
        FrameLayout frameLayout3 = (FrameLayout) l10Var.d;
        ((TextView) l10Var.b).setText(str);
        org.telegram.ui.Components.p80 p80Var = (org.telegram.ui.Components.p80) l10Var.c;
        p80Var.setText(charSequence);
        p80Var.setMaxWidth(vh.p2.a(p80Var.getText(), p80Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, w7.b6.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (r5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(r5Var, w7.b6.e(-1, -2, 1));
            frameLayout2.setClickable(r5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        l10Var.requestLayout();
    }

    public abstract s4.g0 k0();

    public s4.a0 l0(Context context) {
        return this.G ? new org.telegram.ui.Components.az((org.telegram.messenger.i0.L(68.0f) + this.I) - org.telegram.messenger.i0.L(16.0f), this.c) : new s4.a0();
    }

    public kg.g2 m0() {
        return new kg.g(getParentActivity(), 2);
    }

    public boolean n0() {
        return !(this instanceof rh.h8);
    }

    public View o0(Context context) {
        bi.t0 t0Var = new bi.t0(this, context, 26);
        t0Var.setTag(-33024);
        return t0Var;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        y0(false);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public void onInsets(int i10, int i11, int i12, int i13) {
        this.c.setPadding(0, 0, 0, i13);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public void onPause() {
        super.onPause();
        kg.g2 g2Var = this.e;
        if (g2Var != null) {
            g2Var.setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public void onResume() {
        super.onResume();
        this.e.setPaused(false);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.h5);
            Drawable drawable = this.d;
            if (drawable != null && themedColor != this.O) {
                this.O = themedColor;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            kg.g2 g2Var = this.e;
            if (g2Var == null || g2Var.a == null || this.s == null) {
                return;
            }
            x0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final FrameLayout p0() {
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        return i5Var != null ? i5Var : this.actionBar;
    }

    public float q0() {
        return 0.0f;
    }

    public View r0() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final Dialog showDialog(Dialog dialog) {
        Dialog showDialog = super.showDialog(dialog);
        y0(showDialog != null);
        return showDialog;
    }

    public void u0() {
        View view;
        int i10;
        org.telegram.ui.Components.uk0 uk0Var = this.c;
        if (uk0Var == null || uk0Var.getChildCount() <= 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.c.getChildCount()) {
                view = null;
                i10 = -1;
                break;
            }
            view = this.c.getChildAt(i11);
            this.c.getClass();
            i10 = RecyclerView.R(view);
            if (i10 >= 0 && view.getTop() < Integer.MAX_VALUE) {
                view.getTop();
                break;
            }
            i11++;
        }
        if (view != null) {
            this.P = i10;
            this.Q = view.getTop();
        }
    }

    public final Paint v0(float f7, float f10) {
        int measuredWidth = this.s.getMeasuredWidth();
        int measuredHeight = this.s.getMeasuredHeight();
        k10 k10Var = this.b;
        k10Var.d(0, (-f7) - ((this.s.getMeasuredWidth() * 0.1f) * this.n), 0, measuredWidth, -f10, measuredHeight);
        return k10Var.f;
    }

    public final void w0() {
        if (this.s.getMeasuredWidth() == 0 || this.s.getMeasuredHeight() == 0 || this.D == null) {
            return;
        }
        this.a.d(0, 0.0f, 0, this.s.getMeasuredWidth(), 0.0f, this.s.getMeasuredHeight());
        Canvas canvas = this.x;
        canvas.save();
        canvas.scale(100.0f / this.s.getMeasuredWidth(), 100.0f / this.s.getMeasuredHeight());
        canvas.drawRect(0.0f, 0.0f, this.s.getMeasuredWidth(), this.s.getMeasuredHeight(), this.a.f);
        canvas.restore();
    }

    public final void x0() {
        if (this.D != null) {
            if (this.actionBar == null && this.simpleActionBar == null) {
                return;
            }
            this.K.setColor(getThemedColor(org.telegram.ui.ActionBar.t6.h5));
            if (this.actionBar != null) {
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Hk, false);
                if (x02 != this.N) {
                    this.N = x02;
                    this.actionBar.D(x02, false);
                }
                int o10 = i0.b.o(x02, 60);
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (lVar.p0 != o10) {
                    lVar.C(o10, false);
                }
            }
            this.e.a.g();
            l10 l10Var = this.D;
            if (l10Var != null) {
                TextView textView = (TextView) l10Var.b;
                if (this.M) {
                    int i10 = org.telegram.ui.ActionBar.t6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
                    ((org.telegram.ui.Components.p80) this.D.c).setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
                    ((org.telegram.ui.Components.p80) this.D.c).setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Uc, false));
                } else {
                    int i11 = org.telegram.ui.ActionBar.t6.Hk;
                    textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
                    ((org.telegram.ui.Components.p80) this.D.c).setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
                    ((org.telegram.ui.Components.p80) this.D.c).setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Uc, false));
                }
            }
            w0();
        }
    }

    public final void y0(boolean z10) {
        if (z10 != this.f) {
            this.f = z10;
            this.e.setPaused(z10);
            this.s.invalidate();
        }
    }

    public boolean z0() {
        return this instanceof rh.h8;
    }

    public void s0(boolean z10) {
    }

    public void t0(float f7) {
    }
}
