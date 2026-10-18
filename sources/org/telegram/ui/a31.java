package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class a31 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a31(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    ((c31) this.b).finishFragment();
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
                z71 z71Var = (z71) this.b;
                if (i10 != -1) {
                    if (i10 == 2) {
                        z71Var.l0(new ig0(null));
                        break;
                    }
                } else {
                    z71Var.finishFragment();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((r91) this.b).finishFragment();
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
                qc1 qc1Var = (qc1) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        qc1.Y(qc1Var);
                        break;
                    }
                } else {
                    qc1Var.finishFragment();
                    break;
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((id1) this.b).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((ze1) this.b).finishFragment();
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
                org.telegram.ui.Wallet.o9 o9Var = (org.telegram.ui.Wallet.o9) this.b;
                if (i10 != -1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            o9Var.o0();
                            break;
                        }
                    } else {
                        Activity parentActivity = o9Var.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.n2) o9Var).currentAccount;
                        org.telegram.ui.Wallet.m5.C0(parentActivity, i11, o9Var.getResourceProvider());
                        break;
                    }
                } else {
                    o9Var.finishFragment();
                    break;
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((sg.x0) this.b).dismiss();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((yh.h4) this.b).finishFragment();
                    break;
                }
                break;
        }
    }
}
