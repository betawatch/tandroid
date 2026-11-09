package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.v71;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko implements v71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ di b;
    public final /* synthetic */ org.telegram.ui.wb c;

    public /* synthetic */ ko(di diVar, org.telegram.ui.wb wbVar, int i7) {
        this.a = i7;
        this.b = diVar;
        this.c = wbVar;
    }

    @Override // org.telegram.ui.v71
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                this.b.K();
                this.c.a(tL_wallPaper);
                break;
            default:
                this.b.K();
                this.c.a(tL_wallPaper);
                break;
        }
    }
}
