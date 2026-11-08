package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class jr extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ nr a;

    public jr(nr nrVar) {
        this.a = nrVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10;
        int i11;
        nr nrVar = this.a;
        if (i7 == -1) {
            nrVar.finishFragment();
            return;
        }
        if (i7 != 1 || nrVar.b.getText().length() == 0) {
            return;
        }
        TLRPC.User a22 = nrVar.getMessagesController().a2(Long.valueOf(nrVar.H));
        TLRPC.UserFull b22 = nrVar.getMessagesController().b2(nrVar.H);
        a22.first_name = nrVar.b.getText().toString();
        a22.last_name = nrVar.c.getText().toString();
        a22.contact = true;
        TLRPC.TL_textWithEntities textWithEntities = nrVar.d.getTextWithEntities();
        nrVar.getMessagesController().X3(a22, false, false);
        org.telegram.messenger.g5 contactsController = nrVar.getContactsController();
        boolean z9 = nrVar.K && nrVar.X;
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
        i10 = ((org.telegram.ui.ActionBar.f2) nrVar).currentAccount;
        org.telegram.messenger.qp.s1(i10).d7.edit().putInt("dialog_bar_vis3" + nrVar.H, 3).commit();
        nrVar.getNotificationCenter().k(org.telegram.messenger.qs.r, 1);
        nrVar.getNotificationCenter().k(org.telegram.messenger.qs.Q0, Long.valueOf(nrVar.H));
        if (b22 != null) {
            if (textWithEntities == null || textWithEntities.text.length() <= 0) {
                b22.flags2 &= -4194305;
                b22.note = null;
            } else {
                b22.flags2 |= TLObject.FLAG_22;
                b22.note = textWithEntities;
            }
            i11 = ((org.telegram.ui.ActionBar.f2) nrVar).currentAccount;
            org.telegram.messenger.yr.a0(i11).j2(b22, true);
            nrVar.getNotificationCenter().k(org.telegram.messenger.qs.E0, Long.valueOf(b22.id), b22);
        }
        nrVar.finishFragment();
        mr mrVar = nrVar.O;
        if (mrVar != null) {
            mrVar.a();
        }
    }
}
