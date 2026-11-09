package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class l90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ l90(ProfileActivity profileActivity, int i7) {
        this.a = i7;
        this.b = profileActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lw0 lw0Var;
        int i7 = this.a;
        int i10 = 1;
        int i11 = 0;
        ProfileActivity profileActivity = this.b;
        switch (i7) {
            case 0:
                xv0 xv0Var = profileActivity.N;
                if (xv0Var != null) {
                    xv0Var.k1(14);
                    profileActivity.X4(false);
                    break;
                }
                break;
            case 1:
                xv0 xv0Var2 = profileActivity.N;
                if (xv0Var2 != null) {
                    xv0Var2.k1(14);
                    profileActivity.X4(false);
                    break;
                }
                break;
            case 2:
                org.telegram.messenger.g0.i3(new l90(profileActivity, i11), 200L);
                break;
            case 3:
                org.telegram.messenger.g0.i3(new l90(profileActivity, i10), 200L);
                break;
            case 4:
                TLRPC.UserFull userFull = profileActivity.u2;
                if (userFull != null) {
                    org.telegram.messenger.g0.g(org.telegram.messenger.ij.h0(userFull.note, false));
                    org.telegram.messenger.camera.q.r(null, 2131744194, org.telegram.ui.Components.hc.a0(profileActivity));
                    break;
                }
                break;
            case 5:
                RectF rectF = ProfileActivity.V6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", profileActivity.d1);
                bundle.putBoolean("focus_notes", true);
                profileActivity.presentFragment(new pr(bundle, profileActivity.z0));
                break;
            case 6:
                RectF rectF2 = ProfileActivity.V6;
                profileActivity.getSendMessagesHelper().r0(org.telegram.messenger.ez.b("/start", profileActivity.d1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 7:
                RectF rectF3 = ProfileActivity.V6;
                profileActivity.Q4(false);
                break;
            case 8:
                RectF rectF4 = ProfileActivity.V6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                break;
            case 9:
                RectF rectF5 = ProfileActivity.V6;
                profileActivity.Q4(true);
                break;
            case 10:
                RectF rectF6 = ProfileActivity.V6;
                profileActivity.getClass();
                profileActivity.presentFragment(new kg.c1());
                break;
            case 11:
                RectF rectF7 = ProfileActivity.V6;
                profileActivity.getClass();
                profileActivity.presentFragment(new kg.a1());
                break;
            case 12:
                RectF rectF8 = ProfileActivity.V6;
                profileActivity.getClass();
                profileActivity.presentFragment(new la(null));
                break;
            case 13:
                RectF rectF9 = ProfileActivity.V6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                break;
            case 14:
                RectF rectF10 = ProfileActivity.V6;
                profileActivity.getClass();
                profileActivity.presentFragment(new g(3));
                break;
            case 15:
                RectF rectF11 = ProfileActivity.V6;
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                d2Var.a = true;
                profileActivity.showAsSheet(new PrivacyControlActivity(11, false), d2Var);
                break;
            case 16:
                RectF rectF12 = ProfileActivity.V6;
                profileActivity.B4(true);
                if (profileActivity.i2.isRunning()) {
                    profileActivity.i2.cancel();
                }
                profileActivity.a5(1.0f);
                break;
            case 17:
                RectF rectF13 = ProfileActivity.V6;
                profileActivity.G5(false, false);
                break;
            case 18:
                RectF rectF14 = ProfileActivity.V6;
                profileActivity.U3();
                break;
            case 19:
                xv0 xv0Var3 = profileActivity.N;
                if (xv0Var3 != null) {
                    xv0Var3.P1(true);
                    profileActivity.N.E1();
                    break;
                }
                break;
            case 20:
                if (!profileActivity.a.c0() && (lw0Var = profileActivity.d) != null) {
                    lw0Var.f();
                    break;
                }
                break;
            case 21:
                RectF rectF15 = ProfileActivity.V6;
                profileActivity.H3();
                break;
            case 22:
                RectF rectF16 = ProfileActivity.V6;
                profileActivity.G5(false, false);
                break;
            case 23:
                RectF rectF17 = ProfileActivity.V6;
                profileActivity.getMessagesController().c4(profileActivity.a());
                break;
            case 24:
                profileActivity.A5.setVisibility(8);
                break;
            case 25:
                RectF rectF18 = ProfileActivity.V6;
                profileActivity.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.e1);
                bundle2.putLong("user_id", profileActivity.d1);
                profileActivity.presentFragment(new ai.s0(bundle2));
                break;
            case 26:
                RectF rectF19 = ProfileActivity.V6;
                profileActivity.getClass();
                profileActivity.presentFragment(new la(null));
                break;
            case 27:
                ProfileActivity.f0(profileActivity);
                break;
            default:
                profileActivity.X4(true);
                break;
        }
    }
}
