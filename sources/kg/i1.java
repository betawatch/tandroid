package kg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.d00;
import org.telegram.messenger.d20;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.y9;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.eu0;
import org.telegram.ui.fu0;
import rh.e4;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i1 extends z2 implements us {
    public static final /* synthetic */ int F1 = 0;
    public final fu0 A1;
    public int B1;
    public int C1;
    public int D1;
    public g1 E1;
    public final org.telegram.ui.ActionBar.k2 i1;
    public final x0 j1;
    public final ArrayList k1;
    public float l1;
    public float m1;
    public boolean n1;
    public final d1 o1;
    public final fg.i p1;
    public int q1;
    public final FrameLayout r1;
    public boolean s1;
    public final c00 t1;
    public final int u1;
    public final boolean v1;
    public boolean w1;
    public int x1;
    public int y1;
    public float z1;

    public i1(int i10, Context context, p6 p6Var) {
        this(null, context, d20.s0, false, i10, true, null, p6Var);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        int i10 = 0;
        while (true) {
            d1 d1Var = this.o1;
            if (i10 >= d1Var.getChildCount()) {
                return true;
            }
            h1 h1Var = (h1) d1Var.getChildAt(i10);
            if (h1Var.a == this.x1) {
                if (h1Var.f instanceof a) {
                    return !((a) r1).b.canScrollVertically(-1);
                }
            }
            i10++;
        }
    }

    public final void I0() {
        d1 d1Var;
        View m10;
        View m11;
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            d1Var = this.o1;
            if (i12 >= d1Var.getChildCount()) {
                break;
            }
            h1 h1Var = (h1) d1Var.getChildAt(i12);
            int i13 = h1Var.a;
            ViewGroup viewGroup = h1Var.f;
            if (i13 == this.x1 && (viewGroup instanceof a) && ((m11 = ((a) viewGroup).c.m(0)) == null || (i10 = m11.getTop()) < 0)) {
                i10 = 0;
            }
            if (h1Var.a == this.y1 && (viewGroup instanceof a) && ((m10 = ((a) viewGroup).c.m(0)) == null || (i11 = m10.getTop()) < 0)) {
                i11 = 0;
            }
            i12++;
        }
        int i14 = this.C1;
        if (i10 >= 0) {
            float f7 = 1.0f - this.z1;
            i14 = Math.min(i14, (int) c3.i0.z(1.0f, f7, i14, i10 * f7));
        }
        if (i11 >= 0) {
            float f10 = this.z1;
            i14 = Math.min(i14, (int) c3.i0.z(1.0f, f10, this.C1, i11 * f10));
        }
        float f11 = 1.0f - this.m1;
        FrameLayout frameLayout = this.r1;
        frameLayout.setAlpha(f11);
        if (this.l1 == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z10 = this.n1;
        fg.i iVar = this.p1;
        iVar.setTranslationX((z10 ? iVar.getMeasuredWidth() : -iVar.getMeasuredWidth()) * this.m1);
        if (i14 != this.D1) {
            this.D1 = i14;
            for (int i15 = 0; i15 < d1Var.getChildCount(); i15++) {
                if (!((h1) d1Var.getChildAt(i15)).h) {
                    d1Var.getChildAt(i15).setTranslationY(this.D1);
                }
            }
            iVar.setTranslationY(this.D1);
            frameLayout.setTranslationY(this.D1);
            this.b.invalidate();
            org.telegram.messenger.i0.Y3(this.E1, this.D1 < org.telegram.messenger.i0.L(this.u1 == 40 ? 5.0f : 30.0f), 1.0f, true, true);
        }
    }

    public final void J0() {
        boolean z10 = this.w1;
        x0 x0Var = this.j1;
        if (z10) {
            x0Var.f.setText(cd.L0(2131754942, null));
            return;
        }
        if (!this.v1) {
            x0Var.f.setText(PremiumPreviewFragment.s0(this.a, this.A1));
            return;
        }
        int i10 = this.u1;
        if (i10 == 4) {
            x0Var.f.setText(cd.L0(2131743884, null));
            x0Var.setIcon(R.raw.unlock_icon);
        } else if (i10 != 10) {
            x0Var.f.setText(cd.L0(2131754942, null));
        } else {
            x0Var.f.setText(cd.L0(2131743885, null));
            x0Var.setIcon(R.raw.unlock_icon);
        }
    }

    public final void K0() {
        this.w1 = true;
        x0 x0Var = this.j1;
        x0Var.r = false;
        x0Var.d(true);
        J0();
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.j5 || i10 == zs.g5) {
            J0();
            return;
        }
        if (i10 == zs.f5) {
            boolean q6 = d20.i(this.a).q();
            x0 x0Var = this.j1;
            if (q6) {
                x0Var.c(cd.L0(2131747847, null), false, true);
            } else {
                x0Var.r = false;
                x0Var.d(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        super.dismiss();
        zs.e().n(this, zs.j5);
        zs.f(this.a).n(this, zs.g5);
        zs.f(this.a).n(this, zs.f5);
        zs.e().k(zs.k1, 16);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean m0() {
        d1 d1Var = this.o1;
        if (d1Var.getChildCount() > 0) {
            ViewGroup viewGroup = ((h1) d1Var.getChildAt(0)).f;
            if (viewGroup instanceof v0) {
                v0 v0Var = (v0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(r0.getMeasuredWidth(), 0.0f);
                v0Var.setOffset(r0.getMeasuredWidth());
                this.s1 = true;
                ofFloat.addUpdateListener(new bg.o(v0Var, 3));
                ofFloat.addListener(new bg.f(5, this, v0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(gr.h);
                ofFloat.start();
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zs.e().c(this, zs.j5);
        zs.f(this.a).c(this, zs.g5);
        zs.f(this.a).c(this, zs.f5);
        g1 g1Var = new g1(this, getContext(), 0);
        this.E1 = g1Var;
        a7.i(t6.h5, g1Var, this.I0);
        a7.m(this.E1, 5, t6.G6, this.I0);
        a7.m(this.E1, 3, t6.z8, this.I0);
        g1 g1Var2 = this.E1;
        int i10 = t6.y8;
        a7.m(g1Var2, 1, i10, this.I0);
        a7.b(this.E1, i10, this.I0, true);
        this.E1.setCastShadows(true);
        this.E1.setExtraHeight(org.telegram.messenger.i0.L(2.0f));
        this.E1.setBackButtonImage(R.drawable.ic_ab_back);
        this.E1.setActionBarMenuOnItemClick(new ag.e(this, 9));
        this.b.addView(this.E1, b6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.E1.getLayoutParams()).topMargin = (-this.s0) - org.telegram.messenger.i0.L(2.0f);
        org.telegram.messenger.i0.Y3(this.E1, false, 1.0f, true, false);
        int i11 = this.x1;
        ArrayList arrayList = this.k1;
        if (((eu0) arrayList.get(i11)).a == 14) {
            this.E1.setTitle(cd.L0(2131743831, null));
            this.E1.requestLayout();
        } else if (((eu0) arrayList.get(this.x1)).a == 28) {
            this.E1.setTitle(cd.L0(2131744277, null));
            this.E1.requestLayout();
        } else if (((eu0) arrayList.get(this.x1)).a == 40) {
            this.E1.setTitle(cd.L0(2131750838, null));
            this.E1.requestLayout();
        } else {
            this.E1.setTitle(cd.L0(2131751350, null));
            this.E1.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        super.show();
        zs.e().k(zs.j1, 16);
    }

    public i1(org.telegram.ui.ActionBar.k2 k2Var, int i10, boolean z10) {
        this(k2Var, k2Var.getContext(), k2Var.getCurrentAccount(), false, i10, z10, null);
    }

    public i1(org.telegram.ui.ActionBar.k2 k2Var, Context context, int i10, int i11, boolean z10) {
        this(k2Var, context, i10, false, i11, z10, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i1(org.telegram.ui.ActionBar.k2 k2Var, Context context, int i10, boolean z10, int i11, boolean z11, fu0 fu0Var) {
        this(k2Var, context, i10, z10, i11, z11, fu0Var, r0);
        p6 p6Var;
        if (k2Var == null) {
            p6Var = null;
        } else if (k2Var.getLastStoryViewer() != null && !k2Var.getLastStoryViewer().H0) {
            p6Var = k2Var.getLastStoryViewer().D;
        } else {
            p6Var = k2Var.getResourceProvider();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(org.telegram.ui.ActionBar.k2 k2Var, Context context, int i10, boolean z10, int i11, boolean z11, fu0 fu0Var, p6 p6Var) {
        super(1, context, p6Var, false);
        final int i12 = 0;
        ArrayList arrayList = new ArrayList();
        this.k1 = arrayList;
        this.B1 = zs.e4;
        this.i1 = k2Var;
        this.A1 = fu0Var;
        Q(t6.h5);
        this.u1 = i11;
        this.v1 = z11;
        this.t1 = d00.i(org.telegram.messenger.i0.y2(null, R.raw.star_loader));
        jg.l0 l0Var = new jg.l0(this, getContext(), 5);
        if (!z10 && i11 != 35) {
            PremiumPreviewFragment.r0(i10, arrayList);
        } else {
            PremiumPreviewFragment.q0(i10, arrayList, false);
            PremiumPreviewFragment.q0(i10, arrayList, true);
        }
        if (i11 == 40) {
            arrayList.clear();
            arrayList.add(new eu0(40, R.drawable.gift, cd.L0(2131750838, null), cd.L0(2131750837, null)));
        }
        int i13 = 0;
        while (true) {
            if (i13 >= this.k1.size()) {
                i13 = 0;
                break;
            } else if (((eu0) this.k1.get(i13)).a == i11) {
                break;
            } else {
                i13++;
            }
        }
        if (z11) {
            eu0 eu0Var = (eu0) this.k1.get(i13);
            this.k1.clear();
            this.k1.add(eu0Var);
            i13 = 0;
        }
        eu0 eu0Var2 = (eu0) this.k1.get(i13);
        this.u0 = false;
        this.v0 = false;
        this.T0 = false;
        k1 k1Var = new k1(t6.Ok, t6.Pk, t6.Qk, -1, null);
        k1Var.o = 1.1f;
        k1Var.p = 1.5f;
        k1Var.q = -0.2f;
        k1Var.m = true;
        fg.i iVar = new fg.i(this, getContext(), k1Var, 3);
        this.p1 = iVar;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.r1 = frameLayout;
        frameLayout.setContentDescription(cd.L0(2131752041, null));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int L = org.telegram.messenger.i0.L(12.0f);
        int o10 = i0.b.o(-1, 40);
        int o11 = i0.b.o(-1, 100);
        imageView.setBackground(t6.k0(L, L, L, L, o10, o11, o11));
        frameLayout.addView(imageView, b6.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: kg.y0
            public final /* synthetic */ i1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        l0Var.addView(iVar, b6.t(-1, -2, 1, 0, 16, 0, 0));
        d1 d1Var = new d1(this, getContext());
        this.o1 = d1Var;
        d1Var.setOverScrollMode(2);
        d1Var.setOffscreenPageLimit(0);
        d1Var.setAdapter(new e1(this, i12));
        this.x1 = i13;
        d1Var.setCurrentItem(i13);
        l0Var.addView(d1Var, b6.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        l0Var.addView(frameLayout, b6.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        y9 y9Var = new y9(getContext(), d1Var, this.k1.size());
        d1Var.b(new f1(this, y9Var, i12));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(l0Var);
        linearLayout.setOrientation(1);
        int i14 = t6.V8;
        int i15 = t6.P9;
        y9Var.n = i14;
        y9Var.r = i15;
        if (!z11) {
            linearLayout.addView(y9Var, b6.t(this.k1.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        final int i16 = 1;
        x0 x0Var = new x0(getContext(), p6Var, true);
        this.j1 = x0Var;
        x0Var.w.setOnClickListener(new z0(this, k2Var, z11, eu0Var2, 0));
        x0Var.h.setOnClickListener(new View.OnClickListener(this) { // from class: kg.y0
            public final /* synthetic */ i1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(x0Var, b6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        a7.i(t6.h5, frameLayout2, p6Var);
        linearLayout.addView(frameLayout2, b6.r(-1, 68, 80));
        if (i11 == 40) {
            x0Var.c(e4.g2(cd.L0(2131743913, null)), true, false);
        } else if (d20.i(i10).q()) {
            x0Var.c(cd.L0(2131747847, null), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        this.N = scrollView;
        ui.b0(i10).o1();
        J0();
        this.U0 = 83;
        jg.b1 b1Var = new jg.b1(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.b = b1Var;
        int i17 = this.t0;
        b1Var.setPadding(i17, this.s0 - 1, i17, 0);
    }
}
