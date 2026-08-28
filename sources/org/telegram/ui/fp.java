package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gp b;
    public final /* synthetic */ String c;

    public /* synthetic */ fp(gp gpVar, String str, int i9) {
        this.a = i9;
        this.b = gpVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gp gpVar = this.b;
                String str = this.c;
                gpVar.getClass();
                AndroidUtilities.runOnUIThread(new fp(gpVar, str, 1));
                break;
            default:
                gp gpVar2 = this.b;
                String str2 = this.c;
                gpVar2.f = null;
                Utilities.searchQueue.postRunnable(new t1(gpVar2, str2, new ArrayList(gpVar2.h.v), 28));
                break;
        }
    }
}
