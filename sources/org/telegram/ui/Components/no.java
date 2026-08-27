package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mc1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class no implements mc1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gi b;
    public final /* synthetic */ org.telegram.ui.x3 c;

    public /* synthetic */ no(gi giVar, org.telegram.ui.x3 x3Var, int i10) {
        this.a = i10;
        this.b = giVar;
        this.c = x3Var;
    }

    @Override // org.telegram.ui.mc1
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
