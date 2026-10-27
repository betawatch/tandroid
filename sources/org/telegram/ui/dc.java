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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dc extends FrameLayout {
    public final bc E;
    public final org.telegram.ui.Components.nm0 F;
    public boolean G;
    public final LinearLayout H;
    public final TLRPC.Chat I;
    public String J;
    public String K;
    public int L;
    public int M;
    public int N;
    public int O;
    public final long a;
    public final int b;
    public final y91 c;
    public TL_stories.TL_premium_boostsStatus d;
    public final org.telegram.ui.ActionBar.u6 e;
    public ScrollSlidingTextTabStrip f;
    public final ArrayList h;
    public final ArrayList n;
    public boolean r;
    public int s;
    public boolean v;
    public int w;
    public final ArrayList x;
    public int y;

    public dc(y91 y91Var, long j10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(y91Var.getParentActivity());
        int i10 = UserConfig.selectedAccount;
        this.b = i10;
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.x = new ArrayList();
        this.y = 0;
        bc bcVar = new bc(this);
        this.E = bcVar;
        this.J = "";
        this.K = "";
        this.L = 5;
        this.M = 5;
        this.c = y91Var;
        Activity parentActivity = y91Var.getParentActivity();
        this.e = u6Var;
        this.a = j10;
        this.I = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(parentActivity, null);
        this.F = nm0Var;
        nm0Var.setSections(true);
        nm0Var.setCaptureSectionsDecoratorAllowed(true);
        nm0Var.setLayoutManager(new s4.c0());
        s4.l lVar = new s4.l();
        lVar.m = false;
        lVar.C = false;
        nm0Var.setItemAnimator(lVar);
        nm0Var.setClipToPadding(false);
        nm0Var.setOnItemClickListener(new xb(this, parentActivity, j10, u6Var, y91Var));
        addView(nm0Var);
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j10, new t3(this, 1));
        nm0Var.setAdapter(bcVar);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.H = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
        bk0Var.setAutoRepeat(true);
        bk0Var.f(R.raw.statistic_preload, 120, 120, null);
        bk0Var.d();
        TextView g7 = org.telegram.messenger.t.g(context, 1, 20.0f);
        g7.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.y6.Oi;
        org.telegram.ui.ActionBar.f7.V(g7, i11, null);
        g7.setTag(Integer.valueOf(i11));
        g7.setText(LocaleController.getString(R.string.LoadingStats));
        g7.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.y6.Pi;
        org.telegram.ui.ActionBar.f7.V(textView, i12, null);
        textView.setTag(Integer.valueOf(i12));
        org.telegram.messenger.wh.k(R.string.LoadingStatsDescription, textView, 1);
        this.H.addView(bk0Var, org.telegram.ui.Components.kb1.x(120, 120, 1, 0, 0, 0, 20));
        this.H.addView(g7, org.telegram.ui.Components.kb1.x(-2, -2, 1, 0, 0, 0, 10));
        this.H.addView(textView, org.telegram.ui.Components.kb1.u(-2, -2, 1));
        addView(this.H, org.telegram.ui.Components.kb1.h(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.H.setAlpha(0.0f);
        this.H.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        bi.ca.y(i10, false).v();
    }

    public final void a(CountDownLatch countDownLatch, zb zbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.M;
        tL_premium_getBoostsList.offset = this.J;
        int i10 = this.b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new ac(this, countDownLatch, zbVar, 1), 2);
    }

    public final void b(CountDownLatch countDownLatch, zb zbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.L;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.K;
        int i10 = this.b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new ac(this, countDownLatch, zbVar, 0), 2);
    }

    public final void c(Boolean bool) {
        if (this.G) {
            return;
        }
        this.G = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new zb(this, 0));
        } else if (bool.booleanValue()) {
            b(null, new zb(this, 1));
        } else {
            a(null, new zb(this, 2));
        }
    }

    public final void d(boolean z10) {
        ArrayList arrayList = this.x;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.d != null) {
            arrayList.add(new cc(4, false));
            arrayList.add(new cc(1, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new cc(0, false));
            arrayList.add(new cc(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                arrayList.add(new cc(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                int i10 = 0;
                while (i10 < this.d.prepaid_giveaways.size()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i10);
                    boolean z11 = i10 == this.d.prepaid_giveaways.size() - 1;
                    cc ccVar = new cc(11, true);
                    ccVar.e = prepaidGiveaway;
                    ccVar.f = z11;
                    arrayList.add(ccVar);
                    i10++;
                }
                arrayList.add(new cc(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new cc(13, LocaleController.getString(R.string.Boosters)));
            int i11 = this.y;
            TLRPC.Chat chat = this.I;
            if (i11 == 0) {
                ArrayList arrayList3 = this.h;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new cc(8, false));
                    arrayList.add(new cc(2, false));
                } else {
                    int i12 = 0;
                    while (i12 < arrayList3.size()) {
                        arrayList.add(new cc((TL_stories.Boost) arrayList3.get(i12), i12 == arrayList3.size() - 1 && !this.r, this.y));
                        i12++;
                    }
                    if (this.r) {
                        arrayList.add(new cc(9, true));
                    } else {
                        arrayList.add(new cc(7, false));
                    }
                    arrayList.add(new cc(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            } else {
                ArrayList arrayList4 = this.n;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new cc(8, false));
                    arrayList.add(new cc(2, false));
                } else {
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        arrayList.add(new cc((TL_stories.Boost) arrayList4.get(i13), i13 == arrayList4.size() - 1 && !this.v, this.y));
                        i13++;
                    }
                    if (this.v) {
                        arrayList.add(new cc(9, true));
                    } else {
                        arrayList.add(new cc(7, false));
                    }
                    arrayList.add(new cc(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            }
            arrayList.add(new cc(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new cc(3, this.d.boost_url));
            if (MessagesController.getInstance(this.b).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                arrayList.add(new cc(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingShareThisLink : R.string.BoostingShareThisLinkGroup)));
                arrayList.add(new cc(10, true));
                arrayList.add(new cc(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoosts2 : R.string.BoostingGetMoreBoostsGroup)));
            }
        }
        bc bcVar = this.E;
        if (z10) {
            bcVar.E(arrayList2, arrayList);
        } else {
            bcVar.l();
        }
    }
}
