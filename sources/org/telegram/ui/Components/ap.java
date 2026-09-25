package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
