package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class o81 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o81(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        switch (this.a) {
            case 0:
                x81 x81Var = (x81) this.b;
                if (i10 != -1) {
                    if (i10 == 2) {
                        x81Var.l0(new tg0(null));
                        break;
                    }
                } else {
                    x81Var.finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((ra1) this.b).finishFragment();
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
                td1 td1Var = (td1) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        td1.Y(td1Var);
                        break;
                    }
                } else {
                    td1Var.finishFragment();
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
                        usersSelectActivity.X();
                        break;
                    }
                } else {
                    usersSelectActivity.finishFragment();
                    break;
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((rg.x0) this.b).dismiss();
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
