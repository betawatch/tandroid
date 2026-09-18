package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qj implements wj {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsController.Contact b;

    public /* synthetic */ qj(ContactsController.Contact contact, int i10) {
        this.a = i10;
        this.b = contact;
    }

    @Override // org.telegram.ui.Components.wj
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
