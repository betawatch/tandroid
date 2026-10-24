package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class c31 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c31(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    ((e31) this.b).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((SecretMediaViewer) this.b).e(true, false);
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((SessionsActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 4:
                c81 c81Var = (c81) this.b;
                if (i10 != -1) {
                    if (i10 == 2) {
                        c81Var.n0(new lg0(null));
                        break;
                    }
                } else if (!c81Var.M) {
                    c81Var.finishFragment();
                    break;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", c81Var.getUserConfig().getClientUserId());
                    bundle.putBoolean("immediate", true);
                    c81Var.presentFragment(new zh.n0(bundle));
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((u91) this.b).finishFragment();
                    break;
                }
                break;
            case 6:
                StickersActivity stickersActivity = (StickersActivity) this.b;
                if (i10 != -1) {
                    StickersActivity.d0(stickersActivity, i10);
                    break;
                } else if (stickersActivity.onBackPressed(true)) {
                    stickersActivity.finishFragment();
                    break;
                }
                break;
            case 7:
                uc1 uc1Var = (uc1) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        uc1.Y(uc1Var);
                        break;
                    }
                } else {
                    uc1Var.finishFragment();
                    break;
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((md1) this.b).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((ef1) this.b).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                    if (twoStepVerificationActivity.X < 0) {
                        twoStepVerificationActivity.finishFragment();
                        break;
                    } else {
                        twoStepVerificationActivity.x0();
                        break;
                    }
                }
                break;
            case 11:
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        userInfoActivity.c0(true);
                        break;
                    }
                } else if (userInfoActivity.onBackPressed(true)) {
                    userInfoActivity.finishFragment();
                    break;
                }
                break;
            case 12:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        usersSelectActivity.X();
                        break;
                    }
                } else {
                    usersSelectActivity.finishFragment();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Wallet.j9 j9Var = (org.telegram.ui.Wallet.j9) this.b;
                if (i10 != -1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            j9Var.p0();
                            break;
                        }
                    } else {
                        Activity parentActivity = j9Var.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.o2) j9Var).currentAccount;
                        org.telegram.ui.Wallet.o5.E0(parentActivity, i11, j9Var.getResourceProvider());
                        break;
                    }
                } else {
                    j9Var.finishFragment();
                    break;
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((sg.y0) this.b).dismiss();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((yh.g4) this.b).finishFragment();
                    break;
                }
                break;
        }
    }
}
