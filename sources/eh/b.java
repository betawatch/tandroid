package eh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public class b implements a {
    public final g6 a;
    public final int b;
    public final float c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;

    public b(int i10, g6 g6Var) {
        this(g6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    @Override // eh.a
    public int H() {
        a();
        return this.e;
    }

    public final void a() {
        if (this.n != r6.b) {
            c();
        }
    }

    @Override // eh.a
    public int a0() {
        a();
        return this.d;
    }

    public boolean b() {
        return AndroidUtilities.computePerceivedBrightness(k6.w0(this.b, this.a)) < 0.721f;
    }

    public final void c() {
        this.n = r6.b;
        this.d = k6.o1(this.c, k6.w0(this.b, this.a));
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

    @Override // eh.a
    public int h() {
        a();
        return this.f;
    }

    @Override // eh.a
    public int u() {
        a();
        return this.h;
    }

    public b(g6 g6Var, int i10, float f7) {
        this.n = r6.b;
        this.a = g6Var;
        this.b = i10;
        this.c = f7;
        c();
    }
}
