package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ed1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;

    public /* synthetic */ ed1(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    ((ld1) this.b).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((cf1) this.b).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                    if (twoStepVerificationActivity.T < 0) {
                        twoStepVerificationActivity.finishFragment();
                        break;
                    } else {
                        twoStepVerificationActivity.x0();
                        break;
                    }
                }
                break;
            case 3:
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
            case 4:
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
            case 5:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.b;
                if (i10 == -1) {
                    kVar = ((org.telegram.ui.ActionBar.n2) d1Var).actionBar;
                    if (!kVar.t()) {
                        d1Var.finishFragment();
                        break;
                    } else {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) d1Var).actionBar;
                        kVar2.s();
                        d1Var.s.clear();
                        AndroidUtilities.forEachViews((RecyclerView) d1Var.a, (d5.d) new j4.w0(15));
                        break;
                    }
                }
                break;
            case 6:
                qf.e eVar = (qf.e) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        eVar.X();
                        break;
                    }
                } else if (eVar.onBackPressed(true)) {
                    eVar.finishFragment();
                    break;
                }
                break;
            case 7:
                qf.m mVar = (qf.m) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        mVar.h0();
                        break;
                    }
                } else if (mVar.onBackPressed(true)) {
                    mVar.finishFragment();
                    break;
                }
                break;
            case 8:
                qf.m0 m0Var = (qf.m0) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        m0Var.a0();
                        break;
                    }
                } else if (m0Var.onBackPressed(true)) {
                    m0Var.finishFragment();
                    break;
                }
                break;
            case 9:
                qf.o0 o0Var = (qf.o0) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        o0Var.X();
                        break;
                    }
                } else if (o0Var.onBackPressed(true)) {
                    o0Var.finishFragment();
                    break;
                }
                break;
            case 10:
                qf.w0 w0Var = (qf.w0) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        w0Var.W();
                        break;
                    }
                } else if (w0Var.onBackPressed(true)) {
                    w0Var.finishFragment();
                    break;
                }
                break;
            case 11:
                qf.y0 y0Var = (qf.y0) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        y0Var.d0();
                        break;
                    }
                } else if (y0Var.onBackPressed(true)) {
                    y0Var.finishFragment();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((qf.a1) this.b).finishFragment();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((qf.s1) this.b).finishFragment();
                    break;
                }
                break;
        }
    }
}
