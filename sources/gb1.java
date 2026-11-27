// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class gb1 {
    public final int a;
    public final int b;
    public final int c;
    public boolean d;

    public gb1(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final void a(String str) {
        if (this.d) {
            return;
        }
        this.d = true;
        ConnectionsManager.native_receivedCaptchaResult(this.a, this.b, this.c, str);
    }
}
