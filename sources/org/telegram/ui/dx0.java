package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dx0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ dx0(ProfileActivity profileActivity, int i10) {
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
                bundle.putLong("chat_id", profileActivity.b1);
                bundle.putLong("user_id", profileActivity.a1);
                profileActivity.presentFragment(new a21(bundle));
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
                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) profileActivity.getParentLayout().getFragmentStack().get(i11);
                        if (o2Var instanceof fy) {
                            fy fyVar = (fy) o2Var;
                            ax axVar = fyVar.B3;
                            if (axVar != null) {
                                org.telegram.ui.ActionBar.o2 fragment = axVar.getFragment();
                                if ((fragment instanceof ze1) && (-((ze1) fragment).a) == profileActivity.a()) {
                                    fyVar.B3.a();
                                }
                            }
                        } else if (o2Var instanceof tn) {
                            if (((tn) o2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(o2Var, false);
                                i11--;
                            }
                        } else if (o2Var instanceof ze1) {
                            if ((-((ze1) o2Var).a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(o2Var, false);
                                i11--;
                            }
                        } else if ((o2Var instanceof ProfileActivity) && o2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) o2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.m1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(o2Var, false);
                                i11--;
                            }
                        }
                        i11++;
                    }
                }
                profileActivity.F1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.b1);
                HashSet hashSet = ze1.j1;
                profileActivity.presentFragment(ze1.E0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
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
