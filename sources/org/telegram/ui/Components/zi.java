package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aj b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ zi(aj ajVar, String str, int i3, int i10) {
        this.a = i10;
        this.b = ajVar;
        this.c = str;
        this.d = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                aj ajVar = this.b;
                String str = this.c;
                int i3 = this.d;
                ajVar.getClass();
                org.telegram.messenger.g0.h3(new zi(ajVar, str, i3, 1));
                break;
            default:
                aj ajVar2 = this.b;
                String str2 = this.c;
                int i10 = this.d;
                ajVar2.getClass();
                int i11 = org.telegram.messenger.h10.t0;
                Utilities.g.c(new mi.g0(ajVar2, str2, new ArrayList(org.telegram.messenger.g5.r(i11).Z.values()), new ArrayList(org.telegram.messenger.g5.r(i11).f0), i11, i10));
                break;
        }
    }
}
