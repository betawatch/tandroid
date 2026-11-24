// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gc1 {
    public final int a;
    public final int b;
    public final int c;
    public boolean d;

    public gc1(int i, int i2, int i3) {
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
