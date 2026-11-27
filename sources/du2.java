// default package

import org.telegram.ui.ContactsActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class du2 implements ef7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ContactsActivity b;

    public /* synthetic */ du2(ContactsActivity contactsActivity, byte b) {
        this.a = b;
        this.b = contactsActivity;
    }

    @Override // ef7
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
