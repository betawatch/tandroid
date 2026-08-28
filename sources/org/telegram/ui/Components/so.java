package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nc1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class so implements nc1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ to b;

    public /* synthetic */ so(to toVar, int i9) {
        this.a = i9;
        this.b = toVar;
    }

    @Override // org.telegram.ui.nc1
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                cp cpVar = this.b.a;
                cpVar.U.dismissInternal();
                cpVar.dismiss();
                break;
            default:
                cp cpVar2 = this.b.a;
                cpVar2.U.dismissInternal();
                cpVar2.dismiss();
                break;
        }
    }
}
