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
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public abstract class a20 extends org.telegram.ui.ActionBar.n2 {
    public int E;
    public s4.b0 F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final Paint K;
    public int L;
    public boolean M;
    public int N;
    public int O;
    public final w10 a;
    public final w10 b;
    public org.telegram.ui.Components.im0 c;
    public Drawable d;
    public sg.w1 e;
    public boolean f;
    public boolean h;
    public float n;
    public int r;
    public z10 s;
    public float v;
    public final Canvas w;
    public float x;
    public ai.ad y;

    public a20() {
        super(null);
        int i10 = org.telegram.ui.ActionBar.h6.Pj;
        int i11 = org.telegram.ui.ActionBar.h6.Qj;
        int i12 = org.telegram.ui.ActionBar.h6.Rj;
        int i13 = org.telegram.ui.ActionBar.h6.Sj;
        this.a = new w10(i10, i11, i12, i13, null, 0);
        w10 w10Var = new w10(i10, i11, i12, i13, null, 1);
        this.b = w10Var;
        this.w = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.E = -1;
        this.G = true;
        this.K = new Paint();
        w10Var.n = true;
        this.N = -1;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public View createView(Context context) {
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.h5), PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        this.I = (d5Var == null || !((ActionBarLayout) d5Var).M0) ? AndroidUtilities.statusBarHeight : 0;
        this.s = o0();
        org.telegram.ui.ActionBar.d5 d5Var2 = this.parentLayout;
        if (d5Var2 != null && ((ActionBarLayout) d5Var2).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.c = new org.telegram.ui.Components.im0(context, null);
        if (this.G) {
            this.F = new org.telegram.ui.Components.yz(this.c, (AndroidUtilities.dp(68.0f) + this.I) - AndroidUtilities.dp(16.0f));
        } else {
            this.F = new s4.b0();
        }
        this.c.setLayoutManager(this.F);
        s4.b0 b0Var = this.F;
        if (b0Var instanceof org.telegram.ui.Components.yz) {
            ((org.telegram.ui.Components.yz) b0Var).R = true;
        }
        s4.g0 n02 = n0();
        this.c.setAdapter(n02);
        if (n02 instanceof org.telegram.ui.Components.s61) {
            org.telegram.ui.Components.im0 im0Var = this.c;
            v10 v10Var = new v10(this, 0);
            int dp = AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            org.telegram.ui.Components.im0 im0Var2 = this.c;
            Objects.requireNonNull(im0Var2);
            im0Var.r1(v10Var, dp, dp2, new wt(im0Var2, 10), true);
        } else {
            this.c.setSections(true);
        }
        this.c.setClipToPadding(false);
        this.c.j(new k3(this, 11));
        this.y = new ai.ad(context);
        z10 z10Var = this.s;
        sg.w1 p02 = p0();
        this.e = p02;
        z10Var.addView(p02, w7.z5.d(-2.0f, -1));
        this.s.addView(this.y, w7.z5.d(-2.0f, -1));
        this.s.addView(this.c, w7.z5.d(-1.0f, -1));
        this.s.addView(this.actionBar);
        this.fragmentView = this.s;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new ga(this, 28));
        this.actionBar.setForceSkipTouches(true);
        w0();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new e(this, 15), org.telegram.ui.ActionBar.h6.Lj, org.telegram.ui.ActionBar.h6.Mj, org.telegram.ui.ActionBar.h6.Nj, org.telegram.ui.ActionBar.h6.Oj, org.telegram.ui.ActionBar.h6.Pj, org.telegram.ui.ActionBar.h6.Qj, org.telegram.ui.ActionBar.h6.Rj, org.telegram.ui.ActionBar.h6.Sj, org.telegram.ui.ActionBar.h6.Tj, org.telegram.ui.ActionBar.h6.Vj, org.telegram.ui.ActionBar.h6.Wj, org.telegram.ui.ActionBar.h6.Uj, org.telegram.ui.ActionBar.h6.Zj);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return this.M && !org.telegram.ui.ActionBar.h6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public final void l0() {
        org.telegram.ui.Components.im0 im0Var = this.c;
        if (im0Var == null || this.F == null || this.N < 0) {
            return;
        }
        int i10 = this.O;
        im0Var.K(0);
        this.F.h1(this.N, i10);
        this.N = -1;
    }

    public final void m0(String str, CharSequence charSequence, FrameLayout frameLayout, x5 x5Var) {
        ai.ad adVar = this.y;
        FrameLayout frameLayout2 = (FrameLayout) adVar.e;
        FrameLayout frameLayout3 = (FrameLayout) adVar.d;
        ((TextView) adVar.b).setText(str);
        org.telegram.ui.Components.x90 x90Var = (org.telegram.ui.Components.x90) adVar.c;
        x90Var.setText(charSequence);
        x90Var.setMaxWidth(ei.x3.a(x90Var.getText(), x90Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, w7.z5.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (x5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(x5Var, w7.z5.e(-1, -2, 1));
            frameLayout2.setClickable(x5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        adVar.requestLayout();
    }

    public abstract s4.g0 n0();

    public z10 o0() {
        return new z10(this, getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        x0(false);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public void onInsets(int i10, int i11, int i12, int i13) {
        this.c.setPadding(0, 0, 0, i13);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public void onPause() {
        super.onPause();
        sg.w1 w1Var = this.e;
        if (w1Var != null) {
            w1Var.setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public void onResume() {
        super.onResume();
        this.e.setPaused(false);
    }

    public sg.w1 p0() {
        return new gi.f(getParentActivity(), 2);
    }

    public boolean q0() {
        return true;
    }

    public View r0(Context context) {
        x10 x10Var = new x10(this, context, 0);
        x10Var.setTag(-33024);
        return x10Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final Dialog showDialog(Dialog dialog) {
        Dialog showDialog = super.showDialog(dialog);
        x0(showDialog != null);
        return showDialog;
    }

    public final void t0() {
        View view;
        int i10;
        org.telegram.ui.Components.im0 im0Var = this.c;
        if (im0Var == null || im0Var.getChildCount() <= 0) {
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
            this.N = i10;
            this.O = view.getTop();
        }
    }

    public final Paint u0(float f7, float f10) {
        int measuredWidth = this.s.getMeasuredWidth();
        int measuredHeight = this.s.getMeasuredHeight();
        w10 w10Var = this.b;
        w10Var.d(0, (-f7) - ((this.s.getMeasuredWidth() * 0.1f) * this.n), 0, measuredWidth, -f10, measuredHeight);
        return w10Var.f;
    }

    public final void v0() {
        if (this.s.getMeasuredWidth() == 0 || this.s.getMeasuredHeight() == 0 || this.y == null) {
            return;
        }
        int measuredWidth = this.s.getMeasuredWidth();
        int measuredHeight = this.s.getMeasuredHeight();
        w10 w10Var = this.a;
        w10Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
        Canvas canvas = this.w;
        canvas.save();
        canvas.scale(100.0f / this.s.getMeasuredWidth(), 100.0f / this.s.getMeasuredHeight());
        canvas.drawRect(0.0f, 0.0f, this.s.getMeasuredWidth(), this.s.getMeasuredHeight(), w10Var.f);
        canvas.restore();
    }

    public final void w0() {
        if (this.y == null || this.actionBar == null) {
            return;
        }
        this.K.setColor(getThemedColor(org.telegram.ui.ActionBar.h6.h5));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.Tj;
        kVar.C(org.telegram.ui.ActionBar.h6.x0(null, i10, false), false);
        this.actionBar.B(i0.b.o(org.telegram.ui.ActionBar.h6.x0(null, i10, false), 60), false);
        this.e.a.g();
        ai.ad adVar = this.y;
        if (adVar != null) {
            TextView textView = (TextView) adVar.b;
            if (this.M) {
                int i11 = org.telegram.ui.ActionBar.h6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                ((org.telegram.ui.Components.x90) this.y.c).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                ((org.telegram.ui.Components.x90) this.y.c).setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gc, false));
            } else {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                ((org.telegram.ui.Components.x90) this.y.c).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                ((org.telegram.ui.Components.x90) this.y.c).setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gc, false));
            }
        }
        v0();
    }

    public final void x0(boolean z10) {
        if (z10 != this.f) {
            this.f = z10;
            this.e.setPaused(z10);
            this.s.invalidate();
        }
    }

    public void s0(float f7) {
    }
}
