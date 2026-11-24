// default package

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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kj8 extends my0 implements jm7 {
    public static final /* synthetic */ int I1 = 0;
    public int A1;
    public int B1;
    public float C1;
    public final ik8 D1;
    public int E1;
    public int F1;
    public int G1;
    public x20 H1;
    public final d l1;
    public final cj8 m1;
    public final ArrayList n1;
    public float o1;
    public float p1;
    public boolean q1;
    public final hj8 r1;
    public final su s1;
    public int t1;
    public final FrameLayout u1;
    public boolean v1;
    public final meb w1;
    public final byte x1;
    public final boolean y1;
    public boolean z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kj8(d dVar, Context context, int i, boolean z, int i2, boolean z2, ik8 ik8Var, ylb ylbVar) {
        super(1, ylbVar, context, false);
        final byte b = 0;
        ArrayList arrayList = new ArrayList();
        this.n1 = arrayList;
        this.E1 = nm7.d4;
        this.l1 = dVar;
        this.D1 = ik8Var;
        L(cmb.g5);
        this.x1 = i2;
        this.y1 = z2;
        this.w1 = neb.h(gm.v2(null, R.raw.star_loader));
        ne6 ne6Var = new ne6((byte) 11, getContext(), this);
        if (z || i2 == 35) {
            PremiumPreviewFragment.q0(i, arrayList, false);
            PremiumPreviewFragment.q0(i, arrayList, true);
        } else {
            PremiumPreviewFragment.r0(i, arrayList);
        }
        if (i2 == 40) {
            arrayList.clear();
            arrayList.add(new hk8(40, R.drawable.gift, jb6.M0(2131750774, null), jb6.M0(2131750773, null)));
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.n1.size()) {
                i3 = 0;
                break;
            } else if (((hk8) this.n1.get(i3)).a == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (z2) {
            hk8 hk8Var = (hk8) this.n1.get(i3);
            this.n1.clear();
            this.n1.add(hk8Var);
            i3 = 0;
        }
        hk8 hk8Var2 = (hk8) this.n1.get(i3);
        this.v0 = false;
        this.w0 = false;
        this.T0 = false;
        nj8 nj8Var = new nj8(cmb.Qk, cmb.Rk, cmb.Sk, -1, null);
        nj8Var.o = 1.1f;
        nj8Var.p = 1.5f;
        nj8Var.q = -0.2f;
        nj8Var.m = true;
        su suVar = new su(this, getContext(), nj8Var, (byte) 25);
        this.s1 = suVar;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.u1 = frameLayout;
        frameLayout.setContentDescription(jb6.M0(2131751978, null));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int L = gm.L(12.0f);
        int p = on2.p(-1, 40);
        int p2 = on2.p(-1, 100);
        imageView.setBackground(cmb.i0(L, L, L, L, p, p2, p2));
        frameLayout.addView(imageView, qoe.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: dj8
            public final /* synthetic */ kj8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                kj8 kj8Var = this.b;
                switch (b2) {
                    case 0:
                        kj8Var.dismiss();
                        break;
                    default:
                        kj8Var.dismiss();
                        break;
                }
            }
        });
        ne6Var.addView(suVar, qoe.t(-1, -2, 1, 0, 16, 0, 0));
        hj8 hj8Var = new hj8(this, getContext());
        this.r1 = hj8Var;
        hj8Var.setOverScrollMode(2);
        hj8Var.setOffscreenPageLimit(0);
        hj8Var.setAdapter(new db5(this, (byte) 2));
        this.A1 = i3;
        hj8Var.setCurrentItem(i3);
        ne6Var.addView(hj8Var, qoe.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        ne6Var.addView(frameLayout, qoe.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        yx0 yx0Var = new yx0(getContext(), hj8Var, this.n1.size());
        hj8Var.b(new ij8(this, yx0Var, b));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(ne6Var);
        linearLayout.setOrientation(1);
        int i4 = cmb.U8;
        int i5 = cmb.O9;
        yx0Var.n = i4;
        yx0Var.r = i5;
        if (!z2) {
            linearLayout.addView(yx0Var, qoe.t(this.n1.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        final byte b2 = 1;
        cj8 cj8Var = new cj8(ylbVar, getContext(), true);
        this.m1 = cj8Var;
        cj8Var.w.setOnClickListener(new x73(this, dVar, z2, hk8Var2, (byte) 5));
        cj8Var.h.setOnClickListener(new View.OnClickListener(this) { // from class: dj8
            public final /* synthetic */ kj8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                kj8 kj8Var = this.b;
                switch (b22) {
                    case 0:
                        kj8Var.dismiss();
                        break;
                    default:
                        kj8Var.dismiss();
                        break;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(cj8Var, qoe.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        anb.h(cmb.g5, ylbVar, frameLayout2);
        linearLayout.addView(frameLayout2, qoe.r(-1, 68, 80));
        if (i2 == 40) {
            cj8Var.c(wsa.k2(jb6.M0(2131743575, null)), true, false);
        } else if (z8c.h(i).p()) {
            cj8Var.c(jb6.M0(2131747564, null), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        this.O = scrollView;
        hs6.d0(i).p1();
        E0();
        this.U0 = (byte) 83;
        jp0 jp0Var = new jp0(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.b = jp0Var;
        int i6 = this.u0;
        jp0Var.setPadding(i6, this.t0 - 1, i6, 0);
    }

    @Override // my0
    public final boolean C() {
        int i = 0;
        while (true) {
            hj8 hj8Var = this.r1;
            if (i >= hj8Var.getChildCount()) {
                return true;
            }
            jj8 jj8Var = (jj8) hj8Var.getChildAt(i);
            if (jj8Var.a == this.A1) {
                if (jj8Var.f instanceof lh0) {
                    return !((lh0) r1).b.canScrollVertically(-1);
                }
            }
            i++;
        }
    }

    public final void D0() {
        hj8 hj8Var;
        View m;
        View m2;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            hj8Var = this.r1;
            if (i3 >= hj8Var.getChildCount()) {
                break;
            }
            jj8 jj8Var = (jj8) hj8Var.getChildAt(i3);
            int i4 = jj8Var.a;
            ViewGroup viewGroup = jj8Var.f;
            if (i4 == this.A1 && (viewGroup instanceof lh0) && ((m2 = ((lh0) viewGroup).c.m(0)) == null || (i = m2.getTop()) < 0)) {
                i = 0;
            }
            if (jj8Var.a == this.B1 && (viewGroup instanceof lh0) && ((m = ((lh0) viewGroup).c.m(0)) == null || (i2 = m.getTop()) < 0)) {
                i2 = 0;
            }
            i3++;
        }
        int i5 = this.F1;
        if (i >= 0) {
            float f = 1.0f - this.C1;
            i5 = Math.min(i5, (int) td4.A(1.0f, f, i5, i * f));
        }
        if (i2 >= 0) {
            float f2 = this.C1;
            i5 = Math.min(i5, (int) td4.A(1.0f, f2, this.F1, i2 * f2));
        }
        float f3 = 1.0f - this.p1;
        FrameLayout frameLayout = this.u1;
        frameLayout.setAlpha(f3);
        if (this.o1 == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z = this.q1;
        su suVar = this.s1;
        suVar.setTranslationX((z ? suVar.getMeasuredWidth() : -suVar.getMeasuredWidth()) * this.p1);
        if (i5 != this.G1) {
            this.G1 = i5;
            for (int i6 = 0; i6 < hj8Var.getChildCount(); i6++) {
                if (!((jj8) hj8Var.getChildAt(i6)).h) {
                    hj8Var.getChildAt(i6).setTranslationY(this.G1);
                }
            }
            suVar.setTranslationY(this.G1);
            frameLayout.setTranslationY(this.G1);
            this.b.invalidate();
            gm.T3(this.H1, this.G1 < gm.L(this.x1 == 40 ? 5.0f : 30.0f), 1.0f, true, true);
        }
    }

    public final void E0() {
        boolean z = this.z1;
        cj8 cj8Var = this.m1;
        if (z) {
            cj8Var.f.setText(jb6.M0(2131754942, null));
            return;
        }
        if (!this.y1) {
            cj8Var.f.setText(PremiumPreviewFragment.s0(this.a, this.D1));
            return;
        }
        byte b = this.x1;
        if (b == 4) {
            cj8Var.f.setText(jb6.M0(2131743546, null));
            cj8Var.setIcon(R.raw.unlock_icon);
        } else if (b != 10) {
            cj8Var.f.setText(jb6.M0(2131754942, null));
        } else {
            cj8Var.f.setText(jb6.M0(2131743547, null));
            cj8Var.setIcon(R.raw.unlock_icon);
        }
    }

    public final void F0() {
        this.z1 = true;
        cj8 cj8Var = this.m1;
        cj8Var.r = false;
        cj8Var.d(true);
        E0();
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.n5 || i == nm7.k5) {
            E0();
            return;
        }
        if (i == nm7.j5) {
            boolean p = z8c.h(this.a).p();
            cj8 cj8Var = this.m1;
            if (p) {
                cj8Var.c(jb6.M0(2131747564, null), false, true);
            } else {
                cj8Var.r = false;
                cj8Var.d(true);
            }
        }
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        super.dismiss();
        nm7.e().n(this, nm7.n5);
        nm7.f(this.a).n(this, nm7.k5);
        nm7.f(this.a).n(this, nm7.j5);
        nm7.e().k(nm7.k1, 16);
    }

    @Override // my0
    public final boolean j0() {
        hj8 hj8Var = this.r1;
        if (hj8Var.getChildCount() > 0) {
            ViewGroup viewGroup = ((jj8) hj8Var.getChildAt(0)).f;
            if (viewGroup instanceof zi8) {
                zi8 zi8Var = (zi8) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(r0.getMeasuredWidth(), 0.0f);
                zi8Var.setOffset(r0.getMeasuredWidth());
                this.v1 = true;
                ofFloat.addUpdateListener(new af0(zi8Var, (byte) 11));
                ofFloat.addListener(new ic8((Object) this, (Object) zi8Var, (byte) 1));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(d53.h);
                ofFloat.start();
            }
        }
        return false;
    }

    @Override // my0, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        nm7.e().b(this, nm7.n5);
        nm7.f(this.a).b(this, nm7.k5);
        nm7.f(this.a).b(this, nm7.j5);
        x20 x20Var = new x20((byte) 5, getContext(), this);
        this.H1 = x20Var;
        anb.h(cmb.g5, this.J0, x20Var);
        anb.l(this.H1, 5, cmb.F6, this.J0);
        anb.l(this.H1, 3, cmb.y8, this.J0);
        x20 x20Var2 = this.H1;
        int i = cmb.x8;
        anb.l(x20Var2, 1, i, this.J0);
        anb.b(this.H1, i, this.J0, true);
        this.H1.setCastShadows(true);
        this.H1.setExtraHeight(gm.L(2.0f));
        this.H1.setBackButtonImage(R.drawable.ic_ab_back);
        this.H1.setActionBarMenuOnItemClick(new wl5(this, (byte) 26));
        this.b.addView(this.H1, qoe.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.H1.getLayoutParams()).topMargin = (-this.t0) - gm.L(2.0f);
        gm.T3(this.H1, false, 1.0f, true, false);
        int i2 = this.A1;
        ArrayList arrayList = this.n1;
        if (((hk8) arrayList.get(i2)).a == 14) {
            this.H1.setTitle(jb6.M0(2131743492, null));
            this.H1.requestLayout();
            return;
        }
        if (((hk8) arrayList.get(this.A1)).a == 28) {
            this.H1.setTitle(jb6.M0(2131743937, null));
            this.H1.requestLayout();
            return;
        }
        byte b = ((hk8) arrayList.get(this.A1)).a;
        x20 x20Var3 = this.H1;
        if (b == 40) {
            x20Var3.setTitle(jb6.M0(2131750774, null));
            this.H1.requestLayout();
        } else {
            x20Var3.setTitle(jb6.M0(2131751286, null));
            this.H1.requestLayout();
        }
    }

    @Override // my0, android.app.Dialog
    public final void show() {
        super.show();
        nm7.e().k(nm7.j1, 16);
    }

    public kj8(d dVar, int i, boolean z) {
        this(dVar, dVar.getContext(), dVar.getCurrentAccount(), false, i, z, null);
    }

    public kj8(d dVar, Context context, int i, int i2, boolean z) {
        this(dVar, context, i, false, i2, z, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kj8(d dVar, Context context, int i, boolean z, int i2, boolean z2, ik8 ik8Var) {
        this(dVar, context, i, z, i2, z2, ik8Var, r0);
        ylb ylbVar;
        if (dVar == null) {
            ylbVar = null;
        } else if (dVar.getLastStoryViewer() != null && !dVar.getLastStoryViewer().H0) {
            ylbVar = dVar.getLastStoryViewer().E;
        } else {
            ylbVar = dVar.getResourceProvider();
        }
    }

    public kj8(int i, ylb ylbVar, Context context) {
        this(null, context, z8c.t0, false, i, true, null, ylbVar);
    }
}
