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
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class j6 extends FrameLayout implements fs {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final hi.d H;
    public boolean I;
    public final eq0 a;
    public final int b;
    public final org.telegram.ui.ActionBar.i6 c;
    public boolean d;
    public di.o8 e;
    public final c6 f;
    public boolean h;
    public int n;
    public final FrameLayout r;
    public final LinearLayout s;
    public final TextView w;
    public final TextView x;
    public final FrameLayout y;

    public j6(eq0 eq0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(eq0Var.getContext());
        this.n = org.telegram.messenger.g0.q.y;
        Context context = eq0Var.getContext();
        this.a = eq0Var;
        this.b = i7;
        this.c = i6Var;
        c6 c6Var = new c6(context, i7, new b(this, 8), new a6(this), new a6(this), i6Var, eq0Var);
        this.f = c6Var;
        final int i10 = 0;
        c6Var.g3.r = false;
        c6Var.setSelectorType(9);
        c6Var.setSelectorDrawableColor(0);
        c6Var.setClipToPadding(false);
        c6Var.setClipChildren(false);
        addView(c6Var, ma.e(-1, -1, ks.E1));
        g();
        c6Var.j(new d6(i10, this, eq0Var));
        e6 e6Var = new e6(eq0Var);
        e6Var.m = false;
        e6Var.C = false;
        e6Var.o(lr.h);
        e6Var.n(350L);
        c6Var.setItemAnimator(e6Var);
        new v4.z(new f6(this, eq0Var)).h(c6Var);
        View view = this.r;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.y;
        if (view2 != null) {
            removeView(view2);
        }
        final int i11 = 1;
        if (eq0Var.d != this.e) {
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
            org.telegram.ui.ActionBar.u6.U(this.F, org.telegram.ui.ActionBar.n6.G6, i6Var);
            this.F.setText(gd.M0(2131750229, null));
            this.E.addView(this.F, ma.t(-2, -2, 1, 0, 0, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.G = textView2;
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.u6.U(this.G, org.telegram.ui.ActionBar.n6.y6, i6Var);
            this.G.setText(gd.M0(2131750230, null));
            this.E.addView(this.G, ma.t(-2, -2, 1, 0, 10, 0, 0));
            hi.d dVar = new hi.d(getContext(), i6Var, true);
            this.H = dVar;
            dVar.i(gd.M0(2131750231, null), false, true);
            this.E.addView(this.H, ma.t(ks.e3, 44, 1, 0, 19, 0, 12));
            this.H.setOnClickListener(new View.OnClickListener(this) { // from class: bi.x5
                public final /* synthetic */ j6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i11) {
                        case 0:
                            di.o8 o8Var = this.b.e;
                            if (o8Var != null) {
                                if (!o8Var.e || o8Var.g != 783) {
                                    o8Var.g = 783;
                                    o8Var.e = true;
                                    o8Var.k(true);
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
            c6Var.setEmptyView(this.y);
            LinearLayout linearLayout2 = this.E;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(eq0Var.e.h() ? 0 : 8);
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
        q9Var.setImageDrawable(new mh0(R.raw.utyan_empty, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        this.s.addView(q9Var, ma.t(120, 120, 1, 0, 0, 0, 0));
        TextView textView3 = new TextView(getContext());
        this.w = textView3;
        textView3.setTextSize(1, 17.0f);
        this.w.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.U(this.w, org.telegram.ui.ActionBar.n6.G6, i6Var);
        this.w.setText(gd.M0(2131746474, null));
        this.s.addView(this.w, ma.t(-2, -2, 1, 0, 12, 0, 0));
        TextView textView4 = new TextView(getContext());
        this.x = textView4;
        textView4.setTextSize(1, 14.0f);
        TextView textView5 = this.x;
        int i12 = org.telegram.ui.ActionBar.n6.Fi;
        org.telegram.ui.ActionBar.u6.U(textView5, i12, i6Var);
        this.x.setText(gd.M0(2131746475, null));
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: bi.x5
            public final /* synthetic */ j6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i10) {
                    case 0:
                        di.o8 o8Var = this.b.e;
                        if (o8Var != null) {
                            if (!o8Var.e || o8Var.g != 783) {
                                o8Var.g = 783;
                                o8Var.e = true;
                                o8Var.k(true);
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
        ra.a(this.x);
        this.s.addView(this.x, ma.t(-2, -2, 1, 0, 8, 0, 0));
        addView(this.r, ma.e(-1, -1, ks.E1));
        c6Var.setEmptyView(this.r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReordering(boolean z10) {
        c6 c6Var;
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        eq0 eq0Var = this.a;
        eq0Var.q(eq0Var.g());
        int i7 = 0;
        while (true) {
            c6Var = this.f;
            if (i7 >= c6Var.getChildCount()) {
                break;
            }
            View childAt = c6Var.getChildAt(i7);
            if (childAt instanceof c3) {
                ((c3) childAt).e(z10, true);
            }
            i7++;
        }
        z41 z41Var = c6Var.g3;
        if (z41Var != null) {
            z41Var.T();
        }
        if (z10) {
            org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
            if (T instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) T;
                profileActivity.X4(false);
                org.telegram.messenger.g0.g3(new l5(profileActivity, 1));
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
            c6 c6Var = this.f;
            if (c6Var.canScrollVertically(1)) {
                for (int i11 = 0; i11 < c6Var.getChildCount(); i11++) {
                    if (!(c6Var.getChildAt(i11) instanceof wz)) {
                    }
                }
                return;
            }
            this.e.a();
        }
    }

    public final void e() {
        if (this.h) {
            di.o8 o8Var = this.e;
            if (o8Var != null) {
                o8Var.p();
            }
            setReordering(false);
        }
    }

    public final void f(boolean z10) {
        z41 z41Var;
        c6 c6Var = this.f;
        if (c6Var == null || (z41Var = c6Var.g3) == null) {
            return;
        }
        boolean canScrollVertically = c6Var.canScrollVertically(-1);
        z41Var.O(z10);
        if (canScrollVertically) {
            return;
        }
        c6Var.v0(0);
    }

    public final void g() {
        eq0 eq0Var = this.a;
        setClipChildren(eq0Var.M == 0);
        c6 c6Var = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c6Var.getLayoutParams();
        int i7 = marginLayoutParams.topMargin;
        int i10 = -eq0Var.M;
        if (i7 != i10 || marginLayoutParams.bottomMargin != (-eq0Var.N)) {
            marginLayoutParams.topMargin = i10;
            marginLayoutParams.bottomMargin = -eq0Var.N;
            c6Var.setLayoutParams(marginLayoutParams);
        }
        c6Var.setPadding(org.telegram.messenger.g0.L(9.0f), eq0Var.M + eq0Var.L, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(86.0f) + eq0Var.N);
    }

    public float getTabsHeight() {
        c6 c6Var = this.f;
        float y10 = c6Var.getY();
        for (int i7 = 0; i7 < c6Var.getChildCount(); i7++) {
            View childAt = c6Var.getChildAt(i7);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof c3) {
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
        c6 c6Var = this.f;
        boolean canScrollVertically = c6Var.canScrollVertically(-1);
        c6Var.g3.O(true);
        if (!canScrollVertically) {
            c6Var.v0(0);
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
