package og;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    public boolean a() {
        return AndroidUtilities.computePerceivedBrightness(g6.v0(this.b, this.a)) < 0.721f;
    }

    public final void b() {
        this.d = g6.l1(this.c, g6.v0(this.b, this.a));
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

    @Override // og.a
    public int h() {
        return this.f;
    }

    @Override // og.a
    public int m() {
        return this.h;
    }

    @Override // og.a
    public int v() {
        return this.e;
    }

    @Override // og.a
    public int z() {
        return this.d;
    }

    public b(c6 c6Var, int i10, float f9) {
        this.a = c6Var;
        this.b = i10;
        this.c = f9;
        b();
    }
}
