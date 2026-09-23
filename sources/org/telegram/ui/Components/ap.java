package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
