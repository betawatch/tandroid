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
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.dr0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xc;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.di1;
import org.telegram.ui.ei1;
import org.telegram.ui.gn0;
import org.telegram.ui.rh1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.xh1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        org.telegram.ui.web.a1 a1Var;
        org.telegram.ui.web.g0 g0Var;
        org.telegram.ui.web.z1 z1Var;
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
                        spannableString.setSpan(new ca0(AndroidUtilities.dp(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    break;
                }
                break;
            case 1:
                ((w3) obj2).run(((TL_wallet.walletTransaction[]) obj)[0]);
                break;
            case 2:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((Utilities.Callback2) obj2).run(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                break;
            case 3:
                ((m5) obj2).O0.remove((c7) obj);
                break;
            case 4:
                k2[] k2VarArr = (k2[]) obj2;
                k2VarArr[0].setOnDismissListener(new g4((TLRPC.User) obj, i13));
                k2VarArr[0].dismiss();
                break;
            case 5:
                new xc(((k2[]) obj2)[0].topBulletinContainer, (org.telegram.ui.ActionBar.d6) obj).Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopiedBulletin)).k(false);
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
                ((ViewGroup) obj).removeView(((k6) obj2).h);
                break;
            case 10:
                ((Utilities.Callback) obj2).run((TL_wallet.walletTransaction) obj);
                break;
            case 11:
                z7 z7Var = (z7) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!z7Var.V0 && userFull != null) {
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    z7Var.d(cardVar);
                    break;
                }
                break;
            case 12:
                c8 c8Var = (c8) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if ((n2Var instanceof m5) && xc.a(n2Var)) {
                    xc.a0(n2Var).M(LocaleController.getString(R.string.WalletImported), LocaleController.getString(R.string.WalletImportedInfo), R.raw.contact_check).j();
                }
                c8Var.finishFragment();
                break;
            case 13:
                ((q0) obj).B();
                ((n8) obj2).a.W2.N(true);
                break;
            case 14:
                n8 n8Var = (n8) obj2;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n8Var.getParentActivity(), 0, n8Var.getResourceProvider());
                String string = LocaleController.getString(R.string.WalletDisableBackupTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.WalletDisableBackupExistingPhraseInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new gn0(28, n8Var, (m0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            case 15:
                ((org.telegram.ui.ActionBar.b2[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                break;
            case 16:
                ((ViewGroup) obj).removeView(((aa) obj2).h);
                break;
            case 17:
                rh1 rh1Var = (rh1) obj2;
                int[] iArr = (int[]) obj;
                rh1Var.getClass();
                int i14 = iArr[0] - 1;
                iArr[0] = i14;
                if (i14 == 0) {
                    WallpapersListActivity wallpapersListActivity = rh1Var.a;
                    int[][] iArr2 = WallpapersListActivity.k0;
                    wallpapersListActivity.B0(true);
                    break;
                }
                break;
            case 18:
                xh1 xh1Var = (xh1) obj2;
                String str = (String) obj;
                xh1Var.d.clear();
                xh1Var.e.clear();
                xh1Var.f = true;
                xh1Var.F(str, "", true);
                xh1Var.h = str;
                xh1Var.l();
                xh1Var.y = null;
                break;
            case 19:
                xh1 xh1Var2 = (xh1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = xh1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = xh1Var2.x;
                xh1Var2.x = null;
                xh1Var2.F(str2, "", false);
                break;
            case 20:
                String str3 = (String) obj;
                ei1 ei1Var = ((di1) obj2).a;
                Activity parentActivity = ei1Var.getParentActivity();
                MessageObject messageObject = ei1Var.n;
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
                    ei1Var.showDialog(dr0.O0(ei1Var.getParentActivity(), messageObject, null, false, ei1Var.h));
                    break;
                }
                break;
            case 21:
                org.telegram.ui.web.a1 a1Var2 = (org.telegram.ui.web.a1) obj2;
                gi.r rVar = a1Var2.j0;
                rVar.f = true;
                rVar.k();
                a1Var2.v((ci.z7) obj);
                break;
            case 22:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (a1Var = botWebViewContainer$BotWebViewProxy.a) != null && (g0Var = a1Var.c) != null) {
                    g0Var.f(arrayList);
                    break;
                }
                break;
            case 23:
                ArrayList arrayList2 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.c1.c.addAll(0, arrayList2);
                for (int i15 = 0; i15 < longSparseArray.size(); i15++) {
                    org.telegram.ui.web.c1.d.put(longSparseArray.keyAt(i15), (org.telegram.ui.web.b1) longSparseArray.valueAt(i15));
                }
                org.telegram.ui.web.c1.b = true;
                org.telegram.ui.web.c1.a = false;
                ArrayList arrayList3 = org.telegram.ui.web.c1.e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i13 < size) {
                        Object obj3 = arrayList3.get(i13);
                        i13++;
                        ((Utilities.Callback) obj3).run(arrayList2);
                    }
                    org.telegram.ui.web.c1.e = null;
                    break;
                }
                break;
            case 24:
                org.telegram.ui.web.f1 f1Var = ((org.telegram.ui.web.e1) obj2).s;
                ArrayList arrayList4 = f1Var.f;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                f1Var.h = false;
                u61 u61Var = f1Var.a;
                if (u61Var != null) {
                    u61Var.W2.N(true);
                    break;
                }
                break;
            case 25:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) obj2;
                e1Var.setEnabled(((org.telegram.ui.web.f2) obj).b() != null);
                e1Var.animate().alpha(e1Var.isEnabled() ? 1.0f : 0.5f);
                break;
            case 26:
                ((org.telegram.ui.n0) obj2).f0.run((Integer) obj);
                break;
            case 27:
                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) obj2;
                x1Var.getMessagesController().removeWebBrowserException((String) obj);
                x1Var.a.W2.N(true);
                break;
            case 28:
                org.telegram.ui.web.f2 f2Var = (org.telegram.ui.web.f2) obj2;
                TLObject tLObject = (TLObject) obj;
                int i16 = f2Var.a;
                f2Var.g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i16).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_webPage.chats, false);
                    f2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
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
                if (!SharedConfig.onlyLocalInstantView && f2Var.h != null && (z1Var = f2Var.l) != null) {
                    z1Var.run();
                }
                f2Var.c();
                break;
            default:
                ((org.telegram.ui.web.f2) obj2).m.remove((u3) obj);
                break;
        }
    }
}
