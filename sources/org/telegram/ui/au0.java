package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class au0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ au0(ProfileActivity profileActivity, int i7) {
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
                RectF rectF = ProfileActivity.Z6;
                profileActivity.finishPreviewFragment();
                break;
            case 3:
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity.o5();
                break;
            case 4:
                TLRPC.UserFull userFull = profileActivity.w2;
                if (userFull != null && userFull.wallet_card != null && profileActivity.getParentActivity() != null) {
                    profileActivity.showDialog(new org.telegram.ui.Wallet.w3(profileActivity, profileActivity.d0, profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.e1)), profileActivity.w2.wallet_card));
                    break;
                }
                break;
            case 5:
                ProfileActivity.m0(profileActivity);
                break;
            case 6:
                RectF rectF3 = ProfileActivity.Z6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f1);
                bundle.putLong("user_id", profileActivity.e1);
                profileActivity.presentFragment(new ci.j0(bundle));
                break;
            case 7:
                ProfileActivity.n0(profileActivity);
                break;
            case 8:
                RectF rectF4 = ProfileActivity.Z6;
                profileActivity.n5();
                break;
            case 9:
                RectF rectF5 = ProfileActivity.Z6;
                profileActivity.n5();
                break;
            case 10:
                RectF rectF6 = ProfileActivity.Z6;
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i10 = 0;
                    while (i10 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) profileActivity.getParentLayout().getFragmentStack().get(i10);
                        if (h2Var instanceof cx) {
                            cx cxVar = (cx) h2Var;
                            xv xvVar = cxVar.H3;
                            if (xvVar != null) {
                                org.telegram.ui.ActionBar.h2 fragment = xvVar.getFragment();
                                if ((fragment instanceof y91) && (-((y91) fragment).a) == profileActivity.a()) {
                                    cxVar.H3.a();
                                }
                            }
                        } else if (h2Var instanceof bn) {
                            if (((bn) h2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(h2Var, false);
                                i10--;
                            }
                        } else if (h2Var instanceof y91) {
                            if ((-((y91) h2Var).a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(h2Var, false);
                                i10--;
                            }
                        } else if ((h2Var instanceof ProfileActivity) && h2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) h2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.q1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(h2Var, false);
                                i10--;
                            }
                        }
                        i10++;
                    }
                }
                profileActivity.J1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f1);
                HashSet hashSet = y91.s1;
                profileActivity.presentFragment(y91.I0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                break;
            case 11:
                ProfileActivity.a0(profileActivity);
                break;
            case 12:
                RectF rectF7 = ProfileActivity.Z6;
                profileActivity.K4(view);
                break;
            default:
                RectF rectF8 = ProfileActivity.Z6;
                profileActivity.K4(view);
                break;
        }
    }
}
