package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        org.telegram.ui.Components.ah0 ah0Var;
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
                    q1Var.f3(-1);
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
                rn rnVar = (rn) obj;
                if (!rnVar.s.g()) {
                    rnVar.R0.P(86);
                    rnVar.b0.e.d();
                    break;
                } else {
                    rnVar.R0.N(0, false, false);
                    break;
                }
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.y;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                break;
            case 7:
                f50 f50Var = (f50) obj;
                if (!f50Var.N.g()) {
                    f50Var.R.P(86);
                    f50Var.f.d();
                    break;
                } else {
                    f50Var.R.N(0, false, false);
                    break;
                }
            case 8:
                rc0 rc0Var = (rc0) obj;
                org.telegram.ui.Components.ah0 ah0Var2 = rc0Var.J;
                yc ycVar = rc0Var.n;
                if (!rc0Var.M.g()) {
                    ycVar.setAnimation(ah0Var2);
                    ah0Var2.P(86);
                    ycVar.setOnAnimationEndListener(new db0(rc0Var, 2));
                    ycVar.d();
                    break;
                } else {
                    ycVar.setAnimation(ah0Var2);
                    ah0Var2.N(0, false, false);
                    rc0Var.L = true;
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
                    org.telegram.ui.Components.ff0 ff0Var = profileActivity.Z;
                    if (ff0Var != null) {
                        org.telegram.ui.Components.cf0 i10 = org.telegram.ui.Components.ff0.i(14, ff0Var.a);
                        if (i10 != null && (ah0Var = i10.k) != null) {
                            ah0Var.start();
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
                ((s11) obj).w(0.0f);
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
                ((ic1) obj).t0.b();
                break;
        }
    }
}
