package fh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public class b implements a {
    public final u6 a;
    public final int b;
    public final float c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;

    public b(int i10, u6 u6Var) {
        this(u6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    @Override // fh.a
    public int A() {
        a();
        return this.h;
    }

    public final void a() {
        if (this.n != f7.b) {
            c();
        }
    }

    public boolean b() {
        return AndroidUtilities.computePerceivedBrightness(y6.w0(this.b, this.a)) < 0.721f;
    }

    public final void c() {
        this.n = f7.b;
        this.d = y6.o1(this.c, y6.w0(this.b, this.a));
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

    @Override // fh.a
    public int f0() {
        a();
        return this.e;
    }

    @Override // fh.a
    public int t() {
        a();
        return this.f;
    }

    @Override // fh.a
    public int v0() {
        a();
        return this.d;
    }

    public b(u6 u6Var, int i10, float f7) {
        this.n = f7.b;
        this.a = u6Var;
        this.b = i10;
        this.c = f7;
        c();
    }
}
