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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class fy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fy0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.cj0 cj0Var;
        int i7 = this.a;
        int i10 = 2;
        int i11 = 1;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.cc) obj).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                break;
            case 1:
                org.telegram.ui.Components.cc.a0((org.telegram.ui.ActionBar.e2) obj2).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                org.telegram.messenger.g0.h3((org.telegram.ui.Components.hh0) obj);
                break;
            case 2:
                ((SecretMediaViewer) obj2).L = false;
                ((uq0) obj).a.O0(false, true);
                break;
            case 3:
                ((SecretMediaViewer) ((ji.j) obj2).c).i((File) obj);
                break;
            case 4:
                n11 n11Var = (n11) obj2;
                n11Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.e2) obj).presentFragment(new StickersActivity(5, n11Var.M0));
                Runnable runnable = n11Var.V1;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.g0.g((String) obj);
                org.telegram.ui.Components.cc.a0((k31) obj2).k(false).j();
                break;
            case 6:
                k31.b0((k31) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 7:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj2;
                new r31(e2Var.getContext(), e2Var.getCurrentAccount(), e2Var.getResourceProvider(), (li.v) obj).show();
                break;
            case 8:
                ((StickersActivity) obj2).s0((org.telegram.ui.Cells.f8) obj);
                break;
            case 9:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().G4(true);
                if (view instanceof org.telegram.ui.Cells.q8) {
                    ((org.telegram.ui.Cells.q8) view).setChecked(themeActivity.getMessagesController().T4());
                    break;
                }
                break;
            case 10:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.j6.w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.j6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.j6.x), Double.valueOf(org.telegram.ui.ActionBar.j6.y));
                }
                org.telegram.ui.ActionBar.j6.w1();
                org.telegram.ui.Components.uj0 uj0Var = themeActivity2.b;
                if (uj0Var != null && (cj0Var = (org.telegram.ui.Components.cj0) uj0Var.K(themeActivity2.Z)) != null) {
                    View view2 = cj0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.v9) {
                        ((org.telegram.ui.Cells.v9) view2).c(org.telegram.messenger.hd.M0(2131753781, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.j6.w, false, false);
                        break;
                    }
                }
                break;
            case 11:
                t71 t71Var = (t71) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (t71Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    t71Var.C0.c(t71Var.M0[0]);
                    break;
                }
                break;
            case 12:
                w71.c0((w71) obj2, (String) obj);
                break;
            case 13:
                w71.a0((w71) obj2, (TLRPC.TL_theme) obj);
                break;
            case 14:
                e81 e81Var = (e81) obj2;
                e81Var.getClass();
                org.telegram.messenger.g0.g((String) obj);
                e81Var.c(true);
                break;
            case 15:
                e81 e81Var2 = (e81) obj2;
                e81Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.gj.h0(((TLRPC.TodoItem) obj).title, false));
                e81Var2.c(true);
                break;
            case 16:
                b91 b91Var = (b91) obj2;
                b91Var.getClass();
                Bundle bundle = new Bundle();
                u91 u91Var = b91Var.b;
                bundle.putLong("dialog_id", -u91Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                u91Var.presentFragment(new fx0(bundle, null));
                break;
            case 17:
                q91 q91Var = (q91) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = q91Var.f0;
                u91 u91Var2 = q91Var.w0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = u91Var2.b;
                    if (i13 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        q91Var.L();
                        if (!arrayList.isEmpty()) {
                            q91Var.o0 = false;
                            q91Var.r0.b(0);
                        }
                        q91Var.J(str2);
                        break;
                    } else {
                        if (((m91) arrayList3.get(i13)).c != null && ((m91) arrayList3.get(i13)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((m91) arrayList3.get(i13)).c);
                            ((m91) arrayList3.get(i13)).c.searchQuery = lowerCase;
                        }
                        i13++;
                    }
                }
                break;
            case 18:
                x91 x91Var = ((w91) obj2).b;
                x91Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                x91Var.a.a0();
                break;
            case 19:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (byte[]) obj);
                break;
            case 20:
                TwoStepVerificationActivity.i0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                break;
            case 21:
                TwoStepVerificationActivity.b0((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                break;
            case 22:
                xa1.l0((xa1) obj2, (String) obj);
                break;
            case 23:
                Runnable runnable2 = (Runnable) obj;
                dr[] drVarArr = ((xa1) obj2).x.f;
                int length = drVarArr.length;
                while (i12 < length) {
                    drVarArr[i12].D(0.0f);
                    i12++;
                }
                runnable2.run();
                break;
            case 24:
                cb1 cb1Var = (cb1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = cb1Var.f;
                ArrayList arrayList5 = cb1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                org.telegram.messenger.np.s1(cb1Var.a).S3(arrayList5, false);
                cb1Var.d = false;
                cb1Var.c = true;
                int size = arrayList4.size();
                while (i12 < size) {
                    Object obj3 = arrayList4.get(i12);
                    i12++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                break;
            case 25:
                ec1 ec1Var = (ec1) obj2;
                ec1Var.V.a(new ob1(ec1Var, (VoIPService) obj, i11), true);
                break;
            case 26:
                ec1 ec1Var2 = (ec1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.i2.T = false;
                org.telegram.ui.Components.voip.i2.b();
                ViewPropertyAnimator duration = ec1Var2.L.animate().setDuration(150L);
                org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f;
                duration.setInterpolator(erVar).start();
                ec1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(erVar).start();
                ec1Var2.J.animate().alpha(1.0f).setDuration(150L).setInterpolator(erVar).start();
                ec1Var2.O.animate().alpha(1.0f).setDuration(150L).setInterpolator(erVar).start();
                ec1Var2.Y.animate().alpha(1.0f).setDuration(150L).setInterpolator(erVar).start();
                ec1Var2.j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(erVar).start();
                ec1Var2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(erVar).start();
                ec1Var2.i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(erVar).start();
                ec1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(erVar).start();
                valueAnimator.addListener(new ub1(ec1Var2, i10));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(erVar);
                valueAnimator.start();
                break;
            case 27:
                org.telegram.messenger.np.s1(((org.telegram.ui.Wallet.l0) obj2).a).O3((TLRPC.Updates) obj, false);
                break;
            case 28:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj2;
                org.telegram.ui.Wallet.l0.H("enable backup: ready! getting secret phrase...");
                l0Var.z(new bi.e4(24, l0Var, (org.telegram.ui.Wallet.g8) obj), false, true);
                break;
            default:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Wallet.o oVar = (org.telegram.ui.Wallet.o) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    oVar.run();
                    break;
                }
                break;
        }
    }
}
