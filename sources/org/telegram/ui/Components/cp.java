package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ud1;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp implements ud1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dp b;

    public /* synthetic */ cp(dp dpVar, int i10) {
        this.a = i10;
        this.b = dpVar;
    }

    @Override // org.telegram.ui.ud1
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                mp mpVar = this.b.a;
                mpVar.Y.dismissInternal();
                mpVar.dismiss();
                break;
            default:
                mp mpVar2 = this.b.a;
                mpVar2.Y.dismissInternal();
                mpVar2.dismiss();
                break;
        }
    }
}
