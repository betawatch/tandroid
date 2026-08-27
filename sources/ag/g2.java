package ag;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import h7.z5;
import hh.i5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ia;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.gw0;
import org.telegram.ui.hw0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g2 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean A;
    public boolean B;
    public int C;
    public int D;
    public float E;
    public final hw0 F;
    public int G;
    public int H;
    public int I;
    public d2 J;
    public final org.telegram.ui.ActionBar.n2 b;
    public final s1 c;
    public final ArrayList d;
    public float e;
    public float f;
    public boolean h;
    public final a2 n;
    public final y1 r;
    public int s;
    public final FrameLayout v;
    public boolean w;
    public final SvgHelper.SvgDrawable x;
    public final int y;

    public g2(Context context, int i10, c6 c6Var) {
        this(null, context, UserConfig.selectedAccount, false, i10, true, null, c6Var);
    }

    public final ViewGroup B(Context context, int i10) {
        gw0 gw0Var = (gw0) this.d.get(i10);
        int i11 = gw0Var.a;
        if (i11 == 0) {
            c cVar = new c(context, this.resourcesProvider);
            cVar.b.setOnScrollListener(new v1(this, 1));
            return cVar;
        }
        if (i11 == 14 || i11 == 28) {
            o oVar = new o(context, i11 == 28 ? 1 : 0, this.resourcesProvider);
            oVar.b.setOnScrollListener(new v1(this, 0));
            return oVar;
        }
        if (i11 == 5) {
            return new w1(context, this.currentAccount);
        }
        if (i11 == 10) {
            return new n1(context, this.resourcesProvider);
        }
        return new p3(context, this.x, this.currentAccount, gw0Var.a, this.resourcesProvider);
    }

    public final void C() {
        boolean z10 = this.B;
        s1 s1Var = this.c;
        if (z10) {
            s1Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
            return;
        }
        if (!this.A) {
            s1Var.d.setText(PremiumPreviewFragment.o0(this.currentAccount, this.F));
            return;
        }
        int i10 = this.y;
        if (i10 == 4) {
            s1Var.d.setText(LocaleController.getString(R.string.UnlockPremiumReactions));
            s1Var.setIcon(R.raw.unlock_icon);
        } else if (i10 != 10) {
            s1Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
        } else {
            s1Var.d.setText(LocaleController.getString(R.string.UnlockPremiumIcons));
            s1Var.setIcon(R.raw.unlock_icon);
        }
    }

    public final void D() {
        this.B = true;
        s1 s1Var = this.c;
        s1Var.h = false;
        s1Var.d(true);
        C();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        int i10 = 0;
        while (true) {
            a2 a2Var = this.n;
            if (i10 >= a2Var.getChildCount()) {
                return true;
            }
            f2 f2Var = (f2) a2Var.getChildAt(i10);
            if (f2Var.a == this.C) {
                if (f2Var.f instanceof b) {
                    return !((b) r1).b.canScrollVertically(-1);
                }
            }
            i10++;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.billingProductDetailsUpdated || i10 == NotificationCenter.premiumPromoUpdated) {
            C();
            return;
        }
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            boolean isPremium = UserConfig.getInstance(this.currentAccount).isPremium();
            s1 s1Var = this.c;
            if (isPremium) {
                s1Var.c(LocaleController.getString(R.string.OK), false, true);
            } else {
                s1Var.h = false;
                s1Var.d(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 16);
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        d2 d2Var = new d2(this, getContext(), 0);
        this.J = d2Var;
        d2Var.setBackgroundColor(getThemedColor(g6.h5));
        this.J.setTitleColor(getThemedColor(g6.G6));
        this.J.C(getThemedColor(g6.z8), false);
        d2 d2Var2 = this.J;
        int i10 = g6.y8;
        d2Var2.D(getThemedColor(i10), false);
        this.J.D(getThemedColor(i10), true);
        this.J.setCastShadows(true);
        this.J.setExtraHeight(AndroidUtilities.dp(2.0f));
        this.J.setBackButtonImage(R.drawable.ic_ab_back);
        this.J.setActionBarMenuOnItemClick(new e2(this, 0));
        this.containerView.addView(this.J, z5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.J.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.J, false, 1.0f, false);
        int i11 = this.C;
        ArrayList arrayList = this.d;
        if (((gw0) arrayList.get(i11)).a == 14) {
            this.J.setTitle(LocaleController.getString(R.string.UpgradedStories));
            this.J.requestLayout();
        } else if (((gw0) arrayList.get(this.C)).a == 28) {
            this.J.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            this.J.requestLayout();
        } else if (((gw0) arrayList.get(this.C)).a == 40) {
            this.J.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            this.J.requestLayout();
        } else {
            this.J.setTitle(LocaleController.getString(R.string.DoubledLimits));
            this.J.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean onCustomOpenAnimation() {
        a2 a2Var = this.n;
        if (a2Var.getChildCount() > 0) {
            int i10 = 0;
            ViewGroup viewGroup = ((f2) a2Var.getChildAt(0)).f;
            if (viewGroup instanceof n1) {
                n1 n1Var = (n1) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(r0.getMeasuredWidth(), 0.0f);
                n1Var.setOffset(r0.getMeasuredWidth());
                this.w = true;
                ofFloat.addUpdateListener(new q1(n1Var, 1));
                ofFloat.addListener(new x1(i10, this, n1Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(er.h);
                ofFloat.start();
            }
        }
        return super.onCustomOpenAnimation();
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 16);
    }

    public final void z() {
        a2 a2Var;
        View m10;
        View m11;
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            a2Var = this.n;
            if (i12 >= a2Var.getChildCount()) {
                break;
            }
            f2 f2Var = (f2) a2Var.getChildAt(i12);
            int i13 = f2Var.a;
            ViewGroup viewGroup = f2Var.f;
            if (i13 == this.C && (viewGroup instanceof b) && ((m11 = ((b) viewGroup).c.m(0)) == null || (i10 = m11.getTop()) < 0)) {
                i10 = 0;
            }
            if (f2Var.a == this.D && (viewGroup instanceof b) && ((m10 = ((b) viewGroup).c.m(0)) == null || (i11 = m10.getTop()) < 0)) {
                i11 = 0;
            }
            i12++;
        }
        int i14 = this.H;
        if (i10 >= 0) {
            float f10 = 1.0f - this.E;
            i14 = Math.min(i14, (int) com.google.android.recaptcha.internal.a.z(1.0f, f10, i14, i10 * f10));
        }
        if (i11 >= 0) {
            float f11 = this.E;
            i14 = Math.min(i14, (int) com.google.android.recaptcha.internal.a.z(1.0f, f11, this.H, i11 * f11));
        }
        float f12 = 1.0f - this.f;
        FrameLayout frameLayout = this.v;
        frameLayout.setAlpha(f12);
        if (this.e == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z10 = this.h;
        y1 y1Var = this.r;
        y1Var.setTranslationX((z10 ? y1Var.getMeasuredWidth() : -y1Var.getMeasuredWidth()) * this.f);
        if (i14 != this.I) {
            this.I = i14;
            for (int i15 = 0; i15 < a2Var.getChildCount(); i15++) {
                if (!((f2) a2Var.getChildAt(i15)).h) {
                    a2Var.getChildAt(i15).setTranslationY(this.I);
                }
            }
            y1Var.setTranslationY(this.I);
            frameLayout.setTranslationY(this.I);
            this.containerView.invalidate();
            AndroidUtilities.updateViewVisibilityAnimated(this.J, this.I < AndroidUtilities.dp(this.y == 40 ? 5.0f : 30.0f), 1.0f, true);
        }
    }

    public g2(org.telegram.ui.ActionBar.n2 n2Var, int i10, boolean z10) {
        this(n2Var, n2Var.getContext(), n2Var.getCurrentAccount(), false, i10, z10, null);
    }

    public g2(org.telegram.ui.ActionBar.n2 n2Var, Context context, int i10, int i11, boolean z10) {
        this(n2Var, context, i10, false, i11, z10, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g2(org.telegram.ui.ActionBar.n2 n2Var, Context context, int i10, boolean z10, int i11, boolean z11, hw0 hw0Var) {
        this(n2Var, context, i10, z10, i11, z11, hw0Var, r0);
        c6 c6Var;
        if (n2Var == null) {
            c6Var = null;
        } else if (n2Var.getLastStoryViewer() != null && !n2Var.getLastStoryViewer().D0) {
            c6Var = n2Var.getLastStoryViewer().y;
        } else {
            c6Var = n2Var.getResourceProvider();
        }
    }

    public g2(org.telegram.ui.ActionBar.n2 n2Var, Context context, int i10, boolean z10, int i11, boolean z11, hw0 hw0Var, c6 c6Var) {
        super(context, c6Var, false, false);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.G = 255;
        this.b = n2Var;
        this.F = hw0Var;
        fixNavigationBar(getThemedColor(g6.h5));
        this.y = i11;
        this.A = z11;
        this.x = SvgHelper.getDrawable(AndroidUtilities.readRes(R.raw.star_loader));
        p1 p1Var = new p1(this, getContext(), 1);
        if (!z10 && i11 != 35) {
            PremiumPreviewFragment.n0(i10, arrayList);
        } else {
            PremiumPreviewFragment.m0(i10, arrayList, false);
            PremiumPreviewFragment.m0(i10, arrayList, true);
        }
        if (i11 == 40) {
            arrayList.clear();
            arrayList.add(new gw0(40, R.drawable.gift, LocaleController.getString(R.string.FeaturePreviewGifts), LocaleController.getString(R.string.FeaturePreviewGiftsDescription)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.d.size()) {
                i12 = 0;
                break;
            } else if (((gw0) this.d.get(i12)).a == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (z11) {
            gw0 gw0Var = (gw0) this.d.get(i12);
            this.d.clear();
            this.d.add(gw0Var);
            i12 = 0;
        }
        gw0 gw0Var2 = (gw0) this.d.get(i12);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        i2 i2Var = new i2(g6.ak, g6.bk, g6.ck, -1, null);
        i2Var.o = 1.1f;
        i2Var.p = 1.5f;
        i2Var.q = -0.2f;
        i2Var.m = true;
        y1 y1Var = new y1(this, getContext(), i2Var, 0);
        this.r = y1Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v = frameLayout;
        frameLayout.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int dp = AndroidUtilities.dp(12.0f);
        int k10 = i0.b.k(-1, 40);
        int k11 = i0.b.k(-1, 100);
        imageView.setBackground(g6.i0(dp, dp, dp, dp, k10, k11, k11));
        frameLayout.addView(imageView, z5.e(24, 24, 17));
        final int i13 = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: ag.t1
            public final /* synthetic */ g2 b;

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
        p1Var.addView(y1Var, z5.t(-1, -2, 1, 0, 16, 0, 0));
        a2 a2Var = new a2(this, getContext());
        this.n = a2Var;
        a2Var.setOverScrollMode(2);
        a2Var.setOffscreenPageLimit(0);
        a2Var.setAdapter(new b2(this, i13));
        this.C = i12;
        a2Var.setCurrentItem(i12);
        p1Var.addView(a2Var, z5.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        p1Var.addView(frameLayout, z5.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        ia iaVar = new ia(getContext(), a2Var, this.d.size());
        a2Var.b(new c2(this, iaVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(p1Var);
        linearLayout.setOrientation(1);
        int i14 = g6.V8;
        int i15 = g6.P9;
        iaVar.n = i14;
        iaVar.r = i15;
        if (!z11) {
            linearLayout.addView(iaVar, z5.t(this.d.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        s1 s1Var = new s1(getContext(), c6Var, true);
        this.c = s1Var;
        s1Var.r.setOnClickListener(new u1(this, n2Var, z11, gw0Var2, 0));
        final int i16 = 1;
        s1Var.e.setOnClickListener(new View.OnClickListener(this) { // from class: ag.t1
            public final /* synthetic */ g2 b;

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
        frameLayout2.addView(s1Var, z5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        frameLayout2.setBackgroundColor(getThemedColor(g6.h5));
        linearLayout.addView(frameLayout2, z5.q(-1, 68, 80));
        if (i11 == 40) {
            s1Var.c(i5.g2(LocaleController.getString(R.string.Understood)), true, false);
        } else if (UserConfig.getInstance(i10).isPremium()) {
            s1Var.c(LocaleController.getString(R.string.OK), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        C();
        this.customViewGravity = 83;
        w wVar = new w(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.containerView = wVar;
        int i17 = this.backgroundPaddingLeft;
        wVar.setPadding(i17, this.backgroundPaddingTop - 1, i17, 0);
    }
}
