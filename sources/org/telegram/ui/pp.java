package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ String c;

    public /* synthetic */ pp(qp qpVar, String str, int i10) {
        this.a = i10;
        this.b = qpVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qp qpVar = this.b;
                String str = this.c;
                qpVar.getClass();
                AndroidUtilities.runOnUIThread(new pp(qpVar, str, 1));
                break;
            default:
                qp qpVar2 = this.b;
                String str2 = this.c;
                qpVar2.f = null;
                Utilities.searchQueue.postRunnable(new s1(qpVar2, str2, new ArrayList(qpVar2.h.v), 28));
                break;
        }
    }
}
