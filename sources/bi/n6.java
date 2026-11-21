package bi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c8.ma;
import c8.ra;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.yz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class n6 extends FrameLayout implements fs {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final hi.e H;
    public boolean I;
    public final gq0 a;
    public final int b;
    public final org.telegram.ui.ActionBar.h6 c;
    public boolean d;
    public di.p8 e;
    public final g6 f;
    public boolean h;
    public int n;
    public final FrameLayout r;
    public final LinearLayout s;
    public final TextView w;
    public final TextView x;
    public final FrameLayout y;

    public n6(gq0 gq0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(gq0Var.getContext());
        this.n = org.telegram.messenger.g0.q.y;
        Context context = gq0Var.getContext();
        this.a = gq0Var;
        this.b = i7;
        this.c = h6Var;
        g6 g6Var = new g6(context, i7, new b(this, 8), new e6(this), new e6(this), h6Var, gq0Var);
        this.f = g6Var;
        final int i10 = 0;
        g6Var.g3.r = false;
        g6Var.setSelectorType(9);
        g6Var.setSelectorDrawableColor(0);
        g6Var.setClipToPadding(false);
        g6Var.setClipChildren(false);
        addView(g6Var, ma.e(-1, -1, ks.E1));
        g();
        g6Var.j(new h6(i10, this, gq0Var));
        i6 i6Var = new i6(gq0Var);
        i6Var.m = false;
        i6Var.C = false;
        i6Var.o(nr.h);
        i6Var.n(350L);
        g6Var.setItemAnimator(i6Var);
        new v4.z(new j6(this, gq0Var)).h(g6Var);
        View view = this.r;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.y;
        if (view2 != null) {
            removeView(view2);
        }
        final int i11 = 1;
        if (gq0Var.d != this.e) {
            this.r = null;
            this.w = null;
            this.x = null;
            this.s = null;
            this.y = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.E = linearLayout;
            linearLayout.setOrientation(1);
            this.y.addView(this.E, ma.e(-2, -2, 17));
            TextView textView = new TextView(getContext());
            this.F = textView;
            textView.setTextSize(1, 20.0f);
            this.F.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.t6.U(this.F, org.telegram.ui.ActionBar.m6.G6, h6Var);
            this.F.setText(gd.N0(2131750228, null));
            this.E.addView(this.F, ma.t(-2, -2, 1, 0, 0, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.G = textView2;
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.t6.U(this.G, org.telegram.ui.ActionBar.m6.y6, h6Var);
            this.G.setText(gd.N0(2131750229, null));
            this.E.addView(this.G, ma.t(-2, -2, 1, 0, 10, 0, 0));
            hi.e eVar = new hi.e(getContext(), h6Var, true);
            this.H = eVar;
            eVar.i(gd.N0(2131750230, null), false, true);
            this.E.addView(this.H, ma.t(ks.e3, 44, 1, 0, 19, 0, 12));
            this.H.setOnClickListener(new View.OnClickListener(this) { // from class: bi.b6
                public final /* synthetic */ n6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i11) {
                        case 0:
                            di.p8 p8Var = this.b.e;
                            if (p8Var != null) {
                                if (!p8Var.e || p8Var.g != 783) {
                                    p8Var.g = 783;
                                    p8Var.e = true;
                                    p8Var.k(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            this.b.a.a();
                            break;
                    }
                }
            });
            addView(this.y, ma.d(-1, -1.0f, ks.E1, 0.0f, -12.0f, 0.0f, 0.0f));
            g6Var.setEmptyView(this.y);
            LinearLayout linearLayout2 = this.E;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(gq0Var.e.h() ? 0 : 8);
                return;
            }
            return;
        }
        this.y = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.E = null;
        this.r = new FrameLayout(getContext());
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        this.s = linearLayout3;
        linearLayout3.setOrientation(1);
        this.r.addView(this.s, ma.e(-2, -2, 17));
        q9 q9Var = new q9(getContext());
        q9Var.setImageDrawable(new oh0(R.raw.utyan_empty, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        this.s.addView(q9Var, ma.t(120, 120, 1, 0, 0, 0, 0));
        TextView textView3 = new TextView(getContext());
        this.w = textView3;
        textView3.setTextSize(1, 17.0f);
        this.w.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.U(this.w, org.telegram.ui.ActionBar.m6.G6, h6Var);
        this.w.setText(gd.N0(2131746473, null));
        this.s.addView(this.w, ma.t(-2, -2, 1, 0, 12, 0, 0));
        TextView textView4 = new TextView(getContext());
        this.x = textView4;
        textView4.setTextSize(1, 14.0f);
        TextView textView5 = this.x;
        int i12 = org.telegram.ui.ActionBar.m6.Fi;
        org.telegram.ui.ActionBar.t6.U(textView5, i12, h6Var);
        this.x.setText(gd.N0(2131746474, null));
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: bi.b6
            public final /* synthetic */ n6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i10) {
                    case 0:
                        di.p8 p8Var = this.b.e;
                        if (p8Var != null) {
                            if (!p8Var.e || p8Var.g != 783) {
                                p8Var.g = 783;
                                p8Var.e = true;
                                p8Var.k(true);
                                break;
                            }
                        }
                        break;
                    default:
                        this.b.a.a();
                        break;
                }
            }
        });
        this.x.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.t6.Q(this.x, org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i12, h6Var)), 4, 4), null, org.telegram.ui.ActionBar.t6.K(0.1f, i12), h6Var);
        ra.a(this.x);
        this.s.addView(this.x, ma.t(-2, -2, 1, 0, 8, 0, 0));
        addView(this.r, ma.e(-1, -1, ks.E1));
        g6Var.setEmptyView(this.r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReordering(boolean z10) {
        g6 g6Var;
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        gq0 gq0Var = this.a;
        gq0Var.q(gq0Var.g());
        int i7 = 0;
        while (true) {
            g6Var = this.f;
            if (i7 >= g6Var.getChildCount()) {
                break;
            }
            View childAt = g6Var.getChildAt(i7);
            if (childAt instanceof g3) {
                ((g3) childAt).e(z10, true);
            }
            i7++;
        }
        c51 c51Var = g6Var.g3;
        if (c51Var != null) {
            c51Var.T();
        }
        if (z10) {
            org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
            if (T instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) T;
                profileActivity.X4(false);
                org.telegram.messenger.g0.g3(new p5(profileActivity, 1));
            }
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.I3 && objArr[1] == this.e) {
            f(true);
            if (this.e == null || !isAttachedToWindow()) {
                return;
            }
            g6 g6Var = this.f;
            if (g6Var.canScrollVertically(1)) {
                for (int i11 = 0; i11 < g6Var.getChildCount(); i11++) {
                    if (!(g6Var.getChildAt(i11) instanceof yz)) {
                    }
                }
                return;
            }
            this.e.a();
        }
    }

    public final void e() {
        if (this.h) {
            di.p8 p8Var = this.e;
            if (p8Var != null) {
                p8Var.p();
            }
            setReordering(false);
        }
    }

    public final void f(boolean z10) {
        c51 c51Var;
        g6 g6Var = this.f;
        if (g6Var == null || (c51Var = g6Var.g3) == null) {
            return;
        }
        boolean canScrollVertically = g6Var.canScrollVertically(-1);
        c51Var.O(z10);
        if (canScrollVertically) {
            return;
        }
        g6Var.v0(0);
    }

    public final void g() {
        gq0 gq0Var = this.a;
        setClipChildren(gq0Var.M == 0);
        g6 g6Var = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) g6Var.getLayoutParams();
        int i7 = marginLayoutParams.topMargin;
        int i10 = -gq0Var.M;
        if (i7 != i10 || marginLayoutParams.bottomMargin != (-gq0Var.N)) {
            marginLayoutParams.topMargin = i10;
            marginLayoutParams.bottomMargin = -gq0Var.N;
            g6Var.setLayoutParams(marginLayoutParams);
        }
        g6Var.setPadding(org.telegram.messenger.g0.L(9.0f), gq0Var.M + gq0Var.L, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(86.0f) + gq0Var.N);
    }

    public float getTabsHeight() {
        g6 g6Var = this.f;
        float y10 = g6Var.getY();
        for (int i7 = 0; i7 < g6Var.getChildCount(); i7++) {
            View childAt = g6Var.getChildAt(i7);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof g3) {
                if (R == 0) {
                    return Math.max(0.0f, childAt.getY() + y10);
                }
            } else if (R == 0) {
                return Math.max(0.0f, (childAt.getAlpha() * childAt.getHeight()) + childAt.getY() + y10);
            }
        }
        return 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.b).c(this, ks.I3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.b).n(this, ks.I3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        setVisibleHeight(this.n);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        g6 g6Var = this.f;
        boolean canScrollVertically = g6Var.canScrollVertically(-1);
        g6Var.g3.O(true);
        if (!canScrollVertically) {
            g6Var.v0(0);
        }
        this.a.p();
    }

    public void setVisibleHeight(int i7) {
        this.n = i7;
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(i7, org.telegram.messenger.g0.L(150.0f), org.telegram.messenger.g0.L(220.0f)));
        float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, l10);
        LinearLayout linearLayout = this.s;
        if (linearLayout != null) {
            linearLayout.setAlpha(l10);
            this.s.setScaleX(T1);
            this.s.setScaleY(T1);
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.n)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(l10);
            this.E.setScaleX(T1);
            this.E.setScaleY(T1);
        }
        FrameLayout frameLayout2 = this.y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.n)) / 2.0f);
        }
    }
}
