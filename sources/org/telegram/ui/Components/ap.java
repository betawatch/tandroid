package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ap implements org.telegram.ui.w71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ si b;
    public final /* synthetic */ org.telegram.ui.vb c;

    public /* synthetic */ ap(si siVar, org.telegram.ui.vb vbVar, int i7) {
        this.a = i7;
        this.b = siVar;
        this.c = vbVar;
    }

    @Override // org.telegram.ui.w71
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                this.b.L();
                this.c.a(tL_wallPaper);
                break;
            default:
                this.b.L();
                this.c.a(tL_wallPaper);
                break;
        }
    }
}
