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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class dc extends FrameLayout {
    public final bc E;
    public final org.telegram.ui.Components.vl0 F;
    public ah.o G;
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

    public dc(bb1 bb1Var, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bb1Var.getParentActivity());
        int i10 = UserConfig.selectedAccount;
        this.b = i10;
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.x = new ArrayList();
        this.y = 0;
        bc bcVar = new bc(this);
        this.E = bcVar;
        this.K = "";
        this.L = "";
        this.M = 5;
        this.N = 5;
        this.c = bb1Var;
        Activity parentActivity = bb1Var.getParentActivity();
        this.e = f6Var;
        this.a = j3;
        this.J = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(parentActivity, null);
        this.F = vl0Var;
        vl0Var.setSections(true);
        vl0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, f6Var));
        vl0Var.setLayoutManager(new s4.c0());
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        vl0Var.setItemAnimator(jVar);
        vl0Var.setClipToPadding(false);
        vl0Var.setOnItemClickListener(new wb(this, parentActivity, j3, f6Var, bb1Var));
        addView(vl0Var);
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j3, new yb(this, 0));
        vl0Var.setAdapter(bcVar);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.I = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(context);
        kj0Var.setAutoRepeat(true);
        kj0Var.f(R.raw.statistic_preload, 120, 120, null);
        kj0Var.d();
        TextView f7 = org.telegram.messenger.l0.f(context, 1, 20.0f);
        f7.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.j6.Oi;
        f7.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        f7.setTag(Integer.valueOf(i11));
        f7.setText(LocaleController.getString(R.string.LoadingStats));
        f7.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.j6.Pi;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        textView.setTag(Integer.valueOf(i12));
        org.telegram.messenger.rk.l(R.string.LoadingStatsDescription, textView, 1);
        this.I.addView(kj0Var, w7.y5.t(120, 120, 1, 0, 0, 0, 20));
        this.I.addView(f7, w7.y5.t(-2, -2, 1, 0, 0, 0, 10));
        this.I.addView(textView, w7.y5.q(-2, -2, 1));
        addView(this.I, w7.y5.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.I.setAlpha(0.0f);
        this.I.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        yh.u5.y(i10, false).v();
    }

    public final void a(CountDownLatch countDownLatch, zb zbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.N;
        tL_premium_getBoostsList.offset = this.K;
        int i10 = this.b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new ac(this, countDownLatch, zbVar, 1), 2);
    }

    public final void b(CountDownLatch countDownLatch, zb zbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.M;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.L;
        int i10 = this.b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new ac(this, countDownLatch, zbVar, 0), 2);
    }

    public final void c(Boolean bool) {
        if (this.H) {
            return;
        }
        this.H = true;
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
            TLRPC.Chat chat = this.J;
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
