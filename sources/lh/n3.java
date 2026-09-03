package lh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import mh.l7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class n3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout B;
    public final TextView C;
    public final TextView D;
    public final qh.d E;
    public boolean F;
    public final or0 a;
    public final int b;
    public final g6 c;
    public boolean d;
    public l7 e;
    public final h3 f;
    public og.k h;
    public boolean n;
    public int r;
    public final FrameLayout s;
    public final LinearLayout v;
    public final TextView w;
    public final TextView x;
    public final FrameLayout y;

    public n3(or0 or0Var, int i10, g6 g6Var) {
        super(or0Var.getContext());
        this.r = AndroidUtilities.displaySize.y;
        Context context = or0Var.getContext();
        this.a = or0Var;
        this.b = i10;
        this.c = g6Var;
        h3 h3Var = new h3(context, i10, new eg.p1(this, 10), new f3(this), new f3(this), g6Var, or0Var);
        this.f = h3Var;
        h3Var.V2.r = false;
        h3Var.setSelectorType(9);
        h3Var.setSelectorDrawableColor(0);
        h3Var.setPadding(AndroidUtilities.dp(9.0f), or0Var.H, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        h3Var.setClipToPadding(false);
        h3Var.setClipChildren(false);
        addView(h3Var, k7.c6.e(-1, -1, 119));
        h3Var.j(new kh.l(1, this, or0Var));
        i3 i3Var = new i3(or0Var);
        i3Var.m = false;
        i3Var.C = false;
        i3Var.o(pr.h);
        i3Var.n(350L);
        h3Var.setItemAnimator(i3Var);
        new f2.f0(new j3(this, or0Var)).d(h3Var);
        View view = this.s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.y;
        if (view2 != null) {
            removeView(view2);
        }
        if (or0Var.d != this.e) {
            this.s = null;
            this.w = null;
            this.x = null;
            this.v = null;
            this.y = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.B = linearLayout;
            linearLayout.setOrientation(1);
            this.y.addView(this.B, k7.c6.e(-2, -2, 17));
            TextView textView = new TextView(getContext());
            this.C = textView;
            textView.setTextSize(1, 20.0f);
            this.C.setTypeface(AndroidUtilities.bold());
            this.C.setTextColor(k6.v0(k6.G6, g6Var));
            this.C.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
            this.B.addView(this.C, k7.c6.t(-2, -2, 1, 0, 0, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.D = textView2;
            textView2.setTextSize(1, 14.0f);
            this.D.setTextColor(k6.v0(k6.y6, g6Var));
            this.D.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
            this.B.addView(this.D, k7.c6.t(-2, -2, 1, 0, 10, 0, 0));
            qh.d dVar = new qh.d(getContext(), g6Var, true);
            this.E = dVar;
            dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
            this.B.addView(this.E, k7.c6.t(200, 44, 1, 0, 19, 0, 12));
            final int i11 = 1;
            this.E.setOnClickListener(new View.OnClickListener(this) { // from class: lh.b3
                public final /* synthetic */ n3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i11) {
                        case 0:
                            l7 l7Var = this.b.e;
                            if (l7Var != null) {
                                if (!l7Var.e || l7Var.g != 783) {
                                    l7Var.g = 783;
                                    l7Var.e = true;
                                    l7Var.i(true);
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
            addView(this.y, k7.c6.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
            h3Var.setEmptyView(this.y);
            LinearLayout linearLayout2 = this.B;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(or0Var.e.h() ? 0 : 8);
                return;
            }
            return;
        }
        this.y = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.B = null;
        this.s = new FrameLayout(getContext());
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        this.v = linearLayout3;
        linearLayout3.setOrientation(1);
        this.s.addView(this.v, k7.c6.e(-2, -2, 17));
        p9 p9Var = new p9(getContext());
        p9Var.setImageDrawable(new hj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        this.v.addView(p9Var, k7.c6.t(120, 120, 1, 0, 0, 0, 0));
        TextView textView3 = new TextView(getContext());
        this.w = textView3;
        textView3.setTextSize(1, 17.0f);
        this.w.setTypeface(AndroidUtilities.bold());
        this.w.setTextColor(k6.v0(k6.G6, g6Var));
        this.w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
        this.v.addView(this.w, k7.c6.t(-2, -2, 1, 0, 12, 0, 0));
        TextView textView4 = new TextView(getContext());
        this.x = textView4;
        textView4.setTextSize(1, 14.0f);
        TextView textView5 = this.x;
        int i12 = k6.Oh;
        textView5.setTextColor(k6.v0(i12, g6Var));
        this.x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
        final int i13 = 0;
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: lh.b3
            public final /* synthetic */ n3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i13) {
                    case 0:
                        l7 l7Var = this.b.e;
                        if (l7Var != null) {
                            if (!l7Var.e || l7Var.g != 783) {
                                l7Var.g = 783;
                                l7Var.e = true;
                                l7Var.i(true);
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
        this.x.setBackground(k6.Y(k6.l1(0.1f, k6.v0(i12, g6Var)), 4, 4));
        k7.e6.a(this.x);
        this.v.addView(this.x, k7.c6.t(-2, -2, 1, 0, 8, 0, 0));
        addView(this.s, k7.c6.e(-1, -1, 119));
        h3Var.setEmptyView(this.s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReordering(boolean z4) {
        h3 h3Var;
        if (this.n == z4) {
            return;
        }
        this.n = z4;
        or0 or0Var = this.a;
        or0Var.p(or0Var.g());
        int i10 = 0;
        while (true) {
            h3Var = this.f;
            if (i10 >= h3Var.getChildCount()) {
                break;
            }
            View childAt = h3Var.getChildAt(i10);
            if (childAt instanceof x1) {
                ((x1) childAt).d(z4, true);
            }
            i10++;
        }
        w51 w51Var = h3Var.V2;
        if (w51Var != null) {
            w51Var.S();
        }
        if (z4) {
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new h2(profileActivity, 1));
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
                    if (!(h3Var.getChildAt(i12) instanceof u00)) {
                    }
                }
                return;
            }
            this.e.a();
        }
    }

    public final void e() {
        if (this.n) {
            l7 l7Var = this.e;
            if (l7Var != null) {
                l7Var.l();
            }
            setReordering(false);
        }
    }

    public final void f(boolean z4) {
        w51 w51Var;
        h3 h3Var = this.f;
        if (h3Var == null || (w51Var = h3Var.V2) == null) {
            return;
        }
        boolean canScrollVertically = h3Var.canScrollVertically(-1);
        w51Var.N(z4);
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
            if (childAt instanceof x1) {
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

    public void setHasTabs(boolean z4) {
        if (this.F == z4) {
            return;
        }
        this.F = z4;
        h3 h3Var = this.f;
        boolean canScrollVertically = h3Var.canScrollVertically(-1);
        h3Var.V2.N(true);
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
        LinearLayout linearLayout2 = this.B;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.B.setScaleX(lerp);
            this.B.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.r)) / 2.0f);
        }
    }
}
