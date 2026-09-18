package org.telegram.messenger;

import java.util.HashMap;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final /* synthetic */ class r1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsController b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ HashMap d;

    public /* synthetic */ r1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.a = i10;
        this.b = contactsController;
        this.c = hashMap;
        this.d = hashMap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processLoadedContacts$35(this.c, this.d);
                break;
            default:
                this.b.lambda$processLoadedContacts$34(this.c, this.d);
                break;
        }
    }
}
