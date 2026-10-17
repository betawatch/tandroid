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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m71(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.sl0 sl0Var;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 1;
        int i13 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.xc.a0((z71) obj2).k(false).j();
                break;
            case 1:
                z71.W((z71) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 2:
                s71 s71Var = (s71) obj2;
                a0.h hVar = (a0.h) obj;
                z71 z71Var = s71Var.b1;
                org.telegram.ui.Components.xc.x(z71Var.getParentActivity(), z71Var.b, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, s71Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), s71Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                break;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                new j81(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getResourceProvider(), (org.telegram.ui.ActionBar.j3) obj).show();
                break;
            case 4:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.l8) obj);
                break;
            case 5:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.v8) {
                    ((org.telegram.ui.Cells.v8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
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
                org.telegram.ui.ActionBar.h6.r1();
                org.telegram.ui.Components.im0 im0Var = themeActivity2.b;
                if (im0Var != null && (sl0Var = (org.telegram.ui.Components.sl0) im0Var.K(themeActivity2.Y)) != null) {
                    View view2 = sl0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.ba) {
                        ((org.telegram.ui.Cells.ba) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.h6.w, false, false);
                        break;
                    }
                }
                break;
            case 7:
                mc1 mc1Var = (mc1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (mc1Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    mc1Var.A0.f(mc1Var.K0[0], true);
                    break;
                }
                break;
            case 8:
                qc1.X((qc1) obj2, (String) obj);
                break;
            case 9:
                qc1.V((qc1) obj2, (TLRPC.TL_theme) obj);
                break;
            case 10:
                ad1 ad1Var = (ad1) obj2;
                ad1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                ad1Var.c(true);
                break;
            case 11:
                ad1 ad1Var2 = (ad1) obj2;
                ad1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                ad1Var2.c(true);
                break;
            case 12:
                zd1 zd1Var = (zd1) obj2;
                zd1Var.getClass();
                Bundle bundle = new Bundle();
                te1 te1Var = zd1Var.b;
                bundle.putLong("dialog_id", -te1Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                te1Var.presentFragment(new b11(bundle, null));
                break;
            case 13:
                pe1 pe1Var = (pe1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = pe1Var.c0;
                te1 te1Var2 = pe1Var.t0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i14 = 0;
                while (true) {
                    ArrayList arrayList3 = te1Var2.b;
                    if (i14 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        pe1Var.L();
                        if (!arrayList.isEmpty()) {
                            pe1Var.l0 = false;
                            pe1Var.o0.b(0);
                        }
                        pe1Var.J(str2);
                        break;
                    } else {
                        if (((ke1) arrayList3.get(i14)).c != null && ((ke1) arrayList3.get(i14)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((ke1) arrayList3.get(i14)).c);
                            ((ke1) arrayList3.get(i14)).c.searchQuery = lowerCase;
                        }
                        i14++;
                    }
                }
                break;
            case 14:
                we1 we1Var = ((ve1) obj2).b;
                we1Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                we1Var.a.V();
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
                xf1.g0((xf1) obj2, (String) obj);
                break;
            case 19:
                Runnable runnable = (Runnable) obj;
                vr[] vrVarArr = ((xf1) obj2).w.f;
                int length = vrVarArr.length;
                while (i13 < length) {
                    vrVarArr[i13].l(0.0f);
                    i13++;
                }
                runnable.run();
                break;
            case 20:
                dg1 dg1Var = (dg1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = dg1Var.f;
                ArrayList<TLRPC.Chat> arrayList5 = dg1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(dg1Var.a).putChats(arrayList5, false);
                dg1Var.d = false;
                dg1Var.c = true;
                int size = arrayList4.size();
                while (i13 < size) {
                    Object obj3 = arrayList4.get(i13);
                    i13++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                break;
            case 21:
                jh1 jh1Var = (jh1) obj2;
                jh1Var.U.a(new sg1(jh1Var, (VoIPService) obj, i12), true);
                break;
            case 22:
                jh1 jh1Var2 = (jh1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.k2.U = false;
                org.telegram.ui.Components.voip.k2.i();
                ViewPropertyAnimator duration = jh1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f;
                duration.setInterpolator(bsVar).start();
                jh1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                jh1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                jh1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                jh1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                jh1Var2.j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                jh1Var2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(bsVar).start();
                jh1Var2.i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(bsVar).start();
                jh1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(bsVar).start();
                valueAnimator.addListener(new xg1(jh1Var2, i11));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(bsVar);
                valueAnimator.start();
                break;
            case 23:
                MessagesController.getInstance(((org.telegram.ui.Wallet.m0) obj2).a).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                break;
            case 24:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) obj2;
                org.telegram.ui.Wallet.m0.F("enable backup: ready! getting secret phrase...");
                m0Var.y(new ai.q5(24, m0Var, (org.telegram.ui.Wallet.a8) obj), false, true);
                break;
            case 25:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Wallet.r rVar = (org.telegram.ui.Wallet.r) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    rVar.run();
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Wallet.m0 m0Var2 = (org.telegram.ui.Wallet.m0) obj2;
                org.telegram.ui.Wallet.k kVar = (org.telegram.ui.Wallet.k) obj;
                org.telegram.ui.Wallet.m0.F("emulate disable backup: ready");
                if (m0Var2.u() > 0) {
                    WalletEngine2 walletEngine2 = m0Var2.b;
                    if (walletEngine2 != null) {
                        walletEngine2.emulateRotateKey(new org.telegram.ui.Wallet.d(m0Var2, kVar));
                        break;
                    } else {
                        org.telegram.ui.Wallet.m0.i("emulate disable backup: no engine!");
                        kVar.run(null, "NULL_ENGINE");
                        break;
                    }
                } else {
                    kVar.run(500000L, null);
                    break;
                }
            case 27:
                Exception exc = (Exception) obj;
                ((ai.q) obj2).run(null, exc.getMessage() == null ? "NULL_ERROR" : exc.getMessage());
                break;
            case 28:
                MessagesController.getInstance(((org.telegram.ui.Wallet.f2) obj2).a).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                n2Var2.presentFragment(new org.telegram.ui.Wallet.l9(n2Var2.getCurrentAccount(), ((TL_wallet.card) obj).address));
                break;
        }
    }

    public /* synthetic */ m71(s71 s71Var, a0.h hVar, int i10) {
        this.a = 2;
        this.b = s71Var;
        this.c = hVar;
    }
}
