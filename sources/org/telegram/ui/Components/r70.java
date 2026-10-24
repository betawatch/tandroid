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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class r70 extends lm0 {
    public final /* synthetic */ x70 c;

    public r70(x70 x70Var) {
        this.c = x70Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 3 || i10 == 1;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        x70 x70Var = this.c;
        if (x70Var.m0 == null) {
            return (TLObject) x70Var.e0.get(i10 - x70Var.Y);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) x70Var.n0.get(i10 - x70Var.Y);
        if (DialogObject.isUserDialog(dialog.id)) {
            i12 = ((org.telegram.ui.ActionBar.h3) x70Var).currentAccount;
            return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.id));
        }
        i11 = ((org.telegram.ui.ActionBar.h3) x70Var).currentAccount;
        return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.id));
    }

    @Override // s4.g0
    public final int h() {
        return this.c.c0;
    }

    @Override // s4.g0
    public final int j(int i10) {
        x70 x70Var = this.c;
        if (i10 == x70Var.X) {
            return 1;
        }
        x70Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= x70Var.Y && i10 < x70Var.Z) {
            return 3;
        }
        if (i10 == x70Var.b0) {
            return 4;
        }
        return i10 == x70Var.a0 ? 5 : 0;
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
        x70 x70Var = this.c;
        f4Var.e(E, null, null, i10 != x70Var.Z);
        long j11 = E instanceof TLRPC.User ? ((TLRPC.User) E).id : E instanceof TLRPC.Chat ? -((TLRPC.Chat) E).id : 0L;
        if (j11 != 0) {
            a0.h hVar = x70Var.T;
            if (hVar == null || hVar.h(j11) < 0) {
                f4Var.c(x70Var.f0.h(j11) >= 0, j10 == j11);
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
            x70 x70Var = this.c;
            if (i10 == 3) {
                view = new org.telegram.ui.Cells.f4(context, 1, 0, x70Var.m0 != null);
            } else if (i10 == 4) {
                view = new View(context);
            } else if (i10 != 5) {
                org.telegram.ui.Cells.x4 x4Var = new org.telegram.ui.Cells.x4(context);
                x4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                int i11 = org.telegram.ui.ActionBar.k6.n5;
                x4Var.a(i11, i11);
                view = x4Var;
            } else {
                q70 q70Var = new q70(0, 0, context, null, null);
                q70Var.setLayoutParams(new s4.o0(-1, -1));
                q70Var.e.setVisibility(8);
                org.telegram.ui.xt xtVar = x70Var.m0;
                wh.n nVar = q70Var.d;
                if (xtVar != null) {
                    nVar.setText(LocaleController.getString(R.string.FilterNoChats));
                } else {
                    nVar.setText(LocaleController.getString(R.string.NoContacts));
                }
                q70Var.setAnimateLayoutChange(true);
                view = q70Var;
            }
        } else {
            view = new ai.jc(this, context, 18);
        }
        return new wl0(view);
    }
}
