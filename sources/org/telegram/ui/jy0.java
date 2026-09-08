package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class jy0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ jy0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i10) {
            case 0:
                ProfileActivity.i0(profileActivity);
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
                ProfileActivity.g0(profileActivity);
                break;
            case 5:
                ProfileActivity.a0(profileActivity);
                break;
            case 6:
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f1);
                bundle.putLong("user_id", profileActivity.e1);
                profileActivity.presentFragment(new g31(bundle));
                break;
            case 7:
                ProfileActivity.h0(profileActivity);
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
                        if (n2Var instanceof uy) {
                            uy uyVar = (uy) n2Var;
                            ox oxVar = uyVar.F3;
                            if (oxVar != null) {
                                org.telegram.ui.ActionBar.n2 fragment = oxVar.getFragment();
                                if ((fragment instanceof eg1) && (-((eg1) fragment).a) == profileActivity.a()) {
                                    uyVar.F3.a();
                                }
                            }
                        } else if (n2Var instanceof co) {
                            if (((co) n2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(n2Var, false);
                                i11--;
                            }
                        } else if (n2Var instanceof eg1) {
                            if ((-((eg1) n2Var).a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(n2Var, false);
                                i11--;
                            }
                        } else if ((n2Var instanceof ProfileActivity) && n2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) n2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.q1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(n2Var, false);
                                i11--;
                            }
                        }
                        i11++;
                    }
                }
                profileActivity.J1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f1);
                HashSet hashSet = eg1.n1;
                profileActivity.presentFragment(eg1.E0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                break;
            case 11:
                profileActivity.t4(view);
                break;
            default:
                profileActivity.t4(view);
                break;
        }
    }
}
