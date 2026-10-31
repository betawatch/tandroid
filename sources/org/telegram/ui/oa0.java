package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class oa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ oa0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xx0 xx0Var;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        ProfileActivity profileActivity = this.b;
        switch (i10) {
            case 0:
                ix0 ix0Var = profileActivity.N;
                if (ix0Var != null) {
                    ix0Var.f1(14);
                    profileActivity.T4(false);
                    break;
                }
                break;
            case 1:
                ix0 ix0Var2 = profileActivity.N;
                if (ix0Var2 != null) {
                    ix0Var2.f1(14);
                    profileActivity.T4(false);
                    break;
                }
                break;
            case 2:
                org.telegram.messenger.i0.h3(new oa0(profileActivity, i12), 200L);
                break;
            case 3:
                org.telegram.messenger.i0.h3(new oa0(profileActivity, i11), 200L);
                break;
            case 4:
                TLRPC.UserFull userFull = profileActivity.u2;
                if (userFull != null) {
                    org.telegram.messenger.i0.g(org.telegram.messenger.jj.h0(userFull.note, false));
                    org.telegram.messenger.z20.r(null, 2131744219, org.telegram.ui.Components.cc.a0(profileActivity));
                    break;
                }
                break;
            case 5:
                RectF rectF = ProfileActivity.R6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", profileActivity.d1);
                bundle.putBoolean("focus_notes", true);
                profileActivity.presentFragment(new ns(bundle, profileActivity.z0));
                break;
            case 6:
                RectF rectF2 = ProfileActivity.R6;
                profileActivity.getSendMessagesHelper().r0(org.telegram.messenger.oz.b("/start", profileActivity.d1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 7:
                RectF rectF3 = ProfileActivity.R6;
                profileActivity.M4(false);
                break;
            case 8:
                RectF rectF4 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                break;
            case 9:
                RectF rectF5 = ProfileActivity.R6;
                profileActivity.M4(true);
                break;
            case 10:
                RectF rectF6 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new ag.h2());
                break;
            case 11:
                RectF rectF7 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new ag.f2());
                break;
            case 12:
                RectF rectF8 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new oa(null));
                break;
            case 13:
                RectF rectF9 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                break;
            case 14:
                RectF rectF10 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new f(3));
                break;
            case 15:
                RectF rectF11 = ProfileActivity.R6;
                org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                i2Var.a = true;
                profileActivity.showAsSheet(new PrivacyControlActivity(11, false), i2Var);
                break;
            case 16:
                RectF rectF12 = ProfileActivity.R6;
                profileActivity.x4(true);
                if (profileActivity.i2.isRunning()) {
                    profileActivity.i2.cancel();
                }
                profileActivity.W4(1.0f);
                break;
            case 17:
                RectF rectF13 = ProfileActivity.R6;
                profileActivity.C5(false, false);
                break;
            case 18:
                RectF rectF14 = ProfileActivity.R6;
                profileActivity.T3();
                break;
            case 19:
                ix0 ix0Var3 = profileActivity.N;
                if (ix0Var3 != null) {
                    ix0Var3.K1(true);
                    profileActivity.N.z1();
                    break;
                }
                break;
            case 20:
                RectF rectF15 = ProfileActivity.R6;
                profileActivity.getMessagesController().Z3(profileActivity.a());
                break;
            case 21:
                if (!profileActivity.a.c0() && (xx0Var = profileActivity.d) != null) {
                    xx0Var.f();
                    break;
                }
                break;
            case 22:
                RectF rectF16 = ProfileActivity.R6;
                profileActivity.G3();
                break;
            case 23:
                RectF rectF17 = ProfileActivity.R6;
                profileActivity.C5(false, false);
                break;
            case 24:
                RectF rectF18 = ProfileActivity.R6;
                profileActivity.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.e1);
                bundle2.putLong("user_id", profileActivity.d1);
                profileActivity.presentFragment(new qh.i0(bundle2));
                break;
            case 25:
                profileActivity.y5.setVisibility(8);
                break;
            case 26:
                RectF rectF19 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new oa(null));
                break;
            case 27:
                ProfileActivity.f0(profileActivity);
                break;
            default:
                profileActivity.T4(true);
                break;
        }
    }
}
