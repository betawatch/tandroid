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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class x70 extends pm0 {
    public final /* synthetic */ d80 c;

    public x70(d80 d80Var) {
        this.c = d80Var;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f;
        return i10 == 3 || i10 == 1;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        d80 d80Var = this.c;
        if (d80Var.m0 == null) {
            return (TLObject) d80Var.e0.get(i10 - d80Var.Y);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) d80Var.n0.get(i10 - d80Var.Y);
        if (DialogObject.isUserDialog(dialog.id)) {
            i12 = ((org.telegram.ui.ActionBar.f3) d80Var).currentAccount;
            return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.id));
        }
        i11 = ((org.telegram.ui.ActionBar.f3) d80Var).currentAccount;
        return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.id));
    }

    @Override // s4.i0
    public final int h() {
        return this.c.c0;
    }

    @Override // s4.i0
    public final int j(int i10) {
        d80 d80Var = this.c;
        if (i10 == d80Var.X) {
            return 1;
        }
        d80Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= d80Var.Y && i10 < d80Var.Z) {
            return 3;
        }
        if (i10 == d80Var.b0) {
            return 4;
        }
        return i10 == d80Var.a0 ? 5 : 0;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        int i11 = d1Var.f;
        View view = d1Var.a;
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
        d80 d80Var = this.c;
        g4Var.e(E, null, null, i10 != d80Var.Z);
        long j10 = E instanceof TLRPC.User ? ((TLRPC.User) E).id : E instanceof TLRPC.Chat ? -((TLRPC.Chat) E).id : 0L;
        if (j10 != 0) {
            a0.i iVar = d80Var.T;
            if (iVar == null || iVar.h(j10) < 0) {
                g4Var.c(d80Var.f0.h(j10) >= 0, j3 == j10);
                g4Var.setCheckBoxEnabled(true);
            } else {
                g4Var.c(true, false);
                g4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            d80 d80Var = this.c;
            if (i10 == 3) {
                view = new org.telegram.ui.Cells.g4(1, 0, context, d80Var.m0 != null);
            } else if (i10 == 4) {
                view = new View(context);
            } else if (i10 != 5) {
                org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(context);
                y4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                int i11 = org.telegram.ui.ActionBar.i6.n5;
                y4Var.a(i11, i11);
                view = y4Var;
            } else {
                w70 w70Var = new w70(context, null, 0, null, 0);
                w70Var.setLayoutParams(new s4.q0(-1, -1));
                w70Var.e.setVisibility(8);
                org.telegram.ui.gu guVar = d80Var.m0;
                vh.n nVar = w70Var.d;
                if (guVar != null) {
                    nVar.setText(LocaleController.getString(R.string.FilterNoChats));
                } else {
                    nVar.setText(LocaleController.getString(R.string.NoContacts));
                }
                w70Var.setAnimateLayoutChange(true);
                view = w70Var;
            }
        } else {
            view = new ci.bb(this, context, 18);
        }
        return new am0(view);
    }
}
