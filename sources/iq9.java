// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
