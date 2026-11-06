package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
        org.telegram.ui.Components.zg0 zg0Var;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ((r5) obj).a.y0(false);
                break;
            case 1:
                ((o9) obj).i1.onFragmentDestroy();
                break;
            case 2:
                bd bdVar = (bd) obj;
                if (!bdVar.x.g()) {
                    bdVar.K.P(86);
                    bdVar.n.d();
                    break;
                } else {
                    bdVar.K.N(0, false, false);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                if (q1Var != null) {
                    q1Var.e3(-1);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.cc ccVar = ((org.telegram.ui.Components.cc[]) obj)[0];
                if (ccVar != null) {
                    ccVar.b();
                    break;
                }
                break;
            case 5:
                pn pnVar = (pn) obj;
                if (!pnVar.s.g()) {
                    pnVar.R0.P(86);
                    pnVar.b0.e.d();
                    break;
                } else {
                    pnVar.R0.N(0, false, false);
                    break;
                }
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.y;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                break;
            case 7:
                d50 d50Var = (d50) obj;
                if (!d50Var.N.g()) {
                    d50Var.R.P(86);
                    d50Var.f.d();
                    break;
                } else {
                    d50Var.R.N(0, false, false);
                    break;
                }
            case 8:
                pc0 pc0Var = (pc0) obj;
                org.telegram.ui.Components.zg0 zg0Var2 = pc0Var.J;
                yc ycVar = pc0Var.n;
                if (!pc0Var.M.g()) {
                    ycVar.setAnimation(zg0Var2);
                    zg0Var2.P(86);
                    ycVar.setOnAnimationEndListener(new bb0(pc0Var, 2));
                    ycVar.d();
                    break;
                } else {
                    ycVar.setAnimation(zg0Var2);
                    zg0Var2.N(0, false, false);
                    pc0Var.L = true;
                    break;
                }
            case 9:
                ((org.telegram.ui.ActionBar.v2) obj).dismiss();
                break;
            case 10:
                ((PhotoViewer) obj).P1 = null;
                break;
            case 11:
                Drawable[] drawableArr = PhotoViewer.Y8;
                ((Runnable) obj).run();
                break;
            case 12:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.t0.g()) {
                    privacyControlActivity.u0.P(86);
                    privacyControlActivity.v0.e.d();
                    break;
                } else {
                    privacyControlActivity.u0.N(0, false, false);
                    break;
                }
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.q0.g()) {
                    profileActivity.U.P(86);
                    profileActivity.V.P(86);
                    org.telegram.ui.Components.ef0 ef0Var = profileActivity.Z;
                    if (ef0Var != null) {
                        org.telegram.ui.Components.bf0 i10 = org.telegram.ui.Components.ef0.i(14, ef0Var.a);
                        if (i10 != null && (zg0Var = i10.k) != null) {
                            zg0Var.start();
                        }
                    } else {
                        profileActivity.s.d();
                    }
                    org.telegram.ui.Cells.m8 m8Var = profileActivity.L2;
                    if (m8Var != null) {
                        m8Var.getImageView().d();
                        break;
                    }
                } else {
                    profileActivity.U.N(0, false, false);
                    profileActivity.V.N(0, false, false);
                    break;
                }
                break;
            case 14:
                ((q11) obj).w(0.0f);
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
                ((ec1) obj).t0.b();
                break;
        }
    }
}
