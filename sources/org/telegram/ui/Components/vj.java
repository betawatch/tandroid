package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class vj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wj b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ vj(wj wjVar, String str, int i10, int i11) {
        this.a = i11;
        this.b = wjVar;
        this.c = str;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wj wjVar = this.b;
                String str = this.c;
                int i10 = this.d;
                wjVar.getClass();
                AndroidUtilities.runOnUIThread(new vj(wjVar, str, i10, 1));
                break;
            default:
                wj wjVar2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                wjVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new ii.i0(wjVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                break;
        }
    }
}
