package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class c6 extends pg.b {
    public final /* synthetic */ e6 d;

    public c6(e6 e6Var) {
        this.d = e6Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.c.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((d6) this.d.c.get(i10)).a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        e6 e6Var = this.d;
        ArrayList arrayList = e6Var.c;
        if (((d6) arrayList.get(i10)).a == 2) {
            org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) b1Var.a;
            CacheByChatsController.KeepMediaException keepMediaException = ((d6) arrayList.get(i10)).c;
            TLObject userOrChat = e6Var.getMessagesController().getUserOrChat(keepMediaException.dialogId);
            if (userOrChat instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) userOrChat;
                str = user.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
            }
            boolean z10 = true;
            xaVar.setSelfAsSavedMessages(true);
            String keepMediaString = CacheByChatsController.getKeepMediaString(keepMediaException.keepMedia);
            if (i10 != arrayList.size() - 1 && ((d6) arrayList.get(i10 + 1)).a != 2) {
                z10 = false;
            }
            xaVar.e(userOrChat, str, keepMediaString, z10);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2 = null;
        if (i10 != 1) {
            if (i10 == 2) {
                View xaVar = new org.telegram.ui.Cells.xa(4, 0, viewGroup.getContext(), null, false, false);
                xaVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view2 = xaVar;
            } else if (i10 == 3) {
                view = new org.telegram.ui.Cells.b7(viewGroup.getContext(), (org.telegram.ui.Cells.d0) null);
            } else if (i10 == 4) {
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                r8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                r8Var.e(-1, org.telegram.ui.ActionBar.g6.p7);
                r8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view = r8Var;
            }
            return com.google.android.gms.internal.play_billing.k3.l(view2, view2, -1, -2);
        }
        org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(viewGroup.getContext());
        r8Var2.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
        r8Var2.e(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
        r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
        view = r8Var2;
        view2 = view;
        return com.google.android.gms.internal.play_billing.k3.l(view2, view2, -1, -2);
    }
}
