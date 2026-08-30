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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class b6 extends bg.c {
    public final /* synthetic */ d6 d;

    public b6(d6 d6Var) {
        this.d = d6Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.c.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        return ((c6) this.d.c.get(i10)).a;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        String str;
        d6 d6Var = this.d;
        ArrayList arrayList = d6Var.c;
        if (((c6) arrayList.get(i10)).a == 2) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) l1Var.a;
            CacheByChatsController.KeepMediaException keepMediaException = ((c6) arrayList.get(i10)).c;
            TLObject userOrChat = d6Var.getMessagesController().getUserOrChat(keepMediaException.dialogId);
            if (userOrChat instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) userOrChat;
                str = user.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
            }
            boolean z4 = true;
            vaVar.setSelfAsSavedMessages(true);
            String keepMediaString = CacheByChatsController.getKeepMediaString(keepMediaException.keepMedia);
            if (i10 != arrayList.size() - 1 && ((c6) arrayList.get(i10 + 1)).a != 2) {
                z4 = false;
            }
            vaVar.d(userOrChat, str, keepMediaString, z4);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2 = null;
        if (i10 != 1) {
            if (i10 == 2) {
                View vaVar = new org.telegram.ui.Cells.va(4, 0, viewGroup.getContext(), null, false, false);
                vaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view2 = vaVar;
            } else if (i10 == 3) {
                view = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (b) null);
            } else if (i10 == 4) {
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(viewGroup.getContext());
                o8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                o8Var.e(-1, org.telegram.ui.ActionBar.j6.p7);
                o8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view = o8Var;
            }
            return yh.o(view2, view2, -1, -2);
        }
        org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(viewGroup.getContext());
        o8Var2.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
        o8Var2.e(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
        o8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        view = o8Var2;
        view2 = view;
        return yh.o(view2, view2, -1, -2);
    }
}
