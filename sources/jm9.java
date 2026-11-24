// default package

import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class jm9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ NativeInstance b;

    public /* synthetic */ jm9(NativeInstance nativeInstance, byte b) {
        this.a = b;
        this.b = nativeInstance;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        this.b.stopGroup();
    }
}
