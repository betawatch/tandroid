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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                ((org.telegram.ui.Components.hc) obj).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                break;
            case 4:
                org.telegram.ui.Components.hc.a0((org.telegram.ui.ActionBar.f2) obj2).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
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
                        ((org.telegram.ui.Cells.w9) view2).c(org.telegram.messenger.hd.M0(2131753781, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.k6.w, false, false);
                        break;
                    }
                }
                break;
            case 14:
                u71 u71Var = (u71) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (u71Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    u71Var.B0.c(u71Var.L0[0]);
                    break;
                }
                break;
            case 15:
                x71.c0((x71) obj2, (String) obj);
                break;
            case 16:
                x71.a0((x71) obj2, (TLRPC.TL_theme) obj);
                break;
            case 17:
                f81 f81Var = (f81) obj2;
                f81Var.getClass();
                org.telegram.messenger.g0.g((String) obj);
                f81Var.c(true);
                break;
            case 18:
                f81 f81Var2 = (f81) obj2;
                f81Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.ij.h0(((TLRPC.TodoItem) obj).title, false));
                f81Var2.c(true);
                break;
            case 19:
                d91 d91Var = (d91) obj2;
                d91Var.getClass();
                Bundle bundle = new Bundle();
                v91 v91Var = d91Var.b;
                bundle.putLong("dialog_id", -v91Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                v91Var.presentFragment(new gx0(bundle, null));
                break;
            case 20:
                r91 r91Var = (r91) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = r91Var.e0;
                v91 v91Var2 = r91Var.v0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = v91Var2.b;
                    if (i13 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        r91Var.N();
                        if (!arrayList.isEmpty()) {
                            r91Var.n0 = false;
                            r91Var.q0.b(0);
                        }
                        r91Var.L(str2);
                        break;
                    } else {
                        if (((n91) arrayList3.get(i13)).c != null && ((n91) arrayList3.get(i13)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((n91) arrayList3.get(i13)).c);
                            ((n91) arrayList3.get(i13)).c.searchQuery = lowerCase;
                        }
                        i13++;
                    }
                }
                break;
            case 21:
                y91 y91Var = ((x91) obj2).b;
                y91Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                y91Var.a.a0();
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
                ya1.l0((ya1) obj2, (String) obj);
                break;
            case 26:
                Runnable runnable2 = (Runnable) obj;
                br[] brVarArr = ((ya1) obj2).x.f;
                int length = brVarArr.length;
                while (i12 < length) {
                    brVarArr[i12].C(0.0f);
                    i12++;
                }
                runnable2.run();
                break;
            case 27:
                db1 db1Var = (db1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = db1Var.f;
                ArrayList arrayList5 = db1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                org.telegram.messenger.qp.s1(db1Var.a).S3(arrayList5, false);
                db1Var.d = false;
                db1Var.c = true;
                int size = arrayList4.size();
                while (i12 < size) {
                    Object obj3 = arrayList4.get(i12);
                    i12++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                break;
            case 28:
                ec1 ec1Var = (ec1) obj2;
                ec1Var.U.a(new ob1(ec1Var, (VoIPService) obj, i11), true);
                break;
            default:
                ec1 ec1Var2 = (ec1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.e2.S = false;
                org.telegram.ui.Components.voip.e2.b();
                ViewPropertyAnimator duration = ec1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f;
                duration.setInterpolator(xqVar).start();
                ec1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                ec1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                ec1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                ec1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                ec1Var2.i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                ec1Var2.g0.animate().alpha(1.0f).setDuration(350L).setInterpolator(xqVar).start();
                ec1Var2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(xqVar).start();
                ec1Var2.L0.animate().alpha(1.0f).setDuration(350L).setInterpolator(xqVar).start();
                valueAnimator.addListener(new ub1(ec1Var2, i10));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(xqVar);
                valueAnimator.start();
                break;
        }
    }
}
