package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class o71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o71(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.wl0 wl0Var;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 1;
        int i13 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.xc.a0((c81) obj2).k(false).j();
                break;
            case 1:
                c81.W((c81) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 2:
                v71 v71Var = (v71) obj2;
                a0.h hVar = (a0.h) obj;
                c81 c81Var = v71Var.e1;
                org.telegram.ui.Components.xc.x(c81Var.getParentActivity(), c81Var.b, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, v71Var.getThemedColor(org.telegram.ui.ActionBar.k6.Fi), v71Var.getThemedColor(org.telegram.ui.ActionBar.k6.Hi)).j();
                break;
            case 3:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                new m81(o2Var.getContext(), o2Var.getCurrentAccount(), o2Var.getResourceProvider(), (org.telegram.ui.ActionBar.m3) obj).show();
                break;
            case 4:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.l8) obj);
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
                org.telegram.ui.ActionBar.k6.w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.k6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.k6.x), Double.valueOf(org.telegram.ui.ActionBar.k6.y));
                }
                org.telegram.ui.ActionBar.k6.t1();
                org.telegram.ui.Components.mm0 mm0Var = themeActivity2.b;
                if (mm0Var != null && (wl0Var = (org.telegram.ui.Components.wl0) mm0Var.K(themeActivity2.Y)) != null) {
                    View view2 = wl0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.ca) {
                        ((org.telegram.ui.Cells.ca) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.k6.w, false, false);
                        break;
                    }
                }
                break;
            case 7:
                qc1 qc1Var = (qc1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (qc1Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    qc1Var.B0.f(qc1Var.L0[0], true);
                    break;
                }
                break;
            case 8:
                uc1.X((uc1) obj2, (String) obj);
                break;
            case 9:
                uc1.V((uc1) obj2, (TLRPC.TL_theme) obj);
                break;
            case 10:
                ed1 ed1Var = (ed1) obj2;
                ed1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                ed1Var.c(true);
                break;
            case 11:
                ed1 ed1Var2 = (ed1) obj2;
                ed1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                ed1Var2.c(true);
                break;
            case 12:
                de1 de1Var = (de1) obj2;
                de1Var.getClass();
                Bundle bundle = new Bundle();
                ye1 ye1Var = de1Var.b;
                bundle.putLong("dialog_id", -ye1Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                ye1Var.presentFragment(new d11(bundle, null));
                break;
            case 13:
                te1 te1Var = (te1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = te1Var.c0;
                ye1 ye1Var2 = te1Var.t0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i14 = 0;
                while (true) {
                    ArrayList arrayList3 = ye1Var2.b;
                    if (i14 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        te1Var.L();
                        if (!arrayList.isEmpty()) {
                            te1Var.l0 = false;
                            te1Var.o0.b(0);
                        }
                        te1Var.J(str2);
                        break;
                    } else {
                        if (((oe1) arrayList3.get(i14)).c != null && ((oe1) arrayList3.get(i14)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((oe1) arrayList3.get(i14)).c);
                            ((oe1) arrayList3.get(i14)).c.searchQuery = lowerCase;
                        }
                        i14++;
                    }
                }
                break;
            case 14:
                bf1 bf1Var = ((af1) obj2).b;
                bf1Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                bf1Var.a.V();
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
                bg1.g0((bg1) obj2, (String) obj);
                break;
            case 19:
                Runnable runnable = (Runnable) obj;
                vr[] vrVarArr = ((bg1) obj2).w.f;
                int length = vrVarArr.length;
                while (i13 < length) {
                    vrVarArr[i13].l(0.0f);
                    i13++;
                }
                runnable.run();
                break;
            case 20:
                hg1 hg1Var = (hg1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = hg1Var.f;
                ArrayList<TLRPC.Chat> arrayList5 = hg1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(hg1Var.a).putChats(arrayList5, false);
                hg1Var.d = false;
                hg1Var.c = true;
                int size = arrayList4.size();
                while (i13 < size) {
                    Object obj3 = arrayList4.get(i13);
                    i13++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                break;
            case 21:
                oh1 oh1Var = (oh1) obj2;
                oh1Var.U.a(new xg1(oh1Var, (VoIPService) obj, i12), true);
                break;
            case 22:
                oh1 oh1Var2 = (oh1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.k2.U = false;
                org.telegram.ui.Components.voip.k2.i();
                ViewPropertyAnimator duration = oh1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f;
                duration.setInterpolator(bsVar).start();
                oh1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                oh1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                oh1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                oh1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                oh1Var2.j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                oh1Var2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(bsVar).start();
                oh1Var2.i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(bsVar).start();
                oh1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(bsVar).start();
                valueAnimator.addListener(new ch1(oh1Var2, i11));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(bsVar);
                valueAnimator.start();
                break;
            case 23:
                MessagesController.getInstance(((org.telegram.ui.Wallet.l0) obj2).a).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                break;
            case 24:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj2;
                org.telegram.ui.Wallet.l0.F("enable backup: ready! getting secret phrase...");
                l0Var.y(new ai.r5(24, l0Var, (org.telegram.ui.Wallet.x7) obj), false, true);
                break;
            case 25:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Wallet.q qVar = (org.telegram.ui.Wallet.q) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    qVar.run();
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) obj2;
                org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) obj;
                org.telegram.ui.Wallet.l0.F("emulate disable backup: ready");
                if (l0Var2.u() > 0) {
                    WalletEngine2 walletEngine2 = l0Var2.b;
                    if (walletEngine2 != null) {
                        walletEngine2.emulateRotateKey(new org.telegram.ui.Wallet.d(l0Var2, jVar));
                        break;
                    } else {
                        org.telegram.ui.Wallet.l0.i("emulate disable backup: no engine!");
                        jVar.run(null, "NULL_ENGINE");
                        break;
                    }
                } else {
                    jVar.run(500000L, null);
                    break;
                }
            case 27:
                Exception exc = (Exception) obj;
                ((ai.q) obj2).run(null, exc.getMessage() == null ? "NULL_ERROR" : exc.getMessage());
                break;
            case 28:
                MessagesController.getInstance(((org.telegram.ui.Wallet.e2) obj2).a).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                break;
            default:
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                o2Var2.presentFragment(new org.telegram.ui.Wallet.j9(o2Var2.getCurrentAccount(), ((TL_wallet.card) obj).address));
                break;
        }
    }

    public /* synthetic */ o71(v71 v71Var, a0.h hVar, int i10) {
        this.a = 2;
        this.b = v71Var;
        this.c = hVar;
    }
}
