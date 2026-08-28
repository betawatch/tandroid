package fh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import gh.n7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout A;
    public final TextView B;
    public final TextView C;
    public final kh.d D;
    public boolean E;
    public final vq0 a;
    public final int b;
    public final org.telegram.ui.ActionBar.b6 c;
    public boolean d;
    public n7 e;
    public final s3 f;
    public ig.k h;
    public boolean n;
    public int r;
    public final FrameLayout s;
    public final LinearLayout v;
    public final TextView w;
    public final TextView x;
    public final FrameLayout y;

    public y3(vq0 vq0Var, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(vq0Var.getContext());
        this.r = AndroidUtilities.displaySize.y;
        Context context = vq0Var.getContext();
        this.a = vq0Var;
        this.b = i9;
        this.c = b6Var;
        s3 s3Var = new s3(context, i9, new bh.c(this, 9), new q3(this), new q3(this), b6Var, vq0Var);
        this.f = s3Var;
        s3Var.U2.r = false;
        s3Var.setSelectorType(9);
        s3Var.setSelectorDrawableColor(0);
        s3Var.setPadding(AndroidUtilities.dp(9.0f), vq0Var.G, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        s3Var.setClipToPadding(false);
        s3Var.setClipChildren(false);
        addView(s3Var, g7.e6.e(-1, -1, 119));
        s3Var.j(new eh.n(1, this, vq0Var));
        t3 t3Var = new t3(vq0Var);
        t3Var.m = false;
        t3Var.C = false;
        t3Var.o(gr.h);
        t3Var.n(350L);
        s3Var.setItemAnimator(t3Var);
        new f2.h0(new u3(this, vq0Var)).d(s3Var);
        View view = this.s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.y;
        if (view2 != null) {
            removeView(view2);
        }
        if (vq0Var.d != this.e) {
            this.s = null;
            this.w = null;
            this.x = null;
            this.v = null;
            this.y = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.A = linearLayout;
            linearLayout.setOrientation(1);
            this.y.addView(this.A, g7.e6.e(-2, -2, 17));
            TextView textView = new TextView(getContext());
            this.B = textView;
            textView.setTextSize(1, 20.0f);
            this.B.setTypeface(AndroidUtilities.bold());
            this.B.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
            this.B.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
            this.A.addView(this.B, g7.e6.t(-2, -2, 1, 0, 0, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.C = textView2;
            textView2.setTextSize(1, 14.0f);
            this.C.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.y6, b6Var));
            this.C.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
            this.A.addView(this.C, g7.e6.t(-2, -2, 1, 0, 10, 0, 0));
            kh.d dVar = new kh.d(getContext(), b6Var, true);
            this.D = dVar;
            dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
            this.A.addView(this.D, g7.e6.t(200, 44, 1, 0, 19, 0, 12));
            final int i10 = 1;
            this.D.setOnClickListener(new View.OnClickListener(this) { // from class: fh.n3
                public final /* synthetic */ y3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i10) {
                        case 0:
                            n7 n7Var = this.b.e;
                            if (n7Var != null) {
                                if (!n7Var.e || n7Var.g != 783) {
                                    n7Var.g = 783;
                                    n7Var.e = true;
                                    n7Var.i(true);
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
            addView(this.y, g7.e6.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
            s3Var.setEmptyView(this.y);
            LinearLayout linearLayout2 = this.A;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(vq0Var.e.h() ? 0 : 8);
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
        this.s.addView(this.v, g7.e6.e(-2, -2, 17));
        o9 o9Var = new o9(getContext());
        o9Var.setImageDrawable(new mi0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), "utyan_empty", AndroidUtilities.dp(120.0f)));
        this.v.addView(o9Var, g7.e6.t(120, 120, 1, 0, 0, 0, 0));
        TextView textView3 = new TextView(getContext());
        this.w = textView3;
        textView3.setTextSize(1, 17.0f);
        this.w.setTypeface(AndroidUtilities.bold());
        this.w.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        this.w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
        this.v.addView(this.w, g7.e6.t(-2, -2, 1, 0, 12, 0, 0));
        TextView textView4 = new TextView(getContext());
        this.x = textView4;
        textView4.setTextSize(1, 14.0f);
        TextView textView5 = this.x;
        int i11 = org.telegram.ui.ActionBar.f6.Oh;
        textView5.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        this.x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
        final int i12 = 0;
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: fh.n3
            public final /* synthetic */ y3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i12) {
                    case 0:
                        n7 n7Var = this.b.e;
                        if (n7Var != null) {
                            if (!n7Var.e || n7Var.g != 783) {
                                n7Var.g = 783;
                                n7Var.e = true;
                                n7Var.i(true);
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
        this.x.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(i11, b6Var)), 4, 4));
        g7.g6.a(this.x);
        this.v.addView(this.x, g7.e6.t(-2, -2, 1, 0, 8, 0, 0));
        addView(this.s, g7.e6.e(-1, -1, 119));
        s3Var.setEmptyView(this.s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReordering(boolean z10) {
        s3 s3Var;
        if (this.n == z10) {
            return;
        }
        this.n = z10;
        vq0 vq0Var = this.a;
        vq0Var.p(vq0Var.g());
        int i9 = 0;
        while (true) {
            s3Var = this.f;
            if (i9 >= s3Var.getChildCount()) {
                break;
            }
            View childAt = s3Var.getChildAt(i9);
            if (childAt instanceof f2) {
                ((f2) childAt).d(z10, true);
            }
            i9++;
        }
        z41 z41Var = s3Var.U2;
        if (z41Var != null) {
            z41Var.S();
        }
        if (z10) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new q2(profileActivity, 1));
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.e) {
            f(true);
            if (this.e == null || !isAttachedToWindow()) {
                return;
            }
            s3 s3Var = this.f;
            if (s3Var.canScrollVertically(1)) {
                for (int i11 = 0; i11 < s3Var.getChildCount(); i11++) {
                    if (!(s3Var.getChildAt(i11) instanceof e00)) {
                    }
                }
                return;
            }
            this.e.a();
        }
    }

    public final void e() {
        if (this.n) {
            n7 n7Var = this.e;
            if (n7Var != null) {
                n7Var.l();
            }
            setReordering(false);
        }
    }

    public final void f(boolean z10) {
        z41 z41Var;
        s3 s3Var = this.f;
        if (s3Var == null || (z41Var = s3Var.U2) == null) {
            return;
        }
        boolean canScrollVertically = s3Var.canScrollVertically(-1);
        z41Var.N(z10);
        if (canScrollVertically) {
            return;
        }
        s3Var.u0(0);
    }

    public float getTabsHeight() {
        int i9 = 0;
        while (true) {
            s3 s3Var = this.f;
            if (i9 >= s3Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = s3Var.getChildAt(i9);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof f2) {
                if (R == 0) {
                    return Math.max(0.0f, childAt.getY());
                }
            } else if (R == 0) {
                return Math.max(0.0f, (childAt.getAlpha() * childAt.getHeight()) + childAt.getY());
            }
            i9++;
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        setVisibleHeight(this.r);
    }

    public void setHasTabs(boolean z10) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        s3 s3Var = this.f;
        boolean canScrollVertically = s3Var.canScrollVertically(-1);
        s3Var.U2.N(true);
        if (!canScrollVertically) {
            s3Var.u0(0);
        }
        this.a.o();
    }

    public void setVisibleHeight(int i9) {
        this.r = i9;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i9, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
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
