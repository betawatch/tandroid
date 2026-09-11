package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
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
                        i91Var.l0(new yg0(null));
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
                be1 be1Var = (be1) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        be1.Y(be1Var);
                        break;
                    }
                } else {
                    be1Var.finishFragment();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((te1) this.b).finishFragment();
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((kg1) this.b).finishFragment();
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
                org.telegram.ui.web.i1 i1Var = (org.telegram.ui.web.i1) this.b;
                if (i10 == -1) {
                    kVar = ((org.telegram.ui.ActionBar.n2) i1Var).actionBar;
                    if (!kVar.s()) {
                        i1Var.finishFragment();
                        break;
                    } else {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) i1Var).actionBar;
                        kVar2.r();
                        i1Var.s.clear();
                        AndroidUtilities.forEachViews((RecyclerView) i1Var.a, (e2.h) new org.telegram.ui.web.n(1));
                        break;
                    }
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((sg.a1) this.b).dismiss();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((yh.g4) this.b).finishFragment();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((zh.g) this.b).finishFragment();
                    break;
                }
                break;
        }
    }
}
