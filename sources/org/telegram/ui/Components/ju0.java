package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class ju0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ku0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ju0(ku0 ku0Var, String str, int i10) {
        this.a = i10;
        this.b = ku0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ku0 ku0Var = this.b;
                String str = this.c;
                ku0Var.getClass();
                AndroidUtilities.runOnUIThread(new ju0(ku0Var, str, 1));
                break;
            default:
                ku0 ku0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                ku0Var2.f = null;
                if (!ChatObject.isChannel(ku0Var2.n) && ku0Var2.s.d1 != null) {
                    arrayList = new ArrayList(ku0Var2.s.d1.participants.participants);
                }
                ku0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new lg((Object) ku0Var2, (Object) str2, arrayList, 24));
                } else {
                    ku0Var2.r = 1;
                }
                ku0Var2.e.g(str2, false, false, true, false, ChatObject.isChannel(ku0Var2.n) ? ku0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
