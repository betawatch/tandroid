package org.telegram.messenger;

import java.util.HashMap;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsController b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ HashMap d;

    public /* synthetic */ s1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
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
