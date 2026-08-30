package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class op implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pp b;
    public final /* synthetic */ String c;

    public /* synthetic */ op(pp ppVar, String str, int i10) {
        this.a = i10;
        this.b = ppVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pp ppVar = this.b;
                String str = this.c;
                ppVar.getClass();
                AndroidUtilities.runOnUIThread(new op(ppVar, str, 1));
                break;
            default:
                pp ppVar2 = this.b;
                String str2 = this.c;
                ppVar2.f = null;
                Utilities.searchQueue.postRunnable(new s1(ppVar2, str2, new ArrayList(ppVar2.h.v), 28));
                break;
        }
    }
}
