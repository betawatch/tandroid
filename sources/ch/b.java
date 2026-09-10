package ch;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class b implements a {
    public final f6 a;
    public final int b;
    public final float c;
    public int d;
    public int e;
    public int f;
    public int h;

    public b(int i10, f6 f6Var) {
        this(f6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public boolean a() {
        return AndroidUtilities.computePerceivedBrightness(j6.v0(this.b, this.a)) < 0.721f;
    }

    public final void b() {
        this.d = j6.l1(this.c, j6.v0(this.b, this.a));
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

    @Override // ch.a
    public int h() {
        return this.f;
    }

    @Override // ch.a
    public int p() {
        return this.h;
    }

    @Override // ch.a
    public int w() {
        return this.e;
    }

    @Override // ch.a
    public int x() {
        return this.d;
    }

    public b(f6 f6Var, int i10, float f7) {
        this.a = f6Var;
        this.b = i10;
        this.c = f7;
        b();
    }
}
