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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class d70 extends ul0 {
    public final /* synthetic */ j70 c;

    public d70(j70 j70Var) {
        this.c = j70Var;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 1;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        j70 j70Var = this.c;
        if (j70Var.m0 == null) {
            return (TLObject) j70Var.e0.get(i10 - j70Var.Y);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) j70Var.n0.get(i10 - j70Var.Y);
        if (DialogObject.isUserDialog(dialog.id)) {
            i12 = ((org.telegram.ui.ActionBar.f3) j70Var).currentAccount;
            return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.id));
        }
        i11 = ((org.telegram.ui.ActionBar.f3) j70Var).currentAccount;
        return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.id));
    }

    @Override // s4.h0
    public final int h() {
        return this.c.c0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        j70 j70Var = this.c;
        if (i10 == j70Var.X) {
            return 1;
        }
        j70Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= j70Var.Y && i10 < j70Var.Z) {
            return 3;
        }
        if (i10 == j70Var.b0) {
            return 4;
        }
        return i10 == j70Var.a0 ? 5 : 0;
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
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        TLObject E = E(i10);
        Object object = h4Var.getObject();
        long j3 = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
        j70 j70Var = this.c;
        h4Var.e(E, null, null, i10 != j70Var.Z);
        long j10 = E instanceof TLRPC.User ? ((TLRPC.User) E).id : E instanceof TLRPC.Chat ? -((TLRPC.Chat) E).id : 0L;
        if (j10 != 0) {
            a0.i iVar = j70Var.T;
            if (iVar == null || iVar.h(j10) < 0) {
                h4Var.c(j70Var.f0.h(j10) >= 0, j3 == j10);
                h4Var.setCheckBoxEnabled(true);
            } else {
                h4Var.c(true, false);
                h4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            j70 j70Var = this.c;
            if (i10 == 3) {
                view = new org.telegram.ui.Cells.h4(context, 1, 0, j70Var.m0 != null);
            } else if (i10 == 4) {
                view = new View(context);
            } else if (i10 != 5) {
                org.telegram.ui.Cells.z4 z4Var = new org.telegram.ui.Cells.z4(context);
                z4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                int i11 = org.telegram.ui.ActionBar.j6.n5;
                z4Var.a(i11, i11);
                view = z4Var;
            } else {
                c70 c70Var = new c70(context, null, 0, null, 0);
                c70Var.setLayoutParams(new s4.p0(-1, -1));
                c70Var.e.setVisibility(8);
                org.telegram.ui.fu fuVar = j70Var.m0;
                vh.o oVar = c70Var.d;
                if (fuVar != null) {
                    oVar.setText(LocaleController.getString(R.string.FilterNoChats));
                } else {
                    oVar.setText(LocaleController.getString(R.string.NoContacts));
                }
                c70Var.setAnimateLayoutChange(true);
                view = c70Var;
            }
        } else {
            view = new ci.eb(this, context, 18);
        }
        return new fl0(view);
    }
}
