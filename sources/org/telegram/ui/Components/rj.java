package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rj implements xj {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsController.Contact b;

    public /* synthetic */ rj(ContactsController.Contact contact, int i10) {
        this.a = i10;
        this.b = contact;
    }

    @Override // org.telegram.ui.Components.xj
    public final String run() {
        switch (this.a) {
            case 0:
                ContactsController.Contact contact = this.b;
                return contact.phones.isEmpty() ? "" : gf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.b;
                return contact2.phones.isEmpty() ? "" : gf.b.c().b(contact2.phones.get(0));
        }
    }
}
