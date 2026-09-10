package org.telegram.messenger;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class h1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsController b;

    public /* synthetic */ h1(ContactsController contactsController, int i10) {
        this.a = i10;
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
