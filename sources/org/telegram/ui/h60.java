package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h60 implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;

    public /* synthetic */ h60(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = i10;
        this.c = n2Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                o60 o60Var = (o60) this.c;
                if (i10 == 67) {
                    if (keyEvent.getAction() != 0) {
                        if (keyEvent.getAction() == 1 && this.b && !o60Var.W.isEmpty()) {
                            o60Var.h.c((org.telegram.ui.Components.a30) i0.a.i(1, o60Var.W));
                            o60Var.s0();
                            o60Var.k0();
                            break;
                        }
                    } else {
                        this.b = o60Var.f.r.length() == 0;
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
                            org.telegram.ui.Components.a30 a30Var = (org.telegram.ui.Components.a30) i0.a.i(1, arrayList);
                            usersSelectActivity.b.b(a30Var);
                            if (usersSelectActivity.x == 2) {
                                if (a30Var.getUid() == -9223372036854775800L) {
                                    usersSelectActivity.F &= -2;
                                } else if (a30Var.getUid() == -9223372036854775799L) {
                                    usersSelectActivity.F &= -3;
                                } else if (a30Var.getUid() == Long.MIN_VALUE) {
                                    usersSelectActivity.F &= -5;
                                } else if (a30Var.getUid() == -9223372036854775807L) {
                                    usersSelectActivity.F &= -9;
                                }
                            } else if (a30Var.getUid() == Long.MIN_VALUE) {
                                usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.F;
                            } else if (a30Var.getUid() == -9223372036854775807L) {
                                usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.F;
                            } else if (a30Var.getUid() == -9223372036854775806L) {
                                usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.F;
                            } else if (a30Var.getUid() == -9223372036854775805L) {
                                usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.F;
                            } else if (a30Var.getUid() == -9223372036854775804L) {
                                usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.F;
                            } else if (a30Var.getUid() == -9223372036854775803L) {
                                usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.F;
                            } else if (a30Var.getUid() == -9223372036854775802L) {
                                usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.F;
                            } else if (a30Var.getUid() == -9223372036854775801L) {
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
