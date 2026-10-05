package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xj b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ wj(xj xjVar, String str, int i10, int i11) {
        this.a = i11;
        this.b = xjVar;
        this.c = str;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xj xjVar = this.b;
                String str = this.c;
                int i10 = this.d;
                xjVar.getClass();
                AndroidUtilities.runOnUIThread(new wj(xjVar, str, i10, 1));
                break;
            default:
                xj xjVar2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                xjVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new ii.i0(xjVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                break;
        }
    }
}
