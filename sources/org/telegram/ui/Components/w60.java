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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class w60 extends rl0 {
    public final /* synthetic */ c70 c;

    public w60(c70 c70Var) {
        this.c = c70Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 3 || i10 == 1;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        c70 c70Var = this.c;
        if (c70Var.j0 == null) {
            return (TLObject) c70Var.b0.get(i10 - c70Var.V);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) c70Var.k0.get(i10 - c70Var.V);
        if (DialogObject.isUserDialog(dialog.id)) {
            i12 = ((org.telegram.ui.ActionBar.g3) c70Var).currentAccount;
            return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.id));
        }
        i11 = ((org.telegram.ui.ActionBar.g3) c70Var).currentAccount;
        return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.id));
    }

    @Override // f2.o0
    public final int h() {
        return this.c.Z;
    }

    @Override // f2.o0
    public final int j(int i10) {
        c70 c70Var = this.c;
        if (i10 == c70Var.U) {
            return 1;
        }
        c70Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= c70Var.V && i10 < c70Var.W) {
            return 3;
        }
        if (i10 == c70Var.Y) {
            return 4;
        }
        return i10 == c70Var.X ? 5 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 == 2) {
            view.requestLayout();
            return;
        }
        if (i11 != 3) {
            return;
        }
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        TLObject E = E(i10);
        Object object = g4Var.getObject();
        long j10 = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
        c70 c70Var = this.c;
        g4Var.e(E, null, null, i10 != c70Var.W);
        long j11 = E instanceof TLRPC.User ? ((TLRPC.User) E).id : E instanceof TLRPC.Chat ? -((TLRPC.Chat) E).id : 0L;
        if (j11 != 0) {
            a0.h hVar = c70Var.Q;
            if (hVar == null || hVar.h(j11) < 0) {
                g4Var.c(c70Var.c0.h(j11) >= 0, j10 == j11);
                g4Var.setCheckBoxEnabled(true);
            } else {
                g4Var.c(true, false);
                g4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            c70 c70Var = this.c;
            if (i10 == 3) {
                view = new org.telegram.ui.Cells.g4(context, 1, 0, c70Var.j0 != null);
            } else if (i10 == 4) {
                view = new View(context);
            } else if (i10 != 5) {
                org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(context);
                y4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                int i11 = org.telegram.ui.ActionBar.j6.n5;
                y4Var.a(i11, i11);
                view = y4Var;
            } else {
                v60 v60Var = new v60(context, null, 0, null, 0);
                v60Var.setLayoutParams(new f2.w0(-1, -1));
                v60Var.e.setVisibility(8);
                org.telegram.ui.fu fuVar = c70Var.j0;
                ih.s sVar = v60Var.d;
                if (fuVar != null) {
                    sVar.setText(LocaleController.getString(R.string.FilterNoChats));
                } else {
                    sVar.setText(LocaleController.getString(R.string.NoContacts));
                }
                v60Var.setAnimateLayoutChange(true);
                view = v60Var;
            }
        } else {
            view = new eg.h0(this, context, 13);
        }
        return new el0(view);
    }
}
