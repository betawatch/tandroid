// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
        hl.c3(new dn9(this, arrayList, (byte) 7));
    }
}
