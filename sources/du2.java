// default package

import org.telegram.ui.ContactsActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class du2 implements df7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ContactsActivity b;

    public /* synthetic */ du2(ContactsActivity contactsActivity, byte b) {
        this.a = b;
        this.b = contactsActivity;
    }

    @Override // df7
    public final void a(int i) {
        byte b = this.a;
        ContactsActivity contactsActivity = this.b;
        switch (b) {
            case 0:
                contactsActivity.Y = i != 0;
                if (i != 0) {
                    contactsActivity.b0(false);
                    break;
                }
                break;
            default:
                contactsActivity.i0(i);
                break;
        }
    }
}
