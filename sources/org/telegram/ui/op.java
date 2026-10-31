package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class op implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pp b;
    public final /* synthetic */ String c;

    public /* synthetic */ op(pp ppVar, String str, int i10) {
        this.a = i10;
        this.b = ppVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pp ppVar = this.b;
                String str = this.c;
                ppVar.getClass();
                org.telegram.messenger.i0.g3(new op(ppVar, str, 1));
                break;
            default:
                pp ppVar2 = this.b;
                String str2 = this.c;
                ppVar2.f = null;
                Utilities.g.c(new p1(ppVar2, str2, new ArrayList(ppVar2.h.w), 28));
                break;
        }
    }
}
