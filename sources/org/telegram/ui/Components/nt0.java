package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
