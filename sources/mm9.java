// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class mm9 implements un9 {
    public final /* synthetic */ nm9 a;

    public mm9(nm9 nm9Var) {
        this.a = nm9Var;
    }

    @Override // un9
    public final void onRejoinRequested() {
        gl.d3(new zk9(this, (byte) 3));
    }

    @Override // un9
    public final void onStreamChannels(ArrayList arrayList) {
        gl.d3(new tj9(this, arrayList, (byte) 7));
    }
}
