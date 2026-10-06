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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class e91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e91(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.il0 il0Var;
        int i10;
        int i11;
        org.telegram.ui.web.c1 c1Var;
        org.telegram.ui.web.h0 h0Var;
        int i12 = this.a;
        int i13 = 2;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                new k91(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getResourceProvider(), (qc) obj).show();
                break;
            case 1:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.m8) obj);
                break;
            case 2:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    break;
                }
                break;
            case 3:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.i6.w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.i6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.i6.x), Double.valueOf(org.telegram.ui.ActionBar.i6.y));
                }
                org.telegram.ui.ActionBar.i6.q1();
                org.telegram.ui.Components.zl0 zl0Var = themeActivity2.b;
                if (zl0Var != null && (il0Var = (org.telegram.ui.Components.il0) zl0Var.K(themeActivity2.Y)) != null) {
                    View view2 = il0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.ea) {
                        ((org.telegram.ui.Cells.ea) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.i6.w, false, false);
                        break;
                    }
                }
                break;
            case 4:
                pd1 pd1Var = (pd1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (pd1Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    pd1Var.A0.f(pd1Var.K0[0], true);
                    break;
                }
                break;
            case 5:
                ud1.W((ud1) obj2, (String) obj);
                break;
            case 6:
                ud1.T((ud1) obj2, (TLRPC.TL_theme) obj);
                break;
            case 7:
                ee1 ee1Var = (ee1) obj2;
                ee1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                ee1Var.c(true);
                break;
            case 8:
                ee1 ee1Var2 = (ee1) obj2;
                ee1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                ee1Var2.c(true);
                break;
            case 9:
                cf1 cf1Var = (cf1) obj2;
                cf1Var.getClass();
                Bundle bundle = new Bundle();
                wf1 wf1Var = cf1Var.b;
                bundle.putLong("dialog_id", -wf1Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                wf1Var.presentFragment(new p11(bundle, null));
                break;
            case 10:
                sf1 sf1Var = (sf1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = sf1Var.e0;
                wf1 wf1Var2 = sf1Var.v0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i17 = 0;
                while (true) {
                    ArrayList arrayList3 = wf1Var2.b;
                    if (i17 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        sf1Var.N();
                        if (!arrayList.isEmpty()) {
                            sf1Var.n0 = false;
                            sf1Var.q0.b(0);
                        }
                        sf1Var.L(str2);
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
            case 11:
                zf1 zf1Var = ((yf1) obj2).b;
                zf1Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                zf1Var.a.T();
                break;
            case 12:
                TwoStepVerificationActivity.X((TwoStepVerificationActivity) obj2, (byte[]) obj);
                break;
            case 13:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                break;
            case 14:
                TwoStepVerificationActivity.U((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                break;
            case 15:
                zg1.g0((zg1) obj2, (String) obj);
                break;
            case 16:
                Runnable runnable = (Runnable) obj;
                for (es esVar : ((zg1) obj2).w.f) {
                    esVar.l(0.0f);
                }
                runnable.run();
                break;
            case 17:
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
            case 18:
                ki1 ki1Var = (ki1) obj2;
                ki1Var.U.a(new th1(ki1Var, (VoIPService) obj, i16), true);
                break;
            case 19:
                ki1 ki1Var2 = (ki1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.n2.T = false;
                org.telegram.ui.Components.voip.n2.i();
                ViewPropertyAnimator duration = ki1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.f;
                duration.setInterpolator(trVar).start();
                ki1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(trVar).start();
                ki1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(trVar).start();
                ki1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(trVar).start();
                ki1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(trVar).start();
                ki1Var2.j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(trVar).start();
                ki1Var2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(trVar).start();
                ki1Var2.i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(trVar).start();
                ki1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(trVar).start();
                valueAnimator.addListener(new yh1(ki1Var2, i13));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(trVar);
                valueAnimator.start();
                break;
            case 20:
                ti1 ti1Var = (ti1) obj2;
                int[] iArr = (int[]) obj;
                ti1Var.getClass();
                int i18 = iArr[0] - 1;
                iArr[0] = i18;
                if (i18 == 0) {
                    WallpapersListActivity wallpapersListActivity = ti1Var.a;
                    int[][] iArr2 = WallpapersListActivity.i0;
                    wallpapersListActivity.B0(true);
                    break;
                }
                break;
            case 21:
                zi1 zi1Var = (zi1) obj2;
                String str3 = (String) obj;
                zi1Var.d.clear();
                zi1Var.e.clear();
                zi1Var.f = true;
                zi1Var.F(str3, "", true);
                zi1Var.h = str3;
                zi1Var.l();
                zi1Var.y = null;
                break;
            case 22:
                zi1 zi1Var2 = (zi1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = zi1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str4 = zi1Var2.x;
                zi1Var2.x = null;
                zi1Var2.F(str4, "", false);
                break;
            case 23:
                String str5 = (String) obj;
                fj1 fj1Var = ((ej1) obj2).a;
                Activity parentActivity = fj1Var.getParentActivity();
                MessageObject messageObject = fj1Var.n;
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
                    fj1Var.showDialog(org.telegram.ui.Components.br0.K0(fj1Var.getParentActivity(), messageObject, null, false, fj1Var.h));
                    break;
                }
                break;
            case 24:
                org.telegram.ui.web.c1 c1Var2 = (org.telegram.ui.web.c1) obj2;
                ei.s sVar = c1Var2.j0;
                sVar.f = true;
                sVar.k();
                c1Var2.w((ai.da) obj);
                break;
            case 25:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (c1Var = botWebViewContainer$BotWebViewProxy.a) != null && (h0Var = c1Var.c) != null) {
                    h0Var.f(arrayList6);
                    break;
                }
                break;
            case 26:
                ArrayList arrayList7 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.e1.c.addAll(0, arrayList7);
                for (int i19 = 0; i19 < longSparseArray.size(); i19++) {
                    org.telegram.ui.web.e1.d.put(longSparseArray.keyAt(i19), (org.telegram.ui.web.d1) longSparseArray.valueAt(i19));
                }
                org.telegram.ui.web.e1.b = true;
                org.telegram.ui.web.e1.a = false;
                ArrayList arrayList8 = org.telegram.ui.web.e1.e;
                if (arrayList8 != null) {
                    int size2 = arrayList8.size();
                    while (i14 < size2) {
                        Object obj4 = arrayList8.get(i14);
                        i14++;
                        ((Utilities.Callback) obj4).run(arrayList7);
                    }
                    org.telegram.ui.web.e1.e = null;
                    break;
                }
                break;
            case 27:
                org.telegram.ui.web.h1 h1Var = ((org.telegram.ui.web.g1) obj2).h;
                ArrayList arrayList9 = h1Var.h;
                arrayList9.clear();
                arrayList9.addAll((ArrayList) obj);
                h1Var.n = false;
                org.telegram.ui.Components.y61 y61Var = h1Var.a;
                if (y61Var != null) {
                    y61Var.f3.N(true);
                    break;
                }
                break;
            case 28:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) obj2;
                f1Var.setEnabled(((org.telegram.ui.web.h2) obj).b() != null);
                f1Var.animate().alpha(f1Var.isEnabled() ? 1.0f : 0.5f);
                break;
            default:
                ((l0) obj2).f0.run((Integer) obj);
                break;
        }
    }
}
