// default package

import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class a0b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ StickersActivity b;

    public /* synthetic */ a0b(StickersActivity stickersActivity, byte b) {
        this.a = b;
        this.b = stickersActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        StickersActivity stickersActivity = this.b;
        switch (b) {
            case 0:
                stickersActivity.o0();
                break;
            default:
                stickersActivity.n--;
                break;
        }
    }
}
