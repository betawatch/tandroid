package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lj b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ jj(lj ljVar, String str, int i9, int i10) {
        this.a = i10;
        this.b = ljVar;
        this.c = str;
        this.d = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lj ljVar = this.b;
                String str = this.c;
                int i9 = this.d;
                ljVar.getClass();
                AndroidUtilities.runOnUIThread(new jj(ljVar, str, i9, 1));
                break;
            default:
                lj ljVar2 = this.b;
                String str2 = this.c;
                int i10 = this.d;
                ljVar2.getClass();
                int i11 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new kj(ljVar2, str2, new ArrayList(ContactsController.getInstance(i11).contactsBook.values()), new ArrayList(ContactsController.getInstance(i11).contacts), i11, i10));
                break;
        }
    }
}
