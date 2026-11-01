package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class n50 implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 c;

    public /* synthetic */ n50(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.a = i10;
        this.c = k2Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        int i11 = this.a;
        org.telegram.ui.ActionBar.k2 k2Var = this.c;
        switch (i11) {
            case 0:
                u50 u50Var = (u50) k2Var;
                if (i10 == 67) {
                    if (keyEvent.getAction() != 0) {
                        if (keyEvent.getAction() == 1 && this.b && !u50Var.a0.isEmpty()) {
                            u50Var.h.c((org.telegram.ui.Components.s20) i0.a.g(1, u50Var.a0));
                            u50Var.x0();
                            u50Var.p0();
                            break;
                        }
                    } else {
                        this.b = u50Var.f.r.length() == 0;
                    }
                }
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) k2Var;
                ArrayList arrayList = usersSelectActivity.O;
                if (i10 == 67) {
                    if (keyEvent.getAction() != 0) {
                        if (keyEvent.getAction() == 1 && this.b && !arrayList.isEmpty()) {
                            org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) i0.a.g(1, arrayList);
                            usersSelectActivity.b.b(s20Var);
                            if (usersSelectActivity.y == 2) {
                                if (s20Var.getUid() == -9223372036854775800L) {
                                    usersSelectActivity.J &= -2;
                                } else if (s20Var.getUid() == -9223372036854775799L) {
                                    usersSelectActivity.J &= -3;
                                } else if (s20Var.getUid() == Long.MIN_VALUE) {
                                    usersSelectActivity.J &= -5;
                                } else if (s20Var.getUid() == -9223372036854775807L) {
                                    usersSelectActivity.J &= -9;
                                }
                            } else if (s20Var.getUid() == Long.MIN_VALUE) {
                                int i12 = org.telegram.messenger.wp.D8;
                                usersSelectActivity.J &= -2;
                            } else if (s20Var.getUid() == -9223372036854775807L) {
                                int i13 = org.telegram.messenger.wp.D8;
                                usersSelectActivity.J &= -3;
                            } else if (s20Var.getUid() == -9223372036854775806L) {
                                int i14 = org.telegram.messenger.wp.D8;
                                usersSelectActivity.J &= -5;
                            } else if (s20Var.getUid() == -9223372036854775805L) {
                                int i15 = org.telegram.messenger.wp.D8;
                                usersSelectActivity.J &= -9;
                            } else if (s20Var.getUid() == -9223372036854775804L) {
                                int i16 = org.telegram.messenger.wp.D8;
                                usersSelectActivity.J &= -17;
                            } else if (s20Var.getUid() == -9223372036854775803L) {
                                int i17 = org.telegram.messenger.wp.D8;
                                usersSelectActivity.J &= -33;
                            } else if (s20Var.getUid() == -9223372036854775802L) {
                                int i18 = org.telegram.messenger.wp.D8;
                                usersSelectActivity.J &= -65;
                            } else if (s20Var.getUid() == -9223372036854775801L) {
                                int i19 = org.telegram.messenger.wp.D8;
                                usersSelectActivity.J &= -129;
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
