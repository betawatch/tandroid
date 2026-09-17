package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vd1;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bp implements vd1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cp b;

    public /* synthetic */ bp(cp cpVar, int i10) {
        this.a = i10;
        this.b = cpVar;
    }

    @Override // org.telegram.ui.vd1
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                lp lpVar = this.b.a;
                lpVar.Y.dismissInternal();
                lpVar.dismiss();
                break;
            default:
                lp lpVar2 = this.b.a;
                lpVar2.Y.dismissInternal();
                lpVar2.dismiss();
                break;
        }
    }
}
