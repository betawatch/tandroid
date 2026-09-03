package eg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import dg.y2;
import java.util.ArrayList;
import k7.b6;
import lh.g5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ka;
import org.telegram.ui.Components.mr;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ww0;
import org.telegram.ui.xw0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class o1 extends g3 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean B;
    public boolean C;
    public int D;
    public int E;
    public float F;
    public final xw0 G;
    public int H;
    public int I;
    public int J;
    public l1 K;
    public final org.telegram.ui.ActionBar.p2 b;
    public final c1 c;
    public final ArrayList d;
    public float e;
    public float f;
    public boolean h;
    public final i1 n;
    public final ah.e r;
    public int s;
    public final FrameLayout v;
    public boolean w;
    public final SvgHelper.SvgDrawable x;
    public final int y;

    public o1(Context context, int i10, f6 f6Var) {
        this(null, context, UserConfig.selectedAccount, false, i10, true, null, f6Var);
    }

    public final ViewGroup A(Context context, int i10) {
        ww0 ww0Var = (ww0) this.d.get(i10);
        int i11 = ww0Var.a;
        if (i11 == 0) {
            c cVar = new c(context, this.resourcesProvider);
            cVar.b.setOnScrollListener(new f1(this, 1));
            return cVar;
        }
        if (i11 == 14 || i11 == 28) {
            m mVar = new m(context, i11 == 28 ? 1 : 0, this.resourcesProvider);
            mVar.b.setOnScrollListener(new f1(this, 0));
            return mVar;
        }
        if (i11 == 5) {
            return new g1(context, this.currentAccount);
        }
        if (i11 == 10) {
            return new z0(context, this.resourcesProvider);
        }
        return new u2(context, this.x, this.currentAccount, ww0Var.a, this.resourcesProvider);
    }

    public final void B() {
        boolean z4 = this.C;
        c1 c1Var = this.c;
        if (z4) {
            c1Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
            return;
        }
        if (!this.B) {
            c1Var.d.setText(PremiumPreviewFragment.o0(this.currentAccount, this.G));
            return;
        }
        int i10 = this.y;
        if (i10 == 4) {
            c1Var.d.setText(LocaleController.getString(R.string.UnlockPremiumReactions));
            c1Var.setIcon(R.raw.unlock_icon);
        } else if (i10 != 10) {
            c1Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
        } else {
            c1Var.d.setText(LocaleController.getString(R.string.UnlockPremiumIcons));
            c1Var.setIcon(R.raw.unlock_icon);
        }
    }

    public final void C() {
        this.C = true;
        c1 c1Var = this.c;
        c1Var.h = false;
        c1Var.d(true);
        B();
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        int i10 = 0;
        while (true) {
            i1 i1Var = this.n;
            if (i10 >= i1Var.getChildCount()) {
                return true;
            }
            n1 n1Var = (n1) i1Var.getChildAt(i10);
            if (n1Var.a == this.D) {
                if (n1Var.f instanceof b) {
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
            c1 c1Var = this.c;
            if (isPremium) {
                c1Var.c(LocaleController.getString(R.string.OK), false, true);
            } else {
                c1Var.h = false;
                c1Var.d(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 16);
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        l1 l1Var = new l1(this, getContext(), 0);
        this.K = l1Var;
        l1Var.setBackgroundColor(getThemedColor(j6.h5));
        this.K.setTitleColor(getThemedColor(j6.G6));
        this.K.B(getThemedColor(j6.z8), false);
        l1 l1Var2 = this.K;
        int i10 = j6.y8;
        l1Var2.C(getThemedColor(i10), false);
        this.K.C(getThemedColor(i10), true);
        this.K.setCastShadows(true);
        this.K.setExtraHeight(AndroidUtilities.dp(2.0f));
        this.K.setBackButtonImage(R.drawable.ic_ab_back);
        this.K.setActionBarMenuOnItemClick(new m1(this, 0));
        this.containerView.addView(this.K, b6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.K.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.K, false, 1.0f, false);
        int i11 = this.D;
        ArrayList arrayList = this.d;
        if (((ww0) arrayList.get(i11)).a == 14) {
            this.K.setTitle(LocaleController.getString(R.string.UpgradedStories));
            this.K.requestLayout();
        } else if (((ww0) arrayList.get(this.D)).a == 28) {
            this.K.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            this.K.requestLayout();
        } else if (((ww0) arrayList.get(this.D)).a == 40) {
            this.K.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            this.K.requestLayout();
        } else {
            this.K.setTitle(LocaleController.getString(R.string.DoubledLimits));
            this.K.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean onCustomOpenAnimation() {
        i1 i1Var = this.n;
        if (i1Var.getChildCount() > 0) {
            ViewGroup viewGroup = ((n1) i1Var.getChildAt(0)).f;
            if (viewGroup instanceof z0) {
                z0 z0Var = (z0) viewGroup;
                int i10 = 1;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(r0.getMeasuredWidth(), 0.0f);
                z0Var.setOffset(r0.getMeasuredWidth());
                this.w = true;
                ofFloat.addUpdateListener(new b1(z0Var, i10));
                ofFloat.addListener(new y2(i10, this, z0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(mr.h);
                ofFloat.start();
            }
        }
        return super.onCustomOpenAnimation();
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 16);
    }

    public final void y() {
        i1 i1Var;
        View m9;
        View m10;
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            i1Var = this.n;
            if (i12 >= i1Var.getChildCount()) {
                break;
            }
            n1 n1Var = (n1) i1Var.getChildAt(i12);
            int i13 = n1Var.a;
            ViewGroup viewGroup = n1Var.f;
            if (i13 == this.D && (viewGroup instanceof b) && ((m10 = ((b) viewGroup).c.m(0)) == null || (i10 = m10.getTop()) < 0)) {
                i10 = 0;
            }
            if (n1Var.a == this.E && (viewGroup instanceof b) && ((m9 = ((b) viewGroup).c.m(0)) == null || (i11 = m9.getTop()) < 0)) {
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
        ah.e eVar = this.r;
        eVar.setTranslationX((z4 ? eVar.getMeasuredWidth() : -eVar.getMeasuredWidth()) * this.f);
        if (i14 != this.J) {
            this.J = i14;
            for (int i15 = 0; i15 < i1Var.getChildCount(); i15++) {
                if (!((n1) i1Var.getChildAt(i15)).h) {
                    i1Var.getChildAt(i15).setTranslationY(this.J);
                }
            }
            eVar.setTranslationY(this.J);
            frameLayout.setTranslationY(this.J);
            this.containerView.invalidate();
            AndroidUtilities.updateViewVisibilityAnimated(this.K, this.J < AndroidUtilities.dp(this.y == 40 ? 5.0f : 30.0f), 1.0f, true);
        }
    }

    public o1(org.telegram.ui.ActionBar.p2 p2Var, int i10, boolean z4) {
        this(p2Var, p2Var.getContext(), p2Var.getCurrentAccount(), false, i10, z4, null);
    }

    public o1(org.telegram.ui.ActionBar.p2 p2Var, Context context, int i10, int i11, boolean z4) {
        this(p2Var, context, i10, false, i11, z4, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o1(org.telegram.ui.ActionBar.p2 p2Var, Context context, int i10, boolean z4, int i11, boolean z10, xw0 xw0Var) {
        this(p2Var, context, i10, z4, i11, z10, xw0Var, r0);
        f6 f6Var;
        if (p2Var == null) {
            f6Var = null;
        } else if (p2Var.getLastStoryViewer() != null && !p2Var.getLastStoryViewer().E0) {
            f6Var = p2Var.getLastStoryViewer().y;
        } else {
            f6Var = p2Var.getResourceProvider();
        }
    }

    public o1(org.telegram.ui.ActionBar.p2 p2Var, Context context, int i10, boolean z4, int i11, boolean z10, xw0 xw0Var, f6 f6Var) {
        super(context, f6Var, false, false);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.H = 255;
        this.b = p2Var;
        this.G = xw0Var;
        fixNavigationBar(getThemedColor(j6.h5));
        this.y = i11;
        this.B = z10;
        this.x = SvgHelper.getDrawable(AndroidUtilities.readRes(R.raw.star_loader));
        dg.u2 u2Var = new dg.u2(this, getContext(), 4);
        if (!z4 && i11 != 35) {
            PremiumPreviewFragment.n0(i10, arrayList);
        } else {
            PremiumPreviewFragment.m0(i10, arrayList, false);
            PremiumPreviewFragment.m0(i10, arrayList, true);
        }
        if (i11 == 40) {
            arrayList.clear();
            arrayList.add(new ww0(40, R.drawable.gift, LocaleController.getString(R.string.FeaturePreviewGifts), LocaleController.getString(R.string.FeaturePreviewGiftsDescription)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.d.size()) {
                i12 = 0;
                break;
            } else if (((ww0) this.d.get(i12)).a == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (z10) {
            ww0 ww0Var = (ww0) this.d.get(i12);
            this.d.clear();
            this.d.add(ww0Var);
            i12 = 0;
        }
        ww0 ww0Var2 = (ww0) this.d.get(i12);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        q1 q1Var = new q1(j6.ak, j6.bk, j6.ck, -1, null);
        q1Var.o = 1.1f;
        q1Var.p = 1.5f;
        q1Var.q = -0.2f;
        q1Var.m = true;
        ah.e eVar = new ah.e(this, getContext(), q1Var, 2);
        this.r = eVar;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v = frameLayout;
        frameLayout.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int dp = AndroidUtilities.dp(12.0f);
        int k10 = i0.a.k(-1, 40);
        int k11 = i0.a.k(-1, 100);
        imageView.setBackground(j6.i0(dp, dp, dp, dp, k10, k11, k11));
        frameLayout.addView(imageView, b6.e(24, 24, 17));
        final int i13 = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: eg.d1
            public final /* synthetic */ o1 b;

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
        u2Var.addView(eVar, b6.t(-1, -2, 1, 0, 16, 0, 0));
        i1 i1Var = new i1(this, getContext());
        this.n = i1Var;
        i1Var.setOverScrollMode(2);
        i1Var.setOffscreenPageLimit(0);
        i1Var.setAdapter(new j1(this, i13));
        this.D = i12;
        i1Var.setCurrentItem(i12);
        u2Var.addView(i1Var, b6.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        u2Var.addView(frameLayout, b6.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        ka kaVar = new ka(getContext(), i1Var, this.d.size());
        i1Var.b(new k1(this, kaVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(u2Var);
        linearLayout.setOrientation(1);
        int i14 = j6.V8;
        int i15 = j6.P9;
        kaVar.n = i14;
        kaVar.r = i15;
        if (!z10) {
            linearLayout.addView(kaVar, b6.t(this.d.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        c1 c1Var = new c1(getContext(), f6Var, true);
        this.c = c1Var;
        c1Var.r.setOnClickListener(new e1(this, p2Var, z10, ww0Var2, 0));
        final int i16 = 1;
        c1Var.e.setOnClickListener(new View.OnClickListener(this) { // from class: eg.d1
            public final /* synthetic */ o1 b;

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
        frameLayout2.addView(c1Var, b6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        frameLayout2.setBackgroundColor(getThemedColor(j6.h5));
        linearLayout.addView(frameLayout2, b6.q(-1, 68, 80));
        if (i11 == 40) {
            c1Var.c(g5.g2(LocaleController.getString(R.string.Understood)), true, false);
        } else if (UserConfig.getInstance(i10).isPremium()) {
            c1Var.c(LocaleController.getString(R.string.OK), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        B();
        this.customViewGravity = 83;
        dg.s1 s1Var = new dg.s1(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.containerView = s1Var;
        int i17 = this.backgroundPaddingLeft;
        s1Var.setPadding(i17, this.backgroundPaddingTop - 1, i17, 0);
    }
}
