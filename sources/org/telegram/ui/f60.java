package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f60 implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 c;

    public /* synthetic */ f60(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = i10;
        this.c = o2Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                m60 m60Var = (m60) this.c;
                if (i10 == 67) {
                    if (keyEvent.getAction() != 0) {
                        if (keyEvent.getAction() == 1 && this.b && !m60Var.W.isEmpty()) {
                            m60Var.h.c((org.telegram.ui.Components.j30) j7.l1.i(1, m60Var.W));
                            m60Var.s0();
                            m60Var.k0();
                            break;
                        }
                    } else {
                        this.b = m60Var.f.r.length() == 0;
                        break;
                    }
                }
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.c;
                ArrayList arrayList = usersSelectActivity.K;
                if (i10 == 67) {
                    if (keyEvent.getAction() != 0) {
                        if (keyEvent.getAction() == 1 && this.b && !arrayList.isEmpty()) {
                            org.telegram.ui.Components.j30 j30Var = (org.telegram.ui.Components.j30) j7.l1.i(1, arrayList);
                            usersSelectActivity.b.b(j30Var);
                            if (usersSelectActivity.x == 2) {
                                if (j30Var.getUid() == -9223372036854775800L) {
                                    usersSelectActivity.F &= -2;
                                } else if (j30Var.getUid() == -9223372036854775799L) {
                                    usersSelectActivity.F &= -3;
                                } else if (j30Var.getUid() == Long.MIN_VALUE) {
                                    usersSelectActivity.F &= -5;
                                } else if (j30Var.getUid() == -9223372036854775807L) {
                                    usersSelectActivity.F &= -9;
                                }
                            } else if (j30Var.getUid() == Long.MIN_VALUE) {
                                usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.F;
                            } else if (j30Var.getUid() == -9223372036854775807L) {
                                usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.F;
                            } else if (j30Var.getUid() == -9223372036854775806L) {
                                usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.F;
                            } else if (j30Var.getUid() == -9223372036854775805L) {
                                usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.F;
                            } else if (j30Var.getUid() == -9223372036854775804L) {
                                usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.F;
                            } else if (j30Var.getUid() == -9223372036854775803L) {
                                usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.F;
                            } else if (j30Var.getUid() == -9223372036854775802L) {
                                usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.F;
                            } else if (j30Var.getUid() == -9223372036854775801L) {
                                usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) & usersSelectActivity.F;
                            }
                            usersSelectActivity.Y();
                            usersSelectActivity.W();
                            break;
                        }
                    } else {
                        this.b = usersSelectActivity.c.length() == 0;
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
