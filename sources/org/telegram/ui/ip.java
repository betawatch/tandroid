package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ip implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jp b;
    public final /* synthetic */ String c;

    public /* synthetic */ ip(jp jpVar, String str, int i10) {
        this.a = i10;
        this.b = jpVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jp jpVar = this.b;
                String str = this.c;
                jpVar.getClass();
                AndroidUtilities.runOnUIThread(new ip(jpVar, str, 1));
                break;
            default:
                jp jpVar2 = this.b;
                String str2 = this.c;
                jpVar2.f = null;
                Utilities.searchQueue.postRunnable(new u1(jpVar2, str2, new ArrayList(jpVar2.h.v), 28));
                break;
        }
    }
}
