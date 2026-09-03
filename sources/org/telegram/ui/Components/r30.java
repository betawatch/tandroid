package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t30 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ r30(t30 t30Var, String str, int i10, int i11) {
        this.a = i11;
        this.b = t30Var;
        this.c = str;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t30 t30Var = this.b;
                String str = this.c;
                int i10 = this.d;
                if (t30Var.e != null) {
                    t30Var.e = null;
                    AndroidUtilities.runOnUIThread(new r30(t30Var, str, i10, 1));
                    break;
                }
                break;
            default:
                t30 t30Var2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                ArrayList arrayList = null;
                t30Var2.e = null;
                if (!ChatObject.isChannel(t30Var2.w.S) && t30Var2.w.T != null) {
                    arrayList = new ArrayList(t30Var2.w.T.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.searchQueue.postRunnable(new cg.v1(t30Var2, str2, i11, arrayList2, 18));
                } else {
                    t30Var2.h = false;
                }
                t30Var2.d.g(str2, ChatObject.canAddUsers(t30Var2.w.S), false, true, false, ChatObject.isChannel(t30Var2.w.S) ? t30Var2.w.S.id : 0L, false, 2, i11);
                break;
        }
    }
}
