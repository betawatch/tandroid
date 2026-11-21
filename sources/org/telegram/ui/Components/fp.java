package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fp implements org.telegram.ui.w71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gp b;

    public /* synthetic */ fp(gp gpVar, int i7) {
        this.a = i7;
        this.b = gpVar;
    }

    @Override // org.telegram.ui.w71
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                np npVar = this.b.a;
                npVar.S1.L();
                npVar.dismiss();
                break;
            default:
                np npVar2 = this.b.a;
                npVar2.S1.L();
                npVar2.dismiss();
                break;
        }
    }
}
