package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsController b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ HashMap d;
    public final /* synthetic */ HashMap e;

    public /* synthetic */ l1(ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ContactsController contactsController) {
        this.a = 1;
        this.b = contactsController;
        this.c = arrayList;
        this.d = hashMap;
        this.e = hashMap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.c;
                HashMap hashMap = this.e;
                this.b.lambda$performSyncPhoneBook$15(this.d, arrayList, hashMap);
                break;
            case 1:
                HashMap hashMap2 = this.d;
                HashMap hashMap3 = this.e;
                this.b.lambda$mergePhonebookAndTelegramContacts$40(this.c, hashMap2, hashMap3);
                break;
            case 2:
                ArrayList arrayList2 = this.c;
                HashMap hashMap4 = this.e;
                this.b.lambda$performSyncPhoneBook$21(this.d, arrayList2, hashMap4);
                break;
            case 3:
                ArrayList arrayList3 = this.c;
                HashMap hashMap5 = this.e;
                this.b.lambda$performSyncPhoneBook$17(this.d, arrayList3, hashMap5);
                break;
            default:
                ArrayList arrayList4 = this.c;
                HashMap hashMap6 = this.e;
                this.b.lambda$performSyncPhoneBook$23(this.d, arrayList4, hashMap6);
                break;
        }
    }

    public /* synthetic */ l1(ContactsController contactsController, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i10) {
        this.a = i10;
        this.b = contactsController;
        this.d = hashMap;
        this.c = arrayList;
        this.e = hashMap2;
    }
}
