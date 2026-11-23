package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import android.widget.TextView;
import c8.hb;
import java.util.ArrayList;
import org.telegram.messenger.al;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ad1;
import org.telegram.ui.nc1;
import org.telegram.ui.sc1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.yi0;
import org.telegram.ui.zc1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10;
        org.telegram.ui.web.v0 v0Var;
        org.telegram.ui.web.c0 c0Var;
        int i11 = this.a;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                v0 v0Var2 = (v0) obj2;
                j jVar = (j) obj;
                v0.P("emulate disable backup: ready");
                if (v0Var2.A() <= 0) {
                    jVar.a(500000L, null);
                    break;
                } else {
                    WalletEngine2 walletEngine2 = v0Var2.b;
                    if (walletEngine2 == null) {
                        v0.n("emulate disable backup: no engine!");
                        jVar.a(null, "NULL_ENGINE");
                        break;
                    } else {
                        walletEngine2.emulateRotateKey(new e(v0Var2, jVar));
                        break;
                    }
                }
            case 1:
                boolean[] zArr = (boolean[]) obj2;
                n nVar = (n) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    nVar.run();
                    break;
                }
                break;
            case 2:
                mp.u1(((m2) obj2).a).V3((TLRPC.Updates) obj, false);
                break;
            case 3:
                z2 z2Var = (z2) obj2;
                e3 e3Var = (e3) obj;
                if (!z2Var.e) {
                    e3Var.d0 = true;
                    Runnable runnable = z2Var.g;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 4:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((p10) obj2).a(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                break;
            case 5:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(gd.N0(2131748586, null));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new o80(org.telegram.messenger.g0.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    break;
                }
                break;
            case 6:
                ((fi.r) obj2).a(((TL_wallet.walletTransaction[]) obj)[0]);
                break;
            case 7:
                f3[] f3VarArr = (f3[]) obj2;
                f3VarArr[0].setOnDismissListener(new r2((TLRPC.User) obj, i13));
                f3VarArr[0].dismiss();
                break;
            case 8:
                super/*android.widget.TextView*/.onDraw((Canvas) obj);
                break;
            case 9:
                super/*org.telegram.ui.Components.n6*/.onDraw((Canvas) obj);
                break;
            case 10:
                super/*org.telegram.ui.Components.n6*/.onDraw((Canvas) obj);
                break;
            case 11:
                ((ViewGroup) obj).removeView(((f7) obj2).h);
                break;
            case 12:
                ((w10) obj2).a((TL_wallet.walletTransaction) obj);
                break;
            case 13:
                s8 s8Var = (s8) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!s8Var.b1 && userFull != null) {
                    s8Var.D1 = SystemClock.elapsedRealtime();
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    s8Var.d(cardVar);
                    break;
                }
                break;
            case 14:
                v8 v8Var = (v8) obj2;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                if ((g2Var instanceof o6) && kc.a(g2Var)) {
                    kc.b0(g2Var).I(R.raw.contact_check, gd.N0(2131742837, null), gd.N0(2131742836, null)).j();
                }
                v8Var.finishFragment();
                break;
            case 15:
                ((a1) obj).C();
                ((e9) obj2).a.g3.O(true);
                break;
            case 16:
                e9 e9Var = (e9) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e9Var.getParentActivity(), e9Var.getResourceProvider());
                String N0 = gd.N0(2131742880, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = gd.N0(2131742882, null);
                alertDialog$Builder.h(gd.N0(2131752577, null), null);
                alertDialog$Builder.k(gd.N0(2131742885, null), new yi0(29, e9Var, (v0) obj2));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 17:
                ((org.telegram.ui.ActionBar.t1[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                break;
            case 18:
                ((ViewGroup) obj).removeView(((sa) obj2).h);
                break;
            case 19:
                nc1 nc1Var = (nc1) obj2;
                int[] iArr = (int[]) obj;
                nc1Var.getClass();
                int i14 = iArr[0] - 1;
                iArr[0] = i14;
                if (i14 == 0) {
                    nc1Var.a.G0(true);
                    break;
                }
                break;
            case 20:
                sc1 sc1Var = (sc1) obj2;
                String str = (String) obj;
                sc1Var.d.clear();
                sc1Var.e.clear();
                sc1Var.f = true;
                sc1Var.F(str, "", true);
                sc1Var.h = str;
                sc1Var.f();
                sc1Var.E = null;
                break;
            case 21:
                sc1 sc1Var2 = (sc1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity = sc1Var2.F;
                i7 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
                mp.u1(i7).f4(tL_contacts_resolvedPeer.users, false);
                i10 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
                mp.u1(i10).Z3(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = sc1Var2.y;
                sc1Var2.y = null;
                sc1Var2.F(str2, "", false);
                break;
            case 22:
                String str3 = (String) obj;
                ad1 ad1Var = ((zc1) obj2).a;
                Activity parentActivity = ad1Var.getParentActivity();
                fj fjVar = ad1Var.n;
                if (parentActivity != null) {
                    if (org.telegram.messenger.s2.a) {
                        org.telegram.messenger.a8.b(str3);
                    }
                    str3.getClass();
                    if (str3.equals("share_game")) {
                        fjVar.k.with_my_score = false;
                    } else if (str3.equals("share_score")) {
                        fjVar.k.with_my_score = true;
                    }
                    ad1Var.showDialog(zo0.O0(ad1Var.getParentActivity(), fjVar, null, false, ad1Var.h));
                    break;
                }
                break;
            case 23:
                org.telegram.ui.web.v0 v0Var3 = (org.telegram.ui.web.v0) obj2;
                ki.p pVar = v0Var3.k0;
                pVar.f = true;
                pVar.k();
                v0Var3.v((fi.f7) obj);
                break;
            case 24:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (v0Var = botWebViewContainer$BotWebViewProxy.a) != null && (c0Var = v0Var.c) != null) {
                    c0Var.f(arrayList);
                    break;
                }
                break;
            case 25:
                ArrayList arrayList2 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                hb.c.addAll(0, arrayList2);
                for (int i15 = 0; i15 < longSparseArray.size(); i15++) {
                    hb.d.put(longSparseArray.keyAt(i15), (org.telegram.ui.web.w0) longSparseArray.valueAt(i15));
                }
                hb.b = true;
                hb.a = false;
                ArrayList arrayList3 = hb.e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i12 < size) {
                        Object obj3 = arrayList3.get(i12);
                        i12++;
                        ((w10) obj3).a(arrayList2);
                    }
                    hb.e = null;
                    break;
                }
                break;
            case 26:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) ((hi.b3) obj2).c;
                ArrayList arrayList4 = x0Var.h;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                x0Var.n = false;
                bi.i6 i6Var = x0Var.a;
                if (i6Var != null) {
                    i6Var.g3.O(true);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) obj2;
                y0Var.setEnabled(((org.telegram.ui.web.u1) obj).b() != null);
                y0Var.animate().alpha(y0Var.isEnabled() ? 1.0f : 0.5f);
                break;
            case 28:
                ((org.telegram.ui.l0) obj2).g0.a((Integer) obj);
                break;
            default:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) obj2;
                mp messagesController = n1Var.getMessagesController();
                messagesController.getClass();
                TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
                togglewebbrowsersettingsexception.url = (String) obj;
                togglewebbrowsersettingsexception.delete = true;
                messagesController.getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new al(messagesController, 3));
                n1Var.a.g3.O(true);
                break;
        }
    }

    public /* synthetic */ r(e9 e9Var, v0 v0Var) {
        this.a = 16;
        this.c = e9Var;
        this.b = v0Var;
    }
}
