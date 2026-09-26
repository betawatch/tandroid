package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class q1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsController b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ q1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = contactsController;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$deleteContact$55(this.c);
                break;
            case 1:
                this.b.lambda$performWriteContactsToPhoneBook$45(this.c);
                break;
            default:
                this.b.lambda$deleteContactsUndoable$54(this.c);
                break;
        }
    }
}
