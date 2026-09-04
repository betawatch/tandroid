package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
