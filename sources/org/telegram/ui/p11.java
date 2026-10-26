package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class p11 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p11(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    ((ProxyListActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((g21) this.b).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((y21) this.b).finishFragment();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((g31) this.b).finishFragment();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((SecretMediaViewer) this.b).e(true, false);
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((SessionsActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 7:
                d81 d81Var = (d81) this.b;
                if (i10 != -1) {
                    if (i10 == 2) {
                        d81Var.j0(new jg0(null));
                        break;
                    }
                } else if (!d81Var.N) {
                    d81Var.finishFragment();
                    break;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", d81Var.getUserConfig().getClientUserId());
                    bundle.putBoolean("immediate", true);
                    d81Var.presentFragment(new ai.z0(bundle));
                    break;
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((w91) this.b).finishFragment();
                    break;
                }
                break;
            case 9:
                StickersActivity stickersActivity = (StickersActivity) this.b;
                if (i10 != -1) {
                    StickersActivity.e0(stickersActivity, i10);
                    break;
                } else if (stickersActivity.onBackPressed(true)) {
                    stickersActivity.finishFragment();
                    break;
                }
                break;
            case 10:
                xc1 xc1Var = (xc1) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        xc1.Z(xc1Var);
                        break;
                    }
                } else {
                    xc1Var.finishFragment();
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((pd1) this.b).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((gf1) this.b).finishFragment();
                    break;
                }
                break;
            case 13:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                    if (twoStepVerificationActivity.X < 0) {
                        twoStepVerificationActivity.finishFragment();
                        break;
                    } else {
                        twoStepVerificationActivity.y0();
                        break;
                    }
                }
                break;
            case 14:
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        userInfoActivity.d0(true);
                        break;
                    }
                } else if (userInfoActivity.onBackPressed(true)) {
                    userInfoActivity.finishFragment();
                    break;
                }
                break;
            case 15:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        usersSelectActivity.Y();
                        break;
                    }
                } else {
                    usersSelectActivity.finishFragment();
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Wallet.i9 i9Var = (org.telegram.ui.Wallet.i9) this.b;
                if (i10 != -1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            i9Var.q0();
                            break;
                        }
                    } else {
                        Activity parentActivity = i9Var.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.r2) i9Var).currentAccount;
                        org.telegram.ui.Wallet.m5.F0(parentActivity, i11, i9Var.getResourceProvider());
                        break;
                    }
                } else {
                    i9Var.finishFragment();
                    break;
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((tg.y0) this.b).dismiss();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((zh.h4) this.b).finishFragment();
                    break;
                }
                break;
        }
    }
}
