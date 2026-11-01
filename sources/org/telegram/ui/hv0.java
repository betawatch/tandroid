package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hv0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ hv0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i10) {
            case 0:
                ProfileActivity.l0(profileActivity);
                break;
            case 1:
                if (profileActivity.s.getTag() == null) {
                    profileActivity.I4();
                    break;
                }
                break;
            case 2:
                RectF rectF = ProfileActivity.S6;
                profileActivity.finishPreviewFragment();
                break;
            case 3:
                RectF rectF2 = ProfileActivity.S6;
                profileActivity.l5();
                break;
            case 4:
                TLRPC.UserFull userFull = profileActivity.u2;
                if (userFull != null && userFull.wallet_card != null && profileActivity.getParentActivity() != null) {
                    profileActivity.showDialog(new org.telegram.ui.Wallet.p3(profileActivity, profileActivity.c0, profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.d1)), profileActivity.u2.wallet_card));
                    break;
                }
                break;
            case 5:
                ProfileActivity.n0(profileActivity);
                break;
            case 6:
                RectF rectF3 = ProfileActivity.S6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.e1);
                bundle.putLong("user_id", profileActivity.d1);
                profileActivity.presentFragment(new qh.i0(bundle));
                break;
            case 7:
                ProfileActivity.o0(profileActivity);
                break;
            case 8:
                RectF rectF4 = ProfileActivity.S6;
                profileActivity.k5();
                break;
            case 9:
                RectF rectF5 = ProfileActivity.S6;
                profileActivity.k5();
                break;
            case 10:
                RectF rectF6 = ProfileActivity.S6;
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i11 = 0;
                    while (i11 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) profileActivity.getParentLayout().getFragmentStack().get(i11);
                        if (k2Var instanceof zx) {
                            zx zxVar = (zx) k2Var;
                            ww wwVar = zxVar.F3;
                            if (wwVar != null) {
                                org.telegram.ui.ActionBar.k2 fragment = wwVar.getFragment();
                                if ((fragment instanceof nb1) && (-((nb1) fragment).a) == profileActivity.a()) {
                                    zxVar.F3.a();
                                }
                            }
                        } else if (k2Var instanceof un) {
                            if (((un) k2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).c0(k2Var, false);
                                i11--;
                            }
                        } else if (k2Var instanceof nb1) {
                            if ((-((nb1) k2Var).a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).c0(k2Var, false);
                                i11--;
                            }
                        } else if ((k2Var instanceof ProfileActivity) && k2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) k2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.p1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).c0(k2Var, false);
                                i11--;
                            }
                        }
                        i11++;
                    }
                }
                profileActivity.I1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.e1);
                HashSet hashSet = nb1.q1;
                profileActivity.presentFragment(nb1.I0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                break;
            case 11:
                ProfileActivity.a0(profileActivity);
                break;
            case 12:
                RectF rectF7 = ProfileActivity.S6;
                profileActivity.H4(view);
                break;
            default:
                RectF rectF8 = ProfileActivity.S6;
                profileActivity.H4(view);
                break;
        }
    }
}
