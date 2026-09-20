package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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

    public final void c() {
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
    public int d() {
        return this.h;
    }

    @Override // dh.a
    public int m() {
        return this.e;
    }

    public b(f6 f6Var, int i10, float f7) {
        this.a = f6Var;
        this.b = i10;
        this.c = f7;
        c();
    }
}
