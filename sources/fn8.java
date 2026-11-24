// default package

import android.os.Handler;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fn8 implements e36 {
    public static final fn8 r = new fn8();
    public int a;
    public int b;
    public Handler e;
    public boolean c = true;
    public boolean d = true;
    public final g36 f = new g36(this);
    public final q78 h = new q78(this, 26);
    public final lj4 n = new lj4(this);

    public final void a() {
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            if (this.c) {
                this.f.e(u26.ON_RESUME);
                this.c = false;
            } else {
                Handler handler = this.e;
                handler.getClass();
                handler.removeCallbacks(this.h);
            }
        }
    }

    @Override // e36
    public final g36 m() {
        return this.f;
    }
}
