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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ac extends FrameLayout {
    public final yb B;
    public final org.telegram.ui.Components.tl0 C;
    public og.k D;
    public boolean E;
    public final LinearLayout F;
    public final TLRPC.Chat G;
    public String H;
    public String I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final long a;
    public final int b;
    public final ha1 c;
    public TL_stories.TL_premium_boostsStatus d;
    public final org.telegram.ui.ActionBar.g6 e;
    public ScrollSlidingTextTabStrip f;
    public final ArrayList h;
    public final ArrayList n;
    public boolean r;
    public int s;
    public boolean v;
    public int w;
    public final ArrayList x;
    public int y;

    public ac(ha1 ha1Var, long j10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(ha1Var.getParentActivity());
        int i10 = UserConfig.selectedAccount;
        this.b = i10;
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.x = new ArrayList();
        this.y = 0;
        yb ybVar = new yb(this);
        this.B = ybVar;
        this.H = "";
        this.I = "";
        this.J = 5;
        this.K = 5;
        this.c = ha1Var;
        Activity parentActivity = ha1Var.getParentActivity();
        this.e = g6Var;
        this.a = j10;
        this.G = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(parentActivity, null);
        this.C = tl0Var;
        tl0Var.setSections(true);
        tl0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.a7, g6Var));
        tl0Var.setLayoutManager(new f2.j0());
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        tl0Var.setItemAnimator(lVar);
        tl0Var.setClipToPadding(false);
        tl0Var.setOnItemClickListener(new tb(this, parentActivity, j10, g6Var, ha1Var));
        addView(tl0Var);
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j10, new vb(this, 0));
        tl0Var.setAdapter(ybVar);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.F = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.lj0 lj0Var = new org.telegram.ui.Components.lj0(context);
        lj0Var.setAutoRepeat(true);
        lj0Var.f(R.raw.statistic_preload, 120, 120, null);
        lj0Var.d();
        TextView g10 = org.telegram.messenger.y3.g(context, 1, 20.0f);
        g10.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.k6.Oi;
        g10.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        g10.setTag(Integer.valueOf(i11));
        g10.setText(LocaleController.getString(R.string.LoadingStats));
        g10.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.k6.Pi;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        textView.setTag(Integer.valueOf(i12));
        org.telegram.messenger.y3.r(R.string.LoadingStatsDescription, textView, 1);
        this.F.addView(lj0Var, k7.c6.t(120, 120, 1, 0, 0, 0, 20));
        this.F.addView(g10, k7.c6.t(-2, -2, 1, 0, 0, 0, 10));
        this.F.addView(textView, k7.c6.q(-2, -2, 1));
        addView(this.F, k7.c6.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.F.setAlpha(0.0f);
        this.F.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        mh.t7.y(i10, false).v();
    }

    public final void a(CountDownLatch countDownLatch, wb wbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.K;
        tL_premium_getBoostsList.offset = this.H;
        int i10 = this.b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new xb(this, countDownLatch, wbVar, 1), 2);
    }

    public final void b(CountDownLatch countDownLatch, wb wbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.J;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.I;
        int i10 = this.b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new xb(this, countDownLatch, wbVar, 0), 2);
    }

    public final void c(Boolean bool) {
        if (this.E) {
            return;
        }
        this.E = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new wb(this, 0));
        } else if (bool.booleanValue()) {
            b(null, new wb(this, 1));
        } else {
            a(null, new wb(this, 2));
        }
    }

    public final void d(boolean z4) {
        ArrayList arrayList = this.x;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.d != null) {
            arrayList.add(new zb(4, false));
            arrayList.add(new zb(1, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new zb(0, false));
            arrayList.add(new zb(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                arrayList.add(new zb(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                int i10 = 0;
                while (i10 < this.d.prepaid_giveaways.size()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i10);
                    boolean z10 = i10 == this.d.prepaid_giveaways.size() - 1;
                    zb zbVar = new zb(11, true);
                    zbVar.e = prepaidGiveaway;
                    zbVar.f = z10;
                    arrayList.add(zbVar);
                    i10++;
                }
                arrayList.add(new zb(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new zb(13, LocaleController.getString(R.string.Boosters)));
            int i11 = this.y;
            TLRPC.Chat chat = this.G;
            if (i11 == 0) {
                ArrayList arrayList3 = this.h;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new zb(8, false));
                    arrayList.add(new zb(2, false));
                } else {
                    int i12 = 0;
                    while (i12 < arrayList3.size()) {
                        arrayList.add(new zb((TL_stories.Boost) arrayList3.get(i12), i12 == arrayList3.size() - 1 && !this.r, this.y));
                        i12++;
                    }
                    if (this.r) {
                        arrayList.add(new zb(9, true));
                    } else {
                        arrayList.add(new zb(7, false));
                    }
                    arrayList.add(new zb(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            } else {
                ArrayList arrayList4 = this.n;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new zb(8, false));
                    arrayList.add(new zb(2, false));
                } else {
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        arrayList.add(new zb((TL_stories.Boost) arrayList4.get(i13), i13 == arrayList4.size() - 1 && !this.v, this.y));
                        i13++;
                    }
                    if (this.v) {
                        arrayList.add(new zb(9, true));
                    } else {
                        arrayList.add(new zb(7, false));
                    }
                    arrayList.add(new zb(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            }
            arrayList.add(new zb(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new zb(3, this.d.boost_url));
            if (MessagesController.getInstance(this.b).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                arrayList.add(new zb(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingShareThisLink : R.string.BoostingShareThisLinkGroup)));
                arrayList.add(new zb(10, true));
                arrayList.add(new zb(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoosts2 : R.string.BoostingGetMoreBoostsGroup)));
            }
        }
        yb ybVar = this.B;
        if (z4) {
            ybVar.E(arrayList2, arrayList);
        } else {
            ybVar.l();
        }
    }
}
