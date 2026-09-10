package org.telegram.messenger;

import java.util.HashMap;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class u1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsController b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ HashMap d;

    public /* synthetic */ u1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
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
