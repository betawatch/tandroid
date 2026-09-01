package fg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import eg.w2;
import java.util.ArrayList;
import k7.c6;
import mh.g5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ka;
import org.telegram.ui.Components.pr;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.rw0;
import org.telegram.ui.sw0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class n1 extends h3 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean B;
    public boolean C;
    public int D;
    public int E;
    public float F;
    public final sw0 G;
    public int H;
    public int I;
    public int J;
    public k1 K;
    public final org.telegram.ui.ActionBar.p2 b;
    public final b1 c;
    public final ArrayList d;
    public float e;
    public float f;
    public boolean h;
    public final h1 n;
    public final ag.l r;
    public int s;
    public final FrameLayout v;
    public boolean w;
    public final SvgHelper.SvgDrawable x;
    public final int y;

    public n1(Context context, int i10, g6 g6Var) {
        this(null, context, UserConfig.selectedAccount, false, i10, true, null, g6Var);
    }

    public final ViewGroup A(Context context, int i10) {
        rw0 rw0Var = (rw0) this.d.get(i10);
        int i11 = rw0Var.a;
        if (i11 == 0) {
            c cVar = new c(context, this.resourcesProvider);
            cVar.b.setOnScrollListener(new e1(this, 1));
            return cVar;
        }
        if (i11 == 14 || i11 == 28) {
            m mVar = new m(context, i11 == 28 ? 1 : 0, this.resourcesProvider);
            mVar.b.setOnScrollListener(new e1(this, 0));
            return mVar;
        }
        if (i11 == 5) {
            return new f1(context, this.currentAccount);
        }
        if (i11 == 10) {
            return new z0(context, this.resourcesProvider);
        }
        return new t2(context, this.x, this.currentAccount, rw0Var.a, this.resourcesProvider);
    }

    public final void B() {
        boolean z4 = this.C;
        b1 b1Var = this.c;
        if (z4) {
            b1Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
            return;
        }
        if (!this.B) {
            b1Var.d.setText(PremiumPreviewFragment.o0(this.currentAccount, this.G));
            return;
        }
        int i10 = this.y;
        if (i10 == 4) {
            b1Var.d.setText(LocaleController.getString(R.string.UnlockPremiumReactions));
            b1Var.setIcon(R.raw.unlock_icon);
        } else if (i10 != 10) {
            b1Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
        } else {
            b1Var.d.setText(LocaleController.getString(R.string.UnlockPremiumIcons));
            b1Var.setIcon(R.raw.unlock_icon);
        }
    }

    public final void C() {
        this.C = true;
        b1 b1Var = this.c;
        b1Var.h = false;
        b1Var.d(true);
        B();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        int i10 = 0;
        while (true) {
            h1 h1Var = this.n;
            if (i10 >= h1Var.getChildCount()) {
                return true;
            }
            m1 m1Var = (m1) h1Var.getChildAt(i10);
            if (m1Var.a == this.D) {
                if (m1Var.f instanceof b) {
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
            b1 b1Var = this.c;
            if (isPremium) {
                b1Var.c(LocaleController.getString(R.string.OK), false, true);
            } else {
                b1Var.h = false;
                b1Var.d(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 16);
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        k1 k1Var = new k1(this, getContext(), 0);
        this.K = k1Var;
        k1Var.setBackgroundColor(getThemedColor(k6.h5));
        this.K.setTitleColor(getThemedColor(k6.G6));
        this.K.B(getThemedColor(k6.z8), false);
        k1 k1Var2 = this.K;
        int i10 = k6.y8;
        k1Var2.C(getThemedColor(i10), false);
        this.K.C(getThemedColor(i10), true);
        this.K.setCastShadows(true);
        this.K.setExtraHeight(AndroidUtilities.dp(2.0f));
        this.K.setBackButtonImage(R.drawable.ic_ab_back);
        this.K.setActionBarMenuOnItemClick(new l1(this, 0));
        this.containerView.addView(this.K, c6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.K.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.K, false, 1.0f, false);
        int i11 = this.D;
        ArrayList arrayList = this.d;
        if (((rw0) arrayList.get(i11)).a == 14) {
            this.K.setTitle(LocaleController.getString(R.string.UpgradedStories));
            this.K.requestLayout();
        } else if (((rw0) arrayList.get(this.D)).a == 28) {
            this.K.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            this.K.requestLayout();
        } else if (((rw0) arrayList.get(this.D)).a == 40) {
            this.K.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            this.K.requestLayout();
        } else {
            this.K.setTitle(LocaleController.getString(R.string.DoubledLimits));
            this.K.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean onCustomOpenAnimation() {
        h1 h1Var = this.n;
        if (h1Var.getChildCount() > 0) {
            ViewGroup viewGroup = ((m1) h1Var.getChildAt(0)).f;
            if (viewGroup instanceof z0) {
                z0 z0Var = (z0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(r0.getMeasuredWidth(), 0.0f);
                z0Var.setOffset(r0.getMeasuredWidth());
                this.w = true;
                ofFloat.addUpdateListener(new f2.d0(z0Var, 2));
                ofFloat.addListener(new w2(1, this, z0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(pr.h);
                ofFloat.start();
            }
        }
        return super.onCustomOpenAnimation();
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 16);
    }

    public final void y() {
        h1 h1Var;
        View m9;
        View m10;
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            h1Var = this.n;
            if (i12 >= h1Var.getChildCount()) {
                break;
            }
            m1 m1Var = (m1) h1Var.getChildAt(i12);
            int i13 = m1Var.a;
            ViewGroup viewGroup = m1Var.f;
            if (i13 == this.D && (viewGroup instanceof b) && ((m10 = ((b) viewGroup).c.m(0)) == null || (i10 = m10.getTop()) < 0)) {
                i10 = 0;
            }
            if (m1Var.a == this.E && (viewGroup instanceof b) && ((m9 = ((b) viewGroup).c.m(0)) == null || (i11 = m9.getTop()) < 0)) {
                i11 = 0;
            }
            i12++;
        }
        int i14 = this.I;
        if (i10 >= 0) {
            float f10 = 1.0f - this.F;
            i14 = Math.min(i14, (int) e2.c.w(1.0f, f10, i14, i10 * f10));
        }
        if (i11 >= 0) {
            float f11 = this.F;
            i14 = Math.min(i14, (int) e2.c.w(1.0f, f11, this.I, i11 * f11));
        }
        float f12 = 1.0f - this.f;
        FrameLayout frameLayout = this.v;
        frameLayout.setAlpha(f12);
        if (this.e == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z4 = this.h;
        ag.l lVar = this.r;
        lVar.setTranslationX((z4 ? lVar.getMeasuredWidth() : -lVar.getMeasuredWidth()) * this.f);
        if (i14 != this.J) {
            this.J = i14;
            for (int i15 = 0; i15 < h1Var.getChildCount(); i15++) {
                if (!((m1) h1Var.getChildAt(i15)).h) {
                    h1Var.getChildAt(i15).setTranslationY(this.J);
                }
            }
            lVar.setTranslationY(this.J);
            frameLayout.setTranslationY(this.J);
            this.containerView.invalidate();
            AndroidUtilities.updateViewVisibilityAnimated(this.K, this.J < AndroidUtilities.dp(this.y == 40 ? 5.0f : 30.0f), 1.0f, true);
        }
    }

    public n1(org.telegram.ui.ActionBar.p2 p2Var, int i10, boolean z4) {
        this(p2Var, p2Var.getContext(), p2Var.getCurrentAccount(), false, i10, z4, null);
    }

    public n1(org.telegram.ui.ActionBar.p2 p2Var, Context context, int i10, int i11, boolean z4) {
        this(p2Var, context, i10, false, i11, z4, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n1(org.telegram.ui.ActionBar.p2 p2Var, Context context, int i10, boolean z4, int i11, boolean z10, sw0 sw0Var) {
        this(p2Var, context, i10, z4, i11, z10, sw0Var, r0);
        g6 g6Var;
        if (p2Var == null) {
            g6Var = null;
        } else if (p2Var.getLastStoryViewer() != null && !p2Var.getLastStoryViewer().E0) {
            g6Var = p2Var.getLastStoryViewer().y;
        } else {
            g6Var = p2Var.getResourceProvider();
        }
    }

    public n1(org.telegram.ui.ActionBar.p2 p2Var, Context context, int i10, boolean z4, int i11, boolean z10, sw0 sw0Var, g6 g6Var) {
        super(context, g6Var, false, false);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.H = 255;
        this.b = p2Var;
        this.G = sw0Var;
        fixNavigationBar(getThemedColor(k6.h5));
        this.y = i11;
        this.B = z10;
        this.x = SvgHelper.getDrawable(AndroidUtilities.readRes(R.raw.star_loader));
        eg.s2 s2Var = new eg.s2(this, getContext(), 4);
        if (!z4 && i11 != 35) {
            PremiumPreviewFragment.n0(i10, arrayList);
        } else {
            PremiumPreviewFragment.m0(i10, arrayList, false);
            PremiumPreviewFragment.m0(i10, arrayList, true);
        }
        if (i11 == 40) {
            arrayList.clear();
            arrayList.add(new rw0(40, R.drawable.gift, LocaleController.getString(R.string.FeaturePreviewGifts), LocaleController.getString(R.string.FeaturePreviewGiftsDescription)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.d.size()) {
                i12 = 0;
                break;
            } else if (((rw0) this.d.get(i12)).a == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (z10) {
            rw0 rw0Var = (rw0) this.d.get(i12);
            this.d.clear();
            this.d.add(rw0Var);
            i12 = 0;
        }
        rw0 rw0Var2 = (rw0) this.d.get(i12);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        p1 p1Var = new p1(k6.ak, k6.bk, k6.ck, -1, null);
        p1Var.o = 1.1f;
        p1Var.p = 1.5f;
        p1Var.q = -0.2f;
        p1Var.m = true;
        ag.l lVar = new ag.l(this, getContext(), p1Var, 3);
        this.r = lVar;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v = frameLayout;
        frameLayout.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int dp = AndroidUtilities.dp(12.0f);
        int k10 = i0.a.k(-1, 40);
        int k11 = i0.a.k(-1, 100);
        imageView.setBackground(k6.i0(dp, dp, dp, dp, k10, k11, k11));
        frameLayout.addView(imageView, c6.e(24, 24, 17));
        final int i13 = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: fg.c1
            public final /* synthetic */ n1 b;

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
        s2Var.addView(lVar, c6.t(-1, -2, 1, 0, 16, 0, 0));
        h1 h1Var = new h1(this, getContext());
        this.n = h1Var;
        h1Var.setOverScrollMode(2);
        h1Var.setOffscreenPageLimit(0);
        h1Var.setAdapter(new i1(this, i13));
        this.D = i12;
        h1Var.setCurrentItem(i12);
        s2Var.addView(h1Var, c6.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        s2Var.addView(frameLayout, c6.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        ka kaVar = new ka(getContext(), h1Var, this.d.size());
        h1Var.b(new j1(this, kaVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(s2Var);
        linearLayout.setOrientation(1);
        int i14 = k6.V8;
        int i15 = k6.P9;
        kaVar.n = i14;
        kaVar.r = i15;
        if (!z10) {
            linearLayout.addView(kaVar, c6.t(this.d.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        b1 b1Var = new b1(getContext(), g6Var, true);
        this.c = b1Var;
        b1Var.r.setOnClickListener(new d1(this, p2Var, z10, rw0Var2, 0));
        final int i16 = 1;
        b1Var.e.setOnClickListener(new View.OnClickListener(this) { // from class: fg.c1
            public final /* synthetic */ n1 b;

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
        frameLayout2.addView(b1Var, c6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        frameLayout2.setBackgroundColor(getThemedColor(k6.h5));
        linearLayout.addView(frameLayout2, c6.q(-1, 68, 80));
        if (i11 == 40) {
            b1Var.c(g5.g2(LocaleController.getString(R.string.Understood)), true, false);
        } else if (UserConfig.getInstance(i10).isPremium()) {
            b1Var.c(LocaleController.getString(R.string.OK), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        B();
        this.customViewGravity = 83;
        eg.q1 q1Var = new eg.q1(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.containerView = q1Var;
        int i17 = this.backgroundPaddingLeft;
        q1Var.setPadding(i17, this.backgroundPaddingTop - 1, i17, 0);
    }
}
