package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class to implements org.telegram.ui.s71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki b;
    public final /* synthetic */ org.telegram.ui.vb c;

    public /* synthetic */ to(ki kiVar, org.telegram.ui.vb vbVar, int i7) {
        this.a = i7;
        this.b = kiVar;
        this.c = vbVar;
    }

    @Override // org.telegram.ui.s71
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
