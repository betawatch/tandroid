package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class o30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q30 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ o30(q30 q30Var, String str, int i10, int i11) {
        this.a = i11;
        this.b = q30Var;
        this.c = str;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q30 q30Var = this.b;
                String str = this.c;
                int i10 = this.d;
                if (q30Var.e != null) {
                    q30Var.e = null;
                    AndroidUtilities.runOnUIThread(new o30(q30Var, str, i10, 1));
                    break;
                }
                break;
            default:
                q30 q30Var2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                ArrayList arrayList = null;
                q30Var2.e = null;
                if (!ChatObject.isChannel(q30Var2.w.V) && q30Var2.w.W != null) {
                    arrayList = new ArrayList(q30Var2.w.W.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new bi.k8(q30Var2, str2, i11, arrayList));
                } else {
                    q30Var2.h = false;
                }
                q30Var2.d.g(str2, ChatObject.canAddUsers(q30Var2.w.V), false, true, false, ChatObject.isChannel(q30Var2.w.V) ? q30Var2.w.V.id : 0L, false, 2, i11);
                break;
        }
    }
}
