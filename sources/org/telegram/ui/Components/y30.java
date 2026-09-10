package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class y30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ y30(a40 a40Var, String str, int i10, int i11) {
        this.a = i11;
        this.b = a40Var;
        this.c = str;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a40 a40Var = this.b;
                String str = this.c;
                int i10 = this.d;
                if (a40Var.e != null) {
                    a40Var.e = null;
                    AndroidUtilities.runOnUIThread(new y30(a40Var, str, i10, 1));
                    break;
                }
                break;
            default:
                a40 a40Var2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                ArrayList arrayList = null;
                a40Var2.e = null;
                if (!ChatObject.isChannel(a40Var2.w.V) && a40Var2.w.W != null) {
                    arrayList = new ArrayList(a40Var2.w.W.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.searchQueue.postRunnable(new di.q((Object) a40Var2, (Object) str2, i11, arrayList2, 19));
                } else {
                    a40Var2.h = false;
                }
                a40Var2.d.g(str2, ChatObject.canAddUsers(a40Var2.w.V), false, true, false, ChatObject.isChannel(a40Var2.w.V) ? a40Var2.w.V.id : 0L, false, 2, i11);
                break;
        }
    }
}
