// default package

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class lo0 extends m15 implements fn7 {
    public final long S;
    public final int T;
    public TL_stories.TL_premium_boostsStatus U;
    public wg1 V;
    public ScrollSlidingTextTabStrip W;
    public final ArrayList X;
    public final ArrayList Y;
    public boolean Z;
    public int a0;
    public boolean b0;
    public int c0;
    public final ArrayList d0;
    public int e0;
    public LimitPreviewView f0;
    public final eo0 g0;
    public boolean h0;
    public LinearLayout i0;
    public final TLRPC.Chat j0;
    public String k0;
    public String l0;
    public byte m0;
    public byte n0;
    public int o0;
    public int p0;

    public lo0(long j) {
        int i = yac.t0;
        this.T = i;
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.d0 = new ArrayList();
        this.e0 = 0;
        this.g0 = new eo0(this);
        this.k0 = "";
        this.l0 = "";
        this.m0 = (byte) 5;
        this.n0 = (byte) 5;
        this.S = j;
        this.j0 = uc7.s1(i).M0(Long.valueOf(-j));
    }

    public final void E0(Context context, View view, int i) {
        if (view instanceof zx4) {
            zx4 zx4Var = (zx4) view;
            TL_stories.Boost boost = zx4Var.getBoost();
            boolean z = boost.giveaway;
            if (!z || boost.stars <= 0) {
                boolean z2 = boost.gift;
                if (((z2 || z) && boost.user_id >= 0) || boost.unclaimed) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = uc7.s1(yac.t0).y1(-this.j0.id);
                    int i2 = boost.date;
                    tL_payments_checkedGiftCode.date = i2;
                    tL_payments_checkedGiftCode.via_giveaway = boost.giveaway;
                    int i3 = boost.expires - i2;
                    tL_payments_checkedGiftCode.days = i3 / 86400;
                    tL_payments_checkedGiftCode.months = (i3 / 30) / 86400;
                    if (boost.unclaimed) {
                        tL_payments_checkedGiftCode.to_id = -1L;
                        tL_payments_checkedGiftCode.flags = -1;
                    } else {
                        tL_payments_checkedGiftCode.boost = boost;
                    }
                    new tv4(this, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                } else if (z && boost.user_id == -1) {
                    c21 c21Var = new c21(getParentActivity(), getResourceProvider());
                    c21Var.g(R.raw.chats_infotip, 36, 36, new String[0]);
                    c21Var.b.setText(ob6.M0(2131753296, null));
                    c21Var.b.setSingleLine(false);
                    c21Var.b.setMaxLines(2);
                    v21.g(this, c21Var, 2750).j();
                } else if (!z2 && !z) {
                    presentFragment(ProfileActivity.Q2(zx4Var.getDialogId()));
                }
            } else {
                nza.i1(context, this.T, this.S, boost, getResourceProvider());
            }
        }
        boolean z3 = view instanceof skb;
        long j = this.S;
        if (z3) {
            dn0.E0(this, this.resourceProvider, j, null);
        }
        if (view instanceof cy4) {
            dn0.E0(this, this.resourceProvider, j, ((cy4) view).getPrepaidGiveaway());
        }
        if (((ko0) this.d0.get(i)).a == 9) {
            H0(Boolean.valueOf(this.e0 == 1));
        }
    }

    public final void F0(CountDownLatch countDownLatch, bo0 bo0Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.n0;
        tL_premium_getBoostsList.offset = this.k0;
        int i = this.T;
        tL_premium_getBoostsList.peer = uc7.s1(i).j1(this.S);
        ConnectionsManager.getInstance(i).sendRequest(tL_premium_getBoostsList, new fn0((Object) this, (Object) countDownLatch, (Object) bo0Var, (byte) 4), 2);
    }

    public final void G0(CountDownLatch countDownLatch, bo0 bo0Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.m0;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.l0;
        int i = this.T;
        tL_premium_getBoostsList.peer = uc7.s1(i).j1(this.S);
        ConnectionsManager.getInstance(i).sendRequest(tL_premium_getBoostsList, new fn0((Object) this, (Object) countDownLatch, (Object) bo0Var, (byte) 5), 2);
    }

    public final void H0(Boolean bool) {
        if (this.h0) {
            return;
        }
        byte b = 1;
        this.h0 = true;
        if (bool == null) {
            Utilities.e.c(new bo0(this, b));
        } else if (bool.booleanValue()) {
            G0(null, new bo0(this, (byte) 2));
        } else {
            F0(null, new bo0(this, (byte) 3));
        }
    }

    public final void I0(boolean z) {
        if (getParentActivity() == null) {
            return;
        }
        if (this.f0 == null) {
            LimitPreviewView limitPreviewView = new LimitPreviewView(getParentActivity(), R.drawable.filled_limit_boost, 0, 0, this.resourceProvider);
            this.f0 = limitPreviewView;
            limitPreviewView.d0 = true;
            limitPreviewView.setDarkGradientProvider(new tg0(this, (byte) 7));
        }
        if (this.f0.getParent() != null) {
            ((ViewGroup) this.f0.getParent()).removeView(this.f0);
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.U;
        if (tL_premium_boostsStatus != null) {
            this.f0.h(tL_premium_boostsStatus, false);
            if (z) {
                this.f0.setAlpha(0.0f);
                this.f0.animate().alpha(1.0f).start();
            }
        }
        TLRPC.Chat chat = this.j0;
        String M0 = ob6.M0(xc2.V(chat) ? 2131753582 : 2131753580, null);
        SpannableStringBuilder S2 = hl.S2(ob6.M0(xc2.V(chat) ? 2131753581 : 2131753579, null));
        go0 go0Var = new go0(getParentActivity());
        go0Var.addView(this.U != null ? this.f0 : new View(go0Var.getContext()), tre.d(-1, this.U != null ? -2.0f : 110.0f, 0, 8.0f, 46.0f, 8.0f, 33.0f));
        i0(M0, S2, go0Var, new io0(this, getParentActivity()));
    }

    public final void J0(boolean z) {
        ArrayList arrayList = new ArrayList(this.d0);
        this.d0.clear();
        this.d0.add(new ko0(14, false));
        if (this.U != null) {
            this.d0.add(new ko0(16, ob6.M0(2131744552, null)));
            this.d0.add(new ko0(0, false));
            this.d0.add(new ko0(2, false));
            if (this.U.prepaid_giveaways.size() > 0) {
                this.d0.add(new ko0(12, ob6.M0(2131753317, null)));
                int i = 0;
                while (i < this.U.prepaid_giveaways.size()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.U.prepaid_giveaways.get(i);
                    ArrayList arrayList2 = this.d0;
                    boolean z2 = i == this.U.prepaid_giveaways.size() - 1;
                    ko0 ko0Var = new ko0(11, true);
                    ko0Var.e = prepaidGiveaway;
                    ko0Var.f = z2;
                    arrayList2.add(ko0Var);
                    i++;
                }
                this.d0.add(new ko0(6, ob6.M0(2131753279, null)));
            }
            this.d0.add(new ko0(13, ob6.M0(2131753599, null)));
            if (this.e0 == 0) {
                if (this.X.isEmpty()) {
                    this.d0.add(new ko0(8, false));
                    this.d0.add(new ko0(2, false));
                } else {
                    int i2 = 0;
                    while (i2 < this.X.size()) {
                        this.d0.add(new ko0((TL_stories.Boost) this.X.get(i2), i2 == this.X.size() - 1 && !this.Z, this.e0));
                        i2++;
                    }
                    boolean z3 = this.Z;
                    ArrayList arrayList3 = this.d0;
                    if (z3) {
                        arrayList3.add(new ko0(9, true));
                    } else {
                        arrayList3.add(new ko0(7, false));
                    }
                    this.d0.add(new ko0(6, ob6.M0(xc2.V(this.j0) ? 2131753598 : 2131753597, null)));
                }
            } else if (this.Y.isEmpty()) {
                this.d0.add(new ko0(8, false));
                this.d0.add(new ko0(2, false));
            } else {
                int i3 = 0;
                while (i3 < this.Y.size()) {
                    this.d0.add(new ko0((TL_stories.Boost) this.Y.get(i3), i3 == this.Y.size() - 1 && !this.b0, this.e0));
                    i3++;
                }
                boolean z4 = this.b0;
                ArrayList arrayList4 = this.d0;
                if (z4) {
                    arrayList4.add(new ko0(9, true));
                } else {
                    arrayList4.add(new ko0(7, false));
                }
                this.d0.add(new ko0(6, ob6.M0(xc2.V(this.j0) ? 2131753598 : 2131753597, null)));
            }
            this.d0.add(new ko0(1, ob6.M0(2131748668, null)));
            this.d0.add(new ko0(3, this.U.boost_url));
            if (uc7.s1(this.T).l4.W1.f && xc2.N(this.j0)) {
                this.d0.add(new ko0(6, ob6.M0(xc2.V(this.j0) ? 2131753262 : 2131753261, null)));
                this.d0.add(new ko0(10, true));
                this.d0.add(new ko0(6, ob6.M0(xc2.V(this.j0) ? 2131753496 : 2131753495, null)));
            } else {
                this.d0.add(new ko0(6, ""));
            }
            this.d0.add(new ko0(15, false));
        }
        eo0 eo0Var = this.g0;
        if (z) {
            eo0Var.E(arrayList, this.d0);
        } else {
            eo0Var.f();
        }
    }

    @Override // m15, org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        View createView = super.createView(context);
        I0(false);
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        this.c.setItemAnimator(zb3Var);
        this.c.setOnItemClickListener(new l0(this, context, (byte) 2));
        Activity parentActivity = getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.i0 = linearLayout;
        byte b = 1;
        linearLayout.setOrientation(1);
        this.i0.addView(new fo0(parentActivity), tre.t(100, 100, 17, 0, jn7.E1, 0, 0));
        ((ViewGroup) this.fragmentView).addView(this.i0, tre.e(-1, -2, 17));
        this.i0.setAlpha(0.0f);
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.U;
        LinearLayout linearLayout2 = this.i0;
        if (tL_premium_boostsStatus == null) {
            linearLayout2.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
            getMessagesController().G0().a(this.S, new co0(this, b));
        } else {
            linearLayout2.setVisibility(8);
            H0(null);
        }
        J0(false);
        return createView;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != jn7.X2) {
            if (i == jn7.r3) {
                if (this.S == ((Long) objArr[2]).longValue()) {
                    this.U = (TL_stories.TL_premium_boostsStatus) objArr[0];
                    this.V = (wg1) objArr[1];
                    return;
                }
                return;
            }
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        List fragmentStack = getParentLayout().getFragmentStack();
        e eVar = fragmentStack.size() >= 2 ? (e) bp1.m(2, fragmentStack) : null;
        if (eVar instanceof g92) {
            ((ActionBarLayout) getParentLayout()).c0(eVar, false);
        }
        List fragmentStack2 = getParentLayout().getFragmentStack();
        e eVar2 = fragmentStack2.size() >= 2 ? (e) bp1.m(2, fragmentStack2) : null;
        if (!booleanValue) {
            finishFragment();
            if ((eVar2 instanceof ProfileActivity) || (eVar2 instanceof zu1)) {
                ym0.f(eVar2, chat, false);
                return;
            }
            return;
        }
        e eVar3 = fragmentStack2.size() >= 3 ? (e) bp1.m(3, fragmentStack2) : null;
        if (eVar2 instanceof ProfileActivity) {
            ((ActionBarLayout) getParentLayout()).c0(eVar2, false);
        }
        finishFragment();
        if (eVar3 instanceof zu1) {
            ym0.f(eVar3, chat, true);
        }
        if (eVar2 instanceof zu1) {
            ym0.f(eVar2, chat, true);
        }
    }

    @Override // m15
    public final j79 j0() {
        return this.g0;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, jn7.X2);
        getNotificationCenter().b(this, jn7.r3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, jn7.X2);
        getNotificationCenter().n(this, jn7.r3);
        super.onFragmentDestroy();
    }
}
