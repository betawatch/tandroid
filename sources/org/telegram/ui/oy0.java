package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oy0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ oy0(ProfileActivity profileActivity, int i10) {
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
                profileActivity.presentFragment(new l31(bundle));
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
                        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) profileActivity.getParentLayout().getFragmentStack().get(i11);
                        if (m2Var instanceof yy) {
                            yy yyVar = (yy) m2Var;
                            sx sxVar = yyVar.G3;
                            if (sxVar != null) {
                                org.telegram.ui.ActionBar.m2 fragment = sxVar.getFragment();
                                if ((fragment instanceof kg1) && (-((kg1) fragment).a) == profileActivity.a()) {
                                    yyVar.G3.a();
                                }
                            }
                        } else if (m2Var instanceof fo) {
                            if (((fo) m2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(m2Var, false);
                                i11--;
                            }
                        } else if (m2Var instanceof kg1) {
                            if ((-((kg1) m2Var).a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(m2Var, false);
                                i11--;
                            }
                        } else if ((m2Var instanceof ProfileActivity) && m2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) m2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.q1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(m2Var, false);
                                i11--;
                            }
                        }
                        i11++;
                    }
                }
                profileActivity.J1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f1);
                HashSet hashSet = kg1.n1;
                profileActivity.presentFragment(kg1.E0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
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
