package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class p40 implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 c;

    public /* synthetic */ p40(int i7, org.telegram.ui.ActionBar.e2 e2Var) {
        this.a = i7;
        this.c = e2Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        int i10 = this.a;
        org.telegram.ui.ActionBar.e2 e2Var = this.c;
        switch (i10) {
            case 0:
                w40 w40Var = (w40) e2Var;
                if (i7 == 67) {
                    if (keyEvent.getAction() != 0) {
                        if (keyEvent.getAction() == 1 && this.b && !w40Var.b0.isEmpty()) {
                            w40Var.h.c((org.telegram.ui.Components.f20) i5.c.h(1, w40Var.b0));
                            w40Var.x0();
                            w40Var.p0();
                            break;
                        }
                    } else {
                        this.b = w40Var.f.r.length() == 0;
                    }
                }
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) e2Var;
                ArrayList arrayList = usersSelectActivity.Q;
                if (i7 == 67) {
                    if (keyEvent.getAction() != 0) {
                        if (keyEvent.getAction() == 1 && this.b && !arrayList.isEmpty()) {
                            org.telegram.ui.Components.f20 f20Var = (org.telegram.ui.Components.f20) i5.c.h(1, arrayList);
                            usersSelectActivity.b.b(f20Var);
                            if (usersSelectActivity.y == 2) {
                                if (f20Var.getUid() == -9223372036854775800L) {
                                    usersSelectActivity.L &= -2;
                                } else if (f20Var.getUid() == -9223372036854775799L) {
                                    usersSelectActivity.L &= -3;
                                } else if (f20Var.getUid() == Long.MIN_VALUE) {
                                    usersSelectActivity.L &= -5;
                                } else if (f20Var.getUid() == -9223372036854775807L) {
                                    usersSelectActivity.L &= -9;
                                }
                            } else if (f20Var.getUid() == Long.MIN_VALUE) {
                                int i11 = org.telegram.messenger.np.D8;
                                usersSelectActivity.L &= -2;
                            } else if (f20Var.getUid() == -9223372036854775807L) {
                                int i12 = org.telegram.messenger.np.D8;
                                usersSelectActivity.L &= -3;
                            } else if (f20Var.getUid() == -9223372036854775806L) {
                                int i13 = org.telegram.messenger.np.D8;
                                usersSelectActivity.L &= -5;
                            } else if (f20Var.getUid() == -9223372036854775805L) {
                                int i14 = org.telegram.messenger.np.D8;
                                usersSelectActivity.L &= -9;
                            } else if (f20Var.getUid() == -9223372036854775804L) {
                                int i15 = org.telegram.messenger.np.D8;
                                usersSelectActivity.L &= -17;
                            } else if (f20Var.getUid() == -9223372036854775803L) {
                                int i16 = org.telegram.messenger.np.D8;
                                usersSelectActivity.L &= -33;
                            } else if (f20Var.getUid() == -9223372036854775802L) {
                                int i17 = org.telegram.messenger.np.D8;
                                usersSelectActivity.L &= -65;
                            } else if (f20Var.getUid() == -9223372036854775801L) {
                                int i18 = org.telegram.messenger.np.D8;
                                usersSelectActivity.L &= -129;
                            }
                            usersSelectActivity.d0();
                            usersSelectActivity.b0();
                            break;
                        }
                    } else {
                        this.b = usersSelectActivity.c.length() == 0;
                    }
                }
                break;
        }
        return true;
    }
}
