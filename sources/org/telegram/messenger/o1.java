package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class o1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsController b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ o1(ContactsController contactsController, ArrayList arrayList, int i10) {
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
