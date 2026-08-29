package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r60 extends il0 {
    public final /* synthetic */ x60 c;

    public r60(x60 x60Var) {
        this.c = x60Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return i10 == 3 || i10 == 1;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        x60 x60Var = this.c;
        if (x60Var.i0 == null) {
            return (TLObject) x60Var.a0.get(i10 - x60Var.U);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) x60Var.j0.get(i10 - x60Var.U);
        if (DialogObject.isUserDialog(dialog.id)) {
            i12 = ((org.telegram.ui.ActionBar.f3) x60Var).currentAccount;
            return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.id));
        }
        i11 = ((org.telegram.ui.ActionBar.f3) x60Var).currentAccount;
        return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.id));
    }

    @Override // f2.p0
    public final int h() {
        return this.c.Y;
    }

    @Override // f2.p0
    public final int j(int i10) {
        x60 x60Var = this.c;
        if (i10 == x60Var.T) {
            return 1;
        }
        x60Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= x60Var.U && i10 < x60Var.V) {
            return 3;
        }
        if (i10 == x60Var.X) {
            return 4;
        }
        return i10 == x60Var.W ? 5 : 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11 = n1Var.f;
        View view = n1Var.a;
        if (i11 == 2) {
            view.requestLayout();
            return;
        }
        if (i11 != 3) {
            return;
        }
        org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
        TLObject E = E(i10);
        Object object = e4Var.getObject();
        long j10 = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
        x60 x60Var = this.c;
        e4Var.e(E, null, null, i10 != x60Var.V);
        long j11 = E instanceof TLRPC.User ? ((TLRPC.User) E).id : E instanceof TLRPC.Chat ? -((TLRPC.Chat) E).id : 0L;
        if (j11 != 0) {
            a0.h hVar = x60Var.P;
            if (hVar == null || hVar.h(j11) < 0) {
                e4Var.c(x60Var.b0.h(j11) >= 0, j10 == j11);
                e4Var.setCheckBoxEnabled(true);
            } else {
                e4Var.c(true, false);
                e4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            x60 x60Var = this.c;
            if (i10 == 3) {
                view = new org.telegram.ui.Cells.e4(context, 1, 0, x60Var.i0 != null);
            } else if (i10 == 4) {
                view = new View(context);
            } else if (i10 != 5) {
                org.telegram.ui.Cells.w4 w4Var = new org.telegram.ui.Cells.w4(context);
                w4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                int i11 = org.telegram.ui.ActionBar.g6.n5;
                w4Var.a(i11, i11);
                view = w4Var;
            } else {
                q60 q60Var = new q60(context, null, 0, null, 0);
                q60Var.setLayoutParams(new f2.x0(-1, -1));
                q60Var.e.setVisibility(8);
                org.telegram.ui.xt xtVar = x60Var.i0;
                gh.s sVar = q60Var.d;
                if (xtVar != null) {
                    sVar.setText(LocaleController.getString(R.string.FilterNoChats));
                } else {
                    sVar.setText(LocaleController.getString(R.string.NoContacts));
                }
                q60Var.setAnimateLayoutChange(true);
                view = q60Var;
            }
        } else {
            view = new cg.h0(this, context, 15);
        }
        return new vk0(view);
    }
}
