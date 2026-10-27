package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class np implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ op b;
    public final /* synthetic */ String c;

    public /* synthetic */ np(op opVar, String str, int i10) {
        this.a = i10;
        this.b = opVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                op opVar = this.b;
                String str = this.c;
                opVar.getClass();
                AndroidUtilities.runOnUIThread(new np(opVar, str, 1));
                break;
            default:
                op opVar2 = this.b;
                String str2 = this.c;
                opVar2.f = null;
                Utilities.searchQueue.postRunnable(new q1(opVar2, str2, new ArrayList(opVar2.h.v), 28));
                break;
        }
    }
}
