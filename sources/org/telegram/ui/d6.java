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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class d6 extends bg.c {
    public final /* synthetic */ f6 d;

    public d6(f6 f6Var) {
        this.d = f6Var;
    }

    @Override // org.telegram.ui.Components.ql0
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
        return ((e6) this.d.c.get(i10)).a;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        String str;
        f6 f6Var = this.d;
        ArrayList arrayList = f6Var.c;
        if (((e6) arrayList.get(i10)).a == 2) {
            org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) l1Var.a;
            CacheByChatsController.KeepMediaException keepMediaException = ((e6) arrayList.get(i10)).c;
            TLObject userOrChat = f6Var.getMessagesController().getUserOrChat(keepMediaException.dialogId);
            if (userOrChat instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) userOrChat;
                str = user.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
            }
            boolean z4 = true;
            uaVar.setSelfAsSavedMessages(true);
            String keepMediaString = CacheByChatsController.getKeepMediaString(keepMediaException.keepMedia);
            if (i10 != arrayList.size() - 1 && ((e6) arrayList.get(i10 + 1)).a != 2) {
                z4 = false;
            }
            uaVar.d(userOrChat, str, keepMediaString, z4);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2 = null;
        if (i10 != 1) {
            if (i10 == 2) {
                View uaVar = new org.telegram.ui.Cells.ua(4, 0, viewGroup.getContext(), null, false, false);
                uaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view2 = uaVar;
            } else if (i10 == 3) {
                view = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (b) null);
            } else if (i10 == 4) {
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(viewGroup.getContext());
                n8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                n8Var.e(-1, org.telegram.ui.ActionBar.j6.p7);
                n8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view = n8Var;
            }
            return ai.n(view2, view2, -1, -2);
        }
        org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(viewGroup.getContext());
        n8Var2.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
        n8Var2.e(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
        n8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        view = n8Var2;
        view2 = view;
        return ai.n(view2, view2, -1, -2);
    }
}
