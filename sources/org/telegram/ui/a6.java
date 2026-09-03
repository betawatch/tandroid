package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class a6 extends n20 implements NotificationCenter.NotificationCenterDelegate {
    public final long M;
    public final int N;
    public TL_stories.TL_premium_boostsStatus O;
    public ChannelBoostsController.CanApplyBoost P;
    public ScrollSlidingTextTabStrip Q;
    public final ArrayList R;
    public final ArrayList S;
    public boolean T;
    public int U;
    public boolean V;
    public int W;
    public final ArrayList X;
    public int Y;
    public LimitPreviewView Z;
    public final t5 a0;
    public boolean b0;
    public LinearLayout c0;
    public final TLRPC.Chat d0;
    public String e0;
    public String f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;

    public a6(long j10) {
        int i10 = UserConfig.selectedAccount;
        this.N = i10;
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.X = new ArrayList();
        this.Y = 0;
        this.a0 = new t5(this);
        this.e0 = "";
        this.f0 = "";
        this.g0 = 5;
        this.h0 = 5;
        this.M = j10;
        this.d0 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
    }

    public static void x0(a6 a6Var, Context context, View view, int i10) {
        long j10 = a6Var.M;
        if (view instanceof lg.b) {
            lg.b bVar = (lg.b) view;
            TL_stories.Boost boost = bVar.getBoost();
            boolean z4 = boost.giveaway;
            if (!z4 || boost.stars <= 0) {
                boolean z10 = boost.gift;
                if (((z10 || z4) && boost.user_id >= 0) || boost.unclaimed) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-a6Var.d0.id);
                    int i11 = boost.date;
                    tL_payments_checkedGiftCode.date = i11;
                    tL_payments_checkedGiftCode.via_giveaway = boost.giveaway;
                    int i12 = boost.expires - i11;
                    tL_payments_checkedGiftCode.days = i12 / 86400;
                    tL_payments_checkedGiftCode.months = (i12 / 30) / 86400;
                    if (boost.unclaimed) {
                        tL_payments_checkedGiftCode.to_id = -1L;
                        tL_payments_checkedGiftCode.flags = -1;
                    } else {
                        tL_payments_checkedGiftCode.boost = boost;
                    }
                    new gg.e1(a6Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                } else if (z4 && boost.user_id == -1) {
                    org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(a6Var.getParentActivity(), a6Var.getResourceProvider());
                    qbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                    qbVar.b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                    qbVar.b.setSingleLine(false);
                    qbVar.b.setMaxLines(2);
                    org.telegram.ui.Components.ic.g(a6Var, qbVar, 2750).j();
                } else if (!z10 && !z4) {
                    a6Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                }
            } else {
                lh.ja.e1(context, a6Var.N, a6Var.M, boost, a6Var.getResourceProvider());
            }
        }
        if (view instanceof org.telegram.ui.Cells.n8) {
            gg.x.m(a6Var, a6Var.resourceProvider, j10, null);
        }
        if (view instanceof lg.c) {
            gg.x.m(a6Var, a6Var.resourceProvider, j10, ((lg.c) view).getPrepaidGiveaway());
        }
        if (((z5) a6Var.X.get(i10)).a == 9) {
            a6Var.E0(Boolean.valueOf(a6Var.Y == 1));
        }
    }

    public final void C0(CountDownLatch countDownLatch, q5 q5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.h0;
        tL_premium_getBoostsList.offset = this.e0;
        int i10 = this.N;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.M);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new o5(this, countDownLatch, q5Var, 0), 2);
    }

    public final void D0(CountDownLatch countDownLatch, q5 q5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.g0;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.f0;
        int i10 = this.N;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.M);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new o5(this, countDownLatch, q5Var, 1), 2);
    }

    public final void E0(Boolean bool) {
        if (this.b0) {
            return;
        }
        this.b0 = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new q5(this, 1));
        } else if (bool.booleanValue()) {
            D0(null, new q5(this, 2));
        } else {
            C0(null, new q5(this, 3));
        }
    }

    public final void F0(boolean z4) {
        if (getParentActivity() == null) {
            return;
        }
        if (this.Z == null) {
            LimitPreviewView limitPreviewView = new LimitPreviewView(getParentActivity(), R.drawable.filled_limit_boost, 0, this.resourceProvider, 0);
            this.Z = limitPreviewView;
            limitPreviewView.W = true;
            limitPreviewView.setDarkGradientProvider(new c1(this, 5));
        }
        if (this.Z.getParent() != null) {
            ((ViewGroup) this.Z.getParent()).removeView(this.Z);
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.O;
        if (tL_premium_boostsStatus != null) {
            this.Z.e(tL_premium_boostsStatus, false);
            if (z4) {
                this.Z.setAlpha(0.0f);
                this.Z.animate().alpha(1.0f).start();
            }
        }
        TLRPC.Chat chat = this.d0;
        String string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingBoostForChannels : R.string.BoostingBoostForGroups);
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingBoostForChannelsInfo : R.string.BoostingBoostForGroupsInfo));
        v5 v5Var = new v5(getParentActivity());
        v5Var.addView(this.O != null ? this.Z : new View(v5Var.getContext()), k7.b6.d(-1, this.O != null ? -2.0f : 110.0f, 0, 8.0f, 46.0f, 8.0f, 33.0f));
        m0(string, replaceTags, v5Var, new y5(this, getParentActivity()));
    }

    public final void G0(boolean z4) {
        ArrayList arrayList = this.X;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        arrayList.add(new z5(14, false));
        if (this.O != null) {
            arrayList.add(new z5(16, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new z5(0, false));
            arrayList.add(new z5(2, false));
            if (this.O.prepaid_giveaways.size() > 0) {
                arrayList.add(new z5(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                int i10 = 0;
                while (i10 < this.O.prepaid_giveaways.size()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.O.prepaid_giveaways.get(i10);
                    boolean z10 = i10 == this.O.prepaid_giveaways.size() - 1;
                    z5 z5Var = new z5(11, true);
                    z5Var.e = prepaidGiveaway;
                    z5Var.f = z10;
                    arrayList.add(z5Var);
                    i10++;
                }
                arrayList.add(new z5(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new z5(13, LocaleController.getString(R.string.Boosters)));
            int i11 = this.Y;
            TLRPC.Chat chat = this.d0;
            if (i11 == 0) {
                ArrayList arrayList3 = this.R;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new z5(8, false));
                    arrayList.add(new z5(2, false));
                } else {
                    int i12 = 0;
                    while (i12 < arrayList3.size()) {
                        arrayList.add(new z5((TL_stories.Boost) arrayList3.get(i12), i12 == arrayList3.size() - 1 && !this.T, this.Y));
                        i12++;
                    }
                    if (this.T) {
                        arrayList.add(new z5(9, true));
                    } else {
                        arrayList.add(new z5(7, false));
                    }
                    arrayList.add(new z5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            } else {
                ArrayList arrayList4 = this.S;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new z5(8, false));
                    arrayList.add(new z5(2, false));
                } else {
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        arrayList.add(new z5((TL_stories.Boost) arrayList4.get(i13), i13 == arrayList4.size() - 1 && !this.V, this.Y));
                        i13++;
                    }
                    if (this.V) {
                        arrayList.add(new z5(9, true));
                    } else {
                        arrayList.add(new z5(7, false));
                    }
                    arrayList.add(new z5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            }
            arrayList.add(new z5(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new z5(3, this.O.boost_url));
            if (MessagesController.getInstance(this.N).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                arrayList.add(new z5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingShareThisLink : R.string.BoostingShareThisLinkGroup)));
                arrayList.add(new z5(10, true));
                arrayList.add(new z5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoosts2 : R.string.BoostingGetMoreBoostsGroup)));
            } else {
                arrayList.add(new z5(6, ""));
            }
            arrayList.add(new z5(15, false));
        }
        t5 t5Var = this.a0;
        if (z4) {
            t5Var.E(arrayList2, arrayList);
        } else {
            t5Var.l();
        }
    }

    @Override // org.telegram.ui.n20, org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        View createView = super.createView(context);
        F0(false);
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        this.c.setItemAnimator(lVar);
        this.c.setOnItemClickListener(new gg.v0(4, this, context));
        Activity parentActivity = getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.c0 = linearLayout;
        linearLayout.setOrientation(1);
        this.c0.addView(new nh.n1(parentActivity), k7.b6.t(100, 100, 17, 0, 120, 0, 0));
        ((ViewGroup) this.fragmentView).addView(this.c0, k7.b6.e(-1, -2, 17));
        this.c0.setAlpha(0.0f);
        if (this.O == null) {
            this.c0.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
            getMessagesController().getBoostsController().getBoostsStats(this.M, new r5(this, 1));
        } else {
            this.c0.setVisibility(8);
            E0(null);
        }
        G0(false);
        return createView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.boostByChannelCreated) {
            if (i10 == NotificationCenter.chatWasBoostedByUser) {
                if (this.M == ((Long) objArr[2]).longValue()) {
                    this.O = (TL_stories.TL_premium_boostsStatus) objArr[0];
                    this.P = (ChannelBoostsController.CanApplyBoost) objArr[1];
                    return;
                }
                return;
            }
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        List fragmentStack = getParentLayout().getFragmentStack();
        org.telegram.ui.ActionBar.p2 p2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.p2) ai.j(2, fragmentStack) : null;
        if (p2Var instanceof ro) {
            ((ActionBarLayout) getParentLayout()).a0(p2Var, false);
        }
        List fragmentStack2 = getParentLayout().getFragmentStack();
        org.telegram.ui.ActionBar.p2 p2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.p2) ai.j(2, fragmentStack2) : null;
        if (!booleanValue) {
            finishFragment();
            if ((p2Var2 instanceof ProfileActivity) || (p2Var2 instanceof zn)) {
                gg.r.f(p2Var2, chat, false);
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.p2) ai.j(3, fragmentStack2) : null;
        if (p2Var2 instanceof ProfileActivity) {
            ((ActionBarLayout) getParentLayout()).a0(p2Var2, false);
        }
        finishFragment();
        if (p2Var3 instanceof zn) {
            gg.r.f(p2Var3, chat, true);
        }
        if (p2Var2 instanceof zn) {
            gg.r.f(p2Var2, chat, true);
        }
    }

    @Override // org.telegram.ui.n20
    public final f2.o0 n0() {
        return this.a0;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatWasBoostedByUser);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        super.onFragmentDestroy();
    }
}
