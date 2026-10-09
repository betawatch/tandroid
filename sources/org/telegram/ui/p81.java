package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class p81 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p81(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    ((SessionsActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 1:
                i91 i91Var = (i91) this.b;
                if (i10 != -1) {
                    if (i10 == 2) {
                        i91Var.l0(new zg0(null));
                        break;
                    }
                } else {
                    i91Var.finishFragment();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((bb1) this.b).finishFragment();
                    break;
                }
                break;
            case 3:
                StickersActivity stickersActivity = (StickersActivity) this.b;
                if (i10 != -1) {
                    StickersActivity.d0(stickersActivity, i10);
                    break;
                } else if (stickersActivity.onBackPressed(true)) {
                    stickersActivity.finishFragment();
                    break;
                }
                break;
            case 4:
                ce1 ce1Var = (ce1) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        ce1.Y(ce1Var);
                        break;
                    }
                } else {
                    ce1Var.finishFragment();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((ue1) this.b).finishFragment();
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((lg1) this.b).finishFragment();
                    break;
                }
                break;
            case 7:
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
            case 8:
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
            case 9:
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
            case 10:
                org.telegram.ui.Wallet.j8 j8Var = (org.telegram.ui.Wallet.j8) this.b;
                if (i10 != -1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            j8Var.o0();
                            break;
                        }
                    } else {
                        Activity parentActivity = j8Var.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.n2) j8Var).currentAccount;
                        org.telegram.ui.Wallet.a5.u0(parentActivity, i11, j8Var.getResourceProvider());
                        break;
                    }
                } else {
                    j8Var.finishFragment();
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((rg.y0) this.b).dismiss();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((xh.i4) this.b).finishFragment();
                    break;
                }
                break;
            case 13:
                if (i10 == -1) {
                    ((yh.g) this.b).finishFragment();
                    break;
                }
                break;
            default:
                zg.q qVar = (zg.q) this.b;
                if (i10 == -1 && !qVar.X(true)) {
                    qVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
