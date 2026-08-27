package gh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import hh.m7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout A;
    public final TextView B;
    public final TextView C;
    public final lh.d D;
    public boolean E;
    public final wq0 a;
    public final int b;
    public final org.telegram.ui.ActionBar.c6 c;
    public boolean d;
    public m7 e;
    public final n3 f;
    public jg.k h;
    public boolean n;
    public int r;
    public final FrameLayout s;
    public final LinearLayout v;
    public final TextView w;
    public final TextView x;
    public final FrameLayout y;

    public t3(wq0 wq0Var, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(wq0Var.getContext());
        this.r = AndroidUtilities.displaySize.y;
        Context context = wq0Var.getContext();
        this.a = wq0Var;
        this.b = i10;
        this.c = c6Var;
        n3 n3Var = new n3(context, i10, new ch.c(this, 9), new l3(this), new l3(this), c6Var, wq0Var);
        this.f = n3Var;
        n3Var.U2.r = false;
        n3Var.setSelectorType(9);
        n3Var.setSelectorDrawableColor(0);
        n3Var.setPadding(AndroidUtilities.dp(9.0f), wq0Var.G, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        n3Var.setClipToPadding(false);
        n3Var.setClipChildren(false);
        addView(n3Var, h7.z5.e(-1, -1, 119));
        n3Var.j(new fh.l(1, this, wq0Var));
        o3 o3Var = new o3(wq0Var);
        o3Var.m = false;
        o3Var.C = false;
        o3Var.o(er.h);
        o3Var.n(350L);
        n3Var.setItemAnimator(o3Var);
        new f2.f0(new p3(this, wq0Var)).d(n3Var);
        View view = this.s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.y;
        if (view2 != null) {
            removeView(view2);
        }
        if (wq0Var.d != this.e) {
            this.s = null;
            this.w = null;
            this.x = null;
            this.v = null;
            this.y = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.A = linearLayout;
            linearLayout.setOrientation(1);
            this.y.addView(this.A, h7.z5.e(-2, -2, 17));
            TextView textView = new TextView(getContext());
            this.B = textView;
            textView.setTextSize(1, 20.0f);
            this.B.setTypeface(AndroidUtilities.bold());
            this.B.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            this.B.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
            this.A.addView(this.B, h7.z5.t(-2, -2, 1, 0, 0, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.C = textView2;
            textView2.setTextSize(1, 14.0f);
            this.C.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y6, c6Var));
            this.C.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
            this.A.addView(this.C, h7.z5.t(-2, -2, 1, 0, 10, 0, 0));
            lh.d dVar = new lh.d(getContext(), c6Var, true);
            this.D = dVar;
            dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
            this.A.addView(this.D, h7.z5.t(200, 44, 1, 0, 19, 0, 12));
            final int i11 = 1;
            this.D.setOnClickListener(new View.OnClickListener(this) { // from class: gh.i3
                public final /* synthetic */ t3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i11) {
                        case 0:
                            m7 m7Var = this.b.e;
                            if (m7Var != null) {
                                if (!m7Var.e || m7Var.g != 783) {
                                    m7Var.g = 783;
                                    m7Var.e = true;
                                    m7Var.i(true);
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
            addView(this.y, h7.z5.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
            n3Var.setEmptyView(this.y);
            LinearLayout linearLayout2 = this.A;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(wq0Var.e.h() ? 0 : 8);
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
        this.s.addView(this.v, h7.z5.e(-2, -2, 17));
        n9 n9Var = new n9(getContext());
        n9Var.setImageDrawable(new oi0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), "utyan_empty", AndroidUtilities.dp(120.0f)));
        this.v.addView(n9Var, h7.z5.t(120, 120, 1, 0, 0, 0, 0));
        TextView textView3 = new TextView(getContext());
        this.w = textView3;
        textView3.setTextSize(1, 17.0f);
        this.w.setTypeface(AndroidUtilities.bold());
        this.w.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        this.w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
        this.v.addView(this.w, h7.z5.t(-2, -2, 1, 0, 12, 0, 0));
        TextView textView4 = new TextView(getContext());
        this.x = textView4;
        textView4.setTextSize(1, 14.0f);
        TextView textView5 = this.x;
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        textView5.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        this.x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
        final int i13 = 0;
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: gh.i3
            public final /* synthetic */ t3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i13) {
                    case 0:
                        m7 m7Var = this.b.e;
                        if (m7Var != null) {
                            if (!m7Var.e || m7Var.g != 783) {
                                m7Var.g = 783;
                                m7Var.e = true;
                                m7Var.i(true);
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
        this.x.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(i12, c6Var)), 4, 4));
        h7.b6.a(this.x);
        this.v.addView(this.x, h7.z5.t(-2, -2, 1, 0, 8, 0, 0));
        addView(this.s, h7.z5.e(-1, -1, 119));
        n3Var.setEmptyView(this.s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReordering(boolean z10) {
        n3 n3Var;
        if (this.n == z10) {
            return;
        }
        this.n = z10;
        wq0 wq0Var = this.a;
        wq0Var.p(wq0Var.g());
        int i10 = 0;
        while (true) {
            n3Var = this.f;
            if (i10 >= n3Var.getChildCount()) {
                break;
            }
            View childAt = n3Var.getChildAt(i10);
            if (childAt instanceof b2) {
                ((b2) childAt).d(z10, true);
            }
            i10++;
        }
        b51 b51Var = n3Var.U2;
        if (b51Var != null) {
            b51Var.S();
        }
        if (z10) {
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new l2(profileActivity, 1));
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
            n3 n3Var = this.f;
            if (n3Var.canScrollVertically(1)) {
                for (int i12 = 0; i12 < n3Var.getChildCount(); i12++) {
                    if (!(n3Var.getChildAt(i12) instanceof h00)) {
                    }
                }
                return;
            }
            this.e.a();
        }
    }

    public final void e() {
        if (this.n) {
            m7 m7Var = this.e;
            if (m7Var != null) {
                m7Var.l();
            }
            setReordering(false);
        }
    }

    public final void f(boolean z10) {
        b51 b51Var;
        n3 n3Var = this.f;
        if (n3Var == null || (b51Var = n3Var.U2) == null) {
            return;
        }
        boolean canScrollVertically = n3Var.canScrollVertically(-1);
        b51Var.N(z10);
        if (canScrollVertically) {
            return;
        }
        n3Var.u0(0);
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            n3 n3Var = this.f;
            if (i10 >= n3Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = n3Var.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof b2) {
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
        n3 n3Var = this.f;
        boolean canScrollVertically = n3Var.canScrollVertically(-1);
        n3Var.U2.N(true);
        if (!canScrollVertically) {
            n3Var.u0(0);
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
