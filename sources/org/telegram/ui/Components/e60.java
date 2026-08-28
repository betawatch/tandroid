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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e60 extends vk0 {
    public final /* synthetic */ k60 c;

    public e60(k60 k60Var) {
        this.c = k60Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 3 || i9 == 1;
    }

    public final TLObject E(int i9) {
        int i10;
        int i11;
        k60 k60Var = this.c;
        if (k60Var.i0 == null) {
            return (TLObject) k60Var.a0.get(i9 - k60Var.U);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) k60Var.j0.get(i9 - k60Var.U);
        if (DialogObject.isUserDialog(dialog.id)) {
            i11 = ((org.telegram.ui.ActionBar.f3) k60Var).currentAccount;
            return MessagesController.getInstance(i11).getUser(Long.valueOf(dialog.id));
        }
        i10 = ((org.telegram.ui.ActionBar.f3) k60Var).currentAccount;
        return MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.id));
    }

    @Override // f2.r0
    public final int h() {
        return this.c.Y;
    }

    @Override // f2.r0
    public final int j(int i9) {
        k60 k60Var = this.c;
        if (i9 == k60Var.T) {
            return 1;
        }
        k60Var.getClass();
        if (i9 == 0) {
            return 2;
        }
        if (i9 >= k60Var.U && i9 < k60Var.V) {
            return 3;
        }
        if (i9 == k60Var.X) {
            return 4;
        }
        return i9 == k60Var.W ? 5 : 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 == 2) {
            view.requestLayout();
            return;
        }
        if (i10 != 3) {
            return;
        }
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        TLObject E = E(i9);
        Object object = g4Var.getObject();
        long j10 = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
        k60 k60Var = this.c;
        g4Var.e(E, null, null, i9 != k60Var.V);
        long j11 = E instanceof TLRPC.User ? ((TLRPC.User) E).id : E instanceof TLRPC.Chat ? -((TLRPC.Chat) E).id : 0L;
        if (j11 != 0) {
            a0.h hVar = k60Var.P;
            if (hVar == null || hVar.h(j11) < 0) {
                g4Var.c(k60Var.b0.h(j11) >= 0, j10 == j11);
                g4Var.setCheckBoxEnabled(true);
            } else {
                g4Var.c(true, false);
                g4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        Context context = viewGroup.getContext();
        if (i9 != 2) {
            k60 k60Var = this.c;
            if (i9 == 3) {
                view = new org.telegram.ui.Cells.g4(context, 1, 0, k60Var.i0 != null);
            } else if (i9 == 4) {
                view = new View(context);
            } else if (i9 != 5) {
                org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(context);
                y4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                int i10 = org.telegram.ui.ActionBar.f6.n5;
                y4Var.a(i10, i10);
                view = y4Var;
            } else {
                d60 d60Var = new d60(context, null, 0, null, 0);
                d60Var.setLayoutParams(new f2.a1(-1, -1));
                d60Var.e.setVisibility(8);
                org.telegram.ui.wt wtVar = k60Var.i0;
                dh.u uVar = d60Var.d;
                if (wtVar != null) {
                    uVar.setText(LocaleController.getString(R.string.FilterNoChats));
                } else {
                    uVar.setText(LocaleController.getString(R.string.NoContacts));
                }
                d60Var.setAnimateLayoutChange(true);
                view = d60Var;
            }
        } else {
            view = new fh.l2(this, context, 17);
        }
        return new ik0(view);
    }
}
