package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class px0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ px0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i10) {
            case 0:
                ProfileActivity.c0(profileActivity);
                break;
            case 1:
                if (profileActivity.v.getTag() == null) {
                    profileActivity.u4();
                    break;
                }
                break;
            case 2:
                profileActivity.finishPreviewFragment();
                break;
            case 3:
                profileActivity.R4();
                break;
            case 4:
                TLRPC.UserFull userFull = profileActivity.w2;
                if (userFull != null && userFull.wallet_card != null && profileActivity.getParentActivity() != null) {
                    profileActivity.showDialog(new org.telegram.ui.Wallet.z2(profileActivity, profileActivity.d0, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f1)), profileActivity.w2.wallet_card));
                    break;
                }
                break;
            case 5:
                ProfileActivity.f0(profileActivity);
                break;
            case 6:
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.g1);
                bundle.putLong("user_id", profileActivity.f1);
                profileActivity.presentFragment(new zh.m0(bundle));
                break;
            case 7:
                ProfileActivity.g0(profileActivity);
                break;
            case 8:
                profileActivity.Q4();
                break;
            case 9:
                profileActivity.Q4();
                break;
            case 10:
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i11 = 0;
                    while (i11 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) profileActivity.getParentLayout().getFragmentStack().get(i11);
                        if (n2Var instanceof cy) {
                            cy cyVar = (cy) n2Var;
                            ww wwVar = cyVar.G3;
                            if (wwVar != null) {
                                org.telegram.ui.ActionBar.n2 fragment = wwVar.getFragment();
                                if ((fragment instanceof re1) && (-((re1) fragment).a) == profileActivity.a()) {
                                    cyVar.G3.a();
                                }
                            }
                        } else if (n2Var instanceof qn) {
                            if (((qn) n2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(n2Var, false);
                                i11--;
                            }
                        } else if (n2Var instanceof re1) {
                            if ((-((re1) n2Var).a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(n2Var, false);
                                i11--;
                            }
                        } else if ((n2Var instanceof ProfileActivity) && n2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) n2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.r1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(n2Var, false);
                                i11--;
                            }
                        }
                        i11++;
                    }
                }
                profileActivity.K1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.g1);
                HashSet hashSet = re1.n1;
                profileActivity.presentFragment(re1.E0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                break;
            case 11:
                ProfileActivity.U(profileActivity);
                break;
            case 12:
                profileActivity.t4(view);
                break;
            default:
                profileActivity.t4(view);
                break;
        }
    }
}
