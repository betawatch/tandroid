// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
