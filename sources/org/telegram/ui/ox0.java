package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ox0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ ox0(ProfileActivity profileActivity, int i10) {
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
                bundle.putLong("chat_id", profileActivity.c1);
                bundle.putLong("user_id", profileActivity.b1);
                profileActivity.presentFragment(new m21(bundle));
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
                        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) profileActivity.getParentLayout().getFragmentStack().get(i11);
                        if (p2Var instanceof oy) {
                            oy oyVar = (oy) p2Var;
                            jx jxVar = oyVar.C3;
                            if (jxVar != null) {
                                org.telegram.ui.ActionBar.p2 fragment = jxVar.getFragment();
                                if ((fragment instanceof kf1) && (-((kf1) fragment).a) == profileActivity.a()) {
                                    oyVar.C3.a();
                                }
                            }
                        } else if (p2Var instanceof xn) {
                            if (((xn) p2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(p2Var, false);
                                i11--;
                            }
                        } else if (p2Var instanceof kf1) {
                            if ((-((kf1) p2Var).a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(p2Var, false);
                                i11--;
                            }
                        } else if ((p2Var instanceof ProfileActivity) && p2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) p2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.n1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(p2Var, false);
                                i11--;
                            }
                        }
                        i11++;
                    }
                }
                profileActivity.G1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.c1);
                HashSet hashSet = kf1.k1;
                profileActivity.presentFragment(kf1.E0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
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
