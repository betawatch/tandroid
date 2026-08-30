package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s30 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ q30(s30 s30Var, String str, int i10, int i11) {
        this.a = i11;
        this.b = s30Var;
        this.c = str;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s30 s30Var = this.b;
                String str = this.c;
                int i10 = this.d;
                if (s30Var.e != null) {
                    s30Var.e = null;
                    AndroidUtilities.runOnUIThread(new q30(s30Var, str, i10, 1));
                    break;
                }
                break;
            default:
                s30 s30Var2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                ArrayList arrayList = null;
                s30Var2.e = null;
                if (!ChatObject.isChannel(s30Var2.w.S) && s30Var2.w.T != null) {
                    arrayList = new ArrayList(s30Var2.w.T.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.searchQueue.postRunnable(new cg.v1(s30Var2, str2, i11, arrayList2, 18));
                } else {
                    s30Var2.h = false;
                }
                s30Var2.d.g(str2, ChatObject.canAddUsers(s30Var2.w.S), false, true, false, ChatObject.isChannel(s30Var2.w.S) ? s30Var2.w.S.id : 0L, false, 2, i11);
                break;
        }
    }
}
