package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class or implements org.telegram.messenger.sr {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsActivity b;

    public /* synthetic */ or(ContactsActivity contactsActivity, int i7) {
        this.a = i7;
        this.b = contactsActivity;
    }

    @Override // org.telegram.messenger.sr
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                ContactsActivity contactsActivity = this.b;
                contactsActivity.getClass();
                contactsActivity.X = i7 != 0;
                if (i7 != 0) {
                    contactsActivity.h0(false);
                    break;
                }
                break;
            default:
                ContactsActivity.a0(this.b, i7);
                break;
        }
    }
}
