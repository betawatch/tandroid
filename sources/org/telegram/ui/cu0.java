package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cu0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ cu0(ProfileActivity profileActivity, int i7) {
        this.a = i7;
        this.b = profileActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i7) {
            case 0:
                ProfileActivity.k0(profileActivity);
                break;
            case 1:
                if (profileActivity.s.getTag() == null) {
                    profileActivity.L4();
                    break;
                }
                break;
            case 2:
                RectF rectF = ProfileActivity.V6;
                profileActivity.finishPreviewFragment();
                break;
            case 3:
                RectF rectF2 = ProfileActivity.V6;
                profileActivity.o5();
                break;
            case 4:
                TLRPC.UserFull userFull = profileActivity.u2;
                if (userFull != null && userFull.wallet_card != null && profileActivity.getParentActivity() != null) {
                    profileActivity.showDialog(new org.telegram.ui.Wallet.p3(profileActivity, profileActivity.c0, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.d1)), profileActivity.u2.wallet_card));
                    break;
                }
                break;
            case 5:
                ProfileActivity.m0(profileActivity);
                break;
            case 6:
                RectF rectF3 = ProfileActivity.V6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.e1);
                bundle.putLong("user_id", profileActivity.d1);
                profileActivity.presentFragment(new ai.s0(bundle));
                break;
            case 7:
                ProfileActivity.n0(profileActivity);
                break;
            case 8:
                RectF rectF4 = ProfileActivity.V6;
                profileActivity.n5();
                break;
            case 9:
                RectF rectF5 = ProfileActivity.V6;
                profileActivity.n5();
                break;
            case 10:
                RectF rectF6 = ProfileActivity.V6;
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i10 = 0;
                    while (i10 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) profileActivity.getParentLayout().getFragmentStack().get(i10);
                        if (f2Var instanceof zw) {
                            zw zwVar = (zw) f2Var;
                            vv vvVar = zwVar.G3;
                            if (vvVar != null) {
                                org.telegram.ui.ActionBar.f2 fragment = vvVar.getFragment();
                                if ((fragment instanceof z91) && (-((z91) fragment).a) == profileActivity.a()) {
                                    zwVar.G3.a();
                                }
                            }
                        } else if (f2Var instanceof cn) {
                            if (((cn) f2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(f2Var, false);
                                i10--;
                            }
                        } else if (f2Var instanceof z91) {
                            if ((-((z91) f2Var).a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(f2Var, false);
                                i10--;
                            }
                        } else if ((f2Var instanceof ProfileActivity) && f2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) f2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.p1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(f2Var, false);
                                i10--;
                            }
                        }
                        i10++;
                    }
                }
                profileActivity.I1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.e1);
                HashSet hashSet = z91.q1;
                profileActivity.presentFragment(z91.I0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                break;
            case 11:
                ProfileActivity.a0(profileActivity);
                break;
            case 12:
                RectF rectF7 = ProfileActivity.V6;
                profileActivity.K4(view);
                break;
            default:
                RectF rectF8 = ProfileActivity.V6;
                profileActivity.K4(view);
                break;
        }
    }
}
