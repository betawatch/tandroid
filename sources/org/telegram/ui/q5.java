package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.ch0 ch0Var;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ((r5) obj).a.y0(false);
                break;
            case 1:
                ((o9) obj).m1.onFragmentDestroy();
                break;
            case 2:
                ad adVar = (ad) obj;
                if (!adVar.x.g()) {
                    adVar.L.P(86);
                    adVar.n.d();
                    break;
                } else {
                    adVar.L.N(0, false, false);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                if (q1Var != null) {
                    q1Var.g3(-1);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.xb xbVar = ((org.telegram.ui.Components.xb[]) obj)[0];
                if (xbVar != null) {
                    xbVar.b();
                    break;
                }
                break;
            case 5:
                qn qnVar = (qn) obj;
                if (!qnVar.s.g()) {
                    qnVar.S0.P(86);
                    qnVar.c0.e.d();
                    break;
                } else {
                    qnVar.S0.N(0, false, false);
                    break;
                }
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.y;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                break;
            case 7:
                c50 c50Var = (c50) obj;
                if (!c50Var.O.g()) {
                    c50Var.S.P(86);
                    c50Var.f.d();
                    break;
                } else {
                    c50Var.S.N(0, false, false);
                    break;
                }
            case 8:
                oc0 oc0Var = (oc0) obj;
                org.telegram.ui.Components.ch0 ch0Var2 = oc0Var.K;
                xc xcVar = oc0Var.n;
                if (!oc0Var.N.g()) {
                    xcVar.setAnimation(ch0Var2);
                    ch0Var2.P(86);
                    xcVar.setOnAnimationEndListener(new bb0(oc0Var, 2));
                    xcVar.d();
                    break;
                } else {
                    xcVar.setAnimation(ch0Var2);
                    ch0Var2.N(0, false, false);
                    oc0Var.M = true;
                    break;
                }
            case 9:
                ((org.telegram.ui.ActionBar.u2) obj).dismiss();
                break;
            case 10:
                ((PhotoViewer) obj).Q1 = null;
                break;
            case 11:
                Drawable[] drawableArr = PhotoViewer.Z8;
                ((Runnable) obj).run();
                break;
            case 12:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.u0.g()) {
                    privacyControlActivity.v0.P(86);
                    privacyControlActivity.w0.e.d();
                    break;
                } else {
                    privacyControlActivity.v0.N(0, false, false);
                    break;
                }
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.r0.g()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.hf0 hf0Var = profileActivity.a0;
                    if (hf0Var != null) {
                        org.telegram.ui.Components.ef0 i10 = org.telegram.ui.Components.hf0.i(14, hf0Var.a);
                        if (i10 != null && (ch0Var = i10.k) != null) {
                            ch0Var.start();
                        }
                    } else {
                        profileActivity.s.d();
                    }
                    org.telegram.ui.Cells.l8 l8Var = profileActivity.N2;
                    if (l8Var != null) {
                        l8Var.getImageView().d();
                        break;
                    }
                } else {
                    profileActivity.V.N(0, false, false);
                    profileActivity.W.N(0, false, false);
                    break;
                }
                break;
            case 14:
                ((n11) obj).w(0.0f);
                break;
            case 15:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.a = null;
                break;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.r = null;
                themeActivity.h = null;
                themeActivity.n = null;
                break;
            case 17:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().k(53, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                break;
            default:
                ((ec1) obj).u0.b();
                break;
        }
    }
}
