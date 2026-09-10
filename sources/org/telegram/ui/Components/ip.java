package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zd1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ip implements zd1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jp b;

    public /* synthetic */ ip(jp jpVar, int i10) {
        this.a = i10;
        this.b = jpVar;
    }

    @Override // org.telegram.ui.zd1
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                sp spVar = this.b.a;
                spVar.Y.dismissInternal();
                spVar.dismiss();
                break;
            default:
                sp spVar2 = this.b.a;
                spVar2.Y.dismissInternal();
                spVar2.dismiss();
                break;
        }
    }
}
