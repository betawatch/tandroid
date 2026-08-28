package org.telegram.messenger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsController b;

    public /* synthetic */ f1(ContactsController contactsController, int i9) {
        this.a = i9;
        this.b = contactsController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadContacts$27();
                break;
            case 1:
                this.b.lambda$performSyncPhoneBook$18();
                break;
            case 2:
                this.b.lambda$processLoadedContacts$29();
                break;
            case 3:
                this.b.lambda$applyContactsUpdates$47();
                break;
            case 4:
                this.b.lambda$checkAppAccount$4();
                break;
            case 5:
                this.b.lambda$cleanup$1();
                break;
            case 6:
                this.b.lambda$new$0();
                break;
            case 7:
                this.b.lambda$forceImportContacts$6();
                break;
            case 8:
                this.b.lambda$readContacts$11();
                break;
            default:
                this.b.lambda$checkContacts$5();
                break;
        }
    }
}
