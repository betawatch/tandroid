// default package

import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class im9 implements NativeInstance.BroadcastStateCallback, xz0 {
    public final /* synthetic */ nm9 a;
    public final /* synthetic */ NativeInstance b;

    public /* synthetic */ im9(nm9 nm9Var, NativeInstance nativeInstance) {
        this.a = nm9Var;
        this.b = nativeInstance;
    }

    @Override // org.telegram.messenger.voip.NativeInstance.BroadcastStateCallback
    public final void onBroadcastStateChanged(boolean z, boolean z2) {
        gl.c3(new s91((Object) this.a, (Object) this.b, z2, z, (byte) 4));
    }

    @Override // xz0
    public final void onRejoinRequested() {
        gl.c3(new tj9(this.a, this.b, (byte) 6));
    }
}
