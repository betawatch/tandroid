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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class a6 extends qg.b {
    public final /* synthetic */ c6 d;

    public a6(c6 c6Var) {
        this.d = c6Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.c.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((b6) this.d.c.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        String str;
        c6 c6Var = this.d;
        ArrayList arrayList = c6Var.c;
        if (((b6) arrayList.get(i10)).a == 2) {
            org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) e1Var.a;
            CacheByChatsController.KeepMediaException keepMediaException = ((b6) arrayList.get(i10)).c;
            TLObject userOrChat = c6Var.getMessagesController().getUserOrChat(keepMediaException.dialogId);
            if (userOrChat instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) userOrChat;
                str = user.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
            }
            boolean z10 = true;
            abVar.setSelfAsSavedMessages(true);
            String keepMediaString = CacheByChatsController.getKeepMediaString(keepMediaException.keepMedia);
            if (i10 != arrayList.size() - 1 && ((b6) arrayList.get(i10 + 1)).a != 2) {
                z10 = false;
            }
            abVar.d(userOrChat, str, keepMediaString, z10);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2 = null;
        if (i10 != 1) {
            if (i10 == 2) {
                View abVar = new org.telegram.ui.Cells.ab(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, abVar, null);
                view2 = abVar;
            } else if (i10 == 3) {
                view = new org.telegram.ui.Cells.f7(viewGroup.getContext(), (d3) null);
            } else if (i10 == 4) {
                org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(viewGroup.getContext());
                v8Var.k(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                v8Var.g(-1, org.telegram.ui.ActionBar.y6.p7);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, v8Var, null);
                view = v8Var;
            }
            return ic.a.n(view2, view2, -1, -2);
        }
        org.telegram.ui.Cells.v8 v8Var2 = new org.telegram.ui.Cells.v8(viewGroup.getContext());
        v8Var2.o(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
        v8Var2.g(org.telegram.ui.ActionBar.y6.v6, org.telegram.ui.ActionBar.y6.u6);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, v8Var2, null);
        view = v8Var2;
        view2 = view;
        return ic.a.n(view2, view2, -1, -2);
    }
}
