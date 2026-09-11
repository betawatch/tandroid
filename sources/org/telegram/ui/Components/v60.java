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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class v60 extends kl0 {
    public final /* synthetic */ b70 c;

    public v60(b70 b70Var) {
        this.c = b70Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 1;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        b70 b70Var = this.c;
        if (b70Var.m0 == null) {
            return (TLObject) b70Var.e0.get(i10 - b70Var.Y);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) b70Var.n0.get(i10 - b70Var.Y);
        if (DialogObject.isUserDialog(dialog.id)) {
            i12 = ((org.telegram.ui.ActionBar.f3) b70Var).currentAccount;
            return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.id));
        }
        i11 = ((org.telegram.ui.ActionBar.f3) b70Var).currentAccount;
        return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.id));
    }

    @Override // s4.h0
    public final int h() {
        return this.c.c0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        b70 b70Var = this.c;
        if (i10 == b70Var.X) {
            return 1;
        }
        b70Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= b70Var.Y && i10 < b70Var.Z) {
            return 3;
        }
        if (i10 == b70Var.b0) {
            return 4;
        }
        return i10 == b70Var.a0 ? 5 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
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
        long j3 = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
        b70 b70Var = this.c;
        f4Var.e(E, null, null, i10 != b70Var.Z);
        long j10 = E instanceof TLRPC.User ? ((TLRPC.User) E).id : E instanceof TLRPC.Chat ? -((TLRPC.Chat) E).id : 0L;
        if (j10 != 0) {
            a0.i iVar = b70Var.T;
            if (iVar == null || iVar.h(j10) < 0) {
                f4Var.c(b70Var.f0.h(j10) >= 0, j3 == j10);
                f4Var.setCheckBoxEnabled(true);
            } else {
                f4Var.c(true, false);
                f4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            b70 b70Var = this.c;
            if (i10 == 3) {
                view = new org.telegram.ui.Cells.f4(context, 1, 0, b70Var.m0 != null);
            } else if (i10 == 4) {
                view = new View(context);
            } else if (i10 != 5) {
                org.telegram.ui.Cells.x4 x4Var = new org.telegram.ui.Cells.x4(context);
                x4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                int i11 = org.telegram.ui.ActionBar.j6.n5;
                x4Var.a(i11, i11);
                view = x4Var;
            } else {
                u60 u60Var = new u60(context, null, 0, null, 0);
                u60Var.setLayoutParams(new s4.p0(-1, -1));
                u60Var.e.setVisibility(8);
                org.telegram.ui.iu iuVar = b70Var.m0;
                wh.p pVar = u60Var.d;
                if (iuVar != null) {
                    pVar.setText(LocaleController.getString(R.string.FilterNoChats));
                } else {
                    pVar.setText(LocaleController.getString(R.string.NoContacts));
                }
                u60Var.setAnimateLayoutChange(true);
                view = u60Var;
            }
        } else {
            view = new di.eb(this, context, 18);
        }
        return new vk0(view);
    }
}
