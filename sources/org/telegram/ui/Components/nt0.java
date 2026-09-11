package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class nt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ot0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ nt0(ot0 ot0Var, String str, int i10) {
        this.a = i10;
        this.b = ot0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ot0 ot0Var = this.b;
                String str = this.c;
                ot0Var.getClass();
                AndroidUtilities.runOnUIThread(new nt0(ot0Var, str, 1));
                break;
            default:
                ot0 ot0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                ot0Var2.f = null;
                if (!ChatObject.isChannel(ot0Var2.n) && ot0Var2.s.d1 != null) {
                    arrayList = new ArrayList(ot0Var2.s.d1.participants.participants);
                }
                ot0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new er0(ot0Var2, str2, arrayList, 3));
                } else {
                    ot0Var2.r = 1;
                }
                ot0Var2.e.g(str2, false, false, true, false, ChatObject.isChannel(ot0Var2.n) ? ot0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
