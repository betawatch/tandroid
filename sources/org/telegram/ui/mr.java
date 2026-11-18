package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class mr extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ qr a;

    public mr(qr qrVar) {
        this.a = qrVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10;
        int i11;
        qr qrVar = this.a;
        if (i7 == -1) {
            qrVar.finishFragment();
            return;
        }
        if (i7 != 1 || qrVar.b.getText().length() == 0) {
            return;
        }
        TLRPC.User c22 = qrVar.getMessagesController().c2(Long.valueOf(qrVar.I));
        TLRPC.UserFull d2 = qrVar.getMessagesController().d2(qrVar.I);
        c22.first_name = qrVar.b.getText().toString();
        c22.last_name = qrVar.c.getText().toString();
        c22.contact = true;
        TLRPC.TL_textWithEntities textWithEntities = qrVar.d.getTextWithEntities();
        qrVar.getMessagesController().e4(c22, false, false);
        org.telegram.messenger.i5 contactsController = qrVar.getContactsController();
        boolean z10 = qrVar.L && qrVar.Y;
        contactsController.getClass();
        TLRPC.TL_contacts_addContact tL_contacts_addContact = new TLRPC.TL_contacts_addContact();
        tL_contacts_addContact.id = contactsController.getMessagesController().s1(c22);
        tL_contacts_addContact.first_name = c22.first_name;
        tL_contacts_addContact.last_name = c22.last_name;
        String str = c22.phone;
        tL_contacts_addContact.phone = str;
        tL_contacts_addContact.add_phone_privacy_exception = z10;
        if (str == null) {
            tL_contacts_addContact.phone = "";
        } else if (str.length() > 0 && !tL_contacts_addContact.phone.startsWith("+")) {
            tL_contacts_addContact.phone = "+" + tL_contacts_addContact.phone;
        }
        if (textWithEntities != null) {
            tL_contacts_addContact.flags |= 2;
            tL_contacts_addContact.note = textWithEntities;
        }
        contactsController.getConnectionsManager().sendRequest(tL_contacts_addContact, new org.telegram.messenger.t4(1, contactsController, c22), 6);
        i10 = ((org.telegram.ui.ActionBar.h2) qrVar).currentAccount;
        org.telegram.messenger.mp.u1(i10).g7.edit().putInt("dialog_bar_vis3" + qrVar.I, 3).commit();
        qrVar.getNotificationCenter().k(org.telegram.messenger.ks.r, 1);
        qrVar.getNotificationCenter().k(org.telegram.messenger.ks.Q0, Long.valueOf(qrVar.I));
        if (d2 != null) {
            if (textWithEntities == null || textWithEntities.text.length() <= 0) {
                d2.flags2 &= -4194305;
                d2.note = null;
            } else {
                d2.flags2 |= TLObject.FLAG_22;
                d2.note = textWithEntities;
            }
            i11 = ((org.telegram.ui.ActionBar.h2) qrVar).currentAccount;
            org.telegram.messenger.tr.a0(i11).j2(d2, true);
            qrVar.getNotificationCenter().k(org.telegram.messenger.ks.E0, Long.valueOf(d2.id), d2);
        }
        qrVar.finishFragment();
        pr prVar = qrVar.P;
        if (prVar != null) {
            prVar.a();
        }
    }
}
