package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.t71;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class no implements t71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo b;

    public /* synthetic */ no(oo ooVar, int i7) {
        this.a = i7;
        this.b = ooVar;
    }

    @Override // org.telegram.ui.t71
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
