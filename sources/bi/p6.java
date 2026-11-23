package bi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c8.na;
import c8.sa;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.vz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class p6 extends FrameLayout implements fs {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final hi.e H;
    public boolean I;
    public final fq0 a;
    public final int b;
    public final org.telegram.ui.ActionBar.i6 c;
    public boolean d;
    public di.p8 e;
    public final i6 f;
    public boolean h;
    public int n;
    public final FrameLayout r;
    public final LinearLayout s;
    public final TextView w;
    public final TextView x;
    public final FrameLayout y;

    public p6(fq0 fq0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(fq0Var.getContext());
        this.n = org.telegram.messenger.g0.q.y;
        Context context = fq0Var.getContext();
        this.a = fq0Var;
        this.b = i7;
        this.c = i6Var;
        i6 i6Var2 = new i6(context, i7, new b(this, 8), new g6(this), new g6(this), i6Var, fq0Var);
        this.f = i6Var2;
        final int i10 = 0;
        i6Var2.g3.r = false;
        i6Var2.setSelectorType(9);
        i6Var2.setSelectorDrawableColor(0);
        i6Var2.setClipToPadding(false);
        i6Var2.setClipChildren(false);
        addView(i6Var2, na.e(-1, -1, ks.E1));
        g();
        i6Var2.j(new j6(i10, this, fq0Var));
        k6 k6Var = new k6(fq0Var);
        k6Var.m = false;
        k6Var.C = false;
        k6Var.o(kr.h);
        k6Var.n(350L);
        i6Var2.setItemAnimator(k6Var);
        new v4.z(new l6(this, fq0Var)).h(i6Var2);
        View view = this.r;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.y;
        if (view2 != null) {
            removeView(view2);
        }
        final int i11 = 1;
        if (fq0Var.d != this.e) {
            this.r = null;
            this.w = null;
            this.x = null;
            this.s = null;
            this.y = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.E = linearLayout;
            linearLayout.setOrientation(1);
            this.y.addView(this.E, na.e(-2, -2, 17));
            TextView textView = new TextView(getContext());
            this.F = textView;
            textView.setTextSize(1, 20.0f);
            this.F.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.u6.U(this.F, org.telegram.ui.ActionBar.n6.G6, i6Var);
            this.F.setText(gd.N0(2131750228, null));
            this.E.addView(this.F, na.t(-2, -2, 1, 0, 0, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.G = textView2;
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.u6.U(this.G, org.telegram.ui.ActionBar.n6.y6, i6Var);
            this.G.setText(gd.N0(2131750229, null));
            this.E.addView(this.G, na.t(-2, -2, 1, 0, 10, 0, 0));
            hi.e eVar = new hi.e(getContext(), i6Var, true);
            this.H = eVar;
            eVar.i(gd.N0(2131750230, null), false, true);
            this.E.addView(this.H, na.t(ks.e3, 44, 1, 0, 19, 0, 12));
            this.H.setOnClickListener(new View.OnClickListener(this) { // from class: bi.d6
                public final /* synthetic */ p6 b;

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
            addView(this.y, na.d(-1, -1.0f, ks.E1, 0.0f, -12.0f, 0.0f, 0.0f));
            i6Var2.setEmptyView(this.y);
            LinearLayout linearLayout2 = this.E;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(fq0Var.e.h() ? 0 : 8);
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
        this.r.addView(this.s, na.e(-2, -2, 17));
        p9 p9Var = new p9(getContext());
        p9Var.setImageDrawable(new nh0(R.raw.utyan_empty, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        this.s.addView(p9Var, na.t(120, 120, 1, 0, 0, 0, 0));
        TextView textView3 = new TextView(getContext());
        this.w = textView3;
        textView3.setTextSize(1, 17.0f);
        this.w.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.U(this.w, org.telegram.ui.ActionBar.n6.G6, i6Var);
        this.w.setText(gd.N0(2131746473, null));
        this.s.addView(this.w, na.t(-2, -2, 1, 0, 12, 0, 0));
        TextView textView4 = new TextView(getContext());
        this.x = textView4;
        textView4.setTextSize(1, 14.0f);
        TextView textView5 = this.x;
        int i12 = org.telegram.ui.ActionBar.n6.Fi;
        org.telegram.ui.ActionBar.u6.U(textView5, i12, i6Var);
        this.x.setText(gd.N0(2131746474, null));
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: bi.d6
            public final /* synthetic */ p6 b;

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
        org.telegram.ui.ActionBar.u6.Q(this.x, org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(i12, i6Var)), 4, 4), null, org.telegram.ui.ActionBar.u6.K(0.1f, i12), i6Var);
        sa.a(this.x);
        this.s.addView(this.x, na.t(-2, -2, 1, 0, 8, 0, 0));
        addView(this.r, na.e(-1, -1, ks.E1));
        i6Var2.setEmptyView(this.r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReordering(boolean z10) {
        i6 i6Var;
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        fq0 fq0Var = this.a;
        fq0Var.q(fq0Var.g());
        int i7 = 0;
        while (true) {
            i6Var = this.f;
            if (i7 >= i6Var.getChildCount()) {
                break;
            }
            View childAt = i6Var.getChildAt(i7);
            if (childAt instanceof i3) {
                ((i3) childAt).e(z10, true);
            }
            i7++;
        }
        b51 b51Var = i6Var.g3;
        if (b51Var != null) {
            b51Var.T();
        }
        if (z10) {
            org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
            if (T instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) T;
                profileActivity.X4(false);
                org.telegram.messenger.g0.g3(new r5(profileActivity, 1));
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
            i6 i6Var = this.f;
            if (i6Var.canScrollVertically(1)) {
                for (int i11 = 0; i11 < i6Var.getChildCount(); i11++) {
                    if (!(i6Var.getChildAt(i11) instanceof vz)) {
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
        b51 b51Var;
        i6 i6Var = this.f;
        if (i6Var == null || (b51Var = i6Var.g3) == null) {
            return;
        }
        boolean canScrollVertically = i6Var.canScrollVertically(-1);
        b51Var.O(z10);
        if (canScrollVertically) {
            return;
        }
        i6Var.v0(0);
    }

    public final void g() {
        fq0 fq0Var = this.a;
        setClipChildren(fq0Var.M == 0);
        i6 i6Var = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) i6Var.getLayoutParams();
        int i7 = marginLayoutParams.topMargin;
        int i10 = -fq0Var.M;
        if (i7 != i10 || marginLayoutParams.bottomMargin != (-fq0Var.N)) {
            marginLayoutParams.topMargin = i10;
            marginLayoutParams.bottomMargin = -fq0Var.N;
            i6Var.setLayoutParams(marginLayoutParams);
        }
        i6Var.setPadding(org.telegram.messenger.g0.L(9.0f), fq0Var.M + fq0Var.L, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(86.0f) + fq0Var.N);
    }

    public float getTabsHeight() {
        i6 i6Var = this.f;
        float y10 = i6Var.getY();
        for (int i7 = 0; i7 < i6Var.getChildCount(); i7++) {
            View childAt = i6Var.getChildAt(i7);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof i3) {
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
        i6 i6Var = this.f;
        boolean canScrollVertically = i6Var.canScrollVertically(-1);
        i6Var.g3.O(true);
        if (!canScrollVertically) {
            i6Var.v0(0);
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
