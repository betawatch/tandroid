package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.dd1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yo implements dd1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mi b;
    public final /* synthetic */ org.telegram.ui.w3 c;

    public /* synthetic */ yo(mi miVar, org.telegram.ui.w3 w3Var, int i10) {
        this.a = i10;
        this.b = miVar;
        this.c = w3Var;
    }

    @Override // org.telegram.ui.dd1
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
