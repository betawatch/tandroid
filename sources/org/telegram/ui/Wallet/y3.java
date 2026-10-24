package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import android.widget.TextView;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ci1;
import org.telegram.ui.ji1;
import org.telegram.ui.ki1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.wh1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        org.telegram.ui.web.b1 b1Var;
        org.telegram.ui.web.h0 h0Var;
        org.telegram.ui.web.a2 a2Var;
        int i12 = this.a;
        int i13 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Loading));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new da0(AndroidUtilities.dp(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    break;
                }
                break;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((Utilities.Callback2) obj2).run(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                break;
            case 2:
                ((ci.s) obj2).run(((TL_wallet.walletTransaction[]) obj)[0]);
                break;
            case 3:
                ((o5) obj2).O0.remove((w6) obj);
                break;
            case 4:
                j2[] j2VarArr = (j2[]) obj2;
                j2VarArr[0].setOnDismissListener(new g4((TLRPC.User) obj, i13));
                j2VarArr[0].dismiss();
                break;
            case 5:
                new xc(((j2[]) obj2)[0].topBulletinContainer, (org.telegram.ui.ActionBar.g6) obj).Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopiedBulletin)).k(false);
                break;
            case 6:
                super/*android.widget.TextView*/.onDraw((Canvas) obj);
                break;
            case 7:
                super/*org.telegram.ui.Components.q6*/.onDraw((Canvas) obj);
                break;
            case 8:
                super/*org.telegram.ui.Components.q6*/.onDraw((Canvas) obj);
                break;
            case 9:
                ((ViewGroup) obj).removeView(((e6) obj2).h);
                break;
            case 10:
                ((Utilities.Callback) obj2).run((TL_wallet.walletTransaction) obj);
                break;
            case 11:
                t7 t7Var = (t7) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!t7Var.a1 && userFull != null) {
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    t7Var.d(cardVar);
                    break;
                }
                break;
            case 12:
                w7 w7Var = (w7) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                if ((o2Var instanceof o5) && xc.a(o2Var)) {
                    xc.a0(o2Var).M(LocaleController.getString(R.string.WalletImported), LocaleController.getString(R.string.WalletImportedInfo), R.raw.contact_check).j();
                }
                w7Var.finishFragment();
                break;
            case 13:
                ((p0) obj).B();
                ((i8) obj2).a.Z2.N(true);
                break;
            case 14:
                i8 i8Var = (i8) obj2;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i8Var.getParentActivity(), 0, i8Var.getResourceProvider());
                String string = LocaleController.getString(R.string.WalletDisableBackupTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.R = string;
                c2Var.T = LocaleController.getString(R.string.WalletDisableBackupExistingPhraseInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new e8(i13, i8Var, (l0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 15:
                ((org.telegram.ui.ActionBar.c2[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                break;
            case 16:
                ((ViewGroup) obj).removeView(((w9) obj2).h);
                break;
            case 17:
                wh1 wh1Var = (wh1) obj2;
                int[] iArr = (int[]) obj;
                wh1Var.getClass();
                int i14 = iArr[0] - 1;
                iArr[0] = i14;
                if (i14 == 0) {
                    WallpapersListActivity wallpapersListActivity = wh1Var.a;
                    int[][] iArr2 = WallpapersListActivity.k0;
                    wallpapersListActivity.B0(true);
                    break;
                }
                break;
            case 18:
                ci1 ci1Var = (ci1) obj2;
                String str = (String) obj;
                ci1Var.d.clear();
                ci1Var.e.clear();
                ci1Var.f = true;
                ci1Var.F(str, "", true);
                ci1Var.h = str;
                ci1Var.l();
                ci1Var.y = null;
                break;
            case 19:
                ci1 ci1Var2 = (ci1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = ci1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = ci1Var2.x;
                ci1Var2.x = null;
                ci1Var2.F(str2, "", false);
                break;
            case 20:
                String str3 = (String) obj;
                ki1 ki1Var = ((ji1) obj2).a;
                Activity parentActivity = ki1Var.getParentActivity();
                MessageObject messageObject = ki1Var.n;
                if (parentActivity != null) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d(str3);
                    }
                    str3.getClass();
                    if (str3.equals("share_game")) {
                        messageObject.messageOwner.with_my_score = false;
                    } else if (str3.equals("share_score")) {
                        messageObject.messageOwner.with_my_score = true;
                    }
                    ki1Var.showDialog(ir0.S0(ki1Var.getParentActivity(), messageObject, null, false, ki1Var.h));
                    break;
                }
                break;
            case 21:
                org.telegram.ui.web.b1 b1Var2 = (org.telegram.ui.web.b1) obj2;
                gi.r rVar = b1Var2.j0;
                rVar.f = true;
                rVar.k();
                b1Var2.v((ci.y7) obj);
                break;
            case 22:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (b1Var = botWebViewContainer$BotWebViewProxy.a) != null && (h0Var = b1Var.c) != null) {
                    h0Var.f(arrayList);
                    break;
                }
                break;
            case 23:
                ArrayList arrayList2 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.d1.c.addAll(0, arrayList2);
                for (int i15 = 0; i15 < longSparseArray.size(); i15++) {
                    org.telegram.ui.web.d1.d.put(longSparseArray.keyAt(i15), (org.telegram.ui.web.c1) longSparseArray.valueAt(i15));
                }
                org.telegram.ui.web.d1.b = true;
                org.telegram.ui.web.d1.a = false;
                ArrayList arrayList3 = org.telegram.ui.web.d1.e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i13 < size) {
                        Object obj3 = arrayList3.get(i13);
                        i13++;
                        ((Utilities.Callback) obj3).run(arrayList2);
                    }
                    org.telegram.ui.web.d1.e = null;
                    break;
                }
                break;
            case 24:
                org.telegram.ui.web.g1 g1Var = ((org.telegram.ui.web.f1) obj2).s;
                ArrayList arrayList4 = g1Var.f;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                g1Var.h = false;
                d71 d71Var = g1Var.a;
                if (d71Var != null) {
                    d71Var.Z2.N(true);
                    break;
                }
                break;
            case 25:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) obj2;
                e1Var.setEnabled(((org.telegram.ui.web.g2) obj).b() != null);
                e1Var.animate().alpha(e1Var.isEnabled() ? 1.0f : 0.5f);
                break;
            case 26:
                ((org.telegram.ui.m0) obj2).f0.run((Integer) obj);
                break;
            case 27:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) obj2;
                y1Var.getMessagesController().removeWebBrowserException((String) obj);
                y1Var.a.Z2.N(true);
                break;
            case 28:
                org.telegram.ui.web.g2 g2Var = (org.telegram.ui.web.g2) obj2;
                TLObject tLObject = (TLObject) obj;
                int i16 = g2Var.a;
                g2Var.g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i16).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_webPage.chats, false);
                    g2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
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
                if (!SharedConfig.onlyLocalInstantView && g2Var.h != null && (a2Var = g2Var.l) != null) {
                    a2Var.run();
                }
                g2Var.c();
                break;
            default:
                ((org.telegram.ui.web.g2) obj2).m.remove((y3) obj);
                break;
        }
    }
}
