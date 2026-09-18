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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qb1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qb1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.wk0 wk0Var;
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
                org.telegram.ui.ActionBar.j6.w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.j6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.j6.x), Double.valueOf(org.telegram.ui.ActionBar.j6.y));
                }
                org.telegram.ui.ActionBar.j6.q1();
                org.telegram.ui.Components.ml0 ml0Var = themeActivity.b;
                if (ml0Var != null && (wk0Var = (org.telegram.ui.Components.wk0) ml0Var.L(themeActivity.Y)) != null) {
                    View view = wk0Var.a;
                    if (view instanceof org.telegram.ui.Cells.ea) {
                        ((org.telegram.ui.Cells.ea) view).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.j6.w, false, false);
                        break;
                    }
                }
                break;
            case 1:
                xd1 xd1Var = (xd1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (xd1Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    xd1Var.A0.f(xd1Var.K0[0], true);
                    break;
                }
                break;
            case 2:
                ce1.X((ce1) obj2, (String) obj);
                break;
            case 3:
                ce1.V((ce1) obj2, (TLRPC.TL_theme) obj);
                break;
            case 4:
                me1 me1Var = (me1) obj2;
                me1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                me1Var.c(true);
                break;
            case 5:
                me1 me1Var2 = (me1) obj2;
                me1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                me1Var2.c(true);
                break;
            case 6:
                lf1 lf1Var = (lf1) obj2;
                lf1Var.getClass();
                Bundle bundle = new Bundle();
                fg1 fg1Var = lf1Var.b;
                bundle.putLong("dialog_id", -fg1Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                fg1Var.presentFragment(new y11(bundle, null));
                break;
            case 7:
                bg1 bg1Var = (bg1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = bg1Var.d0;
                fg1 fg1Var2 = bg1Var.u0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i17 = 0;
                while (true) {
                    ArrayList arrayList3 = fg1Var2.b;
                    if (i17 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        bg1Var.M();
                        if (!arrayList.isEmpty()) {
                            bg1Var.m0 = false;
                            bg1Var.p0.b(0);
                        }
                        bg1Var.K(str2);
                        break;
                    } else {
                        if (((wf1) arrayList3.get(i17)).c != null && ((wf1) arrayList3.get(i17)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((wf1) arrayList3.get(i17)).c);
                            ((wf1) arrayList3.get(i17)).c.searchQuery = lowerCase;
                        }
                        i17++;
                    }
                }
                break;
            case 8:
                ig1 ig1Var = ((hg1) obj2).b;
                ig1Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                ig1Var.a.V();
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
                ih1.g0((ih1) obj2, (String) obj);
                break;
            case 13:
                Runnable runnable = (Runnable) obj;
                for (is isVar : ((ih1) obj2).w.f) {
                    isVar.l(0.0f);
                }
                runnable.run();
                break;
            case 14:
                ph1 ph1Var = (ph1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = ph1Var.f;
                ArrayList<TLRPC.Chat> arrayList5 = ph1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(ph1Var.a).putChats(arrayList5, false);
                ph1Var.d = false;
                ph1Var.c = true;
                int size = arrayList4.size();
                while (i15 < size) {
                    Object obj3 = arrayList4.get(i15);
                    i15++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                break;
            case 15:
                ti1 ti1Var = (ti1) obj2;
                ti1Var.U.a(new ci1(ti1Var, (VoIPService) obj, i16), true);
                break;
            case 16:
                ti1 ti1Var2 = (ti1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.m2.T = false;
                org.telegram.ui.Components.voip.m2.i();
                ViewPropertyAnimator duration = ti1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f;
                duration.setInterpolator(qrVar).start();
                ti1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                ti1Var2.i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                ti1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                valueAnimator.addListener(new hi1(ti1Var2, i13));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(qrVar);
                valueAnimator.start();
                break;
            case 17:
                cj1 cj1Var = (cj1) obj2;
                int[] iArr = (int[]) obj;
                cj1Var.getClass();
                int i18 = iArr[0] - 1;
                iArr[0] = i18;
                if (i18 == 0) {
                    WallpapersListActivity wallpapersListActivity = cj1Var.a;
                    int[][] iArr2 = WallpapersListActivity.i0;
                    wallpapersListActivity.B0(true);
                    break;
                }
                break;
            case 18:
                ij1 ij1Var = (ij1) obj2;
                String str3 = (String) obj;
                ij1Var.d.clear();
                ij1Var.e.clear();
                ij1Var.f = true;
                ij1Var.F(str3, "", true);
                ij1Var.h = str3;
                ij1Var.l();
                ij1Var.y = null;
                break;
            case 19:
                ij1 ij1Var2 = (ij1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = ij1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str4 = ij1Var2.x;
                ij1Var2.x = null;
                ij1Var2.F(str4, "", false);
                break;
            case 20:
                String str5 = (String) obj;
                oj1 oj1Var = ((nj1) obj2).a;
                Activity parentActivity = oj1Var.getParentActivity();
                MessageObject messageObject = oj1Var.n;
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
                    oj1Var.showDialog(org.telegram.ui.Components.iq0.N0(oj1Var.getParentActivity(), messageObject, null, false, oj1Var.h));
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
                ArrayList arrayList9 = h1Var.h;
                arrayList9.clear();
                arrayList9.addAll((ArrayList) obj);
                h1Var.n = false;
                org.telegram.ui.Components.z51 z51Var = h1Var.a;
                if (z51Var != null) {
                    z51Var.Y2.N(true);
                    break;
                }
                break;
            case 25:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj2;
                g1Var.setEnabled(((org.telegram.ui.web.g2) obj).b() != null);
                g1Var.animate().alpha(g1Var.isEnabled() ? 1.0f : 0.5f);
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
                ((org.telegram.ui.web.g2) obj2).m.remove((qb1) obj);
                break;
        }
    }
}
