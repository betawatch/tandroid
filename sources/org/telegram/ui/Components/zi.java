package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aj b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ zi(aj ajVar, String str, int i7, int i10) {
        this.a = i10;
        this.b = ajVar;
        this.c = str;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                aj ajVar = this.b;
                String str = this.c;
                int i7 = this.d;
                ajVar.getClass();
                org.telegram.messenger.g0.h3(new zi(ajVar, str, i7, 1));
                break;
            default:
                aj ajVar2 = this.b;
                String str2 = this.c;
                int i10 = this.d;
                ajVar2.getClass();
                int i11 = org.telegram.messenger.p10.s0;
                Utilities.g.c(new li.g0(ajVar2, str2, new ArrayList(org.telegram.messenger.g5.r(i11).Y.values()), new ArrayList(org.telegram.messenger.g5.r(i11).e0), i11, i10));
                break;
        }
    }
}
