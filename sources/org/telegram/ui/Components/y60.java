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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class y60 extends rl0 {
    public final /* synthetic */ e70 c;

    public y60(e70 e70Var) {
        this.c = e70Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f;
        return i10 == 3 || i10 == 1;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        e70 e70Var = this.c;
        if (e70Var.j0 == null) {
            return (TLObject) e70Var.b0.get(i10 - e70Var.V);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) e70Var.k0.get(i10 - e70Var.V);
        if (DialogObject.isUserDialog(dialog.id)) {
            i12 = ((org.telegram.ui.ActionBar.h3) e70Var).currentAccount;
            return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.id));
        }
        i11 = ((org.telegram.ui.ActionBar.h3) e70Var).currentAccount;
        return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.id));
    }

    @Override // f2.p0
    public final int h() {
        return this.c.Z;
    }

    @Override // f2.p0
    public final int j(int i10) {
        e70 e70Var = this.c;
        if (i10 == e70Var.U) {
            return 1;
        }
        e70Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= e70Var.V && i10 < e70Var.W) {
            return 3;
        }
        if (i10 == e70Var.Y) {
            return 4;
        }
        return i10 == e70Var.X ? 5 : 0;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        int i11 = m1Var.f;
        View view = m1Var.a;
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
        e70 e70Var = this.c;
        g4Var.e(E, null, null, i10 != e70Var.W);
        long j11 = E instanceof TLRPC.User ? ((TLRPC.User) E).id : E instanceof TLRPC.Chat ? -((TLRPC.Chat) E).id : 0L;
        if (j11 != 0) {
            a0.h hVar = e70Var.Q;
            if (hVar == null || hVar.h(j11) < 0) {
                g4Var.c(e70Var.c0.h(j11) >= 0, j10 == j11);
                g4Var.setCheckBoxEnabled(true);
            } else {
                g4Var.c(true, false);
                g4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            e70 e70Var = this.c;
            if (i10 == 3) {
                view = new org.telegram.ui.Cells.g4(context, 1, 0, e70Var.j0 != null);
            } else if (i10 == 4) {
                view = new View(context);
            } else if (i10 != 5) {
                org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(context);
                y4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                int i11 = org.telegram.ui.ActionBar.k6.n5;
                y4Var.a(i11, i11);
                view = y4Var;
            } else {
                x60 x60Var = new x60(context, null, 0, null, 0);
                x60Var.setLayoutParams(new f2.x0(-1, -1));
                x60Var.e.setVisibility(8);
                org.telegram.ui.gu guVar = e70Var.j0;
                jh.s sVar = x60Var.d;
                if (guVar != null) {
                    sVar.setText(LocaleController.getString(R.string.FilterNoChats));
                } else {
                    sVar.setText(LocaleController.getString(R.string.NoContacts));
                }
                x60Var.setAnimateLayoutChange(true);
                view = x60Var;
            }
        } else {
            view = new fg.h0(this, context, 13);
        }
        return new el0(view);
    }
}
