package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d60 implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 c;

    public /* synthetic */ d60(int i9, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = i9;
        this.c = o2Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i9, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                k60 k60Var = (k60) this.c;
                if (i9 == 67) {
                    if (keyEvent.getAction() != 0) {
                        if (keyEvent.getAction() == 1 && this.b && !k60Var.W.isEmpty()) {
                            k60Var.h.c((org.telegram.ui.Components.w20) j3.r0.j(1, k60Var.W));
                            k60Var.r0();
                            k60Var.j0();
                            break;
                        }
                    } else {
                        this.b = k60Var.f.r.length() == 0;
                        break;
                    }
                }
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.c;
                ArrayList arrayList = usersSelectActivity.K;
                if (i9 == 67) {
                    if (keyEvent.getAction() != 0) {
                        if (keyEvent.getAction() == 1 && this.b && !arrayList.isEmpty()) {
                            org.telegram.ui.Components.w20 w20Var = (org.telegram.ui.Components.w20) j3.r0.j(1, arrayList);
                            usersSelectActivity.b.b(w20Var);
                            if (usersSelectActivity.x == 2) {
                                if (w20Var.getUid() == -9223372036854775800L) {
                                    usersSelectActivity.F &= -2;
                                } else if (w20Var.getUid() == -9223372036854775799L) {
                                    usersSelectActivity.F &= -3;
                                } else if (w20Var.getUid() == Long.MIN_VALUE) {
                                    usersSelectActivity.F &= -5;
                                } else if (w20Var.getUid() == -9223372036854775807L) {
                                    usersSelectActivity.F &= -9;
                                }
                            } else if (w20Var.getUid() == Long.MIN_VALUE) {
                                usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.F;
                            } else if (w20Var.getUid() == -9223372036854775807L) {
                                usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.F;
                            } else if (w20Var.getUid() == -9223372036854775806L) {
                                usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.F;
                            } else if (w20Var.getUid() == -9223372036854775805L) {
                                usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.F;
                            } else if (w20Var.getUid() == -9223372036854775804L) {
                                usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.F;
                            } else if (w20Var.getUid() == -9223372036854775803L) {
                                usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.F;
                            } else if (w20Var.getUid() == -9223372036854775802L) {
                                usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.F;
                            } else if (w20Var.getUid() == -9223372036854775801L) {
                                usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) & usersSelectActivity.F;
                            }
                            usersSelectActivity.X();
                            usersSelectActivity.V();
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
