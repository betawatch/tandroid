package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class tj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uj b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ tj(uj ujVar, String str, int i10, int i11) {
        this.a = i11;
        this.b = ujVar;
        this.c = str;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uj ujVar = this.b;
                String str = this.c;
                int i10 = this.d;
                ujVar.getClass();
                AndroidUtilities.runOnUIThread(new tj(ujVar, str, i10, 1));
                break;
            default:
                uj ujVar2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                ujVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new ji.h0(ujVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                break;
        }
    }
}
