package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class k90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ k90(ProfileActivity profileActivity, int i7) {
        this.a = i7;
        this.b = profileActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iw0 iw0Var;
        int i7 = this.a;
        int i10 = 1;
        int i11 = 0;
        ProfileActivity profileActivity = this.b;
        switch (i7) {
            case 0:
                uv0 uv0Var = profileActivity.O;
                if (uv0Var != null) {
                    uv0Var.k1(14);
                    profileActivity.W4(false);
                    break;
                }
                break;
            case 1:
                uv0 uv0Var2 = profileActivity.O;
                if (uv0Var2 != null) {
                    uv0Var2.k1(14);
                    profileActivity.W4(false);
                    break;
                }
                break;
            case 2:
                org.telegram.messenger.g0.i3(new k90(profileActivity, i11), 200L);
                break;
            case 3:
                org.telegram.messenger.g0.i3(new k90(profileActivity, i10), 200L);
                break;
            case 4:
                TLRPC.UserFull userFull = profileActivity.w2;
                if (userFull != null) {
                    org.telegram.messenger.g0.g(org.telegram.messenger.gj.h0(userFull.note, false));
                    org.telegram.messenger.i20.s(null, 2131744194, org.telegram.ui.Components.cc.a0(profileActivity));
                    break;
                }
                break;
            case 5:
                RectF rectF = ProfileActivity.X6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", profileActivity.e1);
                bundle.putBoolean("focus_notes", true);
                profileActivity.presentFragment(new pr(bundle, profileActivity.A0));
                break;
            case 6:
                RectF rectF2 = ProfileActivity.X6;
                profileActivity.getSendMessagesHelper().r0(org.telegram.messenger.cz.b("/start", profileActivity.e1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 7:
                RectF rectF3 = ProfileActivity.X6;
                profileActivity.P4(false);
                break;
            case 8:
                RectF rectF4 = ProfileActivity.X6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                break;
            case 9:
                RectF rectF5 = ProfileActivity.X6;
                profileActivity.P4(true);
                break;
            case 10:
                RectF rectF6 = ProfileActivity.X6;
                profileActivity.getClass();
                profileActivity.presentFragment(new kg.c1());
                break;
            case 11:
                RectF rectF7 = ProfileActivity.X6;
                profileActivity.getClass();
                profileActivity.presentFragment(new kg.a1());
                break;
            case 12:
                RectF rectF8 = ProfileActivity.X6;
                profileActivity.getClass();
                profileActivity.presentFragment(new la(null));
                break;
            case 13:
                RectF rectF9 = ProfileActivity.X6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                break;
            case 14:
                RectF rectF10 = ProfileActivity.X6;
                profileActivity.getClass();
                profileActivity.presentFragment(new g(3));
                break;
            case 15:
                RectF rectF11 = ProfileActivity.X6;
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2();
                c2Var.a = true;
                profileActivity.showAsSheet(new PrivacyControlActivity(11, false), c2Var);
                break;
            case 16:
                RectF rectF12 = ProfileActivity.X6;
                profileActivity.A4(true);
                if (profileActivity.k2.isRunning()) {
                    profileActivity.k2.cancel();
                }
                profileActivity.Z4(1.0f);
                break;
            case 17:
                RectF rectF13 = ProfileActivity.X6;
                profileActivity.G5(false, false);
                break;
            case 18:
                RectF rectF14 = ProfileActivity.X6;
                profileActivity.T3();
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
                if (!profileActivity.a.c0() && (iw0Var = profileActivity.d) != null) {
                    iw0Var.f();
                    break;
                }
                break;
            case 21:
                RectF rectF15 = ProfileActivity.X6;
                profileActivity.G3();
                break;
            case 22:
                RectF rectF16 = ProfileActivity.X6;
                profileActivity.G5(false, false);
                break;
            case 23:
                RectF rectF17 = ProfileActivity.X6;
                profileActivity.getMessagesController().c4(profileActivity.a());
                break;
            case 24:
                profileActivity.C5.setVisibility(8);
                break;
            case 25:
                RectF rectF18 = ProfileActivity.X6;
                profileActivity.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f1);
                bundle2.putLong("user_id", profileActivity.e1);
                profileActivity.presentFragment(new ci.i0(bundle2));
                break;
            case 26:
                RectF rectF19 = ProfileActivity.X6;
                profileActivity.getClass();
                profileActivity.presentFragment(new la(null));
                break;
            case 27:
                ProfileActivity.f0(profileActivity);
                break;
            default:
                profileActivity.W4(true);
                break;
        }
    }
}
