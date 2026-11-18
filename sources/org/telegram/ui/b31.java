package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b31(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.kj0 kj0Var;
        int i7 = this.a;
        int i10 = 2;
        int i11 = 1;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g((String) obj);
                org.telegram.ui.Components.lc.b0((o31) obj2).k(false).j();
                break;
            case 1:
                o31.b0((o31) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 2:
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj2;
                new u31(h2Var.getContext(), h2Var.getCurrentAccount(), h2Var.getResourceProvider(), (li.d) obj).show();
                break;
            case 3:
                ((StickersActivity) obj2).s0((org.telegram.ui.Cells.g8) obj);
                break;
            case 4:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().Q4(true);
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(themeActivity.getMessagesController().e5());
                    break;
                }
                break;
            case 5:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.n6.w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.n6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.n6.x), Double.valueOf(org.telegram.ui.ActionBar.n6.y));
                }
                org.telegram.ui.ActionBar.n6.w1();
                org.telegram.ui.Components.ck0 ck0Var = themeActivity2.b;
                if (ck0Var != null && (kj0Var = (org.telegram.ui.Components.kj0) ck0Var.K(themeActivity2.Z)) != null) {
                    View view2 = kj0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.w9) {
                        ((org.telegram.ui.Cells.w9) view2).c(org.telegram.messenger.gd.M0(2131753779, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.n6.w, false, false);
                        break;
                    }
                }
                break;
            case 6:
                x71 x71Var = (x71) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (x71Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    x71Var.C0.c(x71Var.M0[0]);
                    break;
                }
                break;
            case 7:
                a81.c0((a81) obj2, (String) obj);
                break;
            case 8:
                a81.a0((a81) obj2, (TLRPC.TL_theme) obj);
                break;
            case 9:
                i81 i81Var = (i81) obj2;
                i81Var.getClass();
                org.telegram.messenger.g0.g((String) obj);
                i81Var.c(true);
                break;
            case 10:
                i81 i81Var2 = (i81) obj2;
                i81Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.fj.h0(((TLRPC.TodoItem) obj).title, false));
                i81Var2.c(true);
                break;
            case 11:
                f91 f91Var = (f91) obj2;
                f91Var.getClass();
                Bundle bundle = new Bundle();
                y91 y91Var = f91Var.b;
                bundle.putLong("dialog_id", -y91Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                y91Var.presentFragment(new jx0(bundle, null));
                break;
            case 12:
                u91 u91Var = (u91) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = u91Var.f0;
                y91 y91Var2 = u91Var.w0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = y91Var2.b;
                    if (i13 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        u91Var.J();
                        if (!arrayList.isEmpty()) {
                            u91Var.o0 = false;
                            u91Var.r0.b(0);
                        }
                        u91Var.H(str2);
                        break;
                    } else {
                        if (((q91) arrayList3.get(i13)).c != null && ((q91) arrayList3.get(i13)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((q91) arrayList3.get(i13)).c);
                            ((q91) arrayList3.get(i13)).c.searchQuery = lowerCase;
                        }
                        i13++;
                    }
                }
                break;
            case 13:
                ba1 ba1Var = ((aa1) obj2).b;
                ba1Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                ba1Var.a.a0();
                break;
            case 14:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (byte[]) obj);
                break;
            case 15:
                TwoStepVerificationActivity.i0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                break;
            case 16:
                TwoStepVerificationActivity.b0((TLRPC.TL_error) obj, (TwoStepVerificationActivity) obj2);
                break;
            case 17:
                bb1.l0((bb1) obj2, (String) obj);
                break;
            case 18:
                Runnable runnable = (Runnable) obj;
                er[] erVarArr = ((bb1) obj2).x.f;
                int length = erVarArr.length;
                while (i12 < length) {
                    erVarArr[i12].D(0.0f);
                    i12++;
                }
                runnable.run();
                break;
            case 19:
                gb1 gb1Var = (gb1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = gb1Var.f;
                ArrayList arrayList5 = gb1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                org.telegram.messenger.mp.u1(gb1Var.a).Z3(arrayList5, false);
                gb1Var.d = false;
                gb1Var.c = true;
                int size = arrayList4.size();
                while (i12 < size) {
                    Object obj3 = arrayList4.get(i12);
                    i12++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                break;
            case 20:
                hc1 hc1Var = (hc1) obj2;
                hc1Var.V.a(new rb1(hc1Var, (VoIPService) obj, i11), true);
                break;
            case 21:
                hc1 hc1Var2 = (hc1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.h2.T = false;
                org.telegram.ui.Components.voip.h2.b();
                ViewPropertyAnimator duration = hc1Var2.L.animate().setDuration(150L);
                org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.f;
                duration.setInterpolator(lrVar).start();
                hc1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(lrVar).start();
                hc1Var2.J.animate().alpha(1.0f).setDuration(150L).setInterpolator(lrVar).start();
                hc1Var2.O.animate().alpha(1.0f).setDuration(150L).setInterpolator(lrVar).start();
                hc1Var2.Y.animate().alpha(1.0f).setDuration(150L).setInterpolator(lrVar).start();
                hc1Var2.j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(lrVar).start();
                hc1Var2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(lrVar).start();
                hc1Var2.i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(lrVar).start();
                hc1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(lrVar).start();
                valueAnimator.addListener(new xb1(hc1Var2, i10));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(lrVar);
                valueAnimator.start();
                break;
            case 22:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj2;
                org.telegram.ui.Wallet.u0.P("enable backup: ready! getting secret phrase...");
                u0Var.F(false, true, false, new bi.m6(28, u0Var, (org.telegram.ui.Wallet.v8) obj));
                break;
            case 23:
                org.telegram.messenger.mp.u1(((org.telegram.ui.Wallet.u0) obj2).a).V3((TLRPC.Updates) obj, false);
                break;
            case 24:
                org.telegram.ui.Wallet.u0 u0Var2 = (org.telegram.ui.Wallet.u0) obj2;
                org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) obj;
                org.telegram.ui.Wallet.u0.P("emulate disable backup: ready");
                if (u0Var2.A() > 0) {
                    WalletEngine2 walletEngine2 = u0Var2.b;
                    if (walletEngine2 != null) {
                        walletEngine2.emulateRotateKey(new org.telegram.ui.Wallet.e(u0Var2, jVar));
                        break;
                    } else {
                        org.telegram.ui.Wallet.u0.n("emulate disable backup: no engine!");
                        jVar.a(null, "NULL_ENGINE");
                        break;
                    }
                } else {
                    jVar.a(500000L, null);
                    break;
                }
            case 25:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Wallet.n nVar = (org.telegram.ui.Wallet.n) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    nVar.run();
                    break;
                }
                break;
            case 26:
                org.telegram.messenger.mp.u1(((org.telegram.ui.Wallet.l2) obj2).a).V3((TLRPC.Updates) obj, false);
                break;
            case 27:
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) obj2;
                org.telegram.ui.Wallet.d3 d3Var = (org.telegram.ui.Wallet.d3) obj;
                if (!y2Var.e) {
                    d3Var.d0 = true;
                    Runnable runnable2 = y2Var.g;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                }
                break;
            case 28:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((org.telegram.messenger.q10) obj2).a(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                break;
            default:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(org.telegram.messenger.gd.M0(2131748587, null));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new org.telegram.ui.Components.p80(org.telegram.messenger.g0.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    break;
                }
                break;
        }
    }
}
