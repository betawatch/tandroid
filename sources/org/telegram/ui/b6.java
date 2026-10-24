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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class b6 extends pg.b {
    public final /* synthetic */ d6 d;

    public b6(d6 d6Var) {
        this.d = d6Var;
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
        return ((c6) this.d.c.get(i10)).a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        d6 d6Var = this.d;
        ArrayList arrayList = d6Var.c;
        if (((c6) arrayList.get(i10)).a == 2) {
            org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) b1Var.a;
            CacheByChatsController.KeepMediaException keepMediaException = ((c6) arrayList.get(i10)).c;
            TLObject userOrChat = d6Var.getMessagesController().getUserOrChat(keepMediaException.dialogId);
            if (userOrChat instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) userOrChat;
                str = user.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
            }
            boolean z10 = true;
            waVar.setSelfAsSavedMessages(true);
            String keepMediaString = CacheByChatsController.getKeepMediaString(keepMediaException.keepMedia);
            if (i10 != arrayList.size() - 1 && ((c6) arrayList.get(i10 + 1)).a != 2) {
                z10 = false;
            }
            waVar.d(userOrChat, str, keepMediaString, z10);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2 = null;
        if (i10 != 1) {
            if (i10 == 2) {
                View waVar = new org.telegram.ui.Cells.wa(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, waVar, null);
                view2 = waVar;
            } else if (i10 == 3) {
                view = new org.telegram.ui.Cells.b7(viewGroup.getContext(), (org.telegram.ui.Cells.b1) null);
            } else if (i10 == 4) {
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                r8Var.k(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                r8Var.g(-1, org.telegram.ui.ActionBar.k6.p7);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, r8Var, null);
                view = r8Var;
            }
            return com.google.android.gms.internal.play_billing.k3.l(view2, view2, -1, -2);
        }
        org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(viewGroup.getContext());
        r8Var2.o(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
        r8Var2.g(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, r8Var2, null);
        view = r8Var2;
        view2 = view;
        return com.google.android.gms.internal.play_billing.k3.l(view2, view2, -1, -2);
    }
}
