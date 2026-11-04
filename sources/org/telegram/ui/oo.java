package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ po b;
    public final /* synthetic */ String c;

    public /* synthetic */ oo(po poVar, String str, int i3) {
        this.a = i3;
        this.b = poVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                po poVar = this.b;
                String str = this.c;
                poVar.getClass();
                org.telegram.messenger.g0.h3(new oo(poVar, str, 1));
                break;
            default:
                po poVar2 = this.b;
                String str2 = this.c;
                poVar2.f = null;
                Utilities.g.c(new p1(poVar2, str2, new ArrayList(poVar2.h.w), 28));
                break;
        }
    }
}
