package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jc1;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class jp implements jc1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti b;
    public final /* synthetic */ org.telegram.ui.fc c;

    public /* synthetic */ jp(ti tiVar, org.telegram.ui.fc fcVar, int i10) {
        this.a = i10;
        this.b = tiVar;
        this.c = fcVar;
    }

    @Override // org.telegram.ui.jc1
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                this.b.dismissInternal();
                this.c.run(tL_wallPaper);
                break;
            default:
                this.b.dismissInternal();
                this.c.run(tL_wallPaper);
                break;
        }
    }
}
