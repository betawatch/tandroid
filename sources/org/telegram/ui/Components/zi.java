package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class zi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aj b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ zi(aj ajVar, String str, int i10, int i11) {
        this.a = i11;
        this.b = ajVar;
        this.c = str;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                aj ajVar = this.b;
                String str = this.c;
                int i10 = this.d;
                ajVar.getClass();
                org.telegram.messenger.i0.g3(new zi(ajVar, str, i10, 1));
                break;
            default:
                aj ajVar2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                ajVar2.getClass();
                int i12 = org.telegram.messenger.d20.s0;
                Utilities.g.c(new bi.k0(ajVar2, str2, new ArrayList(org.telegram.messenger.i5.r(i12).Y.values()), new ArrayList(org.telegram.messenger.i5.r(i12).e0), i12, i11));
                break;
        }
    }
}
