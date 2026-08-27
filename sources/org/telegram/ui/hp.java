package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ip b;
    public final /* synthetic */ String c;

    public /* synthetic */ hp(ip ipVar, String str, int i10) {
        this.a = i10;
        this.b = ipVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ip ipVar = this.b;
                String str = this.c;
                ipVar.getClass();
                AndroidUtilities.runOnUIThread(new hp(ipVar, str, 1));
                break;
            default:
                ip ipVar2 = this.b;
                String str2 = this.c;
                ipVar2.f = null;
                Utilities.searchQueue.postRunnable(new u1(ipVar2, str2, new ArrayList(ipVar2.h.v), 28));
                break;
        }
    }
}
