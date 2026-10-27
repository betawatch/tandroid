package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class m60 implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 c;

    public /* synthetic */ m60(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.a = i10;
        this.c = r2Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                t60 t60Var = (t60) this.c;
                if (i10 == 67) {
                    if (keyEvent.getAction() != 0) {
                        if (keyEvent.getAction() == 1 && this.b && !t60Var.a0.isEmpty()) {
                            t60Var.h.c((org.telegram.ui.Components.x30) ic.a.g(1, t60Var.a0));
                            t60Var.t0();
                            t60Var.l0();
                            break;
                        }
                    } else {
                        this.b = t60Var.f.r.length() == 0;
                        break;
                    }
                }
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.c;
                ArrayList arrayList = usersSelectActivity.O;
                if (i10 == 67) {
                    if (keyEvent.getAction() != 0) {
                        if (keyEvent.getAction() == 1 && this.b && !arrayList.isEmpty()) {
                            org.telegram.ui.Components.x30 x30Var = (org.telegram.ui.Components.x30) ic.a.g(1, arrayList);
                            usersSelectActivity.b.b(x30Var);
                            if (usersSelectActivity.x == 2) {
                                if (x30Var.getUid() == -9223372036854775800L) {
                                    usersSelectActivity.J &= -2;
                                } else if (x30Var.getUid() == -9223372036854775799L) {
                                    usersSelectActivity.J &= -3;
                                } else if (x30Var.getUid() == Long.MIN_VALUE) {
                                    usersSelectActivity.J &= -5;
                                } else if (x30Var.getUid() == -9223372036854775807L) {
                                    usersSelectActivity.J &= -9;
                                }
                            } else if (x30Var.getUid() == Long.MIN_VALUE) {
                                usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.J;
                            } else if (x30Var.getUid() == -9223372036854775807L) {
                                usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.J;
                            } else if (x30Var.getUid() == -9223372036854775806L) {
                                usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.J;
                            } else if (x30Var.getUid() == -9223372036854775805L) {
                                usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.J;
                            } else if (x30Var.getUid() == -9223372036854775804L) {
                                usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.J;
                            } else if (x30Var.getUid() == -9223372036854775803L) {
                                usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.J;
                            } else if (x30Var.getUid() == -9223372036854775802L) {
                                usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.J;
                            } else if (x30Var.getUid() == -9223372036854775801L) {
                                usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) & usersSelectActivity.J;
                            }
                            usersSelectActivity.Z();
                            usersSelectActivity.X();
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
