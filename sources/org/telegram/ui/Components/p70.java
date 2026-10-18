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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class p70 extends hm0 {
    public final /* synthetic */ v70 c;

    public p70(v70 v70Var) {
        this.c = v70Var;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 3 || i10 == 1;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        v70 v70Var = this.c;
        if (v70Var.m0 == null) {
            return (TLObject) v70Var.e0.get(i10 - v70Var.Y);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) v70Var.n0.get(i10 - v70Var.Y);
        if (DialogObject.isUserDialog(dialog.id)) {
            i12 = ((org.telegram.ui.ActionBar.f3) v70Var).currentAccount;
            return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.id));
        }
        i11 = ((org.telegram.ui.ActionBar.f3) v70Var).currentAccount;
        return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.id));
    }

    @Override // s4.g0
    public final int h() {
        return this.c.c0;
    }

    @Override // s4.g0
    public final int j(int i10) {
        v70 v70Var = this.c;
        if (i10 == v70Var.X) {
            return 1;
        }
        v70Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= v70Var.Y && i10 < v70Var.Z) {
            return 3;
        }
        if (i10 == v70Var.b0) {
            return 4;
        }
        return i10 == v70Var.a0 ? 5 : 0;
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
        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
        TLObject E = E(i10);
        Object object = f4Var.getObject();
        long j10 = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
        v70 v70Var = this.c;
        f4Var.e(E, null, null, i10 != v70Var.Z);
        long j11 = E instanceof TLRPC.User ? ((TLRPC.User) E).id : E instanceof TLRPC.Chat ? -((TLRPC.Chat) E).id : 0L;
        if (j11 != 0) {
            a0.h hVar = v70Var.T;
            if (hVar == null || hVar.h(j11) < 0) {
                f4Var.c(v70Var.f0.h(j11) >= 0, j10 == j11);
                f4Var.setCheckBoxEnabled(true);
            } else {
                f4Var.c(true, false);
                f4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            v70 v70Var = this.c;
            if (i10 == 3) {
                view = new org.telegram.ui.Cells.f4(1, 0, context, v70Var.m0 != null);
            } else if (i10 == 4) {
                view = new View(context);
            } else if (i10 != 5) {
                org.telegram.ui.Cells.x4 x4Var = new org.telegram.ui.Cells.x4(context);
                x4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                int i11 = org.telegram.ui.ActionBar.h6.n5;
                x4Var.a(i11, i11);
                view = x4Var;
            } else {
                o70 o70Var = new o70(context, null, 0, null, 0);
                o70Var.setLayoutParams(new s4.o0(-1, -1));
                o70Var.e.setVisibility(8);
                org.telegram.ui.wt wtVar = v70Var.m0;
                wh.n nVar = o70Var.d;
                if (wtVar != null) {
                    nVar.setText(LocaleController.getString(R.string.FilterNoChats));
                } else {
                    nVar.setText(LocaleController.getString(R.string.NoContacts));
                }
                o70Var.setAnimateLayoutChange(true);
                view = o70Var;
            }
        } else {
            view = new ai.ic(this, context, 19);
        }
        return new sl0(view);
    }
}
