package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public class b implements a {
    public final e6 a;
    public final int b;
    public final float c;
    public int d;
    public int e;
    public int f;
    public int h;

    public b(int i10, e6 e6Var) {
        this(e6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    @Override // dh.a
    public int H() {
        return this.d;
    }

    @Override // dh.a
    public int a() {
        return this.f;
    }

    public boolean b() {
        return AndroidUtilities.computePerceivedBrightness(j6.v0(this.b, this.a)) < 0.721f;
    }

    @Override // dh.a
    public int c() {
        return this.h;
    }

    public final void d() {
        this.d = j6.l1(this.c, j6.v0(this.b, this.a));
        if (b()) {
            this.f = 687865855;
            this.h = 352321535;
            this.e = 0;
        } else {
            this.f = -1;
            this.h = -1;
            this.e = TLObject.FLAG_29;
        }
    }

    @Override // dh.a
    public int m() {
        return this.e;
    }

    public b(e6 e6Var, int i10, float f7) {
        this.a = e6Var;
        this.b = i10;
        this.c = f7;
        d();
    }
}
