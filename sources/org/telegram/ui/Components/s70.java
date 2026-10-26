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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class s70 extends lm0 {
    public final /* synthetic */ y70 c;

    public s70(y70 y70Var) {
        this.c = y70Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return i10 == 3 || i10 == 1;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        y70 y70Var = this.c;
        if (y70Var.m0 == null) {
            return (TLObject) y70Var.e0.get(i10 - y70Var.Y);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) y70Var.n0.get(i10 - y70Var.Y);
        if (DialogObject.isUserDialog(dialog.id)) {
            i12 = ((org.telegram.ui.ActionBar.k3) y70Var).currentAccount;
            return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.id));
        }
        i11 = ((org.telegram.ui.ActionBar.k3) y70Var).currentAccount;
        return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.id));
    }

    @Override // s4.h0
    public final int h() {
        return this.c.c0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        y70 y70Var = this.c;
        if (i10 == y70Var.X) {
            return 1;
        }
        y70Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= y70Var.Y && i10 < y70Var.Z) {
            return 3;
        }
        if (i10 == y70Var.b0) {
            return 4;
        }
        return i10 == y70Var.a0 ? 5 : 0;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 2) {
            view.requestLayout();
            return;
        }
        if (i11 != 3) {
            return;
        }
        org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
        TLObject E = E(i10);
        Object object = k4Var.getObject();
        long j10 = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
        y70 y70Var = this.c;
        k4Var.e(E, null, null, i10 != y70Var.Z);
        long j11 = E instanceof TLRPC.User ? ((TLRPC.User) E).id : E instanceof TLRPC.Chat ? -((TLRPC.Chat) E).id : 0L;
        if (j11 != 0) {
            a0.h hVar = y70Var.T;
            if (hVar == null || hVar.h(j11) < 0) {
                k4Var.c(y70Var.f0.h(j11) >= 0, j10 == j11);
                k4Var.setCheckBoxEnabled(true);
            } else {
                k4Var.c(true, false);
                k4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            y70 y70Var = this.c;
            if (i10 == 3) {
                view = new org.telegram.ui.Cells.k4(context, 1, 0, y70Var.m0 != null);
            } else if (i10 == 4) {
                view = new View(context);
            } else if (i10 != 5) {
                org.telegram.ui.Cells.c5 c5Var = new org.telegram.ui.Cells.c5(context);
                c5Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                int i11 = org.telegram.ui.ActionBar.y6.n5;
                c5Var.a(i11, i11);
                view = c5Var;
            } else {
                r70 r70Var = new r70(0, 0, context, null, null);
                r70Var.setLayoutParams(new s4.q0(-1, -1));
                r70Var.e.setVisibility(8);
                org.telegram.ui.qt qtVar = y70Var.m0;
                xh.n nVar = r70Var.d;
                if (qtVar != null) {
                    nVar.setText(LocaleController.getString(R.string.FilterNoChats));
                } else {
                    nVar.setText(LocaleController.getString(R.string.NoContacts));
                }
                r70Var.setAnimateLayoutChange(true);
                view = r70Var;
            }
        } else {
            view = new bi.cc(this, context, 18);
        }
        return new vl0(view);
    }
}
