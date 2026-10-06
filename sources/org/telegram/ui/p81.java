package org.telegram.ui;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
        switch (this.a) {
            case 0:
                y81 y81Var = (y81) this.b;
                if (i10 != -1) {
                    if (i10 == 2) {
                        y81Var.i0(new wg0(null));
                        break;
                    }
                } else {
                    y81Var.finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((ta1) this.b).finishFragment();
                    break;
                }
                break;
            case 2:
                StickersActivity stickersActivity = (StickersActivity) this.b;
                if (i10 != -1) {
                    StickersActivity.d0(stickersActivity, i10);
                    break;
                } else if (stickersActivity.onBackPressed(true)) {
                    stickersActivity.finishFragment();
                    break;
                }
                break;
            case 3:
                ud1 ud1Var = (ud1) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        ud1.X(ud1Var);
                        break;
                    }
                } else {
                    ud1Var.finishFragment();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((le1) this.b).finishFragment();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((cg1) this.b).finishFragment();
                    break;
                }
                break;
            case 6:
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
            case 7:
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
            case 8:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        usersSelectActivity.W();
                        break;
                    }
                } else {
                    usersSelectActivity.finishFragment();
                    break;
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((rg.y0) this.b).dismiss();
                    break;
                }
                break;
            case 10:
                if (i10 == -1) {
                    ((xh.i4) this.b).finishFragment();
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((yh.h) this.b).finishFragment();
                    break;
                }
                break;
            default:
                zg.o oVar = (zg.o) this.b;
                if (i10 == -1 && !oVar.X(true)) {
                    oVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
