// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class cq9 implements lr9 {
    public final /* synthetic */ dq9 a;

    public cq9(dq9 dq9Var) {
        this.a = dq9Var;
    }

    @Override // lr9
    public final void onRejoinRequested() {
        hl.c3(new v59(this, (byte) 19));
    }

    @Override // lr9
    public final void onStreamChannels(ArrayList arrayList) {
        hl.c3(new en9(this, arrayList, (byte) 6));
    }
}
