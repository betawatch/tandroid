package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pb1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pb1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.vk0 vk0Var;
        int i10;
        int i11;
        org.telegram.ui.web.d1 d1Var;
        org.telegram.ui.web.h0 h0Var;
        org.telegram.ui.web.u0 u0Var;
        int i12 = this.a;
        int i13 = 2;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity.getClass();
                org.telegram.ui.ActionBar.i6.w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.i6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.i6.x), Double.valueOf(org.telegram.ui.ActionBar.i6.y));
                }
                org.telegram.ui.ActionBar.i6.q1();
                org.telegram.ui.Components.ll0 ll0Var = themeActivity.b;
                if (ll0Var != null && (vk0Var = (org.telegram.ui.Components.vk0) ll0Var.K(themeActivity.Y)) != null) {
                    View view = vk0Var.a;
                    if (view instanceof org.telegram.ui.Cells.ea) {
                        ((org.telegram.ui.Cells.ea) view).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.i6.w, false, false);
                        break;
                    }
                }
                break;
            case 1:
                wd1 wd1Var = (wd1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (wd1Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    wd1Var.A0.f(wd1Var.K0[0], true);
                    break;
                }
                break;
            case 2:
                be1.X((be1) obj2, (String) obj);
                break;
            case 3:
                be1.V((be1) obj2, (TLRPC.TL_theme) obj);
                break;
            case 4:
                le1 le1Var = (le1) obj2;
                le1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                le1Var.c(true);
                break;
            case 5:
                le1 le1Var2 = (le1) obj2;
                le1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                le1Var2.c(true);
                break;
            case 6:
                kf1 kf1Var = (kf1) obj2;
                kf1Var.getClass();
                Bundle bundle = new Bundle();
                eg1 eg1Var = kf1Var.b;
                bundle.putLong("dialog_id", -eg1Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                eg1Var.presentFragment(new x11(bundle, null));
                break;
            case 7:
                ag1 ag1Var = (ag1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ag1Var.c0;
                eg1 eg1Var2 = ag1Var.t0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i17 = 0;
                while (true) {
                    ArrayList arrayList3 = eg1Var2.b;
                    if (i17 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        ag1Var.L();
                        if (!arrayList.isEmpty()) {
                            ag1Var.l0 = false;
                            ag1Var.o0.b(0);
                        }
                        ag1Var.J(str2);
                        break;
                    } else {
                        if (((vf1) arrayList3.get(i17)).c != null && ((vf1) arrayList3.get(i17)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((vf1) arrayList3.get(i17)).c);
                            ((vf1) arrayList3.get(i17)).c.searchQuery = lowerCase;
                        }
                        i17++;
                    }
                }
                break;
            case 8:
                hg1 hg1Var = ((gg1) obj2).b;
                hg1Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                hg1Var.a.V();
                break;
            case 9:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                break;
            case 10:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                break;
            case 11:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                break;
            case 12:
                hh1.g0((hh1) obj2, (String) obj);
                break;
            case 13:
                Runnable runnable = (Runnable) obj;
                for (gs gsVar : ((hh1) obj2).w.f) {
                    gsVar.l(0.0f);
                }
                runnable.run();
                break;
            case 14:
                oh1 oh1Var = (oh1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = oh1Var.f;
                ArrayList<TLRPC.Chat> arrayList5 = oh1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(oh1Var.a).putChats(arrayList5, false);
                oh1Var.d = false;
                oh1Var.c = true;
                int size = arrayList4.size();
                while (i15 < size) {
                    Object obj3 = arrayList4.get(i15);
                    i15++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                break;
            case 15:
                ui1 ui1Var = (ui1) obj2;
                ui1Var.U.a(new di1(ui1Var, (VoIPService) obj, i16), true);
                break;
            case 16:
                ui1 ui1Var2 = (ui1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.m2.T = false;
                org.telegram.ui.Components.voip.m2.i();
                ViewPropertyAnimator duration = ui1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f;
                duration.setInterpolator(qrVar).start();
                ui1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ui1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ui1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ui1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ui1Var2.j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ui1Var2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                ui1Var2.i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                ui1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                valueAnimator.addListener(new ii1(ui1Var2, i13));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(qrVar);
                valueAnimator.start();
                break;
            case 17:
                dj1 dj1Var = (dj1) obj2;
                int[] iArr = (int[]) obj;
                dj1Var.getClass();
                int i18 = iArr[0] - 1;
                iArr[0] = i18;
                if (i18 == 0) {
                    WallpapersListActivity wallpapersListActivity = dj1Var.a;
                    int[][] iArr2 = WallpapersListActivity.k0;
                    wallpapersListActivity.B0(true);
                    break;
                }
                break;
            case 18:
                jj1 jj1Var = (jj1) obj2;
                String str3 = (String) obj;
                jj1Var.d.clear();
                jj1Var.e.clear();
                jj1Var.f = true;
                jj1Var.F(str3, "", true);
                jj1Var.h = str3;
                jj1Var.l();
                jj1Var.y = null;
                break;
            case 19:
                jj1 jj1Var2 = (jj1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = jj1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str4 = jj1Var2.x;
                jj1Var2.x = null;
                jj1Var2.F(str4, "", false);
                break;
            case 20:
                String str5 = (String) obj;
                pj1 pj1Var = ((oj1) obj2).a;
                Activity parentActivity = pj1Var.getParentActivity();
                MessageObject messageObject = pj1Var.n;
                if (parentActivity != null) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d(str5);
                    }
                    str5.getClass();
                    if (str5.equals("share_game")) {
                        messageObject.messageOwner.with_my_score = false;
                    } else if (str5.equals("share_score")) {
                        messageObject.messageOwner.with_my_score = true;
                    }
                    pj1Var.showDialog(org.telegram.ui.Components.hq0.N0(pj1Var.getParentActivity(), messageObject, null, false, pj1Var.h));
                    break;
                }
                break;
            case 21:
                org.telegram.ui.web.d1 d1Var2 = (org.telegram.ui.web.d1) obj2;
                ei.r rVar = d1Var2.j0;
                rVar.f = true;
                rVar.k();
                d1Var2.w((ai.da) obj);
                break;
            case 22:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (d1Var = botWebViewContainer$BotWebViewProxy.a) != null && (h0Var = d1Var.c) != null) {
                    h0Var.f(arrayList6);
                    break;
                }
                break;
            case 23:
                ArrayList arrayList7 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.f1.c.addAll(0, arrayList7);
                for (int i19 = 0; i19 < longSparseArray.size(); i19++) {
                    org.telegram.ui.web.f1.d.put(longSparseArray.keyAt(i19), (org.telegram.ui.web.e1) longSparseArray.valueAt(i19));
                }
                org.telegram.ui.web.f1.b = true;
                org.telegram.ui.web.f1.a = false;
                ArrayList arrayList8 = org.telegram.ui.web.f1.e;
                if (arrayList8 != null) {
                    int size2 = arrayList8.size();
                    while (i14 < size2) {
                        Object obj4 = arrayList8.get(i14);
                        i14++;
                        ((Utilities.Callback) obj4).run(arrayList7);
                    }
                    org.telegram.ui.web.f1.e = null;
                    break;
                }
                break;
            case 24:
                org.telegram.ui.web.h1 h1Var = ((org.telegram.ui.web.g1) obj2).h;
                ArrayList arrayList9 = h1Var.f;
                arrayList9.clear();
                arrayList9.addAll((ArrayList) obj);
                h1Var.h = false;
                org.telegram.ui.Components.y51 y51Var = h1Var.a;
                if (y51Var != null) {
                    y51Var.Y2.N(true);
                    break;
                }
                break;
            case 25:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) obj2;
                f1Var.setEnabled(((org.telegram.ui.web.g2) obj).b() != null);
                f1Var.animate().alpha(f1Var.isEnabled() ? 1.0f : 0.5f);
                break;
            case 26:
                ((k0) obj2).f0.run((Integer) obj);
                break;
            case 27:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) obj2;
                z1Var.getMessagesController().removeWebBrowserException((String) obj);
                z1Var.a.Y2.N(true);
                break;
            case 28:
                org.telegram.ui.web.g2 g2Var = (org.telegram.ui.web.g2) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i20 = g2Var.a;
                g2Var.g = true;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    MessagesController.getInstance(i20).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i20).putChats(tL_messages_webPage.chats, false);
                    g2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject2 instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            g2Var.h = tL_webPage;
                        }
                    }
                    g2Var.h = null;
                }
                TLRPC.WebPage webPage = g2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    g2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && g2Var.h != null && (u0Var = g2Var.l) != null) {
                    u0Var.run();
                }
                g2Var.c();
                break;
            default:
                ((org.telegram.ui.web.g2) obj2).m.remove((pb1) obj);
                break;
        }
    }
}
