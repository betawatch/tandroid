package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class dp implements org.telegram.ui.w71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ep b;

    public /* synthetic */ dp(ep epVar, int i7) {
        this.a = i7;
        this.b = epVar;
    }

    @Override // org.telegram.ui.w71
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                lp lpVar = this.b.a;
                lpVar.S1.L();
                lpVar.dismiss();
                break;
            default:
                lp lpVar2 = this.b.a;
                lpVar2.S1.L();
                lpVar2.dismiss();
                break;
        }
    }
}
