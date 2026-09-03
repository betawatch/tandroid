package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jj implements qj {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsController.Contact b;

    public /* synthetic */ jj(ContactsController.Contact contact, int i10) {
        this.a = i10;
        this.b = contact;
    }

    @Override // org.telegram.ui.Components.qj
    public final String run() {
        switch (this.a) {
            case 0:
                ContactsController.Contact contact = this.b;
                return contact.phones.isEmpty() ? "" : se.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.b;
                return contact2.phones.isEmpty() ? "" : se.b.c().b(contact2.phones.get(0));
        }
    }
}
