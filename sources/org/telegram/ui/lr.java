package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class lr extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ pr a;

    public lr(pr prVar) {
        this.a = prVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10;
        int i11;
        pr prVar = this.a;
        if (i7 == -1) {
            prVar.finishFragment();
            return;
        }
        if (i7 != 1 || prVar.b.getText().length() == 0) {
            return;
        }
        TLRPC.User a22 = prVar.getMessagesController().a2(Long.valueOf(prVar.H));
        TLRPC.UserFull b22 = prVar.getMessagesController().b2(prVar.H);
        a22.first_name = prVar.b.getText().toString();
        a22.last_name = prVar.c.getText().toString();
        a22.contact = true;
        TLRPC.TL_textWithEntities textWithEntities = prVar.d.getTextWithEntities();
        prVar.getMessagesController().X3(a22, false, false);
        org.telegram.messenger.g5 contactsController = prVar.getContactsController();
        boolean z9 = prVar.K && prVar.X;
        contactsController.getClass();
        TLRPC.TL_contacts_addContact tL_contacts_addContact = new TLRPC.TL_contacts_addContact();
        tL_contacts_addContact.id = contactsController.getMessagesController().q1(a22);
        tL_contacts_addContact.first_name = a22.first_name;
        tL_contacts_addContact.last_name = a22.last_name;
        String str = a22.phone;
        tL_contacts_addContact.phone = str;
        tL_contacts_addContact.add_phone_privacy_exception = z9;
        if (str == null) {
            tL_contacts_addContact.phone = "";
        } else if (str.length() > 0 && !tL_contacts_addContact.phone.startsWith("+")) {
            tL_contacts_addContact.phone = "+" + tL_contacts_addContact.phone;
        }
        if (textWithEntities != null) {
            tL_contacts_addContact.flags |= 2;
            tL_contacts_addContact.note = textWithEntities;
        }
        contactsController.getConnectionsManager().sendRequest(tL_contacts_addContact, new org.telegram.messenger.r4(1, contactsController, a22), 6);
        i10 = ((org.telegram.ui.ActionBar.f2) prVar).currentAccount;
        org.telegram.messenger.qp.s1(i10).d7.edit().putInt("dialog_bar_vis3" + prVar.H, 3).commit();
        prVar.getNotificationCenter().k(org.telegram.messenger.qs.r, 1);
        prVar.getNotificationCenter().k(org.telegram.messenger.qs.Q0, Long.valueOf(prVar.H));
        if (b22 != null) {
            if (textWithEntities == null || textWithEntities.text.length() <= 0) {
                b22.flags2 &= -4194305;
                b22.note = null;
            } else {
                b22.flags2 |= TLObject.FLAG_22;
                b22.note = textWithEntities;
            }
            i11 = ((org.telegram.ui.ActionBar.f2) prVar).currentAccount;
            org.telegram.messenger.yr.a0(i11).j2(b22, true);
            prVar.getNotificationCenter().k(org.telegram.messenger.qs.E0, Long.valueOf(b22.id), b22);
        }
        prVar.finishFragment();
        or orVar = prVar.O;
        if (orVar != null) {
            orVar.a();
        }
    }
}
