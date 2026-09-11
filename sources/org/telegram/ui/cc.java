package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class cc extends FrameLayout {
    public final ac E;
    public final org.telegram.ui.Components.ll0 F;
    public bh.l G;
    public boolean H;
    public final LinearLayout I;
    public final TLRPC.Chat J;
    public String K;
    public String L;
    public int M;
    public int N;
    public int O;
    public int P;
    public final long a;
    public final int b;
    public final bb1 c;
    public TL_stories.TL_premium_boostsStatus d;
    public final org.telegram.ui.ActionBar.f6 e;
    public ScrollSlidingTextTabStrip f;
    public final ArrayList h;
    public final ArrayList n;
    public boolean r;
    public int s;
    public boolean v;
    public int w;
    public final ArrayList x;
    public int y;

    public cc(bb1 bb1Var, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bb1Var.getParentActivity());
        int i10 = UserConfig.selectedAccount;
        this.b = i10;
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.x = new ArrayList();
        this.y = 0;
        ac acVar = new ac(this);
        this.E = acVar;
        this.K = "";
        this.L = "";
        this.M = 5;
        this.N = 5;
        this.c = bb1Var;
        Activity parentActivity = bb1Var.getParentActivity();
        this.e = f6Var;
        this.a = j3;
        this.J = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(parentActivity, null);
        this.F = ll0Var;
        ll0Var.setSections(true);
        ll0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, f6Var));
        ll0Var.setLayoutManager(new s4.c0());
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        ll0Var.setItemAnimator(jVar);
        ll0Var.setClipToPadding(false);
        ll0Var.setOnItemClickListener(new vb(this, parentActivity, j3, f6Var, bb1Var));
        addView(ll0Var);
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j3, new xb(this, 0));
        ll0Var.setAdapter(acVar);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.I = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
        aj0Var.setAutoRepeat(true);
        aj0Var.f(R.raw.statistic_preload, 120, 120, null);
        aj0Var.d();
        TextView g10 = org.telegram.messenger.w1.g(context, 1, 20.0f);
        g10.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.j6.Oi;
        g10.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        g10.setTag(Integer.valueOf(i11));
        g10.setText(LocaleController.getString(R.string.LoadingStats));
        g10.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.j6.Pi;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        textView.setTag(Integer.valueOf(i12));
        org.telegram.messenger.vl.k(R.string.LoadingStatsDescription, textView, 1);
        this.I.addView(aj0Var, w7.x5.t(120, 120, 1, 0, 0, 0, 20));
        this.I.addView(g10, w7.x5.t(-2, -2, 1, 0, 0, 0, 10));
        this.I.addView(textView, w7.x5.q(-2, -2, 1));
        addView(this.I, w7.x5.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.I.setAlpha(0.0f);
        this.I.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        zh.s5.y(i10, false).v();
    }

    public final void a(CountDownLatch countDownLatch, yb ybVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.N;
        tL_premium_getBoostsList.offset = this.K;
        int i10 = this.b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new zb(this, countDownLatch, ybVar, 1), 2);
    }

    public final void b(CountDownLatch countDownLatch, yb ybVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.M;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.L;
        int i10 = this.b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new zb(this, countDownLatch, ybVar, 0), 2);
    }

    public final void c(Boolean bool) {
        if (this.H) {
            return;
        }
        this.H = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new yb(this, 0));
        } else if (bool.booleanValue()) {
            b(null, new yb(this, 1));
        } else {
            a(null, new yb(this, 2));
        }
    }

    public final void d(boolean z10) {
        ArrayList arrayList = this.x;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.d != null) {
            arrayList.add(new bc(4, false));
            arrayList.add(new bc(1, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new bc(0, false));
            arrayList.add(new bc(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                arrayList.add(new bc(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                int i10 = 0;
                while (i10 < this.d.prepaid_giveaways.size()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i10);
                    boolean z11 = i10 == this.d.prepaid_giveaways.size() - 1;
                    bc bcVar = new bc(11, true);
                    bcVar.e = prepaidGiveaway;
                    bcVar.f = z11;
                    arrayList.add(bcVar);
                    i10++;
                }
                arrayList.add(new bc(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new bc(13, LocaleController.getString(R.string.Boosters)));
            int i11 = this.y;
            TLRPC.Chat chat = this.J;
            if (i11 == 0) {
                ArrayList arrayList3 = this.h;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new bc(8, false));
                    arrayList.add(new bc(2, false));
                } else {
                    int i12 = 0;
                    while (i12 < arrayList3.size()) {
                        arrayList.add(new bc((TL_stories.Boost) arrayList3.get(i12), i12 == arrayList3.size() - 1 && !this.r, this.y));
                        i12++;
                    }
                    if (this.r) {
                        arrayList.add(new bc(9, true));
                    } else {
                        arrayList.add(new bc(7, false));
                    }
                    arrayList.add(new bc(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            } else {
                ArrayList arrayList4 = this.n;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new bc(8, false));
                    arrayList.add(new bc(2, false));
                } else {
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        arrayList.add(new bc((TL_stories.Boost) arrayList4.get(i13), i13 == arrayList4.size() - 1 && !this.v, this.y));
                        i13++;
                    }
                    if (this.v) {
                        arrayList.add(new bc(9, true));
                    } else {
                        arrayList.add(new bc(7, false));
                    }
                    arrayList.add(new bc(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            }
            arrayList.add(new bc(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new bc(3, this.d.boost_url));
            if (MessagesController.getInstance(this.b).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                arrayList.add(new bc(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingShareThisLink : R.string.BoostingShareThisLinkGroup)));
                arrayList.add(new bc(10, true));
                arrayList.add(new bc(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoosts2 : R.string.BoostingGetMoreBoostsGroup)));
            }
        }
        ac acVar = this.E;
        if (z10) {
            acVar.E(arrayList2, arrayList);
        } else {
            acVar.l();
        }
    }
}
