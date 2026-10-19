package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class gp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ String c;

    public /* synthetic */ gp(hp hpVar, String str, int i10) {
        this.a = i10;
        this.b = hpVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hp hpVar = this.b;
                String str = this.c;
                hpVar.getClass();
                AndroidUtilities.runOnUIThread(new gp(hpVar, str, 1));
                break;
            default:
                hp hpVar2 = this.b;
                String str2 = this.c;
                hpVar2.f = null;
                Utilities.searchQueue.postRunnable(new t1(hpVar2, str2, new ArrayList(hpVar2.h.v), 28));
                break;
        }
    }
}
