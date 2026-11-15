package bi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c8.ja;
import c8.na;
import di.l8;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class c4 extends FrameLayout implements is {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final hi.d H;
    public boolean I;
    public final wp0 a;
    public final int b;
    public final org.telegram.ui.ActionBar.e6 c;
    public boolean d;
    public l8 e;
    public final v3 f;
    public boolean h;
    public int n;
    public final FrameLayout r;
    public final LinearLayout s;
    public final TextView w;
    public final TextView x;
    public final FrameLayout y;

    public c4(wp0 wp0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(wp0Var.getContext());
        this.n = org.telegram.messenger.g0.q.y;
        Context context = wp0Var.getContext();
        this.a = wp0Var;
        this.b = i7;
        this.c = e6Var;
        v3 v3Var = new v3(context, i7, new b(this, 6), new t3(this), new t3(this), e6Var, wp0Var);
        this.f = v3Var;
        v3Var.g3.r = false;
        v3Var.setSelectorType(9);
        v3Var.setSelectorDrawableColor(0);
        v3Var.setClipToPadding(false);
        v3Var.setClipChildren(false);
        addView(v3Var, ja.e(-1, -1, ns.E1));
        g();
        v3Var.j(new w3(r3, this, wp0Var));
        x3 x3Var = new x3(wp0Var);
        x3Var.m = false;
        x3Var.C = false;
        x3Var.o(er.h);
        x3Var.n(350L);
        v3Var.setItemAnimator(x3Var);
        new v4.y(new y3(this, wp0Var)).h(v3Var);
        View view = this.r;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.y;
        if (view2 != null) {
            removeView(view2);
        }
        final int i10 = 1;
        if (wp0Var.d != this.e) {
            this.r = null;
            this.w = null;
            this.x = null;
            this.s = null;
            this.y = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.E = linearLayout;
            linearLayout.setOrientation(1);
            this.y.addView(this.E, ja.e(-2, -2, 17));
            TextView textView = new TextView(getContext());
            this.F = textView;
            textView.setTextSize(1, 20.0f);
            this.F.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.q6.U(this.F, org.telegram.ui.ActionBar.j6.G6, e6Var);
            this.F.setText(hd.M0(2131750245, null));
            this.E.addView(this.F, ja.t(-2, -2, 1, 0, 0, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.G = textView2;
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.q6.U(this.G, org.telegram.ui.ActionBar.j6.y6, e6Var);
            this.G.setText(hd.M0(2131750246, null));
            this.E.addView(this.G, ja.t(-2, -2, 1, 0, 10, 0, 0));
            hi.d dVar = new hi.d(getContext(), e6Var, true);
            this.H = dVar;
            dVar.i(hd.M0(2131750247, null), false, true);
            this.E.addView(this.H, ja.t(ns.e3, 44, 1, 0, 19, 0, 12));
            this.H.setOnClickListener(new View.OnClickListener(this) { // from class: bi.q3
                public final /* synthetic */ c4 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i10) {
                        case 0:
                            l8 l8Var = this.b.e;
                            if (l8Var != null) {
                                if (!l8Var.e || l8Var.g != 783) {
                                    l8Var.g = 783;
                                    l8Var.e = true;
                                    l8Var.j(true);
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
            addView(this.y, ja.d(-1, -1.0f, ns.E1, 0.0f, -12.0f, 0.0f, 0.0f));
            v3Var.setEmptyView(this.y);
            LinearLayout linearLayout2 = this.E;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(wp0Var.e.h() ? 0 : 8);
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
        this.r.addView(this.s, ja.e(-2, -2, 17));
        i9 i9Var = new i9(getContext());
        i9Var.setImageDrawable(new ch0(R.raw.utyan_empty, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        this.s.addView(i9Var, ja.t(120, 120, 1, 0, 0, 0, 0));
        TextView textView3 = new TextView(getContext());
        this.w = textView3;
        textView3.setTextSize(1, 17.0f);
        this.w.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.q6.U(this.w, org.telegram.ui.ActionBar.j6.G6, e6Var);
        this.w.setText(hd.M0(2131746669, null));
        this.s.addView(this.w, ja.t(-2, -2, 1, 0, 12, 0, 0));
        TextView textView4 = new TextView(getContext());
        this.x = textView4;
        textView4.setTextSize(1, 14.0f);
        TextView textView5 = this.x;
        int i11 = org.telegram.ui.ActionBar.j6.Fi;
        org.telegram.ui.ActionBar.q6.U(textView5, i11, e6Var);
        this.x.setText(hd.M0(2131746670, null));
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: bi.q3
            public final /* synthetic */ c4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        l8 l8Var = this.b.e;
                        if (l8Var != null) {
                            if (!l8Var.e || l8Var.g != 783) {
                                l8Var.g = 783;
                                l8Var.e = true;
                                l8Var.j(true);
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
        org.telegram.ui.ActionBar.q6.Q(this.x, org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(i11, e6Var)), 4, 4), null, org.telegram.ui.ActionBar.q6.K(0.1f, i11), e6Var);
        na.a(this.x);
        this.s.addView(this.x, ja.t(-2, -2, 1, 0, 8, 0, 0));
        addView(this.r, ja.e(-1, -1, ns.E1));
        v3Var.setEmptyView(this.r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReordering(boolean z10) {
        v3 v3Var;
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        wp0 wp0Var = this.a;
        wp0Var.q(wp0Var.g());
        int i7 = 0;
        while (true) {
            v3Var = this.f;
            if (i7 >= v3Var.getChildCount()) {
                break;
            }
            View childAt = v3Var.getChildAt(i7);
            if (childAt instanceof i2) {
                ((i2) childAt).e(z10, true);
            }
            i7++;
        }
        p41 p41Var = v3Var.g3;
        if (p41Var != null) {
            p41Var.T();
        }
        if (z10) {
            org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
            if (T instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) T;
                profileActivity.W4(false);
                org.telegram.messenger.g0.h3(new e3(profileActivity, 1));
            }
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.G3 && objArr[1] == this.e) {
            f(true);
            if (this.e == null || !isAttachedToWindow()) {
                return;
            }
            v3 v3Var = this.f;
            if (v3Var.canScrollVertically(1)) {
                for (int i11 = 0; i11 < v3Var.getChildCount(); i11++) {
                    if (!(v3Var.getChildAt(i11) instanceof pz)) {
                    }
                }
                return;
            }
            this.e.a();
        }
    }

    public final void e() {
        if (this.h) {
            l8 l8Var = this.e;
            if (l8Var != null) {
                l8Var.n();
            }
            setReordering(false);
        }
    }

    public final void f(boolean z10) {
        p41 p41Var;
        v3 v3Var = this.f;
        if (v3Var == null || (p41Var = v3Var.g3) == null) {
            return;
        }
        boolean canScrollVertically = v3Var.canScrollVertically(-1);
        p41Var.O(z10);
        if (canScrollVertically) {
            return;
        }
        v3Var.v0(0);
    }

    public final void g() {
        wp0 wp0Var = this.a;
        setClipChildren(wp0Var.M == 0);
        v3 v3Var = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v3Var.getLayoutParams();
        int i7 = marginLayoutParams.topMargin;
        int i10 = -wp0Var.M;
        if (i7 != i10 || marginLayoutParams.bottomMargin != (-wp0Var.N)) {
            marginLayoutParams.topMargin = i10;
            marginLayoutParams.bottomMargin = -wp0Var.N;
            v3Var.setLayoutParams(marginLayoutParams);
        }
        v3Var.setPadding(org.telegram.messenger.g0.L(9.0f), wp0Var.M + wp0Var.L, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(86.0f) + wp0Var.N);
    }

    public float getTabsHeight() {
        v3 v3Var = this.f;
        float y10 = v3Var.getY();
        for (int i7 = 0; i7 < v3Var.getChildCount(); i7++) {
            View childAt = v3Var.getChildAt(i7);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof i2) {
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
        ns.f(this.b).c(this, ns.G3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.b).n(this, ns.G3);
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
        v3 v3Var = this.f;
        boolean canScrollVertically = v3Var.canScrollVertically(-1);
        v3Var.g3.O(true);
        if (!canScrollVertically) {
            v3Var.v0(0);
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
