package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ot0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pt0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ot0(pt0 pt0Var, String str, int i10) {
        this.a = i10;
        this.b = pt0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pt0 pt0Var = this.b;
                String str = this.c;
                pt0Var.getClass();
                AndroidUtilities.runOnUIThread(new ot0(pt0Var, str, 1));
                break;
            default:
                pt0 pt0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                pt0Var2.f = null;
                if (!ChatObject.isChannel(pt0Var2.n) && pt0Var2.s.a1 != null) {
                    arrayList = new ArrayList(pt0Var2.s.a1.participants.participants);
                }
                pt0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new jp(pt0Var2, str2, arrayList, 20));
                } else {
                    pt0Var2.r = 1;
                }
                pt0Var2.e.g(str2, false, false, true, false, ChatObject.isChannel(pt0Var2.n) ? pt0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
