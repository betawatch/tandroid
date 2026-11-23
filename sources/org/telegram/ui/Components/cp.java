package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
