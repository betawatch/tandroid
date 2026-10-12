package org.telegram.messenger;

import java.util.HashMap;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
