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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class w60 extends ll0 {
    public final /* synthetic */ c70 c;

    public w60(c70 c70Var) {
        this.c = c70Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 1;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        c70 c70Var = this.c;
        if (c70Var.m0 == null) {
            return (TLObject) c70Var.e0.get(i10 - c70Var.Y);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) c70Var.n0.get(i10 - c70Var.Y);
        if (DialogObject.isUserDialog(dialog.id)) {
            i12 = ((org.telegram.ui.ActionBar.f3) c70Var).currentAccount;
            return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.id));
        }
        i11 = ((org.telegram.ui.ActionBar.f3) c70Var).currentAccount;
        return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.id));
    }

    @Override // s4.h0
    public final int h() {
        return this.c.c0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        c70 c70Var = this.c;
        if (i10 == c70Var.X) {
            return 1;
        }
        c70Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= c70Var.Y && i10 < c70Var.Z) {
            return 3;
        }
        if (i10 == c70Var.b0) {
            return 4;
        }
        return i10 == c70Var.a0 ? 5 : 0;
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
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        TLObject E = E(i10);
        Object object = g4Var.getObject();
        long j3 = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
        c70 c70Var = this.c;
        g4Var.e(E, null, null, i10 != c70Var.Z);
        long j10 = E instanceof TLRPC.User ? ((TLRPC.User) E).id : E instanceof TLRPC.Chat ? -((TLRPC.Chat) E).id : 0L;
        if (j10 != 0) {
            a0.i iVar = c70Var.T;
            if (iVar == null || iVar.h(j10) < 0) {
                g4Var.c(c70Var.f0.h(j10) >= 0, j3 == j10);
                g4Var.setCheckBoxEnabled(true);
            } else {
                g4Var.c(true, false);
                g4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            c70 c70Var = this.c;
            if (i10 == 3) {
                view = new org.telegram.ui.Cells.g4(context, 1, 0, c70Var.m0 != null);
            } else if (i10 == 4) {
                view = new View(context);
            } else if (i10 != 5) {
                org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(context);
                y4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                int i11 = org.telegram.ui.ActionBar.h6.n5;
                y4Var.a(i11, i11);
                view = y4Var;
            } else {
                v60 v60Var = new v60(context, null, 0, null, 0);
                v60Var.setLayoutParams(new s4.p0(-1, -1));
                v60Var.e.setVisibility(8);
                org.telegram.ui.eu euVar = c70Var.m0;
                vh.o oVar = v60Var.d;
                if (euVar != null) {
                    oVar.setText(LocaleController.getString(R.string.FilterNoChats));
                } else {
                    oVar.setText(LocaleController.getString(R.string.NoContacts));
                }
                v60Var.setAnimateLayoutChange(true);
                view = v60Var;
            }
        } else {
            view = new ci.bb(this, context, 18);
        }
        return new wk0(view);
    }
}
