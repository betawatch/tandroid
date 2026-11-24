// default package

import org.telegram.ui.ContactsActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class jt2 implements uc7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ContactsActivity b;

    public /* synthetic */ jt2(ContactsActivity contactsActivity, byte b) {
        this.a = b;
        this.b = contactsActivity;
    }

    @Override // uc7
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
