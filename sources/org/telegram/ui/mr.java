package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mr implements org.telegram.messenger.kr {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsActivity b;

    public /* synthetic */ mr(ContactsActivity contactsActivity, int i3) {
        this.a = i3;
        this.b = contactsActivity;
    }

    @Override // org.telegram.messenger.kr
    public final void a(int i3) {
        switch (this.a) {
            case 0:
                ContactsActivity contactsActivity = this.b;
                contactsActivity.getClass();
                contactsActivity.Y = i3 != 0;
                if (i3 != 0) {
                    contactsActivity.h0(false);
                    break;
                }
                break;
            default:
                ContactsActivity.a0(this.b, i3);
                break;
        }
    }
}
