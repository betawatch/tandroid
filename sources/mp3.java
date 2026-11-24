// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ np3 b;

    public /* synthetic */ mp3(np3 np3Var, byte b) {
        this.a = b;
        this.b = np3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        np3 np3Var = this.b;
        switch (b) {
            case 0:
                if (np3Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) np3Var.getParent()).removeView(np3Var);
                    break;
                }
                break;
            default:
                np3Var.a();
                break;
        }
    }
}
