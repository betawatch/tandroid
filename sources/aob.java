// default package

import android.graphics.Point;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class aob extends wpd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jm7 b;

    public /* synthetic */ aob(jm7 jm7Var, byte b) {
        this.a = b;
        this.b = jm7Var;
    }

    @Override // wpd
    public final void a() {
        switch (this.a) {
            case 1:
                ((iic) this.b).w.invalidate();
                break;
        }
    }

    @Override // wpd
    public final void b(int i, int i2) {
        switch (this.a) {
            case 0:
                Point point = gm.q;
                if ((point.x <= point.y) == (i <= i2)) {
                    ((rob) this.b).z0.invalidate();
                    break;
                }
                break;
        }
    }
}
