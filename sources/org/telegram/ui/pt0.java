package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pt0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ pt0(ProfileActivity profileActivity, int i3) {
        this.a = i3;
        this.b = profileActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i3) {
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
                RectF rectF = ProfileActivity.T6;
                profileActivity.finishPreviewFragment();
                break;
            case 3:
                RectF rectF2 = ProfileActivity.T6;
                profileActivity.l5();
                break;
            case 4:
                TLRPC.UserFull userFull = profileActivity.v2;
                if (userFull != null && userFull.wallet_card != null && profileActivity.getParentActivity() != null) {
                    profileActivity.showDialog(new org.telegram.ui.Wallet.n3(profileActivity, profileActivity.d0, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.e1)), profileActivity.v2.wallet_card));
                    break;
                }
                break;
            case 5:
                ProfileActivity.n0(profileActivity);
                break;
            case 6:
                RectF rectF3 = ProfileActivity.T6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f1);
                bundle.putLong("user_id", profileActivity.e1);
                profileActivity.presentFragment(new bi.j0(bundle));
                break;
            case 7:
                ProfileActivity.o0(profileActivity);
                break;
            case 8:
                RectF rectF4 = ProfileActivity.T6;
                profileActivity.k5();
                break;
            case 9:
                RectF rectF5 = ProfileActivity.T6;
                profileActivity.k5();
                break;
            case 10:
                RectF rectF6 = ProfileActivity.T6;
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i10 = 0;
                    while (i10 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) profileActivity.getParentLayout().getFragmentStack().get(i10);
                        if (d2Var instanceof uw) {
                            uw uwVar = (uw) d2Var;
                            pv pvVar = uwVar.G3;
                            if (pvVar != null) {
                                org.telegram.ui.ActionBar.d2 fragment = pvVar.getFragment();
                                if ((fragment instanceof m91) && (-((m91) fragment).a) == profileActivity.a()) {
                                    uwVar.G3.a();
                                }
                            }
                        } else if (d2Var instanceof wm) {
                            if (((wm) d2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(d2Var, false);
                                i10--;
                            }
                        } else if (d2Var instanceof m91) {
                            if ((-((m91) d2Var).a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(d2Var, false);
                                i10--;
                            }
                        } else if ((d2Var instanceof ProfileActivity) && d2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) d2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.q1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(d2Var, false);
                                i10--;
                            }
                        }
                        i10++;
                    }
                }
                profileActivity.J1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f1);
                HashSet hashSet = m91.r1;
                profileActivity.presentFragment(m91.I0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                break;
            case 11:
                ProfileActivity.a0(profileActivity);
                break;
            case 12:
                RectF rectF7 = ProfileActivity.T6;
                profileActivity.H4(view);
                break;
            default:
                RectF rectF8 = ProfileActivity.T6;
                profileActivity.H4(view);
                break;
        }
    }
}
