package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ex0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ ex0(ProfileActivity profileActivity, int i9) {
        this.a = i9;
        this.b = profileActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i9 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i9) {
            case 0:
                ProfileActivity.h0(profileActivity);
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
                ProfileActivity.f0(profileActivity);
                break;
            case 5:
                ProfileActivity.Z(profileActivity);
                break;
            case 6:
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.b1);
                bundle.putLong("user_id", profileActivity.a1);
                profileActivity.presentFragment(new z11(bundle));
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
                    int i10 = 0;
                    while (i10 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) profileActivity.getParentLayout().getFragmentStack().get(i10);
                        if (o2Var instanceof dy) {
                            dy dyVar = (dy) o2Var;
                            yw ywVar = dyVar.B3;
                            if (ywVar != null) {
                                org.telegram.ui.ActionBar.o2 fragment = ywVar.getFragment();
                                if ((fragment instanceof we1) && (-((we1) fragment).a) == profileActivity.a()) {
                                    dyVar.B3.a();
                                }
                            }
                        } else if (o2Var instanceof qn) {
                            if (((qn) o2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(o2Var, false);
                                i10--;
                            }
                        } else if (o2Var instanceof we1) {
                            if ((-((we1) o2Var).a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(o2Var, false);
                                i10--;
                            }
                        } else if ((o2Var instanceof ProfileActivity) && o2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) o2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.m1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(o2Var, false);
                                i10--;
                            }
                        }
                        i10++;
                    }
                }
                profileActivity.F1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.b1);
                HashSet hashSet = we1.j1;
                profileActivity.presentFragment(we1.D0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
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
