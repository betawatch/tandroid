package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a30 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ y20(a30 a30Var, String str, int i9, int i10) {
        this.a = i10;
        this.b = a30Var;
        this.c = str;
        this.d = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a30 a30Var = this.b;
                String str = this.c;
                int i9 = this.d;
                if (a30Var.e != null) {
                    a30Var.e = null;
                    AndroidUtilities.runOnUIThread(new y20(a30Var, str, i9, 1));
                    break;
                }
                break;
            default:
                a30 a30Var2 = this.b;
                String str2 = this.c;
                int i10 = this.d;
                ArrayList arrayList = null;
                a30Var2.e = null;
                if (!ChatObject.isChannel(a30Var2.w.R) && a30Var2.w.S != null) {
                    arrayList = new ArrayList(a30Var2.w.S.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.searchQueue.postRunnable(new c3.d(a30Var2, str2, i10, arrayList2, 19));
                } else {
                    a30Var2.h = false;
                }
                a30Var2.d.g(str2, ChatObject.canAddUsers(a30Var2.w.R), false, true, false, ChatObject.isChannel(a30Var2.w.R) ? a30Var2.w.R.id : 0L, false, 2, i10);
                break;
        }
    }
}
