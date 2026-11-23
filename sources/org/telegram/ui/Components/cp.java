package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp implements org.telegram.ui.w71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ org.telegram.ui.vb c;

    public /* synthetic */ cp(ui uiVar, org.telegram.ui.vb vbVar, int i7) {
        this.a = i7;
        this.b = uiVar;
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
