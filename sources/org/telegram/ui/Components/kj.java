package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mj b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ kj(mj mjVar, String str, int i10, int i11) {
        this.a = i11;
        this.b = mjVar;
        this.c = str;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mj mjVar = this.b;
                String str = this.c;
                int i10 = this.d;
                mjVar.getClass();
                AndroidUtilities.runOnUIThread(new kj(mjVar, str, i10, 1));
                break;
            default:
                mj mjVar2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                mjVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new lj(mjVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                break;
        }
    }
}
