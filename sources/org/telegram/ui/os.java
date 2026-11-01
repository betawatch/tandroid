package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class os implements org.telegram.messenger.cs {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsActivity b;

    public /* synthetic */ os(ContactsActivity contactsActivity, int i10) {
        this.a = i10;
        this.b = contactsActivity;
    }

    @Override // org.telegram.messenger.cs
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                ContactsActivity contactsActivity = this.b;
                contactsActivity.getClass();
                contactsActivity.X = i10 != 0;
                if (i10 != 0) {
                    contactsActivity.h0(false);
                    break;
                }
                break;
            default:
                ContactsActivity.a0(this.b, i10);
                break;
        }
    }
}
