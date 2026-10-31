package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class os implements org.telegram.messenger.bs {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsActivity b;

    public /* synthetic */ os(ContactsActivity contactsActivity, int i10) {
        this.a = i10;
        this.b = contactsActivity;
    }

    @Override // org.telegram.messenger.bs
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                ContactsActivity contactsActivity = this.b;
                contactsActivity.getClass();
                contactsActivity.X = i10 != 0;
                if (i10 != 0) {
                    contactsActivity.g0(false);
                    break;
                }
                break;
            default:
                ContactsActivity.Z(this.b, i10);
                break;
        }
    }
}
