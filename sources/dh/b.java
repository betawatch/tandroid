package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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

    public boolean a() {
        return AndroidUtilities.computePerceivedBrightness(i6.w0(this.b, this.a)) < 0.721f;
    }

    public final void b() {
        this.d = i6.m1(this.c, i6.w0(this.b, this.a));
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

    @Override // dh.a
    public int d() {
        return this.f;
    }

    @Override // dh.a
    public int m() {
        return this.h;
    }

    @Override // dh.a
    public int q() {
        return this.e;
    }

    @Override // dh.a
    public int x() {
        return this.d;
    }

    public b(e6 e6Var, int i10, float f7) {
        this.a = e6Var;
        this.b = i10;
        this.c = f7;
        b();
    }
}
