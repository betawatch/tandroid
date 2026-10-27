package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ms implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsActivity b;

    public /* synthetic */ ms(ContactsActivity contactsActivity, int i10) {
        this.a = i10;
        this.b = contactsActivity;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                ContactsActivity contactsActivity = this.b;
                contactsActivity.getClass();
                contactsActivity.X = i10 != 0;
                if (i10 != 0) {
                    contactsActivity.d0(false);
                    break;
                }
                break;
            default:
                ContactsActivity.W(this.b, i10);
                break;
        }
    }
}
