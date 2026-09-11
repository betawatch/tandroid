package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
