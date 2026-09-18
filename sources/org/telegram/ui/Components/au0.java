package org.telegram.ui.Components;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class au0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bu0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ au0(bu0 bu0Var, String str, int i10) {
        this.a = i10;
        this.b = bu0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bu0 bu0Var = this.b;
                String str = this.c;
                bu0Var.getClass();
                AndroidUtilities.runOnUIThread(new au0(bu0Var, str, 1));
                break;
            default:
                bu0 bu0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                bu0Var2.f = null;
                if (!ChatObject.isChannel(bu0Var2.n) && bu0Var2.s.d1 != null) {
                    arrayList = new ArrayList(bu0Var2.s.d1.participants.participants);
                }
                bu0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new dn0((Object) bu0Var2, (Serializable) str2, arrayList, 6));
                } else {
                    bu0Var2.r = 1;
                }
                bu0Var2.e.g(str2, false, false, true, false, ChatObject.isChannel(bu0Var2.n) ? bu0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
