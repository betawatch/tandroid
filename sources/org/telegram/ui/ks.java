package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ks implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsActivity b;

    public /* synthetic */ ks(ContactsActivity contactsActivity, int i9) {
        this.a = i9;
        this.b = contactsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f0();
                break;
            default:
                ContactsActivity contactsActivity = this.b;
                contactsActivity.f.postOnAnimation(new ks(contactsActivity, 0));
                break;
        }
    }
}
