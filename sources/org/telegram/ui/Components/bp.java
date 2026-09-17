package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vd1;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
