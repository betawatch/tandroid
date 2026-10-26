package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ String c;

    public /* synthetic */ lp(mp mpVar, String str, int i10) {
        this.a = i10;
        this.b = mpVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mp mpVar = this.b;
                String str = this.c;
                mpVar.getClass();
                AndroidUtilities.runOnUIThread(new lp(mpVar, str, 1));
                break;
            default:
                mp mpVar2 = this.b;
                String str2 = this.c;
                mpVar2.f = null;
                Utilities.searchQueue.postRunnable(new q1(mpVar2, str2, new ArrayList(mpVar2.h.v), 28));
                break;
        }
    }
}
