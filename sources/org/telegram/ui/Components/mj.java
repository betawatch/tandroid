package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oj b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ mj(oj ojVar, String str, int i10, int i11) {
        this.a = i11;
        this.b = ojVar;
        this.c = str;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oj ojVar = this.b;
                String str = this.c;
                int i10 = this.d;
                ojVar.getClass();
                AndroidUtilities.runOnUIThread(new mj(ojVar, str, i10, 1));
                break;
            default:
                oj ojVar2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                ojVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new nj(ojVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                break;
        }
    }
}
