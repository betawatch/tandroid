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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n81(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.gl0 gl0Var;
        int i10;
        int i11;
        org.telegram.ui.web.b1 b1Var;
        org.telegram.ui.web.g0 g0Var;
        int i12 = this.a;
        int i13 = 2;
        int i14 = 0;
        int i15 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.yc.a0((z81) obj2).k(false).j();
                break;
            case 1:
                z81.W((z81) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 2:
                s81 s81Var = (s81) obj2;
                a0.i iVar = (a0.i) obj;
                z81 z81Var = s81Var.b1;
                org.telegram.ui.Components.yc.x(z81Var.getParentActivity(), z81Var.b, iVar.m(), iVar.m() == 1 ? ((TLRPC.Dialog) iVar.n(0)).id : 0L, s81Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), s81Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                break;
            case 3:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                new k91(m2Var.getContext(), m2Var.getCurrentAccount(), m2Var.getResourceProvider(), (oc) obj).show();
                break;
            case 4:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.m8) obj);
                break;
            case 5:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    break;
                }
                break;
            case 6:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.h6.w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.h6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.h6.x), Double.valueOf(org.telegram.ui.ActionBar.h6.y));
                }
                org.telegram.ui.ActionBar.h6.q1();
                org.telegram.ui.Components.wl0 wl0Var = themeActivity2.b;
                if (wl0Var != null && (gl0Var = (org.telegram.ui.Components.gl0) wl0Var.K(themeActivity2.Y)) != null) {
                    View view2 = gl0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.ea) {
                        ((org.telegram.ui.Cells.ea) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.h6.w, false, false);
                        break;
                    }
                }
                break;
            case 7:
                od1 od1Var = (od1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (od1Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    od1Var.A0.f(od1Var.K0[0], true);
                    break;
                }
                break;
            case 8:
                td1.X((td1) obj2, (String) obj);
                break;
            case 9:
                td1.V((td1) obj2, (TLRPC.TL_theme) obj);
                break;
            case 10:
                de1 de1Var = (de1) obj2;
                de1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                de1Var.c(true);
                break;
            case 11:
                de1 de1Var2 = (de1) obj2;
                de1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                de1Var2.c(true);
                break;
            case 12:
                cf1 cf1Var = (cf1) obj2;
                cf1Var.getClass();
                Bundle bundle = new Bundle();
                wf1 wf1Var = cf1Var.b;
                bundle.putLong("dialog_id", -wf1Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                wf1Var.presentFragment(new n11(bundle, null));
                break;
            case 13:
                sf1 sf1Var = (sf1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = sf1Var.c0;
                wf1 wf1Var2 = sf1Var.t0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i16 = 0;
                while (true) {
                    ArrayList arrayList3 = wf1Var2.b;
                    if (i16 >= arrayList3.size()) {
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
                        if (((nf1) arrayList3.get(i16)).c != null && ((nf1) arrayList3.get(i16)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((nf1) arrayList3.get(i16)).c);
                            ((nf1) arrayList3.get(i16)).c.searchQuery = lowerCase;
                        }
                        i16++;
                    }
                }
                break;
            case 14:
                zf1 zf1Var = ((yf1) obj2).b;
                zf1Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                zf1Var.a.V();
                break;
            case 15:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                break;
            case 16:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                break;
            case 17:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                break;
            case 18:
                zg1.g0((zg1) obj2, (String) obj);
                break;
            case 19:
                Runnable runnable = (Runnable) obj;
                as[] asVarArr = ((zg1) obj2).w.f;
                int length = asVarArr.length;
                while (i14 < length) {
                    asVarArr[i14].l(0.0f);
                    i14++;
                }
                runnable.run();
                break;
            case 20:
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
                while (i14 < size) {
                    Object obj3 = arrayList4.get(i14);
                    i14++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                break;
            case 21:
                mi1 mi1Var = (mi1) obj2;
                mi1Var.U.a(new vh1(mi1Var, (VoIPService) obj, i15), true);
                break;
            case 22:
                mi1 mi1Var2 = (mi1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.n2.T = false;
                org.telegram.ui.Components.voip.n2.i();
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
            case 23:
                vi1 vi1Var = (vi1) obj2;
                int[] iArr = (int[]) obj;
                vi1Var.getClass();
                int i17 = iArr[0] - 1;
                iArr[0] = i17;
                if (i17 == 0) {
                    WallpapersListActivity wallpapersListActivity = vi1Var.a;
                    int[][] iArr2 = WallpapersListActivity.k0;
                    wallpapersListActivity.B0(true);
                    break;
                }
                break;
            case 24:
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
            case 25:
                bj1 bj1Var2 = (bj1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = bj1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str4 = bj1Var2.x;
                bj1Var2.x = null;
                bj1Var2.F(str4, "", false);
                break;
            case 26:
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
                    hj1Var.showDialog(org.telegram.ui.Components.uq0.N0(hj1Var.getParentActivity(), messageObject, null, false, hj1Var.h));
                    break;
                }
                break;
            case 27:
                org.telegram.ui.web.b1 b1Var2 = (org.telegram.ui.web.b1) obj2;
                ei.r rVar = b1Var2.j0;
                rVar.f = true;
                rVar.k();
                b1Var2.w((ai.da) obj);
                break;
            case 28:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (b1Var = botWebViewContainer$BotWebViewProxy.a) != null && (g0Var = b1Var.c) != null) {
                    g0Var.f(arrayList6);
                    break;
                }
                break;
            default:
                ArrayList arrayList7 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.d1.c.addAll(0, arrayList7);
                for (int i18 = 0; i18 < longSparseArray.size(); i18++) {
                    org.telegram.ui.web.d1.d.put(longSparseArray.keyAt(i18), (org.telegram.ui.web.c1) longSparseArray.valueAt(i18));
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
        }
    }

    public /* synthetic */ n81(s81 s81Var, a0.i iVar, int i10) {
        this.a = 2;
        this.b = s81Var;
        this.c = iVar;
    }
}
