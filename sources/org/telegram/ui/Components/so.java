package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.l91;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class so implements l91 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi b;
    public final /* synthetic */ org.telegram.ui.cc c;

    public /* synthetic */ so(bi biVar, org.telegram.ui.cc ccVar, int i10) {
        this.a = i10;
        this.b = biVar;
        this.c = ccVar;
    }

    @Override // org.telegram.ui.l91
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                this.b.L();
                this.c.a(tL_wallPaper);
                break;
            default:
                this.b.L();
                this.c.a(tL_wallPaper);
                break;
        }
    }
}
