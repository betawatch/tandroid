package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.v71;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class no implements v71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo b;

    public /* synthetic */ no(oo ooVar, int i7) {
        this.a = i7;
        this.b = ooVar;
    }

    @Override // org.telegram.ui.v71
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                vo voVar = this.b.a;
                voVar.O1.K();
                voVar.dismiss();
                break;
            default:
                vo voVar2 = this.b.a;
                voVar2.O1.K();
                voVar2.dismiss();
                break;
        }
    }
}
