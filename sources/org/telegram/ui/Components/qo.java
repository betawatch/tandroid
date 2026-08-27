package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mc1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qo implements mc1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ro b;

    public /* synthetic */ qo(ro roVar, int i10) {
        this.a = i10;
        this.b = roVar;
    }

    @Override // org.telegram.ui.mc1
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                ap apVar = this.b.a;
                apVar.U.dismissInternal();
                apVar.dismiss();
                break;
            default:
                ap apVar2 = this.b.a;
                apVar2.U.dismissInternal();
                apVar2.dismiss();
                break;
        }
    }
}
