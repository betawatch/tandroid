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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class j60 extends yk0 {
    public final /* synthetic */ p60 c;

    public j60(p60 p60Var) {
        this.c = p60Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f;
        return i10 == 3 || i10 == 1;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        p60 p60Var = this.c;
        if (p60Var.i0 == null) {
            return (TLObject) p60Var.a0.get(i10 - p60Var.U);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) p60Var.j0.get(i10 - p60Var.U);
        if (DialogObject.isUserDialog(dialog.id)) {
            i12 = ((org.telegram.ui.ActionBar.e3) p60Var).currentAccount;
            return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.id));
        }
        i11 = ((org.telegram.ui.ActionBar.e3) p60Var).currentAccount;
        return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.id));
    }

    @Override // f2.q0
    public final int h() {
        return this.c.Y;
    }

    @Override // f2.q0
    public final int j(int i10) {
        p60 p60Var = this.c;
        if (i10 == p60Var.T) {
            return 1;
        }
        p60Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= p60Var.U && i10 < p60Var.V) {
            return 3;
        }
        if (i10 == p60Var.X) {
            return 4;
        }
        return i10 == p60Var.W ? 5 : 0;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        int i11 = o1Var.f;
        View view = o1Var.a;
        if (i11 == 2) {
            view.requestLayout();
            return;
        }
        if (i11 != 3) {
            return;
        }
        org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
        TLObject E = E(i10);
        Object object = d4Var.getObject();
        long j10 = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
        p60 p60Var = this.c;
        d4Var.e(E, null, null, i10 != p60Var.V);
        long j11 = E instanceof TLRPC.User ? ((TLRPC.User) E).id : E instanceof TLRPC.Chat ? -((TLRPC.Chat) E).id : 0L;
        if (j11 != 0) {
            a0.h hVar = p60Var.P;
            if (hVar == null || hVar.h(j11) < 0) {
                d4Var.c(p60Var.b0.h(j11) >= 0, j10 == j11);
                d4Var.setCheckBoxEnabled(true);
            } else {
                d4Var.c(true, false);
                d4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            p60 p60Var = this.c;
            if (i10 == 3) {
                view = new org.telegram.ui.Cells.d4(context, 1, 0, p60Var.i0 != null);
            } else if (i10 == 4) {
                view = new View(context);
            } else if (i10 != 5) {
                org.telegram.ui.Cells.v4 v4Var = new org.telegram.ui.Cells.v4(context);
                v4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                int i11 = org.telegram.ui.ActionBar.g6.n5;
                v4Var.a(i11, i11);
                view = v4Var;
            } else {
                i60 i60Var = new i60(context, null, 0, null, 0);
                i60Var.setLayoutParams(new f2.y0(-1, -1));
                i60Var.e.setVisibility(8);
                org.telegram.ui.zt ztVar = p60Var.i0;
                eh.s sVar = i60Var.d;
                if (ztVar != null) {
                    sVar.setText(LocaleController.getString(R.string.FilterNoChats));
                } else {
                    sVar.setText(LocaleController.getString(R.string.NoContacts));
                }
                i60Var.setAnimateLayoutChange(true);
                view = i60Var;
            }
        } else {
            view = new ag.s0(this, context, 17);
        }
        return new lk0(view);
    }
}
