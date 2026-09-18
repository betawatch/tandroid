package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qt0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ pt0(qt0 qt0Var, String str, int i10) {
        this.a = i10;
        this.b = qt0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qt0 qt0Var = this.b;
                String str = this.c;
                qt0Var.getClass();
                AndroidUtilities.runOnUIThread(new pt0(qt0Var, str, 1));
                break;
            default:
                qt0 qt0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                qt0Var2.f = null;
                if (!ChatObject.isChannel(qt0Var2.n) && qt0Var2.s.d1 != null) {
                    arrayList = new ArrayList(qt0Var2.s.d1.participants.participants);
                }
                qt0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new gr0(qt0Var2, str2, arrayList, 3));
                } else {
                    qt0Var2.r = 1;
                }
                qt0Var2.e.g(str2, false, false, true, false, ChatObject.isChannel(qt0Var2.n) ? qt0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
