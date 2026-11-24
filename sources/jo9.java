// default package

import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class jo9 implements NativeInstance.BroadcastStateCallback, e11 {
    public final /* synthetic */ oo9 a;
    public final /* synthetic */ NativeInstance b;

    public /* synthetic */ jo9(oo9 oo9Var, NativeInstance nativeInstance) {
        this.a = oo9Var;
        this.b = nativeInstance;
    }

    @Override // org.telegram.messenger.voip.NativeInstance.BroadcastStateCallback
    public final void onBroadcastStateChanged(boolean z, boolean z2) {
        gm.c3(new bb1((Object) this.a, (Object) this.b, z2, z, (byte) 4));
    }

    @Override // e11
    public final void onRejoinRequested() {
        gm.c3(new il9(this.a, this.b, (byte) 8));
    }
}
