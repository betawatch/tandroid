package ih;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import i7.h6;
import jh.k7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout A;
    public final TextView B;
    public final TextView C;
    public final nh.d D;
    public boolean E;
    public final gr0 a;
    public final int b;
    public final org.telegram.ui.ActionBar.c6 c;
    public boolean d;
    public k7 e;
    public final h3 f;
    public lg.k h;
    public boolean n;
    public int r;
    public final FrameLayout s;
    public final LinearLayout v;
    public final TextView w;
    public final TextView x;
    public final FrameLayout y;

    public n3(gr0 gr0Var, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(gr0Var.getContext());
        this.r = AndroidUtilities.displaySize.y;
        Context context = gr0Var.getContext();
        this.a = gr0Var;
        this.b = i10;
        this.c = c6Var;
        h3 h3Var = new h3(context, i10, new bg.t1(this, 10), new f3(this), new f3(this), c6Var, gr0Var);
        this.f = h3Var;
        h3Var.U2.r = false;
        h3Var.setSelectorType(9);
        h3Var.setSelectorDrawableColor(0);
        h3Var.setPadding(AndroidUtilities.dp(9.0f), gr0Var.G, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        h3Var.setClipToPadding(false);
        h3Var.setClipChildren(false);
        addView(h3Var, i7.f6.e(-1, -1, 119));
        h3Var.j(new hh.l(1, this, gr0Var));
        i3 i3Var = new i3(gr0Var);
        i3Var.m = false;
        i3Var.C = false;
        i3Var.o(jr.h);
        i3Var.n(350L);
        h3Var.setItemAnimator(i3Var);
        new f2.e0(new j3(this, gr0Var)).d(h3Var);
        View view = this.s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.y;
        if (view2 != null) {
            removeView(view2);
        }
        if (gr0Var.d != this.e) {
            this.s = null;
            this.w = null;
            this.x = null;
            this.v = null;
            this.y = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.A = linearLayout;
            linearLayout.setOrientation(1);
            this.y.addView(this.A, i7.f6.e(-2, -2, 17));
            TextView textView = new TextView(getContext());
            this.B = textView;
            textView.setTextSize(1, 20.0f);
            this.B.setTypeface(AndroidUtilities.bold());
            this.B.setTextColor(g6.v0(g6.G6, c6Var));
            this.B.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
            this.A.addView(this.B, i7.f6.t(-2, -2, 1, 0, 0, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.C = textView2;
            textView2.setTextSize(1, 14.0f);
            this.C.setTextColor(g6.v0(g6.y6, c6Var));
            this.C.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
            this.A.addView(this.C, i7.f6.t(-2, -2, 1, 0, 10, 0, 0));
            nh.d dVar = new nh.d(getContext(), c6Var, true);
            this.D = dVar;
            dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
            this.A.addView(this.D, i7.f6.t(200, 44, 1, 0, 19, 0, 12));
            final int i11 = 1;
            this.D.setOnClickListener(new View.OnClickListener(this) { // from class: ih.c3
                public final /* synthetic */ n3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i11) {
                        case 0:
                            k7 k7Var = this.b.e;
                            if (k7Var != null) {
                                if (!k7Var.e || k7Var.g != 783) {
                                    k7Var.g = 783;
                                    k7Var.e = true;
                                    k7Var.i(true);
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
            addView(this.y, i7.f6.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
            h3Var.setEmptyView(this.y);
            LinearLayout linearLayout2 = this.A;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(gr0Var.e.h() ? 0 : 8);
                return;
            }
            return;
        }
        this.y = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.A = null;
        this.s = new FrameLayout(getContext());
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        this.v = linearLayout3;
        linearLayout3.setOrientation(1);
        this.s.addView(this.v, i7.f6.e(-2, -2, 17));
        t9 t9Var = new t9(getContext());
        t9Var.setImageDrawable(new xi0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), "utyan_empty", AndroidUtilities.dp(120.0f)));
        this.v.addView(t9Var, i7.f6.t(120, 120, 1, 0, 0, 0, 0));
        TextView textView3 = new TextView(getContext());
        this.w = textView3;
        textView3.setTextSize(1, 17.0f);
        this.w.setTypeface(AndroidUtilities.bold());
        this.w.setTextColor(g6.v0(g6.G6, c6Var));
        this.w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
        this.v.addView(this.w, i7.f6.t(-2, -2, 1, 0, 12, 0, 0));
        TextView textView4 = new TextView(getContext());
        this.x = textView4;
        textView4.setTextSize(1, 14.0f);
        TextView textView5 = this.x;
        int i12 = g6.Oh;
        textView5.setTextColor(g6.v0(i12, c6Var));
        this.x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
        final int i13 = 0;
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: ih.c3
            public final /* synthetic */ n3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i13) {
                    case 0:
                        k7 k7Var = this.b.e;
                        if (k7Var != null) {
                            if (!k7Var.e || k7Var.g != 783) {
                                k7Var.g = 783;
                                k7Var.e = true;
                                k7Var.i(true);
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
        this.x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
        this.x.setBackground(g6.Y(g6.l1(0.1f, g6.v0(i12, c6Var)), 4, 4));
        h6.a(this.x);
        this.v.addView(this.x, i7.f6.t(-2, -2, 1, 0, 8, 0, 0));
        addView(this.s, i7.f6.e(-1, -1, 119));
        h3Var.setEmptyView(this.s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReordering(boolean z10) {
        h3 h3Var;
        if (this.n == z10) {
            return;
        }
        this.n = z10;
        gr0 gr0Var = this.a;
        gr0Var.p(gr0Var.g());
        int i10 = 0;
        while (true) {
            h3Var = this.f;
            if (i10 >= h3Var.getChildCount()) {
                break;
            }
            View childAt = h3Var.getChildAt(i10);
            if (childAt instanceof y1) {
                ((y1) childAt).d(z10, true);
            }
            i10++;
        }
        k51 k51Var = h3Var.U2;
        if (k51Var != null) {
            k51Var.S();
        }
        if (z10) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new i2(profileActivity, 1));
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.e) {
            f(true);
            if (this.e == null || !isAttachedToWindow()) {
                return;
            }
            h3 h3Var = this.f;
            if (h3Var.canScrollVertically(1)) {
                for (int i12 = 0; i12 < h3Var.getChildCount(); i12++) {
                    if (!(h3Var.getChildAt(i12) instanceof p00)) {
                    }
                }
                return;
            }
            this.e.a();
        }
    }

    public final void e() {
        if (this.n) {
            k7 k7Var = this.e;
            if (k7Var != null) {
                k7Var.l();
            }
            setReordering(false);
        }
    }

    public final void f(boolean z10) {
        k51 k51Var;
        h3 h3Var = this.f;
        if (h3Var == null || (k51Var = h3Var.U2) == null) {
            return;
        }
        boolean canScrollVertically = h3Var.canScrollVertically(-1);
        k51Var.N(z10);
        if (canScrollVertically) {
            return;
        }
        h3Var.u0(0);
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            h3 h3Var = this.f;
            if (i10 >= h3Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = h3Var.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof y1) {
                if (R == 0) {
                    return Math.max(0.0f, childAt.getY());
                }
            } else if (R == 0) {
                return Math.max(0.0f, (childAt.getAlpha() * childAt.getHeight()) + childAt.getY());
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.r);
    }

    public void setHasTabs(boolean z10) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        h3 h3Var = this.f;
        boolean canScrollVertically = h3Var.canScrollVertically(-1);
        h3Var.U2.N(true);
        if (!canScrollVertically) {
            h3Var.u0(0);
        }
        this.a.o();
    }

    public void setVisibleHeight(int i10) {
        this.r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.A;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.A.setScaleX(lerp);
            this.A.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.r)) / 2.0f);
        }
    }
}
