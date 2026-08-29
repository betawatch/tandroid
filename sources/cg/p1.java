package cg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import bg.c3;
import bg.x2;
import i7.f6;
import java.util.ArrayList;
import jh.h5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.pa;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.fw0;
import org.telegram.ui.gw0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p1 extends f3 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean A;
    public boolean B;
    public int C;
    public int D;
    public float E;
    public final gw0 F;
    public int G;
    public int H;
    public int I;
    public m1 J;
    public final org.telegram.ui.ActionBar.o2 b;
    public final d1 c;
    public final ArrayList d;
    public float e;
    public float f;
    public boolean h;
    public final j1 n;
    public final bg.d1 r;
    public int s;
    public final FrameLayout v;
    public boolean w;
    public final SvgHelper.SvgDrawable x;
    public final int y;

    public p1(Context context, int i10, c6 c6Var) {
        this(null, context, UserConfig.selectedAccount, false, i10, true, null, c6Var);
    }

    public final ViewGroup A(Context context, int i10) {
        fw0 fw0Var = (fw0) this.d.get(i10);
        int i11 = fw0Var.a;
        if (i11 == 0) {
            c cVar = new c(context, this.resourcesProvider);
            cVar.b.setOnScrollListener(new g1(this, 1));
            return cVar;
        }
        if (i11 == 14 || i11 == 28) {
            m mVar = new m(context, i11 == 28 ? 1 : 0, this.resourcesProvider);
            mVar.b.setOnScrollListener(new g1(this, 0));
            return mVar;
        }
        if (i11 == 5) {
            return new h1(context, this.currentAccount);
        }
        if (i11 == 10) {
            return new a1(context, this.resourcesProvider);
        }
        return new w2(context, this.x, this.currentAccount, fw0Var.a, this.resourcesProvider);
    }

    public final void B() {
        boolean z10 = this.B;
        d1 d1Var = this.c;
        if (z10) {
            d1Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
            return;
        }
        if (!this.A) {
            d1Var.d.setText(PremiumPreviewFragment.o0(this.currentAccount, this.F));
            return;
        }
        int i10 = this.y;
        if (i10 == 4) {
            d1Var.d.setText(LocaleController.getString(R.string.UnlockPremiumReactions));
            d1Var.setIcon(R.raw.unlock_icon);
        } else if (i10 != 10) {
            d1Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
        } else {
            d1Var.d.setText(LocaleController.getString(R.string.UnlockPremiumIcons));
            d1Var.setIcon(R.raw.unlock_icon);
        }
    }

    public final void C() {
        this.B = true;
        d1 d1Var = this.c;
        d1Var.h = false;
        d1Var.d(true);
        B();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        int i10 = 0;
        while (true) {
            j1 j1Var = this.n;
            if (i10 >= j1Var.getChildCount()) {
                return true;
            }
            o1 o1Var = (o1) j1Var.getChildAt(i10);
            if (o1Var.a == this.C) {
                if (o1Var.f instanceof b) {
                    return !((b) r1).b.canScrollVertically(-1);
                }
            }
            i10++;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.billingProductDetailsUpdated || i10 == NotificationCenter.premiumPromoUpdated) {
            B();
            return;
        }
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            boolean isPremium = UserConfig.getInstance(this.currentAccount).isPremium();
            d1 d1Var = this.c;
            if (isPremium) {
                d1Var.c(LocaleController.getString(R.string.OK), false, true);
            } else {
                d1Var.h = false;
                d1Var.d(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 16);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        m1 m1Var = new m1(this, getContext(), 0);
        this.J = m1Var;
        m1Var.setBackgroundColor(getThemedColor(g6.h5));
        this.J.setTitleColor(getThemedColor(g6.G6));
        this.J.B(getThemedColor(g6.z8), false);
        m1 m1Var2 = this.J;
        int i10 = g6.y8;
        m1Var2.C(getThemedColor(i10), false);
        this.J.C(getThemedColor(i10), true);
        this.J.setCastShadows(true);
        this.J.setExtraHeight(AndroidUtilities.dp(2.0f));
        this.J.setBackButtonImage(R.drawable.ic_ab_back);
        this.J.setActionBarMenuOnItemClick(new n1(this, 0));
        this.containerView.addView(this.J, f6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.J.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.J, false, 1.0f, false);
        int i11 = this.C;
        ArrayList arrayList = this.d;
        if (((fw0) arrayList.get(i11)).a == 14) {
            this.J.setTitle(LocaleController.getString(R.string.UpgradedStories));
            this.J.requestLayout();
        } else if (((fw0) arrayList.get(this.C)).a == 28) {
            this.J.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            this.J.requestLayout();
        } else if (((fw0) arrayList.get(this.C)).a == 40) {
            this.J.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            this.J.requestLayout();
        } else {
            this.J.setTitle(LocaleController.getString(R.string.DoubledLimits));
            this.J.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomOpenAnimation() {
        j1 j1Var = this.n;
        if (j1Var.getChildCount() > 0) {
            ViewGroup viewGroup = ((o1) j1Var.getChildAt(0)).f;
            if (viewGroup instanceof a1) {
                a1 a1Var = (a1) viewGroup;
                int i10 = 1;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(r0.getMeasuredWidth(), 0.0f);
                a1Var.setOffset(r0.getMeasuredWidth());
                this.w = true;
                ofFloat.addUpdateListener(new c1(a1Var, i10));
                ofFloat.addListener(new c3(i10, this, a1Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(jr.h);
                ofFloat.start();
            }
        }
        return super.onCustomOpenAnimation();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 16);
    }

    public final void y() {
        j1 j1Var;
        View m10;
        View m11;
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            j1Var = this.n;
            if (i12 >= j1Var.getChildCount()) {
                break;
            }
            o1 o1Var = (o1) j1Var.getChildAt(i12);
            int i13 = o1Var.a;
            ViewGroup viewGroup = o1Var.f;
            if (i13 == this.C && (viewGroup instanceof b) && ((m11 = ((b) viewGroup).c.m(0)) == null || (i10 = m11.getTop()) < 0)) {
                i10 = 0;
            }
            if (o1Var.a == this.D && (viewGroup instanceof b) && ((m10 = ((b) viewGroup).c.m(0)) == null || (i11 = m10.getTop()) < 0)) {
                i11 = 0;
            }
            i12++;
        }
        int i14 = this.H;
        if (i10 >= 0) {
            float f9 = 1.0f - this.E;
            i14 = Math.min(i14, (int) com.google.android.recaptcha.internal.a.z(1.0f, f9, i14, i10 * f9));
        }
        if (i11 >= 0) {
            float f10 = this.E;
            i14 = Math.min(i14, (int) com.google.android.recaptcha.internal.a.z(1.0f, f10, this.H, i11 * f10));
        }
        float f11 = 1.0f - this.f;
        FrameLayout frameLayout = this.v;
        frameLayout.setAlpha(f11);
        if (this.e == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z10 = this.h;
        bg.d1 d1Var = this.r;
        d1Var.setTranslationX((z10 ? d1Var.getMeasuredWidth() : -d1Var.getMeasuredWidth()) * this.f);
        if (i14 != this.I) {
            this.I = i14;
            for (int i15 = 0; i15 < j1Var.getChildCount(); i15++) {
                if (!((o1) j1Var.getChildAt(i15)).h) {
                    j1Var.getChildAt(i15).setTranslationY(this.I);
                }
            }
            d1Var.setTranslationY(this.I);
            frameLayout.setTranslationY(this.I);
            this.containerView.invalidate();
            AndroidUtilities.updateViewVisibilityAnimated(this.J, this.I < AndroidUtilities.dp(this.y == 40 ? 5.0f : 30.0f), 1.0f, true);
        }
    }

    public p1(org.telegram.ui.ActionBar.o2 o2Var, int i10, boolean z10) {
        this(o2Var, o2Var.getContext(), o2Var.getCurrentAccount(), false, i10, z10, null);
    }

    public p1(org.telegram.ui.ActionBar.o2 o2Var, Context context, int i10, int i11, boolean z10) {
        this(o2Var, context, i10, false, i11, z10, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p1(org.telegram.ui.ActionBar.o2 o2Var, Context context, int i10, boolean z10, int i11, boolean z11, gw0 gw0Var) {
        this(o2Var, context, i10, z10, i11, z11, gw0Var, r0);
        c6 c6Var;
        if (o2Var == null) {
            c6Var = null;
        } else if (o2Var.getLastStoryViewer() != null && !o2Var.getLastStoryViewer().D0) {
            c6Var = o2Var.getLastStoryViewer().y;
        } else {
            c6Var = o2Var.getResourceProvider();
        }
    }

    public p1(org.telegram.ui.ActionBar.o2 o2Var, Context context, int i10, boolean z10, int i11, boolean z11, gw0 gw0Var, c6 c6Var) {
        super(context, c6Var, false, false);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.G = 255;
        this.b = o2Var;
        this.F = gw0Var;
        fixNavigationBar(getThemedColor(g6.h5));
        this.y = i11;
        this.A = z11;
        this.x = SvgHelper.getDrawable(AndroidUtilities.readRes(R.raw.star_loader));
        x2 x2Var = new x2(this, getContext(), 4);
        if (!z10 && i11 != 35) {
            PremiumPreviewFragment.n0(i10, arrayList);
        } else {
            PremiumPreviewFragment.m0(i10, arrayList, false);
            PremiumPreviewFragment.m0(i10, arrayList, true);
        }
        if (i11 == 40) {
            arrayList.clear();
            arrayList.add(new fw0(40, R.drawable.gift, LocaleController.getString(R.string.FeaturePreviewGifts), LocaleController.getString(R.string.FeaturePreviewGiftsDescription)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.d.size()) {
                i12 = 0;
                break;
            } else if (((fw0) this.d.get(i12)).a == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (z11) {
            fw0 fw0Var = (fw0) this.d.get(i12);
            this.d.clear();
            this.d.add(fw0Var);
            i12 = 0;
        }
        fw0 fw0Var2 = (fw0) this.d.get(i12);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        r1 r1Var = new r1(g6.ak, g6.bk, g6.ck, -1, null);
        r1Var.o = 1.1f;
        r1Var.p = 1.5f;
        r1Var.q = -0.2f;
        r1Var.m = true;
        bg.d1 d1Var = new bg.d1(this, getContext(), r1Var, 1);
        this.r = d1Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v = frameLayout;
        frameLayout.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int dp = AndroidUtilities.dp(12.0f);
        int k9 = i0.a.k(-1, 40);
        int k10 = i0.a.k(-1, 100);
        imageView.setBackground(g6.i0(dp, dp, dp, dp, k9, k10, k10));
        frameLayout.addView(imageView, f6.e(24, 24, 17));
        final int i13 = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: cg.e1
            public final /* synthetic */ p1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        x2Var.addView(d1Var, f6.t(-1, -2, 1, 0, 16, 0, 0));
        j1 j1Var = new j1(this, getContext());
        this.n = j1Var;
        j1Var.setOverScrollMode(2);
        j1Var.setOffscreenPageLimit(0);
        j1Var.setAdapter(new k1(this, i13));
        this.C = i12;
        j1Var.setCurrentItem(i12);
        x2Var.addView(j1Var, f6.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        x2Var.addView(frameLayout, f6.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        pa paVar = new pa(getContext(), j1Var, this.d.size());
        j1Var.b(new l1(this, paVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(x2Var);
        linearLayout.setOrientation(1);
        int i14 = g6.V8;
        int i15 = g6.P9;
        paVar.n = i14;
        paVar.r = i15;
        if (!z11) {
            linearLayout.addView(paVar, f6.t(this.d.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        d1 d1Var2 = new d1(getContext(), c6Var, true);
        this.c = d1Var2;
        d1Var2.r.setOnClickListener(new f1(this, o2Var, z11, fw0Var2, 0));
        final int i16 = 1;
        d1Var2.e.setOnClickListener(new View.OnClickListener(this) { // from class: cg.e1
            public final /* synthetic */ p1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(d1Var2, f6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        frameLayout2.setBackgroundColor(getThemedColor(g6.h5));
        linearLayout.addView(frameLayout2, f6.q(-1, 68, 80));
        if (i11 == 40) {
            d1Var2.c(h5.g2(LocaleController.getString(R.string.Understood)), true, false);
        } else if (UserConfig.getInstance(i10).isPremium()) {
            d1Var2.c(LocaleController.getString(R.string.OK), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        B();
        this.customViewGravity = 83;
        bg.u1 u1Var = new bg.u1(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.containerView = u1Var;
        int i17 = this.backgroundPaddingLeft;
        u1Var.setPadding(i17, this.backgroundPaddingTop - 1, i17, 0);
    }
}
