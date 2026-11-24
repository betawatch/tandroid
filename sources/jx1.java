// default package

import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class jx1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ jx1(FrameLayout frameLayout, byte b) {
        this.a = b;
        this.b = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                gl.B2(frameLayout);
                break;
            default:
                gl.B2(frameLayout);
                break;
        }
    }
}
