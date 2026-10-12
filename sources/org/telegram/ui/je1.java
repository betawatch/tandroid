package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class je1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ je1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                se1 se1Var = (se1) this.b;
                TLRPC.TodoItem todoItem = (TLRPC.TodoItem) this.c;
                se1Var.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(todoItem.title, false));
                se1Var.c(true);
                break;
            case 1:
                rf1 rf1Var = (rf1) this.b;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.c;
                rf1Var.getClass();
                Bundle bundle = new Bundle();
                lg1 lg1Var = rf1Var.b;
                bundle.putLong("dialog_id", -lg1Var.a);
                bundle.putLong("topic_id", tL_forumTopic.id);
                lg1Var.presentFragment(new c21(bundle, null));
                break;
            case 2:
                hg1 hg1Var = (hg1) this.b;
                String str = (String) this.c;
                ArrayList arrayList = hg1Var.c0;
                lg1 lg1Var2 = hg1Var.t0;
                String lowerCase = str.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList3 = lg1Var2.b;
                    if (i10 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        hg1Var.L();
                        if (!arrayList.isEmpty()) {
                            hg1Var.l0 = false;
                            hg1Var.o0.b(0);
                        }
                        hg1Var.J(str);
                        break;
                    } else {
                        if (((cg1) arrayList3.get(i10)).c != null && ((cg1) arrayList3.get(i10)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((cg1) arrayList3.get(i10)).c);
                            ((cg1) arrayList3.get(i10)).c.searchQuery = lowerCase;
                        }
                        i10++;
                    }
                }
                break;
            case 3:
                ng1 ng1Var = (ng1) this.b;
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) this.c;
                og1 og1Var = ng1Var.b;
                og1Var.a.e.remove(Integer.valueOf(tL_forumTopic2.id));
                og1Var.a.V();
                break;
            case 4:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) this.b, (byte[]) this.c);
                break;
            case 5:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) this.b, (TL_account.updatePasswordSettings) this.c);
                break;
            case 6:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) this.b, (TLRPC.TL_error) this.c);
                break;
            case 7:
                oh1.g0((oh1) this.b, (String) this.c);
                break;
            case 8:
                oh1 oh1Var = (oh1) this.b;
                Runnable runnable = (Runnable) this.c;
                for (ks ksVar : oh1Var.w.f) {
                    ksVar.l(0.0f);
                }
                runnable.run();
                break;
            case 9:
                vh1 vh1Var = (vh1) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList4 = vh1Var.f;
                ArrayList<TLRPC.Chat> arrayList5 = vh1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                int i11 = 0;
                MessagesController.getInstance(vh1Var.a).putChats(arrayList5, false);
                vh1Var.d = false;
                vh1Var.c = true;
                int size = arrayList4.size();
                while (i11 < size) {
                    Object obj = arrayList4.get(i11);
                    i11++;
                    ((Runnable) obj).run();
                }
                arrayList4.clear();
                break;
            case 10:
                dj1 dj1Var = (dj1) this.b;
                dj1Var.U.a(new mi1(dj1Var, (VoIPService) this.c, 1), true);
                break;
            case 11:
                dj1 dj1Var2 = (dj1) this.b;
                ValueAnimator valueAnimator = (ValueAnimator) this.c;
                org.telegram.ui.Components.voip.k2.U = false;
                org.telegram.ui.Components.voip.k2.i();
                ViewPropertyAnimator duration = dj1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f;
                duration.setInterpolator(esVar).start();
                dj1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(esVar).start();
                dj1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(esVar).start();
                dj1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(esVar).start();
                dj1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(esVar).start();
                dj1Var2.j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(esVar).start();
                dj1Var2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(esVar).start();
                dj1Var2.i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(esVar).start();
                dj1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(esVar).start();
                valueAnimator.addListener(new ri1(dj1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(esVar);
                valueAnimator.start();
                break;
            case 12:
                MessagesController.getInstance(((org.telegram.ui.Wallet.j0) this.b).a).lambda$processUpdates$377((TLRPC.Updates) this.c, false);
                break;
            case 13:
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.b;
                org.telegram.ui.Wallet.a7 a7Var = (org.telegram.ui.Wallet.a7) this.c;
                org.telegram.ui.Wallet.j0.E("enable backup: ready! getting secret phrase...");
                j0Var.x(new bi.f0(20, j0Var, a7Var), false, true);
                break;
            case 14:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.Wallet.p pVar = (org.telegram.ui.Wallet.p) this.c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    pVar.run();
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Wallet.j0 j0Var2 = (org.telegram.ui.Wallet.j0) this.b;
                org.telegram.ui.Wallet.i iVar = (org.telegram.ui.Wallet.i) this.c;
                org.telegram.ui.Wallet.j0.E("emulate disable backup: ready");
                if (j0Var2.t() <= 0) {
                    iVar.run(500000L, null);
                    break;
                } else {
                    WalletEngine2 walletEngine2 = j0Var2.b;
                    if (walletEngine2 == null) {
                        org.telegram.ui.Wallet.j0.i("emulate disable backup: no engine!");
                        iVar.run(null, "NULL_ENGINE");
                        break;
                    } else {
                        walletEngine2.emulateRotateKey(new org.telegram.ui.Wallet.d(j0Var2, iVar));
                        break;
                    }
                }
            case 16:
                MessagesController.getInstance(((org.telegram.ui.Wallet.d2) this.b).a).lambda$processUpdates$377((TLRPC.Updates) this.c, false);
                break;
            case 17:
                TextView[] textViewArr = (TextView[]) this.b;
                SpannableString[] spannableStringArr = (SpannableString[]) this.c;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Loading));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new org.telegram.ui.Components.ia0(AndroidUtilities.dp(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    break;
                }
                break;
            case 18:
                ((org.telegram.ui.Wallet.n3) this.b).run(((TL_wallet.walletTransaction[]) this.c)[0]);
                break;
            case 19:
                ((org.telegram.ui.Wallet.z4) this.b).D0.remove((org.telegram.ui.Wallet.l6) this.c);
                break;
            case 20:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.c;
                callback2.run(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                break;
            case 21:
                org.telegram.ui.Wallet.i2[] i2VarArr = (org.telegram.ui.Wallet.i2[]) this.b;
                i2VarArr[0].setOnDismissListener(new org.telegram.ui.Wallet.u3((TLRPC.User) this.c, 0));
                i2VarArr[0].dismiss();
                break;
            case 22:
                new org.telegram.ui.Components.zc(((org.telegram.ui.Wallet.i2[]) this.b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.c6) this.c).Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopiedBulletin)).k(false);
                break;
            case 23:
                org.telegram.ui.Wallet.i2[] i2VarArr2 = (org.telegram.ui.Wallet.i2[]) this.b;
                i2VarArr2[0].setOnDismissListener(new org.telegram.ui.Wallet.u3((TL_wallet.WalletTransactionPeer) this.c, 1));
                i2VarArr2[0].dismiss();
                break;
            case 24:
                ((ViewGroup) this.c).removeView(((org.telegram.ui.Wallet.u5) this.b).h);
                break;
            case 25:
                ((Utilities.Callback) this.b).run((TL_wallet.walletTransaction) this.c);
                break;
            case 26:
                org.telegram.ui.Wallet.z6 z6Var = (org.telegram.ui.Wallet.z6) this.b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.c;
                if ((m2Var instanceof org.telegram.ui.Wallet.z4) && org.telegram.ui.Components.zc.a(m2Var)) {
                    org.telegram.ui.Components.zc.a0(m2Var).M(LocaleController.getString(R.string.WalletImported), LocaleController.getString(R.string.WalletImportedInfo), R.raw.contact_check).j();
                }
                z6Var.finishFragment();
                break;
            case 27:
                org.telegram.ui.Wallet.k7 k7Var = (org.telegram.ui.Wallet.k7) this.b;
                ((org.telegram.ui.Wallet.o0) this.c).B();
                k7Var.a.W2.N(true);
                break;
            case 28:
                org.telegram.ui.Wallet.k7 k7Var2 = (org.telegram.ui.Wallet.k7) this.b;
                org.telegram.ui.Wallet.j0 j0Var3 = (org.telegram.ui.Wallet.j0) this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k7Var2.getParentActivity(), 0, k7Var2.getResourceProvider());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.WalletDisableBackupTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.WalletDisableBackupExistingPhraseInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new cs0(27, k7Var2, j0Var3));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) this.b;
                Runnable runnable2 = (Runnable) this.c;
                a2VarArr[0].dismiss();
                runnable2.run();
                break;
        }
    }
}
