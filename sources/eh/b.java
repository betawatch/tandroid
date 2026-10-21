package eh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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

    @Override // eh.a
    public int E() {
        return this.e;
    }

    public boolean a() {
        return AndroidUtilities.computePerceivedBrightness(h6.w0(this.b, this.a)) < 0.721f;
    }

    @Override // eh.a
    public int a0() {
        return this.d;
    }

    public final void b() {
        this.d = h6.m1(this.c, h6.w0(this.b, this.a));
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
    public int h() {
        return this.f;
    }

    @Override // eh.a
    public int u() {
        return this.h;
    }

    public b(d6 d6Var, int i10, float f7) {
        this.a = d6Var;
        this.b = i10;
        this.c = f7;
        b();
    }
}
