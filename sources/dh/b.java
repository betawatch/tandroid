package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public class b implements a {
    public final d6 a;
    public final int b;
    public final float c;
    public int d;
    public int e;
    public int f;
    public int h;

    public b(int i10, d6 d6Var) {
        this(d6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
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
        return AndroidUtilities.computePerceivedBrightness(h6.v0(this.b, this.a)) < 0.721f;
    }

    @Override // dh.a
    public int c() {
        return this.h;
    }

    public final void d() {
        this.d = h6.l1(this.c, h6.v0(this.b, this.a));
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

    public b(d6 d6Var, int i10, float f7) {
        this.a = d6Var;
        this.b = i10;
        this.c = f7;
        d();
    }
}
