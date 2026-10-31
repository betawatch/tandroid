package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.bi0 bi0Var;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((r5) obj).a.x0(false);
                break;
            case 1:
                ((p9) obj).i1.onFragmentDestroy();
                break;
            case 2:
                kd kdVar = (kd) obj;
                if (!kdVar.x.g()) {
                    kdVar.K.P(86);
                    kdVar.n.d();
                    break;
                } else {
                    kdVar.K.N(0, false, false);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                if (q1Var != null) {
                    q1Var.b3(-1);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.wb wbVar = ((org.telegram.ui.Components.wb[]) obj)[0];
                if (wbVar != null) {
                    wbVar.b();
                    break;
                }
                break;
            case 5:
                oo ooVar = (oo) obj;
                if (!ooVar.s.g()) {
                    ooVar.R0.P(86);
                    ooVar.b0.e.d();
                    break;
                } else {
                    ooVar.R0.N(0, false, false);
                    break;
                }
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.y;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                break;
            case 7:
                c60 c60Var = (c60) obj;
                if (!c60Var.N.g()) {
                    c60Var.R.P(86);
                    c60Var.f.d();
                    break;
                } else {
                    c60Var.R.N(0, false, false);
                    break;
                }
            case 8:
                wd0 wd0Var = (wd0) obj;
                org.telegram.ui.Components.bi0 bi0Var2 = wd0Var.I;
                hd hdVar = wd0Var.n;
                if (!wd0Var.L.g()) {
                    hdVar.setAnimation(bi0Var2);
                    bi0Var2.P(86);
                    hdVar.setOnAnimationEndListener(new kc0(wd0Var, 2));
                    hdVar.d();
                    break;
                } else {
                    hdVar.setAnimation(bi0Var2);
                    bi0Var2.N(0, false, false);
                    wd0Var.K = true;
                    break;
                }
            case 9:
                ((org.telegram.ui.ActionBar.z2) obj).dismiss();
                break;
            case 10:
                ((PhotoViewer) obj).P1 = null;
                break;
            case 11:
                Drawable[] drawableArr = PhotoViewer.U8;
                ((Runnable) obj).run();
                break;
            case 12:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.r0.g()) {
                    privacyControlActivity.s0.P(86);
                    privacyControlActivity.t0.e.d();
                    break;
                } else {
                    privacyControlActivity.s0.N(0, false, false);
                    break;
                }
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.q0.g()) {
                    profileActivity.U.P(86);
                    profileActivity.V.P(86);
                    org.telegram.ui.Components.hg0 hg0Var = profileActivity.Z;
                    if (hg0Var != null) {
                        org.telegram.ui.Components.eg0 i11 = org.telegram.ui.Components.hg0.i(14, hg0Var.a);
                        if (i11 != null && (bi0Var = i11.k) != null) {
                            bi0Var.start();
                        }
                    } else {
                        profileActivity.s.d();
                    }
                    org.telegram.ui.Cells.p8 p8Var = profileActivity.L2;
                    if (p8Var != null) {
                        p8Var.getImageView().d();
                        break;
                    }
                } else {
                    profileActivity.U.N(0, false, false);
                    profileActivity.V.N(0, false, false);
                    break;
                }
                break;
            case 14:
                ((i31) obj).w(0.0f);
                break;
            case 15:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i12 = ShareActivity.b;
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
                ((be1) obj).u0.b();
                break;
        }
    }
}
