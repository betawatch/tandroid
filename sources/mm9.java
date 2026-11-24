// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class mm9 implements un9 {
    public final /* synthetic */ nm9 a;

    public mm9(nm9 nm9Var) {
        this.a = nm9Var;
    }

    @Override // un9
    public final void onRejoinRequested() {
        gl.c3(new zk9(this, (byte) 3));
    }

    @Override // un9
    public final void onStreamChannels(ArrayList arrayList) {
        gl.c3(new tj9(this, arrayList, (byte) 7));
    }
}
