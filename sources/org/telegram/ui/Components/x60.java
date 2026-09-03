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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class x60 extends ql0 {
    public final /* synthetic */ d70 c;

    public x60(d70 d70Var) {
        this.c = d70Var;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 3 || i10 == 1;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        d70 d70Var = this.c;
        if (d70Var.j0 == null) {
            return (TLObject) d70Var.b0.get(i10 - d70Var.V);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) d70Var.k0.get(i10 - d70Var.V);
        if (DialogObject.isUserDialog(dialog.id)) {
            i12 = ((org.telegram.ui.ActionBar.g3) d70Var).currentAccount;
            return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.id));
        }
        i11 = ((org.telegram.ui.ActionBar.g3) d70Var).currentAccount;
        return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.id));
    }

    @Override // f2.o0
    public final int h() {
        return this.c.Z;
    }

    @Override // f2.o0
    public final int j(int i10) {
        d70 d70Var = this.c;
        if (i10 == d70Var.U) {
            return 1;
        }
        d70Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= d70Var.V && i10 < d70Var.W) {
            return 3;
        }
        if (i10 == d70Var.Y) {
            return 4;
        }
        return i10 == d70Var.X ? 5 : 0;
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
        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
        TLObject E = E(i10);
        Object object = f4Var.getObject();
        long j10 = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
        d70 d70Var = this.c;
        f4Var.e(E, null, null, i10 != d70Var.W);
        long j11 = E instanceof TLRPC.User ? ((TLRPC.User) E).id : E instanceof TLRPC.Chat ? -((TLRPC.Chat) E).id : 0L;
        if (j11 != 0) {
            a0.h hVar = d70Var.Q;
            if (hVar == null || hVar.h(j11) < 0) {
                f4Var.c(d70Var.c0.h(j11) >= 0, j10 == j11);
                f4Var.setCheckBoxEnabled(true);
            } else {
                f4Var.c(true, false);
                f4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            d70 d70Var = this.c;
            if (i10 == 3) {
                view = new org.telegram.ui.Cells.f4(context, 1, 0, d70Var.j0 != null);
            } else if (i10 == 4) {
                view = new View(context);
            } else if (i10 != 5) {
                org.telegram.ui.Cells.x4 x4Var = new org.telegram.ui.Cells.x4(context);
                x4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                int i11 = org.telegram.ui.ActionBar.j6.n5;
                x4Var.a(i11, i11);
                view = x4Var;
            } else {
                w60 w60Var = new w60(context, null, 0, null, 0);
                w60Var.setLayoutParams(new f2.w0(-1, -1));
                w60Var.e.setVisibility(8);
                org.telegram.ui.hu huVar = d70Var.j0;
                ih.s sVar = w60Var.d;
                if (huVar != null) {
                    sVar.setText(LocaleController.getString(R.string.FilterNoChats));
                } else {
                    sVar.setText(LocaleController.getString(R.string.NoContacts));
                }
                w60Var.setAnimateLayoutChange(true);
                view = w60Var;
            }
        } else {
            view = new eg.h0(this, context, 13);
        }
        return new dl0(view);
    }
}
