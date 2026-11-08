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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class by0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ by0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.xi0 xi0Var;
        int i7 = this.a;
        int i10 = 2;
        int i11 = 1;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                ny0 ny0Var = (ny0) ((View[]) obj2)[0];
                ny0Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                ny0Var.c = null;
                ny0Var.d = null;
                ny0Var.f.f3.O(false);
                break;
            case 1:
                ((ny0) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                break;
            case 2:
                ny0 ny0Var2 = (ny0) ((View[]) obj2)[0];
                ny0Var2.b = null;
                ny0Var2.c = (TLRPC.TL_reportResultChooseOption) obj;
                ny0Var2.d = null;
                ny0Var2.f.f3.O(false);
                break;
            case 3:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.hc) obj).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                break;
            case 4:
                org.telegram.ui.Components.hc.a0((org.telegram.ui.ActionBar.f2) obj2).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                org.telegram.messenger.g0.h3((org.telegram.ui.Components.v80) obj);
                break;
            case 5:
                ((SecretMediaViewer) obj2).K = false;
                ((wq0) obj).a.O0(false, true);
                break;
            case 6:
                ((SecretMediaViewer) ((j2.n) obj2).c).i((File) obj);
                break;
            case 7:
                q11 q11Var = (q11) obj2;
                q11Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.f2) obj).presentFragment(new StickersActivity(5, q11Var.L0));
                Runnable runnable = q11Var.U1;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 8:
                org.telegram.messenger.g0.g((String) obj);
                org.telegram.ui.Components.hc.a0((m31) obj2).k(false).j();
                break;
            case 9:
                m31.b0((m31) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 10:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                new t31(f2Var.getContext(), f2Var.getCurrentAccount(), f2Var.getResourceProvider(), (org.telegram.messenger.voip.k) obj).show();
                break;
            case 11:
                ((StickersActivity) obj2).s0((org.telegram.ui.Cells.g8) obj);
                break;
            case 12:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().F4(true);
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(themeActivity.getMessagesController().S4());
                    break;
                }
                break;
            case 13:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.k6.w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.k6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.k6.x), Double.valueOf(org.telegram.ui.ActionBar.k6.y));
                }
                org.telegram.ui.ActionBar.k6.w1();
                org.telegram.ui.Components.pj0 pj0Var = themeActivity2.b;
                if (pj0Var != null && (xi0Var = (org.telegram.ui.Components.xi0) pj0Var.K(themeActivity2.Y)) != null) {
                    View view2 = xi0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.w9) {
                        ((org.telegram.ui.Cells.w9) view2).c(org.telegram.messenger.id.M0(2131753781, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.k6.w, false, false);
                        break;
                    }
                }
                break;
            case 14:
                v71 v71Var = (v71) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (v71Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    v71Var.B0.c(v71Var.L0[0]);
                    break;
                }
                break;
            case 15:
                y71.c0((y71) obj2, (String) obj);
                break;
            case 16:
                y71.a0((y71) obj2, (TLRPC.TL_theme) obj);
                break;
            case 17:
                g81 g81Var = (g81) obj2;
                g81Var.getClass();
                org.telegram.messenger.g0.g((String) obj);
                g81Var.c(true);
                break;
            case 18:
                g81 g81Var2 = (g81) obj2;
                g81Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.ij.h0(((TLRPC.TodoItem) obj).title, false));
                g81Var2.c(true);
                break;
            case 19:
                e91 e91Var = (e91) obj2;
                e91Var.getClass();
                Bundle bundle = new Bundle();
                w91 w91Var = e91Var.b;
                bundle.putLong("dialog_id", -w91Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                w91Var.presentFragment(new gx0(bundle, null));
                break;
            case 20:
                s91 s91Var = (s91) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = s91Var.e0;
                w91 w91Var2 = s91Var.v0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = w91Var2.b;
                    if (i13 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        s91Var.N();
                        if (!arrayList.isEmpty()) {
                            s91Var.n0 = false;
                            s91Var.q0.b(0);
                        }
                        s91Var.L(str2);
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
            case 21:
                z91 z91Var = ((y91) obj2).b;
                z91Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                z91Var.a.a0();
                break;
            case 22:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (byte[]) obj);
                break;
            case 23:
                TwoStepVerificationActivity.i0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                break;
            case 24:
                TwoStepVerificationActivity.b0((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                break;
            case 25:
                za1.l0((za1) obj2, (String) obj);
                break;
            case 26:
                Runnable runnable2 = (Runnable) obj;
                br[] brVarArr = ((za1) obj2).x.f;
                int length = brVarArr.length;
                while (i12 < length) {
                    brVarArr[i12].C(0.0f);
                    i12++;
                }
                runnable2.run();
                break;
            case 27:
                eb1 eb1Var = (eb1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = eb1Var.f;
                ArrayList arrayList5 = eb1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                org.telegram.messenger.qp.s1(eb1Var.a).S3(arrayList5, false);
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
            case 28:
                fc1 fc1Var = (fc1) obj2;
                fc1Var.U.a(new pb1(fc1Var, (VoIPService) obj, i11), true);
                break;
            default:
                fc1 fc1Var2 = (fc1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.e2.S = false;
                org.telegram.ui.Components.voip.e2.b();
                ViewPropertyAnimator duration = fc1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f;
                duration.setInterpolator(xqVar).start();
                fc1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                fc1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                fc1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                fc1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                fc1Var2.i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                fc1Var2.g0.animate().alpha(1.0f).setDuration(350L).setInterpolator(xqVar).start();
                fc1Var2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(xqVar).start();
                fc1Var2.L0.animate().alpha(1.0f).setDuration(350L).setInterpolator(xqVar).start();
                valueAnimator.addListener(new vb1(fc1Var2, i10));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(xqVar);
                valueAnimator.start();
                break;
        }
    }
}
