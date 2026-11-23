package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class iy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iy0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.mj0 mj0Var;
        int i7 = this.a;
        int i10 = 2;
        int i11 = 1;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                oy0 oy0Var = (oy0) ((View[]) obj2)[0];
                oy0Var.b = null;
                oy0Var.c = (TLRPC.TL_reportResultChooseOption) obj;
                oy0Var.d = null;
                oy0Var.f.g3.O(false);
                break;
            case 1:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.kc) obj).c(org.telegram.messenger.gd.N0(2131754485, null)).j();
                break;
            case 2:
                org.telegram.ui.Components.kc.b0((org.telegram.ui.ActionBar.g2) obj2).c(org.telegram.messenger.gd.N0(2131754485, null)).j();
                org.telegram.messenger.g0.g3((org.telegram.ui.Components.sh0) obj);
                break;
            case 3:
                ((SecretMediaViewer) obj2).L = false;
                ((wq0) obj).a.P0(false, true);
                break;
            case 4:
                ((SecretMediaViewer) ((j6.k) obj2).c).i((File) obj);
                break;
            case 5:
                q11 q11Var = (q11) obj2;
                q11Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.g2) obj).presentFragment(new StickersActivity(5, q11Var.M0));
                Runnable runnable = q11Var.V1;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 6:
                org.telegram.messenger.g0.g((String) obj);
                org.telegram.ui.Components.kc.b0((n31) obj2).k(false).j();
                break;
            case 7:
                n31.b0((n31) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 8:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj2;
                new t31(g2Var.getContext(), g2Var.getCurrentAccount(), g2Var.getResourceProvider(), (ki.n2) obj).show();
                break;
            case 9:
                ((StickersActivity) obj2).s0((org.telegram.ui.Cells.g8) obj);
                break;
            case 10:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().Q4(true);
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(themeActivity.getMessagesController().e5());
                    break;
                }
                break;
            case 11:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.n6.w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.n6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.n6.x), Double.valueOf(org.telegram.ui.ActionBar.n6.y));
                }
                org.telegram.ui.ActionBar.n6.w1();
                org.telegram.ui.Components.ek0 ek0Var = themeActivity2.b;
                if (ek0Var != null && (mj0Var = (org.telegram.ui.Components.mj0) ek0Var.K(themeActivity2.Z)) != null) {
                    View view2 = mj0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.w9) {
                        ((org.telegram.ui.Cells.w9) view2).c(org.telegram.messenger.gd.N0(2131753778, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.n6.w, false, false);
                        break;
                    }
                }
                break;
            case 12:
                v71 v71Var = (v71) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (v71Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    v71Var.C0.c(v71Var.M0[0]);
                    break;
                }
                break;
            case 13:
                y71.c0((y71) obj2, (String) obj);
                break;
            case 14:
                y71.a0((y71) obj2, (TLRPC.TL_theme) obj);
                break;
            case 15:
                g81 g81Var = (g81) obj2;
                g81Var.getClass();
                org.telegram.messenger.g0.g((String) obj);
                g81Var.c(true);
                break;
            case 16:
                g81 g81Var2 = (g81) obj2;
                g81Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.fj.h0(((TLRPC.TodoItem) obj).title, false));
                g81Var2.c(true);
                break;
            case 17:
                d91 d91Var = (d91) obj2;
                d91Var.getClass();
                Bundle bundle = new Bundle();
                w91 w91Var = d91Var.b;
                bundle.putLong("dialog_id", -w91Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                w91Var.presentFragment(new hx0(bundle, null));
                break;
            case 18:
                s91 s91Var = (s91) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = s91Var.f0;
                w91 w91Var2 = s91Var.w0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = w91Var2.b;
                    if (i13 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        s91Var.L();
                        if (!arrayList.isEmpty()) {
                            s91Var.o0 = false;
                            s91Var.r0.b(0);
                        }
                        s91Var.J(str2);
                        break;
                    } else {
                        if (((o91) arrayList3.get(i13)).c != null && ((o91) arrayList3.get(i13)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((o91) arrayList3.get(i13)).c);
                            ((o91) arrayList3.get(i13)).c.searchQuery = lowerCase;
                        }
                        i13++;
                    }
                }
                break;
            case 19:
                z91 z91Var = ((y91) obj2).b;
                z91Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                z91Var.a.a0();
                break;
            case 20:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (byte[]) obj);
                break;
            case 21:
                TwoStepVerificationActivity.i0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                break;
            case 22:
                TwoStepVerificationActivity.b0((TLRPC.TL_error) obj, (TwoStepVerificationActivity) obj2);
                break;
            case 23:
                za1.l0((za1) obj2, (String) obj);
                break;
            case 24:
                Runnable runnable2 = (Runnable) obj;
                er[] erVarArr = ((za1) obj2).x.f;
                int length = erVarArr.length;
                while (i12 < length) {
                    erVarArr[i12].D(0.0f);
                    i12++;
                }
                runnable2.run();
                break;
            case 25:
                eb1 eb1Var = (eb1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = eb1Var.f;
                ArrayList arrayList5 = eb1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                org.telegram.messenger.mp.u1(eb1Var.a).Z3(arrayList5, false);
                eb1Var.d = false;
                eb1Var.c = true;
                int size = arrayList4.size();
                while (i12 < size) {
                    Object obj3 = arrayList4.get(i12);
                    i12++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                break;
            case 26:
                fc1 fc1Var = (fc1) obj2;
                fc1Var.V.a(new pb1(fc1Var, (VoIPService) obj, i11), true);
                break;
            case 27:
                fc1 fc1Var2 = (fc1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.i2.T = false;
                org.telegram.ui.Components.voip.i2.b();
                ViewPropertyAnimator duration = fc1Var2.L.animate().setDuration(150L);
                org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.f;
                duration.setInterpolator(krVar).start();
                fc1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(krVar).start();
                fc1Var2.J.animate().alpha(1.0f).setDuration(150L).setInterpolator(krVar).start();
                fc1Var2.O.animate().alpha(1.0f).setDuration(150L).setInterpolator(krVar).start();
                fc1Var2.Y.animate().alpha(1.0f).setDuration(150L).setInterpolator(krVar).start();
                fc1Var2.j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(krVar).start();
                fc1Var2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(krVar).start();
                fc1Var2.i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(krVar).start();
                fc1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(krVar).start();
                valueAnimator.addListener(new vb1(fc1Var2, i10));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(krVar);
                valueAnimator.start();
                break;
            case 28:
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) obj2;
                org.telegram.ui.Wallet.v0.P("enable backup: ready! getting secret phrase...");
                v0Var.F(false, true, false, new bi.r6(28, v0Var, (org.telegram.ui.Wallet.w8) obj));
                break;
            default:
                org.telegram.messenger.mp.u1(((org.telegram.ui.Wallet.v0) obj2).a).V3((TLRPC.Updates) obj, false);
                break;
        }
    }
}
