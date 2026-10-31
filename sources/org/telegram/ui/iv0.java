package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class iv0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ iv0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i10) {
            case 0:
                ProfileActivity.k0(profileActivity);
                break;
            case 1:
                if (profileActivity.s.getTag() == null) {
                    profileActivity.H4();
                    break;
                }
                break;
            case 2:
                RectF rectF = ProfileActivity.R6;
                profileActivity.finishPreviewFragment();
                break;
            case 3:
                RectF rectF2 = ProfileActivity.R6;
                profileActivity.k5();
                break;
            case 4:
                TLRPC.UserFull userFull = profileActivity.u2;
                if (userFull != null && userFull.wallet_card != null && profileActivity.getParentActivity() != null) {
                    profileActivity.showDialog(new org.telegram.ui.Wallet.p3(profileActivity, profileActivity.c0, profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.d1)), profileActivity.u2.wallet_card));
                    break;
                }
                break;
            case 5:
                ProfileActivity.m0(profileActivity);
                break;
            case 6:
                RectF rectF3 = ProfileActivity.R6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.e1);
                bundle.putLong("user_id", profileActivity.d1);
                profileActivity.presentFragment(new qh.i0(bundle));
                break;
            case 7:
                ProfileActivity.n0(profileActivity);
                break;
            case 8:
                RectF rectF4 = ProfileActivity.R6;
                profileActivity.j5();
                break;
            case 9:
                RectF rectF5 = ProfileActivity.R6;
                profileActivity.j5();
                break;
            case 10:
                RectF rectF6 = ProfileActivity.R6;
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i11 = 0;
                    while (i11 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) profileActivity.getParentLayout().getFragmentStack().get(i11);
                        if (k2Var instanceof ay) {
                            ay ayVar = (ay) k2Var;
                            xw xwVar = ayVar.F3;
                            if (xwVar != null) {
                                org.telegram.ui.ActionBar.k2 fragment = xwVar.getFragment();
                                if ((fragment instanceof pb1) && (-((pb1) fragment).a) == profileActivity.a()) {
                                    ayVar.F3.a();
                                }
                            }
                        } else if (k2Var instanceof un) {
                            if (((un) k2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).c0(k2Var, false);
                                i11--;
                            }
                        } else if (k2Var instanceof pb1) {
                            if ((-((pb1) k2Var).a) == profileActivity.a()) {
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
                HashSet hashSet = pb1.q1;
                profileActivity.presentFragment(pb1.H0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                break;
            case 11:
                ProfileActivity.Z(profileActivity);
                break;
            case 12:
                RectF rectF7 = ProfileActivity.R6;
                profileActivity.G4(view);
                break;
            default:
                RectF rectF8 = ProfileActivity.R6;
                profileActivity.G4(view);
                break;
        }
    }
}
