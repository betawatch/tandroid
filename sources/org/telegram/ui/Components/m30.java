package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o30 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ m30(o30 o30Var, String str, int i10, int i11) {
        this.a = i11;
        this.b = o30Var;
        this.c = str;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o30 o30Var = this.b;
                String str = this.c;
                int i10 = this.d;
                if (o30Var.e != null) {
                    o30Var.e = null;
                    AndroidUtilities.runOnUIThread(new m30(o30Var, str, i10, 1));
                    break;
                }
                break;
            default:
                o30 o30Var2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                ArrayList arrayList = null;
                o30Var2.e = null;
                if (!ChatObject.isChannel(o30Var2.w.R) && o30Var2.w.S != null) {
                    arrayList = new ArrayList(o30Var2.w.S.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.searchQueue.postRunnable(new ag.z1(o30Var2, str2, i11, arrayList2, 18));
                } else {
                    o30Var2.h = false;
                }
                o30Var2.d.g(str2, ChatObject.canAddUsers(o30Var2.w.R), false, true, false, ChatObject.isChannel(o30Var2.w.R) ? o30Var2.w.R.id : 0L, false, 2, i11);
                break;
        }
    }
}
