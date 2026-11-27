// default package

import android.view.Surface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class jq9 implements qr9 {
    public final kq9 a;
    public final qr9 b;

    public jq9(kq9 kq9Var, qr9 qr9Var) {
        this.a = kq9Var;
        this.b = qr9Var;
    }

    @Override // qr9
    public final void a(int i, int i2) {
        if (this.a.W != i || this.a.X != i2) {
            this.a.W = i;
            this.a.X = i2;
            hl.c3(new v59(this, (byte) 21));
        }
        this.b.a(i, i2);
    }

    @Override // qr9
    public final boolean b() {
        return this.b.b();
    }

    @Override // qr9
    public final Surface getSurface() {
        return this.b.getSurface();
    }
}
