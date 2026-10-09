package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yj b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ xj(yj yjVar, String str, int i10, int i11) {
        this.a = i11;
        this.b = yjVar;
        this.c = str;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yj yjVar = this.b;
                String str = this.c;
                int i10 = this.d;
                yjVar.getClass();
                AndroidUtilities.runOnUIThread(new xj(yjVar, str, i10, 1));
                break;
            default:
                yj yjVar2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                yjVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new ii.i0(yjVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                break;
        }
    }
}
