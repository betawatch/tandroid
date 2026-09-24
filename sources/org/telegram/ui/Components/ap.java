package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ap implements nd1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wi b;
    public final /* synthetic */ org.telegram.ui.ec c;

    public /* synthetic */ ap(wi wiVar, org.telegram.ui.ec ecVar, int i10) {
        this.a = i10;
        this.b = wiVar;
        this.c = ecVar;
    }

    @Override // org.telegram.ui.nd1
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
