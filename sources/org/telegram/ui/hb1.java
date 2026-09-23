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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class hb1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hb1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.wk0 wk0Var;
        int i10;
        int i11;
        org.telegram.ui.web.b1 b1Var;
        org.telegram.ui.web.g0 g0Var;
        org.telegram.ui.web.t0 t0Var;
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
                org.telegram.ui.ActionBar.h6.w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.h6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.h6.x), Double.valueOf(org.telegram.ui.ActionBar.h6.y));
                }
                org.telegram.ui.ActionBar.h6.q1();
                org.telegram.ui.Components.ml0 ml0Var = themeActivity.b;
                if (ml0Var != null && (wk0Var = (org.telegram.ui.Components.wk0) ml0Var.K(themeActivity.Y)) != null) {
                    View view = wk0Var.a;
                    if (view instanceof org.telegram.ui.Cells.fa) {
                        ((org.telegram.ui.Cells.fa) view).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.h6.w, false, false);
                        break;
                    }
                }
                break;
            case 1:
                od1 od1Var = (od1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (od1Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    od1Var.A0.f(od1Var.K0[0], true);
                    break;
                }
                break;
            case 2:
                td1.X((td1) obj2, (String) obj);
                break;
            case 3:
                td1.V((td1) obj2, (TLRPC.TL_theme) obj);
                break;
            case 4:
                de1 de1Var = (de1) obj2;
                de1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                de1Var.c(true);
                break;
            case 5:
                de1 de1Var2 = (de1) obj2;
                de1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                de1Var2.c(true);
                break;
            case 6:
                cf1 cf1Var = (cf1) obj2;
                cf1Var.getClass();
                Bundle bundle = new Bundle();
                wf1 wf1Var = cf1Var.b;
                bundle.putLong("dialog_id", -wf1Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                wf1Var.presentFragment(new p11(bundle, null));
                break;
            case 7:
                sf1 sf1Var = (sf1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = sf1Var.c0;
                wf1 wf1Var2 = sf1Var.t0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i17 = 0;
                while (true) {
                    ArrayList arrayList3 = wf1Var2.b;
                    if (i17 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        sf1Var.L();
                        if (!arrayList.isEmpty()) {
                            sf1Var.l0 = false;
                            sf1Var.o0.b(0);
                        }
                        sf1Var.J(str2);
                        break;
                    } else {
                        if (((nf1) arrayList3.get(i17)).c != null && ((nf1) arrayList3.get(i17)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((nf1) arrayList3.get(i17)).c);
                            ((nf1) arrayList3.get(i17)).c.searchQuery = lowerCase;
                        }
                        i17++;
                    }
                }
                break;
            case 8:
                zf1 zf1Var = ((yf1) obj2).b;
                zf1Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                zf1Var.a.V();
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
                zg1.g0((zg1) obj2, (String) obj);
                break;
            case 13:
                Runnable runnable = (Runnable) obj;
                for (bs bsVar : ((zg1) obj2).w.f) {
                    bsVar.l(0.0f);
                }
                runnable.run();
                break;
            case 14:
                gh1 gh1Var = (gh1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = gh1Var.f;
                ArrayList<TLRPC.Chat> arrayList5 = gh1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(gh1Var.a).putChats(arrayList5, false);
                gh1Var.d = false;
                gh1Var.c = true;
                int size = arrayList4.size();
                while (i15 < size) {
                    Object obj3 = arrayList4.get(i15);
                    i15++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                break;
            case 15:
                mi1 mi1Var = (mi1) obj2;
                mi1Var.U.a(new vh1(mi1Var, (VoIPService) obj, i16), true);
                break;
            case 16:
                mi1 mi1Var2 = (mi1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.m2.T = false;
                org.telegram.ui.Components.voip.m2.i();
                ViewPropertyAnimator duration = mi1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f;
                duration.setInterpolator(rrVar).start();
                mi1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar).start();
                mi1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar).start();
                mi1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar).start();
                mi1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar).start();
                mi1Var2.j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar).start();
                mi1Var2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(rrVar).start();
                mi1Var2.i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(rrVar).start();
                mi1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(rrVar).start();
                valueAnimator.addListener(new ai1(mi1Var2, i13));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(rrVar);
                valueAnimator.start();
                break;
            case 17:
                vi1 vi1Var = (vi1) obj2;
                int[] iArr = (int[]) obj;
                vi1Var.getClass();
                int i18 = iArr[0] - 1;
                iArr[0] = i18;
                if (i18 == 0) {
                    WallpapersListActivity wallpapersListActivity = vi1Var.a;
                    int[][] iArr2 = WallpapersListActivity.k0;
                    wallpapersListActivity.B0(true);
                    break;
                }
                break;
            case 18:
                bj1 bj1Var = (bj1) obj2;
                String str3 = (String) obj;
                bj1Var.d.clear();
                bj1Var.e.clear();
                bj1Var.f = true;
                bj1Var.F(str3, "", true);
                bj1Var.h = str3;
                bj1Var.l();
                bj1Var.y = null;
                break;
            case 19:
                bj1 bj1Var2 = (bj1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = bj1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str4 = bj1Var2.x;
                bj1Var2.x = null;
                bj1Var2.F(str4, "", false);
                break;
            case 20:
                String str5 = (String) obj;
                hj1 hj1Var = ((gj1) obj2).a;
                Activity parentActivity = hj1Var.getParentActivity();
                MessageObject messageObject = hj1Var.n;
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
                    hj1Var.showDialog(org.telegram.ui.Components.hq0.N0(hj1Var.getParentActivity(), messageObject, null, false, hj1Var.h));
                    break;
                }
                break;
            case 21:
                org.telegram.ui.web.b1 b1Var2 = (org.telegram.ui.web.b1) obj2;
                ei.r rVar = b1Var2.j0;
                rVar.f = true;
                rVar.k();
                b1Var2.w((ai.da) obj);
                break;
            case 22:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (b1Var = botWebViewContainer$BotWebViewProxy.a) != null && (g0Var = b1Var.c) != null) {
                    g0Var.f(arrayList6);
                    break;
                }
                break;
            case 23:
                ArrayList arrayList7 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.d1.c.addAll(0, arrayList7);
                for (int i19 = 0; i19 < longSparseArray.size(); i19++) {
                    org.telegram.ui.web.d1.d.put(longSparseArray.keyAt(i19), (org.telegram.ui.web.c1) longSparseArray.valueAt(i19));
                }
                org.telegram.ui.web.d1.b = true;
                org.telegram.ui.web.d1.a = false;
                ArrayList arrayList8 = org.telegram.ui.web.d1.e;
                if (arrayList8 != null) {
                    int size2 = arrayList8.size();
                    while (i14 < size2) {
                        Object obj4 = arrayList8.get(i14);
                        i14++;
                        ((Utilities.Callback) obj4).run(arrayList7);
                    }
                    org.telegram.ui.web.d1.e = null;
                    break;
                }
                break;
            case 24:
                org.telegram.ui.web.g1 g1Var = ((org.telegram.ui.web.f1) obj2).h;
                ArrayList arrayList9 = g1Var.f;
                arrayList9.clear();
                arrayList9.addAll((ArrayList) obj);
                g1Var.h = false;
                org.telegram.ui.Components.x51 x51Var = g1Var.a;
                if (x51Var != null) {
                    x51Var.Y2.N(true);
                    break;
                }
                break;
            case 25:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) obj2;
                f1Var.setEnabled(((org.telegram.ui.web.f2) obj).b() != null);
                f1Var.animate().alpha(f1Var.isEnabled() ? 1.0f : 0.5f);
                break;
            case 26:
                ((l0) obj2).f0.run((Integer) obj);
                break;
            case 27:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) obj2;
                y1Var.getMessagesController().removeWebBrowserException((String) obj);
                y1Var.a.Y2.N(true);
                break;
            case 28:
                org.telegram.ui.web.f2 f2Var = (org.telegram.ui.web.f2) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i20 = f2Var.a;
                f2Var.g = true;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    MessagesController.getInstance(i20).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i20).putChats(tL_messages_webPage.chats, false);
                    f2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject2 instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            f2Var.h = tL_webPage;
                        }
                    }
                    f2Var.h = null;
                }
                TLRPC.WebPage webPage = f2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    f2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && f2Var.h != null && (t0Var = f2Var.l) != null) {
                    t0Var.run();
                }
                f2Var.c();
                break;
            default:
                ((org.telegram.ui.web.f2) obj2).m.remove((hb1) obj);
                break;
        }
    }
}
