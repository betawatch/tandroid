package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vj b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ uj(vj vjVar, String str, int i10, int i11) {
        this.a = i11;
        this.b = vjVar;
        this.c = str;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vj vjVar = this.b;
                String str = this.c;
                int i10 = this.d;
                vjVar.getClass();
                AndroidUtilities.runOnUIThread(new uj(vjVar, str, i10, 1));
                break;
            default:
                vj vjVar2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                vjVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new ii.i0(vjVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                break;
        }
    }
}
