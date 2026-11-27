// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class iq9 implements lr9 {
    public final /* synthetic */ kq9 a;

    public iq9(kq9 kq9Var) {
        this.a = kq9Var;
    }

    @Override // lr9
    public final void onRejoinRequested() {
        hl.c3(new v59(this, (byte) 20));
    }

    @Override // lr9
    public final void onStreamChannels(ArrayList arrayList) {
        hl.c3(new en9(this, arrayList, (byte) 8));
    }
}
