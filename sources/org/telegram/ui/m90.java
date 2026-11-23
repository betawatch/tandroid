package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ m90(ProfileActivity profileActivity, int i7) {
        this.a = i7;
        this.b = profileActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jw0 jw0Var;
        int i7 = this.a;
        int i10 = 1;
        int i11 = 0;
        ProfileActivity profileActivity = this.b;
        switch (i7) {
            case 0:
                uv0 uv0Var = profileActivity.O;
                if (uv0Var != null) {
                    uv0Var.k1(14);
                    profileActivity.X4(false);
                    break;
                }
                break;
            case 1:
                uv0 uv0Var2 = profileActivity.O;
                if (uv0Var2 != null) {
                    uv0Var2.k1(14);
                    profileActivity.X4(false);
                    break;
                }
                break;
            case 2:
                org.telegram.messenger.g0.h3(new m90(profileActivity, i11), 200L);
                break;
            case 3:
                org.telegram.messenger.g0.h3(new m90(profileActivity, i10), 200L);
                break;
            case 4:
                TLRPC.UserFull userFull = profileActivity.w2;
                if (userFull != null) {
                    org.telegram.messenger.g0.g(org.telegram.messenger.fj.h0(userFull.note, false));
                    org.telegram.messenger.m10.t(null, 2131743949, org.telegram.ui.Components.kc.b0(profileActivity));
                    break;
                }
                break;
            case 5:
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", profileActivity.e1);
                bundle.putBoolean("focus_notes", true);
                profileActivity.presentFragment(new qr(bundle, profileActivity.A0));
                break;
            case 6:
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity.getSendMessagesHelper().r0(org.telegram.messenger.xy.b("/start", profileActivity.e1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 7:
                RectF rectF3 = ProfileActivity.Z6;
                profileActivity.Q4(false);
                break;
            case 8:
                RectF rectF4 = ProfileActivity.Z6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                break;
            case 9:
                RectF rectF5 = ProfileActivity.Z6;
                profileActivity.Q4(true);
                break;
            case 10:
                RectF rectF6 = ProfileActivity.Z6;
                profileActivity.getClass();
                profileActivity.presentFragment(new kg.e1());
                break;
            case 11:
                RectF rectF7 = ProfileActivity.Z6;
                profileActivity.getClass();
                profileActivity.presentFragment(new kg.c1());
                break;
            case 12:
                RectF rectF8 = ProfileActivity.Z6;
                profileActivity.getClass();
                profileActivity.presentFragment(new la(null));
                break;
            case 13:
                RectF rectF9 = ProfileActivity.Z6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                break;
            case 14:
                RectF rectF10 = ProfileActivity.Z6;
                profileActivity.getClass();
                profileActivity.presentFragment(new g(3));
                break;
            case 15:
                RectF rectF11 = ProfileActivity.Z6;
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                e2Var.a = true;
                profileActivity.showAsSheet(new PrivacyControlActivity(11, false), e2Var);
                break;
            case 16:
                RectF rectF12 = ProfileActivity.Z6;
                profileActivity.B4(true);
                if (profileActivity.k2.isRunning()) {
                    profileActivity.k2.cancel();
                }
                profileActivity.a5(1.0f);
                break;
            case 17:
                RectF rectF13 = ProfileActivity.Z6;
                profileActivity.H5(false, false);
                break;
            case 18:
                RectF rectF14 = ProfileActivity.Z6;
                profileActivity.U3();
                break;
            case 19:
                uv0 uv0Var3 = profileActivity.O;
                if (uv0Var3 != null) {
                    uv0Var3.P1(true);
                    profileActivity.O.E1();
                    break;
                }
                break;
            case 20:
                if (!profileActivity.a.c0() && (jw0Var = profileActivity.d) != null) {
                    jw0Var.f();
                    break;
                }
                break;
            case 21:
                RectF rectF15 = ProfileActivity.Z6;
                profileActivity.H3();
                break;
            case 22:
                RectF rectF16 = ProfileActivity.Z6;
                profileActivity.H5(false, false);
                break;
            case 23:
                RectF rectF17 = ProfileActivity.Z6;
                profileActivity.getMessagesController().k4(profileActivity.a());
                break;
            case 24:
                profileActivity.E5.setVisibility(8);
                break;
            case 25:
                RectF rectF18 = ProfileActivity.Z6;
                profileActivity.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f1);
                bundle2.putLong("user_id", profileActivity.e1);
                profileActivity.presentFragment(new ci.j0(bundle2));
                break;
            case 26:
                RectF rectF19 = ProfileActivity.Z6;
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
