package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tj implements zj {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsController.Contact b;

    public /* synthetic */ tj(ContactsController.Contact contact, int i10) {
        this.a = i10;
        this.b = contact;
    }

    @Override // org.telegram.ui.Components.zj
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
