package eh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public class b implements a {
    public final c6 a;
    public final int b;
    public final float c;
    public int d;
    public int e;
    public int f;
    public int h;

    public b(int i10, c6 c6Var) {
        this(c6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    @Override // eh.a
    public int G() {
        return this.e;
    }

    public boolean a() {
        return AndroidUtilities.computePerceivedBrightness(g6.w0(this.b, this.a)) < 0.721f;
    }

    public final void b() {
        this.d = g6.m1(this.c, g6.w0(this.b, this.a));
        if (a()) {
            this.f = 687865855;
            this.h = 352321535;
            this.e = 0;
        } else {
            this.f = -1;
            this.h = -1;
            this.e = TLObject.FLAG_29;
        }
    }

    @Override // eh.a
    public int b0() {
        return this.d;
    }

    @Override // eh.a
    public int h() {
        return this.f;
    }

    @Override // eh.a
    public int q() {
        return this.h;
    }

    public b(c6 c6Var, int i10, float f7) {
        this.a = c6Var;
        this.b = i10;
        this.c = f7;
        b();
    }
}
