package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        org.telegram.ui.Components.oh0 oh0Var;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ((r5) obj).a.y0(false);
                break;
            case 1:
                ((p9) obj).m1.onFragmentDestroy();
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
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) obj;
                if (r1Var != null) {
                    r1Var.h3(-1);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.gc gcVar = ((org.telegram.ui.Components.gc[]) obj)[0];
                if (gcVar != null) {
                    gcVar.b();
                    break;
                }
                break;
            case 5:
                rn rnVar = (rn) obj;
                if (!rnVar.s.g()) {
                    rnVar.S0.P(86);
                    rnVar.c0.e.d();
                    break;
                } else {
                    rnVar.S0.N(0, false, false);
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
                if (!f50Var.O.g()) {
                    f50Var.S.P(86);
                    f50Var.f.d();
                    break;
                } else {
                    f50Var.S.N(0, false, false);
                    break;
                }
            case 8:
                pc0 pc0Var = (pc0) obj;
                org.telegram.ui.Components.oh0 oh0Var2 = pc0Var.K;
                xc xcVar = pc0Var.n;
                if (!pc0Var.N.g()) {
                    xcVar.setAnimation(oh0Var2);
                    oh0Var2.P(86);
                    xcVar.setOnAnimationEndListener(new cb0(pc0Var, 2));
                    xcVar.d();
                    break;
                } else {
                    xcVar.setAnimation(oh0Var2);
                    oh0Var2.N(0, false, false);
                    pc0Var.M = true;
                    break;
                }
            case 9:
                ((org.telegram.ui.ActionBar.w2) obj).dismiss();
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
                    org.telegram.ui.Components.tf0 tf0Var = profileActivity.a0;
                    if (tf0Var != null) {
                        org.telegram.ui.Components.qf0 i10 = org.telegram.ui.Components.tf0.i(14, tf0Var.a);
                        if (i10 != null && (oh0Var = i10.k) != null) {
                            oh0Var.start();
                        }
                    } else {
                        profileActivity.s.d();
                    }
                    org.telegram.ui.Cells.n8 n8Var = profileActivity.N2;
                    if (n8Var != null) {
                        n8Var.getImageView().d();
                        break;
                    }
                } else {
                    profileActivity.V.N(0, false, false);
                    profileActivity.W.N(0, false, false);
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
                ((hc1) obj).u0.b();
                break;
        }
    }
}
