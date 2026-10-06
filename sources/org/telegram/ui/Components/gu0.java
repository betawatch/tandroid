package org.telegram.ui.Components;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class gu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hu0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ gu0(hu0 hu0Var, String str, int i10) {
        this.a = i10;
        this.b = hu0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hu0 hu0Var = this.b;
                String str = this.c;
                hu0Var.getClass();
                AndroidUtilities.runOnUIThread(new gu0(hu0Var, str, 1));
                break;
            default:
                hu0 hu0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                hu0Var2.f = null;
                if (!ChatObject.isChannel(hu0Var2.n) && hu0Var2.s.d1 != null) {
                    arrayList = new ArrayList(hu0Var2.s.d1.participants.participants);
                }
                hu0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new in0((Object) hu0Var2, (Serializable) str2, arrayList, 6));
                } else {
                    hu0Var2.r = 1;
                }
                hu0Var2.e.g(str2, false, false, true, false, ChatObject.isChannel(hu0Var2.n) ? hu0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
