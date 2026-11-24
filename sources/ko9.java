// default package

import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ko9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ NativeInstance b;

    public /* synthetic */ ko9(NativeInstance nativeInstance, byte b) {
        this.a = b;
        this.b = nativeInstance;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        this.b.stopGroup();
    }
}
