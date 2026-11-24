// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
