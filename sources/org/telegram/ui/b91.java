package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class b91 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b91(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.a) {
            case 0:
                k91 k91Var = (k91) this.b;
                if (i10 != -1) {
                    if (i10 == 2) {
                        k91Var.l0(new zg0(null));
                        break;
                    }
                } else {
                    k91Var.finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((fb1) this.b).finishFragment();
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
                fe1 fe1Var = (fe1) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        fe1.Y(fe1Var);
                        break;
                    }
                } else {
                    fe1Var.finishFragment();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((xe1) this.b).finishFragment();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((og1) this.b).finishFragment();
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
                org.telegram.ui.web.h1 h1Var = (org.telegram.ui.web.h1) this.b;
                if (i10 == -1) {
                    lVar = ((org.telegram.ui.ActionBar.p2) h1Var).actionBar;
                    if (!lVar.s()) {
                        h1Var.finishFragment();
                        break;
                    } else {
                        lVar2 = ((org.telegram.ui.ActionBar.p2) h1Var).actionBar;
                        lVar2.r();
                        h1Var.s.clear();
                        AndroidUtilities.forEachViews((RecyclerView) h1Var.a, (e2.h) new gg.g0(28));
                        break;
                    }
                }
                break;
            case 10:
                if (i10 == -1) {
                    ((qg.a1) this.b).dismiss();
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((wh.h4) this.b).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((xh.h) this.b).finishFragment();
                    break;
                }
                break;
            default:
                yg.s sVar = (yg.s) this.b;
                if (i10 == -1 && !sVar.X(true)) {
                    sVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
