package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z30 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ x30(z30 z30Var, String str, int i10, int i11) {
        this.a = i11;
        this.b = z30Var;
        this.c = str;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z30 z30Var = this.b;
                String str = this.c;
                int i10 = this.d;
                if (z30Var.e != null) {
                    z30Var.e = null;
                    AndroidUtilities.runOnUIThread(new x30(z30Var, str, i10, 1));
                    break;
                }
                break;
            default:
                z30 z30Var2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                ArrayList arrayList = null;
                z30Var2.e = null;
                if (!ChatObject.isChannel(z30Var2.w.V) && z30Var2.w.W != null) {
                    arrayList = new ArrayList(z30Var2.w.W.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.searchQueue.postRunnable(new ai.bb(z30Var2, str2, i11, arrayList2, 21));
                } else {
                    z30Var2.h = false;
                }
                z30Var2.d.g(str2, ChatObject.canAddUsers(z30Var2.w.V), false, true, false, ChatObject.isChannel(z30Var2.w.V) ? z30Var2.w.V.id : 0L, false, 2, i11);
                break;
        }
    }
}
