package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hj b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ fj(hj hjVar, String str, int i10, int i11) {
        this.a = i11;
        this.b = hjVar;
        this.c = str;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hj hjVar = this.b;
                String str = this.c;
                int i10 = this.d;
                hjVar.getClass();
                AndroidUtilities.runOnUIThread(new fj(hjVar, str, i10, 1));
                break;
            default:
                hj hjVar2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                hjVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new gj(hjVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                break;
        }
    }
}
