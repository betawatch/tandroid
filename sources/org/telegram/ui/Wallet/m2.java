package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.jl;
import org.telegram.messenger.k20;
import org.telegram.messenger.kj;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.u80;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.cp0;
import org.telegram.ui.eo0;
import org.telegram.ui.ie1;
import org.telegram.ui.ne1;
import org.telegram.ui.te1;
import org.telegram.ui.ue1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        org.telegram.ui.web.z0 z0Var;
        org.telegram.ui.web.d0 d0Var;
        int i12 = this.a;
        int i13 = 0;
        int i14 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                u2 u2Var = (u2) obj2;
                z2 z2Var = (z2) obj;
                if (!u2Var.e) {
                    z2Var.c0 = true;
                    Runnable runnable = u2Var.g;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj2;
                k2Var.presentFragment(new r9(k2Var.getCurrentAccount(), ((TL_wallet.card) obj).address));
                break;
            case 2:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(dd.L0(2131748789, null));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new u80(org.telegram.messenger.i0.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    break;
                }
                break;
            case 3:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((k20) obj2).a(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                break;
            case 4:
                ((q4) obj2).a(((TL_wallet.walletTransaction[]) obj)[0]);
                break;
            case 5:
                ((b6) obj2).P0.remove((k7) obj);
                break;
            case 6:
                a3[] a3VarArr = (a3[]) obj2;
                a3VarArr[0].setOnDismissListener(new l2((TLRPC.User) obj, i14));
                a3VarArr[0].dismiss();
                break;
            case 7:
                new cc(((a3[]) obj2)[0].E, (org.telegram.ui.ActionBar.p6) obj).Q(R.raw.copy, 36, dd.L0(2131743227, null)).k(false);
                break;
            case 8:
                super/*android.widget.TextView*/.onDraw((Canvas) obj);
                break;
            case 9:
                super/*org.telegram.ui.Components.f6*/.onDraw((Canvas) obj);
                break;
            case 10:
                super/*org.telegram.ui.Components.f6*/.onDraw((Canvas) obj);
                break;
            case 11:
                ((ViewGroup) obj).removeView(((s6) obj2).h);
                break;
            case 12:
                ((r20) obj2).a((TL_wallet.walletTransaction) obj);
                break;
            case 13:
                h8 h8Var = (h8) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!h8Var.a1 && userFull != null) {
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    h8Var.d(cardVar);
                    break;
                }
                break;
            case 14:
                k8 k8Var = (k8) obj2;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj;
                if ((k2Var2 instanceof b6) && cc.a(k2Var2)) {
                    cc.a0(k2Var2).I(R.raw.contact_check, dd.L0(2131743115, null), dd.L0(2131743114, null)).j();
                }
                k8Var.finishFragment();
                break;
            case 15:
                ((p0) obj).B();
                ((t8) obj2).a.f3.O(true);
                break;
            case 16:
                t8 t8Var = (t8) obj2;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, t8Var.getParentActivity(), t8Var.getResourceProvider());
                String L0 = dd.L0(2131743157, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = dd.L0(2131743159, null);
                alertDialog$Builder.h(dd.L0(2131752589, null), null);
                alertDialog$Builder.k(dd.L0(2131743162, null), new cp0(26, t8Var, (k0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 17:
                ((org.telegram.ui.ActionBar.x1[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                break;
            case 18:
                ((ViewGroup) obj).removeView(((fa) obj2).h);
                break;
            case 19:
                ie1 ie1Var = (ie1) obj2;
                int[] iArr = (int[]) obj;
                ie1Var.getClass();
                int i15 = iArr[0] - 1;
                iArr[0] = i15;
                if (i15 == 0) {
                    ie1Var.a.G0(true);
                    break;
                }
                break;
            case 20:
                ne1 ne1Var = (ne1) obj2;
                String str = (String) obj;
                ne1Var.d.clear();
                ne1Var.e.clear();
                ne1Var.f = true;
                ne1Var.F(str, "", true);
                ne1Var.h = str;
                ne1Var.f();
                ne1Var.D = null;
                break;
            case 21:
                ne1 ne1Var2 = (ne1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity = ne1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
                wp.r1(i10).V3(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
                wp.r1(i11).P3(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = ne1Var2.y;
                ne1Var2.y = null;
                ne1Var2.F(str2, "", false);
                break;
            case 22:
                String str3 = (String) obj;
                ue1 ue1Var = ((te1) obj2).a;
                Activity parentActivity = ue1Var.getParentActivity();
                kj kjVar = ue1Var.n;
                if (parentActivity != null) {
                    if (org.telegram.messenger.v2.a) {
                        org.telegram.messenger.f8.b(str3);
                    }
                    str3.getClass();
                    if (str3.equals("share_game")) {
                        kjVar.k.with_my_score = false;
                    } else if (str3.equals("share_score")) {
                        kjVar.k.with_my_score = true;
                    }
                    ue1Var.showDialog(pp0.N0(ue1Var.getParentActivity(), kjVar, null, false, ue1Var.h));
                    break;
                }
                break;
            case 23:
                org.telegram.ui.web.z0 z0Var2 = (org.telegram.ui.web.z0) obj2;
                xh.n nVar = z0Var2.j0;
                nVar.f = true;
                nVar.k();
                z0Var2.v((org.telegram.ui.web.x0) obj);
                break;
            case 24:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (z0Var = botWebViewContainer$BotWebViewProxy.a) != null && (d0Var = z0Var.c) != null) {
                    d0Var.f(arrayList);
                    break;
                }
                break;
            case 25:
                ArrayList arrayList2 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                w7.m6.c.addAll(0, arrayList2);
                for (int i16 = 0; i16 < longSparseArray.size(); i16++) {
                    w7.m6.d.put(longSparseArray.keyAt(i16), (org.telegram.ui.web.a1) longSparseArray.valueAt(i16));
                }
                w7.m6.b = true;
                w7.m6.a = false;
                ArrayList arrayList3 = w7.m6.e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i13 < size) {
                        Object obj3 = arrayList3.get(i13);
                        i13++;
                        ((r20) obj3).a(arrayList2);
                    }
                    w7.m6.e = null;
                    break;
                }
                break;
            case 26:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) ((eo0) obj2).c;
                ArrayList arrayList4 = b1Var.h;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                b1Var.n = false;
                ii iiVar = b1Var.a;
                if (iiVar != null) {
                    iiVar.f3.O(true);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.ActionBar.b1 b1Var2 = (org.telegram.ui.ActionBar.b1) obj2;
                b1Var2.setEnabled(((org.telegram.ui.web.w1) obj).b() != null);
                b1Var2.animate().alpha(b1Var2.isEnabled() ? 1.0f : 0.5f);
                break;
            case 28:
                ((org.telegram.ui.m0) obj2).f0.a((Integer) obj);
                break;
            default:
                org.telegram.ui.web.p1 p1Var = (org.telegram.ui.web.p1) obj2;
                wp messagesController = p1Var.getMessagesController();
                messagesController.getClass();
                TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
                togglewebbrowsersettingsexception.url = (String) obj;
                togglewebbrowsersettingsexception.delete = true;
                messagesController.getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new jl(messagesController, 3));
                p1Var.a.f3.O(true);
                break;
        }
    }
}
