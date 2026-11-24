// default package

import org.telegram.messenger.PushListenerController;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class op7 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ op7(int i, String str) {
        this.c = i;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                m21 t = vp7.h().t(k96.a0(null, null, i, str), null);
                t.t = true;
                t.j();
                break;
            default:
                PushListenerController.lambda$sendRegistrationToServer$1(str, i);
                break;
        }
    }

    public /* synthetic */ op7(String str, int i) {
        this.b = str;
        this.c = i;
    }
}
