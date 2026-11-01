package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class na0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ na0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wx0 wx0Var;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        ProfileActivity profileActivity = this.b;
        switch (i10) {
            case 0:
                hx0 hx0Var = profileActivity.N;
                if (hx0Var != null) {
                    hx0Var.g1(14);
                    profileActivity.U4(false);
                    break;
                }
                break;
            case 1:
                hx0 hx0Var2 = profileActivity.N;
                if (hx0Var2 != null) {
                    hx0Var2.g1(14);
                    profileActivity.U4(false);
                    break;
                }
                break;
            case 2:
                org.telegram.messenger.i0.h3(new na0(profileActivity, i12), 200L);
                break;
            case 3:
                org.telegram.messenger.i0.h3(new na0(profileActivity, i11), 200L);
                break;
            case 4:
                TLRPC.UserFull userFull = profileActivity.u2;
                if (userFull != null) {
                    org.telegram.messenger.i0.g(org.telegram.messenger.kj.h0(userFull.note, false));
                    org.telegram.messenger.a30.r(null, 2131744219, org.telegram.ui.Components.cc.a0(profileActivity));
                    break;
                }
                break;
            case 5:
                RectF rectF = ProfileActivity.S6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", profileActivity.d1);
                bundle.putBoolean("focus_notes", true);
                profileActivity.presentFragment(new ns(bundle, profileActivity.z0));
                break;
            case 6:
                RectF rectF2 = ProfileActivity.S6;
                profileActivity.getSendMessagesHelper().r0(org.telegram.messenger.pz.b("/start", profileActivity.d1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 7:
                RectF rectF3 = ProfileActivity.S6;
                profileActivity.N4(false);
                break;
            case 8:
                RectF rectF4 = ProfileActivity.S6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                break;
            case 9:
                RectF rectF5 = ProfileActivity.S6;
                profileActivity.N4(true);
                break;
            case 10:
                RectF rectF6 = ProfileActivity.S6;
                profileActivity.getClass();
                profileActivity.presentFragment(new ag.h2());
                break;
            case 11:
                RectF rectF7 = ProfileActivity.S6;
                profileActivity.getClass();
                profileActivity.presentFragment(new ag.f2());
                break;
            case 12:
                RectF rectF8 = ProfileActivity.S6;
                profileActivity.getClass();
                profileActivity.presentFragment(new oa(null));
                break;
            case 13:
                RectF rectF9 = ProfileActivity.S6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                break;
            case 14:
                RectF rectF10 = ProfileActivity.S6;
                profileActivity.getClass();
                profileActivity.presentFragment(new f(3));
                break;
            case 15:
                RectF rectF11 = ProfileActivity.S6;
                org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                i2Var.a = true;
                profileActivity.showAsSheet(new PrivacyControlActivity(11, false), i2Var);
                break;
            case 16:
                RectF rectF12 = ProfileActivity.S6;
                profileActivity.y4(true);
                if (profileActivity.i2.isRunning()) {
                    profileActivity.i2.cancel();
                }
                profileActivity.X4(1.0f);
                break;
            case 17:
                RectF rectF13 = ProfileActivity.S6;
                profileActivity.D5(false, false);
                break;
            case 18:
                RectF rectF14 = ProfileActivity.S6;
                profileActivity.U3();
                break;
            case 19:
                hx0 hx0Var3 = profileActivity.N;
                if (hx0Var3 != null) {
                    hx0Var3.L1(true);
                    profileActivity.N.A1();
                    break;
                }
                break;
            case 20:
                RectF rectF15 = ProfileActivity.S6;
                profileActivity.getMessagesController().Z3(profileActivity.a());
                break;
            case 21:
                if (!profileActivity.a.c0() && (wx0Var = profileActivity.d) != null) {
                    wx0Var.f();
                    break;
                }
                break;
            case 22:
                RectF rectF16 = ProfileActivity.S6;
                profileActivity.H3();
                break;
            case 23:
                RectF rectF17 = ProfileActivity.S6;
                profileActivity.D5(false, false);
                break;
            case 24:
                RectF rectF18 = ProfileActivity.S6;
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
                RectF rectF19 = ProfileActivity.S6;
                profileActivity.getClass();
                profileActivity.presentFragment(new oa(null));
                break;
            case 27:
                ProfileActivity.g0(profileActivity);
                break;
            default:
                profileActivity.U4(true);
                break;
        }
    }
}
