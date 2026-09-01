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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class m20 extends org.telegram.ui.ActionBar.p2 {
    public int B;
    public f2.j0 C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public final Paint H;
    public int I;
    public boolean J;
    public int K;
    public int L;
    public final j20 a;
    public final j20 b;
    public org.telegram.ui.Components.tl0 c;
    public Drawable d;
    public fg.p2 e;
    public boolean f;
    public boolean h;
    public float n;
    public int r;
    public l20 s;
    public float v;
    public final Canvas w;
    public float x;
    public lg.a y;

    public m20() {
        super(null);
        int i10 = org.telegram.ui.ActionBar.k6.Pj;
        int i11 = org.telegram.ui.ActionBar.k6.Qj;
        int i12 = org.telegram.ui.ActionBar.k6.Rj;
        int i13 = org.telegram.ui.ActionBar.k6.Sj;
        this.a = new j20(i10, i11, i12, i13, null, 0);
        j20 j20Var = new j20(i10, i11, i12, i13, null, 1);
        this.b = j20Var;
        this.w = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.B = -1;
        this.D = true;
        this.H = new Paint();
        j20Var.n = true;
        this.K = -1;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public View createView(Context context) {
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.h5), PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        this.F = (f5Var == null || !((ActionBarLayout) f5Var).J0) ? AndroidUtilities.statusBarHeight : 0;
        this.s = o0();
        org.telegram.ui.ActionBar.f5 f5Var2 = this.parentLayout;
        if (f5Var2 != null && ((ActionBarLayout) f5Var2).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.c = new org.telegram.ui.Components.tl0(context, null);
        if (this.D) {
            this.C = new org.telegram.ui.Components.rz(this.c, (AndroidUtilities.dp(68.0f) + this.F) - AndroidUtilities.dp(16.0f));
        } else {
            this.C = new f2.j0();
        }
        this.c.setLayoutManager(this.C);
        f2.j0 j0Var = this.C;
        if (j0Var instanceof org.telegram.ui.Components.rz) {
            ((org.telegram.ui.Components.rz) j0Var).R = true;
        }
        f2.p0 n02 = n0();
        this.c.setAdapter(n02);
        if (n02 instanceof org.telegram.ui.Components.x51) {
            org.telegram.ui.Components.tl0 tl0Var = this.c;
            i20 i20Var = new i20(this, 0);
            int dp = AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            org.telegram.ui.Components.tl0 tl0Var2 = this.c;
            Objects.requireNonNull(tl0Var2);
            tl0Var.r1(i20Var, dp, dp2, new gu(tl0Var2, 10), true);
        } else {
            this.c.setSections(true);
        }
        this.c.setClipToPadding(false);
        this.c.j(new l3(this, 11));
        this.y = new lg.a(context);
        l20 l20Var = this.s;
        fg.p2 p02 = p0();
        this.e = p02;
        l20Var.addView(p02, k7.c6.c(-2.0f, -1));
        this.s.addView(this.y, k7.c6.c(-2.0f, -1));
        this.s.addView(this.c, k7.c6.c(-1.0f, -1));
        this.s.addView(this.actionBar);
        this.fragmentView = this.s;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.z51(this, 12));
        this.actionBar.setForceSkipTouches(true);
        v0();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        return k7.f6.a(new f(this, 15), org.telegram.ui.ActionBar.k6.Lj, org.telegram.ui.ActionBar.k6.Mj, org.telegram.ui.ActionBar.k6.Nj, org.telegram.ui.ActionBar.k6.Oj, org.telegram.ui.ActionBar.k6.Pj, org.telegram.ui.ActionBar.k6.Qj, org.telegram.ui.ActionBar.k6.Rj, org.telegram.ui.ActionBar.k6.Sj, org.telegram.ui.ActionBar.k6.Tj, org.telegram.ui.ActionBar.k6.Vj, org.telegram.ui.ActionBar.k6.Wj, org.telegram.ui.ActionBar.k6.Uj, org.telegram.ui.ActionBar.k6.Zj);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        return this.J && !org.telegram.ui.ActionBar.k6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public final void l0() {
        org.telegram.ui.Components.tl0 tl0Var = this.c;
        if (tl0Var == null || this.C == null || this.K < 0) {
            return;
        }
        int i10 = this.L;
        tl0Var.K(0);
        this.C.h1(this.K, i10);
        this.K = -1;
    }

    public final void m0(String str, CharSequence charSequence, FrameLayout frameLayout, w5 w5Var) {
        lg.a aVar = this.y;
        FrameLayout frameLayout2 = (FrameLayout) aVar.e;
        FrameLayout frameLayout3 = (FrameLayout) aVar.d;
        ((TextView) aVar.b).setText(str);
        org.telegram.ui.Components.g90 g90Var = (org.telegram.ui.Components.g90) aVar.c;
        g90Var.setText(charSequence);
        g90Var.setMaxWidth(qh.f3.a(g90Var.getText(), g90Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, k7.c6.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (w5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(w5Var, k7.c6.e(-1, -2, 1));
            frameLayout2.setClickable(w5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        aVar.requestLayout();
    }

    public abstract f2.p0 n0();

    public l20 o0() {
        return new l20(this, getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        w0(false);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public void onInsets(int i10, int i11, int i12, int i13) {
        this.c.setPadding(0, 0, 0, i13);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public void onPause() {
        super.onPause();
        fg.p2 p2Var = this.e;
        if (p2Var != null) {
            p2Var.setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public void onResume() {
        super.onResume();
        this.e.setPaused(false);
    }

    public fg.p2 p0() {
        return new fg.h(getParentActivity(), 2);
    }

    public boolean q0() {
        return true;
    }

    public View r0(Context context) {
        fg.h0 h0Var = new fg.h0(this, context, 24);
        h0Var.setTag(-33024);
        return h0Var;
    }

    public final void s0() {
        View view;
        int i10;
        org.telegram.ui.Components.tl0 tl0Var = this.c;
        if (tl0Var == null || tl0Var.getChildCount() <= 0) {
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
            this.K = i10;
            this.L = view.getTop();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final Dialog showDialog(Dialog dialog) {
        Dialog showDialog = super.showDialog(dialog);
        w0(showDialog != null);
        return showDialog;
    }

    public final Paint t0(float f10, float f11) {
        int measuredWidth = this.s.getMeasuredWidth();
        int measuredHeight = this.s.getMeasuredHeight();
        j20 j20Var = this.b;
        j20Var.d(0, (-f10) - ((this.s.getMeasuredWidth() * 0.1f) * this.n), 0, measuredWidth, -f11, measuredHeight);
        return j20Var.f;
    }

    public final void u0() {
        if (this.s.getMeasuredWidth() == 0 || this.s.getMeasuredHeight() == 0 || this.y == null) {
            return;
        }
        int measuredWidth = this.s.getMeasuredWidth();
        int measuredHeight = this.s.getMeasuredHeight();
        j20 j20Var = this.a;
        j20Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
        Canvas canvas = this.w;
        canvas.save();
        canvas.scale(100.0f / this.s.getMeasuredWidth(), 100.0f / this.s.getMeasuredHeight());
        canvas.drawRect(0.0f, 0.0f, this.s.getMeasuredWidth(), this.s.getMeasuredHeight(), j20Var.f);
        canvas.restore();
    }

    public final void v0() {
        if (this.y == null || this.actionBar == null) {
            return;
        }
        this.H.setColor(getThemedColor(org.telegram.ui.ActionBar.k6.h5));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.Tj;
        kVar.C(org.telegram.ui.ActionBar.k6.w0(null, i10, false), false);
        this.actionBar.B(i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, i10, false), 60), false);
        this.e.a.g();
        lg.a aVar = this.y;
        if (aVar != null) {
            TextView textView = (TextView) aVar.b;
            if (this.J) {
                int i11 = org.telegram.ui.ActionBar.k6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
                ((org.telegram.ui.Components.g90) this.y.c).setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
                ((org.telegram.ui.Components.g90) this.y.c).setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.gc, false));
            } else {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
                ((org.telegram.ui.Components.g90) this.y.c).setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
                ((org.telegram.ui.Components.g90) this.y.c).setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.gc, false));
            }
        }
        u0();
    }

    public final void w0(boolean z4) {
        if (z4 != this.f) {
            this.f = z4;
            this.e.setPaused(z4);
            this.s.invalidate();
        }
    }
}
