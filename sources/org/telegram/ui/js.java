package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class js implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsActivity b;

    public /* synthetic */ js(ContactsActivity contactsActivity, int i9) {
        this.a = i9;
        this.b = contactsActivity;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i9) {
        switch (this.a) {
            case 0:
                ContactsActivity contactsActivity = this.b;
                contactsActivity.getClass();
                contactsActivity.X = i9 != 0;
                if (i9 != 0) {
                    contactsActivity.e0(false);
                    break;
                }
                break;
            default:
                ContactsActivity.V(this.b, i9);
                break;
        }
    }
}
