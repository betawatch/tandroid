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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class t70 extends lm0 {
    public final /* synthetic */ z70 c;

    public t70(z70 z70Var) {
        this.c = z70Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 3 || i10 == 1;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        z70 z70Var = this.c;
        if (z70Var.m0 == null) {
            return (TLObject) z70Var.e0.get(i10 - z70Var.Y);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) z70Var.n0.get(i10 - z70Var.Y);
        if (DialogObject.isUserDialog(dialog.id)) {
            i12 = ((org.telegram.ui.ActionBar.e3) z70Var).currentAccount;
            return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.id));
        }
        i11 = ((org.telegram.ui.ActionBar.e3) z70Var).currentAccount;
        return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.id));
    }

    @Override // s4.g0
    public final int h() {
        return this.c.c0;
    }

    @Override // s4.g0
    public final int j(int i10) {
        z70 z70Var = this.c;
        if (i10 == z70Var.X) {
            return 1;
        }
        z70Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= z70Var.Y && i10 < z70Var.Z) {
            return 3;
        }
        if (i10 == z70Var.b0) {
            return 4;
        }
        return i10 == z70Var.a0 ? 5 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f;
        View view = b1Var.a;
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
        z70 z70Var = this.c;
        g4Var.e(E, null, null, i10 != z70Var.Z);
        long j11 = E instanceof TLRPC.User ? ((TLRPC.User) E).id : E instanceof TLRPC.Chat ? -((TLRPC.Chat) E).id : 0L;
        if (j11 != 0) {
            a0.h hVar = z70Var.T;
            if (hVar == null || hVar.h(j11) < 0) {
                g4Var.c(z70Var.f0.h(j11) >= 0, j10 == j11);
                g4Var.setCheckBoxEnabled(true);
            } else {
                g4Var.c(true, false);
                g4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            z70 z70Var = this.c;
            if (i10 == 3) {
                view = new org.telegram.ui.Cells.g4(1, 0, context, z70Var.m0 != null);
            } else if (i10 == 4) {
                view = new View(context);
            } else if (i10 != 5) {
                org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(context);
                y4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                int i11 = org.telegram.ui.ActionBar.g6.n5;
                y4Var.a(i11, i11);
                view = y4Var;
            } else {
                s70 s70Var = new s70(context, null, 0, null, 0);
                s70Var.setLayoutParams(new s4.o0(-1, -1));
                s70Var.e.setVisibility(8);
                org.telegram.ui.mu muVar = z70Var.m0;
                wh.n nVar = s70Var.d;
                if (muVar != null) {
                    nVar.setText(LocaleController.getString(R.string.FilterNoChats));
                } else {
                    nVar.setText(LocaleController.getString(R.string.NoContacts));
                }
                s70Var.setAnimateLayoutChange(true);
                view = s70Var;
            }
        } else {
            view = new di.ab(this, context, 18);
        }
        return new wl0(view);
    }
}
