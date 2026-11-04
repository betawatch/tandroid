package ai;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b8.mf;
import b8.pf;
import ci.v8;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o4 extends FrameLayout implements cs {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final gi.d H;
    public boolean I;
    public final vp0 a;
    public final int b;
    public final org.telegram.ui.ActionBar.e6 c;
    public boolean d;
    public v8 e;
    public final h4 f;
    public boolean h;
    public int n;
    public final FrameLayout r;
    public final LinearLayout s;
    public final TextView w;
    public final TextView x;
    public final FrameLayout y;

    public o4(vp0 vp0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(vp0Var.getContext());
        this.n = org.telegram.messenger.g0.q.y;
        Context context = vp0Var.getContext();
        this.a = vp0Var;
        this.b = i3;
        this.c = e6Var;
        h4 h4Var = new h4(context, i3, new c(this, 6), new f4(this), new f4(this), e6Var, vp0Var);
        this.f = h4Var;
        h4Var.g3.r = false;
        h4Var.setSelectorType(9);
        h4Var.setSelectorDrawableColor(0);
        h4Var.setClipToPadding(false);
        h4Var.setClipChildren(false);
        addView(h4Var, mf.e(-1, -1, hs.E1));
        g();
        h4Var.j(new i4(r3, this, vp0Var));
        j4 j4Var = new j4(vp0Var);
        j4Var.m = false;
        j4Var.C = false;
        j4Var.o(xq.h);
        j4Var.n(350L);
        h4Var.setItemAnimator(j4Var);
        new u4.y(new k4(this, vp0Var)).h(h4Var);
        View view = this.r;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.y;
        if (view2 != null) {
            removeView(view2);
        }
        final int i10 = 1;
        if (vp0Var.d != this.e) {
            this.r = null;
            this.w = null;
            this.x = null;
            this.s = null;
            this.y = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.E = linearLayout;
            linearLayout.setOrientation(1);
            this.y.addView(this.E, mf.e(-2, -2, 17));
            TextView textView = new TextView(getContext());
            this.F = textView;
            textView.setTextSize(1, 20.0f);
            this.F.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.r6.V(this.F, org.telegram.ui.ActionBar.k6.G6, e6Var);
            this.F.setText(bd.M0(2131750253, null));
            this.E.addView(this.F, mf.t(-2, -2, 1, 0, 0, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.G = textView2;
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(this.G, org.telegram.ui.ActionBar.k6.y6, e6Var);
            this.G.setText(bd.M0(2131750254, null));
            this.E.addView(this.G, mf.t(-2, -2, 1, 0, 10, 0, 0));
            gi.d dVar = new gi.d(getContext(), e6Var, true);
            this.H = dVar;
            dVar.i(bd.M0(2131750255, null), false, true);
            this.E.addView(this.H, mf.t(hs.e3, 44, 1, 0, 19, 0, 12));
            this.H.setOnClickListener(new View.OnClickListener(this) { // from class: ai.c4
                public final /* synthetic */ o4 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i10) {
                        case 0:
                            v8 v8Var = this.b.e;
                            if (v8Var != null) {
                                if (!v8Var.e || v8Var.g != 783) {
                                    v8Var.g = 783;
                                    v8Var.e = true;
                                    v8Var.j(true);
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
            addView(this.y, mf.d(-1, -1.0f, hs.E1, 0.0f, -12.0f, 0.0f, 0.0f));
            h4Var.setEmptyView(this.y);
            LinearLayout linearLayout2 = this.E;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(vp0Var.e.h() ? 0 : 8);
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
        this.r.addView(this.s, mf.e(-2, -2, 17));
        k9 k9Var = new k9(getContext());
        k9Var.setImageDrawable(new ch0(R.raw.utyan_empty, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        this.s.addView(k9Var, mf.t(120, 120, 1, 0, 0, 0, 0));
        TextView textView3 = new TextView(getContext());
        this.w = textView3;
        textView3.setTextSize(1, 17.0f);
        this.w.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.V(this.w, org.telegram.ui.ActionBar.k6.G6, e6Var);
        this.w.setText(bd.M0(2131746677, null));
        this.s.addView(this.w, mf.t(-2, -2, 1, 0, 12, 0, 0));
        TextView textView4 = new TextView(getContext());
        this.x = textView4;
        textView4.setTextSize(1, 14.0f);
        TextView textView5 = this.x;
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.r6.V(textView5, i11, e6Var);
        this.x.setText(bd.M0(2131746678, null));
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: ai.c4
            public final /* synthetic */ o4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        v8 v8Var = this.b.e;
                        if (v8Var != null) {
                            if (!v8Var.e || v8Var.g != 783) {
                                v8Var.g = 783;
                                v8Var.e = true;
                                v8Var.j(true);
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
        org.telegram.ui.ActionBar.r6.R(this.x, org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i11, e6Var)), 4, 4), null, org.telegram.ui.ActionBar.r6.L(0.1f, i11), e6Var);
        pf.a(this.x);
        this.s.addView(this.x, mf.t(-2, -2, 1, 0, 8, 0, 0));
        addView(this.r, mf.e(-1, -1, hs.E1));
        h4Var.setEmptyView(this.r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReordering(boolean z10) {
        h4 h4Var;
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        vp0 vp0Var = this.a;
        vp0Var.q(vp0Var.g());
        int i3 = 0;
        while (true) {
            h4Var = this.f;
            if (i3 >= h4Var.getChildCount()) {
                break;
            }
            View childAt = h4Var.getChildAt(i3);
            if (childAt instanceof q2) {
                ((q2) childAt).e(z10, true);
            }
            i3++;
        }
        f41 f41Var = h4Var.g3;
        if (f41Var != null) {
            f41Var.T();
        }
        if (z10) {
            org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
            if (T instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) T;
                profileActivity.U4(false);
                org.telegram.messenger.g0.h3(new p3(profileActivity, 1));
            }
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.G3 && objArr[1] == this.e) {
            f(true);
            if (this.e == null || !isAttachedToWindow()) {
                return;
            }
            h4 h4Var = this.f;
            if (h4Var.canScrollVertically(1)) {
                for (int i11 = 0; i11 < h4Var.getChildCount(); i11++) {
                    if (!(h4Var.getChildAt(i11) instanceof iz)) {
                    }
                }
                return;
            }
            this.e.a();
        }
    }

    public final void e() {
        if (this.h) {
            v8 v8Var = this.e;
            if (v8Var != null) {
                v8Var.n();
            }
            setReordering(false);
        }
    }

    public final void f(boolean z10) {
        f41 f41Var;
        h4 h4Var = this.f;
        if (h4Var == null || (f41Var = h4Var.g3) == null) {
            return;
        }
        boolean canScrollVertically = h4Var.canScrollVertically(-1);
        f41Var.O(z10);
        if (canScrollVertically) {
            return;
        }
        h4Var.v0(0);
    }

    public final void g() {
        vp0 vp0Var = this.a;
        setClipChildren(vp0Var.M == 0);
        h4 h4Var = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) h4Var.getLayoutParams();
        int i3 = marginLayoutParams.topMargin;
        int i10 = -vp0Var.M;
        if (i3 != i10 || marginLayoutParams.bottomMargin != (-vp0Var.N)) {
            marginLayoutParams.topMargin = i10;
            marginLayoutParams.bottomMargin = -vp0Var.N;
            h4Var.setLayoutParams(marginLayoutParams);
        }
        h4Var.setPadding(org.telegram.messenger.g0.L(9.0f), vp0Var.M + vp0Var.L, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(86.0f) + vp0Var.N);
    }

    public float getTabsHeight() {
        h4 h4Var = this.f;
        float y9 = h4Var.getY();
        for (int i3 = 0; i3 < h4Var.getChildCount(); i3++) {
            View childAt = h4Var.getChildAt(i3);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof q2) {
                if (R == 0) {
                    return Math.max(0.0f, childAt.getY() + y9);
                }
            } else if (R == 0) {
                return Math.max(0.0f, (childAt.getAlpha() * childAt.getHeight()) + childAt.getY() + y9);
            }
        }
        return 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.b).c(this, hs.G3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.b).n(this, hs.G3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        setVisibleHeight(this.n);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        h4 h4Var = this.f;
        boolean canScrollVertically = h4Var.canScrollVertically(-1);
        h4Var.g3.O(true);
        if (!canScrollVertically) {
            h4Var.v0(0);
        }
        this.a.p();
    }

    public void setVisibleHeight(int i3) {
        this.n = i3;
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(i3, org.telegram.messenger.g0.L(150.0f), org.telegram.messenger.g0.L(220.0f)));
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
